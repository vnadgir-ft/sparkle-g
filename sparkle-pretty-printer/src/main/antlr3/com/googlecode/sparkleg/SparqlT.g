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
 * @version $Id: Sparql.g 161 2011-05-23 22:14:39Z Juergen.Pfundt@web.de $
 */
tree grammar SparqlT;

options {
tokenVocab=Sparql; // reuse token types
ASTLabelType=CommonTree; // $label will have type CommonTree
output=template; //template;
}

@header {
    package com.googlecode.sparkleg;
}

// $<Parser

query
    : ^(QUERY p=prologue s=selectQuery? c=constructQuery? d=describeQuery? a=askQuery?) b=bindingsClause? -> query(prologue={$p.st}, selectQuery={$s.st}, constructQuery={$c.st}, describeQuery={$d.st}, askQuery={$a.st}, bindingsClause={$b.st})
    | ^(UPDATE (u+=update)+) -> updateQuery(update={$u})
    ;

prologue
    : ^(PROLOGUE (b+=baseDecl)* (p+=prefixDecl)*) -> prologue(baseDecl={$b}, prefixDecl={$p})
    ;

baseDecl
    : ^(BASE IRI_REF) -> baseDecl(iriRef={$IRI_REF.text})
    ;

prefixDecl
    : ^(PREFIX PNAME_NS IRI_REF) -> prefixDecl(pname={$PNAME_NS.text}, iriRef={$IRI_REF.text})
    ;

selectQuery
    : ^(SELECT s=selectClause (d+=datasetClause)* (w+=whereClause)* m=solutionModifier) -> selectQuery(selectClause={$s.st}, datasetClause={$d}, whereClause={$w}, solutionModifier={$m.st} )
    ;

subSelect
    : ^(SUBSELECT (w+=whereClause)* s=solutionModifier) -> subSelect(whereClause={$w}, solutionModifier={$s.st})
    ;
    	
selectClause
    : ^(SELECT_CLAUSE ASTERISK) -> selectClause(asterisk={$ASTERISK.text})
    | ^(SELECT_CLAUSE DISTINCT ASTERISK) -> selectClause(attribute={$DISTINCT.text}, asterisk={$ASTERISK.text})
    | ^(SELECT_CLAUSE REDUCED ASTERISK) -> selectClause(attribute={$REDUCED.text}, asterisk={$ASTERISK.text})
    | ^(SELECT_CLAUSE (v+=selectVariables)*) -> selectClause(selectVariables={$v})
    | ^(SELECT_CLAUSE DISTINCT (v+=selectVariables)*) -> selectClause(attribute={$DISTINCT.text}, selectVariables={$v})
    | ^(SELECT_CLAUSE REDUCED (v+=selectVariables)*) -> selectClause(attribute={$REDUCED.text}, selectVariables={$v})
    ;

selectVariables
    : ^(VAR v=var) -> selectVariables(var={$v.st})
    | ^(AS e=expression v=var) -> selectVariables(expression={$e.st}, var={$v.st}) 
    ;
  
constructQuery
    : ^(CONSTRUCT (c=constructTemplate)? (d+=datasetClause)* (w=whereClause)? s=solutionModifier) -> constructQuery(constructTemplate={$c.st}, datasetClause={$d}, whereClause={$w.st}, solutionModifier={$s.st})
    | ^(CONSTRUCT (d+=datasetClause)* ^(WHERE (t+=triplesTemplate)*) solutionModifier) -> constructQuery(datasetClause={$d}, triplesTemplate={$t}, solutionModifier={$s.st})
    ;

describeQuery
    : ^(DESCRIBE (v+=varOrIRIref)* ASTERISK* (d+=datasetClause)* (w=whereClause)? s=solutionModifier) -> describeQuery(varOrIRIref={$v}, attribute={$ASTERISK.text}, datasetClause={$d}, whereClause={$w.st}, solutionModifier={$s.st})
    ;

askQuery
    : ^(ASK (d+=datasetClause)* w=whereClause) -> askQuery(datasetClause={$d}, whereClause={$w.st})
    ;

