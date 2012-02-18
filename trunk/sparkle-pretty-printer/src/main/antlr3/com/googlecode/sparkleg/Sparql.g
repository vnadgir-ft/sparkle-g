/*
 *    Copyright 2007-2011 The sparkle-g Team
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
 * @version $Id: Sparql.g 226 2011-10-22 21:13:52Z Juergen.Pfundt@gmail.com $
 */
grammar Sparql;

options{
output = AST;
}

tokens{
AND='&&';
ANON;
ASTERISK='*';
DIVIDE='/';
DOT='.';
EQUAL='=';
GREATER='>';
GREATER_EQUAL='>=';
INVERSE='^';
LESS='<';
LESS_EQUAL='<=';
MINUS='-';
NEGATION='!';
NOT_EQUAL='!=';
NIL;
OR='||';
PLUS='+';
QUESTION_MARK='?';

QUERY;
UPDATE;
PROLOGUE;
MODIFY;
SUBSELECT;
SELECT_CLAUSE;
WHERE_CLAUSE;
VAR;
GROUP_BY;
GROUP_CONDITION;
ORDER_BY;
ORDER_CONDITION;
BINDING_VALUE;
TRIPLES_TEMPLATE;
TRIPLES_BLOCK;
GROUP_GRAPH_PATTERN;
ARG_LIST;
EXPRESSION_LIST;
CONSTRUCT_TRIPLES;
TRIPLES_NODE;
COLLECTION;
TRIPLES_SAME_SUBJECT;
SUBJECT;
PREDICATE;
OBJECT;
NOT_EXISTS;
FUNCTION;
RDFLITERAL;
PATH;
PATH_ELT_OR_INVERSE;
PATH_MOD;
PATH_SEQUENCE;
PATH_PRIMARY;
PATH_NEGATED;
BRACKETTED_EXPRESSION;
UNARY;
BLANK_NODE;
}

@header {
    package com.googlecode.sparkleg;
}

@lexer::header {
    package com.googlecode.sparkleg;
}

// $<Parser

query
    : prologue (selectQuery | constructQuery | describeQuery | askQuery) bindingsClause EOF -> ^(QUERY prologue selectQuery* constructQuery* describeQuery* askQuery*) bindingsClause*
    | update (';' update?)* EOF -> ^(UPDATE update+)
    ;

prologue
    /* The tree rewriting rule, as used here, implicitely induces a sorting order */
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
    : selectClause whereClause solutionModifier	-> ^(SUBSELECT selectClause whereClause* solutionModifier*)
    ;
    	
selectClause
    : SELECT (DISTINCT | REDUCED)? '*' -> ^(SELECT_CLAUSE DISTINCT* REDUCED* '*')
    | SELECT (DISTINCT | REDUCED)? (v+=selectVariables)+ -> ^(SELECT_CLAUSE DISTINCT* REDUCED* $v*)
    ;

selectVariables
    : var -> ^(VAR var) 
    | '(' expression AS var ')' -> ^(AS expression var)
    ;

constructQuery
    : CONSTRUCT constructTemplate datasetClause* whereClause solutionModifier -> ^(CONSTRUCT constructTemplate datasetClause* whereClause* solutionModifier*)   
    | CONSTRUCT datasetClause* WHERE '{' triplesTemplate? '}' solutionModifier -> ^(CONSTRUCT datasetClause* ^(WHERE_CLAUSE triplesTemplate*) solutionModifier*)
    ;

describeQuery
    : DESCRIBE ((v+=varOrIRIref)+ | '*') datasetClause* whereClause? solutionModifier -> ^(DESCRIBE $v* '*'* datasetClause* whereClause? solutionModifier*)
    ;

askQuery
    : ASK datasetClause* whereClause solutionModifier -> ^(ASK datasetClause* whereClause solutionModifier*)
    ;

datasetClause
    : FROM NAMED? iriRef -> ^(FROM NAMED? iriRef)
    ;

whereClause
    : WHERE? groupGraphPattern -> ^(WHERE_CLAUSE groupGraphPattern)
    ;

solutionModifier
    : groupClause? havingClause? orderClause? limitOffsetClauses? -> groupClause* havingClause* orderClause* limitOffsetClauses*
    ;

