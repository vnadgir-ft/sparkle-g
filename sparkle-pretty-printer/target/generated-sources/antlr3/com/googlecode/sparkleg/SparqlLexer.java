// $ANTLR 3.4 com\\googlecode\\sparkleg\\Sparql.g 2011-11-24 22:39:48

    package com.googlecode.sparkleg;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SparqlLexer extends Lexer {
    public static final int EOF=-1;
    public static final int A=4;
    public static final int ABS=5;
    public static final int ADD=6;
    public static final int ALL=7;
    public static final int AND=8;
    public static final int ANY=9;
    public static final int ARG_LIST=10;
    public static final int AS=11;
    public static final int ASC=12;
    public static final int ASK=13;
    public static final int ASTERISK=14;
    public static final int AVG=15;
    public static final int BASE=16;
    public static final int BIND=17;
    public static final int BINDINGS=18;
    public static final int BINDING_VALUE=19;
    public static final int BLANK_NODE=20;
    public static final int BLANK_NODE_LABEL=21;
    public static final int BNODE=22;
    public static final int BOUND=23;
    public static final int BRACKETTED_EXPRESSION=24;
    public static final int BY=25;
    public static final int CEIL=26;
    public static final int CLEAR=27;
    public static final int CLOSE_BRACE=28;
    public static final int CLOSE_CURLY_BRACE=29;
    public static final int CLOSE_SQUARE_BRACKET=30;
    public static final int COALESCE=31;
    public static final int COLLECTION=32;
    public static final int COMMA=33;
    public static final int COMMENT=34;
    public static final int CONCAT=35;
    public static final int CONSTRUCT=36;
    public static final int CONSTRUCT_TRIPLES=37;
    public static final int CONTAINS=38;
    public static final int COPY=39;
    public static final int COUNT=40;
    public static final int CREATE=41;
    public static final int DATA=42;
    public static final int DATATYPE=43;
    public static final int DAY=44;
    public static final int DECIMAL=45;
    public static final int DECIMAL_NEGATIVE=46;
    public static final int DECIMAL_POSITIVE=47;
    public static final int DEFAULT=48;
    public static final int DELETE=49;
    public static final int DESC=50;
    public static final int DESCRIBE=51;
    public static final int DIGIT=52;
    public static final int DISTINCT=53;
    public static final int DIVIDE=54;
    public static final int DOT=55;
    public static final int DOUBLE=56;
    public static final int DOUBLE_NEGATIVE=57;
    public static final int DOUBLE_POSITIVE=58;
    public static final int DROP=59;
    public static final int ECHAR=60;
    public static final int ENCODE_FOR_URI=61;
    public static final int EOL=62;
    public static final int EQUAL=63;
    public static final int EXISTS=64;
    public static final int EXPONENT=65;
    public static final int EXPRESSION_LIST=66;
    public static final int FALSE=67;
    public static final int FILTER=68;
    public static final int FLOOR=69;
    public static final int FROM=70;
    public static final int FUNCTION=71;
    public static final int GRAPH=72;
    public static final int GREATER=73;
    public static final int GREATER_EQUAL=74;
    public static final int GROUP=75;
    public static final int GROUP_BY=76;
    public static final int GROUP_CONCAT=77;
    public static final int GROUP_CONDITION=78;
    public static final int GROUP_GRAPH_PATTERN=79;
    public static final int HAVING=80;
    public static final int HOURS=81;
    public static final int IF=82;
    public static final int IN=83;
    public static final int INSERT=84;
    public static final int INTEGER=85;
    public static final int INTEGER_NEGATIVE=86;
    public static final int INTEGER_POSITIVE=87;
    public static final int INTO=88;
    public static final int INVERSE=89;
    public static final int IRI=90;
    public static final int IRI_REF=91;
    public static final int IRI_REF_CHARACTERS=92;
    public static final int ISBLANK=93;
    public static final int ISIRI=94;
    public static final int ISLITERAL=95;
    public static final int ISNUMERIC=96;
    public static final int ISURI=97;
    public static final int LANG=98;
    public static final int LANGMATCHES=99;
    public static final int LANGTAG=100;
    public static final int LCASE=101;
    public static final int LESS=102;
    public static final int LESS_EQUAL=103;
    public static final int LIMIT=104;
    public static final int LOAD=105;
    public static final int MAX=106;
    public static final int MD5=107;
    public static final int MIN=108;
    public static final int MINUS=109;
    public static final int MINUS_KEYWORD=110;
    public static final int MINUTES=111;
    public static final int MODIFY=112;
    public static final int MONTH=113;
    public static final int MOVE=114;
    public static final int NAMED=115;
    public static final int NEGATION=116;
    public static final int NOT=117;
    public static final int NOT_EQUAL=118;
    public static final int NOT_EXISTS=119;
    public static final int NOW=120;
    public static final int OBJECT=121;
    public static final int OFFSET=122;
    public static final int OPEN_BRACE=123;
    public static final int OPEN_CURLY_BRACE=124;
    public static final int OPEN_SQUARE_BRACKET=125;
    public static final int OPTIONAL=126;
    public static final int OR=127;
    public static final int ORDER=128;
    public static final int ORDER_BY=129;
    public static final int ORDER_CONDITION=130;
    public static final int PATH=131;
    public static final int PATH_NEGATED=132;
    public static final int PATH_PRIMARY=133;
    public static final int PATH_SEQUENCE=134;
    public static final int PIPE=135;
    public static final int PLUS=136;
    public static final int PNAME_LN=137;
    public static final int PNAME_NS=138;
    public static final int PN_CHARS=139;
    public static final int PN_CHARS_BASE=140;
    public static final int PN_CHARS_U=141;
    public static final int PN_LOCAL=142;
    public static final int PN_PREFIX=143;
    public static final int PREDICATE=144;
    public static final int PREFIX=145;
    public static final int PROLOGUE=146;
    public static final int QUERY=147;
    public static final int QUESTION_MARK=148;
    public static final int RAND=149;
    public static final int REDUCED=150;
    public static final int REFERENCE=151;
    public static final int REGEX=152;
    public static final int REPLACE=153;
    public static final int ROUND=154;
    public static final int SAMETERM=155;
    public static final int SAMPLE=156;
    public static final int SECONDS=157;
    public static final int SELECT=158;
    public static final int SELECT_CLAUSE=159;
    public static final int SEMICOLON=160;
    public static final int SEPARATOR=161;
    public static final int SERVICE=162;
    public static final int SHA1=163;
    public static final int SHA224=164;
    public static final int SHA256=165;
    public static final int SHA384=166;
    public static final int SHA512=167;
    public static final int SIGN=168;
    public static final int SILENT=169;
    public static final int STR=170;
    public static final int STRAFTER=171;
    public static final int STRBEFORE=172;
    public static final int STRDT=173;
    public static final int STRENDS=174;
    public static final int STRING_LITERAL1=175;
    public static final int STRING_LITERAL2=176;
    public static final int STRING_LITERAL_LONG1=177;
    public static final int STRING_LITERAL_LONG2=178;
    public static final int STRLANG=179;
    public static final int STRLEN=180;
    public static final int STRSTARTS=181;
    public static final int SUBJECT=182;
    public static final int SUBSELECT=183;
    public static final int SUBSTR=184;
    public static final int SUM=185;
    public static final int TIMEZONE=186;
    public static final int TO=187;
    public static final int TRIPLES_BLOCK=188;
    public static final int TRIPLES_NODE=189;
    public static final int TRIPLES_SAME_SUBJECT=190;
    public static final int TRIPLES_TEMPLATE=191;
    public static final int TRUE=192;
    public static final int TZ=193;
    public static final int UCASE=194;
    public static final int UNARY=195;
    public static final int UNDEF=196;
    public static final int UNION=197;
    public static final int UPDATE=198;
    public static final int URI=199;
    public static final int USING=200;
    public static final int VAR=201;
    public static final int VAR1=202;
    public static final int VAR2=203;
    public static final int VARNAME=204;
    public static final int WHERE=205;
    public static final int WHERE_CLAUSE=206;
    public static final int WITH=207;
    public static final int WS=208;
    public static final int YEAR=209;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SparqlLexer() {} 
    public SparqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SparqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "com\\googlecode\\sparkleg\\Sparql.g"; }

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:688:4: ( ( ' ' | '\\t' | EOL )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:688:6: ( ' ' | '\\t' | EOL )+
            {
            // com\\googlecode\\sparkleg\\Sparql.g:688:6: ( ' ' | '\\t' | EOL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case '\t':
                case '\n':
                case '\r':
                case ' ':
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            if ( state.backtracking==0 ) { _channel=HIDDEN; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "BASE"
    public final void mBASE() throws RecognitionException {
        try {
            int _type = BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:690:6: ( ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:690:8: ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BASE"

    // $ANTLR start "PREFIX"
    public final void mPREFIX() throws RecognitionException {
        try {
            int _type = PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:692:8: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'X' | 'x' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:692:10: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREFIX"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:694:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:694:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:696:10: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:696:12: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DISTINCT"

    // $ANTLR start "REDUCED"
    public final void mREDUCED() throws RecognitionException {
        try {
            int _type = REDUCED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:698:9: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:698:11: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REDUCED"

    // $ANTLR start "CONSTRUCT"
    public final void mCONSTRUCT() throws RecognitionException {
        try {
            int _type = CONSTRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:700:11: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:700:13: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONSTRUCT"

    // $ANTLR start "DESCRIBE"
    public final void mDESCRIBE() throws RecognitionException {
        try {
            int _type = DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:702:10: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:702:12: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESCRIBE"

    // $ANTLR start "ASK"
    public final void mASK() throws RecognitionException {
        try {
            int _type = ASK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:704:5: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'K' | 'k' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:704:7: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASK"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:706:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:706:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "NAMED"
    public final void mNAMED() throws RecognitionException {
        try {
            int _type = NAMED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:708:7: ( ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:708:9: ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAMED"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:710:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:710:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:712:7: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:712:9: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:714:4: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:714:6: ( 'B' | 'b' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:716:5: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:716:7: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:718:6: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:718:8: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:720:7: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:720:9: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "OFFSET"
    public final void mOFFSET() throws RecognitionException {
        try {
            int _type = OFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:722:8: ( ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:722:10: ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OFFSET"

    // $ANTLR start "OPTIONAL"
    public final void mOPTIONAL() throws RecognitionException {
        try {
            int _type = OPTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:724:10: ( ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:724:12: ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPTIONAL"

    // $ANTLR start "GRAPH"
    public final void mGRAPH() throws RecognitionException {
        try {
            int _type = GRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:726:7: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:726:9: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GRAPH"

    // $ANTLR start "UNION"
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:728:7: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:728:9: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNION"

    // $ANTLR start "FILTER"
    public final void mFILTER() throws RecognitionException {
        try {
            int _type = FILTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:730:8: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:730:10: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FILTER"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            int _type = A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:732:3: ( 'a' )
            // com\\googlecode\\sparkleg\\Sparql.g:732:5: 'a'
            {
            match('a'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "STR"
    public final void mSTR() throws RecognitionException {
        try {
            int _type = STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:734:5: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:734:7: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STR"

    // $ANTLR start "LANG"
    public final void mLANG() throws RecognitionException {
        try {
            int _type = LANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:736:6: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:736:8: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LANG"

    // $ANTLR start "LANGMATCHES"
    public final void mLANGMATCHES() throws RecognitionException {
        try {
            int _type = LANGMATCHES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:738:13: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:738:15: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LANGMATCHES"

    // $ANTLR start "DATATYPE"
    public final void mDATATYPE() throws RecognitionException {
        try {
            int _type = DATATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:740:10: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:740:12: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATATYPE"

    // $ANTLR start "BOUND"
    public final void mBOUND() throws RecognitionException {
        try {
            int _type = BOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:742:7: ( ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:742:9: ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOUND"

    // $ANTLR start "SAMETERM"
    public final void mSAMETERM() throws RecognitionException {
        try {
            int _type = SAMETERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:744:10: ( ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:744:12: ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SAMETERM"

    // $ANTLR start "ISIRI"
    public final void mISIRI() throws RecognitionException {
        try {
            int _type = ISIRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:746:7: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:746:9: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISIRI"

    // $ANTLR start "ISURI"
    public final void mISURI() throws RecognitionException {
        try {
            int _type = ISURI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:748:7: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:748:9: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISURI"

    // $ANTLR start "ISBLANK"
    public final void mISBLANK() throws RecognitionException {
        try {
            int _type = ISBLANK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:750:9: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'K' | 'k' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:750:11: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISBLANK"

    // $ANTLR start "ISLITERAL"
    public final void mISLITERAL() throws RecognitionException {
        try {
            int _type = ISLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:752:11: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:752:13: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISLITERAL"

    // $ANTLR start "REGEX"
    public final void mREGEX() throws RecognitionException {
        try {
            int _type = REGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:754:7: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:754:9: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REGEX"

    // $ANTLR start "SUBSTR"
    public final void mSUBSTR() throws RecognitionException {
        try {
            int _type = SUBSTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:756:8: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:756:10: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBSTR"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:758:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:758:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:760:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:760:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "LOAD"
    public final void mLOAD() throws RecognitionException {
        try {
            int _type = LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:762:6: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'D' | 'd' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:762:8: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOAD"

    // $ANTLR start "CLEAR"
    public final void mCLEAR() throws RecognitionException {
        try {
            int _type = CLEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:764:7: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:764:9: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLEAR"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:766:6: ( ( 'D' | 'd' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:766:8: ( 'D' | 'd' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:768:5: ( ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:768:7: ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "MOVE"
    public final void mMOVE() throws RecognitionException {
        try {
            int _type = MOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:770:6: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:770:8: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOVE"

    // $ANTLR start "COPY"
    public final void mCOPY() throws RecognitionException {
        try {
            int _type = COPY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:772:6: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'Y' | 'y' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:772:8: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COPY"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:774:9: ( ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:774:11: ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:776:8: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:776:10: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:778:8: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:778:10: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:780:7: ( ( 'U' | 'u' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:780:9: ( 'U' | 'u' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "SILENT"
    public final void mSILENT() throws RecognitionException {
        try {
            int _type = SILENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:782:8: ( ( 'S' | 's' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:782:10: ( 'S' | 's' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SILENT"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:784:9: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:784:11: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:786:5: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:786:7: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "DATA"
    public final void mDATA() throws RecognitionException {
        try {
            int _type = DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:788:6: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:788:8: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATA"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:790:6: ( ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:790:8: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:792:6: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:792:8: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:794:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:794:6: ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:796:4: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:796:6: ( 'A' | 'a' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:798:7: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:798:9: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:800:8: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:800:10: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HAVING"

    // $ANTLR start "UNDEF"
    public final void mUNDEF() throws RecognitionException {
        try {
            int _type = UNDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:802:7: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:802:9: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDEF"

    // $ANTLR start "BINDINGS"
    public final void mBINDINGS() throws RecognitionException {
        try {
            int _type = BINDINGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:804:10: ( ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'S' | 's' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:804:12: ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINDINGS"

    // $ANTLR start "SERVICE"
    public final void mSERVICE() throws RecognitionException {
        try {
            int _type = SERVICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:806:9: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:806:11: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SERVICE"

    // $ANTLR start "BIND"
    public final void mBIND() throws RecognitionException {
        try {
            int _type = BIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:808:6: ( ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:808:8: ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BIND"

    // $ANTLR start "MINUS_KEYWORD"
    public final void mMINUS_KEYWORD() throws RecognitionException {
        try {
            int _type = MINUS_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:810:15: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:810:17: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS_KEYWORD"

    // $ANTLR start "IRI"
    public final void mIRI() throws RecognitionException {
        try {
            int _type = IRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:812:5: ( ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:812:7: ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IRI"

    // $ANTLR start "URI"
    public final void mURI() throws RecognitionException {
        try {
            int _type = URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:814:5: ( ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:814:7: ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "URI"

    // $ANTLR start "BNODE"
    public final void mBNODE() throws RecognitionException {
        try {
            int _type = BNODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:816:7: ( ( 'B' | 'b' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:816:9: ( 'B' | 'b' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BNODE"

    // $ANTLR start "RAND"
    public final void mRAND() throws RecognitionException {
        try {
            int _type = RAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:818:6: ( ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:818:8: ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RAND"

    // $ANTLR start "ABS"
    public final void mABS() throws RecognitionException {
        try {
            int _type = ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:820:4: ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:820:6: ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABS"

    // $ANTLR start "CEIL"
    public final void mCEIL() throws RecognitionException {
        try {
            int _type = CEIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:822:6: ( ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'L' | 'l' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:822:8: ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CEIL"

    // $ANTLR start "FLOOR"
    public final void mFLOOR() throws RecognitionException {
        try {
            int _type = FLOOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:824:7: ( ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:824:9: ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOOR"

    // $ANTLR start "ROUND"
    public final void mROUND() throws RecognitionException {
        try {
            int _type = ROUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:826:7: ( ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:826:9: ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROUND"

    // $ANTLR start "CONCAT"
    public final void mCONCAT() throws RecognitionException {
        try {
            int _type = CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:828:9: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:828:11: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONCAT"

    // $ANTLR start "STRLEN"
    public final void mSTRLEN() throws RecognitionException {
        try {
            int _type = STRLEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:830:8: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:830:10: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRLEN"

    // $ANTLR start "UCASE"
    public final void mUCASE() throws RecognitionException {
        try {
            int _type = UCASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:832:7: ( ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:832:9: ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UCASE"

    // $ANTLR start "LCASE"
    public final void mLCASE() throws RecognitionException {
        try {
            int _type = LCASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:834:7: ( ( 'L' | 'l' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:834:9: ( 'L' | 'l' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCASE"

    // $ANTLR start "ENCODE_FOR_URI"
    public final void mENCODE_FOR_URI() throws RecognitionException {
        try {
            int _type = ENCODE_FOR_URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:836:16: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) '_' ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) '_' ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:836:18: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) '_' ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) '_' ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('_'); if (state.failed) return ;

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('_'); if (state.failed) return ;

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENCODE_FOR_URI"

    // $ANTLR start "CONTAINS"
    public final void mCONTAINS() throws RecognitionException {
        try {
            int _type = CONTAINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:838:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:838:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTAINS"

    // $ANTLR start "STRSTARTS"
    public final void mSTRSTARTS() throws RecognitionException {
        try {
            int _type = STRSTARTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:840:11: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:840:13: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRSTARTS"

    // $ANTLR start "STRENDS"
    public final void mSTRENDS() throws RecognitionException {
        try {
            int _type = STRENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:842:9: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:842:11: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRENDS"

    // $ANTLR start "STRBEFORE"
    public final void mSTRBEFORE() throws RecognitionException {
        try {
            int _type = STRBEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:844:11: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:844:13: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRBEFORE"

    // $ANTLR start "STRAFTER"
    public final void mSTRAFTER() throws RecognitionException {
        try {
            int _type = STRAFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:846:10: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'F' | 'f' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:846:12: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'F' | 'f' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRAFTER"

    // $ANTLR start "REPLACE"
    public final void mREPLACE() throws RecognitionException {
        try {
            int _type = REPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:848:9: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:848:11: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REPLACE"

    // $ANTLR start "YEAR"
    public final void mYEAR() throws RecognitionException {
        try {
            int _type = YEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:850:6: ( ( 'Y' | 'y' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:850:8: ( 'Y' | 'y' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "YEAR"

    // $ANTLR start "MONTH"
    public final void mMONTH() throws RecognitionException {
        try {
            int _type = MONTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:852:7: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:852:9: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MONTH"

    // $ANTLR start "DAY"
    public final void mDAY() throws RecognitionException {
        try {
            int _type = DAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:854:5: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:854:7: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DAY"

    // $ANTLR start "HOURS"
    public final void mHOURS() throws RecognitionException {
        try {
            int _type = HOURS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:856:7: ( ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'S' | 's' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:856:9: ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HOURS"

    // $ANTLR start "MINUTES"
    public final void mMINUTES() throws RecognitionException {
        try {
            int _type = MINUTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:858:9: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:858:11: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUTES"

    // $ANTLR start "SECONDS"
    public final void mSECONDS() throws RecognitionException {
        try {
            int _type = SECONDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:860:9: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:860:11: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SECONDS"

    // $ANTLR start "TIMEZONE"
    public final void mTIMEZONE() throws RecognitionException {
        try {
            int _type = TIMEZONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:862:10: ( ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'Z' | 'z' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:862:13: ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'Z' | 'z' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIMEZONE"

    // $ANTLR start "TZ"
    public final void mTZ() throws RecognitionException {
        try {
            int _type = TZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:864:4: ( ( 'T' | 't' ) ( 'Z' | 'z' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:864:6: ( 'T' | 't' ) ( 'Z' | 'z' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TZ"

    // $ANTLR start "NOW"
    public final void mNOW() throws RecognitionException {
        try {
            int _type = NOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:866:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'W' | 'w' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:866:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'W' | 'w' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOW"

    // $ANTLR start "MD5"
    public final void mMD5() throws RecognitionException {
        try {
            int _type = MD5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:868:5: ( ( 'M' | 'm' ) ( 'D' | 'd' ) '5' )
            // com\\googlecode\\sparkleg\\Sparql.g:868:7: ( 'M' | 'm' ) ( 'D' | 'd' ) '5'
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('5'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MD5"

    // $ANTLR start "SHA1"
    public final void mSHA1() throws RecognitionException {
        try {
            int _type = SHA1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:870:6: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '1' )
            // com\\googlecode\\sparkleg\\Sparql.g:870:8: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '1'
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('1'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHA1"

    // $ANTLR start "SHA224"
    public final void mSHA224() throws RecognitionException {
        try {
            int _type = SHA224;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:872:8: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '224' )
            // com\\googlecode\\sparkleg\\Sparql.g:872:10: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '224'
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match("224"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHA224"

    // $ANTLR start "SHA256"
    public final void mSHA256() throws RecognitionException {
        try {
            int _type = SHA256;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:874:8: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '256' )
            // com\\googlecode\\sparkleg\\Sparql.g:874:10: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '256'
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match("256"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHA256"

    // $ANTLR start "SHA384"
    public final void mSHA384() throws RecognitionException {
        try {
            int _type = SHA384;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:876:8: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '384' )
            // com\\googlecode\\sparkleg\\Sparql.g:876:10: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '384'
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match("384"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHA384"

    // $ANTLR start "SHA512"
    public final void mSHA512() throws RecognitionException {
        try {
            int _type = SHA512;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:878:8: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '512' )
            // com\\googlecode\\sparkleg\\Sparql.g:878:10: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '512'
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match("512"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHA512"

    // $ANTLR start "COALESCE"
    public final void mCOALESCE() throws RecognitionException {
        try {
            int _type = COALESCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:880:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:880:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COALESCE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:882:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:882:6: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "STRLANG"
    public final void mSTRLANG() throws RecognitionException {
        try {
            int _type = STRLANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:884:9: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:884:11: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRLANG"

    // $ANTLR start "STRDT"
    public final void mSTRDT() throws RecognitionException {
        try {
            int _type = STRDT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:886:7: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:886:9: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRDT"

    // $ANTLR start "ISNUMERIC"
    public final void mISNUMERIC() throws RecognitionException {
        try {
            int _type = ISNUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:888:11: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:888:13: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ISNUMERIC"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:890:7: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:890:9: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "SUM"
    public final void mSUM() throws RecognitionException {
        try {
            int _type = SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:892:5: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:892:7: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUM"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:894:5: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:894:7: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "MAX"
    public final void mMAX() throws RecognitionException {
        try {
            int _type = MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:896:5: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:896:7: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAX"

    // $ANTLR start "AVG"
    public final void mAVG() throws RecognitionException {
        try {
            int _type = AVG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:898:5: ( ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'G' | 'g' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:898:7: ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AVG"

    // $ANTLR start "SAMPLE"
    public final void mSAMPLE() throws RecognitionException {
        try {
            int _type = SAMPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:900:8: ( ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:900:10: ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SAMPLE"

    // $ANTLR start "GROUP_CONCAT"
    public final void mGROUP_CONCAT() throws RecognitionException {
        try {
            int _type = GROUP_CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:902:15: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) '_' ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:902:18: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) '_' ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('_'); if (state.failed) return ;

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP_CONCAT"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:904:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:904:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:906:4: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:906:6: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:908:8: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:908:10: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "SEPARATOR"
    public final void mSEPARATOR() throws RecognitionException {
        try {
            int _type = SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:910:11: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:910:13: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEPARATOR"

    // $ANTLR start "PNAME_NS"
    public final void mPNAME_NS() throws RecognitionException {
        try {
            int _type = PNAME_NS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken p=null;

            // com\\googlecode\\sparkleg\\Sparql.g:912:10: ( (p= PN_PREFIX )? ':' )
            // com\\googlecode\\sparkleg\\Sparql.g:912:12: (p= PN_PREFIX )? ':'
            {
            // com\\googlecode\\sparkleg\\Sparql.g:912:13: (p= PN_PREFIX )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')||(LA2_0 >= '\u00C0' && LA2_0 <= '\u00D6')||(LA2_0 >= '\u00D8' && LA2_0 <= '\u00F6')||(LA2_0 >= '\u00F8' && LA2_0 <= '\u02FF')||(LA2_0 >= '\u0370' && LA2_0 <= '\u037D')||(LA2_0 >= '\u037F' && LA2_0 <= '\u1FFF')||(LA2_0 >= '\u200C' && LA2_0 <= '\u200D')||(LA2_0 >= '\u2070' && LA2_0 <= '\u218F')||(LA2_0 >= '\u2C00' && LA2_0 <= '\u2FEF')||(LA2_0 >= '\u3001' && LA2_0 <= '\uD7FF')||(LA2_0 >= '\uF900' && LA2_0 <= '\uFDCF')||(LA2_0 >= '\uFDF0' && LA2_0 <= '\uFFFD')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:912:13: p= PN_PREFIX
                    {
                    int pStart3610 = getCharIndex();
                    int pStartLine3610 = getLine();
                    int pStartCharPos3610 = getCharPositionInLine();
                    mPN_PREFIX(); if (state.failed) return ;
                    p = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, pStart3610, getCharIndex()-1);
                    p.setLine(pStartLine3610);
                    p.setCharPositionInLine(pStartCharPos3610);


                    }
                    break;

            }


            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PNAME_NS"

    // $ANTLR start "PNAME_LN"
    public final void mPNAME_LN() throws RecognitionException {
        try {
            int _type = PNAME_LN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:914:10: ( PNAME_NS PN_LOCAL )
            // com\\googlecode\\sparkleg\\Sparql.g:914:12: PNAME_NS PN_LOCAL
            {
            mPNAME_NS(); if (state.failed) return ;


            mPN_LOCAL(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PNAME_LN"

    // $ANTLR start "BLANK_NODE_LABEL"
    public final void mBLANK_NODE_LABEL() throws RecognitionException {
        try {
            int _type = BLANK_NODE_LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken t=null;

            // com\\googlecode\\sparkleg\\Sparql.g:916:18: ( '_:' t= PN_LOCAL )
            // com\\googlecode\\sparkleg\\Sparql.g:916:20: '_:' t= PN_LOCAL
            {
            match("_:"); if (state.failed) return ;



            int tStart3633 = getCharIndex();
            int tStartLine3633 = getLine();
            int tStartCharPos3633 = getCharPositionInLine();
            mPN_LOCAL(); if (state.failed) return ;
            t = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, tStart3633, getCharIndex()-1);
            t.setLine(tStartLine3633);
            t.setCharPositionInLine(tStartCharPos3633);


            if ( state.backtracking==0 ) { setText((t!=null?t.getText():null)); }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BLANK_NODE_LABEL"

    // $ANTLR start "VAR1"
    public final void mVAR1() throws RecognitionException {
        try {
            int _type = VAR1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken v=null;

            // com\\googlecode\\sparkleg\\Sparql.g:918:6: ( QUESTION_MARK v= VARNAME )
            // com\\googlecode\\sparkleg\\Sparql.g:918:8: QUESTION_MARK v= VARNAME
            {
            mQUESTION_MARK(); if (state.failed) return ;


            int vStart3646 = getCharIndex();
            int vStartLine3646 = getLine();
            int vStartCharPos3646 = getCharPositionInLine();
            mVARNAME(); if (state.failed) return ;
            v = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, vStart3646, getCharIndex()-1);
            v.setLine(vStartLine3646);
            v.setCharPositionInLine(vStartCharPos3646);


            if ( state.backtracking==0 ) { setText((v!=null?v.getText():null)); }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR1"

    // $ANTLR start "VAR2"
    public final void mVAR2() throws RecognitionException {
        try {
            int _type = VAR2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken v=null;

            // com\\googlecode\\sparkleg\\Sparql.g:920:6: ( '$' v= VARNAME )
            // com\\googlecode\\sparkleg\\Sparql.g:920:8: '$' v= VARNAME
            {
            match('$'); if (state.failed) return ;

            int vStart3659 = getCharIndex();
            int vStartLine3659 = getLine();
            int vStartCharPos3659 = getCharPositionInLine();
            mVARNAME(); if (state.failed) return ;
            v = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, vStart3659, getCharIndex()-1);
            v.setLine(vStartLine3659);
            v.setCharPositionInLine(vStartCharPos3659);


            if ( state.backtracking==0 ) { setText((v!=null?v.getText():null)); }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR2"

    // $ANTLR start "LANGTAG"
    public final void mLANGTAG() throws RecognitionException {
        try {
            int _type = LANGTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:922:9: ( '@' ( 'A' .. 'Z' | 'a' .. 'z' )+ ( MINUS ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+ )* )
            // com\\googlecode\\sparkleg\\Sparql.g:922:11: '@' ( 'A' .. 'Z' | 'a' .. 'z' )+ ( MINUS ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+ )*
            {
            match('@'); if (state.failed) return ;

            // com\\googlecode\\sparkleg\\Sparql.g:922:15: ( 'A' .. 'Z' | 'a' .. 'z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            // com\\googlecode\\sparkleg\\Sparql.g:922:36: ( MINUS ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+ )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case '-':
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:922:37: MINUS ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+
            	    {
            	    mMINUS(); if (state.failed) return ;


            	    // com\\googlecode\\sparkleg\\Sparql.g:922:43: ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        switch ( input.LA(1) ) {
            	        case '0':
            	        case '1':
            	        case '2':
            	        case '3':
            	        case '4':
            	        case '5':
            	        case '6':
            	        case '7':
            	        case '8':
            	        case '9':
            	        case 'A':
            	        case 'B':
            	        case 'C':
            	        case 'D':
            	        case 'E':
            	        case 'F':
            	        case 'G':
            	        case 'H':
            	        case 'I':
            	        case 'J':
            	        case 'K':
            	        case 'L':
            	        case 'M':
            	        case 'N':
            	        case 'O':
            	        case 'P':
            	        case 'Q':
            	        case 'R':
            	        case 'S':
            	        case 'T':
            	        case 'U':
            	        case 'V':
            	        case 'W':
            	        case 'X':
            	        case 'Y':
            	        case 'Z':
            	        case 'a':
            	        case 'b':
            	        case 'c':
            	        case 'd':
            	        case 'e':
            	        case 'f':
            	        case 'g':
            	        case 'h':
            	        case 'i':
            	        case 'j':
            	        case 'k':
            	        case 'l':
            	        case 'm':
            	        case 'n':
            	        case 'o':
            	        case 'p':
            	        case 'q':
            	        case 'r':
            	        case 's':
            	        case 't':
            	        case 'u':
            	        case 'v':
            	        case 'w':
            	        case 'x':
            	        case 'y':
            	        case 'z':
            	            {
            	            alt4=1;
            	            }
            	            break;

            	        }

            	        switch (alt4) {
            	    	case 1 :
            	    	    // com\\googlecode\\sparkleg\\Sparql.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	    	        input.consume();
            	    	        state.failed=false;
            	    	    }
            	    	    else {
            	    	        if (state.backtracking>0) {state.failed=true; return ;}
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	    	    if (state.backtracking>0) {state.failed=true; return ;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LANGTAG"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:924:9: ( ( DIGIT )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:924:11: ( DIGIT )+
            {
            // com\\googlecode\\sparkleg\\Sparql.g:924:11: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt6=1;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:927:5: ( ( DIGIT )+ DOT ( DIGIT )* | DOT ( DIGIT )+ )
            int alt10=2;
            switch ( input.LA(1) ) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt10=1;
                }
                break;
            case '.':
                {
                alt10=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:927:7: ( DIGIT )+ DOT ( DIGIT )*
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:927:7: ( DIGIT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt7=1;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    mDOT(); if (state.failed) return ;


                    // com\\googlecode\\sparkleg\\Sparql.g:927:18: ( DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt8=1;
                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:928:7: DOT ( DIGIT )+
                    {
                    mDOT(); if (state.failed) return ;


                    // com\\googlecode\\sparkleg\\Sparql.g:928:11: ( DIGIT )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt9=1;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:932:5: ( ( DIGIT )+ DOT ( DIGIT )* EXPONENT | DOT ( DIGIT )+ EXPONENT | ( DIGIT )+ EXPONENT )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:932:7: ( DIGIT )+ DOT ( DIGIT )* EXPONENT
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:932:7: ( DIGIT )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt11=1;
                            }
                            break;

                        }

                        switch (alt11) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    mDOT(); if (state.failed) return ;


                    // com\\googlecode\\sparkleg\\Sparql.g:932:18: ( DIGIT )*
                    loop12:
                    do {
                        int alt12=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt12=1;
                            }
                            break;

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    mEXPONENT(); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:933:7: DOT ( DIGIT )+ EXPONENT
                    {
                    mDOT(); if (state.failed) return ;


                    // com\\googlecode\\sparkleg\\Sparql.g:933:11: ( DIGIT )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt13=1;
                            }
                            break;

                        }

                        switch (alt13) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    mEXPONENT(); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:934:7: ( DIGIT )+ EXPONENT
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:934:7: ( DIGIT )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt14=1;
                            }
                            break;

                        }

                        switch (alt14) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    mEXPONENT(); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "INTEGER_POSITIVE"
    public final void mINTEGER_POSITIVE() throws RecognitionException {
        try {
            int _type = INTEGER_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:937:18: ( PLUS INTEGER )
            // com\\googlecode\\sparkleg\\Sparql.g:937:20: PLUS INTEGER
            {
            mPLUS(); if (state.failed) return ;


            mINTEGER(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER_POSITIVE"

    // $ANTLR start "DECIMAL_POSITIVE"
    public final void mDECIMAL_POSITIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:939:18: ( PLUS DECIMAL )
            // com\\googlecode\\sparkleg\\Sparql.g:939:20: PLUS DECIMAL
            {
            mPLUS(); if (state.failed) return ;


            mDECIMAL(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL_POSITIVE"

    // $ANTLR start "DOUBLE_POSITIVE"
    public final void mDOUBLE_POSITIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:941:17: ( PLUS DOUBLE )
            // com\\googlecode\\sparkleg\\Sparql.g:941:19: PLUS DOUBLE
            {
            mPLUS(); if (state.failed) return ;


            mDOUBLE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_POSITIVE"

    // $ANTLR start "INTEGER_NEGATIVE"
    public final void mINTEGER_NEGATIVE() throws RecognitionException {
        try {
            int _type = INTEGER_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:943:18: ( MINUS INTEGER )
            // com\\googlecode\\sparkleg\\Sparql.g:943:20: MINUS INTEGER
            {
            mMINUS(); if (state.failed) return ;


            mINTEGER(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER_NEGATIVE"

    // $ANTLR start "DECIMAL_NEGATIVE"
    public final void mDECIMAL_NEGATIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:945:18: ( MINUS DECIMAL )
            // com\\googlecode\\sparkleg\\Sparql.g:945:20: MINUS DECIMAL
            {
            mMINUS(); if (state.failed) return ;


            mDECIMAL(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL_NEGATIVE"

    // $ANTLR start "DOUBLE_NEGATIVE"
    public final void mDOUBLE_NEGATIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:947:17: ( MINUS DOUBLE )
            // com\\googlecode\\sparkleg\\Sparql.g:947:19: MINUS DOUBLE
            {
            mMINUS(); if (state.failed) return ;


            mDOUBLE(); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_NEGATIVE"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:951:10: ( ( 'e' | 'E' ) ( SIGN )? ( DIGIT )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:951:12: ( 'e' | 'E' ) ( SIGN )? ( DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // com\\googlecode\\sparkleg\\Sparql.g:951:22: ( SIGN )?
            int alt16=2;
            switch ( input.LA(1) ) {
                case '+':
                case '-':
                    {
                    alt16=1;
                    }
                    break;
            }

            switch (alt16) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:951:28: ( DIGIT )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt17=1;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "STRING_LITERAL1"
    public final void mSTRING_LITERAL1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:952:17: ( '\\'' ( options {greedy=false; } :~ ( '\\'' | '\\\\' | EOL ) | ECHAR )* '\\'' )
            // com\\googlecode\\sparkleg\\Sparql.g:952:19: '\\'' ( options {greedy=false; } :~ ( '\\'' | '\\\\' | EOL ) | ECHAR )* '\\''
            {
            match('\''); if (state.failed) return ;

            // com\\googlecode\\sparkleg\\Sparql.g:952:24: ( options {greedy=false; } :~ ( '\\'' | '\\\\' | EOL ) | ECHAR )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '\u0000' && LA18_0 <= '\t')||(LA18_0 >= '\u000B' && LA18_0 <= '\f')||(LA18_0 >= '\u000E' && LA18_0 <= '&')||(LA18_0 >= '(' && LA18_0 <= '[')||(LA18_0 >= ']' && LA18_0 <= '\uFFFF')) ) {
                    alt18=1;
                }
                else if ( (LA18_0=='\\') ) {
                    alt18=2;
                }
                else if ( (LA18_0=='\'') ) {
                    alt18=3;
                }


                switch (alt18) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:952:51: ~ ( '\\'' | '\\\\' | EOL )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:952:74: ECHAR
            	    {
            	    mECHAR(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL1"

    // $ANTLR start "STRING_LITERAL2"
    public final void mSTRING_LITERAL2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:954:17: ( '\"' ( options {greedy=false; } :~ ( '\"' | '\\\\' | EOL ) | ECHAR )* '\"' )
            // com\\googlecode\\sparkleg\\Sparql.g:954:19: '\"' ( options {greedy=false; } :~ ( '\"' | '\\\\' | EOL ) | ECHAR )* '\"'
            {
            match('\"'); if (state.failed) return ;

            // com\\googlecode\\sparkleg\\Sparql.g:954:23: ( options {greedy=false; } :~ ( '\"' | '\\\\' | EOL ) | ECHAR )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\t')||(LA19_0 >= '\u000B' && LA19_0 <= '\f')||(LA19_0 >= '\u000E' && LA19_0 <= '!')||(LA19_0 >= '#' && LA19_0 <= '[')||(LA19_0 >= ']' && LA19_0 <= '\uFFFF')) ) {
                    alt19=1;
                }
                else if ( (LA19_0=='\\') ) {
                    alt19=2;
                }
                else if ( (LA19_0=='\"') ) {
                    alt19=3;
                }


                switch (alt19) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:954:50: ~ ( '\"' | '\\\\' | EOL )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:954:72: ECHAR
            	    {
            	    mECHAR(); if (state.failed) return ;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL2"

    // $ANTLR start "STRING_LITERAL_LONG1"
    public final void mSTRING_LITERAL_LONG1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:956:22: ( '\\'\\'\\'' ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\'' )
            // com\\googlecode\\sparkleg\\Sparql.g:956:24: '\\'\\'\\'' ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\''
            {
            match("'''"); if (state.failed) return ;



            // com\\googlecode\\sparkleg\\Sparql.g:956:33: ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\'') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='\'') ) {
                        int LA22_3 = input.LA(3);

                        if ( (LA22_3=='\'') ) {
                            alt22=2;
                        }
                        else if ( ((LA22_3 >= '\u0000' && LA22_3 <= '&')||(LA22_3 >= '(' && LA22_3 <= '\uFFFF')) ) {
                            alt22=1;
                        }


                    }
                    else if ( ((LA22_1 >= '\u0000' && LA22_1 <= '&')||(LA22_1 >= '(' && LA22_1 <= '\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '&')||(LA22_0 >= '(' && LA22_0 <= '\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:956:60: ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    {
            	    // com\\googlecode\\sparkleg\\Sparql.g:956:60: ( '\\'' | '\\'\\'' )?
            	    int alt20=3;
            	    switch ( input.LA(1) ) {
            	        case '\'':
            	            {
            	            int LA20_1 = input.LA(2);

            	            if ( (LA20_1=='\'') ) {
            	                alt20=2;
            	            }
            	            else if ( ((LA20_1 >= '\u0000' && LA20_1 <= '&')||(LA20_1 >= '(' && LA20_1 <= '\uFFFF')) ) {
            	                alt20=1;
            	            }
            	            }
            	            break;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:956:61: '\\''
            	            {
            	            match('\''); if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:956:68: '\\'\\''
            	            {
            	            match("''"); if (state.failed) return ;



            	            }
            	            break;

            	    }


            	    // com\\googlecode\\sparkleg\\Sparql.g:956:77: (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( ((LA21_0 >= '\u0000' && LA21_0 <= '&')||(LA21_0 >= '(' && LA21_0 <= '[')||(LA21_0 >= ']' && LA21_0 <= '\uFFFF')) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0=='\\') ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:956:78: ~ ( '\\'' | '\\\\' )
            	            {
            	            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	                input.consume();
            	                state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return ;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;
            	            }


            	            }
            	            break;
            	        case 2 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:956:93: ECHAR
            	            {
            	            mECHAR(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            match("'''"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL_LONG1"

    // $ANTLR start "STRING_LITERAL_LONG2"
    public final void mSTRING_LITERAL_LONG2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:958:22: ( '\"\"\"' ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"' )
            // com\\googlecode\\sparkleg\\Sparql.g:958:24: '\"\"\"' ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"'
            {
            match("\"\"\""); if (state.failed) return ;



            // com\\googlecode\\sparkleg\\Sparql.g:958:30: ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\"') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='\"') ) {
                        int LA25_3 = input.LA(3);

                        if ( (LA25_3=='\"') ) {
                            alt25=2;
                        }
                        else if ( ((LA25_3 >= '\u0000' && LA25_3 <= '!')||(LA25_3 >= '#' && LA25_3 <= '\uFFFF')) ) {
                            alt25=1;
                        }


                    }
                    else if ( ((LA25_1 >= '\u0000' && LA25_1 <= '!')||(LA25_1 >= '#' && LA25_1 <= '\uFFFF')) ) {
                        alt25=1;
                    }


                }
                else if ( ((LA25_0 >= '\u0000' && LA25_0 <= '!')||(LA25_0 >= '#' && LA25_0 <= '\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:958:57: ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR )
            	    {
            	    // com\\googlecode\\sparkleg\\Sparql.g:958:57: ( '\"' | '\"\"' )?
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	        case '\"':
            	            {
            	            int LA23_1 = input.LA(2);

            	            if ( (LA23_1=='\"') ) {
            	                alt23=2;
            	            }
            	            else if ( ((LA23_1 >= '\u0000' && LA23_1 <= '!')||(LA23_1 >= '#' && LA23_1 <= '\uFFFF')) ) {
            	                alt23=1;
            	            }
            	            }
            	            break;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:958:58: '\"'
            	            {
            	            match('\"'); if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:958:64: '\"\"'
            	            {
            	            match("\"\""); if (state.failed) return ;



            	            }
            	            break;

            	    }


            	    // com\\googlecode\\sparkleg\\Sparql.g:958:71: (~ ( '\"' | '\\\\' ) | ECHAR )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( ((LA24_0 >= '\u0000' && LA24_0 <= '!')||(LA24_0 >= '#' && LA24_0 <= '[')||(LA24_0 >= ']' && LA24_0 <= '\uFFFF')) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0=='\\') ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:958:72: ~ ( '\"' | '\\\\' )
            	            {
            	            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	                input.consume();
            	                state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return ;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;
            	            }


            	            }
            	            break;
            	        case 2 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:958:86: ECHAR
            	            {
            	            mECHAR(); if (state.failed) return ;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            match("\"\"\""); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL_LONG2"

    // $ANTLR start "ECHAR"
    public final void mECHAR() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:962:7: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // com\\googlecode\\sparkleg\\Sparql.g:962:9: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
            {
            match('\\'); if (state.failed) return ;

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ECHAR"

    // $ANTLR start "IRI_REF"
    public final void mIRI_REF() throws RecognitionException {
        try {
            int _type = IRI_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:964:5: ( ( LESS ( options {greedy=false; } : IRI_REF_CHARACTERS )* GREATER )=> LESS ( options {greedy=false; } : IRI_REF_CHARACTERS )* GREATER | LESS )
            int alt27=2;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1=='!'||(LA27_1 >= '#' && LA27_1 <= ';')||LA27_1=='='||(LA27_1 >= '?' && LA27_1 <= '[')||LA27_1==']'||LA27_1=='_'||(LA27_1 >= 'a' && LA27_1 <= 'z')||(LA27_1 >= '~' && LA27_1 <= '\uFFFF')) && (synpred1_Sparql())) {
                    alt27=1;
                }
                else if ( (LA27_1=='>') && (synpred1_Sparql())) {
                    alt27=1;
                }
                else {
                    alt27=2;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:964:6: ( LESS ( options {greedy=false; } : IRI_REF_CHARACTERS )* GREATER )=> LESS ( options {greedy=false; } : IRI_REF_CHARACTERS )* GREATER
                    {
                    mLESS(); if (state.failed) return ;


                    // com\\googlecode\\sparkleg\\Sparql.g:964:76: ( options {greedy=false; } : IRI_REF_CHARACTERS )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='!'||(LA26_0 >= '#' && LA26_0 <= ';')||LA26_0=='='||(LA26_0 >= '?' && LA26_0 <= '[')||LA26_0==']'||LA26_0=='_'||(LA26_0 >= 'a' && LA26_0 <= 'z')||(LA26_0 >= '~' && LA26_0 <= '\uFFFF')) ) {
                            alt26=1;
                        }
                        else if ( (LA26_0=='>') ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:964:101: IRI_REF_CHARACTERS
                    	    {
                    	    mIRI_REF_CHARACTERS(); if (state.failed) return ;


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    mGREATER(); if (state.failed) return ;


                    if ( state.backtracking==0 ) { setText(getText().substring(1, getText().length()-1)); }

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:965:7: LESS
                    {
                    mLESS(); if (state.failed) return ;


                    if ( state.backtracking==0 ) { _type = LESS; }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IRI_REF"

    // $ANTLR start "IRI_REF_CHARACTERS"
    public final void mIRI_REF_CHARACTERS() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:971:5: (~ ( LESS | GREATER | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | PIPE | INVERSE | '`' | '\\\\' | ( '\\u0000' .. '\\u0020' ) ) )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            if ( input.LA(1)=='!'||(input.LA(1) >= '#' && input.LA(1) <= ';')||input.LA(1)=='='||(input.LA(1) >= '?' && input.LA(1) <= '[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IRI_REF_CHARACTERS"

    // $ANTLR start "PN_CHARS_U"
    public final void mPN_CHARS_U() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:975:12: ( PN_CHARS_BASE | '_' )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u02FF')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PN_CHARS_U"

    // $ANTLR start "VARNAME"
    public final void mVARNAME() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:978:9: ( ( PN_CHARS_U | DIGIT ) ( PN_CHARS_U | DIGIT | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )* )
            // com\\googlecode\\sparkleg\\Sparql.g:978:11: ( PN_CHARS_U | DIGIT ) ( PN_CHARS_U | DIGIT | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u02FF')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // com\\googlecode\\sparkleg\\Sparql.g:978:32: ( PN_CHARS_U | DIGIT | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0 >= '0' && LA28_0 <= '9')||(LA28_0 >= 'A' && LA28_0 <= 'Z')||LA28_0=='_'||(LA28_0 >= 'a' && LA28_0 <= 'z')||LA28_0=='\u00B7'||(LA28_0 >= '\u00C0' && LA28_0 <= '\u00D6')||(LA28_0 >= '\u00D8' && LA28_0 <= '\u00F6')||(LA28_0 >= '\u00F8' && LA28_0 <= '\u037D')||(LA28_0 >= '\u037F' && LA28_0 <= '\u1FFF')||(LA28_0 >= '\u200C' && LA28_0 <= '\u200D')||(LA28_0 >= '\u203F' && LA28_0 <= '\u2040')||(LA28_0 >= '\u2070' && LA28_0 <= '\u218F')||(LA28_0 >= '\u2C00' && LA28_0 <= '\u2FEF')||(LA28_0 >= '\u3001' && LA28_0 <= '\uD7FF')||(LA28_0 >= '\uF900' && LA28_0 <= '\uFDCF')||(LA28_0 >= '\uFDF0' && LA28_0 <= '\uFFFD')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00B7'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
            	        input.consume();
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARNAME"

    // $ANTLR start "PN_CHARS"
    public final void mPN_CHARS() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:982:5: ( PN_CHARS_U | MINUS | DIGIT | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00B7'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PN_CHARS"

    // $ANTLR start "PN_PREFIX"
    public final void mPN_PREFIX() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:991:11: ( PN_CHARS_BASE ( ( PN_CHARS | DOT )* PN_CHARS )? )
            // com\\googlecode\\sparkleg\\Sparql.g:991:13: PN_CHARS_BASE ( ( PN_CHARS | DOT )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); if (state.failed) return ;


            // com\\googlecode\\sparkleg\\Sparql.g:991:27: ( ( PN_CHARS | DOT )* PN_CHARS )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0 >= '-' && LA30_0 <= '.')||(LA30_0 >= '0' && LA30_0 <= '9')||(LA30_0 >= 'A' && LA30_0 <= 'Z')||LA30_0=='_'||(LA30_0 >= 'a' && LA30_0 <= 'z')||LA30_0=='\u00B7'||(LA30_0 >= '\u00C0' && LA30_0 <= '\u00D6')||(LA30_0 >= '\u00D8' && LA30_0 <= '\u00F6')||(LA30_0 >= '\u00F8' && LA30_0 <= '\u037D')||(LA30_0 >= '\u037F' && LA30_0 <= '\u1FFF')||(LA30_0 >= '\u200C' && LA30_0 <= '\u200D')||(LA30_0 >= '\u203F' && LA30_0 <= '\u2040')||(LA30_0 >= '\u2070' && LA30_0 <= '\u218F')||(LA30_0 >= '\u2C00' && LA30_0 <= '\u2FEF')||(LA30_0 >= '\u3001' && LA30_0 <= '\uD7FF')||(LA30_0 >= '\uF900' && LA30_0 <= '\uFDCF')||(LA30_0 >= '\uFDF0' && LA30_0 <= '\uFFFD')) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:991:28: ( PN_CHARS | DOT )* PN_CHARS
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:991:28: ( PN_CHARS | DOT )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='-'||(LA29_0 >= '0' && LA29_0 <= '9')||(LA29_0 >= 'A' && LA29_0 <= 'Z')||LA29_0=='_'||(LA29_0 >= 'a' && LA29_0 <= 'z')||LA29_0=='\u00B7'||(LA29_0 >= '\u00C0' && LA29_0 <= '\u00D6')||(LA29_0 >= '\u00D8' && LA29_0 <= '\u00F6')||(LA29_0 >= '\u00F8' && LA29_0 <= '\u037D')||(LA29_0 >= '\u037F' && LA29_0 <= '\u1FFF')||(LA29_0 >= '\u200C' && LA29_0 <= '\u200D')||(LA29_0 >= '\u203F' && LA29_0 <= '\u2040')||(LA29_0 >= '\u2070' && LA29_0 <= '\u218F')||(LA29_0 >= '\u2C00' && LA29_0 <= '\u2FEF')||(LA29_0 >= '\u3001' && LA29_0 <= '\uD7FF')||(LA29_0 >= '\uF900' && LA29_0 <= '\uFDCF')||(LA29_0 >= '\uFDF0' && LA29_0 <= '\uFFFD')) ) {
                            int LA29_1 = input.LA(2);

                            if ( ((LA29_1 >= '-' && LA29_1 <= '.')||(LA29_1 >= '0' && LA29_1 <= '9')||(LA29_1 >= 'A' && LA29_1 <= 'Z')||LA29_1=='_'||(LA29_1 >= 'a' && LA29_1 <= 'z')||LA29_1=='\u00B7'||(LA29_1 >= '\u00C0' && LA29_1 <= '\u00D6')||(LA29_1 >= '\u00D8' && LA29_1 <= '\u00F6')||(LA29_1 >= '\u00F8' && LA29_1 <= '\u037D')||(LA29_1 >= '\u037F' && LA29_1 <= '\u1FFF')||(LA29_1 >= '\u200C' && LA29_1 <= '\u200D')||(LA29_1 >= '\u203F' && LA29_1 <= '\u2040')||(LA29_1 >= '\u2070' && LA29_1 <= '\u218F')||(LA29_1 >= '\u2C00' && LA29_1 <= '\u2FEF')||(LA29_1 >= '\u3001' && LA29_1 <= '\uD7FF')||(LA29_1 >= '\uF900' && LA29_1 <= '\uFDCF')||(LA29_1 >= '\uFDF0' && LA29_1 <= '\uFFFD')) ) {
                                alt29=1;
                            }


                        }
                        else if ( (LA29_0=='.') ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:
                    	    {
                    	    if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00B7'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
                    	        input.consume();
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    mPN_CHARS(); if (state.failed) return ;


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PN_PREFIX"

    // $ANTLR start "PN_LOCAL"
    public final void mPN_LOCAL() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:994:10: ( ( PN_CHARS_U | DIGIT ) ( ( PN_CHARS | DOT )* PN_CHARS )? )
            // com\\googlecode\\sparkleg\\Sparql.g:994:12: ( PN_CHARS_U | DIGIT ) ( ( PN_CHARS | DOT )* PN_CHARS )?
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u02FF')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // com\\googlecode\\sparkleg\\Sparql.g:994:32: ( ( PN_CHARS | DOT )* PN_CHARS )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0 >= '-' && LA32_0 <= '.')||(LA32_0 >= '0' && LA32_0 <= '9')||(LA32_0 >= 'A' && LA32_0 <= 'Z')||LA32_0=='_'||(LA32_0 >= 'a' && LA32_0 <= 'z')||LA32_0=='\u00B7'||(LA32_0 >= '\u00C0' && LA32_0 <= '\u00D6')||(LA32_0 >= '\u00D8' && LA32_0 <= '\u00F6')||(LA32_0 >= '\u00F8' && LA32_0 <= '\u037D')||(LA32_0 >= '\u037F' && LA32_0 <= '\u1FFF')||(LA32_0 >= '\u200C' && LA32_0 <= '\u200D')||(LA32_0 >= '\u203F' && LA32_0 <= '\u2040')||(LA32_0 >= '\u2070' && LA32_0 <= '\u218F')||(LA32_0 >= '\u2C00' && LA32_0 <= '\u2FEF')||(LA32_0 >= '\u3001' && LA32_0 <= '\uD7FF')||(LA32_0 >= '\uF900' && LA32_0 <= '\uFDCF')||(LA32_0 >= '\uFDF0' && LA32_0 <= '\uFFFD')) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:994:33: ( PN_CHARS | DOT )* PN_CHARS
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:994:33: ( PN_CHARS | DOT )*
                    loop31:
                    do {
                        int alt31=3;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0=='-'||(LA31_0 >= '0' && LA31_0 <= '9')||(LA31_0 >= 'A' && LA31_0 <= 'Z')||LA31_0=='_'||(LA31_0 >= 'a' && LA31_0 <= 'z')||LA31_0=='\u00B7'||(LA31_0 >= '\u00C0' && LA31_0 <= '\u00D6')||(LA31_0 >= '\u00D8' && LA31_0 <= '\u00F6')||(LA31_0 >= '\u00F8' && LA31_0 <= '\u037D')||(LA31_0 >= '\u037F' && LA31_0 <= '\u1FFF')||(LA31_0 >= '\u200C' && LA31_0 <= '\u200D')||(LA31_0 >= '\u203F' && LA31_0 <= '\u2040')||(LA31_0 >= '\u2070' && LA31_0 <= '\u218F')||(LA31_0 >= '\u2C00' && LA31_0 <= '\u2FEF')||(LA31_0 >= '\u3001' && LA31_0 <= '\uD7FF')||(LA31_0 >= '\uF900' && LA31_0 <= '\uFDCF')||(LA31_0 >= '\uFDF0' && LA31_0 <= '\uFFFD')) ) {
                            int LA31_1 = input.LA(2);

                            if ( ((LA31_1 >= '-' && LA31_1 <= '.')||(LA31_1 >= '0' && LA31_1 <= '9')||(LA31_1 >= 'A' && LA31_1 <= 'Z')||LA31_1=='_'||(LA31_1 >= 'a' && LA31_1 <= 'z')||LA31_1=='\u00B7'||(LA31_1 >= '\u00C0' && LA31_1 <= '\u00D6')||(LA31_1 >= '\u00D8' && LA31_1 <= '\u00F6')||(LA31_1 >= '\u00F8' && LA31_1 <= '\u037D')||(LA31_1 >= '\u037F' && LA31_1 <= '\u1FFF')||(LA31_1 >= '\u200C' && LA31_1 <= '\u200D')||(LA31_1 >= '\u203F' && LA31_1 <= '\u2040')||(LA31_1 >= '\u2070' && LA31_1 <= '\u218F')||(LA31_1 >= '\u2C00' && LA31_1 <= '\u2FEF')||(LA31_1 >= '\u3001' && LA31_1 <= '\uD7FF')||(LA31_1 >= '\uF900' && LA31_1 <= '\uFDCF')||(LA31_1 >= '\uFDF0' && LA31_1 <= '\uFFFD')) ) {
                                alt31=1;
                            }


                        }
                        else if ( (LA31_0=='.') ) {
                            alt31=2;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:994:34: PN_CHARS
                    	    {
                    	    mPN_CHARS(); if (state.failed) return ;


                    	    }
                    	    break;
                    	case 2 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:994:43: DOT
                    	    {
                    	    if ( state.backtracking==0 ) {    
                    	                        	                       if (input.LA(1)=='.') {
                    	                        	                          int LA2 = input.LA(2);
                    	                        	       	                  if (!((LA2>='-' && LA2<='.')||(LA2>='0' && LA2<='9')||(LA2>='A' && LA2<='Z')||LA2=='_'||(LA2>='a' && LA2<='z')||LA2=='\u00B7'||(LA2>='\u00C0' && LA2<='\u00D6')||(LA2>='\u00D8' && LA2<='\u00F6')||(LA2>='\u00F8' && LA2<='\u037D')||(LA2>='\u037F' && LA2<='\u1FFF')||(LA2>='\u200C' && LA2<='\u200D')||(LA2>='\u203F' && LA2<='\u2040')||(LA2>='\u2070' && LA2<='\u218F')||(LA2>='\u2C00' && LA2<='\u2FEF')||(LA2>='\u3001' && LA2<='\uD7FF')||(LA2>='\uF900' && LA2<='\uFDCF')||(LA2>='\uFDF0' && LA2<='\uFFFD'))) {
                    	                        	       	                     return;
                    	                        	       	                  }
                    	                        	                       }
                    	                                               }

                    	    mDOT(); if (state.failed) return ;


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    mPN_CHARS(); if (state.failed) return ;


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PN_LOCAL"

    // $ANTLR start "PN_CHARS_BASE"
    public final void mPN_CHARS_BASE() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:1005:5: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u02FF')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PN_CHARS_BASE"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:1021:7: ( '0' .. '9' )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1022:9: ( '#' ( options {greedy=false; } : . )* EOL )
            // com\\googlecode\\sparkleg\\Sparql.g:1022:11: '#' ( options {greedy=false; } : . )* EOL
            {
            match('#'); if (state.failed) return ;

            // com\\googlecode\\sparkleg\\Sparql.g:1022:15: ( options {greedy=false; } : . )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='\n'||LA33_0=='\r') ) {
                    alt33=2;
                }
                else if ( ((LA33_0 >= '\u0000' && LA33_0 <= '\t')||(LA33_0 >= '\u000B' && LA33_0 <= '\f')||(LA33_0 >= '\u000E' && LA33_0 <= '\uFFFF')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:1022:41: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            mEOL(); if (state.failed) return ;


            if ( state.backtracking==0 ) { _channel=HIDDEN; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "EOL"
    public final void mEOL() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:1026:5: ( '\\n' | '\\r' )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EOL"

    // $ANTLR start "REFERENCE"
    public final void mREFERENCE() throws RecognitionException {
        try {
            int _type = REFERENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1027:11: ( '^^' )
            // com\\googlecode\\sparkleg\\Sparql.g:1027:13: '^^'
            {
            match("^^"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REFERENCE"

    // $ANTLR start "LESS_EQUAL"
    public final void mLESS_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1029:12: ( '<=' )
            // com\\googlecode\\sparkleg\\Sparql.g:1029:14: '<='
            {
            match("<="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_EQUAL"

    // $ANTLR start "GREATER_EQUAL"
    public final void mGREATER_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1031:15: ( '>=' )
            // com\\googlecode\\sparkleg\\Sparql.g:1031:17: '>='
            {
            match(">="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1033:11: ( '!=' )
            // com\\googlecode\\sparkleg\\Sparql.g:1033:13: '!='
            {
            match("!="); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1035:5: ( '&&' )
            // com\\googlecode\\sparkleg\\Sparql.g:1035:7: '&&'
            {
            match("&&"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1037:4: ( '||' )
            // com\\googlecode\\sparkleg\\Sparql.g:1037:6: '||'
            {
            match("||"); if (state.failed) return ;



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "INVERSE"
    public final void mINVERSE() throws RecognitionException {
        try {
            int _type = INVERSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1039:9: ( '^' )
            // com\\googlecode\\sparkleg\\Sparql.g:1039:11: '^'
            {
            match('^'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INVERSE"

    // $ANTLR start "OPEN_BRACE"
    public final void mOPEN_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1041:12: ( '(' )
            // com\\googlecode\\sparkleg\\Sparql.g:1041:14: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_BRACE"

    // $ANTLR start "CLOSE_BRACE"
    public final void mCLOSE_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1043:13: ( ')' )
            // com\\googlecode\\sparkleg\\Sparql.g:1043:15: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_BRACE"

    // $ANTLR start "OPEN_CURLY_BRACE"
    public final void mOPEN_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1045:18: ( '{' )
            // com\\googlecode\\sparkleg\\Sparql.g:1045:20: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_CURLY_BRACE"

    // $ANTLR start "CLOSE_CURLY_BRACE"
    public final void mCLOSE_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1047:19: ( '}' )
            // com\\googlecode\\sparkleg\\Sparql.g:1047:21: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_CURLY_BRACE"

    // $ANTLR start "OPEN_SQUARE_BRACKET"
    public final void mOPEN_SQUARE_BRACKET() throws RecognitionException {
        try {
            int _type = OPEN_SQUARE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1049:21: ( '[' )
            // com\\googlecode\\sparkleg\\Sparql.g:1049:23: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPEN_SQUARE_BRACKET"

    // $ANTLR start "CLOSE_SQUARE_BRACKET"
    public final void mCLOSE_SQUARE_BRACKET() throws RecognitionException {
        try {
            int _type = CLOSE_SQUARE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1051:22: ( ']' )
            // com\\googlecode\\sparkleg\\Sparql.g:1051:24: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSE_SQUARE_BRACKET"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1053:11: ( ';' )
            // com\\googlecode\\sparkleg\\Sparql.g:1053:13: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1055:5: ( '.' )
            // com\\googlecode\\sparkleg\\Sparql.g:1055:7: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1057:6: ( '+' )
            // com\\googlecode\\sparkleg\\Sparql.g:1057:8: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1059:7: ( '-' )
            // com\\googlecode\\sparkleg\\Sparql.g:1059:9: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "SIGN"
    public final void mSIGN() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:1063:6: ( ( PLUS | MINUS ) )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIGN"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1064:10: ( '*' )
            // com\\googlecode\\sparkleg\\Sparql.g:1064:12: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "QUESTION_MARK"
    public final void mQUESTION_MARK() throws RecognitionException {
        try {
            int _type = QUESTION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1066:15: ( '?' )
            // com\\googlecode\\sparkleg\\Sparql.g:1066:17: '?'
            {
            match('?'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION_MARK"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1068:7: ( ',' )
            // com\\googlecode\\sparkleg\\Sparql.g:1068:9: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "NEGATION"
    public final void mNEGATION() throws RecognitionException {
        try {
            int _type = NEGATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1070:10: ( '!' )
            // com\\googlecode\\sparkleg\\Sparql.g:1070:12: '!'
            {
            match('!'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEGATION"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1072:8: ( '/' )
            // com\\googlecode\\sparkleg\\Sparql.g:1072:10: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1074:7: ( '=' )
            // com\\googlecode\\sparkleg\\Sparql.g:1074:9: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:1078:6: ( '<' )
            // com\\googlecode\\sparkleg\\Sparql.g:1078:8: '<'
            {
            match('<'); if (state.failed) return ;

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1079:9: ( '>' )
            // com\\googlecode\\sparkleg\\Sparql.g:1079:11: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1081:6: ( '|' )
            // com\\googlecode\\sparkleg\\Sparql.g:1081:8: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "ANY"
    public final void mANY() throws RecognitionException {
        try {
            int _type = ANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com\\googlecode\\sparkleg\\Sparql.g:1083:5: ( . )
            // com\\googlecode\\sparkleg\\Sparql.g:1083:7: .
            {
            matchAny(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ANY"

    public void mTokens() throws RecognitionException {
        // com\\googlecode\\sparkleg\\Sparql.g:1:8: ( WS | BASE | PREFIX | SELECT | DISTINCT | REDUCED | CONSTRUCT | DESCRIBE | ASK | FROM | NAMED | WHERE | ORDER | BY | ASC | DESC | LIMIT | OFFSET | OPTIONAL | GRAPH | UNION | FILTER | A | STR | LANG | LANGMATCHES | DATATYPE | BOUND | SAMETERM | ISIRI | ISURI | ISBLANK | ISLITERAL | REGEX | SUBSTR | TRUE | FALSE | LOAD | CLEAR | DROP | ADD | MOVE | COPY | CREATE | DELETE | INSERT | USING | SILENT | DEFAULT | ALL | DATA | WITH | INTO | TO | AS | GROUP | HAVING | UNDEF | BINDINGS | SERVICE | BIND | MINUS_KEYWORD | IRI | URI | BNODE | RAND | ABS | CEIL | FLOOR | ROUND | CONCAT | STRLEN | UCASE | LCASE | ENCODE_FOR_URI | CONTAINS | STRSTARTS | STRENDS | STRBEFORE | STRAFTER | REPLACE | YEAR | MONTH | DAY | HOURS | MINUTES | SECONDS | TIMEZONE | TZ | NOW | MD5 | SHA1 | SHA224 | SHA256 | SHA384 | SHA512 | COALESCE | IF | STRLANG | STRDT | ISNUMERIC | COUNT | SUM | MIN | MAX | AVG | SAMPLE | GROUP_CONCAT | NOT | IN | EXISTS | SEPARATOR | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | IRI_REF | COMMENT | REFERENCE | LESS_EQUAL | GREATER_EQUAL | NOT_EQUAL | AND | OR | INVERSE | OPEN_BRACE | CLOSE_BRACE | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | OPEN_SQUARE_BRACKET | CLOSE_SQUARE_BRACKET | SEMICOLON | DOT | PLUS | MINUS | ASTERISK | QUESTION_MARK | COMMA | NEGATION | DIVIDE | EQUAL | GREATER | PIPE | ANY )
        int alt34=159;
        alt34 = dfa34.predict(input);
        switch (alt34) {
            case 1 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:10: WS
                {
                mWS(); if (state.failed) return ;


                }
                break;
            case 2 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:13: BASE
                {
                mBASE(); if (state.failed) return ;


                }
                break;
            case 3 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:18: PREFIX
                {
                mPREFIX(); if (state.failed) return ;


                }
                break;
            case 4 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:25: SELECT
                {
                mSELECT(); if (state.failed) return ;


                }
                break;
            case 5 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:32: DISTINCT
                {
                mDISTINCT(); if (state.failed) return ;


                }
                break;
            case 6 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:41: REDUCED
                {
                mREDUCED(); if (state.failed) return ;


                }
                break;
            case 7 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:49: CONSTRUCT
                {
                mCONSTRUCT(); if (state.failed) return ;


                }
                break;
            case 8 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:59: DESCRIBE
                {
                mDESCRIBE(); if (state.failed) return ;


                }
                break;
            case 9 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:68: ASK
                {
                mASK(); if (state.failed) return ;


                }
                break;
            case 10 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:72: FROM
                {
                mFROM(); if (state.failed) return ;


                }
                break;
            case 11 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:77: NAMED
                {
                mNAMED(); if (state.failed) return ;


                }
                break;
            case 12 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:83: WHERE
                {
                mWHERE(); if (state.failed) return ;


                }
                break;
            case 13 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:89: ORDER
                {
                mORDER(); if (state.failed) return ;


                }
                break;
            case 14 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:95: BY
                {
                mBY(); if (state.failed) return ;


                }
                break;
            case 15 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:98: ASC
                {
                mASC(); if (state.failed) return ;


                }
                break;
            case 16 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:102: DESC
                {
                mDESC(); if (state.failed) return ;


                }
                break;
            case 17 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:107: LIMIT
                {
                mLIMIT(); if (state.failed) return ;


                }
                break;
            case 18 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:113: OFFSET
                {
                mOFFSET(); if (state.failed) return ;


                }
                break;
            case 19 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:120: OPTIONAL
                {
                mOPTIONAL(); if (state.failed) return ;


                }
                break;
            case 20 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:129: GRAPH
                {
                mGRAPH(); if (state.failed) return ;


                }
                break;
            case 21 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:135: UNION
                {
                mUNION(); if (state.failed) return ;


                }
                break;
            case 22 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:141: FILTER
                {
                mFILTER(); if (state.failed) return ;


                }
                break;
            case 23 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:148: A
                {
                mA(); if (state.failed) return ;


                }
                break;
            case 24 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:150: STR
                {
                mSTR(); if (state.failed) return ;


                }
                break;
            case 25 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:154: LANG
                {
                mLANG(); if (state.failed) return ;


                }
                break;
            case 26 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:159: LANGMATCHES
                {
                mLANGMATCHES(); if (state.failed) return ;


                }
                break;
            case 27 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:171: DATATYPE
                {
                mDATATYPE(); if (state.failed) return ;


                }
                break;
            case 28 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:180: BOUND
                {
                mBOUND(); if (state.failed) return ;


                }
                break;
            case 29 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:186: SAMETERM
                {
                mSAMETERM(); if (state.failed) return ;


                }
                break;
            case 30 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:195: ISIRI
                {
                mISIRI(); if (state.failed) return ;


                }
                break;
            case 31 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:201: ISURI
                {
                mISURI(); if (state.failed) return ;


                }
                break;
            case 32 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:207: ISBLANK
                {
                mISBLANK(); if (state.failed) return ;


                }
                break;
            case 33 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:215: ISLITERAL
                {
                mISLITERAL(); if (state.failed) return ;


                }
                break;
            case 34 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:225: REGEX
                {
                mREGEX(); if (state.failed) return ;


                }
                break;
            case 35 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:231: SUBSTR
                {
                mSUBSTR(); if (state.failed) return ;


                }
                break;
            case 36 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:238: TRUE
                {
                mTRUE(); if (state.failed) return ;


                }
                break;
            case 37 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:243: FALSE
                {
                mFALSE(); if (state.failed) return ;


                }
                break;
            case 38 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:249: LOAD
                {
                mLOAD(); if (state.failed) return ;


                }
                break;
            case 39 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:254: CLEAR
                {
                mCLEAR(); if (state.failed) return ;


                }
                break;
            case 40 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:260: DROP
                {
                mDROP(); if (state.failed) return ;


                }
                break;
            case 41 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:265: ADD
                {
                mADD(); if (state.failed) return ;


                }
                break;
            case 42 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:269: MOVE
                {
                mMOVE(); if (state.failed) return ;


                }
                break;
            case 43 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:274: COPY
                {
                mCOPY(); if (state.failed) return ;


                }
                break;
            case 44 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:279: CREATE
                {
                mCREATE(); if (state.failed) return ;


                }
                break;
            case 45 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:286: DELETE
                {
                mDELETE(); if (state.failed) return ;


                }
                break;
            case 46 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:293: INSERT
                {
                mINSERT(); if (state.failed) return ;


                }
                break;
            case 47 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:300: USING
                {
                mUSING(); if (state.failed) return ;


                }
                break;
            case 48 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:306: SILENT
                {
                mSILENT(); if (state.failed) return ;


                }
                break;
            case 49 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:313: DEFAULT
                {
                mDEFAULT(); if (state.failed) return ;


                }
                break;
            case 50 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:321: ALL
                {
                mALL(); if (state.failed) return ;


                }
                break;
            case 51 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:325: DATA
                {
                mDATA(); if (state.failed) return ;


                }
                break;
            case 52 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:330: WITH
                {
                mWITH(); if (state.failed) return ;


                }
                break;
            case 53 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:335: INTO
                {
                mINTO(); if (state.failed) return ;


                }
                break;
            case 54 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:340: TO
                {
                mTO(); if (state.failed) return ;


                }
                break;
            case 55 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:343: AS
                {
                mAS(); if (state.failed) return ;


                }
                break;
            case 56 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:346: GROUP
                {
                mGROUP(); if (state.failed) return ;


                }
                break;
            case 57 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:352: HAVING
                {
                mHAVING(); if (state.failed) return ;


                }
                break;
            case 58 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:359: UNDEF
                {
                mUNDEF(); if (state.failed) return ;


                }
                break;
            case 59 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:365: BINDINGS
                {
                mBINDINGS(); if (state.failed) return ;


                }
                break;
            case 60 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:374: SERVICE
                {
                mSERVICE(); if (state.failed) return ;


                }
                break;
            case 61 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:382: BIND
                {
                mBIND(); if (state.failed) return ;


                }
                break;
            case 62 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:387: MINUS_KEYWORD
                {
                mMINUS_KEYWORD(); if (state.failed) return ;


                }
                break;
            case 63 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:401: IRI
                {
                mIRI(); if (state.failed) return ;


                }
                break;
            case 64 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:405: URI
                {
                mURI(); if (state.failed) return ;


                }
                break;
            case 65 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:409: BNODE
                {
                mBNODE(); if (state.failed) return ;


                }
                break;
            case 66 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:415: RAND
                {
                mRAND(); if (state.failed) return ;


                }
                break;
            case 67 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:420: ABS
                {
                mABS(); if (state.failed) return ;


                }
                break;
            case 68 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:424: CEIL
                {
                mCEIL(); if (state.failed) return ;


                }
                break;
            case 69 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:429: FLOOR
                {
                mFLOOR(); if (state.failed) return ;


                }
                break;
            case 70 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:435: ROUND
                {
                mROUND(); if (state.failed) return ;


                }
                break;
            case 71 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:441: CONCAT
                {
                mCONCAT(); if (state.failed) return ;


                }
                break;
            case 72 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:448: STRLEN
                {
                mSTRLEN(); if (state.failed) return ;


                }
                break;
            case 73 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:455: UCASE
                {
                mUCASE(); if (state.failed) return ;


                }
                break;
            case 74 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:461: LCASE
                {
                mLCASE(); if (state.failed) return ;


                }
                break;
            case 75 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:467: ENCODE_FOR_URI
                {
                mENCODE_FOR_URI(); if (state.failed) return ;


                }
                break;
            case 76 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:482: CONTAINS
                {
                mCONTAINS(); if (state.failed) return ;


                }
                break;
            case 77 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:491: STRSTARTS
                {
                mSTRSTARTS(); if (state.failed) return ;


                }
                break;
            case 78 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:501: STRENDS
                {
                mSTRENDS(); if (state.failed) return ;


                }
                break;
            case 79 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:509: STRBEFORE
                {
                mSTRBEFORE(); if (state.failed) return ;


                }
                break;
            case 80 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:519: STRAFTER
                {
                mSTRAFTER(); if (state.failed) return ;


                }
                break;
            case 81 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:528: REPLACE
                {
                mREPLACE(); if (state.failed) return ;


                }
                break;
            case 82 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:536: YEAR
                {
                mYEAR(); if (state.failed) return ;


                }
                break;
            case 83 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:541: MONTH
                {
                mMONTH(); if (state.failed) return ;


                }
                break;
            case 84 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:547: DAY
                {
                mDAY(); if (state.failed) return ;


                }
                break;
            case 85 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:551: HOURS
                {
                mHOURS(); if (state.failed) return ;


                }
                break;
            case 86 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:557: MINUTES
                {
                mMINUTES(); if (state.failed) return ;


                }
                break;
            case 87 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:565: SECONDS
                {
                mSECONDS(); if (state.failed) return ;


                }
                break;
            case 88 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:573: TIMEZONE
                {
                mTIMEZONE(); if (state.failed) return ;


                }
                break;
            case 89 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:582: TZ
                {
                mTZ(); if (state.failed) return ;


                }
                break;
            case 90 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:585: NOW
                {
                mNOW(); if (state.failed) return ;


                }
                break;
            case 91 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:589: MD5
                {
                mMD5(); if (state.failed) return ;


                }
                break;
            case 92 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:593: SHA1
                {
                mSHA1(); if (state.failed) return ;


                }
                break;
            case 93 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:598: SHA224
                {
                mSHA224(); if (state.failed) return ;


                }
                break;
            case 94 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:605: SHA256
                {
                mSHA256(); if (state.failed) return ;


                }
                break;
            case 95 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:612: SHA384
                {
                mSHA384(); if (state.failed) return ;


                }
                break;
            case 96 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:619: SHA512
                {
                mSHA512(); if (state.failed) return ;


                }
                break;
            case 97 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:626: COALESCE
                {
                mCOALESCE(); if (state.failed) return ;


                }
                break;
            case 98 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:635: IF
                {
                mIF(); if (state.failed) return ;


                }
                break;
            case 99 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:638: STRLANG
                {
                mSTRLANG(); if (state.failed) return ;


                }
                break;
            case 100 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:646: STRDT
                {
                mSTRDT(); if (state.failed) return ;


                }
                break;
            case 101 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:652: ISNUMERIC
                {
                mISNUMERIC(); if (state.failed) return ;


                }
                break;
            case 102 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:662: COUNT
                {
                mCOUNT(); if (state.failed) return ;


                }
                break;
            case 103 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:668: SUM
                {
                mSUM(); if (state.failed) return ;


                }
                break;
            case 104 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:672: MIN
                {
                mMIN(); if (state.failed) return ;


                }
                break;
            case 105 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:676: MAX
                {
                mMAX(); if (state.failed) return ;


                }
                break;
            case 106 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:680: AVG
                {
                mAVG(); if (state.failed) return ;


                }
                break;
            case 107 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:684: SAMPLE
                {
                mSAMPLE(); if (state.failed) return ;


                }
                break;
            case 108 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:691: GROUP_CONCAT
                {
                mGROUP_CONCAT(); if (state.failed) return ;


                }
                break;
            case 109 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:704: NOT
                {
                mNOT(); if (state.failed) return ;


                }
                break;
            case 110 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:708: IN
                {
                mIN(); if (state.failed) return ;


                }
                break;
            case 111 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:711: EXISTS
                {
                mEXISTS(); if (state.failed) return ;


                }
                break;
            case 112 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:718: SEPARATOR
                {
                mSEPARATOR(); if (state.failed) return ;


                }
                break;
            case 113 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:728: PNAME_NS
                {
                mPNAME_NS(); if (state.failed) return ;


                }
                break;
            case 114 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:737: PNAME_LN
                {
                mPNAME_LN(); if (state.failed) return ;


                }
                break;
            case 115 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:746: BLANK_NODE_LABEL
                {
                mBLANK_NODE_LABEL(); if (state.failed) return ;


                }
                break;
            case 116 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:763: VAR1
                {
                mVAR1(); if (state.failed) return ;


                }
                break;
            case 117 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:768: VAR2
                {
                mVAR2(); if (state.failed) return ;


                }
                break;
            case 118 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:773: LANGTAG
                {
                mLANGTAG(); if (state.failed) return ;


                }
                break;
            case 119 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:781: INTEGER
                {
                mINTEGER(); if (state.failed) return ;


                }
                break;
            case 120 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:789: DECIMAL
                {
                mDECIMAL(); if (state.failed) return ;


                }
                break;
            case 121 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:797: DOUBLE
                {
                mDOUBLE(); if (state.failed) return ;


                }
                break;
            case 122 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:804: INTEGER_POSITIVE
                {
                mINTEGER_POSITIVE(); if (state.failed) return ;


                }
                break;
            case 123 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:821: DECIMAL_POSITIVE
                {
                mDECIMAL_POSITIVE(); if (state.failed) return ;


                }
                break;
            case 124 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:838: DOUBLE_POSITIVE
                {
                mDOUBLE_POSITIVE(); if (state.failed) return ;


                }
                break;
            case 125 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:854: INTEGER_NEGATIVE
                {
                mINTEGER_NEGATIVE(); if (state.failed) return ;


                }
                break;
            case 126 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:871: DECIMAL_NEGATIVE
                {
                mDECIMAL_NEGATIVE(); if (state.failed) return ;


                }
                break;
            case 127 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:888: DOUBLE_NEGATIVE
                {
                mDOUBLE_NEGATIVE(); if (state.failed) return ;


                }
                break;
            case 128 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:904: STRING_LITERAL1
                {
                mSTRING_LITERAL1(); if (state.failed) return ;


                }
                break;
            case 129 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:920: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); if (state.failed) return ;


                }
                break;
            case 130 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:936: STRING_LITERAL_LONG1
                {
                mSTRING_LITERAL_LONG1(); if (state.failed) return ;


                }
                break;
            case 131 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:957: STRING_LITERAL_LONG2
                {
                mSTRING_LITERAL_LONG2(); if (state.failed) return ;


                }
                break;
            case 132 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:978: IRI_REF
                {
                mIRI_REF(); if (state.failed) return ;


                }
                break;
            case 133 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:986: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;


                }
                break;
            case 134 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:994: REFERENCE
                {
                mREFERENCE(); if (state.failed) return ;


                }
                break;
            case 135 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1004: LESS_EQUAL
                {
                mLESS_EQUAL(); if (state.failed) return ;


                }
                break;
            case 136 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1015: GREATER_EQUAL
                {
                mGREATER_EQUAL(); if (state.failed) return ;


                }
                break;
            case 137 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1029: NOT_EQUAL
                {
                mNOT_EQUAL(); if (state.failed) return ;


                }
                break;
            case 138 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1039: AND
                {
                mAND(); if (state.failed) return ;


                }
                break;
            case 139 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1043: OR
                {
                mOR(); if (state.failed) return ;


                }
                break;
            case 140 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1046: INVERSE
                {
                mINVERSE(); if (state.failed) return ;


                }
                break;
            case 141 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1054: OPEN_BRACE
                {
                mOPEN_BRACE(); if (state.failed) return ;


                }
                break;
            case 142 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1065: CLOSE_BRACE
                {
                mCLOSE_BRACE(); if (state.failed) return ;


                }
                break;
            case 143 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1077: OPEN_CURLY_BRACE
                {
                mOPEN_CURLY_BRACE(); if (state.failed) return ;


                }
                break;
            case 144 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1094: CLOSE_CURLY_BRACE
                {
                mCLOSE_CURLY_BRACE(); if (state.failed) return ;


                }
                break;
            case 145 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1112: OPEN_SQUARE_BRACKET
                {
                mOPEN_SQUARE_BRACKET(); if (state.failed) return ;


                }
                break;
            case 146 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1132: CLOSE_SQUARE_BRACKET
                {
                mCLOSE_SQUARE_BRACKET(); if (state.failed) return ;


                }
                break;
            case 147 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1153: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;


                }
                break;
            case 148 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1163: DOT
                {
                mDOT(); if (state.failed) return ;


                }
                break;
            case 149 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1167: PLUS
                {
                mPLUS(); if (state.failed) return ;


                }
                break;
            case 150 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1172: MINUS
                {
                mMINUS(); if (state.failed) return ;


                }
                break;
            case 151 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1178: ASTERISK
                {
                mASTERISK(); if (state.failed) return ;


                }
                break;
            case 152 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1187: QUESTION_MARK
                {
                mQUESTION_MARK(); if (state.failed) return ;


                }
                break;
            case 153 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1201: COMMA
                {
                mCOMMA(); if (state.failed) return ;


                }
                break;
            case 154 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1207: NEGATION
                {
                mNEGATION(); if (state.failed) return ;


                }
                break;
            case 155 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1216: DIVIDE
                {
                mDIVIDE(); if (state.failed) return ;


                }
                break;
            case 156 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1223: EQUAL
                {
                mEQUAL(); if (state.failed) return ;


                }
                break;
            case 157 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1229: GREATER
                {
                mGREATER(); if (state.failed) return ;


                }
                break;
            case 158 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1237: PIPE
                {
                mPIPE(); if (state.failed) return ;


                }
                break;
            case 159 :
                // com\\googlecode\\sparkleg\\Sparql.g:1:1242: ANY
                {
                mANY(); if (state.failed) return ;


                }
                break;

        }

    }

    // $ANTLR start synpred1_Sparql
    public final void synpred1_Sparql_fragment() throws RecognitionException {
        // com\\googlecode\\sparkleg\\Sparql.g:964:6: ( LESS ( options {greedy=false; } : IRI_REF_CHARACTERS )* GREATER )
        // com\\googlecode\\sparkleg\\Sparql.g:964:7: LESS ( options {greedy=false; } : IRI_REF_CHARACTERS )* GREATER
        {
        mLESS(); if (state.failed) return ;


        // com\\googlecode\\sparkleg\\Sparql.g:964:12: ( options {greedy=false; } : IRI_REF_CHARACTERS )*
        loop35:
        do {
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='!'||(LA35_0 >= '#' && LA35_0 <= ';')||LA35_0=='='||(LA35_0 >= '?' && LA35_0 <= '[')||LA35_0==']'||LA35_0=='_'||(LA35_0 >= 'a' && LA35_0 <= 'z')||(LA35_0 >= '~' && LA35_0 <= '\uFFFF')) ) {
                alt35=1;
            }
            else if ( (LA35_0=='>') ) {
                alt35=2;
            }


            switch (alt35) {
        	case 1 :
        	    // com\\googlecode\\sparkleg\\Sparql.g:964:37: IRI_REF_CHARACTERS
        	    {
        	    mIRI_REF_CHARACTERS(); if (state.failed) return ;


        	    }
        	    break;

        	default :
        	    break loop35;
            }
        } while (true);


        mGREATER(); if (state.failed) return ;


        }

    }
    // $ANTLR end synpred1_Sparql

    public final boolean synpred1_Sparql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Sparql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA15_eotS =
        "\5\uffff";
    static final String DFA15_eofS =
        "\5\uffff";
    static final String DFA15_minS =
        "\2\56\3\uffff";
    static final String DFA15_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA15_specialS =
        "\5\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "931:1: DOUBLE : ( ( DIGIT )+ DOT ( DIGIT )* EXPONENT | DOT ( DIGIT )+ EXPONENT | ( DIGIT )+ EXPONENT );";
        }
    }
    static final String DFA34_eotS =
        "\2\uffff\6\65\1\126\17\65\1\174\1\65\1\177\2\65\1\u0083\1\u0087"+
        "\1\u0089\1\u008c\2\65\1\u0094\1\65\1\u0097\1\u0099\1\u009b\1\65"+
        "\1\u009e\16\uffff\1\u00ab\5\uffff\1\174\22\uffff\1\u00cf\32\uffff"+
        "\1\u00f2\1\uffff\1\u00f4\1\uffff\1\u00f6\1\uffff\1\u00f8\21\uffff"+
        "\1\u0083\1\u0103\2\uffff\1\u0103\1\uffff\1\u0105\2\uffff\1\u0109"+
        "\1\uffff\1\u0090\1\uffff\1\u0092\1\uffff\1\u010f\40\uffff\1\u011f"+
        "\2\uffff\1\u0123\7\uffff\1\u012e\15\uffff\1\u013e\1\u013f\1\uffff"+
        "\1\u0140\1\u0141\1\u0142\1\u0143\5\uffff\1\u0149\1\u014a\16\uffff"+
        "\1\u0159\11\uffff\1\u0162\7\uffff\1\u0168\1\u0169\1\u016a\6\uffff"+
        "\1\u0103\1\uffff\1\u0170\1\uffff\1\u0170\1\uffff\1\u0172\1\uffff"+
        "\1\u0172\3\uffff\1\u0174\1\uffff\1\u0177\22\uffff\1\u0189\4\uffff"+
        "\1\u0190\2\uffff\1\u0194\1\uffff\1\u0195\3\uffff\1\u0199\4\uffff"+
        "\1\u019e\4\uffff\1\u01a3\6\uffff\1\u01a4\7\uffff\1\u01aa\4\uffff"+
        "\1\u01b0\1\u01b1\16\uffff\1\u01bf\1\uffff\1\u01c0\1\uffff\1\u01c2"+
        "\11\uffff\1\u01ca\1\uffff\1\u0170\1\uffff\1\u0172\1\uffff\1\u01cb"+
        "\2\uffff\1\u01cd\13\uffff\1\u01d9\22\uffff\1\u01e8\2\uffff\1\u01ea"+
        "\5\uffff\1\u01ef\1\u01f0\4\uffff\1\u01f3\1\u01f4\1\u01f5\1\u01f6"+
        "\1\uffff\1\u01f7\2\uffff\1\u01fa\3\uffff\1\u01fc\1\u01fd\1\u01ff"+
        "\1\u0200\1\u0201\1\u0202\1\u0203\1\u0204\1\u0205\10\uffff\1\u020b"+
        "\1\u020c\2\uffff\1\u020f\6\uffff\1\u0213\1\u0214\3\uffff\1\u0218"+
        "\7\uffff\1\u021f\1\u0220\1\u0221\1\u0222\1\u0223\1\u0224\1\u0225"+
        "\2\uffff\1\u0228\7\uffff\1\u022e\4\uffff\1\u0231\1\u0232\5\uffff"+
        "\1\u0233\20\uffff\1\u023a\4\uffff\1\u023d\2\uffff\1\u023f\3\uffff"+
        "\1\u0241\1\u0242\2\uffff\1\u0244\1\uffff\1\u0246\15\uffff\1\u024c"+
        "\1\uffff\1\u024e\1\u024f\12\uffff\1\u0256\4\uffff\1\u025a\3\uffff"+
        "\1\u025c\7\uffff\1\u0260\1\u0261\1\u0262\1\u0263\1\uffff\1\u0264"+
        "\3\uffff\1\u0266\1\u0267\1\u0268\5\uffff\1\u026d\3\uffff\1\u026f"+
        "\1\u0270\1\u0271\5\uffff\1\u0272\5\uffff\1\u0275\1\u0276\13\uffff"+
        "\1\u027b\3\uffff\1\u027e\3\uffff\1\u0281\1\uffff";
    static final String DFA34_eofS =
        "\u0282\uffff";
    static final String DFA34_minS =
        "\1\0\1\uffff\26\55\1\60\1\72\2\60\1\101\1\56\1\60\2\56\2\0\1\75"+
        "\1\0\1\136\2\75\1\46\1\174\15\uffff\7\55\1\60\27\55\1\uffff\45\55"+
        "\10\uffff\1\56\1\60\2\uffff\1\60\1\uffff\1\56\1\60\1\uffff\1\56"+
        "\1\60\1\47\1\uffff\1\42\1\uffff\1\41\26\uffff\1\55\1\uffff\43\55"+
        "\1\uffff\42\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\1\uffff\12"+
        "\55\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff"+
        "\1\60\3\uffff\17\55\1\uffff\3\55\1\uffff\12\55\1\uffff\17\55\6\uffff"+
        "\5\55\2\uffff\16\55\1\uffff\10\55\1\uffff\5\55\3\uffff\5\55\1\uffff"+
        "\1\60\1\uffff\1\60\1\uffff\2\55\1\uffff\21\55\1\uffff\6\55\1\uffff"+
        "\3\55\2\uffff\3\55\1\uffff\4\55\1\uffff\4\55\2\uffff\5\55\1\uffff"+
        "\5\55\2\uffff\15\55\2\uffff\1\55\1\uffff\7\55\2\uffff\1\55\1\uffff"+
        "\13\55\1\uffff\16\55\1\uffff\1\55\1\uffff\4\55\2\uffff\2\55\5\uffff"+
        "\2\55\1\uffff\1\55\2\uffff\1\55\7\uffff\5\55\2\uffff\2\55\1\uffff"+
        "\3\55\2\uffff\3\55\1\uffff\6\55\7\uffff\2\55\1\uffff\5\55\1\uffff"+
        "\2\55\3\uffff\6\55\1\uffff\2\55\1\uffff\1\55\1\uffff\1\55\2\uffff"+
        "\1\55\1\uffff\1\55\1\uffff\5\55\1\uffff\1\55\2\uffff\6\55\1\uffff"+
        "\3\55\1\uffff\1\55\1\uffff\3\55\5\uffff\1\55\3\uffff\4\55\1\uffff"+
        "\1\55\4\uffff\2\55\2\uffff\4\55\1\uffff\2\55\1\uffff\2\55\1\uffff";
    static final String DFA34_maxS =
        "\1\uffff\1\uffff\27\ufffd\1\72\2\ufffd\1\172\1\145\3\71\2\uffff"+
        "\1\75\1\uffff\1\136\2\75\1\46\1\174\15\uffff\37\ufffd\1\uffff\45"+
        "\ufffd\10\uffff\2\145\2\uffff\1\145\1\uffff\1\145\1\71\1\uffff\1"+
        "\145\1\71\1\47\1\uffff\1\42\1\uffff\1\uffff\26\uffff\1\ufffd\1\uffff"+
        "\43\ufffd\1\uffff\42\ufffd\1\uffff\1\ufffd\1\uffff\1\ufffd\1\uffff"+
        "\1\ufffd\1\uffff\12\ufffd\1\uffff\1\145\1\uffff\1\145\1\uffff\1"+
        "\145\1\uffff\1\145\1\uffff\1\145\3\uffff\17\ufffd\1\uffff\3\ufffd"+
        "\1\uffff\12\ufffd\1\uffff\17\ufffd\6\uffff\5\ufffd\2\uffff\16\ufffd"+
        "\1\uffff\10\ufffd\1\uffff\5\ufffd\3\uffff\5\ufffd\1\uffff\1\145"+
        "\1\uffff\1\145\1\uffff\2\ufffd\1\uffff\21\ufffd\1\uffff\6\ufffd"+
        "\1\uffff\3\ufffd\2\uffff\3\ufffd\1\uffff\4\ufffd\1\uffff\4\ufffd"+
        "\2\uffff\5\ufffd\1\uffff\5\ufffd\2\uffff\15\ufffd\2\uffff\1\ufffd"+
        "\1\uffff\7\ufffd\2\uffff\1\ufffd\1\uffff\13\ufffd\1\uffff\16\ufffd"+
        "\1\uffff\1\ufffd\1\uffff\4\ufffd\2\uffff\2\ufffd\5\uffff\2\ufffd"+
        "\1\uffff\1\ufffd\2\uffff\1\ufffd\7\uffff\5\ufffd\2\uffff\2\ufffd"+
        "\1\uffff\3\ufffd\2\uffff\3\ufffd\1\uffff\6\ufffd\7\uffff\2\ufffd"+
        "\1\uffff\5\ufffd\1\uffff\2\ufffd\3\uffff\6\ufffd\1\uffff\2\ufffd"+
        "\1\uffff\1\ufffd\1\uffff\1\ufffd\2\uffff\1\ufffd\1\uffff\1\ufffd"+
        "\1\uffff\5\ufffd\1\uffff\1\ufffd\2\uffff\6\ufffd\1\uffff\3\ufffd"+
        "\1\uffff\1\ufffd\1\uffff\3\ufffd\5\uffff\1\ufffd\3\uffff\4\ufffd"+
        "\1\uffff\1\ufffd\4\uffff\2\ufffd\2\uffff\4\ufffd\1\uffff\2\ufffd"+
        "\1\uffff\2\ufffd\1\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\50\uffff\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1"+
        "\u0092\1\u0093\1\u0097\1\u0099\1\u009b\1\u009c\1\u009f\1\1\37\uffff"+
        "\1\27\45\uffff\1\161\1\162\1\163\1\u0098\1\164\1\165\1\166\1\167"+
        "\2\uffff\1\171\1\u0094\1\uffff\1\u0095\2\uffff\1\u0096\3\uffff\1"+
        "\u0080\1\uffff\1\u0081\1\uffff\1\u0084\1\u0085\1\u0086\1\u008c\1"+
        "\u0088\1\u009d\1\u0089\1\u009a\1\u008a\1\u008b\1\u009e\1\u008d\1"+
        "\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0097\1\u0099\1"+
        "\u009b\1\u009c\1\uffff\1\16\43\uffff\1\67\42\uffff\1\156\1\uffff"+
        "\1\142\1\uffff\1\66\1\uffff\1\131\12\uffff\1\170\1\uffff\1\172\1"+
        "\uffff\1\174\1\uffff\1\175\1\uffff\1\177\1\uffff\1\u0082\1\u0083"+
        "\1\u0087\17\uffff\1\30\3\uffff\1\147\12\uffff\1\124\17\uffff\1\11"+
        "\1\17\1\51\1\62\1\103\1\152\5\uffff\1\132\1\155\16\uffff\1\100\10"+
        "\uffff\1\77\5\uffff\1\150\1\133\1\151\5\uffff\1\173\1\uffff\1\176"+
        "\1\uffff\1\2\2\uffff\1\75\21\uffff\1\134\6\uffff\1\20\3\uffff\1"+
        "\63\1\50\3\uffff\1\102\4\uffff\1\53\4\uffff\1\104\1\12\5\uffff\1"+
        "\64\5\uffff\1\31\1\46\15\uffff\1\65\1\44\1\uffff\1\52\7\uffff\1"+
        "\122\1\34\1\uffff\1\101\13\uffff\1\144\16\uffff\1\42\1\uffff\1\106"+
        "\4\uffff\1\146\1\47\2\uffff\1\45\1\105\1\13\1\14\1\15\2\uffff\1"+
        "\21\1\uffff\1\112\1\24\1\uffff\1\70\1\25\1\72\1\57\1\111\1\36\1"+
        "\37\5\uffff\1\123\1\76\2\uffff\1\125\3\uffff\1\3\1\4\3\uffff\1\110"+
        "\6\uffff\1\153\1\43\1\60\1\135\1\136\1\137\1\140\2\uffff\1\55\5"+
        "\uffff\1\107\2\uffff\1\54\1\26\1\22\6\uffff\1\56\2\uffff\1\71\1"+
        "\uffff\1\157\1\uffff\1\74\1\127\1\uffff\1\143\1\uffff\1\116\5\uffff"+
        "\1\61\1\uffff\1\6\1\121\6\uffff\1\40\3\uffff\1\126\1\uffff\1\73"+
        "\3\uffff\1\120\1\35\1\5\1\10\1\33\1\uffff\1\114\1\141\1\23\4\uffff"+
        "\1\130\1\uffff\1\160\1\115\1\117\1\7\2\uffff\1\41\1\145\4\uffff"+
        "\1\32\2\uffff\1\154\2\uffff\1\113";
    static final String DFA34_specialS =
        "\1\2\40\uffff\1\1\1\0\1\uffff\1\3\u025d\uffff}>";
    static final String[] DFA34_transitionS = {
            "\11\65\2\1\2\65\1\1\22\65\1\1\1\47\1\42\1\44\1\33\1\65\1\50"+
            "\1\41\1\52\1\53\1\61\1\37\1\62\1\40\1\36\1\63\12\35\1\30\1\60"+
            "\1\43\1\64\1\46\1\32\1\34\1\20\1\2\1\7\1\5\1\25\1\11\1\16\1"+
            "\24\1\21\2\27\1\15\1\23\1\12\1\14\1\3\1\27\1\6\1\4\1\22\1\17"+
            "\1\27\1\13\1\27\1\26\1\27\1\56\1\65\1\57\1\45\1\31\1\65\1\10"+
            "\1\2\1\7\1\5\1\25\1\11\1\16\1\24\1\21\2\27\1\15\1\23\1\12\1"+
            "\14\1\3\1\27\1\6\1\4\1\22\1\17\1\27\1\13\1\27\1\26\1\27\1\54"+
            "\1\51\1\55\102\65\27\27\1\65\37\27\1\65\u0208\27\160\65\16\27"+
            "\1\65\u1c81\27\14\65\2\27\142\65\u0120\27\u0a70\65\u03f0\27"+
            "\21\65\ua7ff\27\u2100\65\u04d0\27\40\65\u020e\27\2\65",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\67\7\74\1\72\4\74\1"+
            "\73\1\71\11\74\1\70\1\74\4\uffff\1\74\1\uffff\1\67\7\74\1\72"+
            "\4\74\1\73\1\71\11\74\1\70\1\74\74\uffff\1\74\10\uffff\27\74"+
            "\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2"+
            "\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\77\10\74\4\uffff"+
            "\1\74\1\uffff\21\74\1\77\10\74\74\uffff\1\74\10\uffff\27\74"+
            "\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2"+
            "\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\102\3\74\1\100\2\74"+
            "\1\105\1\104\12\74\1\101\1\103\5\74\4\uffff\1\74\1\uffff\1\102"+
            "\3\74\1\100\2\74\1\105\1\104\12\74\1\101\1\103\5\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\110\3\74\1\107\3\74"+
            "\1\106\10\74\1\111\10\74\4\uffff\1\74\1\uffff\1\110\3\74\1\107"+
            "\3\74\1\106\10\74\1\111\10\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\113\3\74\1\112\11\74"+
            "\1\114\13\74\4\uffff\1\74\1\uffff\1\113\3\74\1\112\11\74\1\114"+
            "\13\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\120\6\74\1\116"+
            "\2\74\1\115\2\74\1\117\10\74\4\uffff\1\74\1\uffff\4\74\1\120"+
            "\6\74\1\116\2\74\1\115\2\74\1\117\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\74\1\124\1\74\1\122"+
            "\7\74\1\123\6\74\1\121\2\74\1\125\4\74\4\uffff\1\74\1\uffff"+
            "\1\74\1\124\1\74\1\122\7\74\1\123\6\74\1\121\2\74\1\125\4\74"+
            "\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74"+
            "\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\131\7\74\1\130\2\74"+
            "\1\132\5\74\1\127\10\74\4\uffff\1\74\1\uffff\1\131\7\74\1\130"+
            "\2\74\1\132\5\74\1\127\10\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\133\15\74\1\134\13"+
            "\74\4\uffff\1\74\1\uffff\1\133\15\74\1\134\13\74\74\uffff\1"+
            "\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81"+
            "\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff"+
            "\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e"+
            "\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\7\74\1\135\1\136\21\74"+
            "\4\uffff\1\74\1\uffff\7\74\1\135\1\136\21\74\74\uffff\1\74\10"+
            "\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74"+
            "\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0"+
            "\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\140\11\74\1\141"+
            "\1\74\1\137\10\74\4\uffff\1\74\1\uffff\5\74\1\140\11\74\1\141"+
            "\1\74\1\137\10\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74"+
            "\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2"+
            "\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74"+
            "\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\143\1\74\1\145\5\74"+
            "\1\142\5\74\1\144\13\74\4\uffff\1\74\1\uffff\1\143\1\74\1\145"+
            "\5\74\1\142\5\74\1\144\13\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\146\10\74\4\uffff"+
            "\1\74\1\uffff\21\74\1\146\10\74\74\uffff\1\74\10\uffff\27\74"+
            "\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2"+
            "\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\152\12\74\1\147"+
            "\3\74\1\151\1\150\7\74\4\uffff\1\74\1\uffff\2\74\1\152\12\74"+
            "\1\147\3\74\1\151\1\150\7\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\74\1\124\1\74\1\122"+
            "\7\74\1\123\6\74\1\121\2\74\1\125\4\74\4\uffff\1\74\1\uffff"+
            "\1\74\1\124\1\74\1\122\7\74\1\123\6\74\1\121\2\74\1\125\4\74"+
            "\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74"+
            "\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\156\7\74\1\154"+
            "\3\74\1\155\1\153\7\74\4\uffff\1\74\1\uffff\5\74\1\156\7\74"+
            "\1\154\3\74\1\155\1\153\7\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\161\5\74\1\160"+
            "\2\74\1\157\7\74\1\162\4\uffff\1\74\1\uffff\10\74\1\161\5\74"+
            "\1\160\2\74\1\157\7\74\1\162\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\166\2\74\1\165\4\74"+
            "\1\164\5\74\1\163\13\74\4\uffff\1\74\1\uffff\1\166\2\74\1\165"+
            "\4\74\1\164\5\74\1\163\13\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\167\15\74\1\170\13"+
            "\74\4\uffff\1\74\1\uffff\1\167\15\74\1\170\13\74\74\uffff\1"+
            "\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81"+
            "\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff"+
            "\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e"+
            "\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\171\11\74\1\172"+
            "\2\74\4\uffff\1\74\1\uffff\15\74\1\171\11\74\1\172\2\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\173\25\74\4\uffff"+
            "\1\74\1\uffff\4\74\1\173\25\74\74\uffff\1\74\10\uffff\27\74"+
            "\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2"+
            "\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\12\175\7\uffff\32\175\4\uffff\1\175\1\uffff\32\175\105\uffff"+
            "\27\175\1\uffff\37\175\1\uffff\u0208\175\160\uffff\16\175\1"+
            "\uffff\u1c81\175\14\uffff\2\175\142\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\175\21\uffff\ua7ff\175\u2100\uffff\u04d0\175\40\uffff"+
            "\u020e\175",
            "\1\176",
            "\12\u0080\7\uffff\32\u0080\4\uffff\1\u0080\1\uffff\32\u0080"+
            "\105\uffff\27\u0080\1\uffff\37\u0080\1\uffff\u0208\u0080\160"+
            "\uffff\16\u0080\1\uffff\u1c81\u0080\14\uffff\2\u0080\142\uffff"+
            "\u0120\u0080\u0a70\uffff\u03f0\u0080\21\uffff\ua7ff\u0080\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0080",
            "\12\u0081\7\uffff\32\u0081\4\uffff\1\u0081\1\uffff\32\u0081"+
            "\105\uffff\27\u0081\1\uffff\37\u0081\1\uffff\u0208\u0081\160"+
            "\uffff\16\u0081\1\uffff\u1c81\u0081\14\uffff\2\u0081\142\uffff"+
            "\u0120\u0081\u0a70\uffff\u03f0\u0081\21\uffff\ua7ff\u0081\u2100"+
            "\uffff\u04d0\u0081\40\uffff\u020e\u0081",
            "\32\u0082\6\uffff\32\u0082",
            "\1\u0085\1\uffff\12\u0084\13\uffff\1\u0086\37\uffff\1\u0086",
            "\12\u0088",
            "\1\u008b\1\uffff\12\u008a",
            "\1\u008e\1\uffff\12\u008d",
            "\12\u0090\1\uffff\2\u0090\1\uffff\31\u0090\1\u008f\uffd8\u0090",
            "\12\u0092\1\uffff\2\u0092\1\uffff\24\u0092\1\u0091\uffdd\u0092",
            "\1\u0093",
            "\0\u0095",
            "\1\u0096",
            "\1\u0098",
            "\1\u009a",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u00aa\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u00aa\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u00ac\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u00ac\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u00ad\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u00ad\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u00ae\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u00ae\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff"+
            "\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\12\175\7\uffff\32\175\4\uffff\1\175\1\uffff\32\175\105\uffff"+
            "\27\175\1\uffff\37\175\1\uffff\u0208\175\160\uffff\16\175\1"+
            "\uffff\u1c81\175\14\uffff\2\175\142\uffff\u0120\175\u0a70\uffff"+
            "\u03f0\175\21\uffff\ua7ff\175\u2100\uffff\u04d0\175\40\uffff"+
            "\u020e\175",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u00af\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u00af\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u00b2\10\74\1"+
            "\u00b0\3\74\1\u00b3\1\74\1\u00b1\10\74\4\uffff\1\74\1\uffff"+
            "\2\74\1\u00b2\10\74\1\u00b0\3\74\1\u00b3\1\74\1\u00b1\10\74"+
            "\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74"+
            "\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u00b4\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u00b4\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u00b5\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u00b5\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\74\1\u00b6\12\74\1"+
            "\u00b7\15\74\4\uffff\1\74\1\uffff\1\74\1\u00b6\12\74\1\u00b7"+
            "\15\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u00b8\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u00b8\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u00b9\31\74\4\uffff"+
            "\1\74\1\uffff\1\u00b9\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u00ba\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u00ba\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u00bd\5\74\1\u00bc"+
            "\6\74\1\u00bb\7\74\4\uffff\1\74\1\uffff\5\74\1\u00bd\5\74\1"+
            "\u00bc\6\74\1\u00bb\7\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u00be\4\74\1"+
            "\u00bf\1\74\4\uffff\1\74\1\uffff\23\74\1\u00be\4\74\1\u00bf"+
            "\1\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u00c0\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u00c0\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u00c1\2\74\1\u00c2"+
            "\10\74\1\u00c3\12\74\4\uffff\1\74\1\uffff\3\74\1\u00c1\2\74"+
            "\1\u00c2\10\74\1\u00c3\12\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u00c4\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u00c4\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u00c5\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u00c5\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u00c8\14\74\1\u00c6"+
            "\1\74\1\u00c7\4\74\1\u00c9\5\74\4\uffff\1\74\1\uffff\1\u00c8"+
            "\14\74\1\u00c6\1\74\1\u00c7\4\74\1\u00c9\5\74\74\uffff\1\74"+
            "\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81"+
            "\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff"+
            "\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e"+
            "\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u00ca\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u00ca\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u00cb\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u00cb\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u00cc\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u00cc\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u00ce\7\74\1\u00cd"+
            "\17\74\4\uffff\1\74\1\uffff\2\74\1\u00ce\7\74\1\u00cd\17\74"+
            "\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74"+
            "\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u00d0\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u00d0\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u00d1\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u00d1\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u00d2\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u00d2\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\6\74\1\u00d3\23\74\4"+
            "\uffff\1\74\1\uffff\6\74\1\u00d3\23\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u00d4\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u00d4\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u00d5\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u00d5\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u00d6\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u00d6\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u00d7\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u00d7\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u00d8\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u00d8\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u00da\2\74\1"+
            "\u00d9\3\74\4\uffff\1\74\1\uffff\23\74\1\u00da\2\74\1\u00d9"+
            "\3\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u00db\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u00db\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u00dc\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u00dc\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u00dd\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u00dd\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u00de\24\74\4"+
            "\uffff\1\74\1\uffff\5\74\1\u00de\24\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u00df\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u00df\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u00e0\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u00e0\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u00e1\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u00e1\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u00e2\31\74\4\uffff"+
            "\1\74\1\uffff\1\u00e2\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u00e3\31\74\4\uffff"+
            "\1\74\1\uffff\1\u00e3\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u00e4\15\74\1\u00e5"+
            "\13\74\4\uffff\1\74\1\uffff\1\u00e4\15\74\1\u00e5\13\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u00e7\4\74\1\u00e6"+
            "\21\74\4\uffff\1\74\1\uffff\3\74\1\u00e7\4\74\1\u00e6\21\74"+
            "\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74"+
            "\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u00e8\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u00e8\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u00e9\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u00e9\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u00ea\31\74\4\uffff"+
            "\1\74\1\uffff\1\u00ea\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\74\1\u00ed\6\74\1\u00eb"+
            "\2\74\1\u00ee\1\74\1\u00ef\6\74\1\u00ec\5\74\4\uffff\1\74\1"+
            "\uffff\1\74\1\u00ed\6\74\1\u00eb\2\74\1\u00ee\1\74\1\u00ef\6"+
            "\74\1\u00ec\5\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74"+
            "\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2"+
            "\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74"+
            "\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u00f0\1\u00f1"+
            "\6\74\4\uffff\1\74\1\uffff\22\74\1\u00f0\1\u00f1\6\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u00f3\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u00f3\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u00f5\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u00f5\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u00f7\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u00f7\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u00fa\7\74\1"+
            "\u00f9\4\74\4\uffff\1\74\1\uffff\15\74\1\u00fa\7\74\1\u00f9"+
            "\4\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u00fb\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u00fb\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\5\74\1\u00fc\4\74\1\76\6\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37"+
            "\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\27\74\1\u00fd\2\74\4"+
            "\uffff\1\74\1\uffff\27\74\1\u00fd\2\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\25\74\1\u00fe\4\74\4"+
            "\uffff\1\74\1\uffff\25\74\1\u00fe\4\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u00ff\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u00ff\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0100\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0100\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u0101\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u0101\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u0102\31\74\4\uffff"+
            "\1\74\1\uffff\1\u0102\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0085\1\uffff\12\u0084\13\uffff\1\u0086\37\uffff\1\u0086",
            "\12\u0104\13\uffff\1\u0086\37\uffff\1\u0086",
            "",
            "",
            "\12\u0088\13\uffff\1\u0086\37\uffff\1\u0086",
            "",
            "\1\u0106\1\uffff\12\u008a\13\uffff\1\u0107\37\uffff\1\u0107",
            "\12\u0108",
            "",
            "\1\u010a\1\uffff\12\u008d\13\uffff\1\u010b\37\uffff\1\u010b",
            "\12\u010c",
            "\1\u010d",
            "",
            "\1\u010e",
            "",
            "\1\u0094\1\uffff\31\u0094\1\uffff\37\u0094\1\uffff\1\u0094"+
            "\1\uffff\1\u0094\1\uffff\32\u0094\3\uffff\uff82\u0094",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0110\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0110\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0111\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0111\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u0112\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u0112\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u0113\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u0113\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u0114\24\74\4"+
            "\uffff\1\74\1\uffff\5\74\1\u0114\24\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0115\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0115\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\25\74\1\u0116\4\74\4"+
            "\uffff\1\74\1\uffff\25\74\1\u0116\4\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0117\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0117\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u0118\31\74\4\uffff"+
            "\1\74\1\uffff\1\u0118\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u011d\1\u011c\1\74"+
            "\1\u011e\1\u011b\6\74\1\u0119\6\74\1\u011a\7\74\4\uffff\1\74"+
            "\1\uffff\1\u011d\1\u011c\1\74\1\u011e\1\u011b\6\74\1\u0119\6"+
            "\74\1\u011a\7\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74"+
            "\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2"+
            "\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74"+
            "\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0120\12\74\1"+
            "\u0121\12\74\4\uffff\1\74\1\uffff\4\74\1\u0120\12\74\1\u0121"+
            "\12\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0122\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0122\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0124\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0124\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\1\74\1\u0125\1\u0126\1\u0127\1\74\1\u0128"+
            "\4\74\1\76\6\uffff\32\74\4\uffff\1\74\1\uffff\32\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0129\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0129\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u012a\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u012a\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u012b\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u012b\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u012c\31\74\4\uffff"+
            "\1\74\1\uffff\1\u012c\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u012d\31\74\4\uffff"+
            "\1\74\1\uffff\1\u012d\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\17\74\1\u012f\12\74\4"+
            "\uffff\1\74\1\uffff\17\74\1\u012f\12\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u0130\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u0130\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0131\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0131\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u0132\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u0132\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u0133\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u0133\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0134\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0134\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0136\17\74\1"+
            "\u0135\1\u0137\6\74\4\uffff\1\74\1\uffff\2\74\1\u0136\17\74"+
            "\1\u0135\1\u0137\6\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37"+
            "\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\30\74\1\u0138\1\74\4"+
            "\uffff\1\74\1\uffff\30\74\1\u0138\1\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u0139\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u0139\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u013a\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u013a\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u013b\31\74\4\uffff"+
            "\1\74\1\uffff\1\u013b\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u013c\31\74\4\uffff"+
            "\1\74\1\uffff\1\u013c\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u013d\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u013d\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u0144\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u0144\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0145\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0145\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0146\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0146\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0147\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0147\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0148\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0148\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u014b\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u014b\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\7\74\1\u014c\22\74\4"+
            "\uffff\1\74\1\uffff\7\74\1\u014c\22\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u014d\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u014d\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u014e\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u014e\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u014f\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u014f\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u0150\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u0150\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\6\74\1\u0151\23\74\4"+
            "\uffff\1\74\1\uffff\6\74\1\u0151\23\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u0152\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u0152\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0153\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0153\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\17\74\1\u0154\12\74\4"+
            "\uffff\1\74\1\uffff\17\74\1\u0154\12\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u0155\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u0155\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0156\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0156\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0157\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0157\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0158\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0158\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u015a\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u015a\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u015b\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u015b\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u015c\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u015c\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u015d\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u015d\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u015e\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u015e\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u015f\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u015f\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0160\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0160\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0161\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0161\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0163\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0163\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0164\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0164\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0165\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0165\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0166\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0166\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u0167\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u0167\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u016b\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u016b\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u016c\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u016c\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u016d\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u016d\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u016e\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u016e\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u016f\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u016f\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\12\u0104\13\uffff\1\u0086\37\uffff\1\u0086",
            "",
            "\12\u0171\13\uffff\1\u0107\37\uffff\1\u0107",
            "",
            "\12\u0108\13\uffff\1\u0107\37\uffff\1\u0107",
            "",
            "\12\u0173\13\uffff\1\u010b\37\uffff\1\u010b",
            "",
            "\12\u010c\13\uffff\1\u010b\37\uffff\1\u010b",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u0175\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u0175\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u0176\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u0176\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0178\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0178\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u0179\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u0179\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u017a\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u017a\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u017b\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u017b\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u017c\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u017c\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u017d\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u017d\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u017f\3\74\1\u017e"+
            "\25\74\4\uffff\1\74\1\uffff\1\u017f\3\74\1\u017e\25\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0180\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0180\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0181\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0181\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0182\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0182\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u0183\24\74\4"+
            "\uffff\1\74\1\uffff\5\74\1\u0183\24\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0184\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0184\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0185\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0185\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u0186\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u0186\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0187\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0187\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0188\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0188\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\2\74\1\u018a\2\74\1\u018b\4\74\1\76\6\uffff"+
            "\32\74\4\uffff\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27"+
            "\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\10\74\1\u018c\1\74\1\76\6\uffff\32\74\4"+
            "\uffff\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\1\74\1\u018d\10\74\1\76\6\uffff\32\74\4"+
            "\uffff\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u018e\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u018e\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u018f\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u018f\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0191\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0191\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u0192\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u0192\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0193\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0193\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0196\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0196\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\27\74\1\u0197\2\74\4"+
            "\uffff\1\74\1\uffff\27\74\1\u0197\2\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u0198\31\74\4\uffff"+
            "\1\74\1\uffff\1\u0198\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u019a\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u019a\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u019b\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u019b\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u019c\31\74\4\uffff"+
            "\1\74\1\uffff\1\u019c\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u019d\31\74\4\uffff"+
            "\1\74\1\uffff\1\u019d\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u019f\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u019f\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01a0\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01a0\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01a1\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01a1\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01a2\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01a2\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01a5\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01a5\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01a6\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01a6\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01a7\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01a7\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u01a8\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u01a8\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01a9\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01a9\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01ab\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01ab\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01ac\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01ac\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u01ad\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u01ad\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01ae\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01ae\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u01af\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u01af\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01b2\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01b2\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\7\74\1\u01b3\22\74\4"+
            "\uffff\1\74\1\uffff\7\74\1\u01b3\22\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\17\74\1\u01b4\12\74\4"+
            "\uffff\1\74\1\uffff\17\74\1\u01b4\12\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01b5\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01b5\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u01b6\24\74\4"+
            "\uffff\1\74\1\uffff\5\74\1\u01b6\24\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\6\74\1\u01b7\23\74\4"+
            "\uffff\1\74\1\uffff\6\74\1\u01b7\23\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01b8\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01b8\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u01b9\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u01b9\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u01ba\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u01ba\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u01bb\31\74\4\uffff"+
            "\1\74\1\uffff\1\u01bb\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01bc\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01bc\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u01bd\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u01bd\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01be\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01be\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\31\74\1\u01c1\4\uffff"+
            "\1\74\1\uffff\31\74\1\u01c1\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\7\74\1\u01c3\22\74\4"+
            "\uffff\1\74\1\uffff\7\74\1\u01c3\22\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u01c4\1\u01c5"+
            "\6\74\4\uffff\1\74\1\uffff\22\74\1\u01c4\1\u01c5\6\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01c6\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01c6\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u01c7\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u01c7\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u01c8\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u01c8\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01c9\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01c9\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\12\u0171\13\uffff\1\u0107\37\uffff\1\u0107",
            "",
            "\12\u0173\13\uffff\1\u010b\37\uffff\1\u010b",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01cc\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01cc\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\27\74\1\u01ce\2\74\4"+
            "\uffff\1\74\1\uffff\27\74\1\u01ce\2\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01cf\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01cf\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u01d0\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u01d0\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u01d1\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u01d1\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u01d2\31\74\4\uffff"+
            "\1\74\1\uffff\1\u01d2\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01d3\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01d3\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01d4\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01d4\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u01d5\31\74\4\uffff"+
            "\1\74\1\uffff\1\u01d5\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u01d6\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u01d6\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u01d7\24\74\4"+
            "\uffff\1\74\1\uffff\5\74\1\u01d7\24\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01d8\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01d8\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01da\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01da\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01db\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01db\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01dc\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01dc\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01dd\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01dd\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\4\74\1\u01de\5\74\1\76\6\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37"+
            "\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\6\74\1\u01df\3\74\1\76\6\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37"+
            "\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\4\74\1\u01e0\5\74\1\76\6\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37"+
            "\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\2\74\1\u01e1\7\74\1\76\6\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37"+
            "\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01e2\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01e2\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u01e3\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u01e3\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01e4\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01e4\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u01e5\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u01e5\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\30\74\1\u01e6\1\74\4"+
            "\uffff\1\74\1\uffff\30\74\1\u01e6\1\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01e7\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01e7\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u01e9\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u01e9\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01eb\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01eb\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01ec\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01ec\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u01ed\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u01ed\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u01ee\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u01ee\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01f1\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01f1\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01f2\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01f2\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01f8\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01f8\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01f9\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01f9\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u01fb\31\74\4\uffff"+
            "\1\74\1\uffff\1\u01fb\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\u01fe"+
            "\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1"+
            "\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74"+
            "\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100"+
            "\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0206\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0206\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0207\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0207\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0208\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0208\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0209\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0209\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u020a\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u020a\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u020d\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u020d\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\6\74\1\u020e\23\74\4"+
            "\uffff\1\74\1\uffff\6\74\1\u020e\23\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0210\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0210\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0211\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0211\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\6\74\1\u0212\23\74\4"+
            "\uffff\1\74\1\uffff\6\74\1\u0212\23\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0215\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0215\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0216\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0216\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0217\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0217\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\6\74\1\u0219\23\74\4"+
            "\uffff\1\74\1\uffff\6\74\1\u0219\23\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u021a\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u021a\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u021b\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u021b\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u021c\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u021c\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u021d\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u021d\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u021e\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u021e\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0226\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0226\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\74\1\u0227\30\74\4"+
            "\uffff\1\74\1\uffff\1\74\1\u0227\30\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0229\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0229\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\17\74\1\u022a\12\74\4"+
            "\uffff\1\74\1\uffff\17\74\1\u022a\12\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u022b\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u022b\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u022c\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u022c\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u022d\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u022d\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u022f\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u022f\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0230\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0230\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u0234\31\74\4\uffff"+
            "\1\74\1\uffff\1\u0234\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0235\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0235\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0236\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0236\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\12\74\1\u0237\17\74\4"+
            "\uffff\1\74\1\uffff\12\74\1\u0237\17\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u0238\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u0238\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u0239\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u0239\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u023b\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u023b\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u023c\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u023c\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\u023e"+
            "\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1"+
            "\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74"+
            "\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100"+
            "\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0240\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0240\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0243\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0243\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0245\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0245\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u0247\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u0247\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u0248\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u0248\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u0249\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u0249\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u024a\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u024a\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u024b\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u024b\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u024d\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u024d\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0250\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0250\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0251\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0251\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0252\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0252\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u0253\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u0253\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0254\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0254\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0255\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0255\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u0257\31\74\4\uffff"+
            "\1\74\1\uffff\1\u0257\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u0258\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u0258\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0259\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0259\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u025b\24\74\4"+
            "\uffff\1\74\1\uffff\5\74\1\u025b\24\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u025d\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u025d\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u025e\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u025e\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u025f\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u025f\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0265\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0265\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\7\74\1\u0269\22\74\4"+
            "\uffff\1\74\1\uffff\7\74\1\u0269\22\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u026a\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u026a\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u026b\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u026b\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u026c\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u026c\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u026e\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u026e\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0273\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0273\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0274\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0274\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u0277\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u0277\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0278\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0278\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u0279\31\74\4\uffff"+
            "\1\74\1\uffff\1\u0279\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\u027a"+
            "\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1"+
            "\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74"+
            "\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100"+
            "\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u027c\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u027c\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u027d\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u027d\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u027f\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u027f\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u0280\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u0280\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( WS | BASE | PREFIX | SELECT | DISTINCT | REDUCED | CONSTRUCT | DESCRIBE | ASK | FROM | NAMED | WHERE | ORDER | BY | ASC | DESC | LIMIT | OFFSET | OPTIONAL | GRAPH | UNION | FILTER | A | STR | LANG | LANGMATCHES | DATATYPE | BOUND | SAMETERM | ISIRI | ISURI | ISBLANK | ISLITERAL | REGEX | SUBSTR | TRUE | FALSE | LOAD | CLEAR | DROP | ADD | MOVE | COPY | CREATE | DELETE | INSERT | USING | SILENT | DEFAULT | ALL | DATA | WITH | INTO | TO | AS | GROUP | HAVING | UNDEF | BINDINGS | SERVICE | BIND | MINUS_KEYWORD | IRI | URI | BNODE | RAND | ABS | CEIL | FLOOR | ROUND | CONCAT | STRLEN | UCASE | LCASE | ENCODE_FOR_URI | CONTAINS | STRSTARTS | STRENDS | STRBEFORE | STRAFTER | REPLACE | YEAR | MONTH | DAY | HOURS | MINUTES | SECONDS | TIMEZONE | TZ | NOW | MD5 | SHA1 | SHA224 | SHA256 | SHA384 | SHA512 | COALESCE | IF | STRLANG | STRDT | ISNUMERIC | COUNT | SUM | MIN | MAX | AVG | SAMPLE | GROUP_CONCAT | NOT | IN | EXISTS | SEPARATOR | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | IRI_REF | COMMENT | REFERENCE | LESS_EQUAL | GREATER_EQUAL | NOT_EQUAL | AND | OR | INVERSE | OPEN_BRACE | CLOSE_BRACE | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | OPEN_SQUARE_BRACKET | CLOSE_SQUARE_BRACKET | SEMICOLON | DOT | PLUS | MINUS | ASTERISK | QUESTION_MARK | COMMA | NEGATION | DIVIDE | EQUAL | GREATER | PIPE | ANY );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_34 = input.LA(1);

                        s = -1;
                        if ( (LA34_34=='\"') ) {s = 145;}

                        else if ( ((LA34_34 >= '\u0000' && LA34_34 <= '\t')||(LA34_34 >= '\u000B' && LA34_34 <= '\f')||(LA34_34 >= '\u000E' && LA34_34 <= '!')||(LA34_34 >= '#' && LA34_34 <= '\uFFFF')) ) {s = 146;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_33 = input.LA(1);

                        s = -1;
                        if ( (LA34_33=='\'') ) {s = 143;}

                        else if ( ((LA34_33 >= '\u0000' && LA34_33 <= '\t')||(LA34_33 >= '\u000B' && LA34_33 <= '\f')||(LA34_33 >= '\u000E' && LA34_33 <= '&')||(LA34_33 >= '(' && LA34_33 <= '\uFFFF')) ) {s = 144;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_0 = input.LA(1);

                        s = -1;
                        if ( ((LA34_0 >= '\t' && LA34_0 <= '\n')||LA34_0=='\r'||LA34_0==' ') ) {s = 1;}

                        else if ( (LA34_0=='B'||LA34_0=='b') ) {s = 2;}

                        else if ( (LA34_0=='P'||LA34_0=='p') ) {s = 3;}

                        else if ( (LA34_0=='S'||LA34_0=='s') ) {s = 4;}

                        else if ( (LA34_0=='D'||LA34_0=='d') ) {s = 5;}

                        else if ( (LA34_0=='R'||LA34_0=='r') ) {s = 6;}

                        else if ( (LA34_0=='C'||LA34_0=='c') ) {s = 7;}

                        else if ( (LA34_0=='a') ) {s = 8;}

                        else if ( (LA34_0=='F'||LA34_0=='f') ) {s = 9;}

                        else if ( (LA34_0=='N'||LA34_0=='n') ) {s = 10;}

                        else if ( (LA34_0=='W'||LA34_0=='w') ) {s = 11;}

                        else if ( (LA34_0=='O'||LA34_0=='o') ) {s = 12;}

                        else if ( (LA34_0=='L'||LA34_0=='l') ) {s = 13;}

                        else if ( (LA34_0=='G'||LA34_0=='g') ) {s = 14;}

                        else if ( (LA34_0=='U'||LA34_0=='u') ) {s = 15;}

                        else if ( (LA34_0=='A') ) {s = 16;}

                        else if ( (LA34_0=='I'||LA34_0=='i') ) {s = 17;}

                        else if ( (LA34_0=='T'||LA34_0=='t') ) {s = 18;}

                        else if ( (LA34_0=='M'||LA34_0=='m') ) {s = 19;}

                        else if ( (LA34_0=='H'||LA34_0=='h') ) {s = 20;}

                        else if ( (LA34_0=='E'||LA34_0=='e') ) {s = 21;}

                        else if ( (LA34_0=='Y'||LA34_0=='y') ) {s = 22;}

                        else if ( ((LA34_0 >= 'J' && LA34_0 <= 'K')||LA34_0=='Q'||LA34_0=='V'||LA34_0=='X'||LA34_0=='Z'||(LA34_0 >= 'j' && LA34_0 <= 'k')||LA34_0=='q'||LA34_0=='v'||LA34_0=='x'||LA34_0=='z'||(LA34_0 >= '\u00C0' && LA34_0 <= '\u00D6')||(LA34_0 >= '\u00D8' && LA34_0 <= '\u00F6')||(LA34_0 >= '\u00F8' && LA34_0 <= '\u02FF')||(LA34_0 >= '\u0370' && LA34_0 <= '\u037D')||(LA34_0 >= '\u037F' && LA34_0 <= '\u1FFF')||(LA34_0 >= '\u200C' && LA34_0 <= '\u200D')||(LA34_0 >= '\u2070' && LA34_0 <= '\u218F')||(LA34_0 >= '\u2C00' && LA34_0 <= '\u2FEF')||(LA34_0 >= '\u3001' && LA34_0 <= '\uD7FF')||(LA34_0 >= '\uF900' && LA34_0 <= '\uFDCF')||(LA34_0 >= '\uFDF0' && LA34_0 <= '\uFFFD')) ) {s = 23;}

                        else if ( (LA34_0==':') ) {s = 24;}

                        else if ( (LA34_0=='_') ) {s = 25;}

                        else if ( (LA34_0=='?') ) {s = 26;}

                        else if ( (LA34_0=='$') ) {s = 27;}

                        else if ( (LA34_0=='@') ) {s = 28;}

                        else if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {s = 29;}

                        else if ( (LA34_0=='.') ) {s = 30;}

                        else if ( (LA34_0=='+') ) {s = 31;}

                        else if ( (LA34_0=='-') ) {s = 32;}

                        else if ( (LA34_0=='\'') ) {s = 33;}

                        else if ( (LA34_0=='\"') ) {s = 34;}

                        else if ( (LA34_0=='<') ) {s = 35;}

                        else if ( (LA34_0=='#') ) {s = 36;}

                        else if ( (LA34_0=='^') ) {s = 37;}

                        else if ( (LA34_0=='>') ) {s = 38;}

                        else if ( (LA34_0=='!') ) {s = 39;}

                        else if ( (LA34_0=='&') ) {s = 40;}

                        else if ( (LA34_0=='|') ) {s = 41;}

                        else if ( (LA34_0=='(') ) {s = 42;}

                        else if ( (LA34_0==')') ) {s = 43;}

                        else if ( (LA34_0=='{') ) {s = 44;}

                        else if ( (LA34_0=='}') ) {s = 45;}

                        else if ( (LA34_0=='[') ) {s = 46;}

                        else if ( (LA34_0==']') ) {s = 47;}

                        else if ( (LA34_0==';') ) {s = 48;}

                        else if ( (LA34_0=='*') ) {s = 49;}

                        else if ( (LA34_0==',') ) {s = 50;}

                        else if ( (LA34_0=='/') ) {s = 51;}

                        else if ( (LA34_0=='=') ) {s = 52;}

                        else if ( ((LA34_0 >= '\u0000' && LA34_0 <= '\b')||(LA34_0 >= '\u000B' && LA34_0 <= '\f')||(LA34_0 >= '\u000E' && LA34_0 <= '\u001F')||LA34_0=='%'||LA34_0=='\\'||LA34_0=='`'||(LA34_0 >= '~' && LA34_0 <= '\u00BF')||LA34_0=='\u00D7'||LA34_0=='\u00F7'||(LA34_0 >= '\u0300' && LA34_0 <= '\u036F')||LA34_0=='\u037E'||(LA34_0 >= '\u2000' && LA34_0 <= '\u200B')||(LA34_0 >= '\u200E' && LA34_0 <= '\u206F')||(LA34_0 >= '\u2190' && LA34_0 <= '\u2BFF')||(LA34_0 >= '\u2FF0' && LA34_0 <= '\u3000')||(LA34_0 >= '\uD800' && LA34_0 <= '\uF8FF')||(LA34_0 >= '\uFDD0' && LA34_0 <= '\uFDEF')||(LA34_0 >= '\uFFFE' && LA34_0 <= '\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_36 = input.LA(1);

                        s = -1;
                        if ( ((LA34_36 >= '\u0000' && LA34_36 <= '\uFFFF')) ) {s = 149;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}