datasetClause
    : ^(FROM NAMED? i=iriRef) -> datasetClause(attribute={$NAMED.text}, iriRef={$i.st})
    ;

whereClause
    : ^(WHERE_CLAUSE (g=groupGraphPattern)?) -> whereClause(groupGraphPattern={$g.st})
    ;
    
solutionModifier
    : (g=groupClause)? (h=havingClause)? (o=orderClause)? (l=limitOffsetClauses)? -> solutionModifier(groupClause={$g.st}, havingClause={$h.st}, orderClause={$o.st}, limitOffsetClauses={$l.st} )
    ;

groupClause
    : ^(GROUP_BY (g+=groupCondition)+) -> groupClause(groupCondition={$g})
    ;
    		 
groupCondition
    : b=builtInCall -> groupCondition(builtInCall={$b.st})
    | f=functionCall -> groupCondition(functionCall={$f.st})
    | ^(AS e=expression (v+=var)*) -> groupCondition(expression={$e.st}, var={$v})
    | var -> groupCondition(var={$var.st})
    ;

havingClause
    : ^(HAVING (c+=constraint)+) -> havingClause(constraint={$c})	
    ;
    
orderClause
    : ^(ORDER_BY (o+=orderCondition)+) -> orderClause(orderCondition={$o})
    ;

orderCondition
    : ^(ORDER_CONDITION ASC e=expression) -> orderCondition(attribute={$ASC.text}, expression={$e.st})
    | ^(ORDER_CONDITION DESC e=expression) -> orderCondition(attribute={$DESC.text}, expression={$e.st})
    | ^(ORDER_CONDITION c=constraint) -> orderCondition(constraint={$c.st})
    | ^(ORDER_CONDITION v=var) -> orderCondition(var={$v.st})
    ;
	    
limitOffsetClauses
    : ^(LIMIT l=INTEGER) (^(OFFSET o=INTEGER))* -> limitOffsetClauses(limit={$l.text}, offset={$o.text})
    | ^(OFFSET o=INTEGER) (^(LIMIT l=INTEGER))* -> limitOffsetClauses(limit={$l.text}, offset={$o.text})
    ;

bindingsClause
    : ^(BINDINGS (v+=var)* (b+=bindingValueList)*) -> bindingsClause(var={$v}, bindingValueList={$b})
    ;
    
bindingValueList
    : ^(BINDING_VALUE (b+=bindingValue)*) -> bindingValueList(bindingValue={$b})
    ;
    	
bindingValue
    : i=iriRef -> bindingValue(iriRef={$i.st})
    | r=rdfLiteral -> bindingValue(rdfLiteral={$r.st}) 
    | n=numericLiteral -> bindingValue(numericLiteral={$n.st})  
    | b=booleanLiteral -> bindingValue(booleanLiteral={$b.st})  
    | UNDEF -> bindingValue(value={$UNDEF.text}) 
    ;
    
update
    : p=prologue l=load* c=clear* d=drop* a=add* m=move* cp=copy* cr=create* i=insert* del=delete* md=modify* -> update(prologue={$p.st}, load={$l.st}, clear={$c.st}, drop={$d.st}, add={$a.st}, move={$m.st}, copy={$cp.st}, create={$cr.st}, insert={$i.st}, delete={$del.st}, modify={$md.st})
    ;   
    
load 	  
    : ^(LOAD SILENT* i=iriRef (g=graphRef)?) -> load(attribute={$SILENT.text}, iriRef={$i.st}, graphRef={$g.st})
    ;
    
clear
    : ^(CLEAR SILENT* g=graphRefAll) -> clear(attribute={$SILENT.text}, graphRef={$g.st})
    ;
    
drop
    : ^(DROP SILENT* g=graphRefAll) -> drop(attribute={$SILENT.text}, graphRef={$g.st})
    ; 

create
    : ^(CREATE SILENT* g=graphRef) -> create(attribute={$SILENT.text}, graphRef={$g.st})
    ;
    
add
    : ^(ADD SILENT* g1=graphOrDefault g2=graphOrDefault) -> add(attribute={$SILENT.text}, graphOrDefault1={$g1.st}, graphOrDefault2={$g2.st})
    ;
    