groupClause
    : GROUP BY groupCondition+ -> ^(GROUP_BY groupCondition+)
    ;
    		 
groupCondition
    : builtInCall -> ^(GROUP_CONDITION builtInCall)
    | functionCall -> ^(GROUP_CONDITION functionCall)
    | '(' expression (AS var)? ')' -> ^(GROUP_CONDITION expression var?)
    | var -> ^(GROUP_CONDITION var)
    ;
    
havingClause
    : HAVING constraint+ -> ^(HAVING constraint+)	
    ;
    
orderClause
    : ORDER BY orderCondition+ -> ^(ORDER_BY orderCondition+)
    ;

orderCondition
    : ASC brackettedExpression -> ^(ORDER_CONDITION ASC brackettedExpression)
    | DESC brackettedExpression -> ^(ORDER_CONDITION DESC brackettedExpression)
    | constraint -> ^(ORDER_CONDITION constraint)
    | var -> ^(ORDER_CONDITION var)
    ;
	    
limitOffsetClauses
    : limitClause offsetClause? -> limitClause offsetClause*
    | offsetClause limitClause? -> offsetClause limitClause*
    ;

limitClause
    : LIMIT INTEGER -> ^(LIMIT INTEGER)
    ;

offsetClause
    : OFFSET INTEGER -> ^(OFFSET INTEGER)
    ;

bindingsClause
    : (BINDINGS var* '{' bindingValueList* '}')? -> ^(BINDINGS var* bindingValueList*)?
    ;
    
bindingValueList
    : '(' bindingValue* ')' -> ^(BINDING_VALUE bindingValue*)
    ;
    	
bindingValue
    : iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF
    ;
    
update
    : prologue (load | clear | drop | add | move | copy | create | insert | delete | modify) -> prologue load* clear* drop* add* move* copy* create* insert* delete* modify*
    ;   
    
load 	  
    : LOAD SILENT? iriRef (INTO graphRef)? -> ^(LOAD SILENT* iriRef graphRef?)
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
    : ADD SILENT? from=graphOrDefault TO to=graphOrDefault -> ^(ADD SILENT* $from $to)
    ;
    
move
    : MOVE SILENT? from=graphOrDefault TO to=graphOrDefault -> ^(MOVE SILENT* $from $to)
    ;
    
copy
    : COPY SILENT? from=graphOrDefault TO to=graphOrDefault -> ^(COPY SILENT* $from $to)
    ;

insert
    : INSERT DATA quadPattern -> ^(INSERT DATA quadPattern)
    ;
   
delete 	  
    : DELETE deleteData -> ^(DELETE deleteData)
    | DELETE deleteWhere -> ^(DELETE deleteWhere)
    ;

deleteData
    : DATA quadPattern -> ^(DELETE DATA quadPattern)
    ;

deleteWhere
    : WHERE quadPattern -> ^(DELETE WHERE quadPattern)
    ;
    
modify
    : (WITH iriRef)? (deleteClause insertClause? | insertClause) usingClause* WHERE groupGraphPattern -> ^(MODIFY (WITH iriRef)? deleteClause* insertClause* usingClause* ^(WHERE_CLAUSE groupGraphPattern))
    ;
  
deleteClause
    : DELETE quadPattern -> ^(DELETE quadPattern)
    ;
      
insertClause
    : INSERT quadPattern -> ^(INSERT quadPattern)
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
    : '{' quads '}' -> quads
    ;
    
quads
    : triplesTemplate? quadsDetails* ->  triplesTemplate? quadsDetails* 
    ;
    
quadsDetails
    : quadsNotTriples '.'? triplesTemplate? -> quadsNotTriples triplesTemplate? 
    ;
    
quadsNotTriples
    : GRAPH varOrIRIref '{' triplesTemplate? '}' -> ^(GRAPH varOrIRIref triplesTemplate?)
    ;
    
triplesTemplate
    : triplesSameSubject ('.' triplesSameSubject)* '.'? -> ^(TRIPLES_TEMPLATE triplesSameSubject*)
    ;
    	
groupGraphPattern
    : '{' subSelect '}' -> ^(GROUP_GRAPH_PATTERN subSelect)
    | '{' groupGraphPatternSub '}' -> ^(GROUP_GRAPH_PATTERN groupGraphPatternSub)
    | '{' '}' -> ^(GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN)
    ;
    
