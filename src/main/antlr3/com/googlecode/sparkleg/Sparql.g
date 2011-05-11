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
SUBSELECT;
SELECTCLAUSE;
WHERE_CLAUSE;
VAR;
ALIAS;
GROUPBY;
ORDERBY;
ORDERCONDITION;
BINDINGVALUE;
TRIPLESTEMPLATE;
GROUPGRAPHPATTERN;
GROUPGRAPHPATTERNSUB;
GRAPHPATTERNNOTTRIPLES;
TRIPLESBLOCK;
ARGLIST;
EXPRESSIONLIST;
CONSTRUCTTRIPLES;
PROPERTYLIST;
COLLECTION;
BLANKNODEPROPERTYLIST;
OBJECTLIST;
NOTEXISTS;
CONDITIONAL_OR_EXPRESSION;
CONDITIONAL_AND_EXPRESSION;
}

@header {
    package com.googlecode.sparkleg;
}

@lexer::header {
    package com.googlecode.sparkleg;
}

// $<Parser

query
    : prologue ( selectQuery | constructQuery | describeQuery | askQuery ) EOF -> ^(QUERY prologue selectQuery* constructQuery* describeQuery* askQuery*)
    | update ( SEMICOLON update)* SEMICOLON? EOF -> ^(UPDATE update+)
    ;

prologue
    : baseDecl? prefixDecl* -> ^(PROLOGUE baseDecl? prefixDecl*)
    ;

baseDecl
    : BASE IRI_REF -> ^(BASE IRI_REF)
    ;

prefixDecl
    : PREFIX PNAME_NS IRI_REF -> ^(PREFIX PNAME_NS IRI_REF)
    ;

selectQuery
    : selectClause datasetClause* whereClause solutionModifier bindingsClause -> ^(SELECT selectClause datasetClause* whereClause* solutionModifier* bindingsClause*)
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
    | OPEN_BRACE e=expression AS v=var CLOSE_BRACE -> ^(ALIAS $e $v)
    ;
  
constructQuery
    : CONSTRUCT constructTemplate datasetClause* whereClause solutionModifier -> ^(CONSTRUCT constructTemplate* datasetClause* whereClause* solutionModifier*)
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
    : WHERE? groupGraphPattern -> ^(WHERE_CLAUSE groupGraphPattern) // ^(WHERE groupGraphPattern) 
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
    : ( limitClause offsetClause? | offsetClause limitClause? )
    ;

limitClause
    : LIMIT INTEGER -> ^(LIMIT INTEGER)
    ;

offsetClause
    : OFFSET INTEGER -> ^(OFFSET INTEGER)
    ;

bindingsClause
    : ( BINDINGS (v+=var)* OPEN_CURLY_BRACE ( b+=bindingsClauseCache )* CLOSE_CURLY_BRACE )? -> ^(BINDINGS $v* $b*)?
    ;
    
bindingsClauseCache
    : OPEN_BRACE (b+=bindingValue)* CLOSE_BRACE	-> ^(BINDINGVALUE $b*)
    ;
    	
bindingValue
    : iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF
    ;
    
update
    : prologue (load | clear | drop | create | insert | delete | modify) -> ^(UPDATE load* clear* drop* create* insert* delete* modify*)
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

insert
    : INSERT DATA quadPattern -> ^(INSERT DATA quadPattern) //( insertData | insertTemplate )
    ;
/*    
insertData
    : DATA quadPattern //( INTO? iriRef )* constructTemplate
    ;
    
insertTemplate
    : ( INTO? iriRef )* constructTemplate whereClause?
    ;
*/    
delete 	  
    : DELETE ( deleteData | deleteWhere )
    ;

deleteData
    : DATA quadPattern -> ^(DELETE DATA quadPattern)//( FROM? iriRef )* constructTemplate
    ;

deleteWhere
    : WHERE quadPattern -> ^(DELETE WHERE quadPattern) //( FROM? iriRef )* constructTemplate whereClause?
    ;
    
modify
    : ( WITH iriRef )? ( deleteClause insertClause? | insertClause ) usingClause* WHERE groupGraphPattern
    ;
  
deleteClause
    : DELETE quadPattern -> DELETE quadPattern
    ;
      
insertClause
    : INSERT quadPattern
    ;

