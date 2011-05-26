/*
 *    Copyright 2007-2010 The sparkle-g Team
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

/**
 * @author Simone Tripodi   (simone.tripodi)
 * @author Michele Mostarda (michele.mostarda)
 * @author Juergen Pfundt   (Juergen.Pfundt)
 * @version $Id$
 */
grammar Sparql;

options{
output = AST;
}

tokens{
QUERY;
UPDATE;
PROLOGUE;
MODIFY;
SUBSELECT;
SELECTCLAUSE;
WHERE_CLAUSE;
VAR;
GROUPBY;
ORDERBY;
ORDERCONDITION;
BINDINGVALUE;
TRIPLESTEMPLATE;
GROUPGRAPHPATTERN;
ARGLIST;
EXPRESSIONLIST;
CONSTRUCTTRIPLES;
PROPERTYLIST;
COLLECTION;
TRIPLE;
SUBJECT;
PREDICATE;
OBJECT;
NOTEXISTS;
FUNCTION;
}

@header {
    package com.googlecode.sparkleg;
}

@lexer::header {
    package com.googlecode.sparkleg;
}

// $<Parser

query
    : prologue ( selectQuery | constructQuery | describeQuery | askQuery ) bindingsClause EOF -> ^(QUERY prologue selectQuery* constructQuery* describeQuery* askQuery*) bindingsClause*
    | update ( SEMICOLON update)* EOF -> ^(UPDATE update+)
    ;

prologue
    : (baseDecl | prefixDecl)* -> ^(PROLOGUE baseDecl* prefixDecl*)
    ;

baseDecl
    : BASE IRI_REF -> ^(BASE IRI_REF)
    ;

prefixDecl
    : PREFIX PNAME_NS IRI_REF -> ^(PREFIX PNAME_NS IRI_REF)
    ;

selectQuery
    : selectClause datasetClause* whereClause solutionModifier -> ^(SELECT selectClause datasetClause* whereClause* solutionModifier*)
    ;

subSelect
    : selectClause whereClause solutionModifier	-> ^(SUBSELECT whereClause* solutionModifier)
    ;
    	
selectClause
    : SELECT ( DISTINCT | REDUCED )? ASTERISK -> ^(SELECTCLAUSE DISTINCT* REDUCED* ASTERISK)
    | SELECT ( DISTINCT | REDUCED )? (v+=selectVariables)+ -> ^(SELECTCLAUSE DISTINCT* REDUCED* $v*)
    ;

selectVariables
    : v=var -> ^(VAR $v) 
    | OPEN_BRACE e=expression AS v=var CLOSE_BRACE -> ^(AS $e $v)
    ;
  
constructQuery
    : CONSTRUCT constructTemplate datasetClause* whereClause solutionModifier -> ^(CONSTRUCT constructTemplate* datasetClause* whereClause* solutionModifier*)
    | CONSTRUCT datasetClause* WHERE OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE solutionModifier -> ^(CONSTRUCT datasetClause* ^(WHERE triplesTemplate*) solutionModifier*)
    ;

describeQuery
    : DESCRIBE ( (v+=varOrIRIref)+ | ASTERISK ) datasetClause* whereClause? solutionModifier -> ^(DESCRIBE $v* ASTERISK* datasetClause* whereClause? solutionModifier*)
    ;

askQuery
    : ASK datasetClause* whereClause -> ^(ASK datasetClause* whereClause)
    ;

datasetClause
    : FROM NAMED? iriRef -> ^(FROM NAMED? iriRef)
    ;

whereClause
    : WHERE? groupGraphPattern -> ^(WHERE_CLAUSE groupGraphPattern)
    ;

solutionModifier
    : groupClause? havingClause? orderClause? limitOffsetClauses?
    ;

groupClause
    : GROUP BY (g+=groupCondition)+ -> ^(GROUPBY $g+)
    ;
    		 
groupCondition
    : builtInCall
    | functionCall
    | OPEN_BRACE expression (AS var)? CLOSE_BRACE -> ^(AS expression var*)
    | var
    ;
    
havingClause
    : HAVING (c=constraint)+ -> ^(HAVING $c+)	
    ;
    
orderClause
    : ORDER BY (o+=orderCondition)+ -> ^(ORDERBY $o+)
    ;

orderCondition
    : ( ( ASC | DESC ) brackettedExpression ) -> ^(ORDERCONDITION ASC* DESC* brackettedExpression)
    | ( constraint | var ) -> ^(ORDERCONDITION constraint* var*)
    ;
	    
limitOffsetClauses
    : limitClause offsetClause? 
    | offsetClause limitClause?
    ;

limitClause
    : LIMIT INTEGER -> ^(LIMIT INTEGER)
    ;

offsetClause
    : OFFSET INTEGER -> ^(OFFSET INTEGER)
    ;

bindingsClause
    : (BINDINGS var* OPEN_CURLY_BRACE bindingValueList* CLOSE_CURLY_BRACE)? -> ^(BINDINGS var* bindingValueList*)?
    ;
    