move
    : ^(MOVE SILENT* g1=graphOrDefault g2=graphOrDefault) -> move(attribute={$SILENT.text}, graphOrDefault1={$g1.st}, graphOrDefault2={$g2.st})
    ;
    
copy
    : ^(COPY SILENT* g1=graphOrDefault g2=graphOrDefault) -> copy(attribute={$SILENT.text}, graphOrDefault1={$g1.st}, graphOrDefault2={$g2.st})
    ;

insert
    : ^(INSERT DATA q=quadPattern) -> insert(quadPattern={$q.st})
    ;
   
delete 	  
    : DELETE (d=deleteData | w=deleteWhere) -> delete(deleteData={$d.st}, deleteWhere={$w.st})
    ;

deleteData
    : ^(DELETE DATA q=quadPattern) -> deleteData(quadPattern={$q.st})
    ;

deleteWhere
    : ^(DELETE WHERE q=quadPattern) -> deleteWhere(quadPattern={$q.st})
    ;
    
modify
    : ^(MODIFY ^(WITH iriRef) deleteClause* insertClause* usingClause* ^(WHERE groupGraphPattern))
    | ^(MODIFY deleteClause* insertClause* usingClause* ^(WHERE groupGraphPattern))
    ;
  
deleteClause
    : DELETE q=quadPattern -> deleteClause(quadPattern={$q.st})
    ;
      
insertClause
    : INSERT q=quadPattern -> insertClause(quadPattern={$q.st})
    ;

usingClause
    : ^(USING NAMED? i=iriRef) -> usingClause(attribute1={$USING.text}, attribute2={$NAMED.text}, iriRef={$i.st})
    ;

graphOrDefault	  
    : DEFAULT -> graphOrDefault(attribute={$DEFAULT.text})
    | GRAPH? i=iriRef -> graphOrDefault(iriRef={$i.st})
    ;
    	    	
graphRef
    : GRAPH i=iriRef -> graphRef(iriRef={$i.st})
    ;

graphRefAll
    : g=graphRef -> graphRefAll(graphRef={$g.st})
    | DEFAULT -> graphRefAll(attribute={$DEFAULT.text})
    | NAMED -> graphRefAll(attribute={$NAMED.text})
    | ALL -> graphRefAll(attribute={$ALL.text})
    ;

quadPattern
    : quads -> quadPattern()
    ;
    
quads
    : (t1=triplesTemplate)? (q+=quadsNotTriples (t2+=triplesTemplate)?)* -> quads(triplesTemplate1={$t1.st}, quadsNotTriples={$q}, triplesTemplate2={$t2})
    ;
    
quadsNotTriples
    : ^(GRAPH v=varOrIRIref (t=triplesTemplate)?) -> quadsNotTriples(varOrIRIref={$v.st}, triplesTemplate={$t.st})
    ;
    
triplesTemplate
    : ^(TRIPLES_TEMPLATE (t+=triplesSameSubject)*) -> triplesTemplate(triplesSameSubject={$t})
    ;
    	
groupGraphPattern
    : ^(GROUP_GRAPH_PATTERN g=groupGraphPatternSub) -> groupGraphPattern(groupGraphPatternSub={$g.st})
    | ^(GROUP_GRAPH_PATTERN s=subSelect) -> groupGraphPattern(subselect={$s.st})
    | ^(GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN) -> groupGraphPattern(attribute={"{ }"})
    ;

groupGraphPatternSub
    : triplesBlock (graphPatternNotTriples triplesBlock?)*
    | (graphPatternNotTriples triplesBlock?)+ 
    ;
    
groupGraphPatternSubCache
    :  g=graphPatternNotTriples (t=triplesBlock)? -> groupGraphPatternSubCache(graphPatternNotTriples={$g.st}, triplesBlock={$t.st})
    ;

triplesBlock
    : (t+=triplesSameSubjectPath)+ -> triplesBlock(triplesSameSubjectPath={$t})
    ;