groupGraphPatternSub
    : triplesBlock groupGraphPatternSubDetail* -> triplesBlock groupGraphPatternSubDetail*
    | groupGraphPatternSubDetail+ -> groupGraphPatternSubDetail+
    ;

groupGraphPatternSubDetail
    : graphPatternNotTriples '.'? triplesBlock? -> graphPatternNotTriples triplesBlock?
    ;

triplesBlock
    : triplesSameSubjectPath ('.' triplesSameSubjectPath)* '.'? -> triplesSameSubjectPath+
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
    : SERVICE SILENT? varOrIRIref groupGraphPattern -> ^(SERVICE SILENT? varOrIRIref groupGraphPattern)
    ;
    
bind
    : BIND '(' expression AS var ')' -> ^(BIND expression ^(AS var))	
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
    : brackettedExpression
    | builtInCall
    | functionCall
    ;

functionCall
    : iriRef argList -> ^(FUNCTION iriRef ^(ARG_LIST argList))
    ;

argList
    : nil -> nil
    | '(' DISTINCT? expression (',' expression)* ')' -> DISTINCT? expression*
    ;

expressionList
    : (nil | '(' expression (',' expression)* ')') -> ^(EXPRESSION_LIST nil* expression*)
    ;	

constructTemplate
    : '{' constructTriples? '}' -> ^(CONSTRUCT_TRIPLES constructTriples?)
    ;

constructTriples
    : triplesSameSubject ('.' triplesSameSubject)* '.'? -> triplesSameSubject+
    ;

triplesSameSubject
    : varOrTerm propertyListNotEmpty? -> ^(TRIPLES_SAME_SUBJECT ^(SUBJECT varOrTerm) propertyListNotEmpty?)
    | triplesNode propertyListNotEmpty? -> ^(TRIPLES_SAME_SUBJECT triplesNode propertyListNotEmpty?) 
    ;

propertyListNotEmpty
    : propertyListNotEmptyDetails (';' propertyListNotEmptyDetails?)* -> propertyListNotEmptyDetails+ 
    ;

objectList
    : graphNode (',' graphNode)* -> ^(OBJECT graphNode)+
    ;

verb
    : varOrIRIref
    | A
    ;

triplesSameSubjectPath
    : varOrTerm propertyListNotEmptyPath -> ^(TRIPLES_SAME_SUBJECT ^(SUBJECT varOrTerm) propertyListNotEmptyPath)
    | triplesNode propertyListNotEmpty? -> ^(TRIPLES_SAME_SUBJECT  triplesNode propertyListNotEmpty?)
    ;
  
propertyListNotEmptyPath
    : propertyListNotEmptyDetails (';' propertyListNotEmptyDetails?)* -> propertyListNotEmptyDetails+
    ;
  
propertyListNotEmptyDetails
    : verbSimpleOrPath objectList -> ^(PREDICATE  verbSimpleOrPath objectList)
    ;
  
verbSimpleOrPath
    : verbPath
    | verbSimple
    ;
  
verbPath
    : path
    ;
    
verbSimple
    : var
    ;
    	
path
    : pathSequence ('|' pathSequence)* -> ^(PATH pathSequence+)
    ; 

pathSequence
    : pathEltOrInverse ('/' pathEltOrInverse)* -> ^(PATH_SEQUENCE pathEltOrInverse+)
    ;

pathEltOrInverse
    : (i='^')? pathElt -> ^(PATH_ELT_OR_INVERSE $i? pathElt)
    ;
       	  	
pathElt
    : pathPrimary pathMod?
    ;

pathMod
    : '*' -> PATH_MOD '*'
    | '?' -> PATH_MOD '?' 
    | '+' -> PATH_MOD '+' 
    | '{' i1=INTEGER '}' -> PATH_MOD $i1
    | '{' i1=INTEGER c=',' '}' -> PATH_MOD $i1 $c
    | '{' i1=INTEGER ',' i2=INTEGER '}'  -> PATH_MOD $i1 $i2
    | '{' c=',' i2=INTEGER '}' -> PATH_MOD $c $i2
    ;

