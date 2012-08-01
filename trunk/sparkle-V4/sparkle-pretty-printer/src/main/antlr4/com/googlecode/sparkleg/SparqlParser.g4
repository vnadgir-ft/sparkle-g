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
parser grammar SparqlParser;

options{
tokenVocab=SparqlLexer;
}

@header {
package com.googlecode.sparkleg;
}

// $<Parser

query
    : prologue (selectQuery | constructQuery | describeQuery | askQuery) valuesClause EOF
    | update (SEMICOLON update)* SEMICOLON? EOF
    ;

prologue
    : (baseDecl | prefixDecl)*
    ;

baseDecl
    : BASE IRIREF
    ; 

prefixDecl
    : PREFIX PNAME_NS IRIREF
    ;

selectQuery
    : selectClause datasetClause* whereClause solutionModifier
    ;

subSelect
    : selectClause whereClause solutionModifier valuesClause
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
    : FROM NAMED? iri
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

valuesClause
    : (VALUES dataBlock)?
    ;
    
update
    : prologue (load | clear | drop | add | move | copy | create | insertData | deleteData | deleteWhere | modify)
    ;   
    
load 	  
    : LOAD SILENT? iri (INTO graphRef)?
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
    : DELETE WHERE quadPattern
    ;
    
modify
    : (WITH iri)? (deleteClause insertClause? | insertClause) usingClause* WHERE groupGraphPattern
    ;
  
deleteClause
    : DELETE quadPattern
    ;
      
insertClause
    : INSERT quadPattern
    ;

usingClause
    : USING NAMED? iri
    ;

graphOrDefault	  
    : DEFAULT | GRAPH? iri
    ;
    	    	
graphRef
    : GRAPH iri
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
    : triplesBlock?  groupGraphPatternSubList*
    ;
    
groupGraphPatternSubList
    : graphPatternNotTriples DOT? triplesBlock?
    ;
    
triplesBlock
    : triplesSameSubjectPath (DOT triplesBlock?)?
    ;

graphPatternNotTriples
    : groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter | bind | inlineData
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
    	
inlineData
    : VALUES dataBlock
    ;

dataBlock
    : inlineDataOneVar | inlineDataFull
    ;

inlineDataOneVar
    : var OPEN_CURLY_BRACE dataBlockValue* CLOSE_CURLY_BRACE
    ;

inlineDataFull
    : OPEN_BRACE var* CLOSE_BRACE OPEN_CURLY_BRACE dataBlockValues* CLOSE_CURLY_BRACE
    ;

dataBlockValues
    : OPEN_BRACE dataBlockValue* CLOSE_BRACE
    ;

dataBlockValue
    : iri | rdfLiteral | numericLiteral | booleanLiteral | UNDEF
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
    : iri argList
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
 
propertyList
    : propertyListNotEmpty?
    ;

propertyListNotEmpty
    : verb objectList (SEMICOLON (verb objectList)?)* 
    ;

verb
    : varOrIRIref | A
    ;    

objectList
    : object (COMMA object)*
    ;

object
    : graphNode
    ;

triplesSameSubjectPath
    : varOrTerm propertyListPathNotEmpty | triplesNodePath propertyListPath
    ;
  
propertyListPath
    : propertyListPathNotEmpty?
    ;  

propertyListPathNotEmpty
    : (verbPath|verbSimple) objectListPath (SEMICOLON ((verbPath|verbSimple) objectList)?)*
    ;
    
verbPath
    : path
    ;
    
verbSimple
    : var
    ;
    	
objectListPath
    : objectPath (COMMA objectPath)*
    ;

objectPath
    : graphNodePath
    ;

path
    : pathAlternative
    ; 

pathAlternative
    : pathSequence (PIPE pathSequence)*
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
    : QUESTION_MARK | ASTERISK | PLUS 
    ;

pathPrimary
    : iri | A | NEGATION pathNegatedPropertySet | DISTINCT? OPEN_BRACE path CLOSE_BRACE
    ;

pathNegatedPropertySet
    : pathOneInPropertySet | OPEN_BRACE (pathOneInPropertySet (PIPE pathOneInPropertySet)*)? CLOSE_BRACE
    ;  	

pathOneInPropertySet
    : INVERSE? (iri | A)
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

triplesNodePath
    : collectionPath | blankNodePropertyListPath
    ;

blankNodePropertyListPath
    : OPEN_SQUARE_BRACKET propertyListPathNotEmpty CLOSE_SQUARE_BRACKET
    ;

collection
    : OPEN_BRACE graphNode+ CLOSE_BRACE
    ;

collectionPath
    : OPEN_BRACE graphNodePath+ CLOSE_BRACE
    ;
    
graphNode
    : varOrTerm | triplesNode
    ;

graphNodePath
    : varOrTerm | triplesNodePath
    ;

varOrTerm
    : var | graphTerm
    ;

varOrIRIref
    : var | iri
    ;

var
    : VAR1 | VAR2
    ;

graphTerm
    : iri | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil
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
    : brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var
    ;

brackettedExpression
    : OPEN_BRACE expression CLOSE_BRACE
    ;

builtInCall
    : aggregate
    | STR OPEN_BRACE expression CLOSE_BRACE
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
    | STRLEN OPEN_BRACE expression CLOSE_BRACE
    | strReplaceExpression
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
    | UUID nil
    | STRUUID nil
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
    : iri argList?
    ;

rdfLiteral
    : string (LANGTAG | (REFERENCE iri))?
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

iri
    : IRIREF | prefixedName
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