bindingValueList
    : OPEN_BRACE bindingValue* CLOSE_BRACE -> ^(BINDINGVALUE bindingValue*)
    ;
    	
bindingValue
    : iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF
    ;
    
update
    : prologue (load | clear | drop | add | move | copy | create | insert | delete | modify) -> prologue load* clear* drop* add* move* copy* create* insert* delete* modify*
    ;   
    
load 	  
    : LOAD SILENT? iriRef ( INTO graphRef )? -> ^(LOAD SILENT* iriRef graphRef*)
    ;
    
clear
    : CLEAR  SILENT? graphRefAll -> ^(CLEAR SILENT* graphRefAll)
    ;
    
drop
    : DROP SILENT? graphRefAll -> ^(DROP SILENT* graphRefAll)
    ; 

create
    : CREATE SILENT? graphRef -> ^(CREATE SILENT* graphRef)
    ;
    
add
    : ADD SILENT? from=graphOrDefault TO to=graphOrDefault -> ^(ADD SILENT* $from* $to*)
    ;
    
move
    : MOVE SILENT? from=graphOrDefault TO to=graphOrDefault -> ^(MOVE SILENT* $from* $to*)
    ;
    
copy
    : COPY SILENT? from=graphOrDefault TO to=graphOrDefault -> ^(COPY SILENT* $from* $to*)
    ;

insert
    : INSERT DATA quadPattern -> ^(INSERT DATA quadPattern)
    ;
   
delete 	  
    : DELETE ( deleteData | deleteWhere )
    ;

deleteData
    : DATA quadPattern -> ^(DELETE DATA quadPattern)
    ;

deleteWhere
    : WHERE quadPattern -> ^(DELETE WHERE quadPattern)
    ;
    
modify
    : ( WITH i=iriRef )? (deleteClause insertClause? | insertClause) usingClause* WHERE groupGraphPattern -> ^(MODIFY ^(WITH $i)* deleteClause* insertClause* usingClause* ^(WHERE groupGraphPattern))
    ;
  
deleteClause
    : DELETE quadPattern -> DELETE quadPattern
    ;
      
insertClause
    : INSERT quadPattern -> INSERT quadPattern
    ;

usingClause
    : USING NAMED? iriRef -> ^(USING NAMED? iriRef)
    ;

graphOrDefault	  
    : DEFAULT 
    | GRAPH? iriRef
    ;
    	    	
graphRef
    : GRAPH iriRef
    ;

graphRefAll
    : graphRef | DEFAULT | NAMED | ALL
    ;

quadPattern
    : OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE -> quads
    ;
    
quads
    : triplesTemplate? ( quadsNotTriples DOT? triplesTemplate? )*
    ;
    
quadsNotTriples
    : GRAPH varOrIRIref OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE -> varOrIRIref triplesTemplate?
    ;
    
triplesTemplate
    : triplesSameSubject ( DOT triplesSameSubject )* DOT? -> triplesSameSubject ^(TRIPLESTEMPLATE triplesSameSubject*)?
    ;
    	
groupGraphPattern
    : OPEN_CURLY_BRACE ( subSelect | groupGraphPatternSub ) CLOSE_CURLY_BRACE -> ^(GROUPGRAPHPATTERN subSelect* groupGraphPatternSub*)
    ;
    
groupGraphPatternSub
    : triplesBlock? ( groupGraphPatternSubCache )* -> triplesBlock* groupGraphPatternSubCache*
    ;

groupGraphPatternSubCache
    :  graphPatternNotTriples DOT? triplesBlock? -> graphPatternNotTriples triplesBlock?
    ; 	

triplesBlock
    : triplesSameSubjectPath ( DOT triplesSameSubjectPath)* DOT? -> triplesSameSubjectPath+
    ;

graphPatternNotTriples
    : groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter | bind
    ;

optionalGraphPattern
    : OPTIONAL groupGraphPattern -> ^(OPTIONAL groupGraphPattern)
    ;

graphGraphPattern
    : GRAPH varOrIRIref groupGraphPattern -> ^(GRAPH varOrIRIref groupGraphPattern)
    ;

serviceGraphPattern
    : SERVICE SILENT? varOrIRIref groupGraphPattern -> ^(SERVICE varOrIRIref groupGraphPattern)
    ;
    
bind
    : BIND OPEN_BRACE expression AS var CLOSE_BRACE -> ^(BIND expression ^(AS var))	
    ;
    	
minusGraphPattern
    : MINUS_KEYWORD groupGraphPattern -> ^(MINUS_KEYWORD groupGraphPattern)
    ;

groupOrUnionGraphPattern
    : (g1=groupGraphPattern->$g1) ((UNION g2=groupGraphPattern) -> ^(UNION $groupOrUnionGraphPattern $g2))*
    ;

filter
    : FILTER constraint -> ^(FILTER constraint)
    ;

constraint
    : brackettedExpression | builtInCall | functionCall
    ;

functionCall
    : iriRef argList -> ^(FUNCTION iriRef ^(ARGLIST argList))
    ;