pathPrimary
    : iriRef -> ^(PATH_PRIMARY iriRef)
    | A -> ^(PATH_PRIMARY A)
    | '!' pathNegatedPropertySet -> ^(PATH_PRIMARY pathNegatedPropertySet)
    | '(' path ')' -> ^(PATH_PRIMARY path)
    ;

pathNegatedPropertySet
    : pathOneInPropertySet -> ^(PATH_NEGATED pathOneInPropertySet)
    | '(' (pathOneInPropertySet ('|' pathOneInPropertySet)*)? ')' -> ^(PATH_NEGATED pathOneInPropertySet+)
    ;  	

pathOneInPropertySet
    : '^'? (iriRef | A)
    ;
	
triplesNode
    : '(' graphNode+ ')' -> ^(COLLECTION graphNode+)
    | '[' propertyListNotEmpty ']' -> ^(TRIPLES_NODE propertyListNotEmpty)
    ;

graphNode
    : varOrTerm | triplesNode
    ;

varOrTerm
    : var
    | graphTerm
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
    : '(' ')' -> NIL
    ;

expression
    : conditionalOrExpression
    ;

conditionalOrExpression
    : (c1=conditionalAndExpression -> $c1) ('||' c2=conditionalAndExpression -> ^('||' $conditionalOrExpression $c2))*
    ;

conditionalAndExpression
    : (v1=valueLogical -> $v1) ('&&' v2=valueLogical -> ^('&&' $conditionalAndExpression $v2))*
    ;

valueLogical
    : relationalExpression
    ;

relationalExpression
    : (n1=numericExpression -> $n1) (('=' n2=numericExpression -> ^('=' $relationalExpression $n2))   
                                    | ('!=' n3=numericExpression -> ^('!=' $relationalExpression $n3)) 
                                    | ('<' n4=numericExpression -> ^('<' $relationalExpression $n4)) 
                                    | ('>' n5=numericExpression -> ^('>' $relationalExpression $n5))
                                    | ('<=' n6=numericExpression -> ^('<=' $relationalExpression $n6))
                                    | ('>=' n7=numericExpression -> ^('>=' $relationalExpression $n7))  
                                    | (IN l2=expressionList -> ^(IN $relationalExpression $l2))
                                    | (NOT IN l3=expressionList -> ^(NOT IN $relationalExpression $l3)))?
    ;

numericExpression
    : additiveExpression
    ;

additiveExpression
    : (m1=multiplicativeExpression -> $m1) ((additiveOperator m2=multiplicativeExpression -> ^(additiveOperator $additiveExpression $m2))  
                                             | (n1=numericLiteralPositive -> ^('+' $additiveExpression $n1) | n2=numericLiteralNegative -> ^('+' $additiveExpression $n2)) 
                                             ((('*' u2=unaryExpression -> ^('*' $additiveExpression $u2))) 
                                             | (('/' u2=unaryExpression -> ^('/' $additiveExpression $u2))))?)*
    ; 
    
additiveOperator
    : '+'|'-'
    ;
    
multiplicativeExpression
    : (u1=unaryExpression -> $u1) (multiplicativeOperator u2=unaryExpression -> ^(multiplicativeOperator $multiplicativeExpression $u2))*
    ;
    
multiplicativeOperator
    : '*'| '/'
    ;

unaryExpression
    : '!' primaryExpression -> ^(UNARY '!' primaryExpression)
    | '+' primaryExpression -> ^(UNARY '+' primaryExpression)
    | '-' primaryExpression -> ^(UNARY '-' primaryExpression)
    | primaryExpression -> ^(UNARY primaryExpression)
    ;

primaryExpression
    : brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate
    ;

brackettedExpression
    : '(' expression ')' -> ^(BRACKETTED_EXPRESSION expression)
    ;