usingClause
    : USING NAMED? iriRef -> ^(USING NAMED? iriRef)
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
    : GRAPH varOrIRIref OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE -> varOrIRIref triplesTemplate? // -> ^(GRAPH varOrIRIref triplesTemplate?)
    ;
    
triplesTemplate
    : triplesSameSubject ( DOT triplesSameSubject )* DOT? -> ^(TRIPLESTEMPLATE triplesSameSubject+)
    ;
    	
groupGraphPattern
    : OPEN_CURLY_BRACE ( subSelect | groupGraphPatternSub ) CLOSE_CURLY_BRACE -> ^(GROUPGRAPHPATTERN subSelect* groupGraphPatternSub*)
    ;
    
groupGraphPatternSub
    : triplesBlock? ( groupGraphPatternSubCache )* -> triplesBlock* groupGraphPatternSubCache* //^(GRAPHPATTERNNOTTRIPLES
    ;

groupGraphPatternSubCache
    :  graphPatternNotTriples DOT? triplesBlock? -> graphPatternNotTriples triplesBlock?
    ; 	

triplesBlock
    : triplesSameSubjectPath ( DOT triplesSameSubjectPath)* DOT? -> ^(TRIPLESBLOCK triplesSameSubjectPath+)
    ;

graphPatternNotTriples
    : groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter
    ;

optionalGraphPattern
    : OPTIONAL groupGraphPattern -> ^(OPTIONAL groupGraphPattern)
    ;

graphGraphPattern
    : GRAPH varOrIRIref groupGraphPattern -> ^(GRAPH varOrIRIref groupGraphPattern)
    ;

serviceGraphPattern
    : SERVICE varOrIRIref groupGraphPattern -> ^(SERVICE varOrIRIref groupGraphPattern)
    ;
    
minusGraphPattern
    : MINUS_KEYWORD groupGraphPattern -> ^(MINUS_KEYWORD groupGraphPattern)
    ;

groupOrUnionGraphPattern
    : groupGraphPattern ( UNION groupGraphPattern )* -> groupGraphPattern ^(UNION groupGraphPattern*)?
    ;

filter
    : FILTER constraint -> ^(FILTER constraint)
    ;

constraint
    : brackettedExpression | builtInCall | functionCall
    ;

functionCall
    : iriRef argList
    ;

argList
    : ( nil | OPEN_BRACE DISTINCT? expression ( COMMA expression )* CLOSE_BRACE ) -> ^(ARGLIST DISTINCT? nil* expression*)
    ;

expressionList
    : ( nil | OPEN_CURLY_BRACE expression ( COMMA expression )* CLOSE_CURLY_BRACE ) -> ^(EXPRESSIONLIST nil* expression*)
    ;	

constructTemplate
    : OPEN_CURLY_BRACE constructTriples? CLOSE_CURLY_BRACE -> constructTriples?
    ;

constructTriples
    : triplesSameSubject ( DOT triplesSameSubject )* DOT? -> ^(CONSTRUCTTRIPLES triplesSameSubject+)
    ;

triplesSameSubject
    : varOrTerm propertyListNotEmpty | triplesNode propertyListNotEmpty?
    ;

propertyListNotEmpty
    : verb objectList ( SEMICOLON ( verb objectList )? )* -> ^(PROPERTYLIST (verb objectList)+)
    ;

objectList
    : graphNode ( COMMA graphNode )* -> ^(OBJECTLIST graphNode+)
    ;

verb
    : varOrIRIref
    | A
    ;

triplesSameSubjectPath
    : varOrTerm propertyListNotEmptyPath 
    | triplesNode propertyListPath
    ;
  
propertyListNotEmptyPath
    : ( verbPath | verbSimple ) objectList ( SEMICOLON ( ( verbPath | verbSimple ) objectList )? )* //-> verbPath* verbSimple* objectList verbPath* 
    ;
    
propertyListPath
    : propertyListNotEmpty?
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
    | OPEN_SQUARE_BRACKET propertyListNotEmpty CLOSE_SQUARE_BRACKET -> ^(BLANKNODEPROPERTYLIST propertyListNotEmpty)
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
    : conditionalAndExpression ( OR ^conditionalAndExpression )*
    ;

conditionalAndExpression
    : valueLogical ( AND ^valueLogical )*
    ;

valueLogical
    : relationalExpression
    ;