argList
    : ( nil | OPEN_BRACE DISTINCT? expression ( COMMA expression )* CLOSE_BRACE ) -> DISTINCT? nil* expression*
    ;

expressionList
    : ( nil | OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE ) -> ^(EXPRESSIONLIST nil* expression*)
    ;	

constructTemplate
    : OPEN_CURLY_BRACE constructTriples? CLOSE_CURLY_BRACE -> ^(CONSTRUCTTRIPLES constructTriples?)
    ;

constructTriples
    : triplesSameSubject ( DOT triplesSameSubject )* DOT? -> triplesSameSubject+
    ;

triplesSameSubject
    : varOrTerm! propertyListNotEmpty[(CommonTree) $varOrTerm.tree]
    | triplesNode propertyListNotEmpty[(CommonTree) $triplesNode.tree]?
    ;

propertyListNotEmpty[CommonTree subject]
    : v=verb objectList[$subject, (CommonTree) $v.tree] (SEMICOLON (v=verb objectList[$subject, (CommonTree) $v.tree])?)* -> objectList+
    ;

objectList[CommonTree subject, CommonTree predicate]
    : graphNode ( COMMA graphNode )* -> (^(SUBJECT {$subject}) ^(PREDICATE {$predicate}) ^(OBJECT graphNode))+
    ;

verb
    : varOrIRIref
    | A
    ;

triplesSameSubjectPath
    : varOrTerm propertyListNotEmptyPath[(CommonTree) $varOrTerm.tree] -> ^(TRIPLE propertyListNotEmptyPath)
    | triplesNode propertyListNotEmpty[(CommonTree) $triplesNode.tree]? -> ^(TRIPLE triplesNode* propertyListNotEmpty*)
    ;
  
propertyListNotEmptyPath[CommonTree subject]
    : (p=verbPath  objectList[$subject, (CommonTree) $p.tree]| v=verbSimple objectList[$subject, (CommonTree) $v.tree]) (SEMICOLON (p=verbPath objectList[$subject, (CommonTree) $p.tree]  | v=verbSimple  objectList[$subject, (CommonTree) $v.tree] )?)* -> objectList+
    ;
    
verbPath
    : path
    ;
    
verbSimple
    : var
    ;
    	
path
    : pathSequence ( PIPE pathSequence )*
    ; 

pathSequence
    : pathEltOrInverse ( DIVIDE pathEltOrInverse )*
    ;
    	  	
pathElt
    : pathPrimary pathMod?
    ;
    
pathEltOrInverse
    : pathElt | INVERSE pathElt
    ;
    
pathMod
    : ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) )
    ;

pathPrimary
    : ( iriRef | A | NEGATION pathNegatedPropertySet | OPEN_BRACE path CLOSE_BRACE )
    ;

pathNegatedPropertySet
    : ( pathOneInPropertySet | OPEN_BRACE ( pathOneInPropertySet ( PIPE pathOneInPropertySet )* )? CLOSE_BRACE )
    ;  	

pathOneInPropertySet
    : INVERSE? ( iriRef | A )
    ;
	
triplesNode
    : OPEN_BRACE graphNode+ CLOSE_BRACE -> ^(COLLECTION graphNode+)
    | v=OPEN_SQUARE_BRACKET propertyListNotEmpty[(CommonTree) $v.tree] CLOSE_SQUARE_BRACKET -> propertyListNotEmpty
    ;

graphNode
    : varOrTerm | triplesNode
    ;

varOrTerm
    : var | graphTerm
    ;

varOrIRIref
    : var | iriRef
    ;

var
    : VAR1 | VAR2
    ;

graphTerm
    : iriRef
    | rdfLiteral
    | numericLiteral
    | booleanLiteral
    | blankNode
    | nil
    ;
    
nil
    : OPEN_BRACE CLOSE_BRACE
    ;

expression
    : conditionalOrExpression
    ;

conditionalOrExpression
    : (c1=conditionalAndExpression -> $c1) (OR c2=conditionalAndExpression -> ^(OR $conditionalOrExpression $c2))*
    ;

conditionalAndExpression
    : (v1=valueLogical -> $v1) (AND v2=valueLogical -> ^(AND $conditionalAndExpression $v2))*
    ;

valueLogical
    : relationalExpression
    ;

relationalExpression
    : (n1=numericExpression -> $n1) ( (EQUAL n2=numericExpression -> ^(EQUAL $relationalExpression $n2))   
                                    | (NOT_EQUAL n3=numericExpression -> ^(NOT_EQUAL $relationalExpression $n3)) 
                                    | (LESS n4=numericExpression -> ^(LESS $relationalExpression $n4)) 
                                    | (GREATER n5=numericExpression -> ^(GREATER $relationalExpression $n5))
                                    | (LESS_EQUAL n6=numericExpression -> ^(LESS_EQUAL $relationalExpression $n6))
                                    | (GREATER_EQUAL n7=numericExpression -> ^(GREATER_EQUAL $relationalExpression $n7))  
                                    | (IN l2=expressionList -> ^(IN $relationalExpression $l2))
                                    | (NOT IN l3=expressionList -> ^(NOT IN $relationalExpression $l3)) )?
    ;

