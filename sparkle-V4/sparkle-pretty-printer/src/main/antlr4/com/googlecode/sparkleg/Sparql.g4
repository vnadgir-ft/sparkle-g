/*
 *    Copyright 2007-2012 The sparkle-g Team
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
 * @version $Id: Sparql.g 523 2012-02-17 23:10:57Z Juergen.Pfundt@gmail.com $
 */
grammar Sparql;

tokens{
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
PATH;
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
    : prologue (selectQuery | constructQuery | describeQuery | askQuery) bindingsClause EOF
    | update (SEMICOLON update?)* EOF
    ;

prologue
    : (baseDecl | prefixDecl)*
    ;

baseDecl
    : BASE IRI_REF
    ; 

prefixDecl
    : PREFIX PNAME_NS IRI_REF
    ;

selectQuery
    : selectClause datasetClause* whereClause solutionModifier
    ;

subSelect
    : selectClause whereClause solutionModifier
    ;
    	
selectClause
    : SELECT (DISTINCT | REDUCED)? ((var| OPEN_BRACE expression AS var CLOSE_BRACE)+ | ASTERISK)
    ;

constructQuery
    : CONSTRUCT (constructTemplate datasetClause* whereClause solutionModifier | datasetClause* WHERE OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE solutionModifier)
    ;

describeQuery
    : DESCRIBE (varOrIRIref+ | ASTERISK) datasetClause* whereClause? solutionModifier
    ;

askQuery
    : ASK datasetClause* whereClause solutionModifier
    ;

datasetClause
    : FROM NAMED? iriRef
    ;

whereClause
    : WHERE? groupGraphPattern
    ;

solutionModifier
    : groupClause? havingClause? orderClause? limitOffsetClauses?
    ;

groupClause
    : GROUP BY groupCondition+
    ;
    		 
groupCondition
    : builtInCall | functionCall | OPEN_BRACE expression (AS var)? CLOSE_BRACE | var
    ;
    
havingClause
    : HAVING havingCondition+
    ;
    
havingCondition
    : constraint
    ;
    
orderClause
    : ORDER BY orderCondition+
    ;

orderCondition
    : ASC brackettedExpression | DESC brackettedExpression | constraint | var
    ;
	    
limitOffsetClauses
    : limitClause offsetClause? | offsetClause limitClause?
    ;

limitClause
    : LIMIT INTEGER
    ;

offsetClause
    : OFFSET INTEGER
    ;

bindingsClause
    : (BINDINGS (var)* OPEN_CURLY_BRACE (OPEN_BRACE bindingsValueList CLOSE_BRACE | nil)* CLOSE_CURLY_BRACE)?
    ;

bindingsValueList
    : bindingValue+
    ;

bindingValue
    : iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF
    ;
    
update
    : prologue (load | clear | drop | add | move | copy | create | insertData | deleteData | deleteWhere | modify)
    ;   
    
load 	  
    : LOAD SILENT? iriRef (INTO graphRef)?
    ;
    
clear
    : CLEAR  SILENT? graphRefAll
    ;
    
drop
    : DROP SILENT? graphRefAll
    ; 

create
    : CREATE SILENT? graphRef
    ;
    
add
    : ADD SILENT? graphOrDefault TO graphOrDefault
    ;
    
move
    : MOVE SILENT? graphOrDefault TO graphOrDefault
    ;
    
copy
    : COPY SILENT? graphOrDefault TO graphOrDefault
    ;

insertData
    : INSERT DATA quadData
    ;

deleteData
    : DELETE DATA quadData
    ;

deleteWhere
    : DELETE WHERE quadData
    ;
    
modify
    : (WITH iriRef)? (deleteClause insertClause? | insertClause) usingClause* WHERE groupGraphPattern
    ;
  
deleteClause
    : DELETE quadPattern
    ;
      
insertClause
    : INSERT quadPattern
    ;

usingClause
    : USING NAMED? iriRef
    ;

graphOrDefault	  
    : DEFAULT | GRAPH? iriRef
    ;
    	    	
graphRef
    : GRAPH iriRef
    ;

graphRefAll
    : graphRef | DEFAULT | NAMED | ALL
    ;

quadPattern
    : OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE
    ;
    
quadData
    : OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE
    ;
    
quads
    : triplesTemplate? (quadsNotTriples DOT? triplesTemplate?)*
    ;

quadsNotTriples
    : GRAPH varOrIRIref OPEN_CURLY_BRACE triplesTemplate? CLOSE_CURLY_BRACE
    ;
    
triplesTemplate
    : triplesSameSubject (DOT triplesTemplate?)?
    ;
    	
groupGraphPattern
    : OPEN_CURLY_BRACE (subSelect | groupGraphPatternSub) CLOSE_CURLY_BRACE
    ;
    
groupGraphPatternSub
    : triplesBlock?  groupGraphPatternSubList* //(f+=graphPatternNotTriples DOT? triplesBlock?)*
    ;
    
groupGraphPatternSubList
    : graphPatternNotTriples DOT? triplesBlock?
    ;
    
triplesBlock
    //: triplesSameSubjectPath (DOT triplesSameSubjectPath)* DOT? 
    : triplesSameSubjectPath (DOT triplesBlock?)?
    ;

graphPatternNotTriples
    : groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter | bind
    ;

optionalGraphPattern
    : OPTIONAL groupGraphPattern
    ;

graphGraphPattern
    : GRAPH varOrIRIref groupGraphPattern
    ;

serviceGraphPattern
    : SERVICE SILENT? varOrIRIref groupGraphPattern
    ;
    
bind
    : BIND OPEN_BRACE expression AS var CLOSE_BRACE
    ;
    	
minusGraphPattern
    : MINUS_KEYWORD groupGraphPattern
    ;

groupOrUnionGraphPattern
    : groupGraphPattern (UNION groupGraphPattern)*
    ;

filter
    : FILTER constraint
    ;

constraint
    : brackettedExpression | builtInCall | functionCall
    ;

functionCall
    : iriRef argList
    ;

argList
    : nil | OPEN_BRACE DISTINCT? expression (COMMA expression)* CLOSE_BRACE
    ;

expressionList
    : nil | OPEN_BRACE expression (COMMA expression)* CLOSE_BRACE
    ;	

constructTemplate
    : OPEN_CURLY_BRACE constructTriples? CLOSE_CURLY_BRACE
    ;

constructTriples
    : triplesSameSubject (DOT constructTriples?)*
    ;

triplesSameSubject
    : varOrTerm propertyListNotEmpty | triplesNode propertyList 
    ;

propertyListNotEmpty
    : verb objectList (SEMICOLON (verb objectList)?)* 
    ;
    
propertyList
    : propertyListNotEmpty?
    ;

objectList
    : object (COMMA object)*
    ;

object
    : graphNode
    ;
    
verb
    : varOrIRIref | A
    ;

triplesSameSubjectPath
    : varOrTerm propertyListNotEmptyPath | triplesNode propertyListPath
    ;
  
propertyListNotEmptyPath
    : (verbPath|verbSimple) objectList (SEMICOLON ((verbPath|verbSimple) objectList)?)*
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
    : pathAlternative
    ; 

pathAlternative
    : pathSequence ( PIPE pathSequence)*
    ;
    
pathSequence
    : pathEltOrInverse (DIVIDE pathEltOrInverse)*
    ;
       	  	
pathElt
    : pathPrimary pathMod?
    ;

pathEltOrInverse
    : INVERSE? pathElt
    ;

pathMod
    : (ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE (integer (COMMA (CLOSE_CURLY_BRACE | integer CLOSE_CURLY_BRACE) | CLOSE_CURLY_BRACE) | COMMA integer CLOSE_CURLY_BRACE))
    ;

pathPrimary
    : iriRef | A | NEGATION pathNegatedPropertySet | OPEN_BRACE path CLOSE_BRACE
    ;

pathNegatedPropertySet
    : pathOneInPropertySet | OPEN_BRACE (pathOneInPropertySet (PIPE pathOneInPropertySet)*)? CLOSE_BRACE
    ;  	

pathOneInPropertySet
    : INVERSE? (iriRef | A)
    ;
	
integer
    : INTEGER
    ;
    
triplesNode
    : collection | blankNodePropertyList
    ;

blankNodePropertyList
    : OPEN_SQUARE_BRACKET propertyListNotEmpty CLOSE_SQUARE_BRACKET
    ;
    
collection
    : OPEN_BRACE graphNode+ CLOSE_BRACE
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
    : iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil
    ;
    
nil
    : OPEN_BRACE CLOSE_BRACE
    ;

expression
    : conditionalOrExpression
    ;

conditionalOrExpression
    : conditionalAndExpression (OR conditionalAndExpression)*
    ;

conditionalAndExpression
    : valueLogical (AND valueLogical)*
    ;

valueLogical
    : relationalExpression
    ;

relationalExpression
    : numericExpression (EQUAL numericExpression
                        | NOT_EQUAL numericExpression 
                        | LESS numericExpression 
                        | GREATER numericExpression
                        | LESS_EQUAL numericExpression
                        | GREATER_EQUAL numericExpression  
                        | IN el1=expressionList
                        | NOT IN el2=expressionList)?
    ;

numericExpression
    : additiveExpression
    ;

additiveExpression
    : multiplicativeExpression (PLUS multiplicativeExpression
                               | MINUS multiplicativeExpression
                               |(numericLiteralPositive | numericLiteralNegative) ((ASTERISK unaryExpression) | (DIVIDE unaryExpression))?)*
    ; 

multiplicativeExpression
    : unaryExpression (ASTERISK unaryExpression | DIVIDE unaryExpression)*
    ;

unaryExpression
    : NEGATION primaryExpression
    | PLUS primaryExpression
    | MINUS primaryExpression
    | primaryExpression
    ;

primaryExpression
    : brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate
    ;

brackettedExpression
    : OPEN_BRACE expression CLOSE_BRACE
    ;

builtInCall
    : STR OPEN_BRACE expression CLOSE_BRACE
    | LANG OPEN_BRACE expression CLOSE_BRACE
    | LANGMATCHES OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | DATATYPE OPEN_BRACE expression CLOSE_BRACE
    | BOUND OPEN_BRACE var CLOSE_BRACE
    | IRI OPEN_BRACE expression CLOSE_BRACE
    | URI OPEN_BRACE expression CLOSE_BRACE
    | BNODE OPEN_BRACE expression CLOSE_BRACE
    | BNODE nil
    | RAND nil
    | ABS OPEN_BRACE expression CLOSE_BRACE
    | CEIL OPEN_BRACE expression CLOSE_BRACE
    | FLOOR OPEN_BRACE expression CLOSE_BRACE
    | ROUND OPEN_BRACE expression CLOSE_BRACE
    | CONCAT expressionList
    | subStringExpression
    | strReplaceExpression
    | STRLEN OPEN_BRACE expression CLOSE_BRACE
    | UCASE OPEN_BRACE expression CLOSE_BRACE
    | LCASE OPEN_BRACE expression CLOSE_BRACE
    | ENCODE_FOR_URI OPEN_BRACE expression CLOSE_BRACE
    | CONTAINS OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | STRSTARTS OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | STRENDS OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | STRBEFORE OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | STRAFTER OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | YEAR OPEN_BRACE expression CLOSE_BRACE
    | MONTH OPEN_BRACE expression CLOSE_BRACE
    | DAY OPEN_BRACE expression CLOSE_BRACE
    | HOURS OPEN_BRACE expression CLOSE_BRACE
    | MINUTES OPEN_BRACE expression CLOSE_BRACE
    | SECONDS OPEN_BRACE expression CLOSE_BRACE
    | TIMEZONE OPEN_BRACE expression CLOSE_BRACE
    | TZ OPEN_BRACE expression CLOSE_BRACE
    | NOW nil
    | MD5 OPEN_BRACE expression CLOSE_BRACE
    | SHA1 OPEN_BRACE expression CLOSE_BRACE
    | SHA256 OPEN_BRACE expression CLOSE_BRACE
    | SHA384 OPEN_BRACE expression CLOSE_BRACE
    | SHA512 OPEN_BRACE expression CLOSE_BRACE
    | COALESCE expressionList
    | IF OPEN_BRACE expression COMMA expression COMMA expression CLOSE_BRACE
    | STRLANG OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | STRDT OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | SAMETERM OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | ISIRI OPEN_BRACE expression CLOSE_BRACE
    | ISURI OPEN_BRACE expression CLOSE_BRACE
    | ISBLANK OPEN_BRACE expression CLOSE_BRACE
    | ISLITERAL OPEN_BRACE expression CLOSE_BRACE
    | ISNUMERIC OPEN_BRACE expression CLOSE_BRACE
    | regexExpression
    | existsFunction
    | notExistsFunction
    ;

regexExpression
    : REGEX OPEN_BRACE expression COMMA expression (COMMA expression)? CLOSE_BRACE
    ;
    
subStringExpression
    : SUBSTR OPEN_BRACE expression COMMA expression (COMMA expression)? CLOSE_BRACE
    ;
    
strReplaceExpression
    : REPLACE OPEN_BRACE expression COMMA expression COMMA expression (COMMA expression)? CLOSE_BRACE
    ;
    
existsFunction
    : EXISTS groupGraphPattern
    ;

notExistsFunction
    : NOT EXISTS groupGraphPattern
    ;

aggregate
    : COUNT OPEN_BRACE DISTINCT? (ASTERISK | expression) CLOSE_BRACE
    | SUM OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | MIN OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | MAX OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | AVG OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | SAMPLE OPEN_BRACE DISTINCT? expression CLOSE_BRACE
    | GROUP_CONCAT OPEN_BRACE DISTINCT? expression (SEMICOLON SEPARATOR EQUAL string)? CLOSE_BRACE
    ;
    
iriRefOrFunction
    : iriRef argList?
    ;

rdfLiteral
    : string (LANGTAG | (REFERENCE iriRef))?
    ;

numericLiteral
    : numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative
    ;

numericLiteralUnsigned
    : INTEGER | DECIMAL | DOUBLE
    ;

numericLiteralPositive
    : INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE
    ;

numericLiteralNegative
    : INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE
    ;

booleanLiteral
    : TRUE | FALSE
    ;

string
    : STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2
    ;

iriRef
    : IRI_REF | prefixedName
    ;

prefixedName
    : PNAME_LN | PNAME_NS
    ;

blankNode
    : BLANK_NODE_LABEL | anon
    ;

anon
    : OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET
    ;
// $>

// $<Lexer

WS : (' '| '\t'| EOL)+ -> skip;

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

IRI_REF
    : '<' (~('<' | '>' | '"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | PIPE | INVERSE | '`' | '\\' | '\u0000'..'\u0020'))* '>'
//    | LESS { $type = LESS; }
    ;

PNAME_NS : PN_PREFIX? ':';

PNAME_LN : PNAME_NS PN_LOCAL;
    
BLANK_NODE_LABEL : '_:' PN_LOCAL;

VAR1 : '?' VARNAME;

VAR2 : '$' VARNAME;

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

STRING_LITERAL1 : '\'' (~('\'' | '\\' | EOL) | ECHAR)* '\'';

STRING_LITERAL2 : '"' (~('"' | '\\' | EOL) | ECHAR)* '"';

STRING_LITERAL_LONG1 : '\'\'\'' (('\'' | '\'\'')? (~('\''|'\\') | ECHAR))* '\'\'\'';

STRING_LITERAL_LONG2 : '"""' (('"' | '""')? (~('"'|'\\') | ECHAR))* '"""';

fragment
ECHAR : '\\' ('t' | 'b' | 'n' | 'r' | 'f' | '\\' | '"' | '\'');
    
fragment
IRI_REF_CHARACTERS
    :  ~('<' | '>' | '"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | PIPE | INVERSE | '`' | '\\' | '\u0000' | '\u0001'| '\u0002' | '\u0003' | '\u0004'| '\u0005' | '\u0006'| '\u0007' | '\u0008' | '\u0009'| '\u000A' | '\u000B'| '\u000C' | '\u000D' | '\u000E'| '\u000F'| '\u0010' | '\u0011'| '\u0012' | '\u0013' | '\u0014'| '\u0015' | '\u0016'| '\u0017' | '\u0018' | '\u0019'| '\u001A' | '\u001B'| '\u001C' | '\u001D' | '\u001E'| '\u001F' | '\u0020')
    ;

fragment
PN_CHARS_U : PN_CHARS_BASE | '_';

fragment
VARNAME : (PN_CHARS_U | DIGIT) (PN_CHARS_U | DIGIT | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040')*;

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
PN_LOCAL : (PN_CHARS_U|DIGIT|PLX)  ((PN_CHARS| DOT| PLX)* (PN_CHARS|PLX))?;

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
PLX : PERCENT | PN_LOCAL_ESC;

fragment
PERCENT : '%' HEX HEX;

fragment
HEX : DIGIT | 'A'..'F' | 'a'..'z';

fragment
PN_LOCAL_ESC : '\\' ( '_' | '~' | '.' | '-' | '!' | '$' | '&' | '\'' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | ':' | '/' | '?' | '#' | '@' | '%' );    	

fragment
DIGIT : '0'..'9';

COMMENT : '#' .* EOL -> skip;

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

LESS : '<';

GREATER : '>';

PIPE : '|';
    	
ANY : .;

// $>