relationalExpression
    : numericExpression ( EQUAL ^numericExpression | NOT_EQUAL ^numericExpression | LESS ^numericExpression | GREATER ^numericExpression | LESS_EQUAL ^numericExpression | GREATER_EQUAL ^numericExpression | IN ^expressionList | NOT IN ^expressionList)?
    ;

numericExpression
    : additiveExpression
    ;

additiveExpression
    : multiplicativeExpression ( (PLUS|MINUS) ^multiplicativeExpression |  (numericLiteralPositive | numericLiteralNegative ) ( ( ASTERISK ^unaryExpression ) | ( DIVIDE ^unaryExpression ) )? )*
    ; 
    
multiplicativeExpression
    : unaryExpression ( (ASTERISK | DIVIDE) ^unaryExpression )*
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
    : REGEX OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE -> ^(REGEX expression+)
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
    : iriRef argList?
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

WS
    : (' '| '\t'| EOL)+ { $channel=HIDDEN; }
    ;

PNAME_NS
    : p=PN_PREFIX? ':'
    ;

PNAME_LN
    : PNAME_NS PN_LOCAL
    ;

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

TRUE : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

FALSE : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

LOAD : ('L'|'l')('O'|'o')('A'|'a')('D'|'d');
    
CLEAR : ('C'|'c')('L'|'l')('E'|'e')('A'|'a')('R'|'r');
    
DROP : ('D'|'d')('R'|'r')('O'|'o')('P'|'p');
    
CREATE 	: ('C'|'c')('R'|'r')('E'|'e')('A'|'a')('T'|'t')('E'|'e');
    
MODIFY : ('M'|'m')('O'|'o')('D'|'d')('I'|'i')('F'|'f')('Y'|'y');
    
DELETE : ('D'|'d')('E'|'e')('L'|'l')('E'|'e')('T'|'t')('E'|'e');
    	
INSERT : ('I'|'i')('N'|'n')('S'|'s')('E'|'e')('R'|'r')('T'|'t');
    
USING : ('U'|'u')('S'|'s')('I'|'i')('N'|'n')('G'|'g');	 
    
SILENT : ('S'|'s')('I'|'i')('L'|'l')('E'|'e')('N'|'n')('T'|'t'); 
    	
DEFAULT : ('D'|'d')('E'|'e')('F'|'f')('A'|'a')('U'|'u')('L'|'l')('T'|'t');  
    
ALL : ('A'|'a')('L'|'l')('L'|'l');

DATA : ('D'|'d')('A'|'a')('T'|'t')('A'|'a');
    
WITH : ('W'|'w')('I'|'i')('T'|'t')('H'|'h');
    
INTO : ('I'|'i')('N'|'n')('T'|'t')('O'|'o');  

AS : ('A'|'a')('S'|'s');

GROUP : ('G'|'g')('R'|'r')('O'|'o')('U'|'u')('P'|'p');
    
HAVING : ('H'|'h')('A'|'a')('V'|'v')('I'|'i')('N'|'n')('G'|'g');

UNDEF : ('U'|'u')('N'|'n')('D'|'d')('E'|'e')('F'|'f');
    
BINDINGS : ('B'|'b')('I'|'i')('N'|'n')('D'|'d')('I'|'i')('N'|'n')('G'|'g')('S'|'s');  

SERVICE : ('S'|'s')('E'|'e')('R'|'r')('V'|'v')('I'|'i')('C'|'c')('E'|'e');

MINUS_KEYWORD : ('M'|'m')('I'|'i')('N'|'n')('U'|'u')('S'|'s');

IRI : ('I'|'i')('R'|'r')('I'|'i');
    	 
URI : ('U'|'u')('R'|'r')('I'|'i');
    		
BNODE : ('B'|'b')('N'|'n')('O'|'o')('D'|'d')('E'|'e');
    		 
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

BLANK_NODE_LABEL
    : '_:' t=PN_LOCAL { setText($t.text); }
    ;

VAR1
    : QUESTION_MARK v=VARNAME { setText($v.text); }
    ;

VAR2
    : '$' v=VARNAME { setText($v.text); }
    ;

LANGTAG
    : '@' ('A'..'Z'|'a'..'z')+ (MINUS ('A'..'Z'|'a'..'z'|DIGIT)+)*
    ;

INTEGER
    : DIGIT+
    ;

DECIMAL
    : DIGIT+ DOT DIGIT*
    | DOT DIGIT+
    ;