numericExpression
    : additiveExpression
    ;

additiveExpression
    : multiplicativeExpression ( (PLUS|MINUS) ^multiplicativeExpression |  (numericLiteralPositive | numericLiteralNegative ) ( ( ASTERISK ^unaryExpression ) | ( DIVIDE ^unaryExpression ) )? )*
    ; 
    
multiplicativeExpression
    : (u1=unaryExpression -> $u1) (multiplicativeOperator u2=unaryExpression -> ^(multiplicativeOperator $multiplicativeExpression $u2))*
    ;
    
multiplicativeOperator
    : ASTERISK | DIVIDE
    ;

unaryExpression
    : NEGATION primaryExpression -> ^(NEGATION primaryExpression)
    | PLUS primaryExpression -> ^(PLUS primaryExpression)
    | MINUS primaryExpression -> ^(MINUS primaryExpression)
    | primaryExpression -> primaryExpression
    ;

primaryExpression
    : brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate
    ;

brackettedExpression
    : OPEN_BRACE expression CLOSE_BRACE -> expression
    ;

builtInCall
    : STR OPEN_BRACE expression CLOSE_BRACE -> ^(STR expression)
    | LANG OPEN_BRACE expression CLOSE_BRACE -> ^(LANG expression)
    | LANGMATCHES OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^(LANGMATCHES expression+)
    | DATATYPE OPEN_BRACE expression CLOSE_BRACE -> ^(DATATYPE expression)
    | BOUND OPEN_BRACE var CLOSE_BRACE -> ^(BOUND var)
    | IRI OPEN_BRACE expression CLOSE_BRACE -> ^(IRI expression)
    | URI OPEN_BRACE expression CLOSE_BRACE -> ^(URI expression)
    | BNODE (OPEN_BRACE expression CLOSE_BRACE| nil) -> BNODE expression
    | RAND nil -> ^(RAND)
    | ABS OPEN_BRACE expression CLOSE_BRACE -> ^(ABS expression)
    | CEIL OPEN_BRACE expression CLOSE_BRACE -> ^(CEIL expression)
    | FLOOR OPEN_BRACE expression CLOSE_BRACE -> ^(FLOOR expression)
    | ROUND OPEN_BRACE expression CLOSE_BRACE -> ^(ROUND expression)
    | CONCAT expressionList -> ^(CONCAT expressionList)
    | subStringExpression -> subStringExpression
    | STRLEN OPEN_BRACE expression CLOSE_BRACE -> ^(STRLEN expression)
    | UCASE OPEN_BRACE expression CLOSE_BRACE -> ^(UCASE expression)
    | LCASE OPEN_BRACE expression CLOSE_BRACE -> ^(LCASE expression)
    | ENCODE_FOR_URI OPEN_BRACE expression CLOSE_BRACE -> ^(ENCODE_FOR_URI expression)
    | CONTAINS OPEN_BRACE expression CLOSE_BRACE -> ^(CONTAINS expression)
    | STRSTARTS OPEN_BRACE expression CLOSE_BRACE -> ^(STRSTARTS expression)
    | STRENDS OPEN_BRACE expression CLOSE_BRACE -> ^(STRENDS expression)
    | YEAR OPEN_BRACE expression CLOSE_BRACE -> ^(YEAR expression)
    | MONTH OPEN_BRACE expression CLOSE_BRACE -> ^(MONTH expression)
    | DAY OPEN_BRACE expression CLOSE_BRACE -> ^(DAY expression)
    | HOURS OPEN_BRACE expression CLOSE_BRACE -> ^(HOURS expression)
    | MINUTES OPEN_BRACE expression CLOSE_BRACE -> ^(MINUTES expression)
    | SECONDS OPEN_BRACE expression CLOSE_BRACE -> ^(SECONDS expression)
    | TIMEZONE OPEN_BRACE expression CLOSE_BRACE -> ^(TIMEZONE expression)
    | TZ OPEN_BRACE expression CLOSE_BRACE -> ^(TZ expression)
    | NOW nil -> ^(NOW)
    | MD5 OPEN_BRACE expression CLOSE_BRACE -> ^(MD5 expression)
    | SHA1 OPEN_BRACE expression CLOSE_BRACE -> ^(SHA1 expression)
    | SHA224 OPEN_BRACE expression CLOSE_BRACE -> ^(SHA224 expression)
    | SHA256 OPEN_BRACE expression CLOSE_BRACE -> ^(SHA256 expression)
    | SHA384 OPEN_BRACE expression CLOSE_BRACE -> ^(SHA384 expression)
    | SHA512 OPEN_BRACE expression CLOSE_BRACE -> ^(SHA512 expression)
    | COALESCE expressionList -> ^(COALESCE expressionList)
    | IF OPEN_BRACE e1=expression COMMA e2=expression COMMA e3=expression CLOSE_BRACE -> ^(IF $e1 $e2 $e3)
    | STRLANG OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^(STRLANG expression expression)
    | STRDT OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^(STRDT expression expression)
    | SAMETERM OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^(SAMETERM expression expression)
    | ISIRI OPEN_BRACE expression CLOSE_BRACE -> ^(ISIRI expression)
    | ISURI OPEN_BRACE expression CLOSE_BRACE -> ^(ISURI expression)
    | ISBLANK OPEN_BRACE expression CLOSE_BRACE -> ^(ISBLANK expression) 
    | ISLITERAL OPEN_BRACE expression CLOSE_BRACE -> ^(ISLITERAL expression)
    | ISNUMERIC OPEN_BRACE expression CLOSE_BRACE -> ^(ISNUMERIC expression)
    | regexExpression -> regexExpression
    | existsFunction -> existsFunction
    | notExistsFunction -> notExistsFunction
    ;

