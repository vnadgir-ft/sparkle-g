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
 * Jürgen Pfundt, 19.12.2007 Added template output with JSON target in mind
 * Jürgen Pfundt, 29.12.2007 Some enhancements mainly related to blank nodes and collections.
 *                           Collections and blank nodes still not finished.
 */

tree grammar SparqlT;

options {
    language=Java;
    tokenVocab=Sparql;
    ASTLabelType=CommonTree;
    output=template;
/*    k=1;
    backtrack=true; */
}

@header{
package org.sparql.x;

import java.io.*;
}

// $<Parser

query
@after{
System.out.println("QUERY: \n"+$p.text + "\n" + $q.text);
}
    : p=prologue q=queryType -> query(prologue={$p.st}, queryType={$q.st})
    ;

queryType
    : selectQuery -> queryType(query={$selectQuery.st})
    | constructQuery -> queryType(query={$constructQuery.st}) 
    | describeQuery -> queryType(query={$describeQuery.st})
    | askQuery -> queryType(query={$askQuery.st})
    ;
    
prologue
    : ^(PROLOGUE b=baseDecl? (p+=prefixDecl)*) -> prologue(baseDecl={$b.st}, prefixDecl={$p})
    ;

baseDecl
    : ^(BASE IRI_REF) -> baseDecl(iriref={$IRI_REF.text})
    ;

prefixDecl
    : ^(PREFIX PNAME_NS IRI_REF)-> prefixDecl(pname={$PNAME_NS.text}, iriref={$IRI_REF.text})
    ;

selectQuery
    : ^(SELECT v=variables (d+=datasetClause)* w=whereClause s=solutionModifier)
      -> selectQuery(variables={$v.st}, datasetClause={$d}, whereClause={$w.st}, solutionModifier={$s.st})
    | ^(SELECT DISTINCT v=variables (d+=datasetClause)* w=whereClause s=solutionModifier)
      -> selectDistinctQuery(variables={$v.st}, datasetClause={$d}, whereClause={$w.st}, solutionModifier={$s.st})
    | ^(SELECT REDUCED v=variables (d+=datasetClause)* w=whereClause s=solutionModifier)
      -> selectReducedQuery(variables={$v.st}, datasetClause={$d}, whereClause={$w.st}, solutionModifier={$s.st})
    ;

constructQuery
    : ^(CONSTRUCT c=constructTemplate (d+=datasetClause)* w=whereClause s=solutionModifier)
      -> constructQuery(constructTemplate={$c.st}, datasetClause={$d}, whereClause={$w.st}, solutionModifier={$s.st})
    ;

describeQuery
    : ^(DESCRIBE v=varOrIRIrefs (d+=datasetClause)* w=whereClause? s=solutionModifier)
      -> describeQuery(varOrIRIrefs={$v.st}, datasetClause={$d}, whereClause={$w.st}, solutionModifier={$s.st})
    ;

askQuery
    : ^(ASK (d+=datasetClause)* w=whereClause)
      -> askQuery(datasetClause={$d}, whereClause={$w.st})
    ;

variables
    : ^(VARIABLES (v+=var)+) -> variables(var={$v})
    | ^(VARIABLES ASTERISK) -> variables(var={$ASTERISK.text})
    ;
    
varOrIRIrefs
    : ^(VARIABLES (v+=varOrIRIref)+) -> varOrIRIrefs(varOrIRIref={$v})
    | ^(VARIABLES ASTERISK) -> varOrIRIrefs(varOrIRIref={$ASTERISK.text})
    ;
    
datasetClause
    : ^(FROM i=iriRef) -> defaultDatasetClause(graph={$i.st})
    | ^(FROM NAMED i=iriRef) -> namedDatasetClause(graph={$i.st})
    ;

whereClause
    : ^(WHERE g=groupGraphPattern) -> whereClause(groupGraphPattern={$g.st})
    | g=groupGraphPattern -> whereClause(groupGraphPattern={$g.st})
    ;

solutionModifier
    : orderClause? limitOffsetClauses?
      -> solutionModifier(orderClause={$orderClause.st}, limitOffsetClause={$limitOffsetClauses.st})
    ;

