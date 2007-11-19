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
 * @author Simone Tripodi   (simone)
 * @author Michele Mostarda (michele)
 * 
 * J�rgen Pfundt, 15.11.2007 Added STRING_LITERAL_LONG1 and STRING_LITERAL_LONG2
 * J�rgen Pfundt, 15.11.2007 Corrected IRI_REF to reflect the www3.org EBNF grammar definition
 * J�rgen Pfundt, 15.11.2007 Extended lexical rule PN_CHARS to reflect the www3.org EBNF grammar definition 
 * J�rgen Pfundt, 15.11.2007 Added fragment to lexical rules ECHAR, PN_CHARS_U,
 *                           VARNAME, PN_PREFIX, PN_LOCAL as they are used only
 *                           by other lexical rules.
 * J�rgen Pfundt, 15.11.2007 Added lexical rule ANY as fallback, in case no lexical rule matches
 * J�rgen Pfundt, 17.11.2007 Recognition of keywords (including "true" and "false") is case insensitive now
 * J�rgen Pfundt, 17.11.2007 Implemented lexical rule for comments
 * J�rgen Pfundt, 17.11.2007 Solved problem with graphterm and blankNode which implicitely
 *                           referenced WS via lexical rules NIL and ANON. As WS sends its content
 *                           to channel hidden this resulted in problems with WS before and after
 *                           braces.
 * J�rgen Pfundt, 17.11.2007 Replaced parser literals by lexer tokens as preparation for AST generation
 *
 */

grammar Sparql;

options {
    output=AST;
    ASTLabelType=CommonTree;
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

@lexer::header {
import java.util.HashMap;
}

@lexer::members {

  int keyword = 0;

  static private HashMap<String, Integer> keywords = new HashMap<String, Integer>();
  {
     keywords.put("BASE", BASE);
     keywords.put("PREFIX", PREFIX);
     keywords.put("SELECT", SELECT);
     keywords.put("DISTINCT", DISTINCT);
     keywords.put("REDUCED", REDUCED);
     keywords.put("CONSTRUCT", CONSTRUCT);
     keywords.put("DESCRIBE", DESCRIBE);
     keywords.put("ASK", ASK);
     keywords.put("FROM", FROM);
     keywords.put("NAMED", NAMED);
     keywords.put("WHERE", WHERE);
     keywords.put("ORDER", ORDER);
     keywords.put("BY", BY);
     keywords.put("ASC", ASC);
     keywords.put("DESC", DESC);
     keywords.put("LIMIT", LIMIT);
     keywords.put("OFFSET", OFFSET);
     keywords.put("OPTIONAL", OPTIONAL);
     keywords.put("GRAPH", GRAPH);
     keywords.put("UNION", UNION);
     keywords.put("FILTER", FILTER);
     keywords.put("A", A);
     keywords.put("STR", STR);
     keywords.put("LANG", LANG);
     keywords.put("LANGMATCHES", LANGMATCHES);
     keywords.put("DATATYPE", DATATYPE);
     keywords.put("BOUND", BOUND);
     keywords.put("SAMETERM", SAMETERM);
     keywords.put("ISIRI", ISIRI);
     keywords.put("ISURI", ISURI);
     keywords.put("ISBLANK", ISBLANK);
     keywords.put("ISLITERAL", ISLITERAL); 
     keywords.put("REGEX", REGEX); 
     keywords.put("TRUE", TRUE); 
     keywords.put("FALSE", FALSE); 
  }
  
  private boolean checkForKeyword() {
 
     StringBuilder sb = new StringBuilder();
 
     int i = 1;
         
     while ( (input.LA(i) >= 'A' && input.LA(i) <= 'Y') || (input.LA(i) >= 'a' && input.LA(i) <= 'y') ) {
         sb.append((char)input.LA(i++));
     }

     Integer keyword = keywords.get(sb.toString().toUpperCase());
     
     if ( null != keyword ) {
        setKeyword(keyword.intValue());
     } 
     
     return null != keyword;
  }
  
  private void setKeyword(int keyword) {
     this.keyword = keyword;
  }

  private int getKeyword() {
     return keyword;
  }
  
  private void echo(String s) { System.out.println(s); System.out.flush(); }
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

KEYWORD
    : { checkForKeyword() }? => ('A'|'B'|'C'|'D'|'F'|'G'|'I'|'L'|'N'|'O'|'P'|'R'|'S'|'T'|'U'|'W'|'a'|'b'|'c'|'d'|'f'|'g'|'i'|'l'|'n'|'o'|'p'|'r'|'s'|'t'|'u'|'w')('a'..'y' | 'A'..'Y')*
      { $type = getKeyword(); }
    ;
    
IRI_REF
    : LESS ( options {greedy=false;} : ~(LESS | GREATER | '"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | '|' | '^' | '\\' | '`' | ('\u0000'..'\u0020')) )* GREATER
    ;

BLANK_NODE_LABEL
    : '_:' t=PN_LOCAL { setText($t.text); }
    ;

VAR1
    : '?' v=VARNAME { setText($v.text); }
    ;

VAR2
    : '$' v=VARNAME { setText($v.text); }
    ;

LANGTAG
    : '@' PN_CHARS_BASE+ (MINUS (PN_CHARS_BASE DIGIT)+)*
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

EXPONENT
    : ('e'|'E') (PLUS|MINUS)? DIGIT+
    ;

STRING_LITERAL1
    : '\'' ( options {greedy=false;} : ~('\u0027' | '\u005C' | '\u000A' | '\u000D') | ECHAR )* '\''
    ;

STRING_LITERAL2
    : '"'  ( options {greedy=false;} : ~('\u0022' | '\u005C' | '\u000A' | '\u000D') | ECHAR )* '"'
    ;

STRING_LITERAL_LONG1
    :  	'\'\'\'' ( options {greedy=false;} : ( '\'' | '\'\'' )? ( ~('\''|'\\') | ECHAR ) )* '\'\'\''
    ;

STRING_LITERAL_LONG2
    :  	'"""' ( options {greedy=false;} : ( '"' | '""' )? ( ~('"'|'\\') | ECHAR ) )* '"""'
    ;
        
fragment
ECHAR
    : '\\' ('t' | 'b' | 'n' | 'r' | 'f' | '"' | '\'')
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
    : '\n'| '\r'
    ;

REFERENCE
    :	'^^'
	;

LESS_EQUAL
    :	'<='
    ;

GREATER_EQUAL
    :	'>='
    ;

NOT_EQUAL
    :	'!='
    ;
	
AND
    :	'&&'
    ;

OR
    :	'||'
    ;

OPEN_BRACE
    :	'('
    ;

CLOSE_BRACE
    :	')'
    ;

OPEN_CURLY_BRACE
    :	'{'
    ;

CLOSE_CURLY_BRACE
    :	'}'
    ;

OPEN_SQUARE_BRACE
    :	'['
    ;

CLOSE_SQUARE_BRACE
    :	']'
    ;

SEMICOLON
    :	';'
    ;

DOT
    :	'.'
    ;

PLUS
    :	'+'
    ;

MINUS
    :	'-'
    ;	    			

ASTERISK
    : '*'
    ;
    
COMMA
    :	','
    ;

NOT
    :	'!'
    ;

DIVIDE
    :	'/'
    ;

EQUAL
    :	'='
    ;

LESS
    :	'<'
    ;

GREATER
    :	'>'
    ;
	            
ANY : .
    ;

// $>