regexExpression
    : REGEX OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE -> ^(REGEX expression*)
    ;
    
subStringExpression
    : SUBSTR OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE -> ^(SUBSTR expression*)
    ;
    
existsFunction
    : EXISTS groupGraphPattern -> ^(EXISTS groupGraphPattern)
    ;

notExistsFunction
    : NOT EXISTS groupGraphPattern -> ^(NOTEXISTS groupGraphPattern)
    ;

aggregate
    : COUNT OPEN_BRACE DISTINCT? ( ASTERISK | expression ) CLOSE_BRACE -> ^(COUNT DISTINCT* ASTERISK* expression*)
    | SUM OPEN_BRACE DISTINCT? expression CLOSE_BRACE -> ^(SUM DISTINCT* expression)
    | MIN OPEN_BRACE DISTINCT? expression CLOSE_BRACE -> ^(MIN DISTINCT* expression)
    | MAX OPEN_BRACE DISTINCT? expression CLOSE_BRACE -> ^(MAX DISTINCT* expression)
    | AVG OPEN_BRACE DISTINCT? expression CLOSE_BRACE -> ^(AVG DISTINCT* expression)
    | SAMPLE OPEN_BRACE DISTINCT? expression CLOSE_BRACE -> ^(SAMPLE DISTINCT? expression)
    | GROUP_CONCAT OPEN_BRACE DISTINCT? expression ( SEMICOLON SEPARATOR '=' string )? CLOSE_BRACE -> ^(GROUP_CONCAT DISTINCT* expression string*)
    ;
    
iriRefOrFunction
    : iriRef argList? -> ^(FUNCTION iriRef ^(ARGLIST argList)?)
    ;

rdfLiteral
    : string ( LANGTAG | ( REFERENCE iriRef ) )?
    ;

numericLiteral
    : numericLiteralUnsigned
    | numericLiteralPositive
    | numericLiteralNegative
    ;

numericLiteralUnsigned
    : INTEGER 
    | DECIMAL
    | DOUBLE
    ;

numericLiteralPositive
    : INTEGER_POSITIVE
    | DECIMAL_POSITIVE
    | DOUBLE_POSITIVE
    ;

numericLiteralNegative
    : INTEGER_NEGATIVE
    | DECIMAL_NEGATIVE
    | DOUBLE_NEGATIVE
    ;

booleanLiteral
    : TRUE
    | FALSE
    ;

string
    : STRING_LITERAL1
    | STRING_LITERAL2
    | STRING_LITERAL_LONG1
    | STRING_LITERAL_LONG2
    ;

iriRef
    : IRI_REF
    | prefixedName
    ;

prefixedName
    : PNAME_LN
    | PNAME_NS
    ;

blankNode
    : BLANK_NODE_LABEL
    | anon
    ;

anon
    : OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET
    ;	
// $>

// $<Lexer

WS : (' '| '\t'| EOL)+ { $channel=HIDDEN; };

BASE : ('B'|'b')('A'|'a')('S'|'s')('E'|'e');

PREFIX : ('P'|'p')('R'|'r')('E'|'e')('F'|'f')('I'|'i')('X'|'x');

SELECT : ('S'|'s')('E'|'e')('L'|'l')('E'|'e')('C'|'c')('T'|'t');

DISTINCT : ('D'|'d')('I'|'i')('S'|'s')('T'|'t')('I'|'i')('N'|'n')('C'|'c')('T'|'t');

REDUCED : ('R'|'r')('E'|'e')('D'|'d')('U'|'u')('C'|'c')('E'|'e')('D'|'d');

CONSTRUCT : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t')('R'|'r')('U'|'u')('C'|'c')('T'|'t');

DESCRIBE : ('D'|'d')('E'|'e')('S'|'s')('C'|'c')('R'|'r')('I'|'i')('B'|'b')('E'|'e');

ASK : ('A'|'a')('S'|'s')('K'|'k');

FROM : ('F'|'f')('R'|'r')('O'|'o')('M'|'m');

NAMED : ('N'|'n')('A'|'a')('M'|'m')('E'|'e')('D'|'d');   

WHERE : ('W'|'w')('H'|'h')('E'|'e')('R'|'r')('E'|'e');