builtInCall
    : STR '(' expression ')' -> ^(STR expression)
    | LANG '(' expression ')' -> ^(LANG expression)
    | LANGMATCHES '(' expression ',' expression ')' -> ^(LANGMATCHES expression+)
    | DATATYPE '(' expression ')' -> ^(DATATYPE expression)
    | BOUND '(' var ')' -> ^(BOUND var)
    | IRI '(' expression ')' -> ^(IRI expression)
    | URI '(' expression ')' -> ^(URI expression)
    | BNODE ('(' expression ')') -> ^(BNODE expression)
    | BNODE nil -> BNODE
    | RAND nil -> RAND
    | ABS '(' expression ')' -> ^(ABS expression)
    | CEIL '(' expression ')' -> ^(CEIL expression)
    | FLOOR '(' expression ')' -> ^(FLOOR expression)
    | ROUND '(' expression ')' -> ^(ROUND expression)
    | CONCAT expressionList -> ^(CONCAT expressionList)
    | subStringExpression -> subStringExpression
    | strReplaceExpression -> strReplaceExpression
    | STRLEN '(' expression ')' -> ^(STRLEN expression)
    | UCASE '(' expression ')' -> ^(UCASE expression)
    | LCASE '(' expression ')' -> ^(LCASE expression)
    | ENCODE_FOR_URI '(' expression ')' -> ^(ENCODE_FOR_URI expression)
    | CONTAINS '(' expression ',' expression ')' -> ^(CONTAINS expression expression)
    | STRSTARTS '(' expression ',' expression ')' -> ^(STRSTARTS expression expression)
    | STRENDS '(' expression ',' expression ')' -> ^(STRENDS expression expression)
    | STRBEFORE '(' expression ',' expression ')' -> ^(STRBEFORE expression expression)
    | STRAFTER '(' expression ',' expression ')' -> ^(STRAFTER expression expression)
    | YEAR '(' expression ')' -> ^(YEAR expression)
    | MONTH '(' expression ')' -> ^(MONTH expression)
    | DAY '(' expression ')' -> ^(DAY expression)
    | HOURS '(' expression ')' -> ^(HOURS expression)
    | MINUTES '(' expression ')' -> ^(MINUTES expression)
    | SECONDS '(' expression ')' -> ^(SECONDS expression)
    | TIMEZONE '(' expression ')' -> ^(TIMEZONE expression)
    | TZ '(' expression ')' -> ^(TZ expression)
    | NOW nil -> NOW
    | MD5 '(' expression ')' -> ^(MD5 expression)
    | SHA1 '(' expression ')' -> ^(SHA1 expression)
    | SHA256 '(' expression ')' -> ^(SHA256 expression)
    | SHA384 '(' expression ')' -> ^(SHA384 expression)
    | SHA512 '(' expression ')' -> ^(SHA512 expression)
    | COALESCE expressionList -> ^(COALESCE expressionList)
    | IF '(' e1=expression ',' e2=expression ',' e3=expression ')' -> ^(IF $e1 $e2 $e3)
    | STRLANG '(' expression ',' expression ')' -> ^(STRLANG expression expression)
    | STRDT '(' expression ',' expression ')' -> ^(STRDT expression expression)
    | SAMETERM '(' expression ',' expression ')' -> ^(SAMETERM expression expression)
    | ISIRI '(' expression ')' -> ^(ISIRI expression)
    | ISURI '(' expression ')' -> ^(ISURI expression)
    | ISBLANK '(' expression ')' -> ^(ISBLANK expression) 
    | ISLITERAL '(' expression ')' -> ^(ISLITERAL expression)
    | ISNUMERIC '(' expression ')' -> ^(ISNUMERIC expression)
    | regexExpression -> regexExpression
    | existsFunction -> existsFunction
    | notExistsFunction -> notExistsFunction
    ;

regexExpression
    : REGEX '(' expression ',' expression (',' expression)? ')' -> ^(REGEX expression*)
    ;
    
subStringExpression
    : SUBSTR '(' expression ',' expression (',' expression)? ')' -> ^(SUBSTR expression*)
    ;
        
strReplaceExpression
    : REPLACE '(' expression ',' expression ',' expression (',' expression)? ')' -> ^(REPLACE expression*)
    ;

existsFunction
    : EXISTS groupGraphPattern -> ^(EXISTS groupGraphPattern)
    ;

notExistsFunction
    : NOT EXISTS groupGraphPattern -> ^(NOT_EXISTS groupGraphPattern)
    ;

