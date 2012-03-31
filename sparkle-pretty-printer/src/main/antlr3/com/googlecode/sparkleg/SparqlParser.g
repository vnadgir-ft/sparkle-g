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
parser grammar SparqlParser;

options{
tokenVocab=SparqlLexer;
output = AST;
}

tokens{
ANON;
NIL;

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

// $<Parser

query
    : prologue (selectQuery | constructQuery | describeQuery | askQuery) bindingsClause EOF -> ^(QUERY prologue selectQuery* constructQuery* describeQuery* askQuery*) bindingsClause*
    | update (SEMICOLON update?)* EOF -> ^(UPDATE update+)
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
    : SELECT (DISTINCT | REDUCED)? ASTERISK -> ^(SELECT_CLAUSE DISTINCT* REDUCED* ASTERISK)
    | SELECT (DISTINCT | REDUCED)? (v+=selectVariables)+ -> ^(SELECT_CLAUSE DISTINCT* REDUCED* $v*)
    ;

selectVariables
    : var -> ^(VAR var) 
    | OPEN_BRACE expression AS var CLOSE_BRACE -> ^(AS expression var)
    ;

constructQuery
    : CONSTRUCT constructTemplate datasetClause* whereClause solutionModifier -> ^(CONSTRUCT constructTemplate datasetClause* whereClause* solutionModifier*)   
    | CONSTRUCT datasetClause* WHERE OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE solutionModifier -> ^(CONSTRUCT datasetClause* ^(WHERE_CLAUSE triplesTemplate*) solutionModifier*)
    ;

describeQuery
    : DESCRIBE ((v+=varOrIRIref)+ | ASTERISK) datasetClause* whereClause? solutionModifier -> ^(DESCRIBE $v* ASTERISK* datasetClause* whereClause? solutionModifier*)
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
    | OPEN_BRACE expression (AS var)? CLOSE_BRACE -> ^(GROUP_CONDITION expression var?)
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
    : (BINDINGS var* OPEN_CURLY_BRACE bindingValueList* CLOSE_CURLY_BRACE)? -> ^(BINDINGS var* bindingValueList*)?
    ;
    
bindingValueList
    : OPEN_BRACE bindingValue* CLOSE_BRACE -> ^(BINDING_VALUE bindingValue*)
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
    : OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE -> quads
    ;
    
quads
    : triplesTemplate? quadsDetails* ->  triplesTemplate? quadsDetails* 
    ;
    
quadsDetails
    : quadsNotTriples DOT? triplesTemplate? -> quadsNotTriples triplesTemplate? 
    ;
    
quadsNotTriples
    : GRAPH varOrIRIref OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE -> ^(GRAPH varOrIRIref triplesTemplate?)
    ;
    
triplesTemplate
    : triplesSameSubject (DOT triplesSameSubject)* DOT? -> ^(TRIPLES_TEMPLATE triplesSameSubject*)
    ;
    	
groupGraphPattern
    : OPEN_CURLY_BRACE subSelect CLOSE_CURLY_BRACE -> ^(GROUP_GRAPH_PATTERN subSelect)
    | OPEN_CURLY_BRACE groupGraphPatternSub CLOSE_CURLY_BRACE -> ^(GROUP_GRAPH_PATTERN groupGraphPatternSub)
    | OPEN_CURLY_BRACE CLOSE_CURLY_BRACE -> ^(GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN)
    ;
    
groupGraphPatternSub
    : triplesBlock groupGraphPatternSubDetail* -> triplesBlock groupGraphPatternSubDetail*
    | groupGraphPatternSubDetail+ -> groupGraphPatternSubDetail+
    ;

groupGraphPatternSubDetail
    : graphPatternNotTriples DOT? triplesBlock? -> graphPatternNotTriples triplesBlock?
    ;

triplesBlock
    : triplesSameSubjectPath (DOT triplesSameSubjectPath)* DOT? -> triplesSameSubjectPath+
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
    : brackettedExpression
    | builtInCall
    | functionCall
    ;

functionCall
    : iriRef argList -> ^(FUNCTION iriRef ^(ARG_LIST argList))
    ;

argList
    : nil -> nil
    | OPEN_BRACE DISTINCT? expression (COMMA expression)* CLOSE_BRACE -> DISTINCT? expression*
    ;

expressionList
    : (nil | OPEN_BRACE expression (COMMA expression)* CLOSE_BRACE) -> ^(EXPRESSION_LIST nil* expression*)
    ;	

constructTemplate
    : OPEN_CURLY_BRACE constructTriples? CLOSE_CURLY_BRACE -> ^(CONSTRUCT_TRIPLES constructTriples?)
    ;

constructTriples
    : triplesSameSubject (DOT triplesSameSubject)* DOT? -> triplesSameSubject+
    ;

triplesSameSubject
    : varOrTerm propertyListNotEmpty? -> ^(TRIPLES_SAME_SUBJECT ^(SUBJECT varOrTerm) propertyListNotEmpty?)
    | triplesNode propertyListNotEmpty? -> ^(TRIPLES_SAME_SUBJECT triplesNode propertyListNotEmpty?) 
    ;

propertyListNotEmpty
    : propertyListNotEmptyDetails (SEMICOLON propertyListNotEmptyDetails?)* -> propertyListNotEmptyDetails+ 
    ;

objectList
    : graphNode (COMMA graphNode)* -> ^(OBJECT graphNode)+
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
    : propertyListNotEmptyDetails (SEMICOLON propertyListNotEmptyDetails?)* -> propertyListNotEmptyDetails+
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
    : pathSequence (PIPE pathSequence)* -> ^(PATH pathSequence+)
    ; 

pathSequence
    : pathEltOrInverse (DIVIDE pathEltOrInverse)* -> ^(PATH_SEQUENCE pathEltOrInverse+)
    ;

pathEltOrInverse
    : (i=INVERSE)? pathElt -> ^(PATH_ELT_OR_INVERSE $i? pathElt)
    ;
       	  	
pathElt
    : pathPrimary pathMod?
    ;

pathMod
    : ASTERISK -> PATH_MOD ASTERISK
    | QUESTION_MARK -> PATH_MOD QUESTION_MARK 
    | PLUS -> PATH_MOD PLUS 
    | OPEN_CURLY_BRACE i1=INTEGER CLOSE_CURLY_BRACE -> PATH_MOD $i1
    | OPEN_CURLY_BRACE i1=INTEGER c=COMMA CLOSE_CURLY_BRACE -> PATH_MOD $i1 $c
    | OPEN_CURLY_BRACE i1=INTEGER COMMA i2=INTEGER CLOSE_CURLY_BRACE  -> PATH_MOD $i1 $i2
    | OPEN_CURLY_BRACE c=COMMA i2=INTEGER CLOSE_CURLY_BRACE -> PATH_MOD $c $i2
    ;

pathPrimary
    : iriRef -> ^(PATH_PRIMARY iriRef)
    | A -> ^(PATH_PRIMARY A)
    | NEGATION pathNegatedPropertySet -> ^(PATH_PRIMARY pathNegatedPropertySet)
    | OPEN_BRACE path CLOSE_BRACE -> ^(PATH_PRIMARY path)
    ;

pathNegatedPropertySet
    : pathOneInPropertySet -> ^(PATH_NEGATED pathOneInPropertySet)
    | OPEN_BRACE (pathOneInPropertySet (PIPE pathOneInPropertySet)*)? CLOSE_BRACE -> ^(PATH_NEGATED pathOneInPropertySet+)
    ;  	

pathOneInPropertySet
    : INVERSE? (iriRef | A)
    ;
	
triplesNode
    : OPEN_BRACE graphNode+ CLOSE_BRACE -> ^(COLLECTION graphNode+)
    | OPEN_SQUARE_BRACKET propertyListNotEmpty CLOSE_SQUARE_BRACKET -> ^(TRIPLES_NODE propertyListNotEmpty)
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
    : OPEN_BRACE CLOSE_BRACE -> NIL
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
    : (n1=numericExpression -> $n1) ((EQUAL n2=numericExpression -> ^(EQUAL $relationalExpression $n2))   
                                    | (NOT_EQUAL n3=numericExpression -> ^(NOT_EQUAL $relationalExpression $n3)) 
                                    | (LESS n4=numericExpression -> ^(LESS $relationalExpression $n4)) 
                                    | (GREATER n5=numericExpression -> ^(GREATER $relationalExpression $n5))
                                    | (LESS_EQUAL n6=numericExpression -> ^(LESS_EQUAL $relationalExpression $n6))
                                    | (GREATER_EQUAL n7=numericExpression -> ^(GREATER_EQUAL $relationalExpression $n7))  
                                    | (IN l2=expressionList -> ^(IN $relationalExpression $l2))
                                    | (NOT IN l3=expressionList -> ^(NOT IN $relationalExpression $l3)))?
    ;

numericExpression
    : additiveExpression
    ;

additiveExpression
    : (m1=multiplicativeExpression -> $m1) ((additiveOperator m2=multiplicativeExpression -> ^(additiveOperator $additiveExpression $m2))  
                                             | (n1=numericLiteralPositive -> ^(PLUS $additiveExpression $n1) | n2=numericLiteralNegative -> ^(PLUS $additiveExpression $n2)) 
                                             (((ASTERISK u2=unaryExpression -> ^(ASTERISK $additiveExpression $u2))) 
                                             | ((DIVIDE u2=unaryExpression -> ^(DIVIDE $additiveExpression $u2))))?)*
    ; 
    
additiveOperator
    : PLUS|MINUS
    ;
    
multiplicativeExpression
    : (u1=unaryExpression -> $u1) (multiplicativeOperator u2=unaryExpression -> ^(multiplicativeOperator $multiplicativeExpression $u2))*
    ;
    
multiplicativeOperator
    : ASTERISK| DIVIDE
    ;

unaryExpression
    : NEGATION primaryExpression -> ^(UNARY NEGATION primaryExpression)
    | PLUS primaryExpression -> ^(UNARY PLUS primaryExpression)
    | MINUS primaryExpression -> ^(UNARY MINUS primaryExpression)
    | primaryExpression -> ^(UNARY primaryExpression)
    ;

primaryExpression
    : brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate
    ;

brackettedExpression
    : OPEN_BRACE expression CLOSE_BRACE -> ^(BRACKETTED_EXPRESSION expression)
    ;

builtInCall
    : STR OPEN_BRACE expression CLOSE_BRACE -> ^(STR expression)
    | LANG OPEN_BRACE expression CLOSE_BRACE -> ^(LANG expression)
    | LANGMATCHES OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^(LANGMATCHES expression+)
    | DATATYPE OPEN_BRACE expression CLOSE_BRACE -> ^(DATATYPE expression)
    | BOUND OPEN_BRACE var CLOSE_BRACE -> ^(BOUND var)
    | IRI OPEN_BRACE expression CLOSE_BRACE -> ^(IRI expression)
    | URI OPEN_BRACE expression CLOSE_BRACE -> ^(URI expression)
    | BNODE (OPEN_BRACE expression CLOSE_BRACE) -> ^(BNODE expression)
    | BNODE nil -> BNODE
    | RAND nil -> RAND
    | ABS OPEN_BRACE expression CLOSE_BRACE -> ^(ABS expression)
    | CEIL OPEN_BRACE expression CLOSE_BRACE -> ^(CEIL expression)
    | FLOOR OPEN_BRACE expression CLOSE_BRACE -> ^(FLOOR expression)
    | ROUND OPEN_BRACE expression CLOSE_BRACE -> ^(ROUND expression)
    | CONCAT expressionList -> ^(CONCAT expressionList)
    | subStringExpression -> subStringExpression
    | strReplaceExpression -> strReplaceExpression
    | STRLEN OPEN_BRACE expression CLOSE_BRACE -> ^(STRLEN expression)
    | UCASE OPEN_BRACE expression CLOSE_BRACE -> ^(UCASE expression)
    | LCASE OPEN_BRACE expression CLOSE_BRACE -> ^(LCASE expression)
    | ENCODE_FOR_URI OPEN_BRACE expression CLOSE_BRACE -> ^(ENCODE_FOR_URI expression)
    | CONTAINS OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^(CONTAINS expression expression)
    | STRSTARTS OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^(STRSTARTS expression expression)
    | STRENDS OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^(STRENDS expression expression)
    | STRBEFORE OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^(STRBEFORE expression expression)
    | STRAFTER OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^(STRAFTER expression expression)
    | YEAR OPEN_BRACE expression CLOSE_BRACE -> ^(YEAR expression)
    | MONTH OPEN_BRACE expression CLOSE_BRACE -> ^(MONTH expression)
    | DAY OPEN_BRACE expression CLOSE_BRACE -> ^(DAY expression)
    | HOURS OPEN_BRACE expression CLOSE_BRACE -> ^(HOURS expression)
    | MINUTES OPEN_BRACE expression CLOSE_BRACE -> ^(MINUTES expression)
    | SECONDS OPEN_BRACE expression CLOSE_BRACE -> ^(SECONDS expression)
    | TIMEZONE OPEN_BRACE expression CLOSE_BRACE -> ^(TIMEZONE expression)
    | TZ OPEN_BRACE expression CLOSE_BRACE -> ^(TZ expression)
    | NOW nil -> NOW
    | MD5 OPEN_BRACE expression CLOSE_BRACE -> ^(MD5 expression)
    | SHA1 OPEN_BRACE expression CLOSE_BRACE -> ^(SHA1 expression)
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
    : REGEX OPEN_BRACE expression COMMA expression (COMMA expression)? CLOSE_BRACE -> ^(REGEX expression*)
    ;
    
subStringExpression
    : SUBSTR OPEN_BRACE expression COMMA expression (COMMA expression)? CLOSE_BRACE -> ^(SUBSTR expression*)
    ;
        
strReplaceExpression
    : REPLACE OPEN_BRACE expression COMMA expression COMMA expression (COMMA expression)? CLOSE_BRACE -> ^(REPLACE expression*)
    ;

existsFunction
    : EXISTS groupGraphPattern -> ^(EXISTS groupGraphPattern)
    ;

notExistsFunction
    : NOT EXISTS groupGraphPattern -> ^(NOT_EXISTS groupGraphPattern)
    ;

aggregate
    : COUNT OPEN_BRACE DISTINCT? (ASTERISK | expression) CLOSE_BRACE -> ^(COUNT DISTINCT* ASTERISK* expression*)
    | SUM OPEN_BRACE DISTINCT? expression CLOSE_BRACE -> ^(SUM DISTINCT* expression)
    | MIN OPEN_BRACE DISTINCT? expression CLOSE_BRACE -> ^(MIN DISTINCT* expression)
    | MAX OPEN_BRACE DISTINCT? expression CLOSE_BRACE -> ^(MAX DISTINCT* expression)
    | AVG OPEN_BRACE DISTINCT? expression CLOSE_BRACE -> ^(AVG DISTINCT* expression)
    | SAMPLE OPEN_BRACE DISTINCT? expression CLOSE_BRACE -> ^(SAMPLE DISTINCT? expression)
    | GROUP_CONCAT OPEN_BRACE DISTINCT? expression (SEMICOLON SEPARATOR EQUAL string)? CLOSE_BRACE -> ^(GROUP_CONCAT DISTINCT* expression string*)
    ;
    
iriRefOrFunction
    : iriRef argList? -> ^(FUNCTION iriRef ^(ARG_LIST argList)?)
    ;

rdfLiteral
    : string (LANGTAG | (REFERENCE iriRef))? -> ^(RDFLITERAL string LANGTAG* iriRef*)
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
    : OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET -> ANON
    ;
// $>