ORDER : ('O'|'o')('R'|'r')('D'|'d')('E'|'e')('R'|'r');

BY : ('B'|'b')('Y'|'y');

ASC : ('A'|'a')('S'|'s')('C'|'c');

DESC : ('D'|'d')('E'|'e')('S'|'s')('C'|'c');

LIMIT : ('L'|'l')('I'|'i')('M'|'m')('I'|'i')('T'|'t');

OFFSET : ('O'|'o')('F'|'f')('F'|'f')('S'|'s')('E'|'e')('T'|'t');

OPTIONAL : ('O'|'o')('P'|'p')('T'|'t')('I'|'i')('O'|'o')('N'|'n')('A'|'a')('L'|'l');  

GRAPH : ('G'|'g')('R'|'r')('A'|'a')('P'|'p')('H'|'h');   

UNION : ('U'|'u')('N'|'n')('I'|'i')('O'|'o')('N'|'n');

FILTER : ('F'|'f')('I'|'i')('L'|'l')('T'|'t')('E'|'e')('R'|'r');

A : 'a';

STR : ('S'|'s')('T'|'t')('R'|'r');

LANG : ('L'|'l')('A'|'a')('N'|'n')('G'|'g');

LANGMATCHES : ('L'|'l')('A'|'a')('N'|'n')('G'|'g')('M'|'m')('A'|'a')('T'|'t')('C'|'c')('H'|'h')('E'|'e')('S'|'s');