aggregate
    : COUNT '(' DISTINCT? ('*' | expression) ')' -> ^(COUNT DISTINCT* '*'* expression*)
    | SUM '(' DISTINCT? expression ')' -> ^(SUM DISTINCT* expression)
    | MIN '(' DISTINCT? expression ')' -> ^(MIN DISTINCT* expression)
    | MAX '(' DISTINCT? expression ')' -> ^(MAX DISTINCT* expression)
    | AVG '(' DISTINCT? expression ')' -> ^(AVG DISTINCT* expression)
    | SAMPLE '(' DISTINCT? expression ')' -> ^(SAMPLE DISTINCT? expression)
    | GROUP_CONCAT '(' DISTINCT? expression (';' SEPARATOR '=' string)? ')' -> ^(GROUP_CONCAT DISTINCT* expression string*)
    ;
    
iriRefOrFunction
    : iriRef argList? -> ^(FUNCTION iriRef ^(ARG_LIST argList)?)
    ;

rdfLiteral
    : string (LANGTAG | ('^^' iriRef))? -> ^(RDFLITERAL string LANGTAG* iriRef*)
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
    : '[' ']' -> ANON
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

STRBEFORE : ('S'|'s')('T'|'t')('R'|'r')('B'|'b')('E'|'e')('F'|'f')('O'|'o')('R'|'r')('E'|'e');

STRAFTER : ('S'|'s')('T'|'t')('R'|'r')('A'|'a')('F'|'f')('T'|'t')('E'|'e')('R'|'r');

REPLACE : ('R'|'r')('E'|'e')('P'|'p')('L'|'l')('A'|'a')('C'|'c')('E'|'e');

YEAR : ('Y'|'y')('E'|'e')('A'|'a')('R'|'r');

MONTH : ('M'|'m')('O'|'o')('N'|'n')('T'|'t')('H'|'h');

DAY : ('D'|'d')('A'|'a')('Y'|'y');

HOURS : ('H'|'h')('O'|'o')('U'|'u')('R'|'r')('S'|'s');

MINUTES : ('M'|'m')('I'|'i')('N'|'n')('U'|'u')('T'|'t')('E'|'e')('S'|'s');

SECONDS : ('S'|'s')('E'|'e')('C'|'c')('O'|'o')('N'|'n')('D'|'d')('S'|'s');	

TIMEZONE :  ('T'|'t')('I'|'i')('M'|'m')('E'|'e')('Z'|'z')('O'|'o')('N'|'n')('E'|'e');

TZ : ('T'|'t')('Z'|'z');

NOW : ('N'|'n')('O'|'o')('W'|'w');

MD5 : ('M'|'m')('D'|'d')'5';

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
 
GROUP_CONCAT  :	('G'|'g')('R'|'r')('O'|'o')('U'|'u')('P'|'p') '_' ('C'|'c')('O'|'o')('N'|'n')('C'|'c')('A'|'a')('T'|'t');

NOT : ('N'|'n')('O'|'o')('T'|'t');
    
IN : ('I'|'i')('N'|'n');

EXISTS : ('E'|'e')('X'|'x')('I'|'i')('S'|'s')('T'|'t')('S'|'s');
    
SEPARATOR : ('S'|'s')('E'|'e')('P'|'p')('A'|'a')('R'|'r')('A'|'a')('T'|'t')('O'|'o')('R'|'r');

PNAME_NS : PN_PREFIX? ':';

PNAME_LN : PNAME_NS PN_LOCAL;
    
BLANK_NODE_LABEL : '_:' PN_LOCAL;

VAR1 : '?' v=VARNAME;

VAR2 : '$' VARNAME;

LANGTAG : '@' ('A'..'Z'|'a'..'z')+ ('-' ('A'..'Z'|'a'..'z'|DIGIT)+)*;

INTEGER : DIGIT+;

DECIMAL
    : DIGIT+ '.' DIGIT*
    | '.' DIGIT+
    ;

DOUBLE
    : DIGIT+ '.' DIGIT* EXPONENT
    | '.' DIGIT+ EXPONENT
    | DIGIT+ EXPONENT
    ;

INTEGER_POSITIVE : '+' INTEGER;

DECIMAL_POSITIVE : '+' DECIMAL;

DOUBLE_POSITIVE : '+' DOUBLE;

INTEGER_NEGATIVE : '-' INTEGER;

DECIMAL_NEGATIVE : '-' DECIMAL;

DOUBLE_NEGATIVE : '-' DOUBLE;
    
fragment EXPONENT : ('e'|'E') SIGN? DIGIT+;