limitOffsetClauses
    : l=limitClause o=offsetClause? -> limitOffsetClause(limitClause={$l.st}, offsetClause={$o.st})
    | o=offsetClause l=limitClause? -> limitOffsetClause(limitClause={$l.st}, offsetClause={$o.st})
    ;

orderClause
    : ^(ORDER BY (o+=orderCondition)+) -> orderClause(orderCondition={$o})
    ;

orderCondition
    : ^(ASC b=brackettedExpression) -> orderConditionAscending(constraint={$b.st})
    | ^(DESC b=brackettedExpression) -> orderConditionDescending(constraint={$b.st})
    | constraint -> orderCondition(constraint={$constraint.st})
    | var -> orderCondition(constraint={$var.st})
    ;

limitClause
    : ^(LIMIT INTEGER) -> limitClause(integer={$INTEGER.text})
    ;

offsetClause
    : ^(OFFSET INTEGER) -> offsetClause(integer={$INTEGER.text})
    ;

groupGraphPattern
    : ^(GROUP_GRAPH groupGraphPatternContent) -> groupGraphPattern(groupGraphPatternContent={$groupGraphPatternContent.st})
    ;

groupGraphPatternContent
    : lt=triplesBlock? (g+=groupGraphPatternSequence)* 
      -> groupGraphPatternContent(leadingTriples={$lt.st}, groupGraphPatternSequence={$g})
    ;
    
groupGraphPatternSequence
    : g=groupGraphPatternAlternation DOT? t=triplesBlock?
      -> groupGraphPatternSequence(groupGraphPatternAlternation={$g.st}, triplesBlock={$t.st})
    ;

groupGraphPatternAlternation
    : graphPatternNotTriples -> groupGraphPatternAlternation(type={$graphPatternNotTriples.st})
    | filter -> groupGraphPatternAlternation(type={$filter.st})
    ;
    
triplesBlock
    : ^(BGP (t+=triplesSameSubject)+) -> triplesBlock(triplesSameSubject={$t})
    ;

graphPatternNotTriples
    : optionalGraphPattern -> graphPatternNotTriples(graph={$optionalGraphPattern.st})
    | groupOrUnionGraphPattern -> graphPatternNotTriples(graph={$groupOrUnionGraphPattern.st})
    | graphGraphPattern -> graphPatternNotTriples(graph={$graphGraphPattern.st})
    ;

optionalGraphPattern
    : ^(OPTIONAL groupGraphPattern) -> optionalGraphPattern(optionalGraphPattern={$groupGraphPattern.st})
    ;

graphGraphPattern
    : ^(GRAPH v=var g=groupGraphPattern) -> graphGraphPattern(var={$v.st}, groupGraphPattern={$g.st} )
    | ^(GRAPH i=iriRef g=groupGraphPattern) -> graphGraphPattern(var={$i.st}, groupGraphPattern={$g.st} )
    ;

groupOrUnionGraphPattern
    : ^(UNION g1=groupOrUnionGraphPattern g2=groupOrUnionGraphPattern) 
      -> groupOrUnionGraphPattern(groupOrUnionGraphPattern1={$g1.st}, groupOrUnionGraphPattern2={$g2.st})
    | g=groupGraphPattern -> groupGraphPattern(groupGraphPatternContent={$g.st}) 
    ;

filter
    : ^(FILTER constraint) -> filter(constraint={$constraint.st})
    ;

constraint
    : brackettedExpression -> constraint(type={$brackettedExpression.st})
    | builtInCall -> constraint(type={$builtInCall.st})
    | functionCall -> constraint(type={$functionCall.st})
    ;

functionCall
    : ^(iriRef argList) -> functionCall(iriRef={$iriRef.st}, argList={$argList.st})
    ;

argList
    : ARGLIST -> argList()
    | ^(ARGLIST (e+=expression)+) -> argList(expression={$e})
    ;

constructTemplate
    : ^(TRIPLES constructTriples) -> constructTemplate(constructTriples={$constructTriples.st})
    ;

constructTriples
    : (t+=triplesSameSubject)+ -> constructTriples(triples={$t})
    ;