graphPatternNotTriples
    : u=groupOrUnionGraphPattern -> graphPatternNotTriples(groupOrUnionGraphPattern={$u.st})
    | o=optionalGraphPattern -> graphPatternNotTriples(optionalGraphPattern={$o.st})
    | m=minusGraphPattern -> graphPatternNotTriples(minusGraphPattern={$m.st}) 
    | g=graphGraphPattern -> graphPatternNotTriples(graphGraphPattern={$g.st}) 
    | s=serviceGraphPattern -> graphPatternNotTriples(serviceGraphPattern={$s.st}) 
    | f=filter -> graphPatternNotTriples(filter={$f.st}) 
    | b=bind -> graphPatternNotTriples(bind={$b.st})
    ;

optionalGraphPattern
    : ^(OPTIONAL o=groupGraphPattern) -> optionalGraphPattern(groupGraphPattern={$o.st})
    ;

graphGraphPattern
    : ^(GRAPH v=varOrIRIref g=groupGraphPattern) -> graphGraphPattern(varOrIRIref={$v.st}, groupGraphPattern={$g.st})
    ;

serviceGraphPattern
    : ^(SERVICE (s=SILENT)? v=varOrIRIref g=groupGraphPattern)-> serviceGraphPattern(attribute={$s.text}, varOrIRIref={$v.st}, groupGraphPattern={$g.st})
    ;
    
bind
    : ^(BIND e=expression ^(AS v=var)) -> bind(expression={$e.st}, var={$v.st})	
    ;
    	
minusGraphPattern
    : ^(MINUS_KEYWORD g=groupGraphPattern) -> minusGraphPattern(groupGraphPattern={$g.st})
    ;

groupOrUnionGraphPattern
    : ^(UNION g1=groupGraphPattern g2=groupGraphPattern) -> groupOrUnionGraphPattern(groupGraphPattern1={$g1.st}, groupGraphPattern2={$g2.st})
    | g1=groupGraphPattern -> groupOrUnionGraphPattern(groupGraphPattern1={$g1.st})
    ;

filter
    : ^(FILTER c=constraint) -> filter(constraint={$c.st})
    ;

constraint
    : e=expression -> constraint(expression={$e.st})
    | b=builtInCall -> constraint(expression={$b.st})
    | f=functionCall -> constraint(expression={$f.st})
    ;

functionCall
    : ^(FUNCTION i=iriRef ^(ARG_LIST a=argList)) -> functionCall(iriRef={$i.st}, argList={$a.st})
    ;

argList
    : n=nil -> argList(nil={$n.st})
    | DISTINCT? (e+=expression)* -> argList(attribute={$DISTINCT.text}, expression={$e})
    ;

expressionList
    : ^(EXPRESSION_LIST (e+=expression)+) -> expressionList(expression={$e})
    | ^(EXPRESSION_LIST n=nil) -> expressionList(nil={$n.st}) 
    ;	

constructTemplate
    : ^(CONSTRUCT_TRIPLES (c=constructTriples)?) -> constructTemplate(constructTriples={$c.st})
    ;

constructTriples
    : (t+=triplesSameSubject)+ -> constructTriples(triplesSameSubject={$t})
    ;

triplesSameSubject
    : ^(TRIPLES_SAME_SUBJECT ^(SUBJECT v=varOrTerm) p=propertyListNotEmpty) -> triplesSameSubject(subject={$v.st}, propertyListNotEmpty={$p.st})
    | ^(TRIPLES_SAME_SUBJECT t=triplesNode (^(SUBJECT BLANK_NODE) p=propertyListNotEmpty)?) -> triplesSameSubject(triplesNode={$t.st}, subject={$BLANK_NODE.text}, propertyListNotEmpty={$p.st})
    ;
    
propertyListNotEmpty
    : (^(PREDICATE v+=verb)  o+=objectList)+ -> propertyListNotEmpty(verb={$v}, objectList={$o})
    ;

objectList
    : (^(OBJECT g+=graphNode))+ -> objectList(graphNode={$g})
    ;

verb
    : v=varOrIRIref -> verb(varOrIRIref={$v.st})
    | A -> verb(a={$A.text})
    | p=path -> verb(path={p.st})
    ;

