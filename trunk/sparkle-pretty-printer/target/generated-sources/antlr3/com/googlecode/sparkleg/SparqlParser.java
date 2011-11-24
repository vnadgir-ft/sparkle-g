// $ANTLR 3.4 com\\googlecode\\sparkleg\\Sparql.g 2011-11-24 22:39:46

    package com.googlecode.sparkleg;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


/**
 * @author Simone Tripodi   (simone.tripodi)
 * @author Michele Mostarda (michele.mostarda)
 * @author Juergen Pfundt   (Juergen.Pfundt)
 * @version $Id: Sparql.g 226 2011-10-22 21:13:52Z Juergen.Pfundt@gmail.com $
 */
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SparqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ABS", "ADD", "ALL", "AND", "ANY", "ARG_LIST", "AS", "ASC", "ASK", "ASTERISK", "AVG", "BASE", "BIND", "BINDINGS", "BINDING_VALUE", "BLANK_NODE", "BLANK_NODE_LABEL", "BNODE", "BOUND", "BRACKETTED_EXPRESSION", "BY", "CEIL", "CLEAR", "CLOSE_BRACE", "CLOSE_CURLY_BRACE", "CLOSE_SQUARE_BRACKET", "COALESCE", "COLLECTION", "COMMA", "COMMENT", "CONCAT", "CONSTRUCT", "CONSTRUCT_TRIPLES", "CONTAINS", "COPY", "COUNT", "CREATE", "DATA", "DATATYPE", "DAY", "DECIMAL", "DECIMAL_NEGATIVE", "DECIMAL_POSITIVE", "DEFAULT", "DELETE", "DESC", "DESCRIBE", "DIGIT", "DISTINCT", "DIVIDE", "DOT", "DOUBLE", "DOUBLE_NEGATIVE", "DOUBLE_POSITIVE", "DROP", "ECHAR", "ENCODE_FOR_URI", "EOL", "EQUAL", "EXISTS", "EXPONENT", "EXPRESSION_LIST", "FALSE", "FILTER", "FLOOR", "FROM", "FUNCTION", "GRAPH", "GREATER", "GREATER_EQUAL", "GROUP", "GROUP_BY", "GROUP_CONCAT", "GROUP_CONDITION", "GROUP_GRAPH_PATTERN", "HAVING", "HOURS", "IF", "IN", "INSERT", "INTEGER", "INTEGER_NEGATIVE", "INTEGER_POSITIVE", "INTO", "INVERSE", "IRI", "IRI_REF", "IRI_REF_CHARACTERS", "ISBLANK", "ISIRI", "ISLITERAL", "ISNUMERIC", "ISURI", "LANG", "LANGMATCHES", "LANGTAG", "LCASE", "LESS", "LESS_EQUAL", "LIMIT", "LOAD", "MAX", "MD5", "MIN", "MINUS", "MINUS_KEYWORD", "MINUTES", "MODIFY", "MONTH", "MOVE", "NAMED", "NEGATION", "NOT", "NOT_EQUAL", "NOT_EXISTS", "NOW", "OBJECT", "OFFSET", "OPEN_BRACE", "OPEN_CURLY_BRACE", "OPEN_SQUARE_BRACKET", "OPTIONAL", "OR", "ORDER", "ORDER_BY", "ORDER_CONDITION", "PATH", "PATH_NEGATED", "PATH_PRIMARY", "PATH_SEQUENCE", "PIPE", "PLUS", "PNAME_LN", "PNAME_NS", "PN_CHARS", "PN_CHARS_BASE", "PN_CHARS_U", "PN_LOCAL", "PN_PREFIX", "PREDICATE", "PREFIX", "PROLOGUE", "QUERY", "QUESTION_MARK", "RAND", "REDUCED", "REFERENCE", "REGEX", "REPLACE", "ROUND", "SAMETERM", "SAMPLE", "SECONDS", "SELECT", "SELECT_CLAUSE", "SEMICOLON", "SEPARATOR", "SERVICE", "SHA1", "SHA224", "SHA256", "SHA384", "SHA512", "SIGN", "SILENT", "STR", "STRAFTER", "STRBEFORE", "STRDT", "STRENDS", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "STRLANG", "STRLEN", "STRSTARTS", "SUBJECT", "SUBSELECT", "SUBSTR", "SUM", "TIMEZONE", "TO", "TRIPLES_BLOCK", "TRIPLES_NODE", "TRIPLES_SAME_SUBJECT", "TRIPLES_TEMPLATE", "TRUE", "TZ", "UCASE", "UNARY", "UNDEF", "UNION", "UPDATE", "URI", "USING", "VAR", "VAR1", "VAR2", "VARNAME", "WHERE", "WHERE_CLAUSE", "WITH", "WS", "YEAR"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SparqlParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SparqlParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SparqlParser.tokenNames; }
    public String getGrammarFileName() { return "com\\googlecode\\sparkleg\\Sparql.g"; }


    public static class query_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // com\\googlecode\\sparkleg\\Sparql.g:76:1: query : ( prologue ( selectQuery | constructQuery | describeQuery | askQuery ) bindingsClause EOF -> ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* ) ( bindingsClause )* | update ( SEMICOLON ( update )? )* EOF -> ^( UPDATE ( update )+ ) );
    public final SparqlParser.query_return query() throws RecognitionException {
        SparqlParser.query_return retval = new SparqlParser.query_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF7=null;
        Token SEMICOLON9=null;
        Token EOF11=null;
        SparqlParser.prologue_return prologue1 =null;

        SparqlParser.selectQuery_return selectQuery2 =null;

        SparqlParser.constructQuery_return constructQuery3 =null;

        SparqlParser.describeQuery_return describeQuery4 =null;

        SparqlParser.askQuery_return askQuery5 =null;

        SparqlParser.bindingsClause_return bindingsClause6 =null;

        SparqlParser.update_return update8 =null;

        SparqlParser.update_return update10 =null;


        Object EOF7_tree=null;
        Object SEMICOLON9_tree=null;
        Object EOF11_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_update=new RewriteRuleSubtreeStream(adaptor,"rule update");
        RewriteRuleSubtreeStream stream_describeQuery=new RewriteRuleSubtreeStream(adaptor,"rule describeQuery");
        RewriteRuleSubtreeStream stream_bindingsClause=new RewriteRuleSubtreeStream(adaptor,"rule bindingsClause");
        RewriteRuleSubtreeStream stream_constructQuery=new RewriteRuleSubtreeStream(adaptor,"rule constructQuery");
        RewriteRuleSubtreeStream stream_askQuery=new RewriteRuleSubtreeStream(adaptor,"rule askQuery");
        RewriteRuleSubtreeStream stream_prologue=new RewriteRuleSubtreeStream(adaptor,"rule prologue");
        RewriteRuleSubtreeStream stream_selectQuery=new RewriteRuleSubtreeStream(adaptor,"rule selectQuery");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:77:5: ( prologue ( selectQuery | constructQuery | describeQuery | askQuery ) bindingsClause EOF -> ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* ) ( bindingsClause )* | update ( SEMICOLON ( update )? )* EOF -> ^( UPDATE ( update )+ ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:77:7: prologue ( selectQuery | constructQuery | describeQuery | askQuery ) bindingsClause EOF
                    {
                    pushFollow(FOLLOW_prologue_in_query155);
                    prologue1=prologue();

                    state._fsp--;

                    stream_prologue.add(prologue1.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:77:16: ( selectQuery | constructQuery | describeQuery | askQuery )
                    int alt1=4;
                    switch ( input.LA(1) ) {
                    case SELECT:
                        {
                        alt1=1;
                        }
                        break;
                    case CONSTRUCT:
                        {
                        alt1=2;
                        }
                        break;
                    case DESCRIBE:
                        {
                        alt1=3;
                        }
                        break;
                    case ASK:
                        {
                        alt1=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;

                    }

                    switch (alt1) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:77:17: selectQuery
                            {
                            pushFollow(FOLLOW_selectQuery_in_query158);
                            selectQuery2=selectQuery();

                            state._fsp--;

                            stream_selectQuery.add(selectQuery2.getTree());

                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\Sparql.g:77:31: constructQuery
                            {
                            pushFollow(FOLLOW_constructQuery_in_query162);
                            constructQuery3=constructQuery();

                            state._fsp--;

                            stream_constructQuery.add(constructQuery3.getTree());

                            }
                            break;
                        case 3 :
                            // com\\googlecode\\sparkleg\\Sparql.g:77:48: describeQuery
                            {
                            pushFollow(FOLLOW_describeQuery_in_query166);
                            describeQuery4=describeQuery();

                            state._fsp--;

                            stream_describeQuery.add(describeQuery4.getTree());

                            }
                            break;
                        case 4 :
                            // com\\googlecode\\sparkleg\\Sparql.g:77:64: askQuery
                            {
                            pushFollow(FOLLOW_askQuery_in_query170);
                            askQuery5=askQuery();

                            state._fsp--;

                            stream_askQuery.add(askQuery5.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_bindingsClause_in_query173);
                    bindingsClause6=bindingsClause();

                    state._fsp--;

                    stream_bindingsClause.add(bindingsClause6.getTree());

                    EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_query175);  
                    stream_EOF.add(EOF7);


                    // AST REWRITE
                    // elements: constructQuery, prologue, describeQuery, bindingsClause, askQuery, selectQuery
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 77:93: -> ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* ) ( bindingsClause )*
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:77:96: ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(QUERY, "QUERY")
                        , root_1);

                        adaptor.addChild(root_1, stream_prologue.nextTree());

                        // com\\googlecode\\sparkleg\\Sparql.g:77:113: ( selectQuery )*
                        while ( stream_selectQuery.hasNext() ) {
                            adaptor.addChild(root_1, stream_selectQuery.nextTree());

                        }
                        stream_selectQuery.reset();

                        // com\\googlecode\\sparkleg\\Sparql.g:77:126: ( constructQuery )*
                        while ( stream_constructQuery.hasNext() ) {
                            adaptor.addChild(root_1, stream_constructQuery.nextTree());

                        }
                        stream_constructQuery.reset();

                        // com\\googlecode\\sparkleg\\Sparql.g:77:142: ( describeQuery )*
                        while ( stream_describeQuery.hasNext() ) {
                            adaptor.addChild(root_1, stream_describeQuery.nextTree());

                        }
                        stream_describeQuery.reset();

                        // com\\googlecode\\sparkleg\\Sparql.g:77:157: ( askQuery )*
                        while ( stream_askQuery.hasNext() ) {
                            adaptor.addChild(root_1, stream_askQuery.nextTree());

                        }
                        stream_askQuery.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                        // com\\googlecode\\sparkleg\\Sparql.g:77:168: ( bindingsClause )*
                        while ( stream_bindingsClause.hasNext() ) {
                            adaptor.addChild(root_0, stream_bindingsClause.nextTree());

                        }
                        stream_bindingsClause.reset();

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:78:7: update ( SEMICOLON ( update )? )* EOF
                    {
                    pushFollow(FOLLOW_update_in_query206);
                    update8=update();

                    state._fsp--;

                    stream_update.add(update8.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:78:14: ( SEMICOLON ( update )? )*
                    loop3:
                    do {
                        int alt3=2;
                        switch ( input.LA(1) ) {
                        case SEMICOLON:
                            {
                            alt3=1;
                            }
                            break;

                        }

                        switch (alt3) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:78:15: SEMICOLON ( update )?
                    	    {
                    	    SEMICOLON9=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_query209);  
                    	    stream_SEMICOLON.add(SEMICOLON9);


                    	    // com\\googlecode\\sparkleg\\Sparql.g:78:25: ( update )?
                    	    int alt2=2;
                    	    switch ( input.LA(1) ) {
                    	        case ADD:
                    	        case ASK:
                    	        case BASE:
                    	        case CLEAR:
                    	        case CONSTRUCT:
                    	        case COPY:
                    	        case CREATE:
                    	        case DELETE:
                    	        case DESCRIBE:
                    	        case DROP:
                    	        case INSERT:
                    	        case LOAD:
                    	        case MOVE:
                    	        case PREFIX:
                    	        case SELECT:
                    	        case WITH:
                    	            {
                    	            alt2=1;
                    	            }
                    	            break;
                    	    }

                    	    switch (alt2) {
                    	        case 1 :
                    	            // com\\googlecode\\sparkleg\\Sparql.g:78:25: update
                    	            {
                    	            pushFollow(FOLLOW_update_in_query211);
                    	            update10=update();

                    	            state._fsp--;

                    	            stream_update.add(update10.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    EOF11=(Token)match(input,EOF,FOLLOW_EOF_in_query216);  
                    stream_EOF.add(EOF11);


                    // AST REWRITE
                    // elements: update
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:39: -> ^( UPDATE ( update )+ )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:78:42: ^( UPDATE ( update )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(UPDATE, "UPDATE")
                        , root_1);

                        if ( !(stream_update.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_update.hasNext() ) {
                            adaptor.addChild(root_1, stream_update.nextTree());

                        }
                        stream_update.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query"


    public static class prologue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prologue"
    // com\\googlecode\\sparkleg\\Sparql.g:81:1: prologue : ( baseDecl | prefixDecl )* -> ^( PROLOGUE ( baseDecl )* ( prefixDecl )* ) ;
    public final SparqlParser.prologue_return prologue() throws RecognitionException {
        SparqlParser.prologue_return retval = new SparqlParser.prologue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.baseDecl_return baseDecl12 =null;

        SparqlParser.prefixDecl_return prefixDecl13 =null;


        RewriteRuleSubtreeStream stream_prefixDecl=new RewriteRuleSubtreeStream(adaptor,"rule prefixDecl");
        RewriteRuleSubtreeStream stream_baseDecl=new RewriteRuleSubtreeStream(adaptor,"rule baseDecl");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:83:5: ( ( baseDecl | prefixDecl )* -> ^( PROLOGUE ( baseDecl )* ( prefixDecl )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:83:7: ( baseDecl | prefixDecl )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:83:7: ( baseDecl | prefixDecl )*
            loop5:
            do {
                int alt5=3;
                switch ( input.LA(1) ) {
                case BASE:
                    {
                    alt5=1;
                    }
                    break;
                case PREFIX:
                    {
                    alt5=2;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:83:8: baseDecl
            	    {
            	    pushFollow(FOLLOW_baseDecl_in_prologue249);
            	    baseDecl12=baseDecl();

            	    state._fsp--;

            	    stream_baseDecl.add(baseDecl12.getTree());

            	    }
            	    break;
            	case 2 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:83:19: prefixDecl
            	    {
            	    pushFollow(FOLLOW_prefixDecl_in_prologue253);
            	    prefixDecl13=prefixDecl();

            	    state._fsp--;

            	    stream_prefixDecl.add(prefixDecl13.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: prefixDecl, baseDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 83:32: -> ^( PROLOGUE ( baseDecl )* ( prefixDecl )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:83:35: ^( PROLOGUE ( baseDecl )* ( prefixDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROLOGUE, "PROLOGUE")
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:83:46: ( baseDecl )*
                while ( stream_baseDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_baseDecl.nextTree());

                }
                stream_baseDecl.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:83:56: ( prefixDecl )*
                while ( stream_prefixDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_prefixDecl.nextTree());

                }
                stream_prefixDecl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prologue"


    public static class baseDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "baseDecl"
    // com\\googlecode\\sparkleg\\Sparql.g:86:1: baseDecl : BASE IRI_REF -> ^( BASE IRI_REF ) ;
    public final SparqlParser.baseDecl_return baseDecl() throws RecognitionException {
        SparqlParser.baseDecl_return retval = new SparqlParser.baseDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE14=null;
        Token IRI_REF15=null;

        Object BASE14_tree=null;
        Object IRI_REF15_tree=null;
        RewriteRuleTokenStream stream_BASE=new RewriteRuleTokenStream(adaptor,"token BASE");
        RewriteRuleTokenStream stream_IRI_REF=new RewriteRuleTokenStream(adaptor,"token IRI_REF");

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:87:5: ( BASE IRI_REF -> ^( BASE IRI_REF ) )
            // com\\googlecode\\sparkleg\\Sparql.g:87:7: BASE IRI_REF
            {
            BASE14=(Token)match(input,BASE,FOLLOW_BASE_in_baseDecl284);  
            stream_BASE.add(BASE14);


            IRI_REF15=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_baseDecl286);  
            stream_IRI_REF.add(IRI_REF15);


            // AST REWRITE
            // elements: BASE, IRI_REF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:20: -> ^( BASE IRI_REF )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:87:23: ^( BASE IRI_REF )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_BASE.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IRI_REF.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "baseDecl"


    public static class prefixDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefixDecl"
    // com\\googlecode\\sparkleg\\Sparql.g:90:1: prefixDecl : PREFIX PNAME_NS IRI_REF -> ^( PREFIX PNAME_NS IRI_REF ) ;
    public final SparqlParser.prefixDecl_return prefixDecl() throws RecognitionException {
        SparqlParser.prefixDecl_return retval = new SparqlParser.prefixDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PREFIX16=null;
        Token PNAME_NS17=null;
        Token IRI_REF18=null;

        Object PREFIX16_tree=null;
        Object PNAME_NS17_tree=null;
        Object IRI_REF18_tree=null;
        RewriteRuleTokenStream stream_PREFIX=new RewriteRuleTokenStream(adaptor,"token PREFIX");
        RewriteRuleTokenStream stream_PNAME_NS=new RewriteRuleTokenStream(adaptor,"token PNAME_NS");
        RewriteRuleTokenStream stream_IRI_REF=new RewriteRuleTokenStream(adaptor,"token IRI_REF");

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:91:5: ( PREFIX PNAME_NS IRI_REF -> ^( PREFIX PNAME_NS IRI_REF ) )
            // com\\googlecode\\sparkleg\\Sparql.g:91:7: PREFIX PNAME_NS IRI_REF
            {
            PREFIX16=(Token)match(input,PREFIX,FOLLOW_PREFIX_in_prefixDecl312);  
            stream_PREFIX.add(PREFIX16);


            PNAME_NS17=(Token)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixDecl314);  
            stream_PNAME_NS.add(PNAME_NS17);


            IRI_REF18=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_prefixDecl316);  
            stream_IRI_REF.add(IRI_REF18);


            // AST REWRITE
            // elements: PREFIX, IRI_REF, PNAME_NS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:31: -> ^( PREFIX PNAME_NS IRI_REF )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:91:34: ^( PREFIX PNAME_NS IRI_REF )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_PREFIX.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_PNAME_NS.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_IRI_REF.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prefixDecl"


    public static class selectQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectQuery"
    // com\\googlecode\\sparkleg\\Sparql.g:94:1: selectQuery : selectClause ( datasetClause )* whereClause solutionModifier -> ^( SELECT selectClause ( datasetClause )* ( whereClause )* ( solutionModifier )* ) ;
    public final SparqlParser.selectQuery_return selectQuery() throws RecognitionException {
        SparqlParser.selectQuery_return retval = new SparqlParser.selectQuery_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.selectClause_return selectClause19 =null;

        SparqlParser.datasetClause_return datasetClause20 =null;

        SparqlParser.whereClause_return whereClause21 =null;

        SparqlParser.solutionModifier_return solutionModifier22 =null;


        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_datasetClause=new RewriteRuleSubtreeStream(adaptor,"rule datasetClause");
        RewriteRuleSubtreeStream stream_solutionModifier=new RewriteRuleSubtreeStream(adaptor,"rule solutionModifier");
        RewriteRuleSubtreeStream stream_selectClause=new RewriteRuleSubtreeStream(adaptor,"rule selectClause");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:95:5: ( selectClause ( datasetClause )* whereClause solutionModifier -> ^( SELECT selectClause ( datasetClause )* ( whereClause )* ( solutionModifier )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:95:7: selectClause ( datasetClause )* whereClause solutionModifier
            {
            pushFollow(FOLLOW_selectClause_in_selectQuery343);
            selectClause19=selectClause();

            state._fsp--;

            stream_selectClause.add(selectClause19.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:95:20: ( datasetClause )*
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case FROM:
                    {
                    alt6=1;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:95:20: datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_selectQuery345);
            	    datasetClause20=datasetClause();

            	    state._fsp--;

            	    stream_datasetClause.add(datasetClause20.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            pushFollow(FOLLOW_whereClause_in_selectQuery348);
            whereClause21=whereClause();

            state._fsp--;

            stream_whereClause.add(whereClause21.getTree());

            pushFollow(FOLLOW_solutionModifier_in_selectQuery350);
            solutionModifier22=solutionModifier();

            state._fsp--;

            stream_solutionModifier.add(solutionModifier22.getTree());

            // AST REWRITE
            // elements: solutionModifier, selectClause, whereClause, datasetClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 95:64: -> ^( SELECT selectClause ( datasetClause )* ( whereClause )* ( solutionModifier )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:95:67: ^( SELECT selectClause ( datasetClause )* ( whereClause )* ( solutionModifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SELECT, "SELECT")
                , root_1);

                adaptor.addChild(root_1, stream_selectClause.nextTree());

                // com\\googlecode\\sparkleg\\Sparql.g:95:89: ( datasetClause )*
                while ( stream_datasetClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_datasetClause.nextTree());

                }
                stream_datasetClause.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:95:104: ( whereClause )*
                while ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:95:117: ( solutionModifier )*
                while ( stream_solutionModifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_solutionModifier.nextTree());

                }
                stream_solutionModifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectQuery"


    public static class subSelect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subSelect"
    // com\\googlecode\\sparkleg\\Sparql.g:98:1: subSelect : selectClause whereClause solutionModifier -> ^( SUBSELECT selectClause ( whereClause )* ( solutionModifier )* ) ;
    public final SparqlParser.subSelect_return subSelect() throws RecognitionException {
        SparqlParser.subSelect_return retval = new SparqlParser.subSelect_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.selectClause_return selectClause23 =null;

        SparqlParser.whereClause_return whereClause24 =null;

        SparqlParser.solutionModifier_return solutionModifier25 =null;


        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_solutionModifier=new RewriteRuleSubtreeStream(adaptor,"rule solutionModifier");
        RewriteRuleSubtreeStream stream_selectClause=new RewriteRuleSubtreeStream(adaptor,"rule selectClause");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:99:5: ( selectClause whereClause solutionModifier -> ^( SUBSELECT selectClause ( whereClause )* ( solutionModifier )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:99:7: selectClause whereClause solutionModifier
            {
            pushFollow(FOLLOW_selectClause_in_subSelect384);
            selectClause23=selectClause();

            state._fsp--;

            stream_selectClause.add(selectClause23.getTree());

            pushFollow(FOLLOW_whereClause_in_subSelect386);
            whereClause24=whereClause();

            state._fsp--;

            stream_whereClause.add(whereClause24.getTree());

            pushFollow(FOLLOW_solutionModifier_in_subSelect388);
            solutionModifier25=solutionModifier();

            state._fsp--;

            stream_solutionModifier.add(solutionModifier25.getTree());

            // AST REWRITE
            // elements: selectClause, solutionModifier, whereClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:49: -> ^( SUBSELECT selectClause ( whereClause )* ( solutionModifier )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:99:52: ^( SUBSELECT selectClause ( whereClause )* ( solutionModifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SUBSELECT, "SUBSELECT")
                , root_1);

                adaptor.addChild(root_1, stream_selectClause.nextTree());

                // com\\googlecode\\sparkleg\\Sparql.g:99:77: ( whereClause )*
                while ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:99:90: ( solutionModifier )*
                while ( stream_solutionModifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_solutionModifier.nextTree());

                }
                stream_solutionModifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subSelect"


    public static class selectClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectClause"
    // com\\googlecode\\sparkleg\\Sparql.g:102:1: selectClause : ( SELECT ( DISTINCT | REDUCED )? ASTERISK -> ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ASTERISK ) | SELECT ( DISTINCT | REDUCED )? (v+= selectVariables )+ -> ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ( $v)* ) );
    public final SparqlParser.selectClause_return selectClause() throws RecognitionException {
        SparqlParser.selectClause_return retval = new SparqlParser.selectClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT26=null;
        Token DISTINCT27=null;
        Token REDUCED28=null;
        Token ASTERISK29=null;
        Token SELECT30=null;
        Token DISTINCT31=null;
        Token REDUCED32=null;
        List list_v=null;
        RuleReturnScope v = null;
        Object SELECT26_tree=null;
        Object DISTINCT27_tree=null;
        Object REDUCED28_tree=null;
        Object ASTERISK29_tree=null;
        Object SELECT30_tree=null;
        Object DISTINCT31_tree=null;
        Object REDUCED32_tree=null;
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_REDUCED=new RewriteRuleTokenStream(adaptor,"token REDUCED");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_selectVariables=new RewriteRuleSubtreeStream(adaptor,"rule selectVariables");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:103:5: ( SELECT ( DISTINCT | REDUCED )? ASTERISK -> ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ASTERISK ) | SELECT ( DISTINCT | REDUCED )? (v+= selectVariables )+ -> ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ( $v)* ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case SELECT:
                {
                switch ( input.LA(2) ) {
                case DISTINCT:
                    {
                    switch ( input.LA(3) ) {
                    case ASTERISK:
                        {
                        alt10=1;
                        }
                        break;
                    case OPEN_BRACE:
                    case VAR1:
                    case VAR2:
                        {
                        alt10=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                case REDUCED:
                    {
                    switch ( input.LA(3) ) {
                    case ASTERISK:
                        {
                        alt10=1;
                        }
                        break;
                    case OPEN_BRACE:
                    case VAR1:
                    case VAR2:
                        {
                        alt10=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case ASTERISK:
                    {
                    alt10=1;
                    }
                    break;
                case OPEN_BRACE:
                case VAR1:
                case VAR2:
                    {
                    alt10=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:103:7: SELECT ( DISTINCT | REDUCED )? ASTERISK
                    {
                    SELECT26=(Token)match(input,SELECT,FOLLOW_SELECT_in_selectClause424);  
                    stream_SELECT.add(SELECT26);


                    // com\\googlecode\\sparkleg\\Sparql.g:103:14: ( DISTINCT | REDUCED )?
                    int alt7=3;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt7=1;
                            }
                            break;
                        case REDUCED:
                            {
                            alt7=2;
                            }
                            break;
                    }

                    switch (alt7) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:103:15: DISTINCT
                            {
                            DISTINCT27=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause427);  
                            stream_DISTINCT.add(DISTINCT27);


                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\Sparql.g:103:26: REDUCED
                            {
                            REDUCED28=(Token)match(input,REDUCED,FOLLOW_REDUCED_in_selectClause431);  
                            stream_REDUCED.add(REDUCED28);


                            }
                            break;

                    }


                    ASTERISK29=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_selectClause435);  
                    stream_ASTERISK.add(ASTERISK29);


                    // AST REWRITE
                    // elements: ASTERISK, REDUCED, DISTINCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:45: -> ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ASTERISK )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:103:48: ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ASTERISK )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SELECT_CLAUSE, "SELECT_CLAUSE")
                        , root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:103:64: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DISTINCT.nextNode()
                            );

                        }
                        stream_DISTINCT.reset();

                        // com\\googlecode\\sparkleg\\Sparql.g:103:74: ( REDUCED )*
                        while ( stream_REDUCED.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_REDUCED.nextNode()
                            );

                        }
                        stream_REDUCED.reset();

                        adaptor.addChild(root_1, 
                        stream_ASTERISK.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:104:7: SELECT ( DISTINCT | REDUCED )? (v+= selectVariables )+
                    {
                    SELECT30=(Token)match(input,SELECT,FOLLOW_SELECT_in_selectClause457);  
                    stream_SELECT.add(SELECT30);


                    // com\\googlecode\\sparkleg\\Sparql.g:104:14: ( DISTINCT | REDUCED )?
                    int alt8=3;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt8=1;
                            }
                            break;
                        case REDUCED:
                            {
                            alt8=2;
                            }
                            break;
                    }

                    switch (alt8) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:104:15: DISTINCT
                            {
                            DISTINCT31=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause460);  
                            stream_DISTINCT.add(DISTINCT31);


                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\Sparql.g:104:26: REDUCED
                            {
                            REDUCED32=(Token)match(input,REDUCED,FOLLOW_REDUCED_in_selectClause464);  
                            stream_REDUCED.add(REDUCED32);


                            }
                            break;

                    }


                    // com\\googlecode\\sparkleg\\Sparql.g:104:36: (v+= selectVariables )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case OPEN_BRACE:
                        case VAR1:
                        case VAR2:
                            {
                            alt9=1;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:104:37: v+= selectVariables
                    	    {
                    	    pushFollow(FOLLOW_selectVariables_in_selectClause471);
                    	    v=selectVariables();

                    	    state._fsp--;

                    	    stream_selectVariables.add(v.getTree());
                    	    if (list_v==null) list_v=new ArrayList();
                    	    list_v.add(v.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    // AST REWRITE
                    // elements: DISTINCT, REDUCED, v
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: v
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"token v",list_v);
                    root_0 = (Object)adaptor.nil();
                    // 104:58: -> ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ( $v)* )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:104:61: ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ( $v)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SELECT_CLAUSE, "SELECT_CLAUSE")
                        , root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:104:77: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DISTINCT.nextNode()
                            );

                        }
                        stream_DISTINCT.reset();

                        // com\\googlecode\\sparkleg\\Sparql.g:104:87: ( REDUCED )*
                        while ( stream_REDUCED.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_REDUCED.nextNode()
                            );

                        }
                        stream_REDUCED.reset();

                        // com\\googlecode\\sparkleg\\Sparql.g:104:97: ( $v)*
                        while ( stream_v.hasNext() ) {
                            adaptor.addChild(root_1, stream_v.nextTree());

                        }
                        stream_v.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectClause"


    public static class selectVariables_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectVariables"
    // com\\googlecode\\sparkleg\\Sparql.g:107:1: selectVariables : ( var -> ^( VAR var ) | OPEN_BRACE expression AS var CLOSE_BRACE -> ^( AS expression var ) );
    public final SparqlParser.selectVariables_return selectVariables() throws RecognitionException {
        SparqlParser.selectVariables_return retval = new SparqlParser.selectVariables_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_BRACE34=null;
        Token AS36=null;
        Token CLOSE_BRACE38=null;
        SparqlParser.var_return var33 =null;

        SparqlParser.expression_return expression35 =null;

        SparqlParser.var_return var37 =null;


        Object OPEN_BRACE34_tree=null;
        Object AS36_tree=null;
        Object CLOSE_BRACE38_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:108:5: ( var -> ^( VAR var ) | OPEN_BRACE expression AS var CLOSE_BRACE -> ^( AS expression var ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case VAR1:
            case VAR2:
                {
                alt11=1;
                }
                break;
            case OPEN_BRACE:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:108:7: var
                    {
                    pushFollow(FOLLOW_var_in_selectVariables506);
                    var33=var();

                    state._fsp--;

                    stream_var.add(var33.getTree());

                    // AST REWRITE
                    // elements: var
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:11: -> ^( VAR var )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:108:14: ^( VAR var )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, stream_var.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:109:7: OPEN_BRACE expression AS var CLOSE_BRACE
                    {
                    OPEN_BRACE34=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_selectVariables523);  
                    stream_OPEN_BRACE.add(OPEN_BRACE34);


                    pushFollow(FOLLOW_expression_in_selectVariables525);
                    expression35=expression();

                    state._fsp--;

                    stream_expression.add(expression35.getTree());

                    AS36=(Token)match(input,AS,FOLLOW_AS_in_selectVariables527);  
                    stream_AS.add(AS36);


                    pushFollow(FOLLOW_var_in_selectVariables529);
                    var37=var();

                    state._fsp--;

                    stream_var.add(var37.getTree());

                    CLOSE_BRACE38=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_selectVariables531);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE38);


                    // AST REWRITE
                    // elements: expression, var, AS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:48: -> ^( AS expression var )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:109:51: ^( AS expression var )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_AS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_var.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectVariables"


    public static class constructQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructQuery"
    // com\\googlecode\\sparkleg\\Sparql.g:112:1: constructQuery : ( CONSTRUCT constructTemplate ( datasetClause )* whereClause solutionModifier -> ^( CONSTRUCT constructTemplate ( datasetClause )* ( whereClause )* ( solutionModifier )* ) | CONSTRUCT ( datasetClause )* WHERE groupGraphPattern solutionModifier -> ^( CONSTRUCT ( datasetClause )* ^( WHERE_CLAUSE ( groupGraphPattern )* ) ( solutionModifier )* ) );
    public final SparqlParser.constructQuery_return constructQuery() throws RecognitionException {
        SparqlParser.constructQuery_return retval = new SparqlParser.constructQuery_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONSTRUCT39=null;
        Token CONSTRUCT44=null;
        Token WHERE46=null;
        SparqlParser.constructTemplate_return constructTemplate40 =null;

        SparqlParser.datasetClause_return datasetClause41 =null;

        SparqlParser.whereClause_return whereClause42 =null;

        SparqlParser.solutionModifier_return solutionModifier43 =null;

        SparqlParser.datasetClause_return datasetClause45 =null;

        SparqlParser.groupGraphPattern_return groupGraphPattern47 =null;

        SparqlParser.solutionModifier_return solutionModifier48 =null;


        Object CONSTRUCT39_tree=null;
        Object CONSTRUCT44_tree=null;
        Object WHERE46_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_CONSTRUCT=new RewriteRuleTokenStream(adaptor,"token CONSTRUCT");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_datasetClause=new RewriteRuleSubtreeStream(adaptor,"rule datasetClause");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        RewriteRuleSubtreeStream stream_solutionModifier=new RewriteRuleSubtreeStream(adaptor,"rule solutionModifier");
        RewriteRuleSubtreeStream stream_constructTemplate=new RewriteRuleSubtreeStream(adaptor,"rule constructTemplate");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:113:5: ( CONSTRUCT constructTemplate ( datasetClause )* whereClause solutionModifier -> ^( CONSTRUCT constructTemplate ( datasetClause )* ( whereClause )* ( solutionModifier )* ) | CONSTRUCT ( datasetClause )* WHERE groupGraphPattern solutionModifier -> ^( CONSTRUCT ( datasetClause )* ^( WHERE_CLAUSE ( groupGraphPattern )* ) ( solutionModifier )* ) )
            int alt14=2;
            switch ( input.LA(1) ) {
            case CONSTRUCT:
                {
                switch ( input.LA(2) ) {
                case OPEN_CURLY_BRACE:
                    {
                    alt14=1;
                    }
                    break;
                case FROM:
                case WHERE:
                    {
                    alt14=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:113:7: CONSTRUCT constructTemplate ( datasetClause )* whereClause solutionModifier
                    {
                    CONSTRUCT39=(Token)match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_constructQuery558);  
                    stream_CONSTRUCT.add(CONSTRUCT39);


                    pushFollow(FOLLOW_constructTemplate_in_constructQuery560);
                    constructTemplate40=constructTemplate();

                    state._fsp--;

                    stream_constructTemplate.add(constructTemplate40.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:113:35: ( datasetClause )*
                    loop12:
                    do {
                        int alt12=2;
                        switch ( input.LA(1) ) {
                        case FROM:
                            {
                            alt12=1;
                            }
                            break;

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:113:35: datasetClause
                    	    {
                    	    pushFollow(FOLLOW_datasetClause_in_constructQuery562);
                    	    datasetClause41=datasetClause();

                    	    state._fsp--;

                    	    stream_datasetClause.add(datasetClause41.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    pushFollow(FOLLOW_whereClause_in_constructQuery565);
                    whereClause42=whereClause();

                    state._fsp--;

                    stream_whereClause.add(whereClause42.getTree());

                    pushFollow(FOLLOW_solutionModifier_in_constructQuery567);
                    solutionModifier43=solutionModifier();

                    state._fsp--;

                    stream_solutionModifier.add(solutionModifier43.getTree());

                    // AST REWRITE
                    // elements: datasetClause, whereClause, solutionModifier, constructTemplate, CONSTRUCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:79: -> ^( CONSTRUCT constructTemplate ( datasetClause )* ( whereClause )* ( solutionModifier )* )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:113:82: ^( CONSTRUCT constructTemplate ( datasetClause )* ( whereClause )* ( solutionModifier )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CONSTRUCT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_constructTemplate.nextTree());

                        // com\\googlecode\\sparkleg\\Sparql.g:113:112: ( datasetClause )*
                        while ( stream_datasetClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_datasetClause.nextTree());

                        }
                        stream_datasetClause.reset();

                        // com\\googlecode\\sparkleg\\Sparql.g:113:127: ( whereClause )*
                        while ( stream_whereClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_whereClause.nextTree());

                        }
                        stream_whereClause.reset();

                        // com\\googlecode\\sparkleg\\Sparql.g:113:140: ( solutionModifier )*
                        while ( stream_solutionModifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_solutionModifier.nextTree());

                        }
                        stream_solutionModifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:114:7: CONSTRUCT ( datasetClause )* WHERE groupGraphPattern solutionModifier
                    {
                    CONSTRUCT44=(Token)match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_constructQuery592);  
                    stream_CONSTRUCT.add(CONSTRUCT44);


                    // com\\googlecode\\sparkleg\\Sparql.g:114:17: ( datasetClause )*
                    loop13:
                    do {
                        int alt13=2;
                        switch ( input.LA(1) ) {
                        case FROM:
                            {
                            alt13=1;
                            }
                            break;

                        }

                        switch (alt13) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:114:17: datasetClause
                    	    {
                    	    pushFollow(FOLLOW_datasetClause_in_constructQuery594);
                    	    datasetClause45=datasetClause();

                    	    state._fsp--;

                    	    stream_datasetClause.add(datasetClause45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    WHERE46=(Token)match(input,WHERE,FOLLOW_WHERE_in_constructQuery597);  
                    stream_WHERE.add(WHERE46);


                    pushFollow(FOLLOW_groupGraphPattern_in_constructQuery599);
                    groupGraphPattern47=groupGraphPattern();

                    state._fsp--;

                    stream_groupGraphPattern.add(groupGraphPattern47.getTree());

                    pushFollow(FOLLOW_solutionModifier_in_constructQuery601);
                    solutionModifier48=solutionModifier();

                    state._fsp--;

                    stream_solutionModifier.add(solutionModifier48.getTree());

                    // AST REWRITE
                    // elements: groupGraphPattern, CONSTRUCT, solutionModifier, datasetClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:73: -> ^( CONSTRUCT ( datasetClause )* ^( WHERE_CLAUSE ( groupGraphPattern )* ) ( solutionModifier )* )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:114:76: ^( CONSTRUCT ( datasetClause )* ^( WHERE_CLAUSE ( groupGraphPattern )* ) ( solutionModifier )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CONSTRUCT.nextNode()
                        , root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:114:88: ( datasetClause )*
                        while ( stream_datasetClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_datasetClause.nextTree());

                        }
                        stream_datasetClause.reset();

                        // com\\googlecode\\sparkleg\\Sparql.g:114:103: ^( WHERE_CLAUSE ( groupGraphPattern )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WHERE_CLAUSE, "WHERE_CLAUSE")
                        , root_2);

                        // com\\googlecode\\sparkleg\\Sparql.g:114:118: ( groupGraphPattern )*
                        while ( stream_groupGraphPattern.hasNext() ) {
                            adaptor.addChild(root_2, stream_groupGraphPattern.nextTree());

                        }
                        stream_groupGraphPattern.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        // com\\googlecode\\sparkleg\\Sparql.g:114:138: ( solutionModifier )*
                        while ( stream_solutionModifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_solutionModifier.nextTree());

                        }
                        stream_solutionModifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructQuery"


    public static class describeQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "describeQuery"
    // com\\googlecode\\sparkleg\\Sparql.g:117:1: describeQuery : DESCRIBE ( (v+= varOrIRIref )+ | ASTERISK ) ( datasetClause )* ( whereClause )? solutionModifier -> ^( DESCRIBE ( $v)* ( ASTERISK )* ( datasetClause )* ( whereClause )? ( solutionModifier )* ) ;
    public final SparqlParser.describeQuery_return describeQuery() throws RecognitionException {
        SparqlParser.describeQuery_return retval = new SparqlParser.describeQuery_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DESCRIBE49=null;
        Token ASTERISK50=null;
        List list_v=null;
        SparqlParser.datasetClause_return datasetClause51 =null;

        SparqlParser.whereClause_return whereClause52 =null;

        SparqlParser.solutionModifier_return solutionModifier53 =null;

        RuleReturnScope v = null;
        Object DESCRIBE49_tree=null;
        Object ASTERISK50_tree=null;
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleSubtreeStream stream_varOrIRIref=new RewriteRuleSubtreeStream(adaptor,"rule varOrIRIref");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_datasetClause=new RewriteRuleSubtreeStream(adaptor,"rule datasetClause");
        RewriteRuleSubtreeStream stream_solutionModifier=new RewriteRuleSubtreeStream(adaptor,"rule solutionModifier");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:118:5: ( DESCRIBE ( (v+= varOrIRIref )+ | ASTERISK ) ( datasetClause )* ( whereClause )? solutionModifier -> ^( DESCRIBE ( $v)* ( ASTERISK )* ( datasetClause )* ( whereClause )? ( solutionModifier )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:118:7: DESCRIBE ( (v+= varOrIRIref )+ | ASTERISK ) ( datasetClause )* ( whereClause )? solutionModifier
            {
            DESCRIBE49=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeQuery637);  
            stream_DESCRIBE.add(DESCRIBE49);


            // com\\googlecode\\sparkleg\\Sparql.g:118:16: ( (v+= varOrIRIref )+ | ASTERISK )
            int alt16=2;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
            case VAR1:
            case VAR2:
                {
                alt16=1;
                }
                break;
            case ASTERISK:
                {
                alt16=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:118:17: (v+= varOrIRIref )+
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:118:17: (v+= varOrIRIref )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        switch ( input.LA(1) ) {
                        case IRI_REF:
                        case PNAME_LN:
                        case PNAME_NS:
                        case VAR1:
                        case VAR2:
                            {
                            alt15=1;
                            }
                            break;

                        }

                        switch (alt15) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:118:18: v+= varOrIRIref
                    	    {
                    	    pushFollow(FOLLOW_varOrIRIref_in_describeQuery643);
                    	    v=varOrIRIref();

                    	    state._fsp--;

                    	    stream_varOrIRIref.add(v.getTree());
                    	    if (list_v==null) list_v=new ArrayList();
                    	    list_v.add(v.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:118:37: ASTERISK
                    {
                    ASTERISK50=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_describeQuery649);  
                    stream_ASTERISK.add(ASTERISK50);


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:118:47: ( datasetClause )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case FROM:
                    {
                    alt17=1;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:118:47: datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_describeQuery652);
            	    datasetClause51=datasetClause();

            	    state._fsp--;

            	    stream_datasetClause.add(datasetClause51.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\Sparql.g:118:62: ( whereClause )?
            int alt18=2;
            switch ( input.LA(1) ) {
                case OPEN_CURLY_BRACE:
                case WHERE:
                    {
                    alt18=1;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:118:62: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_describeQuery655);
                    whereClause52=whereClause();

                    state._fsp--;

                    stream_whereClause.add(whereClause52.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_solutionModifier_in_describeQuery658);
            solutionModifier53=solutionModifier();

            state._fsp--;

            stream_solutionModifier.add(solutionModifier53.getTree());

            // AST REWRITE
            // elements: DESCRIBE, whereClause, ASTERISK, solutionModifier, v, datasetClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: v
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"token v",list_v);
            root_0 = (Object)adaptor.nil();
            // 118:92: -> ^( DESCRIBE ( $v)* ( ASTERISK )* ( datasetClause )* ( whereClause )? ( solutionModifier )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:118:95: ^( DESCRIBE ( $v)* ( ASTERISK )* ( datasetClause )* ( whereClause )? ( solutionModifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_DESCRIBE.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:118:107: ( $v)*
                while ( stream_v.hasNext() ) {
                    adaptor.addChild(root_1, stream_v.nextTree());

                }
                stream_v.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:118:110: ( ASTERISK )*
                while ( stream_ASTERISK.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ASTERISK.nextNode()
                    );

                }
                stream_ASTERISK.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:118:120: ( datasetClause )*
                while ( stream_datasetClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_datasetClause.nextTree());

                }
                stream_datasetClause.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:118:135: ( whereClause )?
                if ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:118:148: ( solutionModifier )*
                while ( stream_solutionModifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_solutionModifier.nextTree());

                }
                stream_solutionModifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "describeQuery"


    public static class askQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "askQuery"
    // com\\googlecode\\sparkleg\\Sparql.g:121:1: askQuery : ASK ( datasetClause )* whereClause -> ^( ASK ( datasetClause )* whereClause ) ;
    public final SparqlParser.askQuery_return askQuery() throws RecognitionException {
        SparqlParser.askQuery_return retval = new SparqlParser.askQuery_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASK54=null;
        SparqlParser.datasetClause_return datasetClause55 =null;

        SparqlParser.whereClause_return whereClause56 =null;


        Object ASK54_tree=null;
        RewriteRuleTokenStream stream_ASK=new RewriteRuleTokenStream(adaptor,"token ASK");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_datasetClause=new RewriteRuleSubtreeStream(adaptor,"rule datasetClause");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:122:5: ( ASK ( datasetClause )* whereClause -> ^( ASK ( datasetClause )* whereClause ) )
            // com\\googlecode\\sparkleg\\Sparql.g:122:7: ASK ( datasetClause )* whereClause
            {
            ASK54=(Token)match(input,ASK,FOLLOW_ASK_in_askQuery697);  
            stream_ASK.add(ASK54);


            // com\\googlecode\\sparkleg\\Sparql.g:122:11: ( datasetClause )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case FROM:
                    {
                    alt19=1;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:122:11: datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_askQuery699);
            	    datasetClause55=datasetClause();

            	    state._fsp--;

            	    stream_datasetClause.add(datasetClause55.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            pushFollow(FOLLOW_whereClause_in_askQuery702);
            whereClause56=whereClause();

            state._fsp--;

            stream_whereClause.add(whereClause56.getTree());

            // AST REWRITE
            // elements: datasetClause, whereClause, ASK
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 122:38: -> ^( ASK ( datasetClause )* whereClause )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:122:41: ^( ASK ( datasetClause )* whereClause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ASK.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:122:47: ( datasetClause )*
                while ( stream_datasetClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_datasetClause.nextTree());

                }
                stream_datasetClause.reset();

                adaptor.addChild(root_1, stream_whereClause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "askQuery"


    public static class datasetClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "datasetClause"
    // com\\googlecode\\sparkleg\\Sparql.g:125:1: datasetClause : FROM ( NAMED )? iriRef -> ^( FROM ( NAMED )? iriRef ) ;
    public final SparqlParser.datasetClause_return datasetClause() throws RecognitionException {
        SparqlParser.datasetClause_return retval = new SparqlParser.datasetClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FROM57=null;
        Token NAMED58=null;
        SparqlParser.iriRef_return iriRef59 =null;


        Object FROM57_tree=null;
        Object NAMED58_tree=null;
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_NAMED=new RewriteRuleTokenStream(adaptor,"token NAMED");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:126:5: ( FROM ( NAMED )? iriRef -> ^( FROM ( NAMED )? iriRef ) )
            // com\\googlecode\\sparkleg\\Sparql.g:126:7: FROM ( NAMED )? iriRef
            {
            FROM57=(Token)match(input,FROM,FOLLOW_FROM_in_datasetClause730);  
            stream_FROM.add(FROM57);


            // com\\googlecode\\sparkleg\\Sparql.g:126:12: ( NAMED )?
            int alt20=2;
            switch ( input.LA(1) ) {
                case NAMED:
                    {
                    alt20=1;
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:126:12: NAMED
                    {
                    NAMED58=(Token)match(input,NAMED,FOLLOW_NAMED_in_datasetClause732);  
                    stream_NAMED.add(NAMED58);


                    }
                    break;

            }


            pushFollow(FOLLOW_iriRef_in_datasetClause735);
            iriRef59=iriRef();

            state._fsp--;

            stream_iriRef.add(iriRef59.getTree());

            // AST REWRITE
            // elements: NAMED, iriRef, FROM
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 126:26: -> ^( FROM ( NAMED )? iriRef )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:126:29: ^( FROM ( NAMED )? iriRef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_FROM.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:126:36: ( NAMED )?
                if ( stream_NAMED.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_NAMED.nextNode()
                    );

                }
                stream_NAMED.reset();

                adaptor.addChild(root_1, stream_iriRef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "datasetClause"


    public static class whereClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whereClause"
    // com\\googlecode\\sparkleg\\Sparql.g:129:1: whereClause : ( WHERE )? groupGraphPattern -> ^( WHERE_CLAUSE groupGraphPattern ) ;
    public final SparqlParser.whereClause_return whereClause() throws RecognitionException {
        SparqlParser.whereClause_return retval = new SparqlParser.whereClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE60=null;
        SparqlParser.groupGraphPattern_return groupGraphPattern61 =null;


        Object WHERE60_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:130:5: ( ( WHERE )? groupGraphPattern -> ^( WHERE_CLAUSE groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:130:7: ( WHERE )? groupGraphPattern
            {
            // com\\googlecode\\sparkleg\\Sparql.g:130:7: ( WHERE )?
            int alt21=2;
            switch ( input.LA(1) ) {
                case WHERE:
                    {
                    alt21=1;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:130:7: WHERE
                    {
                    WHERE60=(Token)match(input,WHERE,FOLLOW_WHERE_in_whereClause763);  
                    stream_WHERE.add(WHERE60);


                    }
                    break;

            }


            pushFollow(FOLLOW_groupGraphPattern_in_whereClause766);
            groupGraphPattern61=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern61.getTree());

            // AST REWRITE
            // elements: groupGraphPattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:32: -> ^( WHERE_CLAUSE groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:130:35: ^( WHERE_CLAUSE groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WHERE_CLAUSE, "WHERE_CLAUSE")
                , root_1);

                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whereClause"


    public static class solutionModifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "solutionModifier"
    // com\\googlecode\\sparkleg\\Sparql.g:133:1: solutionModifier : ( groupClause )? ( havingClause )? ( orderClause )? ( limitOffsetClauses )? -> ( groupClause )* ( havingClause )* ( orderClause )* ( limitOffsetClauses )* ;
    public final SparqlParser.solutionModifier_return solutionModifier() throws RecognitionException {
        SparqlParser.solutionModifier_return retval = new SparqlParser.solutionModifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.groupClause_return groupClause62 =null;

        SparqlParser.havingClause_return havingClause63 =null;

        SparqlParser.orderClause_return orderClause64 =null;

        SparqlParser.limitOffsetClauses_return limitOffsetClauses65 =null;


        RewriteRuleSubtreeStream stream_limitOffsetClauses=new RewriteRuleSubtreeStream(adaptor,"rule limitOffsetClauses");
        RewriteRuleSubtreeStream stream_orderClause=new RewriteRuleSubtreeStream(adaptor,"rule orderClause");
        RewriteRuleSubtreeStream stream_groupClause=new RewriteRuleSubtreeStream(adaptor,"rule groupClause");
        RewriteRuleSubtreeStream stream_havingClause=new RewriteRuleSubtreeStream(adaptor,"rule havingClause");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:134:5: ( ( groupClause )? ( havingClause )? ( orderClause )? ( limitOffsetClauses )? -> ( groupClause )* ( havingClause )* ( orderClause )* ( limitOffsetClauses )* )
            // com\\googlecode\\sparkleg\\Sparql.g:134:7: ( groupClause )? ( havingClause )? ( orderClause )? ( limitOffsetClauses )?
            {
            // com\\googlecode\\sparkleg\\Sparql.g:134:7: ( groupClause )?
            int alt22=2;
            switch ( input.LA(1) ) {
                case GROUP:
                    {
                    alt22=1;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:134:7: groupClause
                    {
                    pushFollow(FOLLOW_groupClause_in_solutionModifier791);
                    groupClause62=groupClause();

                    state._fsp--;

                    stream_groupClause.add(groupClause62.getTree());

                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:134:20: ( havingClause )?
            int alt23=2;
            switch ( input.LA(1) ) {
                case HAVING:
                    {
                    alt23=1;
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:134:20: havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_solutionModifier794);
                    havingClause63=havingClause();

                    state._fsp--;

                    stream_havingClause.add(havingClause63.getTree());

                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:134:34: ( orderClause )?
            int alt24=2;
            switch ( input.LA(1) ) {
                case ORDER:
                    {
                    alt24=1;
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:134:34: orderClause
                    {
                    pushFollow(FOLLOW_orderClause_in_solutionModifier797);
                    orderClause64=orderClause();

                    state._fsp--;

                    stream_orderClause.add(orderClause64.getTree());

                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:134:47: ( limitOffsetClauses )?
            int alt25=2;
            switch ( input.LA(1) ) {
                case LIMIT:
                case OFFSET:
                    {
                    alt25=1;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:134:47: limitOffsetClauses
                    {
                    pushFollow(FOLLOW_limitOffsetClauses_in_solutionModifier800);
                    limitOffsetClauses65=limitOffsetClauses();

                    state._fsp--;

                    stream_limitOffsetClauses.add(limitOffsetClauses65.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: orderClause, limitOffsetClauses, havingClause, groupClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 134:67: -> ( groupClause )* ( havingClause )* ( orderClause )* ( limitOffsetClauses )*
            {
                // com\\googlecode\\sparkleg\\Sparql.g:134:70: ( groupClause )*
                while ( stream_groupClause.hasNext() ) {
                    adaptor.addChild(root_0, stream_groupClause.nextTree());

                }
                stream_groupClause.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:134:83: ( havingClause )*
                while ( stream_havingClause.hasNext() ) {
                    adaptor.addChild(root_0, stream_havingClause.nextTree());

                }
                stream_havingClause.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:134:97: ( orderClause )*
                while ( stream_orderClause.hasNext() ) {
                    adaptor.addChild(root_0, stream_orderClause.nextTree());

                }
                stream_orderClause.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:134:110: ( limitOffsetClauses )*
                while ( stream_limitOffsetClauses.hasNext() ) {
                    adaptor.addChild(root_0, stream_limitOffsetClauses.nextTree());

                }
                stream_limitOffsetClauses.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "solutionModifier"


    public static class groupClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupClause"
    // com\\googlecode\\sparkleg\\Sparql.g:137:1: groupClause : GROUP BY ( groupCondition )+ -> ^( GROUP_BY ( groupCondition )+ ) ;
    public final SparqlParser.groupClause_return groupClause() throws RecognitionException {
        SparqlParser.groupClause_return retval = new SparqlParser.groupClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GROUP66=null;
        Token BY67=null;
        SparqlParser.groupCondition_return groupCondition68 =null;


        Object GROUP66_tree=null;
        Object BY67_tree=null;
        RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleSubtreeStream stream_groupCondition=new RewriteRuleSubtreeStream(adaptor,"rule groupCondition");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:138:5: ( GROUP BY ( groupCondition )+ -> ^( GROUP_BY ( groupCondition )+ ) )
            // com\\googlecode\\sparkleg\\Sparql.g:138:7: GROUP BY ( groupCondition )+
            {
            GROUP66=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupClause832);  
            stream_GROUP.add(GROUP66);


            BY67=(Token)match(input,BY,FOLLOW_BY_in_groupClause834);  
            stream_BY.add(BY67);


            // com\\googlecode\\sparkleg\\Sparql.g:138:16: ( groupCondition )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case ABS:
                case BNODE:
                case BOUND:
                case CEIL:
                case COALESCE:
                case CONCAT:
                case CONTAINS:
                case DATATYPE:
                case DAY:
                case ENCODE_FOR_URI:
                case EXISTS:
                case FLOOR:
                case HOURS:
                case IF:
                case IRI:
                case IRI_REF:
                case ISBLANK:
                case ISIRI:
                case ISLITERAL:
                case ISNUMERIC:
                case ISURI:
                case LANG:
                case LANGMATCHES:
                case LCASE:
                case MD5:
                case MINUTES:
                case MONTH:
                case NOT:
                case NOW:
                case OPEN_BRACE:
                case PNAME_LN:
                case PNAME_NS:
                case RAND:
                case REGEX:
                case REPLACE:
                case ROUND:
                case SAMETERM:
                case SECONDS:
                case SHA1:
                case SHA224:
                case SHA256:
                case SHA384:
                case SHA512:
                case STR:
                case STRAFTER:
                case STRBEFORE:
                case STRDT:
                case STRENDS:
                case STRLANG:
                case STRLEN:
                case STRSTARTS:
                case SUBSTR:
                case TIMEZONE:
                case TZ:
                case UCASE:
                case URI:
                case VAR1:
                case VAR2:
                case YEAR:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:138:16: groupCondition
            	    {
            	    pushFollow(FOLLOW_groupCondition_in_groupClause836);
            	    groupCondition68=groupCondition();

            	    state._fsp--;

            	    stream_groupCondition.add(groupCondition68.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            // AST REWRITE
            // elements: groupCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 138:32: -> ^( GROUP_BY ( groupCondition )+ )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:138:35: ^( GROUP_BY ( groupCondition )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(GROUP_BY, "GROUP_BY")
                , root_1);

                if ( !(stream_groupCondition.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupCondition.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupCondition.nextTree());

                }
                stream_groupCondition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupClause"


    public static class groupCondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupCondition"
    // com\\googlecode\\sparkleg\\Sparql.g:141:1: groupCondition : ( builtInCall -> ^( GROUP_CONDITION builtInCall ) | functionCall -> ^( GROUP_CONDITION functionCall ) | OPEN_BRACE expression ( AS var )? CLOSE_BRACE -> ^( GROUP_CONDITION expression ( ^( AS var ) )? ) | var -> ^( GROUP_CONDITION var ) );
    public final SparqlParser.groupCondition_return groupCondition() throws RecognitionException {
        SparqlParser.groupCondition_return retval = new SparqlParser.groupCondition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_BRACE71=null;
        Token AS73=null;
        Token CLOSE_BRACE75=null;
        SparqlParser.builtInCall_return builtInCall69 =null;

        SparqlParser.functionCall_return functionCall70 =null;

        SparqlParser.expression_return expression72 =null;

        SparqlParser.var_return var74 =null;

        SparqlParser.var_return var76 =null;


        Object OPEN_BRACE71_tree=null;
        Object AS73_tree=null;
        Object CLOSE_BRACE75_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        RewriteRuleSubtreeStream stream_builtInCall=new RewriteRuleSubtreeStream(adaptor,"rule builtInCall");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:142:5: ( builtInCall -> ^( GROUP_CONDITION builtInCall ) | functionCall -> ^( GROUP_CONDITION functionCall ) | OPEN_BRACE expression ( AS var )? CLOSE_BRACE -> ^( GROUP_CONDITION expression ( ^( AS var ) )? ) | var -> ^( GROUP_CONDITION var ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case ABS:
            case BNODE:
            case BOUND:
            case CEIL:
            case COALESCE:
            case CONCAT:
            case CONTAINS:
            case DATATYPE:
            case DAY:
            case ENCODE_FOR_URI:
            case EXISTS:
            case FLOOR:
            case HOURS:
            case IF:
            case IRI:
            case ISBLANK:
            case ISIRI:
            case ISLITERAL:
            case ISNUMERIC:
            case ISURI:
            case LANG:
            case LANGMATCHES:
            case LCASE:
            case MD5:
            case MINUTES:
            case MONTH:
            case NOT:
            case NOW:
            case RAND:
            case REGEX:
            case REPLACE:
            case ROUND:
            case SAMETERM:
            case SECONDS:
            case SHA1:
            case SHA224:
            case SHA256:
            case SHA384:
            case SHA512:
            case STR:
            case STRAFTER:
            case STRBEFORE:
            case STRDT:
            case STRENDS:
            case STRLANG:
            case STRLEN:
            case STRSTARTS:
            case SUBSTR:
            case TIMEZONE:
            case TZ:
            case UCASE:
            case URI:
            case YEAR:
                {
                alt28=1;
                }
                break;
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt28=2;
                }
                break;
            case OPEN_BRACE:
                {
                alt28=3;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:142:7: builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_groupCondition870);
                    builtInCall69=builtInCall();

                    state._fsp--;

                    stream_builtInCall.add(builtInCall69.getTree());

                    // AST REWRITE
                    // elements: builtInCall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:19: -> ^( GROUP_CONDITION builtInCall )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:142:22: ^( GROUP_CONDITION builtInCall )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(GROUP_CONDITION, "GROUP_CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_builtInCall.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:143:7: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_groupCondition886);
                    functionCall70=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall70.getTree());

                    // AST REWRITE
                    // elements: functionCall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:20: -> ^( GROUP_CONDITION functionCall )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:143:23: ^( GROUP_CONDITION functionCall )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(GROUP_CONDITION, "GROUP_CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_functionCall.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:144:7: OPEN_BRACE expression ( AS var )? CLOSE_BRACE
                    {
                    OPEN_BRACE71=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_groupCondition902);  
                    stream_OPEN_BRACE.add(OPEN_BRACE71);


                    pushFollow(FOLLOW_expression_in_groupCondition904);
                    expression72=expression();

                    state._fsp--;

                    stream_expression.add(expression72.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:144:29: ( AS var )?
                    int alt27=2;
                    switch ( input.LA(1) ) {
                        case AS:
                            {
                            alt27=1;
                            }
                            break;
                    }

                    switch (alt27) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:144:30: AS var
                            {
                            AS73=(Token)match(input,AS,FOLLOW_AS_in_groupCondition907);  
                            stream_AS.add(AS73);


                            pushFollow(FOLLOW_var_in_groupCondition909);
                            var74=var();

                            state._fsp--;

                            stream_var.add(var74.getTree());

                            }
                            break;

                    }


                    CLOSE_BRACE75=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_groupCondition913);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE75);


                    // AST REWRITE
                    // elements: var, AS, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:51: -> ^( GROUP_CONDITION expression ( ^( AS var ) )? )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:144:54: ^( GROUP_CONDITION expression ( ^( AS var ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(GROUP_CONDITION, "GROUP_CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        // com\\googlecode\\sparkleg\\Sparql.g:144:83: ( ^( AS var ) )?
                        if ( stream_var.hasNext()||stream_AS.hasNext() ) {
                            // com\\googlecode\\sparkleg\\Sparql.g:144:83: ^( AS var )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(
                            stream_AS.nextNode()
                            , root_2);

                            adaptor.addChild(root_2, stream_var.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_var.reset();
                        stream_AS.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:145:7: var
                    {
                    pushFollow(FOLLOW_var_in_groupCondition937);
                    var76=var();

                    state._fsp--;

                    stream_var.add(var76.getTree());

                    // AST REWRITE
                    // elements: var
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:11: -> ^( GROUP_CONDITION var )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:145:14: ^( GROUP_CONDITION var )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(GROUP_CONDITION, "GROUP_CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_var.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupCondition"


    public static class havingClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havingClause"
    // com\\googlecode\\sparkleg\\Sparql.g:148:1: havingClause : HAVING ( constraint )+ -> ^( HAVING ( constraint )+ ) ;
    public final SparqlParser.havingClause_return havingClause() throws RecognitionException {
        SparqlParser.havingClause_return retval = new SparqlParser.havingClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HAVING77=null;
        SparqlParser.constraint_return constraint78 =null;


        Object HAVING77_tree=null;
        RewriteRuleTokenStream stream_HAVING=new RewriteRuleTokenStream(adaptor,"token HAVING");
        RewriteRuleSubtreeStream stream_constraint=new RewriteRuleSubtreeStream(adaptor,"rule constraint");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:149:5: ( HAVING ( constraint )+ -> ^( HAVING ( constraint )+ ) )
            // com\\googlecode\\sparkleg\\Sparql.g:149:7: HAVING ( constraint )+
            {
            HAVING77=(Token)match(input,HAVING,FOLLOW_HAVING_in_havingClause966);  
            stream_HAVING.add(HAVING77);


            // com\\googlecode\\sparkleg\\Sparql.g:149:14: ( constraint )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case ABS:
                case BNODE:
                case BOUND:
                case CEIL:
                case COALESCE:
                case CONCAT:
                case CONTAINS:
                case DATATYPE:
                case DAY:
                case ENCODE_FOR_URI:
                case EXISTS:
                case FLOOR:
                case HOURS:
                case IF:
                case IRI:
                case IRI_REF:
                case ISBLANK:
                case ISIRI:
                case ISLITERAL:
                case ISNUMERIC:
                case ISURI:
                case LANG:
                case LANGMATCHES:
                case LCASE:
                case MD5:
                case MINUTES:
                case MONTH:
                case NOT:
                case NOW:
                case OPEN_BRACE:
                case PNAME_LN:
                case PNAME_NS:
                case RAND:
                case REGEX:
                case REPLACE:
                case ROUND:
                case SAMETERM:
                case SECONDS:
                case SHA1:
                case SHA224:
                case SHA256:
                case SHA384:
                case SHA512:
                case STR:
                case STRAFTER:
                case STRBEFORE:
                case STRDT:
                case STRENDS:
                case STRLANG:
                case STRLEN:
                case STRSTARTS:
                case SUBSTR:
                case TIMEZONE:
                case TZ:
                case UCASE:
                case URI:
                case YEAR:
                    {
                    alt29=1;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:149:14: constraint
            	    {
            	    pushFollow(FOLLOW_constraint_in_havingClause968);
            	    constraint78=constraint();

            	    state._fsp--;

            	    stream_constraint.add(constraint78.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            // AST REWRITE
            // elements: HAVING, constraint
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 149:26: -> ^( HAVING ( constraint )+ )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:149:29: ^( HAVING ( constraint )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_HAVING.nextNode()
                , root_1);

                if ( !(stream_constraint.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_constraint.hasNext() ) {
                    adaptor.addChild(root_1, stream_constraint.nextTree());

                }
                stream_constraint.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "havingClause"


    public static class orderClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderClause"
    // com\\googlecode\\sparkleg\\Sparql.g:152:1: orderClause : ORDER BY ( orderCondition )+ -> ^( ORDER_BY ( orderCondition )+ ) ;
    public final SparqlParser.orderClause_return orderClause() throws RecognitionException {
        SparqlParser.orderClause_return retval = new SparqlParser.orderClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ORDER79=null;
        Token BY80=null;
        SparqlParser.orderCondition_return orderCondition81 =null;


        Object ORDER79_tree=null;
        Object BY80_tree=null;
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleSubtreeStream stream_orderCondition=new RewriteRuleSubtreeStream(adaptor,"rule orderCondition");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:153:5: ( ORDER BY ( orderCondition )+ -> ^( ORDER_BY ( orderCondition )+ ) )
            // com\\googlecode\\sparkleg\\Sparql.g:153:7: ORDER BY ( orderCondition )+
            {
            ORDER79=(Token)match(input,ORDER,FOLLOW_ORDER_in_orderClause1000);  
            stream_ORDER.add(ORDER79);


            BY80=(Token)match(input,BY,FOLLOW_BY_in_orderClause1002);  
            stream_BY.add(BY80);


            // com\\googlecode\\sparkleg\\Sparql.g:153:16: ( orderCondition )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case ABS:
                case ASC:
                case BNODE:
                case BOUND:
                case CEIL:
                case COALESCE:
                case CONCAT:
                case CONTAINS:
                case DATATYPE:
                case DAY:
                case DESC:
                case ENCODE_FOR_URI:
                case EXISTS:
                case FLOOR:
                case HOURS:
                case IF:
                case IRI:
                case IRI_REF:
                case ISBLANK:
                case ISIRI:
                case ISLITERAL:
                case ISNUMERIC:
                case ISURI:
                case LANG:
                case LANGMATCHES:
                case LCASE:
                case MD5:
                case MINUTES:
                case MONTH:
                case NOT:
                case NOW:
                case OPEN_BRACE:
                case PNAME_LN:
                case PNAME_NS:
                case RAND:
                case REGEX:
                case REPLACE:
                case ROUND:
                case SAMETERM:
                case SECONDS:
                case SHA1:
                case SHA224:
                case SHA256:
                case SHA384:
                case SHA512:
                case STR:
                case STRAFTER:
                case STRBEFORE:
                case STRDT:
                case STRENDS:
                case STRLANG:
                case STRLEN:
                case STRSTARTS:
                case SUBSTR:
                case TIMEZONE:
                case TZ:
                case UCASE:
                case URI:
                case VAR1:
                case VAR2:
                case YEAR:
                    {
                    alt30=1;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:153:16: orderCondition
            	    {
            	    pushFollow(FOLLOW_orderCondition_in_orderClause1004);
            	    orderCondition81=orderCondition();

            	    state._fsp--;

            	    stream_orderCondition.add(orderCondition81.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            // AST REWRITE
            // elements: orderCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 153:32: -> ^( ORDER_BY ( orderCondition )+ )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:153:35: ^( ORDER_BY ( orderCondition )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ORDER_BY, "ORDER_BY")
                , root_1);

                if ( !(stream_orderCondition.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_orderCondition.hasNext() ) {
                    adaptor.addChild(root_1, stream_orderCondition.nextTree());

                }
                stream_orderCondition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orderClause"


    public static class orderCondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderCondition"
    // com\\googlecode\\sparkleg\\Sparql.g:156:1: orderCondition : ( ASC brackettedExpression -> ^( ORDER_CONDITION ASC brackettedExpression ) | DESC brackettedExpression -> ^( ORDER_CONDITION DESC brackettedExpression ) | constraint -> ^( ORDER_CONDITION constraint ) | var -> ^( ORDER_CONDITION var ) );
    public final SparqlParser.orderCondition_return orderCondition() throws RecognitionException {
        SparqlParser.orderCondition_return retval = new SparqlParser.orderCondition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASC82=null;
        Token DESC84=null;
        SparqlParser.brackettedExpression_return brackettedExpression83 =null;

        SparqlParser.brackettedExpression_return brackettedExpression85 =null;

        SparqlParser.constraint_return constraint86 =null;

        SparqlParser.var_return var87 =null;


        Object ASC82_tree=null;
        Object DESC84_tree=null;
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        RewriteRuleSubtreeStream stream_constraint=new RewriteRuleSubtreeStream(adaptor,"rule constraint");
        RewriteRuleSubtreeStream stream_brackettedExpression=new RewriteRuleSubtreeStream(adaptor,"rule brackettedExpression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:157:5: ( ASC brackettedExpression -> ^( ORDER_CONDITION ASC brackettedExpression ) | DESC brackettedExpression -> ^( ORDER_CONDITION DESC brackettedExpression ) | constraint -> ^( ORDER_CONDITION constraint ) | var -> ^( ORDER_CONDITION var ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case ASC:
                {
                alt31=1;
                }
                break;
            case DESC:
                {
                alt31=2;
                }
                break;
            case ABS:
            case BNODE:
            case BOUND:
            case CEIL:
            case COALESCE:
            case CONCAT:
            case CONTAINS:
            case DATATYPE:
            case DAY:
            case ENCODE_FOR_URI:
            case EXISTS:
            case FLOOR:
            case HOURS:
            case IF:
            case IRI:
            case IRI_REF:
            case ISBLANK:
            case ISIRI:
            case ISLITERAL:
            case ISNUMERIC:
            case ISURI:
            case LANG:
            case LANGMATCHES:
            case LCASE:
            case MD5:
            case MINUTES:
            case MONTH:
            case NOT:
            case NOW:
            case OPEN_BRACE:
            case PNAME_LN:
            case PNAME_NS:
            case RAND:
            case REGEX:
            case REPLACE:
            case ROUND:
            case SAMETERM:
            case SECONDS:
            case SHA1:
            case SHA224:
            case SHA256:
            case SHA384:
            case SHA512:
            case STR:
            case STRAFTER:
            case STRBEFORE:
            case STRDT:
            case STRENDS:
            case STRLANG:
            case STRLEN:
            case STRSTARTS:
            case SUBSTR:
            case TIMEZONE:
            case TZ:
            case UCASE:
            case URI:
            case YEAR:
                {
                alt31=3;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:157:7: ASC brackettedExpression
                    {
                    ASC82=(Token)match(input,ASC,FOLLOW_ASC_in_orderCondition1031);  
                    stream_ASC.add(ASC82);


                    pushFollow(FOLLOW_brackettedExpression_in_orderCondition1033);
                    brackettedExpression83=brackettedExpression();

                    state._fsp--;

                    stream_brackettedExpression.add(brackettedExpression83.getTree());

                    // AST REWRITE
                    // elements: brackettedExpression, ASC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:32: -> ^( ORDER_CONDITION ASC brackettedExpression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:157:35: ^( ORDER_CONDITION ASC brackettedExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ORDER_CONDITION, "ORDER_CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ASC.nextNode()
                        );

                        adaptor.addChild(root_1, stream_brackettedExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:158:7: DESC brackettedExpression
                    {
                    DESC84=(Token)match(input,DESC,FOLLOW_DESC_in_orderCondition1051);  
                    stream_DESC.add(DESC84);


                    pushFollow(FOLLOW_brackettedExpression_in_orderCondition1053);
                    brackettedExpression85=brackettedExpression();

                    state._fsp--;

                    stream_brackettedExpression.add(brackettedExpression85.getTree());

                    // AST REWRITE
                    // elements: brackettedExpression, DESC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:33: -> ^( ORDER_CONDITION DESC brackettedExpression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:158:36: ^( ORDER_CONDITION DESC brackettedExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ORDER_CONDITION, "ORDER_CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_DESC.nextNode()
                        );

                        adaptor.addChild(root_1, stream_brackettedExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:159:7: constraint
                    {
                    pushFollow(FOLLOW_constraint_in_orderCondition1071);
                    constraint86=constraint();

                    state._fsp--;

                    stream_constraint.add(constraint86.getTree());

                    // AST REWRITE
                    // elements: constraint
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:18: -> ^( ORDER_CONDITION constraint )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:159:21: ^( ORDER_CONDITION constraint )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ORDER_CONDITION, "ORDER_CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_constraint.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:160:7: var
                    {
                    pushFollow(FOLLOW_var_in_orderCondition1087);
                    var87=var();

                    state._fsp--;

                    stream_var.add(var87.getTree());

                    // AST REWRITE
                    // elements: var
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:11: -> ^( ORDER_CONDITION var )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:160:14: ^( ORDER_CONDITION var )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ORDER_CONDITION, "ORDER_CONDITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_var.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orderCondition"


    public static class limitOffsetClauses_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "limitOffsetClauses"
    // com\\googlecode\\sparkleg\\Sparql.g:163:1: limitOffsetClauses : ( limitClause ( offsetClause )? -> limitClause ( offsetClause )* | offsetClause ( limitClause )? -> offsetClause ( limitClause )* );
    public final SparqlParser.limitOffsetClauses_return limitOffsetClauses() throws RecognitionException {
        SparqlParser.limitOffsetClauses_return retval = new SparqlParser.limitOffsetClauses_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.limitClause_return limitClause88 =null;

        SparqlParser.offsetClause_return offsetClause89 =null;

        SparqlParser.offsetClause_return offsetClause90 =null;

        SparqlParser.limitClause_return limitClause91 =null;


        RewriteRuleSubtreeStream stream_offsetClause=new RewriteRuleSubtreeStream(adaptor,"rule offsetClause");
        RewriteRuleSubtreeStream stream_limitClause=new RewriteRuleSubtreeStream(adaptor,"rule limitClause");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:164:5: ( limitClause ( offsetClause )? -> limitClause ( offsetClause )* | offsetClause ( limitClause )? -> offsetClause ( limitClause )* )
            int alt34=2;
            switch ( input.LA(1) ) {
            case LIMIT:
                {
                alt34=1;
                }
                break;
            case OFFSET:
                {
                alt34=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:164:7: limitClause ( offsetClause )?
                    {
                    pushFollow(FOLLOW_limitClause_in_limitOffsetClauses1117);
                    limitClause88=limitClause();

                    state._fsp--;

                    stream_limitClause.add(limitClause88.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:164:19: ( offsetClause )?
                    int alt32=2;
                    switch ( input.LA(1) ) {
                        case OFFSET:
                            {
                            alt32=1;
                            }
                            break;
                    }

                    switch (alt32) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:164:19: offsetClause
                            {
                            pushFollow(FOLLOW_offsetClause_in_limitOffsetClauses1119);
                            offsetClause89=offsetClause();

                            state._fsp--;

                            stream_offsetClause.add(offsetClause89.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: limitClause, offsetClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:33: -> limitClause ( offsetClause )*
                    {
                        adaptor.addChild(root_0, stream_limitClause.nextTree());

                        // com\\googlecode\\sparkleg\\Sparql.g:164:48: ( offsetClause )*
                        while ( stream_offsetClause.hasNext() ) {
                            adaptor.addChild(root_0, stream_offsetClause.nextTree());

                        }
                        stream_offsetClause.reset();

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:165:7: offsetClause ( limitClause )?
                    {
                    pushFollow(FOLLOW_offsetClause_in_limitOffsetClauses1135);
                    offsetClause90=offsetClause();

                    state._fsp--;

                    stream_offsetClause.add(offsetClause90.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:165:20: ( limitClause )?
                    int alt33=2;
                    switch ( input.LA(1) ) {
                        case LIMIT:
                            {
                            alt33=1;
                            }
                            break;
                    }

                    switch (alt33) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:165:20: limitClause
                            {
                            pushFollow(FOLLOW_limitClause_in_limitOffsetClauses1137);
                            limitClause91=limitClause();

                            state._fsp--;

                            stream_limitClause.add(limitClause91.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: limitClause, offsetClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:33: -> offsetClause ( limitClause )*
                    {
                        adaptor.addChild(root_0, stream_offsetClause.nextTree());

                        // com\\googlecode\\sparkleg\\Sparql.g:165:49: ( limitClause )*
                        while ( stream_limitClause.hasNext() ) {
                            adaptor.addChild(root_0, stream_limitClause.nextTree());

                        }
                        stream_limitClause.reset();

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "limitOffsetClauses"


    public static class limitClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "limitClause"
    // com\\googlecode\\sparkleg\\Sparql.g:168:1: limitClause : LIMIT INTEGER -> ^( LIMIT INTEGER ) ;
    public final SparqlParser.limitClause_return limitClause() throws RecognitionException {
        SparqlParser.limitClause_return retval = new SparqlParser.limitClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LIMIT92=null;
        Token INTEGER93=null;

        Object LIMIT92_tree=null;
        Object INTEGER93_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:169:5: ( LIMIT INTEGER -> ^( LIMIT INTEGER ) )
            // com\\googlecode\\sparkleg\\Sparql.g:169:7: LIMIT INTEGER
            {
            LIMIT92=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_limitClause1162);  
            stream_LIMIT.add(LIMIT92);


            INTEGER93=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_limitClause1164);  
            stream_INTEGER.add(INTEGER93);


            // AST REWRITE
            // elements: LIMIT, INTEGER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 169:21: -> ^( LIMIT INTEGER )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:169:24: ^( LIMIT INTEGER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_LIMIT.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_INTEGER.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "limitClause"


    public static class offsetClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "offsetClause"
    // com\\googlecode\\sparkleg\\Sparql.g:172:1: offsetClause : OFFSET INTEGER -> ^( OFFSET INTEGER ) ;
    public final SparqlParser.offsetClause_return offsetClause() throws RecognitionException {
        SparqlParser.offsetClause_return retval = new SparqlParser.offsetClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OFFSET94=null;
        Token INTEGER95=null;

        Object OFFSET94_tree=null;
        Object INTEGER95_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:173:5: ( OFFSET INTEGER -> ^( OFFSET INTEGER ) )
            // com\\googlecode\\sparkleg\\Sparql.g:173:7: OFFSET INTEGER
            {
            OFFSET94=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_offsetClause1189);  
            stream_OFFSET.add(OFFSET94);


            INTEGER95=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_offsetClause1191);  
            stream_INTEGER.add(INTEGER95);


            // AST REWRITE
            // elements: INTEGER, OFFSET
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 173:22: -> ^( OFFSET INTEGER )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:173:25: ^( OFFSET INTEGER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_OFFSET.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_INTEGER.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "offsetClause"


    public static class bindingsClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bindingsClause"
    // com\\googlecode\\sparkleg\\Sparql.g:176:1: bindingsClause : ( BINDINGS ( var )* OPEN_CURLY_BRACE ( bindingValueList )* CLOSE_CURLY_BRACE )? -> ( ^( BINDINGS ( var )* ( bindingValueList )* ) )? ;
    public final SparqlParser.bindingsClause_return bindingsClause() throws RecognitionException {
        SparqlParser.bindingsClause_return retval = new SparqlParser.bindingsClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BINDINGS96=null;
        Token OPEN_CURLY_BRACE98=null;
        Token CLOSE_CURLY_BRACE100=null;
        SparqlParser.var_return var97 =null;

        SparqlParser.bindingValueList_return bindingValueList99 =null;


        Object BINDINGS96_tree=null;
        Object OPEN_CURLY_BRACE98_tree=null;
        Object CLOSE_CURLY_BRACE100_tree=null;
        RewriteRuleTokenStream stream_BINDINGS=new RewriteRuleTokenStream(adaptor,"token BINDINGS");
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        RewriteRuleSubtreeStream stream_bindingValueList=new RewriteRuleSubtreeStream(adaptor,"rule bindingValueList");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:177:5: ( ( BINDINGS ( var )* OPEN_CURLY_BRACE ( bindingValueList )* CLOSE_CURLY_BRACE )? -> ( ^( BINDINGS ( var )* ( bindingValueList )* ) )? )
            // com\\googlecode\\sparkleg\\Sparql.g:177:7: ( BINDINGS ( var )* OPEN_CURLY_BRACE ( bindingValueList )* CLOSE_CURLY_BRACE )?
            {
            // com\\googlecode\\sparkleg\\Sparql.g:177:7: ( BINDINGS ( var )* OPEN_CURLY_BRACE ( bindingValueList )* CLOSE_CURLY_BRACE )?
            int alt37=2;
            switch ( input.LA(1) ) {
                case BINDINGS:
                    {
                    alt37=1;
                    }
                    break;
            }

            switch (alt37) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:177:8: BINDINGS ( var )* OPEN_CURLY_BRACE ( bindingValueList )* CLOSE_CURLY_BRACE
                    {
                    BINDINGS96=(Token)match(input,BINDINGS,FOLLOW_BINDINGS_in_bindingsClause1217);  
                    stream_BINDINGS.add(BINDINGS96);


                    // com\\googlecode\\sparkleg\\Sparql.g:177:17: ( var )*
                    loop35:
                    do {
                        int alt35=2;
                        switch ( input.LA(1) ) {
                        case VAR1:
                        case VAR2:
                            {
                            alt35=1;
                            }
                            break;

                        }

                        switch (alt35) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:177:17: var
                    	    {
                    	    pushFollow(FOLLOW_var_in_bindingsClause1219);
                    	    var97=var();

                    	    state._fsp--;

                    	    stream_var.add(var97.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    OPEN_CURLY_BRACE98=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_bindingsClause1222);  
                    stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE98);


                    // com\\googlecode\\sparkleg\\Sparql.g:177:39: ( bindingValueList )*
                    loop36:
                    do {
                        int alt36=2;
                        switch ( input.LA(1) ) {
                        case OPEN_BRACE:
                            {
                            alt36=1;
                            }
                            break;

                        }

                        switch (alt36) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:177:39: bindingValueList
                    	    {
                    	    pushFollow(FOLLOW_bindingValueList_in_bindingsClause1224);
                    	    bindingValueList99=bindingValueList();

                    	    state._fsp--;

                    	    stream_bindingValueList.add(bindingValueList99.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    CLOSE_CURLY_BRACE100=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_bindingsClause1227);  
                    stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE100);


                    }
                    break;

            }


            // AST REWRITE
            // elements: bindingValueList, BINDINGS, var
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 177:77: -> ( ^( BINDINGS ( var )* ( bindingValueList )* ) )?
            {
                // com\\googlecode\\sparkleg\\Sparql.g:177:80: ( ^( BINDINGS ( var )* ( bindingValueList )* ) )?
                if ( stream_bindingValueList.hasNext()||stream_BINDINGS.hasNext()||stream_var.hasNext() ) {
                    // com\\googlecode\\sparkleg\\Sparql.g:177:80: ^( BINDINGS ( var )* ( bindingValueList )* )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    stream_BINDINGS.nextNode()
                    , root_1);

                    // com\\googlecode\\sparkleg\\Sparql.g:177:91: ( var )*
                    while ( stream_var.hasNext() ) {
                        adaptor.addChild(root_1, stream_var.nextTree());

                    }
                    stream_var.reset();

                    // com\\googlecode\\sparkleg\\Sparql.g:177:96: ( bindingValueList )*
                    while ( stream_bindingValueList.hasNext() ) {
                        adaptor.addChild(root_1, stream_bindingValueList.nextTree());

                    }
                    stream_bindingValueList.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_bindingValueList.reset();
                stream_BINDINGS.reset();
                stream_var.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bindingsClause"


    public static class bindingValueList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bindingValueList"
    // com\\googlecode\\sparkleg\\Sparql.g:180:1: bindingValueList : OPEN_BRACE ( bindingValue )* CLOSE_BRACE -> ^( BINDING_VALUE ( bindingValue )* ) ;
    public final SparqlParser.bindingValueList_return bindingValueList() throws RecognitionException {
        SparqlParser.bindingValueList_return retval = new SparqlParser.bindingValueList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_BRACE101=null;
        Token CLOSE_BRACE103=null;
        SparqlParser.bindingValue_return bindingValue102 =null;


        Object OPEN_BRACE101_tree=null;
        Object CLOSE_BRACE103_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_bindingValue=new RewriteRuleSubtreeStream(adaptor,"rule bindingValue");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:181:5: ( OPEN_BRACE ( bindingValue )* CLOSE_BRACE -> ^( BINDING_VALUE ( bindingValue )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:181:7: OPEN_BRACE ( bindingValue )* CLOSE_BRACE
            {
            OPEN_BRACE101=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_bindingValueList1263);  
            stream_OPEN_BRACE.add(OPEN_BRACE101);


            // com\\googlecode\\sparkleg\\Sparql.g:181:18: ( bindingValue )*
            loop38:
            do {
                int alt38=2;
                switch ( input.LA(1) ) {
                case DECIMAL:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case FALSE:
                case INTEGER:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI_REF:
                case PNAME_LN:
                case PNAME_NS:
                case STRING_LITERAL1:
                case STRING_LITERAL2:
                case STRING_LITERAL_LONG1:
                case STRING_LITERAL_LONG2:
                case TRUE:
                case UNDEF:
                    {
                    alt38=1;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:181:18: bindingValue
            	    {
            	    pushFollow(FOLLOW_bindingValue_in_bindingValueList1265);
            	    bindingValue102=bindingValue();

            	    state._fsp--;

            	    stream_bindingValue.add(bindingValue102.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            CLOSE_BRACE103=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_bindingValueList1268);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE103);


            // AST REWRITE
            // elements: bindingValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 181:44: -> ^( BINDING_VALUE ( bindingValue )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:181:47: ^( BINDING_VALUE ( bindingValue )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BINDING_VALUE, "BINDING_VALUE")
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:181:63: ( bindingValue )*
                while ( stream_bindingValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_bindingValue.nextTree());

                }
                stream_bindingValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bindingValueList"


    public static class bindingValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bindingValue"
    // com\\googlecode\\sparkleg\\Sparql.g:184:1: bindingValue : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF );
    public final SparqlParser.bindingValue_return bindingValue() throws RecognitionException {
        SparqlParser.bindingValue_return retval = new SparqlParser.bindingValue_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token UNDEF108=null;
        SparqlParser.iriRef_return iriRef104 =null;

        SparqlParser.rdfLiteral_return rdfLiteral105 =null;

        SparqlParser.numericLiteral_return numericLiteral106 =null;

        SparqlParser.booleanLiteral_return booleanLiteral107 =null;


        Object UNDEF108_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:185:5: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF )
            int alt39=5;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt39=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt39=2;
                }
                break;
            case DECIMAL:
            case DECIMAL_NEGATIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE:
            case DOUBLE_NEGATIVE:
            case DOUBLE_POSITIVE:
            case INTEGER:
            case INTEGER_NEGATIVE:
            case INTEGER_POSITIVE:
                {
                alt39=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt39=4;
                }
                break;
            case UNDEF:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:185:7: iriRef
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iriRef_in_bindingValue1299);
                    iriRef104=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef104.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:185:16: rdfLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_rdfLiteral_in_bindingValue1303);
                    rdfLiteral105=rdfLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, rdfLiteral105.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:185:29: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numericLiteral_in_bindingValue1307);
                    numericLiteral106=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral106.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:185:46: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_booleanLiteral_in_bindingValue1311);
                    booleanLiteral107=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral107.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:185:63: UNDEF
                    {
                    root_0 = (Object)adaptor.nil();


                    UNDEF108=(Token)match(input,UNDEF,FOLLOW_UNDEF_in_bindingValue1315); 
                    UNDEF108_tree = 
                    (Object)adaptor.create(UNDEF108)
                    ;
                    adaptor.addChild(root_0, UNDEF108_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bindingValue"


    public static class update_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update"
    // com\\googlecode\\sparkleg\\Sparql.g:188:1: update : prologue ( load | clear | drop | add | move | copy | create | insert | delete | modify ) -> prologue ( load )* ( clear )* ( drop )* ( add )* ( move )* ( copy )* ( create )* ( insert )* ( delete )* ( modify )* ;
    public final SparqlParser.update_return update() throws RecognitionException {
        SparqlParser.update_return retval = new SparqlParser.update_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.prologue_return prologue109 =null;

        SparqlParser.load_return load110 =null;

        SparqlParser.clear_return clear111 =null;

        SparqlParser.drop_return drop112 =null;

        SparqlParser.add_return add113 =null;

        SparqlParser.move_return move114 =null;

        SparqlParser.copy_return copy115 =null;

        SparqlParser.create_return create116 =null;

        SparqlParser.insert_return insert117 =null;

        SparqlParser.delete_return delete118 =null;

        SparqlParser.modify_return modify119 =null;


        RewriteRuleSubtreeStream stream_clear=new RewriteRuleSubtreeStream(adaptor,"rule clear");
        RewriteRuleSubtreeStream stream_prologue=new RewriteRuleSubtreeStream(adaptor,"rule prologue");
        RewriteRuleSubtreeStream stream_drop=new RewriteRuleSubtreeStream(adaptor,"rule drop");
        RewriteRuleSubtreeStream stream_delete=new RewriteRuleSubtreeStream(adaptor,"rule delete");
        RewriteRuleSubtreeStream stream_modify=new RewriteRuleSubtreeStream(adaptor,"rule modify");
        RewriteRuleSubtreeStream stream_load=new RewriteRuleSubtreeStream(adaptor,"rule load");
        RewriteRuleSubtreeStream stream_add=new RewriteRuleSubtreeStream(adaptor,"rule add");
        RewriteRuleSubtreeStream stream_insert=new RewriteRuleSubtreeStream(adaptor,"rule insert");
        RewriteRuleSubtreeStream stream_create=new RewriteRuleSubtreeStream(adaptor,"rule create");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        RewriteRuleSubtreeStream stream_copy=new RewriteRuleSubtreeStream(adaptor,"rule copy");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:189:5: ( prologue ( load | clear | drop | add | move | copy | create | insert | delete | modify ) -> prologue ( load )* ( clear )* ( drop )* ( add )* ( move )* ( copy )* ( create )* ( insert )* ( delete )* ( modify )* )
            // com\\googlecode\\sparkleg\\Sparql.g:189:7: prologue ( load | clear | drop | add | move | copy | create | insert | delete | modify )
            {
            pushFollow(FOLLOW_prologue_in_update1336);
            prologue109=prologue();

            state._fsp--;

            stream_prologue.add(prologue109.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:189:16: ( load | clear | drop | add | move | copy | create | insert | delete | modify )
            int alt40=10;
            switch ( input.LA(1) ) {
            case LOAD:
                {
                alt40=1;
                }
                break;
            case CLEAR:
                {
                alt40=2;
                }
                break;
            case DROP:
                {
                alt40=3;
                }
                break;
            case ADD:
                {
                alt40=4;
                }
                break;
            case MOVE:
                {
                alt40=5;
                }
                break;
            case COPY:
                {
                alt40=6;
                }
                break;
            case CREATE:
                {
                alt40=7;
                }
                break;
            case INSERT:
                {
                switch ( input.LA(2) ) {
                case DATA:
                    {
                    alt40=8;
                    }
                    break;
                case OPEN_CURLY_BRACE:
                    {
                    alt40=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 8, input);

                    throw nvae;

                }

                }
                break;
            case DELETE:
                {
                switch ( input.LA(2) ) {
                case DATA:
                case WHERE:
                    {
                    alt40=9;
                    }
                    break;
                case OPEN_CURLY_BRACE:
                    {
                    alt40=10;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 9, input);

                    throw nvae;

                }

                }
                break;
            case WITH:
                {
                alt40=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:17: load
                    {
                    pushFollow(FOLLOW_load_in_update1339);
                    load110=load();

                    state._fsp--;

                    stream_load.add(load110.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:24: clear
                    {
                    pushFollow(FOLLOW_clear_in_update1343);
                    clear111=clear();

                    state._fsp--;

                    stream_clear.add(clear111.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:32: drop
                    {
                    pushFollow(FOLLOW_drop_in_update1347);
                    drop112=drop();

                    state._fsp--;

                    stream_drop.add(drop112.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:39: add
                    {
                    pushFollow(FOLLOW_add_in_update1351);
                    add113=add();

                    state._fsp--;

                    stream_add.add(add113.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:45: move
                    {
                    pushFollow(FOLLOW_move_in_update1355);
                    move114=move();

                    state._fsp--;

                    stream_move.add(move114.getTree());

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:52: copy
                    {
                    pushFollow(FOLLOW_copy_in_update1359);
                    copy115=copy();

                    state._fsp--;

                    stream_copy.add(copy115.getTree());

                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:59: create
                    {
                    pushFollow(FOLLOW_create_in_update1363);
                    create116=create();

                    state._fsp--;

                    stream_create.add(create116.getTree());

                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:68: insert
                    {
                    pushFollow(FOLLOW_insert_in_update1367);
                    insert117=insert();

                    state._fsp--;

                    stream_insert.add(insert117.getTree());

                    }
                    break;
                case 9 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:77: delete
                    {
                    pushFollow(FOLLOW_delete_in_update1371);
                    delete118=delete();

                    state._fsp--;

                    stream_delete.add(delete118.getTree());

                    }
                    break;
                case 10 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:86: modify
                    {
                    pushFollow(FOLLOW_modify_in_update1375);
                    modify119=modify();

                    state._fsp--;

                    stream_modify.add(modify119.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: copy, insert, add, load, clear, drop, prologue, delete, create, modify, move
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 189:94: -> prologue ( load )* ( clear )* ( drop )* ( add )* ( move )* ( copy )* ( create )* ( insert )* ( delete )* ( modify )*
            {
                adaptor.addChild(root_0, stream_prologue.nextTree());

                // com\\googlecode\\sparkleg\\Sparql.g:189:106: ( load )*
                while ( stream_load.hasNext() ) {
                    adaptor.addChild(root_0, stream_load.nextTree());

                }
                stream_load.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:189:112: ( clear )*
                while ( stream_clear.hasNext() ) {
                    adaptor.addChild(root_0, stream_clear.nextTree());

                }
                stream_clear.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:189:119: ( drop )*
                while ( stream_drop.hasNext() ) {
                    adaptor.addChild(root_0, stream_drop.nextTree());

                }
                stream_drop.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:189:125: ( add )*
                while ( stream_add.hasNext() ) {
                    adaptor.addChild(root_0, stream_add.nextTree());

                }
                stream_add.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:189:130: ( move )*
                while ( stream_move.hasNext() ) {
                    adaptor.addChild(root_0, stream_move.nextTree());

                }
                stream_move.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:189:136: ( copy )*
                while ( stream_copy.hasNext() ) {
                    adaptor.addChild(root_0, stream_copy.nextTree());

                }
                stream_copy.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:189:142: ( create )*
                while ( stream_create.hasNext() ) {
                    adaptor.addChild(root_0, stream_create.nextTree());

                }
                stream_create.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:189:150: ( insert )*
                while ( stream_insert.hasNext() ) {
                    adaptor.addChild(root_0, stream_insert.nextTree());

                }
                stream_insert.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:189:158: ( delete )*
                while ( stream_delete.hasNext() ) {
                    adaptor.addChild(root_0, stream_delete.nextTree());

                }
                stream_delete.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:189:166: ( modify )*
                while ( stream_modify.hasNext() ) {
                    adaptor.addChild(root_0, stream_modify.nextTree());

                }
                stream_modify.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update"


    public static class load_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "load"
    // com\\googlecode\\sparkleg\\Sparql.g:192:1: load : LOAD ( SILENT )? iriRef ( INTO graphRef )? -> ^( LOAD ( SILENT )* iriRef ( graphRef )? ) ;
    public final SparqlParser.load_return load() throws RecognitionException {
        SparqlParser.load_return retval = new SparqlParser.load_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LOAD120=null;
        Token SILENT121=null;
        Token INTO123=null;
        SparqlParser.iriRef_return iriRef122 =null;

        SparqlParser.graphRef_return graphRef124 =null;


        Object LOAD120_tree=null;
        Object SILENT121_tree=null;
        Object INTO123_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
        RewriteRuleTokenStream stream_LOAD=new RewriteRuleTokenStream(adaptor,"token LOAD");
        RewriteRuleSubtreeStream stream_graphRef=new RewriteRuleSubtreeStream(adaptor,"rule graphRef");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:193:5: ( LOAD ( SILENT )? iriRef ( INTO graphRef )? -> ^( LOAD ( SILENT )* iriRef ( graphRef )? ) )
            // com\\googlecode\\sparkleg\\Sparql.g:193:7: LOAD ( SILENT )? iriRef ( INTO graphRef )?
            {
            LOAD120=(Token)match(input,LOAD,FOLLOW_LOAD_in_load1438);  
            stream_LOAD.add(LOAD120);


            // com\\googlecode\\sparkleg\\Sparql.g:193:12: ( SILENT )?
            int alt41=2;
            switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt41=1;
                    }
                    break;
            }

            switch (alt41) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:193:12: SILENT
                    {
                    SILENT121=(Token)match(input,SILENT,FOLLOW_SILENT_in_load1440);  
                    stream_SILENT.add(SILENT121);


                    }
                    break;

            }


            pushFollow(FOLLOW_iriRef_in_load1443);
            iriRef122=iriRef();

            state._fsp--;

            stream_iriRef.add(iriRef122.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:193:27: ( INTO graphRef )?
            int alt42=2;
            switch ( input.LA(1) ) {
                case INTO:
                    {
                    alt42=1;
                    }
                    break;
            }

            switch (alt42) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:193:28: INTO graphRef
                    {
                    INTO123=(Token)match(input,INTO,FOLLOW_INTO_in_load1446);  
                    stream_INTO.add(INTO123);


                    pushFollow(FOLLOW_graphRef_in_load1448);
                    graphRef124=graphRef();

                    state._fsp--;

                    stream_graphRef.add(graphRef124.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: SILENT, graphRef, iriRef, LOAD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 193:44: -> ^( LOAD ( SILENT )* iriRef ( graphRef )? )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:193:47: ^( LOAD ( SILENT )* iriRef ( graphRef )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_LOAD.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:193:54: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SILENT.nextNode()
                    );

                }
                stream_SILENT.reset();

                adaptor.addChild(root_1, stream_iriRef.nextTree());

                // com\\googlecode\\sparkleg\\Sparql.g:193:69: ( graphRef )?
                if ( stream_graphRef.hasNext() ) {
                    adaptor.addChild(root_1, stream_graphRef.nextTree());

                }
                stream_graphRef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "load"


    public static class clear_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "clear"
    // com\\googlecode\\sparkleg\\Sparql.g:196:1: clear : CLEAR ( SILENT )? graphRefAll -> ^( CLEAR ( SILENT )* graphRefAll ) ;
    public final SparqlParser.clear_return clear() throws RecognitionException {
        SparqlParser.clear_return retval = new SparqlParser.clear_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CLEAR125=null;
        Token SILENT126=null;
        SparqlParser.graphRefAll_return graphRefAll127 =null;


        Object CLEAR125_tree=null;
        Object SILENT126_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_CLEAR=new RewriteRuleTokenStream(adaptor,"token CLEAR");
        RewriteRuleSubtreeStream stream_graphRefAll=new RewriteRuleSubtreeStream(adaptor,"rule graphRefAll");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:197:5: ( CLEAR ( SILENT )? graphRefAll -> ^( CLEAR ( SILENT )* graphRefAll ) )
            // com\\googlecode\\sparkleg\\Sparql.g:197:7: CLEAR ( SILENT )? graphRefAll
            {
            CLEAR125=(Token)match(input,CLEAR,FOLLOW_CLEAR_in_clear1485);  
            stream_CLEAR.add(CLEAR125);


            // com\\googlecode\\sparkleg\\Sparql.g:197:14: ( SILENT )?
            int alt43=2;
            switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt43=1;
                    }
                    break;
            }

            switch (alt43) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:197:14: SILENT
                    {
                    SILENT126=(Token)match(input,SILENT,FOLLOW_SILENT_in_clear1488);  
                    stream_SILENT.add(SILENT126);


                    }
                    break;

            }


            pushFollow(FOLLOW_graphRefAll_in_clear1491);
            graphRefAll127=graphRefAll();

            state._fsp--;

            stream_graphRefAll.add(graphRefAll127.getTree());

            // AST REWRITE
            // elements: graphRefAll, SILENT, CLEAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 197:34: -> ^( CLEAR ( SILENT )* graphRefAll )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:197:37: ^( CLEAR ( SILENT )* graphRefAll )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_CLEAR.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:197:45: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SILENT.nextNode()
                    );

                }
                stream_SILENT.reset();

                adaptor.addChild(root_1, stream_graphRefAll.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "clear"


    public static class drop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop"
    // com\\googlecode\\sparkleg\\Sparql.g:200:1: drop : DROP ( SILENT )? graphRefAll -> ^( DROP ( SILENT )* graphRefAll ) ;
    public final SparqlParser.drop_return drop() throws RecognitionException {
        SparqlParser.drop_return retval = new SparqlParser.drop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DROP128=null;
        Token SILENT129=null;
        SparqlParser.graphRefAll_return graphRefAll130 =null;


        Object DROP128_tree=null;
        Object SILENT129_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleSubtreeStream stream_graphRefAll=new RewriteRuleSubtreeStream(adaptor,"rule graphRefAll");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:201:5: ( DROP ( SILENT )? graphRefAll -> ^( DROP ( SILENT )* graphRefAll ) )
            // com\\googlecode\\sparkleg\\Sparql.g:201:7: DROP ( SILENT )? graphRefAll
            {
            DROP128=(Token)match(input,DROP,FOLLOW_DROP_in_drop1523);  
            stream_DROP.add(DROP128);


            // com\\googlecode\\sparkleg\\Sparql.g:201:12: ( SILENT )?
            int alt44=2;
            switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt44=1;
                    }
                    break;
            }

            switch (alt44) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:201:12: SILENT
                    {
                    SILENT129=(Token)match(input,SILENT,FOLLOW_SILENT_in_drop1525);  
                    stream_SILENT.add(SILENT129);


                    }
                    break;

            }


            pushFollow(FOLLOW_graphRefAll_in_drop1528);
            graphRefAll130=graphRefAll();

            state._fsp--;

            stream_graphRefAll.add(graphRefAll130.getTree());

            // AST REWRITE
            // elements: DROP, SILENT, graphRefAll
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 201:32: -> ^( DROP ( SILENT )* graphRefAll )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:201:35: ^( DROP ( SILENT )* graphRefAll )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_DROP.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:201:42: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SILENT.nextNode()
                    );

                }
                stream_SILENT.reset();

                adaptor.addChild(root_1, stream_graphRefAll.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop"


    public static class create_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create"
    // com\\googlecode\\sparkleg\\Sparql.g:204:1: create : CREATE ( SILENT )? graphRef -> ^( CREATE ( SILENT )* graphRef ) ;
    public final SparqlParser.create_return create() throws RecognitionException {
        SparqlParser.create_return retval = new SparqlParser.create_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE131=null;
        Token SILENT132=null;
        SparqlParser.graphRef_return graphRef133 =null;


        Object CREATE131_tree=null;
        Object SILENT132_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleSubtreeStream stream_graphRef=new RewriteRuleSubtreeStream(adaptor,"rule graphRef");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:205:5: ( CREATE ( SILENT )? graphRef -> ^( CREATE ( SILENT )* graphRef ) )
            // com\\googlecode\\sparkleg\\Sparql.g:205:7: CREATE ( SILENT )? graphRef
            {
            CREATE131=(Token)match(input,CREATE,FOLLOW_CREATE_in_create1557);  
            stream_CREATE.add(CREATE131);


            // com\\googlecode\\sparkleg\\Sparql.g:205:14: ( SILENT )?
            int alt45=2;
            switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt45=1;
                    }
                    break;
            }

            switch (alt45) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:205:14: SILENT
                    {
                    SILENT132=(Token)match(input,SILENT,FOLLOW_SILENT_in_create1559);  
                    stream_SILENT.add(SILENT132);


                    }
                    break;

            }


            pushFollow(FOLLOW_graphRef_in_create1562);
            graphRef133=graphRef();

            state._fsp--;

            stream_graphRef.add(graphRef133.getTree());

            // AST REWRITE
            // elements: graphRef, SILENT, CREATE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 205:31: -> ^( CREATE ( SILENT )* graphRef )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:205:34: ^( CREATE ( SILENT )* graphRef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_CREATE.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:205:43: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SILENT.nextNode()
                    );

                }
                stream_SILENT.reset();

                adaptor.addChild(root_1, stream_graphRef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create"


    public static class add_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // com\\googlecode\\sparkleg\\Sparql.g:208:1: add : ADD ( SILENT )? from= graphOrDefault TO to= graphOrDefault -> ^( ADD ( SILENT )* $from $to) ;
    public final SparqlParser.add_return add() throws RecognitionException {
        SparqlParser.add_return retval = new SparqlParser.add_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ADD134=null;
        Token SILENT135=null;
        Token TO136=null;
        SparqlParser.graphOrDefault_return from =null;

        SparqlParser.graphOrDefault_return to =null;


        Object ADD134_tree=null;
        Object SILENT135_tree=null;
        Object TO136_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");
        RewriteRuleSubtreeStream stream_graphOrDefault=new RewriteRuleSubtreeStream(adaptor,"rule graphOrDefault");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:209:5: ( ADD ( SILENT )? from= graphOrDefault TO to= graphOrDefault -> ^( ADD ( SILENT )* $from $to) )
            // com\\googlecode\\sparkleg\\Sparql.g:209:7: ADD ( SILENT )? from= graphOrDefault TO to= graphOrDefault
            {
            ADD134=(Token)match(input,ADD,FOLLOW_ADD_in_add1594);  
            stream_ADD.add(ADD134);


            // com\\googlecode\\sparkleg\\Sparql.g:209:11: ( SILENT )?
            int alt46=2;
            switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt46=1;
                    }
                    break;
            }

            switch (alt46) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:209:11: SILENT
                    {
                    SILENT135=(Token)match(input,SILENT,FOLLOW_SILENT_in_add1596);  
                    stream_SILENT.add(SILENT135);


                    }
                    break;

            }


            pushFollow(FOLLOW_graphOrDefault_in_add1601);
            from=graphOrDefault();

            state._fsp--;

            stream_graphOrDefault.add(from.getTree());

            TO136=(Token)match(input,TO,FOLLOW_TO_in_add1603);  
            stream_TO.add(TO136);


            pushFollow(FOLLOW_graphOrDefault_in_add1607);
            to=graphOrDefault();

            state._fsp--;

            stream_graphOrDefault.add(to.getTree());

            // AST REWRITE
            // elements: ADD, to, from, SILENT
            // token labels: 
            // rule labels: to, retval, from
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to",to!=null?to.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.tree:null);

            root_0 = (Object)adaptor.nil();
            // 209:60: -> ^( ADD ( SILENT )* $from $to)
            {
                // com\\googlecode\\sparkleg\\Sparql.g:209:63: ^( ADD ( SILENT )* $from $to)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_ADD.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:209:69: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SILENT.nextNode()
                    );

                }
                stream_SILENT.reset();

                adaptor.addChild(root_1, stream_from.nextTree());

                adaptor.addChild(root_1, stream_to.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add"


    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // com\\googlecode\\sparkleg\\Sparql.g:212:1: move : MOVE ( SILENT )? from= graphOrDefault TO to= graphOrDefault -> ^( MOVE ( SILENT )* $from $to) ;
    public final SparqlParser.move_return move() throws RecognitionException {
        SparqlParser.move_return retval = new SparqlParser.move_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MOVE137=null;
        Token SILENT138=null;
        Token TO139=null;
        SparqlParser.graphOrDefault_return from =null;

        SparqlParser.graphOrDefault_return to =null;


        Object MOVE137_tree=null;
        Object SILENT138_tree=null;
        Object TO139_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_MOVE=new RewriteRuleTokenStream(adaptor,"token MOVE");
        RewriteRuleSubtreeStream stream_graphOrDefault=new RewriteRuleSubtreeStream(adaptor,"rule graphOrDefault");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:213:5: ( MOVE ( SILENT )? from= graphOrDefault TO to= graphOrDefault -> ^( MOVE ( SILENT )* $from $to) )
            // com\\googlecode\\sparkleg\\Sparql.g:213:7: MOVE ( SILENT )? from= graphOrDefault TO to= graphOrDefault
            {
            MOVE137=(Token)match(input,MOVE,FOLLOW_MOVE_in_move1643);  
            stream_MOVE.add(MOVE137);


            // com\\googlecode\\sparkleg\\Sparql.g:213:12: ( SILENT )?
            int alt47=2;
            switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt47=1;
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:213:12: SILENT
                    {
                    SILENT138=(Token)match(input,SILENT,FOLLOW_SILENT_in_move1645);  
                    stream_SILENT.add(SILENT138);


                    }
                    break;

            }


            pushFollow(FOLLOW_graphOrDefault_in_move1650);
            from=graphOrDefault();

            state._fsp--;

            stream_graphOrDefault.add(from.getTree());

            TO139=(Token)match(input,TO,FOLLOW_TO_in_move1652);  
            stream_TO.add(TO139);


            pushFollow(FOLLOW_graphOrDefault_in_move1656);
            to=graphOrDefault();

            state._fsp--;

            stream_graphOrDefault.add(to.getTree());

            // AST REWRITE
            // elements: SILENT, MOVE, from, to
            // token labels: 
            // rule labels: to, retval, from
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to",to!=null?to.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.tree:null);

            root_0 = (Object)adaptor.nil();
            // 213:61: -> ^( MOVE ( SILENT )* $from $to)
            {
                // com\\googlecode\\sparkleg\\Sparql.g:213:64: ^( MOVE ( SILENT )* $from $to)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_MOVE.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:213:71: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SILENT.nextNode()
                    );

                }
                stream_SILENT.reset();

                adaptor.addChild(root_1, stream_from.nextTree());

                adaptor.addChild(root_1, stream_to.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "move"


    public static class copy_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "copy"
    // com\\googlecode\\sparkleg\\Sparql.g:216:1: copy : COPY ( SILENT )? from= graphOrDefault TO to= graphOrDefault -> ^( COPY ( SILENT )* $from $to) ;
    public final SparqlParser.copy_return copy() throws RecognitionException {
        SparqlParser.copy_return retval = new SparqlParser.copy_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COPY140=null;
        Token SILENT141=null;
        Token TO142=null;
        SparqlParser.graphOrDefault_return from =null;

        SparqlParser.graphOrDefault_return to =null;


        Object COPY140_tree=null;
        Object SILENT141_tree=null;
        Object TO142_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_COPY=new RewriteRuleTokenStream(adaptor,"token COPY");
        RewriteRuleSubtreeStream stream_graphOrDefault=new RewriteRuleSubtreeStream(adaptor,"rule graphOrDefault");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:217:5: ( COPY ( SILENT )? from= graphOrDefault TO to= graphOrDefault -> ^( COPY ( SILENT )* $from $to) )
            // com\\googlecode\\sparkleg\\Sparql.g:217:7: COPY ( SILENT )? from= graphOrDefault TO to= graphOrDefault
            {
            COPY140=(Token)match(input,COPY,FOLLOW_COPY_in_copy1692);  
            stream_COPY.add(COPY140);


            // com\\googlecode\\sparkleg\\Sparql.g:217:12: ( SILENT )?
            int alt48=2;
            switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt48=1;
                    }
                    break;
            }

            switch (alt48) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:217:12: SILENT
                    {
                    SILENT141=(Token)match(input,SILENT,FOLLOW_SILENT_in_copy1694);  
                    stream_SILENT.add(SILENT141);


                    }
                    break;

            }


            pushFollow(FOLLOW_graphOrDefault_in_copy1699);
            from=graphOrDefault();

            state._fsp--;

            stream_graphOrDefault.add(from.getTree());

            TO142=(Token)match(input,TO,FOLLOW_TO_in_copy1701);  
            stream_TO.add(TO142);


            pushFollow(FOLLOW_graphOrDefault_in_copy1705);
            to=graphOrDefault();

            state._fsp--;

            stream_graphOrDefault.add(to.getTree());

            // AST REWRITE
            // elements: to, from, COPY, SILENT
            // token labels: 
            // rule labels: to, retval, from
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to",to!=null?to.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.tree:null);

            root_0 = (Object)adaptor.nil();
            // 217:61: -> ^( COPY ( SILENT )* $from $to)
            {
                // com\\googlecode\\sparkleg\\Sparql.g:217:64: ^( COPY ( SILENT )* $from $to)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_COPY.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:217:71: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SILENT.nextNode()
                    );

                }
                stream_SILENT.reset();

                adaptor.addChild(root_1, stream_from.nextTree());

                adaptor.addChild(root_1, stream_to.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "copy"


    public static class insert_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insert"
    // com\\googlecode\\sparkleg\\Sparql.g:220:1: insert : INSERT DATA quadPattern -> ^( INSERT DATA quadPattern ) ;
    public final SparqlParser.insert_return insert() throws RecognitionException {
        SparqlParser.insert_return retval = new SparqlParser.insert_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INSERT143=null;
        Token DATA144=null;
        SparqlParser.quadPattern_return quadPattern145 =null;


        Object INSERT143_tree=null;
        Object DATA144_tree=null;
        RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
        RewriteRuleTokenStream stream_DATA=new RewriteRuleTokenStream(adaptor,"token DATA");
        RewriteRuleSubtreeStream stream_quadPattern=new RewriteRuleSubtreeStream(adaptor,"rule quadPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:221:5: ( INSERT DATA quadPattern -> ^( INSERT DATA quadPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:221:7: INSERT DATA quadPattern
            {
            INSERT143=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert1737);  
            stream_INSERT.add(INSERT143);


            DATA144=(Token)match(input,DATA,FOLLOW_DATA_in_insert1739);  
            stream_DATA.add(DATA144);


            pushFollow(FOLLOW_quadPattern_in_insert1741);
            quadPattern145=quadPattern();

            state._fsp--;

            stream_quadPattern.add(quadPattern145.getTree());

            // AST REWRITE
            // elements: DATA, quadPattern, INSERT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 221:31: -> ^( INSERT DATA quadPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:221:34: ^( INSERT DATA quadPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_INSERT.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_DATA.nextNode()
                );

                adaptor.addChild(root_1, stream_quadPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "insert"


    public static class delete_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete"
    // com\\googlecode\\sparkleg\\Sparql.g:224:1: delete : DELETE ( deleteData | deleteWhere ) ;
    public final SparqlParser.delete_return delete() throws RecognitionException {
        SparqlParser.delete_return retval = new SparqlParser.delete_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DELETE146=null;
        SparqlParser.deleteData_return deleteData147 =null;

        SparqlParser.deleteWhere_return deleteWhere148 =null;


        Object DELETE146_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:225:5: ( DELETE ( deleteData | deleteWhere ) )
            // com\\googlecode\\sparkleg\\Sparql.g:225:7: DELETE ( deleteData | deleteWhere )
            {
            root_0 = (Object)adaptor.nil();


            DELETE146=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete1775); 
            DELETE146_tree = 
            (Object)adaptor.create(DELETE146)
            ;
            adaptor.addChild(root_0, DELETE146_tree);


            // com\\googlecode\\sparkleg\\Sparql.g:225:14: ( deleteData | deleteWhere )
            int alt49=2;
            switch ( input.LA(1) ) {
            case DATA:
                {
                alt49=1;
                }
                break;
            case WHERE:
                {
                alt49=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:225:15: deleteData
                    {
                    pushFollow(FOLLOW_deleteData_in_delete1778);
                    deleteData147=deleteData();

                    state._fsp--;

                    adaptor.addChild(root_0, deleteData147.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:225:28: deleteWhere
                    {
                    pushFollow(FOLLOW_deleteWhere_in_delete1782);
                    deleteWhere148=deleteWhere();

                    state._fsp--;

                    adaptor.addChild(root_0, deleteWhere148.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "delete"


    public static class deleteData_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "deleteData"
    // com\\googlecode\\sparkleg\\Sparql.g:228:1: deleteData : DATA quadPattern -> ^( DELETE DATA quadPattern ) ;
    public final SparqlParser.deleteData_return deleteData() throws RecognitionException {
        SparqlParser.deleteData_return retval = new SparqlParser.deleteData_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATA149=null;
        SparqlParser.quadPattern_return quadPattern150 =null;


        Object DATA149_tree=null;
        RewriteRuleTokenStream stream_DATA=new RewriteRuleTokenStream(adaptor,"token DATA");
        RewriteRuleSubtreeStream stream_quadPattern=new RewriteRuleSubtreeStream(adaptor,"rule quadPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:229:5: ( DATA quadPattern -> ^( DELETE DATA quadPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:229:7: DATA quadPattern
            {
            DATA149=(Token)match(input,DATA,FOLLOW_DATA_in_deleteData1800);  
            stream_DATA.add(DATA149);


            pushFollow(FOLLOW_quadPattern_in_deleteData1802);
            quadPattern150=quadPattern();

            state._fsp--;

            stream_quadPattern.add(quadPattern150.getTree());

            // AST REWRITE
            // elements: quadPattern, DATA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 229:24: -> ^( DELETE DATA quadPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:229:27: ^( DELETE DATA quadPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DELETE, "DELETE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_DATA.nextNode()
                );

                adaptor.addChild(root_1, stream_quadPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "deleteData"


    public static class deleteWhere_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "deleteWhere"
    // com\\googlecode\\sparkleg\\Sparql.g:232:1: deleteWhere : WHERE quadPattern -> ^( DELETE WHERE quadPattern ) ;
    public final SparqlParser.deleteWhere_return deleteWhere() throws RecognitionException {
        SparqlParser.deleteWhere_return retval = new SparqlParser.deleteWhere_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE151=null;
        SparqlParser.quadPattern_return quadPattern152 =null;


        Object WHERE151_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_quadPattern=new RewriteRuleSubtreeStream(adaptor,"rule quadPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:233:5: ( WHERE quadPattern -> ^( DELETE WHERE quadPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:233:7: WHERE quadPattern
            {
            WHERE151=(Token)match(input,WHERE,FOLLOW_WHERE_in_deleteWhere1829);  
            stream_WHERE.add(WHERE151);


            pushFollow(FOLLOW_quadPattern_in_deleteWhere1831);
            quadPattern152=quadPattern();

            state._fsp--;

            stream_quadPattern.add(quadPattern152.getTree());

            // AST REWRITE
            // elements: quadPattern, WHERE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 233:25: -> ^( DELETE WHERE quadPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:233:28: ^( DELETE WHERE quadPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DELETE, "DELETE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_WHERE.nextNode()
                );

                adaptor.addChild(root_1, stream_quadPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "deleteWhere"


    public static class modify_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modify"
    // com\\googlecode\\sparkleg\\Sparql.g:236:1: modify : ( WITH iriRef )? ( deleteClause ( insertClause )? | insertClause ) ( usingClause )* WHERE groupGraphPattern -> ^( MODIFY ( ^( WITH iriRef ) )? ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE_CLAUSE groupGraphPattern ) ) ;
    public final SparqlParser.modify_return modify() throws RecognitionException {
        SparqlParser.modify_return retval = new SparqlParser.modify_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WITH153=null;
        Token WHERE159=null;
        SparqlParser.iriRef_return iriRef154 =null;

        SparqlParser.deleteClause_return deleteClause155 =null;

        SparqlParser.insertClause_return insertClause156 =null;

        SparqlParser.insertClause_return insertClause157 =null;

        SparqlParser.usingClause_return usingClause158 =null;

        SparqlParser.groupGraphPattern_return groupGraphPattern160 =null;


        Object WITH153_tree=null;
        Object WHERE159_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_deleteClause=new RewriteRuleSubtreeStream(adaptor,"rule deleteClause");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        RewriteRuleSubtreeStream stream_insertClause=new RewriteRuleSubtreeStream(adaptor,"rule insertClause");
        RewriteRuleSubtreeStream stream_usingClause=new RewriteRuleSubtreeStream(adaptor,"rule usingClause");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:237:5: ( ( WITH iriRef )? ( deleteClause ( insertClause )? | insertClause ) ( usingClause )* WHERE groupGraphPattern -> ^( MODIFY ( ^( WITH iriRef ) )? ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE_CLAUSE groupGraphPattern ) ) )
            // com\\googlecode\\sparkleg\\Sparql.g:237:7: ( WITH iriRef )? ( deleteClause ( insertClause )? | insertClause ) ( usingClause )* WHERE groupGraphPattern
            {
            // com\\googlecode\\sparkleg\\Sparql.g:237:7: ( WITH iriRef )?
            int alt50=2;
            switch ( input.LA(1) ) {
                case WITH:
                    {
                    alt50=1;
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:237:8: WITH iriRef
                    {
                    WITH153=(Token)match(input,WITH,FOLLOW_WITH_in_modify1863);  
                    stream_WITH.add(WITH153);


                    pushFollow(FOLLOW_iriRef_in_modify1865);
                    iriRef154=iriRef();

                    state._fsp--;

                    stream_iriRef.add(iriRef154.getTree());

                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:237:22: ( deleteClause ( insertClause )? | insertClause )
            int alt52=2;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt52=1;
                }
                break;
            case INSERT:
                {
                alt52=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:237:23: deleteClause ( insertClause )?
                    {
                    pushFollow(FOLLOW_deleteClause_in_modify1870);
                    deleteClause155=deleteClause();

                    state._fsp--;

                    stream_deleteClause.add(deleteClause155.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:237:36: ( insertClause )?
                    int alt51=2;
                    switch ( input.LA(1) ) {
                        case INSERT:
                            {
                            alt51=1;
                            }
                            break;
                    }

                    switch (alt51) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:237:36: insertClause
                            {
                            pushFollow(FOLLOW_insertClause_in_modify1872);
                            insertClause156=insertClause();

                            state._fsp--;

                            stream_insertClause.add(insertClause156.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:237:52: insertClause
                    {
                    pushFollow(FOLLOW_insertClause_in_modify1877);
                    insertClause157=insertClause();

                    state._fsp--;

                    stream_insertClause.add(insertClause157.getTree());

                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:237:66: ( usingClause )*
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case USING:
                    {
                    alt53=1;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:237:66: usingClause
            	    {
            	    pushFollow(FOLLOW_usingClause_in_modify1880);
            	    usingClause158=usingClause();

            	    state._fsp--;

            	    stream_usingClause.add(usingClause158.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            WHERE159=(Token)match(input,WHERE,FOLLOW_WHERE_in_modify1883);  
            stream_WHERE.add(WHERE159);


            pushFollow(FOLLOW_groupGraphPattern_in_modify1885);
            groupGraphPattern160=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern160.getTree());

            // AST REWRITE
            // elements: insertClause, deleteClause, WITH, iriRef, groupGraphPattern, usingClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 237:103: -> ^( MODIFY ( ^( WITH iriRef ) )? ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE_CLAUSE groupGraphPattern ) )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:237:106: ^( MODIFY ( ^( WITH iriRef ) )? ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE_CLAUSE groupGraphPattern ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MODIFY, "MODIFY")
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:237:115: ( ^( WITH iriRef ) )?
                if ( stream_WITH.hasNext()||stream_iriRef.hasNext() ) {
                    // com\\googlecode\\sparkleg\\Sparql.g:237:115: ^( WITH iriRef )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_WITH.nextNode()
                    , root_2);

                    adaptor.addChild(root_2, stream_iriRef.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_WITH.reset();
                stream_iriRef.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:237:131: ( deleteClause )*
                while ( stream_deleteClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_deleteClause.nextTree());

                }
                stream_deleteClause.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:237:145: ( insertClause )*
                while ( stream_insertClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_insertClause.nextTree());

                }
                stream_insertClause.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:237:159: ( usingClause )*
                while ( stream_usingClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_usingClause.nextTree());

                }
                stream_usingClause.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:237:172: ^( WHERE_CLAUSE groupGraphPattern )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WHERE_CLAUSE, "WHERE_CLAUSE")
                , root_2);

                adaptor.addChild(root_2, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modify"


    public static class deleteClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "deleteClause"
    // com\\googlecode\\sparkleg\\Sparql.g:240:1: deleteClause : DELETE quadPattern -> DELETE quadPattern ;
    public final SparqlParser.deleteClause_return deleteClause() throws RecognitionException {
        SparqlParser.deleteClause_return retval = new SparqlParser.deleteClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DELETE161=null;
        SparqlParser.quadPattern_return quadPattern162 =null;


        Object DELETE161_tree=null;
        RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
        RewriteRuleSubtreeStream stream_quadPattern=new RewriteRuleSubtreeStream(adaptor,"rule quadPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:241:5: ( DELETE quadPattern -> DELETE quadPattern )
            // com\\googlecode\\sparkleg\\Sparql.g:241:7: DELETE quadPattern
            {
            DELETE161=(Token)match(input,DELETE,FOLLOW_DELETE_in_deleteClause1932);  
            stream_DELETE.add(DELETE161);


            pushFollow(FOLLOW_quadPattern_in_deleteClause1934);
            quadPattern162=quadPattern();

            state._fsp--;

            stream_quadPattern.add(quadPattern162.getTree());

            // AST REWRITE
            // elements: quadPattern, DELETE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 241:26: -> DELETE quadPattern
            {
                adaptor.addChild(root_0, 
                stream_DELETE.nextNode()
                );

                adaptor.addChild(root_0, stream_quadPattern.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "deleteClause"


    public static class insertClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insertClause"
    // com\\googlecode\\sparkleg\\Sparql.g:244:1: insertClause : INSERT quadPattern -> INSERT quadPattern ;
    public final SparqlParser.insertClause_return insertClause() throws RecognitionException {
        SparqlParser.insertClause_return retval = new SparqlParser.insertClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INSERT163=null;
        SparqlParser.quadPattern_return quadPattern164 =null;


        Object INSERT163_tree=null;
        RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
        RewriteRuleSubtreeStream stream_quadPattern=new RewriteRuleSubtreeStream(adaptor,"rule quadPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:245:5: ( INSERT quadPattern -> INSERT quadPattern )
            // com\\googlecode\\sparkleg\\Sparql.g:245:7: INSERT quadPattern
            {
            INSERT163=(Token)match(input,INSERT,FOLLOW_INSERT_in_insertClause1963);  
            stream_INSERT.add(INSERT163);


            pushFollow(FOLLOW_quadPattern_in_insertClause1965);
            quadPattern164=quadPattern();

            state._fsp--;

            stream_quadPattern.add(quadPattern164.getTree());

            // AST REWRITE
            // elements: quadPattern, INSERT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 245:26: -> INSERT quadPattern
            {
                adaptor.addChild(root_0, 
                stream_INSERT.nextNode()
                );

                adaptor.addChild(root_0, stream_quadPattern.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "insertClause"


    public static class usingClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "usingClause"
    // com\\googlecode\\sparkleg\\Sparql.g:248:1: usingClause : USING ( NAMED )? iriRef -> ^( USING ( NAMED )? iriRef ) ;
    public final SparqlParser.usingClause_return usingClause() throws RecognitionException {
        SparqlParser.usingClause_return retval = new SparqlParser.usingClause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token USING165=null;
        Token NAMED166=null;
        SparqlParser.iriRef_return iriRef167 =null;


        Object USING165_tree=null;
        Object NAMED166_tree=null;
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_NAMED=new RewriteRuleTokenStream(adaptor,"token NAMED");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:249:5: ( USING ( NAMED )? iriRef -> ^( USING ( NAMED )? iriRef ) )
            // com\\googlecode\\sparkleg\\Sparql.g:249:7: USING ( NAMED )? iriRef
            {
            USING165=(Token)match(input,USING,FOLLOW_USING_in_usingClause1988);  
            stream_USING.add(USING165);


            // com\\googlecode\\sparkleg\\Sparql.g:249:13: ( NAMED )?
            int alt54=2;
            switch ( input.LA(1) ) {
                case NAMED:
                    {
                    alt54=1;
                    }
                    break;
            }

            switch (alt54) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:249:13: NAMED
                    {
                    NAMED166=(Token)match(input,NAMED,FOLLOW_NAMED_in_usingClause1990);  
                    stream_NAMED.add(NAMED166);


                    }
                    break;

            }


            pushFollow(FOLLOW_iriRef_in_usingClause1993);
            iriRef167=iriRef();

            state._fsp--;

            stream_iriRef.add(iriRef167.getTree());

            // AST REWRITE
            // elements: NAMED, USING, iriRef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 249:27: -> ^( USING ( NAMED )? iriRef )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:249:30: ^( USING ( NAMED )? iriRef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_USING.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:249:38: ( NAMED )?
                if ( stream_NAMED.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_NAMED.nextNode()
                    );

                }
                stream_NAMED.reset();

                adaptor.addChild(root_1, stream_iriRef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "usingClause"


    public static class graphOrDefault_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphOrDefault"
    // com\\googlecode\\sparkleg\\Sparql.g:252:1: graphOrDefault : ( DEFAULT | ( GRAPH )? iriRef );
    public final SparqlParser.graphOrDefault_return graphOrDefault() throws RecognitionException {
        SparqlParser.graphOrDefault_return retval = new SparqlParser.graphOrDefault_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFAULT168=null;
        Token GRAPH169=null;
        SparqlParser.iriRef_return iriRef170 =null;


        Object DEFAULT168_tree=null;
        Object GRAPH169_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:253:5: ( DEFAULT | ( GRAPH )? iriRef )
            int alt56=2;
            switch ( input.LA(1) ) {
            case DEFAULT:
                {
                alt56=1;
                }
                break;
            case GRAPH:
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt56=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:253:7: DEFAULT
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT168=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_graphOrDefault2024); 
                    DEFAULT168_tree = 
                    (Object)adaptor.create(DEFAULT168)
                    ;
                    adaptor.addChild(root_0, DEFAULT168_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:254:7: ( GRAPH )? iriRef
                    {
                    root_0 = (Object)adaptor.nil();


                    // com\\googlecode\\sparkleg\\Sparql.g:254:7: ( GRAPH )?
                    int alt55=2;
                    switch ( input.LA(1) ) {
                        case GRAPH:
                            {
                            alt55=1;
                            }
                            break;
                    }

                    switch (alt55) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:254:7: GRAPH
                            {
                            GRAPH169=(Token)match(input,GRAPH,FOLLOW_GRAPH_in_graphOrDefault2033); 
                            GRAPH169_tree = 
                            (Object)adaptor.create(GRAPH169)
                            ;
                            adaptor.addChild(root_0, GRAPH169_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_iriRef_in_graphOrDefault2036);
                    iriRef170=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef170.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphOrDefault"


    public static class graphRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphRef"
    // com\\googlecode\\sparkleg\\Sparql.g:257:1: graphRef : GRAPH iriRef ;
    public final SparqlParser.graphRef_return graphRef() throws RecognitionException {
        SparqlParser.graphRef_return retval = new SparqlParser.graphRef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GRAPH171=null;
        SparqlParser.iriRef_return iriRef172 =null;


        Object GRAPH171_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:258:5: ( GRAPH iriRef )
            // com\\googlecode\\sparkleg\\Sparql.g:258:7: GRAPH iriRef
            {
            root_0 = (Object)adaptor.nil();


            GRAPH171=(Token)match(input,GRAPH,FOLLOW_GRAPH_in_graphRef2063); 
            GRAPH171_tree = 
            (Object)adaptor.create(GRAPH171)
            ;
            adaptor.addChild(root_0, GRAPH171_tree);


            pushFollow(FOLLOW_iriRef_in_graphRef2065);
            iriRef172=iriRef();

            state._fsp--;

            adaptor.addChild(root_0, iriRef172.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphRef"


    public static class graphRefAll_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphRefAll"
    // com\\googlecode\\sparkleg\\Sparql.g:261:1: graphRefAll : ( graphRef | DEFAULT | NAMED | ALL );
    public final SparqlParser.graphRefAll_return graphRefAll() throws RecognitionException {
        SparqlParser.graphRefAll_return retval = new SparqlParser.graphRefAll_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFAULT174=null;
        Token NAMED175=null;
        Token ALL176=null;
        SparqlParser.graphRef_return graphRef173 =null;


        Object DEFAULT174_tree=null;
        Object NAMED175_tree=null;
        Object ALL176_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:262:5: ( graphRef | DEFAULT | NAMED | ALL )
            int alt57=4;
            switch ( input.LA(1) ) {
            case GRAPH:
                {
                alt57=1;
                }
                break;
            case DEFAULT:
                {
                alt57=2;
                }
                break;
            case NAMED:
                {
                alt57=3;
                }
                break;
            case ALL:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:262:7: graphRef
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_graphRef_in_graphRefAll2082);
                    graphRef173=graphRef();

                    state._fsp--;

                    adaptor.addChild(root_0, graphRef173.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:262:18: DEFAULT
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT174=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_graphRefAll2086); 
                    DEFAULT174_tree = 
                    (Object)adaptor.create(DEFAULT174)
                    ;
                    adaptor.addChild(root_0, DEFAULT174_tree);


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:262:28: NAMED
                    {
                    root_0 = (Object)adaptor.nil();


                    NAMED175=(Token)match(input,NAMED,FOLLOW_NAMED_in_graphRefAll2090); 
                    NAMED175_tree = 
                    (Object)adaptor.create(NAMED175)
                    ;
                    adaptor.addChild(root_0, NAMED175_tree);


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:262:36: ALL
                    {
                    root_0 = (Object)adaptor.nil();


                    ALL176=(Token)match(input,ALL,FOLLOW_ALL_in_graphRefAll2094); 
                    ALL176_tree = 
                    (Object)adaptor.create(ALL176)
                    ;
                    adaptor.addChild(root_0, ALL176_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphRefAll"


    public static class quadPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "quadPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:265:1: quadPattern : OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE -> quads ;
    public final SparqlParser.quadPattern_return quadPattern() throws RecognitionException {
        SparqlParser.quadPattern_return retval = new SparqlParser.quadPattern_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_CURLY_BRACE177=null;
        Token CLOSE_CURLY_BRACE179=null;
        SparqlParser.quads_return quads178 =null;


        Object OPEN_CURLY_BRACE177_tree=null;
        Object CLOSE_CURLY_BRACE179_tree=null;
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_quads=new RewriteRuleSubtreeStream(adaptor,"rule quads");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:266:5: ( OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE -> quads )
            // com\\googlecode\\sparkleg\\Sparql.g:266:7: OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE
            {
            OPEN_CURLY_BRACE177=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_quadPattern2111);  
            stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE177);


            pushFollow(FOLLOW_quads_in_quadPattern2113);
            quads178=quads();

            state._fsp--;

            stream_quads.add(quads178.getTree());

            CLOSE_CURLY_BRACE179=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_quadPattern2115);  
            stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE179);


            // AST REWRITE
            // elements: quads
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 266:48: -> quads
            {
                adaptor.addChild(root_0, stream_quads.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "quadPattern"


    public static class quads_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "quads"
    // com\\googlecode\\sparkleg\\Sparql.g:269:1: quads : ( triplesTemplate )? ( quadsNotTriples ( DOT )? ( triplesTemplate )? )* -> ( triplesTemplate )? ( quadsNotTriples ( triplesTemplate )? )* ;
    public final SparqlParser.quads_return quads() throws RecognitionException {
        SparqlParser.quads_return retval = new SparqlParser.quads_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT182=null;
        SparqlParser.triplesTemplate_return triplesTemplate180 =null;

        SparqlParser.quadsNotTriples_return quadsNotTriples181 =null;

        SparqlParser.triplesTemplate_return triplesTemplate183 =null;


        Object DOT182_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_triplesTemplate=new RewriteRuleSubtreeStream(adaptor,"rule triplesTemplate");
        RewriteRuleSubtreeStream stream_quadsNotTriples=new RewriteRuleSubtreeStream(adaptor,"rule quadsNotTriples");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:270:5: ( ( triplesTemplate )? ( quadsNotTriples ( DOT )? ( triplesTemplate )? )* -> ( triplesTemplate )? ( quadsNotTriples ( triplesTemplate )? )* )
            // com\\googlecode\\sparkleg\\Sparql.g:270:7: ( triplesTemplate )? ( quadsNotTriples ( DOT )? ( triplesTemplate )? )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:270:7: ( triplesTemplate )?
            int alt58=2;
            switch ( input.LA(1) ) {
                case BLANK_NODE_LABEL:
                case DECIMAL:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case FALSE:
                case INTEGER:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI_REF:
                case OPEN_BRACE:
                case OPEN_SQUARE_BRACKET:
                case PNAME_LN:
                case PNAME_NS:
                case STRING_LITERAL1:
                case STRING_LITERAL2:
                case STRING_LITERAL_LONG1:
                case STRING_LITERAL_LONG2:
                case TRUE:
                case VAR1:
                case VAR2:
                    {
                    alt58=1;
                    }
                    break;
            }

            switch (alt58) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:270:7: triplesTemplate
                    {
                    pushFollow(FOLLOW_triplesTemplate_in_quads2140);
                    triplesTemplate180=triplesTemplate();

                    state._fsp--;

                    stream_triplesTemplate.add(triplesTemplate180.getTree());

                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:270:24: ( quadsNotTriples ( DOT )? ( triplesTemplate )? )*
            loop61:
            do {
                int alt61=2;
                switch ( input.LA(1) ) {
                case GRAPH:
                    {
                    alt61=1;
                    }
                    break;

                }

                switch (alt61) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:270:25: quadsNotTriples ( DOT )? ( triplesTemplate )?
            	    {
            	    pushFollow(FOLLOW_quadsNotTriples_in_quads2144);
            	    quadsNotTriples181=quadsNotTriples();

            	    state._fsp--;

            	    stream_quadsNotTriples.add(quadsNotTriples181.getTree());

            	    // com\\googlecode\\sparkleg\\Sparql.g:270:41: ( DOT )?
            	    int alt59=2;
            	    switch ( input.LA(1) ) {
            	        case DOT:
            	            {
            	            alt59=1;
            	            }
            	            break;
            	    }

            	    switch (alt59) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:270:41: DOT
            	            {
            	            DOT182=(Token)match(input,DOT,FOLLOW_DOT_in_quads2146);  
            	            stream_DOT.add(DOT182);


            	            }
            	            break;

            	    }


            	    // com\\googlecode\\sparkleg\\Sparql.g:270:46: ( triplesTemplate )?
            	    int alt60=2;
            	    switch ( input.LA(1) ) {
            	        case BLANK_NODE_LABEL:
            	        case DECIMAL:
            	        case DECIMAL_NEGATIVE:
            	        case DECIMAL_POSITIVE:
            	        case DOUBLE:
            	        case DOUBLE_NEGATIVE:
            	        case DOUBLE_POSITIVE:
            	        case FALSE:
            	        case INTEGER:
            	        case INTEGER_NEGATIVE:
            	        case INTEGER_POSITIVE:
            	        case IRI_REF:
            	        case OPEN_BRACE:
            	        case OPEN_SQUARE_BRACKET:
            	        case PNAME_LN:
            	        case PNAME_NS:
            	        case STRING_LITERAL1:
            	        case STRING_LITERAL2:
            	        case STRING_LITERAL_LONG1:
            	        case STRING_LITERAL_LONG2:
            	        case TRUE:
            	        case VAR1:
            	        case VAR2:
            	            {
            	            alt60=1;
            	            }
            	            break;
            	    }

            	    switch (alt60) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:270:46: triplesTemplate
            	            {
            	            pushFollow(FOLLOW_triplesTemplate_in_quads2149);
            	            triplesTemplate183=triplesTemplate();

            	            state._fsp--;

            	            stream_triplesTemplate.add(triplesTemplate183.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            // AST REWRITE
            // elements: triplesTemplate, quadsNotTriples, triplesTemplate
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 270:65: -> ( triplesTemplate )? ( quadsNotTriples ( triplesTemplate )? )*
            {
                // com\\googlecode\\sparkleg\\Sparql.g:270:69: ( triplesTemplate )?
                if ( stream_triplesTemplate.hasNext() ) {
                    adaptor.addChild(root_0, stream_triplesTemplate.nextTree());

                }
                stream_triplesTemplate.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:270:86: ( quadsNotTriples ( triplesTemplate )? )*
                while ( stream_quadsNotTriples.hasNext() ) {
                    adaptor.addChild(root_0, stream_quadsNotTriples.nextTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:270:103: ( triplesTemplate )?
                    if ( stream_triplesTemplate.hasNext() ) {
                        adaptor.addChild(root_0, stream_triplesTemplate.nextTree());

                    }
                    stream_triplesTemplate.reset();

                }
                stream_quadsNotTriples.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "quads"


    public static class quadsNotTriples_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "quadsNotTriples"
    // com\\googlecode\\sparkleg\\Sparql.g:273:1: quadsNotTriples : GRAPH varOrIRIref OPEN_CURLY_BRACE ( triplesTemplate )? CLOSE_CURLY_BRACE -> ^( GRAPH varOrIRIref ( triplesTemplate )? ) ;
    public final SparqlParser.quadsNotTriples_return quadsNotTriples() throws RecognitionException {
        SparqlParser.quadsNotTriples_return retval = new SparqlParser.quadsNotTriples_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GRAPH184=null;
        Token OPEN_CURLY_BRACE186=null;
        Token CLOSE_CURLY_BRACE188=null;
        SparqlParser.varOrIRIref_return varOrIRIref185 =null;

        SparqlParser.triplesTemplate_return triplesTemplate187 =null;


        Object GRAPH184_tree=null;
        Object OPEN_CURLY_BRACE186_tree=null;
        Object CLOSE_CURLY_BRACE188_tree=null;
        RewriteRuleTokenStream stream_GRAPH=new RewriteRuleTokenStream(adaptor,"token GRAPH");
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_varOrIRIref=new RewriteRuleSubtreeStream(adaptor,"rule varOrIRIref");
        RewriteRuleSubtreeStream stream_triplesTemplate=new RewriteRuleSubtreeStream(adaptor,"rule triplesTemplate");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:274:5: ( GRAPH varOrIRIref OPEN_CURLY_BRACE ( triplesTemplate )? CLOSE_CURLY_BRACE -> ^( GRAPH varOrIRIref ( triplesTemplate )? ) )
            // com\\googlecode\\sparkleg\\Sparql.g:274:7: GRAPH varOrIRIref OPEN_CURLY_BRACE ( triplesTemplate )? CLOSE_CURLY_BRACE
            {
            GRAPH184=(Token)match(input,GRAPH,FOLLOW_GRAPH_in_quadsNotTriples2188);  
            stream_GRAPH.add(GRAPH184);


            pushFollow(FOLLOW_varOrIRIref_in_quadsNotTriples2190);
            varOrIRIref185=varOrIRIref();

            state._fsp--;

            stream_varOrIRIref.add(varOrIRIref185.getTree());

            OPEN_CURLY_BRACE186=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_quadsNotTriples2192);  
            stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE186);


            // com\\googlecode\\sparkleg\\Sparql.g:274:42: ( triplesTemplate )?
            int alt62=2;
            switch ( input.LA(1) ) {
                case BLANK_NODE_LABEL:
                case DECIMAL:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case FALSE:
                case INTEGER:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI_REF:
                case OPEN_BRACE:
                case OPEN_SQUARE_BRACKET:
                case PNAME_LN:
                case PNAME_NS:
                case STRING_LITERAL1:
                case STRING_LITERAL2:
                case STRING_LITERAL_LONG1:
                case STRING_LITERAL_LONG2:
                case TRUE:
                case VAR1:
                case VAR2:
                    {
                    alt62=1;
                    }
                    break;
            }

            switch (alt62) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:274:42: triplesTemplate
                    {
                    pushFollow(FOLLOW_triplesTemplate_in_quadsNotTriples2194);
                    triplesTemplate187=triplesTemplate();

                    state._fsp--;

                    stream_triplesTemplate.add(triplesTemplate187.getTree());

                    }
                    break;

            }


            CLOSE_CURLY_BRACE188=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_quadsNotTriples2197);  
            stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE188);


            // AST REWRITE
            // elements: triplesTemplate, GRAPH, varOrIRIref
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 274:77: -> ^( GRAPH varOrIRIref ( triplesTemplate )? )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:274:80: ^( GRAPH varOrIRIref ( triplesTemplate )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_GRAPH.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_varOrIRIref.nextTree());

                // com\\googlecode\\sparkleg\\Sparql.g:274:100: ( triplesTemplate )?
                if ( stream_triplesTemplate.hasNext() ) {
                    adaptor.addChild(root_1, stream_triplesTemplate.nextTree());

                }
                stream_triplesTemplate.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "quadsNotTriples"


    public static class triplesTemplate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triplesTemplate"
    // com\\googlecode\\sparkleg\\Sparql.g:277:1: triplesTemplate : triplesSameSubject ( DOT triplesSameSubject )* ( DOT )? -> ^( TRIPLES_TEMPLATE ( triplesSameSubject )* ) ;
    public final SparqlParser.triplesTemplate_return triplesTemplate() throws RecognitionException {
        SparqlParser.triplesTemplate_return retval = new SparqlParser.triplesTemplate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT190=null;
        Token DOT192=null;
        SparqlParser.triplesSameSubject_return triplesSameSubject189 =null;

        SparqlParser.triplesSameSubject_return triplesSameSubject191 =null;


        Object DOT190_tree=null;
        Object DOT192_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_triplesSameSubject=new RewriteRuleSubtreeStream(adaptor,"rule triplesSameSubject");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:278:5: ( triplesSameSubject ( DOT triplesSameSubject )* ( DOT )? -> ^( TRIPLES_TEMPLATE ( triplesSameSubject )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:278:7: triplesSameSubject ( DOT triplesSameSubject )* ( DOT )?
            {
            pushFollow(FOLLOW_triplesSameSubject_in_triplesTemplate2229);
            triplesSameSubject189=triplesSameSubject();

            state._fsp--;

            stream_triplesSameSubject.add(triplesSameSubject189.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:278:26: ( DOT triplesSameSubject )*
            loop63:
            do {
                int alt63=2;
                switch ( input.LA(1) ) {
                case DOT:
                    {
                    switch ( input.LA(2) ) {
                    case BLANK_NODE_LABEL:
                    case DECIMAL:
                    case DECIMAL_NEGATIVE:
                    case DECIMAL_POSITIVE:
                    case DOUBLE:
                    case DOUBLE_NEGATIVE:
                    case DOUBLE_POSITIVE:
                    case FALSE:
                    case INTEGER:
                    case INTEGER_NEGATIVE:
                    case INTEGER_POSITIVE:
                    case IRI_REF:
                    case OPEN_BRACE:
                    case OPEN_SQUARE_BRACKET:
                    case PNAME_LN:
                    case PNAME_NS:
                    case STRING_LITERAL1:
                    case STRING_LITERAL2:
                    case STRING_LITERAL_LONG1:
                    case STRING_LITERAL_LONG2:
                    case TRUE:
                    case VAR1:
                    case VAR2:
                        {
                        alt63=1;
                        }
                        break;

                    }

                    }
                    break;

                }

                switch (alt63) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:278:27: DOT triplesSameSubject
            	    {
            	    DOT190=(Token)match(input,DOT,FOLLOW_DOT_in_triplesTemplate2232);  
            	    stream_DOT.add(DOT190);


            	    pushFollow(FOLLOW_triplesSameSubject_in_triplesTemplate2234);
            	    triplesSameSubject191=triplesSameSubject();

            	    state._fsp--;

            	    stream_triplesSameSubject.add(triplesSameSubject191.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\Sparql.g:278:52: ( DOT )?
            int alt64=2;
            switch ( input.LA(1) ) {
                case DOT:
                    {
                    alt64=1;
                    }
                    break;
            }

            switch (alt64) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:278:52: DOT
                    {
                    DOT192=(Token)match(input,DOT,FOLLOW_DOT_in_triplesTemplate2238);  
                    stream_DOT.add(DOT192);


                    }
                    break;

            }


            // AST REWRITE
            // elements: triplesSameSubject
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 278:57: -> ^( TRIPLES_TEMPLATE ( triplesSameSubject )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:278:60: ^( TRIPLES_TEMPLATE ( triplesSameSubject )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TRIPLES_TEMPLATE, "TRIPLES_TEMPLATE")
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:278:79: ( triplesSameSubject )*
                while ( stream_triplesSameSubject.hasNext() ) {
                    adaptor.addChild(root_1, stream_triplesSameSubject.nextTree());

                }
                stream_triplesSameSubject.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triplesTemplate"


    public static class groupGraphPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupGraphPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:281:1: groupGraphPattern : ( OPEN_CURLY_BRACE subSelect CLOSE_CURLY_BRACE -> ^( GROUP_GRAPH_PATTERN subSelect ) | OPEN_CURLY_BRACE groupGraphPatternSub CLOSE_CURLY_BRACE -> ^( GROUP_GRAPH_PATTERN groupGraphPatternSub ) | OPEN_CURLY_BRACE CLOSE_CURLY_BRACE -> ^( GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN ) );
    public final SparqlParser.groupGraphPattern_return groupGraphPattern() throws RecognitionException {
        SparqlParser.groupGraphPattern_return retval = new SparqlParser.groupGraphPattern_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_CURLY_BRACE193=null;
        Token CLOSE_CURLY_BRACE195=null;
        Token OPEN_CURLY_BRACE196=null;
        Token CLOSE_CURLY_BRACE198=null;
        Token OPEN_CURLY_BRACE199=null;
        Token CLOSE_CURLY_BRACE200=null;
        SparqlParser.subSelect_return subSelect194 =null;

        SparqlParser.groupGraphPatternSub_return groupGraphPatternSub197 =null;


        Object OPEN_CURLY_BRACE193_tree=null;
        Object CLOSE_CURLY_BRACE195_tree=null;
        Object OPEN_CURLY_BRACE196_tree=null;
        Object CLOSE_CURLY_BRACE198_tree=null;
        Object OPEN_CURLY_BRACE199_tree=null;
        Object CLOSE_CURLY_BRACE200_tree=null;
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_groupGraphPatternSub=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPatternSub");
        RewriteRuleSubtreeStream stream_subSelect=new RewriteRuleSubtreeStream(adaptor,"rule subSelect");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:282:5: ( OPEN_CURLY_BRACE subSelect CLOSE_CURLY_BRACE -> ^( GROUP_GRAPH_PATTERN subSelect ) | OPEN_CURLY_BRACE groupGraphPatternSub CLOSE_CURLY_BRACE -> ^( GROUP_GRAPH_PATTERN groupGraphPatternSub ) | OPEN_CURLY_BRACE CLOSE_CURLY_BRACE -> ^( GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case OPEN_CURLY_BRACE:
                {
                switch ( input.LA(2) ) {
                case CLOSE_CURLY_BRACE:
                    {
                    alt65=3;
                    }
                    break;
                case SELECT:
                    {
                    alt65=1;
                    }
                    break;
                case BIND:
                case BLANK_NODE_LABEL:
                case DECIMAL:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case FALSE:
                case FILTER:
                case GRAPH:
                case INTEGER:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI_REF:
                case MINUS_KEYWORD:
                case OPEN_BRACE:
                case OPEN_CURLY_BRACE:
                case OPEN_SQUARE_BRACKET:
                case OPTIONAL:
                case PNAME_LN:
                case PNAME_NS:
                case SERVICE:
                case STRING_LITERAL1:
                case STRING_LITERAL2:
                case STRING_LITERAL_LONG1:
                case STRING_LITERAL_LONG2:
                case TRUE:
                case VAR1:
                case VAR2:
                    {
                    alt65=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }

            switch (alt65) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:282:7: OPEN_CURLY_BRACE subSelect CLOSE_CURLY_BRACE
                    {
                    OPEN_CURLY_BRACE193=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_groupGraphPattern2270);  
                    stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE193);


                    pushFollow(FOLLOW_subSelect_in_groupGraphPattern2272);
                    subSelect194=subSelect();

                    state._fsp--;

                    stream_subSelect.add(subSelect194.getTree());

                    CLOSE_CURLY_BRACE195=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_groupGraphPattern2274);  
                    stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE195);


                    // AST REWRITE
                    // elements: subSelect
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 282:52: -> ^( GROUP_GRAPH_PATTERN subSelect )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:282:55: ^( GROUP_GRAPH_PATTERN subSelect )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(GROUP_GRAPH_PATTERN, "GROUP_GRAPH_PATTERN")
                        , root_1);

                        adaptor.addChild(root_1, stream_subSelect.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:283:7: OPEN_CURLY_BRACE groupGraphPatternSub CLOSE_CURLY_BRACE
                    {
                    OPEN_CURLY_BRACE196=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_groupGraphPattern2290);  
                    stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE196);


                    pushFollow(FOLLOW_groupGraphPatternSub_in_groupGraphPattern2292);
                    groupGraphPatternSub197=groupGraphPatternSub();

                    state._fsp--;

                    stream_groupGraphPatternSub.add(groupGraphPatternSub197.getTree());

                    CLOSE_CURLY_BRACE198=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_groupGraphPattern2294);  
                    stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE198);


                    // AST REWRITE
                    // elements: groupGraphPatternSub
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 283:63: -> ^( GROUP_GRAPH_PATTERN groupGraphPatternSub )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:283:66: ^( GROUP_GRAPH_PATTERN groupGraphPatternSub )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(GROUP_GRAPH_PATTERN, "GROUP_GRAPH_PATTERN")
                        , root_1);

                        adaptor.addChild(root_1, stream_groupGraphPatternSub.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:284:7: OPEN_CURLY_BRACE CLOSE_CURLY_BRACE
                    {
                    OPEN_CURLY_BRACE199=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_groupGraphPattern2310);  
                    stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE199);


                    CLOSE_CURLY_BRACE200=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_groupGraphPattern2312);  
                    stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE200);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 284:42: -> ^( GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:284:45: ^( GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(GROUP_GRAPH_PATTERN, "GROUP_GRAPH_PATTERN")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(GROUP_GRAPH_PATTERN, "GROUP_GRAPH_PATTERN")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupGraphPattern"


    public static class groupGraphPatternSub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupGraphPatternSub"
    // com\\googlecode\\sparkleg\\Sparql.g:287:1: groupGraphPatternSub : ( triplesBlock ( groupGraphPatternSubDetail )* -> triplesBlock ( groupGraphPatternSubDetail )* | ( groupGraphPatternSubDetail )+ -> ( groupGraphPatternSubDetail )+ );
    public final SparqlParser.groupGraphPatternSub_return groupGraphPatternSub() throws RecognitionException {
        SparqlParser.groupGraphPatternSub_return retval = new SparqlParser.groupGraphPatternSub_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.triplesBlock_return triplesBlock201 =null;

        SparqlParser.groupGraphPatternSubDetail_return groupGraphPatternSubDetail202 =null;

        SparqlParser.groupGraphPatternSubDetail_return groupGraphPatternSubDetail203 =null;


        RewriteRuleSubtreeStream stream_triplesBlock=new RewriteRuleSubtreeStream(adaptor,"rule triplesBlock");
        RewriteRuleSubtreeStream stream_groupGraphPatternSubDetail=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPatternSubDetail");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:288:5: ( triplesBlock ( groupGraphPatternSubDetail )* -> triplesBlock ( groupGraphPatternSubDetail )* | ( groupGraphPatternSubDetail )+ -> ( groupGraphPatternSubDetail )+ )
            int alt68=2;
            switch ( input.LA(1) ) {
            case BLANK_NODE_LABEL:
            case DECIMAL:
            case DECIMAL_NEGATIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE:
            case DOUBLE_NEGATIVE:
            case DOUBLE_POSITIVE:
            case FALSE:
            case INTEGER:
            case INTEGER_NEGATIVE:
            case INTEGER_POSITIVE:
            case IRI_REF:
            case OPEN_BRACE:
            case OPEN_SQUARE_BRACKET:
            case PNAME_LN:
            case PNAME_NS:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
            case TRUE:
            case VAR1:
            case VAR2:
                {
                alt68=1;
                }
                break;
            case BIND:
            case FILTER:
            case GRAPH:
            case MINUS_KEYWORD:
            case OPEN_CURLY_BRACE:
            case OPTIONAL:
            case SERVICE:
                {
                alt68=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }

            switch (alt68) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:288:7: triplesBlock ( groupGraphPatternSubDetail )*
                    {
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSub2341);
                    triplesBlock201=triplesBlock();

                    state._fsp--;

                    stream_triplesBlock.add(triplesBlock201.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:288:20: ( groupGraphPatternSubDetail )*
                    loop66:
                    do {
                        int alt66=2;
                        switch ( input.LA(1) ) {
                        case BIND:
                        case FILTER:
                        case GRAPH:
                        case MINUS_KEYWORD:
                        case OPEN_CURLY_BRACE:
                        case OPTIONAL:
                        case SERVICE:
                            {
                            alt66=1;
                            }
                            break;

                        }

                        switch (alt66) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:288:20: groupGraphPatternSubDetail
                    	    {
                    	    pushFollow(FOLLOW_groupGraphPatternSubDetail_in_groupGraphPatternSub2343);
                    	    groupGraphPatternSubDetail202=groupGraphPatternSubDetail();

                    	    state._fsp--;

                    	    stream_groupGraphPatternSubDetail.add(groupGraphPatternSubDetail202.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: groupGraphPatternSubDetail, triplesBlock
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 288:48: -> triplesBlock ( groupGraphPatternSubDetail )*
                    {
                        adaptor.addChild(root_0, stream_triplesBlock.nextTree());

                        // com\\googlecode\\sparkleg\\Sparql.g:288:64: ( groupGraphPatternSubDetail )*
                        while ( stream_groupGraphPatternSubDetail.hasNext() ) {
                            adaptor.addChild(root_0, stream_groupGraphPatternSubDetail.nextTree());

                        }
                        stream_groupGraphPatternSubDetail.reset();

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:289:7: ( groupGraphPatternSubDetail )+
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:289:7: ( groupGraphPatternSubDetail )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        switch ( input.LA(1) ) {
                        case BIND:
                        case FILTER:
                        case GRAPH:
                        case MINUS_KEYWORD:
                        case OPEN_CURLY_BRACE:
                        case OPTIONAL:
                        case SERVICE:
                            {
                            alt67=1;
                            }
                            break;

                        }

                        switch (alt67) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:289:7: groupGraphPatternSubDetail
                    	    {
                    	    pushFollow(FOLLOW_groupGraphPatternSubDetail_in_groupGraphPatternSub2359);
                    	    groupGraphPatternSubDetail203=groupGraphPatternSubDetail();

                    	    state._fsp--;

                    	    stream_groupGraphPatternSubDetail.add(groupGraphPatternSubDetail203.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);


                    // AST REWRITE
                    // elements: groupGraphPatternSubDetail
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 289:35: -> ( groupGraphPatternSubDetail )+
                    {
                        if ( !(stream_groupGraphPatternSubDetail.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_groupGraphPatternSubDetail.hasNext() ) {
                            adaptor.addChild(root_0, stream_groupGraphPatternSubDetail.nextTree());

                        }
                        stream_groupGraphPatternSubDetail.reset();

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupGraphPatternSub"


    public static class groupGraphPatternSubDetail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupGraphPatternSubDetail"
    // com\\googlecode\\sparkleg\\Sparql.g:292:1: groupGraphPatternSubDetail : graphPatternNotTriples ( DOT )? ( triplesBlock )? -> graphPatternNotTriples ( triplesBlock )? ;
    public final SparqlParser.groupGraphPatternSubDetail_return groupGraphPatternSubDetail() throws RecognitionException {
        SparqlParser.groupGraphPatternSubDetail_return retval = new SparqlParser.groupGraphPatternSubDetail_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT205=null;
        SparqlParser.graphPatternNotTriples_return graphPatternNotTriples204 =null;

        SparqlParser.triplesBlock_return triplesBlock206 =null;


        Object DOT205_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_triplesBlock=new RewriteRuleSubtreeStream(adaptor,"rule triplesBlock");
        RewriteRuleSubtreeStream stream_graphPatternNotTriples=new RewriteRuleSubtreeStream(adaptor,"rule graphPatternNotTriples");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:293:5: ( graphPatternNotTriples ( DOT )? ( triplesBlock )? -> graphPatternNotTriples ( triplesBlock )? )
            // com\\googlecode\\sparkleg\\Sparql.g:293:7: graphPatternNotTriples ( DOT )? ( triplesBlock )?
            {
            pushFollow(FOLLOW_graphPatternNotTriples_in_groupGraphPatternSubDetail2382);
            graphPatternNotTriples204=graphPatternNotTriples();

            state._fsp--;

            stream_graphPatternNotTriples.add(graphPatternNotTriples204.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:293:30: ( DOT )?
            int alt69=2;
            switch ( input.LA(1) ) {
                case DOT:
                    {
                    alt69=1;
                    }
                    break;
            }

            switch (alt69) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:293:30: DOT
                    {
                    DOT205=(Token)match(input,DOT,FOLLOW_DOT_in_groupGraphPatternSubDetail2384);  
                    stream_DOT.add(DOT205);


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:293:35: ( triplesBlock )?
            int alt70=2;
            switch ( input.LA(1) ) {
                case BLANK_NODE_LABEL:
                case DECIMAL:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case FALSE:
                case INTEGER:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI_REF:
                case OPEN_BRACE:
                case OPEN_SQUARE_BRACKET:
                case PNAME_LN:
                case PNAME_NS:
                case STRING_LITERAL1:
                case STRING_LITERAL2:
                case STRING_LITERAL_LONG1:
                case STRING_LITERAL_LONG2:
                case TRUE:
                case VAR1:
                case VAR2:
                    {
                    alt70=1;
                    }
                    break;
            }

            switch (alt70) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:293:35: triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSubDetail2387);
                    triplesBlock206=triplesBlock();

                    state._fsp--;

                    stream_triplesBlock.add(triplesBlock206.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: graphPatternNotTriples, triplesBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 293:49: -> graphPatternNotTriples ( triplesBlock )?
            {
                adaptor.addChild(root_0, stream_graphPatternNotTriples.nextTree());

                // com\\googlecode\\sparkleg\\Sparql.g:293:75: ( triplesBlock )?
                if ( stream_triplesBlock.hasNext() ) {
                    adaptor.addChild(root_0, stream_triplesBlock.nextTree());

                }
                stream_triplesBlock.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupGraphPatternSubDetail"


    public static class triplesBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triplesBlock"
    // com\\googlecode\\sparkleg\\Sparql.g:296:1: triplesBlock : triplesSameSubjectPath ( DOT triplesSameSubjectPath )* ( DOT )? -> ( triplesSameSubjectPath )+ ;
    public final SparqlParser.triplesBlock_return triplesBlock() throws RecognitionException {
        SparqlParser.triplesBlock_return retval = new SparqlParser.triplesBlock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT208=null;
        Token DOT210=null;
        SparqlParser.triplesSameSubjectPath_return triplesSameSubjectPath207 =null;

        SparqlParser.triplesSameSubjectPath_return triplesSameSubjectPath209 =null;


        Object DOT208_tree=null;
        Object DOT210_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_triplesSameSubjectPath=new RewriteRuleSubtreeStream(adaptor,"rule triplesSameSubjectPath");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:297:5: ( triplesSameSubjectPath ( DOT triplesSameSubjectPath )* ( DOT )? -> ( triplesSameSubjectPath )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:297:7: triplesSameSubjectPath ( DOT triplesSameSubjectPath )* ( DOT )?
            {
            pushFollow(FOLLOW_triplesSameSubjectPath_in_triplesBlock2412);
            triplesSameSubjectPath207=triplesSameSubjectPath();

            state._fsp--;

            stream_triplesSameSubjectPath.add(triplesSameSubjectPath207.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:297:30: ( DOT triplesSameSubjectPath )*
            loop71:
            do {
                int alt71=2;
                switch ( input.LA(1) ) {
                case DOT:
                    {
                    switch ( input.LA(2) ) {
                    case BLANK_NODE_LABEL:
                    case DECIMAL:
                    case DECIMAL_NEGATIVE:
                    case DECIMAL_POSITIVE:
                    case DOUBLE:
                    case DOUBLE_NEGATIVE:
                    case DOUBLE_POSITIVE:
                    case FALSE:
                    case INTEGER:
                    case INTEGER_NEGATIVE:
                    case INTEGER_POSITIVE:
                    case IRI_REF:
                    case OPEN_BRACE:
                    case OPEN_SQUARE_BRACKET:
                    case PNAME_LN:
                    case PNAME_NS:
                    case STRING_LITERAL1:
                    case STRING_LITERAL2:
                    case STRING_LITERAL_LONG1:
                    case STRING_LITERAL_LONG2:
                    case TRUE:
                    case VAR1:
                    case VAR2:
                        {
                        alt71=1;
                        }
                        break;

                    }

                    }
                    break;

                }

                switch (alt71) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:297:31: DOT triplesSameSubjectPath
            	    {
            	    DOT208=(Token)match(input,DOT,FOLLOW_DOT_in_triplesBlock2415);  
            	    stream_DOT.add(DOT208);


            	    pushFollow(FOLLOW_triplesSameSubjectPath_in_triplesBlock2417);
            	    triplesSameSubjectPath209=triplesSameSubjectPath();

            	    state._fsp--;

            	    stream_triplesSameSubjectPath.add(triplesSameSubjectPath209.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\Sparql.g:297:60: ( DOT )?
            int alt72=2;
            switch ( input.LA(1) ) {
                case DOT:
                    {
                    alt72=1;
                    }
                    break;
            }

            switch (alt72) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:297:60: DOT
                    {
                    DOT210=(Token)match(input,DOT,FOLLOW_DOT_in_triplesBlock2421);  
                    stream_DOT.add(DOT210);


                    }
                    break;

            }


            // AST REWRITE
            // elements: triplesSameSubjectPath
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 297:65: -> ( triplesSameSubjectPath )+
            {
                if ( !(stream_triplesSameSubjectPath.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_triplesSameSubjectPath.hasNext() ) {
                    adaptor.addChild(root_0, stream_triplesSameSubjectPath.nextTree());

                }
                stream_triplesSameSubjectPath.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triplesBlock"


    public static class graphPatternNotTriples_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphPatternNotTriples"
    // com\\googlecode\\sparkleg\\Sparql.g:300:1: graphPatternNotTriples : ( groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter | bind );
    public final SparqlParser.graphPatternNotTriples_return graphPatternNotTriples() throws RecognitionException {
        SparqlParser.graphPatternNotTriples_return retval = new SparqlParser.graphPatternNotTriples_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.groupOrUnionGraphPattern_return groupOrUnionGraphPattern211 =null;

        SparqlParser.optionalGraphPattern_return optionalGraphPattern212 =null;

        SparqlParser.minusGraphPattern_return minusGraphPattern213 =null;

        SparqlParser.graphGraphPattern_return graphGraphPattern214 =null;

        SparqlParser.serviceGraphPattern_return serviceGraphPattern215 =null;

        SparqlParser.filter_return filter216 =null;

        SparqlParser.bind_return bind217 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:301:5: ( groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter | bind )
            int alt73=7;
            switch ( input.LA(1) ) {
            case OPEN_CURLY_BRACE:
                {
                alt73=1;
                }
                break;
            case OPTIONAL:
                {
                alt73=2;
                }
                break;
            case MINUS_KEYWORD:
                {
                alt73=3;
                }
                break;
            case GRAPH:
                {
                alt73=4;
                }
                break;
            case SERVICE:
                {
                alt73=5;
                }
                break;
            case FILTER:
                {
                alt73=6;
                }
                break;
            case BIND:
                {
                alt73=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }

            switch (alt73) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:301:7: groupOrUnionGraphPattern
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples2444);
                    groupOrUnionGraphPattern211=groupOrUnionGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, groupOrUnionGraphPattern211.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:301:34: optionalGraphPattern
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_optionalGraphPattern_in_graphPatternNotTriples2448);
                    optionalGraphPattern212=optionalGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, optionalGraphPattern212.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:301:57: minusGraphPattern
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_minusGraphPattern_in_graphPatternNotTriples2452);
                    minusGraphPattern213=minusGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, minusGraphPattern213.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:301:77: graphGraphPattern
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_graphGraphPattern_in_graphPatternNotTriples2456);
                    graphGraphPattern214=graphGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, graphGraphPattern214.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:301:97: serviceGraphPattern
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_serviceGraphPattern_in_graphPatternNotTriples2460);
                    serviceGraphPattern215=serviceGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, serviceGraphPattern215.getTree());

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:301:119: filter
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_filter_in_graphPatternNotTriples2464);
                    filter216=filter();

                    state._fsp--;

                    adaptor.addChild(root_0, filter216.getTree());

                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\Sparql.g:301:128: bind
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bind_in_graphPatternNotTriples2468);
                    bind217=bind();

                    state._fsp--;

                    adaptor.addChild(root_0, bind217.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphPatternNotTriples"


    public static class optionalGraphPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optionalGraphPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:304:1: optionalGraphPattern : OPTIONAL groupGraphPattern -> ^( OPTIONAL groupGraphPattern ) ;
    public final SparqlParser.optionalGraphPattern_return optionalGraphPattern() throws RecognitionException {
        SparqlParser.optionalGraphPattern_return retval = new SparqlParser.optionalGraphPattern_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPTIONAL218=null;
        SparqlParser.groupGraphPattern_return groupGraphPattern219 =null;


        Object OPTIONAL218_tree=null;
        RewriteRuleTokenStream stream_OPTIONAL=new RewriteRuleTokenStream(adaptor,"token OPTIONAL");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:305:5: ( OPTIONAL groupGraphPattern -> ^( OPTIONAL groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:305:7: OPTIONAL groupGraphPattern
            {
            OPTIONAL218=(Token)match(input,OPTIONAL,FOLLOW_OPTIONAL_in_optionalGraphPattern2485);  
            stream_OPTIONAL.add(OPTIONAL218);


            pushFollow(FOLLOW_groupGraphPattern_in_optionalGraphPattern2487);
            groupGraphPattern219=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern219.getTree());

            // AST REWRITE
            // elements: OPTIONAL, groupGraphPattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 305:34: -> ^( OPTIONAL groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:305:37: ^( OPTIONAL groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_OPTIONAL.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optionalGraphPattern"


    public static class graphGraphPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphGraphPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:308:1: graphGraphPattern : GRAPH varOrIRIref groupGraphPattern -> ^( GRAPH varOrIRIref groupGraphPattern ) ;
    public final SparqlParser.graphGraphPattern_return graphGraphPattern() throws RecognitionException {
        SparqlParser.graphGraphPattern_return retval = new SparqlParser.graphGraphPattern_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GRAPH220=null;
        SparqlParser.varOrIRIref_return varOrIRIref221 =null;

        SparqlParser.groupGraphPattern_return groupGraphPattern222 =null;


        Object GRAPH220_tree=null;
        RewriteRuleTokenStream stream_GRAPH=new RewriteRuleTokenStream(adaptor,"token GRAPH");
        RewriteRuleSubtreeStream stream_varOrIRIref=new RewriteRuleSubtreeStream(adaptor,"rule varOrIRIref");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:309:5: ( GRAPH varOrIRIref groupGraphPattern -> ^( GRAPH varOrIRIref groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:309:7: GRAPH varOrIRIref groupGraphPattern
            {
            GRAPH220=(Token)match(input,GRAPH,FOLLOW_GRAPH_in_graphGraphPattern2512);  
            stream_GRAPH.add(GRAPH220);


            pushFollow(FOLLOW_varOrIRIref_in_graphGraphPattern2514);
            varOrIRIref221=varOrIRIref();

            state._fsp--;

            stream_varOrIRIref.add(varOrIRIref221.getTree());

            pushFollow(FOLLOW_groupGraphPattern_in_graphGraphPattern2516);
            groupGraphPattern222=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern222.getTree());

            // AST REWRITE
            // elements: GRAPH, groupGraphPattern, varOrIRIref
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 309:43: -> ^( GRAPH varOrIRIref groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:309:46: ^( GRAPH varOrIRIref groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_GRAPH.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_varOrIRIref.nextTree());

                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphGraphPattern"


    public static class serviceGraphPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "serviceGraphPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:312:1: serviceGraphPattern : SERVICE ( SILENT )? varOrIRIref groupGraphPattern -> ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern ) ;
    public final SparqlParser.serviceGraphPattern_return serviceGraphPattern() throws RecognitionException {
        SparqlParser.serviceGraphPattern_return retval = new SparqlParser.serviceGraphPattern_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SERVICE223=null;
        Token SILENT224=null;
        SparqlParser.varOrIRIref_return varOrIRIref225 =null;

        SparqlParser.groupGraphPattern_return groupGraphPattern226 =null;


        Object SERVICE223_tree=null;
        Object SILENT224_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_SERVICE=new RewriteRuleTokenStream(adaptor,"token SERVICE");
        RewriteRuleSubtreeStream stream_varOrIRIref=new RewriteRuleSubtreeStream(adaptor,"rule varOrIRIref");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:313:5: ( SERVICE ( SILENT )? varOrIRIref groupGraphPattern -> ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:313:7: SERVICE ( SILENT )? varOrIRIref groupGraphPattern
            {
            SERVICE223=(Token)match(input,SERVICE,FOLLOW_SERVICE_in_serviceGraphPattern2543);  
            stream_SERVICE.add(SERVICE223);


            // com\\googlecode\\sparkleg\\Sparql.g:313:15: ( SILENT )?
            int alt74=2;
            switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt74=1;
                    }
                    break;
            }

            switch (alt74) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:313:15: SILENT
                    {
                    SILENT224=(Token)match(input,SILENT,FOLLOW_SILENT_in_serviceGraphPattern2545);  
                    stream_SILENT.add(SILENT224);


                    }
                    break;

            }


            pushFollow(FOLLOW_varOrIRIref_in_serviceGraphPattern2548);
            varOrIRIref225=varOrIRIref();

            state._fsp--;

            stream_varOrIRIref.add(varOrIRIref225.getTree());

            pushFollow(FOLLOW_groupGraphPattern_in_serviceGraphPattern2550);
            groupGraphPattern226=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern226.getTree());

            // AST REWRITE
            // elements: groupGraphPattern, SILENT, SERVICE, varOrIRIref
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 313:53: -> ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:313:56: ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_SERVICE.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:313:66: ( SILENT )?
                if ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SILENT.nextNode()
                    );

                }
                stream_SILENT.reset();

                adaptor.addChild(root_1, stream_varOrIRIref.nextTree());

                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "serviceGraphPattern"


    public static class bind_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bind"
    // com\\googlecode\\sparkleg\\Sparql.g:316:1: bind : BIND OPEN_BRACE expression AS var CLOSE_BRACE -> ^( BIND expression ^( AS var ) ) ;
    public final SparqlParser.bind_return bind() throws RecognitionException {
        SparqlParser.bind_return retval = new SparqlParser.bind_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BIND227=null;
        Token OPEN_BRACE228=null;
        Token AS230=null;
        Token CLOSE_BRACE232=null;
        SparqlParser.expression_return expression229 =null;

        SparqlParser.var_return var231 =null;


        Object BIND227_tree=null;
        Object OPEN_BRACE228_tree=null;
        Object AS230_tree=null;
        Object CLOSE_BRACE232_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_BIND=new RewriteRuleTokenStream(adaptor,"token BIND");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:317:5: ( BIND OPEN_BRACE expression AS var CLOSE_BRACE -> ^( BIND expression ^( AS var ) ) )
            // com\\googlecode\\sparkleg\\Sparql.g:317:7: BIND OPEN_BRACE expression AS var CLOSE_BRACE
            {
            BIND227=(Token)match(input,BIND,FOLLOW_BIND_in_bind2584);  
            stream_BIND.add(BIND227);


            OPEN_BRACE228=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_bind2586);  
            stream_OPEN_BRACE.add(OPEN_BRACE228);


            pushFollow(FOLLOW_expression_in_bind2588);
            expression229=expression();

            state._fsp--;

            stream_expression.add(expression229.getTree());

            AS230=(Token)match(input,AS,FOLLOW_AS_in_bind2590);  
            stream_AS.add(AS230);


            pushFollow(FOLLOW_var_in_bind2592);
            var231=var();

            state._fsp--;

            stream_var.add(var231.getTree());

            CLOSE_BRACE232=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_bind2594);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE232);


            // AST REWRITE
            // elements: AS, var, BIND, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 317:53: -> ^( BIND expression ^( AS var ) )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:317:56: ^( BIND expression ^( AS var ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_BIND.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                // com\\googlecode\\sparkleg\\Sparql.g:317:74: ^( AS var )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_AS.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_var.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bind"


    public static class minusGraphPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "minusGraphPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:320:1: minusGraphPattern : MINUS_KEYWORD groupGraphPattern -> ^( MINUS_KEYWORD groupGraphPattern ) ;
    public final SparqlParser.minusGraphPattern_return minusGraphPattern() throws RecognitionException {
        SparqlParser.minusGraphPattern_return retval = new SparqlParser.minusGraphPattern_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MINUS_KEYWORD233=null;
        SparqlParser.groupGraphPattern_return groupGraphPattern234 =null;


        Object MINUS_KEYWORD233_tree=null;
        RewriteRuleTokenStream stream_MINUS_KEYWORD=new RewriteRuleTokenStream(adaptor,"token MINUS_KEYWORD");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:321:5: ( MINUS_KEYWORD groupGraphPattern -> ^( MINUS_KEYWORD groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:321:7: MINUS_KEYWORD groupGraphPattern
            {
            MINUS_KEYWORD233=(Token)match(input,MINUS_KEYWORD,FOLLOW_MINUS_KEYWORD_in_minusGraphPattern2631);  
            stream_MINUS_KEYWORD.add(MINUS_KEYWORD233);


            pushFollow(FOLLOW_groupGraphPattern_in_minusGraphPattern2633);
            groupGraphPattern234=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern234.getTree());

            // AST REWRITE
            // elements: groupGraphPattern, MINUS_KEYWORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 321:39: -> ^( MINUS_KEYWORD groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:321:42: ^( MINUS_KEYWORD groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_MINUS_KEYWORD.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "minusGraphPattern"


    public static class groupOrUnionGraphPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupOrUnionGraphPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:324:1: groupOrUnionGraphPattern : (g1= groupGraphPattern -> $g1) ( ( UNION g2= groupGraphPattern ) -> ^( UNION $groupOrUnionGraphPattern $g2) )* ;
    public final SparqlParser.groupOrUnionGraphPattern_return groupOrUnionGraphPattern() throws RecognitionException {
        SparqlParser.groupOrUnionGraphPattern_return retval = new SparqlParser.groupOrUnionGraphPattern_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token UNION235=null;
        SparqlParser.groupGraphPattern_return g1 =null;

        SparqlParser.groupGraphPattern_return g2 =null;


        Object UNION235_tree=null;
        RewriteRuleTokenStream stream_UNION=new RewriteRuleTokenStream(adaptor,"token UNION");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:325:5: ( (g1= groupGraphPattern -> $g1) ( ( UNION g2= groupGraphPattern ) -> ^( UNION $groupOrUnionGraphPattern $g2) )* )
            // com\\googlecode\\sparkleg\\Sparql.g:325:7: (g1= groupGraphPattern -> $g1) ( ( UNION g2= groupGraphPattern ) -> ^( UNION $groupOrUnionGraphPattern $g2) )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:325:7: (g1= groupGraphPattern -> $g1)
            // com\\googlecode\\sparkleg\\Sparql.g:325:8: g1= groupGraphPattern
            {
            pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern2661);
            g1=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(g1.getTree());

            // AST REWRITE
            // elements: g1
            // token labels: 
            // rule labels: retval, g1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_g1=new RewriteRuleSubtreeStream(adaptor,"rule g1",g1!=null?g1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 325:28: -> $g1
            {
                adaptor.addChild(root_0, stream_g1.nextTree());

            }


            retval.tree = root_0;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:325:35: ( ( UNION g2= groupGraphPattern ) -> ^( UNION $groupOrUnionGraphPattern $g2) )*
            loop75:
            do {
                int alt75=2;
                switch ( input.LA(1) ) {
                case UNION:
                    {
                    alt75=1;
                    }
                    break;

                }

                switch (alt75) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:325:36: ( UNION g2= groupGraphPattern )
            	    {
            	    // com\\googlecode\\sparkleg\\Sparql.g:325:36: ( UNION g2= groupGraphPattern )
            	    // com\\googlecode\\sparkleg\\Sparql.g:325:37: UNION g2= groupGraphPattern
            	    {
            	    UNION235=(Token)match(input,UNION,FOLLOW_UNION_in_groupOrUnionGraphPattern2669);  
            	    stream_UNION.add(UNION235);


            	    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern2673);
            	    g2=groupGraphPattern();

            	    state._fsp--;

            	    stream_groupGraphPattern.add(g2.getTree());

            	    }


            	    // AST REWRITE
            	    // elements: UNION, g2, groupOrUnionGraphPattern
            	    // token labels: 
            	    // rule labels: retval, g2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_g2=new RewriteRuleSubtreeStream(adaptor,"rule g2",g2!=null?g2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 325:65: -> ^( UNION $groupOrUnionGraphPattern $g2)
            	    {
            	        // com\\googlecode\\sparkleg\\Sparql.g:325:68: ^( UNION $groupOrUnionGraphPattern $g2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        stream_UNION.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_g2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupOrUnionGraphPattern"


    public static class filter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "filter"
    // com\\googlecode\\sparkleg\\Sparql.g:328:1: filter : FILTER constraint -> ^( FILTER constraint ) ;
    public final SparqlParser.filter_return filter() throws RecognitionException {
        SparqlParser.filter_return retval = new SparqlParser.filter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FILTER236=null;
        SparqlParser.constraint_return constraint237 =null;


        Object FILTER236_tree=null;
        RewriteRuleTokenStream stream_FILTER=new RewriteRuleTokenStream(adaptor,"token FILTER");
        RewriteRuleSubtreeStream stream_constraint=new RewriteRuleSubtreeStream(adaptor,"rule constraint");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:329:5: ( FILTER constraint -> ^( FILTER constraint ) )
            // com\\googlecode\\sparkleg\\Sparql.g:329:7: FILTER constraint
            {
            FILTER236=(Token)match(input,FILTER,FOLLOW_FILTER_in_filter2705);  
            stream_FILTER.add(FILTER236);


            pushFollow(FOLLOW_constraint_in_filter2707);
            constraint237=constraint();

            state._fsp--;

            stream_constraint.add(constraint237.getTree());

            // AST REWRITE
            // elements: constraint, FILTER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 329:25: -> ^( FILTER constraint )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:329:28: ^( FILTER constraint )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_FILTER.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_constraint.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "filter"


    public static class constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constraint"
    // com\\googlecode\\sparkleg\\Sparql.g:332:1: constraint : ( brackettedExpression | builtInCall | functionCall );
    public final SparqlParser.constraint_return constraint() throws RecognitionException {
        SparqlParser.constraint_return retval = new SparqlParser.constraint_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.brackettedExpression_return brackettedExpression238 =null;

        SparqlParser.builtInCall_return builtInCall239 =null;

        SparqlParser.functionCall_return functionCall240 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:333:5: ( brackettedExpression | builtInCall | functionCall )
            int alt76=3;
            switch ( input.LA(1) ) {
            case OPEN_BRACE:
                {
                alt76=1;
                }
                break;
            case ABS:
            case BNODE:
            case BOUND:
            case CEIL:
            case COALESCE:
            case CONCAT:
            case CONTAINS:
            case DATATYPE:
            case DAY:
            case ENCODE_FOR_URI:
            case EXISTS:
            case FLOOR:
            case HOURS:
            case IF:
            case IRI:
            case ISBLANK:
            case ISIRI:
            case ISLITERAL:
            case ISNUMERIC:
            case ISURI:
            case LANG:
            case LANGMATCHES:
            case LCASE:
            case MD5:
            case MINUTES:
            case MONTH:
            case NOT:
            case NOW:
            case RAND:
            case REGEX:
            case REPLACE:
            case ROUND:
            case SAMETERM:
            case SECONDS:
            case SHA1:
            case SHA224:
            case SHA256:
            case SHA384:
            case SHA512:
            case STR:
            case STRAFTER:
            case STRBEFORE:
            case STRDT:
            case STRENDS:
            case STRLANG:
            case STRLEN:
            case STRSTARTS:
            case SUBSTR:
            case TIMEZONE:
            case TZ:
            case UCASE:
            case URI:
            case YEAR:
                {
                alt76=2;
                }
                break;
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }

            switch (alt76) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:333:7: brackettedExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_brackettedExpression_in_constraint2732);
                    brackettedExpression238=brackettedExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, brackettedExpression238.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:334:7: builtInCall
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_builtInCall_in_constraint2740);
                    builtInCall239=builtInCall();

                    state._fsp--;

                    adaptor.addChild(root_0, builtInCall239.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:335:7: functionCall
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_functionCall_in_constraint2748);
                    functionCall240=functionCall();

                    state._fsp--;

                    adaptor.addChild(root_0, functionCall240.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraint"


    public static class functionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCall"
    // com\\googlecode\\sparkleg\\Sparql.g:338:1: functionCall : iriRef argList -> ^( FUNCTION iriRef ^( ARG_LIST argList ) ) ;
    public final SparqlParser.functionCall_return functionCall() throws RecognitionException {
        SparqlParser.functionCall_return retval = new SparqlParser.functionCall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.iriRef_return iriRef241 =null;

        SparqlParser.argList_return argList242 =null;


        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:339:5: ( iriRef argList -> ^( FUNCTION iriRef ^( ARG_LIST argList ) ) )
            // com\\googlecode\\sparkleg\\Sparql.g:339:7: iriRef argList
            {
            pushFollow(FOLLOW_iriRef_in_functionCall2765);
            iriRef241=iriRef();

            state._fsp--;

            stream_iriRef.add(iriRef241.getTree());

            pushFollow(FOLLOW_argList_in_functionCall2767);
            argList242=argList();

            state._fsp--;

            stream_argList.add(argList242.getTree());

            // AST REWRITE
            // elements: argList, iriRef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 339:22: -> ^( FUNCTION iriRef ^( ARG_LIST argList ) )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:339:25: ^( FUNCTION iriRef ^( ARG_LIST argList ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION, "FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_iriRef.nextTree());

                // com\\googlecode\\sparkleg\\Sparql.g:339:43: ^( ARG_LIST argList )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARG_LIST, "ARG_LIST")
                , root_2);

                adaptor.addChild(root_2, stream_argList.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionCall"


    public static class argList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argList"
    // com\\googlecode\\sparkleg\\Sparql.g:342:1: argList : ( nil -> nil | OPEN_BRACE ( DISTINCT )? expression ( COMMA expression )* CLOSE_BRACE -> ( DISTINCT )? ( expression )* );
    public final SparqlParser.argList_return argList() throws RecognitionException {
        SparqlParser.argList_return retval = new SparqlParser.argList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_BRACE244=null;
        Token DISTINCT245=null;
        Token COMMA247=null;
        Token CLOSE_BRACE249=null;
        SparqlParser.nil_return nil243 =null;

        SparqlParser.expression_return expression246 =null;

        SparqlParser.expression_return expression248 =null;


        Object OPEN_BRACE244_tree=null;
        Object DISTINCT245_tree=null;
        Object COMMA247_tree=null;
        Object CLOSE_BRACE249_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_nil=new RewriteRuleSubtreeStream(adaptor,"rule nil");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:343:5: ( nil -> nil | OPEN_BRACE ( DISTINCT )? expression ( COMMA expression )* CLOSE_BRACE -> ( DISTINCT )? ( expression )* )
            int alt79=2;
            switch ( input.LA(1) ) {
            case OPEN_BRACE:
                {
                switch ( input.LA(2) ) {
                case CLOSE_BRACE:
                    {
                    alt79=1;
                    }
                    break;
                case ABS:
                case AVG:
                case BNODE:
                case BOUND:
                case CEIL:
                case COALESCE:
                case CONCAT:
                case CONTAINS:
                case COUNT:
                case DATATYPE:
                case DAY:
                case DECIMAL:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DISTINCT:
                case DOUBLE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case ENCODE_FOR_URI:
                case EXISTS:
                case FALSE:
                case FLOOR:
                case GROUP_CONCAT:
                case HOURS:
                case IF:
                case INTEGER:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI:
                case IRI_REF:
                case ISBLANK:
                case ISIRI:
                case ISLITERAL:
                case ISNUMERIC:
                case ISURI:
                case LANG:
                case LANGMATCHES:
                case LCASE:
                case MAX:
                case MD5:
                case MIN:
                case MINUS:
                case MINUTES:
                case MONTH:
                case NEGATION:
                case NOT:
                case NOW:
                case OPEN_BRACE:
                case PLUS:
                case PNAME_LN:
                case PNAME_NS:
                case RAND:
                case REGEX:
                case REPLACE:
                case ROUND:
                case SAMETERM:
                case SAMPLE:
                case SECONDS:
                case SHA1:
                case SHA224:
                case SHA256:
                case SHA384:
                case SHA512:
                case STR:
                case STRAFTER:
                case STRBEFORE:
                case STRDT:
                case STRENDS:
                case STRING_LITERAL1:
                case STRING_LITERAL2:
                case STRING_LITERAL_LONG1:
                case STRING_LITERAL_LONG2:
                case STRLANG:
                case STRLEN:
                case STRSTARTS:
                case SUBSTR:
                case SUM:
                case TIMEZONE:
                case TRUE:
                case TZ:
                case UCASE:
                case URI:
                case VAR1:
                case VAR2:
                case YEAR:
                    {
                    alt79=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }

            switch (alt79) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:343:7: nil
                    {
                    pushFollow(FOLLOW_nil_in_argList2798);
                    nil243=nil();

                    state._fsp--;

                    stream_nil.add(nil243.getTree());

                    // AST REWRITE
                    // elements: nil
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 343:11: -> nil
                    {
                        adaptor.addChild(root_0, stream_nil.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:344:7: OPEN_BRACE ( DISTINCT )? expression ( COMMA expression )* CLOSE_BRACE
                    {
                    OPEN_BRACE244=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_argList2810);  
                    stream_OPEN_BRACE.add(OPEN_BRACE244);


                    // com\\googlecode\\sparkleg\\Sparql.g:344:18: ( DISTINCT )?
                    int alt77=2;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt77=1;
                            }
                            break;
                    }

                    switch (alt77) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:344:18: DISTINCT
                            {
                            DISTINCT245=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_argList2812);  
                            stream_DISTINCT.add(DISTINCT245);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_argList2815);
                    expression246=expression();

                    state._fsp--;

                    stream_expression.add(expression246.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:344:39: ( COMMA expression )*
                    loop78:
                    do {
                        int alt78=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt78=1;
                            }
                            break;

                        }

                        switch (alt78) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:344:40: COMMA expression
                    	    {
                    	    COMMA247=(Token)match(input,COMMA,FOLLOW_COMMA_in_argList2818);  
                    	    stream_COMMA.add(COMMA247);


                    	    pushFollow(FOLLOW_expression_in_argList2820);
                    	    expression248=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression248.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    CLOSE_BRACE249=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_argList2824);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE249);


                    // AST REWRITE
                    // elements: DISTINCT, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 344:71: -> ( DISTINCT )? ( expression )*
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:344:74: ( DISTINCT )?
                        if ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_0, 
                            stream_DISTINCT.nextNode()
                            );

                        }
                        stream_DISTINCT.reset();

                        // com\\googlecode\\sparkleg\\Sparql.g:344:84: ( expression )*
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_0, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argList"


    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
    // com\\googlecode\\sparkleg\\Sparql.g:347:1: expressionList : ( nil | OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE ) -> ^( EXPRESSION_LIST ( nil )* ( expression )* ) ;
    public final SparqlParser.expressionList_return expressionList() throws RecognitionException {
        SparqlParser.expressionList_return retval = new SparqlParser.expressionList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_BRACE251=null;
        Token COMMA253=null;
        Token CLOSE_BRACE255=null;
        SparqlParser.nil_return nil250 =null;

        SparqlParser.expression_return expression252 =null;

        SparqlParser.expression_return expression254 =null;


        Object OPEN_BRACE251_tree=null;
        Object COMMA253_tree=null;
        Object CLOSE_BRACE255_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_nil=new RewriteRuleSubtreeStream(adaptor,"rule nil");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:348:5: ( ( nil | OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE ) -> ^( EXPRESSION_LIST ( nil )* ( expression )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:348:7: ( nil | OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE )
            {
            // com\\googlecode\\sparkleg\\Sparql.g:348:7: ( nil | OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE )
            int alt81=2;
            switch ( input.LA(1) ) {
            case OPEN_BRACE:
                {
                switch ( input.LA(2) ) {
                case CLOSE_BRACE:
                    {
                    alt81=1;
                    }
                    break;
                case ABS:
                case AVG:
                case BNODE:
                case BOUND:
                case CEIL:
                case COALESCE:
                case CONCAT:
                case CONTAINS:
                case COUNT:
                case DATATYPE:
                case DAY:
                case DECIMAL:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case ENCODE_FOR_URI:
                case EXISTS:
                case FALSE:
                case FLOOR:
                case GROUP_CONCAT:
                case HOURS:
                case IF:
                case INTEGER:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI:
                case IRI_REF:
                case ISBLANK:
                case ISIRI:
                case ISLITERAL:
                case ISNUMERIC:
                case ISURI:
                case LANG:
                case LANGMATCHES:
                case LCASE:
                case MAX:
                case MD5:
                case MIN:
                case MINUS:
                case MINUTES:
                case MONTH:
                case NEGATION:
                case NOT:
                case NOW:
                case OPEN_BRACE:
                case PLUS:
                case PNAME_LN:
                case PNAME_NS:
                case RAND:
                case REGEX:
                case REPLACE:
                case ROUND:
                case SAMETERM:
                case SAMPLE:
                case SECONDS:
                case SHA1:
                case SHA224:
                case SHA256:
                case SHA384:
                case SHA512:
                case STR:
                case STRAFTER:
                case STRBEFORE:
                case STRDT:
                case STRENDS:
                case STRING_LITERAL1:
                case STRING_LITERAL2:
                case STRING_LITERAL_LONG1:
                case STRING_LITERAL_LONG2:
                case STRLANG:
                case STRLEN:
                case STRSTARTS:
                case SUBSTR:
                case SUM:
                case TIMEZONE:
                case TRUE:
                case TZ:
                case UCASE:
                case URI:
                case VAR1:
                case VAR2:
                case YEAR:
                    {
                    alt81=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;

            }

            switch (alt81) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:348:8: nil
                    {
                    pushFollow(FOLLOW_nil_in_expressionList2850);
                    nil250=nil();

                    state._fsp--;

                    stream_nil.add(nil250.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:348:14: OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE
                    {
                    OPEN_BRACE251=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_expressionList2854);  
                    stream_OPEN_BRACE.add(OPEN_BRACE251);


                    pushFollow(FOLLOW_expression_in_expressionList2856);
                    expression252=expression();

                    state._fsp--;

                    stream_expression.add(expression252.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:348:36: ( COMMA expression )*
                    loop80:
                    do {
                        int alt80=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt80=1;
                            }
                            break;

                        }

                        switch (alt80) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:348:37: COMMA expression
                    	    {
                    	    COMMA253=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList2859);  
                    	    stream_COMMA.add(COMMA253);


                    	    pushFollow(FOLLOW_expression_in_expressionList2861);
                    	    expression254=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression254.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    CLOSE_BRACE255=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_expressionList2865);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE255);


                    }
                    break;

            }


            // AST REWRITE
            // elements: nil, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 348:69: -> ^( EXPRESSION_LIST ( nil )* ( expression )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:348:72: ^( EXPRESSION_LIST ( nil )* ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXPRESSION_LIST, "EXPRESSION_LIST")
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:348:90: ( nil )*
                while ( stream_nil.hasNext() ) {
                    adaptor.addChild(root_1, stream_nil.nextTree());

                }
                stream_nil.reset();

                // com\\googlecode\\sparkleg\\Sparql.g:348:95: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionList"


    public static class constructTemplate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructTemplate"
    // com\\googlecode\\sparkleg\\Sparql.g:351:1: constructTemplate : OPEN_CURLY_BRACE ( constructTriples )? CLOSE_CURLY_BRACE -> ^( CONSTRUCT_TRIPLES ( constructTriples )? ) ;
    public final SparqlParser.constructTemplate_return constructTemplate() throws RecognitionException {
        SparqlParser.constructTemplate_return retval = new SparqlParser.constructTemplate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_CURLY_BRACE256=null;
        Token CLOSE_CURLY_BRACE258=null;
        SparqlParser.constructTriples_return constructTriples257 =null;


        Object OPEN_CURLY_BRACE256_tree=null;
        Object CLOSE_CURLY_BRACE258_tree=null;
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_constructTriples=new RewriteRuleSubtreeStream(adaptor,"rule constructTriples");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:352:5: ( OPEN_CURLY_BRACE ( constructTriples )? CLOSE_CURLY_BRACE -> ^( CONSTRUCT_TRIPLES ( constructTriples )? ) )
            // com\\googlecode\\sparkleg\\Sparql.g:352:7: OPEN_CURLY_BRACE ( constructTriples )? CLOSE_CURLY_BRACE
            {
            OPEN_CURLY_BRACE256=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_constructTemplate2896);  
            stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE256);


            // com\\googlecode\\sparkleg\\Sparql.g:352:24: ( constructTriples )?
            int alt82=2;
            switch ( input.LA(1) ) {
                case BLANK_NODE_LABEL:
                case DECIMAL:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case FALSE:
                case INTEGER:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI_REF:
                case OPEN_BRACE:
                case OPEN_SQUARE_BRACKET:
                case PNAME_LN:
                case PNAME_NS:
                case STRING_LITERAL1:
                case STRING_LITERAL2:
                case STRING_LITERAL_LONG1:
                case STRING_LITERAL_LONG2:
                case TRUE:
                case VAR1:
                case VAR2:
                    {
                    alt82=1;
                    }
                    break;
            }

            switch (alt82) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:352:24: constructTriples
                    {
                    pushFollow(FOLLOW_constructTriples_in_constructTemplate2898);
                    constructTriples257=constructTriples();

                    state._fsp--;

                    stream_constructTriples.add(constructTriples257.getTree());

                    }
                    break;

            }


            CLOSE_CURLY_BRACE258=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_constructTemplate2901);  
            stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE258);


            // AST REWRITE
            // elements: constructTriples
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 352:60: -> ^( CONSTRUCT_TRIPLES ( constructTriples )? )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:352:63: ^( CONSTRUCT_TRIPLES ( constructTriples )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONSTRUCT_TRIPLES, "CONSTRUCT_TRIPLES")
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:352:83: ( constructTriples )?
                if ( stream_constructTriples.hasNext() ) {
                    adaptor.addChild(root_1, stream_constructTriples.nextTree());

                }
                stream_constructTriples.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructTemplate"


    public static class constructTriples_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructTriples"
    // com\\googlecode\\sparkleg\\Sparql.g:355:1: constructTriples : triplesSameSubject ( DOT triplesSameSubject )* ( DOT )? -> ( triplesSameSubject )+ ;
    public final SparqlParser.constructTriples_return constructTriples() throws RecognitionException {
        SparqlParser.constructTriples_return retval = new SparqlParser.constructTriples_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT260=null;
        Token DOT262=null;
        SparqlParser.triplesSameSubject_return triplesSameSubject259 =null;

        SparqlParser.triplesSameSubject_return triplesSameSubject261 =null;


        Object DOT260_tree=null;
        Object DOT262_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_triplesSameSubject=new RewriteRuleSubtreeStream(adaptor,"rule triplesSameSubject");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:356:5: ( triplesSameSubject ( DOT triplesSameSubject )* ( DOT )? -> ( triplesSameSubject )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:356:7: triplesSameSubject ( DOT triplesSameSubject )* ( DOT )?
            {
            pushFollow(FOLLOW_triplesSameSubject_in_constructTriples2927);
            triplesSameSubject259=triplesSameSubject();

            state._fsp--;

            stream_triplesSameSubject.add(triplesSameSubject259.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:356:26: ( DOT triplesSameSubject )*
            loop83:
            do {
                int alt83=2;
                switch ( input.LA(1) ) {
                case DOT:
                    {
                    switch ( input.LA(2) ) {
                    case BLANK_NODE_LABEL:
                    case DECIMAL:
                    case DECIMAL_NEGATIVE:
                    case DECIMAL_POSITIVE:
                    case DOUBLE:
                    case DOUBLE_NEGATIVE:
                    case DOUBLE_POSITIVE:
                    case FALSE:
                    case INTEGER:
                    case INTEGER_NEGATIVE:
                    case INTEGER_POSITIVE:
                    case IRI_REF:
                    case OPEN_BRACE:
                    case OPEN_SQUARE_BRACKET:
                    case PNAME_LN:
                    case PNAME_NS:
                    case STRING_LITERAL1:
                    case STRING_LITERAL2:
                    case STRING_LITERAL_LONG1:
                    case STRING_LITERAL_LONG2:
                    case TRUE:
                    case VAR1:
                    case VAR2:
                        {
                        alt83=1;
                        }
                        break;

                    }

                    }
                    break;

                }

                switch (alt83) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:356:27: DOT triplesSameSubject
            	    {
            	    DOT260=(Token)match(input,DOT,FOLLOW_DOT_in_constructTriples2930);  
            	    stream_DOT.add(DOT260);


            	    pushFollow(FOLLOW_triplesSameSubject_in_constructTriples2932);
            	    triplesSameSubject261=triplesSameSubject();

            	    state._fsp--;

            	    stream_triplesSameSubject.add(triplesSameSubject261.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\Sparql.g:356:52: ( DOT )?
            int alt84=2;
            switch ( input.LA(1) ) {
                case DOT:
                    {
                    alt84=1;
                    }
                    break;
            }

            switch (alt84) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:356:52: DOT
                    {
                    DOT262=(Token)match(input,DOT,FOLLOW_DOT_in_constructTriples2936);  
                    stream_DOT.add(DOT262);


                    }
                    break;

            }


            // AST REWRITE
            // elements: triplesSameSubject
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 356:57: -> ( triplesSameSubject )+
            {
                if ( !(stream_triplesSameSubject.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_triplesSameSubject.hasNext() ) {
                    adaptor.addChild(root_0, stream_triplesSameSubject.nextTree());

                }
                stream_triplesSameSubject.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructTriples"


    public static class triplesSameSubject_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triplesSameSubject"
    // com\\googlecode\\sparkleg\\Sparql.g:359:1: triplesSameSubject : ( varOrTerm ( propertyListNotEmpty )? -> ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) ( propertyListNotEmpty )? ) | triplesNode ( propertyListNotEmpty )? -> ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? ) );
    public final SparqlParser.triplesSameSubject_return triplesSameSubject() throws RecognitionException {
        SparqlParser.triplesSameSubject_return retval = new SparqlParser.triplesSameSubject_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.varOrTerm_return varOrTerm263 =null;

        SparqlParser.propertyListNotEmpty_return propertyListNotEmpty264 =null;

        SparqlParser.triplesNode_return triplesNode265 =null;

        SparqlParser.propertyListNotEmpty_return propertyListNotEmpty266 =null;


        RewriteRuleSubtreeStream stream_varOrTerm=new RewriteRuleSubtreeStream(adaptor,"rule varOrTerm");
        RewriteRuleSubtreeStream stream_propertyListNotEmpty=new RewriteRuleSubtreeStream(adaptor,"rule propertyListNotEmpty");
        RewriteRuleSubtreeStream stream_triplesNode=new RewriteRuleSubtreeStream(adaptor,"rule triplesNode");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:360:5: ( varOrTerm ( propertyListNotEmpty )? -> ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) ( propertyListNotEmpty )? ) | triplesNode ( propertyListNotEmpty )? -> ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? ) )
            int alt87=2;
            switch ( input.LA(1) ) {
            case BLANK_NODE_LABEL:
            case DECIMAL:
            case DECIMAL_NEGATIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE:
            case DOUBLE_NEGATIVE:
            case DOUBLE_POSITIVE:
            case FALSE:
            case INTEGER:
            case INTEGER_NEGATIVE:
            case INTEGER_POSITIVE:
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
            case TRUE:
            case VAR1:
            case VAR2:
                {
                alt87=1;
                }
                break;
            case OPEN_SQUARE_BRACKET:
                {
                switch ( input.LA(2) ) {
                case CLOSE_SQUARE_BRACKET:
                    {
                    alt87=1;
                    }
                    break;
                case A:
                case INVERSE:
                case IRI_REF:
                case NEGATION:
                case OPEN_BRACE:
                case PNAME_LN:
                case PNAME_NS:
                case VAR1:
                case VAR2:
                    {
                    alt87=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 2, input);

                    throw nvae;

                }

                }
                break;
            case OPEN_BRACE:
                {
                switch ( input.LA(2) ) {
                case CLOSE_BRACE:
                    {
                    alt87=1;
                    }
                    break;
                case BLANK_NODE_LABEL:
                case DECIMAL:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case FALSE:
                case INTEGER:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI_REF:
                case OPEN_BRACE:
                case OPEN_SQUARE_BRACKET:
                case PNAME_LN:
                case PNAME_NS:
                case STRING_LITERAL1:
                case STRING_LITERAL2:
                case STRING_LITERAL_LONG1:
                case STRING_LITERAL_LONG2:
                case TRUE:
                case VAR1:
                case VAR2:
                    {
                    alt87=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 3, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }

            switch (alt87) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:360:7: varOrTerm ( propertyListNotEmpty )?
                    {
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubject2959);
                    varOrTerm263=varOrTerm();

                    state._fsp--;

                    stream_varOrTerm.add(varOrTerm263.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:360:17: ( propertyListNotEmpty )?
                    int alt85=2;
                    switch ( input.LA(1) ) {
                        case A:
                        case INVERSE:
                        case IRI_REF:
                        case NEGATION:
                        case OPEN_BRACE:
                        case PNAME_LN:
                        case PNAME_NS:
                        case VAR1:
                        case VAR2:
                            {
                            alt85=1;
                            }
                            break;
                    }

                    switch (alt85) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:360:17: propertyListNotEmpty
                            {
                            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject2961);
                            propertyListNotEmpty264=propertyListNotEmpty();

                            state._fsp--;

                            stream_propertyListNotEmpty.add(propertyListNotEmpty264.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: propertyListNotEmpty, varOrTerm
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 360:39: -> ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) ( propertyListNotEmpty )? )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:360:42: ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) ( propertyListNotEmpty )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TRIPLES_SAME_SUBJECT, "TRIPLES_SAME_SUBJECT")
                        , root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:360:65: ^( SUBJECT varOrTerm )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SUBJECT, "SUBJECT")
                        , root_2);

                        adaptor.addChild(root_2, stream_varOrTerm.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // com\\googlecode\\sparkleg\\Sparql.g:360:86: ( propertyListNotEmpty )?
                        if ( stream_propertyListNotEmpty.hasNext() ) {
                            adaptor.addChild(root_1, stream_propertyListNotEmpty.nextTree());

                        }
                        stream_propertyListNotEmpty.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:361:7: triplesNode ( propertyListNotEmpty )?
                    {
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubject2985);
                    triplesNode265=triplesNode();

                    state._fsp--;

                    stream_triplesNode.add(triplesNode265.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:361:19: ( propertyListNotEmpty )?
                    int alt86=2;
                    switch ( input.LA(1) ) {
                        case A:
                        case INVERSE:
                        case IRI_REF:
                        case NEGATION:
                        case OPEN_BRACE:
                        case PNAME_LN:
                        case PNAME_NS:
                        case VAR1:
                        case VAR2:
                            {
                            alt86=1;
                            }
                            break;
                    }

                    switch (alt86) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:361:19: propertyListNotEmpty
                            {
                            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject2987);
                            propertyListNotEmpty266=propertyListNotEmpty();

                            state._fsp--;

                            stream_propertyListNotEmpty.add(propertyListNotEmpty266.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: propertyListNotEmpty, triplesNode
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 361:41: -> ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:361:44: ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TRIPLES_SAME_SUBJECT, "TRIPLES_SAME_SUBJECT")
                        , root_1);

                        adaptor.addChild(root_1, stream_triplesNode.nextTree());

                        // com\\googlecode\\sparkleg\\Sparql.g:361:79: ( propertyListNotEmpty )?
                        if ( stream_propertyListNotEmpty.hasNext() ) {
                            adaptor.addChild(root_1, stream_propertyListNotEmpty.nextTree());

                        }
                        stream_propertyListNotEmpty.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triplesSameSubject"


    public static class propertyListNotEmpty_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propertyListNotEmpty"
    // com\\googlecode\\sparkleg\\Sparql.g:364:1: propertyListNotEmpty : propertyListNotEmptyDetails ( SEMICOLON ( propertyListNotEmptyDetails )? )* -> ( propertyListNotEmptyDetails )+ ;
    public final SparqlParser.propertyListNotEmpty_return propertyListNotEmpty() throws RecognitionException {
        SparqlParser.propertyListNotEmpty_return retval = new SparqlParser.propertyListNotEmpty_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMICOLON268=null;
        SparqlParser.propertyListNotEmptyDetails_return propertyListNotEmptyDetails267 =null;

        SparqlParser.propertyListNotEmptyDetails_return propertyListNotEmptyDetails269 =null;


        Object SEMICOLON268_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_propertyListNotEmptyDetails=new RewriteRuleSubtreeStream(adaptor,"rule propertyListNotEmptyDetails");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:365:5: ( propertyListNotEmptyDetails ( SEMICOLON ( propertyListNotEmptyDetails )? )* -> ( propertyListNotEmptyDetails )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:365:7: propertyListNotEmptyDetails ( SEMICOLON ( propertyListNotEmptyDetails )? )*
            {
            pushFollow(FOLLOW_propertyListNotEmptyDetails_in_propertyListNotEmpty3017);
            propertyListNotEmptyDetails267=propertyListNotEmptyDetails();

            state._fsp--;

            stream_propertyListNotEmptyDetails.add(propertyListNotEmptyDetails267.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:365:35: ( SEMICOLON ( propertyListNotEmptyDetails )? )*
            loop89:
            do {
                int alt89=2;
                switch ( input.LA(1) ) {
                case SEMICOLON:
                    {
                    alt89=1;
                    }
                    break;

                }

                switch (alt89) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:365:36: SEMICOLON ( propertyListNotEmptyDetails )?
            	    {
            	    SEMICOLON268=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_propertyListNotEmpty3020);  
            	    stream_SEMICOLON.add(SEMICOLON268);


            	    // com\\googlecode\\sparkleg\\Sparql.g:365:46: ( propertyListNotEmptyDetails )?
            	    int alt88=2;
            	    switch ( input.LA(1) ) {
            	        case A:
            	        case INVERSE:
            	        case IRI_REF:
            	        case NEGATION:
            	        case OPEN_BRACE:
            	        case PNAME_LN:
            	        case PNAME_NS:
            	        case VAR1:
            	        case VAR2:
            	            {
            	            alt88=1;
            	            }
            	            break;
            	    }

            	    switch (alt88) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:365:46: propertyListNotEmptyDetails
            	            {
            	            pushFollow(FOLLOW_propertyListNotEmptyDetails_in_propertyListNotEmpty3022);
            	            propertyListNotEmptyDetails269=propertyListNotEmptyDetails();

            	            state._fsp--;

            	            stream_propertyListNotEmptyDetails.add(propertyListNotEmptyDetails269.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            // AST REWRITE
            // elements: propertyListNotEmptyDetails
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 365:77: -> ( propertyListNotEmptyDetails )+
            {
                if ( !(stream_propertyListNotEmptyDetails.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_propertyListNotEmptyDetails.hasNext() ) {
                    adaptor.addChild(root_0, stream_propertyListNotEmptyDetails.nextTree());

                }
                stream_propertyListNotEmptyDetails.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "propertyListNotEmpty"


    public static class objectList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objectList"
    // com\\googlecode\\sparkleg\\Sparql.g:368:1: objectList : graphNode ( COMMA graphNode )* -> ( ^( OBJECT graphNode ) )+ ;
    public final SparqlParser.objectList_return objectList() throws RecognitionException {
        SparqlParser.objectList_return retval = new SparqlParser.objectList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA271=null;
        SparqlParser.graphNode_return graphNode270 =null;

        SparqlParser.graphNode_return graphNode272 =null;


        Object COMMA271_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_graphNode=new RewriteRuleSubtreeStream(adaptor,"rule graphNode");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:369:5: ( graphNode ( COMMA graphNode )* -> ( ^( OBJECT graphNode ) )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:369:7: graphNode ( COMMA graphNode )*
            {
            pushFollow(FOLLOW_graphNode_in_objectList3048);
            graphNode270=graphNode();

            state._fsp--;

            stream_graphNode.add(graphNode270.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:369:17: ( COMMA graphNode )*
            loop90:
            do {
                int alt90=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt90=1;
                    }
                    break;

                }

                switch (alt90) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:369:18: COMMA graphNode
            	    {
            	    COMMA271=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectList3051);  
            	    stream_COMMA.add(COMMA271);


            	    pushFollow(FOLLOW_graphNode_in_objectList3053);
            	    graphNode272=graphNode();

            	    state._fsp--;

            	    stream_graphNode.add(graphNode272.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            // AST REWRITE
            // elements: graphNode
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 369:36: -> ( ^( OBJECT graphNode ) )+
            {
                if ( !(stream_graphNode.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_graphNode.hasNext() ) {
                    // com\\googlecode\\sparkleg\\Sparql.g:369:39: ^( OBJECT graphNode )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(OBJECT, "OBJECT")
                    , root_1);

                    adaptor.addChild(root_1, stream_graphNode.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_graphNode.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "objectList"


    public static class verb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "verb"
    // com\\googlecode\\sparkleg\\Sparql.g:372:1: verb : ( varOrIRIref | A );
    public final SparqlParser.verb_return verb() throws RecognitionException {
        SparqlParser.verb_return retval = new SparqlParser.verb_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token A274=null;
        SparqlParser.varOrIRIref_return varOrIRIref273 =null;


        Object A274_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:373:5: ( varOrIRIref | A )
            int alt91=2;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
            case VAR1:
            case VAR2:
                {
                alt91=1;
                }
                break;
            case A:
                {
                alt91=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;

            }

            switch (alt91) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:373:7: varOrIRIref
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varOrIRIref_in_verb3081);
                    varOrIRIref273=varOrIRIref();

                    state._fsp--;

                    adaptor.addChild(root_0, varOrIRIref273.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:374:7: A
                    {
                    root_0 = (Object)adaptor.nil();


                    A274=(Token)match(input,A,FOLLOW_A_in_verb3089); 
                    A274_tree = 
                    (Object)adaptor.create(A274)
                    ;
                    adaptor.addChild(root_0, A274_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "verb"


    public static class triplesSameSubjectPath_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triplesSameSubjectPath"
    // com\\googlecode\\sparkleg\\Sparql.g:377:1: triplesSameSubjectPath : ( varOrTerm propertyListNotEmptyPath -> ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmptyPath ) | triplesNode ( propertyListNotEmpty )? -> ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? ) );
    public final SparqlParser.triplesSameSubjectPath_return triplesSameSubjectPath() throws RecognitionException {
        SparqlParser.triplesSameSubjectPath_return retval = new SparqlParser.triplesSameSubjectPath_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.varOrTerm_return varOrTerm275 =null;

        SparqlParser.propertyListNotEmptyPath_return propertyListNotEmptyPath276 =null;

        SparqlParser.triplesNode_return triplesNode277 =null;

        SparqlParser.propertyListNotEmpty_return propertyListNotEmpty278 =null;


        RewriteRuleSubtreeStream stream_propertyListNotEmpty=new RewriteRuleSubtreeStream(adaptor,"rule propertyListNotEmpty");
        RewriteRuleSubtreeStream stream_varOrTerm=new RewriteRuleSubtreeStream(adaptor,"rule varOrTerm");
        RewriteRuleSubtreeStream stream_triplesNode=new RewriteRuleSubtreeStream(adaptor,"rule triplesNode");
        RewriteRuleSubtreeStream stream_propertyListNotEmptyPath=new RewriteRuleSubtreeStream(adaptor,"rule propertyListNotEmptyPath");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:378:5: ( varOrTerm propertyListNotEmptyPath -> ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmptyPath ) | triplesNode ( propertyListNotEmpty )? -> ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? ) )
            int alt93=2;
            switch ( input.LA(1) ) {
            case BLANK_NODE_LABEL:
            case DECIMAL:
            case DECIMAL_NEGATIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE:
            case DOUBLE_NEGATIVE:
            case DOUBLE_POSITIVE:
            case FALSE:
            case INTEGER:
            case INTEGER_NEGATIVE:
            case INTEGER_POSITIVE:
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
            case TRUE:
            case VAR1:
            case VAR2:
                {
                alt93=1;
                }
                break;
            case OPEN_SQUARE_BRACKET:
                {
                switch ( input.LA(2) ) {
                case CLOSE_SQUARE_BRACKET:
                    {
                    alt93=1;
                    }
                    break;
                case A:
                case INVERSE:
                case IRI_REF:
                case NEGATION:
                case OPEN_BRACE:
                case PNAME_LN:
                case PNAME_NS:
                case VAR1:
                case VAR2:
                    {
                    alt93=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 2, input);

                    throw nvae;

                }

                }
                break;
            case OPEN_BRACE:
                {
                switch ( input.LA(2) ) {
                case CLOSE_BRACE:
                    {
                    alt93=1;
                    }
                    break;
                case BLANK_NODE_LABEL:
                case DECIMAL:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case FALSE:
                case INTEGER:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI_REF:
                case OPEN_BRACE:
                case OPEN_SQUARE_BRACKET:
                case PNAME_LN:
                case PNAME_NS:
                case STRING_LITERAL1:
                case STRING_LITERAL2:
                case STRING_LITERAL_LONG1:
                case STRING_LITERAL_LONG2:
                case TRUE:
                case VAR1:
                case VAR2:
                    {
                    alt93=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 3, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }

            switch (alt93) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:378:7: varOrTerm propertyListNotEmptyPath
                    {
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubjectPath3106);
                    varOrTerm275=varOrTerm();

                    state._fsp--;

                    stream_varOrTerm.add(varOrTerm275.getTree());

                    pushFollow(FOLLOW_propertyListNotEmptyPath_in_triplesSameSubjectPath3108);
                    propertyListNotEmptyPath276=propertyListNotEmptyPath();

                    state._fsp--;

                    stream_propertyListNotEmptyPath.add(propertyListNotEmptyPath276.getTree());

                    // AST REWRITE
                    // elements: propertyListNotEmptyPath, varOrTerm
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 378:42: -> ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmptyPath )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:378:45: ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmptyPath )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TRIPLES_SAME_SUBJECT, "TRIPLES_SAME_SUBJECT")
                        , root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:378:68: ^( SUBJECT varOrTerm )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SUBJECT, "SUBJECT")
                        , root_2);

                        adaptor.addChild(root_2, stream_varOrTerm.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_propertyListNotEmptyPath.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:379:7: triplesNode ( propertyListNotEmpty )?
                    {
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubjectPath3130);
                    triplesNode277=triplesNode();

                    state._fsp--;

                    stream_triplesNode.add(triplesNode277.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:379:19: ( propertyListNotEmpty )?
                    int alt92=2;
                    switch ( input.LA(1) ) {
                        case A:
                        case INVERSE:
                        case IRI_REF:
                        case NEGATION:
                        case OPEN_BRACE:
                        case PNAME_LN:
                        case PNAME_NS:
                        case VAR1:
                        case VAR2:
                            {
                            alt92=1;
                            }
                            break;
                    }

                    switch (alt92) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:379:19: propertyListNotEmpty
                            {
                            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath3132);
                            propertyListNotEmpty278=propertyListNotEmpty();

                            state._fsp--;

                            stream_propertyListNotEmpty.add(propertyListNotEmpty278.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: propertyListNotEmpty, triplesNode
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 379:41: -> ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:379:44: ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TRIPLES_SAME_SUBJECT, "TRIPLES_SAME_SUBJECT")
                        , root_1);

                        adaptor.addChild(root_1, stream_triplesNode.nextTree());

                        // com\\googlecode\\sparkleg\\Sparql.g:379:80: ( propertyListNotEmpty )?
                        if ( stream_propertyListNotEmpty.hasNext() ) {
                            adaptor.addChild(root_1, stream_propertyListNotEmpty.nextTree());

                        }
                        stream_propertyListNotEmpty.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triplesSameSubjectPath"


    public static class propertyListNotEmptyPath_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propertyListNotEmptyPath"
    // com\\googlecode\\sparkleg\\Sparql.g:382:1: propertyListNotEmptyPath : propertyListNotEmptyDetails ( SEMICOLON ( propertyListNotEmptyDetails )? )* -> ( propertyListNotEmptyDetails )+ ;
    public final SparqlParser.propertyListNotEmptyPath_return propertyListNotEmptyPath() throws RecognitionException {
        SparqlParser.propertyListNotEmptyPath_return retval = new SparqlParser.propertyListNotEmptyPath_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMICOLON280=null;
        SparqlParser.propertyListNotEmptyDetails_return propertyListNotEmptyDetails279 =null;

        SparqlParser.propertyListNotEmptyDetails_return propertyListNotEmptyDetails281 =null;


        Object SEMICOLON280_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_propertyListNotEmptyDetails=new RewriteRuleSubtreeStream(adaptor,"rule propertyListNotEmptyDetails");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:383:5: ( propertyListNotEmptyDetails ( SEMICOLON ( propertyListNotEmptyDetails )? )* -> ( propertyListNotEmptyDetails )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:383:7: propertyListNotEmptyDetails ( SEMICOLON ( propertyListNotEmptyDetails )? )*
            {
            pushFollow(FOLLOW_propertyListNotEmptyDetails_in_propertyListNotEmptyPath3164);
            propertyListNotEmptyDetails279=propertyListNotEmptyDetails();

            state._fsp--;

            stream_propertyListNotEmptyDetails.add(propertyListNotEmptyDetails279.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:383:35: ( SEMICOLON ( propertyListNotEmptyDetails )? )*
            loop95:
            do {
                int alt95=2;
                switch ( input.LA(1) ) {
                case SEMICOLON:
                    {
                    alt95=1;
                    }
                    break;

                }

                switch (alt95) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:383:36: SEMICOLON ( propertyListNotEmptyDetails )?
            	    {
            	    SEMICOLON280=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_propertyListNotEmptyPath3167);  
            	    stream_SEMICOLON.add(SEMICOLON280);


            	    // com\\googlecode\\sparkleg\\Sparql.g:383:46: ( propertyListNotEmptyDetails )?
            	    int alt94=2;
            	    switch ( input.LA(1) ) {
            	        case A:
            	        case INVERSE:
            	        case IRI_REF:
            	        case NEGATION:
            	        case OPEN_BRACE:
            	        case PNAME_LN:
            	        case PNAME_NS:
            	        case VAR1:
            	        case VAR2:
            	            {
            	            alt94=1;
            	            }
            	            break;
            	    }

            	    switch (alt94) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:383:46: propertyListNotEmptyDetails
            	            {
            	            pushFollow(FOLLOW_propertyListNotEmptyDetails_in_propertyListNotEmptyPath3169);
            	            propertyListNotEmptyDetails281=propertyListNotEmptyDetails();

            	            state._fsp--;

            	            stream_propertyListNotEmptyDetails.add(propertyListNotEmptyDetails281.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            // AST REWRITE
            // elements: propertyListNotEmptyDetails
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 383:77: -> ( propertyListNotEmptyDetails )+
            {
                if ( !(stream_propertyListNotEmptyDetails.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_propertyListNotEmptyDetails.hasNext() ) {
                    adaptor.addChild(root_0, stream_propertyListNotEmptyDetails.nextTree());

                }
                stream_propertyListNotEmptyDetails.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "propertyListNotEmptyPath"


    public static class propertyListNotEmptyDetails_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propertyListNotEmptyDetails"
    // com\\googlecode\\sparkleg\\Sparql.g:386:1: propertyListNotEmptyDetails : verbSimpleOrPath objectList -> ^( PREDICATE verbSimpleOrPath objectList ) ;
    public final SparqlParser.propertyListNotEmptyDetails_return propertyListNotEmptyDetails() throws RecognitionException {
        SparqlParser.propertyListNotEmptyDetails_return retval = new SparqlParser.propertyListNotEmptyDetails_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.verbSimpleOrPath_return verbSimpleOrPath282 =null;

        SparqlParser.objectList_return objectList283 =null;


        RewriteRuleSubtreeStream stream_verbSimpleOrPath=new RewriteRuleSubtreeStream(adaptor,"rule verbSimpleOrPath");
        RewriteRuleSubtreeStream stream_objectList=new RewriteRuleSubtreeStream(adaptor,"rule objectList");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:387:5: ( verbSimpleOrPath objectList -> ^( PREDICATE verbSimpleOrPath objectList ) )
            // com\\googlecode\\sparkleg\\Sparql.g:387:7: verbSimpleOrPath objectList
            {
            pushFollow(FOLLOW_verbSimpleOrPath_in_propertyListNotEmptyDetails3196);
            verbSimpleOrPath282=verbSimpleOrPath();

            state._fsp--;

            stream_verbSimpleOrPath.add(verbSimpleOrPath282.getTree());

            pushFollow(FOLLOW_objectList_in_propertyListNotEmptyDetails3198);
            objectList283=objectList();

            state._fsp--;

            stream_objectList.add(objectList283.getTree());

            // AST REWRITE
            // elements: objectList, verbSimpleOrPath
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 387:35: -> ^( PREDICATE verbSimpleOrPath objectList )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:387:38: ^( PREDICATE verbSimpleOrPath objectList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PREDICATE, "PREDICATE")
                , root_1);

                adaptor.addChild(root_1, stream_verbSimpleOrPath.nextTree());

                adaptor.addChild(root_1, stream_objectList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "propertyListNotEmptyDetails"


    public static class verbSimpleOrPath_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "verbSimpleOrPath"
    // com\\googlecode\\sparkleg\\Sparql.g:390:1: verbSimpleOrPath : ( verbPath | verbSimple );
    public final SparqlParser.verbSimpleOrPath_return verbSimpleOrPath() throws RecognitionException {
        SparqlParser.verbSimpleOrPath_return retval = new SparqlParser.verbSimpleOrPath_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.verbPath_return verbPath284 =null;

        SparqlParser.verbSimple_return verbSimple285 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:391:5: ( verbPath | verbSimple )
            int alt96=2;
            switch ( input.LA(1) ) {
            case A:
            case INVERSE:
            case IRI_REF:
            case NEGATION:
            case OPEN_BRACE:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt96=1;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt96=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;

            }

            switch (alt96) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:391:7: verbPath
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_verbPath_in_verbSimpleOrPath3228);
                    verbPath284=verbPath();

                    state._fsp--;

                    adaptor.addChild(root_0, verbPath284.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:392:7: verbSimple
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_verbSimple_in_verbSimpleOrPath3236);
                    verbSimple285=verbSimple();

                    state._fsp--;

                    adaptor.addChild(root_0, verbSimple285.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "verbSimpleOrPath"


    public static class verbPath_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "verbPath"
    // com\\googlecode\\sparkleg\\Sparql.g:395:1: verbPath : path ;
    public final SparqlParser.verbPath_return verbPath() throws RecognitionException {
        SparqlParser.verbPath_return retval = new SparqlParser.verbPath_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.path_return path286 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:396:5: ( path )
            // com\\googlecode\\sparkleg\\Sparql.g:396:7: path
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_path_in_verbPath3255);
            path286=path();

            state._fsp--;

            adaptor.addChild(root_0, path286.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "verbPath"


    public static class verbSimple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "verbSimple"
    // com\\googlecode\\sparkleg\\Sparql.g:399:1: verbSimple : var ;
    public final SparqlParser.verbSimple_return verbSimple() throws RecognitionException {
        SparqlParser.verbSimple_return retval = new SparqlParser.verbSimple_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.var_return var287 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:400:5: ( var )
            // com\\googlecode\\sparkleg\\Sparql.g:400:7: var
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_var_in_verbSimple3276);
            var287=var();

            state._fsp--;

            adaptor.addChild(root_0, var287.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "verbSimple"


    public static class path_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "path"
    // com\\googlecode\\sparkleg\\Sparql.g:403:1: path : pathSequence ( PIPE pathSequence )* -> ^( PATH ( pathSequence )+ ) ;
    public final SparqlParser.path_return path() throws RecognitionException {
        SparqlParser.path_return retval = new SparqlParser.path_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PIPE289=null;
        SparqlParser.pathSequence_return pathSequence288 =null;

        SparqlParser.pathSequence_return pathSequence290 =null;


        Object PIPE289_tree=null;
        RewriteRuleTokenStream stream_PIPE=new RewriteRuleTokenStream(adaptor,"token PIPE");
        RewriteRuleSubtreeStream stream_pathSequence=new RewriteRuleSubtreeStream(adaptor,"rule pathSequence");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:404:5: ( pathSequence ( PIPE pathSequence )* -> ^( PATH ( pathSequence )+ ) )
            // com\\googlecode\\sparkleg\\Sparql.g:404:7: pathSequence ( PIPE pathSequence )*
            {
            pushFollow(FOLLOW_pathSequence_in_path3298);
            pathSequence288=pathSequence();

            state._fsp--;

            stream_pathSequence.add(pathSequence288.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:404:20: ( PIPE pathSequence )*
            loop97:
            do {
                int alt97=2;
                switch ( input.LA(1) ) {
                case PIPE:
                    {
                    alt97=1;
                    }
                    break;

                }

                switch (alt97) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:404:21: PIPE pathSequence
            	    {
            	    PIPE289=(Token)match(input,PIPE,FOLLOW_PIPE_in_path3301);  
            	    stream_PIPE.add(PIPE289);


            	    pushFollow(FOLLOW_pathSequence_in_path3303);
            	    pathSequence290=pathSequence();

            	    state._fsp--;

            	    stream_pathSequence.add(pathSequence290.getTree());

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            // AST REWRITE
            // elements: pathSequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 404:41: -> ^( PATH ( pathSequence )+ )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:404:44: ^( PATH ( pathSequence )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PATH, "PATH")
                , root_1);

                if ( !(stream_pathSequence.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_pathSequence.hasNext() ) {
                    adaptor.addChild(root_1, stream_pathSequence.nextTree());

                }
                stream_pathSequence.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "path"


    public static class pathSequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathSequence"
    // com\\googlecode\\sparkleg\\Sparql.g:407:1: pathSequence : pathEltOrInverse ( DIVIDE pathEltOrInverse )* -> ^( PATH_SEQUENCE ( pathEltOrInverse )+ ) ;
    public final SparqlParser.pathSequence_return pathSequence() throws RecognitionException {
        SparqlParser.pathSequence_return retval = new SparqlParser.pathSequence_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DIVIDE292=null;
        SparqlParser.pathEltOrInverse_return pathEltOrInverse291 =null;

        SparqlParser.pathEltOrInverse_return pathEltOrInverse293 =null;


        Object DIVIDE292_tree=null;
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_pathEltOrInverse=new RewriteRuleSubtreeStream(adaptor,"rule pathEltOrInverse");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:408:5: ( pathEltOrInverse ( DIVIDE pathEltOrInverse )* -> ^( PATH_SEQUENCE ( pathEltOrInverse )+ ) )
            // com\\googlecode\\sparkleg\\Sparql.g:408:7: pathEltOrInverse ( DIVIDE pathEltOrInverse )*
            {
            pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence3332);
            pathEltOrInverse291=pathEltOrInverse();

            state._fsp--;

            stream_pathEltOrInverse.add(pathEltOrInverse291.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:408:24: ( DIVIDE pathEltOrInverse )*
            loop98:
            do {
                int alt98=2;
                switch ( input.LA(1) ) {
                case DIVIDE:
                    {
                    alt98=1;
                    }
                    break;

                }

                switch (alt98) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:408:25: DIVIDE pathEltOrInverse
            	    {
            	    DIVIDE292=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_pathSequence3335);  
            	    stream_DIVIDE.add(DIVIDE292);


            	    pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence3337);
            	    pathEltOrInverse293=pathEltOrInverse();

            	    state._fsp--;

            	    stream_pathEltOrInverse.add(pathEltOrInverse293.getTree());

            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            // AST REWRITE
            // elements: pathEltOrInverse
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 408:51: -> ^( PATH_SEQUENCE ( pathEltOrInverse )+ )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:408:54: ^( PATH_SEQUENCE ( pathEltOrInverse )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PATH_SEQUENCE, "PATH_SEQUENCE")
                , root_1);

                if ( !(stream_pathEltOrInverse.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_pathEltOrInverse.hasNext() ) {
                    adaptor.addChild(root_1, stream_pathEltOrInverse.nextTree());

                }
                stream_pathEltOrInverse.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathSequence"


    public static class pathEltOrInverse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathEltOrInverse"
    // com\\googlecode\\sparkleg\\Sparql.g:411:1: pathEltOrInverse : ( INVERSE )? pathElt ;
    public final SparqlParser.pathEltOrInverse_return pathEltOrInverse() throws RecognitionException {
        SparqlParser.pathEltOrInverse_return retval = new SparqlParser.pathEltOrInverse_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INVERSE294=null;
        SparqlParser.pathElt_return pathElt295 =null;


        Object INVERSE294_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:412:5: ( ( INVERSE )? pathElt )
            // com\\googlecode\\sparkleg\\Sparql.g:412:7: ( INVERSE )? pathElt
            {
            root_0 = (Object)adaptor.nil();


            // com\\googlecode\\sparkleg\\Sparql.g:412:7: ( INVERSE )?
            int alt99=2;
            switch ( input.LA(1) ) {
                case INVERSE:
                    {
                    alt99=1;
                    }
                    break;
            }

            switch (alt99) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:412:7: INVERSE
                    {
                    INVERSE294=(Token)match(input,INVERSE,FOLLOW_INVERSE_in_pathEltOrInverse3365); 
                    INVERSE294_tree = 
                    (Object)adaptor.create(INVERSE294)
                    ;
                    adaptor.addChild(root_0, INVERSE294_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_pathElt_in_pathEltOrInverse3368);
            pathElt295=pathElt();

            state._fsp--;

            adaptor.addChild(root_0, pathElt295.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathEltOrInverse"


    public static class pathElt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathElt"
    // com\\googlecode\\sparkleg\\Sparql.g:415:1: pathElt : pathPrimary ( pathMod )? ;
    public final SparqlParser.pathElt_return pathElt() throws RecognitionException {
        SparqlParser.pathElt_return retval = new SparqlParser.pathElt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.pathPrimary_return pathPrimary296 =null;

        SparqlParser.pathMod_return pathMod297 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:416:5: ( pathPrimary ( pathMod )? )
            // com\\googlecode\\sparkleg\\Sparql.g:416:7: pathPrimary ( pathMod )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pathPrimary_in_pathElt3396);
            pathPrimary296=pathPrimary();

            state._fsp--;

            adaptor.addChild(root_0, pathPrimary296.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:416:19: ( pathMod )?
            int alt100=2;
            switch ( input.LA(1) ) {
                case ASTERISK:
                case OPEN_CURLY_BRACE:
                case PLUS:
                case QUESTION_MARK:
                    {
                    alt100=1;
                    }
                    break;
            }

            switch (alt100) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:416:19: pathMod
                    {
                    pushFollow(FOLLOW_pathMod_in_pathElt3398);
                    pathMod297=pathMod();

                    state._fsp--;

                    adaptor.addChild(root_0, pathMod297.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathElt"


    public static class pathMod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathMod"
    // com\\googlecode\\sparkleg\\Sparql.g:419:1: pathMod : ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) ) ;
    public final SparqlParser.pathMod_return pathMod() throws RecognitionException {
        SparqlParser.pathMod_return retval = new SparqlParser.pathMod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASTERISK298=null;
        Token QUESTION_MARK299=null;
        Token PLUS300=null;
        Token OPEN_CURLY_BRACE301=null;
        Token INTEGER302=null;
        Token COMMA303=null;
        Token CLOSE_CURLY_BRACE304=null;
        Token INTEGER305=null;
        Token CLOSE_CURLY_BRACE306=null;
        Token CLOSE_CURLY_BRACE307=null;
        Token COMMA308=null;
        Token INTEGER309=null;
        Token CLOSE_CURLY_BRACE310=null;

        Object ASTERISK298_tree=null;
        Object QUESTION_MARK299_tree=null;
        Object PLUS300_tree=null;
        Object OPEN_CURLY_BRACE301_tree=null;
        Object INTEGER302_tree=null;
        Object COMMA303_tree=null;
        Object CLOSE_CURLY_BRACE304_tree=null;
        Object INTEGER305_tree=null;
        Object CLOSE_CURLY_BRACE306_tree=null;
        Object CLOSE_CURLY_BRACE307_tree=null;
        Object COMMA308_tree=null;
        Object INTEGER309_tree=null;
        Object CLOSE_CURLY_BRACE310_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:420:5: ( ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) ) )
            // com\\googlecode\\sparkleg\\Sparql.g:420:7: ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) )
            {
            root_0 = (Object)adaptor.nil();


            // com\\googlecode\\sparkleg\\Sparql.g:420:7: ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) )
            int alt104=4;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt104=1;
                }
                break;
            case QUESTION_MARK:
                {
                alt104=2;
                }
                break;
            case PLUS:
                {
                alt104=3;
                }
                break;
            case OPEN_CURLY_BRACE:
                {
                alt104=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }

            switch (alt104) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:420:8: ASTERISK
                    {
                    ASTERISK298=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_pathMod3417); 
                    ASTERISK298_tree = 
                    (Object)adaptor.create(ASTERISK298)
                    ;
                    adaptor.addChild(root_0, ASTERISK298_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:420:19: QUESTION_MARK
                    {
                    QUESTION_MARK299=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_pathMod3421); 
                    QUESTION_MARK299_tree = 
                    (Object)adaptor.create(QUESTION_MARK299)
                    ;
                    adaptor.addChild(root_0, QUESTION_MARK299_tree);


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:420:35: PLUS
                    {
                    PLUS300=(Token)match(input,PLUS,FOLLOW_PLUS_in_pathMod3425); 
                    PLUS300_tree = 
                    (Object)adaptor.create(PLUS300)
                    ;
                    adaptor.addChild(root_0, PLUS300_tree);


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:420:42: OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE )
                    {
                    OPEN_CURLY_BRACE301=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_pathMod3429); 
                    OPEN_CURLY_BRACE301_tree = 
                    (Object)adaptor.create(OPEN_CURLY_BRACE301)
                    ;
                    adaptor.addChild(root_0, OPEN_CURLY_BRACE301_tree);


                    // com\\googlecode\\sparkleg\\Sparql.g:420:59: ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE )
                    int alt103=2;
                    switch ( input.LA(1) ) {
                    case INTEGER:
                        {
                        alt103=1;
                        }
                        break;
                    case COMMA:
                        {
                        alt103=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        throw nvae;

                    }

                    switch (alt103) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:420:60: INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE )
                            {
                            INTEGER302=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod3432); 
                            INTEGER302_tree = 
                            (Object)adaptor.create(INTEGER302)
                            ;
                            adaptor.addChild(root_0, INTEGER302_tree);


                            // com\\googlecode\\sparkleg\\Sparql.g:420:68: ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE )
                            int alt102=2;
                            switch ( input.LA(1) ) {
                            case COMMA:
                                {
                                alt102=1;
                                }
                                break;
                            case CLOSE_CURLY_BRACE:
                                {
                                alt102=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 102, 0, input);

                                throw nvae;

                            }

                            switch (alt102) {
                                case 1 :
                                    // com\\googlecode\\sparkleg\\Sparql.g:420:69: COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE )
                                    {
                                    COMMA303=(Token)match(input,COMMA,FOLLOW_COMMA_in_pathMod3435); 
                                    COMMA303_tree = 
                                    (Object)adaptor.create(COMMA303)
                                    ;
                                    adaptor.addChild(root_0, COMMA303_tree);


                                    // com\\googlecode\\sparkleg\\Sparql.g:420:75: ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE )
                                    int alt101=2;
                                    switch ( input.LA(1) ) {
                                    case CLOSE_CURLY_BRACE:
                                        {
                                        alt101=1;
                                        }
                                        break;
                                    case INTEGER:
                                        {
                                        alt101=2;
                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 101, 0, input);

                                        throw nvae;

                                    }

                                    switch (alt101) {
                                        case 1 :
                                            // com\\googlecode\\sparkleg\\Sparql.g:420:76: CLOSE_CURLY_BRACE
                                            {
                                            CLOSE_CURLY_BRACE304=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3438); 
                                            CLOSE_CURLY_BRACE304_tree = 
                                            (Object)adaptor.create(CLOSE_CURLY_BRACE304)
                                            ;
                                            adaptor.addChild(root_0, CLOSE_CURLY_BRACE304_tree);


                                            }
                                            break;
                                        case 2 :
                                            // com\\googlecode\\sparkleg\\Sparql.g:420:96: INTEGER CLOSE_CURLY_BRACE
                                            {
                                            INTEGER305=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod3442); 
                                            INTEGER305_tree = 
                                            (Object)adaptor.create(INTEGER305)
                                            ;
                                            adaptor.addChild(root_0, INTEGER305_tree);


                                            CLOSE_CURLY_BRACE306=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3444); 
                                            CLOSE_CURLY_BRACE306_tree = 
                                            (Object)adaptor.create(CLOSE_CURLY_BRACE306)
                                            ;
                                            adaptor.addChild(root_0, CLOSE_CURLY_BRACE306_tree);


                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // com\\googlecode\\sparkleg\\Sparql.g:420:125: CLOSE_CURLY_BRACE
                                    {
                                    CLOSE_CURLY_BRACE307=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3449); 
                                    CLOSE_CURLY_BRACE307_tree = 
                                    (Object)adaptor.create(CLOSE_CURLY_BRACE307)
                                    ;
                                    adaptor.addChild(root_0, CLOSE_CURLY_BRACE307_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\Sparql.g:420:146: COMMA INTEGER CLOSE_CURLY_BRACE
                            {
                            COMMA308=(Token)match(input,COMMA,FOLLOW_COMMA_in_pathMod3454); 
                            COMMA308_tree = 
                            (Object)adaptor.create(COMMA308)
                            ;
                            adaptor.addChild(root_0, COMMA308_tree);


                            INTEGER309=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod3456); 
                            INTEGER309_tree = 
                            (Object)adaptor.create(INTEGER309)
                            ;
                            adaptor.addChild(root_0, INTEGER309_tree);


                            CLOSE_CURLY_BRACE310=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3458); 
                            CLOSE_CURLY_BRACE310_tree = 
                            (Object)adaptor.create(CLOSE_CURLY_BRACE310)
                            ;
                            adaptor.addChild(root_0, CLOSE_CURLY_BRACE310_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathMod"


    public static class pathPrimary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathPrimary"
    // com\\googlecode\\sparkleg\\Sparql.g:423:1: pathPrimary : ( iriRef -> ^( PATH_PRIMARY iriRef ) | A -> ^( PATH_PRIMARY A ) | NEGATION pathNegatedPropertySet -> ^( PATH_PRIMARY NEGATION pathNegatedPropertySet ) | OPEN_BRACE path CLOSE_BRACE -> ^( PATH_PRIMARY path ) );
    public final SparqlParser.pathPrimary_return pathPrimary() throws RecognitionException {
        SparqlParser.pathPrimary_return retval = new SparqlParser.pathPrimary_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token A312=null;
        Token NEGATION313=null;
        Token OPEN_BRACE315=null;
        Token CLOSE_BRACE317=null;
        SparqlParser.iriRef_return iriRef311 =null;

        SparqlParser.pathNegatedPropertySet_return pathNegatedPropertySet314 =null;

        SparqlParser.path_return path316 =null;


        Object A312_tree=null;
        Object NEGATION313_tree=null;
        Object OPEN_BRACE315_tree=null;
        Object CLOSE_BRACE317_tree=null;
        RewriteRuleTokenStream stream_A=new RewriteRuleTokenStream(adaptor,"token A");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_NEGATION=new RewriteRuleTokenStream(adaptor,"token NEGATION");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        RewriteRuleSubtreeStream stream_pathNegatedPropertySet=new RewriteRuleSubtreeStream(adaptor,"rule pathNegatedPropertySet");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:424:5: ( iriRef -> ^( PATH_PRIMARY iriRef ) | A -> ^( PATH_PRIMARY A ) | NEGATION pathNegatedPropertySet -> ^( PATH_PRIMARY NEGATION pathNegatedPropertySet ) | OPEN_BRACE path CLOSE_BRACE -> ^( PATH_PRIMARY path ) )
            int alt105=4;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt105=1;
                }
                break;
            case A:
                {
                alt105=2;
                }
                break;
            case NEGATION:
                {
                alt105=3;
                }
                break;
            case OPEN_BRACE:
                {
                alt105=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }

            switch (alt105) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:424:7: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_pathPrimary3477);
                    iriRef311=iriRef();

                    state._fsp--;

                    stream_iriRef.add(iriRef311.getTree());

                    // AST REWRITE
                    // elements: iriRef
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 424:14: -> ^( PATH_PRIMARY iriRef )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:424:17: ^( PATH_PRIMARY iriRef )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PATH_PRIMARY, "PATH_PRIMARY")
                        , root_1);

                        adaptor.addChild(root_1, stream_iriRef.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:425:7: A
                    {
                    A312=(Token)match(input,A,FOLLOW_A_in_pathPrimary3493);  
                    stream_A.add(A312);


                    // AST REWRITE
                    // elements: A
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 425:9: -> ^( PATH_PRIMARY A )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:425:12: ^( PATH_PRIMARY A )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PATH_PRIMARY, "PATH_PRIMARY")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_A.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:426:7: NEGATION pathNegatedPropertySet
                    {
                    NEGATION313=(Token)match(input,NEGATION,FOLLOW_NEGATION_in_pathPrimary3509);  
                    stream_NEGATION.add(NEGATION313);


                    pushFollow(FOLLOW_pathNegatedPropertySet_in_pathPrimary3511);
                    pathNegatedPropertySet314=pathNegatedPropertySet();

                    state._fsp--;

                    stream_pathNegatedPropertySet.add(pathNegatedPropertySet314.getTree());

                    // AST REWRITE
                    // elements: NEGATION, pathNegatedPropertySet
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 426:39: -> ^( PATH_PRIMARY NEGATION pathNegatedPropertySet )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:426:42: ^( PATH_PRIMARY NEGATION pathNegatedPropertySet )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PATH_PRIMARY, "PATH_PRIMARY")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEGATION.nextNode()
                        );

                        adaptor.addChild(root_1, stream_pathNegatedPropertySet.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:427:7: OPEN_BRACE path CLOSE_BRACE
                    {
                    OPEN_BRACE315=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_pathPrimary3529);  
                    stream_OPEN_BRACE.add(OPEN_BRACE315);


                    pushFollow(FOLLOW_path_in_pathPrimary3531);
                    path316=path();

                    state._fsp--;

                    stream_path.add(path316.getTree());

                    CLOSE_BRACE317=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_pathPrimary3533);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE317);


                    // AST REWRITE
                    // elements: path
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 427:35: -> ^( PATH_PRIMARY path )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:427:38: ^( PATH_PRIMARY path )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PATH_PRIMARY, "PATH_PRIMARY")
                        , root_1);

                        adaptor.addChild(root_1, stream_path.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathPrimary"


    public static class pathNegatedPropertySet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathNegatedPropertySet"
    // com\\googlecode\\sparkleg\\Sparql.g:430:1: pathNegatedPropertySet : ( pathOneInPropertySet -> ^( PATH_NEGATED pathOneInPropertySet ) | OPEN_BRACE ( pathOneInPropertySet ( PIPE pathOneInPropertySet )* )? CLOSE_BRACE -> ^( PATH_NEGATED ( pathOneInPropertySet )+ ) );
    public final SparqlParser.pathNegatedPropertySet_return pathNegatedPropertySet() throws RecognitionException {
        SparqlParser.pathNegatedPropertySet_return retval = new SparqlParser.pathNegatedPropertySet_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_BRACE319=null;
        Token PIPE321=null;
        Token CLOSE_BRACE323=null;
        SparqlParser.pathOneInPropertySet_return pathOneInPropertySet318 =null;

        SparqlParser.pathOneInPropertySet_return pathOneInPropertySet320 =null;

        SparqlParser.pathOneInPropertySet_return pathOneInPropertySet322 =null;


        Object OPEN_BRACE319_tree=null;
        Object PIPE321_tree=null;
        Object CLOSE_BRACE323_tree=null;
        RewriteRuleTokenStream stream_PIPE=new RewriteRuleTokenStream(adaptor,"token PIPE");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_pathOneInPropertySet=new RewriteRuleSubtreeStream(adaptor,"rule pathOneInPropertySet");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:431:5: ( pathOneInPropertySet -> ^( PATH_NEGATED pathOneInPropertySet ) | OPEN_BRACE ( pathOneInPropertySet ( PIPE pathOneInPropertySet )* )? CLOSE_BRACE -> ^( PATH_NEGATED ( pathOneInPropertySet )+ ) )
            int alt108=2;
            switch ( input.LA(1) ) {
            case A:
            case INVERSE:
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt108=1;
                }
                break;
            case OPEN_BRACE:
                {
                alt108=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;

            }

            switch (alt108) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:431:7: pathOneInPropertySet
                    {
                    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3558);
                    pathOneInPropertySet318=pathOneInPropertySet();

                    state._fsp--;

                    stream_pathOneInPropertySet.add(pathOneInPropertySet318.getTree());

                    // AST REWRITE
                    // elements: pathOneInPropertySet
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 431:28: -> ^( PATH_NEGATED pathOneInPropertySet )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:431:31: ^( PATH_NEGATED pathOneInPropertySet )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PATH_NEGATED, "PATH_NEGATED")
                        , root_1);

                        adaptor.addChild(root_1, stream_pathOneInPropertySet.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:432:7: OPEN_BRACE ( pathOneInPropertySet ( PIPE pathOneInPropertySet )* )? CLOSE_BRACE
                    {
                    OPEN_BRACE319=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_pathNegatedPropertySet3574);  
                    stream_OPEN_BRACE.add(OPEN_BRACE319);


                    // com\\googlecode\\sparkleg\\Sparql.g:432:18: ( pathOneInPropertySet ( PIPE pathOneInPropertySet )* )?
                    int alt107=2;
                    switch ( input.LA(1) ) {
                        case A:
                        case INVERSE:
                        case IRI_REF:
                        case PNAME_LN:
                        case PNAME_NS:
                            {
                            alt107=1;
                            }
                            break;
                    }

                    switch (alt107) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:432:19: pathOneInPropertySet ( PIPE pathOneInPropertySet )*
                            {
                            pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3577);
                            pathOneInPropertySet320=pathOneInPropertySet();

                            state._fsp--;

                            stream_pathOneInPropertySet.add(pathOneInPropertySet320.getTree());

                            // com\\googlecode\\sparkleg\\Sparql.g:432:40: ( PIPE pathOneInPropertySet )*
                            loop106:
                            do {
                                int alt106=2;
                                switch ( input.LA(1) ) {
                                case PIPE:
                                    {
                                    alt106=1;
                                    }
                                    break;

                                }

                                switch (alt106) {
                            	case 1 :
                            	    // com\\googlecode\\sparkleg\\Sparql.g:432:41: PIPE pathOneInPropertySet
                            	    {
                            	    PIPE321=(Token)match(input,PIPE,FOLLOW_PIPE_in_pathNegatedPropertySet3580);  
                            	    stream_PIPE.add(PIPE321);


                            	    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3582);
                            	    pathOneInPropertySet322=pathOneInPropertySet();

                            	    state._fsp--;

                            	    stream_pathOneInPropertySet.add(pathOneInPropertySet322.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop106;
                                }
                            } while (true);


                            }
                            break;

                    }


                    CLOSE_BRACE323=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_pathNegatedPropertySet3588);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE323);


                    // AST REWRITE
                    // elements: pathOneInPropertySet
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 432:83: -> ^( PATH_NEGATED ( pathOneInPropertySet )+ )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:432:86: ^( PATH_NEGATED ( pathOneInPropertySet )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PATH_NEGATED, "PATH_NEGATED")
                        , root_1);

                        if ( !(stream_pathOneInPropertySet.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_pathOneInPropertySet.hasNext() ) {
                            adaptor.addChild(root_1, stream_pathOneInPropertySet.nextTree());

                        }
                        stream_pathOneInPropertySet.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathNegatedPropertySet"


    public static class pathOneInPropertySet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathOneInPropertySet"
    // com\\googlecode\\sparkleg\\Sparql.g:435:1: pathOneInPropertySet : ( INVERSE )? ( iriRef | A ) ;
    public final SparqlParser.pathOneInPropertySet_return pathOneInPropertySet() throws RecognitionException {
        SparqlParser.pathOneInPropertySet_return retval = new SparqlParser.pathOneInPropertySet_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INVERSE324=null;
        Token A326=null;
        SparqlParser.iriRef_return iriRef325 =null;


        Object INVERSE324_tree=null;
        Object A326_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:436:5: ( ( INVERSE )? ( iriRef | A ) )
            // com\\googlecode\\sparkleg\\Sparql.g:436:7: ( INVERSE )? ( iriRef | A )
            {
            root_0 = (Object)adaptor.nil();


            // com\\googlecode\\sparkleg\\Sparql.g:436:7: ( INVERSE )?
            int alt109=2;
            switch ( input.LA(1) ) {
                case INVERSE:
                    {
                    alt109=1;
                    }
                    break;
            }

            switch (alt109) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:436:7: INVERSE
                    {
                    INVERSE324=(Token)match(input,INVERSE,FOLLOW_INVERSE_in_pathOneInPropertySet3617); 
                    INVERSE324_tree = 
                    (Object)adaptor.create(INVERSE324)
                    ;
                    adaptor.addChild(root_0, INVERSE324_tree);


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:436:16: ( iriRef | A )
            int alt110=2;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt110=1;
                }
                break;
            case A:
                {
                alt110=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;

            }

            switch (alt110) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:436:17: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_pathOneInPropertySet3621);
                    iriRef325=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef325.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:436:26: A
                    {
                    A326=(Token)match(input,A,FOLLOW_A_in_pathOneInPropertySet3625); 
                    A326_tree = 
                    (Object)adaptor.create(A326)
                    ;
                    adaptor.addChild(root_0, A326_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathOneInPropertySet"


    public static class triplesNode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triplesNode"
    // com\\googlecode\\sparkleg\\Sparql.g:439:1: triplesNode : ( OPEN_BRACE ( graphNode )+ CLOSE_BRACE -> ^( COLLECTION ( graphNode )+ ) | OPEN_SQUARE_BRACKET propertyListNotEmpty CLOSE_SQUARE_BRACKET -> ^( TRIPLES_NODE propertyListNotEmpty ) );
    public final SparqlParser.triplesNode_return triplesNode() throws RecognitionException {
        SparqlParser.triplesNode_return retval = new SparqlParser.triplesNode_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_BRACE327=null;
        Token CLOSE_BRACE329=null;
        Token OPEN_SQUARE_BRACKET330=null;
        Token CLOSE_SQUARE_BRACKET332=null;
        SparqlParser.graphNode_return graphNode328 =null;

        SparqlParser.propertyListNotEmpty_return propertyListNotEmpty331 =null;


        Object OPEN_BRACE327_tree=null;
        Object CLOSE_BRACE329_tree=null;
        Object OPEN_SQUARE_BRACKET330_tree=null;
        Object CLOSE_SQUARE_BRACKET332_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_SQUARE_BRACKET=new RewriteRuleTokenStream(adaptor,"token OPEN_SQUARE_BRACKET");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_CLOSE_SQUARE_BRACKET=new RewriteRuleTokenStream(adaptor,"token CLOSE_SQUARE_BRACKET");
        RewriteRuleSubtreeStream stream_graphNode=new RewriteRuleSubtreeStream(adaptor,"rule graphNode");
        RewriteRuleSubtreeStream stream_propertyListNotEmpty=new RewriteRuleSubtreeStream(adaptor,"rule propertyListNotEmpty");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:440:5: ( OPEN_BRACE ( graphNode )+ CLOSE_BRACE -> ^( COLLECTION ( graphNode )+ ) | OPEN_SQUARE_BRACKET propertyListNotEmpty CLOSE_SQUARE_BRACKET -> ^( TRIPLES_NODE propertyListNotEmpty ) )
            int alt112=2;
            switch ( input.LA(1) ) {
            case OPEN_BRACE:
                {
                alt112=1;
                }
                break;
            case OPEN_SQUARE_BRACKET:
                {
                alt112=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;

            }

            switch (alt112) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:440:7: OPEN_BRACE ( graphNode )+ CLOSE_BRACE
                    {
                    OPEN_BRACE327=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_triplesNode3644);  
                    stream_OPEN_BRACE.add(OPEN_BRACE327);


                    // com\\googlecode\\sparkleg\\Sparql.g:440:18: ( graphNode )+
                    int cnt111=0;
                    loop111:
                    do {
                        int alt111=2;
                        switch ( input.LA(1) ) {
                        case BLANK_NODE_LABEL:
                        case DECIMAL:
                        case DECIMAL_NEGATIVE:
                        case DECIMAL_POSITIVE:
                        case DOUBLE:
                        case DOUBLE_NEGATIVE:
                        case DOUBLE_POSITIVE:
                        case FALSE:
                        case INTEGER:
                        case INTEGER_NEGATIVE:
                        case INTEGER_POSITIVE:
                        case IRI_REF:
                        case OPEN_BRACE:
                        case OPEN_SQUARE_BRACKET:
                        case PNAME_LN:
                        case PNAME_NS:
                        case STRING_LITERAL1:
                        case STRING_LITERAL2:
                        case STRING_LITERAL_LONG1:
                        case STRING_LITERAL_LONG2:
                        case TRUE:
                        case VAR1:
                        case VAR2:
                            {
                            alt111=1;
                            }
                            break;

                        }

                        switch (alt111) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:440:18: graphNode
                    	    {
                    	    pushFollow(FOLLOW_graphNode_in_triplesNode3646);
                    	    graphNode328=graphNode();

                    	    state._fsp--;

                    	    stream_graphNode.add(graphNode328.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt111 >= 1 ) break loop111;
                                EarlyExitException eee =
                                    new EarlyExitException(111, input);
                                throw eee;
                        }
                        cnt111++;
                    } while (true);


                    CLOSE_BRACE329=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_triplesNode3649);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE329);


                    // AST REWRITE
                    // elements: graphNode
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 440:41: -> ^( COLLECTION ( graphNode )+ )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:440:44: ^( COLLECTION ( graphNode )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(COLLECTION, "COLLECTION")
                        , root_1);

                        if ( !(stream_graphNode.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_graphNode.hasNext() ) {
                            adaptor.addChild(root_1, stream_graphNode.nextTree());

                        }
                        stream_graphNode.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:441:7: OPEN_SQUARE_BRACKET propertyListNotEmpty CLOSE_SQUARE_BRACKET
                    {
                    OPEN_SQUARE_BRACKET330=(Token)match(input,OPEN_SQUARE_BRACKET,FOLLOW_OPEN_SQUARE_BRACKET_in_triplesNode3666);  
                    stream_OPEN_SQUARE_BRACKET.add(OPEN_SQUARE_BRACKET330);


                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesNode3668);
                    propertyListNotEmpty331=propertyListNotEmpty();

                    state._fsp--;

                    stream_propertyListNotEmpty.add(propertyListNotEmpty331.getTree());

                    CLOSE_SQUARE_BRACKET332=(Token)match(input,CLOSE_SQUARE_BRACKET,FOLLOW_CLOSE_SQUARE_BRACKET_in_triplesNode3670);  
                    stream_CLOSE_SQUARE_BRACKET.add(CLOSE_SQUARE_BRACKET332);


                    // AST REWRITE
                    // elements: propertyListNotEmpty
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 441:69: -> ^( TRIPLES_NODE propertyListNotEmpty )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:441:72: ^( TRIPLES_NODE propertyListNotEmpty )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(TRIPLES_NODE, "TRIPLES_NODE")
                        , root_1);

                        adaptor.addChild(root_1, stream_propertyListNotEmpty.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triplesNode"


    public static class graphNode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphNode"
    // com\\googlecode\\sparkleg\\Sparql.g:444:1: graphNode : ( varOrTerm | triplesNode );
    public final SparqlParser.graphNode_return graphNode() throws RecognitionException {
        SparqlParser.graphNode_return retval = new SparqlParser.graphNode_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.varOrTerm_return varOrTerm333 =null;

        SparqlParser.triplesNode_return triplesNode334 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:445:5: ( varOrTerm | triplesNode )
            int alt113=2;
            switch ( input.LA(1) ) {
            case BLANK_NODE_LABEL:
            case DECIMAL:
            case DECIMAL_NEGATIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE:
            case DOUBLE_NEGATIVE:
            case DOUBLE_POSITIVE:
            case FALSE:
            case INTEGER:
            case INTEGER_NEGATIVE:
            case INTEGER_POSITIVE:
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
            case TRUE:
            case VAR1:
            case VAR2:
                {
                alt113=1;
                }
                break;
            case OPEN_SQUARE_BRACKET:
                {
                switch ( input.LA(2) ) {
                case CLOSE_SQUARE_BRACKET:
                    {
                    alt113=1;
                    }
                    break;
                case A:
                case INVERSE:
                case IRI_REF:
                case NEGATION:
                case OPEN_BRACE:
                case PNAME_LN:
                case PNAME_NS:
                case VAR1:
                case VAR2:
                    {
                    alt113=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 2, input);

                    throw nvae;

                }

                }
                break;
            case OPEN_BRACE:
                {
                switch ( input.LA(2) ) {
                case CLOSE_BRACE:
                    {
                    alt113=1;
                    }
                    break;
                case BLANK_NODE_LABEL:
                case DECIMAL:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case FALSE:
                case INTEGER:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI_REF:
                case OPEN_BRACE:
                case OPEN_SQUARE_BRACKET:
                case PNAME_LN:
                case PNAME_NS:
                case STRING_LITERAL1:
                case STRING_LITERAL2:
                case STRING_LITERAL_LONG1:
                case STRING_LITERAL_LONG2:
                case TRUE:
                case VAR1:
                case VAR2:
                    {
                    alt113=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 3, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;

            }

            switch (alt113) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:445:7: varOrTerm
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varOrTerm_in_graphNode3695);
                    varOrTerm333=varOrTerm();

                    state._fsp--;

                    adaptor.addChild(root_0, varOrTerm333.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:445:19: triplesNode
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_triplesNode_in_graphNode3699);
                    triplesNode334=triplesNode();

                    state._fsp--;

                    adaptor.addChild(root_0, triplesNode334.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphNode"


    public static class varOrTerm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varOrTerm"
    // com\\googlecode\\sparkleg\\Sparql.g:448:1: varOrTerm : ( var | graphTerm );
    public final SparqlParser.varOrTerm_return varOrTerm() throws RecognitionException {
        SparqlParser.varOrTerm_return retval = new SparqlParser.varOrTerm_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.var_return var335 =null;

        SparqlParser.graphTerm_return graphTerm336 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:449:5: ( var | graphTerm )
            int alt114=2;
            switch ( input.LA(1) ) {
            case VAR1:
            case VAR2:
                {
                alt114=1;
                }
                break;
            case BLANK_NODE_LABEL:
            case DECIMAL:
            case DECIMAL_NEGATIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE:
            case DOUBLE_NEGATIVE:
            case DOUBLE_POSITIVE:
            case FALSE:
            case INTEGER:
            case INTEGER_NEGATIVE:
            case INTEGER_POSITIVE:
            case IRI_REF:
            case OPEN_BRACE:
            case OPEN_SQUARE_BRACKET:
            case PNAME_LN:
            case PNAME_NS:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
            case TRUE:
                {
                alt114=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }

            switch (alt114) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:449:7: var
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_var_in_varOrTerm3716);
                    var335=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var335.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:450:7: graphTerm
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_graphTerm_in_varOrTerm3724);
                    graphTerm336=graphTerm();

                    state._fsp--;

                    adaptor.addChild(root_0, graphTerm336.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varOrTerm"


    public static class varOrIRIref_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varOrIRIref"
    // com\\googlecode\\sparkleg\\Sparql.g:453:1: varOrIRIref : ( var | iriRef );
    public final SparqlParser.varOrIRIref_return varOrIRIref() throws RecognitionException {
        SparqlParser.varOrIRIref_return retval = new SparqlParser.varOrIRIref_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.var_return var337 =null;

        SparqlParser.iriRef_return iriRef338 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:454:5: ( var | iriRef )
            int alt115=2;
            switch ( input.LA(1) ) {
            case VAR1:
            case VAR2:
                {
                alt115=1;
                }
                break;
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt115=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }

            switch (alt115) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:454:7: var
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_var_in_varOrIRIref3741);
                    var337=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var337.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:454:13: iriRef
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iriRef_in_varOrIRIref3745);
                    iriRef338=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef338.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varOrIRIref"


    public static class var_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var"
    // com\\googlecode\\sparkleg\\Sparql.g:457:1: var : ( VAR1 | VAR2 );
    public final SparqlParser.var_return var() throws RecognitionException {
        SparqlParser.var_return retval = new SparqlParser.var_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set339=null;

        Object set339_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:458:5: ( VAR1 | VAR2 )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();


            set339=(Token)input.LT(1);

            if ( (input.LA(1) >= VAR1 && input.LA(1) <= VAR2) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set339)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var"


    public static class graphTerm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphTerm"
    // com\\googlecode\\sparkleg\\Sparql.g:461:1: graphTerm : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil );
    public final SparqlParser.graphTerm_return graphTerm() throws RecognitionException {
        SparqlParser.graphTerm_return retval = new SparqlParser.graphTerm_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.iriRef_return iriRef340 =null;

        SparqlParser.rdfLiteral_return rdfLiteral341 =null;

        SparqlParser.numericLiteral_return numericLiteral342 =null;

        SparqlParser.booleanLiteral_return booleanLiteral343 =null;

        SparqlParser.blankNode_return blankNode344 =null;

        SparqlParser.nil_return nil345 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:462:5: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil )
            int alt116=6;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt116=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt116=2;
                }
                break;
            case DECIMAL:
            case DECIMAL_NEGATIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE:
            case DOUBLE_NEGATIVE:
            case DOUBLE_POSITIVE:
            case INTEGER:
            case INTEGER_NEGATIVE:
            case INTEGER_POSITIVE:
                {
                alt116=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt116=4;
                }
                break;
            case BLANK_NODE_LABEL:
            case OPEN_SQUARE_BRACKET:
                {
                alt116=5;
                }
                break;
            case OPEN_BRACE:
                {
                alt116=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;

            }

            switch (alt116) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:462:7: iriRef
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iriRef_in_graphTerm3783);
                    iriRef340=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef340.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:463:7: rdfLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_rdfLiteral_in_graphTerm3791);
                    rdfLiteral341=rdfLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, rdfLiteral341.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:464:7: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numericLiteral_in_graphTerm3799);
                    numericLiteral342=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral342.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:465:7: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm3807);
                    booleanLiteral343=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral343.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:466:7: blankNode
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_blankNode_in_graphTerm3815);
                    blankNode344=blankNode();

                    state._fsp--;

                    adaptor.addChild(root_0, blankNode344.getTree());

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:467:7: nil
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_nil_in_graphTerm3823);
                    nil345=nil();

                    state._fsp--;

                    adaptor.addChild(root_0, nil345.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphTerm"


    public static class nil_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nil"
    // com\\googlecode\\sparkleg\\Sparql.g:470:1: nil : OPEN_BRACE CLOSE_BRACE ;
    public final SparqlParser.nil_return nil() throws RecognitionException {
        SparqlParser.nil_return retval = new SparqlParser.nil_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_BRACE346=null;
        Token CLOSE_BRACE347=null;

        Object OPEN_BRACE346_tree=null;
        Object CLOSE_BRACE347_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:471:5: ( OPEN_BRACE CLOSE_BRACE )
            // com\\googlecode\\sparkleg\\Sparql.g:471:7: OPEN_BRACE CLOSE_BRACE
            {
            root_0 = (Object)adaptor.nil();


            OPEN_BRACE346=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_nil3844); 
            OPEN_BRACE346_tree = 
            (Object)adaptor.create(OPEN_BRACE346)
            ;
            adaptor.addChild(root_0, OPEN_BRACE346_tree);


            CLOSE_BRACE347=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_nil3846); 
            CLOSE_BRACE347_tree = 
            (Object)adaptor.create(CLOSE_BRACE347)
            ;
            adaptor.addChild(root_0, CLOSE_BRACE347_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nil"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // com\\googlecode\\sparkleg\\Sparql.g:474:1: expression : conditionalOrExpression ;
    public final SparqlParser.expression_return expression() throws RecognitionException {
        SparqlParser.expression_return retval = new SparqlParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.conditionalOrExpression_return conditionalOrExpression348 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:475:5: ( conditionalOrExpression )
            // com\\googlecode\\sparkleg\\Sparql.g:475:7: conditionalOrExpression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditionalOrExpression_in_expression3863);
            conditionalOrExpression348=conditionalOrExpression();

            state._fsp--;

            adaptor.addChild(root_0, conditionalOrExpression348.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalOrExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:478:1: conditionalOrExpression : (c1= conditionalAndExpression -> $c1) ( OR c2= conditionalAndExpression -> ^( OR $conditionalOrExpression $c2) )* ;
    public final SparqlParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        SparqlParser.conditionalOrExpression_return retval = new SparqlParser.conditionalOrExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR349=null;
        SparqlParser.conditionalAndExpression_return c1 =null;

        SparqlParser.conditionalAndExpression_return c2 =null;


        Object OR349_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_conditionalAndExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalAndExpression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:479:5: ( (c1= conditionalAndExpression -> $c1) ( OR c2= conditionalAndExpression -> ^( OR $conditionalOrExpression $c2) )* )
            // com\\googlecode\\sparkleg\\Sparql.g:479:7: (c1= conditionalAndExpression -> $c1) ( OR c2= conditionalAndExpression -> ^( OR $conditionalOrExpression $c2) )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:479:7: (c1= conditionalAndExpression -> $c1)
            // com\\googlecode\\sparkleg\\Sparql.g:479:8: c1= conditionalAndExpression
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression3883);
            c1=conditionalAndExpression();

            state._fsp--;

            stream_conditionalAndExpression.add(c1.getTree());

            // AST REWRITE
            // elements: c1
            // token labels: 
            // rule labels: retval, c1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 479:36: -> $c1
            {
                adaptor.addChild(root_0, stream_c1.nextTree());

            }


            retval.tree = root_0;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:479:44: ( OR c2= conditionalAndExpression -> ^( OR $conditionalOrExpression $c2) )*
            loop117:
            do {
                int alt117=2;
                switch ( input.LA(1) ) {
                case OR:
                    {
                    alt117=1;
                    }
                    break;

                }

                switch (alt117) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:479:45: OR c2= conditionalAndExpression
            	    {
            	    OR349=(Token)match(input,OR,FOLLOW_OR_in_conditionalOrExpression3892);  
            	    stream_OR.add(OR349);


            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression3896);
            	    c2=conditionalAndExpression();

            	    state._fsp--;

            	    stream_conditionalAndExpression.add(c2.getTree());

            	    // AST REWRITE
            	    // elements: conditionalOrExpression, OR, c2
            	    // token labels: 
            	    // rule labels: retval, c2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 479:76: -> ^( OR $conditionalOrExpression $c2)
            	    {
            	        // com\\googlecode\\sparkleg\\Sparql.g:479:79: ^( OR $conditionalOrExpression $c2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        stream_OR.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_c2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"


    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalAndExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:482:1: conditionalAndExpression : (v1= valueLogical -> $v1) ( AND v2= valueLogical -> ^( AND $conditionalAndExpression $v2) )* ;
    public final SparqlParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        SparqlParser.conditionalAndExpression_return retval = new SparqlParser.conditionalAndExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND350=null;
        SparqlParser.valueLogical_return v1 =null;

        SparqlParser.valueLogical_return v2 =null;


        Object AND350_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_valueLogical=new RewriteRuleSubtreeStream(adaptor,"rule valueLogical");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:483:5: ( (v1= valueLogical -> $v1) ( AND v2= valueLogical -> ^( AND $conditionalAndExpression $v2) )* )
            // com\\googlecode\\sparkleg\\Sparql.g:483:7: (v1= valueLogical -> $v1) ( AND v2= valueLogical -> ^( AND $conditionalAndExpression $v2) )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:483:7: (v1= valueLogical -> $v1)
            // com\\googlecode\\sparkleg\\Sparql.g:483:8: v1= valueLogical
            {
            pushFollow(FOLLOW_valueLogical_in_conditionalAndExpression3930);
            v1=valueLogical();

            state._fsp--;

            stream_valueLogical.add(v1.getTree());

            // AST REWRITE
            // elements: v1
            // token labels: 
            // rule labels: v1, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_v1=new RewriteRuleSubtreeStream(adaptor,"rule v1",v1!=null?v1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 483:24: -> $v1
            {
                adaptor.addChild(root_0, stream_v1.nextTree());

            }


            retval.tree = root_0;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:483:32: ( AND v2= valueLogical -> ^( AND $conditionalAndExpression $v2) )*
            loop118:
            do {
                int alt118=2;
                switch ( input.LA(1) ) {
                case AND:
                    {
                    alt118=1;
                    }
                    break;

                }

                switch (alt118) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:483:33: AND v2= valueLogical
            	    {
            	    AND350=(Token)match(input,AND,FOLLOW_AND_in_conditionalAndExpression3939);  
            	    stream_AND.add(AND350);


            	    pushFollow(FOLLOW_valueLogical_in_conditionalAndExpression3943);
            	    v2=valueLogical();

            	    state._fsp--;

            	    stream_valueLogical.add(v2.getTree());

            	    // AST REWRITE
            	    // elements: v2, conditionalAndExpression, AND
            	    // token labels: 
            	    // rule labels: retval, v2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_v2=new RewriteRuleSubtreeStream(adaptor,"rule v2",v2!=null?v2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 483:53: -> ^( AND $conditionalAndExpression $v2)
            	    {
            	        // com\\googlecode\\sparkleg\\Sparql.g:483:56: ^( AND $conditionalAndExpression $v2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        stream_AND.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_v2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"


    public static class valueLogical_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "valueLogical"
    // com\\googlecode\\sparkleg\\Sparql.g:486:1: valueLogical : relationalExpression ;
    public final SparqlParser.valueLogical_return valueLogical() throws RecognitionException {
        SparqlParser.valueLogical_return retval = new SparqlParser.valueLogical_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.relationalExpression_return relationalExpression351 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:487:5: ( relationalExpression )
            // com\\googlecode\\sparkleg\\Sparql.g:487:7: relationalExpression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relationalExpression_in_valueLogical3974);
            relationalExpression351=relationalExpression();

            state._fsp--;

            adaptor.addChild(root_0, relationalExpression351.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "valueLogical"


    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:490:1: relationalExpression : (n1= numericExpression -> $n1) ( ( EQUAL n2= numericExpression -> ^( EQUAL $relationalExpression $n2) ) | ( NOT_EQUAL n3= numericExpression -> ^( NOT_EQUAL $relationalExpression $n3) ) | ( LESS n4= numericExpression -> ^( LESS $relationalExpression $n4) ) | ( GREATER n5= numericExpression -> ^( GREATER $relationalExpression $n5) ) | ( LESS_EQUAL n6= numericExpression -> ^( LESS_EQUAL $relationalExpression $n6) ) | ( GREATER_EQUAL n7= numericExpression -> ^( GREATER_EQUAL $relationalExpression $n7) ) | ( IN l2= expressionList -> ^( IN $relationalExpression $l2) ) | ( NOT IN l3= expressionList -> ^( NOT IN $relationalExpression $l3) ) )? ;
    public final SparqlParser.relationalExpression_return relationalExpression() throws RecognitionException {
        SparqlParser.relationalExpression_return retval = new SparqlParser.relationalExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUAL352=null;
        Token NOT_EQUAL353=null;
        Token LESS354=null;
        Token GREATER355=null;
        Token LESS_EQUAL356=null;
        Token GREATER_EQUAL357=null;
        Token IN358=null;
        Token NOT359=null;
        Token IN360=null;
        SparqlParser.numericExpression_return n1 =null;

        SparqlParser.numericExpression_return n2 =null;

        SparqlParser.numericExpression_return n3 =null;

        SparqlParser.numericExpression_return n4 =null;

        SparqlParser.numericExpression_return n5 =null;

        SparqlParser.numericExpression_return n6 =null;

        SparqlParser.numericExpression_return n7 =null;

        SparqlParser.expressionList_return l2 =null;

        SparqlParser.expressionList_return l3 =null;


        Object EQUAL352_tree=null;
        Object NOT_EQUAL353_tree=null;
        Object LESS354_tree=null;
        Object GREATER355_tree=null;
        Object LESS_EQUAL356_tree=null;
        Object GREATER_EQUAL357_tree=null;
        Object IN358_tree=null;
        Object NOT359_tree=null;
        Object IN360_tree=null;
        RewriteRuleTokenStream stream_GREATER=new RewriteRuleTokenStream(adaptor,"token GREATER");
        RewriteRuleTokenStream stream_LESS_EQUAL=new RewriteRuleTokenStream(adaptor,"token LESS_EQUAL");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NOT_EQUAL=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL");
        RewriteRuleTokenStream stream_GREATER_EQUAL=new RewriteRuleTokenStream(adaptor,"token GREATER_EQUAL");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_LESS=new RewriteRuleTokenStream(adaptor,"token LESS");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_numericExpression=new RewriteRuleSubtreeStream(adaptor,"rule numericExpression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:491:5: ( (n1= numericExpression -> $n1) ( ( EQUAL n2= numericExpression -> ^( EQUAL $relationalExpression $n2) ) | ( NOT_EQUAL n3= numericExpression -> ^( NOT_EQUAL $relationalExpression $n3) ) | ( LESS n4= numericExpression -> ^( LESS $relationalExpression $n4) ) | ( GREATER n5= numericExpression -> ^( GREATER $relationalExpression $n5) ) | ( LESS_EQUAL n6= numericExpression -> ^( LESS_EQUAL $relationalExpression $n6) ) | ( GREATER_EQUAL n7= numericExpression -> ^( GREATER_EQUAL $relationalExpression $n7) ) | ( IN l2= expressionList -> ^( IN $relationalExpression $l2) ) | ( NOT IN l3= expressionList -> ^( NOT IN $relationalExpression $l3) ) )? )
            // com\\googlecode\\sparkleg\\Sparql.g:491:7: (n1= numericExpression -> $n1) ( ( EQUAL n2= numericExpression -> ^( EQUAL $relationalExpression $n2) ) | ( NOT_EQUAL n3= numericExpression -> ^( NOT_EQUAL $relationalExpression $n3) ) | ( LESS n4= numericExpression -> ^( LESS $relationalExpression $n4) ) | ( GREATER n5= numericExpression -> ^( GREATER $relationalExpression $n5) ) | ( LESS_EQUAL n6= numericExpression -> ^( LESS_EQUAL $relationalExpression $n6) ) | ( GREATER_EQUAL n7= numericExpression -> ^( GREATER_EQUAL $relationalExpression $n7) ) | ( IN l2= expressionList -> ^( IN $relationalExpression $l2) ) | ( NOT IN l3= expressionList -> ^( NOT IN $relationalExpression $l3) ) )?
            {
            // com\\googlecode\\sparkleg\\Sparql.g:491:7: (n1= numericExpression -> $n1)
            // com\\googlecode\\sparkleg\\Sparql.g:491:8: n1= numericExpression
            {
            pushFollow(FOLLOW_numericExpression_in_relationalExpression3994);
            n1=numericExpression();

            state._fsp--;

            stream_numericExpression.add(n1.getTree());

            // AST REWRITE
            // elements: n1
            // token labels: 
            // rule labels: n1, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 491:29: -> $n1
            {
                adaptor.addChild(root_0, stream_n1.nextTree());

            }


            retval.tree = root_0;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:491:37: ( ( EQUAL n2= numericExpression -> ^( EQUAL $relationalExpression $n2) ) | ( NOT_EQUAL n3= numericExpression -> ^( NOT_EQUAL $relationalExpression $n3) ) | ( LESS n4= numericExpression -> ^( LESS $relationalExpression $n4) ) | ( GREATER n5= numericExpression -> ^( GREATER $relationalExpression $n5) ) | ( LESS_EQUAL n6= numericExpression -> ^( LESS_EQUAL $relationalExpression $n6) ) | ( GREATER_EQUAL n7= numericExpression -> ^( GREATER_EQUAL $relationalExpression $n7) ) | ( IN l2= expressionList -> ^( IN $relationalExpression $l2) ) | ( NOT IN l3= expressionList -> ^( NOT IN $relationalExpression $l3) ) )?
            int alt119=9;
            switch ( input.LA(1) ) {
                case EQUAL:
                    {
                    alt119=1;
                    }
                    break;
                case NOT_EQUAL:
                    {
                    alt119=2;
                    }
                    break;
                case LESS:
                    {
                    alt119=3;
                    }
                    break;
                case GREATER:
                    {
                    alt119=4;
                    }
                    break;
                case LESS_EQUAL:
                    {
                    alt119=5;
                    }
                    break;
                case GREATER_EQUAL:
                    {
                    alt119=6;
                    }
                    break;
                case IN:
                    {
                    alt119=7;
                    }
                    break;
                case NOT:
                    {
                    alt119=8;
                    }
                    break;
            }

            switch (alt119) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:491:38: ( EQUAL n2= numericExpression -> ^( EQUAL $relationalExpression $n2) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:491:38: ( EQUAL n2= numericExpression -> ^( EQUAL $relationalExpression $n2) )
                    // com\\googlecode\\sparkleg\\Sparql.g:491:39: EQUAL n2= numericExpression
                    {
                    EQUAL352=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_relationalExpression4004);  
                    stream_EQUAL.add(EQUAL352);


                    pushFollow(FOLLOW_numericExpression_in_relationalExpression4008);
                    n2=numericExpression();

                    state._fsp--;

                    stream_numericExpression.add(n2.getTree());

                    // AST REWRITE
                    // elements: relationalExpression, EQUAL, n2
                    // token labels: 
                    // rule labels: retval, n2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n2=new RewriteRuleSubtreeStream(adaptor,"rule n2",n2!=null?n2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 491:66: -> ^( EQUAL $relationalExpression $n2)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:491:69: ^( EQUAL $relationalExpression $n2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EQUAL.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_1, stream_n2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:492:39: ( NOT_EQUAL n3= numericExpression -> ^( NOT_EQUAL $relationalExpression $n3) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:492:39: ( NOT_EQUAL n3= numericExpression -> ^( NOT_EQUAL $relationalExpression $n3) )
                    // com\\googlecode\\sparkleg\\Sparql.g:492:40: NOT_EQUAL n3= numericExpression
                    {
                    NOT_EQUAL353=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_relationalExpression4065);  
                    stream_NOT_EQUAL.add(NOT_EQUAL353);


                    pushFollow(FOLLOW_numericExpression_in_relationalExpression4069);
                    n3=numericExpression();

                    state._fsp--;

                    stream_numericExpression.add(n3.getTree());

                    // AST REWRITE
                    // elements: relationalExpression, NOT_EQUAL, n3
                    // token labels: 
                    // rule labels: retval, n3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n3=new RewriteRuleSubtreeStream(adaptor,"rule n3",n3!=null?n3.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 492:71: -> ^( NOT_EQUAL $relationalExpression $n3)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:492:74: ^( NOT_EQUAL $relationalExpression $n3)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_NOT_EQUAL.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_1, stream_n3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:493:39: ( LESS n4= numericExpression -> ^( LESS $relationalExpression $n4) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:493:39: ( LESS n4= numericExpression -> ^( LESS $relationalExpression $n4) )
                    // com\\googlecode\\sparkleg\\Sparql.g:493:40: LESS n4= numericExpression
                    {
                    LESS354=(Token)match(input,LESS,FOLLOW_LESS_in_relationalExpression4124);  
                    stream_LESS.add(LESS354);


                    pushFollow(FOLLOW_numericExpression_in_relationalExpression4128);
                    n4=numericExpression();

                    state._fsp--;

                    stream_numericExpression.add(n4.getTree());

                    // AST REWRITE
                    // elements: n4, relationalExpression, LESS
                    // token labels: 
                    // rule labels: retval, n4
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n4=new RewriteRuleSubtreeStream(adaptor,"rule n4",n4!=null?n4.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 493:66: -> ^( LESS $relationalExpression $n4)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:493:69: ^( LESS $relationalExpression $n4)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LESS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_1, stream_n4.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:494:39: ( GREATER n5= numericExpression -> ^( GREATER $relationalExpression $n5) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:494:39: ( GREATER n5= numericExpression -> ^( GREATER $relationalExpression $n5) )
                    // com\\googlecode\\sparkleg\\Sparql.g:494:40: GREATER n5= numericExpression
                    {
                    GREATER355=(Token)match(input,GREATER,FOLLOW_GREATER_in_relationalExpression4183);  
                    stream_GREATER.add(GREATER355);


                    pushFollow(FOLLOW_numericExpression_in_relationalExpression4187);
                    n5=numericExpression();

                    state._fsp--;

                    stream_numericExpression.add(n5.getTree());

                    // AST REWRITE
                    // elements: relationalExpression, GREATER, n5
                    // token labels: 
                    // rule labels: retval, n5
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n5=new RewriteRuleSubtreeStream(adaptor,"rule n5",n5!=null?n5.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 494:69: -> ^( GREATER $relationalExpression $n5)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:494:72: ^( GREATER $relationalExpression $n5)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_GREATER.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_1, stream_n5.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:495:39: ( LESS_EQUAL n6= numericExpression -> ^( LESS_EQUAL $relationalExpression $n6) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:495:39: ( LESS_EQUAL n6= numericExpression -> ^( LESS_EQUAL $relationalExpression $n6) )
                    // com\\googlecode\\sparkleg\\Sparql.g:495:40: LESS_EQUAL n6= numericExpression
                    {
                    LESS_EQUAL356=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_relationalExpression4241);  
                    stream_LESS_EQUAL.add(LESS_EQUAL356);


                    pushFollow(FOLLOW_numericExpression_in_relationalExpression4245);
                    n6=numericExpression();

                    state._fsp--;

                    stream_numericExpression.add(n6.getTree());

                    // AST REWRITE
                    // elements: relationalExpression, LESS_EQUAL, n6
                    // token labels: 
                    // rule labels: retval, n6
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n6=new RewriteRuleSubtreeStream(adaptor,"rule n6",n6!=null?n6.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 495:72: -> ^( LESS_EQUAL $relationalExpression $n6)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:495:75: ^( LESS_EQUAL $relationalExpression $n6)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LESS_EQUAL.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_1, stream_n6.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:496:39: ( GREATER_EQUAL n7= numericExpression -> ^( GREATER_EQUAL $relationalExpression $n7) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:496:39: ( GREATER_EQUAL n7= numericExpression -> ^( GREATER_EQUAL $relationalExpression $n7) )
                    // com\\googlecode\\sparkleg\\Sparql.g:496:40: GREATER_EQUAL n7= numericExpression
                    {
                    GREATER_EQUAL357=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_relationalExpression4299);  
                    stream_GREATER_EQUAL.add(GREATER_EQUAL357);


                    pushFollow(FOLLOW_numericExpression_in_relationalExpression4303);
                    n7=numericExpression();

                    state._fsp--;

                    stream_numericExpression.add(n7.getTree());

                    // AST REWRITE
                    // elements: relationalExpression, GREATER_EQUAL, n7
                    // token labels: 
                    // rule labels: retval, n7
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n7=new RewriteRuleSubtreeStream(adaptor,"rule n7",n7!=null?n7.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 496:75: -> ^( GREATER_EQUAL $relationalExpression $n7)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:496:78: ^( GREATER_EQUAL $relationalExpression $n7)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_GREATER_EQUAL.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_1, stream_n7.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\Sparql.g:497:39: ( IN l2= expressionList -> ^( IN $relationalExpression $l2) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:497:39: ( IN l2= expressionList -> ^( IN $relationalExpression $l2) )
                    // com\\googlecode\\sparkleg\\Sparql.g:497:40: IN l2= expressionList
                    {
                    IN358=(Token)match(input,IN,FOLLOW_IN_in_relationalExpression4359);  
                    stream_IN.add(IN358);


                    pushFollow(FOLLOW_expressionList_in_relationalExpression4363);
                    l2=expressionList();

                    state._fsp--;

                    stream_expressionList.add(l2.getTree());

                    // AST REWRITE
                    // elements: l2, IN, relationalExpression
                    // token labels: 
                    // rule labels: retval, l2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l2=new RewriteRuleSubtreeStream(adaptor,"rule l2",l2!=null?l2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 497:61: -> ^( IN $relationalExpression $l2)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:497:64: ^( IN $relationalExpression $l2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_1, stream_l2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\Sparql.g:498:39: ( NOT IN l3= expressionList -> ^( NOT IN $relationalExpression $l3) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:498:39: ( NOT IN l3= expressionList -> ^( NOT IN $relationalExpression $l3) )
                    // com\\googlecode\\sparkleg\\Sparql.g:498:40: NOT IN l3= expressionList
                    {
                    NOT359=(Token)match(input,NOT,FOLLOW_NOT_in_relationalExpression4417);  
                    stream_NOT.add(NOT359);


                    IN360=(Token)match(input,IN,FOLLOW_IN_in_relationalExpression4419);  
                    stream_IN.add(IN360);


                    pushFollow(FOLLOW_expressionList_in_relationalExpression4423);
                    l3=expressionList();

                    state._fsp--;

                    stream_expressionList.add(l3.getTree());

                    // AST REWRITE
                    // elements: IN, relationalExpression, l3, NOT
                    // token labels: 
                    // rule labels: retval, l3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l3=new RewriteRuleSubtreeStream(adaptor,"rule l3",l3!=null?l3.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 498:65: -> ^( NOT IN $relationalExpression $l3)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:498:68: ^( NOT IN $relationalExpression $l3)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_NOT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IN.nextNode()
                        );

                        adaptor.addChild(root_1, stream_retval.nextTree());

                        adaptor.addChild(root_1, stream_l3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"


    public static class numericExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:501:1: numericExpression : additiveExpression ;
    public final SparqlParser.numericExpression_return numericExpression() throws RecognitionException {
        SparqlParser.numericExpression_return retval = new SparqlParser.numericExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.additiveExpression_return additiveExpression361 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:502:5: ( additiveExpression )
            // com\\googlecode\\sparkleg\\Sparql.g:502:7: additiveExpression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additiveExpression_in_numericExpression4457);
            additiveExpression361=additiveExpression();

            state._fsp--;

            adaptor.addChild(root_0, additiveExpression361.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numericExpression"


    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additiveExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:505:1: additiveExpression : (m1= multiplicativeExpression -> $m1) ( ( additiveOperator m2= multiplicativeExpression -> ^( additiveOperator $additiveExpression $m2) ) | (n1= numericLiteralPositive -> ^( PLUS $additiveExpression $n1) |n2= numericLiteralNegative -> ^( PLUS $additiveExpression $n2) ) ( ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) ) | ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) ) )? )* ;
    public final SparqlParser.additiveExpression_return additiveExpression() throws RecognitionException {
        SparqlParser.additiveExpression_return retval = new SparqlParser.additiveExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASTERISK363=null;
        Token DIVIDE364=null;
        SparqlParser.multiplicativeExpression_return m1 =null;

        SparqlParser.multiplicativeExpression_return m2 =null;

        SparqlParser.numericLiteralPositive_return n1 =null;

        SparqlParser.numericLiteralNegative_return n2 =null;

        SparqlParser.unaryExpression_return u2 =null;

        SparqlParser.additiveOperator_return additiveOperator362 =null;


        Object ASTERISK363_tree=null;
        Object DIVIDE364_tree=null;
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_numericLiteralNegative=new RewriteRuleSubtreeStream(adaptor,"rule numericLiteralNegative");
        RewriteRuleSubtreeStream stream_numericLiteralPositive=new RewriteRuleSubtreeStream(adaptor,"rule numericLiteralPositive");
        RewriteRuleSubtreeStream stream_additiveOperator=new RewriteRuleSubtreeStream(adaptor,"rule additiveOperator");
        RewriteRuleSubtreeStream stream_multiplicativeExpression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicativeExpression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:506:5: ( (m1= multiplicativeExpression -> $m1) ( ( additiveOperator m2= multiplicativeExpression -> ^( additiveOperator $additiveExpression $m2) ) | (n1= numericLiteralPositive -> ^( PLUS $additiveExpression $n1) |n2= numericLiteralNegative -> ^( PLUS $additiveExpression $n2) ) ( ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) ) | ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) ) )? )* )
            // com\\googlecode\\sparkleg\\Sparql.g:506:7: (m1= multiplicativeExpression -> $m1) ( ( additiveOperator m2= multiplicativeExpression -> ^( additiveOperator $additiveExpression $m2) ) | (n1= numericLiteralPositive -> ^( PLUS $additiveExpression $n1) |n2= numericLiteralNegative -> ^( PLUS $additiveExpression $n2) ) ( ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) ) | ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) ) )? )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:506:7: (m1= multiplicativeExpression -> $m1)
            // com\\googlecode\\sparkleg\\Sparql.g:506:8: m1= multiplicativeExpression
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4477);
            m1=multiplicativeExpression();

            state._fsp--;

            stream_multiplicativeExpression.add(m1.getTree());

            // AST REWRITE
            // elements: m1
            // token labels: 
            // rule labels: retval, m1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"rule m1",m1!=null?m1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 506:36: -> $m1
            {
                adaptor.addChild(root_0, stream_m1.nextTree());

            }


            retval.tree = root_0;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:506:44: ( ( additiveOperator m2= multiplicativeExpression -> ^( additiveOperator $additiveExpression $m2) ) | (n1= numericLiteralPositive -> ^( PLUS $additiveExpression $n1) |n2= numericLiteralNegative -> ^( PLUS $additiveExpression $n2) ) ( ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) ) | ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) ) )? )*
            loop122:
            do {
                int alt122=3;
                switch ( input.LA(1) ) {
                case MINUS:
                case PLUS:
                    {
                    alt122=1;
                    }
                    break;
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                    {
                    alt122=2;
                    }
                    break;

                }

                switch (alt122) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:506:45: ( additiveOperator m2= multiplicativeExpression -> ^( additiveOperator $additiveExpression $m2) )
            	    {
            	    // com\\googlecode\\sparkleg\\Sparql.g:506:45: ( additiveOperator m2= multiplicativeExpression -> ^( additiveOperator $additiveExpression $m2) )
            	    // com\\googlecode\\sparkleg\\Sparql.g:506:46: additiveOperator m2= multiplicativeExpression
            	    {
            	    pushFollow(FOLLOW_additiveOperator_in_additiveExpression4487);
            	    additiveOperator362=additiveOperator();

            	    state._fsp--;

            	    stream_additiveOperator.add(additiveOperator362.getTree());

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4491);
            	    m2=multiplicativeExpression();

            	    state._fsp--;

            	    stream_multiplicativeExpression.add(m2.getTree());

            	    // AST REWRITE
            	    // elements: m2, additiveOperator, additiveExpression
            	    // token labels: 
            	    // rule labels: retval, m2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_m2=new RewriteRuleSubtreeStream(adaptor,"rule m2",m2!=null?m2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 506:91: -> ^( additiveOperator $additiveExpression $m2)
            	    {
            	        // com\\googlecode\\sparkleg\\Sparql.g:506:94: ^( additiveOperator $additiveExpression $m2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_additiveOperator.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_m2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:507:48: (n1= numericLiteralPositive -> ^( PLUS $additiveExpression $n1) |n2= numericLiteralNegative -> ^( PLUS $additiveExpression $n2) ) ( ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) ) | ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) ) )?
            	    {
            	    // com\\googlecode\\sparkleg\\Sparql.g:507:48: (n1= numericLiteralPositive -> ^( PLUS $additiveExpression $n1) |n2= numericLiteralNegative -> ^( PLUS $additiveExpression $n2) )
            	    int alt120=2;
            	    switch ( input.LA(1) ) {
            	    case DECIMAL_POSITIVE:
            	    case DOUBLE_POSITIVE:
            	    case INTEGER_POSITIVE:
            	        {
            	        alt120=1;
            	        }
            	        break;
            	    case DECIMAL_NEGATIVE:
            	    case DOUBLE_NEGATIVE:
            	    case INTEGER_NEGATIVE:
            	        {
            	        alt120=2;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 120, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt120) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:507:49: n1= numericLiteralPositive
            	            {
            	            pushFollow(FOLLOW_numericLiteralPositive_in_additiveExpression4558);
            	            n1=numericLiteralPositive();

            	            state._fsp--;

            	            stream_numericLiteralPositive.add(n1.getTree());

            	            // AST REWRITE
            	            // elements: additiveExpression, n1
            	            // token labels: 
            	            // rule labels: n1, retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 507:75: -> ^( PLUS $additiveExpression $n1)
            	            {
            	                // com\\googlecode\\sparkleg\\Sparql.g:507:78: ^( PLUS $additiveExpression $n1)
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(
            	                (Object)adaptor.create(PLUS, "PLUS")
            	                , root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());

            	                adaptor.addChild(root_1, stream_n1.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }


            	            retval.tree = root_0;

            	            }
            	            break;
            	        case 2 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:507:112: n2= numericLiteralNegative
            	            {
            	            pushFollow(FOLLOW_numericLiteralNegative_in_additiveExpression4576);
            	            n2=numericLiteralNegative();

            	            state._fsp--;

            	            stream_numericLiteralNegative.add(n2.getTree());

            	            // AST REWRITE
            	            // elements: additiveExpression, n2
            	            // token labels: 
            	            // rule labels: retval, n2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_n2=new RewriteRuleSubtreeStream(adaptor,"rule n2",n2!=null?n2.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 507:138: -> ^( PLUS $additiveExpression $n2)
            	            {
            	                // com\\googlecode\\sparkleg\\Sparql.g:507:141: ^( PLUS $additiveExpression $n2)
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(
            	                (Object)adaptor.create(PLUS, "PLUS")
            	                , root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());

            	                adaptor.addChild(root_1, stream_n2.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }


            	            retval.tree = root_0;

            	            }
            	            break;

            	    }


            	    // com\\googlecode\\sparkleg\\Sparql.g:508:46: ( ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) ) | ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) ) )?
            	    int alt121=3;
            	    switch ( input.LA(1) ) {
            	        case ASTERISK:
            	            {
            	            alt121=1;
            	            }
            	            break;
            	        case DIVIDE:
            	            {
            	            alt121=2;
            	            }
            	            break;
            	    }

            	    switch (alt121) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:508:47: ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) )
            	            {
            	            // com\\googlecode\\sparkleg\\Sparql.g:508:47: ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) )
            	            // com\\googlecode\\sparkleg\\Sparql.g:508:48: ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) )
            	            {
            	            // com\\googlecode\\sparkleg\\Sparql.g:508:48: ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) )
            	            // com\\googlecode\\sparkleg\\Sparql.g:508:49: ASTERISK u2= unaryExpression
            	            {
            	            ASTERISK363=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_additiveExpression4640);  
            	            stream_ASTERISK.add(ASTERISK363);


            	            pushFollow(FOLLOW_unaryExpression_in_additiveExpression4644);
            	            u2=unaryExpression();

            	            state._fsp--;

            	            stream_unaryExpression.add(u2.getTree());

            	            // AST REWRITE
            	            // elements: ASTERISK, u2, additiveExpression
            	            // token labels: 
            	            // rule labels: retval, u2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_u2=new RewriteRuleSubtreeStream(adaptor,"rule u2",u2!=null?u2.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 508:77: -> ^( ASTERISK $additiveExpression $u2)
            	            {
            	                // com\\googlecode\\sparkleg\\Sparql.g:508:80: ^( ASTERISK $additiveExpression $u2)
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(
            	                stream_ASTERISK.nextNode()
            	                , root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());

            	                adaptor.addChild(root_1, stream_u2.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }


            	            retval.tree = root_0;

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:509:48: ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) )
            	            {
            	            // com\\googlecode\\sparkleg\\Sparql.g:509:48: ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) )
            	            // com\\googlecode\\sparkleg\\Sparql.g:509:49: ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) )
            	            {
            	            // com\\googlecode\\sparkleg\\Sparql.g:509:49: ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) )
            	            // com\\googlecode\\sparkleg\\Sparql.g:509:50: DIVIDE u2= unaryExpression
            	            {
            	            DIVIDE364=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_additiveExpression4710);  
            	            stream_DIVIDE.add(DIVIDE364);


            	            pushFollow(FOLLOW_unaryExpression_in_additiveExpression4714);
            	            u2=unaryExpression();

            	            state._fsp--;

            	            stream_unaryExpression.add(u2.getTree());

            	            // AST REWRITE
            	            // elements: DIVIDE, u2, additiveExpression
            	            // token labels: 
            	            // rule labels: retval, u2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_u2=new RewriteRuleSubtreeStream(adaptor,"rule u2",u2!=null?u2.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 509:76: -> ^( DIVIDE $additiveExpression $u2)
            	            {
            	                // com\\googlecode\\sparkleg\\Sparql.g:509:79: ^( DIVIDE $additiveExpression $u2)
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(
            	                stream_DIVIDE.nextNode()
            	                , root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());

            	                adaptor.addChild(root_1, stream_u2.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }


            	            retval.tree = root_0;

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"


    public static class additiveOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additiveOperator"
    // com\\googlecode\\sparkleg\\Sparql.g:512:1: additiveOperator : ( PLUS | MINUS );
    public final SparqlParser.additiveOperator_return additiveOperator() throws RecognitionException {
        SparqlParser.additiveOperator_return retval = new SparqlParser.additiveOperator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set365=null;

        Object set365_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:513:5: ( PLUS | MINUS )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();


            set365=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set365)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additiveOperator"


    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicativeExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:516:1: multiplicativeExpression : (u1= unaryExpression -> $u1) ( multiplicativeOperator u2= unaryExpression -> ^( multiplicativeOperator $multiplicativeExpression $u2) )* ;
    public final SparqlParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        SparqlParser.multiplicativeExpression_return retval = new SparqlParser.multiplicativeExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.unaryExpression_return u1 =null;

        SparqlParser.unaryExpression_return u2 =null;

        SparqlParser.multiplicativeOperator_return multiplicativeOperator366 =null;


        RewriteRuleSubtreeStream stream_multiplicativeOperator=new RewriteRuleSubtreeStream(adaptor,"rule multiplicativeOperator");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:517:5: ( (u1= unaryExpression -> $u1) ( multiplicativeOperator u2= unaryExpression -> ^( multiplicativeOperator $multiplicativeExpression $u2) )* )
            // com\\googlecode\\sparkleg\\Sparql.g:517:7: (u1= unaryExpression -> $u1) ( multiplicativeOperator u2= unaryExpression -> ^( multiplicativeOperator $multiplicativeExpression $u2) )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:517:7: (u1= unaryExpression -> $u1)
            // com\\googlecode\\sparkleg\\Sparql.g:517:8: u1= unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4780);
            u1=unaryExpression();

            state._fsp--;

            stream_unaryExpression.add(u1.getTree());

            // AST REWRITE
            // elements: u1
            // token labels: 
            // rule labels: retval, u1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_u1=new RewriteRuleSubtreeStream(adaptor,"rule u1",u1!=null?u1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 517:27: -> $u1
            {
                adaptor.addChild(root_0, stream_u1.nextTree());

            }


            retval.tree = root_0;

            }


            // com\\googlecode\\sparkleg\\Sparql.g:517:35: ( multiplicativeOperator u2= unaryExpression -> ^( multiplicativeOperator $multiplicativeExpression $u2) )*
            loop123:
            do {
                int alt123=2;
                switch ( input.LA(1) ) {
                case ASTERISK:
                case DIVIDE:
                    {
                    alt123=1;
                    }
                    break;

                }

                switch (alt123) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:517:36: multiplicativeOperator u2= unaryExpression
            	    {
            	    pushFollow(FOLLOW_multiplicativeOperator_in_multiplicativeExpression4789);
            	    multiplicativeOperator366=multiplicativeOperator();

            	    state._fsp--;

            	    stream_multiplicativeOperator.add(multiplicativeOperator366.getTree());

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4793);
            	    u2=unaryExpression();

            	    state._fsp--;

            	    stream_unaryExpression.add(u2.getTree());

            	    // AST REWRITE
            	    // elements: multiplicativeExpression, u2, multiplicativeOperator
            	    // token labels: 
            	    // rule labels: retval, u2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_u2=new RewriteRuleSubtreeStream(adaptor,"rule u2",u2!=null?u2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 517:78: -> ^( multiplicativeOperator $multiplicativeExpression $u2)
            	    {
            	        // com\\googlecode\\sparkleg\\Sparql.g:517:81: ^( multiplicativeOperator $multiplicativeExpression $u2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_multiplicativeOperator.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_u2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"


    public static class multiplicativeOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicativeOperator"
    // com\\googlecode\\sparkleg\\Sparql.g:520:1: multiplicativeOperator : ( ASTERISK | DIVIDE );
    public final SparqlParser.multiplicativeOperator_return multiplicativeOperator() throws RecognitionException {
        SparqlParser.multiplicativeOperator_return retval = new SparqlParser.multiplicativeOperator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set367=null;

        Object set367_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:521:5: ( ASTERISK | DIVIDE )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();


            set367=(Token)input.LT(1);

            if ( input.LA(1)==ASTERISK||input.LA(1)==DIVIDE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set367)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicativeOperator"


    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:524:1: unaryExpression : ( NEGATION primaryExpression -> ^( UNARY NEGATION primaryExpression ) | PLUS primaryExpression -> ^( UNARY PLUS primaryExpression ) | MINUS primaryExpression -> ^( UNARY MINUS primaryExpression ) | primaryExpression -> ^( UNARY primaryExpression ) );
    public final SparqlParser.unaryExpression_return unaryExpression() throws RecognitionException {
        SparqlParser.unaryExpression_return retval = new SparqlParser.unaryExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEGATION368=null;
        Token PLUS370=null;
        Token MINUS372=null;
        SparqlParser.primaryExpression_return primaryExpression369 =null;

        SparqlParser.primaryExpression_return primaryExpression371 =null;

        SparqlParser.primaryExpression_return primaryExpression373 =null;

        SparqlParser.primaryExpression_return primaryExpression374 =null;


        Object NEGATION368_tree=null;
        Object PLUS370_tree=null;
        Object MINUS372_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_NEGATION=new RewriteRuleTokenStream(adaptor,"token NEGATION");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:525:5: ( NEGATION primaryExpression -> ^( UNARY NEGATION primaryExpression ) | PLUS primaryExpression -> ^( UNARY PLUS primaryExpression ) | MINUS primaryExpression -> ^( UNARY MINUS primaryExpression ) | primaryExpression -> ^( UNARY primaryExpression ) )
            int alt124=4;
            switch ( input.LA(1) ) {
            case NEGATION:
                {
                alt124=1;
                }
                break;
            case PLUS:
                {
                alt124=2;
                }
                break;
            case MINUS:
                {
                alt124=3;
                }
                break;
            case ABS:
            case AVG:
            case BNODE:
            case BOUND:
            case CEIL:
            case COALESCE:
            case CONCAT:
            case CONTAINS:
            case COUNT:
            case DATATYPE:
            case DAY:
            case DECIMAL:
            case DECIMAL_NEGATIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE:
            case DOUBLE_NEGATIVE:
            case DOUBLE_POSITIVE:
            case ENCODE_FOR_URI:
            case EXISTS:
            case FALSE:
            case FLOOR:
            case GROUP_CONCAT:
            case HOURS:
            case IF:
            case INTEGER:
            case INTEGER_NEGATIVE:
            case INTEGER_POSITIVE:
            case IRI:
            case IRI_REF:
            case ISBLANK:
            case ISIRI:
            case ISLITERAL:
            case ISNUMERIC:
            case ISURI:
            case LANG:
            case LANGMATCHES:
            case LCASE:
            case MAX:
            case MD5:
            case MIN:
            case MINUTES:
            case MONTH:
            case NOT:
            case NOW:
            case OPEN_BRACE:
            case PNAME_LN:
            case PNAME_NS:
            case RAND:
            case REGEX:
            case REPLACE:
            case ROUND:
            case SAMETERM:
            case SAMPLE:
            case SECONDS:
            case SHA1:
            case SHA224:
            case SHA256:
            case SHA384:
            case SHA512:
            case STR:
            case STRAFTER:
            case STRBEFORE:
            case STRDT:
            case STRENDS:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
            case STRLANG:
            case STRLEN:
            case STRSTARTS:
            case SUBSTR:
            case SUM:
            case TIMEZONE:
            case TRUE:
            case TZ:
            case UCASE:
            case URI:
            case VAR1:
            case VAR2:
            case YEAR:
                {
                alt124=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;

            }

            switch (alt124) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:525:7: NEGATION primaryExpression
                    {
                    NEGATION368=(Token)match(input,NEGATION,FOLLOW_NEGATION_in_unaryExpression4849);  
                    stream_NEGATION.add(NEGATION368);


                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression4851);
                    primaryExpression369=primaryExpression();

                    state._fsp--;

                    stream_primaryExpression.add(primaryExpression369.getTree());

                    // AST REWRITE
                    // elements: NEGATION, primaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 525:34: -> ^( UNARY NEGATION primaryExpression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:525:37: ^( UNARY NEGATION primaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(UNARY, "UNARY")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEGATION.nextNode()
                        );

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:526:7: PLUS primaryExpression
                    {
                    PLUS370=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression4869);  
                    stream_PLUS.add(PLUS370);


                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression4871);
                    primaryExpression371=primaryExpression();

                    state._fsp--;

                    stream_primaryExpression.add(primaryExpression371.getTree());

                    // AST REWRITE
                    // elements: primaryExpression, PLUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 526:30: -> ^( UNARY PLUS primaryExpression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:526:33: ^( UNARY PLUS primaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(UNARY, "UNARY")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_PLUS.nextNode()
                        );

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:527:7: MINUS primaryExpression
                    {
                    MINUS372=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression4889);  
                    stream_MINUS.add(MINUS372);


                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression4891);
                    primaryExpression373=primaryExpression();

                    state._fsp--;

                    stream_primaryExpression.add(primaryExpression373.getTree());

                    // AST REWRITE
                    // elements: primaryExpression, MINUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 527:31: -> ^( UNARY MINUS primaryExpression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:527:34: ^( UNARY MINUS primaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(UNARY, "UNARY")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_MINUS.nextNode()
                        );

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:528:7: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression4909);
                    primaryExpression374=primaryExpression();

                    state._fsp--;

                    stream_primaryExpression.add(primaryExpression374.getTree());

                    // AST REWRITE
                    // elements: primaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 528:25: -> ^( UNARY primaryExpression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:528:28: ^( UNARY primaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(UNARY, "UNARY")
                        , root_1);

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"


    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primaryExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:531:1: primaryExpression : ( brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate );
    public final SparqlParser.primaryExpression_return primaryExpression() throws RecognitionException {
        SparqlParser.primaryExpression_return retval = new SparqlParser.primaryExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.brackettedExpression_return brackettedExpression375 =null;

        SparqlParser.builtInCall_return builtInCall376 =null;

        SparqlParser.iriRefOrFunction_return iriRefOrFunction377 =null;

        SparqlParser.rdfLiteral_return rdfLiteral378 =null;

        SparqlParser.numericLiteral_return numericLiteral379 =null;

        SparqlParser.booleanLiteral_return booleanLiteral380 =null;

        SparqlParser.var_return var381 =null;

        SparqlParser.aggregate_return aggregate382 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:532:5: ( brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate )
            int alt125=8;
            switch ( input.LA(1) ) {
            case OPEN_BRACE:
                {
                alt125=1;
                }
                break;
            case ABS:
            case BNODE:
            case BOUND:
            case CEIL:
            case COALESCE:
            case CONCAT:
            case CONTAINS:
            case DATATYPE:
            case DAY:
            case ENCODE_FOR_URI:
            case EXISTS:
            case FLOOR:
            case HOURS:
            case IF:
            case IRI:
            case ISBLANK:
            case ISIRI:
            case ISLITERAL:
            case ISNUMERIC:
            case ISURI:
            case LANG:
            case LANGMATCHES:
            case LCASE:
            case MD5:
            case MINUTES:
            case MONTH:
            case NOT:
            case NOW:
            case RAND:
            case REGEX:
            case REPLACE:
            case ROUND:
            case SAMETERM:
            case SECONDS:
            case SHA1:
            case SHA224:
            case SHA256:
            case SHA384:
            case SHA512:
            case STR:
            case STRAFTER:
            case STRBEFORE:
            case STRDT:
            case STRENDS:
            case STRLANG:
            case STRLEN:
            case STRSTARTS:
            case SUBSTR:
            case TIMEZONE:
            case TZ:
            case UCASE:
            case URI:
            case YEAR:
                {
                alt125=2;
                }
                break;
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt125=3;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt125=4;
                }
                break;
            case DECIMAL:
            case DECIMAL_NEGATIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE:
            case DOUBLE_NEGATIVE:
            case DOUBLE_POSITIVE:
            case INTEGER:
            case INTEGER_NEGATIVE:
            case INTEGER_POSITIVE:
                {
                alt125=5;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt125=6;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt125=7;
                }
                break;
            case AVG:
            case COUNT:
            case GROUP_CONCAT:
            case MAX:
            case MIN:
            case SAMPLE:
            case SUM:
                {
                alt125=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;

            }

            switch (alt125) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:532:7: brackettedExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_brackettedExpression_in_primaryExpression4934);
                    brackettedExpression375=brackettedExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, brackettedExpression375.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:532:30: builtInCall
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_builtInCall_in_primaryExpression4938);
                    builtInCall376=builtInCall();

                    state._fsp--;

                    adaptor.addChild(root_0, builtInCall376.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:532:44: iriRefOrFunction
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iriRefOrFunction_in_primaryExpression4942);
                    iriRefOrFunction377=iriRefOrFunction();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRefOrFunction377.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:532:63: rdfLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_rdfLiteral_in_primaryExpression4946);
                    rdfLiteral378=rdfLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, rdfLiteral378.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:532:76: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numericLiteral_in_primaryExpression4950);
                    numericLiteral379=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral379.getTree());

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:532:93: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression4954);
                    booleanLiteral380=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral380.getTree());

                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\Sparql.g:532:110: var
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_var_in_primaryExpression4958);
                    var381=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var381.getTree());

                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\Sparql.g:532:116: aggregate
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_aggregate_in_primaryExpression4962);
                    aggregate382=aggregate();

                    state._fsp--;

                    adaptor.addChild(root_0, aggregate382.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"


    public static class brackettedExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "brackettedExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:535:1: brackettedExpression : OPEN_BRACE expression CLOSE_BRACE -> ^( BRACKETTED_EXPRESSION expression ) ;
    public final SparqlParser.brackettedExpression_return brackettedExpression() throws RecognitionException {
        SparqlParser.brackettedExpression_return retval = new SparqlParser.brackettedExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_BRACE383=null;
        Token CLOSE_BRACE385=null;
        SparqlParser.expression_return expression384 =null;


        Object OPEN_BRACE383_tree=null;
        Object CLOSE_BRACE385_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:536:5: ( OPEN_BRACE expression CLOSE_BRACE -> ^( BRACKETTED_EXPRESSION expression ) )
            // com\\googlecode\\sparkleg\\Sparql.g:536:7: OPEN_BRACE expression CLOSE_BRACE
            {
            OPEN_BRACE383=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_brackettedExpression4979);  
            stream_OPEN_BRACE.add(OPEN_BRACE383);


            pushFollow(FOLLOW_expression_in_brackettedExpression4981);
            expression384=expression();

            state._fsp--;

            stream_expression.add(expression384.getTree());

            CLOSE_BRACE385=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_brackettedExpression4983);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE385);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 536:41: -> ^( BRACKETTED_EXPRESSION expression )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:536:44: ^( BRACKETTED_EXPRESSION expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BRACKETTED_EXPRESSION, "BRACKETTED_EXPRESSION")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "brackettedExpression"


    public static class builtInCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "builtInCall"
    // com\\googlecode\\sparkleg\\Sparql.g:539:1: builtInCall : ( STR OPEN_BRACE expression CLOSE_BRACE -> ^( STR expression ) | LANG OPEN_BRACE expression CLOSE_BRACE -> ^( LANG expression ) | LANGMATCHES OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( LANGMATCHES ( expression )+ ) | DATATYPE OPEN_BRACE expression CLOSE_BRACE -> ^( DATATYPE expression ) | BOUND OPEN_BRACE var CLOSE_BRACE -> ^( BOUND var ) | IRI OPEN_BRACE expression CLOSE_BRACE -> ^( IRI expression ) | URI OPEN_BRACE expression CLOSE_BRACE -> ^( URI expression ) | BNODE ( OPEN_BRACE expression CLOSE_BRACE ) -> ^( BNODE expression ) | BNODE nil -> BNODE | RAND nil -> RAND | ABS OPEN_BRACE expression CLOSE_BRACE -> ^( ABS expression ) | CEIL OPEN_BRACE expression CLOSE_BRACE -> ^( CEIL expression ) | FLOOR OPEN_BRACE expression CLOSE_BRACE -> ^( FLOOR expression ) | ROUND OPEN_BRACE expression CLOSE_BRACE -> ^( ROUND expression ) | CONCAT expressionList -> ^( CONCAT expressionList ) | subStringExpression -> subStringExpression | STRLEN OPEN_BRACE expression CLOSE_BRACE -> ^( STRLEN expression ) | UCASE OPEN_BRACE expression CLOSE_BRACE -> ^( UCASE expression ) | LCASE OPEN_BRACE expression CLOSE_BRACE -> ^( LCASE expression ) | ENCODE_FOR_URI OPEN_BRACE expression CLOSE_BRACE -> ^( ENCODE_FOR_URI expression ) | CONTAINS OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( CONTAINS expression expression ) | STRSTARTS OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRSTARTS expression expression ) | STRENDS OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRENDS expression expression ) | STRBEFORE OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRBEFORE expression expression ) | STRAFTER OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRAFTER expression expression ) | REPLACE OPEN_BRACE expression COMMA expression COMMA expression CLOSE_BRACE -> ^( REPLACE expression expression expression ) | YEAR OPEN_BRACE expression CLOSE_BRACE -> ^( YEAR expression ) | MONTH OPEN_BRACE expression CLOSE_BRACE -> ^( MONTH expression ) | DAY OPEN_BRACE expression CLOSE_BRACE -> ^( DAY expression ) | HOURS OPEN_BRACE expression CLOSE_BRACE -> ^( HOURS expression ) | MINUTES OPEN_BRACE expression CLOSE_BRACE -> ^( MINUTES expression ) | SECONDS OPEN_BRACE expression CLOSE_BRACE -> ^( SECONDS expression ) | TIMEZONE OPEN_BRACE expression CLOSE_BRACE -> ^( TIMEZONE expression ) | TZ OPEN_BRACE expression CLOSE_BRACE -> ^( TZ expression ) | NOW nil -> NOW | MD5 OPEN_BRACE expression CLOSE_BRACE -> ^( MD5 expression ) | SHA1 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA1 expression ) | SHA224 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA224 expression ) | SHA256 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA256 expression ) | SHA384 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA384 expression ) | SHA512 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA512 expression ) | COALESCE expressionList -> ^( COALESCE expressionList ) | IF OPEN_BRACE e1= expression COMMA e2= expression COMMA e3= expression CLOSE_BRACE -> ^( IF $e1 $e2 $e3) | STRLANG OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRLANG expression expression ) | STRDT OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRDT expression expression ) | SAMETERM OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( SAMETERM expression expression ) | ISIRI OPEN_BRACE expression CLOSE_BRACE -> ^( ISIRI expression ) | ISURI OPEN_BRACE expression CLOSE_BRACE -> ^( ISURI expression ) | ISBLANK OPEN_BRACE expression CLOSE_BRACE -> ^( ISBLANK expression ) | ISLITERAL OPEN_BRACE expression CLOSE_BRACE -> ^( ISLITERAL expression ) | ISNUMERIC OPEN_BRACE expression CLOSE_BRACE -> ^( ISNUMERIC expression ) | regexExpression -> regexExpression | existsFunction -> existsFunction | notExistsFunction -> notExistsFunction );
    public final SparqlParser.builtInCall_return builtInCall() throws RecognitionException {
        SparqlParser.builtInCall_return retval = new SparqlParser.builtInCall_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STR386=null;
        Token OPEN_BRACE387=null;
        Token CLOSE_BRACE389=null;
        Token LANG390=null;
        Token OPEN_BRACE391=null;
        Token CLOSE_BRACE393=null;
        Token LANGMATCHES394=null;
        Token OPEN_BRACE395=null;
        Token COMMA397=null;
        Token CLOSE_BRACE399=null;
        Token DATATYPE400=null;
        Token OPEN_BRACE401=null;
        Token CLOSE_BRACE403=null;
        Token BOUND404=null;
        Token OPEN_BRACE405=null;
        Token CLOSE_BRACE407=null;
        Token IRI408=null;
        Token OPEN_BRACE409=null;
        Token CLOSE_BRACE411=null;
        Token URI412=null;
        Token OPEN_BRACE413=null;
        Token CLOSE_BRACE415=null;
        Token BNODE416=null;
        Token OPEN_BRACE417=null;
        Token CLOSE_BRACE419=null;
        Token BNODE420=null;
        Token RAND422=null;
        Token ABS424=null;
        Token OPEN_BRACE425=null;
        Token CLOSE_BRACE427=null;
        Token CEIL428=null;
        Token OPEN_BRACE429=null;
        Token CLOSE_BRACE431=null;
        Token FLOOR432=null;
        Token OPEN_BRACE433=null;
        Token CLOSE_BRACE435=null;
        Token ROUND436=null;
        Token OPEN_BRACE437=null;
        Token CLOSE_BRACE439=null;
        Token CONCAT440=null;
        Token STRLEN443=null;
        Token OPEN_BRACE444=null;
        Token CLOSE_BRACE446=null;
        Token UCASE447=null;
        Token OPEN_BRACE448=null;
        Token CLOSE_BRACE450=null;
        Token LCASE451=null;
        Token OPEN_BRACE452=null;
        Token CLOSE_BRACE454=null;
        Token ENCODE_FOR_URI455=null;
        Token OPEN_BRACE456=null;
        Token CLOSE_BRACE458=null;
        Token CONTAINS459=null;
        Token OPEN_BRACE460=null;
        Token COMMA462=null;
        Token CLOSE_BRACE464=null;
        Token STRSTARTS465=null;
        Token OPEN_BRACE466=null;
        Token COMMA468=null;
        Token CLOSE_BRACE470=null;
        Token STRENDS471=null;
        Token OPEN_BRACE472=null;
        Token COMMA474=null;
        Token CLOSE_BRACE476=null;
        Token STRBEFORE477=null;
        Token OPEN_BRACE478=null;
        Token COMMA480=null;
        Token CLOSE_BRACE482=null;
        Token STRAFTER483=null;
        Token OPEN_BRACE484=null;
        Token COMMA486=null;
        Token CLOSE_BRACE488=null;
        Token REPLACE489=null;
        Token OPEN_BRACE490=null;
        Token COMMA492=null;
        Token COMMA494=null;
        Token CLOSE_BRACE496=null;
        Token YEAR497=null;
        Token OPEN_BRACE498=null;
        Token CLOSE_BRACE500=null;
        Token MONTH501=null;
        Token OPEN_BRACE502=null;
        Token CLOSE_BRACE504=null;
        Token DAY505=null;
        Token OPEN_BRACE506=null;
        Token CLOSE_BRACE508=null;
        Token HOURS509=null;
        Token OPEN_BRACE510=null;
        Token CLOSE_BRACE512=null;
        Token MINUTES513=null;
        Token OPEN_BRACE514=null;
        Token CLOSE_BRACE516=null;
        Token SECONDS517=null;
        Token OPEN_BRACE518=null;
        Token CLOSE_BRACE520=null;
        Token TIMEZONE521=null;
        Token OPEN_BRACE522=null;
        Token CLOSE_BRACE524=null;
        Token TZ525=null;
        Token OPEN_BRACE526=null;
        Token CLOSE_BRACE528=null;
        Token NOW529=null;
        Token MD5531=null;
        Token OPEN_BRACE532=null;
        Token CLOSE_BRACE534=null;
        Token SHA1535=null;
        Token OPEN_BRACE536=null;
        Token CLOSE_BRACE538=null;
        Token SHA224539=null;
        Token OPEN_BRACE540=null;
        Token CLOSE_BRACE542=null;
        Token SHA256543=null;
        Token OPEN_BRACE544=null;
        Token CLOSE_BRACE546=null;
        Token SHA384547=null;
        Token OPEN_BRACE548=null;
        Token CLOSE_BRACE550=null;
        Token SHA512551=null;
        Token OPEN_BRACE552=null;
        Token CLOSE_BRACE554=null;
        Token COALESCE555=null;
        Token IF557=null;
        Token OPEN_BRACE558=null;
        Token COMMA559=null;
        Token COMMA560=null;
        Token CLOSE_BRACE561=null;
        Token STRLANG562=null;
        Token OPEN_BRACE563=null;
        Token COMMA565=null;
        Token CLOSE_BRACE567=null;
        Token STRDT568=null;
        Token OPEN_BRACE569=null;
        Token COMMA571=null;
        Token CLOSE_BRACE573=null;
        Token SAMETERM574=null;
        Token OPEN_BRACE575=null;
        Token COMMA577=null;
        Token CLOSE_BRACE579=null;
        Token ISIRI580=null;
        Token OPEN_BRACE581=null;
        Token CLOSE_BRACE583=null;
        Token ISURI584=null;
        Token OPEN_BRACE585=null;
        Token CLOSE_BRACE587=null;
        Token ISBLANK588=null;
        Token OPEN_BRACE589=null;
        Token CLOSE_BRACE591=null;
        Token ISLITERAL592=null;
        Token OPEN_BRACE593=null;
        Token CLOSE_BRACE595=null;
        Token ISNUMERIC596=null;
        Token OPEN_BRACE597=null;
        Token CLOSE_BRACE599=null;
        SparqlParser.expression_return e1 =null;

        SparqlParser.expression_return e2 =null;

        SparqlParser.expression_return e3 =null;

        SparqlParser.expression_return expression388 =null;

        SparqlParser.expression_return expression392 =null;

        SparqlParser.expression_return expression396 =null;

        SparqlParser.expression_return expression398 =null;

        SparqlParser.expression_return expression402 =null;

        SparqlParser.var_return var406 =null;

        SparqlParser.expression_return expression410 =null;

        SparqlParser.expression_return expression414 =null;

        SparqlParser.expression_return expression418 =null;

        SparqlParser.nil_return nil421 =null;

        SparqlParser.nil_return nil423 =null;

        SparqlParser.expression_return expression426 =null;

        SparqlParser.expression_return expression430 =null;

        SparqlParser.expression_return expression434 =null;

        SparqlParser.expression_return expression438 =null;

        SparqlParser.expressionList_return expressionList441 =null;

        SparqlParser.subStringExpression_return subStringExpression442 =null;

        SparqlParser.expression_return expression445 =null;

        SparqlParser.expression_return expression449 =null;

        SparqlParser.expression_return expression453 =null;

        SparqlParser.expression_return expression457 =null;

        SparqlParser.expression_return expression461 =null;

        SparqlParser.expression_return expression463 =null;

        SparqlParser.expression_return expression467 =null;

        SparqlParser.expression_return expression469 =null;

        SparqlParser.expression_return expression473 =null;

        SparqlParser.expression_return expression475 =null;

        SparqlParser.expression_return expression479 =null;

        SparqlParser.expression_return expression481 =null;

        SparqlParser.expression_return expression485 =null;

        SparqlParser.expression_return expression487 =null;

        SparqlParser.expression_return expression491 =null;

        SparqlParser.expression_return expression493 =null;

        SparqlParser.expression_return expression495 =null;

        SparqlParser.expression_return expression499 =null;

        SparqlParser.expression_return expression503 =null;

        SparqlParser.expression_return expression507 =null;

        SparqlParser.expression_return expression511 =null;

        SparqlParser.expression_return expression515 =null;

        SparqlParser.expression_return expression519 =null;

        SparqlParser.expression_return expression523 =null;

        SparqlParser.expression_return expression527 =null;

        SparqlParser.nil_return nil530 =null;

        SparqlParser.expression_return expression533 =null;

        SparqlParser.expression_return expression537 =null;

        SparqlParser.expression_return expression541 =null;

        SparqlParser.expression_return expression545 =null;

        SparqlParser.expression_return expression549 =null;

        SparqlParser.expression_return expression553 =null;

        SparqlParser.expressionList_return expressionList556 =null;

        SparqlParser.expression_return expression564 =null;

        SparqlParser.expression_return expression566 =null;

        SparqlParser.expression_return expression570 =null;

        SparqlParser.expression_return expression572 =null;

        SparqlParser.expression_return expression576 =null;

        SparqlParser.expression_return expression578 =null;

        SparqlParser.expression_return expression582 =null;

        SparqlParser.expression_return expression586 =null;

        SparqlParser.expression_return expression590 =null;

        SparqlParser.expression_return expression594 =null;

        SparqlParser.expression_return expression598 =null;

        SparqlParser.regexExpression_return regexExpression600 =null;

        SparqlParser.existsFunction_return existsFunction601 =null;

        SparqlParser.notExistsFunction_return notExistsFunction602 =null;


        Object STR386_tree=null;
        Object OPEN_BRACE387_tree=null;
        Object CLOSE_BRACE389_tree=null;
        Object LANG390_tree=null;
        Object OPEN_BRACE391_tree=null;
        Object CLOSE_BRACE393_tree=null;
        Object LANGMATCHES394_tree=null;
        Object OPEN_BRACE395_tree=null;
        Object COMMA397_tree=null;
        Object CLOSE_BRACE399_tree=null;
        Object DATATYPE400_tree=null;
        Object OPEN_BRACE401_tree=null;
        Object CLOSE_BRACE403_tree=null;
        Object BOUND404_tree=null;
        Object OPEN_BRACE405_tree=null;
        Object CLOSE_BRACE407_tree=null;
        Object IRI408_tree=null;
        Object OPEN_BRACE409_tree=null;
        Object CLOSE_BRACE411_tree=null;
        Object URI412_tree=null;
        Object OPEN_BRACE413_tree=null;
        Object CLOSE_BRACE415_tree=null;
        Object BNODE416_tree=null;
        Object OPEN_BRACE417_tree=null;
        Object CLOSE_BRACE419_tree=null;
        Object BNODE420_tree=null;
        Object RAND422_tree=null;
        Object ABS424_tree=null;
        Object OPEN_BRACE425_tree=null;
        Object CLOSE_BRACE427_tree=null;
        Object CEIL428_tree=null;
        Object OPEN_BRACE429_tree=null;
        Object CLOSE_BRACE431_tree=null;
        Object FLOOR432_tree=null;
        Object OPEN_BRACE433_tree=null;
        Object CLOSE_BRACE435_tree=null;
        Object ROUND436_tree=null;
        Object OPEN_BRACE437_tree=null;
        Object CLOSE_BRACE439_tree=null;
        Object CONCAT440_tree=null;
        Object STRLEN443_tree=null;
        Object OPEN_BRACE444_tree=null;
        Object CLOSE_BRACE446_tree=null;
        Object UCASE447_tree=null;
        Object OPEN_BRACE448_tree=null;
        Object CLOSE_BRACE450_tree=null;
        Object LCASE451_tree=null;
        Object OPEN_BRACE452_tree=null;
        Object CLOSE_BRACE454_tree=null;
        Object ENCODE_FOR_URI455_tree=null;
        Object OPEN_BRACE456_tree=null;
        Object CLOSE_BRACE458_tree=null;
        Object CONTAINS459_tree=null;
        Object OPEN_BRACE460_tree=null;
        Object COMMA462_tree=null;
        Object CLOSE_BRACE464_tree=null;
        Object STRSTARTS465_tree=null;
        Object OPEN_BRACE466_tree=null;
        Object COMMA468_tree=null;
        Object CLOSE_BRACE470_tree=null;
        Object STRENDS471_tree=null;
        Object OPEN_BRACE472_tree=null;
        Object COMMA474_tree=null;
        Object CLOSE_BRACE476_tree=null;
        Object STRBEFORE477_tree=null;
        Object OPEN_BRACE478_tree=null;
        Object COMMA480_tree=null;
        Object CLOSE_BRACE482_tree=null;
        Object STRAFTER483_tree=null;
        Object OPEN_BRACE484_tree=null;
        Object COMMA486_tree=null;
        Object CLOSE_BRACE488_tree=null;
        Object REPLACE489_tree=null;
        Object OPEN_BRACE490_tree=null;
        Object COMMA492_tree=null;
        Object COMMA494_tree=null;
        Object CLOSE_BRACE496_tree=null;
        Object YEAR497_tree=null;
        Object OPEN_BRACE498_tree=null;
        Object CLOSE_BRACE500_tree=null;
        Object MONTH501_tree=null;
        Object OPEN_BRACE502_tree=null;
        Object CLOSE_BRACE504_tree=null;
        Object DAY505_tree=null;
        Object OPEN_BRACE506_tree=null;
        Object CLOSE_BRACE508_tree=null;
        Object HOURS509_tree=null;
        Object OPEN_BRACE510_tree=null;
        Object CLOSE_BRACE512_tree=null;
        Object MINUTES513_tree=null;
        Object OPEN_BRACE514_tree=null;
        Object CLOSE_BRACE516_tree=null;
        Object SECONDS517_tree=null;
        Object OPEN_BRACE518_tree=null;
        Object CLOSE_BRACE520_tree=null;
        Object TIMEZONE521_tree=null;
        Object OPEN_BRACE522_tree=null;
        Object CLOSE_BRACE524_tree=null;
        Object TZ525_tree=null;
        Object OPEN_BRACE526_tree=null;
        Object CLOSE_BRACE528_tree=null;
        Object NOW529_tree=null;
        Object MD5531_tree=null;
        Object OPEN_BRACE532_tree=null;
        Object CLOSE_BRACE534_tree=null;
        Object SHA1535_tree=null;
        Object OPEN_BRACE536_tree=null;
        Object CLOSE_BRACE538_tree=null;
        Object SHA224539_tree=null;
        Object OPEN_BRACE540_tree=null;
        Object CLOSE_BRACE542_tree=null;
        Object SHA256543_tree=null;
        Object OPEN_BRACE544_tree=null;
        Object CLOSE_BRACE546_tree=null;
        Object SHA384547_tree=null;
        Object OPEN_BRACE548_tree=null;
        Object CLOSE_BRACE550_tree=null;
        Object SHA512551_tree=null;
        Object OPEN_BRACE552_tree=null;
        Object CLOSE_BRACE554_tree=null;
        Object COALESCE555_tree=null;
        Object IF557_tree=null;
        Object OPEN_BRACE558_tree=null;
        Object COMMA559_tree=null;
        Object COMMA560_tree=null;
        Object CLOSE_BRACE561_tree=null;
        Object STRLANG562_tree=null;
        Object OPEN_BRACE563_tree=null;
        Object COMMA565_tree=null;
        Object CLOSE_BRACE567_tree=null;
        Object STRDT568_tree=null;
        Object OPEN_BRACE569_tree=null;
        Object COMMA571_tree=null;
        Object CLOSE_BRACE573_tree=null;
        Object SAMETERM574_tree=null;
        Object OPEN_BRACE575_tree=null;
        Object COMMA577_tree=null;
        Object CLOSE_BRACE579_tree=null;
        Object ISIRI580_tree=null;
        Object OPEN_BRACE581_tree=null;
        Object CLOSE_BRACE583_tree=null;
        Object ISURI584_tree=null;
        Object OPEN_BRACE585_tree=null;
        Object CLOSE_BRACE587_tree=null;
        Object ISBLANK588_tree=null;
        Object OPEN_BRACE589_tree=null;
        Object CLOSE_BRACE591_tree=null;
        Object ISLITERAL592_tree=null;
        Object OPEN_BRACE593_tree=null;
        Object CLOSE_BRACE595_tree=null;
        Object ISNUMERIC596_tree=null;
        Object OPEN_BRACE597_tree=null;
        Object CLOSE_BRACE599_tree=null;
        RewriteRuleTokenStream stream_SHA256=new RewriteRuleTokenStream(adaptor,"token SHA256");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_TIMEZONE=new RewriteRuleTokenStream(adaptor,"token TIMEZONE");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleTokenStream stream_STRENDS=new RewriteRuleTokenStream(adaptor,"token STRENDS");
        RewriteRuleTokenStream stream_LCASE=new RewriteRuleTokenStream(adaptor,"token LCASE");
        RewriteRuleTokenStream stream_BNODE=new RewriteRuleTokenStream(adaptor,"token BNODE");
        RewriteRuleTokenStream stream_SHA512=new RewriteRuleTokenStream(adaptor,"token SHA512");
        RewriteRuleTokenStream stream_SECONDS=new RewriteRuleTokenStream(adaptor,"token SECONDS");
        RewriteRuleTokenStream stream_NOW=new RewriteRuleTokenStream(adaptor,"token NOW");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_SHA224=new RewriteRuleTokenStream(adaptor,"token SHA224");
        RewriteRuleTokenStream stream_STRAFTER=new RewriteRuleTokenStream(adaptor,"token STRAFTER");
        RewriteRuleTokenStream stream_STRLEN=new RewriteRuleTokenStream(adaptor,"token STRLEN");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");
        RewriteRuleTokenStream stream_ENCODE_FOR_URI=new RewriteRuleTokenStream(adaptor,"token ENCODE_FOR_URI");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ISURI=new RewriteRuleTokenStream(adaptor,"token ISURI");
        RewriteRuleTokenStream stream_STR=new RewriteRuleTokenStream(adaptor,"token STR");
        RewriteRuleTokenStream stream_ISLITERAL=new RewriteRuleTokenStream(adaptor,"token ISLITERAL");
        RewriteRuleTokenStream stream_STRDT=new RewriteRuleTokenStream(adaptor,"token STRDT");
        RewriteRuleTokenStream stream_SAMETERM=new RewriteRuleTokenStream(adaptor,"token SAMETERM");
        RewriteRuleTokenStream stream_MD5=new RewriteRuleTokenStream(adaptor,"token MD5");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RAND=new RewriteRuleTokenStream(adaptor,"token RAND");
        RewriteRuleTokenStream stream_REPLACE=new RewriteRuleTokenStream(adaptor,"token REPLACE");
        RewriteRuleTokenStream stream_IRI=new RewriteRuleTokenStream(adaptor,"token IRI");
        RewriteRuleTokenStream stream_LANGMATCHES=new RewriteRuleTokenStream(adaptor,"token LANGMATCHES");
        RewriteRuleTokenStream stream_TZ=new RewriteRuleTokenStream(adaptor,"token TZ");
        RewriteRuleTokenStream stream_STRLANG=new RewriteRuleTokenStream(adaptor,"token STRLANG");
        RewriteRuleTokenStream stream_BOUND=new RewriteRuleTokenStream(adaptor,"token BOUND");
        RewriteRuleTokenStream stream_ISIRI=new RewriteRuleTokenStream(adaptor,"token ISIRI");
        RewriteRuleTokenStream stream_COALESCE=new RewriteRuleTokenStream(adaptor,"token COALESCE");
        RewriteRuleTokenStream stream_ISNUMERIC=new RewriteRuleTokenStream(adaptor,"token ISNUMERIC");
        RewriteRuleTokenStream stream_CONCAT=new RewriteRuleTokenStream(adaptor,"token CONCAT");
        RewriteRuleTokenStream stream_STRSTARTS=new RewriteRuleTokenStream(adaptor,"token STRSTARTS");
        RewriteRuleTokenStream stream_STRBEFORE=new RewriteRuleTokenStream(adaptor,"token STRBEFORE");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_SHA1=new RewriteRuleTokenStream(adaptor,"token SHA1");
        RewriteRuleTokenStream stream_FLOOR=new RewriteRuleTokenStream(adaptor,"token FLOOR");
        RewriteRuleTokenStream stream_ISBLANK=new RewriteRuleTokenStream(adaptor,"token ISBLANK");
        RewriteRuleTokenStream stream_UCASE=new RewriteRuleTokenStream(adaptor,"token UCASE");
        RewriteRuleTokenStream stream_URI=new RewriteRuleTokenStream(adaptor,"token URI");
        RewriteRuleTokenStream stream_ABS=new RewriteRuleTokenStream(adaptor,"token ABS");
        RewriteRuleTokenStream stream_MINUTES=new RewriteRuleTokenStream(adaptor,"token MINUTES");
        RewriteRuleTokenStream stream_ROUND=new RewriteRuleTokenStream(adaptor,"token ROUND");
        RewriteRuleTokenStream stream_CEIL=new RewriteRuleTokenStream(adaptor,"token CEIL");
        RewriteRuleTokenStream stream_DATATYPE=new RewriteRuleTokenStream(adaptor,"token DATATYPE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_SHA384=new RewriteRuleTokenStream(adaptor,"token SHA384");
        RewriteRuleTokenStream stream_HOURS=new RewriteRuleTokenStream(adaptor,"token HOURS");
        RewriteRuleTokenStream stream_LANG=new RewriteRuleTokenStream(adaptor,"token LANG");
        RewriteRuleSubtreeStream stream_existsFunction=new RewriteRuleSubtreeStream(adaptor,"rule existsFunction");
        RewriteRuleSubtreeStream stream_subStringExpression=new RewriteRuleSubtreeStream(adaptor,"rule subStringExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_notExistsFunction=new RewriteRuleSubtreeStream(adaptor,"rule notExistsFunction");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        RewriteRuleSubtreeStream stream_regexExpression=new RewriteRuleSubtreeStream(adaptor,"rule regexExpression");
        RewriteRuleSubtreeStream stream_nil=new RewriteRuleSubtreeStream(adaptor,"rule nil");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:540:5: ( STR OPEN_BRACE expression CLOSE_BRACE -> ^( STR expression ) | LANG OPEN_BRACE expression CLOSE_BRACE -> ^( LANG expression ) | LANGMATCHES OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( LANGMATCHES ( expression )+ ) | DATATYPE OPEN_BRACE expression CLOSE_BRACE -> ^( DATATYPE expression ) | BOUND OPEN_BRACE var CLOSE_BRACE -> ^( BOUND var ) | IRI OPEN_BRACE expression CLOSE_BRACE -> ^( IRI expression ) | URI OPEN_BRACE expression CLOSE_BRACE -> ^( URI expression ) | BNODE ( OPEN_BRACE expression CLOSE_BRACE ) -> ^( BNODE expression ) | BNODE nil -> BNODE | RAND nil -> RAND | ABS OPEN_BRACE expression CLOSE_BRACE -> ^( ABS expression ) | CEIL OPEN_BRACE expression CLOSE_BRACE -> ^( CEIL expression ) | FLOOR OPEN_BRACE expression CLOSE_BRACE -> ^( FLOOR expression ) | ROUND OPEN_BRACE expression CLOSE_BRACE -> ^( ROUND expression ) | CONCAT expressionList -> ^( CONCAT expressionList ) | subStringExpression -> subStringExpression | STRLEN OPEN_BRACE expression CLOSE_BRACE -> ^( STRLEN expression ) | UCASE OPEN_BRACE expression CLOSE_BRACE -> ^( UCASE expression ) | LCASE OPEN_BRACE expression CLOSE_BRACE -> ^( LCASE expression ) | ENCODE_FOR_URI OPEN_BRACE expression CLOSE_BRACE -> ^( ENCODE_FOR_URI expression ) | CONTAINS OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( CONTAINS expression expression ) | STRSTARTS OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRSTARTS expression expression ) | STRENDS OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRENDS expression expression ) | STRBEFORE OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRBEFORE expression expression ) | STRAFTER OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRAFTER expression expression ) | REPLACE OPEN_BRACE expression COMMA expression COMMA expression CLOSE_BRACE -> ^( REPLACE expression expression expression ) | YEAR OPEN_BRACE expression CLOSE_BRACE -> ^( YEAR expression ) | MONTH OPEN_BRACE expression CLOSE_BRACE -> ^( MONTH expression ) | DAY OPEN_BRACE expression CLOSE_BRACE -> ^( DAY expression ) | HOURS OPEN_BRACE expression CLOSE_BRACE -> ^( HOURS expression ) | MINUTES OPEN_BRACE expression CLOSE_BRACE -> ^( MINUTES expression ) | SECONDS OPEN_BRACE expression CLOSE_BRACE -> ^( SECONDS expression ) | TIMEZONE OPEN_BRACE expression CLOSE_BRACE -> ^( TIMEZONE expression ) | TZ OPEN_BRACE expression CLOSE_BRACE -> ^( TZ expression ) | NOW nil -> NOW | MD5 OPEN_BRACE expression CLOSE_BRACE -> ^( MD5 expression ) | SHA1 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA1 expression ) | SHA224 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA224 expression ) | SHA256 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA256 expression ) | SHA384 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA384 expression ) | SHA512 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA512 expression ) | COALESCE expressionList -> ^( COALESCE expressionList ) | IF OPEN_BRACE e1= expression COMMA e2= expression COMMA e3= expression CLOSE_BRACE -> ^( IF $e1 $e2 $e3) | STRLANG OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRLANG expression expression ) | STRDT OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRDT expression expression ) | SAMETERM OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( SAMETERM expression expression ) | ISIRI OPEN_BRACE expression CLOSE_BRACE -> ^( ISIRI expression ) | ISURI OPEN_BRACE expression CLOSE_BRACE -> ^( ISURI expression ) | ISBLANK OPEN_BRACE expression CLOSE_BRACE -> ^( ISBLANK expression ) | ISLITERAL OPEN_BRACE expression CLOSE_BRACE -> ^( ISLITERAL expression ) | ISNUMERIC OPEN_BRACE expression CLOSE_BRACE -> ^( ISNUMERIC expression ) | regexExpression -> regexExpression | existsFunction -> existsFunction | notExistsFunction -> notExistsFunction )
            int alt126=54;
            switch ( input.LA(1) ) {
            case STR:
                {
                alt126=1;
                }
                break;
            case LANG:
                {
                alt126=2;
                }
                break;
            case LANGMATCHES:
                {
                alt126=3;
                }
                break;
            case DATATYPE:
                {
                alt126=4;
                }
                break;
            case BOUND:
                {
                alt126=5;
                }
                break;
            case IRI:
                {
                alt126=6;
                }
                break;
            case URI:
                {
                alt126=7;
                }
                break;
            case BNODE:
                {
                switch ( input.LA(2) ) {
                case OPEN_BRACE:
                    {
                    switch ( input.LA(3) ) {
                    case CLOSE_BRACE:
                        {
                        alt126=9;
                        }
                        break;
                    case ABS:
                    case AVG:
                    case BNODE:
                    case BOUND:
                    case CEIL:
                    case COALESCE:
                    case CONCAT:
                    case CONTAINS:
                    case COUNT:
                    case DATATYPE:
                    case DAY:
                    case DECIMAL:
                    case DECIMAL_NEGATIVE:
                    case DECIMAL_POSITIVE:
                    case DOUBLE:
                    case DOUBLE_NEGATIVE:
                    case DOUBLE_POSITIVE:
                    case ENCODE_FOR_URI:
                    case EXISTS:
                    case FALSE:
                    case FLOOR:
                    case GROUP_CONCAT:
                    case HOURS:
                    case IF:
                    case INTEGER:
                    case INTEGER_NEGATIVE:
                    case INTEGER_POSITIVE:
                    case IRI:
                    case IRI_REF:
                    case ISBLANK:
                    case ISIRI:
                    case ISLITERAL:
                    case ISNUMERIC:
                    case ISURI:
                    case LANG:
                    case LANGMATCHES:
                    case LCASE:
                    case MAX:
                    case MD5:
                    case MIN:
                    case MINUS:
                    case MINUTES:
                    case MONTH:
                    case NEGATION:
                    case NOT:
                    case NOW:
                    case OPEN_BRACE:
                    case PLUS:
                    case PNAME_LN:
                    case PNAME_NS:
                    case RAND:
                    case REGEX:
                    case REPLACE:
                    case ROUND:
                    case SAMETERM:
                    case SAMPLE:
                    case SECONDS:
                    case SHA1:
                    case SHA224:
                    case SHA256:
                    case SHA384:
                    case SHA512:
                    case STR:
                    case STRAFTER:
                    case STRBEFORE:
                    case STRDT:
                    case STRENDS:
                    case STRING_LITERAL1:
                    case STRING_LITERAL2:
                    case STRING_LITERAL_LONG1:
                    case STRING_LITERAL_LONG2:
                    case STRLANG:
                    case STRLEN:
                    case STRSTARTS:
                    case SUBSTR:
                    case SUM:
                    case TIMEZONE:
                    case TRUE:
                    case TZ:
                    case UCASE:
                    case URI:
                    case VAR1:
                    case VAR2:
                    case YEAR:
                        {
                        alt126=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 126, 54, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 126, 8, input);

                    throw nvae;

                }

                }
                break;
            case RAND:
                {
                alt126=10;
                }
                break;
            case ABS:
                {
                alt126=11;
                }
                break;
            case CEIL:
                {
                alt126=12;
                }
                break;
            case FLOOR:
                {
                alt126=13;
                }
                break;
            case ROUND:
                {
                alt126=14;
                }
                break;
            case CONCAT:
                {
                alt126=15;
                }
                break;
            case SUBSTR:
                {
                alt126=16;
                }
                break;
            case STRLEN:
                {
                alt126=17;
                }
                break;
            case UCASE:
                {
                alt126=18;
                }
                break;
            case LCASE:
                {
                alt126=19;
                }
                break;
            case ENCODE_FOR_URI:
                {
                alt126=20;
                }
                break;
            case CONTAINS:
                {
                alt126=21;
                }
                break;
            case STRSTARTS:
                {
                alt126=22;
                }
                break;
            case STRENDS:
                {
                alt126=23;
                }
                break;
            case STRBEFORE:
                {
                alt126=24;
                }
                break;
            case STRAFTER:
                {
                alt126=25;
                }
                break;
            case REPLACE:
                {
                alt126=26;
                }
                break;
            case YEAR:
                {
                alt126=27;
                }
                break;
            case MONTH:
                {
                alt126=28;
                }
                break;
            case DAY:
                {
                alt126=29;
                }
                break;
            case HOURS:
                {
                alt126=30;
                }
                break;
            case MINUTES:
                {
                alt126=31;
                }
                break;
            case SECONDS:
                {
                alt126=32;
                }
                break;
            case TIMEZONE:
                {
                alt126=33;
                }
                break;
            case TZ:
                {
                alt126=34;
                }
                break;
            case NOW:
                {
                alt126=35;
                }
                break;
            case MD5:
                {
                alt126=36;
                }
                break;
            case SHA1:
                {
                alt126=37;
                }
                break;
            case SHA224:
                {
                alt126=38;
                }
                break;
            case SHA256:
                {
                alt126=39;
                }
                break;
            case SHA384:
                {
                alt126=40;
                }
                break;
            case SHA512:
                {
                alt126=41;
                }
                break;
            case COALESCE:
                {
                alt126=42;
                }
                break;
            case IF:
                {
                alt126=43;
                }
                break;
            case STRLANG:
                {
                alt126=44;
                }
                break;
            case STRDT:
                {
                alt126=45;
                }
                break;
            case SAMETERM:
                {
                alt126=46;
                }
                break;
            case ISIRI:
                {
                alt126=47;
                }
                break;
            case ISURI:
                {
                alt126=48;
                }
                break;
            case ISBLANK:
                {
                alt126=49;
                }
                break;
            case ISLITERAL:
                {
                alt126=50;
                }
                break;
            case ISNUMERIC:
                {
                alt126=51;
                }
                break;
            case REGEX:
                {
                alt126=52;
                }
                break;
            case EXISTS:
                {
                alt126=53;
                }
                break;
            case NOT:
                {
                alt126=54;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;

            }

            switch (alt126) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:540:7: STR OPEN_BRACE expression CLOSE_BRACE
                    {
                    STR386=(Token)match(input,STR,FOLLOW_STR_in_builtInCall5008);  
                    stream_STR.add(STR386);


                    OPEN_BRACE387=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5010);  
                    stream_OPEN_BRACE.add(OPEN_BRACE387);


                    pushFollow(FOLLOW_expression_in_builtInCall5012);
                    expression388=expression();

                    state._fsp--;

                    stream_expression.add(expression388.getTree());

                    CLOSE_BRACE389=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5014);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE389);


                    // AST REWRITE
                    // elements: expression, STR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 540:45: -> ^( STR expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:540:48: ^( STR expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:541:7: LANG OPEN_BRACE expression CLOSE_BRACE
                    {
                    LANG390=(Token)match(input,LANG,FOLLOW_LANG_in_builtInCall5030);  
                    stream_LANG.add(LANG390);


                    OPEN_BRACE391=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5032);  
                    stream_OPEN_BRACE.add(OPEN_BRACE391);


                    pushFollow(FOLLOW_expression_in_builtInCall5034);
                    expression392=expression();

                    state._fsp--;

                    stream_expression.add(expression392.getTree());

                    CLOSE_BRACE393=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5036);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE393);


                    // AST REWRITE
                    // elements: LANG, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 541:46: -> ^( LANG expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:541:49: ^( LANG expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LANG.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:542:7: LANGMATCHES OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    LANGMATCHES394=(Token)match(input,LANGMATCHES,FOLLOW_LANGMATCHES_in_builtInCall5052);  
                    stream_LANGMATCHES.add(LANGMATCHES394);


                    OPEN_BRACE395=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5054);  
                    stream_OPEN_BRACE.add(OPEN_BRACE395);


                    pushFollow(FOLLOW_expression_in_builtInCall5056);
                    expression396=expression();

                    state._fsp--;

                    stream_expression.add(expression396.getTree());

                    COMMA397=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5058);  
                    stream_COMMA.add(COMMA397);


                    pushFollow(FOLLOW_expression_in_builtInCall5060);
                    expression398=expression();

                    state._fsp--;

                    stream_expression.add(expression398.getTree());

                    CLOSE_BRACE399=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5062);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE399);


                    // AST REWRITE
                    // elements: LANGMATCHES, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 542:70: -> ^( LANGMATCHES ( expression )+ )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:542:73: ^( LANGMATCHES ( expression )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LANGMATCHES.nextNode()
                        , root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:543:7: DATATYPE OPEN_BRACE expression CLOSE_BRACE
                    {
                    DATATYPE400=(Token)match(input,DATATYPE,FOLLOW_DATATYPE_in_builtInCall5079);  
                    stream_DATATYPE.add(DATATYPE400);


                    OPEN_BRACE401=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5081);  
                    stream_OPEN_BRACE.add(OPEN_BRACE401);


                    pushFollow(FOLLOW_expression_in_builtInCall5083);
                    expression402=expression();

                    state._fsp--;

                    stream_expression.add(expression402.getTree());

                    CLOSE_BRACE403=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5085);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE403);


                    // AST REWRITE
                    // elements: DATATYPE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 543:50: -> ^( DATATYPE expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:543:53: ^( DATATYPE expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_DATATYPE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:544:7: BOUND OPEN_BRACE var CLOSE_BRACE
                    {
                    BOUND404=(Token)match(input,BOUND,FOLLOW_BOUND_in_builtInCall5101);  
                    stream_BOUND.add(BOUND404);


                    OPEN_BRACE405=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5103);  
                    stream_OPEN_BRACE.add(OPEN_BRACE405);


                    pushFollow(FOLLOW_var_in_builtInCall5105);
                    var406=var();

                    state._fsp--;

                    stream_var.add(var406.getTree());

                    CLOSE_BRACE407=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5107);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE407);


                    // AST REWRITE
                    // elements: BOUND, var
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 544:40: -> ^( BOUND var )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:544:43: ^( BOUND var )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_BOUND.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_var.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:545:7: IRI OPEN_BRACE expression CLOSE_BRACE
                    {
                    IRI408=(Token)match(input,IRI,FOLLOW_IRI_in_builtInCall5123);  
                    stream_IRI.add(IRI408);


                    OPEN_BRACE409=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5125);  
                    stream_OPEN_BRACE.add(OPEN_BRACE409);


                    pushFollow(FOLLOW_expression_in_builtInCall5127);
                    expression410=expression();

                    state._fsp--;

                    stream_expression.add(expression410.getTree());

                    CLOSE_BRACE411=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5129);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE411);


                    // AST REWRITE
                    // elements: IRI, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 545:45: -> ^( IRI expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:545:48: ^( IRI expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IRI.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\Sparql.g:546:7: URI OPEN_BRACE expression CLOSE_BRACE
                    {
                    URI412=(Token)match(input,URI,FOLLOW_URI_in_builtInCall5145);  
                    stream_URI.add(URI412);


                    OPEN_BRACE413=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5147);  
                    stream_OPEN_BRACE.add(OPEN_BRACE413);


                    pushFollow(FOLLOW_expression_in_builtInCall5149);
                    expression414=expression();

                    state._fsp--;

                    stream_expression.add(expression414.getTree());

                    CLOSE_BRACE415=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5151);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE415);


                    // AST REWRITE
                    // elements: URI, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 546:45: -> ^( URI expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:546:48: ^( URI expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_URI.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\Sparql.g:547:7: BNODE ( OPEN_BRACE expression CLOSE_BRACE )
                    {
                    BNODE416=(Token)match(input,BNODE,FOLLOW_BNODE_in_builtInCall5167);  
                    stream_BNODE.add(BNODE416);


                    // com\\googlecode\\sparkleg\\Sparql.g:547:13: ( OPEN_BRACE expression CLOSE_BRACE )
                    // com\\googlecode\\sparkleg\\Sparql.g:547:14: OPEN_BRACE expression CLOSE_BRACE
                    {
                    OPEN_BRACE417=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5170);  
                    stream_OPEN_BRACE.add(OPEN_BRACE417);


                    pushFollow(FOLLOW_expression_in_builtInCall5172);
                    expression418=expression();

                    state._fsp--;

                    stream_expression.add(expression418.getTree());

                    CLOSE_BRACE419=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5174);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE419);


                    }


                    // AST REWRITE
                    // elements: BNODE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 547:49: -> ^( BNODE expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:547:52: ^( BNODE expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_BNODE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // com\\googlecode\\sparkleg\\Sparql.g:548:7: BNODE nil
                    {
                    BNODE420=(Token)match(input,BNODE,FOLLOW_BNODE_in_builtInCall5191);  
                    stream_BNODE.add(BNODE420);


                    pushFollow(FOLLOW_nil_in_builtInCall5193);
                    nil421=nil();

                    state._fsp--;

                    stream_nil.add(nil421.getTree());

                    // AST REWRITE
                    // elements: BNODE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 548:17: -> BNODE
                    {
                        adaptor.addChild(root_0, 
                        stream_BNODE.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 10 :
                    // com\\googlecode\\sparkleg\\Sparql.g:549:7: RAND nil
                    {
                    RAND422=(Token)match(input,RAND,FOLLOW_RAND_in_builtInCall5205);  
                    stream_RAND.add(RAND422);


                    pushFollow(FOLLOW_nil_in_builtInCall5207);
                    nil423=nil();

                    state._fsp--;

                    stream_nil.add(nil423.getTree());

                    // AST REWRITE
                    // elements: RAND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 549:16: -> RAND
                    {
                        adaptor.addChild(root_0, 
                        stream_RAND.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 11 :
                    // com\\googlecode\\sparkleg\\Sparql.g:550:7: ABS OPEN_BRACE expression CLOSE_BRACE
                    {
                    ABS424=(Token)match(input,ABS,FOLLOW_ABS_in_builtInCall5219);  
                    stream_ABS.add(ABS424);


                    OPEN_BRACE425=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5221);  
                    stream_OPEN_BRACE.add(OPEN_BRACE425);


                    pushFollow(FOLLOW_expression_in_builtInCall5223);
                    expression426=expression();

                    state._fsp--;

                    stream_expression.add(expression426.getTree());

                    CLOSE_BRACE427=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5225);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE427);


                    // AST REWRITE
                    // elements: ABS, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 550:45: -> ^( ABS expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:550:48: ^( ABS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ABS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 12 :
                    // com\\googlecode\\sparkleg\\Sparql.g:551:7: CEIL OPEN_BRACE expression CLOSE_BRACE
                    {
                    CEIL428=(Token)match(input,CEIL,FOLLOW_CEIL_in_builtInCall5241);  
                    stream_CEIL.add(CEIL428);


                    OPEN_BRACE429=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5243);  
                    stream_OPEN_BRACE.add(OPEN_BRACE429);


                    pushFollow(FOLLOW_expression_in_builtInCall5245);
                    expression430=expression();

                    state._fsp--;

                    stream_expression.add(expression430.getTree());

                    CLOSE_BRACE431=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5247);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE431);


                    // AST REWRITE
                    // elements: expression, CEIL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 551:46: -> ^( CEIL expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:551:49: ^( CEIL expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CEIL.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 13 :
                    // com\\googlecode\\sparkleg\\Sparql.g:552:7: FLOOR OPEN_BRACE expression CLOSE_BRACE
                    {
                    FLOOR432=(Token)match(input,FLOOR,FOLLOW_FLOOR_in_builtInCall5263);  
                    stream_FLOOR.add(FLOOR432);


                    OPEN_BRACE433=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5265);  
                    stream_OPEN_BRACE.add(OPEN_BRACE433);


                    pushFollow(FOLLOW_expression_in_builtInCall5267);
                    expression434=expression();

                    state._fsp--;

                    stream_expression.add(expression434.getTree());

                    CLOSE_BRACE435=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5269);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE435);


                    // AST REWRITE
                    // elements: expression, FLOOR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 552:47: -> ^( FLOOR expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:552:50: ^( FLOOR expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FLOOR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 14 :
                    // com\\googlecode\\sparkleg\\Sparql.g:553:7: ROUND OPEN_BRACE expression CLOSE_BRACE
                    {
                    ROUND436=(Token)match(input,ROUND,FOLLOW_ROUND_in_builtInCall5285);  
                    stream_ROUND.add(ROUND436);


                    OPEN_BRACE437=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5287);  
                    stream_OPEN_BRACE.add(OPEN_BRACE437);


                    pushFollow(FOLLOW_expression_in_builtInCall5289);
                    expression438=expression();

                    state._fsp--;

                    stream_expression.add(expression438.getTree());

                    CLOSE_BRACE439=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5291);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE439);


                    // AST REWRITE
                    // elements: ROUND, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 553:47: -> ^( ROUND expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:553:50: ^( ROUND expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ROUND.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 15 :
                    // com\\googlecode\\sparkleg\\Sparql.g:554:7: CONCAT expressionList
                    {
                    CONCAT440=(Token)match(input,CONCAT,FOLLOW_CONCAT_in_builtInCall5307);  
                    stream_CONCAT.add(CONCAT440);


                    pushFollow(FOLLOW_expressionList_in_builtInCall5309);
                    expressionList441=expressionList();

                    state._fsp--;

                    stream_expressionList.add(expressionList441.getTree());

                    // AST REWRITE
                    // elements: CONCAT, expressionList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 554:29: -> ^( CONCAT expressionList )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:554:32: ^( CONCAT expressionList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CONCAT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expressionList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 16 :
                    // com\\googlecode\\sparkleg\\Sparql.g:555:7: subStringExpression
                    {
                    pushFollow(FOLLOW_subStringExpression_in_builtInCall5325);
                    subStringExpression442=subStringExpression();

                    state._fsp--;

                    stream_subStringExpression.add(subStringExpression442.getTree());

                    // AST REWRITE
                    // elements: subStringExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 555:27: -> subStringExpression
                    {
                        adaptor.addChild(root_0, stream_subStringExpression.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 17 :
                    // com\\googlecode\\sparkleg\\Sparql.g:556:7: STRLEN OPEN_BRACE expression CLOSE_BRACE
                    {
                    STRLEN443=(Token)match(input,STRLEN,FOLLOW_STRLEN_in_builtInCall5337);  
                    stream_STRLEN.add(STRLEN443);


                    OPEN_BRACE444=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5339);  
                    stream_OPEN_BRACE.add(OPEN_BRACE444);


                    pushFollow(FOLLOW_expression_in_builtInCall5341);
                    expression445=expression();

                    state._fsp--;

                    stream_expression.add(expression445.getTree());

                    CLOSE_BRACE446=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5343);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE446);


                    // AST REWRITE
                    // elements: STRLEN, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 556:48: -> ^( STRLEN expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:556:51: ^( STRLEN expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STRLEN.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 18 :
                    // com\\googlecode\\sparkleg\\Sparql.g:557:7: UCASE OPEN_BRACE expression CLOSE_BRACE
                    {
                    UCASE447=(Token)match(input,UCASE,FOLLOW_UCASE_in_builtInCall5359);  
                    stream_UCASE.add(UCASE447);


                    OPEN_BRACE448=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5361);  
                    stream_OPEN_BRACE.add(OPEN_BRACE448);


                    pushFollow(FOLLOW_expression_in_builtInCall5363);
                    expression449=expression();

                    state._fsp--;

                    stream_expression.add(expression449.getTree());

                    CLOSE_BRACE450=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5365);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE450);


                    // AST REWRITE
                    // elements: UCASE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 557:47: -> ^( UCASE expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:557:50: ^( UCASE expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_UCASE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 19 :
                    // com\\googlecode\\sparkleg\\Sparql.g:558:7: LCASE OPEN_BRACE expression CLOSE_BRACE
                    {
                    LCASE451=(Token)match(input,LCASE,FOLLOW_LCASE_in_builtInCall5381);  
                    stream_LCASE.add(LCASE451);


                    OPEN_BRACE452=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5383);  
                    stream_OPEN_BRACE.add(OPEN_BRACE452);


                    pushFollow(FOLLOW_expression_in_builtInCall5385);
                    expression453=expression();

                    state._fsp--;

                    stream_expression.add(expression453.getTree());

                    CLOSE_BRACE454=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5387);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE454);


                    // AST REWRITE
                    // elements: expression, LCASE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 558:47: -> ^( LCASE expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:558:50: ^( LCASE expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_LCASE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 20 :
                    // com\\googlecode\\sparkleg\\Sparql.g:559:7: ENCODE_FOR_URI OPEN_BRACE expression CLOSE_BRACE
                    {
                    ENCODE_FOR_URI455=(Token)match(input,ENCODE_FOR_URI,FOLLOW_ENCODE_FOR_URI_in_builtInCall5403);  
                    stream_ENCODE_FOR_URI.add(ENCODE_FOR_URI455);


                    OPEN_BRACE456=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5405);  
                    stream_OPEN_BRACE.add(OPEN_BRACE456);


                    pushFollow(FOLLOW_expression_in_builtInCall5407);
                    expression457=expression();

                    state._fsp--;

                    stream_expression.add(expression457.getTree());

                    CLOSE_BRACE458=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5409);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE458);


                    // AST REWRITE
                    // elements: ENCODE_FOR_URI, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 559:56: -> ^( ENCODE_FOR_URI expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:559:59: ^( ENCODE_FOR_URI expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ENCODE_FOR_URI.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 21 :
                    // com\\googlecode\\sparkleg\\Sparql.g:560:7: CONTAINS OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    CONTAINS459=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_builtInCall5425);  
                    stream_CONTAINS.add(CONTAINS459);


                    OPEN_BRACE460=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5427);  
                    stream_OPEN_BRACE.add(OPEN_BRACE460);


                    pushFollow(FOLLOW_expression_in_builtInCall5429);
                    expression461=expression();

                    state._fsp--;

                    stream_expression.add(expression461.getTree());

                    COMMA462=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5431);  
                    stream_COMMA.add(COMMA462);


                    pushFollow(FOLLOW_expression_in_builtInCall5433);
                    expression463=expression();

                    state._fsp--;

                    stream_expression.add(expression463.getTree());

                    CLOSE_BRACE464=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5435);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE464);


                    // AST REWRITE
                    // elements: expression, expression, CONTAINS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 560:67: -> ^( CONTAINS expression expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:560:70: ^( CONTAINS expression expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_CONTAINS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 22 :
                    // com\\googlecode\\sparkleg\\Sparql.g:561:7: STRSTARTS OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    STRSTARTS465=(Token)match(input,STRSTARTS,FOLLOW_STRSTARTS_in_builtInCall5453);  
                    stream_STRSTARTS.add(STRSTARTS465);


                    OPEN_BRACE466=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5455);  
                    stream_OPEN_BRACE.add(OPEN_BRACE466);


                    pushFollow(FOLLOW_expression_in_builtInCall5457);
                    expression467=expression();

                    state._fsp--;

                    stream_expression.add(expression467.getTree());

                    COMMA468=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5459);  
                    stream_COMMA.add(COMMA468);


                    pushFollow(FOLLOW_expression_in_builtInCall5461);
                    expression469=expression();

                    state._fsp--;

                    stream_expression.add(expression469.getTree());

                    CLOSE_BRACE470=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5463);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE470);


                    // AST REWRITE
                    // elements: STRSTARTS, expression, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 561:68: -> ^( STRSTARTS expression expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:561:71: ^( STRSTARTS expression expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STRSTARTS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 23 :
                    // com\\googlecode\\sparkleg\\Sparql.g:562:7: STRENDS OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    STRENDS471=(Token)match(input,STRENDS,FOLLOW_STRENDS_in_builtInCall5481);  
                    stream_STRENDS.add(STRENDS471);


                    OPEN_BRACE472=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5483);  
                    stream_OPEN_BRACE.add(OPEN_BRACE472);


                    pushFollow(FOLLOW_expression_in_builtInCall5485);
                    expression473=expression();

                    state._fsp--;

                    stream_expression.add(expression473.getTree());

                    COMMA474=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5487);  
                    stream_COMMA.add(COMMA474);


                    pushFollow(FOLLOW_expression_in_builtInCall5489);
                    expression475=expression();

                    state._fsp--;

                    stream_expression.add(expression475.getTree());

                    CLOSE_BRACE476=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5491);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE476);


                    // AST REWRITE
                    // elements: expression, expression, STRENDS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 562:66: -> ^( STRENDS expression expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:562:69: ^( STRENDS expression expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STRENDS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 24 :
                    // com\\googlecode\\sparkleg\\Sparql.g:563:7: STRBEFORE OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    STRBEFORE477=(Token)match(input,STRBEFORE,FOLLOW_STRBEFORE_in_builtInCall5509);  
                    stream_STRBEFORE.add(STRBEFORE477);


                    OPEN_BRACE478=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5511);  
                    stream_OPEN_BRACE.add(OPEN_BRACE478);


                    pushFollow(FOLLOW_expression_in_builtInCall5513);
                    expression479=expression();

                    state._fsp--;

                    stream_expression.add(expression479.getTree());

                    COMMA480=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5515);  
                    stream_COMMA.add(COMMA480);


                    pushFollow(FOLLOW_expression_in_builtInCall5517);
                    expression481=expression();

                    state._fsp--;

                    stream_expression.add(expression481.getTree());

                    CLOSE_BRACE482=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5519);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE482);


                    // AST REWRITE
                    // elements: expression, expression, STRBEFORE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 563:68: -> ^( STRBEFORE expression expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:563:71: ^( STRBEFORE expression expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STRBEFORE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 25 :
                    // com\\googlecode\\sparkleg\\Sparql.g:564:7: STRAFTER OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    STRAFTER483=(Token)match(input,STRAFTER,FOLLOW_STRAFTER_in_builtInCall5537);  
                    stream_STRAFTER.add(STRAFTER483);


                    OPEN_BRACE484=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5539);  
                    stream_OPEN_BRACE.add(OPEN_BRACE484);


                    pushFollow(FOLLOW_expression_in_builtInCall5541);
                    expression485=expression();

                    state._fsp--;

                    stream_expression.add(expression485.getTree());

                    COMMA486=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5543);  
                    stream_COMMA.add(COMMA486);


                    pushFollow(FOLLOW_expression_in_builtInCall5545);
                    expression487=expression();

                    state._fsp--;

                    stream_expression.add(expression487.getTree());

                    CLOSE_BRACE488=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5547);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE488);


                    // AST REWRITE
                    // elements: expression, expression, STRAFTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 564:67: -> ^( STRAFTER expression expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:564:70: ^( STRAFTER expression expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STRAFTER.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 26 :
                    // com\\googlecode\\sparkleg\\Sparql.g:565:7: REPLACE OPEN_BRACE expression COMMA expression COMMA expression CLOSE_BRACE
                    {
                    REPLACE489=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_builtInCall5565);  
                    stream_REPLACE.add(REPLACE489);


                    OPEN_BRACE490=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5567);  
                    stream_OPEN_BRACE.add(OPEN_BRACE490);


                    pushFollow(FOLLOW_expression_in_builtInCall5569);
                    expression491=expression();

                    state._fsp--;

                    stream_expression.add(expression491.getTree());

                    COMMA492=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5571);  
                    stream_COMMA.add(COMMA492);


                    pushFollow(FOLLOW_expression_in_builtInCall5573);
                    expression493=expression();

                    state._fsp--;

                    stream_expression.add(expression493.getTree());

                    COMMA494=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5575);  
                    stream_COMMA.add(COMMA494);


                    pushFollow(FOLLOW_expression_in_builtInCall5577);
                    expression495=expression();

                    state._fsp--;

                    stream_expression.add(expression495.getTree());

                    CLOSE_BRACE496=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5579);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE496);


                    // AST REWRITE
                    // elements: expression, REPLACE, expression, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 565:83: -> ^( REPLACE expression expression expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:565:86: ^( REPLACE expression expression expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_REPLACE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 27 :
                    // com\\googlecode\\sparkleg\\Sparql.g:566:7: YEAR OPEN_BRACE expression CLOSE_BRACE
                    {
                    YEAR497=(Token)match(input,YEAR,FOLLOW_YEAR_in_builtInCall5599);  
                    stream_YEAR.add(YEAR497);


                    OPEN_BRACE498=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5601);  
                    stream_OPEN_BRACE.add(OPEN_BRACE498);


                    pushFollow(FOLLOW_expression_in_builtInCall5603);
                    expression499=expression();

                    state._fsp--;

                    stream_expression.add(expression499.getTree());

                    CLOSE_BRACE500=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5605);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE500);


                    // AST REWRITE
                    // elements: YEAR, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 566:46: -> ^( YEAR expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:566:49: ^( YEAR expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_YEAR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 28 :
                    // com\\googlecode\\sparkleg\\Sparql.g:567:7: MONTH OPEN_BRACE expression CLOSE_BRACE
                    {
                    MONTH501=(Token)match(input,MONTH,FOLLOW_MONTH_in_builtInCall5621);  
                    stream_MONTH.add(MONTH501);


                    OPEN_BRACE502=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5623);  
                    stream_OPEN_BRACE.add(OPEN_BRACE502);


                    pushFollow(FOLLOW_expression_in_builtInCall5625);
                    expression503=expression();

                    state._fsp--;

                    stream_expression.add(expression503.getTree());

                    CLOSE_BRACE504=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5627);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE504);


                    // AST REWRITE
                    // elements: expression, MONTH
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 567:47: -> ^( MONTH expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:567:50: ^( MONTH expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_MONTH.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 29 :
                    // com\\googlecode\\sparkleg\\Sparql.g:568:7: DAY OPEN_BRACE expression CLOSE_BRACE
                    {
                    DAY505=(Token)match(input,DAY,FOLLOW_DAY_in_builtInCall5643);  
                    stream_DAY.add(DAY505);


                    OPEN_BRACE506=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5645);  
                    stream_OPEN_BRACE.add(OPEN_BRACE506);


                    pushFollow(FOLLOW_expression_in_builtInCall5647);
                    expression507=expression();

                    state._fsp--;

                    stream_expression.add(expression507.getTree());

                    CLOSE_BRACE508=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5649);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE508);


                    // AST REWRITE
                    // elements: expression, DAY
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 568:45: -> ^( DAY expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:568:48: ^( DAY expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_DAY.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 30 :
                    // com\\googlecode\\sparkleg\\Sparql.g:569:7: HOURS OPEN_BRACE expression CLOSE_BRACE
                    {
                    HOURS509=(Token)match(input,HOURS,FOLLOW_HOURS_in_builtInCall5665);  
                    stream_HOURS.add(HOURS509);


                    OPEN_BRACE510=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5667);  
                    stream_OPEN_BRACE.add(OPEN_BRACE510);


                    pushFollow(FOLLOW_expression_in_builtInCall5669);
                    expression511=expression();

                    state._fsp--;

                    stream_expression.add(expression511.getTree());

                    CLOSE_BRACE512=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5671);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE512);


                    // AST REWRITE
                    // elements: HOURS, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 569:47: -> ^( HOURS expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:569:50: ^( HOURS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_HOURS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 31 :
                    // com\\googlecode\\sparkleg\\Sparql.g:570:7: MINUTES OPEN_BRACE expression CLOSE_BRACE
                    {
                    MINUTES513=(Token)match(input,MINUTES,FOLLOW_MINUTES_in_builtInCall5687);  
                    stream_MINUTES.add(MINUTES513);


                    OPEN_BRACE514=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5689);  
                    stream_OPEN_BRACE.add(OPEN_BRACE514);


                    pushFollow(FOLLOW_expression_in_builtInCall5691);
                    expression515=expression();

                    state._fsp--;

                    stream_expression.add(expression515.getTree());

                    CLOSE_BRACE516=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5693);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE516);


                    // AST REWRITE
                    // elements: expression, MINUTES
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 570:49: -> ^( MINUTES expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:570:52: ^( MINUTES expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_MINUTES.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 32 :
                    // com\\googlecode\\sparkleg\\Sparql.g:571:7: SECONDS OPEN_BRACE expression CLOSE_BRACE
                    {
                    SECONDS517=(Token)match(input,SECONDS,FOLLOW_SECONDS_in_builtInCall5709);  
                    stream_SECONDS.add(SECONDS517);


                    OPEN_BRACE518=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5711);  
                    stream_OPEN_BRACE.add(OPEN_BRACE518);


                    pushFollow(FOLLOW_expression_in_builtInCall5713);
                    expression519=expression();

                    state._fsp--;

                    stream_expression.add(expression519.getTree());

                    CLOSE_BRACE520=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5715);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE520);


                    // AST REWRITE
                    // elements: SECONDS, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 571:49: -> ^( SECONDS expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:571:52: ^( SECONDS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_SECONDS.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 33 :
                    // com\\googlecode\\sparkleg\\Sparql.g:572:7: TIMEZONE OPEN_BRACE expression CLOSE_BRACE
                    {
                    TIMEZONE521=(Token)match(input,TIMEZONE,FOLLOW_TIMEZONE_in_builtInCall5731);  
                    stream_TIMEZONE.add(TIMEZONE521);


                    OPEN_BRACE522=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5733);  
                    stream_OPEN_BRACE.add(OPEN_BRACE522);


                    pushFollow(FOLLOW_expression_in_builtInCall5735);
                    expression523=expression();

                    state._fsp--;

                    stream_expression.add(expression523.getTree());

                    CLOSE_BRACE524=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5737);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE524);


                    // AST REWRITE
                    // elements: expression, TIMEZONE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 572:50: -> ^( TIMEZONE expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:572:53: ^( TIMEZONE expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_TIMEZONE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 34 :
                    // com\\googlecode\\sparkleg\\Sparql.g:573:7: TZ OPEN_BRACE expression CLOSE_BRACE
                    {
                    TZ525=(Token)match(input,TZ,FOLLOW_TZ_in_builtInCall5753);  
                    stream_TZ.add(TZ525);


                    OPEN_BRACE526=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5755);  
                    stream_OPEN_BRACE.add(OPEN_BRACE526);


                    pushFollow(FOLLOW_expression_in_builtInCall5757);
                    expression527=expression();

                    state._fsp--;

                    stream_expression.add(expression527.getTree());

                    CLOSE_BRACE528=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5759);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE528);


                    // AST REWRITE
                    // elements: expression, TZ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 573:44: -> ^( TZ expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:573:47: ^( TZ expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_TZ.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 35 :
                    // com\\googlecode\\sparkleg\\Sparql.g:574:7: NOW nil
                    {
                    NOW529=(Token)match(input,NOW,FOLLOW_NOW_in_builtInCall5775);  
                    stream_NOW.add(NOW529);


                    pushFollow(FOLLOW_nil_in_builtInCall5777);
                    nil530=nil();

                    state._fsp--;

                    stream_nil.add(nil530.getTree());

                    // AST REWRITE
                    // elements: NOW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 574:15: -> NOW
                    {
                        adaptor.addChild(root_0, 
                        stream_NOW.nextNode()
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 36 :
                    // com\\googlecode\\sparkleg\\Sparql.g:575:7: MD5 OPEN_BRACE expression CLOSE_BRACE
                    {
                    MD5531=(Token)match(input,MD5,FOLLOW_MD5_in_builtInCall5789);  
                    stream_MD5.add(MD5531);


                    OPEN_BRACE532=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5791);  
                    stream_OPEN_BRACE.add(OPEN_BRACE532);


                    pushFollow(FOLLOW_expression_in_builtInCall5793);
                    expression533=expression();

                    state._fsp--;

                    stream_expression.add(expression533.getTree());

                    CLOSE_BRACE534=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5795);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE534);


                    // AST REWRITE
                    // elements: MD5, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 575:45: -> ^( MD5 expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:575:48: ^( MD5 expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_MD5.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 37 :
                    // com\\googlecode\\sparkleg\\Sparql.g:576:7: SHA1 OPEN_BRACE expression CLOSE_BRACE
                    {
                    SHA1535=(Token)match(input,SHA1,FOLLOW_SHA1_in_builtInCall5811);  
                    stream_SHA1.add(SHA1535);


                    OPEN_BRACE536=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5813);  
                    stream_OPEN_BRACE.add(OPEN_BRACE536);


                    pushFollow(FOLLOW_expression_in_builtInCall5815);
                    expression537=expression();

                    state._fsp--;

                    stream_expression.add(expression537.getTree());

                    CLOSE_BRACE538=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5817);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE538);


                    // AST REWRITE
                    // elements: SHA1, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 576:46: -> ^( SHA1 expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:576:49: ^( SHA1 expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_SHA1.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 38 :
                    // com\\googlecode\\sparkleg\\Sparql.g:577:7: SHA224 OPEN_BRACE expression CLOSE_BRACE
                    {
                    SHA224539=(Token)match(input,SHA224,FOLLOW_SHA224_in_builtInCall5833);  
                    stream_SHA224.add(SHA224539);


                    OPEN_BRACE540=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5835);  
                    stream_OPEN_BRACE.add(OPEN_BRACE540);


                    pushFollow(FOLLOW_expression_in_builtInCall5837);
                    expression541=expression();

                    state._fsp--;

                    stream_expression.add(expression541.getTree());

                    CLOSE_BRACE542=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5839);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE542);


                    // AST REWRITE
                    // elements: expression, SHA224
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 577:48: -> ^( SHA224 expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:577:51: ^( SHA224 expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_SHA224.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 39 :
                    // com\\googlecode\\sparkleg\\Sparql.g:578:7: SHA256 OPEN_BRACE expression CLOSE_BRACE
                    {
                    SHA256543=(Token)match(input,SHA256,FOLLOW_SHA256_in_builtInCall5855);  
                    stream_SHA256.add(SHA256543);


                    OPEN_BRACE544=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5857);  
                    stream_OPEN_BRACE.add(OPEN_BRACE544);


                    pushFollow(FOLLOW_expression_in_builtInCall5859);
                    expression545=expression();

                    state._fsp--;

                    stream_expression.add(expression545.getTree());

                    CLOSE_BRACE546=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5861);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE546);


                    // AST REWRITE
                    // elements: SHA256, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 578:48: -> ^( SHA256 expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:578:51: ^( SHA256 expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_SHA256.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 40 :
                    // com\\googlecode\\sparkleg\\Sparql.g:579:7: SHA384 OPEN_BRACE expression CLOSE_BRACE
                    {
                    SHA384547=(Token)match(input,SHA384,FOLLOW_SHA384_in_builtInCall5877);  
                    stream_SHA384.add(SHA384547);


                    OPEN_BRACE548=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5879);  
                    stream_OPEN_BRACE.add(OPEN_BRACE548);


                    pushFollow(FOLLOW_expression_in_builtInCall5881);
                    expression549=expression();

                    state._fsp--;

                    stream_expression.add(expression549.getTree());

                    CLOSE_BRACE550=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5883);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE550);


                    // AST REWRITE
                    // elements: SHA384, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 579:48: -> ^( SHA384 expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:579:51: ^( SHA384 expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_SHA384.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 41 :
                    // com\\googlecode\\sparkleg\\Sparql.g:580:7: SHA512 OPEN_BRACE expression CLOSE_BRACE
                    {
                    SHA512551=(Token)match(input,SHA512,FOLLOW_SHA512_in_builtInCall5899);  
                    stream_SHA512.add(SHA512551);


                    OPEN_BRACE552=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5901);  
                    stream_OPEN_BRACE.add(OPEN_BRACE552);


                    pushFollow(FOLLOW_expression_in_builtInCall5903);
                    expression553=expression();

                    state._fsp--;

                    stream_expression.add(expression553.getTree());

                    CLOSE_BRACE554=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5905);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE554);


                    // AST REWRITE
                    // elements: expression, SHA512
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 580:48: -> ^( SHA512 expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:580:51: ^( SHA512 expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_SHA512.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 42 :
                    // com\\googlecode\\sparkleg\\Sparql.g:581:7: COALESCE expressionList
                    {
                    COALESCE555=(Token)match(input,COALESCE,FOLLOW_COALESCE_in_builtInCall5921);  
                    stream_COALESCE.add(COALESCE555);


                    pushFollow(FOLLOW_expressionList_in_builtInCall5923);
                    expressionList556=expressionList();

                    state._fsp--;

                    stream_expressionList.add(expressionList556.getTree());

                    // AST REWRITE
                    // elements: COALESCE, expressionList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 581:31: -> ^( COALESCE expressionList )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:581:34: ^( COALESCE expressionList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_COALESCE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expressionList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 43 :
                    // com\\googlecode\\sparkleg\\Sparql.g:582:7: IF OPEN_BRACE e1= expression COMMA e2= expression COMMA e3= expression CLOSE_BRACE
                    {
                    IF557=(Token)match(input,IF,FOLLOW_IF_in_builtInCall5939);  
                    stream_IF.add(IF557);


                    OPEN_BRACE558=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5941);  
                    stream_OPEN_BRACE.add(OPEN_BRACE558);


                    pushFollow(FOLLOW_expression_in_builtInCall5945);
                    e1=expression();

                    state._fsp--;

                    stream_expression.add(e1.getTree());

                    COMMA559=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5947);  
                    stream_COMMA.add(COMMA559);


                    pushFollow(FOLLOW_expression_in_builtInCall5951);
                    e2=expression();

                    state._fsp--;

                    stream_expression.add(e2.getTree());

                    COMMA560=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5953);  
                    stream_COMMA.add(COMMA560);


                    pushFollow(FOLLOW_expression_in_builtInCall5957);
                    e3=expression();

                    state._fsp--;

                    stream_expression.add(e3.getTree());

                    CLOSE_BRACE561=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5959);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE561);


                    // AST REWRITE
                    // elements: e3, e2, e1, IF
                    // token labels: 
                    // rule labels: e3, retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 582:87: -> ^( IF $e1 $e2 $e3)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:582:90: ^( IF $e1 $e2 $e3)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_IF.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());

                        adaptor.addChild(root_1, stream_e2.nextTree());

                        adaptor.addChild(root_1, stream_e3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 44 :
                    // com\\googlecode\\sparkleg\\Sparql.g:583:7: STRLANG OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    STRLANG562=(Token)match(input,STRLANG,FOLLOW_STRLANG_in_builtInCall5982);  
                    stream_STRLANG.add(STRLANG562);


                    OPEN_BRACE563=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5984);  
                    stream_OPEN_BRACE.add(OPEN_BRACE563);


                    pushFollow(FOLLOW_expression_in_builtInCall5986);
                    expression564=expression();

                    state._fsp--;

                    stream_expression.add(expression564.getTree());

                    COMMA565=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5988);  
                    stream_COMMA.add(COMMA565);


                    pushFollow(FOLLOW_expression_in_builtInCall5990);
                    expression566=expression();

                    state._fsp--;

                    stream_expression.add(expression566.getTree());

                    CLOSE_BRACE567=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5992);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE567);


                    // AST REWRITE
                    // elements: expression, STRLANG, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 583:66: -> ^( STRLANG expression expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:583:69: ^( STRLANG expression expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STRLANG.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 45 :
                    // com\\googlecode\\sparkleg\\Sparql.g:584:7: STRDT OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    STRDT568=(Token)match(input,STRDT,FOLLOW_STRDT_in_builtInCall6010);  
                    stream_STRDT.add(STRDT568);


                    OPEN_BRACE569=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall6012);  
                    stream_OPEN_BRACE.add(OPEN_BRACE569);


                    pushFollow(FOLLOW_expression_in_builtInCall6014);
                    expression570=expression();

                    state._fsp--;

                    stream_expression.add(expression570.getTree());

                    COMMA571=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall6016);  
                    stream_COMMA.add(COMMA571);


                    pushFollow(FOLLOW_expression_in_builtInCall6018);
                    expression572=expression();

                    state._fsp--;

                    stream_expression.add(expression572.getTree());

                    CLOSE_BRACE573=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall6020);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE573);


                    // AST REWRITE
                    // elements: STRDT, expression, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 584:64: -> ^( STRDT expression expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:584:67: ^( STRDT expression expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_STRDT.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 46 :
                    // com\\googlecode\\sparkleg\\Sparql.g:585:7: SAMETERM OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    SAMETERM574=(Token)match(input,SAMETERM,FOLLOW_SAMETERM_in_builtInCall6038);  
                    stream_SAMETERM.add(SAMETERM574);


                    OPEN_BRACE575=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall6040);  
                    stream_OPEN_BRACE.add(OPEN_BRACE575);


                    pushFollow(FOLLOW_expression_in_builtInCall6042);
                    expression576=expression();

                    state._fsp--;

                    stream_expression.add(expression576.getTree());

                    COMMA577=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall6044);  
                    stream_COMMA.add(COMMA577);


                    pushFollow(FOLLOW_expression_in_builtInCall6046);
                    expression578=expression();

                    state._fsp--;

                    stream_expression.add(expression578.getTree());

                    CLOSE_BRACE579=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall6048);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE579);


                    // AST REWRITE
                    // elements: expression, expression, SAMETERM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 585:67: -> ^( SAMETERM expression expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:585:70: ^( SAMETERM expression expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_SAMETERM.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 47 :
                    // com\\googlecode\\sparkleg\\Sparql.g:586:7: ISIRI OPEN_BRACE expression CLOSE_BRACE
                    {
                    ISIRI580=(Token)match(input,ISIRI,FOLLOW_ISIRI_in_builtInCall6066);  
                    stream_ISIRI.add(ISIRI580);


                    OPEN_BRACE581=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall6068);  
                    stream_OPEN_BRACE.add(OPEN_BRACE581);


                    pushFollow(FOLLOW_expression_in_builtInCall6070);
                    expression582=expression();

                    state._fsp--;

                    stream_expression.add(expression582.getTree());

                    CLOSE_BRACE583=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall6072);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE583);


                    // AST REWRITE
                    // elements: ISIRI, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 586:47: -> ^( ISIRI expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:586:50: ^( ISIRI expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISIRI.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 48 :
                    // com\\googlecode\\sparkleg\\Sparql.g:587:7: ISURI OPEN_BRACE expression CLOSE_BRACE
                    {
                    ISURI584=(Token)match(input,ISURI,FOLLOW_ISURI_in_builtInCall6088);  
                    stream_ISURI.add(ISURI584);


                    OPEN_BRACE585=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall6090);  
                    stream_OPEN_BRACE.add(OPEN_BRACE585);


                    pushFollow(FOLLOW_expression_in_builtInCall6092);
                    expression586=expression();

                    state._fsp--;

                    stream_expression.add(expression586.getTree());

                    CLOSE_BRACE587=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall6094);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE587);


                    // AST REWRITE
                    // elements: ISURI, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 587:47: -> ^( ISURI expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:587:50: ^( ISURI expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISURI.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 49 :
                    // com\\googlecode\\sparkleg\\Sparql.g:588:7: ISBLANK OPEN_BRACE expression CLOSE_BRACE
                    {
                    ISBLANK588=(Token)match(input,ISBLANK,FOLLOW_ISBLANK_in_builtInCall6110);  
                    stream_ISBLANK.add(ISBLANK588);


                    OPEN_BRACE589=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall6112);  
                    stream_OPEN_BRACE.add(OPEN_BRACE589);


                    pushFollow(FOLLOW_expression_in_builtInCall6114);
                    expression590=expression();

                    state._fsp--;

                    stream_expression.add(expression590.getTree());

                    CLOSE_BRACE591=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall6116);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE591);


                    // AST REWRITE
                    // elements: ISBLANK, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 588:49: -> ^( ISBLANK expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:588:52: ^( ISBLANK expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISBLANK.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 50 :
                    // com\\googlecode\\sparkleg\\Sparql.g:589:7: ISLITERAL OPEN_BRACE expression CLOSE_BRACE
                    {
                    ISLITERAL592=(Token)match(input,ISLITERAL,FOLLOW_ISLITERAL_in_builtInCall6133);  
                    stream_ISLITERAL.add(ISLITERAL592);


                    OPEN_BRACE593=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall6135);  
                    stream_OPEN_BRACE.add(OPEN_BRACE593);


                    pushFollow(FOLLOW_expression_in_builtInCall6137);
                    expression594=expression();

                    state._fsp--;

                    stream_expression.add(expression594.getTree());

                    CLOSE_BRACE595=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall6139);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE595);


                    // AST REWRITE
                    // elements: expression, ISLITERAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 589:51: -> ^( ISLITERAL expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:589:54: ^( ISLITERAL expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISLITERAL.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 51 :
                    // com\\googlecode\\sparkleg\\Sparql.g:590:7: ISNUMERIC OPEN_BRACE expression CLOSE_BRACE
                    {
                    ISNUMERIC596=(Token)match(input,ISNUMERIC,FOLLOW_ISNUMERIC_in_builtInCall6155);  
                    stream_ISNUMERIC.add(ISNUMERIC596);


                    OPEN_BRACE597=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall6157);  
                    stream_OPEN_BRACE.add(OPEN_BRACE597);


                    pushFollow(FOLLOW_expression_in_builtInCall6159);
                    expression598=expression();

                    state._fsp--;

                    stream_expression.add(expression598.getTree());

                    CLOSE_BRACE599=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall6161);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE599);


                    // AST REWRITE
                    // elements: expression, ISNUMERIC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 590:51: -> ^( ISNUMERIC expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:590:54: ^( ISNUMERIC expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_ISNUMERIC.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 52 :
                    // com\\googlecode\\sparkleg\\Sparql.g:591:7: regexExpression
                    {
                    pushFollow(FOLLOW_regexExpression_in_builtInCall6177);
                    regexExpression600=regexExpression();

                    state._fsp--;

                    stream_regexExpression.add(regexExpression600.getTree());

                    // AST REWRITE
                    // elements: regexExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 591:23: -> regexExpression
                    {
                        adaptor.addChild(root_0, stream_regexExpression.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 53 :
                    // com\\googlecode\\sparkleg\\Sparql.g:592:7: existsFunction
                    {
                    pushFollow(FOLLOW_existsFunction_in_builtInCall6189);
                    existsFunction601=existsFunction();

                    state._fsp--;

                    stream_existsFunction.add(existsFunction601.getTree());

                    // AST REWRITE
                    // elements: existsFunction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 592:22: -> existsFunction
                    {
                        adaptor.addChild(root_0, stream_existsFunction.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 54 :
                    // com\\googlecode\\sparkleg\\Sparql.g:593:7: notExistsFunction
                    {
                    pushFollow(FOLLOW_notExistsFunction_in_builtInCall6201);
                    notExistsFunction602=notExistsFunction();

                    state._fsp--;

                    stream_notExistsFunction.add(notExistsFunction602.getTree());

                    // AST REWRITE
                    // elements: notExistsFunction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 593:25: -> notExistsFunction
                    {
                        adaptor.addChild(root_0, stream_notExistsFunction.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "builtInCall"


    public static class regexExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "regexExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:596:1: regexExpression : REGEX OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE -> ^( REGEX ( expression )* ) ;
    public final SparqlParser.regexExpression_return regexExpression() throws RecognitionException {
        SparqlParser.regexExpression_return retval = new SparqlParser.regexExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REGEX603=null;
        Token OPEN_BRACE604=null;
        Token COMMA606=null;
        Token COMMA608=null;
        Token CLOSE_BRACE610=null;
        SparqlParser.expression_return expression605 =null;

        SparqlParser.expression_return expression607 =null;

        SparqlParser.expression_return expression609 =null;


        Object REGEX603_tree=null;
        Object OPEN_BRACE604_tree=null;
        Object COMMA606_tree=null;
        Object COMMA608_tree=null;
        Object CLOSE_BRACE610_tree=null;
        RewriteRuleTokenStream stream_REGEX=new RewriteRuleTokenStream(adaptor,"token REGEX");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:597:5: ( REGEX OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE -> ^( REGEX ( expression )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:597:7: REGEX OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE
            {
            REGEX603=(Token)match(input,REGEX,FOLLOW_REGEX_in_regexExpression6222);  
            stream_REGEX.add(REGEX603);


            OPEN_BRACE604=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_regexExpression6224);  
            stream_OPEN_BRACE.add(OPEN_BRACE604);


            pushFollow(FOLLOW_expression_in_regexExpression6226);
            expression605=expression();

            state._fsp--;

            stream_expression.add(expression605.getTree());

            COMMA606=(Token)match(input,COMMA,FOLLOW_COMMA_in_regexExpression6228);  
            stream_COMMA.add(COMMA606);


            pushFollow(FOLLOW_expression_in_regexExpression6230);
            expression607=expression();

            state._fsp--;

            stream_expression.add(expression607.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:597:52: ( COMMA expression )?
            int alt127=2;
            switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt127=1;
                    }
                    break;
            }

            switch (alt127) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:597:53: COMMA expression
                    {
                    COMMA608=(Token)match(input,COMMA,FOLLOW_COMMA_in_regexExpression6233);  
                    stream_COMMA.add(COMMA608);


                    pushFollow(FOLLOW_expression_in_regexExpression6235);
                    expression609=expression();

                    state._fsp--;

                    stream_expression.add(expression609.getTree());

                    }
                    break;

            }


            CLOSE_BRACE610=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_regexExpression6239);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE610);


            // AST REWRITE
            // elements: expression, REGEX
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 597:84: -> ^( REGEX ( expression )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:597:87: ^( REGEX ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_REGEX.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:597:95: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "regexExpression"


    public static class subStringExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subStringExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:600:1: subStringExpression : SUBSTR OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE -> ^( SUBSTR ( expression )* ) ;
    public final SparqlParser.subStringExpression_return subStringExpression() throws RecognitionException {
        SparqlParser.subStringExpression_return retval = new SparqlParser.subStringExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SUBSTR611=null;
        Token OPEN_BRACE612=null;
        Token COMMA614=null;
        Token COMMA616=null;
        Token CLOSE_BRACE618=null;
        SparqlParser.expression_return expression613 =null;

        SparqlParser.expression_return expression615 =null;

        SparqlParser.expression_return expression617 =null;


        Object SUBSTR611_tree=null;
        Object OPEN_BRACE612_tree=null;
        Object COMMA614_tree=null;
        Object COMMA616_tree=null;
        Object CLOSE_BRACE618_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_SUBSTR=new RewriteRuleTokenStream(adaptor,"token SUBSTR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:601:5: ( SUBSTR OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE -> ^( SUBSTR ( expression )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:601:7: SUBSTR OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE
            {
            SUBSTR611=(Token)match(input,SUBSTR,FOLLOW_SUBSTR_in_subStringExpression6269);  
            stream_SUBSTR.add(SUBSTR611);


            OPEN_BRACE612=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_subStringExpression6271);  
            stream_OPEN_BRACE.add(OPEN_BRACE612);


            pushFollow(FOLLOW_expression_in_subStringExpression6273);
            expression613=expression();

            state._fsp--;

            stream_expression.add(expression613.getTree());

            COMMA614=(Token)match(input,COMMA,FOLLOW_COMMA_in_subStringExpression6275);  
            stream_COMMA.add(COMMA614);


            pushFollow(FOLLOW_expression_in_subStringExpression6277);
            expression615=expression();

            state._fsp--;

            stream_expression.add(expression615.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:601:53: ( COMMA expression )?
            int alt128=2;
            switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt128=1;
                    }
                    break;
            }

            switch (alt128) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:601:54: COMMA expression
                    {
                    COMMA616=(Token)match(input,COMMA,FOLLOW_COMMA_in_subStringExpression6280);  
                    stream_COMMA.add(COMMA616);


                    pushFollow(FOLLOW_expression_in_subStringExpression6282);
                    expression617=expression();

                    state._fsp--;

                    stream_expression.add(expression617.getTree());

                    }
                    break;

            }


            CLOSE_BRACE618=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_subStringExpression6286);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE618);


            // AST REWRITE
            // elements: SUBSTR, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 601:85: -> ^( SUBSTR ( expression )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:601:88: ^( SUBSTR ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_SUBSTR.nextNode()
                , root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:601:97: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subStringExpression"


    public static class existsFunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "existsFunction"
    // com\\googlecode\\sparkleg\\Sparql.g:604:1: existsFunction : EXISTS groupGraphPattern -> ^( EXISTS groupGraphPattern ) ;
    public final SparqlParser.existsFunction_return existsFunction() throws RecognitionException {
        SparqlParser.existsFunction_return retval = new SparqlParser.existsFunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXISTS619=null;
        SparqlParser.groupGraphPattern_return groupGraphPattern620 =null;


        Object EXISTS619_tree=null;
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:605:5: ( EXISTS groupGraphPattern -> ^( EXISTS groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:605:7: EXISTS groupGraphPattern
            {
            EXISTS619=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_existsFunction6316);  
            stream_EXISTS.add(EXISTS619);


            pushFollow(FOLLOW_groupGraphPattern_in_existsFunction6318);
            groupGraphPattern620=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern620.getTree());

            // AST REWRITE
            // elements: groupGraphPattern, EXISTS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 605:32: -> ^( EXISTS groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:605:35: ^( EXISTS groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EXISTS.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "existsFunction"


    public static class notExistsFunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notExistsFunction"
    // com\\googlecode\\sparkleg\\Sparql.g:608:1: notExistsFunction : NOT EXISTS groupGraphPattern -> ^( NOT_EXISTS groupGraphPattern ) ;
    public final SparqlParser.notExistsFunction_return notExistsFunction() throws RecognitionException {
        SparqlParser.notExistsFunction_return retval = new SparqlParser.notExistsFunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT621=null;
        Token EXISTS622=null;
        SparqlParser.groupGraphPattern_return groupGraphPattern623 =null;


        Object NOT621_tree=null;
        Object EXISTS622_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:609:5: ( NOT EXISTS groupGraphPattern -> ^( NOT_EXISTS groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:609:7: NOT EXISTS groupGraphPattern
            {
            NOT621=(Token)match(input,NOT,FOLLOW_NOT_in_notExistsFunction6343);  
            stream_NOT.add(NOT621);


            EXISTS622=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_notExistsFunction6345);  
            stream_EXISTS.add(EXISTS622);


            pushFollow(FOLLOW_groupGraphPattern_in_notExistsFunction6347);
            groupGraphPattern623=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern623.getTree());

            // AST REWRITE
            // elements: groupGraphPattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 609:36: -> ^( NOT_EXISTS groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:609:39: ^( NOT_EXISTS groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(NOT_EXISTS, "NOT_EXISTS")
                , root_1);

                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notExistsFunction"


    public static class aggregate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aggregate"
    // com\\googlecode\\sparkleg\\Sparql.g:612:1: aggregate : ( COUNT OPEN_BRACE ( DISTINCT )? ( ASTERISK | expression ) CLOSE_BRACE -> ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* ) | SUM OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( SUM ( DISTINCT )* expression ) | MIN OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( MIN ( DISTINCT )* expression ) | MAX OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( MAX ( DISTINCT )* expression ) | AVG OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( AVG ( DISTINCT )* expression ) | SAMPLE OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( SAMPLE ( DISTINCT )? expression ) | GROUP_CONCAT OPEN_BRACE ( DISTINCT )? expression ( SEMICOLON SEPARATOR EQUAL string )? CLOSE_BRACE -> ^( GROUP_CONCAT ( DISTINCT )* expression ( string )* ) );
    public final SparqlParser.aggregate_return aggregate() throws RecognitionException {
        SparqlParser.aggregate_return retval = new SparqlParser.aggregate_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COUNT624=null;
        Token OPEN_BRACE625=null;
        Token DISTINCT626=null;
        Token ASTERISK627=null;
        Token CLOSE_BRACE629=null;
        Token SUM630=null;
        Token OPEN_BRACE631=null;
        Token DISTINCT632=null;
        Token CLOSE_BRACE634=null;
        Token MIN635=null;
        Token OPEN_BRACE636=null;
        Token DISTINCT637=null;
        Token CLOSE_BRACE639=null;
        Token MAX640=null;
        Token OPEN_BRACE641=null;
        Token DISTINCT642=null;
        Token CLOSE_BRACE644=null;
        Token AVG645=null;
        Token OPEN_BRACE646=null;
        Token DISTINCT647=null;
        Token CLOSE_BRACE649=null;
        Token SAMPLE650=null;
        Token OPEN_BRACE651=null;
        Token DISTINCT652=null;
        Token CLOSE_BRACE654=null;
        Token GROUP_CONCAT655=null;
        Token OPEN_BRACE656=null;
        Token DISTINCT657=null;
        Token SEMICOLON659=null;
        Token SEPARATOR660=null;
        Token EQUAL661=null;
        Token CLOSE_BRACE663=null;
        SparqlParser.expression_return expression628 =null;

        SparqlParser.expression_return expression633 =null;

        SparqlParser.expression_return expression638 =null;

        SparqlParser.expression_return expression643 =null;

        SparqlParser.expression_return expression648 =null;

        SparqlParser.expression_return expression653 =null;

        SparqlParser.expression_return expression658 =null;

        SparqlParser.string_return string662 =null;


        Object COUNT624_tree=null;
        Object OPEN_BRACE625_tree=null;
        Object DISTINCT626_tree=null;
        Object ASTERISK627_tree=null;
        Object CLOSE_BRACE629_tree=null;
        Object SUM630_tree=null;
        Object OPEN_BRACE631_tree=null;
        Object DISTINCT632_tree=null;
        Object CLOSE_BRACE634_tree=null;
        Object MIN635_tree=null;
        Object OPEN_BRACE636_tree=null;
        Object DISTINCT637_tree=null;
        Object CLOSE_BRACE639_tree=null;
        Object MAX640_tree=null;
        Object OPEN_BRACE641_tree=null;
        Object DISTINCT642_tree=null;
        Object CLOSE_BRACE644_tree=null;
        Object AVG645_tree=null;
        Object OPEN_BRACE646_tree=null;
        Object DISTINCT647_tree=null;
        Object CLOSE_BRACE649_tree=null;
        Object SAMPLE650_tree=null;
        Object OPEN_BRACE651_tree=null;
        Object DISTINCT652_tree=null;
        Object CLOSE_BRACE654_tree=null;
        Object GROUP_CONCAT655_tree=null;
        Object OPEN_BRACE656_tree=null;
        Object DISTINCT657_tree=null;
        Object SEMICOLON659_tree=null;
        Object SEPARATOR660_tree=null;
        Object EQUAL661_tree=null;
        Object CLOSE_BRACE663_tree=null;
        RewriteRuleTokenStream stream_SAMPLE=new RewriteRuleTokenStream(adaptor,"token SAMPLE");
        RewriteRuleTokenStream stream_AVG=new RewriteRuleTokenStream(adaptor,"token AVG");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_GROUP_CONCAT=new RewriteRuleTokenStream(adaptor,"token GROUP_CONCAT");
        RewriteRuleTokenStream stream_MAX=new RewriteRuleTokenStream(adaptor,"token MAX");
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_SEPARATOR=new RewriteRuleTokenStream(adaptor,"token SEPARATOR");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_MIN=new RewriteRuleTokenStream(adaptor,"token MIN");
        RewriteRuleTokenStream stream_SUM=new RewriteRuleTokenStream(adaptor,"token SUM");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_string=new RewriteRuleSubtreeStream(adaptor,"rule string");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:613:5: ( COUNT OPEN_BRACE ( DISTINCT )? ( ASTERISK | expression ) CLOSE_BRACE -> ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* ) | SUM OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( SUM ( DISTINCT )* expression ) | MIN OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( MIN ( DISTINCT )* expression ) | MAX OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( MAX ( DISTINCT )* expression ) | AVG OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( AVG ( DISTINCT )* expression ) | SAMPLE OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( SAMPLE ( DISTINCT )? expression ) | GROUP_CONCAT OPEN_BRACE ( DISTINCT )? expression ( SEMICOLON SEPARATOR EQUAL string )? CLOSE_BRACE -> ^( GROUP_CONCAT ( DISTINCT )* expression ( string )* ) )
            int alt138=7;
            switch ( input.LA(1) ) {
            case COUNT:
                {
                alt138=1;
                }
                break;
            case SUM:
                {
                alt138=2;
                }
                break;
            case MIN:
                {
                alt138=3;
                }
                break;
            case MAX:
                {
                alt138=4;
                }
                break;
            case AVG:
                {
                alt138=5;
                }
                break;
            case SAMPLE:
                {
                alt138=6;
                }
                break;
            case GROUP_CONCAT:
                {
                alt138=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;

            }

            switch (alt138) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:613:7: COUNT OPEN_BRACE ( DISTINCT )? ( ASTERISK | expression ) CLOSE_BRACE
                    {
                    COUNT624=(Token)match(input,COUNT,FOLLOW_COUNT_in_aggregate6372);  
                    stream_COUNT.add(COUNT624);


                    OPEN_BRACE625=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6374);  
                    stream_OPEN_BRACE.add(OPEN_BRACE625);


                    // com\\googlecode\\sparkleg\\Sparql.g:613:24: ( DISTINCT )?
                    int alt129=2;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt129=1;
                            }
                            break;
                    }

                    switch (alt129) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:613:24: DISTINCT
                            {
                            DISTINCT626=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6376);  
                            stream_DISTINCT.add(DISTINCT626);


                            }
                            break;

                    }


                    // com\\googlecode\\sparkleg\\Sparql.g:613:34: ( ASTERISK | expression )
                    int alt130=2;
                    switch ( input.LA(1) ) {
                    case ASTERISK:
                        {
                        alt130=1;
                        }
                        break;
                    case ABS:
                    case AVG:
                    case BNODE:
                    case BOUND:
                    case CEIL:
                    case COALESCE:
                    case CONCAT:
                    case CONTAINS:
                    case COUNT:
                    case DATATYPE:
                    case DAY:
                    case DECIMAL:
                    case DECIMAL_NEGATIVE:
                    case DECIMAL_POSITIVE:
                    case DOUBLE:
                    case DOUBLE_NEGATIVE:
                    case DOUBLE_POSITIVE:
                    case ENCODE_FOR_URI:
                    case EXISTS:
                    case FALSE:
                    case FLOOR:
                    case GROUP_CONCAT:
                    case HOURS:
                    case IF:
                    case INTEGER:
                    case INTEGER_NEGATIVE:
                    case INTEGER_POSITIVE:
                    case IRI:
                    case IRI_REF:
                    case ISBLANK:
                    case ISIRI:
                    case ISLITERAL:
                    case ISNUMERIC:
                    case ISURI:
                    case LANG:
                    case LANGMATCHES:
                    case LCASE:
                    case MAX:
                    case MD5:
                    case MIN:
                    case MINUS:
                    case MINUTES:
                    case MONTH:
                    case NEGATION:
                    case NOT:
                    case NOW:
                    case OPEN_BRACE:
                    case PLUS:
                    case PNAME_LN:
                    case PNAME_NS:
                    case RAND:
                    case REGEX:
                    case REPLACE:
                    case ROUND:
                    case SAMETERM:
                    case SAMPLE:
                    case SECONDS:
                    case SHA1:
                    case SHA224:
                    case SHA256:
                    case SHA384:
                    case SHA512:
                    case STR:
                    case STRAFTER:
                    case STRBEFORE:
                    case STRDT:
                    case STRENDS:
                    case STRING_LITERAL1:
                    case STRING_LITERAL2:
                    case STRING_LITERAL_LONG1:
                    case STRING_LITERAL_LONG2:
                    case STRLANG:
                    case STRLEN:
                    case STRSTARTS:
                    case SUBSTR:
                    case SUM:
                    case TIMEZONE:
                    case TRUE:
                    case TZ:
                    case UCASE:
                    case URI:
                    case VAR1:
                    case VAR2:
                    case YEAR:
                        {
                        alt130=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 130, 0, input);

                        throw nvae;

                    }

                    switch (alt130) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:613:35: ASTERISK
                            {
                            ASTERISK627=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_aggregate6380);  
                            stream_ASTERISK.add(ASTERISK627);


                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\Sparql.g:613:46: expression
                            {
                            pushFollow(FOLLOW_expression_in_aggregate6384);
                            expression628=expression();

                            state._fsp--;

                            stream_expression.add(expression628.getTree());

                            }
                            break;

                    }


                    CLOSE_BRACE629=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6387);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE629);


                    // AST REWRITE
                    // elements: DISTINCT, expression, COUNT, ASTERISK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 613:70: -> ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:613:73: ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_COUNT.nextNode()
                        , root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:613:81: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DISTINCT.nextNode()
                            );

                        }
                        stream_DISTINCT.reset();

                        // com\\googlecode\\sparkleg\\Sparql.g:613:91: ( ASTERISK )*
                        while ( stream_ASTERISK.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_ASTERISK.nextNode()
                            );

                        }
                        stream_ASTERISK.reset();

                        // com\\googlecode\\sparkleg\\Sparql.g:613:101: ( expression )*
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:614:7: SUM OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE
                    {
                    SUM630=(Token)match(input,SUM,FOLLOW_SUM_in_aggregate6410);  
                    stream_SUM.add(SUM630);


                    OPEN_BRACE631=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6412);  
                    stream_OPEN_BRACE.add(OPEN_BRACE631);


                    // com\\googlecode\\sparkleg\\Sparql.g:614:22: ( DISTINCT )?
                    int alt131=2;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt131=1;
                            }
                            break;
                    }

                    switch (alt131) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:614:22: DISTINCT
                            {
                            DISTINCT632=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6414);  
                            stream_DISTINCT.add(DISTINCT632);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate6417);
                    expression633=expression();

                    state._fsp--;

                    stream_expression.add(expression633.getTree());

                    CLOSE_BRACE634=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6419);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE634);


                    // AST REWRITE
                    // elements: SUM, expression, DISTINCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 614:55: -> ^( SUM ( DISTINCT )* expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:614:58: ^( SUM ( DISTINCT )* expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_SUM.nextNode()
                        , root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:614:64: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DISTINCT.nextNode()
                            );

                        }
                        stream_DISTINCT.reset();

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:615:7: MIN OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE
                    {
                    MIN635=(Token)match(input,MIN,FOLLOW_MIN_in_aggregate6438);  
                    stream_MIN.add(MIN635);


                    OPEN_BRACE636=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6440);  
                    stream_OPEN_BRACE.add(OPEN_BRACE636);


                    // com\\googlecode\\sparkleg\\Sparql.g:615:22: ( DISTINCT )?
                    int alt132=2;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt132=1;
                            }
                            break;
                    }

                    switch (alt132) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:615:22: DISTINCT
                            {
                            DISTINCT637=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6442);  
                            stream_DISTINCT.add(DISTINCT637);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate6445);
                    expression638=expression();

                    state._fsp--;

                    stream_expression.add(expression638.getTree());

                    CLOSE_BRACE639=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6447);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE639);


                    // AST REWRITE
                    // elements: DISTINCT, expression, MIN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 615:55: -> ^( MIN ( DISTINCT )* expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:615:58: ^( MIN ( DISTINCT )* expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_MIN.nextNode()
                        , root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:615:64: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DISTINCT.nextNode()
                            );

                        }
                        stream_DISTINCT.reset();

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:616:7: MAX OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE
                    {
                    MAX640=(Token)match(input,MAX,FOLLOW_MAX_in_aggregate6466);  
                    stream_MAX.add(MAX640);


                    OPEN_BRACE641=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6468);  
                    stream_OPEN_BRACE.add(OPEN_BRACE641);


                    // com\\googlecode\\sparkleg\\Sparql.g:616:22: ( DISTINCT )?
                    int alt133=2;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt133=1;
                            }
                            break;
                    }

                    switch (alt133) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:616:22: DISTINCT
                            {
                            DISTINCT642=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6470);  
                            stream_DISTINCT.add(DISTINCT642);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate6473);
                    expression643=expression();

                    state._fsp--;

                    stream_expression.add(expression643.getTree());

                    CLOSE_BRACE644=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6475);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE644);


                    // AST REWRITE
                    // elements: expression, DISTINCT, MAX
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 616:55: -> ^( MAX ( DISTINCT )* expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:616:58: ^( MAX ( DISTINCT )* expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_MAX.nextNode()
                        , root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:616:64: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DISTINCT.nextNode()
                            );

                        }
                        stream_DISTINCT.reset();

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:617:7: AVG OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE
                    {
                    AVG645=(Token)match(input,AVG,FOLLOW_AVG_in_aggregate6494);  
                    stream_AVG.add(AVG645);


                    OPEN_BRACE646=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6496);  
                    stream_OPEN_BRACE.add(OPEN_BRACE646);


                    // com\\googlecode\\sparkleg\\Sparql.g:617:22: ( DISTINCT )?
                    int alt134=2;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt134=1;
                            }
                            break;
                    }

                    switch (alt134) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:617:22: DISTINCT
                            {
                            DISTINCT647=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6498);  
                            stream_DISTINCT.add(DISTINCT647);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate6501);
                    expression648=expression();

                    state._fsp--;

                    stream_expression.add(expression648.getTree());

                    CLOSE_BRACE649=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6503);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE649);


                    // AST REWRITE
                    // elements: AVG, DISTINCT, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 617:55: -> ^( AVG ( DISTINCT )* expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:617:58: ^( AVG ( DISTINCT )* expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_AVG.nextNode()
                        , root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:617:64: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DISTINCT.nextNode()
                            );

                        }
                        stream_DISTINCT.reset();

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:618:7: SAMPLE OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE
                    {
                    SAMPLE650=(Token)match(input,SAMPLE,FOLLOW_SAMPLE_in_aggregate6522);  
                    stream_SAMPLE.add(SAMPLE650);


                    OPEN_BRACE651=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6524);  
                    stream_OPEN_BRACE.add(OPEN_BRACE651);


                    // com\\googlecode\\sparkleg\\Sparql.g:618:25: ( DISTINCT )?
                    int alt135=2;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt135=1;
                            }
                            break;
                    }

                    switch (alt135) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:618:25: DISTINCT
                            {
                            DISTINCT652=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6526);  
                            stream_DISTINCT.add(DISTINCT652);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate6529);
                    expression653=expression();

                    state._fsp--;

                    stream_expression.add(expression653.getTree());

                    CLOSE_BRACE654=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6531);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE654);


                    // AST REWRITE
                    // elements: DISTINCT, SAMPLE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 618:58: -> ^( SAMPLE ( DISTINCT )? expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:618:61: ^( SAMPLE ( DISTINCT )? expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_SAMPLE.nextNode()
                        , root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:618:70: ( DISTINCT )?
                        if ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DISTINCT.nextNode()
                            );

                        }
                        stream_DISTINCT.reset();

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\Sparql.g:619:7: GROUP_CONCAT OPEN_BRACE ( DISTINCT )? expression ( SEMICOLON SEPARATOR EQUAL string )? CLOSE_BRACE
                    {
                    GROUP_CONCAT655=(Token)match(input,GROUP_CONCAT,FOLLOW_GROUP_CONCAT_in_aggregate6550);  
                    stream_GROUP_CONCAT.add(GROUP_CONCAT655);


                    OPEN_BRACE656=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6552);  
                    stream_OPEN_BRACE.add(OPEN_BRACE656);


                    // com\\googlecode\\sparkleg\\Sparql.g:619:31: ( DISTINCT )?
                    int alt136=2;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt136=1;
                            }
                            break;
                    }

                    switch (alt136) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:619:31: DISTINCT
                            {
                            DISTINCT657=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6554);  
                            stream_DISTINCT.add(DISTINCT657);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate6557);
                    expression658=expression();

                    state._fsp--;

                    stream_expression.add(expression658.getTree());

                    // com\\googlecode\\sparkleg\\Sparql.g:619:52: ( SEMICOLON SEPARATOR EQUAL string )?
                    int alt137=2;
                    switch ( input.LA(1) ) {
                        case SEMICOLON:
                            {
                            alt137=1;
                            }
                            break;
                    }

                    switch (alt137) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:619:53: SEMICOLON SEPARATOR EQUAL string
                            {
                            SEMICOLON659=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_aggregate6560);  
                            stream_SEMICOLON.add(SEMICOLON659);


                            SEPARATOR660=(Token)match(input,SEPARATOR,FOLLOW_SEPARATOR_in_aggregate6562);  
                            stream_SEPARATOR.add(SEPARATOR660);


                            EQUAL661=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_aggregate6564);  
                            stream_EQUAL.add(EQUAL661);


                            pushFollow(FOLLOW_string_in_aggregate6566);
                            string662=string();

                            state._fsp--;

                            stream_string.add(string662.getTree());

                            }
                            break;

                    }


                    CLOSE_BRACE663=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6570);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE663);


                    // AST REWRITE
                    // elements: GROUP_CONCAT, string, expression, DISTINCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 619:100: -> ^( GROUP_CONCAT ( DISTINCT )* expression ( string )* )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:619:103: ^( GROUP_CONCAT ( DISTINCT )* expression ( string )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_GROUP_CONCAT.nextNode()
                        , root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:619:118: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_DISTINCT.nextNode()
                            );

                        }
                        stream_DISTINCT.reset();

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        // com\\googlecode\\sparkleg\\Sparql.g:619:139: ( string )*
                        while ( stream_string.hasNext() ) {
                            adaptor.addChild(root_1, stream_string.nextTree());

                        }
                        stream_string.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "aggregate"


    public static class iriRefOrFunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iriRefOrFunction"
    // com\\googlecode\\sparkleg\\Sparql.g:622:1: iriRefOrFunction : iriRef ( argList )? -> ^( FUNCTION iriRef ( ^( ARG_LIST argList ) )? ) ;
    public final SparqlParser.iriRefOrFunction_return iriRefOrFunction() throws RecognitionException {
        SparqlParser.iriRefOrFunction_return retval = new SparqlParser.iriRefOrFunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.iriRef_return iriRef664 =null;

        SparqlParser.argList_return argList665 =null;


        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:623:5: ( iriRef ( argList )? -> ^( FUNCTION iriRef ( ^( ARG_LIST argList ) )? ) )
            // com\\googlecode\\sparkleg\\Sparql.g:623:7: iriRef ( argList )?
            {
            pushFollow(FOLLOW_iriRef_in_iriRefOrFunction6605);
            iriRef664=iriRef();

            state._fsp--;

            stream_iriRef.add(iriRef664.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:623:14: ( argList )?
            int alt139=2;
            switch ( input.LA(1) ) {
                case OPEN_BRACE:
                    {
                    alt139=1;
                    }
                    break;
            }

            switch (alt139) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:623:14: argList
                    {
                    pushFollow(FOLLOW_argList_in_iriRefOrFunction6607);
                    argList665=argList();

                    state._fsp--;

                    stream_argList.add(argList665.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: iriRef, argList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 623:23: -> ^( FUNCTION iriRef ( ^( ARG_LIST argList ) )? )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:623:26: ^( FUNCTION iriRef ( ^( ARG_LIST argList ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION, "FUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_iriRef.nextTree());

                // com\\googlecode\\sparkleg\\Sparql.g:623:44: ( ^( ARG_LIST argList ) )?
                if ( stream_argList.hasNext() ) {
                    // com\\googlecode\\sparkleg\\Sparql.g:623:44: ^( ARG_LIST argList )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(ARG_LIST, "ARG_LIST")
                    , root_2);

                    adaptor.addChild(root_2, stream_argList.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_argList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iriRefOrFunction"


    public static class rdfLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rdfLiteral"
    // com\\googlecode\\sparkleg\\Sparql.g:626:1: rdfLiteral : string ( LANGTAG | ( REFERENCE iriRef ) )? ;
    public final SparqlParser.rdfLiteral_return rdfLiteral() throws RecognitionException {
        SparqlParser.rdfLiteral_return retval = new SparqlParser.rdfLiteral_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LANGTAG667=null;
        Token REFERENCE668=null;
        SparqlParser.string_return string666 =null;

        SparqlParser.iriRef_return iriRef669 =null;


        Object LANGTAG667_tree=null;
        Object REFERENCE668_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:627:5: ( string ( LANGTAG | ( REFERENCE iriRef ) )? )
            // com\\googlecode\\sparkleg\\Sparql.g:627:7: string ( LANGTAG | ( REFERENCE iriRef ) )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_string_in_rdfLiteral6640);
            string666=string();

            state._fsp--;

            adaptor.addChild(root_0, string666.getTree());

            // com\\googlecode\\sparkleg\\Sparql.g:627:14: ( LANGTAG | ( REFERENCE iriRef ) )?
            int alt140=3;
            switch ( input.LA(1) ) {
                case LANGTAG:
                    {
                    alt140=1;
                    }
                    break;
                case REFERENCE:
                    {
                    alt140=2;
                    }
                    break;
            }

            switch (alt140) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:627:15: LANGTAG
                    {
                    LANGTAG667=(Token)match(input,LANGTAG,FOLLOW_LANGTAG_in_rdfLiteral6643); 
                    LANGTAG667_tree = 
                    (Object)adaptor.create(LANGTAG667)
                    ;
                    adaptor.addChild(root_0, LANGTAG667_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:627:25: ( REFERENCE iriRef )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:627:25: ( REFERENCE iriRef )
                    // com\\googlecode\\sparkleg\\Sparql.g:627:26: REFERENCE iriRef
                    {
                    REFERENCE668=(Token)match(input,REFERENCE,FOLLOW_REFERENCE_in_rdfLiteral6648); 
                    REFERENCE668_tree = 
                    (Object)adaptor.create(REFERENCE668)
                    ;
                    adaptor.addChild(root_0, REFERENCE668_tree);


                    pushFollow(FOLLOW_iriRef_in_rdfLiteral6650);
                    iriRef669=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef669.getTree());

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rdfLiteral"


    public static class numericLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericLiteral"
    // com\\googlecode\\sparkleg\\Sparql.g:630:1: numericLiteral : ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative );
    public final SparqlParser.numericLiteral_return numericLiteral() throws RecognitionException {
        SparqlParser.numericLiteral_return retval = new SparqlParser.numericLiteral_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SparqlParser.numericLiteralUnsigned_return numericLiteralUnsigned670 =null;

        SparqlParser.numericLiteralPositive_return numericLiteralPositive671 =null;

        SparqlParser.numericLiteralNegative_return numericLiteralNegative672 =null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:631:5: ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative )
            int alt141=3;
            switch ( input.LA(1) ) {
            case DECIMAL:
            case DOUBLE:
            case INTEGER:
                {
                alt141=1;
                }
                break;
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_POSITIVE:
                {
                alt141=2;
                }
                break;
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case INTEGER_NEGATIVE:
                {
                alt141=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;

            }

            switch (alt141) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:631:7: numericLiteralUnsigned
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral6670);
                    numericLiteralUnsigned670=numericLiteralUnsigned();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralUnsigned670.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:632:7: numericLiteralPositive
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral6678);
                    numericLiteralPositive671=numericLiteralPositive();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralPositive671.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:633:7: numericLiteralNegative
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral6686);
                    numericLiteralNegative672=numericLiteralNegative();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralNegative672.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numericLiteral"


    public static class numericLiteralUnsigned_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericLiteralUnsigned"
    // com\\googlecode\\sparkleg\\Sparql.g:636:1: numericLiteralUnsigned : ( INTEGER | DECIMAL | DOUBLE );
    public final SparqlParser.numericLiteralUnsigned_return numericLiteralUnsigned() throws RecognitionException {
        SparqlParser.numericLiteralUnsigned_return retval = new SparqlParser.numericLiteralUnsigned_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set673=null;

        Object set673_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:637:5: ( INTEGER | DECIMAL | DOUBLE )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();


            set673=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL||input.LA(1)==DOUBLE||input.LA(1)==INTEGER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set673)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numericLiteralUnsigned"


    public static class numericLiteralPositive_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericLiteralPositive"
    // com\\googlecode\\sparkleg\\Sparql.g:642:1: numericLiteralPositive : ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE );
    public final SparqlParser.numericLiteralPositive_return numericLiteralPositive() throws RecognitionException {
        SparqlParser.numericLiteralPositive_return retval = new SparqlParser.numericLiteralPositive_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set674=null;

        Object set674_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:643:5: ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();


            set674=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL_POSITIVE||input.LA(1)==DOUBLE_POSITIVE||input.LA(1)==INTEGER_POSITIVE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set674)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numericLiteralPositive"


    public static class numericLiteralNegative_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericLiteralNegative"
    // com\\googlecode\\sparkleg\\Sparql.g:648:1: numericLiteralNegative : ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE );
    public final SparqlParser.numericLiteralNegative_return numericLiteralNegative() throws RecognitionException {
        SparqlParser.numericLiteralNegative_return retval = new SparqlParser.numericLiteralNegative_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set675=null;

        Object set675_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:649:5: ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();


            set675=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL_NEGATIVE||input.LA(1)==DOUBLE_NEGATIVE||input.LA(1)==INTEGER_NEGATIVE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set675)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numericLiteralNegative"


    public static class booleanLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanLiteral"
    // com\\googlecode\\sparkleg\\Sparql.g:654:1: booleanLiteral : ( TRUE | FALSE );
    public final SparqlParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SparqlParser.booleanLiteral_return retval = new SparqlParser.booleanLiteral_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set676=null;

        Object set676_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:655:5: ( TRUE | FALSE )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();


            set676=(Token)input.LT(1);

            if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set676)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"


    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string"
    // com\\googlecode\\sparkleg\\Sparql.g:659:1: string : ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 );
    public final SparqlParser.string_return string() throws RecognitionException {
        SparqlParser.string_return retval = new SparqlParser.string_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set677=null;

        Object set677_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:660:5: ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();


            set677=(Token)input.LT(1);

            if ( (input.LA(1) >= STRING_LITERAL1 && input.LA(1) <= STRING_LITERAL_LONG2) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set677)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string"


    public static class iriRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iriRef"
    // com\\googlecode\\sparkleg\\Sparql.g:666:1: iriRef : ( IRI_REF | prefixedName );
    public final SparqlParser.iriRef_return iriRef() throws RecognitionException {
        SparqlParser.iriRef_return retval = new SparqlParser.iriRef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IRI_REF678=null;
        SparqlParser.prefixedName_return prefixedName679 =null;


        Object IRI_REF678_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:667:5: ( IRI_REF | prefixedName )
            int alt142=2;
            switch ( input.LA(1) ) {
            case IRI_REF:
                {
                alt142=1;
                }
                break;
            case PNAME_LN:
            case PNAME_NS:
                {
                alt142=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;

            }

            switch (alt142) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:667:7: IRI_REF
                    {
                    root_0 = (Object)adaptor.nil();


                    IRI_REF678=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef6869); 
                    IRI_REF678_tree = 
                    (Object)adaptor.create(IRI_REF678)
                    ;
                    adaptor.addChild(root_0, IRI_REF678_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:668:7: prefixedName
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixedName_in_iriRef6877);
                    prefixedName679=prefixedName();

                    state._fsp--;

                    adaptor.addChild(root_0, prefixedName679.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iriRef"


    public static class prefixedName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefixedName"
    // com\\googlecode\\sparkleg\\Sparql.g:671:1: prefixedName : ( PNAME_LN | PNAME_NS );
    public final SparqlParser.prefixedName_return prefixedName() throws RecognitionException {
        SparqlParser.prefixedName_return retval = new SparqlParser.prefixedName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set680=null;

        Object set680_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:672:5: ( PNAME_LN | PNAME_NS )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();


            set680=(Token)input.LT(1);

            if ( (input.LA(1) >= PNAME_LN && input.LA(1) <= PNAME_NS) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set680)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prefixedName"


    public static class blankNode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blankNode"
    // com\\googlecode\\sparkleg\\Sparql.g:676:1: blankNode : ( BLANK_NODE_LABEL | anon );
    public final SparqlParser.blankNode_return blankNode() throws RecognitionException {
        SparqlParser.blankNode_return retval = new SparqlParser.blankNode_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BLANK_NODE_LABEL681=null;
        SparqlParser.anon_return anon682 =null;


        Object BLANK_NODE_LABEL681_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:677:5: ( BLANK_NODE_LABEL | anon )
            int alt143=2;
            switch ( input.LA(1) ) {
            case BLANK_NODE_LABEL:
                {
                alt143=1;
                }
                break;
            case OPEN_SQUARE_BRACKET:
                {
                alt143=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;

            }

            switch (alt143) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:677:7: BLANK_NODE_LABEL
                    {
                    root_0 = (Object)adaptor.nil();


                    BLANK_NODE_LABEL681=(Token)match(input,BLANK_NODE_LABEL,FOLLOW_BLANK_NODE_LABEL_in_blankNode6919); 
                    BLANK_NODE_LABEL681_tree = 
                    (Object)adaptor.create(BLANK_NODE_LABEL681)
                    ;
                    adaptor.addChild(root_0, BLANK_NODE_LABEL681_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:678:7: anon
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_anon_in_blankNode6927);
                    anon682=anon();

                    state._fsp--;

                    adaptor.addChild(root_0, anon682.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blankNode"


    public static class anon_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anon"
    // com\\googlecode\\sparkleg\\Sparql.g:681:1: anon : OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET ;
    public final SparqlParser.anon_return anon() throws RecognitionException {
        SparqlParser.anon_return retval = new SparqlParser.anon_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPEN_SQUARE_BRACKET683=null;
        Token CLOSE_SQUARE_BRACKET684=null;

        Object OPEN_SQUARE_BRACKET683_tree=null;
        Object CLOSE_SQUARE_BRACKET684_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:682:5: ( OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET )
            // com\\googlecode\\sparkleg\\Sparql.g:682:7: OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET
            {
            root_0 = (Object)adaptor.nil();


            OPEN_SQUARE_BRACKET683=(Token)match(input,OPEN_SQUARE_BRACKET,FOLLOW_OPEN_SQUARE_BRACKET_in_anon6944); 
            OPEN_SQUARE_BRACKET683_tree = 
            (Object)adaptor.create(OPEN_SQUARE_BRACKET683)
            ;
            adaptor.addChild(root_0, OPEN_SQUARE_BRACKET683_tree);


            CLOSE_SQUARE_BRACKET684=(Token)match(input,CLOSE_SQUARE_BRACKET,FOLLOW_CLOSE_SQUARE_BRACKET_in_anon6946); 
            CLOSE_SQUARE_BRACKET684_tree = 
            (Object)adaptor.create(CLOSE_SQUARE_BRACKET684)
            ;
            adaptor.addChild(root_0, CLOSE_SQUARE_BRACKET684_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "anon"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\10\uffff";
    static final String DFA4_eofS =
        "\10\uffff";
    static final String DFA4_minS =
        "\1\6\1\133\1\u008a\2\uffff\1\6\1\133\1\6";
    static final String DFA4_maxS =
        "\1\u00cf\1\133\1\u008a\2\uffff\1\u00cf\1\133\1\u00cf";
    static final String DFA4_acceptS =
        "\3\uffff\1\1\1\2\3\uffff";
    static final String DFA4_specialS =
        "\10\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\6\uffff\1\3\2\uffff\1\1\12\uffff\1\4\10\uffff\1\3\2\uffff"+
            "\1\4\1\uffff\1\4\7\uffff\1\4\1\uffff\1\3\7\uffff\1\4\30\uffff"+
            "\1\4\24\uffff\1\4\10\uffff\1\4\36\uffff\1\2\14\uffff\1\3\60"+
            "\uffff\1\4",
            "\1\5",
            "\1\6",
            "",
            "",
            "\1\4\6\uffff\1\3\2\uffff\1\1\12\uffff\1\4\10\uffff\1\3\2\uffff"+
            "\1\4\1\uffff\1\4\7\uffff\1\4\1\uffff\1\3\7\uffff\1\4\30\uffff"+
            "\1\4\24\uffff\1\4\10\uffff\1\4\36\uffff\1\2\14\uffff\1\3\60"+
            "\uffff\1\4",
            "\1\7",
            "\1\4\6\uffff\1\3\2\uffff\1\1\12\uffff\1\4\10\uffff\1\3\2\uffff"+
            "\1\4\1\uffff\1\4\7\uffff\1\4\1\uffff\1\3\7\uffff\1\4\30\uffff"+
            "\1\4\24\uffff\1\4\10\uffff\1\4\36\uffff\1\2\14\uffff\1\3\60"+
            "\uffff\1\4"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "76:1: query : ( prologue ( selectQuery | constructQuery | describeQuery | askQuery ) bindingsClause EOF -> ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* ) ( bindingsClause )* | update ( SEMICOLON ( update )? )* EOF -> ^( UPDATE ( update )+ ) );";
        }
    }
 

    public static final BitSet FOLLOW_prologue_in_query155 = new BitSet(new long[]{0x0008001000002000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectQuery_in_query158 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_constructQuery_in_query162 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_describeQuery_in_query166 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_askQuery_in_query170 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_bindingsClause_in_query173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_query175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_in_query206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_query209 = new BitSet(new long[]{0x0802028008010040L,0x0004020000100000L,0x0000000100020000L,0x0000000000008000L});
    public static final BitSet FOLLOW_update_in_query211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_EOF_in_query216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseDecl_in_prologue249 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_prefixDecl_in_prologue253 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_BASE_in_baseDecl284 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IRI_REF_in_baseDecl286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIX_in_prefixDecl312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixDecl314 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IRI_REF_in_prefixDecl316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_selectQuery343 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000040L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_datasetClause_in_selectQuery345 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000040L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_whereClause_in_selectQuery348 = new BitSet(new long[]{0x0000000000000000L,0x0400010000010800L,0x0000000000000001L});
    public static final BitSet FOLLOW_solutionModifier_in_selectQuery350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_subSelect384 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_whereClause_in_subSelect386 = new BitSet(new long[]{0x0000000000000000L,0x0400010000010800L,0x0000000000000001L});
    public static final BitSet FOLLOW_solutionModifier_in_subSelect388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectClause424 = new BitSet(new long[]{0x0020000000004000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause427 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause431 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ASTERISK_in_selectClause435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectClause457 = new BitSet(new long[]{0x0020000000000000L,0x0800000000000000L,0x0000000000400000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause460 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause464 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_selectVariables_in_selectClause471 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_var_in_selectVariables506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_selectVariables523 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_selectVariables525 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AS_in_selectVariables527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_var_in_selectVariables529 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_selectVariables531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCT_in_constructQuery558 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_constructTemplate_in_constructQuery560 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000040L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_datasetClause_in_constructQuery562 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000040L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_whereClause_in_constructQuery565 = new BitSet(new long[]{0x0000000000000000L,0x0400010000010800L,0x0000000000000001L});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCT_in_constructQuery592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_datasetClause_in_constructQuery594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WHERE_in_constructQuery597 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_constructQuery599 = new BitSet(new long[]{0x0000000000000000L,0x0400010000010800L,0x0000000000000001L});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeQuery637 = new BitSet(new long[]{0x0000000000004000L,0x0000000008000000L,0x0000000000000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_varOrIRIref_in_describeQuery643 = new BitSet(new long[]{0x0000000000000000L,0x1400010008010840L,0x0000000000000601L,0x0000000000002C00L});
    public static final BitSet FOLLOW_ASTERISK_in_describeQuery649 = new BitSet(new long[]{0x0000000000000000L,0x1400010000010840L,0x0000000000000001L,0x0000000000002000L});
    public static final BitSet FOLLOW_datasetClause_in_describeQuery652 = new BitSet(new long[]{0x0000000000000000L,0x1400010000010840L,0x0000000000000001L,0x0000000000002000L});
    public static final BitSet FOLLOW_whereClause_in_describeQuery655 = new BitSet(new long[]{0x0000000000000000L,0x0400010000010800L,0x0000000000000001L});
    public static final BitSet FOLLOW_solutionModifier_in_describeQuery658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASK_in_askQuery697 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000040L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_datasetClause_in_askQuery699 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000040L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_whereClause_in_askQuery702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_datasetClause730 = new BitSet(new long[]{0x0000000000000000L,0x0008000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_NAMED_in_datasetClause732 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_datasetClause735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause763 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_whereClause766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupClause_in_solutionModifier791 = new BitSet(new long[]{0x0000000000000002L,0x0400010000010000L,0x0000000000000001L});
    public static final BitSet FOLLOW_havingClause_in_solutionModifier794 = new BitSet(new long[]{0x0000000000000002L,0x0400010000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_orderClause_in_solutionModifier797 = new BitSet(new long[]{0x0000000000000002L,0x0400010000000000L});
    public static final BitSet FOLLOW_limitOffsetClauses_in_solutionModifier800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_groupClause832 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_BY_in_groupClause834 = new BitSet(new long[]{0x2000184884C00020L,0x0922882FEC060021L,0x05387CF82F200600L,0x0000000000020C86L});
    public static final BitSet FOLLOW_groupCondition_in_groupClause836 = new BitSet(new long[]{0x2000184884C00022L,0x0922882FEC060021L,0x05387CF82F200600L,0x0000000000020C86L});
    public static final BitSet FOLLOW_builtInCall_in_groupCondition870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_groupCondition886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_groupCondition902 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_groupCondition904 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_AS_in_groupCondition907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_var_in_groupCondition909 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_groupCondition913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_groupCondition937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HAVING_in_havingClause966 = new BitSet(new long[]{0x2000184884C00020L,0x0922882FEC060021L,0x05387CF82F200600L,0x0000000000020086L});
    public static final BitSet FOLLOW_constraint_in_havingClause968 = new BitSet(new long[]{0x2000184884C00022L,0x0922882FEC060021L,0x05387CF82F200600L,0x0000000000020086L});
    public static final BitSet FOLLOW_ORDER_in_orderClause1000 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_BY_in_orderClause1002 = new BitSet(new long[]{0x2004184884C01020L,0x0922882FEC060021L,0x05387CF82F200600L,0x0000000000020C86L});
    public static final BitSet FOLLOW_orderCondition_in_orderClause1004 = new BitSet(new long[]{0x2004184884C01022L,0x0922882FEC060021L,0x05387CF82F200600L,0x0000000000020C86L});
    public static final BitSet FOLLOW_ASC_in_orderCondition1031 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_brackettedExpression_in_orderCondition1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_orderCondition1051 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_brackettedExpression_in_orderCondition1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_in_orderCondition1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_orderCondition1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_limitClause_in_limitOffsetClauses1117 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_offsetClause_in_limitOffsetClauses1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_offsetClause_in_limitOffsetClauses1135 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_limitClause_in_limitOffsetClauses1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limitClause1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_INTEGER_in_limitClause1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFFSET_in_offsetClause1189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_INTEGER_in_offsetClause1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINDINGS_in_bindingsClause1217 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_var_in_bindingsClause1219 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_bindingsClause1222 = new BitSet(new long[]{0x0000000020000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_bindingValueList_in_bindingsClause1224 = new BitSet(new long[]{0x0000000020000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_bindingsClause1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_bindingValueList1263 = new BitSet(new long[]{0x0700E00010000000L,0x0000000008E00008L,0x0007800000000600L,0x0000000000000011L});
    public static final BitSet FOLLOW_bindingValue_in_bindingValueList1265 = new BitSet(new long[]{0x0700E00010000000L,0x0000000008E00008L,0x0007800000000600L,0x0000000000000011L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_bindingValueList1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_bindingValue1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_bindingValue1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_bindingValue1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_bindingValue1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEF_in_bindingValue1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prologue_in_update1336 = new BitSet(new long[]{0x0802028008000040L,0x0004020000100000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_load_in_update1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clear_in_update1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_in_update1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_in_update1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_update1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_copy_in_update1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_update1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_in_update1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_in_update1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_in_update1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOAD_in_load1438 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000020000000600L});
    public static final BitSet FOLLOW_SILENT_in_load1440 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_load1443 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_INTO_in_load1446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_graphRef_in_load1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLEAR_in_clear1485 = new BitSet(new long[]{0x0001000000000080L,0x0008000000000100L,0x0000020000000000L});
    public static final BitSet FOLLOW_SILENT_in_clear1488 = new BitSet(new long[]{0x0001000000000080L,0x0008000000000100L});
    public static final BitSet FOLLOW_graphRefAll_in_clear1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop1523 = new BitSet(new long[]{0x0001000000000080L,0x0008000000000100L,0x0000020000000000L});
    public static final BitSet FOLLOW_SILENT_in_drop1525 = new BitSet(new long[]{0x0001000000000080L,0x0008000000000100L});
    public static final BitSet FOLLOW_graphRefAll_in_drop1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create1557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000020000000000L});
    public static final BitSet FOLLOW_SILENT_in_create1559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_graphRef_in_create1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_add1594 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000020000000600L});
    public static final BitSet FOLLOW_SILENT_in_add1596 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000000000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_add1601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_TO_in_add1603 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000000000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_add1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move1643 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000020000000600L});
    public static final BitSet FOLLOW_SILENT_in_move1645 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000000000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_move1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_TO_in_move1652 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000000000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_move1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COPY_in_copy1692 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000020000000600L});
    public static final BitSet FOLLOW_SILENT_in_copy1694 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000000000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_copy1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_TO_in_copy1701 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000000000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_copy1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert1737 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DATA_in_insert1739 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_insert1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete1775 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_deleteData_in_delete1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteWhere_in_delete1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_deleteData1800 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteData1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_deleteWhere1829 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteWhere1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_modify1863 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_modify1865 = new BitSet(new long[]{0x0002000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_deleteClause_in_modify1870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_insertClause_in_modify1872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_insertClause_in_modify1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_usingClause_in_modify1880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002100L});
    public static final BitSet FOLLOW_WHERE_in_modify1883 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_modify1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_deleteClause1932 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteClause1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insertClause1963 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_insertClause1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_usingClause1988 = new BitSet(new long[]{0x0000000000000000L,0x0008000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_NAMED_in_usingClause1990 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_usingClause1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_graphOrDefault2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphOrDefault2033 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_graphOrDefault2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphRef2063 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_graphRef2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphRef_in_graphRefAll2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_graphRefAll2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMED_in_graphRefAll2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_graphRefAll2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_quadPattern2111 = new BitSet(new long[]{0x0700E00020200000L,0x2800000008E00108L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_quads_in_quadPattern2113 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_quadPattern2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesTemplate_in_quads2140 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_quadsNotTriples_in_quads2144 = new BitSet(new long[]{0x0780E00000200002L,0x2800000008E00108L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_DOT_in_quads2146 = new BitSet(new long[]{0x0700E00000200002L,0x2800000008E00108L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_triplesTemplate_in_quads2149 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_GRAPH_in_quadsNotTriples2188 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_varOrIRIref_in_quadsNotTriples2190 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_quadsNotTriples2192 = new BitSet(new long[]{0x0700E00020200000L,0x2800000008E00008L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_triplesTemplate_in_quadsNotTriples2194 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_quadsNotTriples2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesTemplate2229 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_DOT_in_triplesTemplate2232 = new BitSet(new long[]{0x0700E00000200000L,0x2800000008E00008L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesTemplate2234 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_DOT_in_triplesTemplate2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_groupGraphPattern2270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_subSelect_in_groupGraphPattern2272 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_groupGraphPattern2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_groupGraphPattern2290 = new BitSet(new long[]{0x0700E00000220000L,0x7800400008E00118L,0x0007800400000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_groupGraphPatternSub_in_groupGraphPattern2292 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_groupGraphPattern2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_groupGraphPattern2310 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_groupGraphPattern2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSub2341 = new BitSet(new long[]{0x0000000000020002L,0x5000400000000110L,0x0000000400000000L});
    public static final BitSet FOLLOW_groupGraphPatternSubDetail_in_groupGraphPatternSub2343 = new BitSet(new long[]{0x0000000000020002L,0x5000400000000110L,0x0000000400000000L});
    public static final BitSet FOLLOW_groupGraphPatternSubDetail_in_groupGraphPatternSub2359 = new BitSet(new long[]{0x0000000000020002L,0x5000400000000110L,0x0000000400000000L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_groupGraphPatternSubDetail2382 = new BitSet(new long[]{0x0780E00000200002L,0x2800000008E00008L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_DOT_in_groupGraphPatternSubDetail2384 = new BitSet(new long[]{0x0700E00000200002L,0x2800000008E00008L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSubDetail2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubjectPath_in_triplesBlock2412 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_DOT_in_triplesBlock2415 = new BitSet(new long[]{0x0700E00000200000L,0x2800000008E00008L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_triplesSameSubjectPath_in_triplesBlock2417 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_DOT_in_triplesBlock2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionalGraphPattern_in_graphPatternNotTriples2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minusGraphPattern_in_graphPatternNotTriples2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphGraphPattern_in_graphPatternNotTriples2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serviceGraphPattern_in_graphPatternNotTriples2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filter_in_graphPatternNotTriples2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_in_graphPatternNotTriples2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_optionalGraphPattern2485 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_optionalGraphPattern2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphGraphPattern2512 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_varOrIRIref_in_graphGraphPattern2514 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_graphGraphPattern2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SERVICE_in_serviceGraphPattern2543 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000020000000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_SILENT_in_serviceGraphPattern2545 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_varOrIRIref_in_serviceGraphPattern2548 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_serviceGraphPattern2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIND_in_bind2584 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_bind2586 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_bind2588 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AS_in_bind2590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_var_in_bind2592 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_bind2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_KEYWORD_in_minusGraphPattern2631 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_minusGraphPattern2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern2661 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_UNION_in_groupOrUnionGraphPattern2669 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern2673 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_FILTER_in_filter2705 = new BitSet(new long[]{0x2000184884C00020L,0x0922882FEC060021L,0x05387CF82F200600L,0x0000000000020086L});
    public static final BitSet FOLLOW_constraint_in_filter2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackettedExpression_in_constraint2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_constraint2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_constraint2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_functionCall2765 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_argList_in_functionCall2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nil_in_argList2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_argList2810 = new BitSet(new long[]{0x2720F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_DISTINCT_in_argList2812 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_argList2815 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_COMMA_in_argList2818 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_argList2820 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_argList2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nil_in_expressionList2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_expressionList2854 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_expressionList2856 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_COMMA_in_expressionList2859 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_expressionList2861 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_expressionList2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_constructTemplate2896 = new BitSet(new long[]{0x0700E00020200000L,0x2800000008E00008L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_constructTriples_in_constructTemplate2898 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_constructTemplate2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubject_in_constructTriples2927 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_DOT_in_constructTriples2930 = new BitSet(new long[]{0x0700E00000200000L,0x2800000008E00008L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_triplesSameSubject_in_constructTriples2932 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_DOT_in_constructTriples2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubject2959 = new BitSet(new long[]{0x0000000000000012L,0x081000000A000000L,0x0000000000000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubject2985 = new BitSet(new long[]{0x0000000000000012L,0x081000000A000000L,0x0000000000000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyListNotEmptyDetails_in_propertyListNotEmpty3017 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_propertyListNotEmpty3020 = new BitSet(new long[]{0x0000000000000012L,0x081000000A000000L,0x0000000100000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_propertyListNotEmptyDetails_in_propertyListNotEmpty3022 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_graphNode_in_objectList3048 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_COMMA_in_objectList3051 = new BitSet(new long[]{0x0700E00000200000L,0x2800000008E00008L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_graphNode_in_objectList3053 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_varOrIRIref_in_verb3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_verb3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubjectPath3106 = new BitSet(new long[]{0x0000000000000010L,0x081000000A000000L,0x0000000000000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_propertyListNotEmptyPath_in_triplesSameSubjectPath3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubjectPath3130 = new BitSet(new long[]{0x0000000000000012L,0x081000000A000000L,0x0000000000000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyListNotEmptyDetails_in_propertyListNotEmptyPath3164 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_propertyListNotEmptyPath3167 = new BitSet(new long[]{0x0000000000000012L,0x081000000A000000L,0x0000000100000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_propertyListNotEmptyDetails_in_propertyListNotEmptyPath3169 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_verbSimpleOrPath_in_propertyListNotEmptyDetails3196 = new BitSet(new long[]{0x0700E00000200000L,0x2800000008E00008L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmptyDetails3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verbPath_in_verbSimpleOrPath3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verbSimple_in_verbSimpleOrPath3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_in_verbPath3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_verbSimple3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathSequence_in_path3298 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PIPE_in_path3301 = new BitSet(new long[]{0x0000000000000010L,0x081000000A000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_pathSequence_in_path3303 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence3332 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_pathSequence3335 = new BitSet(new long[]{0x0000000000000010L,0x081000000A000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence3337 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_INVERSE_in_pathEltOrInverse3365 = new BitSet(new long[]{0x0000000000000010L,0x0810000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_pathElt_in_pathEltOrInverse3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathPrimary_in_pathElt3396 = new BitSet(new long[]{0x0000000000004002L,0x1000000000000000L,0x0000000000100100L});
    public static final BitSet FOLLOW_pathMod_in_pathElt3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_pathMod3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_pathMod3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_pathMod3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_pathMod3429 = new BitSet(new long[]{0x0000000200000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod3432 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_COMMA_in_pathMod3435 = new BitSet(new long[]{0x0000000020000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod3442 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_pathMod3454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod3456 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_pathPrimary3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_pathPrimary3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATION_in_pathPrimary3509 = new BitSet(new long[]{0x0000000000000010L,0x080000000A000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_pathNegatedPropertySet_in_pathPrimary3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_pathPrimary3529 = new BitSet(new long[]{0x0000000000000010L,0x081000000A000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_path_in_pathPrimary3531 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_pathPrimary3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_pathNegatedPropertySet3574 = new BitSet(new long[]{0x0000000010000010L,0x000000000A000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3577 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PIPE_in_pathNegatedPropertySet3580 = new BitSet(new long[]{0x0000000000000010L,0x000000000A000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3582 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_pathNegatedPropertySet3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERSE_in_pathOneInPropertySet3617 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_pathOneInPropertySet3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_pathOneInPropertySet3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_triplesNode3644 = new BitSet(new long[]{0x0700E00000200000L,0x2800000008E00008L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_graphNode_in_triplesNode3646 = new BitSet(new long[]{0x0700E00010200000L,0x2800000008E00008L,0x0007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_triplesNode3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_SQUARE_BRACKET_in_triplesNode3666 = new BitSet(new long[]{0x0000000000000010L,0x081000000A000000L,0x0000000000000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesNode3668 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CLOSE_SQUARE_BRACKET_in_triplesNode3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_graphNode3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_graphNode3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIRIref3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_varOrIRIref3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_graphTerm3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_graphTerm3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_graphTerm3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nil_in_graphTerm3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_nil3844 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_nil3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_expression3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression3883 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_OR_in_conditionalOrExpression3892 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression3896 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_valueLogical_in_conditionalAndExpression3930 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_AND_in_conditionalAndExpression3939 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_valueLogical_in_conditionalAndExpression3943 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_relationalExpression_in_valueLogical3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression3994 = new BitSet(new long[]{0x8000000000000002L,0x006000C000080600L});
    public static final BitSet FOLLOW_EQUAL_in_relationalExpression4004 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_relationalExpression4065 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_relationalExpression4124 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_relationalExpression4183 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_relationalExpression4241 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_relationalExpression4299 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_relationalExpression4359 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_expressionList_in_relationalExpression4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_relationalExpression4417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_IN_in_relationalExpression4419 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_expressionList_in_relationalExpression4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_numericExpression4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4477 = new BitSet(new long[]{0x0600C00000000002L,0x0000200000C00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_additiveOperator_in_additiveExpression4487 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4491 = new BitSet(new long[]{0x0600C00000000002L,0x0000200000C00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_additiveExpression4558 = new BitSet(new long[]{0x0640C00000004002L,0x0000200000C00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_additiveExpression4576 = new BitSet(new long[]{0x0640C00000004002L,0x0000200000C00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ASTERISK_in_additiveExpression4640 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_unaryExpression_in_additiveExpression4644 = new BitSet(new long[]{0x0600C00000000002L,0x0000200000C00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DIVIDE_in_additiveExpression4710 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_unaryExpression_in_additiveExpression4714 = new BitSet(new long[]{0x0600C00000000002L,0x0000200000C00000L,0x0000000000000100L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4780 = new BitSet(new long[]{0x0040000000004002L});
    public static final BitSet FOLLOW_multiplicativeOperator_in_multiplicativeExpression4789 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4793 = new BitSet(new long[]{0x0040000000004002L});
    public static final BitSet FOLLOW_NEGATION_in_unaryExpression4849 = new BitSet(new long[]{0x2700F94884C08020L,0x09229C2FECE62029L,0x073FFCF83F200600L,0x0000000000020C87L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression4869 = new BitSet(new long[]{0x2700F94884C08020L,0x09229C2FECE62029L,0x073FFCF83F200600L,0x0000000000020C87L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression4889 = new BitSet(new long[]{0x2700F94884C08020L,0x09229C2FECE62029L,0x073FFCF83F200600L,0x0000000000020C87L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackettedExpression_in_primaryExpression4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_primaryExpression4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRefOrFunction_in_primaryExpression4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_primaryExpression4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_primaryExpression4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_primaryExpression4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggregate_in_primaryExpression4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_brackettedExpression4979 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_brackettedExpression4981 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_brackettedExpression4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_builtInCall5008 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5010 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5012 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANG_in_builtInCall5030 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5032 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5034 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGMATCHES_in_builtInCall5052 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5054 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5056 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5058 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5060 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATATYPE_in_builtInCall5079 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5081 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5083 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOUND_in_builtInCall5101 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_var_in_builtInCall5105 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_in_builtInCall5123 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5125 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5127 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_builtInCall5145 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5147 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5149 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall5167 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5170 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5172 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall5191 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_nil_in_builtInCall5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAND_in_builtInCall5205 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_nil_in_builtInCall5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABS_in_builtInCall5219 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5221 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5223 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CEIL_in_builtInCall5241 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5243 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5245 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOOR_in_builtInCall5263 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5265 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5267 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_in_builtInCall5285 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5287 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5289 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONCAT_in_builtInCall5307 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subStringExpression_in_builtInCall5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRLEN_in_builtInCall5337 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5339 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5341 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCASE_in_builtInCall5359 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5361 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5363 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCASE_in_builtInCall5381 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5383 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5385 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENCODE_FOR_URI_in_builtInCall5403 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5405 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5407 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTAINS_in_builtInCall5425 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5427 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5429 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5431 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5433 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRSTARTS_in_builtInCall5453 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5455 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5457 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5459 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5461 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRENDS_in_builtInCall5481 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5483 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5485 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5487 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5489 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRBEFORE_in_builtInCall5509 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5511 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5513 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5515 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5517 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRAFTER_in_builtInCall5537 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5539 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5541 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5543 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5545 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPLACE_in_builtInCall5565 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5567 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5569 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5571 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5573 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5575 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5577 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_builtInCall5599 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5601 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5603 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_builtInCall5621 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5623 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5625 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_builtInCall5643 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5645 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5647 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOURS_in_builtInCall5665 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5667 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5669 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUTES_in_builtInCall5687 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5689 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5691 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECONDS_in_builtInCall5709 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5711 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5713 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMEZONE_in_builtInCall5731 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5733 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5735 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TZ_in_builtInCall5753 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5755 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5757 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOW_in_builtInCall5775 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_nil_in_builtInCall5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MD5_in_builtInCall5789 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5791 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5793 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHA1_in_builtInCall5811 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5813 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5815 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHA224_in_builtInCall5833 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5835 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5837 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHA256_in_builtInCall5855 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5857 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5859 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHA384_in_builtInCall5877 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5879 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5881 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHA512_in_builtInCall5899 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5901 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5903 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COALESCE_in_builtInCall5921 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_builtInCall5939 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5941 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5945 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5947 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5951 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5953 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5957 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRLANG_in_builtInCall5982 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5984 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5986 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5988 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall5990 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRDT_in_builtInCall6010 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall6012 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall6014 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall6016 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall6018 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAMETERM_in_builtInCall6038 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall6040 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall6042 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall6044 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall6046 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISIRI_in_builtInCall6066 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall6068 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall6070 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISURI_in_builtInCall6088 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall6090 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall6092 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISBLANK_in_builtInCall6110 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall6112 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall6114 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISLITERAL_in_builtInCall6133 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall6135 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall6137 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall6139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNUMERIC_in_builtInCall6155 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall6157 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_builtInCall6159 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall6161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regexExpression_in_builtInCall6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_existsFunction_in_builtInCall6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExistsFunction_in_builtInCall6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_regexExpression6222 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_regexExpression6224 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_regexExpression6226 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_regexExpression6228 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_regexExpression6230 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_COMMA_in_regexExpression6233 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_regexExpression6235 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_regexExpression6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSTR_in_subStringExpression6269 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_subStringExpression6271 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_subStringExpression6273 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_COMMA_in_subStringExpression6275 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_subStringExpression6277 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_COMMA_in_subStringExpression6280 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_subStringExpression6282 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_subStringExpression6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_existsFunction6316 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_existsFunction6318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_notExistsFunction6343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EXISTS_in_notExistsFunction6345 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_notExistsFunction6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_aggregate6372 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6374 = new BitSet(new long[]{0x2720F94884C0C020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6376 = new BitSet(new long[]{0x2700F94884C0C020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_ASTERISK_in_aggregate6380 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_expression_in_aggregate6384 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUM_in_aggregate6410 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6412 = new BitSet(new long[]{0x2720F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6414 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_aggregate6417 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_aggregate6438 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6440 = new BitSet(new long[]{0x2720F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6442 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_aggregate6445 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_aggregate6466 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6468 = new BitSet(new long[]{0x2720F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6470 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_aggregate6473 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AVG_in_aggregate6494 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6496 = new BitSet(new long[]{0x2720F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6498 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_aggregate6501 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAMPLE_in_aggregate6522 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6524 = new BitSet(new long[]{0x2720F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6526 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_aggregate6529 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_CONCAT_in_aggregate6550 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6552 = new BitSet(new long[]{0x2720F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6554 = new BitSet(new long[]{0x2700F94884C08020L,0x0932BC2FECE62029L,0x073FFCF83F200700L,0x0000000000020C87L});
    public static final BitSet FOLLOW_expression_in_aggregate6557 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_aggregate6560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SEPARATOR_in_aggregate6562 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_EQUAL_in_aggregate6564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0007800000000000L});
    public static final BitSet FOLLOW_string_in_aggregate6566 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_iriRefOrFunction6605 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_argList_in_iriRefOrFunction6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_rdfLiteral6640 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LANGTAG_in_rdfLiteral6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCE_in_rdfLiteral6648 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_rdfLiteral6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_NODE_LABEL_in_blankNode6919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anon_in_blankNode6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_SQUARE_BRACKET_in_anon6944 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CLOSE_SQUARE_BRACKET_in_anon6946 = new BitSet(new long[]{0x0000000000000002L});

}