STRING_LITERAL1 : '\'' (options {greedy=false;} : ~('\'' | '\\' | EOL) | ECHAR)* '\'';

STRING_LITERAL2 : '"' (options {greedy=false;} : ~('"' | '\\' | EOL) | ECHAR)* '"';

STRING_LITERAL_LONG1 : '\'\'\'' (options {greedy=false;} : ('\'' | '\'\'')? (~('\''|'\\') | ECHAR))* '\'\'\'';

STRING_LITERAL_LONG2 : '"""' (options {greedy=false;} : ('"' | '""')? (~('"'|'\\') | ECHAR))* '"""';

fragment ECHAR : '\\' ('t' | 'b' | 'n' | 'r' | 'f' | '\\' | '"' | '\'');
    		
IRI_REF
    :('<' (options{greedy=false;}: IRI_REF_CHARACTERS)* '>') =>  '<' (options{greedy=false;}: IRI_REF_CHARACTERS)* '>'
    | '<' { $type = LESS; }
    ;
    
fragment IRI_REF_CHARACTERS
    :  ~('<' | '>' | '"' | '{' | '}' | '|' | '^' | '`' | '\\' | '\u0000' | '\u0001'| '\u0002' | '\u0003' | '\u0004'| '\u0005' | '\u0006'| '\u0007' | '\u0008' | '\u0009'| '\u000A' | '\u000B'| '\u000C' | '\u000D' | '\u000E'| '\u000F'| '\u0010' | '\u0011'| '\u0012' | '\u0013' | '\u0014'| '\u0015' | '\u0016'| '\u0017' | '\u0018' | '\u0019'| '\u001A' | '\u001B'| '\u001C' | '\u001D' | '\u001E'| '\u001F' | '\u0020')
    ;

fragment PN_CHARS_U : PN_CHARS_BASE | '_';

fragment VARNAME : (PN_CHARS_U | DIGIT) (PN_CHARS_U | DIGIT | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040')*;

fragment PN_CHARS
    : PN_CHARS_U
    | '-'
    | DIGIT
    | '\u00B7' 
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment PN_PREFIX : PN_CHARS_BASE ((PN_CHARS|'.')* PN_CHARS)?;
                                         
fragment PN_LOCAL : (PN_CHARS_U|DIGIT|PLX)  ((PN_CHARS|{    
                    	                       if (input.LA(1)=='.') {
                    	                          int LA2 = input.LA(2);
                    	       	                  if (!((LA2>='-' && LA2<='.')||(LA2>='0' && LA2<='9')||(LA2>='A' && LA2<='Z')||LA2=='_'||(LA2>='a' && LA2<='z')||LA2=='\u00B7'||(LA2>='\u00C0' && LA2<='\u00D6')||(LA2>='\u00D8' && LA2<='\u00F6')||(LA2>='\u00F8' && LA2<='\u037D')||(LA2>='\u037F' && LA2<='\u1FFF')||(LA2>='\u200C' && LA2<='\u200D')||(LA2>='\u203F' && LA2<='\u2040')||(LA2>='\u2070' && LA2<='\u218F')||(LA2>='\u2C00' && LA2<='\u2FEF')||(LA2>='\u3001' && LA2<='\uD7FF')||(LA2>='\uF900' && LA2<='\uFDCF')||(LA2>='\uFDF0' && LA2<='\uFFFD'))) {
                    	       	                     return;
                    	       	                  }
                    	                       }
                                           } '.'| PLX)* (PN_CHARS|PLX))?;

fragment PN_CHARS_BASE
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

fragment PLX : PERCENT | PN_LOCAL_ESC;

fragment PERCENT : '%' HEX HEX;

fragment HEX : DIGIT | 'A'..'F' | 'a'..'z';

fragment PN_LOCAL_ESC : '\\' ( '_' | '~' | '.' | '-' | '!' | '$' | '&' | '\'' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | ':' | '/' | '?' | '#' | '@' | '%' );    	

fragment DIGIT : '0'..'9';

fragment SIGN : ('+'|'-');	

fragment EOL : '\n' | '\r';

COMMENT : '#' (options{greedy=false;} : .)* EOL { $channel=HIDDEN; };
        	
ANY : .;

// $>