triplesSameSubjectPath
    : ^(TRIPLES_SAME_SUBJECT ^(SUBJECT v=varOrTerm) p=propertyListNotEmpty) -> triplesSameSubjectPath(subject={$v.st}, propertyListNotEmpty={$p.st})
    | ^(TRIPLES_SAME_SUBJECT  t=triplesNode (^(SUBJECT BLANK_NODE) propertyListNotEmpty)?) -> triplesSameSubjectPath(triplesNode={t.st}, subject={$BLANK_NODE.text}, propertyListNotEmpty={$p.st})
    ;
    
path
    : ^(PATH p+=pathSequence+) -> path(pathSequence={$p})
    ; 

pathSequence
    : ^(PATH_SEQUENCE p+=pathEltOrInverse+) -> pathSequence(pathEltOrInverse={$p})
    ;
    
pathEltOrInverse
    : INVERSE? p=pathElt -> pathEltOrInverse(inverse={$INVERSE.text}, pathElt={$p.st})
    ;
    	  	
pathElt
    : p=pathPrimary m=pathMod? -> pathElt(pathPrimary={$p.st}, pathMod={$m.st})
    ;
    
pathMod
    : ASTERISK -> pathMod(value={$ASTERISK.text})
    | QUESTION_MARK -> pathMod(value={$QUESTION_MARK.text})
    | PLUS -> pathMod(value={$PLUS.text})
    | OPEN_CURLY_BRACE (i1=INTEGER (COMMA (CLOSE_CURLY_BRACE | i2=INTEGER CLOSE_CURLY_BRACE) | CLOSE_CURLY_BRACE) | COMMA i3=INTEGER CLOSE_CURLY_BRACE) -> pathMod(i1={$i1.text}, i2={$i2.text}, i3={$i3.text})
    ;

pathPrimary
    : ^(PATH_PRIMARY i=iriRef) -> pathPrimary(iriRef={$i.st})
    | ^(PATH_PRIMARY A) -> pathPrimary(value={$A.text})
    | ^(PATH_PRIMARY NEGATION pathNegatedPropertySet) -> pathPrimary(value={$NEGATION.text}, pathNegatedPropertySet={$p.st})
    | ^(PATH_PRIMARY p=path) -> pathPrimary(path={$p.st})
    ;

pathNegatedPropertySet
    : ^(PATH_NEGATED (p+=pathOneInPropertySet)+) -> pathNegatedPropertySet(pathOneInPropertySet={$p})
    ;  	

pathOneInPropertySet
    : INVERSE? (i=iriRef | A) -> pathOneInPropertySet(attribute={$INVERSE.text}, iriRef={$i.st}, value={$A.text})
    ;
	
triplesNode
    : ^(COLLECTION (g+=graphNode)+) -> triplesNode(graphNode={$g})
    | ^(TRIPLES_NODE ^(SUBJECT BLANK_NODE) p=propertyListNotEmpty) -> triplesNode(subject={"[ ]"}, propertyListNotEmpty={$p.st})
    ;

graphNode
    : v=varOrTerm -> graphNode(varOrTerm={$v.st}) 
    | t=triplesNode -> graphNode(triplesNode={$t.st})
    ;

varOrTerm
    : v=var -> varOrTerm(var={$v.st})
    | g=graphTerm -> varOrTerm(graphTerm={$g.st})
    | BLANK_NODE -> varOrTerm(var={"[ ]"})
    ;

varOrIRIref
    : v=var -> varOrIRIref(var={$v.st})
    | i=iriRef -> varOrIRIref(iriRef={$i.st})
    ;

var
    : v=VAR1 -> var(v={$VAR1.text}) 
    | v=VAR2 -> var(v={$VAR2.text}) 
    ;

graphTerm
    : i=iriRef -> graphTerm(iriRef={$i.st})
    | r=rdfLiteral -> graphTerm(rdfLiteral={$r.st})
    | n=numericLiteral -> graphTerm(numericLiteral={$n.st})
    | b=booleanLiteral -> graphTerm(booleanLiteral={$b.st})
    | bn=blankNode -> graphTerm(blankNode={$bn.st})
    | ni=nil -> graphTerm(value={$ni.st})
    ;
    
