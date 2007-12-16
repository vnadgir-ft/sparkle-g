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
 * @author Simone Tripodi   (simone.tripodi)
 * @author Michele Mostarda (michele.mostarda)
 * @author Juergen Pfundt   (Juergen.Pfundt)
 * 
 * Jürgen Pfundt, 02.12.2007 Resolved some recursions
 * Jürgen Pfundt, 02.12.2007 Added rewrite rules 
 * Jürgen Pfundt, 16.12.2007 Quite a lot of corrections and enhancements of rewrite rules
 *                           Started to adapt the output tree to deliver the rq24-algebra
 */

tree grammar SparqlT;

options {
    language=Java;
    tokenVocab=Sparql;
    ASTLabelType=CommonTree;
    output=template;
}

@header{
package org.sparql.x;
}

// $<Parser

query
    : prologue queryType
      { System.out.println("QUERY: \n"+$prologue.text + "\n" + $queryType.text); }
    ;

queryType
    : selectQuery
    | constructQuery
    | describeQuery
    | askQuery
    ;
    
prologue
    : ^(PROLOGUE baseDecl? prefixDecl*)
    ;

baseDecl
    : ^(BASE IRI_REF)
    ;

prefixDecl
    : ^(PREFIX PNAME_NS IRI_REF)
    ;

selectQuery
    : ^(SELECT variables datasetClause* whereClause solutionModifier)
    | ^(SELECT DISTINCT variables datasetClause* whereClause solutionModifier)
    | ^(SELECT REDUCED variables datasetClause* whereClause solutionModifier)
    ;

constructQuery
    : ^(CONSTRUCT constructTemplate datasetClause* whereClause solutionModifier)
    ;

describeQuery
    : ^(DESCRIBE varOrIRIrefs datasetClause* whereClause? solutionModifier)
    ;

askQuery
    : ^(ASK datasetClause* whereClause)
    ;

variables
    : ^(VARIABLES var+)
    | ^(VARIABLES ASTERISK)
    ;
    
varOrIRIrefs
    : ^(VARIABLES varOrIRIref+)
    | ^(VARIABLES ASTERISK)
    ;
    
datasetClause
    : ^(FROM iriRef)
    | ^(FROM NAMED iriRef)
    ;

whereClause
    : ^(WHERE groupGraphPattern)
    | groupGraphPattern
    ;

solutionModifier
    : orderClause? limitOffsetClauses?
    ;

limitOffsetClauses
    : limitClause offsetClause?
    | offsetClause limitClause?
    ;

orderClause
    : ^(ORDER BY orderCondition+)
    ;

orderCondition
    : ^(ASC brackettedExpression)
    | ^(DESC brackettedExpression)
    | constraint
    | var
    ;

limitClause
    : ^(LIMIT INTEGER)
    ;

offsetClause
    : ^(OFFSET INTEGER)
    ;

groupGraphPattern
    : ^(GROUP_GRAPH groupGraphPatternContent)
    ;

groupGraphPatternContent
    : triplesBlock? ( ( graphPatternNotTriples | filter ) DOT? triplesBlock? )*
    ;
    
triplesBlock
    : ^(BGP triplesSameSubject+)
    ;

graphPatternNotTriples
    : optionalGraphPattern
    | groupOrUnionGraphPattern 
    | graphGraphPattern
    ;

optionalGraphPattern
    : ^(OPTIONAL groupGraphPattern)
    ;

graphGraphPattern
    : ^(GRAPH var groupGraphPattern)
    | ^(GRAPH iriRef groupGraphPattern)
    ;

groupOrUnionGraphPattern
    : ^(UNION groupOrUnionGraphPattern groupOrUnionGraphPattern) 
    | groupGraphPattern
    ;

filter
    : ^(FILTER constraint)
    ;

constraint
    : brackettedExpression
    | builtInCall
    | functionCall
    ;

functionCall
    : ^(iriRef argList)
    ;

argList
    : ARGLIST
    | ^(ARGLIST expression+)
    ;

constructTemplate
    : ^(TRIPLES constructTriples)
    ;

constructTriples
    : triplesSameSubject+
    ;

triplesSameSubject
    : ^(SAME_SUBJECT propertyListNotEmpty)
    ;

propertyListNotEmpty
    : ^(PROPERTY_LIST objectList+)
    ;

objectList
    : SPO (varOrTerm verb object)+
    | SPO (triplesNode verb object)+
    ;

object
    : graphNode
    ;

verb
    : var
    | iriRef
    ;

triplesNode
    : collection
    | blankNodePropertyList
    ;

blankNodePropertyList
    : PROPERTY_LIST propertyListNotEmpty
    ;

collection
    : GRAPH_NODE (BLANK_NODE_LABEL IRI_REF graphNode BLANK_NODE_LABEL IRI_REF BLANK_NODE_LABEL)+ GRAPH_NODE
    ;

graphNode
    : varOrTerm 
    | triplesNode
    ;

varOrTerm
    : var
    | graphTerm
    ;

varOrIRIref
    : var 
    | iriRef
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
    : ^(OR conditionalOrExpression conditionalOrExpression)
    | conditionalAndExpression
    ;

conditionalAndExpression
    : ^(AND conditionalAndExpression conditionalAndExpression)
    | valueLogical
    ;

valueLogical
    : relationalExpression 
    ;

relationalExpression
    : ^(EQUAL relationalExpression relationalExpression)
    | ^(NOT_EQUAL relationalExpression relationalExpression)
    | ^(LESS relationalExpression relationalExpression)
    | ^(GREATER relationalExpression relationalExpression)
    | ^(LESS_EQUAL relationalExpression relationalExpression)
    | ^(GREATER_EQUAL relationalExpression relationalExpression)
    | numericExpression
    ;

numericExpression
    : additiveExpression
    ;

additiveExpression
    : ^(PLUS additiveExpression additiveExpression)
    | ^(MINUS additiveExpression additiveExpression)
    | ^(numericLiteralPositive additiveExpression)
    | ^(numericLiteralNegative additiveExpression)
    | numericLiteralPositive
    | numericLiteralNegative
    | multiplicativeExpression
    ;

multiplicativeExpression
    : ^(ASTERISK multiplicativeExpression multiplicativeExpression)
    | ^(DIVIDE multiplicativeExpression multiplicativeExpression )
    | unaryExpression
    ;

unaryExpression
    : ^(NOT primaryExpression)
    | ^(PLUS primaryExpression)
    | ^(MINUS primaryExpression)
    | ^(PRIMARY primaryExpression)
    ;

primaryExpression
    : brackettedExpression 
    | builtInCall 
    | iriRefOrFunction 
    | rdfLiteral 
    | numericLiteral 
    | booleanLiteral 
    | var
    ;

brackettedExpression
    : ^(BRACKETTED_EXPRESSION expression)
    ;

builtInCall
    : ^(STR expression)
    | ^(LANG expression)
    | ^(LANGMATCHES expression+)
    | ^(DATATYPE expression)
    | ^(BOUND var)
    | ^(SAMETERM expression+)
    | ^(ISIRI expression)
    | ^(ISURI expression)
    | ^(ISBLANK expression)
    | ^(ISLITERAL expression)
    | regexExpression
    ;

regexExpression
    : ^(REGEX expression+)
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
    | OPEN_SQUARE_BRACE CLOSE_SQUARE_BRACE
    ;

// $>