DOUBLE
    : DIGIT+ DOT DIGIT* EXPONENT
    | DOT DIGIT+ EXPONENT
    | DIGIT+ EXPONENT
    ;

INTEGER_POSITIVE
    : PLUS INTEGER
    ;

DECIMAL_POSITIVE
    : PLUS DECIMAL
    ;

DOUBLE_POSITIVE
    : PLUS DOUBLE
    ;

INTEGER_NEGATIVE
    : MINUS INTEGER
    ;

DECIMAL_NEGATIVE
    : MINUS DECIMAL
    ;

DOUBLE_NEGATIVE
    : MINUS DOUBLE
    ;
    
fragment
EXPONENT
    : ('e'|'E') SIGN? DIGIT+
    ;

STRING_LITERAL1
    : '\'' ( options {greedy=false;} : ~( '\'' | '\\' | EOL ) | ECHAR )* '\''
    ;

STRING_LITERAL2
    : '"'  ( options {greedy=false;} : ~( '"' | '\\' | EOL ) | ECHAR )* '"'
    ;

STRING_LITERAL_LONG1
    :   '\'\'\'' ( options {greedy=false;} : ( '\'' | '\'\'' )? ( ~('\''|'\\') | ECHAR ) )* '\'\'\''
    ;

STRING_LITERAL_LONG2
    :   '"""' ( options {greedy=false;} : ( '"' | '""' )? ( ~('"'|'\\') | ECHAR ) )* '"""'
    ;

fragment
ECHAR
    : '\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\' | '"' | '\'')
    ;
    		
IRI_REF
    :(LESS (options{greedy=false;}: IRI_REF_CHARACTERS)* GREATER) =>  LESS (options{greedy=false;}: IRI_REF_CHARACTERS)* GREATER { setText($text.substring(1, $text.length()-1)); }
    | LESS { $type = LESS; }
    ;
    
fragment
IRI_REF_CHARACTERS
    : ~( LESS | GREATER | '"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | PIPE | INVERSE | '`' | '\\' | ('\u0000'..'\u0020'))
    ;

fragment
PN_CHARS_U
    : PN_CHARS_BASE | '_'
    ;

fragment
VARNAME
    : ( PN_CHARS_U | DIGIT ) ( PN_CHARS_U | DIGIT | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040' )*
    ;

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
PN_PREFIX
    : PN_CHARS_BASE ((PN_CHARS|DOT)* PN_CHARS)?
    ;

fragment
PN_LOCAL
    : ( PN_CHARS_U | DIGIT ) ((PN_CHARS|DOT)* PN_CHARS)?
  //  | (( PN_CHARS_U | DIGIT ) (options{greedy=false;}: PN_LOCAL_DOT)+ PN_CHARS) => ( PN_CHARS_U | DIGIT ) (options{greedy=false;}: PN_LOCAL_DOT)+ PN_CHARS
    ;
    
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
DIGIT
    : '0'..'9'
    ;

COMMENT 
    : '#' ( options{greedy=false;} : .)* EOL { $channel=HIDDEN; }
    ;

fragment
EOL
    : '\n' | '\r'
    ;

REFERENCE
    : '^^'
    ;

LESS_EQUAL
    : '<='
    ;

GREATER_EQUAL
    : '>='
    ;

NOT_EQUAL
    : '!='
    ;

AND
    : '&&'
    ;

OR
    : '||'
    ;
    
INVERSE
    : '^'
    ;

OPEN_BRACE
    : '('
    ;

CLOSE_BRACE
    : ')'
    ;

OPEN_CURLY_BRACE
    : '{'
    ;

CLOSE_CURLY_BRACE
    : '}'
    ;

OPEN_SQUARE_BRACKET
    : '['
    ;

CLOSE_SQUARE_BRACKET
    : ']'
    ;

SEMICOLON
    : ';'
    ;

DOT
    : '.'
    ;

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

fragment
SIGN
    : (PLUS|MINUS)	
    ;
	
ASTERISK
    : '*'
    ;

QUESTION_MARK
    : '?'
    ;
    	
COMMA
    : ','
    ;

NEGATION
    : '!'
    ;

DIVIDE
    : '/'
    ;

EQUAL
    : '='
    ;
fragment
LESS
    : '<'
    ;

GREATER
    : '>'
    ;

PIPE
    : '|'
    ;
    	
ANY : .
    ;

// $>