nil
    : OPEN_BRACE CLOSE_BRACE -> nil()
    ;

expression
    : ^(OR e1=expression e2=expression) -> expression(operator={$OR.text}, expression1={$e1.st},  expression2={$e2.st})
    | ^(AND e1=expression e2=expression) -> expression(operator={$AND.text}, expression1={$e1.st},  expression2={$e2.st})
    | ^(EQUAL e1=expression e2=expression) -> expression(operator={$EQUAL.text}, expression1={$e1.st},  expression2={$e2.st})  
    | ^(NOT_EQUAL e1=expression e2=expression) -> expression(operator={$NOT_EQUAL.text}, expression1={$e1.st},  expression2={$e2.st})
    | ^(LESS e1=expression e2=expression) -> expression(operator={$LESS.text}, expression1={$e1.st},  expression2={$e2.st})
    | ^(GREATER e1=expression e2=expression) -> expression(operator={$GREATER.text}, expression1={$e1.st},  expression2={$e2.st})
    | ^(LESS_EQUAL e1=expression e2=expression) -> expression(operator={$LESS_EQUAL.text}, expression1={$e1.st},  expression2={$e2.st})
    | ^(GREATER_EQUAL e1=expression e2=expression) -> expression(operator={$GREATER_EQUAL.text}, expression1={$e1.st},  expression2={$e2.st})  
    | ^(IN e1=expression e2=expression) -> expression(operator={$IN.text}, expression1={$e1.st},  expression2={$e2.st})
    | ^(NOT IN e1=expression e2=expression) -> expression(operator={"NOT IN"}, expression1={$e1.st},  expression2={$e2.st})
    | ^(PLUS e1=expression e2=expression) -> expression(operator={$PLUS.text}, expression1={$e1.st},  expression2={$e2.st})
    | ^(MINUS e1=expression e2=expression) -> expression(operator={$MINUS.text}, expression1={$e1.st},  expression2={$e2.st}) 
    | ^(ASTERISK e1=expression e2=expression) -> expression(operator={$ASTERISK.text}, expression1={$e1.st},  expression2={$e2.st})
    | ^(DIVIDE e1=expression e2=expression) -> expression(operator={$DIVIDE.text}, expression1={$e1.st},  expression2={$e2.st})
    | u=unaryExpression -> expression(unaryExpression={$u.st})
    ;
    
unaryExpression
    : ^(UNARY_NOT p=primaryExpression) -> unaryExpression(operator={$UNARY_NOT.text}, primaryExpression={$p.st})
    | ^(UNARY_PLUS p=primaryExpression) -> unaryExpression(operator={$UNARY_PLUS.text}, primaryExpression={$p.st})
    | ^(UNARY_MINUS p=primaryExpression) -> unaryExpression(operator={$UNARY_MINUS.text}, primaryExpression={$p.st})
    | ^(UNARY p=primaryExpression) -> unaryExpression(primaryExpression={$p.st})
    ;

primaryExpression 
    : c=builtInCall -> primaryExpression(builtInCall={$c.st}) 
    | i=iriRefOrFunction -> primaryExpression(iriRefOrFunction={$i.st}) 
    | r=rdfLiteral -> primaryExpression(rdfLiteral={$r.st})
    | n=numericLiteral  -> primaryExpression(numericLiteral={$n.st})
    | b=booleanLiteral -> primaryExpression(booleanLiteral={$b.st}) 
    | v=var -> primaryExpression(var={$v.st}) 
    | a=aggregate -> primaryExpression(aggregate={$a.st})
    ;