triplesSameSubject
    : ^(SAME_SUBJECT propertyListNotEmpty) -> triplesSameSubject(propertyListNotEmpty={$propertyListNotEmpty.st})
    ;

propertyListNotEmpty
    : ^(PROPERTY_LIST (o+=objectList)+) -> propertyListNotEmpty(objectList={$o})
    ;

objectList
    : SPO (o+=object)+ -> objectList(sentence={$o})
;

object
    : graphNode -> object(graphNode={$graphNode.st})
    ;

verb
    : var -> verb(var={$var.st})
    | iriRef -> verb(var={$iriRef.st})
    ;

triplesNode
    : collection -> triplesNode(node={$collection.st})
    | blankNodePropertyList -> triplesNode(node={$blankNodePropertyList.st})
    ;

blankNodePropertyList
    : ^(BLANK_PROPERTY_LIST propertyListNotEmpty BLANK_NODE_LABEL) -> blankNodePropertyList(propertyListNotEmpty={$propertyListNotEmpty.st},s={$BLANK_NODE_LABEL.text})
    ;

collection
    : GRAPH_NODE (c+=collectionElement)+ GRAPH_NODE -> collection(collectionElement={$c})
    ;

collectionElement
    : b1=BLANK_NODE_LABEL i1=IRI_REF g=graphNode b2=BLANK_NODE_LABEL i2=IRI_REF b3=BLANK_NODE_LABEL
    -> collectionElement(b1={$b1.text}, i1={$i1.text}, g={$g.st}, b2={$b2.text}, i2={$i2.text}, b3={$b3.text}) 
    ;

graphNode
    : varOrTerm -> graphNode(node={$varOrTerm.st})
    | triplesNode -> graphNode(node={$triplesNode.st})
    ;

varOrTerm
    : var -> varOrTerm(var={$var.st})
    | graphTerm -> varOrTerm(var={$graphTerm.st})
    ;

varOrIRIref
    : var -> varOrIRIref(var={$var.st})
    | iriRef ->  varOrIRIref(var={$iriRef.st})
    ;

var
    : VAR1 -> var(v={$VAR1.text})
    | VAR2 -> var(v={$VAR2.text})
    ;

graphTerm
    : i=iriRef -> graphTerm(value={$i.st})
    | r=rdfLiteral -> graphTerm(value={$r.st})
    | n=numericLiteral -> graphTerm(value={$n.st})
    | b=booleanLiteral -> graphTerm(value={$b.st})
    | bn=blankNode -> graphTerm(value={$bn.st})
    | OPEN_BRACE CLOSE_BRACE -> graphTerm(value={"()"})
    ;

expression
    : conditionalOrExpression -> expression(conditionalOrExpression={$conditionalOrExpression.st})
    ;

conditionalOrExpression
    : ^(OR c1=conditionalOrExpression c2=conditionalOrExpression)
      -> conditionalOrExpression (conditionalOrExpression1={$c1.st}, conditionalOrExpression2={$c2.st})
    | c=conditionalAndExpression
      -> conditionalOrExpression (conditionalOrExpression1={$c.st})
    ;

conditionalAndExpression
    : ^(AND c1=conditionalAndExpression c2=conditionalAndExpression)
      -> conditionalAndExpression (conditionalAndExpression1={$c1.st}, conditionalAndExpression2={$c2.st})
    | valueLogical
      -> conditionalAndExpression (conditionalAndExpression1={$valueLogical.st})
    ;

valueLogical
    : relationalExpression -> valueLogical(relationalExpression={$relationalExpression.st})
    ;

