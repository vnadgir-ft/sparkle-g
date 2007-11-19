/*
 * Copyright 2007 the original author or authors.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following
 * conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following
 * disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * Neither the name of the author or authors nor the names of its contributors may be used to endorse or promote
 * products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * @author Jürgen Pfundt
 * 
 * @version %I%, %G%, Jürgen Pfundt
 */

tree grammar SparqlT;

options {
    language=Java;
    tokenVocab=Sparql;
    ASTLabelType=Tree;
    output=template;
}

tokens {
   BASE;
   PREFIX;
   SELECT;
   DISTINCT;
   REDUCED;
   CONSTRUCT;
   DESCRIBE;
   ASK;
   FROM;
   NAMED;
   WHERE;
   ORDER;
   BY;
   ASC;
   DESC;
   LIMIT;
   OFFSET;
   OPTIONAL;
   GRAPH;
   UNION;
   FILTER;
   A;
   STR;
   LANG;
   LANGMATCHES;
   DATATYPE;
   BOUND;
   SAMETERM;
   ISIRI;
   ISURI;
   ISBLANK;
   ISLITERAL; 
   REGEX;
   TRUE;
   FALSE;
}

// $<Parser

query
    : prologue ( selectQuery | constructQuery | describeQuery | askQuery ) EOF
    ;

prologue
    : baseDecl? prefixDecl*
    ;

baseDecl
    : BASE IRI_REF
    ;

prefixDecl
    : PREFIX PNAME_NS IRI_REF
    ;

selectQuery
    : SELECT ( DISTINCT | REDUCED )? ( var+ | ASTERISK ) datasetClause* whereClause solutionModifier
    ;

constructQuery
    : CONSTRUCT constructTemplate datasetClause* whereClause solutionModifier
    ;

describeQuery
    : DESCRIBE ( varOrIRIref+ | ASTERISK ) datasetClause* whereClause? solutionModifier
    ;

askQuery
    : ASK datasetClause* whereClause
    ;

datasetClause
    : FROM ( defaultGraphClause | namedGraphClause )
    ;

defaultGraphClause
    : sourceSelector
    ;

namedGraphClause
    : NAMED sourceSelector
    ;

sourceSelector
    : iriRef
    ;

whereClause
    : WHERE? groupGraphPattern
    ;

solutionModifier
    : orderClause? limitOffsetClauses?
    ;

limitOffsetClauses
    : ( limitClause offsetClause? | offsetClause limitClause? )
    ;

orderClause
    : ORDER BY orderCondition+
    ;

orderCondition
    : ( ( ASC | DESC ) brackettedExpression )
    | ( constraint | var )
    ;

limitClause
    : LIMIT INTEGER
    ;

offsetClause
    : OFFSET INTEGER
    ;

groupGraphPattern
    : OPEN_CURLY_BRACE triplesBlock? ( ( graphPatternNotTriples | filter ) DOT? triplesBlock? )* CLOSE_CURLY_BRACE
    ;

triplesBlock
    : triplesSameSubject ( DOT triplesBlock? )?
    ;

graphPatternNotTriples
    : optionalGraphPattern | groupOrUnionGraphPattern | graphGraphPattern
    ;

optionalGraphPattern
    : OPTIONAL groupGraphPattern
    ;

graphGraphPattern
    : GRAPH varOrIRIref groupGraphPattern
    ;

groupOrUnionGraphPattern
    : groupGraphPattern ( UNION groupGraphPattern )*
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
    : ( OPEN_BRACE CLOSE_BRACE | OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE )
    ;

constructTemplate
    : OPEN_CURLY_BRACE constructTriples? CLOSE_CURLY_BRACE
    ;

constructTriples
    : triplesSameSubject ( DOT constructTriples? )?
    ;

triplesSameSubject
    : varOrTerm propertyListNotEmpty | triplesNode propertyList
    ;

propertyListNotEmpty
    : verb objectList ( SEMICOLON ( verb objectList )? )*
    ;

propertyList
    : propertyListNotEmpty?
    ;

objectList
    : object ( COMMA object )*
    ;

object
    : graphNode
    ;

verb
    : varOrIRIref
    | A
    ;

triplesNode
    : collection
    | blankNodePropertyList
    ;

blankNodePropertyList
    : OPEN_SQUARE_BRACE propertyListNotEmpty CLOSE_SQUARE_BRACE
    ;

collection
    : OPEN_BRACE graphNode+ CLOSE_BRACE
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
    : VAR1
    | VAR2
    ;

graphTerm
    : iriRef
    | rdfLiteral
    | numericLiteral
    | booleanLiteral
    | blankNode
    | OPEN_BRACE CLOSE_BRACE
    ;

expression
    : conditionalOrExpression
    ;

conditionalOrExpression
    : conditionalAndExpression ( OR conditionalAndExpression )*
    ;

conditionalAndExpression
    : valueLogical ( AND valueLogical )*
    ;

valueLogical
    : relationalExpression
    ;

relationalExpression
    : numericExpression ( EQUAL numericExpression | NOT_EQUAL numericExpression | LESS numericExpression | GREATER numericExpression | LESS_EQUAL numericExpression | GREATER_EQUAL numericExpression )?
    ;

numericExpression
    : additiveExpression
    ;

additiveExpression
    : multiplicativeExpression ( PLUS multiplicativeExpression | MINUS multiplicativeExpression | numericLiteralPositive | numericLiteralNegative )*
    ;

multiplicativeExpression
    : unaryExpression ( ASTERISK unaryExpression | DIVIDE unaryExpression )*
    ;

unaryExpression
    : NOT primaryExpression
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
    : STR OPEN_BRACE expression CLOSE_BRACE
    | LANG OPEN_BRACE expression CLOSE_BRACE
    | LANGMATCHES OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | DATATYPE OPEN_BRACE expression CLOSE_BRACE
    | BOUND OPEN_BRACE var CLOSE_BRACE
    | SAMETERM OPEN_BRACE expression COMMA expression CLOSE_BRACE
    | ISIRI OPEN_BRACE expression CLOSE_BRACE
    | ISURI OPEN_BRACE expression CLOSE_BRACE
    | ISBLANK OPEN_BRACE expression CLOSE_BRACE
    | ISLITERAL OPEN_BRACE expression CLOSE_BRACE
    | regexExpression
    ;

regexExpression
    : REGEX OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE
    ;

iriRefOrFunction
    : iriRef argList?
    ;

rdfLiteral
    : string ( LANGTAG | ( REFERENCE iriRef ) )?
    ;

numericLiteral
    : numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative
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
    | OPEN_SQUARE_BRACE CLOSE_SQUARE_BRACE
    ;

// $>