builtInCall
    : ^(STR e=expression) -> builtInCall(type={$STR.text}, expression={$e.st})
    | ^(LANG e=expression) -> builtInCall(type={$LANG.text}, expression={$e.st})
    | ^(LANGMATCHES (m+=expression)+) -> builtInCall(type={$LANGMATCHES.text}, expressions={$m})
    | ^(DATATYPE e=expression) -> builtInCall(type={$DATATYPE.text}, expression={$e.st})
    | ^(BOUND v=var) -> builtInCall(type={$BOUND.text}, var={$v.st})
    | ^(IRI e=expression) -> builtInCall(type={$IRI.text}, expression={$e.st})
    | ^(URI e=expression) -> builtInCall(type={$URI.text}, expression={$e.st})
    | ^(BNODE e=expression) -> builtInCall(type={$BNODE.text}, expression={$e.st})
    | RAND -> builtInCall(type={$RAND.text})
    | ^(ABS e=expression) -> builtInCall(type={$ABS.text}, expression={$e.st})
    | ^(CEIL e=expression) -> builtInCall(type={$CEIL.text}, expression={$e.st})
    | ^(FLOOR e=expression) -> builtInCall(type={$FLOOR.text}, expression={$e.st})
    | ^(ROUND e=expression) -> builtInCall(type={$ROUND.text}, expression={$e.st})
    | ^(CONCAT l=expressionList) -> builtInCall(type={$CONCAT.text}, expressionList={$l.st})
    | s=subStringExpression -> builtInCall(subStringExpression={$s.st})
    | ^(STRLEN e=expression) -> builtInCall(type={$STRLEN.text}, expression={$e.st})
    | ^(UCASE e=expression) -> builtInCall(type={$UCASE.text}, expression={$e.st})
    | ^(LCASE e=expression) -> builtInCall(type={$LCASE.text}, expression={$e.st})
    | ^(ENCODE_FOR_URI e=expression) -> builtInCall(type={$ENCODE_FOR_URI.text}, expression={$e.st})
    | ^(CONTAINS e=expression) -> builtInCall(type={$CONTAINS.text}, expression={$e.st})
    | ^(STRSTARTS e=expression) -> builtInCall(type={$STRSTARTS.text}, expression={$e.st})
    | ^(STRENDS e=expression) -> builtInCall(type={$STRENDS.text}, expression={$e.st})
    | ^(YEAR e=expression) -> builtInCall(type={$YEAR.text}, expression={$e.st})
    | ^(MONTH e=expression) -> builtInCall(type={$MONTH.text}, expression={$e.st})
    | ^(DAY e=expression) -> builtInCall(type={$DAY.text}, expression={$e.st})
    | ^(HOURS e=expression) -> builtInCall(type={$HOURS.text}, expression={$e.st})
    | ^(MINUTES e=expression) -> builtInCall(type={$MINUTES.text}, expression={$e.st})
    | ^(SECONDS e=expression) -> builtInCall(type={$SECONDS.text}, expression={$e.st})
    | ^(TIMEZONE e=expression) -> builtInCall(type={$TIMEZONE.text}, expression={$e.st})
    | ^(TZ e=expression) -> builtInCall(type={$TZ.text}, expression={$e.st})
    | NOW -> builtInCall(type={$NOW.text})
    | ^(MD5 e=expression) -> builtInCall(type={$MD5.text}, expression={$e.st})
    | ^(SHA1 e=expression) -> builtInCall(type={$SHA1.text}, expression={$e.st})
    | ^(SHA224 e=expression) -> builtInCall(type={$SHA224.text}, expression={$e.st})
    | ^(SHA256 e=expression) -> builtInCall(type={$SHA256.text}, expression={$e.st})
    | ^(SHA384 e=expression) -> builtInCall(type={$SHA384.text}, expression={$e.st})
    | ^(SHA512 e=expression) -> builtInCall(type={$SHA512.text}, expression={$e.st})
    | ^(COALESCE l=expressionList) -> builtInCall(type={$COALESCE.text}, expressionList={$l.st})
    | ^(IF e1=expression e2=expression e3=expression) -> builtInCall(type={$IF.text}, expression1={$e1.st}, expression2={$e2.st}, expression3={$e3.st})
    | ^(STRLANG e1=expression e2=expression) -> builtInCall(type={$STRLANG.text}, expression1={$e1.st}, expression2={$e2.st})
    | ^(STRDT e1=expression e2=expression) -> builtInCall(type={$STRDT.text},  expression1={$e1.st}, expression2={$e2.st})
    | ^(SAMETERM e1=expression e2=expression) -> builtInCall(type={$SAMETERM.text},  expression1={$e1.st}, expression2={$e2.st})
    | ^(ISIRI e=expression) -> builtInCall(type={$ISIRI.text}, expression={$e.st})
    | ^(ISURI e=expression) -> builtInCall(type={$ISURI.text}, expression={$e.st})
    | ^(ISBLANK e=expression)  -> builtInCall(type={$ISBLANK.text}, expression={$e.st})
    | ^(ISLITERAL e=expression) -> builtInCall(type={$ISLITERAL.text}, expression={$e.st})
    | ^(ISNUMERIC e=expression) -> builtInCall(type={$ISNUMERIC.text}, expression={$e.st})
    | r=regexExpression -> builtInCall(regexExpression={$r.st})
    | f=existsFunction -> builtInCall(existsFunction={$f.st})
    | n=notExistsFunction -> builtInCall(notExistsFunction={$n.st})
    ;