relationalExpression
    : ^(EQUAL r1=relationalExpression r2=relationalExpression)
      -> relationalExpression (type={$EQUAL.text}, relationalExpression1={$r1.st}, relationalExpression2={$r2.st})
    | ^(NOT_EQUAL r1=relationalExpression r2=relationalExpression)
      -> relationalExpression (type={$NOT_EQUAL.text}, relationalExpression1={$r1.st}, relationalExpression2={$r2.st})
    | ^(LESS r1=relationalExpression r2=relationalExpression)
      -> relationalExpression (type={$LESS.text}, relationalExpression1={$r1.st}, relationalExpression2={$r2.st})
    | ^(GREATER r1=relationalExpression r2=relationalExpression)
      -> relationalExpression (type={$GREATER.text}, relationalExpression1={$r1.st}, relationalExpression2={$r2.st})
    | ^(LESS_EQUAL r1=relationalExpression r2=relationalExpression)
      -> relationalExpression (type={$LESS_EQUAL.text}, relationalExpression1={$r1.st}, relationalExpression2={$r2.st})
    | ^(GREATER_EQUAL r1=relationalExpression r2=relationalExpression)
      -> relationalExpression (type={$GREATER_EQUAL.text}, relationalExpression1={$r1.st}, relationalExpression2={$r2.st})
    | ne=numericExpression
      -> relationalExpression (relationalExpression1={$ne.st})
    ;

numericExpression
    : additiveExpression -> numericExpression(additiveExpression={$additiveExpression.st})
    ;

additiveExpression
    : ^(PLUS a1=additiveExpression a2=additiveExpression)
      -> additiveExpression(type={$PLUS.text}, additiveExpression1={a1.st}, additiveExpression2={a2.st})
    | ^(MINUS a1=additiveExpression a2=additiveExpression)
      -> additiveExpression(type={$MINUS.text}, additiveExpression1={a1.st}, additiveExpression2={a2.st})
    | ^(np=numericLiteralPositive a2=additiveExpression)
      -> additiveExpression(additiveExpression1={np.st}, additiveExpression2={a2.st})
    | ^(nn=numericLiteralNegative a2=additiveExpression)
      -> additiveExpression(additiveExpression1={nn.st}, additiveExpression2={a2.st})
    | np=numericLiteralPositive
      -> additiveExpression(additiveExpression1={np.st})
    | nn=numericLiteralNegative
      -> additiveExpression(additiveExpression1={nn.st})
    | m=multiplicativeExpression
      -> additiveExpression(additiveExpression1={m.st})
    ;

multiplicativeExpression
    : ^(ASTERISK m1=multiplicativeExpression m2=multiplicativeExpression)
      -> multiplicativeExpression(multiplicativeExpression1={$m1.st}, multiplicativeExpression2={$m2.st})
    | ^(DIVIDE m1=multiplicativeExpression m2=multiplicativeExpression )
      -> multiplicativeExpression(multiplicativeExpression1={$m1.st}, multiplicativeExpression2={$m2.st})
    | u=unaryExpression -> multiplicativeExpression(multiplicativeExpression1={$u.st})
    ;

unaryExpression
    : ^(NOT p=primaryExpression) -> unaryExpression(operand={$NOT.text}, primaryExpression={$p.st})
    | ^(PLUS p=primaryExpression) -> unaryExpression(operand={$PLUS.text}, primaryExpression={$p.st})
    | ^(MINUS p=primaryExpression) -> unaryExpression(operand={$MINUS.text}, primaryExpression={$p.st})
    | ^(PRIMARY p=primaryExpression) -> unaryExpression(primaryExpression={$p.st})
    ;

primaryExpression
    : brackettedExpression -> primaryExpression(value={$brackettedExpression.st})
    | builtInCall -> primaryExpression(value={$builtInCall.st})
    | iriRefOrFunction -> primaryExpression(value={$iriRefOrFunction.st})
    | rdfLiteral -> primaryExpression(value={$rdfLiteral.st})
    | numericLiteral -> primaryExpression(value={$numericLiteral.st})
    | booleanLiteral -> primaryExpression(value={$booleanLiteral.st})
    | var -> primaryExpression(value={$var.st})
    ;

brackettedExpression
    : ^(BRACKETTED_EXPRESSION e=expression) -> brackettedExpression(expression={$e.st})
    ;

