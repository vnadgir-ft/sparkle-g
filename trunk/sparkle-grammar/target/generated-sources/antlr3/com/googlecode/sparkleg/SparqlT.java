// $ANTLR 3.4 com\\googlecode\\sparkleg\\SparqlT.g 2011-11-18 18:29:03

    package com.googlecode.sparkleg;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


/**
 * @author Simone Tripodi   (simone.tripodi)
 * @author Michele Mostarda (michele.mostarda)
 * @author Juergen Pfundt   (Juergen.Pfundt)
 * @version $Id: Sparql.g 161 2011-05-23 22:14:39Z Juergen.Pfundt@web.de $
 */
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SparqlT extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SparqlT(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SparqlT(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SparqlT.tokenNames; }
    public String getGrammarFileName() { return "com\\googlecode\\sparkleg\\SparqlT.g"; }


    public static class query_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query"
    // com\\googlecode\\sparkleg\\SparqlT.g:37:1: query : ( ^( QUERY prologue ( selectQuery )? ( constructQuery )? ( describeQuery )? ( askQuery )? ) ( bindingsClause )? | ^( UPDATE ( update )+ ) );
    public final SparqlT.query_return query() throws RecognitionException {
        SparqlT.query_return retval = new SparqlT.query_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUERY1=null;
        CommonTree UPDATE8=null;
        SparqlT.prologue_return prologue2 =null;

        SparqlT.selectQuery_return selectQuery3 =null;

        SparqlT.constructQuery_return constructQuery4 =null;

        SparqlT.describeQuery_return describeQuery5 =null;

        SparqlT.askQuery_return askQuery6 =null;

        SparqlT.bindingsClause_return bindingsClause7 =null;

        SparqlT.update_return update9 =null;


        CommonTree QUERY1_tree=null;
        CommonTree UPDATE8_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:38:5: ( ^( QUERY prologue ( selectQuery )? ( constructQuery )? ( describeQuery )? ( askQuery )? ) ( bindingsClause )? | ^( UPDATE ( update )+ ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case QUERY:
                {
                alt7=1;
                }
                break;
            case UPDATE:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:38:7: ^( QUERY prologue ( selectQuery )? ( constructQuery )? ( describeQuery )? ( askQuery )? ) ( bindingsClause )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    QUERY1=(CommonTree)match(input,QUERY,FOLLOW_QUERY_in_query53); 
                    QUERY1_tree = (CommonTree)adaptor.dupNode(QUERY1);


                    root_1 = (CommonTree)adaptor.becomeRoot(QUERY1_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_prologue_in_query55);
                    prologue2=prologue();

                    state._fsp--;

                    adaptor.addChild(root_1, prologue2.getTree());


                    // com\\googlecode\\sparkleg\\SparqlT.g:38:24: ( selectQuery )?
                    int alt1=2;
                    switch ( input.LA(1) ) {
                        case SELECT:
                            {
                            alt1=1;
                            }
                            break;
                    }

                    switch (alt1) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:38:24: selectQuery
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_selectQuery_in_query57);
                            selectQuery3=selectQuery();

                            state._fsp--;

                            adaptor.addChild(root_1, selectQuery3.getTree());


                            }
                            break;

                    }


                    // com\\googlecode\\sparkleg\\SparqlT.g:38:37: ( constructQuery )?
                    int alt2=2;
                    switch ( input.LA(1) ) {
                        case CONSTRUCT:
                            {
                            alt2=1;
                            }
                            break;
                    }

                    switch (alt2) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:38:37: constructQuery
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_constructQuery_in_query60);
                            constructQuery4=constructQuery();

                            state._fsp--;

                            adaptor.addChild(root_1, constructQuery4.getTree());


                            }
                            break;

                    }


                    // com\\googlecode\\sparkleg\\SparqlT.g:38:53: ( describeQuery )?
                    int alt3=2;
                    switch ( input.LA(1) ) {
                        case DESCRIBE:
                            {
                            alt3=1;
                            }
                            break;
                    }

                    switch (alt3) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:38:53: describeQuery
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_describeQuery_in_query63);
                            describeQuery5=describeQuery();

                            state._fsp--;

                            adaptor.addChild(root_1, describeQuery5.getTree());


                            }
                            break;

                    }


                    // com\\googlecode\\sparkleg\\SparqlT.g:38:68: ( askQuery )?
                    int alt4=2;
                    switch ( input.LA(1) ) {
                        case ASK:
                            {
                            alt4=1;
                            }
                            break;
                    }

                    switch (alt4) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:38:68: askQuery
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_askQuery_in_query66);
                            askQuery6=askQuery();

                            state._fsp--;

                            adaptor.addChild(root_1, askQuery6.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // com\\googlecode\\sparkleg\\SparqlT.g:38:79: ( bindingsClause )?
                    int alt5=2;
                    switch ( input.LA(1) ) {
                        case BINDINGS:
                            {
                            alt5=1;
                            }
                            break;
                    }

                    switch (alt5) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:38:79: bindingsClause
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_bindingsClause_in_query70);
                            bindingsClause7=bindingsClause();

                            state._fsp--;

                            adaptor.addChild(root_0, bindingsClause7.getTree());


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:39:7: ^( UPDATE ( update )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    UPDATE8=(CommonTree)match(input,UPDATE,FOLLOW_UPDATE_in_query80); 
                    UPDATE8_tree = (CommonTree)adaptor.dupNode(UPDATE8);


                    root_1 = (CommonTree)adaptor.becomeRoot(UPDATE8_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:39:16: ( update )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        switch ( input.LA(1) ) {
                        case PROLOGUE:
                            {
                            alt6=1;
                            }
                            break;

                        }

                        switch (alt6) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:39:16: update
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_update_in_query82);
                    	    update9=update();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, update9.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "query"


    public static class prologue_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prologue"
    // com\\googlecode\\sparkleg\\SparqlT.g:42:1: prologue : ^( PROLOGUE ( baseDecl )* ( prefixDecl )* ) ;
    public final SparqlT.prologue_return prologue() throws RecognitionException {
        SparqlT.prologue_return retval = new SparqlT.prologue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PROLOGUE10=null;
        SparqlT.baseDecl_return baseDecl11 =null;

        SparqlT.prefixDecl_return prefixDecl12 =null;


        CommonTree PROLOGUE10_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:43:5: ( ^( PROLOGUE ( baseDecl )* ( prefixDecl )* ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:43:7: ^( PROLOGUE ( baseDecl )* ( prefixDecl )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PROLOGUE10=(CommonTree)match(input,PROLOGUE,FOLLOW_PROLOGUE_in_prologue102); 
            PROLOGUE10_tree = (CommonTree)adaptor.dupNode(PROLOGUE10);


            root_1 = (CommonTree)adaptor.becomeRoot(PROLOGUE10_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:43:18: ( baseDecl )*
                loop8:
                do {
                    int alt8=2;
                    switch ( input.LA(1) ) {
                    case BASE:
                        {
                        alt8=1;
                        }
                        break;

                    }

                    switch (alt8) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:43:18: baseDecl
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_baseDecl_in_prologue104);
                	    baseDecl11=baseDecl();

                	    state._fsp--;

                	    adaptor.addChild(root_1, baseDecl11.getTree());


                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                // com\\googlecode\\sparkleg\\SparqlT.g:43:28: ( prefixDecl )*
                loop9:
                do {
                    int alt9=2;
                    switch ( input.LA(1) ) {
                    case PREFIX:
                        {
                        alt9=1;
                        }
                        break;

                    }

                    switch (alt9) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:43:28: prefixDecl
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_prefixDecl_in_prologue107);
                	    prefixDecl12=prefixDecl();

                	    state._fsp--;

                	    adaptor.addChild(root_1, prefixDecl12.getTree());


                	    }
                	    break;

                	default :
                	    break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prologue"


    public static class baseDecl_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "baseDecl"
    // com\\googlecode\\sparkleg\\SparqlT.g:46:1: baseDecl : ^( BASE IRI_REF ) ;
    public final SparqlT.baseDecl_return baseDecl() throws RecognitionException {
        SparqlT.baseDecl_return retval = new SparqlT.baseDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BASE13=null;
        CommonTree IRI_REF14=null;

        CommonTree BASE13_tree=null;
        CommonTree IRI_REF14_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:47:5: ( ^( BASE IRI_REF ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:47:7: ^( BASE IRI_REF )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            BASE13=(CommonTree)match(input,BASE,FOLLOW_BASE_in_baseDecl127); 
            BASE13_tree = (CommonTree)adaptor.dupNode(BASE13);


            root_1 = (CommonTree)adaptor.becomeRoot(BASE13_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IRI_REF14=(CommonTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_baseDecl129); 
            IRI_REF14_tree = (CommonTree)adaptor.dupNode(IRI_REF14);


            adaptor.addChild(root_1, IRI_REF14_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "baseDecl"


    public static class prefixDecl_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefixDecl"
    // com\\googlecode\\sparkleg\\SparqlT.g:50:1: prefixDecl : ^( PREFIX PNAME_NS IRI_REF ) ;
    public final SparqlT.prefixDecl_return prefixDecl() throws RecognitionException {
        SparqlT.prefixDecl_return retval = new SparqlT.prefixDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PREFIX15=null;
        CommonTree PNAME_NS16=null;
        CommonTree IRI_REF17=null;

        CommonTree PREFIX15_tree=null;
        CommonTree PNAME_NS16_tree=null;
        CommonTree IRI_REF17_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:51:5: ( ^( PREFIX PNAME_NS IRI_REF ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:51:7: ^( PREFIX PNAME_NS IRI_REF )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PREFIX15=(CommonTree)match(input,PREFIX,FOLLOW_PREFIX_in_prefixDecl148); 
            PREFIX15_tree = (CommonTree)adaptor.dupNode(PREFIX15);


            root_1 = (CommonTree)adaptor.becomeRoot(PREFIX15_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            PNAME_NS16=(CommonTree)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixDecl150); 
            PNAME_NS16_tree = (CommonTree)adaptor.dupNode(PNAME_NS16);


            adaptor.addChild(root_1, PNAME_NS16_tree);


            _last = (CommonTree)input.LT(1);
            IRI_REF17=(CommonTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_prefixDecl152); 
            IRI_REF17_tree = (CommonTree)adaptor.dupNode(IRI_REF17);


            adaptor.addChild(root_1, IRI_REF17_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prefixDecl"


    public static class selectQuery_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectQuery"
    // com\\googlecode\\sparkleg\\SparqlT.g:54:1: selectQuery : ^( SELECT selectClause ( datasetClause )* ( whereClause )* solutionModifier ) ;
    public final SparqlT.selectQuery_return selectQuery() throws RecognitionException {
        SparqlT.selectQuery_return retval = new SparqlT.selectQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT18=null;
        SparqlT.selectClause_return selectClause19 =null;

        SparqlT.datasetClause_return datasetClause20 =null;

        SparqlT.whereClause_return whereClause21 =null;

        SparqlT.solutionModifier_return solutionModifier22 =null;


        CommonTree SELECT18_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:55:5: ( ^( SELECT selectClause ( datasetClause )* ( whereClause )* solutionModifier ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:55:7: ^( SELECT selectClause ( datasetClause )* ( whereClause )* solutionModifier )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SELECT18=(CommonTree)match(input,SELECT,FOLLOW_SELECT_in_selectQuery171); 
            SELECT18_tree = (CommonTree)adaptor.dupNode(SELECT18);


            root_1 = (CommonTree)adaptor.becomeRoot(SELECT18_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_selectClause_in_selectQuery173);
            selectClause19=selectClause();

            state._fsp--;

            adaptor.addChild(root_1, selectClause19.getTree());


            // com\\googlecode\\sparkleg\\SparqlT.g:55:29: ( datasetClause )*
            loop10:
            do {
                int alt10=2;
                switch ( input.LA(1) ) {
                case FROM:
                    {
                    alt10=1;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:55:29: datasetClause
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_datasetClause_in_selectQuery175);
            	    datasetClause20=datasetClause();

            	    state._fsp--;

            	    adaptor.addChild(root_1, datasetClause20.getTree());


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:55:44: ( whereClause )*
            loop11:
            do {
                int alt11=2;
                switch ( input.LA(1) ) {
                case WHERE_CLAUSE:
                    {
                    alt11=1;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:55:44: whereClause
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_whereClause_in_selectQuery178);
            	    whereClause21=whereClause();

            	    state._fsp--;

            	    adaptor.addChild(root_1, whereClause21.getTree());


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_solutionModifier_in_selectQuery181);
            solutionModifier22=solutionModifier();

            state._fsp--;

            adaptor.addChild(root_1, solutionModifier22.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectQuery"


    public static class subSelect_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subSelect"
    // com\\googlecode\\sparkleg\\SparqlT.g:58:1: subSelect : ^( SUBSELECT ( whereClause )* ( datasetClause )* solutionModifier ) ;
    public final SparqlT.subSelect_return subSelect() throws RecognitionException {
        SparqlT.subSelect_return retval = new SparqlT.subSelect_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SUBSELECT23=null;
        SparqlT.whereClause_return whereClause24 =null;

        SparqlT.datasetClause_return datasetClause25 =null;

        SparqlT.solutionModifier_return solutionModifier26 =null;


        CommonTree SUBSELECT23_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:59:5: ( ^( SUBSELECT ( whereClause )* ( datasetClause )* solutionModifier ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:59:7: ^( SUBSELECT ( whereClause )* ( datasetClause )* solutionModifier )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SUBSELECT23=(CommonTree)match(input,SUBSELECT,FOLLOW_SUBSELECT_in_subSelect200); 
            SUBSELECT23_tree = (CommonTree)adaptor.dupNode(SUBSELECT23);


            root_1 = (CommonTree)adaptor.becomeRoot(SUBSELECT23_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:59:19: ( whereClause )*
                loop12:
                do {
                    int alt12=2;
                    switch ( input.LA(1) ) {
                    case WHERE_CLAUSE:
                        {
                        alt12=1;
                        }
                        break;

                    }

                    switch (alt12) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:59:19: whereClause
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_whereClause_in_subSelect202);
                	    whereClause24=whereClause();

                	    state._fsp--;

                	    adaptor.addChild(root_1, whereClause24.getTree());


                	    }
                	    break;

                	default :
                	    break loop12;
                    }
                } while (true);


                // com\\googlecode\\sparkleg\\SparqlT.g:59:32: ( datasetClause )*
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
                	    // com\\googlecode\\sparkleg\\SparqlT.g:59:32: datasetClause
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_datasetClause_in_subSelect205);
                	    datasetClause25=datasetClause();

                	    state._fsp--;

                	    adaptor.addChild(root_1, datasetClause25.getTree());


                	    }
                	    break;

                	default :
                	    break loop13;
                    }
                } while (true);


                _last = (CommonTree)input.LT(1);
                pushFollow(FOLLOW_solutionModifier_in_subSelect208);
                solutionModifier26=solutionModifier();

                state._fsp--;

                adaptor.addChild(root_1, solutionModifier26.getTree());


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subSelect"


    public static class selectClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:62:1: selectClause : ( ^( SELECT_CLAUSE ASTERISK ) | ^( SELECT_CLAUSE DISTINCT ASTERISK ) | ^( SELECT_CLAUSE REDUCED ASTERISK ) | ^( SELECT_CLAUSE ( selectVariables )* ) | ^( SELECT_CLAUSE DISTINCT ( selectVariables )* ) | ^( SELECT_CLAUSE REDUCED ( selectVariables )* ) );
    public final SparqlT.selectClause_return selectClause() throws RecognitionException {
        SparqlT.selectClause_return retval = new SparqlT.selectClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT_CLAUSE27=null;
        CommonTree ASTERISK28=null;
        CommonTree SELECT_CLAUSE29=null;
        CommonTree DISTINCT30=null;
        CommonTree ASTERISK31=null;
        CommonTree SELECT_CLAUSE32=null;
        CommonTree REDUCED33=null;
        CommonTree ASTERISK34=null;
        CommonTree SELECT_CLAUSE35=null;
        CommonTree SELECT_CLAUSE37=null;
        CommonTree DISTINCT38=null;
        CommonTree SELECT_CLAUSE40=null;
        CommonTree REDUCED41=null;
        SparqlT.selectVariables_return selectVariables36 =null;

        SparqlT.selectVariables_return selectVariables39 =null;

        SparqlT.selectVariables_return selectVariables42 =null;


        CommonTree SELECT_CLAUSE27_tree=null;
        CommonTree ASTERISK28_tree=null;
        CommonTree SELECT_CLAUSE29_tree=null;
        CommonTree DISTINCT30_tree=null;
        CommonTree ASTERISK31_tree=null;
        CommonTree SELECT_CLAUSE32_tree=null;
        CommonTree REDUCED33_tree=null;
        CommonTree ASTERISK34_tree=null;
        CommonTree SELECT_CLAUSE35_tree=null;
        CommonTree SELECT_CLAUSE37_tree=null;
        CommonTree DISTINCT38_tree=null;
        CommonTree SELECT_CLAUSE40_tree=null;
        CommonTree REDUCED41_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:63:5: ( ^( SELECT_CLAUSE ASTERISK ) | ^( SELECT_CLAUSE DISTINCT ASTERISK ) | ^( SELECT_CLAUSE REDUCED ASTERISK ) | ^( SELECT_CLAUSE ( selectVariables )* ) | ^( SELECT_CLAUSE DISTINCT ( selectVariables )* ) | ^( SELECT_CLAUSE REDUCED ( selectVariables )* ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case SELECT_CLAUSE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case ASTERISK:
                        {
                        alt17=1;
                        }
                        break;
                    case DISTINCT:
                        {
                        switch ( input.LA(4) ) {
                        case ASTERISK:
                            {
                            alt17=2;
                            }
                            break;
                        case UP:
                        case AS:
                        case VAR:
                            {
                            alt17=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 4, input);

                            throw nvae;

                        }

                        }
                        break;
                    case REDUCED:
                        {
                        switch ( input.LA(4) ) {
                        case ASTERISK:
                            {
                            alt17=3;
                            }
                            break;
                        case UP:
                        case AS:
                        case VAR:
                            {
                            alt17=6;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 5, input);

                            throw nvae;

                        }

                        }
                        break;
                    case UP:
                    case AS:
                    case VAR:
                        {
                        alt17=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:63:7: ^( SELECT_CLAUSE ASTERISK )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SELECT_CLAUSE27=(CommonTree)match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause232); 
                    SELECT_CLAUSE27_tree = (CommonTree)adaptor.dupNode(SELECT_CLAUSE27);


                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_CLAUSE27_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ASTERISK28=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_selectClause234); 
                    ASTERISK28_tree = (CommonTree)adaptor.dupNode(ASTERISK28);


                    adaptor.addChild(root_1, ASTERISK28_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:64:7: ^( SELECT_CLAUSE DISTINCT ASTERISK )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SELECT_CLAUSE29=(CommonTree)match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause244); 
                    SELECT_CLAUSE29_tree = (CommonTree)adaptor.dupNode(SELECT_CLAUSE29);


                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_CLAUSE29_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    DISTINCT30=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause246); 
                    DISTINCT30_tree = (CommonTree)adaptor.dupNode(DISTINCT30);


                    adaptor.addChild(root_1, DISTINCT30_tree);


                    _last = (CommonTree)input.LT(1);
                    ASTERISK31=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_selectClause248); 
                    ASTERISK31_tree = (CommonTree)adaptor.dupNode(ASTERISK31);


                    adaptor.addChild(root_1, ASTERISK31_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:65:7: ^( SELECT_CLAUSE REDUCED ASTERISK )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SELECT_CLAUSE32=(CommonTree)match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause258); 
                    SELECT_CLAUSE32_tree = (CommonTree)adaptor.dupNode(SELECT_CLAUSE32);


                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_CLAUSE32_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    REDUCED33=(CommonTree)match(input,REDUCED,FOLLOW_REDUCED_in_selectClause260); 
                    REDUCED33_tree = (CommonTree)adaptor.dupNode(REDUCED33);


                    adaptor.addChild(root_1, REDUCED33_tree);


                    _last = (CommonTree)input.LT(1);
                    ASTERISK34=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_selectClause262); 
                    ASTERISK34_tree = (CommonTree)adaptor.dupNode(ASTERISK34);


                    adaptor.addChild(root_1, ASTERISK34_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:66:7: ^( SELECT_CLAUSE ( selectVariables )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SELECT_CLAUSE35=(CommonTree)match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause272); 
                    SELECT_CLAUSE35_tree = (CommonTree)adaptor.dupNode(SELECT_CLAUSE35);


                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_CLAUSE35_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:66:23: ( selectVariables )*
                        loop14:
                        do {
                            int alt14=2;
                            switch ( input.LA(1) ) {
                            case AS:
                            case VAR:
                                {
                                alt14=1;
                                }
                                break;

                            }

                            switch (alt14) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:66:23: selectVariables
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_selectVariables_in_selectClause274);
                        	    selectVariables36=selectVariables();

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, selectVariables36.getTree());


                        	    }
                        	    break;

                        	default :
                        	    break loop14;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:67:7: ^( SELECT_CLAUSE DISTINCT ( selectVariables )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SELECT_CLAUSE37=(CommonTree)match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause285); 
                    SELECT_CLAUSE37_tree = (CommonTree)adaptor.dupNode(SELECT_CLAUSE37);


                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_CLAUSE37_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    DISTINCT38=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause287); 
                    DISTINCT38_tree = (CommonTree)adaptor.dupNode(DISTINCT38);


                    adaptor.addChild(root_1, DISTINCT38_tree);


                    // com\\googlecode\\sparkleg\\SparqlT.g:67:32: ( selectVariables )*
                    loop15:
                    do {
                        int alt15=2;
                        switch ( input.LA(1) ) {
                        case AS:
                        case VAR:
                            {
                            alt15=1;
                            }
                            break;

                        }

                        switch (alt15) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:67:32: selectVariables
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_selectVariables_in_selectClause289);
                    	    selectVariables39=selectVariables();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, selectVariables39.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:68:7: ^( SELECT_CLAUSE REDUCED ( selectVariables )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SELECT_CLAUSE40=(CommonTree)match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause300); 
                    SELECT_CLAUSE40_tree = (CommonTree)adaptor.dupNode(SELECT_CLAUSE40);


                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_CLAUSE40_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    REDUCED41=(CommonTree)match(input,REDUCED,FOLLOW_REDUCED_in_selectClause302); 
                    REDUCED41_tree = (CommonTree)adaptor.dupNode(REDUCED41);


                    adaptor.addChild(root_1, REDUCED41_tree);


                    // com\\googlecode\\sparkleg\\SparqlT.g:68:31: ( selectVariables )*
                    loop16:
                    do {
                        int alt16=2;
                        switch ( input.LA(1) ) {
                        case AS:
                        case VAR:
                            {
                            alt16=1;
                            }
                            break;

                        }

                        switch (alt16) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:68:31: selectVariables
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_selectVariables_in_selectClause304);
                    	    selectVariables42=selectVariables();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, selectVariables42.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectClause"


    public static class selectVariables_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectVariables"
    // com\\googlecode\\sparkleg\\SparqlT.g:71:1: selectVariables : ( ^( VAR var ) | ^( AS expression var ) );
    public final SparqlT.selectVariables_return selectVariables() throws RecognitionException {
        SparqlT.selectVariables_return retval = new SparqlT.selectVariables_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VAR43=null;
        CommonTree AS45=null;
        SparqlT.var_return var44 =null;

        SparqlT.expression_return expression46 =null;

        SparqlT.var_return var47 =null;


        CommonTree VAR43_tree=null;
        CommonTree AS45_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:72:5: ( ^( VAR var ) | ^( AS expression var ) )
            int alt18=2;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt18=1;
                }
                break;
            case AS:
                {
                alt18=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:72:7: ^( VAR var )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    VAR43=(CommonTree)match(input,VAR,FOLLOW_VAR_in_selectVariables324); 
                    VAR43_tree = (CommonTree)adaptor.dupNode(VAR43);


                    root_1 = (CommonTree)adaptor.becomeRoot(VAR43_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_selectVariables326);
                    var44=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var44.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:73:7: ^( AS expression var )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AS45=(CommonTree)match(input,AS,FOLLOW_AS_in_selectVariables337); 
                    AS45_tree = (CommonTree)adaptor.dupNode(AS45);


                    root_1 = (CommonTree)adaptor.becomeRoot(AS45_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_selectVariables339);
                    expression46=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression46.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_selectVariables341);
                    var47=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var47.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectVariables"


    public static class constructQuery_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructQuery"
    // com\\googlecode\\sparkleg\\SparqlT.g:76:1: constructQuery : ( ^( CONSTRUCT constructTemplate ( datasetClause )* ( whereClause )? solutionModifier ) | ^( CONSTRUCT ( datasetClause )* ( whereClause )? solutionModifier ) );
    public final SparqlT.constructQuery_return constructQuery() throws RecognitionException {
        SparqlT.constructQuery_return retval = new SparqlT.constructQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONSTRUCT48=null;
        CommonTree CONSTRUCT53=null;
        SparqlT.constructTemplate_return constructTemplate49 =null;

        SparqlT.datasetClause_return datasetClause50 =null;

        SparqlT.whereClause_return whereClause51 =null;

        SparqlT.solutionModifier_return solutionModifier52 =null;

        SparqlT.datasetClause_return datasetClause54 =null;

        SparqlT.whereClause_return whereClause55 =null;

        SparqlT.solutionModifier_return solutionModifier56 =null;


        CommonTree CONSTRUCT48_tree=null;
        CommonTree CONSTRUCT53_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:77:5: ( ^( CONSTRUCT constructTemplate ( datasetClause )* ( whereClause )? solutionModifier ) | ^( CONSTRUCT ( datasetClause )* ( whereClause )? solutionModifier ) )
            int alt23=2;
            switch ( input.LA(1) ) {
            case CONSTRUCT:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case CONSTRUCT_TRIPLES:
                        {
                        alt23=1;
                        }
                        break;
                    case UP:
                    case FROM:
                    case GROUP_BY:
                    case HAVING:
                    case LIMIT:
                    case OFFSET:
                    case ORDER_BY:
                    case WHERE_CLAUSE:
                        {
                        alt23=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:77:7: ^( CONSTRUCT constructTemplate ( datasetClause )* ( whereClause )? solutionModifier )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONSTRUCT48=(CommonTree)match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_constructQuery362); 
                    CONSTRUCT48_tree = (CommonTree)adaptor.dupNode(CONSTRUCT48);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONSTRUCT48_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_constructTemplate_in_constructQuery364);
                    constructTemplate49=constructTemplate();

                    state._fsp--;

                    adaptor.addChild(root_1, constructTemplate49.getTree());


                    // com\\googlecode\\sparkleg\\SparqlT.g:77:37: ( datasetClause )*
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
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:77:37: datasetClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_datasetClause_in_constructQuery366);
                    	    datasetClause50=datasetClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, datasetClause50.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    // com\\googlecode\\sparkleg\\SparqlT.g:77:52: ( whereClause )?
                    int alt20=2;
                    switch ( input.LA(1) ) {
                        case WHERE_CLAUSE:
                            {
                            alt20=1;
                            }
                            break;
                    }

                    switch (alt20) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:77:52: whereClause
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_whereClause_in_constructQuery369);
                            whereClause51=whereClause();

                            state._fsp--;

                            adaptor.addChild(root_1, whereClause51.getTree());


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_solutionModifier_in_constructQuery372);
                    solutionModifier52=solutionModifier();

                    state._fsp--;

                    adaptor.addChild(root_1, solutionModifier52.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:78:7: ^( CONSTRUCT ( datasetClause )* ( whereClause )? solutionModifier )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONSTRUCT53=(CommonTree)match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_constructQuery382); 
                    CONSTRUCT53_tree = (CommonTree)adaptor.dupNode(CONSTRUCT53);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONSTRUCT53_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:78:19: ( datasetClause )*
                        loop21:
                        do {
                            int alt21=2;
                            switch ( input.LA(1) ) {
                            case FROM:
                                {
                                alt21=1;
                                }
                                break;

                            }

                            switch (alt21) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:78:19: datasetClause
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_datasetClause_in_constructQuery384);
                        	    datasetClause54=datasetClause();

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, datasetClause54.getTree());


                        	    }
                        	    break;

                        	default :
                        	    break loop21;
                            }
                        } while (true);


                        // com\\googlecode\\sparkleg\\SparqlT.g:78:34: ( whereClause )?
                        int alt22=2;
                        switch ( input.LA(1) ) {
                            case WHERE_CLAUSE:
                                {
                                alt22=1;
                                }
                                break;
                        }

                        switch (alt22) {
                            case 1 :
                                // com\\googlecode\\sparkleg\\SparqlT.g:78:34: whereClause
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_whereClause_in_constructQuery387);
                                whereClause55=whereClause();

                                state._fsp--;

                                adaptor.addChild(root_1, whereClause55.getTree());


                                }
                                break;

                        }


                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_solutionModifier_in_constructQuery390);
                        solutionModifier56=solutionModifier();

                        state._fsp--;

                        adaptor.addChild(root_1, solutionModifier56.getTree());


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructQuery"


    public static class describeQuery_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "describeQuery"
    // com\\googlecode\\sparkleg\\SparqlT.g:81:1: describeQuery : ^( DESCRIBE ( varOrIRIref )* ( ASTERISK )* ( datasetClause )* ( whereClause )? solutionModifier ) ;
    public final SparqlT.describeQuery_return describeQuery() throws RecognitionException {
        SparqlT.describeQuery_return retval = new SparqlT.describeQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DESCRIBE57=null;
        CommonTree ASTERISK59=null;
        SparqlT.varOrIRIref_return varOrIRIref58 =null;

        SparqlT.datasetClause_return datasetClause60 =null;

        SparqlT.whereClause_return whereClause61 =null;

        SparqlT.solutionModifier_return solutionModifier62 =null;


        CommonTree DESCRIBE57_tree=null;
        CommonTree ASTERISK59_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:82:5: ( ^( DESCRIBE ( varOrIRIref )* ( ASTERISK )* ( datasetClause )* ( whereClause )? solutionModifier ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:82:7: ^( DESCRIBE ( varOrIRIref )* ( ASTERISK )* ( datasetClause )* ( whereClause )? solutionModifier )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DESCRIBE57=(CommonTree)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeQuery409); 
            DESCRIBE57_tree = (CommonTree)adaptor.dupNode(DESCRIBE57);


            root_1 = (CommonTree)adaptor.becomeRoot(DESCRIBE57_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:82:18: ( varOrIRIref )*
                loop24:
                do {
                    int alt24=2;
                    switch ( input.LA(1) ) {
                    case IRI_REF:
                    case PNAME_LN:
                    case PNAME_NS:
                    case VAR1:
                    case VAR2:
                        {
                        alt24=1;
                        }
                        break;

                    }

                    switch (alt24) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:82:18: varOrIRIref
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_varOrIRIref_in_describeQuery411);
                	    varOrIRIref58=varOrIRIref();

                	    state._fsp--;

                	    adaptor.addChild(root_1, varOrIRIref58.getTree());


                	    }
                	    break;

                	default :
                	    break loop24;
                    }
                } while (true);


                // com\\googlecode\\sparkleg\\SparqlT.g:82:31: ( ASTERISK )*
                loop25:
                do {
                    int alt25=2;
                    switch ( input.LA(1) ) {
                    case ASTERISK:
                        {
                        alt25=1;
                        }
                        break;

                    }

                    switch (alt25) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:82:31: ASTERISK
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    ASTERISK59=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_describeQuery414); 
                	    ASTERISK59_tree = (CommonTree)adaptor.dupNode(ASTERISK59);


                	    adaptor.addChild(root_1, ASTERISK59_tree);


                	    }
                	    break;

                	default :
                	    break loop25;
                    }
                } while (true);


                // com\\googlecode\\sparkleg\\SparqlT.g:82:41: ( datasetClause )*
                loop26:
                do {
                    int alt26=2;
                    switch ( input.LA(1) ) {
                    case FROM:
                        {
                        alt26=1;
                        }
                        break;

                    }

                    switch (alt26) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:82:41: datasetClause
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_datasetClause_in_describeQuery417);
                	    datasetClause60=datasetClause();

                	    state._fsp--;

                	    adaptor.addChild(root_1, datasetClause60.getTree());


                	    }
                	    break;

                	default :
                	    break loop26;
                    }
                } while (true);


                // com\\googlecode\\sparkleg\\SparqlT.g:82:56: ( whereClause )?
                int alt27=2;
                switch ( input.LA(1) ) {
                    case WHERE_CLAUSE:
                        {
                        alt27=1;
                        }
                        break;
                }

                switch (alt27) {
                    case 1 :
                        // com\\googlecode\\sparkleg\\SparqlT.g:82:56: whereClause
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_whereClause_in_describeQuery420);
                        whereClause61=whereClause();

                        state._fsp--;

                        adaptor.addChild(root_1, whereClause61.getTree());


                        }
                        break;

                }


                _last = (CommonTree)input.LT(1);
                pushFollow(FOLLOW_solutionModifier_in_describeQuery423);
                solutionModifier62=solutionModifier();

                state._fsp--;

                adaptor.addChild(root_1, solutionModifier62.getTree());


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "describeQuery"


    public static class askQuery_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "askQuery"
    // com\\googlecode\\sparkleg\\SparqlT.g:85:1: askQuery : ^( ASK ( datasetClause )* whereClause ) ;
    public final SparqlT.askQuery_return askQuery() throws RecognitionException {
        SparqlT.askQuery_return retval = new SparqlT.askQuery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASK63=null;
        SparqlT.datasetClause_return datasetClause64 =null;

        SparqlT.whereClause_return whereClause65 =null;


        CommonTree ASK63_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:86:5: ( ^( ASK ( datasetClause )* whereClause ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:86:7: ^( ASK ( datasetClause )* whereClause )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ASK63=(CommonTree)match(input,ASK,FOLLOW_ASK_in_askQuery442); 
            ASK63_tree = (CommonTree)adaptor.dupNode(ASK63);


            root_1 = (CommonTree)adaptor.becomeRoot(ASK63_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:86:13: ( datasetClause )*
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case FROM:
                    {
                    alt28=1;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:86:13: datasetClause
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_datasetClause_in_askQuery444);
            	    datasetClause64=datasetClause();

            	    state._fsp--;

            	    adaptor.addChild(root_1, datasetClause64.getTree());


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_whereClause_in_askQuery447);
            whereClause65=whereClause();

            state._fsp--;

            adaptor.addChild(root_1, whereClause65.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "askQuery"


    public static class datasetClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "datasetClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:89:1: datasetClause : ^( FROM ( NAMED )? iriRef ) ;
    public final SparqlT.datasetClause_return datasetClause() throws RecognitionException {
        SparqlT.datasetClause_return retval = new SparqlT.datasetClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FROM66=null;
        CommonTree NAMED67=null;
        SparqlT.iriRef_return iriRef68 =null;


        CommonTree FROM66_tree=null;
        CommonTree NAMED67_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:90:5: ( ^( FROM ( NAMED )? iriRef ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:90:7: ^( FROM ( NAMED )? iriRef )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FROM66=(CommonTree)match(input,FROM,FOLLOW_FROM_in_datasetClause466); 
            FROM66_tree = (CommonTree)adaptor.dupNode(FROM66);


            root_1 = (CommonTree)adaptor.becomeRoot(FROM66_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:90:14: ( NAMED )?
            int alt29=2;
            switch ( input.LA(1) ) {
                case NAMED:
                    {
                    alt29=1;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:90:14: NAMED
                    {
                    _last = (CommonTree)input.LT(1);
                    NAMED67=(CommonTree)match(input,NAMED,FOLLOW_NAMED_in_datasetClause468); 
                    NAMED67_tree = (CommonTree)adaptor.dupNode(NAMED67);


                    adaptor.addChild(root_1, NAMED67_tree);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_iriRef_in_datasetClause471);
            iriRef68=iriRef();

            state._fsp--;

            adaptor.addChild(root_1, iriRef68.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "datasetClause"


    public static class whereClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whereClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:93:1: whereClause : ^( WHERE_CLAUSE ( groupGraphPattern )? ) ;
    public final SparqlT.whereClause_return whereClause() throws RecognitionException {
        SparqlT.whereClause_return retval = new SparqlT.whereClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WHERE_CLAUSE69=null;
        SparqlT.groupGraphPattern_return groupGraphPattern70 =null;


        CommonTree WHERE_CLAUSE69_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:94:5: ( ^( WHERE_CLAUSE ( groupGraphPattern )? ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:94:7: ^( WHERE_CLAUSE ( groupGraphPattern )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WHERE_CLAUSE69=(CommonTree)match(input,WHERE_CLAUSE,FOLLOW_WHERE_CLAUSE_in_whereClause490); 
            WHERE_CLAUSE69_tree = (CommonTree)adaptor.dupNode(WHERE_CLAUSE69);


            root_1 = (CommonTree)adaptor.becomeRoot(WHERE_CLAUSE69_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:94:22: ( groupGraphPattern )?
                int alt30=2;
                switch ( input.LA(1) ) {
                    case GROUP_GRAPH_PATTERN:
                        {
                        alt30=1;
                        }
                        break;
                }

                switch (alt30) {
                    case 1 :
                        // com\\googlecode\\sparkleg\\SparqlT.g:94:22: groupGraphPattern
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_groupGraphPattern_in_whereClause492);
                        groupGraphPattern70=groupGraphPattern();

                        state._fsp--;

                        adaptor.addChild(root_1, groupGraphPattern70.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whereClause"


    public static class solutionModifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "solutionModifier"
    // com\\googlecode\\sparkleg\\SparqlT.g:97:1: solutionModifier : ( groupClause )? ( havingClause )? ( orderClause )? ( limitOffsetClauses )? ;
    public final SparqlT.solutionModifier_return solutionModifier() throws RecognitionException {
        SparqlT.solutionModifier_return retval = new SparqlT.solutionModifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.groupClause_return groupClause71 =null;

        SparqlT.havingClause_return havingClause72 =null;

        SparqlT.orderClause_return orderClause73 =null;

        SparqlT.limitOffsetClauses_return limitOffsetClauses74 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:98:5: ( ( groupClause )? ( havingClause )? ( orderClause )? ( limitOffsetClauses )? )
            // com\\googlecode\\sparkleg\\SparqlT.g:98:7: ( groupClause )? ( havingClause )? ( orderClause )? ( limitOffsetClauses )?
            {
            root_0 = (CommonTree)adaptor.nil();


            // com\\googlecode\\sparkleg\\SparqlT.g:98:7: ( groupClause )?
            int alt31=2;
            switch ( input.LA(1) ) {
                case GROUP_BY:
                    {
                    alt31=1;
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:98:7: groupClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupClause_in_solutionModifier515);
                    groupClause71=groupClause();

                    state._fsp--;

                    adaptor.addChild(root_0, groupClause71.getTree());


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\SparqlT.g:98:20: ( havingClause )?
            int alt32=2;
            switch ( input.LA(1) ) {
                case HAVING:
                    {
                    alt32=1;
                    }
                    break;
            }

            switch (alt32) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:98:20: havingClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_havingClause_in_solutionModifier518);
                    havingClause72=havingClause();

                    state._fsp--;

                    adaptor.addChild(root_0, havingClause72.getTree());


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\SparqlT.g:98:34: ( orderClause )?
            int alt33=2;
            switch ( input.LA(1) ) {
                case ORDER_BY:
                    {
                    alt33=1;
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:98:34: orderClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderClause_in_solutionModifier521);
                    orderClause73=orderClause();

                    state._fsp--;

                    adaptor.addChild(root_0, orderClause73.getTree());


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\SparqlT.g:98:47: ( limitOffsetClauses )?
            int alt34=2;
            switch ( input.LA(1) ) {
                case LIMIT:
                case OFFSET:
                    {
                    alt34=1;
                    }
                    break;
            }

            switch (alt34) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:98:47: limitOffsetClauses
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_limitOffsetClauses_in_solutionModifier524);
                    limitOffsetClauses74=limitOffsetClauses();

                    state._fsp--;

                    adaptor.addChild(root_0, limitOffsetClauses74.getTree());


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "solutionModifier"


    public static class groupClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:101:1: groupClause : ^( GROUP_BY ( groupCondition )+ ) ;
    public final SparqlT.groupClause_return groupClause() throws RecognitionException {
        SparqlT.groupClause_return retval = new SparqlT.groupClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GROUP_BY75=null;
        SparqlT.groupCondition_return groupCondition76 =null;


        CommonTree GROUP_BY75_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:102:5: ( ^( GROUP_BY ( groupCondition )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:102:7: ^( GROUP_BY ( groupCondition )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            GROUP_BY75=(CommonTree)match(input,GROUP_BY,FOLLOW_GROUP_BY_in_groupClause543); 
            GROUP_BY75_tree = (CommonTree)adaptor.dupNode(GROUP_BY75);


            root_1 = (CommonTree)adaptor.becomeRoot(GROUP_BY75_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:102:18: ( groupCondition )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                switch ( input.LA(1) ) {
                case GROUP_CONDITION:
                    {
                    alt35=1;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:102:18: groupCondition
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_groupCondition_in_groupClause545);
            	    groupCondition76=groupCondition();

            	    state._fsp--;

            	    adaptor.addChild(root_1, groupCondition76.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupClause"


    public static class groupCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupCondition"
    // com\\googlecode\\sparkleg\\SparqlT.g:105:1: groupCondition : ( ^( GROUP_CONDITION builtInCall ) | ^( GROUP_CONDITION functionCall ) | ^( GROUP_CONDITION expression ^( AS ( var )? ) ) | ^( GROUP_CONDITION var ) );
    public final SparqlT.groupCondition_return groupCondition() throws RecognitionException {
        SparqlT.groupCondition_return retval = new SparqlT.groupCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GROUP_CONDITION77=null;
        CommonTree GROUP_CONDITION79=null;
        CommonTree GROUP_CONDITION81=null;
        CommonTree AS83=null;
        CommonTree GROUP_CONDITION85=null;
        SparqlT.builtInCall_return builtInCall78 =null;

        SparqlT.functionCall_return functionCall80 =null;

        SparqlT.expression_return expression82 =null;

        SparqlT.var_return var84 =null;

        SparqlT.var_return var86 =null;


        CommonTree GROUP_CONDITION77_tree=null;
        CommonTree GROUP_CONDITION79_tree=null;
        CommonTree GROUP_CONDITION81_tree=null;
        CommonTree AS83_tree=null;
        CommonTree GROUP_CONDITION85_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:106:5: ( ^( GROUP_CONDITION builtInCall ) | ^( GROUP_CONDITION functionCall ) | ^( GROUP_CONDITION expression ^( AS ( var )? ) ) | ^( GROUP_CONDITION var ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case GROUP_CONDITION:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
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
                    case NOT_EXISTS:
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
                        alt37=1;
                        }
                        break;
                    case FUNCTION:
                        {
                        alt37=2;
                        }
                        break;
                    case AND:
                    case ASTERISK:
                    case DECIMAL_NEGATIVE:
                    case DECIMAL_POSITIVE:
                    case DIVIDE:
                    case DOUBLE_NEGATIVE:
                    case DOUBLE_POSITIVE:
                    case EQUAL:
                    case GREATER:
                    case GREATER_EQUAL:
                    case IN:
                    case INTEGER_NEGATIVE:
                    case INTEGER_POSITIVE:
                    case LESS:
                    case LESS_EQUAL:
                    case MINUS:
                    case NOT:
                    case NOT_EQUAL:
                    case OR:
                    case PLUS:
                    case UNARY:
                        {
                        alt37=3;
                        }
                        break;
                    case VAR1:
                    case VAR2:
                        {
                        alt37=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:106:7: ^( GROUP_CONDITION builtInCall )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GROUP_CONDITION77=(CommonTree)match(input,GROUP_CONDITION,FOLLOW_GROUP_CONDITION_in_groupCondition572); 
                    GROUP_CONDITION77_tree = (CommonTree)adaptor.dupNode(GROUP_CONDITION77);


                    root_1 = (CommonTree)adaptor.becomeRoot(GROUP_CONDITION77_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_builtInCall_in_groupCondition574);
                    builtInCall78=builtInCall();

                    state._fsp--;

                    adaptor.addChild(root_1, builtInCall78.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:107:7: ^( GROUP_CONDITION functionCall )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GROUP_CONDITION79=(CommonTree)match(input,GROUP_CONDITION,FOLLOW_GROUP_CONDITION_in_groupCondition584); 
                    GROUP_CONDITION79_tree = (CommonTree)adaptor.dupNode(GROUP_CONDITION79);


                    root_1 = (CommonTree)adaptor.becomeRoot(GROUP_CONDITION79_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_functionCall_in_groupCondition586);
                    functionCall80=functionCall();

                    state._fsp--;

                    adaptor.addChild(root_1, functionCall80.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:108:7: ^( GROUP_CONDITION expression ^( AS ( var )? ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GROUP_CONDITION81=(CommonTree)match(input,GROUP_CONDITION,FOLLOW_GROUP_CONDITION_in_groupCondition596); 
                    GROUP_CONDITION81_tree = (CommonTree)adaptor.dupNode(GROUP_CONDITION81);


                    root_1 = (CommonTree)adaptor.becomeRoot(GROUP_CONDITION81_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_groupCondition598);
                    expression82=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression82.getTree());


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AS83=(CommonTree)match(input,AS,FOLLOW_AS_in_groupCondition601); 
                    AS83_tree = (CommonTree)adaptor.dupNode(AS83);


                    root_2 = (CommonTree)adaptor.becomeRoot(AS83_tree, root_2);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:108:41: ( var )?
                        int alt36=2;
                        switch ( input.LA(1) ) {
                            case VAR1:
                            case VAR2:
                                {
                                alt36=1;
                                }
                                break;
                        }

                        switch (alt36) {
                            case 1 :
                                // com\\googlecode\\sparkleg\\SparqlT.g:108:41: var
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_var_in_groupCondition603);
                                var84=var();

                                state._fsp--;

                                adaptor.addChild(root_2, var84.getTree());


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:109:7: ^( GROUP_CONDITION var )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GROUP_CONDITION85=(CommonTree)match(input,GROUP_CONDITION,FOLLOW_GROUP_CONDITION_in_groupCondition616); 
                    GROUP_CONDITION85_tree = (CommonTree)adaptor.dupNode(GROUP_CONDITION85);


                    root_1 = (CommonTree)adaptor.becomeRoot(GROUP_CONDITION85_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_groupCondition618);
                    var86=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var86.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupCondition"


    public static class havingClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havingClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:112:1: havingClause : ^( HAVING ( constraint )+ ) ;
    public final SparqlT.havingClause_return havingClause() throws RecognitionException {
        SparqlT.havingClause_return retval = new SparqlT.havingClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree HAVING87=null;
        SparqlT.constraint_return constraint88 =null;


        CommonTree HAVING87_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:113:5: ( ^( HAVING ( constraint )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:113:7: ^( HAVING ( constraint )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            HAVING87=(CommonTree)match(input,HAVING,FOLLOW_HAVING_in_havingClause637); 
            HAVING87_tree = (CommonTree)adaptor.dupNode(HAVING87);


            root_1 = (CommonTree)adaptor.becomeRoot(HAVING87_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:113:16: ( constraint )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                switch ( input.LA(1) ) {
                case ABS:
                case AND:
                case ASTERISK:
                case BNODE:
                case BOUND:
                case CEIL:
                case COALESCE:
                case CONCAT:
                case CONTAINS:
                case DATATYPE:
                case DAY:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DIVIDE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case ENCODE_FOR_URI:
                case EQUAL:
                case EXISTS:
                case FLOOR:
                case FUNCTION:
                case GREATER:
                case GREATER_EQUAL:
                case HOURS:
                case IF:
                case IN:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI:
                case ISBLANK:
                case ISIRI:
                case ISLITERAL:
                case ISNUMERIC:
                case ISURI:
                case LANG:
                case LANGMATCHES:
                case LCASE:
                case LESS:
                case LESS_EQUAL:
                case MD5:
                case MINUS:
                case MINUTES:
                case MONTH:
                case NOT:
                case NOT_EQUAL:
                case NOT_EXISTS:
                case NOW:
                case OR:
                case PLUS:
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
                case UNARY:
                case URI:
                case YEAR:
                    {
                    alt38=1;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:113:16: constraint
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_constraint_in_havingClause639);
            	    constraint88=constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_1, constraint88.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "havingClause"


    public static class orderClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:116:1: orderClause : ^( ORDER_BY ( orderCondition )+ ) ;
    public final SparqlT.orderClause_return orderClause() throws RecognitionException {
        SparqlT.orderClause_return retval = new SparqlT.orderClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ORDER_BY89=null;
        SparqlT.orderCondition_return orderCondition90 =null;


        CommonTree ORDER_BY89_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:117:5: ( ^( ORDER_BY ( orderCondition )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:117:7: ^( ORDER_BY ( orderCondition )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ORDER_BY89=(CommonTree)match(input,ORDER_BY,FOLLOW_ORDER_BY_in_orderClause664); 
            ORDER_BY89_tree = (CommonTree)adaptor.dupNode(ORDER_BY89);


            root_1 = (CommonTree)adaptor.becomeRoot(ORDER_BY89_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:117:18: ( orderCondition )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                switch ( input.LA(1) ) {
                case ORDER_CONDITION:
                    {
                    alt39=1;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:117:18: orderCondition
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_orderCondition_in_orderClause666);
            	    orderCondition90=orderCondition();

            	    state._fsp--;

            	    adaptor.addChild(root_1, orderCondition90.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orderClause"


    public static class orderCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderCondition"
    // com\\googlecode\\sparkleg\\SparqlT.g:120:1: orderCondition : ( ^( ORDER_CONDITION ASC expression ) | ^( ORDER_CONDITION DESC expression ) | ^( ORDER_CONDITION constraint ) | ^( ORDER_CONDITION var ) );
    public final SparqlT.orderCondition_return orderCondition() throws RecognitionException {
        SparqlT.orderCondition_return retval = new SparqlT.orderCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ORDER_CONDITION91=null;
        CommonTree ASC92=null;
        CommonTree ORDER_CONDITION94=null;
        CommonTree DESC95=null;
        CommonTree ORDER_CONDITION97=null;
        CommonTree ORDER_CONDITION99=null;
        SparqlT.expression_return expression93 =null;

        SparqlT.expression_return expression96 =null;

        SparqlT.constraint_return constraint98 =null;

        SparqlT.var_return var100 =null;


        CommonTree ORDER_CONDITION91_tree=null;
        CommonTree ASC92_tree=null;
        CommonTree ORDER_CONDITION94_tree=null;
        CommonTree DESC95_tree=null;
        CommonTree ORDER_CONDITION97_tree=null;
        CommonTree ORDER_CONDITION99_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:121:5: ( ^( ORDER_CONDITION ASC expression ) | ^( ORDER_CONDITION DESC expression ) | ^( ORDER_CONDITION constraint ) | ^( ORDER_CONDITION var ) )
            int alt40=4;
            switch ( input.LA(1) ) {
            case ORDER_CONDITION:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case ASC:
                        {
                        alt40=1;
                        }
                        break;
                    case DESC:
                        {
                        alt40=2;
                        }
                        break;
                    case ABS:
                    case AND:
                    case ASTERISK:
                    case BNODE:
                    case BOUND:
                    case CEIL:
                    case COALESCE:
                    case CONCAT:
                    case CONTAINS:
                    case DATATYPE:
                    case DAY:
                    case DECIMAL_NEGATIVE:
                    case DECIMAL_POSITIVE:
                    case DIVIDE:
                    case DOUBLE_NEGATIVE:
                    case DOUBLE_POSITIVE:
                    case ENCODE_FOR_URI:
                    case EQUAL:
                    case EXISTS:
                    case FLOOR:
                    case FUNCTION:
                    case GREATER:
                    case GREATER_EQUAL:
                    case HOURS:
                    case IF:
                    case IN:
                    case INTEGER_NEGATIVE:
                    case INTEGER_POSITIVE:
                    case IRI:
                    case ISBLANK:
                    case ISIRI:
                    case ISLITERAL:
                    case ISNUMERIC:
                    case ISURI:
                    case LANG:
                    case LANGMATCHES:
                    case LCASE:
                    case LESS:
                    case LESS_EQUAL:
                    case MD5:
                    case MINUS:
                    case MINUTES:
                    case MONTH:
                    case NOT:
                    case NOT_EQUAL:
                    case NOT_EXISTS:
                    case NOW:
                    case OR:
                    case PLUS:
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
                    case UNARY:
                    case URI:
                    case YEAR:
                        {
                        alt40=3;
                        }
                        break;
                    case VAR1:
                    case VAR2:
                        {
                        alt40=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:121:7: ^( ORDER_CONDITION ASC expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ORDER_CONDITION91=(CommonTree)match(input,ORDER_CONDITION,FOLLOW_ORDER_CONDITION_in_orderCondition686); 
                    ORDER_CONDITION91_tree = (CommonTree)adaptor.dupNode(ORDER_CONDITION91);


                    root_1 = (CommonTree)adaptor.becomeRoot(ORDER_CONDITION91_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ASC92=(CommonTree)match(input,ASC,FOLLOW_ASC_in_orderCondition688); 
                    ASC92_tree = (CommonTree)adaptor.dupNode(ASC92);


                    adaptor.addChild(root_1, ASC92_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_orderCondition690);
                    expression93=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression93.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:122:7: ^( ORDER_CONDITION DESC expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ORDER_CONDITION94=(CommonTree)match(input,ORDER_CONDITION,FOLLOW_ORDER_CONDITION_in_orderCondition700); 
                    ORDER_CONDITION94_tree = (CommonTree)adaptor.dupNode(ORDER_CONDITION94);


                    root_1 = (CommonTree)adaptor.becomeRoot(ORDER_CONDITION94_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    DESC95=(CommonTree)match(input,DESC,FOLLOW_DESC_in_orderCondition702); 
                    DESC95_tree = (CommonTree)adaptor.dupNode(DESC95);


                    adaptor.addChild(root_1, DESC95_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_orderCondition704);
                    expression96=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression96.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:123:7: ^( ORDER_CONDITION constraint )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ORDER_CONDITION97=(CommonTree)match(input,ORDER_CONDITION,FOLLOW_ORDER_CONDITION_in_orderCondition714); 
                    ORDER_CONDITION97_tree = (CommonTree)adaptor.dupNode(ORDER_CONDITION97);


                    root_1 = (CommonTree)adaptor.becomeRoot(ORDER_CONDITION97_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_constraint_in_orderCondition716);
                    constraint98=constraint();

                    state._fsp--;

                    adaptor.addChild(root_1, constraint98.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:124:7: ^( ORDER_CONDITION var )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ORDER_CONDITION99=(CommonTree)match(input,ORDER_CONDITION,FOLLOW_ORDER_CONDITION_in_orderCondition726); 
                    ORDER_CONDITION99_tree = (CommonTree)adaptor.dupNode(ORDER_CONDITION99);


                    root_1 = (CommonTree)adaptor.becomeRoot(ORDER_CONDITION99_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_orderCondition728);
                    var100=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var100.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orderCondition"


    public static class limitOffsetClauses_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "limitOffsetClauses"
    // com\\googlecode\\sparkleg\\SparqlT.g:127:1: limitOffsetClauses : ( ^( LIMIT INTEGER ) ( ^( OFFSET INTEGER ) )* | ^( OFFSET INTEGER ) ( ^( LIMIT INTEGER ) )* );
    public final SparqlT.limitOffsetClauses_return limitOffsetClauses() throws RecognitionException {
        SparqlT.limitOffsetClauses_return retval = new SparqlT.limitOffsetClauses_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LIMIT101=null;
        CommonTree INTEGER102=null;
        CommonTree OFFSET103=null;
        CommonTree INTEGER104=null;
        CommonTree OFFSET105=null;
        CommonTree INTEGER106=null;
        CommonTree LIMIT107=null;
        CommonTree INTEGER108=null;

        CommonTree LIMIT101_tree=null;
        CommonTree INTEGER102_tree=null;
        CommonTree OFFSET103_tree=null;
        CommonTree INTEGER104_tree=null;
        CommonTree OFFSET105_tree=null;
        CommonTree INTEGER106_tree=null;
        CommonTree LIMIT107_tree=null;
        CommonTree INTEGER108_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:128:5: ( ^( LIMIT INTEGER ) ( ^( OFFSET INTEGER ) )* | ^( OFFSET INTEGER ) ( ^( LIMIT INTEGER ) )* )
            int alt43=2;
            switch ( input.LA(1) ) {
            case LIMIT:
                {
                alt43=1;
                }
                break;
            case OFFSET:
                {
                alt43=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:128:7: ^( LIMIT INTEGER ) ( ^( OFFSET INTEGER ) )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LIMIT101=(CommonTree)match(input,LIMIT,FOLLOW_LIMIT_in_limitOffsetClauses752); 
                    LIMIT101_tree = (CommonTree)adaptor.dupNode(LIMIT101);


                    root_1 = (CommonTree)adaptor.becomeRoot(LIMIT101_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    INTEGER102=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitOffsetClauses754); 
                    INTEGER102_tree = (CommonTree)adaptor.dupNode(INTEGER102);


                    adaptor.addChild(root_1, INTEGER102_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // com\\googlecode\\sparkleg\\SparqlT.g:128:24: ( ^( OFFSET INTEGER ) )*
                    loop41:
                    do {
                        int alt41=2;
                        switch ( input.LA(1) ) {
                        case OFFSET:
                            {
                            alt41=1;
                            }
                            break;

                        }

                        switch (alt41) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:128:25: ^( OFFSET INTEGER )
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    {
                    	    CommonTree _save_last_1 = _last;
                    	    CommonTree _first_1 = null;
                    	    CommonTree root_1 = (CommonTree)adaptor.nil();
                    	    _last = (CommonTree)input.LT(1);
                    	    OFFSET103=(CommonTree)match(input,OFFSET,FOLLOW_OFFSET_in_limitOffsetClauses759); 
                    	    OFFSET103_tree = (CommonTree)adaptor.dupNode(OFFSET103);


                    	    root_1 = (CommonTree)adaptor.becomeRoot(OFFSET103_tree, root_1);


                    	    match(input, Token.DOWN, null); 
                    	    _last = (CommonTree)input.LT(1);
                    	    INTEGER104=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitOffsetClauses761); 
                    	    INTEGER104_tree = (CommonTree)adaptor.dupNode(INTEGER104);


                    	    adaptor.addChild(root_1, INTEGER104_tree);


                    	    match(input, Token.UP, null); 
                    	    adaptor.addChild(root_0, root_1);
                    	    _last = _save_last_1;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:129:7: ^( OFFSET INTEGER ) ( ^( LIMIT INTEGER ) )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    OFFSET105=(CommonTree)match(input,OFFSET,FOLLOW_OFFSET_in_limitOffsetClauses773); 
                    OFFSET105_tree = (CommonTree)adaptor.dupNode(OFFSET105);


                    root_1 = (CommonTree)adaptor.becomeRoot(OFFSET105_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    INTEGER106=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitOffsetClauses775); 
                    INTEGER106_tree = (CommonTree)adaptor.dupNode(INTEGER106);


                    adaptor.addChild(root_1, INTEGER106_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // com\\googlecode\\sparkleg\\SparqlT.g:129:25: ( ^( LIMIT INTEGER ) )*
                    loop42:
                    do {
                        int alt42=2;
                        switch ( input.LA(1) ) {
                        case LIMIT:
                            {
                            alt42=1;
                            }
                            break;

                        }

                        switch (alt42) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:129:26: ^( LIMIT INTEGER )
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    {
                    	    CommonTree _save_last_1 = _last;
                    	    CommonTree _first_1 = null;
                    	    CommonTree root_1 = (CommonTree)adaptor.nil();
                    	    _last = (CommonTree)input.LT(1);
                    	    LIMIT107=(CommonTree)match(input,LIMIT,FOLLOW_LIMIT_in_limitOffsetClauses780); 
                    	    LIMIT107_tree = (CommonTree)adaptor.dupNode(LIMIT107);


                    	    root_1 = (CommonTree)adaptor.becomeRoot(LIMIT107_tree, root_1);


                    	    match(input, Token.DOWN, null); 
                    	    _last = (CommonTree)input.LT(1);
                    	    INTEGER108=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitOffsetClauses782); 
                    	    INTEGER108_tree = (CommonTree)adaptor.dupNode(INTEGER108);


                    	    adaptor.addChild(root_1, INTEGER108_tree);


                    	    match(input, Token.UP, null); 
                    	    adaptor.addChild(root_0, root_1);
                    	    _last = _save_last_1;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "limitOffsetClauses"


    public static class bindingsClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bindingsClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:133:1: bindingsClause : ^( BINDINGS ( var )* ( bindingValueList )* ) ;
    public final SparqlT.bindingsClause_return bindingsClause() throws RecognitionException {
        SparqlT.bindingsClause_return retval = new SparqlT.bindingsClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BINDINGS109=null;
        SparqlT.var_return var110 =null;

        SparqlT.bindingValueList_return bindingValueList111 =null;


        CommonTree BINDINGS109_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:134:5: ( ^( BINDINGS ( var )* ( bindingValueList )* ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:134:7: ^( BINDINGS ( var )* ( bindingValueList )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            BINDINGS109=(CommonTree)match(input,BINDINGS,FOLLOW_BINDINGS_in_bindingsClause804); 
            BINDINGS109_tree = (CommonTree)adaptor.dupNode(BINDINGS109);


            root_1 = (CommonTree)adaptor.becomeRoot(BINDINGS109_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:134:18: ( var )*
                loop44:
                do {
                    int alt44=2;
                    switch ( input.LA(1) ) {
                    case VAR1:
                    case VAR2:
                        {
                        alt44=1;
                        }
                        break;

                    }

                    switch (alt44) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:134:18: var
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_var_in_bindingsClause806);
                	    var110=var();

                	    state._fsp--;

                	    adaptor.addChild(root_1, var110.getTree());


                	    }
                	    break;

                	default :
                	    break loop44;
                    }
                } while (true);


                // com\\googlecode\\sparkleg\\SparqlT.g:134:23: ( bindingValueList )*
                loop45:
                do {
                    int alt45=2;
                    switch ( input.LA(1) ) {
                    case BINDING_VALUE:
                        {
                        alt45=1;
                        }
                        break;

                    }

                    switch (alt45) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:134:23: bindingValueList
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_bindingValueList_in_bindingsClause809);
                	    bindingValueList111=bindingValueList();

                	    state._fsp--;

                	    adaptor.addChild(root_1, bindingValueList111.getTree());


                	    }
                	    break;

                	default :
                	    break loop45;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bindingsClause"


    public static class bindingValueList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bindingValueList"
    // com\\googlecode\\sparkleg\\SparqlT.g:137:1: bindingValueList : ^( BINDING_VALUE ( bindingValue )* ) ;
    public final SparqlT.bindingValueList_return bindingValueList() throws RecognitionException {
        SparqlT.bindingValueList_return retval = new SparqlT.bindingValueList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BINDING_VALUE112=null;
        SparqlT.bindingValue_return bindingValue113 =null;


        CommonTree BINDING_VALUE112_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:138:5: ( ^( BINDING_VALUE ( bindingValue )* ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:138:7: ^( BINDING_VALUE ( bindingValue )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            BINDING_VALUE112=(CommonTree)match(input,BINDING_VALUE,FOLLOW_BINDING_VALUE_in_bindingValueList833); 
            BINDING_VALUE112_tree = (CommonTree)adaptor.dupNode(BINDING_VALUE112);


            root_1 = (CommonTree)adaptor.becomeRoot(BINDING_VALUE112_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:138:23: ( bindingValue )*
                loop46:
                do {
                    int alt46=2;
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
                        alt46=1;
                        }
                        break;

                    }

                    switch (alt46) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:138:23: bindingValue
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_bindingValue_in_bindingValueList835);
                	    bindingValue113=bindingValue();

                	    state._fsp--;

                	    adaptor.addChild(root_1, bindingValue113.getTree());


                	    }
                	    break;

                	default :
                	    break loop46;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bindingValueList"


    public static class bindingValue_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bindingValue"
    // com\\googlecode\\sparkleg\\SparqlT.g:141:1: bindingValue : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF );
    public final SparqlT.bindingValue_return bindingValue() throws RecognitionException {
        SparqlT.bindingValue_return retval = new SparqlT.bindingValue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNDEF118=null;
        SparqlT.iriRef_return iriRef114 =null;

        SparqlT.rdfLiteral_return rdfLiteral115 =null;

        SparqlT.numericLiteral_return numericLiteral116 =null;

        SparqlT.booleanLiteral_return booleanLiteral117 =null;


        CommonTree UNDEF118_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:142:5: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF )
            int alt47=5;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt47=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt47=2;
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
                alt47=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt47=4;
                }
                break;
            case UNDEF:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:142:7: iriRef
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_bindingValue859);
                    iriRef114=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef114.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:142:16: rdfLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_rdfLiteral_in_bindingValue863);
                    rdfLiteral115=rdfLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, rdfLiteral115.getTree());


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:142:29: numericLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteral_in_bindingValue867);
                    numericLiteral116=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral116.getTree());


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:142:46: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_booleanLiteral_in_bindingValue871);
                    booleanLiteral117=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral117.getTree());


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:142:63: UNDEF
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    UNDEF118=(CommonTree)match(input,UNDEF,FOLLOW_UNDEF_in_bindingValue875); 
                    UNDEF118_tree = (CommonTree)adaptor.dupNode(UNDEF118);


                    adaptor.addChild(root_0, UNDEF118_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bindingValue"


    public static class update_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update"
    // com\\googlecode\\sparkleg\\SparqlT.g:145:1: update : prologue ( load )* ( clear )* ( drop )* ( add )* ( move )* ( copy )* ( create )* ( insert )* ( delete )* ( modify )* ;
    public final SparqlT.update_return update() throws RecognitionException {
        SparqlT.update_return retval = new SparqlT.update_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.prologue_return prologue119 =null;

        SparqlT.load_return load120 =null;

        SparqlT.clear_return clear121 =null;

        SparqlT.drop_return drop122 =null;

        SparqlT.add_return add123 =null;

        SparqlT.move_return move124 =null;

        SparqlT.copy_return copy125 =null;

        SparqlT.create_return create126 =null;

        SparqlT.insert_return insert127 =null;

        SparqlT.delete_return delete128 =null;

        SparqlT.modify_return modify129 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:146:5: ( prologue ( load )* ( clear )* ( drop )* ( add )* ( move )* ( copy )* ( create )* ( insert )* ( delete )* ( modify )* )
            // com\\googlecode\\sparkleg\\SparqlT.g:146:7: prologue ( load )* ( clear )* ( drop )* ( add )* ( move )* ( copy )* ( create )* ( insert )* ( delete )* ( modify )*
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_prologue_in_update896);
            prologue119=prologue();

            state._fsp--;

            adaptor.addChild(root_0, prologue119.getTree());


            // com\\googlecode\\sparkleg\\SparqlT.g:146:16: ( load )*
            loop48:
            do {
                int alt48=2;
                switch ( input.LA(1) ) {
                case LOAD:
                    {
                    alt48=1;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:16: load
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_load_in_update898);
            	    load120=load();

            	    state._fsp--;

            	    adaptor.addChild(root_0, load120.getTree());


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:146:22: ( clear )*
            loop49:
            do {
                int alt49=2;
                switch ( input.LA(1) ) {
                case CLEAR:
                    {
                    alt49=1;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:22: clear
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_clear_in_update901);
            	    clear121=clear();

            	    state._fsp--;

            	    adaptor.addChild(root_0, clear121.getTree());


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:146:29: ( drop )*
            loop50:
            do {
                int alt50=2;
                switch ( input.LA(1) ) {
                case DROP:
                    {
                    alt50=1;
                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:29: drop
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_drop_in_update904);
            	    drop122=drop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, drop122.getTree());


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:146:35: ( add )*
            loop51:
            do {
                int alt51=2;
                switch ( input.LA(1) ) {
                case ADD:
                    {
                    alt51=1;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:35: add
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_add_in_update907);
            	    add123=add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add123.getTree());


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:146:40: ( move )*
            loop52:
            do {
                int alt52=2;
                switch ( input.LA(1) ) {
                case MOVE:
                    {
                    alt52=1;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:40: move
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_move_in_update910);
            	    move124=move();

            	    state._fsp--;

            	    adaptor.addChild(root_0, move124.getTree());


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:146:46: ( copy )*
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case COPY:
                    {
                    alt53=1;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:46: copy
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_copy_in_update913);
            	    copy125=copy();

            	    state._fsp--;

            	    adaptor.addChild(root_0, copy125.getTree());


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:146:52: ( create )*
            loop54:
            do {
                int alt54=2;
                switch ( input.LA(1) ) {
                case CREATE:
                    {
                    alt54=1;
                    }
                    break;

                }

                switch (alt54) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:52: create
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_create_in_update916);
            	    create126=create();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create126.getTree());


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:146:60: ( insert )*
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case INSERT:
                    {
                    alt55=1;
                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:60: insert
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_insert_in_update919);
            	    insert127=insert();

            	    state._fsp--;

            	    adaptor.addChild(root_0, insert127.getTree());


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:146:68: ( delete )*
            loop56:
            do {
                int alt56=2;
                switch ( input.LA(1) ) {
                case DELETE:
                    {
                    alt56=1;
                    }
                    break;

                }

                switch (alt56) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:68: delete
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_delete_in_update922);
            	    delete128=delete();

            	    state._fsp--;

            	    adaptor.addChild(root_0, delete128.getTree());


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:146:76: ( modify )*
            loop57:
            do {
                int alt57=2;
                switch ( input.LA(1) ) {
                case MODIFY:
                    {
                    alt57=1;
                    }
                    break;

                }

                switch (alt57) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:76: modify
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_modify_in_update925);
            	    modify129=modify();

            	    state._fsp--;

            	    adaptor.addChild(root_0, modify129.getTree());


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update"


    public static class load_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "load"
    // com\\googlecode\\sparkleg\\SparqlT.g:149:1: load : ^( LOAD ( SILENT )* iriRef ( graphRef )? ) ;
    public final SparqlT.load_return load() throws RecognitionException {
        SparqlT.load_return retval = new SparqlT.load_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LOAD130=null;
        CommonTree SILENT131=null;
        SparqlT.iriRef_return iriRef132 =null;

        SparqlT.graphRef_return graphRef133 =null;


        CommonTree LOAD130_tree=null;
        CommonTree SILENT131_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:150:5: ( ^( LOAD ( SILENT )* iriRef ( graphRef )? ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:150:7: ^( LOAD ( SILENT )* iriRef ( graphRef )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            LOAD130=(CommonTree)match(input,LOAD,FOLLOW_LOAD_in_load955); 
            LOAD130_tree = (CommonTree)adaptor.dupNode(LOAD130);


            root_1 = (CommonTree)adaptor.becomeRoot(LOAD130_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:150:14: ( SILENT )*
            loop58:
            do {
                int alt58=2;
                switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt58=1;
                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:150:14: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT131=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_load957); 
            	    SILENT131_tree = (CommonTree)adaptor.dupNode(SILENT131);


            	    adaptor.addChild(root_1, SILENT131_tree);


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_iriRef_in_load960);
            iriRef132=iriRef();

            state._fsp--;

            adaptor.addChild(root_1, iriRef132.getTree());


            // com\\googlecode\\sparkleg\\SparqlT.g:150:29: ( graphRef )?
            int alt59=2;
            switch ( input.LA(1) ) {
                case GRAPH:
                    {
                    alt59=1;
                    }
                    break;
            }

            switch (alt59) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:150:29: graphRef
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_graphRef_in_load962);
                    graphRef133=graphRef();

                    state._fsp--;

                    adaptor.addChild(root_1, graphRef133.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "load"


    public static class clear_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "clear"
    // com\\googlecode\\sparkleg\\SparqlT.g:153:1: clear : ^( CLEAR ( SILENT )* graphRefAll ) ;
    public final SparqlT.clear_return clear() throws RecognitionException {
        SparqlT.clear_return retval = new SparqlT.clear_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLEAR134=null;
        CommonTree SILENT135=null;
        SparqlT.graphRefAll_return graphRefAll136 =null;


        CommonTree CLEAR134_tree=null;
        CommonTree SILENT135_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:154:5: ( ^( CLEAR ( SILENT )* graphRefAll ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:154:7: ^( CLEAR ( SILENT )* graphRefAll )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CLEAR134=(CommonTree)match(input,CLEAR,FOLLOW_CLEAR_in_clear986); 
            CLEAR134_tree = (CommonTree)adaptor.dupNode(CLEAR134);


            root_1 = (CommonTree)adaptor.becomeRoot(CLEAR134_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:154:15: ( SILENT )*
            loop60:
            do {
                int alt60=2;
                switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt60=1;
                    }
                    break;

                }

                switch (alt60) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:154:15: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT135=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_clear988); 
            	    SILENT135_tree = (CommonTree)adaptor.dupNode(SILENT135);


            	    adaptor.addChild(root_1, SILENT135_tree);


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphRefAll_in_clear991);
            graphRefAll136=graphRefAll();

            state._fsp--;

            adaptor.addChild(root_1, graphRefAll136.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "clear"


    public static class drop_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop"
    // com\\googlecode\\sparkleg\\SparqlT.g:157:1: drop : ^( DROP ( SILENT )* graphRefAll ) ;
    public final SparqlT.drop_return drop() throws RecognitionException {
        SparqlT.drop_return retval = new SparqlT.drop_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DROP137=null;
        CommonTree SILENT138=null;
        SparqlT.graphRefAll_return graphRefAll139 =null;


        CommonTree DROP137_tree=null;
        CommonTree SILENT138_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:158:5: ( ^( DROP ( SILENT )* graphRefAll ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:158:7: ^( DROP ( SILENT )* graphRefAll )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DROP137=(CommonTree)match(input,DROP,FOLLOW_DROP_in_drop1014); 
            DROP137_tree = (CommonTree)adaptor.dupNode(DROP137);


            root_1 = (CommonTree)adaptor.becomeRoot(DROP137_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:158:14: ( SILENT )*
            loop61:
            do {
                int alt61=2;
                switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt61=1;
                    }
                    break;

                }

                switch (alt61) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:158:14: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT138=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_drop1016); 
            	    SILENT138_tree = (CommonTree)adaptor.dupNode(SILENT138);


            	    adaptor.addChild(root_1, SILENT138_tree);


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphRefAll_in_drop1019);
            graphRefAll139=graphRefAll();

            state._fsp--;

            adaptor.addChild(root_1, graphRefAll139.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop"


    public static class create_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create"
    // com\\googlecode\\sparkleg\\SparqlT.g:161:1: create : ^( CREATE ( SILENT )* graphRef ) ;
    public final SparqlT.create_return create() throws RecognitionException {
        SparqlT.create_return retval = new SparqlT.create_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CREATE140=null;
        CommonTree SILENT141=null;
        SparqlT.graphRef_return graphRef142 =null;


        CommonTree CREATE140_tree=null;
        CommonTree SILENT141_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:162:5: ( ^( CREATE ( SILENT )* graphRef ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:162:7: ^( CREATE ( SILENT )* graphRef )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CREATE140=(CommonTree)match(input,CREATE,FOLLOW_CREATE_in_create1039); 
            CREATE140_tree = (CommonTree)adaptor.dupNode(CREATE140);


            root_1 = (CommonTree)adaptor.becomeRoot(CREATE140_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:162:16: ( SILENT )*
            loop62:
            do {
                int alt62=2;
                switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt62=1;
                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:162:16: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT141=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_create1041); 
            	    SILENT141_tree = (CommonTree)adaptor.dupNode(SILENT141);


            	    adaptor.addChild(root_1, SILENT141_tree);


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphRef_in_create1044);
            graphRef142=graphRef();

            state._fsp--;

            adaptor.addChild(root_1, graphRef142.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create"


    public static class add_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // com\\googlecode\\sparkleg\\SparqlT.g:165:1: add : ^( ADD ( SILENT )* graphOrDefault graphOrDefault ) ;
    public final SparqlT.add_return add() throws RecognitionException {
        SparqlT.add_return retval = new SparqlT.add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ADD143=null;
        CommonTree SILENT144=null;
        SparqlT.graphOrDefault_return graphOrDefault145 =null;

        SparqlT.graphOrDefault_return graphOrDefault146 =null;


        CommonTree ADD143_tree=null;
        CommonTree SILENT144_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:166:5: ( ^( ADD ( SILENT )* graphOrDefault graphOrDefault ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:166:7: ^( ADD ( SILENT )* graphOrDefault graphOrDefault )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ADD143=(CommonTree)match(input,ADD,FOLLOW_ADD_in_add1067); 
            ADD143_tree = (CommonTree)adaptor.dupNode(ADD143);


            root_1 = (CommonTree)adaptor.becomeRoot(ADD143_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:166:13: ( SILENT )*
            loop63:
            do {
                int alt63=2;
                switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt63=1;
                    }
                    break;

                }

                switch (alt63) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:166:13: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT144=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_add1069); 
            	    SILENT144_tree = (CommonTree)adaptor.dupNode(SILENT144);


            	    adaptor.addChild(root_1, SILENT144_tree);


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphOrDefault_in_add1072);
            graphOrDefault145=graphOrDefault();

            state._fsp--;

            adaptor.addChild(root_1, graphOrDefault145.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphOrDefault_in_add1074);
            graphOrDefault146=graphOrDefault();

            state._fsp--;

            adaptor.addChild(root_1, graphOrDefault146.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add"


    public static class move_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // com\\googlecode\\sparkleg\\SparqlT.g:169:1: move : ^( MOVE ( SILENT )* graphOrDefault graphOrDefault ) ;
    public final SparqlT.move_return move() throws RecognitionException {
        SparqlT.move_return retval = new SparqlT.move_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MOVE147=null;
        CommonTree SILENT148=null;
        SparqlT.graphOrDefault_return graphOrDefault149 =null;

        SparqlT.graphOrDefault_return graphOrDefault150 =null;


        CommonTree MOVE147_tree=null;
        CommonTree SILENT148_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:170:5: ( ^( MOVE ( SILENT )* graphOrDefault graphOrDefault ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:170:7: ^( MOVE ( SILENT )* graphOrDefault graphOrDefault )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            MOVE147=(CommonTree)match(input,MOVE,FOLLOW_MOVE_in_move1097); 
            MOVE147_tree = (CommonTree)adaptor.dupNode(MOVE147);


            root_1 = (CommonTree)adaptor.becomeRoot(MOVE147_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:170:14: ( SILENT )*
            loop64:
            do {
                int alt64=2;
                switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt64=1;
                    }
                    break;

                }

                switch (alt64) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:170:14: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT148=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_move1099); 
            	    SILENT148_tree = (CommonTree)adaptor.dupNode(SILENT148);


            	    adaptor.addChild(root_1, SILENT148_tree);


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphOrDefault_in_move1102);
            graphOrDefault149=graphOrDefault();

            state._fsp--;

            adaptor.addChild(root_1, graphOrDefault149.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphOrDefault_in_move1104);
            graphOrDefault150=graphOrDefault();

            state._fsp--;

            adaptor.addChild(root_1, graphOrDefault150.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "move"


    public static class copy_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "copy"
    // com\\googlecode\\sparkleg\\SparqlT.g:173:1: copy : ^( COPY ( SILENT )* graphOrDefault graphOrDefault ) ;
    public final SparqlT.copy_return copy() throws RecognitionException {
        SparqlT.copy_return retval = new SparqlT.copy_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COPY151=null;
        CommonTree SILENT152=null;
        SparqlT.graphOrDefault_return graphOrDefault153 =null;

        SparqlT.graphOrDefault_return graphOrDefault154 =null;


        CommonTree COPY151_tree=null;
        CommonTree SILENT152_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:174:5: ( ^( COPY ( SILENT )* graphOrDefault graphOrDefault ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:174:7: ^( COPY ( SILENT )* graphOrDefault graphOrDefault )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            COPY151=(CommonTree)match(input,COPY,FOLLOW_COPY_in_copy1127); 
            COPY151_tree = (CommonTree)adaptor.dupNode(COPY151);


            root_1 = (CommonTree)adaptor.becomeRoot(COPY151_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:174:14: ( SILENT )*
            loop65:
            do {
                int alt65=2;
                switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt65=1;
                    }
                    break;

                }

                switch (alt65) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:174:14: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT152=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_copy1129); 
            	    SILENT152_tree = (CommonTree)adaptor.dupNode(SILENT152);


            	    adaptor.addChild(root_1, SILENT152_tree);


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphOrDefault_in_copy1132);
            graphOrDefault153=graphOrDefault();

            state._fsp--;

            adaptor.addChild(root_1, graphOrDefault153.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphOrDefault_in_copy1134);
            graphOrDefault154=graphOrDefault();

            state._fsp--;

            adaptor.addChild(root_1, graphOrDefault154.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "copy"


    public static class insert_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insert"
    // com\\googlecode\\sparkleg\\SparqlT.g:177:1: insert : ^( INSERT DATA quadPattern ) ;
    public final SparqlT.insert_return insert() throws RecognitionException {
        SparqlT.insert_return retval = new SparqlT.insert_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT155=null;
        CommonTree DATA156=null;
        SparqlT.quadPattern_return quadPattern157 =null;


        CommonTree INSERT155_tree=null;
        CommonTree DATA156_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:178:5: ( ^( INSERT DATA quadPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:178:7: ^( INSERT DATA quadPattern )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INSERT155=(CommonTree)match(input,INSERT,FOLLOW_INSERT_in_insert1153); 
            INSERT155_tree = (CommonTree)adaptor.dupNode(INSERT155);


            root_1 = (CommonTree)adaptor.becomeRoot(INSERT155_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            DATA156=(CommonTree)match(input,DATA,FOLLOW_DATA_in_insert1155); 
            DATA156_tree = (CommonTree)adaptor.dupNode(DATA156);


            adaptor.addChild(root_1, DATA156_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_quadPattern_in_insert1157);
            quadPattern157=quadPattern();

            state._fsp--;

            adaptor.addChild(root_1, quadPattern157.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "insert"


    public static class delete_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete"
    // com\\googlecode\\sparkleg\\SparqlT.g:181:1: delete : DELETE ( deleteData | deleteWhere ) ;
    public final SparqlT.delete_return delete() throws RecognitionException {
        SparqlT.delete_return retval = new SparqlT.delete_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE158=null;
        SparqlT.deleteData_return deleteData159 =null;

        SparqlT.deleteWhere_return deleteWhere160 =null;


        CommonTree DELETE158_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:182:5: ( DELETE ( deleteData | deleteWhere ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:182:7: DELETE ( deleteData | deleteWhere )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            DELETE158=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_delete1182); 
            DELETE158_tree = (CommonTree)adaptor.dupNode(DELETE158);


            adaptor.addChild(root_0, DELETE158_tree);


            // com\\googlecode\\sparkleg\\SparqlT.g:182:14: ( deleteData | deleteWhere )
            int alt66=2;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case DATA:
                        {
                        alt66=1;
                        }
                        break;
                    case WHERE:
                        {
                        alt66=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }

            switch (alt66) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:182:15: deleteData
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_deleteData_in_delete1185);
                    deleteData159=deleteData();

                    state._fsp--;

                    adaptor.addChild(root_0, deleteData159.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:182:28: deleteWhere
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_deleteWhere_in_delete1189);
                    deleteWhere160=deleteWhere();

                    state._fsp--;

                    adaptor.addChild(root_0, deleteWhere160.getTree());


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "delete"


    public static class deleteData_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "deleteData"
    // com\\googlecode\\sparkleg\\SparqlT.g:185:1: deleteData : ^( DELETE DATA quadPattern ) ;
    public final SparqlT.deleteData_return deleteData() throws RecognitionException {
        SparqlT.deleteData_return retval = new SparqlT.deleteData_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE161=null;
        CommonTree DATA162=null;
        SparqlT.quadPattern_return quadPattern163 =null;


        CommonTree DELETE161_tree=null;
        CommonTree DATA162_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:186:5: ( ^( DELETE DATA quadPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:186:7: ^( DELETE DATA quadPattern )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DELETE161=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_deleteData1208); 
            DELETE161_tree = (CommonTree)adaptor.dupNode(DELETE161);


            root_1 = (CommonTree)adaptor.becomeRoot(DELETE161_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            DATA162=(CommonTree)match(input,DATA,FOLLOW_DATA_in_deleteData1210); 
            DATA162_tree = (CommonTree)adaptor.dupNode(DATA162);


            adaptor.addChild(root_1, DATA162_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_quadPattern_in_deleteData1212);
            quadPattern163=quadPattern();

            state._fsp--;

            adaptor.addChild(root_1, quadPattern163.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "deleteData"


    public static class deleteWhere_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "deleteWhere"
    // com\\googlecode\\sparkleg\\SparqlT.g:189:1: deleteWhere : ^( DELETE WHERE quadPattern ) ;
    public final SparqlT.deleteWhere_return deleteWhere() throws RecognitionException {
        SparqlT.deleteWhere_return retval = new SparqlT.deleteWhere_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE164=null;
        CommonTree WHERE165=null;
        SparqlT.quadPattern_return quadPattern166 =null;


        CommonTree DELETE164_tree=null;
        CommonTree WHERE165_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:190:5: ( ^( DELETE WHERE quadPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:190:7: ^( DELETE WHERE quadPattern )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DELETE164=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_deleteWhere1231); 
            DELETE164_tree = (CommonTree)adaptor.dupNode(DELETE164);


            root_1 = (CommonTree)adaptor.becomeRoot(DELETE164_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            WHERE165=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_deleteWhere1233); 
            WHERE165_tree = (CommonTree)adaptor.dupNode(WHERE165);


            adaptor.addChild(root_1, WHERE165_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_quadPattern_in_deleteWhere1235);
            quadPattern166=quadPattern();

            state._fsp--;

            adaptor.addChild(root_1, quadPattern166.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "deleteWhere"


    public static class modify_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modify"
    // com\\googlecode\\sparkleg\\SparqlT.g:193:1: modify : ( ^( MODIFY ^( WITH iriRef ) ( deleteClause )* ( insertClause )* ( usingClause )* whereClause ) | ^( MODIFY ( deleteClause )* ( insertClause )* ( usingClause )* whereClause ) );
    public final SparqlT.modify_return modify() throws RecognitionException {
        SparqlT.modify_return retval = new SparqlT.modify_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MODIFY167=null;
        CommonTree WITH168=null;
        CommonTree MODIFY174=null;
        SparqlT.iriRef_return iriRef169 =null;

        SparqlT.deleteClause_return deleteClause170 =null;

        SparqlT.insertClause_return insertClause171 =null;

        SparqlT.usingClause_return usingClause172 =null;

        SparqlT.whereClause_return whereClause173 =null;

        SparqlT.deleteClause_return deleteClause175 =null;

        SparqlT.insertClause_return insertClause176 =null;

        SparqlT.usingClause_return usingClause177 =null;

        SparqlT.whereClause_return whereClause178 =null;


        CommonTree MODIFY167_tree=null;
        CommonTree WITH168_tree=null;
        CommonTree MODIFY174_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:194:5: ( ^( MODIFY ^( WITH iriRef ) ( deleteClause )* ( insertClause )* ( usingClause )* whereClause ) | ^( MODIFY ( deleteClause )* ( insertClause )* ( usingClause )* whereClause ) )
            int alt73=2;
            switch ( input.LA(1) ) {
            case MODIFY:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case WITH:
                        {
                        alt73=1;
                        }
                        break;
                    case DELETE:
                    case INSERT:
                    case USING:
                    case WHERE_CLAUSE:
                        {
                        alt73=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }

            switch (alt73) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:194:7: ^( MODIFY ^( WITH iriRef ) ( deleteClause )* ( insertClause )* ( usingClause )* whereClause )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MODIFY167=(CommonTree)match(input,MODIFY,FOLLOW_MODIFY_in_modify1258); 
                    MODIFY167_tree = (CommonTree)adaptor.dupNode(MODIFY167);


                    root_1 = (CommonTree)adaptor.becomeRoot(MODIFY167_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    WITH168=(CommonTree)match(input,WITH,FOLLOW_WITH_in_modify1261); 
                    WITH168_tree = (CommonTree)adaptor.dupNode(WITH168);


                    root_2 = (CommonTree)adaptor.becomeRoot(WITH168_tree, root_2);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_modify1263);
                    iriRef169=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_2, iriRef169.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    // com\\googlecode\\sparkleg\\SparqlT.g:194:31: ( deleteClause )*
                    loop67:
                    do {
                        int alt67=2;
                        switch ( input.LA(1) ) {
                        case DELETE:
                            {
                            alt67=1;
                            }
                            break;

                        }

                        switch (alt67) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:194:31: deleteClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_deleteClause_in_modify1266);
                    	    deleteClause170=deleteClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, deleteClause170.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    // com\\googlecode\\sparkleg\\SparqlT.g:194:45: ( insertClause )*
                    loop68:
                    do {
                        int alt68=2;
                        switch ( input.LA(1) ) {
                        case INSERT:
                            {
                            alt68=1;
                            }
                            break;

                        }

                        switch (alt68) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:194:45: insertClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_insertClause_in_modify1269);
                    	    insertClause171=insertClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, insertClause171.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    // com\\googlecode\\sparkleg\\SparqlT.g:194:59: ( usingClause )*
                    loop69:
                    do {
                        int alt69=2;
                        switch ( input.LA(1) ) {
                        case USING:
                            {
                            alt69=1;
                            }
                            break;

                        }

                        switch (alt69) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:194:59: usingClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_usingClause_in_modify1272);
                    	    usingClause172=usingClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, usingClause172.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_modify1275);
                    whereClause173=whereClause();

                    state._fsp--;

                    adaptor.addChild(root_1, whereClause173.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:195:7: ^( MODIFY ( deleteClause )* ( insertClause )* ( usingClause )* whereClause )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MODIFY174=(CommonTree)match(input,MODIFY,FOLLOW_MODIFY_in_modify1285); 
                    MODIFY174_tree = (CommonTree)adaptor.dupNode(MODIFY174);


                    root_1 = (CommonTree)adaptor.becomeRoot(MODIFY174_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:195:16: ( deleteClause )*
                    loop70:
                    do {
                        int alt70=2;
                        switch ( input.LA(1) ) {
                        case DELETE:
                            {
                            alt70=1;
                            }
                            break;

                        }

                        switch (alt70) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:195:16: deleteClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_deleteClause_in_modify1287);
                    	    deleteClause175=deleteClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, deleteClause175.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    // com\\googlecode\\sparkleg\\SparqlT.g:195:30: ( insertClause )*
                    loop71:
                    do {
                        int alt71=2;
                        switch ( input.LA(1) ) {
                        case INSERT:
                            {
                            alt71=1;
                            }
                            break;

                        }

                        switch (alt71) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:195:30: insertClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_insertClause_in_modify1290);
                    	    insertClause176=insertClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, insertClause176.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    // com\\googlecode\\sparkleg\\SparqlT.g:195:44: ( usingClause )*
                    loop72:
                    do {
                        int alt72=2;
                        switch ( input.LA(1) ) {
                        case USING:
                            {
                            alt72=1;
                            }
                            break;

                        }

                        switch (alt72) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:195:44: usingClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_usingClause_in_modify1293);
                    	    usingClause177=usingClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, usingClause177.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_modify1296);
                    whereClause178=whereClause();

                    state._fsp--;

                    adaptor.addChild(root_1, whereClause178.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modify"


    public static class deleteClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "deleteClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:198:1: deleteClause : DELETE quadPattern ;
    public final SparqlT.deleteClause_return deleteClause() throws RecognitionException {
        SparqlT.deleteClause_return retval = new SparqlT.deleteClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE179=null;
        SparqlT.quadPattern_return quadPattern180 =null;


        CommonTree DELETE179_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:199:5: ( DELETE quadPattern )
            // com\\googlecode\\sparkleg\\SparqlT.g:199:7: DELETE quadPattern
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            DELETE179=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_deleteClause1316); 
            DELETE179_tree = (CommonTree)adaptor.dupNode(DELETE179);


            adaptor.addChild(root_0, DELETE179_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_quadPattern_in_deleteClause1318);
            quadPattern180=quadPattern();

            state._fsp--;

            adaptor.addChild(root_0, quadPattern180.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "deleteClause"


    public static class insertClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insertClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:202:1: insertClause : INSERT quadPattern ;
    public final SparqlT.insertClause_return insertClause() throws RecognitionException {
        SparqlT.insertClause_return retval = new SparqlT.insertClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT181=null;
        SparqlT.quadPattern_return quadPattern182 =null;


        CommonTree INSERT181_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:203:5: ( INSERT quadPattern )
            // com\\googlecode\\sparkleg\\SparqlT.g:203:7: INSERT quadPattern
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            INSERT181=(CommonTree)match(input,INSERT,FOLLOW_INSERT_in_insertClause1341); 
            INSERT181_tree = (CommonTree)adaptor.dupNode(INSERT181);


            adaptor.addChild(root_0, INSERT181_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_quadPattern_in_insertClause1343);
            quadPattern182=quadPattern();

            state._fsp--;

            adaptor.addChild(root_0, quadPattern182.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "insertClause"


    public static class usingClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "usingClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:206:1: usingClause : ^( USING ( NAMED )? iriRef ) ;
    public final SparqlT.usingClause_return usingClause() throws RecognitionException {
        SparqlT.usingClause_return retval = new SparqlT.usingClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree USING183=null;
        CommonTree NAMED184=null;
        SparqlT.iriRef_return iriRef185 =null;


        CommonTree USING183_tree=null;
        CommonTree NAMED184_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:207:5: ( ^( USING ( NAMED )? iriRef ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:207:7: ^( USING ( NAMED )? iriRef )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            USING183=(CommonTree)match(input,USING,FOLLOW_USING_in_usingClause1361); 
            USING183_tree = (CommonTree)adaptor.dupNode(USING183);


            root_1 = (CommonTree)adaptor.becomeRoot(USING183_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:207:15: ( NAMED )?
            int alt74=2;
            switch ( input.LA(1) ) {
                case NAMED:
                    {
                    alt74=1;
                    }
                    break;
            }

            switch (alt74) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:207:15: NAMED
                    {
                    _last = (CommonTree)input.LT(1);
                    NAMED184=(CommonTree)match(input,NAMED,FOLLOW_NAMED_in_usingClause1363); 
                    NAMED184_tree = (CommonTree)adaptor.dupNode(NAMED184);


                    adaptor.addChild(root_1, NAMED184_tree);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_iriRef_in_usingClause1366);
            iriRef185=iriRef();

            state._fsp--;

            adaptor.addChild(root_1, iriRef185.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "usingClause"


    public static class graphOrDefault_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphOrDefault"
    // com\\googlecode\\sparkleg\\SparqlT.g:210:1: graphOrDefault : ( DEFAULT | ( GRAPH )? iriRef );
    public final SparqlT.graphOrDefault_return graphOrDefault() throws RecognitionException {
        SparqlT.graphOrDefault_return retval = new SparqlT.graphOrDefault_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFAULT186=null;
        CommonTree GRAPH187=null;
        SparqlT.iriRef_return iriRef188 =null;


        CommonTree DEFAULT186_tree=null;
        CommonTree GRAPH187_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:211:5: ( DEFAULT | ( GRAPH )? iriRef )
            int alt76=2;
            switch ( input.LA(1) ) {
            case DEFAULT:
                {
                alt76=1;
                }
                break;
            case GRAPH:
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt76=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }

            switch (alt76) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:211:7: DEFAULT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    DEFAULT186=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_graphOrDefault1387); 
                    DEFAULT186_tree = (CommonTree)adaptor.dupNode(DEFAULT186);


                    adaptor.addChild(root_0, DEFAULT186_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:212:7: ( GRAPH )? iriRef
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com\\googlecode\\sparkleg\\SparqlT.g:212:7: ( GRAPH )?
                    int alt75=2;
                    switch ( input.LA(1) ) {
                        case GRAPH:
                            {
                            alt75=1;
                            }
                            break;
                    }

                    switch (alt75) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:212:7: GRAPH
                            {
                            _last = (CommonTree)input.LT(1);
                            GRAPH187=(CommonTree)match(input,GRAPH,FOLLOW_GRAPH_in_graphOrDefault1396); 
                            GRAPH187_tree = (CommonTree)adaptor.dupNode(GRAPH187);


                            adaptor.addChild(root_0, GRAPH187_tree);


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_graphOrDefault1399);
                    iriRef188=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef188.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphOrDefault"


    public static class graphRef_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphRef"
    // com\\googlecode\\sparkleg\\SparqlT.g:215:1: graphRef : GRAPH iriRef ;
    public final SparqlT.graphRef_return graphRef() throws RecognitionException {
        SparqlT.graphRef_return retval = new SparqlT.graphRef_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GRAPH189=null;
        SparqlT.iriRef_return iriRef190 =null;


        CommonTree GRAPH189_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:216:5: ( GRAPH iriRef )
            // com\\googlecode\\sparkleg\\SparqlT.g:216:7: GRAPH iriRef
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            GRAPH189=(CommonTree)match(input,GRAPH,FOLLOW_GRAPH_in_graphRef1426); 
            GRAPH189_tree = (CommonTree)adaptor.dupNode(GRAPH189);


            adaptor.addChild(root_0, GRAPH189_tree);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_iriRef_in_graphRef1428);
            iriRef190=iriRef();

            state._fsp--;

            adaptor.addChild(root_0, iriRef190.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphRef"


    public static class graphRefAll_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphRefAll"
    // com\\googlecode\\sparkleg\\SparqlT.g:219:1: graphRefAll : ( graphRef | DEFAULT | NAMED | ALL );
    public final SparqlT.graphRefAll_return graphRefAll() throws RecognitionException {
        SparqlT.graphRefAll_return retval = new SparqlT.graphRefAll_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFAULT192=null;
        CommonTree NAMED193=null;
        CommonTree ALL194=null;
        SparqlT.graphRef_return graphRef191 =null;


        CommonTree DEFAULT192_tree=null;
        CommonTree NAMED193_tree=null;
        CommonTree ALL194_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:220:5: ( graphRef | DEFAULT | NAMED | ALL )
            int alt77=4;
            switch ( input.LA(1) ) {
            case GRAPH:
                {
                alt77=1;
                }
                break;
            case DEFAULT:
                {
                alt77=2;
                }
                break;
            case NAMED:
                {
                alt77=3;
                }
                break;
            case ALL:
                {
                alt77=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }

            switch (alt77) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:220:7: graphRef
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_graphRef_in_graphRefAll1445);
                    graphRef191=graphRef();

                    state._fsp--;

                    adaptor.addChild(root_0, graphRef191.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:220:18: DEFAULT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    DEFAULT192=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_graphRefAll1449); 
                    DEFAULT192_tree = (CommonTree)adaptor.dupNode(DEFAULT192);


                    adaptor.addChild(root_0, DEFAULT192_tree);


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:220:28: NAMED
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    NAMED193=(CommonTree)match(input,NAMED,FOLLOW_NAMED_in_graphRefAll1453); 
                    NAMED193_tree = (CommonTree)adaptor.dupNode(NAMED193);


                    adaptor.addChild(root_0, NAMED193_tree);


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:220:36: ALL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    ALL194=(CommonTree)match(input,ALL,FOLLOW_ALL_in_graphRefAll1457); 
                    ALL194_tree = (CommonTree)adaptor.dupNode(ALL194);


                    adaptor.addChild(root_0, ALL194_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphRefAll"


    public static class quadPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "quadPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:223:1: quadPattern : quads ;
    public final SparqlT.quadPattern_return quadPattern() throws RecognitionException {
        SparqlT.quadPattern_return retval = new SparqlT.quadPattern_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.quads_return quads195 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:224:5: ( quads )
            // com\\googlecode\\sparkleg\\SparqlT.g:224:7: quads
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_quads_in_quadPattern1474);
            quads195=quads();

            state._fsp--;

            adaptor.addChild(root_0, quads195.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "quadPattern"


    public static class quads_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "quads"
    // com\\googlecode\\sparkleg\\SparqlT.g:227:1: quads : ( triplesTemplate )? ( quadsNotTriples ( triplesTemplate )? )* ;
    public final SparqlT.quads_return quads() throws RecognitionException {
        SparqlT.quads_return retval = new SparqlT.quads_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.triplesTemplate_return triplesTemplate196 =null;

        SparqlT.quadsNotTriples_return quadsNotTriples197 =null;

        SparqlT.triplesTemplate_return triplesTemplate198 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:228:5: ( ( triplesTemplate )? ( quadsNotTriples ( triplesTemplate )? )* )
            // com\\googlecode\\sparkleg\\SparqlT.g:228:7: ( triplesTemplate )? ( quadsNotTriples ( triplesTemplate )? )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // com\\googlecode\\sparkleg\\SparqlT.g:228:7: ( triplesTemplate )?
            int alt78=2;
            switch ( input.LA(1) ) {
                case TRIPLES_TEMPLATE:
                    {
                    alt78=1;
                    }
                    break;
            }

            switch (alt78) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:228:7: triplesTemplate
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesTemplate_in_quads1495);
                    triplesTemplate196=triplesTemplate();

                    state._fsp--;

                    adaptor.addChild(root_0, triplesTemplate196.getTree());


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\SparqlT.g:228:24: ( quadsNotTriples ( triplesTemplate )? )*
            loop80:
            do {
                int alt80=2;
                switch ( input.LA(1) ) {
                case GRAPH:
                    {
                    alt80=1;
                    }
                    break;

                }

                switch (alt80) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:228:25: quadsNotTriples ( triplesTemplate )?
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_quadsNotTriples_in_quads1499);
            	    quadsNotTriples197=quadsNotTriples();

            	    state._fsp--;

            	    adaptor.addChild(root_0, quadsNotTriples197.getTree());


            	    // com\\googlecode\\sparkleg\\SparqlT.g:228:41: ( triplesTemplate )?
            	    int alt79=2;
            	    switch ( input.LA(1) ) {
            	        case TRIPLES_TEMPLATE:
            	            {
            	            alt79=1;
            	            }
            	            break;
            	    }

            	    switch (alt79) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\SparqlT.g:228:41: triplesTemplate
            	            {
            	            _last = (CommonTree)input.LT(1);
            	            pushFollow(FOLLOW_triplesTemplate_in_quads1501);
            	            triplesTemplate198=triplesTemplate();

            	            state._fsp--;

            	            adaptor.addChild(root_0, triplesTemplate198.getTree());


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "quads"


    public static class quadsNotTriples_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "quadsNotTriples"
    // com\\googlecode\\sparkleg\\SparqlT.g:231:1: quadsNotTriples : ^( GRAPH varOrIRIref ( triplesTemplate )? ) ;
    public final SparqlT.quadsNotTriples_return quadsNotTriples() throws RecognitionException {
        SparqlT.quadsNotTriples_return retval = new SparqlT.quadsNotTriples_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GRAPH199=null;
        SparqlT.varOrIRIref_return varOrIRIref200 =null;

        SparqlT.triplesTemplate_return triplesTemplate201 =null;


        CommonTree GRAPH199_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:232:5: ( ^( GRAPH varOrIRIref ( triplesTemplate )? ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:232:7: ^( GRAPH varOrIRIref ( triplesTemplate )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            GRAPH199=(CommonTree)match(input,GRAPH,FOLLOW_GRAPH_in_quadsNotTriples1526); 
            GRAPH199_tree = (CommonTree)adaptor.dupNode(GRAPH199);


            root_1 = (CommonTree)adaptor.becomeRoot(GRAPH199_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_varOrIRIref_in_quadsNotTriples1528);
            varOrIRIref200=varOrIRIref();

            state._fsp--;

            adaptor.addChild(root_1, varOrIRIref200.getTree());


            // com\\googlecode\\sparkleg\\SparqlT.g:232:27: ( triplesTemplate )?
            int alt81=2;
            switch ( input.LA(1) ) {
                case TRIPLES_TEMPLATE:
                    {
                    alt81=1;
                    }
                    break;
            }

            switch (alt81) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:232:27: triplesTemplate
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesTemplate_in_quadsNotTriples1530);
                    triplesTemplate201=triplesTemplate();

                    state._fsp--;

                    adaptor.addChild(root_1, triplesTemplate201.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "quadsNotTriples"


    public static class triplesTemplate_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triplesTemplate"
    // com\\googlecode\\sparkleg\\SparqlT.g:235:1: triplesTemplate : ^( TRIPLES_TEMPLATE ( triplesSameSubject )* ) ;
    public final SparqlT.triplesTemplate_return triplesTemplate() throws RecognitionException {
        SparqlT.triplesTemplate_return retval = new SparqlT.triplesTemplate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TRIPLES_TEMPLATE202=null;
        SparqlT.triplesSameSubject_return triplesSameSubject203 =null;


        CommonTree TRIPLES_TEMPLATE202_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:236:5: ( ^( TRIPLES_TEMPLATE ( triplesSameSubject )* ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:236:7: ^( TRIPLES_TEMPLATE ( triplesSameSubject )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TRIPLES_TEMPLATE202=(CommonTree)match(input,TRIPLES_TEMPLATE,FOLLOW_TRIPLES_TEMPLATE_in_triplesTemplate1554); 
            TRIPLES_TEMPLATE202_tree = (CommonTree)adaptor.dupNode(TRIPLES_TEMPLATE202);


            root_1 = (CommonTree)adaptor.becomeRoot(TRIPLES_TEMPLATE202_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:236:26: ( triplesSameSubject )*
                loop82:
                do {
                    int alt82=2;
                    switch ( input.LA(1) ) {
                    case TRIPLES_SAME_SUBJECT:
                        {
                        alt82=1;
                        }
                        break;

                    }

                    switch (alt82) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:236:26: triplesSameSubject
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_triplesSameSubject_in_triplesTemplate1556);
                	    triplesSameSubject203=triplesSameSubject();

                	    state._fsp--;

                	    adaptor.addChild(root_1, triplesSameSubject203.getTree());


                	    }
                	    break;

                	default :
                	    break loop82;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triplesTemplate"


    public static class groupGraphPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:239:1: groupGraphPattern : ( ^( GROUP_GRAPH_PATTERN groupGraphPatternSub ) | ^( GROUP_GRAPH_PATTERN subSelect ) | ^( GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN ) );
    public final SparqlT.groupGraphPattern_return groupGraphPattern() throws RecognitionException {
        SparqlT.groupGraphPattern_return retval = new SparqlT.groupGraphPattern_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GROUP_GRAPH_PATTERN204=null;
        CommonTree GROUP_GRAPH_PATTERN206=null;
        CommonTree GROUP_GRAPH_PATTERN208=null;
        CommonTree GROUP_GRAPH_PATTERN209=null;
        SparqlT.groupGraphPatternSub_return groupGraphPatternSub205 =null;

        SparqlT.subSelect_return subSelect207 =null;


        CommonTree GROUP_GRAPH_PATTERN204_tree=null;
        CommonTree GROUP_GRAPH_PATTERN206_tree=null;
        CommonTree GROUP_GRAPH_PATTERN208_tree=null;
        CommonTree GROUP_GRAPH_PATTERN209_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:240:5: ( ^( GROUP_GRAPH_PATTERN groupGraphPatternSub ) | ^( GROUP_GRAPH_PATTERN subSelect ) | ^( GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN ) )
            int alt83=3;
            switch ( input.LA(1) ) {
            case GROUP_GRAPH_PATTERN:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case GROUP_GRAPH_PATTERN:
                        {
                        switch ( input.LA(4) ) {
                        case UP:
                            {
                            alt83=3;
                            }
                            break;
                        case DOWN:
                            {
                            alt83=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 83, 3, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BIND:
                    case FILTER:
                    case GRAPH:
                    case MINUS_KEYWORD:
                    case OPTIONAL:
                    case SERVICE:
                    case TRIPLES_SAME_SUBJECT:
                    case UNION:
                        {
                        alt83=1;
                        }
                        break;
                    case SUBSELECT:
                        {
                        alt83=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;

            }

            switch (alt83) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:240:7: ^( GROUP_GRAPH_PATTERN groupGraphPatternSub )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GROUP_GRAPH_PATTERN204=(CommonTree)match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1576); 
                    GROUP_GRAPH_PATTERN204_tree = (CommonTree)adaptor.dupNode(GROUP_GRAPH_PATTERN204);


                    root_1 = (CommonTree)adaptor.becomeRoot(GROUP_GRAPH_PATTERN204_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupGraphPatternSub_in_groupGraphPattern1578);
                    groupGraphPatternSub205=groupGraphPatternSub();

                    state._fsp--;

                    adaptor.addChild(root_1, groupGraphPatternSub205.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:241:7: ^( GROUP_GRAPH_PATTERN subSelect )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GROUP_GRAPH_PATTERN206=(CommonTree)match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1588); 
                    GROUP_GRAPH_PATTERN206_tree = (CommonTree)adaptor.dupNode(GROUP_GRAPH_PATTERN206);


                    root_1 = (CommonTree)adaptor.becomeRoot(GROUP_GRAPH_PATTERN206_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subSelect_in_groupGraphPattern1590);
                    subSelect207=subSelect();

                    state._fsp--;

                    adaptor.addChild(root_1, subSelect207.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:242:7: ^( GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GROUP_GRAPH_PATTERN208=(CommonTree)match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1600); 
                    GROUP_GRAPH_PATTERN208_tree = (CommonTree)adaptor.dupNode(GROUP_GRAPH_PATTERN208);


                    root_1 = (CommonTree)adaptor.becomeRoot(GROUP_GRAPH_PATTERN208_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    GROUP_GRAPH_PATTERN209=(CommonTree)match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1602); 
                    GROUP_GRAPH_PATTERN209_tree = (CommonTree)adaptor.dupNode(GROUP_GRAPH_PATTERN209);


                    adaptor.addChild(root_1, GROUP_GRAPH_PATTERN209_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupGraphPattern"


    public static class groupGraphPatternSub_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupGraphPatternSub"
    // com\\googlecode\\sparkleg\\SparqlT.g:245:1: groupGraphPatternSub : ( triplesBlock ( groupGraphPatternSubDetail )* | ( groupGraphPatternSubDetail )+ );
    public final SparqlT.groupGraphPatternSub_return groupGraphPatternSub() throws RecognitionException {
        SparqlT.groupGraphPatternSub_return retval = new SparqlT.groupGraphPatternSub_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.triplesBlock_return triplesBlock210 =null;

        SparqlT.groupGraphPatternSubDetail_return groupGraphPatternSubDetail211 =null;

        SparqlT.groupGraphPatternSubDetail_return groupGraphPatternSubDetail212 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:246:5: ( triplesBlock ( groupGraphPatternSubDetail )* | ( groupGraphPatternSubDetail )+ )
            int alt86=2;
            switch ( input.LA(1) ) {
            case TRIPLES_SAME_SUBJECT:
                {
                alt86=1;
                }
                break;
            case BIND:
            case FILTER:
            case GRAPH:
            case GROUP_GRAPH_PATTERN:
            case MINUS_KEYWORD:
            case OPTIONAL:
            case SERVICE:
            case UNION:
                {
                alt86=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }

            switch (alt86) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:246:7: triplesBlock ( groupGraphPatternSubDetail )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSub1620);
                    triplesBlock210=triplesBlock();

                    state._fsp--;

                    adaptor.addChild(root_0, triplesBlock210.getTree());


                    // com\\googlecode\\sparkleg\\SparqlT.g:246:20: ( groupGraphPatternSubDetail )*
                    loop84:
                    do {
                        int alt84=2;
                        switch ( input.LA(1) ) {
                        case BIND:
                        case FILTER:
                        case GRAPH:
                        case GROUP_GRAPH_PATTERN:
                        case MINUS_KEYWORD:
                        case OPTIONAL:
                        case SERVICE:
                        case UNION:
                            {
                            alt84=1;
                            }
                            break;

                        }

                        switch (alt84) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:246:20: groupGraphPatternSubDetail
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_groupGraphPatternSubDetail_in_groupGraphPatternSub1622);
                    	    groupGraphPatternSubDetail211=groupGraphPatternSubDetail();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, groupGraphPatternSubDetail211.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:247:7: ( groupGraphPatternSubDetail )+
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com\\googlecode\\sparkleg\\SparqlT.g:247:7: ( groupGraphPatternSubDetail )+
                    int cnt85=0;
                    loop85:
                    do {
                        int alt85=2;
                        switch ( input.LA(1) ) {
                        case BIND:
                        case FILTER:
                        case GRAPH:
                        case GROUP_GRAPH_PATTERN:
                        case MINUS_KEYWORD:
                        case OPTIONAL:
                        case SERVICE:
                        case UNION:
                            {
                            alt85=1;
                            }
                            break;

                        }

                        switch (alt85) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:247:7: groupGraphPatternSubDetail
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_groupGraphPatternSubDetail_in_groupGraphPatternSub1631);
                    	    groupGraphPatternSubDetail212=groupGraphPatternSubDetail();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, groupGraphPatternSubDetail212.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt85 >= 1 ) break loop85;
                                EarlyExitException eee =
                                    new EarlyExitException(85, input);
                                throw eee;
                        }
                        cnt85++;
                    } while (true);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupGraphPatternSub"


    public static class groupGraphPatternSubDetail_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupGraphPatternSubDetail"
    // com\\googlecode\\sparkleg\\SparqlT.g:250:1: groupGraphPatternSubDetail : g= graphPatternNotTriples ( DOT )? (t= triplesBlock )? ;
    public final SparqlT.groupGraphPatternSubDetail_return groupGraphPatternSubDetail() throws RecognitionException {
        SparqlT.groupGraphPatternSubDetail_return retval = new SparqlT.groupGraphPatternSubDetail_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DOT213=null;
        SparqlT.graphPatternNotTriples_return g =null;

        SparqlT.triplesBlock_return t =null;


        CommonTree DOT213_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:251:5: (g= graphPatternNotTriples ( DOT )? (t= triplesBlock )? )
            // com\\googlecode\\sparkleg\\SparqlT.g:251:7: g= graphPatternNotTriples ( DOT )? (t= triplesBlock )?
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphPatternNotTriples_in_groupGraphPatternSubDetail1652);
            g=graphPatternNotTriples();

            state._fsp--;

            adaptor.addChild(root_0, g.getTree());


            // com\\googlecode\\sparkleg\\SparqlT.g:251:32: ( DOT )?
            int alt87=2;
            switch ( input.LA(1) ) {
                case DOT:
                    {
                    alt87=1;
                    }
                    break;
            }

            switch (alt87) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:251:32: DOT
                    {
                    _last = (CommonTree)input.LT(1);
                    DOT213=(CommonTree)match(input,DOT,FOLLOW_DOT_in_groupGraphPatternSubDetail1654); 
                    DOT213_tree = (CommonTree)adaptor.dupNode(DOT213);


                    adaptor.addChild(root_0, DOT213_tree);


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\SparqlT.g:251:38: (t= triplesBlock )?
            int alt88=2;
            switch ( input.LA(1) ) {
                case TRIPLES_SAME_SUBJECT:
                    {
                    alt88=1;
                    }
                    break;
            }

            switch (alt88) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:251:38: t= triplesBlock
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSubDetail1659);
                    t=triplesBlock();

                    state._fsp--;

                    adaptor.addChild(root_0, t.getTree());


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupGraphPatternSubDetail"


    public static class triplesBlock_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triplesBlock"
    // com\\googlecode\\sparkleg\\SparqlT.g:254:1: triplesBlock : ( triplesSameSubjectPath )+ ;
    public final SparqlT.triplesBlock_return triplesBlock() throws RecognitionException {
        SparqlT.triplesBlock_return retval = new SparqlT.triplesBlock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.triplesSameSubjectPath_return triplesSameSubjectPath214 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:255:5: ( ( triplesSameSubjectPath )+ )
            // com\\googlecode\\sparkleg\\SparqlT.g:255:7: ( triplesSameSubjectPath )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // com\\googlecode\\sparkleg\\SparqlT.g:255:7: ( triplesSameSubjectPath )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                switch ( input.LA(1) ) {
                case TRIPLES_SAME_SUBJECT:
                    {
                    alt89=1;
                    }
                    break;

                }

                switch (alt89) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:255:7: triplesSameSubjectPath
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_triplesSameSubjectPath_in_triplesBlock1681);
            	    triplesSameSubjectPath214=triplesSameSubjectPath();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triplesSameSubjectPath214.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triplesBlock"


    public static class graphPatternNotTriples_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphPatternNotTriples"
    // com\\googlecode\\sparkleg\\SparqlT.g:258:1: graphPatternNotTriples : ( groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter | bind );
    public final SparqlT.graphPatternNotTriples_return graphPatternNotTriples() throws RecognitionException {
        SparqlT.graphPatternNotTriples_return retval = new SparqlT.graphPatternNotTriples_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.groupOrUnionGraphPattern_return groupOrUnionGraphPattern215 =null;

        SparqlT.optionalGraphPattern_return optionalGraphPattern216 =null;

        SparqlT.minusGraphPattern_return minusGraphPattern217 =null;

        SparqlT.graphGraphPattern_return graphGraphPattern218 =null;

        SparqlT.serviceGraphPattern_return serviceGraphPattern219 =null;

        SparqlT.filter_return filter220 =null;

        SparqlT.bind_return bind221 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:259:5: ( groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter | bind )
            int alt90=7;
            switch ( input.LA(1) ) {
            case GROUP_GRAPH_PATTERN:
            case UNION:
                {
                alt90=1;
                }
                break;
            case OPTIONAL:
                {
                alt90=2;
                }
                break;
            case MINUS_KEYWORD:
                {
                alt90=3;
                }
                break;
            case GRAPH:
                {
                alt90=4;
                }
                break;
            case SERVICE:
                {
                alt90=5;
                }
                break;
            case FILTER:
                {
                alt90=6;
                }
                break;
            case BIND:
                {
                alt90=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;

            }

            switch (alt90) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:259:7: groupOrUnionGraphPattern
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples1699);
                    groupOrUnionGraphPattern215=groupOrUnionGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, groupOrUnionGraphPattern215.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:259:34: optionalGraphPattern
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_optionalGraphPattern_in_graphPatternNotTriples1703);
                    optionalGraphPattern216=optionalGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, optionalGraphPattern216.getTree());


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:259:57: minusGraphPattern
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_minusGraphPattern_in_graphPatternNotTriples1707);
                    minusGraphPattern217=minusGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, minusGraphPattern217.getTree());


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:259:77: graphGraphPattern
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_graphGraphPattern_in_graphPatternNotTriples1711);
                    graphGraphPattern218=graphGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, graphGraphPattern218.getTree());


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:259:97: serviceGraphPattern
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_serviceGraphPattern_in_graphPatternNotTriples1715);
                    serviceGraphPattern219=serviceGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, serviceGraphPattern219.getTree());


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:259:119: filter
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_filter_in_graphPatternNotTriples1719);
                    filter220=filter();

                    state._fsp--;

                    adaptor.addChild(root_0, filter220.getTree());


                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:259:128: bind
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bind_in_graphPatternNotTriples1723);
                    bind221=bind();

                    state._fsp--;

                    adaptor.addChild(root_0, bind221.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphPatternNotTriples"


    public static class optionalGraphPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optionalGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:262:1: optionalGraphPattern : ^( OPTIONAL groupGraphPattern ) ;
    public final SparqlT.optionalGraphPattern_return optionalGraphPattern() throws RecognitionException {
        SparqlT.optionalGraphPattern_return retval = new SparqlT.optionalGraphPattern_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OPTIONAL222=null;
        SparqlT.groupGraphPattern_return groupGraphPattern223 =null;


        CommonTree OPTIONAL222_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:263:5: ( ^( OPTIONAL groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:263:7: ^( OPTIONAL groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            OPTIONAL222=(CommonTree)match(input,OPTIONAL,FOLLOW_OPTIONAL_in_optionalGraphPattern1741); 
            OPTIONAL222_tree = (CommonTree)adaptor.dupNode(OPTIONAL222);


            root_1 = (CommonTree)adaptor.becomeRoot(OPTIONAL222_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_optionalGraphPattern1743);
            groupGraphPattern223=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern223.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optionalGraphPattern"


    public static class graphGraphPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:266:1: graphGraphPattern : ^( GRAPH varOrIRIref groupGraphPattern ) ;
    public final SparqlT.graphGraphPattern_return graphGraphPattern() throws RecognitionException {
        SparqlT.graphGraphPattern_return retval = new SparqlT.graphGraphPattern_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GRAPH224=null;
        SparqlT.varOrIRIref_return varOrIRIref225 =null;

        SparqlT.groupGraphPattern_return groupGraphPattern226 =null;


        CommonTree GRAPH224_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:267:5: ( ^( GRAPH varOrIRIref groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:267:7: ^( GRAPH varOrIRIref groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            GRAPH224=(CommonTree)match(input,GRAPH,FOLLOW_GRAPH_in_graphGraphPattern1762); 
            GRAPH224_tree = (CommonTree)adaptor.dupNode(GRAPH224);


            root_1 = (CommonTree)adaptor.becomeRoot(GRAPH224_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_varOrIRIref_in_graphGraphPattern1764);
            varOrIRIref225=varOrIRIref();

            state._fsp--;

            adaptor.addChild(root_1, varOrIRIref225.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_graphGraphPattern1766);
            groupGraphPattern226=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern226.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphGraphPattern"


    public static class serviceGraphPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "serviceGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:270:1: serviceGraphPattern : ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern ) ;
    public final SparqlT.serviceGraphPattern_return serviceGraphPattern() throws RecognitionException {
        SparqlT.serviceGraphPattern_return retval = new SparqlT.serviceGraphPattern_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SERVICE227=null;
        CommonTree SILENT228=null;
        SparqlT.varOrIRIref_return varOrIRIref229 =null;

        SparqlT.groupGraphPattern_return groupGraphPattern230 =null;


        CommonTree SERVICE227_tree=null;
        CommonTree SILENT228_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:271:5: ( ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:271:7: ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SERVICE227=(CommonTree)match(input,SERVICE,FOLLOW_SERVICE_in_serviceGraphPattern1785); 
            SERVICE227_tree = (CommonTree)adaptor.dupNode(SERVICE227);


            root_1 = (CommonTree)adaptor.becomeRoot(SERVICE227_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:271:17: ( SILENT )?
            int alt91=2;
            switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt91=1;
                    }
                    break;
            }

            switch (alt91) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:271:17: SILENT
                    {
                    _last = (CommonTree)input.LT(1);
                    SILENT228=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_serviceGraphPattern1787); 
                    SILENT228_tree = (CommonTree)adaptor.dupNode(SILENT228);


                    adaptor.addChild(root_1, SILENT228_tree);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_varOrIRIref_in_serviceGraphPattern1790);
            varOrIRIref229=varOrIRIref();

            state._fsp--;

            adaptor.addChild(root_1, varOrIRIref229.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_serviceGraphPattern1792);
            groupGraphPattern230=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern230.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "serviceGraphPattern"


    public static class bind_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bind"
    // com\\googlecode\\sparkleg\\SparqlT.g:274:1: bind : ^( BIND expression ^( AS var ) ) ;
    public final SparqlT.bind_return bind() throws RecognitionException {
        SparqlT.bind_return retval = new SparqlT.bind_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BIND231=null;
        CommonTree AS233=null;
        SparqlT.expression_return expression232 =null;

        SparqlT.var_return var234 =null;


        CommonTree BIND231_tree=null;
        CommonTree AS233_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:275:5: ( ^( BIND expression ^( AS var ) ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:275:7: ^( BIND expression ^( AS var ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            BIND231=(CommonTree)match(input,BIND,FOLLOW_BIND_in_bind1815); 
            BIND231_tree = (CommonTree)adaptor.dupNode(BIND231);


            root_1 = (CommonTree)adaptor.becomeRoot(BIND231_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_bind1817);
            expression232=expression();

            state._fsp--;

            adaptor.addChild(root_1, expression232.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            AS233=(CommonTree)match(input,AS,FOLLOW_AS_in_bind1820); 
            AS233_tree = (CommonTree)adaptor.dupNode(AS233);


            root_2 = (CommonTree)adaptor.becomeRoot(AS233_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_var_in_bind1822);
            var234=var();

            state._fsp--;

            adaptor.addChild(root_2, var234.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bind"


    public static class minusGraphPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "minusGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:278:1: minusGraphPattern : ^( MINUS_KEYWORD groupGraphPattern ) ;
    public final SparqlT.minusGraphPattern_return minusGraphPattern() throws RecognitionException {
        SparqlT.minusGraphPattern_return retval = new SparqlT.minusGraphPattern_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MINUS_KEYWORD235=null;
        SparqlT.groupGraphPattern_return groupGraphPattern236 =null;


        CommonTree MINUS_KEYWORD235_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:279:5: ( ^( MINUS_KEYWORD groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:279:7: ^( MINUS_KEYWORD groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            MINUS_KEYWORD235=(CommonTree)match(input,MINUS_KEYWORD,FOLLOW_MINUS_KEYWORD_in_minusGraphPattern1848); 
            MINUS_KEYWORD235_tree = (CommonTree)adaptor.dupNode(MINUS_KEYWORD235);


            root_1 = (CommonTree)adaptor.becomeRoot(MINUS_KEYWORD235_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_minusGraphPattern1850);
            groupGraphPattern236=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern236.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "minusGraphPattern"


    public static class groupOrUnionGraphPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupOrUnionGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:282:1: groupOrUnionGraphPattern : ( ^( UNION groupGraphPattern groupGraphPattern ) | groupGraphPattern );
    public final SparqlT.groupOrUnionGraphPattern_return groupOrUnionGraphPattern() throws RecognitionException {
        SparqlT.groupOrUnionGraphPattern_return retval = new SparqlT.groupOrUnionGraphPattern_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNION237=null;
        SparqlT.groupGraphPattern_return groupGraphPattern238 =null;

        SparqlT.groupGraphPattern_return groupGraphPattern239 =null;

        SparqlT.groupGraphPattern_return groupGraphPattern240 =null;


        CommonTree UNION237_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:283:5: ( ^( UNION groupGraphPattern groupGraphPattern ) | groupGraphPattern )
            int alt92=2;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt92=1;
                }
                break;
            case GROUP_GRAPH_PATTERN:
                {
                alt92=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }

            switch (alt92) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:283:7: ^( UNION groupGraphPattern groupGraphPattern )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    UNION237=(CommonTree)match(input,UNION,FOLLOW_UNION_in_groupOrUnionGraphPattern1869); 
                    UNION237_tree = (CommonTree)adaptor.dupNode(UNION237);


                    root_1 = (CommonTree)adaptor.becomeRoot(UNION237_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern1871);
                    groupGraphPattern238=groupGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_1, groupGraphPattern238.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern1873);
                    groupGraphPattern239=groupGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_1, groupGraphPattern239.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:284:7: groupGraphPattern
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern1882);
                    groupGraphPattern240=groupGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, groupGraphPattern240.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupOrUnionGraphPattern"


    public static class filter_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "filter"
    // com\\googlecode\\sparkleg\\SparqlT.g:287:1: filter : ^( FILTER constraint ) ;
    public final SparqlT.filter_return filter() throws RecognitionException {
        SparqlT.filter_return retval = new SparqlT.filter_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FILTER241=null;
        SparqlT.constraint_return constraint242 =null;


        CommonTree FILTER241_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:288:5: ( ^( FILTER constraint ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:288:7: ^( FILTER constraint )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FILTER241=(CommonTree)match(input,FILTER,FOLLOW_FILTER_in_filter1900); 
            FILTER241_tree = (CommonTree)adaptor.dupNode(FILTER241);


            root_1 = (CommonTree)adaptor.becomeRoot(FILTER241_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_constraint_in_filter1902);
            constraint242=constraint();

            state._fsp--;

            adaptor.addChild(root_1, constraint242.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "filter"


    public static class constraint_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constraint"
    // com\\googlecode\\sparkleg\\SparqlT.g:291:1: constraint : ( expression | builtInCall | functionCall );
    public final SparqlT.constraint_return constraint() throws RecognitionException {
        SparqlT.constraint_return retval = new SparqlT.constraint_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.expression_return expression243 =null;

        SparqlT.builtInCall_return builtInCall244 =null;

        SparqlT.functionCall_return functionCall245 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:292:5: ( expression | builtInCall | functionCall )
            int alt93=3;
            switch ( input.LA(1) ) {
            case AND:
            case ASTERISK:
            case DECIMAL_NEGATIVE:
            case DECIMAL_POSITIVE:
            case DIVIDE:
            case DOUBLE_NEGATIVE:
            case DOUBLE_POSITIVE:
            case EQUAL:
            case GREATER:
            case GREATER_EQUAL:
            case IN:
            case INTEGER_NEGATIVE:
            case INTEGER_POSITIVE:
            case LESS:
            case LESS_EQUAL:
            case MINUS:
            case NOT:
            case NOT_EQUAL:
            case OR:
            case PLUS:
            case UNARY:
                {
                alt93=1;
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
            case NOT_EXISTS:
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
                alt93=2;
                }
                break;
            case FUNCTION:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }

            switch (alt93) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:292:7: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_constraint1920);
                    expression243=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression243.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:293:7: builtInCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_builtInCall_in_constraint1928);
                    builtInCall244=builtInCall();

                    state._fsp--;

                    adaptor.addChild(root_0, builtInCall244.getTree());


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:294:7: functionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_functionCall_in_constraint1936);
                    functionCall245=functionCall();

                    state._fsp--;

                    adaptor.addChild(root_0, functionCall245.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraint"


    public static class functionCall_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCall"
    // com\\googlecode\\sparkleg\\SparqlT.g:297:1: functionCall : ^( FUNCTION iriRef ^( ARG_LIST argList ) ) ;
    public final SparqlT.functionCall_return functionCall() throws RecognitionException {
        SparqlT.functionCall_return retval = new SparqlT.functionCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FUNCTION246=null;
        CommonTree ARG_LIST248=null;
        SparqlT.iriRef_return iriRef247 =null;

        SparqlT.argList_return argList249 =null;


        CommonTree FUNCTION246_tree=null;
        CommonTree ARG_LIST248_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:298:5: ( ^( FUNCTION iriRef ^( ARG_LIST argList ) ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:298:7: ^( FUNCTION iriRef ^( ARG_LIST argList ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FUNCTION246=(CommonTree)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionCall1954); 
            FUNCTION246_tree = (CommonTree)adaptor.dupNode(FUNCTION246);


            root_1 = (CommonTree)adaptor.becomeRoot(FUNCTION246_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_iriRef_in_functionCall1956);
            iriRef247=iriRef();

            state._fsp--;

            adaptor.addChild(root_1, iriRef247.getTree());


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ARG_LIST248=(CommonTree)match(input,ARG_LIST,FOLLOW_ARG_LIST_in_functionCall1959); 
            ARG_LIST248_tree = (CommonTree)adaptor.dupNode(ARG_LIST248);


            root_2 = (CommonTree)adaptor.becomeRoot(ARG_LIST248_tree, root_2);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                _last = (CommonTree)input.LT(1);
                pushFollow(FOLLOW_argList_in_functionCall1961);
                argList249=argList();

                state._fsp--;

                adaptor.addChild(root_2, argList249.getTree());


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionCall"


    public static class argList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argList"
    // com\\googlecode\\sparkleg\\SparqlT.g:301:1: argList : ( nil | ( DISTINCT )? ( expression )* );
    public final SparqlT.argList_return argList() throws RecognitionException {
        SparqlT.argList_return retval = new SparqlT.argList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DISTINCT251=null;
        SparqlT.nil_return nil250 =null;

        SparqlT.expression_return expression252 =null;


        CommonTree DISTINCT251_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:302:5: ( nil | ( DISTINCT )? ( expression )* )
            int alt96=2;
            switch ( input.LA(1) ) {
            case OPEN_BRACE:
                {
                alt96=1;
                }
                break;
            case UP:
            case AND:
            case ASTERISK:
            case DECIMAL_NEGATIVE:
            case DECIMAL_POSITIVE:
            case DISTINCT:
            case DIVIDE:
            case DOUBLE_NEGATIVE:
            case DOUBLE_POSITIVE:
            case EQUAL:
            case GREATER:
            case GREATER_EQUAL:
            case IN:
            case INTEGER_NEGATIVE:
            case INTEGER_POSITIVE:
            case LESS:
            case LESS_EQUAL:
            case MINUS:
            case NOT:
            case NOT_EQUAL:
            case OR:
            case PLUS:
            case UNARY:
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:302:7: nil
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nil_in_argList1980);
                    nil250=nil();

                    state._fsp--;

                    adaptor.addChild(root_0, nil250.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:303:7: ( DISTINCT )? ( expression )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com\\googlecode\\sparkleg\\SparqlT.g:303:7: ( DISTINCT )?
                    int alt94=2;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt94=1;
                            }
                            break;
                    }

                    switch (alt94) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:303:7: DISTINCT
                            {
                            _last = (CommonTree)input.LT(1);
                            DISTINCT251=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_argList1988); 
                            DISTINCT251_tree = (CommonTree)adaptor.dupNode(DISTINCT251);


                            adaptor.addChild(root_0, DISTINCT251_tree);


                            }
                            break;

                    }


                    // com\\googlecode\\sparkleg\\SparqlT.g:303:17: ( expression )*
                    loop95:
                    do {
                        int alt95=2;
                        switch ( input.LA(1) ) {
                        case AND:
                        case ASTERISK:
                        case DECIMAL_NEGATIVE:
                        case DECIMAL_POSITIVE:
                        case DIVIDE:
                        case DOUBLE_NEGATIVE:
                        case DOUBLE_POSITIVE:
                        case EQUAL:
                        case GREATER:
                        case GREATER_EQUAL:
                        case IN:
                        case INTEGER_NEGATIVE:
                        case INTEGER_POSITIVE:
                        case LESS:
                        case LESS_EQUAL:
                        case MINUS:
                        case NOT:
                        case NOT_EQUAL:
                        case OR:
                        case PLUS:
                        case UNARY:
                            {
                            alt95=1;
                            }
                            break;

                        }

                        switch (alt95) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:303:17: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_argList1991);
                    	    expression252=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression252.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argList"


    public static class expressionList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
    // com\\googlecode\\sparkleg\\SparqlT.g:306:1: expressionList : ( ^( EXPRESSION_LIST ( expression )+ ) | ^( EXPRESSION_LIST nil ) );
    public final SparqlT.expressionList_return expressionList() throws RecognitionException {
        SparqlT.expressionList_return retval = new SparqlT.expressionList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXPRESSION_LIST253=null;
        CommonTree EXPRESSION_LIST255=null;
        SparqlT.expression_return expression254 =null;

        SparqlT.nil_return nil256 =null;


        CommonTree EXPRESSION_LIST253_tree=null;
        CommonTree EXPRESSION_LIST255_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:307:5: ( ^( EXPRESSION_LIST ( expression )+ ) | ^( EXPRESSION_LIST nil ) )
            int alt98=2;
            switch ( input.LA(1) ) {
            case EXPRESSION_LIST:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case AND:
                    case ASTERISK:
                    case DECIMAL_NEGATIVE:
                    case DECIMAL_POSITIVE:
                    case DIVIDE:
                    case DOUBLE_NEGATIVE:
                    case DOUBLE_POSITIVE:
                    case EQUAL:
                    case GREATER:
                    case GREATER_EQUAL:
                    case IN:
                    case INTEGER_NEGATIVE:
                    case INTEGER_POSITIVE:
                    case LESS:
                    case LESS_EQUAL:
                    case MINUS:
                    case NOT:
                    case NOT_EQUAL:
                    case OR:
                    case PLUS:
                    case UNARY:
                        {
                        alt98=1;
                        }
                        break;
                    case OPEN_BRACE:
                        {
                        alt98=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }

            switch (alt98) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:307:7: ^( EXPRESSION_LIST ( expression )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXPRESSION_LIST253=(CommonTree)match(input,EXPRESSION_LIST,FOLLOW_EXPRESSION_LIST_in_expressionList2010); 
                    EXPRESSION_LIST253_tree = (CommonTree)adaptor.dupNode(EXPRESSION_LIST253);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXPRESSION_LIST253_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:307:25: ( expression )+
                    int cnt97=0;
                    loop97:
                    do {
                        int alt97=2;
                        switch ( input.LA(1) ) {
                        case AND:
                        case ASTERISK:
                        case DECIMAL_NEGATIVE:
                        case DECIMAL_POSITIVE:
                        case DIVIDE:
                        case DOUBLE_NEGATIVE:
                        case DOUBLE_POSITIVE:
                        case EQUAL:
                        case GREATER:
                        case GREATER_EQUAL:
                        case IN:
                        case INTEGER_NEGATIVE:
                        case INTEGER_POSITIVE:
                        case LESS:
                        case LESS_EQUAL:
                        case MINUS:
                        case NOT:
                        case NOT_EQUAL:
                        case OR:
                        case PLUS:
                        case UNARY:
                            {
                            alt97=1;
                            }
                            break;

                        }

                        switch (alt97) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:307:25: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_expressionList2012);
                    	    expression254=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, expression254.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt97 >= 1 ) break loop97;
                                EarlyExitException eee =
                                    new EarlyExitException(97, input);
                                throw eee;
                        }
                        cnt97++;
                    } while (true);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:308:7: ^( EXPRESSION_LIST nil )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EXPRESSION_LIST255=(CommonTree)match(input,EXPRESSION_LIST,FOLLOW_EXPRESSION_LIST_in_expressionList2023); 
                    EXPRESSION_LIST255_tree = (CommonTree)adaptor.dupNode(EXPRESSION_LIST255);


                    root_1 = (CommonTree)adaptor.becomeRoot(EXPRESSION_LIST255_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nil_in_expressionList2025);
                    nil256=nil();

                    state._fsp--;

                    adaptor.addChild(root_1, nil256.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionList"


    public static class constructTemplate_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructTemplate"
    // com\\googlecode\\sparkleg\\SparqlT.g:311:1: constructTemplate : ^( CONSTRUCT_TRIPLES ( constructTriples )? ) ;
    public final SparqlT.constructTemplate_return constructTemplate() throws RecognitionException {
        SparqlT.constructTemplate_return retval = new SparqlT.constructTemplate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONSTRUCT_TRIPLES257=null;
        SparqlT.constructTriples_return constructTriples258 =null;


        CommonTree CONSTRUCT_TRIPLES257_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:312:5: ( ^( CONSTRUCT_TRIPLES ( constructTriples )? ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:312:7: ^( CONSTRUCT_TRIPLES ( constructTriples )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CONSTRUCT_TRIPLES257=(CommonTree)match(input,CONSTRUCT_TRIPLES,FOLLOW_CONSTRUCT_TRIPLES_in_constructTemplate2045); 
            CONSTRUCT_TRIPLES257_tree = (CommonTree)adaptor.dupNode(CONSTRUCT_TRIPLES257);


            root_1 = (CommonTree)adaptor.becomeRoot(CONSTRUCT_TRIPLES257_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:312:27: ( constructTriples )?
                int alt99=2;
                switch ( input.LA(1) ) {
                    case TRIPLES_SAME_SUBJECT:
                        {
                        alt99=1;
                        }
                        break;
                }

                switch (alt99) {
                    case 1 :
                        // com\\googlecode\\sparkleg\\SparqlT.g:312:27: constructTriples
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_constructTriples_in_constructTemplate2047);
                        constructTriples258=constructTriples();

                        state._fsp--;

                        adaptor.addChild(root_1, constructTriples258.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructTemplate"


    public static class constructTriples_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constructTriples"
    // com\\googlecode\\sparkleg\\SparqlT.g:315:1: constructTriples : ( triplesSameSubject )+ ;
    public final SparqlT.constructTriples_return constructTriples() throws RecognitionException {
        SparqlT.constructTriples_return retval = new SparqlT.constructTriples_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.triplesSameSubject_return triplesSameSubject259 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:316:5: ( ( triplesSameSubject )+ )
            // com\\googlecode\\sparkleg\\SparqlT.g:316:7: ( triplesSameSubject )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // com\\googlecode\\sparkleg\\SparqlT.g:316:7: ( triplesSameSubject )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                switch ( input.LA(1) ) {
                case TRIPLES_SAME_SUBJECT:
                    {
                    alt100=1;
                    }
                    break;

                }

                switch (alt100) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:316:7: triplesSameSubject
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_triplesSameSubject_in_constructTriples2066);
            	    triplesSameSubject259=triplesSameSubject();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triplesSameSubject259.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constructTriples"


    public static class triplesSameSubject_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triplesSameSubject"
    // com\\googlecode\\sparkleg\\SparqlT.g:319:1: triplesSameSubject : ( ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty ) | ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? ) );
    public final SparqlT.triplesSameSubject_return triplesSameSubject() throws RecognitionException {
        SparqlT.triplesSameSubject_return retval = new SparqlT.triplesSameSubject_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TRIPLES_SAME_SUBJECT260=null;
        CommonTree SUBJECT261=null;
        CommonTree TRIPLES_SAME_SUBJECT264=null;
        SparqlT.varOrTerm_return varOrTerm262 =null;

        SparqlT.propertyListNotEmpty_return propertyListNotEmpty263 =null;

        SparqlT.triplesNode_return triplesNode265 =null;

        SparqlT.propertyListNotEmpty_return propertyListNotEmpty266 =null;


        CommonTree TRIPLES_SAME_SUBJECT260_tree=null;
        CommonTree SUBJECT261_tree=null;
        CommonTree TRIPLES_SAME_SUBJECT264_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:320:5: ( ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty ) | ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? ) )
            int alt102=2;
            switch ( input.LA(1) ) {
            case TRIPLES_SAME_SUBJECT:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case SUBJECT:
                        {
                        alt102=1;
                        }
                        break;
                    case COLLECTION:
                    case TRIPLES_NODE:
                        {
                        alt102=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }

            switch (alt102) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:320:7: ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    TRIPLES_SAME_SUBJECT260=(CommonTree)match(input,TRIPLES_SAME_SUBJECT,FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubject2085); 
                    TRIPLES_SAME_SUBJECT260_tree = (CommonTree)adaptor.dupNode(TRIPLES_SAME_SUBJECT260);


                    root_1 = (CommonTree)adaptor.becomeRoot(TRIPLES_SAME_SUBJECT260_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUBJECT261=(CommonTree)match(input,SUBJECT,FOLLOW_SUBJECT_in_triplesSameSubject2088); 
                    SUBJECT261_tree = (CommonTree)adaptor.dupNode(SUBJECT261);


                    root_2 = (CommonTree)adaptor.becomeRoot(SUBJECT261_tree, root_2);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubject2090);
                    varOrTerm262=varOrTerm();

                    state._fsp--;

                    adaptor.addChild(root_2, varOrTerm262.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject2093);
                    propertyListNotEmpty263=propertyListNotEmpty();

                    state._fsp--;

                    adaptor.addChild(root_1, propertyListNotEmpty263.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:321:7: ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    TRIPLES_SAME_SUBJECT264=(CommonTree)match(input,TRIPLES_SAME_SUBJECT,FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubject2103); 
                    TRIPLES_SAME_SUBJECT264_tree = (CommonTree)adaptor.dupNode(TRIPLES_SAME_SUBJECT264);


                    root_1 = (CommonTree)adaptor.becomeRoot(TRIPLES_SAME_SUBJECT264_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubject2105);
                    triplesNode265=triplesNode();

                    state._fsp--;

                    adaptor.addChild(root_1, triplesNode265.getTree());


                    // com\\googlecode\\sparkleg\\SparqlT.g:321:42: ( propertyListNotEmpty )?
                    int alt101=2;
                    switch ( input.LA(1) ) {
                        case PREDICATE:
                            {
                            alt101=1;
                            }
                            break;
                    }

                    switch (alt101) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:321:42: propertyListNotEmpty
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject2107);
                            propertyListNotEmpty266=propertyListNotEmpty();

                            state._fsp--;

                            adaptor.addChild(root_1, propertyListNotEmpty266.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triplesSameSubject"


    public static class propertyListNotEmpty_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propertyListNotEmpty"
    // com\\googlecode\\sparkleg\\SparqlT.g:325:1: propertyListNotEmpty : ( propertyListNotEmptyDetails )+ ;
    public final SparqlT.propertyListNotEmpty_return propertyListNotEmpty() throws RecognitionException {
        SparqlT.propertyListNotEmpty_return retval = new SparqlT.propertyListNotEmpty_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.propertyListNotEmptyDetails_return propertyListNotEmptyDetails267 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:326:5: ( ( propertyListNotEmptyDetails )+ )
            // com\\googlecode\\sparkleg\\SparqlT.g:326:7: ( propertyListNotEmptyDetails )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // com\\googlecode\\sparkleg\\SparqlT.g:326:7: ( propertyListNotEmptyDetails )+
            int cnt103=0;
            loop103:
            do {
                int alt103=2;
                switch ( input.LA(1) ) {
                case PREDICATE:
                    {
                    alt103=1;
                    }
                    break;

                }

                switch (alt103) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:326:7: propertyListNotEmptyDetails
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_propertyListNotEmptyDetails_in_propertyListNotEmpty2139);
            	    propertyListNotEmptyDetails267=propertyListNotEmptyDetails();

            	    state._fsp--;

            	    adaptor.addChild(root_0, propertyListNotEmptyDetails267.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt103 >= 1 ) break loop103;
                        EarlyExitException eee =
                            new EarlyExitException(103, input);
                        throw eee;
                }
                cnt103++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "propertyListNotEmpty"


    public static class propertyListNotEmptyDetails_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propertyListNotEmptyDetails"
    // com\\googlecode\\sparkleg\\SparqlT.g:329:1: propertyListNotEmptyDetails : ^( PREDICATE v= verb o= objectList ) ;
    public final SparqlT.propertyListNotEmptyDetails_return propertyListNotEmptyDetails() throws RecognitionException {
        SparqlT.propertyListNotEmptyDetails_return retval = new SparqlT.propertyListNotEmptyDetails_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PREDICATE268=null;
        SparqlT.verb_return v =null;

        SparqlT.objectList_return o =null;


        CommonTree PREDICATE268_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:330:5: ( ^( PREDICATE v= verb o= objectList ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:330:7: ^( PREDICATE v= verb o= objectList )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PREDICATE268=(CommonTree)match(input,PREDICATE,FOLLOW_PREDICATE_in_propertyListNotEmptyDetails2158); 
            PREDICATE268_tree = (CommonTree)adaptor.dupNode(PREDICATE268);


            root_1 = (CommonTree)adaptor.becomeRoot(PREDICATE268_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_verb_in_propertyListNotEmptyDetails2163);
            v=verb();

            state._fsp--;

            adaptor.addChild(root_1, v.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_objectList_in_propertyListNotEmptyDetails2167);
            o=objectList();

            state._fsp--;

            adaptor.addChild(root_1, o.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "propertyListNotEmptyDetails"


    public static class objectList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objectList"
    // com\\googlecode\\sparkleg\\SparqlT.g:333:1: objectList : ( ^( OBJECT graphNode ) )+ ;
    public final SparqlT.objectList_return objectList() throws RecognitionException {
        SparqlT.objectList_return retval = new SparqlT.objectList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OBJECT269=null;
        SparqlT.graphNode_return graphNode270 =null;


        CommonTree OBJECT269_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:334:5: ( ( ^( OBJECT graphNode ) )+ )
            // com\\googlecode\\sparkleg\\SparqlT.g:334:7: ( ^( OBJECT graphNode ) )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // com\\googlecode\\sparkleg\\SparqlT.g:334:7: ( ^( OBJECT graphNode ) )+
            int cnt104=0;
            loop104:
            do {
                int alt104=2;
                switch ( input.LA(1) ) {
                case OBJECT:
                    {
                    alt104=1;
                    }
                    break;

                }

                switch (alt104) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:334:8: ^( OBJECT graphNode )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();
            	    _last = (CommonTree)input.LT(1);
            	    OBJECT269=(CommonTree)match(input,OBJECT,FOLLOW_OBJECT_in_objectList2187); 
            	    OBJECT269_tree = (CommonTree)adaptor.dupNode(OBJECT269);


            	    root_1 = (CommonTree)adaptor.becomeRoot(OBJECT269_tree, root_1);


            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_graphNode_in_objectList2189);
            	    graphNode270=graphNode();

            	    state._fsp--;

            	    adaptor.addChild(root_1, graphNode270.getTree());


            	    match(input, Token.UP, null); 
            	    adaptor.addChild(root_0, root_1);
            	    _last = _save_last_1;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt104 >= 1 ) break loop104;
                        EarlyExitException eee =
                            new EarlyExitException(104, input);
                        throw eee;
                }
                cnt104++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "objectList"


    public static class verb_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "verb"
    // com\\googlecode\\sparkleg\\SparqlT.g:337:1: verb : ( varOrIRIref | A | path );
    public final SparqlT.verb_return verb() throws RecognitionException {
        SparqlT.verb_return retval = new SparqlT.verb_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree A272=null;
        SparqlT.varOrIRIref_return varOrIRIref271 =null;

        SparqlT.path_return path273 =null;


        CommonTree A272_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:338:5: ( varOrIRIref | A | path )
            int alt105=3;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
            case VAR1:
            case VAR2:
                {
                alt105=1;
                }
                break;
            case A:
                {
                alt105=2;
                }
                break;
            case PATH:
                {
                alt105=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }

            switch (alt105) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:338:7: varOrIRIref
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_varOrIRIref_in_verb2209);
                    varOrIRIref271=varOrIRIref();

                    state._fsp--;

                    adaptor.addChild(root_0, varOrIRIref271.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:339:7: A
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    A272=(CommonTree)match(input,A,FOLLOW_A_in_verb2217); 
                    A272_tree = (CommonTree)adaptor.dupNode(A272);


                    adaptor.addChild(root_0, A272_tree);


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:340:7: path
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_path_in_verb2225);
                    path273=path();

                    state._fsp--;

                    adaptor.addChild(root_0, path273.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "verb"


    public static class triplesSameSubjectPath_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triplesSameSubjectPath"
    // com\\googlecode\\sparkleg\\SparqlT.g:343:1: triplesSameSubjectPath : ( ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty ) | ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? ) );
    public final SparqlT.triplesSameSubjectPath_return triplesSameSubjectPath() throws RecognitionException {
        SparqlT.triplesSameSubjectPath_return retval = new SparqlT.triplesSameSubjectPath_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TRIPLES_SAME_SUBJECT274=null;
        CommonTree SUBJECT275=null;
        CommonTree TRIPLES_SAME_SUBJECT278=null;
        SparqlT.varOrTerm_return varOrTerm276 =null;

        SparqlT.propertyListNotEmpty_return propertyListNotEmpty277 =null;

        SparqlT.triplesNode_return triplesNode279 =null;

        SparqlT.propertyListNotEmpty_return propertyListNotEmpty280 =null;


        CommonTree TRIPLES_SAME_SUBJECT274_tree=null;
        CommonTree SUBJECT275_tree=null;
        CommonTree TRIPLES_SAME_SUBJECT278_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:344:5: ( ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty ) | ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? ) )
            int alt107=2;
            switch ( input.LA(1) ) {
            case TRIPLES_SAME_SUBJECT:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case SUBJECT:
                        {
                        alt107=1;
                        }
                        break;
                    case COLLECTION:
                    case TRIPLES_NODE:
                        {
                        alt107=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 107, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 107, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;

            }

            switch (alt107) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:344:7: ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    TRIPLES_SAME_SUBJECT274=(CommonTree)match(input,TRIPLES_SAME_SUBJECT,FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubjectPath2243); 
                    TRIPLES_SAME_SUBJECT274_tree = (CommonTree)adaptor.dupNode(TRIPLES_SAME_SUBJECT274);


                    root_1 = (CommonTree)adaptor.becomeRoot(TRIPLES_SAME_SUBJECT274_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUBJECT275=(CommonTree)match(input,SUBJECT,FOLLOW_SUBJECT_in_triplesSameSubjectPath2246); 
                    SUBJECT275_tree = (CommonTree)adaptor.dupNode(SUBJECT275);


                    root_2 = (CommonTree)adaptor.becomeRoot(SUBJECT275_tree, root_2);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubjectPath2248);
                    varOrTerm276=varOrTerm();

                    state._fsp--;

                    adaptor.addChild(root_2, varOrTerm276.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath2251);
                    propertyListNotEmpty277=propertyListNotEmpty();

                    state._fsp--;

                    adaptor.addChild(root_1, propertyListNotEmpty277.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:345:7: ^( TRIPLES_SAME_SUBJECT triplesNode ( propertyListNotEmpty )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    TRIPLES_SAME_SUBJECT278=(CommonTree)match(input,TRIPLES_SAME_SUBJECT,FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubjectPath2261); 
                    TRIPLES_SAME_SUBJECT278_tree = (CommonTree)adaptor.dupNode(TRIPLES_SAME_SUBJECT278);


                    root_1 = (CommonTree)adaptor.becomeRoot(TRIPLES_SAME_SUBJECT278_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubjectPath2264);
                    triplesNode279=triplesNode();

                    state._fsp--;

                    adaptor.addChild(root_1, triplesNode279.getTree());


                    // com\\googlecode\\sparkleg\\SparqlT.g:345:43: ( propertyListNotEmpty )?
                    int alt106=2;
                    switch ( input.LA(1) ) {
                        case PREDICATE:
                            {
                            alt106=1;
                            }
                            break;
                    }

                    switch (alt106) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:345:43: propertyListNotEmpty
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath2266);
                            propertyListNotEmpty280=propertyListNotEmpty();

                            state._fsp--;

                            adaptor.addChild(root_1, propertyListNotEmpty280.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triplesSameSubjectPath"


    public static class path_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "path"
    // com\\googlecode\\sparkleg\\SparqlT.g:348:1: path : ^( PATH ( pathSequence )+ ) ;
    public final SparqlT.path_return path() throws RecognitionException {
        SparqlT.path_return retval = new SparqlT.path_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PATH281=null;
        SparqlT.pathSequence_return pathSequence282 =null;


        CommonTree PATH281_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:349:5: ( ^( PATH ( pathSequence )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:349:7: ^( PATH ( pathSequence )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PATH281=(CommonTree)match(input,PATH,FOLLOW_PATH_in_path2290); 
            PATH281_tree = (CommonTree)adaptor.dupNode(PATH281);


            root_1 = (CommonTree)adaptor.becomeRoot(PATH281_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:349:14: ( pathSequence )+
            int cnt108=0;
            loop108:
            do {
                int alt108=2;
                switch ( input.LA(1) ) {
                case PATH_SEQUENCE:
                    {
                    alt108=1;
                    }
                    break;

                }

                switch (alt108) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:349:14: pathSequence
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_pathSequence_in_path2292);
            	    pathSequence282=pathSequence();

            	    state._fsp--;

            	    adaptor.addChild(root_1, pathSequence282.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt108 >= 1 ) break loop108;
                        EarlyExitException eee =
                            new EarlyExitException(108, input);
                        throw eee;
                }
                cnt108++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "path"


    public static class pathSequence_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathSequence"
    // com\\googlecode\\sparkleg\\SparqlT.g:352:1: pathSequence : ^( PATH_SEQUENCE ( pathEltOrInverse )+ ) ;
    public final SparqlT.pathSequence_return pathSequence() throws RecognitionException {
        SparqlT.pathSequence_return retval = new SparqlT.pathSequence_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PATH_SEQUENCE283=null;
        SparqlT.pathEltOrInverse_return pathEltOrInverse284 =null;


        CommonTree PATH_SEQUENCE283_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:353:5: ( ^( PATH_SEQUENCE ( pathEltOrInverse )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:353:7: ^( PATH_SEQUENCE ( pathEltOrInverse )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PATH_SEQUENCE283=(CommonTree)match(input,PATH_SEQUENCE,FOLLOW_PATH_SEQUENCE_in_pathSequence2313); 
            PATH_SEQUENCE283_tree = (CommonTree)adaptor.dupNode(PATH_SEQUENCE283);


            root_1 = (CommonTree)adaptor.becomeRoot(PATH_SEQUENCE283_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:353:23: ( pathEltOrInverse )+
            int cnt109=0;
            loop109:
            do {
                int alt109=2;
                switch ( input.LA(1) ) {
                case INVERSE:
                case PATH_PRIMARY:
                    {
                    alt109=1;
                    }
                    break;

                }

                switch (alt109) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:353:23: pathEltOrInverse
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence2315);
            	    pathEltOrInverse284=pathEltOrInverse();

            	    state._fsp--;

            	    adaptor.addChild(root_1, pathEltOrInverse284.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt109 >= 1 ) break loop109;
                        EarlyExitException eee =
                            new EarlyExitException(109, input);
                        throw eee;
                }
                cnt109++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathSequence"


    public static class pathEltOrInverse_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathEltOrInverse"
    // com\\googlecode\\sparkleg\\SparqlT.g:356:1: pathEltOrInverse : ( INVERSE )? pathElt ;
    public final SparqlT.pathEltOrInverse_return pathEltOrInverse() throws RecognitionException {
        SparqlT.pathEltOrInverse_return retval = new SparqlT.pathEltOrInverse_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INVERSE285=null;
        SparqlT.pathElt_return pathElt286 =null;


        CommonTree INVERSE285_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:357:5: ( ( INVERSE )? pathElt )
            // com\\googlecode\\sparkleg\\SparqlT.g:357:7: ( INVERSE )? pathElt
            {
            root_0 = (CommonTree)adaptor.nil();


            // com\\googlecode\\sparkleg\\SparqlT.g:357:7: ( INVERSE )?
            int alt110=2;
            switch ( input.LA(1) ) {
                case INVERSE:
                    {
                    alt110=1;
                    }
                    break;
            }

            switch (alt110) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:357:7: INVERSE
                    {
                    _last = (CommonTree)input.LT(1);
                    INVERSE285=(CommonTree)match(input,INVERSE,FOLLOW_INVERSE_in_pathEltOrInverse2338); 
                    INVERSE285_tree = (CommonTree)adaptor.dupNode(INVERSE285);


                    adaptor.addChild(root_0, INVERSE285_tree);


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pathElt_in_pathEltOrInverse2341);
            pathElt286=pathElt();

            state._fsp--;

            adaptor.addChild(root_0, pathElt286.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathEltOrInverse"


    public static class pathElt_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathElt"
    // com\\googlecode\\sparkleg\\SparqlT.g:360:1: pathElt : pathPrimary ( pathMod )? ;
    public final SparqlT.pathElt_return pathElt() throws RecognitionException {
        SparqlT.pathElt_return retval = new SparqlT.pathElt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.pathPrimary_return pathPrimary287 =null;

        SparqlT.pathMod_return pathMod288 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:361:5: ( pathPrimary ( pathMod )? )
            // com\\googlecode\\sparkleg\\SparqlT.g:361:7: pathPrimary ( pathMod )?
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pathPrimary_in_pathElt2366);
            pathPrimary287=pathPrimary();

            state._fsp--;

            adaptor.addChild(root_0, pathPrimary287.getTree());


            // com\\googlecode\\sparkleg\\SparqlT.g:361:19: ( pathMod )?
            int alt111=2;
            switch ( input.LA(1) ) {
                case ASTERISK:
                case OPEN_CURLY_BRACE:
                case PLUS:
                case QUESTION_MARK:
                    {
                    alt111=1;
                    }
                    break;
            }

            switch (alt111) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:361:19: pathMod
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_pathMod_in_pathElt2368);
                    pathMod288=pathMod();

                    state._fsp--;

                    adaptor.addChild(root_0, pathMod288.getTree());


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathElt"


    public static class pathMod_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathMod"
    // com\\googlecode\\sparkleg\\SparqlT.g:364:1: pathMod : ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) ) ;
    public final SparqlT.pathMod_return pathMod() throws RecognitionException {
        SparqlT.pathMod_return retval = new SparqlT.pathMod_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASTERISK289=null;
        CommonTree QUESTION_MARK290=null;
        CommonTree PLUS291=null;
        CommonTree OPEN_CURLY_BRACE292=null;
        CommonTree INTEGER293=null;
        CommonTree COMMA294=null;
        CommonTree CLOSE_CURLY_BRACE295=null;
        CommonTree INTEGER296=null;
        CommonTree CLOSE_CURLY_BRACE297=null;
        CommonTree CLOSE_CURLY_BRACE298=null;
        CommonTree COMMA299=null;
        CommonTree INTEGER300=null;
        CommonTree CLOSE_CURLY_BRACE301=null;

        CommonTree ASTERISK289_tree=null;
        CommonTree QUESTION_MARK290_tree=null;
        CommonTree PLUS291_tree=null;
        CommonTree OPEN_CURLY_BRACE292_tree=null;
        CommonTree INTEGER293_tree=null;
        CommonTree COMMA294_tree=null;
        CommonTree CLOSE_CURLY_BRACE295_tree=null;
        CommonTree INTEGER296_tree=null;
        CommonTree CLOSE_CURLY_BRACE297_tree=null;
        CommonTree CLOSE_CURLY_BRACE298_tree=null;
        CommonTree COMMA299_tree=null;
        CommonTree INTEGER300_tree=null;
        CommonTree CLOSE_CURLY_BRACE301_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:365:5: ( ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:365:7: ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            // com\\googlecode\\sparkleg\\SparqlT.g:365:7: ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) )
            int alt115=4;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt115=1;
                }
                break;
            case QUESTION_MARK:
                {
                alt115=2;
                }
                break;
            case PLUS:
                {
                alt115=3;
                }
                break;
            case OPEN_CURLY_BRACE:
                {
                alt115=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }

            switch (alt115) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:365:8: ASTERISK
                    {
                    _last = (CommonTree)input.LT(1);
                    ASTERISK289=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_pathMod2391); 
                    ASTERISK289_tree = (CommonTree)adaptor.dupNode(ASTERISK289);


                    adaptor.addChild(root_0, ASTERISK289_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:365:19: QUESTION_MARK
                    {
                    _last = (CommonTree)input.LT(1);
                    QUESTION_MARK290=(CommonTree)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_pathMod2395); 
                    QUESTION_MARK290_tree = (CommonTree)adaptor.dupNode(QUESTION_MARK290);


                    adaptor.addChild(root_0, QUESTION_MARK290_tree);


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:365:35: PLUS
                    {
                    _last = (CommonTree)input.LT(1);
                    PLUS291=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_pathMod2399); 
                    PLUS291_tree = (CommonTree)adaptor.dupNode(PLUS291);


                    adaptor.addChild(root_0, PLUS291_tree);


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:365:42: OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE )
                    {
                    _last = (CommonTree)input.LT(1);
                    OPEN_CURLY_BRACE292=(CommonTree)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_pathMod2403); 
                    OPEN_CURLY_BRACE292_tree = (CommonTree)adaptor.dupNode(OPEN_CURLY_BRACE292);


                    adaptor.addChild(root_0, OPEN_CURLY_BRACE292_tree);


                    // com\\googlecode\\sparkleg\\SparqlT.g:365:59: ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE )
                    int alt114=2;
                    switch ( input.LA(1) ) {
                    case INTEGER:
                        {
                        alt114=1;
                        }
                        break;
                    case COMMA:
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
                            // com\\googlecode\\sparkleg\\SparqlT.g:365:60: INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE )
                            {
                            _last = (CommonTree)input.LT(1);
                            INTEGER293=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod2406); 
                            INTEGER293_tree = (CommonTree)adaptor.dupNode(INTEGER293);


                            adaptor.addChild(root_0, INTEGER293_tree);


                            // com\\googlecode\\sparkleg\\SparqlT.g:365:68: ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE )
                            int alt113=2;
                            switch ( input.LA(1) ) {
                            case COMMA:
                                {
                                alt113=1;
                                }
                                break;
                            case CLOSE_CURLY_BRACE:
                                {
                                alt113=2;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 113, 0, input);

                                throw nvae;

                            }

                            switch (alt113) {
                                case 1 :
                                    // com\\googlecode\\sparkleg\\SparqlT.g:365:69: COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE )
                                    {
                                    _last = (CommonTree)input.LT(1);
                                    COMMA294=(CommonTree)match(input,COMMA,FOLLOW_COMMA_in_pathMod2409); 
                                    COMMA294_tree = (CommonTree)adaptor.dupNode(COMMA294);


                                    adaptor.addChild(root_0, COMMA294_tree);


                                    // com\\googlecode\\sparkleg\\SparqlT.g:365:75: ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE )
                                    int alt112=2;
                                    switch ( input.LA(1) ) {
                                    case CLOSE_CURLY_BRACE:
                                        {
                                        alt112=1;
                                        }
                                        break;
                                    case INTEGER:
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
                                            // com\\googlecode\\sparkleg\\SparqlT.g:365:76: CLOSE_CURLY_BRACE
                                            {
                                            _last = (CommonTree)input.LT(1);
                                            CLOSE_CURLY_BRACE295=(CommonTree)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2412); 
                                            CLOSE_CURLY_BRACE295_tree = (CommonTree)adaptor.dupNode(CLOSE_CURLY_BRACE295);


                                            adaptor.addChild(root_0, CLOSE_CURLY_BRACE295_tree);


                                            }
                                            break;
                                        case 2 :
                                            // com\\googlecode\\sparkleg\\SparqlT.g:365:96: INTEGER CLOSE_CURLY_BRACE
                                            {
                                            _last = (CommonTree)input.LT(1);
                                            INTEGER296=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod2416); 
                                            INTEGER296_tree = (CommonTree)adaptor.dupNode(INTEGER296);


                                            adaptor.addChild(root_0, INTEGER296_tree);


                                            _last = (CommonTree)input.LT(1);
                                            CLOSE_CURLY_BRACE297=(CommonTree)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2418); 
                                            CLOSE_CURLY_BRACE297_tree = (CommonTree)adaptor.dupNode(CLOSE_CURLY_BRACE297);


                                            adaptor.addChild(root_0, CLOSE_CURLY_BRACE297_tree);


                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // com\\googlecode\\sparkleg\\SparqlT.g:365:125: CLOSE_CURLY_BRACE
                                    {
                                    _last = (CommonTree)input.LT(1);
                                    CLOSE_CURLY_BRACE298=(CommonTree)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2423); 
                                    CLOSE_CURLY_BRACE298_tree = (CommonTree)adaptor.dupNode(CLOSE_CURLY_BRACE298);


                                    adaptor.addChild(root_0, CLOSE_CURLY_BRACE298_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:365:146: COMMA INTEGER CLOSE_CURLY_BRACE
                            {
                            _last = (CommonTree)input.LT(1);
                            COMMA299=(CommonTree)match(input,COMMA,FOLLOW_COMMA_in_pathMod2428); 
                            COMMA299_tree = (CommonTree)adaptor.dupNode(COMMA299);


                            adaptor.addChild(root_0, COMMA299_tree);


                            _last = (CommonTree)input.LT(1);
                            INTEGER300=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod2430); 
                            INTEGER300_tree = (CommonTree)adaptor.dupNode(INTEGER300);


                            adaptor.addChild(root_0, INTEGER300_tree);


                            _last = (CommonTree)input.LT(1);
                            CLOSE_CURLY_BRACE301=(CommonTree)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2432); 
                            CLOSE_CURLY_BRACE301_tree = (CommonTree)adaptor.dupNode(CLOSE_CURLY_BRACE301);


                            adaptor.addChild(root_0, CLOSE_CURLY_BRACE301_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathMod"


    public static class pathPrimary_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathPrimary"
    // com\\googlecode\\sparkleg\\SparqlT.g:368:1: pathPrimary : ( ^( PATH_PRIMARY iriRef ) | ^( PATH_PRIMARY A ) | ^( PATH_PRIMARY NEGATION pathNegatedPropertySet ) | ^( PATH_PRIMARY path ) );
    public final SparqlT.pathPrimary_return pathPrimary() throws RecognitionException {
        SparqlT.pathPrimary_return retval = new SparqlT.pathPrimary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PATH_PRIMARY302=null;
        CommonTree PATH_PRIMARY304=null;
        CommonTree A305=null;
        CommonTree PATH_PRIMARY306=null;
        CommonTree NEGATION307=null;
        CommonTree PATH_PRIMARY309=null;
        SparqlT.iriRef_return iriRef303 =null;

        SparqlT.pathNegatedPropertySet_return pathNegatedPropertySet308 =null;

        SparqlT.path_return path310 =null;


        CommonTree PATH_PRIMARY302_tree=null;
        CommonTree PATH_PRIMARY304_tree=null;
        CommonTree A305_tree=null;
        CommonTree PATH_PRIMARY306_tree=null;
        CommonTree NEGATION307_tree=null;
        CommonTree PATH_PRIMARY309_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:369:5: ( ^( PATH_PRIMARY iriRef ) | ^( PATH_PRIMARY A ) | ^( PATH_PRIMARY NEGATION pathNegatedPropertySet ) | ^( PATH_PRIMARY path ) )
            int alt116=4;
            switch ( input.LA(1) ) {
            case PATH_PRIMARY:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case A:
                        {
                        alt116=2;
                        }
                        break;
                    case NEGATION:
                        {
                        alt116=3;
                        }
                        break;
                    case IRI_REF:
                    case PNAME_LN:
                    case PNAME_NS:
                        {
                        alt116=1;
                        }
                        break;
                    case PATH:
                        {
                        alt116=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 116, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;

            }

            switch (alt116) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:369:7: ^( PATH_PRIMARY iriRef )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PATH_PRIMARY302=(CommonTree)match(input,PATH_PRIMARY,FOLLOW_PATH_PRIMARY_in_pathPrimary2452); 
                    PATH_PRIMARY302_tree = (CommonTree)adaptor.dupNode(PATH_PRIMARY302);


                    root_1 = (CommonTree)adaptor.becomeRoot(PATH_PRIMARY302_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_pathPrimary2454);
                    iriRef303=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_1, iriRef303.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:370:7: ^( PATH_PRIMARY A )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PATH_PRIMARY304=(CommonTree)match(input,PATH_PRIMARY,FOLLOW_PATH_PRIMARY_in_pathPrimary2464); 
                    PATH_PRIMARY304_tree = (CommonTree)adaptor.dupNode(PATH_PRIMARY304);


                    root_1 = (CommonTree)adaptor.becomeRoot(PATH_PRIMARY304_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    A305=(CommonTree)match(input,A,FOLLOW_A_in_pathPrimary2466); 
                    A305_tree = (CommonTree)adaptor.dupNode(A305);


                    adaptor.addChild(root_1, A305_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:371:7: ^( PATH_PRIMARY NEGATION pathNegatedPropertySet )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PATH_PRIMARY306=(CommonTree)match(input,PATH_PRIMARY,FOLLOW_PATH_PRIMARY_in_pathPrimary2476); 
                    PATH_PRIMARY306_tree = (CommonTree)adaptor.dupNode(PATH_PRIMARY306);


                    root_1 = (CommonTree)adaptor.becomeRoot(PATH_PRIMARY306_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NEGATION307=(CommonTree)match(input,NEGATION,FOLLOW_NEGATION_in_pathPrimary2478); 
                    NEGATION307_tree = (CommonTree)adaptor.dupNode(NEGATION307);


                    adaptor.addChild(root_1, NEGATION307_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_pathNegatedPropertySet_in_pathPrimary2480);
                    pathNegatedPropertySet308=pathNegatedPropertySet();

                    state._fsp--;

                    adaptor.addChild(root_1, pathNegatedPropertySet308.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:372:7: ^( PATH_PRIMARY path )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PATH_PRIMARY309=(CommonTree)match(input,PATH_PRIMARY,FOLLOW_PATH_PRIMARY_in_pathPrimary2490); 
                    PATH_PRIMARY309_tree = (CommonTree)adaptor.dupNode(PATH_PRIMARY309);


                    root_1 = (CommonTree)adaptor.becomeRoot(PATH_PRIMARY309_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_path_in_pathPrimary2492);
                    path310=path();

                    state._fsp--;

                    adaptor.addChild(root_1, path310.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathPrimary"


    public static class pathNegatedPropertySet_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathNegatedPropertySet"
    // com\\googlecode\\sparkleg\\SparqlT.g:375:1: pathNegatedPropertySet : ^( PATH_NEGATED ( pathOneInPropertySet )+ ) ;
    public final SparqlT.pathNegatedPropertySet_return pathNegatedPropertySet() throws RecognitionException {
        SparqlT.pathNegatedPropertySet_return retval = new SparqlT.pathNegatedPropertySet_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PATH_NEGATED311=null;
        SparqlT.pathOneInPropertySet_return pathOneInPropertySet312 =null;


        CommonTree PATH_NEGATED311_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:376:5: ( ^( PATH_NEGATED ( pathOneInPropertySet )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:376:7: ^( PATH_NEGATED ( pathOneInPropertySet )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PATH_NEGATED311=(CommonTree)match(input,PATH_NEGATED,FOLLOW_PATH_NEGATED_in_pathNegatedPropertySet2511); 
            PATH_NEGATED311_tree = (CommonTree)adaptor.dupNode(PATH_NEGATED311);


            root_1 = (CommonTree)adaptor.becomeRoot(PATH_NEGATED311_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:376:22: ( pathOneInPropertySet )+
            int cnt117=0;
            loop117:
            do {
                int alt117=2;
                switch ( input.LA(1) ) {
                case A:
                case INVERSE:
                case IRI_REF:
                case PNAME_LN:
                case PNAME_NS:
                    {
                    alt117=1;
                    }
                    break;

                }

                switch (alt117) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:376:22: pathOneInPropertySet
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet2513);
            	    pathOneInPropertySet312=pathOneInPropertySet();

            	    state._fsp--;

            	    adaptor.addChild(root_1, pathOneInPropertySet312.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt117 >= 1 ) break loop117;
                        EarlyExitException eee =
                            new EarlyExitException(117, input);
                        throw eee;
                }
                cnt117++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathNegatedPropertySet"


    public static class pathOneInPropertySet_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pathOneInPropertySet"
    // com\\googlecode\\sparkleg\\SparqlT.g:379:1: pathOneInPropertySet : ( INVERSE )? ( iriRef | A ) ;
    public final SparqlT.pathOneInPropertySet_return pathOneInPropertySet() throws RecognitionException {
        SparqlT.pathOneInPropertySet_return retval = new SparqlT.pathOneInPropertySet_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INVERSE313=null;
        CommonTree A315=null;
        SparqlT.iriRef_return iriRef314 =null;


        CommonTree INVERSE313_tree=null;
        CommonTree A315_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:380:5: ( ( INVERSE )? ( iriRef | A ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:380:7: ( INVERSE )? ( iriRef | A )
            {
            root_0 = (CommonTree)adaptor.nil();


            // com\\googlecode\\sparkleg\\SparqlT.g:380:7: ( INVERSE )?
            int alt118=2;
            switch ( input.LA(1) ) {
                case INVERSE:
                    {
                    alt118=1;
                    }
                    break;
            }

            switch (alt118) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:380:7: INVERSE
                    {
                    _last = (CommonTree)input.LT(1);
                    INVERSE313=(CommonTree)match(input,INVERSE,FOLLOW_INVERSE_in_pathOneInPropertySet2535); 
                    INVERSE313_tree = (CommonTree)adaptor.dupNode(INVERSE313);


                    adaptor.addChild(root_0, INVERSE313_tree);


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\SparqlT.g:380:16: ( iriRef | A )
            int alt119=2;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt119=1;
                }
                break;
            case A:
                {
                alt119=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;

            }

            switch (alt119) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:380:17: iriRef
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_pathOneInPropertySet2539);
                    iriRef314=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef314.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:380:26: A
                    {
                    _last = (CommonTree)input.LT(1);
                    A315=(CommonTree)match(input,A,FOLLOW_A_in_pathOneInPropertySet2543); 
                    A315_tree = (CommonTree)adaptor.dupNode(A315);


                    adaptor.addChild(root_0, A315_tree);


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pathOneInPropertySet"


    public static class triplesNode_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triplesNode"
    // com\\googlecode\\sparkleg\\SparqlT.g:383:1: triplesNode : ( ^( COLLECTION ( graphNode )+ ) | ^( TRIPLES_NODE propertyListNotEmpty ) );
    public final SparqlT.triplesNode_return triplesNode() throws RecognitionException {
        SparqlT.triplesNode_return retval = new SparqlT.triplesNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLLECTION316=null;
        CommonTree TRIPLES_NODE318=null;
        SparqlT.graphNode_return graphNode317 =null;

        SparqlT.propertyListNotEmpty_return propertyListNotEmpty319 =null;


        CommonTree COLLECTION316_tree=null;
        CommonTree TRIPLES_NODE318_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:384:5: ( ^( COLLECTION ( graphNode )+ ) | ^( TRIPLES_NODE propertyListNotEmpty ) )
            int alt121=2;
            switch ( input.LA(1) ) {
            case COLLECTION:
                {
                alt121=1;
                }
                break;
            case TRIPLES_NODE:
                {
                alt121=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;

            }

            switch (alt121) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:384:7: ^( COLLECTION ( graphNode )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    COLLECTION316=(CommonTree)match(input,COLLECTION,FOLLOW_COLLECTION_in_triplesNode2563); 
                    COLLECTION316_tree = (CommonTree)adaptor.dupNode(COLLECTION316);


                    root_1 = (CommonTree)adaptor.becomeRoot(COLLECTION316_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:384:20: ( graphNode )+
                    int cnt120=0;
                    loop120:
                    do {
                        int alt120=2;
                        switch ( input.LA(1) ) {
                        case BLANK_NODE:
                        case BLANK_NODE_LABEL:
                        case COLLECTION:
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
                        case TRIPLES_NODE:
                        case TRUE:
                        case VAR1:
                        case VAR2:
                            {
                            alt120=1;
                            }
                            break;

                        }

                        switch (alt120) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:384:20: graphNode
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_graphNode_in_triplesNode2565);
                    	    graphNode317=graphNode();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, graphNode317.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt120 >= 1 ) break loop120;
                                EarlyExitException eee =
                                    new EarlyExitException(120, input);
                                throw eee;
                        }
                        cnt120++;
                    } while (true);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:385:7: ^( TRIPLES_NODE propertyListNotEmpty )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    TRIPLES_NODE318=(CommonTree)match(input,TRIPLES_NODE,FOLLOW_TRIPLES_NODE_in_triplesNode2576); 
                    TRIPLES_NODE318_tree = (CommonTree)adaptor.dupNode(TRIPLES_NODE318);


                    root_1 = (CommonTree)adaptor.becomeRoot(TRIPLES_NODE318_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesNode2578);
                    propertyListNotEmpty319=propertyListNotEmpty();

                    state._fsp--;

                    adaptor.addChild(root_1, propertyListNotEmpty319.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triplesNode"


    public static class graphNode_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphNode"
    // com\\googlecode\\sparkleg\\SparqlT.g:388:1: graphNode : ( varOrTerm | triplesNode );
    public final SparqlT.graphNode_return graphNode() throws RecognitionException {
        SparqlT.graphNode_return retval = new SparqlT.graphNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.varOrTerm_return varOrTerm320 =null;

        SparqlT.triplesNode_return triplesNode321 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:389:5: ( varOrTerm | triplesNode )
            int alt122=2;
            switch ( input.LA(1) ) {
            case BLANK_NODE:
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
                alt122=1;
                }
                break;
            case COLLECTION:
            case TRIPLES_NODE:
                {
                alt122=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;

            }

            switch (alt122) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:389:7: varOrTerm
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_varOrTerm_in_graphNode2596);
                    varOrTerm320=varOrTerm();

                    state._fsp--;

                    adaptor.addChild(root_0, varOrTerm320.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:389:19: triplesNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesNode_in_graphNode2600);
                    triplesNode321=triplesNode();

                    state._fsp--;

                    adaptor.addChild(root_0, triplesNode321.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphNode"


    public static class varOrTerm_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varOrTerm"
    // com\\googlecode\\sparkleg\\SparqlT.g:392:1: varOrTerm : ( var | graphTerm | BLANK_NODE );
    public final SparqlT.varOrTerm_return varOrTerm() throws RecognitionException {
        SparqlT.varOrTerm_return retval = new SparqlT.varOrTerm_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLANK_NODE324=null;
        SparqlT.var_return var322 =null;

        SparqlT.graphTerm_return graphTerm323 =null;


        CommonTree BLANK_NODE324_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:393:5: ( var | graphTerm | BLANK_NODE )
            int alt123=3;
            switch ( input.LA(1) ) {
            case VAR1:
            case VAR2:
                {
                alt123=1;
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
                alt123=2;
                }
                break;
            case BLANK_NODE:
                {
                alt123=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;

            }

            switch (alt123) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:393:7: var
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_varOrTerm2617);
                    var322=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var322.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:393:13: graphTerm
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_graphTerm_in_varOrTerm2621);
                    graphTerm323=graphTerm();

                    state._fsp--;

                    adaptor.addChild(root_0, graphTerm323.getTree());


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:393:25: BLANK_NODE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BLANK_NODE324=(CommonTree)match(input,BLANK_NODE,FOLLOW_BLANK_NODE_in_varOrTerm2625); 
                    BLANK_NODE324_tree = (CommonTree)adaptor.dupNode(BLANK_NODE324);


                    adaptor.addChild(root_0, BLANK_NODE324_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varOrTerm"


    public static class varOrIRIref_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varOrIRIref"
    // com\\googlecode\\sparkleg\\SparqlT.g:396:1: varOrIRIref : ( var | iriRef );
    public final SparqlT.varOrIRIref_return varOrIRIref() throws RecognitionException {
        SparqlT.varOrIRIref_return retval = new SparqlT.varOrIRIref_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.var_return var325 =null;

        SparqlT.iriRef_return iriRef326 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:397:5: ( var | iriRef )
            int alt124=2;
            switch ( input.LA(1) ) {
            case VAR1:
            case VAR2:
                {
                alt124=1;
                }
                break;
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt124=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;

            }

            switch (alt124) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:397:7: var
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_varOrIRIref2642);
                    var325=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var325.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:397:13: iriRef
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_varOrIRIref2646);
                    iriRef326=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef326.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varOrIRIref"


    public static class var_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var"
    // com\\googlecode\\sparkleg\\SparqlT.g:400:1: var : ( VAR1 | VAR2 );
    public final SparqlT.var_return var() throws RecognitionException {
        SparqlT.var_return retval = new SparqlT.var_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set327=null;

        CommonTree set327_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:401:5: ( VAR1 | VAR2 )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set327=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= VAR1 && input.LA(1) <= VAR2) ) {
                input.consume();
                set327_tree = (CommonTree)adaptor.dupNode(set327);


                adaptor.addChild(root_0, set327_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var"


    public static class graphTerm_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "graphTerm"
    // com\\googlecode\\sparkleg\\SparqlT.g:404:1: graphTerm : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil );
    public final SparqlT.graphTerm_return graphTerm() throws RecognitionException {
        SparqlT.graphTerm_return retval = new SparqlT.graphTerm_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.iriRef_return iriRef328 =null;

        SparqlT.rdfLiteral_return rdfLiteral329 =null;

        SparqlT.numericLiteral_return numericLiteral330 =null;

        SparqlT.booleanLiteral_return booleanLiteral331 =null;

        SparqlT.blankNode_return blankNode332 =null;

        SparqlT.nil_return nil333 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:405:5: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil )
            int alt125=6;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt125=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt125=2;
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
                alt125=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt125=4;
                }
                break;
            case BLANK_NODE_LABEL:
            case OPEN_SQUARE_BRACKET:
                {
                alt125=5;
                }
                break;
            case OPEN_BRACE:
                {
                alt125=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;

            }

            switch (alt125) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:405:7: iriRef
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_graphTerm2684);
                    iriRef328=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef328.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:406:7: rdfLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_rdfLiteral_in_graphTerm2692);
                    rdfLiteral329=rdfLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, rdfLiteral329.getTree());


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:407:7: numericLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteral_in_graphTerm2700);
                    numericLiteral330=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral330.getTree());


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:408:7: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm2708);
                    booleanLiteral331=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral331.getTree());


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:409:7: blankNode
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_blankNode_in_graphTerm2716);
                    blankNode332=blankNode();

                    state._fsp--;

                    adaptor.addChild(root_0, blankNode332.getTree());


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:410:7: nil
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nil_in_graphTerm2724);
                    nil333=nil();

                    state._fsp--;

                    adaptor.addChild(root_0, nil333.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "graphTerm"


    public static class nil_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nil"
    // com\\googlecode\\sparkleg\\SparqlT.g:413:1: nil : OPEN_BRACE CLOSE_BRACE ;
    public final SparqlT.nil_return nil() throws RecognitionException {
        SparqlT.nil_return retval = new SparqlT.nil_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OPEN_BRACE334=null;
        CommonTree CLOSE_BRACE335=null;

        CommonTree OPEN_BRACE334_tree=null;
        CommonTree CLOSE_BRACE335_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:414:5: ( OPEN_BRACE CLOSE_BRACE )
            // com\\googlecode\\sparkleg\\SparqlT.g:414:7: OPEN_BRACE CLOSE_BRACE
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            OPEN_BRACE334=(CommonTree)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_nil2745); 
            OPEN_BRACE334_tree = (CommonTree)adaptor.dupNode(OPEN_BRACE334);


            adaptor.addChild(root_0, OPEN_BRACE334_tree);


            _last = (CommonTree)input.LT(1);
            CLOSE_BRACE335=(CommonTree)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_nil2747); 
            CLOSE_BRACE335_tree = (CommonTree)adaptor.dupNode(CLOSE_BRACE335);


            adaptor.addChild(root_0, CLOSE_BRACE335_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nil"


    public static class expression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // com\\googlecode\\sparkleg\\SparqlT.g:417:1: expression : ( ^( OR expression expression ) | ^( AND expression expression ) | ^( EQUAL expression expression ) | ^( NOT_EQUAL expression expression ) | ^( LESS expression expression ) | ^( GREATER expression expression ) | ^( LESS_EQUAL expression expression ) | ^( GREATER_EQUAL expression expression ) | ^( IN expression expression ) | ^( NOT IN expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( ASTERISK expression expression ) | ^( DIVIDE expression expression ) | numericLiteralPositive | numericLiteralNegative | unaryExpression );
    public final SparqlT.expression_return expression() throws RecognitionException {
        SparqlT.expression_return retval = new SparqlT.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OR336=null;
        CommonTree AND339=null;
        CommonTree EQUAL342=null;
        CommonTree NOT_EQUAL345=null;
        CommonTree LESS348=null;
        CommonTree GREATER351=null;
        CommonTree LESS_EQUAL354=null;
        CommonTree GREATER_EQUAL357=null;
        CommonTree IN360=null;
        CommonTree NOT363=null;
        CommonTree IN364=null;
        CommonTree PLUS367=null;
        CommonTree MINUS370=null;
        CommonTree ASTERISK373=null;
        CommonTree DIVIDE376=null;
        SparqlT.expression_return expression337 =null;

        SparqlT.expression_return expression338 =null;

        SparqlT.expression_return expression340 =null;

        SparqlT.expression_return expression341 =null;

        SparqlT.expression_return expression343 =null;

        SparqlT.expression_return expression344 =null;

        SparqlT.expression_return expression346 =null;

        SparqlT.expression_return expression347 =null;

        SparqlT.expression_return expression349 =null;

        SparqlT.expression_return expression350 =null;

        SparqlT.expression_return expression352 =null;

        SparqlT.expression_return expression353 =null;

        SparqlT.expression_return expression355 =null;

        SparqlT.expression_return expression356 =null;

        SparqlT.expression_return expression358 =null;

        SparqlT.expression_return expression359 =null;

        SparqlT.expression_return expression361 =null;

        SparqlT.expression_return expression362 =null;

        SparqlT.expression_return expression365 =null;

        SparqlT.expression_return expression366 =null;

        SparqlT.expression_return expression368 =null;

        SparqlT.expression_return expression369 =null;

        SparqlT.expression_return expression371 =null;

        SparqlT.expression_return expression372 =null;

        SparqlT.expression_return expression374 =null;

        SparqlT.expression_return expression375 =null;

        SparqlT.expression_return expression377 =null;

        SparqlT.expression_return expression378 =null;

        SparqlT.numericLiteralPositive_return numericLiteralPositive379 =null;

        SparqlT.numericLiteralNegative_return numericLiteralNegative380 =null;

        SparqlT.unaryExpression_return unaryExpression381 =null;


        CommonTree OR336_tree=null;
        CommonTree AND339_tree=null;
        CommonTree EQUAL342_tree=null;
        CommonTree NOT_EQUAL345_tree=null;
        CommonTree LESS348_tree=null;
        CommonTree GREATER351_tree=null;
        CommonTree LESS_EQUAL354_tree=null;
        CommonTree GREATER_EQUAL357_tree=null;
        CommonTree IN360_tree=null;
        CommonTree NOT363_tree=null;
        CommonTree IN364_tree=null;
        CommonTree PLUS367_tree=null;
        CommonTree MINUS370_tree=null;
        CommonTree ASTERISK373_tree=null;
        CommonTree DIVIDE376_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:418:5: ( ^( OR expression expression ) | ^( AND expression expression ) | ^( EQUAL expression expression ) | ^( NOT_EQUAL expression expression ) | ^( LESS expression expression ) | ^( GREATER expression expression ) | ^( LESS_EQUAL expression expression ) | ^( GREATER_EQUAL expression expression ) | ^( IN expression expression ) | ^( NOT IN expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( ASTERISK expression expression ) | ^( DIVIDE expression expression ) | numericLiteralPositive | numericLiteralNegative | unaryExpression )
            int alt126=17;
            switch ( input.LA(1) ) {
            case OR:
                {
                alt126=1;
                }
                break;
            case AND:
                {
                alt126=2;
                }
                break;
            case EQUAL:
                {
                alt126=3;
                }
                break;
            case NOT_EQUAL:
                {
                alt126=4;
                }
                break;
            case LESS:
                {
                alt126=5;
                }
                break;
            case GREATER:
                {
                alt126=6;
                }
                break;
            case LESS_EQUAL:
                {
                alt126=7;
                }
                break;
            case GREATER_EQUAL:
                {
                alt126=8;
                }
                break;
            case IN:
                {
                alt126=9;
                }
                break;
            case NOT:
                {
                alt126=10;
                }
                break;
            case PLUS:
                {
                alt126=11;
                }
                break;
            case MINUS:
                {
                alt126=12;
                }
                break;
            case ASTERISK:
                {
                alt126=13;
                }
                break;
            case DIVIDE:
                {
                alt126=14;
                }
                break;
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_POSITIVE:
                {
                alt126=15;
                }
                break;
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case INTEGER_NEGATIVE:
                {
                alt126=16;
                }
                break;
            case UNARY:
                {
                alt126=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;

            }

            switch (alt126) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:418:7: ^( OR expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    OR336=(CommonTree)match(input,OR,FOLLOW_OR_in_expression2765); 
                    OR336_tree = (CommonTree)adaptor.dupNode(OR336);


                    root_1 = (CommonTree)adaptor.becomeRoot(OR336_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2767);
                    expression337=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression337.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2769);
                    expression338=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression338.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:419:7: ^( AND expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AND339=(CommonTree)match(input,AND,FOLLOW_AND_in_expression2779); 
                    AND339_tree = (CommonTree)adaptor.dupNode(AND339);


                    root_1 = (CommonTree)adaptor.becomeRoot(AND339_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2781);
                    expression340=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression340.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2783);
                    expression341=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression341.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:420:7: ^( EQUAL expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQUAL342=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_expression2793); 
                    EQUAL342_tree = (CommonTree)adaptor.dupNode(EQUAL342);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQUAL342_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2795);
                    expression343=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression343.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2797);
                    expression344=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression344.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:421:7: ^( NOT_EQUAL expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NOT_EQUAL345=(CommonTree)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expression2809); 
                    NOT_EQUAL345_tree = (CommonTree)adaptor.dupNode(NOT_EQUAL345);


                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_EQUAL345_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2811);
                    expression346=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression346.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2813);
                    expression347=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression347.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:422:7: ^( LESS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LESS348=(CommonTree)match(input,LESS,FOLLOW_LESS_in_expression2823); 
                    LESS348_tree = (CommonTree)adaptor.dupNode(LESS348);


                    root_1 = (CommonTree)adaptor.becomeRoot(LESS348_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2825);
                    expression349=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression349.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2827);
                    expression350=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression350.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:423:7: ^( GREATER expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GREATER351=(CommonTree)match(input,GREATER,FOLLOW_GREATER_in_expression2837); 
                    GREATER351_tree = (CommonTree)adaptor.dupNode(GREATER351);


                    root_1 = (CommonTree)adaptor.becomeRoot(GREATER351_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2839);
                    expression352=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression352.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2841);
                    expression353=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression353.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:424:7: ^( LESS_EQUAL expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LESS_EQUAL354=(CommonTree)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_expression2851); 
                    LESS_EQUAL354_tree = (CommonTree)adaptor.dupNode(LESS_EQUAL354);


                    root_1 = (CommonTree)adaptor.becomeRoot(LESS_EQUAL354_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2853);
                    expression355=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression355.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2855);
                    expression356=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression356.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:425:7: ^( GREATER_EQUAL expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GREATER_EQUAL357=(CommonTree)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_expression2865); 
                    GREATER_EQUAL357_tree = (CommonTree)adaptor.dupNode(GREATER_EQUAL357);


                    root_1 = (CommonTree)adaptor.becomeRoot(GREATER_EQUAL357_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2867);
                    expression358=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression358.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2869);
                    expression359=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression359.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 9 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:426:7: ^( IN expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    IN360=(CommonTree)match(input,IN,FOLLOW_IN_in_expression2881); 
                    IN360_tree = (CommonTree)adaptor.dupNode(IN360);


                    root_1 = (CommonTree)adaptor.becomeRoot(IN360_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2883);
                    expression361=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression361.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2885);
                    expression362=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression362.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 10 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:427:7: ^( NOT IN expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NOT363=(CommonTree)match(input,NOT,FOLLOW_NOT_in_expression2895); 
                    NOT363_tree = (CommonTree)adaptor.dupNode(NOT363);


                    root_1 = (CommonTree)adaptor.becomeRoot(NOT363_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IN364=(CommonTree)match(input,IN,FOLLOW_IN_in_expression2897); 
                    IN364_tree = (CommonTree)adaptor.dupNode(IN364);


                    adaptor.addChild(root_1, IN364_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2899);
                    expression365=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression365.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2901);
                    expression366=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression366.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 11 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:428:7: ^( PLUS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PLUS367=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression2911); 
                    PLUS367_tree = (CommonTree)adaptor.dupNode(PLUS367);


                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS367_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2913);
                    expression368=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression368.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2915);
                    expression369=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression369.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 12 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:429:7: ^( MINUS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS370=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression2925); 
                    MINUS370_tree = (CommonTree)adaptor.dupNode(MINUS370);


                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS370_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2927);
                    expression371=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression371.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2929);
                    expression372=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression372.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 13 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:430:7: ^( ASTERISK expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ASTERISK373=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_expression2940); 
                    ASTERISK373_tree = (CommonTree)adaptor.dupNode(ASTERISK373);


                    root_1 = (CommonTree)adaptor.becomeRoot(ASTERISK373_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2942);
                    expression374=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression374.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2944);
                    expression375=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression375.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 14 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:431:7: ^( DIVIDE expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DIVIDE376=(CommonTree)match(input,DIVIDE,FOLLOW_DIVIDE_in_expression2954); 
                    DIVIDE376_tree = (CommonTree)adaptor.dupNode(DIVIDE376);


                    root_1 = (CommonTree)adaptor.becomeRoot(DIVIDE376_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2956);
                    expression377=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression377.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2958);
                    expression378=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression378.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 15 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:432:7: numericLiteralPositive
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteralPositive_in_expression2967);
                    numericLiteralPositive379=numericLiteralPositive();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralPositive379.getTree());


                    }
                    break;
                case 16 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:433:7: numericLiteralNegative
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteralNegative_in_expression2975);
                    numericLiteralNegative380=numericLiteralNegative();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralNegative380.getTree());


                    }
                    break;
                case 17 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:434:7: unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_unaryExpression_in_expression2983);
                    unaryExpression381=unaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, unaryExpression381.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class unaryExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:437:1: unaryExpression : ( ^( UNARY NEGATION primaryExpression ) | ^( UNARY PLUS primaryExpression ) | ^( UNARY MINUS primaryExpression ) | ^( UNARY primaryExpression ) );
    public final SparqlT.unaryExpression_return unaryExpression() throws RecognitionException {
        SparqlT.unaryExpression_return retval = new SparqlT.unaryExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNARY382=null;
        CommonTree NEGATION383=null;
        CommonTree UNARY385=null;
        CommonTree PLUS386=null;
        CommonTree UNARY388=null;
        CommonTree MINUS389=null;
        CommonTree UNARY391=null;
        SparqlT.primaryExpression_return primaryExpression384 =null;

        SparqlT.primaryExpression_return primaryExpression387 =null;

        SparqlT.primaryExpression_return primaryExpression390 =null;

        SparqlT.primaryExpression_return primaryExpression392 =null;


        CommonTree UNARY382_tree=null;
        CommonTree NEGATION383_tree=null;
        CommonTree UNARY385_tree=null;
        CommonTree PLUS386_tree=null;
        CommonTree UNARY388_tree=null;
        CommonTree MINUS389_tree=null;
        CommonTree UNARY391_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:438:5: ( ^( UNARY NEGATION primaryExpression ) | ^( UNARY PLUS primaryExpression ) | ^( UNARY MINUS primaryExpression ) | ^( UNARY primaryExpression ) )
            int alt127=4;
            switch ( input.LA(1) ) {
            case UNARY:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case NEGATION:
                        {
                        alt127=1;
                        }
                        break;
                    case PLUS:
                        {
                        alt127=2;
                        }
                        break;
                    case MINUS:
                        {
                        alt127=3;
                        }
                        break;
                    case ABS:
                    case AVG:
                    case BNODE:
                    case BOUND:
                    case BRACKETTED_EXPRESSION:
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
                    case FUNCTION:
                    case GROUP_CONCAT:
                    case HOURS:
                    case IF:
                    case INTEGER:
                    case INTEGER_NEGATIVE:
                    case INTEGER_POSITIVE:
                    case IRI:
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
                    case NOT_EXISTS:
                    case NOW:
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
                        alt127=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;

            }

            switch (alt127) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:438:7: ^( UNARY NEGATION primaryExpression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    UNARY382=(CommonTree)match(input,UNARY,FOLLOW_UNARY_in_unaryExpression3006); 
                    UNARY382_tree = (CommonTree)adaptor.dupNode(UNARY382);


                    root_1 = (CommonTree)adaptor.becomeRoot(UNARY382_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NEGATION383=(CommonTree)match(input,NEGATION,FOLLOW_NEGATION_in_unaryExpression3008); 
                    NEGATION383_tree = (CommonTree)adaptor.dupNode(NEGATION383);


                    adaptor.addChild(root_1, NEGATION383_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression3010);
                    primaryExpression384=primaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_1, primaryExpression384.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:439:7: ^( UNARY PLUS primaryExpression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    UNARY385=(CommonTree)match(input,UNARY,FOLLOW_UNARY_in_unaryExpression3020); 
                    UNARY385_tree = (CommonTree)adaptor.dupNode(UNARY385);


                    root_1 = (CommonTree)adaptor.becomeRoot(UNARY385_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    PLUS386=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression3022); 
                    PLUS386_tree = (CommonTree)adaptor.dupNode(PLUS386);


                    adaptor.addChild(root_1, PLUS386_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression3024);
                    primaryExpression387=primaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_1, primaryExpression387.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:440:7: ^( UNARY MINUS primaryExpression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    UNARY388=(CommonTree)match(input,UNARY,FOLLOW_UNARY_in_unaryExpression3034); 
                    UNARY388_tree = (CommonTree)adaptor.dupNode(UNARY388);


                    root_1 = (CommonTree)adaptor.becomeRoot(UNARY388_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    MINUS389=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression3036); 
                    MINUS389_tree = (CommonTree)adaptor.dupNode(MINUS389);


                    adaptor.addChild(root_1, MINUS389_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression3038);
                    primaryExpression390=primaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_1, primaryExpression390.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:441:7: ^( UNARY primaryExpression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    UNARY391=(CommonTree)match(input,UNARY,FOLLOW_UNARY_in_unaryExpression3048); 
                    UNARY391_tree = (CommonTree)adaptor.dupNode(UNARY391);


                    root_1 = (CommonTree)adaptor.becomeRoot(UNARY391_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression3050);
                    primaryExpression392=primaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_1, primaryExpression392.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"


    public static class primaryExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primaryExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:444:1: primaryExpression : ( brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate );
    public final SparqlT.primaryExpression_return primaryExpression() throws RecognitionException {
        SparqlT.primaryExpression_return retval = new SparqlT.primaryExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.brackettedExpression_return brackettedExpression393 =null;

        SparqlT.builtInCall_return builtInCall394 =null;

        SparqlT.iriRefOrFunction_return iriRefOrFunction395 =null;

        SparqlT.rdfLiteral_return rdfLiteral396 =null;

        SparqlT.numericLiteral_return numericLiteral397 =null;

        SparqlT.booleanLiteral_return booleanLiteral398 =null;

        SparqlT.var_return var399 =null;

        SparqlT.aggregate_return aggregate400 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:445:5: ( brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate )
            int alt128=8;
            switch ( input.LA(1) ) {
            case BRACKETTED_EXPRESSION:
                {
                alt128=1;
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
            case NOT_EXISTS:
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
                alt128=2;
                }
                break;
            case FUNCTION:
                {
                alt128=3;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt128=4;
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
                alt128=5;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt128=6;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt128=7;
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
                alt128=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;

            }

            switch (alt128) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:445:7: brackettedExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_brackettedExpression_in_primaryExpression3069);
                    brackettedExpression393=brackettedExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, brackettedExpression393.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:445:30: builtInCall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_builtInCall_in_primaryExpression3073);
                    builtInCall394=builtInCall();

                    state._fsp--;

                    adaptor.addChild(root_0, builtInCall394.getTree());


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:445:44: iriRefOrFunction
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRefOrFunction_in_primaryExpression3077);
                    iriRefOrFunction395=iriRefOrFunction();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRefOrFunction395.getTree());


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:445:63: rdfLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_rdfLiteral_in_primaryExpression3081);
                    rdfLiteral396=rdfLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, rdfLiteral396.getTree());


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:445:76: numericLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteral_in_primaryExpression3085);
                    numericLiteral397=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral397.getTree());


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:445:93: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression3089);
                    booleanLiteral398=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral398.getTree());


                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:445:110: var
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_primaryExpression3093);
                    var399=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var399.getTree());


                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:445:116: aggregate
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_aggregate_in_primaryExpression3097);
                    aggregate400=aggregate();

                    state._fsp--;

                    adaptor.addChild(root_0, aggregate400.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"


    public static class brackettedExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "brackettedExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:448:1: brackettedExpression : ^( BRACKETTED_EXPRESSION e= expression ) ;
    public final SparqlT.brackettedExpression_return brackettedExpression() throws RecognitionException {
        SparqlT.brackettedExpression_return retval = new SparqlT.brackettedExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BRACKETTED_EXPRESSION401=null;
        SparqlT.expression_return e =null;


        CommonTree BRACKETTED_EXPRESSION401_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:449:5: ( ^( BRACKETTED_EXPRESSION e= expression ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:449:7: ^( BRACKETTED_EXPRESSION e= expression )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            BRACKETTED_EXPRESSION401=(CommonTree)match(input,BRACKETTED_EXPRESSION,FOLLOW_BRACKETTED_EXPRESSION_in_brackettedExpression3115); 
            BRACKETTED_EXPRESSION401_tree = (CommonTree)adaptor.dupNode(BRACKETTED_EXPRESSION401);


            root_1 = (CommonTree)adaptor.becomeRoot(BRACKETTED_EXPRESSION401_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_brackettedExpression3119);
            e=expression();

            state._fsp--;

            adaptor.addChild(root_1, e.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "brackettedExpression"


    public static class builtInCall_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "builtInCall"
    // com\\googlecode\\sparkleg\\SparqlT.g:452:1: builtInCall : ( ^( STR expression ) | ^( LANG expression ) | ^( LANGMATCHES ( expression )+ ) | ^( DATATYPE expression ) | ^( BOUND var ) | ^( IRI expression ) | ^( URI expression ) | ^( BNODE expression ) | BNODE | RAND | ^( ABS expression ) | ^( CEIL expression ) | ^( FLOOR expression ) | ^( ROUND expression ) | ^( CONCAT expressionList ) | subStringExpression | ^( STRLEN expression ) | ^( UCASE expression ) | ^( LCASE expression ) | ^( ENCODE_FOR_URI expression ) | ^( CONTAINS expression expression ) | ^( STRSTARTS expression expression ) | ^( STRENDS expression expression ) | ^( STRBEFORE expression expression ) | ^( STRAFTER expression expression ) | ^( REPLACE expression expression expression ) | ^( YEAR expression ) | ^( MONTH expression ) | ^( DAY expression ) | ^( HOURS expression ) | ^( MINUTES expression ) | ^( SECONDS expression ) | ^( TIMEZONE expression ) | ^( TZ expression ) | NOW | ^( MD5 expression ) | ^( SHA1 expression ) | ^( SHA224 expression ) | ^( SHA256 expression ) | ^( SHA384 expression ) | ^( SHA512 expression ) | ^( COALESCE expressionList ) | ^( IF expression expression expression ) | ^( STRLANG expression expression ) | ^( STRDT expression expression ) | ^( SAMETERM expression expression ) | ^( ISIRI expression ) | ^( ISURI expression ) | ^( ISBLANK expression ) | ^( ISLITERAL expression ) | ^( ISNUMERIC expression ) | regexExpression | existsFunction | notExistsFunction );
    public final SparqlT.builtInCall_return builtInCall() throws RecognitionException {
        SparqlT.builtInCall_return retval = new SparqlT.builtInCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STR402=null;
        CommonTree LANG404=null;
        CommonTree LANGMATCHES406=null;
        CommonTree DATATYPE408=null;
        CommonTree BOUND410=null;
        CommonTree IRI412=null;
        CommonTree URI414=null;
        CommonTree BNODE416=null;
        CommonTree BNODE418=null;
        CommonTree RAND419=null;
        CommonTree ABS420=null;
        CommonTree CEIL422=null;
        CommonTree FLOOR424=null;
        CommonTree ROUND426=null;
        CommonTree CONCAT428=null;
        CommonTree STRLEN431=null;
        CommonTree UCASE433=null;
        CommonTree LCASE435=null;
        CommonTree ENCODE_FOR_URI437=null;
        CommonTree CONTAINS439=null;
        CommonTree STRSTARTS442=null;
        CommonTree STRENDS445=null;
        CommonTree STRBEFORE448=null;
        CommonTree STRAFTER451=null;
        CommonTree REPLACE454=null;
        CommonTree YEAR458=null;
        CommonTree MONTH460=null;
        CommonTree DAY462=null;
        CommonTree HOURS464=null;
        CommonTree MINUTES466=null;
        CommonTree SECONDS468=null;
        CommonTree TIMEZONE470=null;
        CommonTree TZ472=null;
        CommonTree NOW474=null;
        CommonTree MD5475=null;
        CommonTree SHA1477=null;
        CommonTree SHA224479=null;
        CommonTree SHA256481=null;
        CommonTree SHA384483=null;
        CommonTree SHA512485=null;
        CommonTree COALESCE487=null;
        CommonTree IF489=null;
        CommonTree STRLANG493=null;
        CommonTree STRDT496=null;
        CommonTree SAMETERM499=null;
        CommonTree ISIRI502=null;
        CommonTree ISURI504=null;
        CommonTree ISBLANK506=null;
        CommonTree ISLITERAL508=null;
        CommonTree ISNUMERIC510=null;
        SparqlT.expression_return expression403 =null;

        SparqlT.expression_return expression405 =null;

        SparqlT.expression_return expression407 =null;

        SparqlT.expression_return expression409 =null;

        SparqlT.var_return var411 =null;

        SparqlT.expression_return expression413 =null;

        SparqlT.expression_return expression415 =null;

        SparqlT.expression_return expression417 =null;

        SparqlT.expression_return expression421 =null;

        SparqlT.expression_return expression423 =null;

        SparqlT.expression_return expression425 =null;

        SparqlT.expression_return expression427 =null;

        SparqlT.expressionList_return expressionList429 =null;

        SparqlT.subStringExpression_return subStringExpression430 =null;

        SparqlT.expression_return expression432 =null;

        SparqlT.expression_return expression434 =null;

        SparqlT.expression_return expression436 =null;

        SparqlT.expression_return expression438 =null;

        SparqlT.expression_return expression440 =null;

        SparqlT.expression_return expression441 =null;

        SparqlT.expression_return expression443 =null;

        SparqlT.expression_return expression444 =null;

        SparqlT.expression_return expression446 =null;

        SparqlT.expression_return expression447 =null;

        SparqlT.expression_return expression449 =null;

        SparqlT.expression_return expression450 =null;

        SparqlT.expression_return expression452 =null;

        SparqlT.expression_return expression453 =null;

        SparqlT.expression_return expression455 =null;

        SparqlT.expression_return expression456 =null;

        SparqlT.expression_return expression457 =null;

        SparqlT.expression_return expression459 =null;

        SparqlT.expression_return expression461 =null;

        SparqlT.expression_return expression463 =null;

        SparqlT.expression_return expression465 =null;

        SparqlT.expression_return expression467 =null;

        SparqlT.expression_return expression469 =null;

        SparqlT.expression_return expression471 =null;

        SparqlT.expression_return expression473 =null;

        SparqlT.expression_return expression476 =null;

        SparqlT.expression_return expression478 =null;

        SparqlT.expression_return expression480 =null;

        SparqlT.expression_return expression482 =null;

        SparqlT.expression_return expression484 =null;

        SparqlT.expression_return expression486 =null;

        SparqlT.expressionList_return expressionList488 =null;

        SparqlT.expression_return expression490 =null;

        SparqlT.expression_return expression491 =null;

        SparqlT.expression_return expression492 =null;

        SparqlT.expression_return expression494 =null;

        SparqlT.expression_return expression495 =null;

        SparqlT.expression_return expression497 =null;

        SparqlT.expression_return expression498 =null;

        SparqlT.expression_return expression500 =null;

        SparqlT.expression_return expression501 =null;

        SparqlT.expression_return expression503 =null;

        SparqlT.expression_return expression505 =null;

        SparqlT.expression_return expression507 =null;

        SparqlT.expression_return expression509 =null;

        SparqlT.expression_return expression511 =null;

        SparqlT.regexExpression_return regexExpression512 =null;

        SparqlT.existsFunction_return existsFunction513 =null;

        SparqlT.notExistsFunction_return notExistsFunction514 =null;


        CommonTree STR402_tree=null;
        CommonTree LANG404_tree=null;
        CommonTree LANGMATCHES406_tree=null;
        CommonTree DATATYPE408_tree=null;
        CommonTree BOUND410_tree=null;
        CommonTree IRI412_tree=null;
        CommonTree URI414_tree=null;
        CommonTree BNODE416_tree=null;
        CommonTree BNODE418_tree=null;
        CommonTree RAND419_tree=null;
        CommonTree ABS420_tree=null;
        CommonTree CEIL422_tree=null;
        CommonTree FLOOR424_tree=null;
        CommonTree ROUND426_tree=null;
        CommonTree CONCAT428_tree=null;
        CommonTree STRLEN431_tree=null;
        CommonTree UCASE433_tree=null;
        CommonTree LCASE435_tree=null;
        CommonTree ENCODE_FOR_URI437_tree=null;
        CommonTree CONTAINS439_tree=null;
        CommonTree STRSTARTS442_tree=null;
        CommonTree STRENDS445_tree=null;
        CommonTree STRBEFORE448_tree=null;
        CommonTree STRAFTER451_tree=null;
        CommonTree REPLACE454_tree=null;
        CommonTree YEAR458_tree=null;
        CommonTree MONTH460_tree=null;
        CommonTree DAY462_tree=null;
        CommonTree HOURS464_tree=null;
        CommonTree MINUTES466_tree=null;
        CommonTree SECONDS468_tree=null;
        CommonTree TIMEZONE470_tree=null;
        CommonTree TZ472_tree=null;
        CommonTree NOW474_tree=null;
        CommonTree MD5475_tree=null;
        CommonTree SHA1477_tree=null;
        CommonTree SHA224479_tree=null;
        CommonTree SHA256481_tree=null;
        CommonTree SHA384483_tree=null;
        CommonTree SHA512485_tree=null;
        CommonTree COALESCE487_tree=null;
        CommonTree IF489_tree=null;
        CommonTree STRLANG493_tree=null;
        CommonTree STRDT496_tree=null;
        CommonTree SAMETERM499_tree=null;
        CommonTree ISIRI502_tree=null;
        CommonTree ISURI504_tree=null;
        CommonTree ISBLANK506_tree=null;
        CommonTree ISLITERAL508_tree=null;
        CommonTree ISNUMERIC510_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:453:5: ( ^( STR expression ) | ^( LANG expression ) | ^( LANGMATCHES ( expression )+ ) | ^( DATATYPE expression ) | ^( BOUND var ) | ^( IRI expression ) | ^( URI expression ) | ^( BNODE expression ) | BNODE | RAND | ^( ABS expression ) | ^( CEIL expression ) | ^( FLOOR expression ) | ^( ROUND expression ) | ^( CONCAT expressionList ) | subStringExpression | ^( STRLEN expression ) | ^( UCASE expression ) | ^( LCASE expression ) | ^( ENCODE_FOR_URI expression ) | ^( CONTAINS expression expression ) | ^( STRSTARTS expression expression ) | ^( STRENDS expression expression ) | ^( STRBEFORE expression expression ) | ^( STRAFTER expression expression ) | ^( REPLACE expression expression expression ) | ^( YEAR expression ) | ^( MONTH expression ) | ^( DAY expression ) | ^( HOURS expression ) | ^( MINUTES expression ) | ^( SECONDS expression ) | ^( TIMEZONE expression ) | ^( TZ expression ) | NOW | ^( MD5 expression ) | ^( SHA1 expression ) | ^( SHA224 expression ) | ^( SHA256 expression ) | ^( SHA384 expression ) | ^( SHA512 expression ) | ^( COALESCE expressionList ) | ^( IF expression expression expression ) | ^( STRLANG expression expression ) | ^( STRDT expression expression ) | ^( SAMETERM expression expression ) | ^( ISIRI expression ) | ^( ISURI expression ) | ^( ISBLANK expression ) | ^( ISLITERAL expression ) | ^( ISNUMERIC expression ) | regexExpression | existsFunction | notExistsFunction )
            int alt130=54;
            switch ( input.LA(1) ) {
            case STR:
                {
                alt130=1;
                }
                break;
            case LANG:
                {
                alt130=2;
                }
                break;
            case LANGMATCHES:
                {
                alt130=3;
                }
                break;
            case DATATYPE:
                {
                alt130=4;
                }
                break;
            case BOUND:
                {
                alt130=5;
                }
                break;
            case IRI:
                {
                alt130=6;
                }
                break;
            case URI:
                {
                alt130=7;
                }
                break;
            case BNODE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    alt130=8;
                    }
                    break;
                case UP:
                case ABS:
                case AND:
                case ASTERISK:
                case BNODE:
                case BOUND:
                case CEIL:
                case COALESCE:
                case CONCAT:
                case CONTAINS:
                case DATATYPE:
                case DAY:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DIVIDE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case ENCODE_FOR_URI:
                case EQUAL:
                case EXISTS:
                case FLOOR:
                case FUNCTION:
                case GREATER:
                case GREATER_EQUAL:
                case HOURS:
                case IF:
                case IN:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case IRI:
                case ISBLANK:
                case ISIRI:
                case ISLITERAL:
                case ISNUMERIC:
                case ISURI:
                case LANG:
                case LANGMATCHES:
                case LCASE:
                case LESS:
                case LESS_EQUAL:
                case MD5:
                case MINUS:
                case MINUTES:
                case MONTH:
                case NOT:
                case NOT_EQUAL:
                case NOT_EXISTS:
                case NOW:
                case OR:
                case PLUS:
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
                case UNARY:
                case URI:
                case YEAR:
                    {
                    alt130=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 8, input);

                    throw nvae;

                }

                }
                break;
            case RAND:
                {
                alt130=10;
                }
                break;
            case ABS:
                {
                alt130=11;
                }
                break;
            case CEIL:
                {
                alt130=12;
                }
                break;
            case FLOOR:
                {
                alt130=13;
                }
                break;
            case ROUND:
                {
                alt130=14;
                }
                break;
            case CONCAT:
                {
                alt130=15;
                }
                break;
            case SUBSTR:
                {
                alt130=16;
                }
                break;
            case STRLEN:
                {
                alt130=17;
                }
                break;
            case UCASE:
                {
                alt130=18;
                }
                break;
            case LCASE:
                {
                alt130=19;
                }
                break;
            case ENCODE_FOR_URI:
                {
                alt130=20;
                }
                break;
            case CONTAINS:
                {
                alt130=21;
                }
                break;
            case STRSTARTS:
                {
                alt130=22;
                }
                break;
            case STRENDS:
                {
                alt130=23;
                }
                break;
            case STRBEFORE:
                {
                alt130=24;
                }
                break;
            case STRAFTER:
                {
                alt130=25;
                }
                break;
            case REPLACE:
                {
                alt130=26;
                }
                break;
            case YEAR:
                {
                alt130=27;
                }
                break;
            case MONTH:
                {
                alt130=28;
                }
                break;
            case DAY:
                {
                alt130=29;
                }
                break;
            case HOURS:
                {
                alt130=30;
                }
                break;
            case MINUTES:
                {
                alt130=31;
                }
                break;
            case SECONDS:
                {
                alt130=32;
                }
                break;
            case TIMEZONE:
                {
                alt130=33;
                }
                break;
            case TZ:
                {
                alt130=34;
                }
                break;
            case NOW:
                {
                alt130=35;
                }
                break;
            case MD5:
                {
                alt130=36;
                }
                break;
            case SHA1:
                {
                alt130=37;
                }
                break;
            case SHA224:
                {
                alt130=38;
                }
                break;
            case SHA256:
                {
                alt130=39;
                }
                break;
            case SHA384:
                {
                alt130=40;
                }
                break;
            case SHA512:
                {
                alt130=41;
                }
                break;
            case COALESCE:
                {
                alt130=42;
                }
                break;
            case IF:
                {
                alt130=43;
                }
                break;
            case STRLANG:
                {
                alt130=44;
                }
                break;
            case STRDT:
                {
                alt130=45;
                }
                break;
            case SAMETERM:
                {
                alt130=46;
                }
                break;
            case ISIRI:
                {
                alt130=47;
                }
                break;
            case ISURI:
                {
                alt130=48;
                }
                break;
            case ISBLANK:
                {
                alt130=49;
                }
                break;
            case ISLITERAL:
                {
                alt130=50;
                }
                break;
            case ISNUMERIC:
                {
                alt130=51;
                }
                break;
            case REGEX:
                {
                alt130=52;
                }
                break;
            case EXISTS:
                {
                alt130=53;
                }
                break;
            case NOT_EXISTS:
                {
                alt130=54;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;

            }

            switch (alt130) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:453:7: ^( STR expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    STR402=(CommonTree)match(input,STR,FOLLOW_STR_in_builtInCall3138); 
                    STR402_tree = (CommonTree)adaptor.dupNode(STR402);


                    root_1 = (CommonTree)adaptor.becomeRoot(STR402_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3140);
                    expression403=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression403.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:454:7: ^( LANG expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LANG404=(CommonTree)match(input,LANG,FOLLOW_LANG_in_builtInCall3150); 
                    LANG404_tree = (CommonTree)adaptor.dupNode(LANG404);


                    root_1 = (CommonTree)adaptor.becomeRoot(LANG404_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3152);
                    expression405=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression405.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:455:7: ^( LANGMATCHES ( expression )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LANGMATCHES406=(CommonTree)match(input,LANGMATCHES,FOLLOW_LANGMATCHES_in_builtInCall3162); 
                    LANGMATCHES406_tree = (CommonTree)adaptor.dupNode(LANGMATCHES406);


                    root_1 = (CommonTree)adaptor.becomeRoot(LANGMATCHES406_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:455:21: ( expression )+
                    int cnt129=0;
                    loop129:
                    do {
                        int alt129=2;
                        switch ( input.LA(1) ) {
                        case AND:
                        case ASTERISK:
                        case DECIMAL_NEGATIVE:
                        case DECIMAL_POSITIVE:
                        case DIVIDE:
                        case DOUBLE_NEGATIVE:
                        case DOUBLE_POSITIVE:
                        case EQUAL:
                        case GREATER:
                        case GREATER_EQUAL:
                        case IN:
                        case INTEGER_NEGATIVE:
                        case INTEGER_POSITIVE:
                        case LESS:
                        case LESS_EQUAL:
                        case MINUS:
                        case NOT:
                        case NOT_EQUAL:
                        case OR:
                        case PLUS:
                        case UNARY:
                            {
                            alt129=1;
                            }
                            break;

                        }

                        switch (alt129) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:455:21: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_builtInCall3164);
                    	    expression407=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, expression407.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt129 >= 1 ) break loop129;
                                EarlyExitException eee =
                                    new EarlyExitException(129, input);
                                throw eee;
                        }
                        cnt129++;
                    } while (true);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:456:7: ^( DATATYPE expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DATATYPE408=(CommonTree)match(input,DATATYPE,FOLLOW_DATATYPE_in_builtInCall3175); 
                    DATATYPE408_tree = (CommonTree)adaptor.dupNode(DATATYPE408);


                    root_1 = (CommonTree)adaptor.becomeRoot(DATATYPE408_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3177);
                    expression409=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression409.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:457:7: ^( BOUND var )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BOUND410=(CommonTree)match(input,BOUND,FOLLOW_BOUND_in_builtInCall3187); 
                    BOUND410_tree = (CommonTree)adaptor.dupNode(BOUND410);


                    root_1 = (CommonTree)adaptor.becomeRoot(BOUND410_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_builtInCall3189);
                    var411=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var411.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:458:7: ^( IRI expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    IRI412=(CommonTree)match(input,IRI,FOLLOW_IRI_in_builtInCall3199); 
                    IRI412_tree = (CommonTree)adaptor.dupNode(IRI412);


                    root_1 = (CommonTree)adaptor.becomeRoot(IRI412_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3201);
                    expression413=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression413.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:459:7: ^( URI expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    URI414=(CommonTree)match(input,URI,FOLLOW_URI_in_builtInCall3211); 
                    URI414_tree = (CommonTree)adaptor.dupNode(URI414);


                    root_1 = (CommonTree)adaptor.becomeRoot(URI414_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3213);
                    expression415=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression415.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:460:7: ^( BNODE expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BNODE416=(CommonTree)match(input,BNODE,FOLLOW_BNODE_in_builtInCall3223); 
                    BNODE416_tree = (CommonTree)adaptor.dupNode(BNODE416);


                    root_1 = (CommonTree)adaptor.becomeRoot(BNODE416_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3225);
                    expression417=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression417.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 9 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:461:7: BNODE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BNODE418=(CommonTree)match(input,BNODE,FOLLOW_BNODE_in_builtInCall3234); 
                    BNODE418_tree = (CommonTree)adaptor.dupNode(BNODE418);


                    adaptor.addChild(root_0, BNODE418_tree);


                    }
                    break;
                case 10 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:462:7: RAND
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    RAND419=(CommonTree)match(input,RAND,FOLLOW_RAND_in_builtInCall3242); 
                    RAND419_tree = (CommonTree)adaptor.dupNode(RAND419);


                    adaptor.addChild(root_0, RAND419_tree);


                    }
                    break;
                case 11 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:463:7: ^( ABS expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ABS420=(CommonTree)match(input,ABS,FOLLOW_ABS_in_builtInCall3251); 
                    ABS420_tree = (CommonTree)adaptor.dupNode(ABS420);


                    root_1 = (CommonTree)adaptor.becomeRoot(ABS420_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3253);
                    expression421=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression421.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 12 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:464:7: ^( CEIL expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CEIL422=(CommonTree)match(input,CEIL,FOLLOW_CEIL_in_builtInCall3263); 
                    CEIL422_tree = (CommonTree)adaptor.dupNode(CEIL422);


                    root_1 = (CommonTree)adaptor.becomeRoot(CEIL422_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3265);
                    expression423=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression423.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 13 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:465:7: ^( FLOOR expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    FLOOR424=(CommonTree)match(input,FLOOR,FOLLOW_FLOOR_in_builtInCall3275); 
                    FLOOR424_tree = (CommonTree)adaptor.dupNode(FLOOR424);


                    root_1 = (CommonTree)adaptor.becomeRoot(FLOOR424_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3277);
                    expression425=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression425.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 14 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:466:7: ^( ROUND expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ROUND426=(CommonTree)match(input,ROUND,FOLLOW_ROUND_in_builtInCall3287); 
                    ROUND426_tree = (CommonTree)adaptor.dupNode(ROUND426);


                    root_1 = (CommonTree)adaptor.becomeRoot(ROUND426_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3289);
                    expression427=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression427.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 15 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:467:7: ^( CONCAT expressionList )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONCAT428=(CommonTree)match(input,CONCAT,FOLLOW_CONCAT_in_builtInCall3299); 
                    CONCAT428_tree = (CommonTree)adaptor.dupNode(CONCAT428);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONCAT428_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expressionList_in_builtInCall3301);
                    expressionList429=expressionList();

                    state._fsp--;

                    adaptor.addChild(root_1, expressionList429.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 16 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:468:7: subStringExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subStringExpression_in_builtInCall3310);
                    subStringExpression430=subStringExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, subStringExpression430.getTree());


                    }
                    break;
                case 17 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:469:7: ^( STRLEN expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    STRLEN431=(CommonTree)match(input,STRLEN,FOLLOW_STRLEN_in_builtInCall3319); 
                    STRLEN431_tree = (CommonTree)adaptor.dupNode(STRLEN431);


                    root_1 = (CommonTree)adaptor.becomeRoot(STRLEN431_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3321);
                    expression432=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression432.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 18 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:470:7: ^( UCASE expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    UCASE433=(CommonTree)match(input,UCASE,FOLLOW_UCASE_in_builtInCall3331); 
                    UCASE433_tree = (CommonTree)adaptor.dupNode(UCASE433);


                    root_1 = (CommonTree)adaptor.becomeRoot(UCASE433_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3333);
                    expression434=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression434.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 19 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:471:7: ^( LCASE expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LCASE435=(CommonTree)match(input,LCASE,FOLLOW_LCASE_in_builtInCall3343); 
                    LCASE435_tree = (CommonTree)adaptor.dupNode(LCASE435);


                    root_1 = (CommonTree)adaptor.becomeRoot(LCASE435_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3345);
                    expression436=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression436.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 20 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:472:7: ^( ENCODE_FOR_URI expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ENCODE_FOR_URI437=(CommonTree)match(input,ENCODE_FOR_URI,FOLLOW_ENCODE_FOR_URI_in_builtInCall3355); 
                    ENCODE_FOR_URI437_tree = (CommonTree)adaptor.dupNode(ENCODE_FOR_URI437);


                    root_1 = (CommonTree)adaptor.becomeRoot(ENCODE_FOR_URI437_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3357);
                    expression438=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression438.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 21 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:473:7: ^( CONTAINS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONTAINS439=(CommonTree)match(input,CONTAINS,FOLLOW_CONTAINS_in_builtInCall3367); 
                    CONTAINS439_tree = (CommonTree)adaptor.dupNode(CONTAINS439);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONTAINS439_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3369);
                    expression440=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression440.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3371);
                    expression441=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression441.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 22 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:474:7: ^( STRSTARTS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    STRSTARTS442=(CommonTree)match(input,STRSTARTS,FOLLOW_STRSTARTS_in_builtInCall3381); 
                    STRSTARTS442_tree = (CommonTree)adaptor.dupNode(STRSTARTS442);


                    root_1 = (CommonTree)adaptor.becomeRoot(STRSTARTS442_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3383);
                    expression443=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression443.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3385);
                    expression444=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression444.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 23 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:475:7: ^( STRENDS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    STRENDS445=(CommonTree)match(input,STRENDS,FOLLOW_STRENDS_in_builtInCall3395); 
                    STRENDS445_tree = (CommonTree)adaptor.dupNode(STRENDS445);


                    root_1 = (CommonTree)adaptor.becomeRoot(STRENDS445_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3397);
                    expression446=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression446.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3399);
                    expression447=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression447.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 24 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:476:7: ^( STRBEFORE expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    STRBEFORE448=(CommonTree)match(input,STRBEFORE,FOLLOW_STRBEFORE_in_builtInCall3409); 
                    STRBEFORE448_tree = (CommonTree)adaptor.dupNode(STRBEFORE448);


                    root_1 = (CommonTree)adaptor.becomeRoot(STRBEFORE448_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3411);
                    expression449=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression449.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3413);
                    expression450=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression450.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 25 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:477:7: ^( STRAFTER expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    STRAFTER451=(CommonTree)match(input,STRAFTER,FOLLOW_STRAFTER_in_builtInCall3423); 
                    STRAFTER451_tree = (CommonTree)adaptor.dupNode(STRAFTER451);


                    root_1 = (CommonTree)adaptor.becomeRoot(STRAFTER451_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3425);
                    expression452=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression452.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3427);
                    expression453=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression453.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 26 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:478:7: ^( REPLACE expression expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    REPLACE454=(CommonTree)match(input,REPLACE,FOLLOW_REPLACE_in_builtInCall3437); 
                    REPLACE454_tree = (CommonTree)adaptor.dupNode(REPLACE454);


                    root_1 = (CommonTree)adaptor.becomeRoot(REPLACE454_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3439);
                    expression455=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression455.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3441);
                    expression456=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression456.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3443);
                    expression457=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression457.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 27 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:479:7: ^( YEAR expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    YEAR458=(CommonTree)match(input,YEAR,FOLLOW_YEAR_in_builtInCall3453); 
                    YEAR458_tree = (CommonTree)adaptor.dupNode(YEAR458);


                    root_1 = (CommonTree)adaptor.becomeRoot(YEAR458_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3455);
                    expression459=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression459.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 28 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:480:7: ^( MONTH expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MONTH460=(CommonTree)match(input,MONTH,FOLLOW_MONTH_in_builtInCall3465); 
                    MONTH460_tree = (CommonTree)adaptor.dupNode(MONTH460);


                    root_1 = (CommonTree)adaptor.becomeRoot(MONTH460_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3467);
                    expression461=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression461.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 29 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:481:7: ^( DAY expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DAY462=(CommonTree)match(input,DAY,FOLLOW_DAY_in_builtInCall3477); 
                    DAY462_tree = (CommonTree)adaptor.dupNode(DAY462);


                    root_1 = (CommonTree)adaptor.becomeRoot(DAY462_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3479);
                    expression463=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression463.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 30 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:482:7: ^( HOURS expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    HOURS464=(CommonTree)match(input,HOURS,FOLLOW_HOURS_in_builtInCall3489); 
                    HOURS464_tree = (CommonTree)adaptor.dupNode(HOURS464);


                    root_1 = (CommonTree)adaptor.becomeRoot(HOURS464_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3491);
                    expression465=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression465.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 31 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:483:7: ^( MINUTES expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUTES466=(CommonTree)match(input,MINUTES,FOLLOW_MINUTES_in_builtInCall3501); 
                    MINUTES466_tree = (CommonTree)adaptor.dupNode(MINUTES466);


                    root_1 = (CommonTree)adaptor.becomeRoot(MINUTES466_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3503);
                    expression467=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression467.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 32 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:484:7: ^( SECONDS expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SECONDS468=(CommonTree)match(input,SECONDS,FOLLOW_SECONDS_in_builtInCall3513); 
                    SECONDS468_tree = (CommonTree)adaptor.dupNode(SECONDS468);


                    root_1 = (CommonTree)adaptor.becomeRoot(SECONDS468_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3515);
                    expression469=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression469.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 33 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:485:7: ^( TIMEZONE expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    TIMEZONE470=(CommonTree)match(input,TIMEZONE,FOLLOW_TIMEZONE_in_builtInCall3525); 
                    TIMEZONE470_tree = (CommonTree)adaptor.dupNode(TIMEZONE470);


                    root_1 = (CommonTree)adaptor.becomeRoot(TIMEZONE470_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3527);
                    expression471=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression471.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 34 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:486:7: ^( TZ expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    TZ472=(CommonTree)match(input,TZ,FOLLOW_TZ_in_builtInCall3537); 
                    TZ472_tree = (CommonTree)adaptor.dupNode(TZ472);


                    root_1 = (CommonTree)adaptor.becomeRoot(TZ472_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3539);
                    expression473=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression473.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 35 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:487:7: NOW
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    NOW474=(CommonTree)match(input,NOW,FOLLOW_NOW_in_builtInCall3548); 
                    NOW474_tree = (CommonTree)adaptor.dupNode(NOW474);


                    adaptor.addChild(root_0, NOW474_tree);


                    }
                    break;
                case 36 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:488:7: ^( MD5 expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MD5475=(CommonTree)match(input,MD5,FOLLOW_MD5_in_builtInCall3557); 
                    MD5475_tree = (CommonTree)adaptor.dupNode(MD5475);


                    root_1 = (CommonTree)adaptor.becomeRoot(MD5475_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3559);
                    expression476=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression476.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 37 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:489:7: ^( SHA1 expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SHA1477=(CommonTree)match(input,SHA1,FOLLOW_SHA1_in_builtInCall3569); 
                    SHA1477_tree = (CommonTree)adaptor.dupNode(SHA1477);


                    root_1 = (CommonTree)adaptor.becomeRoot(SHA1477_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3571);
                    expression478=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression478.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 38 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:490:7: ^( SHA224 expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SHA224479=(CommonTree)match(input,SHA224,FOLLOW_SHA224_in_builtInCall3581); 
                    SHA224479_tree = (CommonTree)adaptor.dupNode(SHA224479);


                    root_1 = (CommonTree)adaptor.becomeRoot(SHA224479_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3583);
                    expression480=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression480.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 39 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:491:7: ^( SHA256 expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SHA256481=(CommonTree)match(input,SHA256,FOLLOW_SHA256_in_builtInCall3593); 
                    SHA256481_tree = (CommonTree)adaptor.dupNode(SHA256481);


                    root_1 = (CommonTree)adaptor.becomeRoot(SHA256481_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3595);
                    expression482=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression482.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 40 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:492:7: ^( SHA384 expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SHA384483=(CommonTree)match(input,SHA384,FOLLOW_SHA384_in_builtInCall3605); 
                    SHA384483_tree = (CommonTree)adaptor.dupNode(SHA384483);


                    root_1 = (CommonTree)adaptor.becomeRoot(SHA384483_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3607);
                    expression484=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression484.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 41 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:493:7: ^( SHA512 expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SHA512485=(CommonTree)match(input,SHA512,FOLLOW_SHA512_in_builtInCall3617); 
                    SHA512485_tree = (CommonTree)adaptor.dupNode(SHA512485);


                    root_1 = (CommonTree)adaptor.becomeRoot(SHA512485_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3619);
                    expression486=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression486.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 42 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:494:7: ^( COALESCE expressionList )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    COALESCE487=(CommonTree)match(input,COALESCE,FOLLOW_COALESCE_in_builtInCall3629); 
                    COALESCE487_tree = (CommonTree)adaptor.dupNode(COALESCE487);


                    root_1 = (CommonTree)adaptor.becomeRoot(COALESCE487_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expressionList_in_builtInCall3631);
                    expressionList488=expressionList();

                    state._fsp--;

                    adaptor.addChild(root_1, expressionList488.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 43 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:495:7: ^( IF expression expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    IF489=(CommonTree)match(input,IF,FOLLOW_IF_in_builtInCall3641); 
                    IF489_tree = (CommonTree)adaptor.dupNode(IF489);


                    root_1 = (CommonTree)adaptor.becomeRoot(IF489_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3643);
                    expression490=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression490.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3645);
                    expression491=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression491.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3647);
                    expression492=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression492.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 44 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:496:7: ^( STRLANG expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    STRLANG493=(CommonTree)match(input,STRLANG,FOLLOW_STRLANG_in_builtInCall3657); 
                    STRLANG493_tree = (CommonTree)adaptor.dupNode(STRLANG493);


                    root_1 = (CommonTree)adaptor.becomeRoot(STRLANG493_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3659);
                    expression494=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression494.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3661);
                    expression495=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression495.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 45 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:497:7: ^( STRDT expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    STRDT496=(CommonTree)match(input,STRDT,FOLLOW_STRDT_in_builtInCall3671); 
                    STRDT496_tree = (CommonTree)adaptor.dupNode(STRDT496);


                    root_1 = (CommonTree)adaptor.becomeRoot(STRDT496_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3673);
                    expression497=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression497.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3675);
                    expression498=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression498.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 46 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:498:7: ^( SAMETERM expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SAMETERM499=(CommonTree)match(input,SAMETERM,FOLLOW_SAMETERM_in_builtInCall3685); 
                    SAMETERM499_tree = (CommonTree)adaptor.dupNode(SAMETERM499);


                    root_1 = (CommonTree)adaptor.becomeRoot(SAMETERM499_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3687);
                    expression500=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression500.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3689);
                    expression501=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression501.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 47 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:499:7: ^( ISIRI expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ISIRI502=(CommonTree)match(input,ISIRI,FOLLOW_ISIRI_in_builtInCall3699); 
                    ISIRI502_tree = (CommonTree)adaptor.dupNode(ISIRI502);


                    root_1 = (CommonTree)adaptor.becomeRoot(ISIRI502_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3701);
                    expression503=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression503.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 48 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:500:7: ^( ISURI expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ISURI504=(CommonTree)match(input,ISURI,FOLLOW_ISURI_in_builtInCall3711); 
                    ISURI504_tree = (CommonTree)adaptor.dupNode(ISURI504);


                    root_1 = (CommonTree)adaptor.becomeRoot(ISURI504_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3713);
                    expression505=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression505.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 49 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:501:7: ^( ISBLANK expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ISBLANK506=(CommonTree)match(input,ISBLANK,FOLLOW_ISBLANK_in_builtInCall3723); 
                    ISBLANK506_tree = (CommonTree)adaptor.dupNode(ISBLANK506);


                    root_1 = (CommonTree)adaptor.becomeRoot(ISBLANK506_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3725);
                    expression507=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression507.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 50 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:502:7: ^( ISLITERAL expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ISLITERAL508=(CommonTree)match(input,ISLITERAL,FOLLOW_ISLITERAL_in_builtInCall3736); 
                    ISLITERAL508_tree = (CommonTree)adaptor.dupNode(ISLITERAL508);


                    root_1 = (CommonTree)adaptor.becomeRoot(ISLITERAL508_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3738);
                    expression509=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression509.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 51 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:503:7: ^( ISNUMERIC expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ISNUMERIC510=(CommonTree)match(input,ISNUMERIC,FOLLOW_ISNUMERIC_in_builtInCall3748); 
                    ISNUMERIC510_tree = (CommonTree)adaptor.dupNode(ISNUMERIC510);


                    root_1 = (CommonTree)adaptor.becomeRoot(ISNUMERIC510_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3750);
                    expression511=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression511.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 52 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:504:7: regexExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_regexExpression_in_builtInCall3759);
                    regexExpression512=regexExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, regexExpression512.getTree());


                    }
                    break;
                case 53 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:505:7: existsFunction
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_existsFunction_in_builtInCall3767);
                    existsFunction513=existsFunction();

                    state._fsp--;

                    adaptor.addChild(root_0, existsFunction513.getTree());


                    }
                    break;
                case 54 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:506:7: notExistsFunction
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_notExistsFunction_in_builtInCall3775);
                    notExistsFunction514=notExistsFunction();

                    state._fsp--;

                    adaptor.addChild(root_0, notExistsFunction514.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "builtInCall"


    public static class regexExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "regexExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:509:1: regexExpression : ^( REGEX ( expression )+ ) ;
    public final SparqlT.regexExpression_return regexExpression() throws RecognitionException {
        SparqlT.regexExpression_return retval = new SparqlT.regexExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REGEX515=null;
        SparqlT.expression_return expression516 =null;


        CommonTree REGEX515_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:510:5: ( ^( REGEX ( expression )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:510:7: ^( REGEX ( expression )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            REGEX515=(CommonTree)match(input,REGEX,FOLLOW_REGEX_in_regexExpression3793); 
            REGEX515_tree = (CommonTree)adaptor.dupNode(REGEX515);


            root_1 = (CommonTree)adaptor.becomeRoot(REGEX515_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:510:15: ( expression )+
            int cnt131=0;
            loop131:
            do {
                int alt131=2;
                switch ( input.LA(1) ) {
                case AND:
                case ASTERISK:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DIVIDE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case EQUAL:
                case GREATER:
                case GREATER_EQUAL:
                case IN:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case LESS:
                case LESS_EQUAL:
                case MINUS:
                case NOT:
                case NOT_EQUAL:
                case OR:
                case PLUS:
                case UNARY:
                    {
                    alt131=1;
                    }
                    break;

                }

                switch (alt131) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:510:15: expression
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expression_in_regexExpression3795);
            	    expression516=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_1, expression516.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt131 >= 1 ) break loop131;
                        EarlyExitException eee =
                            new EarlyExitException(131, input);
                        throw eee;
                }
                cnt131++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "regexExpression"


    public static class subStringExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subStringExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:513:1: subStringExpression : ^( SUBSTR ( expression )+ ) ;
    public final SparqlT.subStringExpression_return subStringExpression() throws RecognitionException {
        SparqlT.subStringExpression_return retval = new SparqlT.subStringExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SUBSTR517=null;
        SparqlT.expression_return expression518 =null;


        CommonTree SUBSTR517_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:514:5: ( ^( SUBSTR ( expression )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:514:7: ^( SUBSTR ( expression )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SUBSTR517=(CommonTree)match(input,SUBSTR,FOLLOW_SUBSTR_in_subStringExpression3819); 
            SUBSTR517_tree = (CommonTree)adaptor.dupNode(SUBSTR517);


            root_1 = (CommonTree)adaptor.becomeRoot(SUBSTR517_tree, root_1);


            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:514:16: ( expression )+
            int cnt132=0;
            loop132:
            do {
                int alt132=2;
                switch ( input.LA(1) ) {
                case AND:
                case ASTERISK:
                case DECIMAL_NEGATIVE:
                case DECIMAL_POSITIVE:
                case DIVIDE:
                case DOUBLE_NEGATIVE:
                case DOUBLE_POSITIVE:
                case EQUAL:
                case GREATER:
                case GREATER_EQUAL:
                case IN:
                case INTEGER_NEGATIVE:
                case INTEGER_POSITIVE:
                case LESS:
                case LESS_EQUAL:
                case MINUS:
                case NOT:
                case NOT_EQUAL:
                case OR:
                case PLUS:
                case UNARY:
                    {
                    alt132=1;
                    }
                    break;

                }

                switch (alt132) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:514:16: expression
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expression_in_subStringExpression3821);
            	    expression518=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_1, expression518.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt132 >= 1 ) break loop132;
                        EarlyExitException eee =
                            new EarlyExitException(132, input);
                        throw eee;
                }
                cnt132++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subStringExpression"


    public static class existsFunction_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "existsFunction"
    // com\\googlecode\\sparkleg\\SparqlT.g:517:1: existsFunction : ^( EXISTS groupGraphPattern ) ;
    public final SparqlT.existsFunction_return existsFunction() throws RecognitionException {
        SparqlT.existsFunction_return retval = new SparqlT.existsFunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXISTS519=null;
        SparqlT.groupGraphPattern_return groupGraphPattern520 =null;


        CommonTree EXISTS519_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:518:5: ( ^( EXISTS groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:518:7: ^( EXISTS groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EXISTS519=(CommonTree)match(input,EXISTS,FOLLOW_EXISTS_in_existsFunction3845); 
            EXISTS519_tree = (CommonTree)adaptor.dupNode(EXISTS519);


            root_1 = (CommonTree)adaptor.becomeRoot(EXISTS519_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_existsFunction3847);
            groupGraphPattern520=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern520.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "existsFunction"


    public static class notExistsFunction_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notExistsFunction"
    // com\\googlecode\\sparkleg\\SparqlT.g:521:1: notExistsFunction : ^( NOT_EXISTS groupGraphPattern ) ;
    public final SparqlT.notExistsFunction_return notExistsFunction() throws RecognitionException {
        SparqlT.notExistsFunction_return retval = new SparqlT.notExistsFunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOT_EXISTS521=null;
        SparqlT.groupGraphPattern_return groupGraphPattern522 =null;


        CommonTree NOT_EXISTS521_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:522:5: ( ^( NOT_EXISTS groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:522:7: ^( NOT_EXISTS groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            NOT_EXISTS521=(CommonTree)match(input,NOT_EXISTS,FOLLOW_NOT_EXISTS_in_notExistsFunction3866); 
            NOT_EXISTS521_tree = (CommonTree)adaptor.dupNode(NOT_EXISTS521);


            root_1 = (CommonTree)adaptor.becomeRoot(NOT_EXISTS521_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_notExistsFunction3868);
            groupGraphPattern522=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern522.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notExistsFunction"


    public static class aggregate_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aggregate"
    // com\\googlecode\\sparkleg\\SparqlT.g:525:1: aggregate : ( ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* ) | ^( SUM ( DISTINCT )* expression ) | ^( MIN ( DISTINCT )* expression ) | ^( MAX ( DISTINCT )* expression ) | ^( AVG ( DISTINCT )* expression ) | ^( SAMPLE ( DISTINCT )? expression ) | ^( GROUP_CONCAT ( DISTINCT )* expression ( string )? ) );
    public final SparqlT.aggregate_return aggregate() throws RecognitionException {
        SparqlT.aggregate_return retval = new SparqlT.aggregate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COUNT523=null;
        CommonTree DISTINCT524=null;
        CommonTree ASTERISK525=null;
        CommonTree SUM527=null;
        CommonTree DISTINCT528=null;
        CommonTree MIN530=null;
        CommonTree DISTINCT531=null;
        CommonTree MAX533=null;
        CommonTree DISTINCT534=null;
        CommonTree AVG536=null;
        CommonTree DISTINCT537=null;
        CommonTree SAMPLE539=null;
        CommonTree DISTINCT540=null;
        CommonTree GROUP_CONCAT542=null;
        CommonTree DISTINCT543=null;
        SparqlT.expression_return expression526 =null;

        SparqlT.expression_return expression529 =null;

        SparqlT.expression_return expression532 =null;

        SparqlT.expression_return expression535 =null;

        SparqlT.expression_return expression538 =null;

        SparqlT.expression_return expression541 =null;

        SparqlT.expression_return expression544 =null;

        SparqlT.string_return string545 =null;


        CommonTree COUNT523_tree=null;
        CommonTree DISTINCT524_tree=null;
        CommonTree ASTERISK525_tree=null;
        CommonTree SUM527_tree=null;
        CommonTree DISTINCT528_tree=null;
        CommonTree MIN530_tree=null;
        CommonTree DISTINCT531_tree=null;
        CommonTree MAX533_tree=null;
        CommonTree DISTINCT534_tree=null;
        CommonTree AVG536_tree=null;
        CommonTree DISTINCT537_tree=null;
        CommonTree SAMPLE539_tree=null;
        CommonTree DISTINCT540_tree=null;
        CommonTree GROUP_CONCAT542_tree=null;
        CommonTree DISTINCT543_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:526:5: ( ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* ) | ^( SUM ( DISTINCT )* expression ) | ^( MIN ( DISTINCT )* expression ) | ^( MAX ( DISTINCT )* expression ) | ^( AVG ( DISTINCT )* expression ) | ^( SAMPLE ( DISTINCT )? expression ) | ^( GROUP_CONCAT ( DISTINCT )* expression ( string )? ) )
            int alt143=7;
            switch ( input.LA(1) ) {
            case COUNT:
                {
                alt143=1;
                }
                break;
            case SUM:
                {
                alt143=2;
                }
                break;
            case MIN:
                {
                alt143=3;
                }
                break;
            case MAX:
                {
                alt143=4;
                }
                break;
            case AVG:
                {
                alt143=5;
                }
                break;
            case SAMPLE:
                {
                alt143=6;
                }
                break;
            case GROUP_CONCAT:
                {
                alt143=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;

            }

            switch (alt143) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:526:7: ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    COUNT523=(CommonTree)match(input,COUNT,FOLLOW_COUNT_in_aggregate3887); 
                    COUNT523_tree = (CommonTree)adaptor.dupNode(COUNT523);


                    root_1 = (CommonTree)adaptor.becomeRoot(COUNT523_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:526:15: ( DISTINCT )*
                        loop133:
                        do {
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
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:526:15: DISTINCT
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    DISTINCT524=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3889); 
                        	    DISTINCT524_tree = (CommonTree)adaptor.dupNode(DISTINCT524);


                        	    adaptor.addChild(root_1, DISTINCT524_tree);


                        	    }
                        	    break;

                        	default :
                        	    break loop133;
                            }
                        } while (true);


                        // com\\googlecode\\sparkleg\\SparqlT.g:526:25: ( ASTERISK )*
                        loop134:
                        do {
                            int alt134=2;
                            switch ( input.LA(1) ) {
                            case ASTERISK:
                                {
                                switch ( input.LA(2) ) {
                                case UP:
                                case AND:
                                case ASTERISK:
                                case DECIMAL_NEGATIVE:
                                case DECIMAL_POSITIVE:
                                case DIVIDE:
                                case DOUBLE_NEGATIVE:
                                case DOUBLE_POSITIVE:
                                case EQUAL:
                                case GREATER:
                                case GREATER_EQUAL:
                                case IN:
                                case INTEGER_NEGATIVE:
                                case INTEGER_POSITIVE:
                                case LESS:
                                case LESS_EQUAL:
                                case MINUS:
                                case NOT:
                                case NOT_EQUAL:
                                case OR:
                                case PLUS:
                                case UNARY:
                                    {
                                    alt134=1;
                                    }
                                    break;

                                }

                                }
                                break;

                            }

                            switch (alt134) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:526:25: ASTERISK
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    ASTERISK525=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_aggregate3892); 
                        	    ASTERISK525_tree = (CommonTree)adaptor.dupNode(ASTERISK525);


                        	    adaptor.addChild(root_1, ASTERISK525_tree);


                        	    }
                        	    break;

                        	default :
                        	    break loop134;
                            }
                        } while (true);


                        // com\\googlecode\\sparkleg\\SparqlT.g:526:35: ( expression )*
                        loop135:
                        do {
                            int alt135=2;
                            switch ( input.LA(1) ) {
                            case AND:
                            case ASTERISK:
                            case DECIMAL_NEGATIVE:
                            case DECIMAL_POSITIVE:
                            case DIVIDE:
                            case DOUBLE_NEGATIVE:
                            case DOUBLE_POSITIVE:
                            case EQUAL:
                            case GREATER:
                            case GREATER_EQUAL:
                            case IN:
                            case INTEGER_NEGATIVE:
                            case INTEGER_POSITIVE:
                            case LESS:
                            case LESS_EQUAL:
                            case MINUS:
                            case NOT:
                            case NOT_EQUAL:
                            case OR:
                            case PLUS:
                            case UNARY:
                                {
                                alt135=1;
                                }
                                break;

                            }

                            switch (alt135) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:526:35: expression
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_aggregate3895);
                        	    expression526=expression();

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, expression526.getTree());


                        	    }
                        	    break;

                        	default :
                        	    break loop135;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:527:7: ^( SUM ( DISTINCT )* expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUM527=(CommonTree)match(input,SUM,FOLLOW_SUM_in_aggregate3906); 
                    SUM527_tree = (CommonTree)adaptor.dupNode(SUM527);


                    root_1 = (CommonTree)adaptor.becomeRoot(SUM527_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:527:13: ( DISTINCT )*
                    loop136:
                    do {
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
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:527:13: DISTINCT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    DISTINCT528=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3908); 
                    	    DISTINCT528_tree = (CommonTree)adaptor.dupNode(DISTINCT528);


                    	    adaptor.addChild(root_1, DISTINCT528_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_aggregate3911);
                    expression529=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression529.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:528:7: ^( MIN ( DISTINCT )* expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MIN530=(CommonTree)match(input,MIN,FOLLOW_MIN_in_aggregate3921); 
                    MIN530_tree = (CommonTree)adaptor.dupNode(MIN530);


                    root_1 = (CommonTree)adaptor.becomeRoot(MIN530_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:528:13: ( DISTINCT )*
                    loop137:
                    do {
                        int alt137=2;
                        switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt137=1;
                            }
                            break;

                        }

                        switch (alt137) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:528:13: DISTINCT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    DISTINCT531=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3923); 
                    	    DISTINCT531_tree = (CommonTree)adaptor.dupNode(DISTINCT531);


                    	    adaptor.addChild(root_1, DISTINCT531_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_aggregate3926);
                    expression532=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression532.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:529:7: ^( MAX ( DISTINCT )* expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MAX533=(CommonTree)match(input,MAX,FOLLOW_MAX_in_aggregate3936); 
                    MAX533_tree = (CommonTree)adaptor.dupNode(MAX533);


                    root_1 = (CommonTree)adaptor.becomeRoot(MAX533_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:529:13: ( DISTINCT )*
                    loop138:
                    do {
                        int alt138=2;
                        switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt138=1;
                            }
                            break;

                        }

                        switch (alt138) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:529:13: DISTINCT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    DISTINCT534=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3938); 
                    	    DISTINCT534_tree = (CommonTree)adaptor.dupNode(DISTINCT534);


                    	    adaptor.addChild(root_1, DISTINCT534_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_aggregate3941);
                    expression535=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression535.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:530:7: ^( AVG ( DISTINCT )* expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    AVG536=(CommonTree)match(input,AVG,FOLLOW_AVG_in_aggregate3951); 
                    AVG536_tree = (CommonTree)adaptor.dupNode(AVG536);


                    root_1 = (CommonTree)adaptor.becomeRoot(AVG536_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:530:13: ( DISTINCT )*
                    loop139:
                    do {
                        int alt139=2;
                        switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt139=1;
                            }
                            break;

                        }

                        switch (alt139) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:530:13: DISTINCT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    DISTINCT537=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3953); 
                    	    DISTINCT537_tree = (CommonTree)adaptor.dupNode(DISTINCT537);


                    	    adaptor.addChild(root_1, DISTINCT537_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_aggregate3956);
                    expression538=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression538.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:531:7: ^( SAMPLE ( DISTINCT )? expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SAMPLE539=(CommonTree)match(input,SAMPLE,FOLLOW_SAMPLE_in_aggregate3966); 
                    SAMPLE539_tree = (CommonTree)adaptor.dupNode(SAMPLE539);


                    root_1 = (CommonTree)adaptor.becomeRoot(SAMPLE539_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:531:16: ( DISTINCT )?
                    int alt140=2;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt140=1;
                            }
                            break;
                    }

                    switch (alt140) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:531:16: DISTINCT
                            {
                            _last = (CommonTree)input.LT(1);
                            DISTINCT540=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3968); 
                            DISTINCT540_tree = (CommonTree)adaptor.dupNode(DISTINCT540);


                            adaptor.addChild(root_1, DISTINCT540_tree);


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_aggregate3971);
                    expression541=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression541.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:532:7: ^( GROUP_CONCAT ( DISTINCT )* expression ( string )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GROUP_CONCAT542=(CommonTree)match(input,GROUP_CONCAT,FOLLOW_GROUP_CONCAT_in_aggregate3981); 
                    GROUP_CONCAT542_tree = (CommonTree)adaptor.dupNode(GROUP_CONCAT542);


                    root_1 = (CommonTree)adaptor.becomeRoot(GROUP_CONCAT542_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:532:22: ( DISTINCT )*
                    loop141:
                    do {
                        int alt141=2;
                        switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt141=1;
                            }
                            break;

                        }

                        switch (alt141) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:532:22: DISTINCT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    DISTINCT543=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3983); 
                    	    DISTINCT543_tree = (CommonTree)adaptor.dupNode(DISTINCT543);


                    	    adaptor.addChild(root_1, DISTINCT543_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_aggregate3986);
                    expression544=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression544.getTree());


                    // com\\googlecode\\sparkleg\\SparqlT.g:532:43: ( string )?
                    int alt142=2;
                    switch ( input.LA(1) ) {
                        case STRING_LITERAL1:
                        case STRING_LITERAL2:
                        case STRING_LITERAL_LONG1:
                        case STRING_LITERAL_LONG2:
                            {
                            alt142=1;
                            }
                            break;
                    }

                    switch (alt142) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:532:43: string
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_string_in_aggregate3988);
                            string545=string();

                            state._fsp--;

                            adaptor.addChild(root_1, string545.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "aggregate"


    public static class iriRefOrFunction_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iriRefOrFunction"
    // com\\googlecode\\sparkleg\\SparqlT.g:535:1: iriRefOrFunction : ( ^( FUNCTION f= iriRef ^( ARG_LIST (a= argList ) ) ) | ^( FUNCTION f= iriRef ) );
    public final SparqlT.iriRefOrFunction_return iriRefOrFunction() throws RecognitionException {
        SparqlT.iriRefOrFunction_return retval = new SparqlT.iriRefOrFunction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FUNCTION546=null;
        CommonTree ARG_LIST547=null;
        CommonTree FUNCTION548=null;
        SparqlT.iriRef_return f =null;

        SparqlT.argList_return a =null;


        CommonTree FUNCTION546_tree=null;
        CommonTree ARG_LIST547_tree=null;
        CommonTree FUNCTION548_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:536:5: ( ^( FUNCTION f= iriRef ^( ARG_LIST (a= argList ) ) ) | ^( FUNCTION f= iriRef ) )
            int alt144=2;
            switch ( input.LA(1) ) {
            case FUNCTION:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case IRI_REF:
                        {
                        switch ( input.LA(4) ) {
                        case ARG_LIST:
                            {
                            alt144=1;
                            }
                            break;
                        case UP:
                            {
                            alt144=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 144, 3, input);

                            throw nvae;

                        }

                        }
                        break;
                    case PNAME_LN:
                    case PNAME_NS:
                        {
                        switch ( input.LA(4) ) {
                        case ARG_LIST:
                            {
                            alt144=1;
                            }
                            break;
                        case UP:
                            {
                            alt144=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 144, 4, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 144, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 144, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;

            }

            switch (alt144) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:536:7: ^( FUNCTION f= iriRef ^( ARG_LIST (a= argList ) ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    FUNCTION546=(CommonTree)match(input,FUNCTION,FOLLOW_FUNCTION_in_iriRefOrFunction4012); 
                    FUNCTION546_tree = (CommonTree)adaptor.dupNode(FUNCTION546);


                    root_1 = (CommonTree)adaptor.becomeRoot(FUNCTION546_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_iriRefOrFunction4016);
                    f=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_1, f.getTree());


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ARG_LIST547=(CommonTree)match(input,ARG_LIST,FOLLOW_ARG_LIST_in_iriRefOrFunction4019); 
                    ARG_LIST547_tree = (CommonTree)adaptor.dupNode(ARG_LIST547);


                    root_2 = (CommonTree)adaptor.becomeRoot(ARG_LIST547_tree, root_2);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:536:38: (a= argList )
                        // com\\googlecode\\sparkleg\\SparqlT.g:536:39: a= argList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_argList_in_iriRefOrFunction4024);
                        a=argList();

                        state._fsp--;

                        adaptor.addChild(root_2, a.getTree());


                        }


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:537:7: ^( FUNCTION f= iriRef )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    FUNCTION548=(CommonTree)match(input,FUNCTION,FOLLOW_FUNCTION_in_iriRefOrFunction4036); 
                    FUNCTION548_tree = (CommonTree)adaptor.dupNode(FUNCTION548);


                    root_1 = (CommonTree)adaptor.becomeRoot(FUNCTION548_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_iriRefOrFunction4040);
                    f=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_1, f.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iriRefOrFunction"


    public static class rdfLiteral_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rdfLiteral"
    // com\\googlecode\\sparkleg\\SparqlT.g:540:1: rdfLiteral : string ( LANGTAG | ( REFERENCE iriRef ) )? ;
    public final SparqlT.rdfLiteral_return rdfLiteral() throws RecognitionException {
        SparqlT.rdfLiteral_return retval = new SparqlT.rdfLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LANGTAG550=null;
        CommonTree REFERENCE551=null;
        SparqlT.string_return string549 =null;

        SparqlT.iriRef_return iriRef552 =null;


        CommonTree LANGTAG550_tree=null;
        CommonTree REFERENCE551_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:541:5: ( string ( LANGTAG | ( REFERENCE iriRef ) )? )
            // com\\googlecode\\sparkleg\\SparqlT.g:541:7: string ( LANGTAG | ( REFERENCE iriRef ) )?
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_in_rdfLiteral4058);
            string549=string();

            state._fsp--;

            adaptor.addChild(root_0, string549.getTree());


            // com\\googlecode\\sparkleg\\SparqlT.g:541:14: ( LANGTAG | ( REFERENCE iriRef ) )?
            int alt145=3;
            switch ( input.LA(1) ) {
                case LANGTAG:
                    {
                    alt145=1;
                    }
                    break;
                case REFERENCE:
                    {
                    alt145=2;
                    }
                    break;
            }

            switch (alt145) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:541:15: LANGTAG
                    {
                    _last = (CommonTree)input.LT(1);
                    LANGTAG550=(CommonTree)match(input,LANGTAG,FOLLOW_LANGTAG_in_rdfLiteral4061); 
                    LANGTAG550_tree = (CommonTree)adaptor.dupNode(LANGTAG550);


                    adaptor.addChild(root_0, LANGTAG550_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:541:25: ( REFERENCE iriRef )
                    {
                    // com\\googlecode\\sparkleg\\SparqlT.g:541:25: ( REFERENCE iriRef )
                    // com\\googlecode\\sparkleg\\SparqlT.g:541:26: REFERENCE iriRef
                    {
                    _last = (CommonTree)input.LT(1);
                    REFERENCE551=(CommonTree)match(input,REFERENCE,FOLLOW_REFERENCE_in_rdfLiteral4066); 
                    REFERENCE551_tree = (CommonTree)adaptor.dupNode(REFERENCE551);


                    adaptor.addChild(root_0, REFERENCE551_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_rdfLiteral4068);
                    iriRef552=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef552.getTree());


                    }


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rdfLiteral"


    public static class numericLiteral_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericLiteral"
    // com\\googlecode\\sparkleg\\SparqlT.g:544:1: numericLiteral : ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative );
    public final SparqlT.numericLiteral_return numericLiteral() throws RecognitionException {
        SparqlT.numericLiteral_return retval = new SparqlT.numericLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.numericLiteralUnsigned_return numericLiteralUnsigned553 =null;

        SparqlT.numericLiteralPositive_return numericLiteralPositive554 =null;

        SparqlT.numericLiteralNegative_return numericLiteralNegative555 =null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:545:5: ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative )
            int alt146=3;
            switch ( input.LA(1) ) {
            case DECIMAL:
            case DOUBLE:
            case INTEGER:
                {
                alt146=1;
                }
                break;
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_POSITIVE:
                {
                alt146=2;
                }
                break;
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case INTEGER_NEGATIVE:
                {
                alt146=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;

            }

            switch (alt146) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:545:7: numericLiteralUnsigned
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral4088);
                    numericLiteralUnsigned553=numericLiteralUnsigned();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralUnsigned553.getTree());


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:546:7: numericLiteralPositive
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral4096);
                    numericLiteralPositive554=numericLiteralPositive();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralPositive554.getTree());


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:547:7: numericLiteralNegative
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral4104);
                    numericLiteralNegative555=numericLiteralNegative();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralNegative555.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numericLiteral"


    public static class numericLiteralUnsigned_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericLiteralUnsigned"
    // com\\googlecode\\sparkleg\\SparqlT.g:550:1: numericLiteralUnsigned : ( INTEGER | DECIMAL | DOUBLE );
    public final SparqlT.numericLiteralUnsigned_return numericLiteralUnsigned() throws RecognitionException {
        SparqlT.numericLiteralUnsigned_return retval = new SparqlT.numericLiteralUnsigned_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set556=null;

        CommonTree set556_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:551:5: ( INTEGER | DECIMAL | DOUBLE )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set556=(CommonTree)input.LT(1);

            if ( input.LA(1)==DECIMAL||input.LA(1)==DOUBLE||input.LA(1)==INTEGER ) {
                input.consume();
                set556_tree = (CommonTree)adaptor.dupNode(set556);


                adaptor.addChild(root_0, set556_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numericLiteralUnsigned"


    public static class numericLiteralPositive_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericLiteralPositive"
    // com\\googlecode\\sparkleg\\SparqlT.g:556:1: numericLiteralPositive : ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE );
    public final SparqlT.numericLiteralPositive_return numericLiteralPositive() throws RecognitionException {
        SparqlT.numericLiteralPositive_return retval = new SparqlT.numericLiteralPositive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set557=null;

        CommonTree set557_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:557:5: ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set557=(CommonTree)input.LT(1);

            if ( input.LA(1)==DECIMAL_POSITIVE||input.LA(1)==DOUBLE_POSITIVE||input.LA(1)==INTEGER_POSITIVE ) {
                input.consume();
                set557_tree = (CommonTree)adaptor.dupNode(set557);


                adaptor.addChild(root_0, set557_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numericLiteralPositive"


    public static class numericLiteralNegative_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numericLiteralNegative"
    // com\\googlecode\\sparkleg\\SparqlT.g:562:1: numericLiteralNegative : ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE );
    public final SparqlT.numericLiteralNegative_return numericLiteralNegative() throws RecognitionException {
        SparqlT.numericLiteralNegative_return retval = new SparqlT.numericLiteralNegative_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set558=null;

        CommonTree set558_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:563:5: ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set558=(CommonTree)input.LT(1);

            if ( input.LA(1)==DECIMAL_NEGATIVE||input.LA(1)==DOUBLE_NEGATIVE||input.LA(1)==INTEGER_NEGATIVE ) {
                input.consume();
                set558_tree = (CommonTree)adaptor.dupNode(set558);


                adaptor.addChild(root_0, set558_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numericLiteralNegative"


    public static class booleanLiteral_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "booleanLiteral"
    // com\\googlecode\\sparkleg\\SparqlT.g:568:1: booleanLiteral : ( TRUE | FALSE );
    public final SparqlT.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SparqlT.booleanLiteral_return retval = new SparqlT.booleanLiteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set559=null;

        CommonTree set559_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:569:5: ( TRUE | FALSE )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set559=(CommonTree)input.LT(1);

            if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
                input.consume();
                set559_tree = (CommonTree)adaptor.dupNode(set559);


                adaptor.addChild(root_0, set559_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"


    public static class string_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string"
    // com\\googlecode\\sparkleg\\SparqlT.g:573:1: string : ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 );
    public final SparqlT.string_return string() throws RecognitionException {
        SparqlT.string_return retval = new SparqlT.string_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set560=null;

        CommonTree set560_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:574:5: ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set560=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= STRING_LITERAL1 && input.LA(1) <= STRING_LITERAL_LONG2) ) {
                input.consume();
                set560_tree = (CommonTree)adaptor.dupNode(set560);


                adaptor.addChild(root_0, set560_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string"


    public static class iriRef_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iriRef"
    // com\\googlecode\\sparkleg\\SparqlT.g:580:1: iriRef : ( IRI_REF | prefixedName );
    public final SparqlT.iriRef_return iriRef() throws RecognitionException {
        SparqlT.iriRef_return retval = new SparqlT.iriRef_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IRI_REF561=null;
        SparqlT.prefixedName_return prefixedName562 =null;


        CommonTree IRI_REF561_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:581:5: ( IRI_REF | prefixedName )
            int alt147=2;
            switch ( input.LA(1) ) {
            case IRI_REF:
                {
                alt147=1;
                }
                break;
            case PNAME_LN:
            case PNAME_NS:
                {
                alt147=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;

            }

            switch (alt147) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:581:7: IRI_REF
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    IRI_REF561=(CommonTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef4287); 
                    IRI_REF561_tree = (CommonTree)adaptor.dupNode(IRI_REF561);


                    adaptor.addChild(root_0, IRI_REF561_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:582:7: prefixedName
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_prefixedName_in_iriRef4295);
                    prefixedName562=prefixedName();

                    state._fsp--;

                    adaptor.addChild(root_0, prefixedName562.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iriRef"


    public static class prefixedName_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefixedName"
    // com\\googlecode\\sparkleg\\SparqlT.g:585:1: prefixedName : ( PNAME_LN | PNAME_NS );
    public final SparqlT.prefixedName_return prefixedName() throws RecognitionException {
        SparqlT.prefixedName_return retval = new SparqlT.prefixedName_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set563=null;

        CommonTree set563_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:586:5: ( PNAME_LN | PNAME_NS )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set563=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= PNAME_LN && input.LA(1) <= PNAME_NS) ) {
                input.consume();
                set563_tree = (CommonTree)adaptor.dupNode(set563);


                adaptor.addChild(root_0, set563_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prefixedName"


    public static class blankNode_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blankNode"
    // com\\googlecode\\sparkleg\\SparqlT.g:590:1: blankNode : ( BLANK_NODE_LABEL | anon );
    public final SparqlT.blankNode_return blankNode() throws RecognitionException {
        SparqlT.blankNode_return retval = new SparqlT.blankNode_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLANK_NODE_LABEL564=null;
        SparqlT.anon_return anon565 =null;


        CommonTree BLANK_NODE_LABEL564_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:591:5: ( BLANK_NODE_LABEL | anon )
            int alt148=2;
            switch ( input.LA(1) ) {
            case BLANK_NODE_LABEL:
                {
                alt148=1;
                }
                break;
            case OPEN_SQUARE_BRACKET:
                {
                alt148=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;

            }

            switch (alt148) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:591:7: BLANK_NODE_LABEL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    BLANK_NODE_LABEL564=(CommonTree)match(input,BLANK_NODE_LABEL,FOLLOW_BLANK_NODE_LABEL_in_blankNode4337); 
                    BLANK_NODE_LABEL564_tree = (CommonTree)adaptor.dupNode(BLANK_NODE_LABEL564);


                    adaptor.addChild(root_0, BLANK_NODE_LABEL564_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:592:7: anon
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_anon_in_blankNode4345);
                    anon565=anon();

                    state._fsp--;

                    adaptor.addChild(root_0, anon565.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blankNode"


    public static class anon_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anon"
    // com\\googlecode\\sparkleg\\SparqlT.g:595:1: anon : OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET ;
    public final SparqlT.anon_return anon() throws RecognitionException {
        SparqlT.anon_return retval = new SparqlT.anon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OPEN_SQUARE_BRACKET566=null;
        CommonTree CLOSE_SQUARE_BRACKET567=null;

        CommonTree OPEN_SQUARE_BRACKET566_tree=null;
        CommonTree CLOSE_SQUARE_BRACKET567_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:596:5: ( OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET )
            // com\\googlecode\\sparkleg\\SparqlT.g:596:7: OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            OPEN_SQUARE_BRACKET566=(CommonTree)match(input,OPEN_SQUARE_BRACKET,FOLLOW_OPEN_SQUARE_BRACKET_in_anon4362); 
            OPEN_SQUARE_BRACKET566_tree = (CommonTree)adaptor.dupNode(OPEN_SQUARE_BRACKET566);


            adaptor.addChild(root_0, OPEN_SQUARE_BRACKET566_tree);


            _last = (CommonTree)input.LT(1);
            CLOSE_SQUARE_BRACKET567=(CommonTree)match(input,CLOSE_SQUARE_BRACKET,FOLLOW_CLOSE_SQUARE_BRACKET_in_anon4364); 
            CLOSE_SQUARE_BRACKET567_tree = (CommonTree)adaptor.dupNode(CLOSE_SQUARE_BRACKET567);


            adaptor.addChild(root_0, CLOSE_SQUARE_BRACKET567_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "anon"

    // Delegated rules


 

    public static final BitSet FOLLOW_QUERY_in_query53 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_prologue_in_query55 = new BitSet(new long[]{0x0008001000002008L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectQuery_in_query57 = new BitSet(new long[]{0x0008001000002008L});
    public static final BitSet FOLLOW_constructQuery_in_query60 = new BitSet(new long[]{0x0008000000002008L});
    public static final BitSet FOLLOW_describeQuery_in_query63 = new BitSet(new long[]{0x0000000000002008L});
    public static final BitSet FOLLOW_askQuery_in_query66 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bindingsClause_in_query70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_query80 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_update_in_query82 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_PROLOGUE_in_prologue102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_baseDecl_in_prologue104 = new BitSet(new long[]{0x0000000000010008L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_prefixDecl_in_prologue107 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_BASE_in_baseDecl127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IRI_REF_in_baseDecl129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIX_in_prefixDecl148 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixDecl150 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IRI_REF_in_prefixDecl152 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_in_selectQuery171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectClause_in_selectQuery173 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_datasetClause_in_selectQuery175 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_whereClause_in_selectQuery178 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011000L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_solutionModifier_in_selectQuery181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_in_subSelect200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_whereClause_in_subSelect202 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_datasetClause_in_subSelect205 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L});
    public static final BitSet FOLLOW_solutionModifier_in_subSelect208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASTERISK_in_selectClause234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause246 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ASTERISK_in_selectClause248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause260 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ASTERISK_in_selectClause262 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectVariables_in_selectClause274 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause287 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_selectVariables_in_selectClause289 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause302 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_selectVariables_in_selectClause304 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_VAR_in_selectVariables324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_selectVariables326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AS_in_selectVariables337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selectVariables339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_var_in_selectVariables341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_in_constructQuery362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constructTemplate_in_constructQuery364 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_datasetClause_in_constructQuery366 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_whereClause_in_constructQuery369 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011000L,0x0000000000000002L});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery372 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_in_constructQuery382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datasetClause_in_constructQuery384 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_whereClause_in_constructQuery387 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011000L,0x0000000000000002L});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery390 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeQuery409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref_in_describeQuery411 = new BitSet(new long[]{0x0000000000004008L,0x0400010008011040L,0x0000000000000602L,0x0000000000004C00L});
    public static final BitSet FOLLOW_ASTERISK_in_describeQuery414 = new BitSet(new long[]{0x0000000000004008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_datasetClause_in_describeQuery417 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_whereClause_in_describeQuery420 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011000L,0x0000000000000002L});
    public static final BitSet FOLLOW_solutionModifier_in_describeQuery423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASK_in_askQuery442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datasetClause_in_askQuery444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_whereClause_in_askQuery447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FROM_in_datasetClause466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAMED_in_datasetClause468 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_datasetClause471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_CLAUSE_in_whereClause490 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_whereClause492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupClause_in_solutionModifier515 = new BitSet(new long[]{0x0000000000000002L,0x0400010000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_havingClause_in_solutionModifier518 = new BitSet(new long[]{0x0000000000000002L,0x0400010000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_orderClause_in_solutionModifier521 = new BitSet(new long[]{0x0000000000000002L,0x0400010000000000L});
    public static final BitSet FOLLOW_limitOffsetClauses_in_solutionModifier524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_BY_in_groupClause543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupCondition_in_groupClause545 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_GROUP_CONDITION_in_groupCondition572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_builtInCall_in_groupCondition574 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_CONDITION_in_groupCondition584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionCall_in_groupCondition586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_CONDITION_in_groupCondition596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_groupCondition598 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AS_in_groupCondition601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_groupCondition603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_CONDITION_in_groupCondition616 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_groupCondition618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HAVING_in_havingClause637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_havingClause639 = new BitSet(new long[]{0xA640D84884C04128L,0x81E2A8EFE4CE06A1L,0x05387CF82F200100L,0x000000000002008EL});
    public static final BitSet FOLLOW_ORDER_BY_in_orderClause664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_orderCondition_in_orderClause666 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ORDER_CONDITION_in_orderCondition686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASC_in_orderCondition688 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_orderCondition690 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDER_CONDITION_in_orderCondition700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DESC_in_orderCondition702 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_orderCondition704 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDER_CONDITION_in_orderCondition714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_orderCondition716 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDER_CONDITION_in_orderCondition726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_orderCondition728 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIMIT_in_limitOffsetClauses752 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitOffsetClauses754 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OFFSET_in_limitOffsetClauses759 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitOffsetClauses761 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OFFSET_in_limitOffsetClauses773 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitOffsetClauses775 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIMIT_in_limitOffsetClauses780 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitOffsetClauses782 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BINDINGS_in_bindingsClause804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_bindingsClause806 = new BitSet(new long[]{0x0000000000080008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_bindingValueList_in_bindingsClause809 = new BitSet(new long[]{0x0000000000080008L});
    public static final BitSet FOLLOW_BINDING_VALUE_in_bindingValueList833 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bindingValue_in_bindingValueList835 = new BitSet(new long[]{0x0700E00000000008L,0x0000000008E00008L,0x0007800000000600L,0x0000000000000011L});
    public static final BitSet FOLLOW_iriRef_in_bindingValue859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_bindingValue863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_bindingValue867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_bindingValue871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEF_in_bindingValue875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prologue_in_update896 = new BitSet(new long[]{0x0802028008000042L,0x0005020000100000L});
    public static final BitSet FOLLOW_load_in_update898 = new BitSet(new long[]{0x0802028008000042L,0x0005020000100000L});
    public static final BitSet FOLLOW_clear_in_update901 = new BitSet(new long[]{0x0802028008000042L,0x0005000000100000L});
    public static final BitSet FOLLOW_drop_in_update904 = new BitSet(new long[]{0x0802028000000042L,0x0005000000100000L});
    public static final BitSet FOLLOW_add_in_update907 = new BitSet(new long[]{0x0002028000000042L,0x0005000000100000L});
    public static final BitSet FOLLOW_move_in_update910 = new BitSet(new long[]{0x0002028000000002L,0x0005000000100000L});
    public static final BitSet FOLLOW_copy_in_update913 = new BitSet(new long[]{0x0002028000000002L,0x0001000000100000L});
    public static final BitSet FOLLOW_create_in_update916 = new BitSet(new long[]{0x0002020000000002L,0x0001000000100000L});
    public static final BitSet FOLLOW_insert_in_update919 = new BitSet(new long[]{0x0002000000000002L,0x0001000000100000L});
    public static final BitSet FOLLOW_delete_in_update922 = new BitSet(new long[]{0x0002000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_modify_in_update925 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_LOAD_in_load955 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_load957 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000020000000600L});
    public static final BitSet FOLLOW_iriRef_in_load960 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_graphRef_in_load962 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLEAR_in_clear986 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_clear988 = new BitSet(new long[]{0x0001000000000080L,0x0008000000000100L,0x0000020000000000L});
    public static final BitSet FOLLOW_graphRefAll_in_clear991 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DROP_in_drop1014 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_drop1016 = new BitSet(new long[]{0x0001000000000080L,0x0008000000000100L,0x0000020000000000L});
    public static final BitSet FOLLOW_graphRefAll_in_drop1019 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_in_create1039 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_create1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000020000000000L});
    public static final BitSet FOLLOW_graphRef_in_create1044 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_add1067 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_add1069 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000020000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_add1072 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000000000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_add1074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVE_in_move1097 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_move1099 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000020000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_move1102 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000000000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_move1104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COPY_in_copy1127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_copy1129 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000020000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_copy1132 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000000000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_copy1134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_in_insert1153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DATA_in_insert1155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_insert1157 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_delete1182 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_deleteData_in_delete1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteWhere_in_delete1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_deleteData1208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DATA_in_deleteData1210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteData1212 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_deleteWhere1231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WHERE_in_deleteWhere1233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteWhere1235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFY_in_modify1258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WITH_in_modify1261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_modify1263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_deleteClause_in_modify1266 = new BitSet(new long[]{0x0002000000000000L,0x0000000000100000L,0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_insertClause_in_modify1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_usingClause_in_modify1272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_whereClause_in_modify1275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFY_in_modify1285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_deleteClause_in_modify1287 = new BitSet(new long[]{0x0002000000000000L,0x0000000000100000L,0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_insertClause_in_modify1290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_usingClause_in_modify1293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_whereClause_in_modify1296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_deleteClause1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteClause1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insertClause1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_insertClause1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_usingClause1361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAMED_in_usingClause1363 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_usingClause1366 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFAULT_in_graphOrDefault1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphOrDefault1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_graphOrDefault1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphRef1426 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_graphRef1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphRef_in_graphRefAll1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_graphRefAll1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMED_in_graphRefAll1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_graphRefAll1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quads_in_quadPattern1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesTemplate_in_quads1495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_quadsNotTriples_in_quads1499 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_triplesTemplate_in_quads1501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_GRAPH_in_quadsNotTriples1526 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref_in_quadsNotTriples1528 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_triplesTemplate_in_quadsNotTriples1530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRIPLES_TEMPLATE_in_triplesTemplate1554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesTemplate1556 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPatternSub_in_groupGraphPattern1578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subSelect_in_groupGraphPattern1590 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1602 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSub1620 = new BitSet(new long[]{0x0000000000020002L,0x4000400000008110L,0x0000000400000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_groupGraphPatternSubDetail_in_groupGraphPatternSub1622 = new BitSet(new long[]{0x0000000000020002L,0x4000400000008110L,0x0000000400000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_groupGraphPatternSubDetail_in_groupGraphPatternSub1631 = new BitSet(new long[]{0x0000000000020002L,0x4000400000008110L,0x0000000400000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_groupGraphPatternSubDetail1652 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_DOT_in_groupGraphPatternSubDetail1654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSubDetail1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubjectPath_in_triplesBlock1681 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionalGraphPattern_in_graphPatternNotTriples1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minusGraphPattern_in_graphPatternNotTriples1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphGraphPattern_in_graphPatternNotTriples1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serviceGraphPattern_in_graphPatternNotTriples1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filter_in_graphPatternNotTriples1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_in_graphPatternNotTriples1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_optionalGraphPattern1741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_optionalGraphPattern1743 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAPH_in_graphGraphPattern1762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref_in_graphGraphPattern1764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_graphGraphPattern1766 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SERVICE_in_serviceGraphPattern1785 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_serviceGraphPattern1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_varOrIRIref_in_serviceGraphPattern1790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_serviceGraphPattern1792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIND_in_bind1815 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_bind1817 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AS_in_bind1820 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_bind1822 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_KEYWORD_in_minusGraphPattern1848 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_minusGraphPattern1850 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNION_in_groupOrUnionGraphPattern1869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern1873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILTER_in_filter1900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_filter1902 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_constraint1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_constraint1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_constraint1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionCall1954 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_functionCall1956 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARG_LIST_in_functionCall1959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argList_in_functionCall1961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_nil_in_argList1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTINCT_in_argList1988 = new BitSet(new long[]{0x8640C00000004102L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_argList1991 = new BitSet(new long[]{0x8640C00000004102L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_LIST_in_expressionList2010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expressionList2012 = new BitSet(new long[]{0x8640C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_LIST_in_expressionList2023 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nil_in_expressionList2025 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_TRIPLES_in_constructTemplate2045 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constructTriples_in_constructTemplate2047 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_triplesSameSubject_in_constructTriples2066 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubject2085 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triplesSameSubject2088 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubject2090 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject2093 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubject2103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubject2105 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject2107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_propertyListNotEmptyDetails_in_propertyListNotEmpty2139 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PREDICATE_in_propertyListNotEmptyDetails2158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmptyDetails2163 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmptyDetails2167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OBJECT_in_objectList2187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_objectList2189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varOrIRIref_in_verb2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_verb2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_in_verb2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubjectPath2243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triplesSameSubjectPath2246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubjectPath2248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath2251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubjectPath2261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubjectPath2264 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath2266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_in_path2290 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pathSequence_in_path2292 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_PATH_SEQUENCE_in_pathSequence2313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence2315 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_INVERSE_in_pathEltOrInverse2338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_pathElt_in_pathEltOrInverse2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathPrimary_in_pathElt2366 = new BitSet(new long[]{0x0000000000004002L,0x1000000000000000L,0x0000000000100100L});
    public static final BitSet FOLLOW_pathMod_in_pathElt2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_pathMod2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_pathMod2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_pathMod2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_pathMod2403 = new BitSet(new long[]{0x0000000200000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod2406 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_COMMA_in_pathMod2409 = new BitSet(new long[]{0x0000000020000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod2416 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_pathMod2428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod2430 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_PRIMARY_in_pathPrimary2452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_pathPrimary2454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_PRIMARY_in_pathPrimary2464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_A_in_pathPrimary2466 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_PRIMARY_in_pathPrimary2476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGATION_in_pathPrimary2478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_pathNegatedPropertySet_in_pathPrimary2480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_PRIMARY_in_pathPrimary2490 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_path_in_pathPrimary2492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_NEGATED_in_pathNegatedPropertySet2511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet2513 = new BitSet(new long[]{0x0000000000000018L,0x000000000A000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_INVERSE_in_pathOneInPropertySet2535 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_pathOneInPropertySet2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_pathOneInPropertySet2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_in_triplesNode2563 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_triplesNode2565 = new BitSet(new long[]{0x0700E00100300008L,0x2800000008E00008L,0x2007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_TRIPLES_NODE_in_triplesNode2576 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesNode2578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varOrTerm_in_graphNode2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_graphNode2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_NODE_in_varOrTerm2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIRIref2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_varOrIRIref2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_graphTerm2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_graphTerm2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_graphTerm2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nil_in_graphTerm2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_nil2745 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_nil2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expression2765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2767 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expression2779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2781 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2783 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expression2793 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2795 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2797 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expression2809 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2811 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2813 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_in_expression2823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2825 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2827 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_in_expression2837 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2839 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_expression2851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2853 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2855 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_expression2865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2867 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_expression2881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2883 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression2895 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_in_expression2897 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2899 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2901 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression2911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2913 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2915 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression2925 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2927 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_expression2940 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2942 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2944 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_expression2954 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2956 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression2958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_expression2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_expression2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_expression2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNARY_in_unaryExpression3006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGATION_in_unaryExpression3008 = new BitSet(new long[]{0x2700F94885C08020L,0x01829C2FE4E620A9L,0x073FFCF83F200000L,0x0000000000020C87L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression3010 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_in_unaryExpression3020 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression3022 = new BitSet(new long[]{0x2700F94885C08020L,0x01829C2FE4E620A9L,0x073FFCF83F200000L,0x0000000000020C87L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression3024 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_in_unaryExpression3034 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression3036 = new BitSet(new long[]{0x2700F94885C08020L,0x01829C2FE4E620A9L,0x073FFCF83F200000L,0x0000000000020C87L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression3038 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_in_unaryExpression3048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression3050 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackettedExpression_in_primaryExpression3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_primaryExpression3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRefOrFunction_in_primaryExpression3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_primaryExpression3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_primaryExpression3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_primaryExpression3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggregate_in_primaryExpression3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKETTED_EXPRESSION_in_brackettedExpression3115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_brackettedExpression3119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STR_in_builtInCall3138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANG_in_builtInCall3150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3152 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANGMATCHES_in_builtInCall3162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3164 = new BitSet(new long[]{0x8640C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_DATATYPE_in_builtInCall3175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_in_builtInCall3187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_builtInCall3189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IRI_in_builtInCall3199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_URI_in_builtInCall3211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall3223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAND_in_builtInCall3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABS_in_builtInCall3251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CEIL_in_builtInCall3263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3265 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOOR_in_builtInCall3275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROUND_in_builtInCall3287 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_builtInCall3299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall3301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_subStringExpression_in_builtInCall3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRLEN_in_builtInCall3319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCASE_in_builtInCall3331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LCASE_in_builtInCall3343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENCODE_FOR_URI_in_builtInCall3355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3357 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTAINS_in_builtInCall3367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3369 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall3371 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRSTARTS_in_builtInCall3381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3383 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall3385 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRENDS_in_builtInCall3395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3397 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall3399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRBEFORE_in_builtInCall3409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3411 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall3413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRAFTER_in_builtInCall3423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3425 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall3427 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPLACE_in_builtInCall3437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3439 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall3441 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall3443 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_in_builtInCall3453 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3455 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_in_builtInCall3465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_in_builtInCall3477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HOURS_in_builtInCall3489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3491 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTES_in_builtInCall3501 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3503 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECONDS_in_builtInCall3513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3515 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEZONE_in_builtInCall3525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3527 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TZ_in_builtInCall3537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOW_in_builtInCall3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MD5_in_builtInCall3557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA1_in_builtInCall3569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3571 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA224_in_builtInCall3581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3583 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA256_in_builtInCall3593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3595 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA384_in_builtInCall3605 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA512_in_builtInCall3617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COALESCE_in_builtInCall3629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall3631 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_builtInCall3641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3643 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall3645 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall3647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRLANG_in_builtInCall3657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3659 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall3661 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRDT_in_builtInCall3671 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3673 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall3675 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMETERM_in_builtInCall3685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3687 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall3689 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISIRI_in_builtInCall3699 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3701 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISURI_in_builtInCall3711 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3713 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISBLANK_in_builtInCall3723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISLITERAL_in_builtInCall3736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3738 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISNUMERIC_in_builtInCall3748 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_regexExpression_in_builtInCall3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_existsFunction_in_builtInCall3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExistsFunction_in_builtInCall3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_regexExpression3793 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_regexExpression3795 = new BitSet(new long[]{0x8640C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSTR_in_subStringExpression3819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_subStringExpression3821 = new BitSet(new long[]{0x8640C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_in_existsFunction3845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_existsFunction3847 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EXISTS_in_notExistsFunction3866 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_notExistsFunction3868 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_aggregate3887 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3889 = new BitSet(new long[]{0x8660C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_aggregate3892 = new BitSet(new long[]{0x8640C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate3895 = new BitSet(new long[]{0x8640C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_SUM_in_aggregate3906 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3908 = new BitSet(new long[]{0x8660C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate3911 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MIN_in_aggregate3921 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3923 = new BitSet(new long[]{0x8660C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate3926 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAX_in_aggregate3936 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3938 = new BitSet(new long[]{0x8660C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate3941 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVG_in_aggregate3951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3953 = new BitSet(new long[]{0x8660C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate3956 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMPLE_in_aggregate3966 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3968 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate3971 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_CONCAT_in_aggregate3981 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3983 = new BitSet(new long[]{0x8660C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate3986 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0007800000000000L});
    public static final BitSet FOLLOW_string_in_aggregate3988 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_iriRefOrFunction4012 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_iriRefOrFunction4016 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARG_LIST_in_iriRefOrFunction4019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argList_in_iriRefOrFunction4024 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_iriRefOrFunction4036 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_iriRefOrFunction4040 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_string_in_rdfLiteral4058 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LANGTAG_in_rdfLiteral4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCE_in_rdfLiteral4066 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_rdfLiteral4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_NODE_LABEL_in_blankNode4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anon_in_blankNode4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_SQUARE_BRACKET_in_anon4362 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CLOSE_SQUARE_BRACKET_in_anon4364 = new BitSet(new long[]{0x0000000000000002L});

}