regexExpression
    : ^(REGEX (e+=expression)+) -> regexExpression(expression={$e})
    ;
    
subStringExpression
    : ^(SUBSTR (e+=expression)+) -> subStringExpression(expression={$e})
    ;
    
existsFunction
    : ^(EXISTS g=groupGraphPattern) -> existsFunction(groupGraphPattern={$g.st})
    ;

notExistsFunction
    : ^(NOT_EXISTS g=groupGraphPattern) -> notExistsFunction(groupGraphPattern={$g.st})
    ;

aggregate
    : ^(COUNT DISTINCT* ASTERISK* e=expression*) -> aggregate(operation={$COUNT.text}, attribute={$DISTINCT.text}, whatever={$ASTERISK.text}, expression={$e.st})
    | ^(SUM DISTINCT* e=expression) -> aggregate(operation={$SUM.text}, attribute={$DISTINCT.text}, expression={$e.st})
    | ^(MIN DISTINCT* e=expression) -> aggregate(operation={$MIN.text}, attribute={$DISTINCT.text}, expression={$e.st})
    | ^(MAX DISTINCT* e=expression) -> aggregate(operation={$MAX.text}, attribute={$DISTINCT.text}, expression={$e.st})
    | ^(AVG DISTINCT* e=expression) -> aggregate(operation={$AVG.text}, attribute={$DISTINCT.text}, expression={$e.st})
    | ^(SAMPLE DISTINCT? e=expression) -> aggregate(operation={$SAMPLE.text}, attribute={$DISTINCT.text}, expression={$e.st})
    | ^(GROUP_CONCAT DISTINCT* e=expression s=string?) -> aggregate(operation={$GROUP_CONCAT.text}, attribute={$DISTINCT.text}, expression={$e.st}, string={$s.st})
    ;
    
iriRefOrFunction
    : i=iriRef -> iriRefOrFunction(iriRef={$i.st})
    | ^(FUNCTION f=iriRef ^(ARG_LIST a=argList)) -> iriRefOrFunction(function={$FUNCTION.text}, iriRef={$f.st}, argList={$a.st})
    ;

rdfLiteral
    : s=string (LANGTAG | (REFERENCE i=iriRef))? -> rdfLiteral(string={$s.st}, langTag={$LANGTAG.text}, iriRef={$i.st})
    ;

numericLiteral
    : u=numericLiteralUnsigned -> numericLiteral(numericLiteralUnsigned={$u.st})
    | p=numericLiteralPositive -> numericLiteral(numericLiteralUnsigned={$p.st})
    | n=numericLiteralNegative -> numericLiteral(numericLiteralUnsigned={$n.st})
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
    | p=prefixedName -> iriRef(prefixedName={$p.st})
    ;

prefixedName
    : PNAME_LN -> prefixedName(name={$PNAME_LN.text})
    | PNAME_NS -> prefixedName(name={$PNAME_NS.text})
    ;

blankNode
    : BLANK_NODE_LABEL -> blankNode(value={"[ ]"})
    | a=anon -> blankNode(anon={$a.st})
    ;

anon
    : OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET -> anon()
    ;	
// $>