builtInCall
    : ^(STR e=expression) -> builtInCall(type={$STR.text}, expression={$e.st})
    | ^(LANG e=expression) -> builtInCall(type={$LANG.text}, expression={$e.st})
    | ^(LANGMATCHES (ex+=expression)+) -> builtInCall(type={$LANGMATCHES.text}, expression={$ex})
    | ^(DATATYPE e=expression) -> builtInCall(type={$DATATYPE.text}, expression={$e.st})
    | ^(BOUND v=var) -> builtInCall(type={$BOUND.text}, expression={$v.st})
    | ^(SAMETERM (ex+=expression)+) -> builtInCall(type={$SAMETERM.text}, expression={$ex})
    | ^(ISIRI e=expression) -> builtInCall(type={$ISIRI.text}, expression={$e.st})
    | ^(ISURI e=expression) -> builtInCall(type={$ISURI.text}, expression={$e.st})
    | ^(ISBLANK e=expression) -> builtInCall(type={$ISBLANK.text}, expression={$e.st})
    | ^(ISLITERAL e=expression) -> builtInCall(type={$ISLITERAL.text}, expression={$e.st})
    | r=regexExpression -> builtInCall(expression={$r.st})
    ;

regexExpression
    : ^(REGEX (e+=expression)+) -> regexExpression(expression={$e})
    ;

iriRefOrFunction
    : iriRef argList? -> iriRefOrFunction(iriRef={$iriRef.st}, argList={$argList.st})
    ;

rdfLiteral
    : string langTagOrReference? -> rdfLiteral(string={$string.st}, langTagOrReference={$langTagOrReference.st})
    ;

langTagOrReference
    : LANGTAG -> langTagOrReference(value={$LANGTAG.text})
    | REFERENCE iriRef -> langTagOrReference(value={$iriRef.st})
    ;
    
numericLiteral
    : numericLiteralUnsigned -> numericLiteral(value={$numericLiteralUnsigned.st})
    | numericLiteralPositive -> numericLiteral(value={$numericLiteralPositive.st})
    | numericLiteralNegative -> numericLiteral(value={$numericLiteralNegative.st})
    ;

numericLiteralUnsigned
    : INTEGER -> numericLiteralUnsigned(value={$INTEGER.text})
    | DECIMAL -> numericLiteralUnsigned(value={$DECIMAL.text})
    | DOUBLE -> numericLiteralUnsigned(value={$DOUBLE.text})
    ;

numericLiteralPositive
    : INTEGER_POSITIVE -> numericLiteralPositive(value={$INTEGER_POSITIVE.text})
    | DECIMAL_POSITIVE -> numericLiteralPositive(value={$DECIMAL_POSITIVE.text})
    | DOUBLE_POSITIVE -> numericLiteralPositive(value={$DOUBLE_POSITIVE.text})
    ;

numericLiteralNegative
    : INTEGER_NEGATIVE -> numericLiteralNegative(value={$INTEGER_NEGATIVE.text})
    | DECIMAL_NEGATIVE -> numericLiteralNegative(value={$DECIMAL_NEGATIVE.text})
    | DOUBLE_NEGATIVE -> numericLiteralNegative(value={$DOUBLE_NEGATIVE.text})
    ;

booleanLiteral
    : TRUE -> booleanLiteral(value={$TRUE.text})
    | FALSE -> booleanLiteral(value={$FALSE.text})
    ;

string
    : STRING_LITERAL1 -> string(value={$STRING_LITERAL1.text})
    | STRING_LITERAL2 -> string(value={$STRING_LITERAL2.text})
    | STRING_LITERAL_LONG1 -> string(value={$STRING_LITERAL_LONG1.text})
    | STRING_LITERAL_LONG2 -> string(value={$STRING_LITERAL_LONG2.text})
    ;

iriRef
    : IRI_REF -> iriRef(value={$IRI_REF.text})
    | prefixedName -> iriRef(value={$prefixedName.st})
    ;

prefixedName
    : PNAME_LN -> prefixedName(value={$PNAME_LN.text})
    | PNAME_NS -> prefixedName(value={$PNAME_NS.text})
    ;

blankNode
    : BLANK_NODE_LABEL -> blankNode(value={$BLANK_NODE_LABEL.text})
    | OPEN_SQUARE_BRACE CLOSE_SQUARE_BRACE -> blankNode(value={"[]"})
    ;

// $>