DATATYPE : ('D'|'d')('A'|'a')('T'|'t')('A'|'a')('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

BOUND : ('B'|'b')('O'|'o')('U'|'u')('N'|'n')('D'|'d');

SAMETERM : ('S'|'s')('A'|'a')('M'|'m')('E'|'e')('T'|'t')('E'|'e')('R'|'r')('M'|'m');

ISIRI : ('I'|'i')('S'|'s')('I'|'i')('R'|'r')('I'|'i');

ISURI : ('I'|'i')('S'|'s')('U'|'u')('R'|'r')('I'|'i');

ISBLANK : ('I'|'i')('S'|'s')('B'|'b')('L'|'l')('A'|'a')('N'|'n')('K'|'k');

ISLITERAL : ('I'|'i')('S'|'s')('L'|'l')('I'|'i')('T'|'t')('E'|'e')('R'|'r')('A'|'a')('L'|'l');

REGEX : ('R'|'r')('E'|'e')('G'|'g')('E'|'e')('X'|'x');

SUBSTR : ('S'|'s')('U'|'u')('B'|'b')('S'|'s')('T'|'t')('R'|'r');

TRUE : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

FALSE : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

LOAD : ('L'|'l')('O'|'o')('A'|'a')('D'|'d');
    
CLEAR : ('C'|'c')('L'|'l')('E'|'e')('A'|'a')('R'|'r');
    
DROP : ('D'|'d')('R'|'r')('O'|'o')('P'|'p');

ADD : ('A'|'a')('D'|'d')('D'|'d');

MOVE : ('M'|'m')('O'|'o')('V'|'v')('E'|'e');

COPY : ('C'|'c')('O'|'o')('P'|'p')('Y'|'y');	
    
CREATE 	: ('C'|'c')('R'|'r')('E'|'e')('A'|'a')('T'|'t')('E'|'e');
    
DELETE : ('D'|'d')('E'|'e')('L'|'l')('E'|'e')('T'|'t')('E'|'e');
    	
INSERT : ('I'|'i')('N'|'n')('S'|'s')('E'|'e')('R'|'r')('T'|'t');
    
USING : ('U'|'u')('S'|'s')('I'|'i')('N'|'n')('G'|'g');	 
    
SILENT : ('S'|'s')('I'|'i')('L'|'l')('E'|'e')('N'|'n')('T'|'t'); 
    	
DEFAULT : ('D'|'d')('E'|'e')('F'|'f')('A'|'a')('U'|'u')('L'|'l')('T'|'t');  
    
ALL : ('A'|'a')('L'|'l')('L'|'l');

DATA : ('D'|'d')('A'|'a')('T'|'t')('A'|'a');
    
WITH : ('W'|'w')('I'|'i')('T'|'t')('H'|'h');
    
INTO : ('I'|'i')('N'|'n')('T'|'t')('O'|'o'); 

TO : ('T'|'t')('O'|'o'); 	 

AS : ('A'|'a')('S'|'s');

GROUP : ('G'|'g')('R'|'r')('O'|'o')('U'|'u')('P'|'p');
    
HAVING : ('H'|'h')('A'|'a')('V'|'v')('I'|'i')('N'|'n')('G'|'g');

UNDEF : ('U'|'u')('N'|'n')('D'|'d')('E'|'e')('F'|'f');
    
BINDINGS : ('B'|'b')('I'|'i')('N'|'n')('D'|'d')('I'|'i')('N'|'n')('G'|'g')('S'|'s');  

SERVICE : ('S'|'s')('E'|'e')('R'|'r')('V'|'v')('I'|'i')('C'|'c')('E'|'e');

BIND : ('B'|'b')('I'|'i')('N'|'n')('D'|'d');

MINUS_KEYWORD : ('M'|'m')('I'|'i')('N'|'n')('U'|'u')('S'|'s');

IRI : ('I'|'i')('R'|'r')('I'|'i');
    	 
URI : ('U'|'u')('R'|'r')('I'|'i');
    		
BNODE : ('B'|'b')('N'|'n')('O'|'o')('D'|'d')('E'|'e');

RAND : ('R'|'r')('A'|'a')('N'|'n')('D'|'d');

ABS: ('A'|'a')('B'|'b')('S'|'s');

CEIL : ('C'|'c')('E'|'e')('I'|'i')('L'|'l');

FLOOR : ('F'|'f')('L'|'l')('O'|'o')('O'|'o')('R'|'r');

ROUND : ('R'|'r')('O'|'o')('U'|'u')('N'|'n')('D'|'d');

CONCAT 	: ('C'|'c')('O'|'o')('N'|'n')('C'|'c')('A'|'a')('T'|'t');

STRLEN : ('S'|'s')('T'|'t')('R'|'r')('L'|'l')('E'|'e')('N'|'n');

UCASE : ('U'|'u')('C'|'c')('A'|'a')('S'|'s')('E'|'e');

LCASE : ('L'|'l')('C'|'c')('A'|'a')('S'|'s')('E'|'e');	

ENCODE_FOR_URI : ('E'|'e')('N'|'n')('C'|'c')('O'|'o')('D'|'d')('E'|'e')'_'('F'|'f')('O'|'o')('R'|'r')'_'('U'|'u')('R'|'r')('I'|'i');

CONTAINS : ('C'|'c')('O'|'o')('N'|'n')('T'|'t')('A'|'a')('I'|'i')('N'|'n')('S'|'s');

STRSTARTS : ('S'|'s')('T'|'t')('R'|'r')('S'|'s')('T'|'t')('A'|'a')('R'|'r')('T'|'t')('S'|'s');

STRENDS : ('S'|'s')('T'|'t')('R'|'r')('E'|'e')('N'|'n')('D'|'d')('S'|'s');

YEAR : ('Y'|'y')('E'|'e')('A'|'a')('R'|'r');

MONTH : ('M'|'m')('O'|'o')('N'|'n')('T'|'t')('H'|'h');

DAY : ('D'|'d')('A'|'a')('Y'|'y');

HOURS : ('H'|'h')('O'|'o')('U'|'u')('R'|'r')('S'|'s');

MINUTES : ('M'|'m')('I'|'i')('N'|'n')('U'|'u')('T'|'t')('E'|'e')('S'|'s');

SECONDS : ('S'|'s')('E'|'e')('C'|'c')('O'|'o')('N'|'n')('M'|'m')('S'|'s');	

TIMEZONE :  ('T'|'t')('I'|'i')('M'|'m')('E'|'e')('Z'|'z')('O'|'o')('N'|'n')('E'|'e');

TZ : ('T'|'t')('Z'|'z');

NOW : ('N'|'n')('O'|'o')('W'|'w');

MD5 : ('M'|'m')('M'|'m')'5';

SHA1 : ('S'|'s')('H'|'h')('A'|'a')'1';

SHA224 : ('S'|'s')('H'|'h')('A'|'a')'224';

SHA256 : ('S'|'s')('H'|'h')('A'|'a')'256';	

SHA384 : ('S'|'s')('H'|'h')('A'|'a')'384'; 

SHA512 : ('S'|'s')('H'|'h')('A'|'a')'512';
    		 
COALESCE : ('C'|'c')('O'|'o')('A'|'a')('L'|'l')('E'|'e')('S'|'s')('C'|'c')('E'|'e');
    	 
IF : ('I'|'i')('F'|'f');

STRLANG : ('S'|'s')('T'|'t')('R'|'r')('L'|'l')('A'|'a')('N'|'n')('G'|'g');
    
STRDT : ('S'|'s')('T'|'t')('R'|'r')('D'|'d')('T'|'t');
    
ISNUMERIC : ('I'|'i')('S'|'s')('N'|'n')('U'|'u')('M'|'m')('E'|'e')('R'|'r')('I'|'i')('C'|'c');	

COUNT : ('C'|'c')('O'|'o')('U'|'u')('N'|'n')('T'|'t');
    
SUM : ('S'|'s')('U'|'u')('M'|'m');	  
    
MIN : ('M'|'m')('I'|'i')('N'|'n');  
    
MAX : ('M'|'m')('A'|'a')('X'|'x');
     
AVG : ('A'|'a')('V'|'v')('G'|'g');

SAMPLE : ('S'|'s')('A'|'a')('M'|'m')('P'|'p')('L'|'l')('E'|'e');    
 
GROUP_CONCAT  :	 ('G'|'g')('R'|'r')('O'|'o')('U'|'u')('P'|'p') '_' ('C'|'c')('O'|'o')('N'|'n')('C'|'c')('A'|'a')('T'|'t');

NOT : ('N'|'n')('O'|'o')('T'|'t');
    
IN : ('I'|'i')('N'|'n');

EXISTS : ('E'|'e')('X'|'x')('I'|'i')('S'|'s')('T'|'t')('S'|'s');
    
SEPARATOR : ('S'|'s')('E'|'e')('P'|'p')('A'|'a')('R'|'r')('A'|'a')('T'|'t')('O'|'o')('R'|'r');

PNAME_NS : p=PN_PREFIX? ':';

PNAME_LN : PNAME_NS PN_LOCAL;
    
BLANK_NODE_LABEL : '_:' t=PN_LOCAL { setText($t.text); };

VAR1 : QUESTION_MARK v=VARNAME { setText($v.text); };

VAR2 : '$' v=VARNAME { setText($v.text); };

LANGTAG : '@' ('A'..'Z'|'a'..'z')+ (MINUS ('A'..'Z'|'a'..'z'|DIGIT)+)*;

INTEGER : DIGIT+;

DECIMAL
    : DIGIT+ DOT DIGIT*
    | DOT DIGIT+
    ;

DOUBLE
    : DIGIT+ DOT DIGIT* EXPONENT
    | DOT DIGIT+ EXPONENT
    | DIGIT+ EXPONENT
    ;

INTEGER_POSITIVE : PLUS INTEGER;

DECIMAL_POSITIVE : PLUS DECIMAL;

DOUBLE_POSITIVE : PLUS DOUBLE;

INTEGER_NEGATIVE : MINUS INTEGER;

DECIMAL_NEGATIVE : MINUS DECIMAL;

DOUBLE_NEGATIVE : MINUS DOUBLE;
    
fragment
EXPONENT : ('e'|'E') SIGN? DIGIT+;

STRING_LITERAL1 : '\'' ( options {greedy=false;} : ~( '\'' | '\\' | EOL ) | ECHAR )* '\'';

STRING_LITERAL2 : '"' ( options {greedy=false;} : ~( '"' | '\\' | EOL ) | ECHAR )* '"';

STRING_LITERAL_LONG1 : '\'\'\'' ( options {greedy=false;} : ( '\'' | '\'\'' )? ( ~('\''|'\\') | ECHAR ) )* '\'\'\'';

STRING_LITERAL_LONG2 : '"""' ( options {greedy=false;} : ( '"' | '""' )? ( ~('"'|'\\') | ECHAR ) )* '"""';

fragment
ECHAR : '\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\' | '"' | '\'');
    		
IRI_REF
    :(LESS (options{greedy=false;}: IRI_REF_CHARACTERS)* GREATER) =>  LESS (options{greedy=false;}: IRI_REF_CHARACTERS)* GREATER { setText($text.substring(1, $text.length()-1)); }
    | LESS { $type = LESS; }
    ;
    
fragment
IRI_REF_CHARACTERS
    : ~( LESS | GREATER | '"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | PIPE | INVERSE | '`' | '\\' | ('\u0000'..'\u0020'))
    ;

fragment
PN_CHARS_U : PN_CHARS_BASE | '_';

fragment
VARNAME : ( PN_CHARS_U | DIGIT ) ( PN_CHARS_U | DIGIT | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040' )*;

fragment
PN_CHARS
    : PN_CHARS_U
    | MINUS
    | DIGIT
    | '\u00B7' 
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment
PN_PREFIX : PN_CHARS_BASE ((PN_CHARS|DOT)* PN_CHARS)?;

fragment
PN_LOCAL : (PN_CHARS_U|DIGIT) ((PN_CHARS|DOT)* PN_CHARS)?;

fragment
PN_CHARS_BASE
    : 'A'..'Z'
    | 'a'..'z'
    | '\u00C0'..'\u00D6'
    | '\u00D8'..'\u00F6'
    | '\u00F8'..'\u02FF'
    | '\u0370'..'\u037D'
    | '\u037F'..'\u1FFF'
    | '\u200C'..'\u200D'
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;
    	
fragment
DIGIT : '0'..'9';

COMMENT : '#' ( options{greedy=false;} : .)* EOL { $channel=HIDDEN; };

fragment
EOL : '\n' | '\r';

REFERENCE : '^^';

LESS_EQUAL : '<=';

GREATER_EQUAL : '>=';

NOT_EQUAL : '!=';

AND : '&&';

OR : '||';
    
INVERSE : '^';

OPEN_BRACE : '(';

CLOSE_BRACE : ')';

OPEN_CURLY_BRACE : '{';

CLOSE_CURLY_BRACE : '}';

OPEN_SQUARE_BRACKET : '[';

CLOSE_SQUARE_BRACKET : ']';

SEMICOLON : ';';

DOT : '.';

PLUS : '+';

MINUS : '-';

fragment
SIGN : (PLUS|MINUS);
	
ASTERISK : '*';

QUESTION_MARK : '?';
    	
COMMA : ',';

NEGATION : '!';

DIVIDE : '/';

EQUAL : '=';

fragment
LESS : '<';

GREATER : '>';

PIPE : '|';
    	
ANY : .;

// $>
