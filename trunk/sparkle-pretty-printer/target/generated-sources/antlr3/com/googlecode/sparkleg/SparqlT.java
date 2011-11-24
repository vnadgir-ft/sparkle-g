// $ANTLR 3.4 com\\googlecode\\sparkleg\\SparqlT.g 2011-11-24 22:39:53

    package com.googlecode.sparkleg;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
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

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("SparqlTTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return SparqlT.tokenNames; }
    public String getGrammarFileName() { return "com\\googlecode\\sparkleg\\SparqlT.g"; }


    public static class query_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "query"
    // com\\googlecode\\sparkleg\\SparqlT.g:37:1: query : ( ^( QUERY p= prologue (s= selectQuery )? (c= constructQuery )? (d= describeQuery )? (a= askQuery )? ) (b= bindingsClause )? -> query(prologue=$p.stselectQuery=$s.stconstructQuery=$c.stdescribeQuery=$d.staskQuery=$a.stbindingsClause=$b.st)| ^( UPDATE (u+= update )+ ) -> updateQuery(update=$u));
    public final SparqlT.query_return query() throws RecognitionException {
        SparqlT.query_return retval = new SparqlT.query_return();
        retval.start = input.LT(1);


        List list_u=null;
        SparqlT.prologue_return p =null;

        SparqlT.selectQuery_return s =null;

        SparqlT.constructQuery_return c =null;

        SparqlT.describeQuery_return d =null;

        SparqlT.askQuery_return a =null;

        SparqlT.bindingsClause_return b =null;

        RuleReturnScope u = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:38:5: ( ^( QUERY p= prologue (s= selectQuery )? (c= constructQuery )? (d= describeQuery )? (a= askQuery )? ) (b= bindingsClause )? -> query(prologue=$p.stselectQuery=$s.stconstructQuery=$c.stdescribeQuery=$d.staskQuery=$a.stbindingsClause=$b.st)| ^( UPDATE (u+= update )+ ) -> updateQuery(update=$u))
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:38:7: ^( QUERY p= prologue (s= selectQuery )? (c= constructQuery )? (d= describeQuery )? (a= askQuery )? ) (b= bindingsClause )?
                    {
                    match(input,QUERY,FOLLOW_QUERY_in_query54); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_prologue_in_query58);
                    p=prologue();

                    state._fsp--;


                    // com\\googlecode\\sparkleg\\SparqlT.g:38:27: (s= selectQuery )?
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
                            // com\\googlecode\\sparkleg\\SparqlT.g:38:27: s= selectQuery
                            {
                            pushFollow(FOLLOW_selectQuery_in_query62);
                            s=selectQuery();

                            state._fsp--;


                            }
                            break;

                    }


                    // com\\googlecode\\sparkleg\\SparqlT.g:38:42: (c= constructQuery )?
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
                            // com\\googlecode\\sparkleg\\SparqlT.g:38:42: c= constructQuery
                            {
                            pushFollow(FOLLOW_constructQuery_in_query67);
                            c=constructQuery();

                            state._fsp--;


                            }
                            break;

                    }


                    // com\\googlecode\\sparkleg\\SparqlT.g:38:60: (d= describeQuery )?
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
                            // com\\googlecode\\sparkleg\\SparqlT.g:38:60: d= describeQuery
                            {
                            pushFollow(FOLLOW_describeQuery_in_query72);
                            d=describeQuery();

                            state._fsp--;


                            }
                            break;

                    }


                    // com\\googlecode\\sparkleg\\SparqlT.g:38:77: (a= askQuery )?
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
                            // com\\googlecode\\sparkleg\\SparqlT.g:38:77: a= askQuery
                            {
                            pushFollow(FOLLOW_askQuery_in_query77);
                            a=askQuery();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // com\\googlecode\\sparkleg\\SparqlT.g:38:90: (b= bindingsClause )?
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
                            // com\\googlecode\\sparkleg\\SparqlT.g:38:90: b= bindingsClause
                            {
                            pushFollow(FOLLOW_bindingsClause_in_query83);
                            b=bindingsClause();

                            state._fsp--;


                            }
                            break;

                    }


                    // TEMPLATE REWRITE
                    // 38:107: -> query(prologue=$p.stselectQuery=$s.stconstructQuery=$c.stdescribeQuery=$d.staskQuery=$a.stbindingsClause=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("query",new STAttrMap().put("prologue", (p!=null?p.st:null)).put("selectQuery", (s!=null?s.st:null)).put("constructQuery", (c!=null?c.st:null)).put("describeQuery", (d!=null?d.st:null)).put("askQuery", (a!=null?a.st:null)).put("bindingsClause", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:39:7: ^( UPDATE (u+= update )+ )
                    {
                    match(input,UPDATE,FOLLOW_UPDATE_in_query127); 

                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:39:16: (u+= update )+
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
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:39:17: u+= update
                    	    {
                    	    pushFollow(FOLLOW_update_in_query132);
                    	    u=update();

                    	    state._fsp--;

                    	    if (list_u==null) list_u=new ArrayList();
                    	    list_u.add(u.getTemplate());


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


                    // TEMPLATE REWRITE
                    // 39:30: -> updateQuery(update=$u)
                    {
                        retval.st = templateLib.getInstanceOf("updateQuery",new STAttrMap().put("update", list_u));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prologue"
    // com\\googlecode\\sparkleg\\SparqlT.g:42:1: prologue : ^( PROLOGUE (b+= baseDecl )* (p+= prefixDecl )* ) -> prologue(baseDecl=$bprefixDecl=$p);
    public final SparqlT.prologue_return prologue() throws RecognitionException {
        SparqlT.prologue_return retval = new SparqlT.prologue_return();
        retval.start = input.LT(1);


        List list_b=null;
        List list_p=null;
        RuleReturnScope b = null;
        RuleReturnScope p = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:43:5: ( ^( PROLOGUE (b+= baseDecl )* (p+= prefixDecl )* ) -> prologue(baseDecl=$bprefixDecl=$p))
            // com\\googlecode\\sparkleg\\SparqlT.g:43:7: ^( PROLOGUE (b+= baseDecl )* (p+= prefixDecl )* )
            {
            match(input,PROLOGUE,FOLLOW_PROLOGUE_in_prologue162); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:43:18: (b+= baseDecl )*
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
                	    // com\\googlecode\\sparkleg\\SparqlT.g:43:19: b+= baseDecl
                	    {
                	    pushFollow(FOLLOW_baseDecl_in_prologue167);
                	    b=baseDecl();

                	    state._fsp--;

                	    if (list_b==null) list_b=new ArrayList();
                	    list_b.add(b.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                // com\\googlecode\\sparkleg\\SparqlT.g:43:33: (p+= prefixDecl )*
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
                	    // com\\googlecode\\sparkleg\\SparqlT.g:43:34: p+= prefixDecl
                	    {
                	    pushFollow(FOLLOW_prefixDecl_in_prologue174);
                	    p=prefixDecl();

                	    state._fsp--;

                	    if (list_p==null) list_p=new ArrayList();
                	    list_p.add(p.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 43:51: -> prologue(baseDecl=$bprefixDecl=$p)
            {
                retval.st = templateLib.getInstanceOf("prologue",new STAttrMap().put("baseDecl", list_b).put("prefixDecl", list_p));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "baseDecl"
    // com\\googlecode\\sparkleg\\SparqlT.g:46:1: baseDecl : ^( BASE IRI_REF ) -> baseDecl(iriRef=$IRI_REF.text);
    public final SparqlT.baseDecl_return baseDecl() throws RecognitionException {
        SparqlT.baseDecl_return retval = new SparqlT.baseDecl_return();
        retval.start = input.LT(1);


        CommonTree IRI_REF1=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:47:5: ( ^( BASE IRI_REF ) -> baseDecl(iriRef=$IRI_REF.text))
            // com\\googlecode\\sparkleg\\SparqlT.g:47:7: ^( BASE IRI_REF )
            {
            match(input,BASE,FOLLOW_BASE_in_baseDecl209); 

            match(input, Token.DOWN, null); 
            IRI_REF1=(CommonTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_baseDecl211); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 47:23: -> baseDecl(iriRef=$IRI_REF.text)
            {
                retval.st = templateLib.getInstanceOf("baseDecl",new STAttrMap().put("iriRef", (IRI_REF1!=null?IRI_REF1.getText():null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prefixDecl"
    // com\\googlecode\\sparkleg\\SparqlT.g:50:1: prefixDecl : ^( PREFIX PNAME_NS IRI_REF ) -> prefixDecl(pname=$PNAME_NS.textiriRef=$IRI_REF.text);
    public final SparqlT.prefixDecl_return prefixDecl() throws RecognitionException {
        SparqlT.prefixDecl_return retval = new SparqlT.prefixDecl_return();
        retval.start = input.LT(1);


        CommonTree PNAME_NS2=null;
        CommonTree IRI_REF3=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:51:5: ( ^( PREFIX PNAME_NS IRI_REF ) -> prefixDecl(pname=$PNAME_NS.textiriRef=$IRI_REF.text))
            // com\\googlecode\\sparkleg\\SparqlT.g:51:7: ^( PREFIX PNAME_NS IRI_REF )
            {
            match(input,PREFIX,FOLLOW_PREFIX_in_prefixDecl239); 

            match(input, Token.DOWN, null); 
            PNAME_NS2=(CommonTree)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixDecl241); 

            IRI_REF3=(CommonTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_prefixDecl243); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 51:34: -> prefixDecl(pname=$PNAME_NS.textiriRef=$IRI_REF.text)
            {
                retval.st = templateLib.getInstanceOf("prefixDecl",new STAttrMap().put("pname", (PNAME_NS2!=null?PNAME_NS2.getText():null)).put("iriRef", (IRI_REF3!=null?IRI_REF3.getText():null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "selectQuery"
    // com\\googlecode\\sparkleg\\SparqlT.g:54:1: selectQuery : ^( SELECT s= selectClause (d+= datasetClause )* (w+= whereClause )* m= solutionModifier ) -> selectQuery(selectClause=$s.stdatasetClause=$dwhereClause=$wsolutionModifier=$m.st);
    public final SparqlT.selectQuery_return selectQuery() throws RecognitionException {
        SparqlT.selectQuery_return retval = new SparqlT.selectQuery_return();
        retval.start = input.LT(1);


        List list_d=null;
        List list_w=null;
        SparqlT.selectClause_return s =null;

        SparqlT.solutionModifier_return m =null;

        RuleReturnScope d = null;
        RuleReturnScope w = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:55:5: ( ^( SELECT s= selectClause (d+= datasetClause )* (w+= whereClause )* m= solutionModifier ) -> selectQuery(selectClause=$s.stdatasetClause=$dwhereClause=$wsolutionModifier=$m.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:55:7: ^( SELECT s= selectClause (d+= datasetClause )* (w+= whereClause )* m= solutionModifier )
            {
            match(input,SELECT,FOLLOW_SELECT_in_selectQuery277); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_selectClause_in_selectQuery281);
            s=selectClause();

            state._fsp--;


            // com\\googlecode\\sparkleg\\SparqlT.g:55:31: (d+= datasetClause )*
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
            	    // com\\googlecode\\sparkleg\\SparqlT.g:55:32: d+= datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_selectQuery286);
            	    d=datasetClause();

            	    state._fsp--;

            	    if (list_d==null) list_d=new ArrayList();
            	    list_d.add(d.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:55:51: (w+= whereClause )*
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
            	    // com\\googlecode\\sparkleg\\SparqlT.g:55:52: w+= whereClause
            	    {
            	    pushFollow(FOLLOW_whereClause_in_selectQuery293);
            	    w=whereClause();

            	    state._fsp--;

            	    if (list_w==null) list_w=new ArrayList();
            	    list_w.add(w.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            pushFollow(FOLLOW_solutionModifier_in_selectQuery299);
            m=solutionModifier();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 55:89: -> selectQuery(selectClause=$s.stdatasetClause=$dwhereClause=$wsolutionModifier=$m.st)
            {
                retval.st = templateLib.getInstanceOf("selectQuery",new STAttrMap().put("selectClause", (s!=null?s.st:null)).put("datasetClause", list_d).put("whereClause", list_w).put("solutionModifier", (m!=null?m.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "subSelect"
    // com\\googlecode\\sparkleg\\SparqlT.g:58:1: subSelect : ^( SUBSELECT s= selectClause (w+= whereClause )* (m= solutionModifier ) ) -> subSelect(selectClause=$s.stwhereClause=$wsolutionModifier=$m.st);
    public final SparqlT.subSelect_return subSelect() throws RecognitionException {
        SparqlT.subSelect_return retval = new SparqlT.subSelect_return();
        retval.start = input.LT(1);


        List list_w=null;
        SparqlT.selectClause_return s =null;

        SparqlT.solutionModifier_return m =null;

        RuleReturnScope w = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:59:5: ( ^( SUBSELECT s= selectClause (w+= whereClause )* (m= solutionModifier ) ) -> subSelect(selectClause=$s.stwhereClause=$wsolutionModifier=$m.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:59:7: ^( SUBSELECT s= selectClause (w+= whereClause )* (m= solutionModifier ) )
            {
            match(input,SUBSELECT,FOLLOW_SUBSELECT_in_subSelect343); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_selectClause_in_subSelect347);
            s=selectClause();

            state._fsp--;


            // com\\googlecode\\sparkleg\\SparqlT.g:59:34: (w+= whereClause )*
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
            	    // com\\googlecode\\sparkleg\\SparqlT.g:59:35: w+= whereClause
            	    {
            	    pushFollow(FOLLOW_whereClause_in_subSelect352);
            	    w=whereClause();

            	    state._fsp--;

            	    if (list_w==null) list_w=new ArrayList();
            	    list_w.add(w.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:59:52: (m= solutionModifier )
            // com\\googlecode\\sparkleg\\SparqlT.g:59:53: m= solutionModifier
            {
            pushFollow(FOLLOW_solutionModifier_in_subSelect359);
            m=solutionModifier();

            state._fsp--;


            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 59:74: -> subSelect(selectClause=$s.stwhereClause=$wsolutionModifier=$m.st)
            {
                retval.st = templateLib.getInstanceOf("subSelect",new STAttrMap().put("selectClause", (s!=null?s.st:null)).put("whereClause", list_w).put("solutionModifier", (m!=null?m.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "selectClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:62:1: selectClause : ( ^( SELECT_CLAUSE ASTERISK ) -> selectClause(asterisk=$ASTERISK.text)| ^( SELECT_CLAUSE DISTINCT ASTERISK ) -> selectClause(attribute=$DISTINCT.textasterisk=$ASTERISK.text)| ^( SELECT_CLAUSE REDUCED ASTERISK ) -> selectClause(attribute=$REDUCED.textasterisk=$ASTERISK.text)| ^( SELECT_CLAUSE (v+= selectVariables )* ) -> selectClause(selectVariables=$v)| ^( SELECT_CLAUSE DISTINCT (v+= selectVariables )* ) -> selectClause(attribute=$DISTINCT.textselectVariables=$v)| ^( SELECT_CLAUSE REDUCED (v+= selectVariables )* ) -> selectClause(attribute=$REDUCED.textselectVariables=$v));
    public final SparqlT.selectClause_return selectClause() throws RecognitionException {
        SparqlT.selectClause_return retval = new SparqlT.selectClause_return();
        retval.start = input.LT(1);


        CommonTree ASTERISK4=null;
        CommonTree DISTINCT5=null;
        CommonTree ASTERISK6=null;
        CommonTree REDUCED7=null;
        CommonTree ASTERISK8=null;
        CommonTree DISTINCT9=null;
        CommonTree REDUCED10=null;
        List list_v=null;
        RuleReturnScope v = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:63:5: ( ^( SELECT_CLAUSE ASTERISK ) -> selectClause(asterisk=$ASTERISK.text)| ^( SELECT_CLAUSE DISTINCT ASTERISK ) -> selectClause(attribute=$DISTINCT.textasterisk=$ASTERISK.text)| ^( SELECT_CLAUSE REDUCED ASTERISK ) -> selectClause(attribute=$REDUCED.textasterisk=$ASTERISK.text)| ^( SELECT_CLAUSE (v+= selectVariables )* ) -> selectClause(selectVariables=$v)| ^( SELECT_CLAUSE DISTINCT (v+= selectVariables )* ) -> selectClause(attribute=$DISTINCT.textselectVariables=$v)| ^( SELECT_CLAUSE REDUCED (v+= selectVariables )* ) -> selectClause(attribute=$REDUCED.textselectVariables=$v))
            int alt16=6;
            switch ( input.LA(1) ) {
            case SELECT_CLAUSE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case ASTERISK:
                        {
                        alt16=1;
                        }
                        break;
                    case DISTINCT:
                        {
                        switch ( input.LA(4) ) {
                        case ASTERISK:
                            {
                            alt16=2;
                            }
                            break;
                        case UP:
                        case AS:
                        case VAR:
                            {
                            alt16=5;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 4, input);

                            throw nvae;

                        }

                        }
                        break;
                    case REDUCED:
                        {
                        switch ( input.LA(4) ) {
                        case ASTERISK:
                            {
                            alt16=3;
                            }
                            break;
                        case UP:
                        case AS:
                        case VAR:
                            {
                            alt16=6;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 5, input);

                            throw nvae;

                        }

                        }
                        break;
                    case UP:
                    case AS:
                    case VAR:
                        {
                        alt16=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:63:7: ^( SELECT_CLAUSE ASTERISK )
                    {
                    match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause403); 

                    match(input, Token.DOWN, null); 
                    ASTERISK4=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_selectClause405); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 63:33: -> selectClause(asterisk=$ASTERISK.text)
                    {
                        retval.st = templateLib.getInstanceOf("selectClause",new STAttrMap().put("asterisk", (ASTERISK4!=null?ASTERISK4.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:64:7: ^( SELECT_CLAUSE DISTINCT ASTERISK )
                    {
                    match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause424); 

                    match(input, Token.DOWN, null); 
                    DISTINCT5=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause426); 

                    ASTERISK6=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_selectClause428); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 64:42: -> selectClause(attribute=$DISTINCT.textasterisk=$ASTERISK.text)
                    {
                        retval.st = templateLib.getInstanceOf("selectClause",new STAttrMap().put("attribute", (DISTINCT5!=null?DISTINCT5.getText():null)).put("asterisk", (ASTERISK6!=null?ASTERISK6.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:65:7: ^( SELECT_CLAUSE REDUCED ASTERISK )
                    {
                    match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause452); 

                    match(input, Token.DOWN, null); 
                    REDUCED7=(CommonTree)match(input,REDUCED,FOLLOW_REDUCED_in_selectClause454); 

                    ASTERISK8=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_selectClause456); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 65:41: -> selectClause(attribute=$REDUCED.textasterisk=$ASTERISK.text)
                    {
                        retval.st = templateLib.getInstanceOf("selectClause",new STAttrMap().put("attribute", (REDUCED7!=null?REDUCED7.getText():null)).put("asterisk", (ASTERISK8!=null?ASTERISK8.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:66:7: ^( SELECT_CLAUSE (v+= selectVariables )* )
                    {
                    match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause480); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:66:23: (v+= selectVariables )*
                        loop13:
                        do {
                            int alt13=2;
                            switch ( input.LA(1) ) {
                            case AS:
                            case VAR:
                                {
                                alt13=1;
                                }
                                break;

                            }

                            switch (alt13) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:66:24: v+= selectVariables
                        	    {
                        	    pushFollow(FOLLOW_selectVariables_in_selectClause485);
                        	    v=selectVariables();

                        	    state._fsp--;

                        	    if (list_v==null) list_v=new ArrayList();
                        	    list_v.add(v.getTemplate());


                        	    }
                        	    break;

                        	default :
                        	    break loop13;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }


                    // TEMPLATE REWRITE
                    // 66:46: -> selectClause(selectVariables=$v)
                    {
                        retval.st = templateLib.getInstanceOf("selectClause",new STAttrMap().put("selectVariables", list_v));
                    }



                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:67:7: ^( SELECT_CLAUSE DISTINCT (v+= selectVariables )* )
                    {
                    match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause506); 

                    match(input, Token.DOWN, null); 
                    DISTINCT9=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause508); 

                    // com\\googlecode\\sparkleg\\SparqlT.g:67:32: (v+= selectVariables )*
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
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:67:33: v+= selectVariables
                    	    {
                    	    pushFollow(FOLLOW_selectVariables_in_selectClause513);
                    	    v=selectVariables();

                    	    state._fsp--;

                    	    if (list_v==null) list_v=new ArrayList();
                    	    list_v.add(v.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 67:55: -> selectClause(attribute=$DISTINCT.textselectVariables=$v)
                    {
                        retval.st = templateLib.getInstanceOf("selectClause",new STAttrMap().put("attribute", (DISTINCT9!=null?DISTINCT9.getText():null)).put("selectVariables", list_v));
                    }



                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:68:7: ^( SELECT_CLAUSE REDUCED (v+= selectVariables )* )
                    {
                    match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause539); 

                    match(input, Token.DOWN, null); 
                    REDUCED10=(CommonTree)match(input,REDUCED,FOLLOW_REDUCED_in_selectClause541); 

                    // com\\googlecode\\sparkleg\\SparqlT.g:68:31: (v+= selectVariables )*
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
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:68:32: v+= selectVariables
                    	    {
                    	    pushFollow(FOLLOW_selectVariables_in_selectClause546);
                    	    v=selectVariables();

                    	    state._fsp--;

                    	    if (list_v==null) list_v=new ArrayList();
                    	    list_v.add(v.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 68:54: -> selectClause(attribute=$REDUCED.textselectVariables=$v)
                    {
                        retval.st = templateLib.getInstanceOf("selectClause",new STAttrMap().put("attribute", (REDUCED10!=null?REDUCED10.getText():null)).put("selectVariables", list_v));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "selectVariables"
    // com\\googlecode\\sparkleg\\SparqlT.g:71:1: selectVariables : ( ^( VAR v= var ) -> selectVariables(var=$v.st)| ^( AS e= expression v= var ) -> selectVariables(expression=$e.stvar=$v.st));
    public final SparqlT.selectVariables_return selectVariables() throws RecognitionException {
        SparqlT.selectVariables_return retval = new SparqlT.selectVariables_return();
        retval.start = input.LT(1);


        SparqlT.var_return v =null;

        SparqlT.expression_return e =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:72:5: ( ^( VAR v= var ) -> selectVariables(var=$v.st)| ^( AS e= expression v= var ) -> selectVariables(expression=$e.stvar=$v.st))
            int alt17=2;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt17=1;
                }
                break;
            case AS:
                {
                alt17=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:72:7: ^( VAR v= var )
                    {
                    match(input,VAR,FOLLOW_VAR_in_selectVariables581); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_var_in_selectVariables585);
                    v=var();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 72:20: -> selectVariables(var=$v.st)
                    {
                        retval.st = templateLib.getInstanceOf("selectVariables",new STAttrMap().put("var", (v!=null?v.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:73:7: ^( AS e= expression v= var )
                    {
                    match(input,AS,FOLLOW_AS_in_selectVariables604); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_selectVariables608);
                    e=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_var_in_selectVariables612);
                    v=var();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 73:32: -> selectVariables(expression=$e.stvar=$v.st)
                    {
                        retval.st = templateLib.getInstanceOf("selectVariables",new STAttrMap().put("expression", (e!=null?e.st:null)).put("var", (v!=null?v.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constructQuery"
    // com\\googlecode\\sparkleg\\SparqlT.g:76:1: constructQuery : ( ^( CONSTRUCT c= constructTemplate (d+= datasetClause )* (w= whereClause )? s= solutionModifier ) -> constructQuery(constructTemplate=$c.stdatasetClause=$dwhereClause=$w.stsolutionModifier=$s.st)| ^( CONSTRUCT (d+= datasetClause )* (w= whereClause )? s= solutionModifier ) -> constructQuery(datasetClause=$dwhereClause=$w.stsolutionModifier=$s.st));
    public final SparqlT.constructQuery_return constructQuery() throws RecognitionException {
        SparqlT.constructQuery_return retval = new SparqlT.constructQuery_return();
        retval.start = input.LT(1);


        List list_d=null;
        SparqlT.constructTemplate_return c =null;

        SparqlT.whereClause_return w =null;

        SparqlT.solutionModifier_return s =null;

        RuleReturnScope d = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:77:5: ( ^( CONSTRUCT c= constructTemplate (d+= datasetClause )* (w= whereClause )? s= solutionModifier ) -> constructQuery(constructTemplate=$c.stdatasetClause=$dwhereClause=$w.stsolutionModifier=$s.st)| ^( CONSTRUCT (d+= datasetClause )* (w= whereClause )? s= solutionModifier ) -> constructQuery(datasetClause=$dwhereClause=$w.stsolutionModifier=$s.st))
            int alt22=2;
            switch ( input.LA(1) ) {
            case CONSTRUCT:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case CONSTRUCT_TRIPLES:
                        {
                        alt22=1;
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
                        alt22=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:77:7: ^( CONSTRUCT c= constructTemplate (d+= datasetClause )* (w= whereClause )? s= solutionModifier )
                    {
                    match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_constructQuery648); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_constructTemplate_in_constructQuery652);
                    c=constructTemplate();

                    state._fsp--;


                    // com\\googlecode\\sparkleg\\SparqlT.g:77:39: (d+= datasetClause )*
                    loop18:
                    do {
                        int alt18=2;
                        switch ( input.LA(1) ) {
                        case FROM:
                            {
                            alt18=1;
                            }
                            break;

                        }

                        switch (alt18) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:77:40: d+= datasetClause
                    	    {
                    	    pushFollow(FOLLOW_datasetClause_in_constructQuery657);
                    	    d=datasetClause();

                    	    state._fsp--;

                    	    if (list_d==null) list_d=new ArrayList();
                    	    list_d.add(d.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    // com\\googlecode\\sparkleg\\SparqlT.g:77:59: (w= whereClause )?
                    int alt19=2;
                    switch ( input.LA(1) ) {
                        case WHERE_CLAUSE:
                            {
                            alt19=1;
                            }
                            break;
                    }

                    switch (alt19) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:77:60: w= whereClause
                            {
                            pushFollow(FOLLOW_whereClause_in_constructQuery664);
                            w=whereClause();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_solutionModifier_in_constructQuery670);
                    s=solutionModifier();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 77:96: -> constructQuery(constructTemplate=$c.stdatasetClause=$dwhereClause=$w.stsolutionModifier=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("constructQuery",new STAttrMap().put("constructTemplate", (c!=null?c.st:null)).put("datasetClause", list_d).put("whereClause", (w!=null?w.st:null)).put("solutionModifier", (s!=null?s.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:78:7: ^( CONSTRUCT (d+= datasetClause )* (w= whereClause )? s= solutionModifier )
                    {
                    match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_constructQuery704); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:78:19: (d+= datasetClause )*
                        loop20:
                        do {
                            int alt20=2;
                            switch ( input.LA(1) ) {
                            case FROM:
                                {
                                alt20=1;
                                }
                                break;

                            }

                            switch (alt20) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:78:20: d+= datasetClause
                        	    {
                        	    pushFollow(FOLLOW_datasetClause_in_constructQuery709);
                        	    d=datasetClause();

                        	    state._fsp--;

                        	    if (list_d==null) list_d=new ArrayList();
                        	    list_d.add(d.getTemplate());


                        	    }
                        	    break;

                        	default :
                        	    break loop20;
                            }
                        } while (true);


                        // com\\googlecode\\sparkleg\\SparqlT.g:78:39: (w= whereClause )?
                        int alt21=2;
                        switch ( input.LA(1) ) {
                            case WHERE_CLAUSE:
                                {
                                alt21=1;
                                }
                                break;
                        }

                        switch (alt21) {
                            case 1 :
                                // com\\googlecode\\sparkleg\\SparqlT.g:78:40: w= whereClause
                                {
                                pushFollow(FOLLOW_whereClause_in_constructQuery716);
                                w=whereClause();

                                state._fsp--;


                                }
                                break;

                        }


                        pushFollow(FOLLOW_solutionModifier_in_constructQuery722);
                        s=solutionModifier();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }


                    // TEMPLATE REWRITE
                    // 78:76: -> constructQuery(datasetClause=$dwhereClause=$w.stsolutionModifier=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("constructQuery",new STAttrMap().put("datasetClause", list_d).put("whereClause", (w!=null?w.st:null)).put("solutionModifier", (s!=null?s.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "describeQuery"
    // com\\googlecode\\sparkleg\\SparqlT.g:81:1: describeQuery : ^( DESCRIBE (v+= varOrIRIref )* ( ASTERISK )* (d+= datasetClause )* (w= whereClause )? s= solutionModifier ) -> describeQuery(varOrIRIref=$vattribute=$ASTERISK.textdatasetClause=$dwhereClause=$w.stsolutionModifier=$s.st);
    public final SparqlT.describeQuery_return describeQuery() throws RecognitionException {
        SparqlT.describeQuery_return retval = new SparqlT.describeQuery_return();
        retval.start = input.LT(1);


        CommonTree ASTERISK11=null;
        List list_v=null;
        List list_d=null;
        SparqlT.whereClause_return w =null;

        SparqlT.solutionModifier_return s =null;

        RuleReturnScope v = null;
        RuleReturnScope d = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:82:5: ( ^( DESCRIBE (v+= varOrIRIref )* ( ASTERISK )* (d+= datasetClause )* (w= whereClause )? s= solutionModifier ) -> describeQuery(varOrIRIref=$vattribute=$ASTERISK.textdatasetClause=$dwhereClause=$w.stsolutionModifier=$s.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:82:7: ^( DESCRIBE (v+= varOrIRIref )* ( ASTERISK )* (d+= datasetClause )* (w= whereClause )? s= solutionModifier )
            {
            match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeQuery760); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:82:18: (v+= varOrIRIref )*
                loop23:
                do {
                    int alt23=2;
                    switch ( input.LA(1) ) {
                    case IRI_REF:
                    case PNAME_LN:
                    case PNAME_NS:
                    case VAR1:
                    case VAR2:
                        {
                        alt23=1;
                        }
                        break;

                    }

                    switch (alt23) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:82:19: v+= varOrIRIref
                	    {
                	    pushFollow(FOLLOW_varOrIRIref_in_describeQuery765);
                	    v=varOrIRIref();

                	    state._fsp--;

                	    if (list_v==null) list_v=new ArrayList();
                	    list_v.add(v.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop23;
                    }
                } while (true);


                // com\\googlecode\\sparkleg\\SparqlT.g:82:36: ( ASTERISK )*
                loop24:
                do {
                    int alt24=2;
                    switch ( input.LA(1) ) {
                    case ASTERISK:
                        {
                        alt24=1;
                        }
                        break;

                    }

                    switch (alt24) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:82:36: ASTERISK
                	    {
                	    ASTERISK11=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_describeQuery769); 

                	    }
                	    break;

                	default :
                	    break loop24;
                    }
                } while (true);


                // com\\googlecode\\sparkleg\\SparqlT.g:82:46: (d+= datasetClause )*
                loop25:
                do {
                    int alt25=2;
                    switch ( input.LA(1) ) {
                    case FROM:
                        {
                        alt25=1;
                        }
                        break;

                    }

                    switch (alt25) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:82:47: d+= datasetClause
                	    {
                	    pushFollow(FOLLOW_datasetClause_in_describeQuery775);
                	    d=datasetClause();

                	    state._fsp--;

                	    if (list_d==null) list_d=new ArrayList();
                	    list_d.add(d.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop25;
                    }
                } while (true);


                // com\\googlecode\\sparkleg\\SparqlT.g:82:66: (w= whereClause )?
                int alt26=2;
                switch ( input.LA(1) ) {
                    case WHERE_CLAUSE:
                        {
                        alt26=1;
                        }
                        break;
                }

                switch (alt26) {
                    case 1 :
                        // com\\googlecode\\sparkleg\\SparqlT.g:82:67: w= whereClause
                        {
                        pushFollow(FOLLOW_whereClause_in_describeQuery782);
                        w=whereClause();

                        state._fsp--;


                        }
                        break;

                }


                pushFollow(FOLLOW_solutionModifier_in_describeQuery788);
                s=solutionModifier();

                state._fsp--;


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 82:103: -> describeQuery(varOrIRIref=$vattribute=$ASTERISK.textdatasetClause=$dwhereClause=$w.stsolutionModifier=$s.st)
            {
                retval.st = templateLib.getInstanceOf("describeQuery",new STAttrMap().put("varOrIRIref", list_v).put("attribute", (ASTERISK11!=null?ASTERISK11.getText():null)).put("datasetClause", list_d).put("whereClause", (w!=null?w.st:null)).put("solutionModifier", (s!=null?s.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "askQuery"
    // com\\googlecode\\sparkleg\\SparqlT.g:85:1: askQuery : ^( ASK (d+= datasetClause )* w= whereClause ) -> askQuery(datasetClause=$dwhereClause=$w.st);
    public final SparqlT.askQuery_return askQuery() throws RecognitionException {
        SparqlT.askQuery_return retval = new SparqlT.askQuery_return();
        retval.start = input.LT(1);


        List list_d=null;
        SparqlT.whereClause_return w =null;

        RuleReturnScope d = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:86:5: ( ^( ASK (d+= datasetClause )* w= whereClause ) -> askQuery(datasetClause=$dwhereClause=$w.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:86:7: ^( ASK (d+= datasetClause )* w= whereClause )
            {
            match(input,ASK,FOLLOW_ASK_in_askQuery836); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:86:13: (d+= datasetClause )*
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case FROM:
                    {
                    alt27=1;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:86:14: d+= datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_askQuery841);
            	    d=datasetClause();

            	    state._fsp--;

            	    if (list_d==null) list_d=new ArrayList();
            	    list_d.add(d.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            pushFollow(FOLLOW_whereClause_in_askQuery847);
            w=whereClause();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 86:48: -> askQuery(datasetClause=$dwhereClause=$w.st)
            {
                retval.st = templateLib.getInstanceOf("askQuery",new STAttrMap().put("datasetClause", list_d).put("whereClause", (w!=null?w.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "datasetClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:89:1: datasetClause : ^( FROM ( NAMED )? i= iriRef ) -> datasetClause(attribute=$NAMED.textiriRef=$i.st);
    public final SparqlT.datasetClause_return datasetClause() throws RecognitionException {
        SparqlT.datasetClause_return retval = new SparqlT.datasetClause_return();
        retval.start = input.LT(1);


        CommonTree NAMED12=null;
        SparqlT.iriRef_return i =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:90:5: ( ^( FROM ( NAMED )? i= iriRef ) -> datasetClause(attribute=$NAMED.textiriRef=$i.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:90:7: ^( FROM ( NAMED )? i= iriRef )
            {
            match(input,FROM,FOLLOW_FROM_in_datasetClause880); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:90:14: ( NAMED )?
            int alt28=2;
            switch ( input.LA(1) ) {
                case NAMED:
                    {
                    alt28=1;
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:90:14: NAMED
                    {
                    NAMED12=(CommonTree)match(input,NAMED,FOLLOW_NAMED_in_datasetClause882); 

                    }
                    break;

            }


            pushFollow(FOLLOW_iriRef_in_datasetClause887);
            i=iriRef();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 90:31: -> datasetClause(attribute=$NAMED.textiriRef=$i.st)
            {
                retval.st = templateLib.getInstanceOf("datasetClause",new STAttrMap().put("attribute", (NAMED12!=null?NAMED12.getText():null)).put("iriRef", (i!=null?i.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "whereClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:93:1: whereClause : ^( WHERE_CLAUSE (g= groupGraphPattern )? ) -> whereClause(groupGraphPattern=$g.st);
    public final SparqlT.whereClause_return whereClause() throws RecognitionException {
        SparqlT.whereClause_return retval = new SparqlT.whereClause_return();
        retval.start = input.LT(1);


        SparqlT.groupGraphPattern_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:94:5: ( ^( WHERE_CLAUSE (g= groupGraphPattern )? ) -> whereClause(groupGraphPattern=$g.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:94:7: ^( WHERE_CLAUSE (g= groupGraphPattern )? )
            {
            match(input,WHERE_CLAUSE,FOLLOW_WHERE_CLAUSE_in_whereClause920); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:94:22: (g= groupGraphPattern )?
                int alt29=2;
                switch ( input.LA(1) ) {
                    case GROUP_GRAPH_PATTERN:
                        {
                        alt29=1;
                        }
                        break;
                }

                switch (alt29) {
                    case 1 :
                        // com\\googlecode\\sparkleg\\SparqlT.g:94:23: g= groupGraphPattern
                        {
                        pushFollow(FOLLOW_groupGraphPattern_in_whereClause925);
                        g=groupGraphPattern();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 94:46: -> whereClause(groupGraphPattern=$g.st)
            {
                retval.st = templateLib.getInstanceOf("whereClause",new STAttrMap().put("groupGraphPattern", (g!=null?g.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "solutionModifier"
    // com\\googlecode\\sparkleg\\SparqlT.g:97:1: solutionModifier : (g= groupClause )? (h= havingClause )? (o= orderClause )? (l= limitOffsetClauses )? -> solutionModifier(groupClause=$g.sthavingClause=$h.storderClause=$o.stlimitOffsetClauses=$l.st);
    public final SparqlT.solutionModifier_return solutionModifier() throws RecognitionException {
        SparqlT.solutionModifier_return retval = new SparqlT.solutionModifier_return();
        retval.start = input.LT(1);


        SparqlT.groupClause_return g =null;

        SparqlT.havingClause_return h =null;

        SparqlT.orderClause_return o =null;

        SparqlT.limitOffsetClauses_return l =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:98:5: ( (g= groupClause )? (h= havingClause )? (o= orderClause )? (l= limitOffsetClauses )? -> solutionModifier(groupClause=$g.sthavingClause=$h.storderClause=$o.stlimitOffsetClauses=$l.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:98:7: (g= groupClause )? (h= havingClause )? (o= orderClause )? (l= limitOffsetClauses )?
            {
            // com\\googlecode\\sparkleg\\SparqlT.g:98:7: (g= groupClause )?
            int alt30=2;
            switch ( input.LA(1) ) {
                case GROUP_BY:
                    {
                    alt30=1;
                    }
                    break;
            }

            switch (alt30) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:98:8: g= groupClause
                    {
                    pushFollow(FOLLOW_groupClause_in_solutionModifier961);
                    g=groupClause();

                    state._fsp--;


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\SparqlT.g:98:24: (h= havingClause )?
            int alt31=2;
            switch ( input.LA(1) ) {
                case HAVING:
                    {
                    alt31=1;
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:98:25: h= havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_solutionModifier968);
                    h=havingClause();

                    state._fsp--;


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\SparqlT.g:98:42: (o= orderClause )?
            int alt32=2;
            switch ( input.LA(1) ) {
                case ORDER_BY:
                    {
                    alt32=1;
                    }
                    break;
            }

            switch (alt32) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:98:43: o= orderClause
                    {
                    pushFollow(FOLLOW_orderClause_in_solutionModifier975);
                    o=orderClause();

                    state._fsp--;


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\SparqlT.g:98:59: (l= limitOffsetClauses )?
            int alt33=2;
            switch ( input.LA(1) ) {
                case LIMIT:
                case OFFSET:
                    {
                    alt33=1;
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:98:60: l= limitOffsetClauses
                    {
                    pushFollow(FOLLOW_limitOffsetClauses_in_solutionModifier982);
                    l=limitOffsetClauses();

                    state._fsp--;


                    }
                    break;

            }


            // TEMPLATE REWRITE
            // 98:83: -> solutionModifier(groupClause=$g.sthavingClause=$h.storderClause=$o.stlimitOffsetClauses=$l.st)
            {
                retval.st = templateLib.getInstanceOf("solutionModifier",new STAttrMap().put("groupClause", (g!=null?g.st:null)).put("havingClause", (h!=null?h.st:null)).put("orderClause", (o!=null?o.st:null)).put("limitOffsetClauses", (l!=null?l.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "groupClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:101:1: groupClause : ^( GROUP_BY (g+= groupCondition )+ ) -> groupClause(groupCondition=$g);
    public final SparqlT.groupClause_return groupClause() throws RecognitionException {
        SparqlT.groupClause_return retval = new SparqlT.groupClause_return();
        retval.start = input.LT(1);


        List list_g=null;
        RuleReturnScope g = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:102:5: ( ^( GROUP_BY (g+= groupCondition )+ ) -> groupClause(groupCondition=$g))
            // com\\googlecode\\sparkleg\\SparqlT.g:102:7: ^( GROUP_BY (g+= groupCondition )+ )
            {
            match(input,GROUP_BY,FOLLOW_GROUP_BY_in_groupClause1027); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:102:18: (g+= groupCondition )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                switch ( input.LA(1) ) {
                case GROUP_CONDITION:
                    {
                    alt34=1;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:102:19: g+= groupCondition
            	    {
            	    pushFollow(FOLLOW_groupCondition_in_groupClause1032);
            	    g=groupCondition();

            	    state._fsp--;

            	    if (list_g==null) list_g=new ArrayList();
            	    list_g.add(g.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 102:40: -> groupClause(groupCondition=$g)
            {
                retval.st = templateLib.getInstanceOf("groupClause",new STAttrMap().put("groupCondition", list_g));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "groupCondition"
    // com\\googlecode\\sparkleg\\SparqlT.g:105:1: groupCondition : ( ^( GROUP_CONDITION b= builtInCall ) -> groupCondition(builtInCall=$b.st)| ^( GROUP_CONDITION f= functionCall ) -> groupCondition(functionCall=$f.st)| ^( GROUP_CONDITION e= expression ^( AS (v= var )? ) ) -> groupCondition(expression=$e.stvar=$v.st)| ^( GROUP_CONDITION var ) -> groupCondition(var=$var.st));
    public final SparqlT.groupCondition_return groupCondition() throws RecognitionException {
        SparqlT.groupCondition_return retval = new SparqlT.groupCondition_return();
        retval.start = input.LT(1);


        SparqlT.builtInCall_return b =null;

        SparqlT.functionCall_return f =null;

        SparqlT.expression_return e =null;

        SparqlT.var_return v =null;

        SparqlT.var_return var13 =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:106:5: ( ^( GROUP_CONDITION b= builtInCall ) -> groupCondition(builtInCall=$b.st)| ^( GROUP_CONDITION f= functionCall ) -> groupCondition(functionCall=$f.st)| ^( GROUP_CONDITION e= expression ^( AS (v= var )? ) ) -> groupCondition(expression=$e.stvar=$v.st)| ^( GROUP_CONDITION var ) -> groupCondition(var=$var.st))
            int alt36=4;
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
                        alt36=1;
                        }
                        break;
                    case FUNCTION:
                        {
                        alt36=2;
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
                        alt36=3;
                        }
                        break;
                    case VAR1:
                    case VAR2:
                        {
                        alt36=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:106:7: ^( GROUP_CONDITION b= builtInCall )
                    {
                    match(input,GROUP_CONDITION,FOLLOW_GROUP_CONDITION_in_groupCondition1069); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_builtInCall_in_groupCondition1073);
                    b=builtInCall();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 106:40: -> groupCondition(builtInCall=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("groupCondition",new STAttrMap().put("builtInCall", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:107:7: ^( GROUP_CONDITION f= functionCall )
                    {
                    match(input,GROUP_CONDITION,FOLLOW_GROUP_CONDITION_in_groupCondition1092); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_functionCall_in_groupCondition1096);
                    f=functionCall();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 107:41: -> groupCondition(functionCall=$f.st)
                    {
                        retval.st = templateLib.getInstanceOf("groupCondition",new STAttrMap().put("functionCall", (f!=null?f.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:108:7: ^( GROUP_CONDITION e= expression ^( AS (v= var )? ) )
                    {
                    match(input,GROUP_CONDITION,FOLLOW_GROUP_CONDITION_in_groupCondition1115); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_groupCondition1119);
                    e=expression();

                    state._fsp--;


                    match(input,AS,FOLLOW_AS_in_groupCondition1122); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:108:43: (v= var )?
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
                                // com\\googlecode\\sparkleg\\SparqlT.g:108:44: v= var
                                {
                                pushFollow(FOLLOW_var_in_groupCondition1127);
                                v=var();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 108:55: -> groupCondition(expression=$e.stvar=$v.st)
                    {
                        retval.st = templateLib.getInstanceOf("groupCondition",new STAttrMap().put("expression", (e!=null?e.st:null)).put("var", (v!=null?v.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:109:7: ^( GROUP_CONDITION var )
                    {
                    match(input,GROUP_CONDITION,FOLLOW_GROUP_CONDITION_in_groupCondition1155); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_var_in_groupCondition1157);
                    var13=var();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 109:30: -> groupCondition(var=$var.st)
                    {
                        retval.st = templateLib.getInstanceOf("groupCondition",new STAttrMap().put("var", (var13!=null?var13.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "havingClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:112:1: havingClause : ^( HAVING (c+= constraint )+ ) -> havingClause(constraint=$c);
    public final SparqlT.havingClause_return havingClause() throws RecognitionException {
        SparqlT.havingClause_return retval = new SparqlT.havingClause_return();
        retval.start = input.LT(1);


        List list_c=null;
        RuleReturnScope c = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:113:5: ( ^( HAVING (c+= constraint )+ ) -> havingClause(constraint=$c))
            // com\\googlecode\\sparkleg\\SparqlT.g:113:7: ^( HAVING (c+= constraint )+ )
            {
            match(input,HAVING,FOLLOW_HAVING_in_havingClause1185); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:113:16: (c+= constraint )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case ABS:
                case BNODE:
                case BOUND:
                case BRACKETTED_EXPRESSION:
                case CEIL:
                case COALESCE:
                case CONCAT:
                case CONTAINS:
                case DATATYPE:
                case DAY:
                case ENCODE_FOR_URI:
                case EXISTS:
                case FLOOR:
                case FUNCTION:
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

                }

                switch (alt37) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:113:17: c+= constraint
            	    {
            	    pushFollow(FOLLOW_constraint_in_havingClause1190);
            	    c=constraint();

            	    state._fsp--;

            	    if (list_c==null) list_c=new ArrayList();
            	    list_c.add(c.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 113:34: -> havingClause(constraint=$c)
            {
                retval.st = templateLib.getInstanceOf("havingClause",new STAttrMap().put("constraint", list_c));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "orderClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:116:1: orderClause : ^( ORDER_BY (o+= orderCondition )+ ) -> orderClause(orderCondition=$o);
    public final SparqlT.orderClause_return orderClause() throws RecognitionException {
        SparqlT.orderClause_return retval = new SparqlT.orderClause_return();
        retval.start = input.LT(1);


        List list_o=null;
        RuleReturnScope o = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:117:5: ( ^( ORDER_BY (o+= orderCondition )+ ) -> orderClause(orderCondition=$o))
            // com\\googlecode\\sparkleg\\SparqlT.g:117:7: ^( ORDER_BY (o+= orderCondition )+ )
            {
            match(input,ORDER_BY,FOLLOW_ORDER_BY_in_orderClause1225); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:117:18: (o+= orderCondition )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                switch ( input.LA(1) ) {
                case ORDER_CONDITION:
                    {
                    alt38=1;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:117:19: o+= orderCondition
            	    {
            	    pushFollow(FOLLOW_orderCondition_in_orderClause1230);
            	    o=orderCondition();

            	    state._fsp--;

            	    if (list_o==null) list_o=new ArrayList();
            	    list_o.add(o.getTemplate());


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


            // TEMPLATE REWRITE
            // 117:40: -> orderClause(orderCondition=$o)
            {
                retval.st = templateLib.getInstanceOf("orderClause",new STAttrMap().put("orderCondition", list_o));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "orderCondition"
    // com\\googlecode\\sparkleg\\SparqlT.g:120:1: orderCondition : ( ^( ORDER_CONDITION ASC b= brackettedExpression ) -> orderCondition(attribute=$ASC.textbrackettedExpression=$b.st)| ^( ORDER_CONDITION DESC b= brackettedExpression ) -> orderCondition(attribute=$DESC.textbrackettedExpression=$b.st)| ^( ORDER_CONDITION c= constraint ) -> orderCondition(constraint=$c.st)| ^( ORDER_CONDITION v= var ) -> orderCondition(var=$v.st));
    public final SparqlT.orderCondition_return orderCondition() throws RecognitionException {
        SparqlT.orderCondition_return retval = new SparqlT.orderCondition_return();
        retval.start = input.LT(1);


        CommonTree ASC14=null;
        CommonTree DESC15=null;
        SparqlT.brackettedExpression_return b =null;

        SparqlT.constraint_return c =null;

        SparqlT.var_return v =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:121:5: ( ^( ORDER_CONDITION ASC b= brackettedExpression ) -> orderCondition(attribute=$ASC.textbrackettedExpression=$b.st)| ^( ORDER_CONDITION DESC b= brackettedExpression ) -> orderCondition(attribute=$DESC.textbrackettedExpression=$b.st)| ^( ORDER_CONDITION c= constraint ) -> orderCondition(constraint=$c.st)| ^( ORDER_CONDITION v= var ) -> orderCondition(var=$v.st))
            int alt39=4;
            switch ( input.LA(1) ) {
            case ORDER_CONDITION:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case ASC:
                        {
                        alt39=1;
                        }
                        break;
                    case DESC:
                        {
                        alt39=2;
                        }
                        break;
                    case ABS:
                    case BNODE:
                    case BOUND:
                    case BRACKETTED_EXPRESSION:
                    case CEIL:
                    case COALESCE:
                    case CONCAT:
                    case CONTAINS:
                    case DATATYPE:
                    case DAY:
                    case ENCODE_FOR_URI:
                    case EXISTS:
                    case FLOOR:
                    case FUNCTION:
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
                        alt39=3;
                        }
                        break;
                    case VAR1:
                    case VAR2:
                        {
                        alt39=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:121:7: ^( ORDER_CONDITION ASC b= brackettedExpression )
                    {
                    match(input,ORDER_CONDITION,FOLLOW_ORDER_CONDITION_in_orderCondition1260); 

                    match(input, Token.DOWN, null); 
                    ASC14=(CommonTree)match(input,ASC,FOLLOW_ASC_in_orderCondition1262); 

                    pushFollow(FOLLOW_brackettedExpression_in_orderCondition1266);
                    b=brackettedExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 121:53: -> orderCondition(attribute=$ASC.textbrackettedExpression=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("orderCondition",new STAttrMap().put("attribute", (ASC14!=null?ASC14.getText():null)).put("brackettedExpression", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:122:7: ^( ORDER_CONDITION DESC b= brackettedExpression )
                    {
                    match(input,ORDER_CONDITION,FOLLOW_ORDER_CONDITION_in_orderCondition1290); 

                    match(input, Token.DOWN, null); 
                    DESC15=(CommonTree)match(input,DESC,FOLLOW_DESC_in_orderCondition1292); 

                    pushFollow(FOLLOW_brackettedExpression_in_orderCondition1296);
                    b=brackettedExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 122:54: -> orderCondition(attribute=$DESC.textbrackettedExpression=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("orderCondition",new STAttrMap().put("attribute", (DESC15!=null?DESC15.getText():null)).put("brackettedExpression", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:123:7: ^( ORDER_CONDITION c= constraint )
                    {
                    match(input,ORDER_CONDITION,FOLLOW_ORDER_CONDITION_in_orderCondition1320); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_constraint_in_orderCondition1324);
                    c=constraint();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 123:39: -> orderCondition(constraint=$c.st)
                    {
                        retval.st = templateLib.getInstanceOf("orderCondition",new STAttrMap().put("constraint", (c!=null?c.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:124:7: ^( ORDER_CONDITION v= var )
                    {
                    match(input,ORDER_CONDITION,FOLLOW_ORDER_CONDITION_in_orderCondition1343); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_var_in_orderCondition1347);
                    v=var();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 124:32: -> orderCondition(var=$v.st)
                    {
                        retval.st = templateLib.getInstanceOf("orderCondition",new STAttrMap().put("var", (v!=null?v.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "limitOffsetClauses"
    // com\\googlecode\\sparkleg\\SparqlT.g:127:1: limitOffsetClauses : ( ^( LIMIT l= INTEGER ) ( ^( OFFSET o= INTEGER ) )* -> limitOffsetClauses(limit=$l.textoffset=$o.text)| ^( OFFSET o= INTEGER ) ( ^( LIMIT l= INTEGER ) )* -> limitOffsetClauses(limit=$l.textoffset=$o.text));
    public final SparqlT.limitOffsetClauses_return limitOffsetClauses() throws RecognitionException {
        SparqlT.limitOffsetClauses_return retval = new SparqlT.limitOffsetClauses_return();
        retval.start = input.LT(1);


        CommonTree l=null;
        CommonTree o=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:128:5: ( ^( LIMIT l= INTEGER ) ( ^( OFFSET o= INTEGER ) )* -> limitOffsetClauses(limit=$l.textoffset=$o.text)| ^( OFFSET o= INTEGER ) ( ^( LIMIT l= INTEGER ) )* -> limitOffsetClauses(limit=$l.textoffset=$o.text))
            int alt42=2;
            switch ( input.LA(1) ) {
            case LIMIT:
                {
                alt42=1;
                }
                break;
            case OFFSET:
                {
                alt42=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:128:7: ^( LIMIT l= INTEGER ) ( ^( OFFSET o= INTEGER ) )*
                    {
                    match(input,LIMIT,FOLLOW_LIMIT_in_limitOffsetClauses1380); 

                    match(input, Token.DOWN, null); 
                    l=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitOffsetClauses1384); 

                    match(input, Token.UP, null); 


                    // com\\googlecode\\sparkleg\\SparqlT.g:128:26: ( ^( OFFSET o= INTEGER ) )*
                    loop40:
                    do {
                        int alt40=2;
                        switch ( input.LA(1) ) {
                        case OFFSET:
                            {
                            alt40=1;
                            }
                            break;

                        }

                        switch (alt40) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:128:27: ^( OFFSET o= INTEGER )
                    	    {
                    	    match(input,OFFSET,FOLLOW_OFFSET_in_limitOffsetClauses1389); 

                    	    match(input, Token.DOWN, null); 
                    	    o=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitOffsetClauses1393); 

                    	    match(input, Token.UP, null); 


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    // TEMPLATE REWRITE
                    // 128:49: -> limitOffsetClauses(limit=$l.textoffset=$o.text)
                    {
                        retval.st = templateLib.getInstanceOf("limitOffsetClauses",new STAttrMap().put("limit", (l!=null?l.getText():null)).put("offset", (o!=null?o.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:129:7: ^( OFFSET o= INTEGER ) ( ^( LIMIT l= INTEGER ) )*
                    {
                    match(input,OFFSET,FOLLOW_OFFSET_in_limitOffsetClauses1419); 

                    match(input, Token.DOWN, null); 
                    o=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitOffsetClauses1423); 

                    match(input, Token.UP, null); 


                    // com\\googlecode\\sparkleg\\SparqlT.g:129:27: ( ^( LIMIT l= INTEGER ) )*
                    loop41:
                    do {
                        int alt41=2;
                        switch ( input.LA(1) ) {
                        case LIMIT:
                            {
                            alt41=1;
                            }
                            break;

                        }

                        switch (alt41) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:129:28: ^( LIMIT l= INTEGER )
                    	    {
                    	    match(input,LIMIT,FOLLOW_LIMIT_in_limitOffsetClauses1428); 

                    	    match(input, Token.DOWN, null); 
                    	    l=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitOffsetClauses1432); 

                    	    match(input, Token.UP, null); 


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    // TEMPLATE REWRITE
                    // 129:49: -> limitOffsetClauses(limit=$l.textoffset=$o.text)
                    {
                        retval.st = templateLib.getInstanceOf("limitOffsetClauses",new STAttrMap().put("limit", (l!=null?l.getText():null)).put("offset", (o!=null?o.getText():null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bindingsClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:132:1: bindingsClause : ^( BINDINGS (v+= var )* (b+= bindingValueList )* ) -> bindingsClause(var=$vbindingValueList=$b);
    public final SparqlT.bindingsClause_return bindingsClause() throws RecognitionException {
        SparqlT.bindingsClause_return retval = new SparqlT.bindingsClause_return();
        retval.start = input.LT(1);


        List list_v=null;
        List list_b=null;
        RuleReturnScope v = null;
        RuleReturnScope b = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:133:5: ( ^( BINDINGS (v+= var )* (b+= bindingValueList )* ) -> bindingsClause(var=$vbindingValueList=$b))
            // com\\googlecode\\sparkleg\\SparqlT.g:133:7: ^( BINDINGS (v+= var )* (b+= bindingValueList )* )
            {
            match(input,BINDINGS,FOLLOW_BINDINGS_in_bindingsClause1467); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:133:18: (v+= var )*
                loop43:
                do {
                    int alt43=2;
                    switch ( input.LA(1) ) {
                    case VAR1:
                    case VAR2:
                        {
                        alt43=1;
                        }
                        break;

                    }

                    switch (alt43) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:133:19: v+= var
                	    {
                	    pushFollow(FOLLOW_var_in_bindingsClause1472);
                	    v=var();

                	    state._fsp--;

                	    if (list_v==null) list_v=new ArrayList();
                	    list_v.add(v.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop43;
                    }
                } while (true);


                // com\\googlecode\\sparkleg\\SparqlT.g:133:28: (b+= bindingValueList )*
                loop44:
                do {
                    int alt44=2;
                    switch ( input.LA(1) ) {
                    case BINDING_VALUE:
                        {
                        alt44=1;
                        }
                        break;

                    }

                    switch (alt44) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:133:29: b+= bindingValueList
                	    {
                	    pushFollow(FOLLOW_bindingValueList_in_bindingsClause1479);
                	    b=bindingValueList();

                	    state._fsp--;

                	    if (list_b==null) list_b=new ArrayList();
                	    list_b.add(b.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop44;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 133:52: -> bindingsClause(var=$vbindingValueList=$b)
            {
                retval.st = templateLib.getInstanceOf("bindingsClause",new STAttrMap().put("var", list_v).put("bindingValueList", list_b));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bindingValueList"
    // com\\googlecode\\sparkleg\\SparqlT.g:136:1: bindingValueList : ^( BINDING_VALUE (b+= bindingValue )* ) -> bindingValueList(bindingValue=$b);
    public final SparqlT.bindingValueList_return bindingValueList() throws RecognitionException {
        SparqlT.bindingValueList_return retval = new SparqlT.bindingValueList_return();
        retval.start = input.LT(1);


        List list_b=null;
        RuleReturnScope b = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:137:5: ( ^( BINDING_VALUE (b+= bindingValue )* ) -> bindingValueList(bindingValue=$b))
            // com\\googlecode\\sparkleg\\SparqlT.g:137:7: ^( BINDING_VALUE (b+= bindingValue )* )
            {
            match(input,BINDING_VALUE,FOLLOW_BINDING_VALUE_in_bindingValueList1518); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:137:23: (b+= bindingValue )*
                loop45:
                do {
                    int alt45=2;
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
                        alt45=1;
                        }
                        break;

                    }

                    switch (alt45) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:137:24: b+= bindingValue
                	    {
                	    pushFollow(FOLLOW_bindingValue_in_bindingValueList1523);
                	    b=bindingValue();

                	    state._fsp--;

                	    if (list_b==null) list_b=new ArrayList();
                	    list_b.add(b.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop45;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 137:43: -> bindingValueList(bindingValue=$b)
            {
                retval.st = templateLib.getInstanceOf("bindingValueList",new STAttrMap().put("bindingValue", list_b));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bindingValue"
    // com\\googlecode\\sparkleg\\SparqlT.g:140:1: bindingValue : (i= iriRef -> bindingValue(iriRef=$i.st)|r= rdfLiteral -> bindingValue(rdfLiteral=$r.st)|n= numericLiteral -> bindingValue(numericLiteral=$n.st)|b= booleanLiteral -> bindingValue(booleanLiteral=$b.st)| UNDEF -> bindingValue(value=$UNDEF.text));
    public final SparqlT.bindingValue_return bindingValue() throws RecognitionException {
        SparqlT.bindingValue_return retval = new SparqlT.bindingValue_return();
        retval.start = input.LT(1);


        CommonTree UNDEF16=null;
        SparqlT.iriRef_return i =null;

        SparqlT.rdfLiteral_return r =null;

        SparqlT.numericLiteral_return n =null;

        SparqlT.booleanLiteral_return b =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:141:5: (i= iriRef -> bindingValue(iriRef=$i.st)|r= rdfLiteral -> bindingValue(rdfLiteral=$r.st)|n= numericLiteral -> bindingValue(numericLiteral=$n.st)|b= booleanLiteral -> bindingValue(booleanLiteral=$b.st)| UNDEF -> bindingValue(value=$UNDEF.text))
            int alt46=5;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt46=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt46=2;
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
                alt46=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt46=4;
                }
                break;
            case UNDEF:
                {
                alt46=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:141:7: i= iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_bindingValue1559);
                    i=iriRef();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 141:16: -> bindingValue(iriRef=$i.st)
                    {
                        retval.st = templateLib.getInstanceOf("bindingValue",new STAttrMap().put("iriRef", (i!=null?i.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:142:7: r= rdfLiteral
                    {
                    pushFollow(FOLLOW_rdfLiteral_in_bindingValue1578);
                    r=rdfLiteral();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 142:20: -> bindingValue(rdfLiteral=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("bindingValue",new STAttrMap().put("rdfLiteral", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:143:7: n= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_bindingValue1598);
                    n=numericLiteral();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 143:24: -> bindingValue(numericLiteral=$n.st)
                    {
                        retval.st = templateLib.getInstanceOf("bindingValue",new STAttrMap().put("numericLiteral", (n!=null?n.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:144:7: b= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_bindingValue1619);
                    b=booleanLiteral();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 144:24: -> bindingValue(booleanLiteral=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("bindingValue",new STAttrMap().put("booleanLiteral", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:145:7: UNDEF
                    {
                    UNDEF16=(CommonTree)match(input,UNDEF,FOLLOW_UNDEF_in_bindingValue1638); 

                    // TEMPLATE REWRITE
                    // 145:13: -> bindingValue(value=$UNDEF.text)
                    {
                        retval.st = templateLib.getInstanceOf("bindingValue",new STAttrMap().put("value", (UNDEF16!=null?UNDEF16.getText():null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "update"
    // com\\googlecode\\sparkleg\\SparqlT.g:148:1: update : p= prologue (l= load )* (c= clear )* (d= drop )* (a= add )* (m= move )* (cp= copy )* (cr= create )* (i= insert )* (del= delete )* (md= modify )* -> update(prologue=$p.stload=$l.stclear=$c.stdrop=$d.stadd=$a.stmove=$m.stcopy=$cp.stcreate=$cr.stinsert=$i.stdelete=$del.stmodify=$md.st);
    public final SparqlT.update_return update() throws RecognitionException {
        SparqlT.update_return retval = new SparqlT.update_return();
        retval.start = input.LT(1);


        SparqlT.prologue_return p =null;

        SparqlT.load_return l =null;

        SparqlT.clear_return c =null;

        SparqlT.drop_return d =null;

        SparqlT.add_return a =null;

        SparqlT.move_return m =null;

        SparqlT.copy_return cp =null;

        SparqlT.create_return cr =null;

        SparqlT.insert_return i =null;

        SparqlT.delete_return del =null;

        SparqlT.modify_return md =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:149:5: (p= prologue (l= load )* (c= clear )* (d= drop )* (a= add )* (m= move )* (cp= copy )* (cr= create )* (i= insert )* (del= delete )* (md= modify )* -> update(prologue=$p.stload=$l.stclear=$c.stdrop=$d.stadd=$a.stmove=$m.stcopy=$cp.stcreate=$cr.stinsert=$i.stdelete=$del.stmodify=$md.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:149:7: p= prologue (l= load )* (c= clear )* (d= drop )* (a= add )* (m= move )* (cp= copy )* (cr= create )* (i= insert )* (del= delete )* (md= modify )*
            {
            pushFollow(FOLLOW_prologue_in_update1671);
            p=prologue();

            state._fsp--;


            // com\\googlecode\\sparkleg\\SparqlT.g:149:19: (l= load )*
            loop47:
            do {
                int alt47=2;
                switch ( input.LA(1) ) {
                case LOAD:
                    {
                    alt47=1;
                    }
                    break;

                }

                switch (alt47) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:149:19: l= load
            	    {
            	    pushFollow(FOLLOW_load_in_update1675);
            	    l=load();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:149:27: (c= clear )*
            loop48:
            do {
                int alt48=2;
                switch ( input.LA(1) ) {
                case CLEAR:
                    {
                    alt48=1;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:149:27: c= clear
            	    {
            	    pushFollow(FOLLOW_clear_in_update1680);
            	    c=clear();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:149:36: (d= drop )*
            loop49:
            do {
                int alt49=2;
                switch ( input.LA(1) ) {
                case DROP:
                    {
                    alt49=1;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:149:36: d= drop
            	    {
            	    pushFollow(FOLLOW_drop_in_update1685);
            	    d=drop();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:149:44: (a= add )*
            loop50:
            do {
                int alt50=2;
                switch ( input.LA(1) ) {
                case ADD:
                    {
                    alt50=1;
                    }
                    break;

                }

                switch (alt50) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:149:44: a= add
            	    {
            	    pushFollow(FOLLOW_add_in_update1690);
            	    a=add();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:149:51: (m= move )*
            loop51:
            do {
                int alt51=2;
                switch ( input.LA(1) ) {
                case MOVE:
                    {
                    alt51=1;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:149:51: m= move
            	    {
            	    pushFollow(FOLLOW_move_in_update1695);
            	    m=move();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:149:60: (cp= copy )*
            loop52:
            do {
                int alt52=2;
                switch ( input.LA(1) ) {
                case COPY:
                    {
                    alt52=1;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:149:60: cp= copy
            	    {
            	    pushFollow(FOLLOW_copy_in_update1700);
            	    cp=copy();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:149:69: (cr= create )*
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case CREATE:
                    {
                    alt53=1;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:149:69: cr= create
            	    {
            	    pushFollow(FOLLOW_create_in_update1705);
            	    cr=create();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:149:79: (i= insert )*
            loop54:
            do {
                int alt54=2;
                switch ( input.LA(1) ) {
                case INSERT:
                    {
                    alt54=1;
                    }
                    break;

                }

                switch (alt54) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:149:79: i= insert
            	    {
            	    pushFollow(FOLLOW_insert_in_update1710);
            	    i=insert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:149:91: (del= delete )*
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case DELETE:
                    {
                    alt55=1;
                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:149:91: del= delete
            	    {
            	    pushFollow(FOLLOW_delete_in_update1715);
            	    del=delete();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            // com\\googlecode\\sparkleg\\SparqlT.g:149:102: (md= modify )*
            loop56:
            do {
                int alt56=2;
                switch ( input.LA(1) ) {
                case MODIFY:
                    {
                    alt56=1;
                    }
                    break;

                }

                switch (alt56) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:149:102: md= modify
            	    {
            	    pushFollow(FOLLOW_modify_in_update1720);
            	    md=modify();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            // TEMPLATE REWRITE
            // 149:111: -> update(prologue=$p.stload=$l.stclear=$c.stdrop=$d.stadd=$a.stmove=$m.stcopy=$cp.stcreate=$cr.stinsert=$i.stdelete=$del.stmodify=$md.st)
            {
                retval.st = templateLib.getInstanceOf("update",new STAttrMap().put("prologue", (p!=null?p.st:null)).put("load", (l!=null?l.st:null)).put("clear", (c!=null?c.st:null)).put("drop", (d!=null?d.st:null)).put("add", (a!=null?a.st:null)).put("move", (m!=null?m.st:null)).put("copy", (cp!=null?cp.st:null)).put("create", (cr!=null?cr.st:null)).put("insert", (i!=null?i.st:null)).put("delete", (del!=null?del.st:null)).put("modify", (md!=null?md.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "load"
    // com\\googlecode\\sparkleg\\SparqlT.g:152:1: load : ^( LOAD ( SILENT )* i= iriRef (g= graphRef )? ) -> load(attribute=$SILENT.textiriRef=$i.stgraphRef=$g.st);
    public final SparqlT.load_return load() throws RecognitionException {
        SparqlT.load_return retval = new SparqlT.load_return();
        retval.start = input.LT(1);


        CommonTree SILENT17=null;
        SparqlT.iriRef_return i =null;

        SparqlT.graphRef_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:153:5: ( ^( LOAD ( SILENT )* i= iriRef (g= graphRef )? ) -> load(attribute=$SILENT.textiriRef=$i.stgraphRef=$g.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:153:7: ^( LOAD ( SILENT )* i= iriRef (g= graphRef )? )
            {
            match(input,LOAD,FOLLOW_LOAD_in_load1809); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:153:14: ( SILENT )*
            loop57:
            do {
                int alt57=2;
                switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt57=1;
                    }
                    break;

                }

                switch (alt57) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:153:14: SILENT
            	    {
            	    SILENT17=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_load1811); 

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            pushFollow(FOLLOW_iriRef_in_load1816);
            i=iriRef();

            state._fsp--;


            // com\\googlecode\\sparkleg\\SparqlT.g:153:31: (g= graphRef )?
            int alt58=2;
            switch ( input.LA(1) ) {
                case GRAPH:
                    {
                    alt58=1;
                    }
                    break;
            }

            switch (alt58) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:153:32: g= graphRef
                    {
                    pushFollow(FOLLOW_graphRef_in_load1821);
                    g=graphRef();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 153:46: -> load(attribute=$SILENT.textiriRef=$i.stgraphRef=$g.st)
            {
                retval.st = templateLib.getInstanceOf("load",new STAttrMap().put("attribute", (SILENT17!=null?SILENT17.getText():null)).put("iriRef", (i!=null?i.st:null)).put("graphRef", (g!=null?g.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "clear"
    // com\\googlecode\\sparkleg\\SparqlT.g:156:1: clear : ^( CLEAR ( SILENT )* g= graphRefAll ) -> clear(attribute=$SILENT.textgraphRef=$g.st);
    public final SparqlT.clear_return clear() throws RecognitionException {
        SparqlT.clear_return retval = new SparqlT.clear_return();
        retval.start = input.LT(1);


        CommonTree SILENT18=null;
        SparqlT.graphRefAll_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:157:5: ( ^( CLEAR ( SILENT )* g= graphRefAll ) -> clear(attribute=$SILENT.textgraphRef=$g.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:157:7: ^( CLEAR ( SILENT )* g= graphRefAll )
            {
            match(input,CLEAR,FOLLOW_CLEAR_in_clear1865); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:157:15: ( SILENT )*
            loop59:
            do {
                int alt59=2;
                switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt59=1;
                    }
                    break;

                }

                switch (alt59) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:157:15: SILENT
            	    {
            	    SILENT18=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_clear1867); 

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            pushFollow(FOLLOW_graphRefAll_in_clear1872);
            g=graphRefAll();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 157:38: -> clear(attribute=$SILENT.textgraphRef=$g.st)
            {
                retval.st = templateLib.getInstanceOf("clear",new STAttrMap().put("attribute", (SILENT18!=null?SILENT18.getText():null)).put("graphRef", (g!=null?g.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "drop"
    // com\\googlecode\\sparkleg\\SparqlT.g:160:1: drop : ^( DROP ( SILENT )* g= graphRefAll ) -> drop(attribute=$SILENT.textgraphRef=$g.st);
    public final SparqlT.drop_return drop() throws RecognitionException {
        SparqlT.drop_return retval = new SparqlT.drop_return();
        retval.start = input.LT(1);


        CommonTree SILENT19=null;
        SparqlT.graphRefAll_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:161:5: ( ^( DROP ( SILENT )* g= graphRefAll ) -> drop(attribute=$SILENT.textgraphRef=$g.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:161:7: ^( DROP ( SILENT )* g= graphRefAll )
            {
            match(input,DROP,FOLLOW_DROP_in_drop1909); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:161:14: ( SILENT )*
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
            	    // com\\googlecode\\sparkleg\\SparqlT.g:161:14: SILENT
            	    {
            	    SILENT19=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_drop1911); 

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            pushFollow(FOLLOW_graphRefAll_in_drop1916);
            g=graphRefAll();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 161:37: -> drop(attribute=$SILENT.textgraphRef=$g.st)
            {
                retval.st = templateLib.getInstanceOf("drop",new STAttrMap().put("attribute", (SILENT19!=null?SILENT19.getText():null)).put("graphRef", (g!=null?g.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "create"
    // com\\googlecode\\sparkleg\\SparqlT.g:164:1: create : ^( CREATE ( SILENT )* g= graphRef ) -> create(attribute=$SILENT.textgraphRef=$g.st);
    public final SparqlT.create_return create() throws RecognitionException {
        SparqlT.create_return retval = new SparqlT.create_return();
        retval.start = input.LT(1);


        CommonTree SILENT20=null;
        SparqlT.graphRef_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:165:5: ( ^( CREATE ( SILENT )* g= graphRef ) -> create(attribute=$SILENT.textgraphRef=$g.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:165:7: ^( CREATE ( SILENT )* g= graphRef )
            {
            match(input,CREATE,FOLLOW_CREATE_in_create1950); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:165:16: ( SILENT )*
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
            	    // com\\googlecode\\sparkleg\\SparqlT.g:165:16: SILENT
            	    {
            	    SILENT20=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_create1952); 

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            pushFollow(FOLLOW_graphRef_in_create1957);
            g=graphRef();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 165:36: -> create(attribute=$SILENT.textgraphRef=$g.st)
            {
                retval.st = templateLib.getInstanceOf("create",new STAttrMap().put("attribute", (SILENT20!=null?SILENT20.getText():null)).put("graphRef", (g!=null?g.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "add"
    // com\\googlecode\\sparkleg\\SparqlT.g:168:1: add : ^( ADD ( SILENT )* g1= graphOrDefault g2= graphOrDefault ) -> add(attribute=$SILENT.textgraphOrDefault1=$g1.stgraphOrDefault2=$g2.st);
    public final SparqlT.add_return add() throws RecognitionException {
        SparqlT.add_return retval = new SparqlT.add_return();
        retval.start = input.LT(1);


        CommonTree SILENT21=null;
        SparqlT.graphOrDefault_return g1 =null;

        SparqlT.graphOrDefault_return g2 =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:169:5: ( ^( ADD ( SILENT )* g1= graphOrDefault g2= graphOrDefault ) -> add(attribute=$SILENT.textgraphOrDefault1=$g1.stgraphOrDefault2=$g2.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:169:7: ^( ADD ( SILENT )* g1= graphOrDefault g2= graphOrDefault )
            {
            match(input,ADD,FOLLOW_ADD_in_add1994); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:169:13: ( SILENT )*
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
            	    // com\\googlecode\\sparkleg\\SparqlT.g:169:13: SILENT
            	    {
            	    SILENT21=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_add1996); 

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            pushFollow(FOLLOW_graphOrDefault_in_add2001);
            g1=graphOrDefault();

            state._fsp--;


            pushFollow(FOLLOW_graphOrDefault_in_add2005);
            g2=graphOrDefault();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 169:58: -> add(attribute=$SILENT.textgraphOrDefault1=$g1.stgraphOrDefault2=$g2.st)
            {
                retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("attribute", (SILENT21!=null?SILENT21.getText():null)).put("graphOrDefault1", (g1!=null?g1.st:null)).put("graphOrDefault2", (g2!=null?g2.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "move"
    // com\\googlecode\\sparkleg\\SparqlT.g:172:1: move : ^( MOVE ( SILENT )* g1= graphOrDefault g2= graphOrDefault ) -> move(attribute=$SILENT.textgraphOrDefault1=$g1.stgraphOrDefault2=$g2.st);
    public final SparqlT.move_return move() throws RecognitionException {
        SparqlT.move_return retval = new SparqlT.move_return();
        retval.start = input.LT(1);


        CommonTree SILENT22=null;
        SparqlT.graphOrDefault_return g1 =null;

        SparqlT.graphOrDefault_return g2 =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:173:5: ( ^( MOVE ( SILENT )* g1= graphOrDefault g2= graphOrDefault ) -> move(attribute=$SILENT.textgraphOrDefault1=$g1.stgraphOrDefault2=$g2.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:173:7: ^( MOVE ( SILENT )* g1= graphOrDefault g2= graphOrDefault )
            {
            match(input,MOVE,FOLLOW_MOVE_in_move2047); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:173:14: ( SILENT )*
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
            	    // com\\googlecode\\sparkleg\\SparqlT.g:173:14: SILENT
            	    {
            	    SILENT22=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_move2049); 

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            pushFollow(FOLLOW_graphOrDefault_in_move2054);
            g1=graphOrDefault();

            state._fsp--;


            pushFollow(FOLLOW_graphOrDefault_in_move2058);
            g2=graphOrDefault();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 173:59: -> move(attribute=$SILENT.textgraphOrDefault1=$g1.stgraphOrDefault2=$g2.st)
            {
                retval.st = templateLib.getInstanceOf("move",new STAttrMap().put("attribute", (SILENT22!=null?SILENT22.getText():null)).put("graphOrDefault1", (g1!=null?g1.st:null)).put("graphOrDefault2", (g2!=null?g2.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "copy"
    // com\\googlecode\\sparkleg\\SparqlT.g:176:1: copy : ^( COPY ( SILENT )* g1= graphOrDefault g2= graphOrDefault ) -> copy(attribute=$SILENT.textgraphOrDefault1=$g1.stgraphOrDefault2=$g2.st);
    public final SparqlT.copy_return copy() throws RecognitionException {
        SparqlT.copy_return retval = new SparqlT.copy_return();
        retval.start = input.LT(1);


        CommonTree SILENT23=null;
        SparqlT.graphOrDefault_return g1 =null;

        SparqlT.graphOrDefault_return g2 =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:177:5: ( ^( COPY ( SILENT )* g1= graphOrDefault g2= graphOrDefault ) -> copy(attribute=$SILENT.textgraphOrDefault1=$g1.stgraphOrDefault2=$g2.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:177:7: ^( COPY ( SILENT )* g1= graphOrDefault g2= graphOrDefault )
            {
            match(input,COPY,FOLLOW_COPY_in_copy2100); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:177:14: ( SILENT )*
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
            	    // com\\googlecode\\sparkleg\\SparqlT.g:177:14: SILENT
            	    {
            	    SILENT23=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_copy2102); 

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            pushFollow(FOLLOW_graphOrDefault_in_copy2107);
            g1=graphOrDefault();

            state._fsp--;


            pushFollow(FOLLOW_graphOrDefault_in_copy2111);
            g2=graphOrDefault();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 177:59: -> copy(attribute=$SILENT.textgraphOrDefault1=$g1.stgraphOrDefault2=$g2.st)
            {
                retval.st = templateLib.getInstanceOf("copy",new STAttrMap().put("attribute", (SILENT23!=null?SILENT23.getText():null)).put("graphOrDefault1", (g1!=null?g1.st:null)).put("graphOrDefault2", (g2!=null?g2.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "insert"
    // com\\googlecode\\sparkleg\\SparqlT.g:180:1: insert : ^( INSERT DATA q= quadPattern ) -> insert(quadPattern=$q.st);
    public final SparqlT.insert_return insert() throws RecognitionException {
        SparqlT.insert_return retval = new SparqlT.insert_return();
        retval.start = input.LT(1);


        SparqlT.quadPattern_return q =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:181:5: ( ^( INSERT DATA q= quadPattern ) -> insert(quadPattern=$q.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:181:7: ^( INSERT DATA q= quadPattern )
            {
            match(input,INSERT,FOLLOW_INSERT_in_insert2149); 

            match(input, Token.DOWN, null); 
            match(input,DATA,FOLLOW_DATA_in_insert2151); 

            pushFollow(FOLLOW_quadPattern_in_insert2155);
            q=quadPattern();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 181:36: -> insert(quadPattern=$q.st)
            {
                retval.st = templateLib.getInstanceOf("insert",new STAttrMap().put("quadPattern", (q!=null?q.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "delete"
    // com\\googlecode\\sparkleg\\SparqlT.g:184:1: delete : DELETE (d= deleteData |w= deleteWhere ) -> delete(deleteData=$d.stdeleteWhere=$w.st);
    public final SparqlT.delete_return delete() throws RecognitionException {
        SparqlT.delete_return retval = new SparqlT.delete_return();
        retval.start = input.LT(1);


        SparqlT.deleteData_return d =null;

        SparqlT.deleteWhere_return w =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:185:5: ( DELETE (d= deleteData |w= deleteWhere ) -> delete(deleteData=$d.stdeleteWhere=$w.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:185:7: DELETE (d= deleteData |w= deleteWhere )
            {
            match(input,DELETE,FOLLOW_DELETE_in_delete2189); 

            // com\\googlecode\\sparkleg\\SparqlT.g:185:14: (d= deleteData |w= deleteWhere )
            int alt65=2;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case DATA:
                        {
                        alt65=1;
                        }
                        break;
                    case WHERE:
                        {
                        alt65=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 2, input);

                        throw nvae;

                    }

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
                    // com\\googlecode\\sparkleg\\SparqlT.g:185:15: d= deleteData
                    {
                    pushFollow(FOLLOW_deleteData_in_delete2194);
                    d=deleteData();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:185:30: w= deleteWhere
                    {
                    pushFollow(FOLLOW_deleteWhere_in_delete2200);
                    w=deleteWhere();

                    state._fsp--;


                    }
                    break;

            }


            // TEMPLATE REWRITE
            // 185:45: -> delete(deleteData=$d.stdeleteWhere=$w.st)
            {
                retval.st = templateLib.getInstanceOf("delete",new STAttrMap().put("deleteData", (d!=null?d.st:null)).put("deleteWhere", (w!=null?w.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "deleteData"
    // com\\googlecode\\sparkleg\\SparqlT.g:188:1: deleteData : ^( DELETE DATA q= quadPattern ) -> deleteData(quadPattern=$q.st);
    public final SparqlT.deleteData_return deleteData() throws RecognitionException {
        SparqlT.deleteData_return retval = new SparqlT.deleteData_return();
        retval.start = input.LT(1);


        SparqlT.quadPattern_return q =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:189:5: ( ^( DELETE DATA q= quadPattern ) -> deleteData(quadPattern=$q.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:189:7: ^( DELETE DATA q= quadPattern )
            {
            match(input,DELETE,FOLLOW_DELETE_in_deleteData2233); 

            match(input, Token.DOWN, null); 
            match(input,DATA,FOLLOW_DATA_in_deleteData2235); 

            pushFollow(FOLLOW_quadPattern_in_deleteData2239);
            q=quadPattern();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 189:36: -> deleteData(quadPattern=$q.st)
            {
                retval.st = templateLib.getInstanceOf("deleteData",new STAttrMap().put("quadPattern", (q!=null?q.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "deleteWhere"
    // com\\googlecode\\sparkleg\\SparqlT.g:192:1: deleteWhere : ^( DELETE WHERE q= quadPattern ) -> deleteWhere(quadPattern=$q.st);
    public final SparqlT.deleteWhere_return deleteWhere() throws RecognitionException {
        SparqlT.deleteWhere_return retval = new SparqlT.deleteWhere_return();
        retval.start = input.LT(1);


        SparqlT.quadPattern_return q =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:193:5: ( ^( DELETE WHERE q= quadPattern ) -> deleteWhere(quadPattern=$q.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:193:7: ^( DELETE WHERE q= quadPattern )
            {
            match(input,DELETE,FOLLOW_DELETE_in_deleteWhere2267); 

            match(input, Token.DOWN, null); 
            match(input,WHERE,FOLLOW_WHERE_in_deleteWhere2269); 

            pushFollow(FOLLOW_quadPattern_in_deleteWhere2273);
            q=quadPattern();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 193:37: -> deleteWhere(quadPattern=$q.st)
            {
                retval.st = templateLib.getInstanceOf("deleteWhere",new STAttrMap().put("quadPattern", (q!=null?q.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "modify"
    // com\\googlecode\\sparkleg\\SparqlT.g:196:1: modify : ( ^( MODIFY ^( WITH iriRef ) ( deleteClause )* ( insertClause )* ( usingClause )* whereClause ) | ^( MODIFY ( deleteClause )* ( insertClause )* ( usingClause )* whereClause ) );
    public final SparqlT.modify_return modify() throws RecognitionException {
        SparqlT.modify_return retval = new SparqlT.modify_return();
        retval.start = input.LT(1);


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:197:5: ( ^( MODIFY ^( WITH iriRef ) ( deleteClause )* ( insertClause )* ( usingClause )* whereClause ) | ^( MODIFY ( deleteClause )* ( insertClause )* ( usingClause )* whereClause ) )
            int alt72=2;
            switch ( input.LA(1) ) {
            case MODIFY:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case WITH:
                        {
                        alt72=1;
                        }
                        break;
                    case DELETE:
                    case INSERT:
                    case USING:
                    case WHERE_CLAUSE:
                        {
                        alt72=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }

            switch (alt72) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:197:7: ^( MODIFY ^( WITH iriRef ) ( deleteClause )* ( insertClause )* ( usingClause )* whereClause )
                    {
                    match(input,MODIFY,FOLLOW_MODIFY_in_modify2305); 

                    match(input, Token.DOWN, null); 
                    match(input,WITH,FOLLOW_WITH_in_modify2308); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_iriRef_in_modify2310);
                    iriRef();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // com\\googlecode\\sparkleg\\SparqlT.g:197:31: ( deleteClause )*
                    loop66:
                    do {
                        int alt66=2;
                        switch ( input.LA(1) ) {
                        case DELETE:
                            {
                            alt66=1;
                            }
                            break;

                        }

                        switch (alt66) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:197:31: deleteClause
                    	    {
                    	    pushFollow(FOLLOW_deleteClause_in_modify2313);
                    	    deleteClause();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    // com\\googlecode\\sparkleg\\SparqlT.g:197:45: ( insertClause )*
                    loop67:
                    do {
                        int alt67=2;
                        switch ( input.LA(1) ) {
                        case INSERT:
                            {
                            alt67=1;
                            }
                            break;

                        }

                        switch (alt67) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:197:45: insertClause
                    	    {
                    	    pushFollow(FOLLOW_insertClause_in_modify2316);
                    	    insertClause();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    // com\\googlecode\\sparkleg\\SparqlT.g:197:59: ( usingClause )*
                    loop68:
                    do {
                        int alt68=2;
                        switch ( input.LA(1) ) {
                        case USING:
                            {
                            alt68=1;
                            }
                            break;

                        }

                        switch (alt68) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:197:59: usingClause
                    	    {
                    	    pushFollow(FOLLOW_usingClause_in_modify2319);
                    	    usingClause();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    pushFollow(FOLLOW_whereClause_in_modify2322);
                    whereClause();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:198:7: ^( MODIFY ( deleteClause )* ( insertClause )* ( usingClause )* whereClause )
                    {
                    match(input,MODIFY,FOLLOW_MODIFY_in_modify2332); 

                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:198:16: ( deleteClause )*
                    loop69:
                    do {
                        int alt69=2;
                        switch ( input.LA(1) ) {
                        case DELETE:
                            {
                            alt69=1;
                            }
                            break;

                        }

                        switch (alt69) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:198:16: deleteClause
                    	    {
                    	    pushFollow(FOLLOW_deleteClause_in_modify2334);
                    	    deleteClause();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    // com\\googlecode\\sparkleg\\SparqlT.g:198:30: ( insertClause )*
                    loop70:
                    do {
                        int alt70=2;
                        switch ( input.LA(1) ) {
                        case INSERT:
                            {
                            alt70=1;
                            }
                            break;

                        }

                        switch (alt70) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:198:30: insertClause
                    	    {
                    	    pushFollow(FOLLOW_insertClause_in_modify2337);
                    	    insertClause();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    // com\\googlecode\\sparkleg\\SparqlT.g:198:44: ( usingClause )*
                    loop71:
                    do {
                        int alt71=2;
                        switch ( input.LA(1) ) {
                        case USING:
                            {
                            alt71=1;
                            }
                            break;

                        }

                        switch (alt71) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:198:44: usingClause
                    	    {
                    	    pushFollow(FOLLOW_usingClause_in_modify2340);
                    	    usingClause();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    pushFollow(FOLLOW_whereClause_in_modify2343);
                    whereClause();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "deleteClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:201:1: deleteClause : DELETE q= quadPattern -> deleteClause(quadPattern=$q.st);
    public final SparqlT.deleteClause_return deleteClause() throws RecognitionException {
        SparqlT.deleteClause_return retval = new SparqlT.deleteClause_return();
        retval.start = input.LT(1);


        SparqlT.quadPattern_return q =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:202:5: ( DELETE q= quadPattern -> deleteClause(quadPattern=$q.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:202:7: DELETE q= quadPattern
            {
            match(input,DELETE,FOLLOW_DELETE_in_deleteClause2363); 

            pushFollow(FOLLOW_quadPattern_in_deleteClause2367);
            q=quadPattern();

            state._fsp--;


            // TEMPLATE REWRITE
            // 202:28: -> deleteClause(quadPattern=$q.st)
            {
                retval.st = templateLib.getInstanceOf("deleteClause",new STAttrMap().put("quadPattern", (q!=null?q.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "insertClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:205:1: insertClause : INSERT q= quadPattern -> insertClause(quadPattern=$q.st);
    public final SparqlT.insertClause_return insertClause() throws RecognitionException {
        SparqlT.insertClause_return retval = new SparqlT.insertClause_return();
        retval.start = input.LT(1);


        SparqlT.quadPattern_return q =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:206:5: ( INSERT q= quadPattern -> insertClause(quadPattern=$q.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:206:7: INSERT q= quadPattern
            {
            match(input,INSERT,FOLLOW_INSERT_in_insertClause2399); 

            pushFollow(FOLLOW_quadPattern_in_insertClause2403);
            q=quadPattern();

            state._fsp--;


            // TEMPLATE REWRITE
            // 206:28: -> insertClause(quadPattern=$q.st)
            {
                retval.st = templateLib.getInstanceOf("insertClause",new STAttrMap().put("quadPattern", (q!=null?q.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "usingClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:209:1: usingClause : ^( USING ( NAMED )? i= iriRef ) -> usingClause(attribute1=$USING.textattribute2=$NAMED.textiriRef=$i.st);
    public final SparqlT.usingClause_return usingClause() throws RecognitionException {
        SparqlT.usingClause_return retval = new SparqlT.usingClause_return();
        retval.start = input.LT(1);


        CommonTree USING24=null;
        CommonTree NAMED25=null;
        SparqlT.iriRef_return i =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:210:5: ( ^( USING ( NAMED )? i= iriRef ) -> usingClause(attribute1=$USING.textattribute2=$NAMED.textiriRef=$i.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:210:7: ^( USING ( NAMED )? i= iriRef )
            {
            USING24=(CommonTree)match(input,USING,FOLLOW_USING_in_usingClause2430); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:210:15: ( NAMED )?
            int alt73=2;
            switch ( input.LA(1) ) {
                case NAMED:
                    {
                    alt73=1;
                    }
                    break;
            }

            switch (alt73) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:210:15: NAMED
                    {
                    NAMED25=(CommonTree)match(input,NAMED,FOLLOW_NAMED_in_usingClause2432); 

                    }
                    break;

            }


            pushFollow(FOLLOW_iriRef_in_usingClause2437);
            i=iriRef();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 210:32: -> usingClause(attribute1=$USING.textattribute2=$NAMED.textiriRef=$i.st)
            {
                retval.st = templateLib.getInstanceOf("usingClause",new STAttrMap().put("attribute1", (USING24!=null?USING24.getText():null)).put("attribute2", (NAMED25!=null?NAMED25.getText():null)).put("iriRef", (i!=null?i.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "graphOrDefault"
    // com\\googlecode\\sparkleg\\SparqlT.g:213:1: graphOrDefault : ( DEFAULT -> graphOrDefault(attribute=$DEFAULT.text)| ( GRAPH )? i= iriRef -> graphOrDefault(iriRef=$i.st));
    public final SparqlT.graphOrDefault_return graphOrDefault() throws RecognitionException {
        SparqlT.graphOrDefault_return retval = new SparqlT.graphOrDefault_return();
        retval.start = input.LT(1);


        CommonTree DEFAULT26=null;
        SparqlT.iriRef_return i =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:214:5: ( DEFAULT -> graphOrDefault(attribute=$DEFAULT.text)| ( GRAPH )? i= iriRef -> graphOrDefault(iriRef=$i.st))
            int alt75=2;
            switch ( input.LA(1) ) {
            case DEFAULT:
                {
                alt75=1;
                }
                break;
            case GRAPH:
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt75=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }

            switch (alt75) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:214:7: DEFAULT
                    {
                    DEFAULT26=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_graphOrDefault2477); 

                    // TEMPLATE REWRITE
                    // 214:15: -> graphOrDefault(attribute=$DEFAULT.text)
                    {
                        retval.st = templateLib.getInstanceOf("graphOrDefault",new STAttrMap().put("attribute", (DEFAULT26!=null?DEFAULT26.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:215:7: ( GRAPH )? i= iriRef
                    {
                    // com\\googlecode\\sparkleg\\SparqlT.g:215:7: ( GRAPH )?
                    int alt74=2;
                    switch ( input.LA(1) ) {
                        case GRAPH:
                            {
                            alt74=1;
                            }
                            break;
                    }

                    switch (alt74) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:215:7: GRAPH
                            {
                            match(input,GRAPH,FOLLOW_GRAPH_in_graphOrDefault2494); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_iriRef_in_graphOrDefault2499);
                    i=iriRef();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 215:23: -> graphOrDefault(iriRef=$i.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphOrDefault",new STAttrMap().put("iriRef", (i!=null?i.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "graphRef"
    // com\\googlecode\\sparkleg\\SparqlT.g:218:1: graphRef : GRAPH i= iriRef -> graphRef(iriRef=$i.st);
    public final SparqlT.graphRef_return graphRef() throws RecognitionException {
        SparqlT.graphRef_return retval = new SparqlT.graphRef_return();
        retval.start = input.LT(1);


        SparqlT.iriRef_return i =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:219:5: ( GRAPH i= iriRef -> graphRef(iriRef=$i.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:219:7: GRAPH i= iriRef
            {
            match(input,GRAPH,FOLLOW_GRAPH_in_graphRef2535); 

            pushFollow(FOLLOW_iriRef_in_graphRef2539);
            i=iriRef();

            state._fsp--;


            // TEMPLATE REWRITE
            // 219:22: -> graphRef(iriRef=$i.st)
            {
                retval.st = templateLib.getInstanceOf("graphRef",new STAttrMap().put("iriRef", (i!=null?i.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "graphRefAll"
    // com\\googlecode\\sparkleg\\SparqlT.g:222:1: graphRefAll : (g= graphRef -> graphRefAll(graphRef=$g.st)| DEFAULT -> graphRefAll(attribute=$DEFAULT.text)| NAMED -> graphRefAll(attribute=$NAMED.text)| ALL -> graphRefAll(attribute=$ALL.text));
    public final SparqlT.graphRefAll_return graphRefAll() throws RecognitionException {
        SparqlT.graphRefAll_return retval = new SparqlT.graphRefAll_return();
        retval.start = input.LT(1);


        CommonTree DEFAULT27=null;
        CommonTree NAMED28=null;
        CommonTree ALL29=null;
        SparqlT.graphRef_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:223:5: (g= graphRef -> graphRefAll(graphRef=$g.st)| DEFAULT -> graphRefAll(attribute=$DEFAULT.text)| NAMED -> graphRefAll(attribute=$NAMED.text)| ALL -> graphRefAll(attribute=$ALL.text))
            int alt76=4;
            switch ( input.LA(1) ) {
            case GRAPH:
                {
                alt76=1;
                }
                break;
            case DEFAULT:
                {
                alt76=2;
                }
                break;
            case NAMED:
                {
                alt76=3;
                }
                break;
            case ALL:
                {
                alt76=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }

            switch (alt76) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:223:7: g= graphRef
                    {
                    pushFollow(FOLLOW_graphRef_in_graphRefAll2567);
                    g=graphRef();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 223:18: -> graphRefAll(graphRef=$g.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphRefAll",new STAttrMap().put("graphRef", (g!=null?g.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:224:7: DEFAULT
                    {
                    DEFAULT27=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_graphRefAll2584); 

                    // TEMPLATE REWRITE
                    // 224:15: -> graphRefAll(attribute=$DEFAULT.text)
                    {
                        retval.st = templateLib.getInstanceOf("graphRefAll",new STAttrMap().put("attribute", (DEFAULT27!=null?DEFAULT27.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:225:7: NAMED
                    {
                    NAMED28=(CommonTree)match(input,NAMED,FOLLOW_NAMED_in_graphRefAll2601); 

                    // TEMPLATE REWRITE
                    // 225:13: -> graphRefAll(attribute=$NAMED.text)
                    {
                        retval.st = templateLib.getInstanceOf("graphRefAll",new STAttrMap().put("attribute", (NAMED28!=null?NAMED28.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:226:7: ALL
                    {
                    ALL29=(CommonTree)match(input,ALL,FOLLOW_ALL_in_graphRefAll2618); 

                    // TEMPLATE REWRITE
                    // 226:11: -> graphRefAll(attribute=$ALL.text)
                    {
                        retval.st = templateLib.getInstanceOf("graphRefAll",new STAttrMap().put("attribute", (ALL29!=null?ALL29.getText():null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "quadPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:229:1: quadPattern : quads -> quadPattern(;
    public final SparqlT.quadPattern_return quadPattern() throws RecognitionException {
        SparqlT.quadPattern_return retval = new SparqlT.quadPattern_return();
        retval.start = input.LT(1);


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:230:5: ( quads -> quadPattern()
            // com\\googlecode\\sparkleg\\SparqlT.g:230:7: quads
            {
            pushFollow(FOLLOW_quads_in_quadPattern2644);
            quads();

            state._fsp--;


            // TEMPLATE REWRITE
            // 230:13: -> quadPattern(
            {
                retval.st = templateLib.getInstanceOf("quadPattern");
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "quads"
    // com\\googlecode\\sparkleg\\SparqlT.g:233:1: quads : (t1= triplesTemplate )? (q+= quadsNotTriples (t2+= triplesTemplate )? )* -> quads(triplesTemplate1=$t1.stquadsNotTriples=$qtriplesTemplate2=$t2);
    public final SparqlT.quads_return quads() throws RecognitionException {
        SparqlT.quads_return retval = new SparqlT.quads_return();
        retval.start = input.LT(1);


        List list_q=null;
        List list_t2=null;
        SparqlT.triplesTemplate_return t1 =null;

        RuleReturnScope q = null;
        RuleReturnScope t2 = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:234:5: ( (t1= triplesTemplate )? (q+= quadsNotTriples (t2+= triplesTemplate )? )* -> quads(triplesTemplate1=$t1.stquadsNotTriples=$qtriplesTemplate2=$t2))
            // com\\googlecode\\sparkleg\\SparqlT.g:234:7: (t1= triplesTemplate )? (q+= quadsNotTriples (t2+= triplesTemplate )? )*
            {
            // com\\googlecode\\sparkleg\\SparqlT.g:234:7: (t1= triplesTemplate )?
            int alt77=2;
            switch ( input.LA(1) ) {
                case TRIPLES_TEMPLATE:
                    {
                    alt77=1;
                    }
                    break;
            }

            switch (alt77) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:234:8: t1= triplesTemplate
                    {
                    pushFollow(FOLLOW_triplesTemplate_in_quads2674);
                    t1=triplesTemplate();

                    state._fsp--;


                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\SparqlT.g:234:29: (q+= quadsNotTriples (t2+= triplesTemplate )? )*
            loop79:
            do {
                int alt79=2;
                switch ( input.LA(1) ) {
                case GRAPH:
                    {
                    alt79=1;
                    }
                    break;

                }

                switch (alt79) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:234:30: q+= quadsNotTriples (t2+= triplesTemplate )?
            	    {
            	    pushFollow(FOLLOW_quadsNotTriples_in_quads2681);
            	    q=quadsNotTriples();

            	    state._fsp--;

            	    if (list_q==null) list_q=new ArrayList();
            	    list_q.add(q.getTemplate());


            	    // com\\googlecode\\sparkleg\\SparqlT.g:234:49: (t2+= triplesTemplate )?
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
            	            // com\\googlecode\\sparkleg\\SparqlT.g:234:50: t2+= triplesTemplate
            	            {
            	            pushFollow(FOLLOW_triplesTemplate_in_quads2686);
            	            t2=triplesTemplate();

            	            state._fsp--;

            	            if (list_t2==null) list_t2=new ArrayList();
            	            list_t2.add(t2.getTemplate());


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            // TEMPLATE REWRITE
            // 234:74: -> quads(triplesTemplate1=$t1.stquadsNotTriples=$qtriplesTemplate2=$t2)
            {
                retval.st = templateLib.getInstanceOf("quads",new STAttrMap().put("triplesTemplate1", (t1!=null?t1.st:null)).put("quadsNotTriples", list_q).put("triplesTemplate2", list_t2));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "quadsNotTriples"
    // com\\googlecode\\sparkleg\\SparqlT.g:237:1: quadsNotTriples : ^( GRAPH v= varOrIRIref (t= triplesTemplate )? ) -> quadsNotTriples(varOrIRIref=$v.sttriplesTemplate=$t.st);
    public final SparqlT.quadsNotTriples_return quadsNotTriples() throws RecognitionException {
        SparqlT.quadsNotTriples_return retval = new SparqlT.quadsNotTriples_return();
        retval.start = input.LT(1);


        SparqlT.varOrIRIref_return v =null;

        SparqlT.triplesTemplate_return t =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:238:5: ( ^( GRAPH v= varOrIRIref (t= triplesTemplate )? ) -> quadsNotTriples(varOrIRIref=$v.sttriplesTemplate=$t.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:238:7: ^( GRAPH v= varOrIRIref (t= triplesTemplate )? )
            {
            match(input,GRAPH,FOLLOW_GRAPH_in_quadsNotTriples2731); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_varOrIRIref_in_quadsNotTriples2735);
            v=varOrIRIref();

            state._fsp--;


            // com\\googlecode\\sparkleg\\SparqlT.g:238:29: (t= triplesTemplate )?
            int alt80=2;
            switch ( input.LA(1) ) {
                case TRIPLES_TEMPLATE:
                    {
                    alt80=1;
                    }
                    break;
            }

            switch (alt80) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:238:30: t= triplesTemplate
                    {
                    pushFollow(FOLLOW_triplesTemplate_in_quadsNotTriples2740);
                    t=triplesTemplate();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 238:51: -> quadsNotTriples(varOrIRIref=$v.sttriplesTemplate=$t.st)
            {
                retval.st = templateLib.getInstanceOf("quadsNotTriples",new STAttrMap().put("varOrIRIref", (v!=null?v.st:null)).put("triplesTemplate", (t!=null?t.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "triplesTemplate"
    // com\\googlecode\\sparkleg\\SparqlT.g:241:1: triplesTemplate : ^( TRIPLES_TEMPLATE (t+= triplesSameSubject )* ) -> triplesTemplate(triplesSameSubject=$t);
    public final SparqlT.triplesTemplate_return triplesTemplate() throws RecognitionException {
        SparqlT.triplesTemplate_return retval = new SparqlT.triplesTemplate_return();
        retval.start = input.LT(1);


        List list_t=null;
        RuleReturnScope t = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:242:5: ( ^( TRIPLES_TEMPLATE (t+= triplesSameSubject )* ) -> triplesTemplate(triplesSameSubject=$t))
            // com\\googlecode\\sparkleg\\SparqlT.g:242:7: ^( TRIPLES_TEMPLATE (t+= triplesSameSubject )* )
            {
            match(input,TRIPLES_TEMPLATE,FOLLOW_TRIPLES_TEMPLATE_in_triplesTemplate2779); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:242:26: (t+= triplesSameSubject )*
                loop81:
                do {
                    int alt81=2;
                    switch ( input.LA(1) ) {
                    case TRIPLES_SAME_SUBJECT:
                        {
                        alt81=1;
                        }
                        break;

                    }

                    switch (alt81) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:242:27: t+= triplesSameSubject
                	    {
                	    pushFollow(FOLLOW_triplesSameSubject_in_triplesTemplate2784);
                	    t=triplesSameSubject();

                	    state._fsp--;

                	    if (list_t==null) list_t=new ArrayList();
                	    list_t.add(t.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop81;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 242:52: -> triplesTemplate(triplesSameSubject=$t)
            {
                retval.st = templateLib.getInstanceOf("triplesTemplate",new STAttrMap().put("triplesSameSubject", list_t));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "groupGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:245:1: groupGraphPattern : ( ^( GROUP_GRAPH_PATTERN (g= groupGraphPatternSub ) ) -> groupGraphPattern(groupGraphPatternSub=$g.st)| ^( GROUP_GRAPH_PATTERN s= subSelect ) -> groupGraphPattern(subselect=$s.st)| ^( GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN ) -> groupGraphPattern(groupGraphPatternSub=\"\"));
    public final SparqlT.groupGraphPattern_return groupGraphPattern() throws RecognitionException {
        SparqlT.groupGraphPattern_return retval = new SparqlT.groupGraphPattern_return();
        retval.start = input.LT(1);


        SparqlT.groupGraphPatternSub_return g =null;

        SparqlT.subSelect_return s =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:246:5: ( ^( GROUP_GRAPH_PATTERN (g= groupGraphPatternSub ) ) -> groupGraphPattern(groupGraphPatternSub=$g.st)| ^( GROUP_GRAPH_PATTERN s= subSelect ) -> groupGraphPattern(subselect=$s.st)| ^( GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN ) -> groupGraphPattern(groupGraphPatternSub=\"\"))
            int alt82=3;
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
                            alt82=3;
                            }
                            break;
                        case DOWN:
                            {
                            alt82=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 82, 3, input);

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
                        alt82=1;
                        }
                        break;
                    case SUBSELECT:
                        {
                        alt82=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }

            switch (alt82) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:246:7: ^( GROUP_GRAPH_PATTERN (g= groupGraphPatternSub ) )
                    {
                    match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern2819); 

                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:246:29: (g= groupGraphPatternSub )
                    // com\\googlecode\\sparkleg\\SparqlT.g:246:30: g= groupGraphPatternSub
                    {
                    pushFollow(FOLLOW_groupGraphPatternSub_in_groupGraphPattern2824);
                    g=groupGraphPatternSub();

                    state._fsp--;


                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 246:55: -> groupGraphPattern(groupGraphPatternSub=$g.st)
                    {
                        retval.st = templateLib.getInstanceOf("groupGraphPattern",new STAttrMap().put("groupGraphPatternSub", (g!=null?g.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:247:7: ^( GROUP_GRAPH_PATTERN s= subSelect )
                    {
                    match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern2844); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_subSelect_in_groupGraphPattern2848);
                    s=subSelect();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 247:42: -> groupGraphPattern(subselect=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("groupGraphPattern",new STAttrMap().put("subselect", (s!=null?s.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:248:7: ^( GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN )
                    {
                    match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern2867); 

                    match(input, Token.DOWN, null); 
                    match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern2869); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 248:50: -> groupGraphPattern(groupGraphPatternSub=\"\")
                    {
                        retval.st = templateLib.getInstanceOf("groupGraphPattern",new STAttrMap().put("groupGraphPatternSub", ""));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "groupGraphPatternSub"
    // com\\googlecode\\sparkleg\\SparqlT.g:251:1: groupGraphPatternSub : (t= triplesBlock (g+= groupGraphPatternSubDetail )* -> groupGraphPatternSub(triplesBlock=$t.stgroupGraphPatternSubDetail=$g)| (g+= groupGraphPatternSubDetail )+ -> groupGraphPatternSub(groupGraphPatternSubDetail=$g));
    public final SparqlT.groupGraphPatternSub_return groupGraphPatternSub() throws RecognitionException {
        SparqlT.groupGraphPatternSub_return retval = new SparqlT.groupGraphPatternSub_return();
        retval.start = input.LT(1);


        List list_g=null;
        SparqlT.triplesBlock_return t =null;

        RuleReturnScope g = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:252:5: (t= triplesBlock (g+= groupGraphPatternSubDetail )* -> groupGraphPatternSub(triplesBlock=$t.stgroupGraphPatternSubDetail=$g)| (g+= groupGraphPatternSubDetail )+ -> groupGraphPatternSub(groupGraphPatternSubDetail=$g))
            int alt85=2;
            switch ( input.LA(1) ) {
            case TRIPLES_SAME_SUBJECT:
                {
                alt85=1;
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
                alt85=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }

            switch (alt85) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:252:7: t= triplesBlock (g+= groupGraphPatternSubDetail )*
                    {
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSub2900);
                    t=triplesBlock();

                    state._fsp--;


                    // com\\googlecode\\sparkleg\\SparqlT.g:252:22: (g+= groupGraphPatternSubDetail )*
                    loop83:
                    do {
                        int alt83=2;
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
                            alt83=1;
                            }
                            break;

                        }

                        switch (alt83) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:252:23: g+= groupGraphPatternSubDetail
                    	    {
                    	    pushFollow(FOLLOW_groupGraphPatternSubDetail_in_groupGraphPatternSub2905);
                    	    g=groupGraphPatternSubDetail();

                    	    state._fsp--;

                    	    if (list_g==null) list_g=new ArrayList();
                    	    list_g.add(g.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    // TEMPLATE REWRITE
                    // 252:55: -> groupGraphPatternSub(triplesBlock=$t.stgroupGraphPatternSubDetail=$g)
                    {
                        retval.st = templateLib.getInstanceOf("groupGraphPatternSub",new STAttrMap().put("triplesBlock", (t!=null?t.st:null)).put("groupGraphPatternSubDetail", list_g));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:253:7: (g+= groupGraphPatternSubDetail )+
                    {
                    // com\\googlecode\\sparkleg\\SparqlT.g:253:7: (g+= groupGraphPatternSubDetail )+
                    int cnt84=0;
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
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:253:8: g+= groupGraphPatternSubDetail
                    	    {
                    	    pushFollow(FOLLOW_groupGraphPatternSubDetail_in_groupGraphPatternSub2932);
                    	    g=groupGraphPatternSubDetail();

                    	    state._fsp--;

                    	    if (list_g==null) list_g=new ArrayList();
                    	    list_g.add(g.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt84 >= 1 ) break loop84;
                                EarlyExitException eee =
                                    new EarlyExitException(84, input);
                                throw eee;
                        }
                        cnt84++;
                    } while (true);


                    // TEMPLATE REWRITE
                    // 253:40: -> groupGraphPatternSub(groupGraphPatternSubDetail=$g)
                    {
                        retval.st = templateLib.getInstanceOf("groupGraphPatternSub",new STAttrMap().put("groupGraphPatternSubDetail", list_g));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "groupGraphPatternSubDetail"
    // com\\googlecode\\sparkleg\\SparqlT.g:256:1: groupGraphPatternSubDetail : g= graphPatternNotTriples ( DOT )? (t= triplesBlock )? -> groupGraphPatternSubDetail(graphPatternNotTriples=$g.sttriplesBlock=$t.st);
    public final SparqlT.groupGraphPatternSubDetail_return groupGraphPatternSubDetail() throws RecognitionException {
        SparqlT.groupGraphPatternSubDetail_return retval = new SparqlT.groupGraphPatternSubDetail_return();
        retval.start = input.LT(1);


        SparqlT.graphPatternNotTriples_return g =null;

        SparqlT.triplesBlock_return t =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:257:5: (g= graphPatternNotTriples ( DOT )? (t= triplesBlock )? -> groupGraphPatternSubDetail(graphPatternNotTriples=$g.sttriplesBlock=$t.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:257:7: g= graphPatternNotTriples ( DOT )? (t= triplesBlock )?
            {
            pushFollow(FOLLOW_graphPatternNotTriples_in_groupGraphPatternSubDetail2962);
            g=graphPatternNotTriples();

            state._fsp--;


            // com\\googlecode\\sparkleg\\SparqlT.g:257:32: ( DOT )?
            int alt86=2;
            switch ( input.LA(1) ) {
                case DOT:
                    {
                    alt86=1;
                    }
                    break;
            }

            switch (alt86) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:257:32: DOT
                    {
                    match(input,DOT,FOLLOW_DOT_in_groupGraphPatternSubDetail2964); 

                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\SparqlT.g:257:38: (t= triplesBlock )?
            int alt87=2;
            switch ( input.LA(1) ) {
                case TRIPLES_SAME_SUBJECT:
                    {
                    alt87=1;
                    }
                    break;
            }

            switch (alt87) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:257:38: t= triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSubDetail2969);
                    t=triplesBlock();

                    state._fsp--;


                    }
                    break;

            }


            // TEMPLATE REWRITE
            // 257:53: -> groupGraphPatternSubDetail(graphPatternNotTriples=$g.sttriplesBlock=$t.st)
            {
                retval.st = templateLib.getInstanceOf("groupGraphPatternSubDetail",new STAttrMap().put("graphPatternNotTriples", (g!=null?g.st:null)).put("triplesBlock", (t!=null?t.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "triplesBlock"
    // com\\googlecode\\sparkleg\\SparqlT.g:260:1: triplesBlock : (t+= triplesSameSubjectPath )+ -> triplesBlock(triplesSameSubjectPath=$t);
    public final SparqlT.triplesBlock_return triplesBlock() throws RecognitionException {
        SparqlT.triplesBlock_return retval = new SparqlT.triplesBlock_return();
        retval.start = input.LT(1);


        List list_t=null;
        RuleReturnScope t = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:261:5: ( (t+= triplesSameSubjectPath )+ -> triplesBlock(triplesSameSubjectPath=$t))
            // com\\googlecode\\sparkleg\\SparqlT.g:261:7: (t+= triplesSameSubjectPath )+
            {
            // com\\googlecode\\sparkleg\\SparqlT.g:261:7: (t+= triplesSameSubjectPath )+
            int cnt88=0;
            loop88:
            do {
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
            	    // com\\googlecode\\sparkleg\\SparqlT.g:261:8: t+= triplesSameSubjectPath
            	    {
            	    pushFollow(FOLLOW_triplesSameSubjectPath_in_triplesBlock3008);
            	    t=triplesSameSubjectPath();

            	    state._fsp--;

            	    if (list_t==null) list_t=new ArrayList();
            	    list_t.add(t.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt88 >= 1 ) break loop88;
                        EarlyExitException eee =
                            new EarlyExitException(88, input);
                        throw eee;
                }
                cnt88++;
            } while (true);


            // TEMPLATE REWRITE
            // 261:36: -> triplesBlock(triplesSameSubjectPath=$t)
            {
                retval.st = templateLib.getInstanceOf("triplesBlock",new STAttrMap().put("triplesSameSubjectPath", list_t));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "graphPatternNotTriples"
    // com\\googlecode\\sparkleg\\SparqlT.g:264:1: graphPatternNotTriples : (u= groupOrUnionGraphPattern -> graphPatternNotTriples(groupOrUnionGraphPattern=$u.st)|o= optionalGraphPattern -> graphPatternNotTriples(optionalGraphPattern=$o.st)|m= minusGraphPattern -> graphPatternNotTriples(minusGraphPattern=$m.st)|g= graphGraphPattern -> graphPatternNotTriples(graphGraphPattern=$g.st)|s= serviceGraphPattern -> graphPatternNotTriples(serviceGraphPattern=$s.st)|f= filter -> graphPatternNotTriples(filter=$f.st)|b= bind -> graphPatternNotTriples(bind=$b.st));
    public final SparqlT.graphPatternNotTriples_return graphPatternNotTriples() throws RecognitionException {
        SparqlT.graphPatternNotTriples_return retval = new SparqlT.graphPatternNotTriples_return();
        retval.start = input.LT(1);


        SparqlT.groupOrUnionGraphPattern_return u =null;

        SparqlT.optionalGraphPattern_return o =null;

        SparqlT.minusGraphPattern_return m =null;

        SparqlT.graphGraphPattern_return g =null;

        SparqlT.serviceGraphPattern_return s =null;

        SparqlT.filter_return f =null;

        SparqlT.bind_return b =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:265:5: (u= groupOrUnionGraphPattern -> graphPatternNotTriples(groupOrUnionGraphPattern=$u.st)|o= optionalGraphPattern -> graphPatternNotTriples(optionalGraphPattern=$o.st)|m= minusGraphPattern -> graphPatternNotTriples(minusGraphPattern=$m.st)|g= graphGraphPattern -> graphPatternNotTriples(graphGraphPattern=$g.st)|s= serviceGraphPattern -> graphPatternNotTriples(serviceGraphPattern=$s.st)|f= filter -> graphPatternNotTriples(filter=$f.st)|b= bind -> graphPatternNotTriples(bind=$b.st))
            int alt89=7;
            switch ( input.LA(1) ) {
            case GROUP_GRAPH_PATTERN:
            case UNION:
                {
                alt89=1;
                }
                break;
            case OPTIONAL:
                {
                alt89=2;
                }
                break;
            case MINUS_KEYWORD:
                {
                alt89=3;
                }
                break;
            case GRAPH:
                {
                alt89=4;
                }
                break;
            case SERVICE:
                {
                alt89=5;
                }
                break;
            case FILTER:
                {
                alt89=6;
                }
                break;
            case BIND:
                {
                alt89=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }

            switch (alt89) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:265:7: u= groupOrUnionGraphPattern
                    {
                    pushFollow(FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples3038);
                    u=groupOrUnionGraphPattern();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 265:34: -> graphPatternNotTriples(groupOrUnionGraphPattern=$u.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphPatternNotTriples",new STAttrMap().put("groupOrUnionGraphPattern", (u!=null?u.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:266:7: o= optionalGraphPattern
                    {
                    pushFollow(FOLLOW_optionalGraphPattern_in_graphPatternNotTriples3057);
                    o=optionalGraphPattern();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 266:30: -> graphPatternNotTriples(optionalGraphPattern=$o.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphPatternNotTriples",new STAttrMap().put("optionalGraphPattern", (o!=null?o.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:267:7: m= minusGraphPattern
                    {
                    pushFollow(FOLLOW_minusGraphPattern_in_graphPatternNotTriples3076);
                    m=minusGraphPattern();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 267:27: -> graphPatternNotTriples(minusGraphPattern=$m.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphPatternNotTriples",new STAttrMap().put("minusGraphPattern", (m!=null?m.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:268:7: g= graphGraphPattern
                    {
                    pushFollow(FOLLOW_graphGraphPattern_in_graphPatternNotTriples3096);
                    g=graphGraphPattern();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 268:27: -> graphPatternNotTriples(graphGraphPattern=$g.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphPatternNotTriples",new STAttrMap().put("graphGraphPattern", (g!=null?g.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:269:7: s= serviceGraphPattern
                    {
                    pushFollow(FOLLOW_serviceGraphPattern_in_graphPatternNotTriples3116);
                    s=serviceGraphPattern();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 269:29: -> graphPatternNotTriples(serviceGraphPattern=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphPatternNotTriples",new STAttrMap().put("serviceGraphPattern", (s!=null?s.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:270:7: f= filter
                    {
                    pushFollow(FOLLOW_filter_in_graphPatternNotTriples3136);
                    f=filter();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 270:16: -> graphPatternNotTriples(filter=$f.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphPatternNotTriples",new STAttrMap().put("filter", (f!=null?f.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:271:7: b= bind
                    {
                    pushFollow(FOLLOW_bind_in_graphPatternNotTriples3156);
                    b=bind();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 271:14: -> graphPatternNotTriples(bind=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphPatternNotTriples",new STAttrMap().put("bind", (b!=null?b.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "optionalGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:274:1: optionalGraphPattern : ^( OPTIONAL o= groupGraphPattern ) -> optionalGraphPattern(groupGraphPattern=$o.st);
    public final SparqlT.optionalGraphPattern_return optionalGraphPattern() throws RecognitionException {
        SparqlT.optionalGraphPattern_return retval = new SparqlT.optionalGraphPattern_return();
        retval.start = input.LT(1);


        SparqlT.groupGraphPattern_return o =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:275:5: ( ^( OPTIONAL o= groupGraphPattern ) -> optionalGraphPattern(groupGraphPattern=$o.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:275:7: ^( OPTIONAL o= groupGraphPattern )
            {
            match(input,OPTIONAL,FOLLOW_OPTIONAL_in_optionalGraphPattern3183); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_groupGraphPattern_in_optionalGraphPattern3187);
            o=groupGraphPattern();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 275:39: -> optionalGraphPattern(groupGraphPattern=$o.st)
            {
                retval.st = templateLib.getInstanceOf("optionalGraphPattern",new STAttrMap().put("groupGraphPattern", (o!=null?o.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "graphGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:278:1: graphGraphPattern : ^( GRAPH v= varOrIRIref g= groupGraphPattern ) -> graphGraphPattern(varOrIRIref=$v.stgroupGraphPattern=$g.st);
    public final SparqlT.graphGraphPattern_return graphGraphPattern() throws RecognitionException {
        SparqlT.graphGraphPattern_return retval = new SparqlT.graphGraphPattern_return();
        retval.start = input.LT(1);


        SparqlT.varOrIRIref_return v =null;

        SparqlT.groupGraphPattern_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:279:5: ( ^( GRAPH v= varOrIRIref g= groupGraphPattern ) -> graphGraphPattern(varOrIRIref=$v.stgroupGraphPattern=$g.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:279:7: ^( GRAPH v= varOrIRIref g= groupGraphPattern )
            {
            match(input,GRAPH,FOLLOW_GRAPH_in_graphGraphPattern3215); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_varOrIRIref_in_graphGraphPattern3219);
            v=varOrIRIref();

            state._fsp--;


            pushFollow(FOLLOW_groupGraphPattern_in_graphGraphPattern3223);
            g=groupGraphPattern();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 279:50: -> graphGraphPattern(varOrIRIref=$v.stgroupGraphPattern=$g.st)
            {
                retval.st = templateLib.getInstanceOf("graphGraphPattern",new STAttrMap().put("varOrIRIref", (v!=null?v.st:null)).put("groupGraphPattern", (g!=null?g.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "serviceGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:282:1: serviceGraphPattern : ^( SERVICE (s= SILENT )? v= varOrIRIref g= groupGraphPattern ) -> serviceGraphPattern(attribute=$s.textvarOrIRIref=$v.stgroupGraphPattern=$g.st);
    public final SparqlT.serviceGraphPattern_return serviceGraphPattern() throws RecognitionException {
        SparqlT.serviceGraphPattern_return retval = new SparqlT.serviceGraphPattern_return();
        retval.start = input.LT(1);


        CommonTree s=null;
        SparqlT.varOrIRIref_return v =null;

        SparqlT.groupGraphPattern_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:283:5: ( ^( SERVICE (s= SILENT )? v= varOrIRIref g= groupGraphPattern ) -> serviceGraphPattern(attribute=$s.textvarOrIRIref=$v.stgroupGraphPattern=$g.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:283:7: ^( SERVICE (s= SILENT )? v= varOrIRIref g= groupGraphPattern )
            {
            match(input,SERVICE,FOLLOW_SERVICE_in_serviceGraphPattern3256); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:283:17: (s= SILENT )?
            int alt90=2;
            switch ( input.LA(1) ) {
                case SILENT:
                    {
                    alt90=1;
                    }
                    break;
            }

            switch (alt90) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:283:18: s= SILENT
                    {
                    s=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_serviceGraphPattern3261); 

                    }
                    break;

            }


            pushFollow(FOLLOW_varOrIRIref_in_serviceGraphPattern3267);
            v=varOrIRIref();

            state._fsp--;


            pushFollow(FOLLOW_groupGraphPattern_in_serviceGraphPattern3271);
            g=groupGraphPattern();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 283:63: -> serviceGraphPattern(attribute=$s.textvarOrIRIref=$v.stgroupGraphPattern=$g.st)
            {
                retval.st = templateLib.getInstanceOf("serviceGraphPattern",new STAttrMap().put("attribute", (s!=null?s.getText():null)).put("varOrIRIref", (v!=null?v.st:null)).put("groupGraphPattern", (g!=null?g.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bind"
    // com\\googlecode\\sparkleg\\SparqlT.g:286:1: bind : ^( BIND e= expression ^( AS v= var ) ) -> bind(expression=$e.stvar=$v.st);
    public final SparqlT.bind_return bind() throws RecognitionException {
        SparqlT.bind_return retval = new SparqlT.bind_return();
        retval.start = input.LT(1);


        SparqlT.expression_return e =null;

        SparqlT.var_return v =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:287:5: ( ^( BIND e= expression ^( AS v= var ) ) -> bind(expression=$e.stvar=$v.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:287:7: ^( BIND e= expression ^( AS v= var ) )
            {
            match(input,BIND,FOLLOW_BIND_in_bind3312); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_bind3316);
            e=expression();

            state._fsp--;


            match(input,AS,FOLLOW_AS_in_bind3319); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_var_in_bind3323);
            v=var();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 287:40: -> bind(expression=$e.stvar=$v.st)
            {
                retval.st = templateLib.getInstanceOf("bind",new STAttrMap().put("expression", (e!=null?e.st:null)).put("var", (v!=null?v.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "minusGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:290:1: minusGraphPattern : ^( MINUS_KEYWORD g= groupGraphPattern ) -> minusGraphPattern(groupGraphPattern=$g.st);
    public final SparqlT.minusGraphPattern_return minusGraphPattern() throws RecognitionException {
        SparqlT.minusGraphPattern_return retval = new SparqlT.minusGraphPattern_return();
        retval.start = input.LT(1);


        SparqlT.groupGraphPattern_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:291:5: ( ^( MINUS_KEYWORD g= groupGraphPattern ) -> minusGraphPattern(groupGraphPattern=$g.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:291:7: ^( MINUS_KEYWORD g= groupGraphPattern )
            {
            match(input,MINUS_KEYWORD,FOLLOW_MINUS_KEYWORD_in_minusGraphPattern3363); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_groupGraphPattern_in_minusGraphPattern3367);
            g=groupGraphPattern();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 291:44: -> minusGraphPattern(groupGraphPattern=$g.st)
            {
                retval.st = templateLib.getInstanceOf("minusGraphPattern",new STAttrMap().put("groupGraphPattern", (g!=null?g.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "groupOrUnionGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:294:1: groupOrUnionGraphPattern : ( ^( UNION g1= groupOrUnionGraphPattern g2= groupGraphPattern ) -> groupOrUnionGraphPattern(unionGraphPattern=$g1.stgroupGraphPattern2=$g2.st)|g= groupGraphPattern -> groupOrUnionGraphPattern(groupGraphPattern1=$g.st));
    public final SparqlT.groupOrUnionGraphPattern_return groupOrUnionGraphPattern() throws RecognitionException {
        SparqlT.groupOrUnionGraphPattern_return retval = new SparqlT.groupOrUnionGraphPattern_return();
        retval.start = input.LT(1);


        SparqlT.groupOrUnionGraphPattern_return g1 =null;

        SparqlT.groupGraphPattern_return g2 =null;

        SparqlT.groupGraphPattern_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:295:5: ( ^( UNION g1= groupOrUnionGraphPattern g2= groupGraphPattern ) -> groupOrUnionGraphPattern(unionGraphPattern=$g1.stgroupGraphPattern2=$g2.st)|g= groupGraphPattern -> groupOrUnionGraphPattern(groupGraphPattern1=$g.st))
            int alt91=2;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt91=1;
                }
                break;
            case GROUP_GRAPH_PATTERN:
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:295:7: ^( UNION g1= groupOrUnionGraphPattern g2= groupGraphPattern )
                    {
                    match(input,UNION,FOLLOW_UNION_in_groupOrUnionGraphPattern3395); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_groupOrUnionGraphPattern_in_groupOrUnionGraphPattern3400);
                    g1=groupOrUnionGraphPattern();

                    state._fsp--;


                    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern3404);
                    g2=groupGraphPattern();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 295:66: -> groupOrUnionGraphPattern(unionGraphPattern=$g1.stgroupGraphPattern2=$g2.st)
                    {
                        retval.st = templateLib.getInstanceOf("groupOrUnionGraphPattern",new STAttrMap().put("unionGraphPattern", (g1!=null?g1.st:null)).put("groupGraphPattern2", (g2!=null?g2.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:296:7: g= groupGraphPattern
                    {
                    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern3429);
                    g=groupGraphPattern();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 296:27: -> groupOrUnionGraphPattern(groupGraphPattern1=$g.st)
                    {
                        retval.st = templateLib.getInstanceOf("groupOrUnionGraphPattern",new STAttrMap().put("groupGraphPattern1", (g!=null?g.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "filter"
    // com\\googlecode\\sparkleg\\SparqlT.g:299:1: filter : ^( FILTER c= constraint ) -> filter(constraint=$c.st);
    public final SparqlT.filter_return filter() throws RecognitionException {
        SparqlT.filter_return retval = new SparqlT.filter_return();
        retval.start = input.LT(1);


        SparqlT.constraint_return c =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:300:5: ( ^( FILTER c= constraint ) -> filter(constraint=$c.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:300:7: ^( FILTER c= constraint )
            {
            match(input,FILTER,FOLLOW_FILTER_in_filter3456); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_constraint_in_filter3460);
            c=constraint();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 300:30: -> filter(constraint=$c.st)
            {
                retval.st = templateLib.getInstanceOf("filter",new STAttrMap().put("constraint", (c!=null?c.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constraint"
    // com\\googlecode\\sparkleg\\SparqlT.g:303:1: constraint : (e= brackettedExpression -> constraint(brackettedExpression=$e.st)|b= builtInCall -> constraint(builtInCall=$b.st)|f= functionCall -> constraint(functionCall=$f.st));
    public final SparqlT.constraint_return constraint() throws RecognitionException {
        SparqlT.constraint_return retval = new SparqlT.constraint_return();
        retval.start = input.LT(1);


        SparqlT.brackettedExpression_return e =null;

        SparqlT.builtInCall_return b =null;

        SparqlT.functionCall_return f =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:304:5: (e= brackettedExpression -> constraint(brackettedExpression=$e.st)|b= builtInCall -> constraint(builtInCall=$b.st)|f= functionCall -> constraint(functionCall=$f.st))
            int alt92=3;
            switch ( input.LA(1) ) {
            case BRACKETTED_EXPRESSION:
                {
                alt92=1;
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
                alt92=2;
                }
                break;
            case FUNCTION:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }

            switch (alt92) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:304:7: e= brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_constraint3489);
                    e=brackettedExpression();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 304:30: -> constraint(brackettedExpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("constraint",new STAttrMap().put("brackettedExpression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:305:7: b= builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_constraint3508);
                    b=builtInCall();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 305:21: -> constraint(builtInCall=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("constraint",new STAttrMap().put("builtInCall", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:306:7: f= functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_constraint3527);
                    f=functionCall();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 306:22: -> constraint(functionCall=$f.st)
                    {
                        retval.st = templateLib.getInstanceOf("constraint",new STAttrMap().put("functionCall", (f!=null?f.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "functionCall"
    // com\\googlecode\\sparkleg\\SparqlT.g:309:1: functionCall : ^( FUNCTION i= iriRef ^( ARG_LIST a= argList ) ) -> functionCall(iriRef=$i.stargList=$a.st);
    public final SparqlT.functionCall_return functionCall() throws RecognitionException {
        SparqlT.functionCall_return retval = new SparqlT.functionCall_return();
        retval.start = input.LT(1);


        SparqlT.iriRef_return i =null;

        SparqlT.argList_return a =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:310:5: ( ^( FUNCTION i= iriRef ^( ARG_LIST a= argList ) ) -> functionCall(iriRef=$i.stargList=$a.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:310:7: ^( FUNCTION i= iriRef ^( ARG_LIST a= argList ) )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionCall3554); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_iriRef_in_functionCall3558);
            i=iriRef();

            state._fsp--;


            match(input,ARG_LIST,FOLLOW_ARG_LIST_in_functionCall3561); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_argList_in_functionCall3565);
                a=argList();

                state._fsp--;


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 310:50: -> functionCall(iriRef=$i.stargList=$a.st)
            {
                retval.st = templateLib.getInstanceOf("functionCall",new STAttrMap().put("iriRef", (i!=null?i.st:null)).put("argList", (a!=null?a.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "argList"
    // com\\googlecode\\sparkleg\\SparqlT.g:313:1: argList : (n= nil -> argList(nil=$n.st)| ( DISTINCT )? (e+= expression )* -> argList(attribute=$DISTINCT.textexpression=$e));
    public final SparqlT.argList_return argList() throws RecognitionException {
        SparqlT.argList_return retval = new SparqlT.argList_return();
        retval.start = input.LT(1);


        CommonTree DISTINCT30=null;
        List list_e=null;
        SparqlT.nil_return n =null;

        RuleReturnScope e = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:314:5: (n= nil -> argList(nil=$n.st)| ( DISTINCT )? (e+= expression )* -> argList(attribute=$DISTINCT.textexpression=$e))
            int alt95=2;
            switch ( input.LA(1) ) {
            case OPEN_BRACE:
                {
                alt95=1;
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
                alt95=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }

            switch (alt95) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:314:7: n= nil
                    {
                    pushFollow(FOLLOW_nil_in_argList3600);
                    n=nil();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 314:13: -> argList(nil=$n.st)
                    {
                        retval.st = templateLib.getInstanceOf("argList",new STAttrMap().put("nil", (n!=null?n.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:315:7: ( DISTINCT )? (e+= expression )*
                    {
                    // com\\googlecode\\sparkleg\\SparqlT.g:315:7: ( DISTINCT )?
                    int alt93=2;
                    switch ( input.LA(1) ) {
                        case DISTINCT:
                            {
                            alt93=1;
                            }
                            break;
                    }

                    switch (alt93) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:315:7: DISTINCT
                            {
                            DISTINCT30=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_argList3617); 

                            }
                            break;

                    }


                    // com\\googlecode\\sparkleg\\SparqlT.g:315:17: (e+= expression )*
                    loop94:
                    do {
                        int alt94=2;
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
                            alt94=1;
                            }
                            break;

                        }

                        switch (alt94) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:315:18: e+= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_argList3623);
                    	    e=expression();

                    	    state._fsp--;

                    	    if (list_e==null) list_e=new ArrayList();
                    	    list_e.add(e.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);


                    // TEMPLATE REWRITE
                    // 315:34: -> argList(attribute=$DISTINCT.textexpression=$e)
                    {
                        retval.st = templateLib.getInstanceOf("argList",new STAttrMap().put("attribute", (DISTINCT30!=null?DISTINCT30.getText():null)).put("expression", list_e));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "expressionList"
    // com\\googlecode\\sparkleg\\SparqlT.g:318:1: expressionList : ( ^( EXPRESSION_LIST (e+= expression )+ ) -> expressionList(expression=$e)| ^( EXPRESSION_LIST n= nil ) -> expressionList(nil=$n.st));
    public final SparqlT.expressionList_return expressionList() throws RecognitionException {
        SparqlT.expressionList_return retval = new SparqlT.expressionList_return();
        retval.start = input.LT(1);


        List list_e=null;
        SparqlT.nil_return n =null;

        RuleReturnScope e = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:319:5: ( ^( EXPRESSION_LIST (e+= expression )+ ) -> expressionList(expression=$e)| ^( EXPRESSION_LIST n= nil ) -> expressionList(nil=$n.st))
            int alt97=2;
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
                        alt97=1;
                        }
                        break;
                    case OPEN_BRACE:
                        {
                        alt97=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;

            }

            switch (alt97) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:319:7: ^( EXPRESSION_LIST (e+= expression )+ )
                    {
                    match(input,EXPRESSION_LIST,FOLLOW_EXPRESSION_LIST_in_expressionList3657); 

                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:319:25: (e+= expression )+
                    int cnt96=0;
                    loop96:
                    do {
                        int alt96=2;
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
                            alt96=1;
                            }
                            break;

                        }

                        switch (alt96) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:319:26: e+= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_expressionList3662);
                    	    e=expression();

                    	    state._fsp--;

                    	    if (list_e==null) list_e=new ArrayList();
                    	    list_e.add(e.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt96 >= 1 ) break loop96;
                                EarlyExitException eee =
                                    new EarlyExitException(96, input);
                                throw eee;
                        }
                        cnt96++;
                    } while (true);


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 319:43: -> expressionList(expression=$e)
                    {
                        retval.st = templateLib.getInstanceOf("expressionList",new STAttrMap().put("expression", list_e));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:320:7: ^( EXPRESSION_LIST n= nil )
                    {
                    match(input,EXPRESSION_LIST,FOLLOW_EXPRESSION_LIST_in_expressionList3683); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_nil_in_expressionList3687);
                    n=nil();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 320:32: -> expressionList(nil=$n.st)
                    {
                        retval.st = templateLib.getInstanceOf("expressionList",new STAttrMap().put("nil", (n!=null?n.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constructTemplate"
    // com\\googlecode\\sparkleg\\SparqlT.g:323:1: constructTemplate : ^( CONSTRUCT_TRIPLES (c= constructTriples )? ) -> constructTemplate(constructTriples=$c.st);
    public final SparqlT.constructTemplate_return constructTemplate() throws RecognitionException {
        SparqlT.constructTemplate_return retval = new SparqlT.constructTemplate_return();
        retval.start = input.LT(1);


        SparqlT.constructTriples_return c =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:324:5: ( ^( CONSTRUCT_TRIPLES (c= constructTriples )? ) -> constructTemplate(constructTriples=$c.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:324:7: ^( CONSTRUCT_TRIPLES (c= constructTriples )? )
            {
            match(input,CONSTRUCT_TRIPLES,FOLLOW_CONSTRUCT_TRIPLES_in_constructTemplate3717); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:324:27: (c= constructTriples )?
                int alt98=2;
                switch ( input.LA(1) ) {
                    case TRIPLES_SAME_SUBJECT:
                        {
                        alt98=1;
                        }
                        break;
                }

                switch (alt98) {
                    case 1 :
                        // com\\googlecode\\sparkleg\\SparqlT.g:324:28: c= constructTriples
                        {
                        pushFollow(FOLLOW_constructTriples_in_constructTemplate3722);
                        c=constructTriples();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 324:50: -> constructTemplate(constructTriples=$c.st)
            {
                retval.st = templateLib.getInstanceOf("constructTemplate",new STAttrMap().put("constructTriples", (c!=null?c.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constructTriples"
    // com\\googlecode\\sparkleg\\SparqlT.g:327:1: constructTriples : (t+= triplesSameSubject )+ -> constructTriples(triplesSameSubject=$t);
    public final SparqlT.constructTriples_return constructTriples() throws RecognitionException {
        SparqlT.constructTriples_return retval = new SparqlT.constructTriples_return();
        retval.start = input.LT(1);


        List list_t=null;
        RuleReturnScope t = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:328:5: ( (t+= triplesSameSubject )+ -> constructTriples(triplesSameSubject=$t))
            // com\\googlecode\\sparkleg\\SparqlT.g:328:7: (t+= triplesSameSubject )+
            {
            // com\\googlecode\\sparkleg\\SparqlT.g:328:7: (t+= triplesSameSubject )+
            int cnt99=0;
            loop99:
            do {
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
            	    // com\\googlecode\\sparkleg\\SparqlT.g:328:8: t+= triplesSameSubject
            	    {
            	    pushFollow(FOLLOW_triplesSameSubject_in_constructTriples3754);
            	    t=triplesSameSubject();

            	    state._fsp--;

            	    if (list_t==null) list_t=new ArrayList();
            	    list_t.add(t.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt99 >= 1 ) break loop99;
                        EarlyExitException eee =
                            new EarlyExitException(99, input);
                        throw eee;
                }
                cnt99++;
            } while (true);


            // TEMPLATE REWRITE
            // 328:32: -> constructTriples(triplesSameSubject=$t)
            {
                retval.st = templateLib.getInstanceOf("constructTriples",new STAttrMap().put("triplesSameSubject", list_t));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "triplesSameSubject"
    // com\\googlecode\\sparkleg\\SparqlT.g:331:1: triplesSameSubject : ( ^( TRIPLES_SAME_SUBJECT ^( SUBJECT v= varOrTerm ) p= propertyListNotEmpty ) -> triplesSameSubject(subject=$v.stpropertyListNotEmpty=$p.st)| ^( TRIPLES_SAME_SUBJECT t= triplesNode (p= propertyListNotEmpty )? ) -> triplesSameSubject(triplesNode=$t.stpropertyListNotEmpty=$p.st));
    public final SparqlT.triplesSameSubject_return triplesSameSubject() throws RecognitionException {
        SparqlT.triplesSameSubject_return retval = new SparqlT.triplesSameSubject_return();
        retval.start = input.LT(1);


        SparqlT.varOrTerm_return v =null;

        SparqlT.propertyListNotEmpty_return p =null;

        SparqlT.triplesNode_return t =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:332:5: ( ^( TRIPLES_SAME_SUBJECT ^( SUBJECT v= varOrTerm ) p= propertyListNotEmpty ) -> triplesSameSubject(subject=$v.stpropertyListNotEmpty=$p.st)| ^( TRIPLES_SAME_SUBJECT t= triplesNode (p= propertyListNotEmpty )? ) -> triplesSameSubject(triplesNode=$t.stpropertyListNotEmpty=$p.st))
            int alt101=2;
            switch ( input.LA(1) ) {
            case TRIPLES_SAME_SUBJECT:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case SUBJECT:
                        {
                        alt101=1;
                        }
                        break;
                    case COLLECTION:
                    case TRIPLES_NODE:
                        {
                        alt101=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 101, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;

            }

            switch (alt101) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:332:7: ^( TRIPLES_SAME_SUBJECT ^( SUBJECT v= varOrTerm ) p= propertyListNotEmpty )
                    {
                    match(input,TRIPLES_SAME_SUBJECT,FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubject3783); 

                    match(input, Token.DOWN, null); 
                    match(input,SUBJECT,FOLLOW_SUBJECT_in_triplesSameSubject3786); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubject3790);
                    v=varOrTerm();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject3795);
                    p=propertyListNotEmpty();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 332:77: -> triplesSameSubject(subject=$v.stpropertyListNotEmpty=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("triplesSameSubject",new STAttrMap().put("subject", (v!=null?v.st:null)).put("propertyListNotEmpty", (p!=null?p.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:333:7: ^( TRIPLES_SAME_SUBJECT t= triplesNode (p= propertyListNotEmpty )? )
                    {
                    match(input,TRIPLES_SAME_SUBJECT,FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubject3819); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubject3823);
                    t=triplesNode();

                    state._fsp--;


                    // com\\googlecode\\sparkleg\\SparqlT.g:333:44: (p= propertyListNotEmpty )?
                    int alt100=2;
                    switch ( input.LA(1) ) {
                        case PREDICATE:
                            {
                            alt100=1;
                            }
                            break;
                    }

                    switch (alt100) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:333:45: p= propertyListNotEmpty
                            {
                            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject3828);
                            p=propertyListNotEmpty();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 333:71: -> triplesSameSubject(triplesNode=$t.stpropertyListNotEmpty=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("triplesSameSubject",new STAttrMap().put("triplesNode", (t!=null?t.st:null)).put("propertyListNotEmpty", (p!=null?p.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "propertyListNotEmpty"
    // com\\googlecode\\sparkleg\\SparqlT.g:336:1: propertyListNotEmpty : (p+= propertyListNotEmptyDetails )+ -> propertyListNotEmpty(details=$p);
    public final SparqlT.propertyListNotEmpty_return propertyListNotEmpty() throws RecognitionException {
        SparqlT.propertyListNotEmpty_return retval = new SparqlT.propertyListNotEmpty_return();
        retval.start = input.LT(1);


        List list_p=null;
        RuleReturnScope p = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:337:5: ( (p+= propertyListNotEmptyDetails )+ -> propertyListNotEmpty(details=$p))
            // com\\googlecode\\sparkleg\\SparqlT.g:337:7: (p+= propertyListNotEmptyDetails )+
            {
            // com\\googlecode\\sparkleg\\SparqlT.g:337:7: (p+= propertyListNotEmptyDetails )+
            int cnt102=0;
            loop102:
            do {
                int alt102=2;
                switch ( input.LA(1) ) {
                case PREDICATE:
                    {
                    alt102=1;
                    }
                    break;

                }

                switch (alt102) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:337:8: p+= propertyListNotEmptyDetails
            	    {
            	    pushFollow(FOLLOW_propertyListNotEmptyDetails_in_propertyListNotEmpty3869);
            	    p=propertyListNotEmptyDetails();

            	    state._fsp--;

            	    if (list_p==null) list_p=new ArrayList();
            	    list_p.add(p.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt102 >= 1 ) break loop102;
                        EarlyExitException eee =
                            new EarlyExitException(102, input);
                        throw eee;
                }
                cnt102++;
            } while (true);


            // TEMPLATE REWRITE
            // 337:41: -> propertyListNotEmpty(details=$p)
            {
                retval.st = templateLib.getInstanceOf("propertyListNotEmpty",new STAttrMap().put("details", list_p));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "propertyListNotEmptyDetails"
    // com\\googlecode\\sparkleg\\SparqlT.g:340:1: propertyListNotEmptyDetails : ^( PREDICATE v= verb o= objectList ) -> propertyListNotEmptyDetails(verb=$v.stobjectList=$o.st);
    public final SparqlT.propertyListNotEmptyDetails_return propertyListNotEmptyDetails() throws RecognitionException {
        SparqlT.propertyListNotEmptyDetails_return retval = new SparqlT.propertyListNotEmptyDetails_return();
        retval.start = input.LT(1);


        SparqlT.verb_return v =null;

        SparqlT.objectList_return o =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:341:5: ( ^( PREDICATE v= verb o= objectList ) -> propertyListNotEmptyDetails(verb=$v.stobjectList=$o.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:341:7: ^( PREDICATE v= verb o= objectList )
            {
            match(input,PREDICATE,FOLLOW_PREDICATE_in_propertyListNotEmptyDetails3898); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_verb_in_propertyListNotEmptyDetails3903);
            v=verb();

            state._fsp--;


            pushFollow(FOLLOW_objectList_in_propertyListNotEmptyDetails3907);
            o=objectList();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 341:41: -> propertyListNotEmptyDetails(verb=$v.stobjectList=$o.st)
            {
                retval.st = templateLib.getInstanceOf("propertyListNotEmptyDetails",new STAttrMap().put("verb", (v!=null?v.st:null)).put("objectList", (o!=null?o.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "objectList"
    // com\\googlecode\\sparkleg\\SparqlT.g:344:1: objectList : ( ^( OBJECT g+= graphNode ) )+ -> objectList(graphNode=$g);
    public final SparqlT.objectList_return objectList() throws RecognitionException {
        SparqlT.objectList_return retval = new SparqlT.objectList_return();
        retval.start = input.LT(1);


        List list_g=null;
        RuleReturnScope g = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:345:5: ( ( ^( OBJECT g+= graphNode ) )+ -> objectList(graphNode=$g))
            // com\\googlecode\\sparkleg\\SparqlT.g:345:7: ( ^( OBJECT g+= graphNode ) )+
            {
            // com\\googlecode\\sparkleg\\SparqlT.g:345:7: ( ^( OBJECT g+= graphNode ) )+
            int cnt103=0;
            loop103:
            do {
                int alt103=2;
                switch ( input.LA(1) ) {
                case OBJECT:
                    {
                    alt103=1;
                    }
                    break;

                }

                switch (alt103) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:345:8: ^( OBJECT g+= graphNode )
            	    {
            	    match(input,OBJECT,FOLLOW_OBJECT_in_objectList3942); 

            	    match(input, Token.DOWN, null); 
            	    pushFollow(FOLLOW_graphNode_in_objectList3946);
            	    g=graphNode();

            	    state._fsp--;

            	    if (list_g==null) list_g=new ArrayList();
            	    list_g.add(g.getTemplate());


            	    match(input, Token.UP, null); 


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


            // TEMPLATE REWRITE
            // 345:33: -> objectList(graphNode=$g)
            {
                retval.st = templateLib.getInstanceOf("objectList",new STAttrMap().put("graphNode", list_g));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "verb"
    // com\\googlecode\\sparkleg\\SparqlT.g:348:1: verb : (v= varOrIRIref -> verb(varOrIRIref=$v.st)| A -> verb(a=$A.text)|p= path -> verb(path=p.st));
    public final SparqlT.verb_return verb() throws RecognitionException {
        SparqlT.verb_return retval = new SparqlT.verb_return();
        retval.start = input.LT(1);


        CommonTree A31=null;
        SparqlT.varOrIRIref_return v =null;

        SparqlT.path_return p =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:349:5: (v= varOrIRIref -> verb(varOrIRIref=$v.st)| A -> verb(a=$A.text)|p= path -> verb(path=p.st))
            int alt104=3;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
            case VAR1:
            case VAR2:
                {
                alt104=1;
                }
                break;
            case A:
                {
                alt104=2;
                }
                break;
            case PATH:
                {
                alt104=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }

            switch (alt104) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:349:7: v= varOrIRIref
                    {
                    pushFollow(FOLLOW_varOrIRIref_in_verb3977);
                    v=varOrIRIref();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 349:21: -> verb(varOrIRIref=$v.st)
                    {
                        retval.st = templateLib.getInstanceOf("verb",new STAttrMap().put("varOrIRIref", (v!=null?v.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:350:7: A
                    {
                    A31=(CommonTree)match(input,A,FOLLOW_A_in_verb3994); 

                    // TEMPLATE REWRITE
                    // 350:9: -> verb(a=$A.text)
                    {
                        retval.st = templateLib.getInstanceOf("verb",new STAttrMap().put("a", (A31!=null?A31.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:351:7: p= path
                    {
                    pushFollow(FOLLOW_path_in_verb4013);
                    p=path();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 351:14: -> verb(path=p.st)
                    {
                        retval.st = templateLib.getInstanceOf("verb",new STAttrMap().put("path", p.st));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "triplesSameSubjectPath"
    // com\\googlecode\\sparkleg\\SparqlT.g:354:1: triplesSameSubjectPath : ( ^( TRIPLES_SAME_SUBJECT ^( SUBJECT v= varOrTerm ) p= propertyListNotEmpty ) -> triplesSameSubjectPath(subject=$v.stpropertyListNotEmpty=$p.st)| ^( TRIPLES_SAME_SUBJECT t= triplesNode (p= propertyListNotEmpty )? ) -> triplesSameSubjectPath(triplesNode=t.stpropertyListNotEmpty=$p.st));
    public final SparqlT.triplesSameSubjectPath_return triplesSameSubjectPath() throws RecognitionException {
        SparqlT.triplesSameSubjectPath_return retval = new SparqlT.triplesSameSubjectPath_return();
        retval.start = input.LT(1);


        SparqlT.varOrTerm_return v =null;

        SparqlT.propertyListNotEmpty_return p =null;

        SparqlT.triplesNode_return t =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:355:5: ( ^( TRIPLES_SAME_SUBJECT ^( SUBJECT v= varOrTerm ) p= propertyListNotEmpty ) -> triplesSameSubjectPath(subject=$v.stpropertyListNotEmpty=$p.st)| ^( TRIPLES_SAME_SUBJECT t= triplesNode (p= propertyListNotEmpty )? ) -> triplesSameSubjectPath(triplesNode=t.stpropertyListNotEmpty=$p.st))
            int alt106=2;
            switch ( input.LA(1) ) {
            case TRIPLES_SAME_SUBJECT:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case SUBJECT:
                        {
                        alt106=1;
                        }
                        break;
                    case COLLECTION:
                    case TRIPLES_NODE:
                        {
                        alt106=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }

            switch (alt106) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:355:7: ^( TRIPLES_SAME_SUBJECT ^( SUBJECT v= varOrTerm ) p= propertyListNotEmpty )
                    {
                    match(input,TRIPLES_SAME_SUBJECT,FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubjectPath4040); 

                    match(input, Token.DOWN, null); 
                    match(input,SUBJECT,FOLLOW_SUBJECT_in_triplesSameSubjectPath4043); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubjectPath4047);
                    v=varOrTerm();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath4052);
                    p=propertyListNotEmpty();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 355:77: -> triplesSameSubjectPath(subject=$v.stpropertyListNotEmpty=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("triplesSameSubjectPath",new STAttrMap().put("subject", (v!=null?v.st:null)).put("propertyListNotEmpty", (p!=null?p.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:356:7: ^( TRIPLES_SAME_SUBJECT t= triplesNode (p= propertyListNotEmpty )? )
                    {
                    match(input,TRIPLES_SAME_SUBJECT,FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubjectPath4076); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubjectPath4080);
                    t=triplesNode();

                    state._fsp--;


                    // com\\googlecode\\sparkleg\\SparqlT.g:356:44: (p= propertyListNotEmpty )?
                    int alt105=2;
                    switch ( input.LA(1) ) {
                        case PREDICATE:
                            {
                            alt105=1;
                            }
                            break;
                    }

                    switch (alt105) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:356:45: p= propertyListNotEmpty
                            {
                            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath4085);
                            p=propertyListNotEmpty();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 356:71: -> triplesSameSubjectPath(triplesNode=t.stpropertyListNotEmpty=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("triplesSameSubjectPath",new STAttrMap().put("triplesNode", t.st).put("propertyListNotEmpty", (p!=null?p.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "path"
    // com\\googlecode\\sparkleg\\SparqlT.g:359:1: path : ^( PATH (p+= pathSequence )+ ) -> path(pathSequence=$p);
    public final SparqlT.path_return path() throws RecognitionException {
        SparqlT.path_return retval = new SparqlT.path_return();
        retval.start = input.LT(1);


        List list_p=null;
        RuleReturnScope p = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:360:5: ( ^( PATH (p+= pathSequence )+ ) -> path(pathSequence=$p))
            // com\\googlecode\\sparkleg\\SparqlT.g:360:7: ^( PATH (p+= pathSequence )+ )
            {
            match(input,PATH,FOLLOW_PATH_in_path4124); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:360:14: (p+= pathSequence )+
            int cnt107=0;
            loop107:
            do {
                int alt107=2;
                switch ( input.LA(1) ) {
                case PATH_SEQUENCE:
                    {
                    alt107=1;
                    }
                    break;

                }

                switch (alt107) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:360:15: p+= pathSequence
            	    {
            	    pushFollow(FOLLOW_pathSequence_in_path4129);
            	    p=pathSequence();

            	    state._fsp--;

            	    if (list_p==null) list_p=new ArrayList();
            	    list_p.add(p.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt107 >= 1 ) break loop107;
                        EarlyExitException eee =
                            new EarlyExitException(107, input);
                        throw eee;
                }
                cnt107++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 360:34: -> path(pathSequence=$p)
            {
                retval.st = templateLib.getInstanceOf("path",new STAttrMap().put("pathSequence", list_p));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "pathSequence"
    // com\\googlecode\\sparkleg\\SparqlT.g:363:1: pathSequence : ^( PATH_SEQUENCE (p+= pathEltOrInverse )+ ) -> pathSequence(pathEltOrInverse=$p);
    public final SparqlT.pathSequence_return pathSequence() throws RecognitionException {
        SparqlT.pathSequence_return retval = new SparqlT.pathSequence_return();
        retval.start = input.LT(1);


        List list_p=null;
        RuleReturnScope p = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:364:5: ( ^( PATH_SEQUENCE (p+= pathEltOrInverse )+ ) -> pathSequence(pathEltOrInverse=$p))
            // com\\googlecode\\sparkleg\\SparqlT.g:364:7: ^( PATH_SEQUENCE (p+= pathEltOrInverse )+ )
            {
            match(input,PATH_SEQUENCE,FOLLOW_PATH_SEQUENCE_in_pathSequence4160); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:364:23: (p+= pathEltOrInverse )+
            int cnt108=0;
            loop108:
            do {
                int alt108=2;
                switch ( input.LA(1) ) {
                case INVERSE:
                case PATH_PRIMARY:
                    {
                    alt108=1;
                    }
                    break;

                }

                switch (alt108) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:364:24: p+= pathEltOrInverse
            	    {
            	    pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence4165);
            	    p=pathEltOrInverse();

            	    state._fsp--;

            	    if (list_p==null) list_p=new ArrayList();
            	    list_p.add(p.getTemplate());


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


            // TEMPLATE REWRITE
            // 364:47: -> pathSequence(pathEltOrInverse=$p)
            {
                retval.st = templateLib.getInstanceOf("pathSequence",new STAttrMap().put("pathEltOrInverse", list_p));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "pathEltOrInverse"
    // com\\googlecode\\sparkleg\\SparqlT.g:367:1: pathEltOrInverse : ( INVERSE )? p= pathElt -> pathEltOrInverse(inverse=$INVERSE.textpathElt=$p.st);
    public final SparqlT.pathEltOrInverse_return pathEltOrInverse() throws RecognitionException {
        SparqlT.pathEltOrInverse_return retval = new SparqlT.pathEltOrInverse_return();
        retval.start = input.LT(1);


        CommonTree INVERSE32=null;
        SparqlT.pathElt_return p =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:368:5: ( ( INVERSE )? p= pathElt -> pathEltOrInverse(inverse=$INVERSE.textpathElt=$p.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:368:7: ( INVERSE )? p= pathElt
            {
            // com\\googlecode\\sparkleg\\SparqlT.g:368:7: ( INVERSE )?
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:368:7: INVERSE
                    {
                    INVERSE32=(CommonTree)match(input,INVERSE,FOLLOW_INVERSE_in_pathEltOrInverse4198); 

                    }
                    break;

            }


            pushFollow(FOLLOW_pathElt_in_pathEltOrInverse4203);
            p=pathElt();

            state._fsp--;


            // TEMPLATE REWRITE
            // 368:26: -> pathEltOrInverse(inverse=$INVERSE.textpathElt=$p.st)
            {
                retval.st = templateLib.getInstanceOf("pathEltOrInverse",new STAttrMap().put("inverse", (INVERSE32!=null?INVERSE32.getText():null)).put("pathElt", (p!=null?p.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "pathElt"
    // com\\googlecode\\sparkleg\\SparqlT.g:371:1: pathElt : p= pathPrimary (m= pathMod )? -> pathElt(pathPrimary=$p.stpathMod=$m.st);
    public final SparqlT.pathElt_return pathElt() throws RecognitionException {
        SparqlT.pathElt_return retval = new SparqlT.pathElt_return();
        retval.start = input.LT(1);


        SparqlT.pathPrimary_return p =null;

        SparqlT.pathMod_return m =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:372:5: (p= pathPrimary (m= pathMod )? -> pathElt(pathPrimary=$p.stpathMod=$m.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:372:7: p= pathPrimary (m= pathMod )?
            {
            pushFollow(FOLLOW_pathPrimary_in_pathElt4244);
            p=pathPrimary();

            state._fsp--;


            // com\\googlecode\\sparkleg\\SparqlT.g:372:22: (m= pathMod )?
            int alt110=2;
            switch ( input.LA(1) ) {
                case ASTERISK:
                case OPEN_CURLY_BRACE:
                case PLUS:
                case QUESTION_MARK:
                    {
                    alt110=1;
                    }
                    break;
            }

            switch (alt110) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:372:22: m= pathMod
                    {
                    pushFollow(FOLLOW_pathMod_in_pathElt4248);
                    m=pathMod();

                    state._fsp--;


                    }
                    break;

            }


            // TEMPLATE REWRITE
            // 372:32: -> pathElt(pathPrimary=$p.stpathMod=$m.st)
            {
                retval.st = templateLib.getInstanceOf("pathElt",new STAttrMap().put("pathPrimary", (p!=null?p.st:null)).put("pathMod", (m!=null?m.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "pathMod"
    // com\\googlecode\\sparkleg\\SparqlT.g:375:1: pathMod : ( ASTERISK -> pathMod(value=$ASTERISK.text)| QUESTION_MARK -> pathMod(value=$QUESTION_MARK.text)| PLUS -> pathMod(value=$PLUS.text)| OPEN_CURLY_BRACE (i1= INTEGER (c1= COMMA ( CLOSE_CURLY_BRACE |i2= INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) |c2= COMMA i3= INTEGER CLOSE_CURLY_BRACE ) -> pathMod(i1=$i1.textcomma1=$c1.texti2=$i2.textcomma2=$c2.texti3=$i3.text));
    public final SparqlT.pathMod_return pathMod() throws RecognitionException {
        SparqlT.pathMod_return retval = new SparqlT.pathMod_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        CommonTree c1=null;
        CommonTree i2=null;
        CommonTree c2=null;
        CommonTree i3=null;
        CommonTree ASTERISK33=null;
        CommonTree QUESTION_MARK34=null;
        CommonTree PLUS35=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:376:5: ( ASTERISK -> pathMod(value=$ASTERISK.text)| QUESTION_MARK -> pathMod(value=$QUESTION_MARK.text)| PLUS -> pathMod(value=$PLUS.text)| OPEN_CURLY_BRACE (i1= INTEGER (c1= COMMA ( CLOSE_CURLY_BRACE |i2= INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) |c2= COMMA i3= INTEGER CLOSE_CURLY_BRACE ) -> pathMod(i1=$i1.textcomma1=$c1.texti2=$i2.textcomma2=$c2.texti3=$i3.text))
            int alt114=4;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt114=1;
                }
                break;
            case QUESTION_MARK:
                {
                alt114=2;
                }
                break;
            case PLUS:
                {
                alt114=3;
                }
                break;
            case OPEN_CURLY_BRACE:
                {
                alt114=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }

            switch (alt114) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:376:7: ASTERISK
                    {
                    ASTERISK33=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_pathMod4284); 

                    // TEMPLATE REWRITE
                    // 376:16: -> pathMod(value=$ASTERISK.text)
                    {
                        retval.st = templateLib.getInstanceOf("pathMod",new STAttrMap().put("value", (ASTERISK33!=null?ASTERISK33.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:377:7: QUESTION_MARK
                    {
                    QUESTION_MARK34=(CommonTree)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_pathMod4301); 

                    // TEMPLATE REWRITE
                    // 377:21: -> pathMod(value=$QUESTION_MARK.text)
                    {
                        retval.st = templateLib.getInstanceOf("pathMod",new STAttrMap().put("value", (QUESTION_MARK34!=null?QUESTION_MARK34.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:378:7: PLUS
                    {
                    PLUS35=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_pathMod4318); 

                    // TEMPLATE REWRITE
                    // 378:12: -> pathMod(value=$PLUS.text)
                    {
                        retval.st = templateLib.getInstanceOf("pathMod",new STAttrMap().put("value", (PLUS35!=null?PLUS35.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:379:7: OPEN_CURLY_BRACE (i1= INTEGER (c1= COMMA ( CLOSE_CURLY_BRACE |i2= INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) |c2= COMMA i3= INTEGER CLOSE_CURLY_BRACE )
                    {
                    match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_pathMod4335); 

                    // com\\googlecode\\sparkleg\\SparqlT.g:379:24: (i1= INTEGER (c1= COMMA ( CLOSE_CURLY_BRACE |i2= INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) |c2= COMMA i3= INTEGER CLOSE_CURLY_BRACE )
                    int alt113=2;
                    switch ( input.LA(1) ) {
                    case INTEGER:
                        {
                        alt113=1;
                        }
                        break;
                    case COMMA:
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
                            // com\\googlecode\\sparkleg\\SparqlT.g:379:25: i1= INTEGER (c1= COMMA ( CLOSE_CURLY_BRACE |i2= INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE )
                            {
                            i1=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod4340); 

                            // com\\googlecode\\sparkleg\\SparqlT.g:379:36: (c1= COMMA ( CLOSE_CURLY_BRACE |i2= INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE )
                            int alt112=2;
                            switch ( input.LA(1) ) {
                            case COMMA:
                                {
                                alt112=1;
                                }
                                break;
                            case CLOSE_CURLY_BRACE:
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
                                    // com\\googlecode\\sparkleg\\SparqlT.g:379:37: c1= COMMA ( CLOSE_CURLY_BRACE |i2= INTEGER CLOSE_CURLY_BRACE )
                                    {
                                    c1=(CommonTree)match(input,COMMA,FOLLOW_COMMA_in_pathMod4345); 

                                    // com\\googlecode\\sparkleg\\SparqlT.g:379:46: ( CLOSE_CURLY_BRACE |i2= INTEGER CLOSE_CURLY_BRACE )
                                    int alt111=2;
                                    switch ( input.LA(1) ) {
                                    case CLOSE_CURLY_BRACE:
                                        {
                                        alt111=1;
                                        }
                                        break;
                                    case INTEGER:
                                        {
                                        alt111=2;
                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 111, 0, input);

                                        throw nvae;

                                    }

                                    switch (alt111) {
                                        case 1 :
                                            // com\\googlecode\\sparkleg\\SparqlT.g:379:47: CLOSE_CURLY_BRACE
                                            {
                                            match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod4348); 

                                            }
                                            break;
                                        case 2 :
                                            // com\\googlecode\\sparkleg\\SparqlT.g:379:67: i2= INTEGER CLOSE_CURLY_BRACE
                                            {
                                            i2=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod4354); 

                                            match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod4356); 

                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // com\\googlecode\\sparkleg\\SparqlT.g:379:99: CLOSE_CURLY_BRACE
                                    {
                                    match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod4361); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:379:120: c2= COMMA i3= INTEGER CLOSE_CURLY_BRACE
                            {
                            c2=(CommonTree)match(input,COMMA,FOLLOW_COMMA_in_pathMod4368); 

                            i3=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod4372); 

                            match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod4374); 

                            }
                            break;

                    }


                    // TEMPLATE REWRITE
                    // 379:159: -> pathMod(i1=$i1.textcomma1=$c1.texti2=$i2.textcomma2=$c2.texti3=$i3.text)
                    {
                        retval.st = templateLib.getInstanceOf("pathMod",new STAttrMap().put("i1", (i1!=null?i1.getText():null)).put("comma1", (c1!=null?c1.getText():null)).put("i2", (i2!=null?i2.getText():null)).put("comma2", (c2!=null?c2.getText():null)).put("i3", (i3!=null?i3.getText():null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "pathPrimary"
    // com\\googlecode\\sparkleg\\SparqlT.g:382:1: pathPrimary : ( ^( PATH_PRIMARY i= iriRef ) -> pathPrimary(iriRef=$i.st)| ^( PATH_PRIMARY A ) -> pathPrimary(value=$A.text)| ^( PATH_PRIMARY NEGATION n= pathNegatedPropertySet ) -> pathPrimary(value=$NEGATION.textpathNegatedPropertySet=$n.st)| ^( PATH_PRIMARY p= path ) -> pathPrimary(path=$p.st));
    public final SparqlT.pathPrimary_return pathPrimary() throws RecognitionException {
        SparqlT.pathPrimary_return retval = new SparqlT.pathPrimary_return();
        retval.start = input.LT(1);


        CommonTree A36=null;
        CommonTree NEGATION37=null;
        SparqlT.iriRef_return i =null;

        SparqlT.pathNegatedPropertySet_return n =null;

        SparqlT.path_return p =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:383:5: ( ^( PATH_PRIMARY i= iriRef ) -> pathPrimary(iriRef=$i.st)| ^( PATH_PRIMARY A ) -> pathPrimary(value=$A.text)| ^( PATH_PRIMARY NEGATION n= pathNegatedPropertySet ) -> pathPrimary(value=$NEGATION.textpathNegatedPropertySet=$n.st)| ^( PATH_PRIMARY p= path ) -> pathPrimary(path=$p.st))
            int alt115=4;
            switch ( input.LA(1) ) {
            case PATH_PRIMARY:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case A:
                        {
                        alt115=2;
                        }
                        break;
                    case NEGATION:
                        {
                        alt115=3;
                        }
                        break;
                    case IRI_REF:
                    case PNAME_LN:
                    case PNAME_NS:
                        {
                        alt115=1;
                        }
                        break;
                    case PATH:
                        {
                        alt115=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 115, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }

            switch (alt115) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:383:7: ^( PATH_PRIMARY i= iriRef )
                    {
                    match(input,PATH_PRIMARY,FOLLOW_PATH_PRIMARY_in_pathPrimary4422); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_iriRef_in_pathPrimary4426);
                    i=iriRef();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 383:32: -> pathPrimary(iriRef=$i.st)
                    {
                        retval.st = templateLib.getInstanceOf("pathPrimary",new STAttrMap().put("iriRef", (i!=null?i.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:384:7: ^( PATH_PRIMARY A )
                    {
                    match(input,PATH_PRIMARY,FOLLOW_PATH_PRIMARY_in_pathPrimary4445); 

                    match(input, Token.DOWN, null); 
                    A36=(CommonTree)match(input,A,FOLLOW_A_in_pathPrimary4447); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 384:25: -> pathPrimary(value=$A.text)
                    {
                        retval.st = templateLib.getInstanceOf("pathPrimary",new STAttrMap().put("value", (A36!=null?A36.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:385:7: ^( PATH_PRIMARY NEGATION n= pathNegatedPropertySet )
                    {
                    match(input,PATH_PRIMARY,FOLLOW_PATH_PRIMARY_in_pathPrimary4466); 

                    match(input, Token.DOWN, null); 
                    NEGATION37=(CommonTree)match(input,NEGATION,FOLLOW_NEGATION_in_pathPrimary4468); 

                    pushFollow(FOLLOW_pathNegatedPropertySet_in_pathPrimary4472);
                    n=pathNegatedPropertySet();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 385:57: -> pathPrimary(value=$NEGATION.textpathNegatedPropertySet=$n.st)
                    {
                        retval.st = templateLib.getInstanceOf("pathPrimary",new STAttrMap().put("value", (NEGATION37!=null?NEGATION37.getText():null)).put("pathNegatedPropertySet", (n!=null?n.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:386:7: ^( PATH_PRIMARY p= path )
                    {
                    match(input,PATH_PRIMARY,FOLLOW_PATH_PRIMARY_in_pathPrimary4496); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_path_in_pathPrimary4500);
                    p=path();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 386:30: -> pathPrimary(path=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("pathPrimary",new STAttrMap().put("path", (p!=null?p.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "pathNegatedPropertySet"
    // com\\googlecode\\sparkleg\\SparqlT.g:389:1: pathNegatedPropertySet : ^( PATH_NEGATED (p+= pathOneInPropertySet )+ ) -> pathNegatedPropertySet(pathOneInPropertySet=$p);
    public final SparqlT.pathNegatedPropertySet_return pathNegatedPropertySet() throws RecognitionException {
        SparqlT.pathNegatedPropertySet_return retval = new SparqlT.pathNegatedPropertySet_return();
        retval.start = input.LT(1);


        List list_p=null;
        RuleReturnScope p = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:390:5: ( ^( PATH_NEGATED (p+= pathOneInPropertySet )+ ) -> pathNegatedPropertySet(pathOneInPropertySet=$p))
            // com\\googlecode\\sparkleg\\SparqlT.g:390:7: ^( PATH_NEGATED (p+= pathOneInPropertySet )+ )
            {
            match(input,PATH_NEGATED,FOLLOW_PATH_NEGATED_in_pathNegatedPropertySet4528); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:390:22: (p+= pathOneInPropertySet )+
            int cnt116=0;
            loop116:
            do {
                int alt116=2;
                switch ( input.LA(1) ) {
                case A:
                case INVERSE:
                case IRI_REF:
                case PNAME_LN:
                case PNAME_NS:
                    {
                    alt116=1;
                    }
                    break;

                }

                switch (alt116) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:390:23: p+= pathOneInPropertySet
            	    {
            	    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet4533);
            	    p=pathOneInPropertySet();

            	    state._fsp--;

            	    if (list_p==null) list_p=new ArrayList();
            	    list_p.add(p.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt116 >= 1 ) break loop116;
                        EarlyExitException eee =
                            new EarlyExitException(116, input);
                        throw eee;
                }
                cnt116++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 390:50: -> pathNegatedPropertySet(pathOneInPropertySet=$p)
            {
                retval.st = templateLib.getInstanceOf("pathNegatedPropertySet",new STAttrMap().put("pathOneInPropertySet", list_p));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "pathOneInPropertySet"
    // com\\googlecode\\sparkleg\\SparqlT.g:393:1: pathOneInPropertySet : ( INVERSE )? (i= iriRef | A ) -> pathOneInPropertySet(attribute=$INVERSE.textiriRef=$i.stvalue=$A.text);
    public final SparqlT.pathOneInPropertySet_return pathOneInPropertySet() throws RecognitionException {
        SparqlT.pathOneInPropertySet_return retval = new SparqlT.pathOneInPropertySet_return();
        retval.start = input.LT(1);


        CommonTree INVERSE38=null;
        CommonTree A39=null;
        SparqlT.iriRef_return i =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:394:5: ( ( INVERSE )? (i= iriRef | A ) -> pathOneInPropertySet(attribute=$INVERSE.textiriRef=$i.stvalue=$A.text))
            // com\\googlecode\\sparkleg\\SparqlT.g:394:7: ( INVERSE )? (i= iriRef | A )
            {
            // com\\googlecode\\sparkleg\\SparqlT.g:394:7: ( INVERSE )?
            int alt117=2;
            switch ( input.LA(1) ) {
                case INVERSE:
                    {
                    alt117=1;
                    }
                    break;
            }

            switch (alt117) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:394:7: INVERSE
                    {
                    INVERSE38=(CommonTree)match(input,INVERSE,FOLLOW_INVERSE_in_pathOneInPropertySet4565); 

                    }
                    break;

            }


            // com\\googlecode\\sparkleg\\SparqlT.g:394:16: (i= iriRef | A )
            int alt118=2;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt118=1;
                }
                break;
            case A:
                {
                alt118=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;

            }

            switch (alt118) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:394:17: i= iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_pathOneInPropertySet4571);
                    i=iriRef();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:394:28: A
                    {
                    A39=(CommonTree)match(input,A,FOLLOW_A_in_pathOneInPropertySet4575); 

                    }
                    break;

            }


            // TEMPLATE REWRITE
            // 394:31: -> pathOneInPropertySet(attribute=$INVERSE.textiriRef=$i.stvalue=$A.text)
            {
                retval.st = templateLib.getInstanceOf("pathOneInPropertySet",new STAttrMap().put("attribute", (INVERSE38!=null?INVERSE38.getText():null)).put("iriRef", (i!=null?i.st:null)).put("value", (A39!=null?A39.getText():null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "triplesNode"
    // com\\googlecode\\sparkleg\\SparqlT.g:397:1: triplesNode : ( ^( COLLECTION (g+= graphNode )+ ) -> triplesNode(graphNode=$g)| ^( TRIPLES_NODE p= propertyListNotEmpty ) -> triplesNode(propertyListNotEmpty=$p.st));
    public final SparqlT.triplesNode_return triplesNode() throws RecognitionException {
        SparqlT.triplesNode_return retval = new SparqlT.triplesNode_return();
        retval.start = input.LT(1);


        List list_g=null;
        SparqlT.propertyListNotEmpty_return p =null;

        RuleReturnScope g = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:398:5: ( ^( COLLECTION (g+= graphNode )+ ) -> triplesNode(graphNode=$g)| ^( TRIPLES_NODE p= propertyListNotEmpty ) -> triplesNode(propertyListNotEmpty=$p.st))
            int alt120=2;
            switch ( input.LA(1) ) {
            case COLLECTION:
                {
                alt120=1;
                }
                break;
            case TRIPLES_NODE:
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:398:7: ^( COLLECTION (g+= graphNode )+ )
                    {
                    match(input,COLLECTION,FOLLOW_COLLECTION_in_triplesNode4614); 

                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:398:20: (g+= graphNode )+
                    int cnt119=0;
                    loop119:
                    do {
                        int alt119=2;
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
                            alt119=1;
                            }
                            break;

                        }

                        switch (alt119) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:398:21: g+= graphNode
                    	    {
                    	    pushFollow(FOLLOW_graphNode_in_triplesNode4619);
                    	    g=graphNode();

                    	    state._fsp--;

                    	    if (list_g==null) list_g=new ArrayList();
                    	    list_g.add(g.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt119 >= 1 ) break loop119;
                                EarlyExitException eee =
                                    new EarlyExitException(119, input);
                                throw eee;
                        }
                        cnt119++;
                    } while (true);


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 398:37: -> triplesNode(graphNode=$g)
                    {
                        retval.st = templateLib.getInstanceOf("triplesNode",new STAttrMap().put("graphNode", list_g));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:399:7: ^( TRIPLES_NODE p= propertyListNotEmpty )
                    {
                    match(input,TRIPLES_NODE,FOLLOW_TRIPLES_NODE_in_triplesNode4640); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesNode4644);
                    p=propertyListNotEmpty();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 399:46: -> triplesNode(propertyListNotEmpty=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("triplesNode",new STAttrMap().put("propertyListNotEmpty", (p!=null?p.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "graphNode"
    // com\\googlecode\\sparkleg\\SparqlT.g:402:1: graphNode : (v= varOrTerm -> graphNode(varOrTerm=$v.st)|t= triplesNode -> graphNode(triplesNode=$t.st));
    public final SparqlT.graphNode_return graphNode() throws RecognitionException {
        SparqlT.graphNode_return retval = new SparqlT.graphNode_return();
        retval.start = input.LT(1);


        SparqlT.varOrTerm_return v =null;

        SparqlT.triplesNode_return t =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:403:5: (v= varOrTerm -> graphNode(varOrTerm=$v.st)|t= triplesNode -> graphNode(triplesNode=$t.st))
            int alt121=2;
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
                alt121=1;
                }
                break;
            case COLLECTION:
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:403:7: v= varOrTerm
                    {
                    pushFollow(FOLLOW_varOrTerm_in_graphNode4674);
                    v=varOrTerm();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 403:19: -> graphNode(varOrTerm=$v.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphNode",new STAttrMap().put("varOrTerm", (v!=null?v.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:404:7: t= triplesNode
                    {
                    pushFollow(FOLLOW_triplesNode_in_graphNode4694);
                    t=triplesNode();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 404:21: -> graphNode(triplesNode=$t.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphNode",new STAttrMap().put("triplesNode", (t!=null?t.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "varOrTerm"
    // com\\googlecode\\sparkleg\\SparqlT.g:407:1: varOrTerm : (v= var -> varOrTerm(var=$v.st)|g= graphTerm -> varOrTerm(graphTerm=$g.st)| BLANK_NODE -> varOrTerm(var=\"[ ]\"));
    public final SparqlT.varOrTerm_return varOrTerm() throws RecognitionException {
        SparqlT.varOrTerm_return retval = new SparqlT.varOrTerm_return();
        retval.start = input.LT(1);


        SparqlT.var_return v =null;

        SparqlT.graphTerm_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:408:5: (v= var -> varOrTerm(var=$v.st)|g= graphTerm -> varOrTerm(graphTerm=$g.st)| BLANK_NODE -> varOrTerm(var=\"[ ]\"))
            int alt122=3;
            switch ( input.LA(1) ) {
            case VAR1:
            case VAR2:
                {
                alt122=1;
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
                alt122=2;
                }
                break;
            case BLANK_NODE:
                {
                alt122=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;

            }

            switch (alt122) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:408:7: v= var
                    {
                    pushFollow(FOLLOW_var_in_varOrTerm4722);
                    v=var();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 408:13: -> varOrTerm(var=$v.st)
                    {
                        retval.st = templateLib.getInstanceOf("varOrTerm",new STAttrMap().put("var", (v!=null?v.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:409:7: g= graphTerm
                    {
                    pushFollow(FOLLOW_graphTerm_in_varOrTerm4741);
                    g=graphTerm();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 409:19: -> varOrTerm(graphTerm=$g.st)
                    {
                        retval.st = templateLib.getInstanceOf("varOrTerm",new STAttrMap().put("graphTerm", (g!=null?g.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:410:7: BLANK_NODE
                    {
                    match(input,BLANK_NODE,FOLLOW_BLANK_NODE_in_varOrTerm4758); 

                    // TEMPLATE REWRITE
                    // 410:18: -> varOrTerm(var=\"[ ]\")
                    {
                        retval.st = templateLib.getInstanceOf("varOrTerm",new STAttrMap().put("var", "[ ]"));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "varOrIRIref"
    // com\\googlecode\\sparkleg\\SparqlT.g:413:1: varOrIRIref : (v= var -> varOrIRIref(var=$v.st)|i= iriRef -> varOrIRIref(iriRef=$i.st));
    public final SparqlT.varOrIRIref_return varOrIRIref() throws RecognitionException {
        SparqlT.varOrIRIref_return retval = new SparqlT.varOrIRIref_return();
        retval.start = input.LT(1);


        SparqlT.var_return v =null;

        SparqlT.iriRef_return i =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:414:5: (v= var -> varOrIRIref(var=$v.st)|i= iriRef -> varOrIRIref(iriRef=$i.st))
            int alt123=2;
            switch ( input.LA(1) ) {
            case VAR1:
            case VAR2:
                {
                alt123=1;
                }
                break;
            case IRI_REF:
            case PNAME_LN:
            case PNAME_NS:
                {
                alt123=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;

            }

            switch (alt123) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:414:7: v= var
                    {
                    pushFollow(FOLLOW_var_in_varOrIRIref4786);
                    v=var();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 414:13: -> varOrIRIref(var=$v.st)
                    {
                        retval.st = templateLib.getInstanceOf("varOrIRIref",new STAttrMap().put("var", (v!=null?v.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:415:7: i= iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_varOrIRIref4805);
                    i=iriRef();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 415:16: -> varOrIRIref(iriRef=$i.st)
                    {
                        retval.st = templateLib.getInstanceOf("varOrIRIref",new STAttrMap().put("iriRef", (i!=null?i.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "var"
    // com\\googlecode\\sparkleg\\SparqlT.g:418:1: var : (v= VAR1 -> var(v=$VAR1.text)|v= VAR2 -> var(v=$VAR2.text));
    public final SparqlT.var_return var() throws RecognitionException {
        SparqlT.var_return retval = new SparqlT.var_return();
        retval.start = input.LT(1);


        CommonTree v=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:419:5: (v= VAR1 -> var(v=$VAR1.text)|v= VAR2 -> var(v=$VAR2.text))
            int alt124=2;
            switch ( input.LA(1) ) {
            case VAR1:
                {
                alt124=1;
                }
                break;
            case VAR2:
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:419:7: v= VAR1
                    {
                    v=(CommonTree)match(input,VAR1,FOLLOW_VAR1_in_var4833); 

                    // TEMPLATE REWRITE
                    // 419:14: -> var(v=$VAR1.text)
                    {
                        retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("v", (v!=null?v.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:420:7: v= VAR2
                    {
                    v=(CommonTree)match(input,VAR2,FOLLOW_VAR2_in_var4853); 

                    // TEMPLATE REWRITE
                    // 420:14: -> var(v=$VAR2.text)
                    {
                        retval.st = templateLib.getInstanceOf("var",new STAttrMap().put("v", (v!=null?v.getText():null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "graphTerm"
    // com\\googlecode\\sparkleg\\SparqlT.g:423:1: graphTerm : (i= iriRef -> graphTerm(iriRef=$i.st)|r= rdfLiteral -> graphTerm(rdfLiteral=$r.st)|n= numericLiteral -> graphTerm(numericLiteral=$n.st)|b= booleanLiteral -> graphTerm(booleanLiteral=$b.st)|bn= blankNode -> graphTerm(blankNode=$bn.st)|ni= nil -> graphTerm(value=$ni.st));
    public final SparqlT.graphTerm_return graphTerm() throws RecognitionException {
        SparqlT.graphTerm_return retval = new SparqlT.graphTerm_return();
        retval.start = input.LT(1);


        SparqlT.iriRef_return i =null;

        SparqlT.rdfLiteral_return r =null;

        SparqlT.numericLiteral_return n =null;

        SparqlT.booleanLiteral_return b =null;

        SparqlT.blankNode_return bn =null;

        SparqlT.nil_return ni =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:424:5: (i= iriRef -> graphTerm(iriRef=$i.st)|r= rdfLiteral -> graphTerm(rdfLiteral=$r.st)|n= numericLiteral -> graphTerm(numericLiteral=$n.st)|b= booleanLiteral -> graphTerm(booleanLiteral=$b.st)|bn= blankNode -> graphTerm(blankNode=$bn.st)|ni= nil -> graphTerm(value=$ni.st))
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:424:7: i= iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_graphTerm4882);
                    i=iriRef();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 424:16: -> graphTerm(iriRef=$i.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphTerm",new STAttrMap().put("iriRef", (i!=null?i.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:425:7: r= rdfLiteral
                    {
                    pushFollow(FOLLOW_rdfLiteral_in_graphTerm4901);
                    r=rdfLiteral();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 425:20: -> graphTerm(rdfLiteral=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphTerm",new STAttrMap().put("rdfLiteral", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:426:7: n= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_graphTerm4920);
                    n=numericLiteral();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 426:24: -> graphTerm(numericLiteral=$n.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphTerm",new STAttrMap().put("numericLiteral", (n!=null?n.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:427:7: b= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm4939);
                    b=booleanLiteral();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 427:24: -> graphTerm(booleanLiteral=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphTerm",new STAttrMap().put("booleanLiteral", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:428:7: bn= blankNode
                    {
                    pushFollow(FOLLOW_blankNode_in_graphTerm4958);
                    bn=blankNode();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 428:20: -> graphTerm(blankNode=$bn.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphTerm",new STAttrMap().put("blankNode", (bn!=null?bn.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:429:7: ni= nil
                    {
                    pushFollow(FOLLOW_nil_in_graphTerm4977);
                    ni=nil();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 429:14: -> graphTerm(value=$ni.st)
                    {
                        retval.st = templateLib.getInstanceOf("graphTerm",new STAttrMap().put("value", (ni!=null?ni.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "nil"
    // com\\googlecode\\sparkleg\\SparqlT.g:432:1: nil : OPEN_BRACE CLOSE_BRACE -> nil(;
    public final SparqlT.nil_return nil() throws RecognitionException {
        SparqlT.nil_return retval = new SparqlT.nil_return();
        retval.start = input.LT(1);


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:433:5: ( OPEN_BRACE CLOSE_BRACE -> nil()
            // com\\googlecode\\sparkleg\\SparqlT.g:433:7: OPEN_BRACE CLOSE_BRACE
            {
            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_nil5007); 

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_nil5009); 

            // TEMPLATE REWRITE
            // 433:30: -> nil(
            {
                retval.st = templateLib.getInstanceOf("nil");
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "expression"
    // com\\googlecode\\sparkleg\\SparqlT.g:436:1: expression : ( ^( OR e1= expression e2= expression ) -> expression(operator=$OR.textexpression1=$e1.stexpression2=$e2.st)| ^( AND e1= expression e2= expression ) -> expression(operator=$AND.textexpression1=$e1.stexpression2=$e2.st)| ^( EQUAL e1= expression e2= expression ) -> expression(operator=\"=\"expression1=$e1.stexpression2=$e2.st)| ^( NOT_EQUAL e1= expression e2= expression ) -> expression(operator=\"!=\"expression1=$e1.stexpression2=$e2.st)| ^( LESS e1= expression e2= expression ) -> expression(operator=\"<\"expression1=$e1.stexpression2=$e2.st)| ^( GREATER e1= expression e2= expression ) -> expression(operator=\">\"expression1=$e1.stexpression2=$e2.st)| ^( LESS_EQUAL e1= expression e2= expression ) -> expression(operator=\"<=\"expression1=$e1.stexpression2=$e2.st)| ^( GREATER_EQUAL e1= expression e2= expression ) -> expression(operator=\">=\"expression1=$e1.stexpression2=$e2.st)| ^( IN e1= expression e2= expression ) -> expression(operator=$IN.textexpression1=$e1.stexpression2=$e2.st)| ^( NOT IN e1= expression e2= expression ) -> expression(operator=\"NOT IN\"expression1=$e1.stexpression2=$e2.st)| ^( PLUS e1= expression e2= expression ) -> expression(operator=\"+\"expression1=$e1.stexpression2=$e2.st)| ^( MINUS e1= expression e2= expression ) -> expression(operator=\"-\"expression1=$e1.stexpression2=$e2.st)| ^( ASTERISK e1= expression e2= expression ) -> expression(operator=\"*\"expression1=$e1.stexpression2=$e2.st)| ^( DIVIDE e1= expression e2= expression ) -> expression(operator=\"/\"expression1=$e1.stexpression2=$e2.st)|n= numericLiteralPositive -> expression(numericLiteralPositive=$n.st)|m= numericLiteralNegative -> expression(numericLiteralNegative=$m.st)|u= unaryExpression -> expression(unaryExpression=$u.st));
    public final SparqlT.expression_return expression() throws RecognitionException {
        SparqlT.expression_return retval = new SparqlT.expression_return();
        retval.start = input.LT(1);


        CommonTree OR40=null;
        CommonTree AND41=null;
        CommonTree IN42=null;
        SparqlT.expression_return e1 =null;

        SparqlT.expression_return e2 =null;

        SparqlT.numericLiteralPositive_return n =null;

        SparqlT.numericLiteralNegative_return m =null;

        SparqlT.unaryExpression_return u =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:437:5: ( ^( OR e1= expression e2= expression ) -> expression(operator=$OR.textexpression1=$e1.stexpression2=$e2.st)| ^( AND e1= expression e2= expression ) -> expression(operator=$AND.textexpression1=$e1.stexpression2=$e2.st)| ^( EQUAL e1= expression e2= expression ) -> expression(operator=\"=\"expression1=$e1.stexpression2=$e2.st)| ^( NOT_EQUAL e1= expression e2= expression ) -> expression(operator=\"!=\"expression1=$e1.stexpression2=$e2.st)| ^( LESS e1= expression e2= expression ) -> expression(operator=\"<\"expression1=$e1.stexpression2=$e2.st)| ^( GREATER e1= expression e2= expression ) -> expression(operator=\">\"expression1=$e1.stexpression2=$e2.st)| ^( LESS_EQUAL e1= expression e2= expression ) -> expression(operator=\"<=\"expression1=$e1.stexpression2=$e2.st)| ^( GREATER_EQUAL e1= expression e2= expression ) -> expression(operator=\">=\"expression1=$e1.stexpression2=$e2.st)| ^( IN e1= expression e2= expression ) -> expression(operator=$IN.textexpression1=$e1.stexpression2=$e2.st)| ^( NOT IN e1= expression e2= expression ) -> expression(operator=\"NOT IN\"expression1=$e1.stexpression2=$e2.st)| ^( PLUS e1= expression e2= expression ) -> expression(operator=\"+\"expression1=$e1.stexpression2=$e2.st)| ^( MINUS e1= expression e2= expression ) -> expression(operator=\"-\"expression1=$e1.stexpression2=$e2.st)| ^( ASTERISK e1= expression e2= expression ) -> expression(operator=\"*\"expression1=$e1.stexpression2=$e2.st)| ^( DIVIDE e1= expression e2= expression ) -> expression(operator=\"/\"expression1=$e1.stexpression2=$e2.st)|n= numericLiteralPositive -> expression(numericLiteralPositive=$n.st)|m= numericLiteralNegative -> expression(numericLiteralNegative=$m.st)|u= unaryExpression -> expression(unaryExpression=$u.st))
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:437:7: ^( OR e1= expression e2= expression )
                    {
                    OR40=(CommonTree)match(input,OR,FOLLOW_OR_in_expression5033); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5037);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5041);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 437:41: -> expression(operator=$OR.textexpression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", (OR40!=null?OR40.getText():null)).put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:438:7: ^( AND e1= expression e2= expression )
                    {
                    AND41=(CommonTree)match(input,AND,FOLLOW_AND_in_expression5071); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5075);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5079);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 438:42: -> expression(operator=$AND.textexpression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", (AND41!=null?AND41.getText():null)).put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:439:7: ^( EQUAL e1= expression e2= expression )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expression5109); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5113);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5117);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 439:44: -> expression(operator=\"=\"expression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", "=").put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:440:7: ^( NOT_EQUAL e1= expression e2= expression )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expression5149); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5153);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5157);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 440:48: -> expression(operator=\"!=\"expression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", "!=").put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:441:7: ^( LESS e1= expression e2= expression )
                    {
                    match(input,LESS,FOLLOW_LESS_in_expression5187); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5191);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5195);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 441:43: -> expression(operator=\"<\"expression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", "<").put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:442:7: ^( GREATER e1= expression e2= expression )
                    {
                    match(input,GREATER,FOLLOW_GREATER_in_expression5225); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5229);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5233);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 442:46: -> expression(operator=\">\"expression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", ">").put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:443:7: ^( LESS_EQUAL e1= expression e2= expression )
                    {
                    match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_expression5263); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5267);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5271);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 443:49: -> expression(operator=\"<=\"expression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", "<=").put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:444:7: ^( GREATER_EQUAL e1= expression e2= expression )
                    {
                    match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_expression5301); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5305);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5309);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 444:52: -> expression(operator=\">=\"expression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", ">=").put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 9 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:445:7: ^( IN e1= expression e2= expression )
                    {
                    IN42=(CommonTree)match(input,IN,FOLLOW_IN_in_expression5341); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5345);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5349);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 445:41: -> expression(operator=$IN.textexpression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", (IN42!=null?IN42.getText():null)).put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 10 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:446:7: ^( NOT IN e1= expression e2= expression )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression5379); 

                    match(input, Token.DOWN, null); 
                    match(input,IN,FOLLOW_IN_in_expression5381); 

                    pushFollow(FOLLOW_expression_in_expression5385);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5389);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 446:45: -> expression(operator=\"NOT IN\"expression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", "NOT IN").put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 11 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:447:7: ^( PLUS e1= expression e2= expression )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expression5419); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5423);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5427);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 447:43: -> expression(operator=\"+\"expression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", "+").put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 12 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:448:7: ^( MINUS e1= expression e2= expression )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expression5457); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5461);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5465);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 448:44: -> expression(operator=\"-\"expression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", "-").put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 13 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:449:7: ^( ASTERISK e1= expression e2= expression )
                    {
                    match(input,ASTERISK,FOLLOW_ASTERISK_in_expression5496); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5500);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5504);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 449:47: -> expression(operator=\"*\"expression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", "*").put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 14 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:450:7: ^( DIVIDE e1= expression e2= expression )
                    {
                    match(input,DIVIDE,FOLLOW_DIVIDE_in_expression5534); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression5538);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression5542);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 450:45: -> expression(operator=\"/\"expression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("operator", "/").put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 15 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:451:7: n= numericLiteralPositive
                    {
                    pushFollow(FOLLOW_numericLiteralPositive_in_expression5573);
                    n=numericLiteralPositive();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 451:32: -> expression(numericLiteralPositive=$n.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("numericLiteralPositive", (n!=null?n.st:null)));
                    }



                    }
                    break;
                case 16 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:452:7: m= numericLiteralNegative
                    {
                    pushFollow(FOLLOW_numericLiteralNegative_in_expression5592);
                    m=numericLiteralNegative();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 452:32: -> expression(numericLiteralNegative=$m.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("numericLiteralNegative", (m!=null?m.st:null)));
                    }



                    }
                    break;
                case 17 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:453:7: u= unaryExpression
                    {
                    pushFollow(FOLLOW_unaryExpression_in_expression5611);
                    u=unaryExpression();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 453:25: -> expression(unaryExpression=$u.st)
                    {
                        retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("unaryExpression", (u!=null?u.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "unaryExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:456:1: unaryExpression : ( ^( UNARY NEGATION p= primaryExpression ) -> unaryExpression(operator=$NEGATION.textprimaryExpression=$p.st)| ^( UNARY PLUS p= primaryExpression ) -> unaryExpression(operator=$PLUS.textprimaryExpression=$p.st)| ^( UNARY MINUS p= primaryExpression ) -> unaryExpression(operator=$MINUS.textprimaryExpression=$p.st)| ^( UNARY p= primaryExpression ) -> unaryExpression(primaryExpression=$p.st));
    public final SparqlT.unaryExpression_return unaryExpression() throws RecognitionException {
        SparqlT.unaryExpression_return retval = new SparqlT.unaryExpression_return();
        retval.start = input.LT(1);


        CommonTree NEGATION43=null;
        CommonTree PLUS44=null;
        CommonTree MINUS45=null;
        SparqlT.primaryExpression_return p =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:457:5: ( ^( UNARY NEGATION p= primaryExpression ) -> unaryExpression(operator=$NEGATION.textprimaryExpression=$p.st)| ^( UNARY PLUS p= primaryExpression ) -> unaryExpression(operator=$PLUS.textprimaryExpression=$p.st)| ^( UNARY MINUS p= primaryExpression ) -> unaryExpression(operator=$MINUS.textprimaryExpression=$p.st)| ^( UNARY p= primaryExpression ) -> unaryExpression(primaryExpression=$p.st))
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
                    case UNARY:
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:457:7: ^( UNARY NEGATION p= primaryExpression )
                    {
                    match(input,UNARY,FOLLOW_UNARY_in_unaryExpression5642); 

                    match(input, Token.DOWN, null); 
                    NEGATION43=(CommonTree)match(input,NEGATION,FOLLOW_NEGATION_in_unaryExpression5644); 

                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression5648);
                    p=primaryExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 457:45: -> unaryExpression(operator=$NEGATION.textprimaryExpression=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("unaryExpression",new STAttrMap().put("operator", (NEGATION43!=null?NEGATION43.getText():null)).put("primaryExpression", (p!=null?p.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:458:7: ^( UNARY PLUS p= primaryExpression )
                    {
                    match(input,UNARY,FOLLOW_UNARY_in_unaryExpression5672); 

                    match(input, Token.DOWN, null); 
                    PLUS44=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression5674); 

                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression5678);
                    p=primaryExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 458:41: -> unaryExpression(operator=$PLUS.textprimaryExpression=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("unaryExpression",new STAttrMap().put("operator", (PLUS44!=null?PLUS44.getText():null)).put("primaryExpression", (p!=null?p.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:459:7: ^( UNARY MINUS p= primaryExpression )
                    {
                    match(input,UNARY,FOLLOW_UNARY_in_unaryExpression5702); 

                    match(input, Token.DOWN, null); 
                    MINUS45=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression5704); 

                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression5708);
                    p=primaryExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 459:42: -> unaryExpression(operator=$MINUS.textprimaryExpression=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("unaryExpression",new STAttrMap().put("operator", (MINUS45!=null?MINUS45.getText():null)).put("primaryExpression", (p!=null?p.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:460:7: ^( UNARY p= primaryExpression )
                    {
                    match(input,UNARY,FOLLOW_UNARY_in_unaryExpression5732); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression5736);
                    p=primaryExpression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 460:36: -> unaryExpression(primaryExpression=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("unaryExpression",new STAttrMap().put("primaryExpression", (p!=null?p.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "primaryExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:463:1: primaryExpression : (e= brackettedExpression -> primaryExpression(brackettedExpression=$e.st)|c= builtInCall -> primaryExpression(builtInCall=$c.st)|i= iriRefOrFunction -> primaryExpression(iriRefOrFunction=$i.st)|r= rdfLiteral -> primaryExpression(rdfLiteral=$r.st)|n= numericLiteral -> primaryExpression(numericLiteral=$n.st)|b= booleanLiteral -> primaryExpression(booleanLiteral=$b.st)|v= var -> primaryExpression(var=$v.st)|a= aggregate -> primaryExpression(aggregate=$a.st)|u= unaryExpression -> primaryExpression(unaryExpression=$u.st));
    public final SparqlT.primaryExpression_return primaryExpression() throws RecognitionException {
        SparqlT.primaryExpression_return retval = new SparqlT.primaryExpression_return();
        retval.start = input.LT(1);


        SparqlT.brackettedExpression_return e =null;

        SparqlT.builtInCall_return c =null;

        SparqlT.iriRefOrFunction_return i =null;

        SparqlT.rdfLiteral_return r =null;

        SparqlT.numericLiteral_return n =null;

        SparqlT.booleanLiteral_return b =null;

        SparqlT.var_return v =null;

        SparqlT.aggregate_return a =null;

        SparqlT.unaryExpression_return u =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:464:5: (e= brackettedExpression -> primaryExpression(brackettedExpression=$e.st)|c= builtInCall -> primaryExpression(builtInCall=$c.st)|i= iriRefOrFunction -> primaryExpression(iriRefOrFunction=$i.st)|r= rdfLiteral -> primaryExpression(rdfLiteral=$r.st)|n= numericLiteral -> primaryExpression(numericLiteral=$n.st)|b= booleanLiteral -> primaryExpression(booleanLiteral=$b.st)|v= var -> primaryExpression(var=$v.st)|a= aggregate -> primaryExpression(aggregate=$a.st)|u= unaryExpression -> primaryExpression(unaryExpression=$u.st))
            int alt128=9;
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
            case UNARY:
                {
                alt128=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;

            }

            switch (alt128) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:464:7: e= brackettedExpression
                    {
                    pushFollow(FOLLOW_brackettedExpression_in_primaryExpression5766);
                    e=brackettedExpression();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 464:30: -> primaryExpression(brackettedExpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("primaryExpression",new STAttrMap().put("brackettedExpression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:465:7: c= builtInCall
                    {
                    pushFollow(FOLLOW_builtInCall_in_primaryExpression5786);
                    c=builtInCall();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 465:21: -> primaryExpression(builtInCall=$c.st)
                    {
                        retval.st = templateLib.getInstanceOf("primaryExpression",new STAttrMap().put("builtInCall", (c!=null?c.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:466:7: i= iriRefOrFunction
                    {
                    pushFollow(FOLLOW_iriRefOrFunction_in_primaryExpression5806);
                    i=iriRefOrFunction();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 466:26: -> primaryExpression(iriRefOrFunction=$i.st)
                    {
                        retval.st = templateLib.getInstanceOf("primaryExpression",new STAttrMap().put("iriRefOrFunction", (i!=null?i.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:467:7: r= rdfLiteral
                    {
                    pushFollow(FOLLOW_rdfLiteral_in_primaryExpression5826);
                    r=rdfLiteral();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 467:20: -> primaryExpression(rdfLiteral=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("primaryExpression",new STAttrMap().put("rdfLiteral", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:468:7: n= numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_primaryExpression5845);
                    n=numericLiteral();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 468:25: -> primaryExpression(numericLiteral=$n.st)
                    {
                        retval.st = templateLib.getInstanceOf("primaryExpression",new STAttrMap().put("numericLiteral", (n!=null?n.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:469:7: b= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression5865);
                    b=booleanLiteral();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 469:24: -> primaryExpression(booleanLiteral=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("primaryExpression",new STAttrMap().put("booleanLiteral", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:470:7: v= var
                    {
                    pushFollow(FOLLOW_var_in_primaryExpression5885);
                    v=var();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 470:13: -> primaryExpression(var=$v.st)
                    {
                        retval.st = templateLib.getInstanceOf("primaryExpression",new STAttrMap().put("var", (v!=null?v.st:null)));
                    }



                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:471:7: a= aggregate
                    {
                    pushFollow(FOLLOW_aggregate_in_primaryExpression5905);
                    a=aggregate();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 471:19: -> primaryExpression(aggregate=$a.st)
                    {
                        retval.st = templateLib.getInstanceOf("primaryExpression",new STAttrMap().put("aggregate", (a!=null?a.st:null)));
                    }



                    }
                    break;
                case 9 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:472:7: u= unaryExpression
                    {
                    pushFollow(FOLLOW_unaryExpression_in_primaryExpression5924);
                    u=unaryExpression();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 472:25: -> primaryExpression(unaryExpression=$u.st)
                    {
                        retval.st = templateLib.getInstanceOf("primaryExpression",new STAttrMap().put("unaryExpression", (u!=null?u.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "brackettedExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:475:1: brackettedExpression : ^( BRACKETTED_EXPRESSION e= expression ) -> brackettedExpression(expression=$e.st);
    public final SparqlT.brackettedExpression_return brackettedExpression() throws RecognitionException {
        SparqlT.brackettedExpression_return retval = new SparqlT.brackettedExpression_return();
        retval.start = input.LT(1);


        SparqlT.expression_return e =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:476:5: ( ^( BRACKETTED_EXPRESSION e= expression ) -> brackettedExpression(expression=$e.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:476:7: ^( BRACKETTED_EXPRESSION e= expression )
            {
            match(input,BRACKETTED_EXPRESSION,FOLLOW_BRACKETTED_EXPRESSION_in_brackettedExpression5951); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_brackettedExpression5955);
            e=expression();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 476:45: -> brackettedExpression(expression=$e.st)
            {
                retval.st = templateLib.getInstanceOf("brackettedExpression",new STAttrMap().put("expression", (e!=null?e.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "builtInCall"
    // com\\googlecode\\sparkleg\\SparqlT.g:479:1: builtInCall : ( ^( STR e= expression ) -> builtInCall(type=$STR.textexpression=$e.st)| ^( LANG e= expression ) -> builtInCall(type=$LANG.textexpression=$e.st)| ^( LANGMATCHES (m+= expression )+ ) -> builtInCall(type=$LANGMATCHES.textexpressions=$m)| ^( DATATYPE e= expression ) -> builtInCall(type=$DATATYPE.textexpression=$e.st)| ^( BOUND v= var ) -> builtInCall(type=$BOUND.textvar=$v.st)| ^( IRI e= expression ) -> builtInCall(type=$IRI.textexpression=$e.st)| ^( URI e= expression ) -> builtInCall(type=$URI.textexpression=$e.st)| ^( BNODE e= expression ) -> builtInCall(type=$BNODE.textexpression=$e.st)| BNODE -> builtInCall(type=$BNODE.text)| RAND -> builtInCall(type=$RAND.text)| ^( ABS e= expression ) -> builtInCall(type=$ABS.textexpression=$e.st)| ^( CEIL e= expression ) -> builtInCall(type=$CEIL.textexpression=$e.st)| ^( FLOOR e= expression ) -> builtInCall(type=$FLOOR.textexpression=$e.st)| ^( ROUND e= expression ) -> builtInCall(type=$ROUND.textexpression=$e.st)| ^( CONCAT l= expressionList ) -> builtInCall(type=$CONCAT.textexpressionList=$l.st)|s= subStringExpression -> builtInCall(subStringExpression=$s.st)| ^( STRLEN e= expression ) -> builtInCall(type=$STRLEN.textexpression=$e.st)| ^( UCASE e= expression ) -> builtInCall(type=$UCASE.textexpression=$e.st)| ^( LCASE e= expression ) -> builtInCall(type=$LCASE.textexpression=$e.st)| ^( ENCODE_FOR_URI e= expression ) -> builtInCall(type=$ENCODE_FOR_URI.textexpression=$e.st)| ^( CONTAINS e1= expression e2= expression ) -> builtInCall(type=$CONTAINS.textexpression=$e1.stexpression=$e2.st)| ^( STRSTARTS e1= expression e2= expression ) -> builtInCall(type=$STRSTARTS.textexpression=$e1.stexpression=$e2.st)| ^( STRENDS e1= expression e2= expression ) -> builtInCall(type=$STRENDS.textexpression=$e1.stexpression=$e2.st)| ^( STRBEFORE e1= expression e2= expression ) -> builtInCall(type=$STRBEFORE.textexpression=$e1.stexpression=$e2.st)| ^( STRAFTER e1= expression e2= expression ) -> builtInCall(type=$STRAFTER.textexpression=$e1.stexpression=$e2.st)| ^( REPLACE e1= expression e2= expression e3= expression ) -> builtInCall(type=$REPLACE.textexpression1=$e1.stexpression2=$e2.stexpression3=$e3.st)| ^( YEAR e= expression ) -> builtInCall(type=$YEAR.textexpression=$e.st)| ^( MONTH e= expression ) -> builtInCall(type=$MONTH.textexpression=$e.st)| ^( DAY e= expression ) -> builtInCall(type=$DAY.textexpression=$e.st)| ^( HOURS e= expression ) -> builtInCall(type=$HOURS.textexpression=$e.st)| ^( MINUTES e= expression ) -> builtInCall(type=$MINUTES.textexpression=$e.st)| ^( SECONDS e= expression ) -> builtInCall(type=$SECONDS.textexpression=$e.st)| ^( TIMEZONE e= expression ) -> builtInCall(type=$TIMEZONE.textexpression=$e.st)| ^( TZ e= expression ) -> builtInCall(type=$TZ.textexpression=$e.st)| NOW -> builtInCall(type=$NOW.text)| ^( MD5 e= expression ) -> builtInCall(type=$MD5.textexpression=$e.st)| ^( SHA1 e= expression ) -> builtInCall(type=$SHA1.textexpression=$e.st)| ^( SHA224 e= expression ) -> builtInCall(type=$SHA224.textexpression=$e.st)| ^( SHA256 e= expression ) -> builtInCall(type=$SHA256.textexpression=$e.st)| ^( SHA384 e= expression ) -> builtInCall(type=$SHA384.textexpression=$e.st)| ^( SHA512 e= expression ) -> builtInCall(type=$SHA512.textexpression=$e.st)| ^( COALESCE l= expressionList ) -> builtInCall(type=$COALESCE.textexpressionList=$l.st)| ^( IF e1= expression e2= expression e3= expression ) -> builtInCall(type=$IF.textexpression1=$e1.stexpression2=$e2.stexpression3=$e3.st)| ^( STRLANG e1= expression e2= expression ) -> builtInCall(type=$STRLANG.textexpression1=$e1.stexpression2=$e2.st)| ^( STRDT e1= expression e2= expression ) -> builtInCall(type=$STRDT.textexpression1=$e1.stexpression2=$e2.st)| ^( SAMETERM e1= expression e2= expression ) -> builtInCall(type=$SAMETERM.textexpression1=$e1.stexpression2=$e2.st)| ^( ISIRI e= expression ) -> builtInCall(type=$ISIRI.textexpression=$e.st)| ^( ISURI e= expression ) -> builtInCall(type=$ISURI.textexpression=$e.st)| ^( ISBLANK e= expression ) -> builtInCall(type=$ISBLANK.textexpression=$e.st)| ^( ISLITERAL e= expression ) -> builtInCall(type=$ISLITERAL.textexpression=$e.st)| ^( ISNUMERIC e= expression ) -> builtInCall(type=$ISNUMERIC.textexpression=$e.st)|r= regexExpression -> builtInCall(regexExpression=$r.st)|f= existsFunction -> builtInCall(existsFunction=$f.st)|n= notExistsFunction -> builtInCall(notExistsFunction=$n.st));
    public final SparqlT.builtInCall_return builtInCall() throws RecognitionException {
        SparqlT.builtInCall_return retval = new SparqlT.builtInCall_return();
        retval.start = input.LT(1);


        CommonTree STR46=null;
        CommonTree LANG47=null;
        CommonTree LANGMATCHES48=null;
        CommonTree DATATYPE49=null;
        CommonTree BOUND50=null;
        CommonTree IRI51=null;
        CommonTree URI52=null;
        CommonTree BNODE53=null;
        CommonTree BNODE54=null;
        CommonTree RAND55=null;
        CommonTree ABS56=null;
        CommonTree CEIL57=null;
        CommonTree FLOOR58=null;
        CommonTree ROUND59=null;
        CommonTree CONCAT60=null;
        CommonTree STRLEN61=null;
        CommonTree UCASE62=null;
        CommonTree LCASE63=null;
        CommonTree ENCODE_FOR_URI64=null;
        CommonTree CONTAINS65=null;
        CommonTree STRSTARTS66=null;
        CommonTree STRENDS67=null;
        CommonTree STRBEFORE68=null;
        CommonTree STRAFTER69=null;
        CommonTree REPLACE70=null;
        CommonTree YEAR71=null;
        CommonTree MONTH72=null;
        CommonTree DAY73=null;
        CommonTree HOURS74=null;
        CommonTree MINUTES75=null;
        CommonTree SECONDS76=null;
        CommonTree TIMEZONE77=null;
        CommonTree TZ78=null;
        CommonTree NOW79=null;
        CommonTree MD580=null;
        CommonTree SHA181=null;
        CommonTree SHA22482=null;
        CommonTree SHA25683=null;
        CommonTree SHA38484=null;
        CommonTree SHA51285=null;
        CommonTree COALESCE86=null;
        CommonTree IF87=null;
        CommonTree STRLANG88=null;
        CommonTree STRDT89=null;
        CommonTree SAMETERM90=null;
        CommonTree ISIRI91=null;
        CommonTree ISURI92=null;
        CommonTree ISBLANK93=null;
        CommonTree ISLITERAL94=null;
        CommonTree ISNUMERIC95=null;
        List list_m=null;
        SparqlT.expression_return e =null;

        SparqlT.var_return v =null;

        SparqlT.expressionList_return l =null;

        SparqlT.subStringExpression_return s =null;

        SparqlT.expression_return e1 =null;

        SparqlT.expression_return e2 =null;

        SparqlT.expression_return e3 =null;

        SparqlT.regexExpression_return r =null;

        SparqlT.existsFunction_return f =null;

        SparqlT.notExistsFunction_return n =null;

        RuleReturnScope m = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:480:5: ( ^( STR e= expression ) -> builtInCall(type=$STR.textexpression=$e.st)| ^( LANG e= expression ) -> builtInCall(type=$LANG.textexpression=$e.st)| ^( LANGMATCHES (m+= expression )+ ) -> builtInCall(type=$LANGMATCHES.textexpressions=$m)| ^( DATATYPE e= expression ) -> builtInCall(type=$DATATYPE.textexpression=$e.st)| ^( BOUND v= var ) -> builtInCall(type=$BOUND.textvar=$v.st)| ^( IRI e= expression ) -> builtInCall(type=$IRI.textexpression=$e.st)| ^( URI e= expression ) -> builtInCall(type=$URI.textexpression=$e.st)| ^( BNODE e= expression ) -> builtInCall(type=$BNODE.textexpression=$e.st)| BNODE -> builtInCall(type=$BNODE.text)| RAND -> builtInCall(type=$RAND.text)| ^( ABS e= expression ) -> builtInCall(type=$ABS.textexpression=$e.st)| ^( CEIL e= expression ) -> builtInCall(type=$CEIL.textexpression=$e.st)| ^( FLOOR e= expression ) -> builtInCall(type=$FLOOR.textexpression=$e.st)| ^( ROUND e= expression ) -> builtInCall(type=$ROUND.textexpression=$e.st)| ^( CONCAT l= expressionList ) -> builtInCall(type=$CONCAT.textexpressionList=$l.st)|s= subStringExpression -> builtInCall(subStringExpression=$s.st)| ^( STRLEN e= expression ) -> builtInCall(type=$STRLEN.textexpression=$e.st)| ^( UCASE e= expression ) -> builtInCall(type=$UCASE.textexpression=$e.st)| ^( LCASE e= expression ) -> builtInCall(type=$LCASE.textexpression=$e.st)| ^( ENCODE_FOR_URI e= expression ) -> builtInCall(type=$ENCODE_FOR_URI.textexpression=$e.st)| ^( CONTAINS e1= expression e2= expression ) -> builtInCall(type=$CONTAINS.textexpression=$e1.stexpression=$e2.st)| ^( STRSTARTS e1= expression e2= expression ) -> builtInCall(type=$STRSTARTS.textexpression=$e1.stexpression=$e2.st)| ^( STRENDS e1= expression e2= expression ) -> builtInCall(type=$STRENDS.textexpression=$e1.stexpression=$e2.st)| ^( STRBEFORE e1= expression e2= expression ) -> builtInCall(type=$STRBEFORE.textexpression=$e1.stexpression=$e2.st)| ^( STRAFTER e1= expression e2= expression ) -> builtInCall(type=$STRAFTER.textexpression=$e1.stexpression=$e2.st)| ^( REPLACE e1= expression e2= expression e3= expression ) -> builtInCall(type=$REPLACE.textexpression1=$e1.stexpression2=$e2.stexpression3=$e3.st)| ^( YEAR e= expression ) -> builtInCall(type=$YEAR.textexpression=$e.st)| ^( MONTH e= expression ) -> builtInCall(type=$MONTH.textexpression=$e.st)| ^( DAY e= expression ) -> builtInCall(type=$DAY.textexpression=$e.st)| ^( HOURS e= expression ) -> builtInCall(type=$HOURS.textexpression=$e.st)| ^( MINUTES e= expression ) -> builtInCall(type=$MINUTES.textexpression=$e.st)| ^( SECONDS e= expression ) -> builtInCall(type=$SECONDS.textexpression=$e.st)| ^( TIMEZONE e= expression ) -> builtInCall(type=$TIMEZONE.textexpression=$e.st)| ^( TZ e= expression ) -> builtInCall(type=$TZ.textexpression=$e.st)| NOW -> builtInCall(type=$NOW.text)| ^( MD5 e= expression ) -> builtInCall(type=$MD5.textexpression=$e.st)| ^( SHA1 e= expression ) -> builtInCall(type=$SHA1.textexpression=$e.st)| ^( SHA224 e= expression ) -> builtInCall(type=$SHA224.textexpression=$e.st)| ^( SHA256 e= expression ) -> builtInCall(type=$SHA256.textexpression=$e.st)| ^( SHA384 e= expression ) -> builtInCall(type=$SHA384.textexpression=$e.st)| ^( SHA512 e= expression ) -> builtInCall(type=$SHA512.textexpression=$e.st)| ^( COALESCE l= expressionList ) -> builtInCall(type=$COALESCE.textexpressionList=$l.st)| ^( IF e1= expression e2= expression e3= expression ) -> builtInCall(type=$IF.textexpression1=$e1.stexpression2=$e2.stexpression3=$e3.st)| ^( STRLANG e1= expression e2= expression ) -> builtInCall(type=$STRLANG.textexpression1=$e1.stexpression2=$e2.st)| ^( STRDT e1= expression e2= expression ) -> builtInCall(type=$STRDT.textexpression1=$e1.stexpression2=$e2.st)| ^( SAMETERM e1= expression e2= expression ) -> builtInCall(type=$SAMETERM.textexpression1=$e1.stexpression2=$e2.st)| ^( ISIRI e= expression ) -> builtInCall(type=$ISIRI.textexpression=$e.st)| ^( ISURI e= expression ) -> builtInCall(type=$ISURI.textexpression=$e.st)| ^( ISBLANK e= expression ) -> builtInCall(type=$ISBLANK.textexpression=$e.st)| ^( ISLITERAL e= expression ) -> builtInCall(type=$ISLITERAL.textexpression=$e.st)| ^( ISNUMERIC e= expression ) -> builtInCall(type=$ISNUMERIC.textexpression=$e.st)|r= regexExpression -> builtInCall(regexExpression=$r.st)|f= existsFunction -> builtInCall(existsFunction=$f.st)|n= notExistsFunction -> builtInCall(notExistsFunction=$n.st))
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
                case BNODE:
                case BOUND:
                case BRACKETTED_EXPRESSION:
                case CEIL:
                case COALESCE:
                case CONCAT:
                case CONTAINS:
                case DATATYPE:
                case DAY:
                case ENCODE_FOR_URI:
                case EXISTS:
                case FLOOR:
                case FUNCTION:
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:480:7: ^( STR e= expression )
                    {
                    STR46=(CommonTree)match(input,STR,FOLLOW_STR_in_builtInCall5983); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall5987);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 480:27: -> builtInCall(type=$STR.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (STR46!=null?STR46.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:481:7: ^( LANG e= expression )
                    {
                    LANG47=(CommonTree)match(input,LANG,FOLLOW_LANG_in_builtInCall6011); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6015);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 481:28: -> builtInCall(type=$LANG.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (LANG47!=null?LANG47.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:482:7: ^( LANGMATCHES (m+= expression )+ )
                    {
                    LANGMATCHES48=(CommonTree)match(input,LANGMATCHES,FOLLOW_LANGMATCHES_in_builtInCall6039); 

                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:482:21: (m+= expression )+
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
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:482:22: m+= expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_builtInCall6044);
                    	    m=expression();

                    	    state._fsp--;

                    	    if (list_m==null) list_m=new ArrayList();
                    	    list_m.add(m.getTemplate());


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


                    // TEMPLATE REWRITE
                    // 482:39: -> builtInCall(type=$LANGMATCHES.textexpressions=$m)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (LANGMATCHES48!=null?LANGMATCHES48.getText():null)).put("expressions", list_m));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:483:7: ^( DATATYPE e= expression )
                    {
                    DATATYPE49=(CommonTree)match(input,DATATYPE,FOLLOW_DATATYPE_in_builtInCall6070); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6074);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 483:32: -> builtInCall(type=$DATATYPE.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (DATATYPE49!=null?DATATYPE49.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:484:7: ^( BOUND v= var )
                    {
                    BOUND50=(CommonTree)match(input,BOUND,FOLLOW_BOUND_in_builtInCall6098); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_var_in_builtInCall6102);
                    v=var();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 484:22: -> builtInCall(type=$BOUND.textvar=$v.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (BOUND50!=null?BOUND50.getText():null)).put("var", (v!=null?v.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:485:7: ^( IRI e= expression )
                    {
                    IRI51=(CommonTree)match(input,IRI,FOLLOW_IRI_in_builtInCall6126); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6130);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 485:27: -> builtInCall(type=$IRI.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (IRI51!=null?IRI51.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:486:7: ^( URI e= expression )
                    {
                    URI52=(CommonTree)match(input,URI,FOLLOW_URI_in_builtInCall6154); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6158);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 486:27: -> builtInCall(type=$URI.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (URI52!=null?URI52.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:487:7: ^( BNODE e= expression )
                    {
                    BNODE53=(CommonTree)match(input,BNODE,FOLLOW_BNODE_in_builtInCall6182); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6186);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 487:29: -> builtInCall(type=$BNODE.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (BNODE53!=null?BNODE53.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 9 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:488:7: BNODE
                    {
                    BNODE54=(CommonTree)match(input,BNODE,FOLLOW_BNODE_in_builtInCall6209); 

                    // TEMPLATE REWRITE
                    // 488:13: -> builtInCall(type=$BNODE.text)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (BNODE54!=null?BNODE54.getText():null)));
                    }



                    }
                    break;
                case 10 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:489:7: RAND
                    {
                    RAND55=(CommonTree)match(input,RAND,FOLLOW_RAND_in_builtInCall6226); 

                    // TEMPLATE REWRITE
                    // 489:12: -> builtInCall(type=$RAND.text)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (RAND55!=null?RAND55.getText():null)));
                    }



                    }
                    break;
                case 11 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:490:7: ^( ABS e= expression )
                    {
                    ABS56=(CommonTree)match(input,ABS,FOLLOW_ABS_in_builtInCall6244); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6248);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 490:27: -> builtInCall(type=$ABS.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (ABS56!=null?ABS56.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 12 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:491:7: ^( CEIL e= expression )
                    {
                    CEIL57=(CommonTree)match(input,CEIL,FOLLOW_CEIL_in_builtInCall6272); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6276);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 491:28: -> builtInCall(type=$CEIL.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (CEIL57!=null?CEIL57.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 13 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:492:7: ^( FLOOR e= expression )
                    {
                    FLOOR58=(CommonTree)match(input,FLOOR,FOLLOW_FLOOR_in_builtInCall6300); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6304);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 492:29: -> builtInCall(type=$FLOOR.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (FLOOR58!=null?FLOOR58.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 14 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:493:7: ^( ROUND e= expression )
                    {
                    ROUND59=(CommonTree)match(input,ROUND,FOLLOW_ROUND_in_builtInCall6328); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6332);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 493:29: -> builtInCall(type=$ROUND.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (ROUND59!=null?ROUND59.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 15 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:494:7: ^( CONCAT l= expressionList )
                    {
                    CONCAT60=(CommonTree)match(input,CONCAT,FOLLOW_CONCAT_in_builtInCall6356); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expressionList_in_builtInCall6360);
                    l=expressionList();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 494:34: -> builtInCall(type=$CONCAT.textexpressionList=$l.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (CONCAT60!=null?CONCAT60.getText():null)).put("expressionList", (l!=null?l.st:null)));
                    }



                    }
                    break;
                case 16 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:495:7: s= subStringExpression
                    {
                    pushFollow(FOLLOW_subStringExpression_in_builtInCall6385);
                    s=subStringExpression();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 495:29: -> builtInCall(subStringExpression=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("subStringExpression", (s!=null?s.st:null)));
                    }



                    }
                    break;
                case 17 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:496:7: ^( STRLEN e= expression )
                    {
                    STRLEN61=(CommonTree)match(input,STRLEN,FOLLOW_STRLEN_in_builtInCall6403); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6407);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 496:30: -> builtInCall(type=$STRLEN.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (STRLEN61!=null?STRLEN61.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 18 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:497:7: ^( UCASE e= expression )
                    {
                    UCASE62=(CommonTree)match(input,UCASE,FOLLOW_UCASE_in_builtInCall6431); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6435);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 497:29: -> builtInCall(type=$UCASE.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (UCASE62!=null?UCASE62.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 19 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:498:7: ^( LCASE e= expression )
                    {
                    LCASE63=(CommonTree)match(input,LCASE,FOLLOW_LCASE_in_builtInCall6459); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6463);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 498:29: -> builtInCall(type=$LCASE.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (LCASE63!=null?LCASE63.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 20 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:499:7: ^( ENCODE_FOR_URI e= expression )
                    {
                    ENCODE_FOR_URI64=(CommonTree)match(input,ENCODE_FOR_URI,FOLLOW_ENCODE_FOR_URI_in_builtInCall6487); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6491);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 499:38: -> builtInCall(type=$ENCODE_FOR_URI.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (ENCODE_FOR_URI64!=null?ENCODE_FOR_URI64.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 21 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:500:7: ^( CONTAINS e1= expression e2= expression )
                    {
                    CONTAINS65=(CommonTree)match(input,CONTAINS,FOLLOW_CONTAINS_in_builtInCall6515); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6519);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_builtInCall6523);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 500:47: -> builtInCall(type=$CONTAINS.textexpression=$e1.stexpression=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (CONTAINS65!=null?CONTAINS65.getText():null)).put("expression", (e1!=null?e1.st:null)).put("expression", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 22 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:501:7: ^( STRSTARTS e1= expression e2= expression )
                    {
                    STRSTARTS66=(CommonTree)match(input,STRSTARTS,FOLLOW_STRSTARTS_in_builtInCall6552); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6556);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_builtInCall6560);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 501:48: -> builtInCall(type=$STRSTARTS.textexpression=$e1.stexpression=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (STRSTARTS66!=null?STRSTARTS66.getText():null)).put("expression", (e1!=null?e1.st:null)).put("expression", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 23 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:502:7: ^( STRENDS e1= expression e2= expression )
                    {
                    STRENDS67=(CommonTree)match(input,STRENDS,FOLLOW_STRENDS_in_builtInCall6589); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6593);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_builtInCall6597);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 502:46: -> builtInCall(type=$STRENDS.textexpression=$e1.stexpression=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (STRENDS67!=null?STRENDS67.getText():null)).put("expression", (e1!=null?e1.st:null)).put("expression", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 24 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:503:7: ^( STRBEFORE e1= expression e2= expression )
                    {
                    STRBEFORE68=(CommonTree)match(input,STRBEFORE,FOLLOW_STRBEFORE_in_builtInCall6626); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6630);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_builtInCall6634);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 503:48: -> builtInCall(type=$STRBEFORE.textexpression=$e1.stexpression=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (STRBEFORE68!=null?STRBEFORE68.getText():null)).put("expression", (e1!=null?e1.st:null)).put("expression", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 25 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:504:7: ^( STRAFTER e1= expression e2= expression )
                    {
                    STRAFTER69=(CommonTree)match(input,STRAFTER,FOLLOW_STRAFTER_in_builtInCall6663); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6667);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_builtInCall6671);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 504:47: -> builtInCall(type=$STRAFTER.textexpression=$e1.stexpression=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (STRAFTER69!=null?STRAFTER69.getText():null)).put("expression", (e1!=null?e1.st:null)).put("expression", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 26 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:505:7: ^( REPLACE e1= expression e2= expression e3= expression )
                    {
                    REPLACE70=(CommonTree)match(input,REPLACE,FOLLOW_REPLACE_in_builtInCall6700); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6704);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_builtInCall6708);
                    e2=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_builtInCall6712);
                    e3=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 505:60: -> builtInCall(type=$REPLACE.textexpression1=$e1.stexpression2=$e2.stexpression3=$e3.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (REPLACE70!=null?REPLACE70.getText():null)).put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)).put("expression3", (e3!=null?e3.st:null)));
                    }



                    }
                    break;
                case 27 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:506:7: ^( YEAR e= expression )
                    {
                    YEAR71=(CommonTree)match(input,YEAR,FOLLOW_YEAR_in_builtInCall6746); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6750);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 506:28: -> builtInCall(type=$YEAR.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (YEAR71!=null?YEAR71.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 28 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:507:7: ^( MONTH e= expression )
                    {
                    MONTH72=(CommonTree)match(input,MONTH,FOLLOW_MONTH_in_builtInCall6774); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6778);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 507:29: -> builtInCall(type=$MONTH.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (MONTH72!=null?MONTH72.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 29 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:508:7: ^( DAY e= expression )
                    {
                    DAY73=(CommonTree)match(input,DAY,FOLLOW_DAY_in_builtInCall6802); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6806);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 508:27: -> builtInCall(type=$DAY.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (DAY73!=null?DAY73.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 30 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:509:7: ^( HOURS e= expression )
                    {
                    HOURS74=(CommonTree)match(input,HOURS,FOLLOW_HOURS_in_builtInCall6830); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6834);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 509:29: -> builtInCall(type=$HOURS.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (HOURS74!=null?HOURS74.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 31 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:510:7: ^( MINUTES e= expression )
                    {
                    MINUTES75=(CommonTree)match(input,MINUTES,FOLLOW_MINUTES_in_builtInCall6858); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6862);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 510:31: -> builtInCall(type=$MINUTES.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (MINUTES75!=null?MINUTES75.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 32 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:511:7: ^( SECONDS e= expression )
                    {
                    SECONDS76=(CommonTree)match(input,SECONDS,FOLLOW_SECONDS_in_builtInCall6886); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6890);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 511:31: -> builtInCall(type=$SECONDS.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (SECONDS76!=null?SECONDS76.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 33 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:512:7: ^( TIMEZONE e= expression )
                    {
                    TIMEZONE77=(CommonTree)match(input,TIMEZONE,FOLLOW_TIMEZONE_in_builtInCall6914); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6918);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 512:32: -> builtInCall(type=$TIMEZONE.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (TIMEZONE77!=null?TIMEZONE77.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 34 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:513:7: ^( TZ e= expression )
                    {
                    TZ78=(CommonTree)match(input,TZ,FOLLOW_TZ_in_builtInCall6942); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6946);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 513:26: -> builtInCall(type=$TZ.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (TZ78!=null?TZ78.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 35 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:514:7: NOW
                    {
                    NOW79=(CommonTree)match(input,NOW,FOLLOW_NOW_in_builtInCall6969); 

                    // TEMPLATE REWRITE
                    // 514:11: -> builtInCall(type=$NOW.text)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (NOW79!=null?NOW79.getText():null)));
                    }



                    }
                    break;
                case 36 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:515:7: ^( MD5 e= expression )
                    {
                    MD580=(CommonTree)match(input,MD5,FOLLOW_MD5_in_builtInCall6987); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall6991);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 515:27: -> builtInCall(type=$MD5.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (MD580!=null?MD580.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 37 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:516:7: ^( SHA1 e= expression )
                    {
                    SHA181=(CommonTree)match(input,SHA1,FOLLOW_SHA1_in_builtInCall7015); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7019);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 516:28: -> builtInCall(type=$SHA1.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (SHA181!=null?SHA181.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 38 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:517:7: ^( SHA224 e= expression )
                    {
                    SHA22482=(CommonTree)match(input,SHA224,FOLLOW_SHA224_in_builtInCall7043); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7047);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 517:30: -> builtInCall(type=$SHA224.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (SHA22482!=null?SHA22482.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 39 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:518:7: ^( SHA256 e= expression )
                    {
                    SHA25683=(CommonTree)match(input,SHA256,FOLLOW_SHA256_in_builtInCall7071); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7075);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 518:30: -> builtInCall(type=$SHA256.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (SHA25683!=null?SHA25683.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 40 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:519:7: ^( SHA384 e= expression )
                    {
                    SHA38484=(CommonTree)match(input,SHA384,FOLLOW_SHA384_in_builtInCall7099); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7103);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 519:30: -> builtInCall(type=$SHA384.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (SHA38484!=null?SHA38484.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 41 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:520:7: ^( SHA512 e= expression )
                    {
                    SHA51285=(CommonTree)match(input,SHA512,FOLLOW_SHA512_in_builtInCall7127); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7131);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 520:30: -> builtInCall(type=$SHA512.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (SHA51285!=null?SHA51285.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 42 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:521:7: ^( COALESCE l= expressionList )
                    {
                    COALESCE86=(CommonTree)match(input,COALESCE,FOLLOW_COALESCE_in_builtInCall7155); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expressionList_in_builtInCall7159);
                    l=expressionList();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 521:36: -> builtInCall(type=$COALESCE.textexpressionList=$l.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (COALESCE86!=null?COALESCE86.getText():null)).put("expressionList", (l!=null?l.st:null)));
                    }



                    }
                    break;
                case 43 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:522:7: ^( IF e1= expression e2= expression e3= expression )
                    {
                    IF87=(CommonTree)match(input,IF,FOLLOW_IF_in_builtInCall7183); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7187);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_builtInCall7191);
                    e2=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_builtInCall7195);
                    e3=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 522:55: -> builtInCall(type=$IF.textexpression1=$e1.stexpression2=$e2.stexpression3=$e3.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (IF87!=null?IF87.getText():null)).put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)).put("expression3", (e3!=null?e3.st:null)));
                    }



                    }
                    break;
                case 44 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:523:7: ^( STRLANG e1= expression e2= expression )
                    {
                    STRLANG88=(CommonTree)match(input,STRLANG,FOLLOW_STRLANG_in_builtInCall7229); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7233);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_builtInCall7237);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 523:46: -> builtInCall(type=$STRLANG.textexpression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (STRLANG88!=null?STRLANG88.getText():null)).put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 45 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:524:7: ^( STRDT e1= expression e2= expression )
                    {
                    STRDT89=(CommonTree)match(input,STRDT,FOLLOW_STRDT_in_builtInCall7266); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7270);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_builtInCall7274);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 524:44: -> builtInCall(type=$STRDT.textexpression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (STRDT89!=null?STRDT89.getText():null)).put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 46 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:525:7: ^( SAMETERM e1= expression e2= expression )
                    {
                    SAMETERM90=(CommonTree)match(input,SAMETERM,FOLLOW_SAMETERM_in_builtInCall7304); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7308);
                    e1=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_builtInCall7312);
                    e2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 525:47: -> builtInCall(type=$SAMETERM.textexpression1=$e1.stexpression2=$e2.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (SAMETERM90!=null?SAMETERM90.getText():null)).put("expression1", (e1!=null?e1.st:null)).put("expression2", (e2!=null?e2.st:null)));
                    }



                    }
                    break;
                case 47 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:526:7: ^( ISIRI e= expression )
                    {
                    ISIRI91=(CommonTree)match(input,ISIRI,FOLLOW_ISIRI_in_builtInCall7342); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7346);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 526:29: -> builtInCall(type=$ISIRI.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (ISIRI91!=null?ISIRI91.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 48 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:527:7: ^( ISURI e= expression )
                    {
                    ISURI92=(CommonTree)match(input,ISURI,FOLLOW_ISURI_in_builtInCall7370); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7374);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 527:29: -> builtInCall(type=$ISURI.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (ISURI92!=null?ISURI92.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 49 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:528:7: ^( ISBLANK e= expression )
                    {
                    ISBLANK93=(CommonTree)match(input,ISBLANK,FOLLOW_ISBLANK_in_builtInCall7398); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7402);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 528:32: -> builtInCall(type=$ISBLANK.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (ISBLANK93!=null?ISBLANK93.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 50 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:529:7: ^( ISLITERAL e= expression )
                    {
                    ISLITERAL94=(CommonTree)match(input,ISLITERAL,FOLLOW_ISLITERAL_in_builtInCall7427); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7431);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 529:33: -> builtInCall(type=$ISLITERAL.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (ISLITERAL94!=null?ISLITERAL94.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 51 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:530:7: ^( ISNUMERIC e= expression )
                    {
                    ISNUMERIC95=(CommonTree)match(input,ISNUMERIC,FOLLOW_ISNUMERIC_in_builtInCall7455); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_builtInCall7459);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 530:33: -> builtInCall(type=$ISNUMERIC.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("type", (ISNUMERIC95!=null?ISNUMERIC95.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 52 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:531:7: r= regexExpression
                    {
                    pushFollow(FOLLOW_regexExpression_in_builtInCall7484);
                    r=regexExpression();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 531:25: -> builtInCall(regexExpression=$r.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("regexExpression", (r!=null?r.st:null)));
                    }



                    }
                    break;
                case 53 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:532:7: f= existsFunction
                    {
                    pushFollow(FOLLOW_existsFunction_in_builtInCall7503);
                    f=existsFunction();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 532:24: -> builtInCall(existsFunction=$f.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("existsFunction", (f!=null?f.st:null)));
                    }



                    }
                    break;
                case 54 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:533:7: n= notExistsFunction
                    {
                    pushFollow(FOLLOW_notExistsFunction_in_builtInCall7522);
                    n=notExistsFunction();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 533:27: -> builtInCall(notExistsFunction=$n.st)
                    {
                        retval.st = templateLib.getInstanceOf("builtInCall",new STAttrMap().put("notExistsFunction", (n!=null?n.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "regexExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:536:1: regexExpression : ^( REGEX (e+= expression )+ ) -> regexExpression(expression=$e);
    public final SparqlT.regexExpression_return regexExpression() throws RecognitionException {
        SparqlT.regexExpression_return retval = new SparqlT.regexExpression_return();
        retval.start = input.LT(1);


        List list_e=null;
        RuleReturnScope e = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:537:5: ( ^( REGEX (e+= expression )+ ) -> regexExpression(expression=$e))
            // com\\googlecode\\sparkleg\\SparqlT.g:537:7: ^( REGEX (e+= expression )+ )
            {
            match(input,REGEX,FOLLOW_REGEX_in_regexExpression7549); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:537:15: (e+= expression )+
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
            	    // com\\googlecode\\sparkleg\\SparqlT.g:537:16: e+= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_regexExpression7554);
            	    e=expression();

            	    state._fsp--;

            	    if (list_e==null) list_e=new ArrayList();
            	    list_e.add(e.getTemplate());


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


            // TEMPLATE REWRITE
            // 537:33: -> regexExpression(expression=$e)
            {
                retval.st = templateLib.getInstanceOf("regexExpression",new STAttrMap().put("expression", list_e));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "subStringExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:540:1: subStringExpression : ^( SUBSTR (e+= expression )+ ) -> subStringExpression(expression=$e);
    public final SparqlT.subStringExpression_return subStringExpression() throws RecognitionException {
        SparqlT.subStringExpression_return retval = new SparqlT.subStringExpression_return();
        retval.start = input.LT(1);


        List list_e=null;
        RuleReturnScope e = null;
        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:541:5: ( ^( SUBSTR (e+= expression )+ ) -> subStringExpression(expression=$e))
            // com\\googlecode\\sparkleg\\SparqlT.g:541:7: ^( SUBSTR (e+= expression )+ )
            {
            match(input,SUBSTR,FOLLOW_SUBSTR_in_subStringExpression7588); 

            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:541:16: (e+= expression )+
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
            	    // com\\googlecode\\sparkleg\\SparqlT.g:541:17: e+= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_subStringExpression7593);
            	    e=expression();

            	    state._fsp--;

            	    if (list_e==null) list_e=new ArrayList();
            	    list_e.add(e.getTemplate());


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


            // TEMPLATE REWRITE
            // 541:34: -> subStringExpression(expression=$e)
            {
                retval.st = templateLib.getInstanceOf("subStringExpression",new STAttrMap().put("expression", list_e));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "existsFunction"
    // com\\googlecode\\sparkleg\\SparqlT.g:544:1: existsFunction : ^( EXISTS g= groupGraphPattern ) -> existsFunction(groupGraphPattern=$g.st);
    public final SparqlT.existsFunction_return existsFunction() throws RecognitionException {
        SparqlT.existsFunction_return retval = new SparqlT.existsFunction_return();
        retval.start = input.LT(1);


        SparqlT.groupGraphPattern_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:545:5: ( ^( EXISTS g= groupGraphPattern ) -> existsFunction(groupGraphPattern=$g.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:545:7: ^( EXISTS g= groupGraphPattern )
            {
            match(input,EXISTS,FOLLOW_EXISTS_in_existsFunction7627); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_groupGraphPattern_in_existsFunction7631);
            g=groupGraphPattern();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 545:37: -> existsFunction(groupGraphPattern=$g.st)
            {
                retval.st = templateLib.getInstanceOf("existsFunction",new STAttrMap().put("groupGraphPattern", (g!=null?g.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "notExistsFunction"
    // com\\googlecode\\sparkleg\\SparqlT.g:548:1: notExistsFunction : ^( NOT_EXISTS g= groupGraphPattern ) -> notExistsFunction(groupGraphPattern=$g.st);
    public final SparqlT.notExistsFunction_return notExistsFunction() throws RecognitionException {
        SparqlT.notExistsFunction_return retval = new SparqlT.notExistsFunction_return();
        retval.start = input.LT(1);


        SparqlT.groupGraphPattern_return g =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:549:5: ( ^( NOT_EXISTS g= groupGraphPattern ) -> notExistsFunction(groupGraphPattern=$g.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:549:7: ^( NOT_EXISTS g= groupGraphPattern )
            {
            match(input,NOT_EXISTS,FOLLOW_NOT_EXISTS_in_notExistsFunction7659); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_groupGraphPattern_in_notExistsFunction7663);
            g=groupGraphPattern();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 549:41: -> notExistsFunction(groupGraphPattern=$g.st)
            {
                retval.st = templateLib.getInstanceOf("notExistsFunction",new STAttrMap().put("groupGraphPattern", (g!=null?g.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "aggregate"
    // com\\googlecode\\sparkleg\\SparqlT.g:552:1: aggregate : ( ^( COUNT ( DISTINCT )* ( ASTERISK )* (e= expression )* ) -> aggregate(operation=$COUNT.textattribute=$DISTINCT.textwhatever=$ASTERISK.textexpression=$e.st)| ^( SUM ( DISTINCT )* e= expression ) -> aggregate(operation=$SUM.textattribute=$DISTINCT.textexpression=$e.st)| ^( MIN ( DISTINCT )* e= expression ) -> aggregate(operation=$MIN.textattribute=$DISTINCT.textexpression=$e.st)| ^( MAX ( DISTINCT )* e= expression ) -> aggregate(operation=$MAX.textattribute=$DISTINCT.textexpression=$e.st)| ^( AVG ( DISTINCT )* e= expression ) -> aggregate(operation=$AVG.textattribute=$DISTINCT.textexpression=$e.st)| ^( SAMPLE ( DISTINCT )? e= expression ) -> aggregate(operation=$SAMPLE.textattribute=$DISTINCT.textexpression=$e.st)| ^( GROUP_CONCAT ( DISTINCT )* e= expression (s= string )? ) -> aggregate(operation=$GROUP_CONCAT.textattribute=$DISTINCT.textexpression=$e.ststring=$s.st));
    public final SparqlT.aggregate_return aggregate() throws RecognitionException {
        SparqlT.aggregate_return retval = new SparqlT.aggregate_return();
        retval.start = input.LT(1);


        CommonTree COUNT96=null;
        CommonTree DISTINCT97=null;
        CommonTree ASTERISK98=null;
        CommonTree SUM99=null;
        CommonTree DISTINCT100=null;
        CommonTree MIN101=null;
        CommonTree DISTINCT102=null;
        CommonTree MAX103=null;
        CommonTree DISTINCT104=null;
        CommonTree AVG105=null;
        CommonTree DISTINCT106=null;
        CommonTree SAMPLE107=null;
        CommonTree DISTINCT108=null;
        CommonTree GROUP_CONCAT109=null;
        CommonTree DISTINCT110=null;
        SparqlT.expression_return e =null;

        SparqlT.string_return s =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:553:5: ( ^( COUNT ( DISTINCT )* ( ASTERISK )* (e= expression )* ) -> aggregate(operation=$COUNT.textattribute=$DISTINCT.textwhatever=$ASTERISK.textexpression=$e.st)| ^( SUM ( DISTINCT )* e= expression ) -> aggregate(operation=$SUM.textattribute=$DISTINCT.textexpression=$e.st)| ^( MIN ( DISTINCT )* e= expression ) -> aggregate(operation=$MIN.textattribute=$DISTINCT.textexpression=$e.st)| ^( MAX ( DISTINCT )* e= expression ) -> aggregate(operation=$MAX.textattribute=$DISTINCT.textexpression=$e.st)| ^( AVG ( DISTINCT )* e= expression ) -> aggregate(operation=$AVG.textattribute=$DISTINCT.textexpression=$e.st)| ^( SAMPLE ( DISTINCT )? e= expression ) -> aggregate(operation=$SAMPLE.textattribute=$DISTINCT.textexpression=$e.st)| ^( GROUP_CONCAT ( DISTINCT )* e= expression (s= string )? ) -> aggregate(operation=$GROUP_CONCAT.textattribute=$DISTINCT.textexpression=$e.ststring=$s.st))
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:553:7: ^( COUNT ( DISTINCT )* ( ASTERISK )* (e= expression )* )
                    {
                    COUNT96=(CommonTree)match(input,COUNT,FOLLOW_COUNT_in_aggregate7691); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:553:15: ( DISTINCT )*
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
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:553:15: DISTINCT
                        	    {
                        	    DISTINCT97=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7693); 

                        	    }
                        	    break;

                        	default :
                        	    break loop133;
                            }
                        } while (true);


                        // com\\googlecode\\sparkleg\\SparqlT.g:553:25: ( ASTERISK )*
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
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:553:25: ASTERISK
                        	    {
                        	    ASTERISK98=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_aggregate7696); 

                        	    }
                        	    break;

                        	default :
                        	    break loop134;
                            }
                        } while (true);


                        // com\\googlecode\\sparkleg\\SparqlT.g:553:36: (e= expression )*
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
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:553:36: e= expression
                        	    {
                        	    pushFollow(FOLLOW_expression_in_aggregate7701);
                        	    e=expression();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop135;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }


                    // TEMPLATE REWRITE
                    // 553:50: -> aggregate(operation=$COUNT.textattribute=$DISTINCT.textwhatever=$ASTERISK.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("aggregate",new STAttrMap().put("operation", (COUNT96!=null?COUNT96.getText():null)).put("attribute", (DISTINCT97!=null?DISTINCT97.getText():null)).put("whatever", (ASTERISK98!=null?ASTERISK98.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:554:7: ^( SUM ( DISTINCT )* e= expression )
                    {
                    SUM99=(CommonTree)match(input,SUM,FOLLOW_SUM_in_aggregate7736); 

                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:554:13: ( DISTINCT )*
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
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:554:13: DISTINCT
                    	    {
                    	    DISTINCT100=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7738); 

                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);


                    pushFollow(FOLLOW_expression_in_aggregate7743);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 554:37: -> aggregate(operation=$SUM.textattribute=$DISTINCT.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("aggregate",new STAttrMap().put("operation", (SUM99!=null?SUM99.getText():null)).put("attribute", (DISTINCT100!=null?DISTINCT100.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:555:7: ^( MIN ( DISTINCT )* e= expression )
                    {
                    MIN101=(CommonTree)match(input,MIN,FOLLOW_MIN_in_aggregate7772); 

                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:555:13: ( DISTINCT )*
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
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:555:13: DISTINCT
                    	    {
                    	    DISTINCT102=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7774); 

                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);


                    pushFollow(FOLLOW_expression_in_aggregate7779);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 555:37: -> aggregate(operation=$MIN.textattribute=$DISTINCT.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("aggregate",new STAttrMap().put("operation", (MIN101!=null?MIN101.getText():null)).put("attribute", (DISTINCT102!=null?DISTINCT102.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:556:7: ^( MAX ( DISTINCT )* e= expression )
                    {
                    MAX103=(CommonTree)match(input,MAX,FOLLOW_MAX_in_aggregate7808); 

                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:556:13: ( DISTINCT )*
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
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:556:13: DISTINCT
                    	    {
                    	    DISTINCT104=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7810); 

                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);


                    pushFollow(FOLLOW_expression_in_aggregate7815);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 556:37: -> aggregate(operation=$MAX.textattribute=$DISTINCT.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("aggregate",new STAttrMap().put("operation", (MAX103!=null?MAX103.getText():null)).put("attribute", (DISTINCT104!=null?DISTINCT104.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:557:7: ^( AVG ( DISTINCT )* e= expression )
                    {
                    AVG105=(CommonTree)match(input,AVG,FOLLOW_AVG_in_aggregate7844); 

                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:557:13: ( DISTINCT )*
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
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:557:13: DISTINCT
                    	    {
                    	    DISTINCT106=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7846); 

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);


                    pushFollow(FOLLOW_expression_in_aggregate7851);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 557:37: -> aggregate(operation=$AVG.textattribute=$DISTINCT.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("aggregate",new STAttrMap().put("operation", (AVG105!=null?AVG105.getText():null)).put("attribute", (DISTINCT106!=null?DISTINCT106.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:558:7: ^( SAMPLE ( DISTINCT )? e= expression )
                    {
                    SAMPLE107=(CommonTree)match(input,SAMPLE,FOLLOW_SAMPLE_in_aggregate7880); 

                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:558:16: ( DISTINCT )?
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
                            // com\\googlecode\\sparkleg\\SparqlT.g:558:16: DISTINCT
                            {
                            DISTINCT108=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7882); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_expression_in_aggregate7887);
                    e=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 558:40: -> aggregate(operation=$SAMPLE.textattribute=$DISTINCT.textexpression=$e.st)
                    {
                        retval.st = templateLib.getInstanceOf("aggregate",new STAttrMap().put("operation", (SAMPLE107!=null?SAMPLE107.getText():null)).put("attribute", (DISTINCT108!=null?DISTINCT108.getText():null)).put("expression", (e!=null?e.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:559:7: ^( GROUP_CONCAT ( DISTINCT )* e= expression (s= string )? )
                    {
                    GROUP_CONCAT109=(CommonTree)match(input,GROUP_CONCAT,FOLLOW_GROUP_CONCAT_in_aggregate7916); 

                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:559:22: ( DISTINCT )*
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
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:559:22: DISTINCT
                    	    {
                    	    DISTINCT110=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate7918); 

                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);


                    pushFollow(FOLLOW_expression_in_aggregate7923);
                    e=expression();

                    state._fsp--;


                    // com\\googlecode\\sparkleg\\SparqlT.g:559:46: (s= string )?
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
                            // com\\googlecode\\sparkleg\\SparqlT.g:559:46: s= string
                            {
                            pushFollow(FOLLOW_string_in_aggregate7927);
                            s=string();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 559:56: -> aggregate(operation=$GROUP_CONCAT.textattribute=$DISTINCT.textexpression=$e.ststring=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("aggregate",new STAttrMap().put("operation", (GROUP_CONCAT109!=null?GROUP_CONCAT109.getText():null)).put("attribute", (DISTINCT110!=null?DISTINCT110.getText():null)).put("expression", (e!=null?e.st:null)).put("string", (s!=null?s.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "iriRefOrFunction"
    // com\\googlecode\\sparkleg\\SparqlT.g:562:1: iriRefOrFunction : ( ^( FUNCTION f= iriRef ^( ARG_LIST (a= argList ) ) ) -> iriRefOrFunction(iriRef=$f.stargList=$a.st)| ^( FUNCTION f= iriRef ) -> iriRefOrFunction(iriRef=$f.stargList=\"\"));
    public final SparqlT.iriRefOrFunction_return iriRefOrFunction() throws RecognitionException {
        SparqlT.iriRefOrFunction_return retval = new SparqlT.iriRefOrFunction_return();
        retval.start = input.LT(1);


        SparqlT.iriRef_return f =null;

        SparqlT.argList_return a =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:563:5: ( ^( FUNCTION f= iriRef ^( ARG_LIST (a= argList ) ) ) -> iriRefOrFunction(iriRef=$f.stargList=$a.st)| ^( FUNCTION f= iriRef ) -> iriRefOrFunction(iriRef=$f.stargList=\"\"))
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
                                new NoViableAltException("", 144, 5, input);

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
                    // com\\googlecode\\sparkleg\\SparqlT.g:563:7: ^( FUNCTION f= iriRef ^( ARG_LIST (a= argList ) ) )
                    {
                    match(input,FUNCTION,FOLLOW_FUNCTION_in_iriRefOrFunction7975); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_iriRef_in_iriRefOrFunction7979);
                    f=iriRef();

                    state._fsp--;


                    match(input,ARG_LIST,FOLLOW_ARG_LIST_in_iriRefOrFunction7982); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:563:38: (a= argList )
                        // com\\googlecode\\sparkleg\\SparqlT.g:563:39: a= argList
                        {
                        pushFollow(FOLLOW_argList_in_iriRefOrFunction7987);
                        a=argList();

                        state._fsp--;


                        }


                        match(input, Token.UP, null); 
                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 563:52: -> iriRefOrFunction(iriRef=$f.stargList=$a.st)
                    {
                        retval.st = templateLib.getInstanceOf("iriRefOrFunction",new STAttrMap().put("iriRef", (f!=null?f.st:null)).put("argList", (a!=null?a.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:564:7: ^( FUNCTION f= iriRef )
                    {
                    match(input,FUNCTION,FOLLOW_FUNCTION_in_iriRefOrFunction8013); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_iriRef_in_iriRefOrFunction8017);
                    f=iriRef();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 564:28: -> iriRefOrFunction(iriRef=$f.stargList=\"\")
                    {
                        retval.st = templateLib.getInstanceOf("iriRefOrFunction",new STAttrMap().put("iriRef", (f!=null?f.st:null)).put("argList", ""));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "rdfLiteral"
    // com\\googlecode\\sparkleg\\SparqlT.g:567:1: rdfLiteral : s= string ( LANGTAG | ( REFERENCE i= iriRef ) )? -> rdfLiteral(string=$s.stlangTag=$LANGTAG.textiriRef=$i.st);
    public final SparqlT.rdfLiteral_return rdfLiteral() throws RecognitionException {
        SparqlT.rdfLiteral_return retval = new SparqlT.rdfLiteral_return();
        retval.start = input.LT(1);


        CommonTree LANGTAG111=null;
        SparqlT.string_return s =null;

        SparqlT.iriRef_return i =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:568:5: (s= string ( LANGTAG | ( REFERENCE i= iriRef ) )? -> rdfLiteral(string=$s.stlangTag=$LANGTAG.textiriRef=$i.st))
            // com\\googlecode\\sparkleg\\SparqlT.g:568:7: s= string ( LANGTAG | ( REFERENCE i= iriRef ) )?
            {
            pushFollow(FOLLOW_string_in_rdfLiteral8051);
            s=string();

            state._fsp--;


            // com\\googlecode\\sparkleg\\SparqlT.g:568:16: ( LANGTAG | ( REFERENCE i= iriRef ) )?
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:568:17: LANGTAG
                    {
                    LANGTAG111=(CommonTree)match(input,LANGTAG,FOLLOW_LANGTAG_in_rdfLiteral8054); 

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:568:27: ( REFERENCE i= iriRef )
                    {
                    // com\\googlecode\\sparkleg\\SparqlT.g:568:27: ( REFERENCE i= iriRef )
                    // com\\googlecode\\sparkleg\\SparqlT.g:568:28: REFERENCE i= iriRef
                    {
                    match(input,REFERENCE,FOLLOW_REFERENCE_in_rdfLiteral8059); 

                    pushFollow(FOLLOW_iriRef_in_rdfLiteral8063);
                    i=iriRef();

                    state._fsp--;


                    }


                    }
                    break;

            }


            // TEMPLATE REWRITE
            // 568:50: -> rdfLiteral(string=$s.stlangTag=$LANGTAG.textiriRef=$i.st)
            {
                retval.st = templateLib.getInstanceOf("rdfLiteral",new STAttrMap().put("string", (s!=null?s.st:null)).put("langTag", (LANGTAG111!=null?LANGTAG111.getText():null)).put("iriRef", (i!=null?i.st:null)));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "numericLiteral"
    // com\\googlecode\\sparkleg\\SparqlT.g:571:1: numericLiteral : (u= numericLiteralUnsigned -> numericLiteral(numericLiteralUnsigned=$u.st)|p= numericLiteralPositive -> numericLiteral(numericLiteralPositive=$p.st)|n= numericLiteralNegative -> numericLiteral(numericLiteralNegative=$n.st));
    public final SparqlT.numericLiteral_return numericLiteral() throws RecognitionException {
        SparqlT.numericLiteral_return retval = new SparqlT.numericLiteral_return();
        retval.start = input.LT(1);


        SparqlT.numericLiteralUnsigned_return u =null;

        SparqlT.numericLiteralPositive_return p =null;

        SparqlT.numericLiteralNegative_return n =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:572:5: (u= numericLiteralUnsigned -> numericLiteral(numericLiteralUnsigned=$u.st)|p= numericLiteralPositive -> numericLiteral(numericLiteralPositive=$p.st)|n= numericLiteralNegative -> numericLiteral(numericLiteralNegative=$n.st))
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
                    // com\\googlecode\\sparkleg\\SparqlT.g:572:7: u= numericLiteralUnsigned
                    {
                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral8104);
                    u=numericLiteralUnsigned();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 572:32: -> numericLiteral(numericLiteralUnsigned=$u.st)
                    {
                        retval.st = templateLib.getInstanceOf("numericLiteral",new STAttrMap().put("numericLiteralUnsigned", (u!=null?u.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:573:7: p= numericLiteralPositive
                    {
                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral8123);
                    p=numericLiteralPositive();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 573:32: -> numericLiteral(numericLiteralPositive=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("numericLiteral",new STAttrMap().put("numericLiteralPositive", (p!=null?p.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:574:7: n= numericLiteralNegative
                    {
                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral8142);
                    n=numericLiteralNegative();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 574:32: -> numericLiteral(numericLiteralNegative=$n.st)
                    {
                        retval.st = templateLib.getInstanceOf("numericLiteral",new STAttrMap().put("numericLiteralNegative", (n!=null?n.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "numericLiteralUnsigned"
    // com\\googlecode\\sparkleg\\SparqlT.g:577:1: numericLiteralUnsigned : ( INTEGER -> numericLiteralUnsigned(value=$INTEGER.text)| DECIMAL -> numericLiteralUnsigned(value=$DECIMAL.text)| DOUBLE -> numericLiteralUnsigned(value=$DOUBLE.text));
    public final SparqlT.numericLiteralUnsigned_return numericLiteralUnsigned() throws RecognitionException {
        SparqlT.numericLiteralUnsigned_return retval = new SparqlT.numericLiteralUnsigned_return();
        retval.start = input.LT(1);


        CommonTree INTEGER112=null;
        CommonTree DECIMAL113=null;
        CommonTree DOUBLE114=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:578:5: ( INTEGER -> numericLiteralUnsigned(value=$INTEGER.text)| DECIMAL -> numericLiteralUnsigned(value=$DECIMAL.text)| DOUBLE -> numericLiteralUnsigned(value=$DOUBLE.text))
            int alt147=3;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt147=1;
                }
                break;
            case DECIMAL:
                {
                alt147=2;
                }
                break;
            case DOUBLE:
                {
                alt147=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;

            }

            switch (alt147) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:578:7: INTEGER
                    {
                    INTEGER112=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_numericLiteralUnsigned8168); 

                    // TEMPLATE REWRITE
                    // 578:15: -> numericLiteralUnsigned(value=$INTEGER.text)
                    {
                        retval.st = templateLib.getInstanceOf("numericLiteralUnsigned",new STAttrMap().put("value", (INTEGER112!=null?INTEGER112.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:579:7: DECIMAL
                    {
                    DECIMAL113=(CommonTree)match(input,DECIMAL,FOLLOW_DECIMAL_in_numericLiteralUnsigned8185); 

                    // TEMPLATE REWRITE
                    // 579:15: -> numericLiteralUnsigned(value=$DECIMAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("numericLiteralUnsigned",new STAttrMap().put("value", (DECIMAL113!=null?DECIMAL113.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:580:7: DOUBLE
                    {
                    DOUBLE114=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_numericLiteralUnsigned8202); 

                    // TEMPLATE REWRITE
                    // 580:14: -> numericLiteralUnsigned(value=$DOUBLE.text)
                    {
                        retval.st = templateLib.getInstanceOf("numericLiteralUnsigned",new STAttrMap().put("value", (DOUBLE114!=null?DOUBLE114.getText():null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "numericLiteralPositive"
    // com\\googlecode\\sparkleg\\SparqlT.g:583:1: numericLiteralPositive : ( INTEGER_POSITIVE -> numericLiteralPositive(value=$INTEGER_POSITIVE.text)| DECIMAL_POSITIVE -> numericLiteralPositive(value=$DECIMAL_POSITIVE.text)| DOUBLE_POSITIVE -> numericLiteralPositive(value=$DOUBLE_POSITIVE.text));
    public final SparqlT.numericLiteralPositive_return numericLiteralPositive() throws RecognitionException {
        SparqlT.numericLiteralPositive_return retval = new SparqlT.numericLiteralPositive_return();
        retval.start = input.LT(1);


        CommonTree INTEGER_POSITIVE115=null;
        CommonTree DECIMAL_POSITIVE116=null;
        CommonTree DOUBLE_POSITIVE117=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:584:5: ( INTEGER_POSITIVE -> numericLiteralPositive(value=$INTEGER_POSITIVE.text)| DECIMAL_POSITIVE -> numericLiteralPositive(value=$DECIMAL_POSITIVE.text)| DOUBLE_POSITIVE -> numericLiteralPositive(value=$DOUBLE_POSITIVE.text))
            int alt148=3;
            switch ( input.LA(1) ) {
            case INTEGER_POSITIVE:
                {
                alt148=1;
                }
                break;
            case DECIMAL_POSITIVE:
                {
                alt148=2;
                }
                break;
            case DOUBLE_POSITIVE:
                {
                alt148=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;

            }

            switch (alt148) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:584:7: INTEGER_POSITIVE
                    {
                    INTEGER_POSITIVE115=(CommonTree)match(input,INTEGER_POSITIVE,FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive8228); 

                    // TEMPLATE REWRITE
                    // 584:24: -> numericLiteralPositive(value=$INTEGER_POSITIVE.text)
                    {
                        retval.st = templateLib.getInstanceOf("numericLiteralPositive",new STAttrMap().put("value", (INTEGER_POSITIVE115!=null?INTEGER_POSITIVE115.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:585:7: DECIMAL_POSITIVE
                    {
                    DECIMAL_POSITIVE116=(CommonTree)match(input,DECIMAL_POSITIVE,FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive8245); 

                    // TEMPLATE REWRITE
                    // 585:24: -> numericLiteralPositive(value=$DECIMAL_POSITIVE.text)
                    {
                        retval.st = templateLib.getInstanceOf("numericLiteralPositive",new STAttrMap().put("value", (DECIMAL_POSITIVE116!=null?DECIMAL_POSITIVE116.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:586:7: DOUBLE_POSITIVE
                    {
                    DOUBLE_POSITIVE117=(CommonTree)match(input,DOUBLE_POSITIVE,FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive8262); 

                    // TEMPLATE REWRITE
                    // 586:23: -> numericLiteralPositive(value=$DOUBLE_POSITIVE.text)
                    {
                        retval.st = templateLib.getInstanceOf("numericLiteralPositive",new STAttrMap().put("value", (DOUBLE_POSITIVE117!=null?DOUBLE_POSITIVE117.getText():null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "numericLiteralNegative"
    // com\\googlecode\\sparkleg\\SparqlT.g:589:1: numericLiteralNegative : ( INTEGER_NEGATIVE -> numericLiteralNegative(value=$INTEGER_NEGATIVE.text)| DECIMAL_NEGATIVE -> numericLiteralNegative(value=$DECIMAL_NEGATIVE.text)| DOUBLE_NEGATIVE -> numericLiteralNegative(value=$DOUBLE_NEGATIVE.text));
    public final SparqlT.numericLiteralNegative_return numericLiteralNegative() throws RecognitionException {
        SparqlT.numericLiteralNegative_return retval = new SparqlT.numericLiteralNegative_return();
        retval.start = input.LT(1);


        CommonTree INTEGER_NEGATIVE118=null;
        CommonTree DECIMAL_NEGATIVE119=null;
        CommonTree DOUBLE_NEGATIVE120=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:590:5: ( INTEGER_NEGATIVE -> numericLiteralNegative(value=$INTEGER_NEGATIVE.text)| DECIMAL_NEGATIVE -> numericLiteralNegative(value=$DECIMAL_NEGATIVE.text)| DOUBLE_NEGATIVE -> numericLiteralNegative(value=$DOUBLE_NEGATIVE.text))
            int alt149=3;
            switch ( input.LA(1) ) {
            case INTEGER_NEGATIVE:
                {
                alt149=1;
                }
                break;
            case DECIMAL_NEGATIVE:
                {
                alt149=2;
                }
                break;
            case DOUBLE_NEGATIVE:
                {
                alt149=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;

            }

            switch (alt149) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:590:7: INTEGER_NEGATIVE
                    {
                    INTEGER_NEGATIVE118=(CommonTree)match(input,INTEGER_NEGATIVE,FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative8288); 

                    // TEMPLATE REWRITE
                    // 590:24: -> numericLiteralNegative(value=$INTEGER_NEGATIVE.text)
                    {
                        retval.st = templateLib.getInstanceOf("numericLiteralNegative",new STAttrMap().put("value", (INTEGER_NEGATIVE118!=null?INTEGER_NEGATIVE118.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:591:7: DECIMAL_NEGATIVE
                    {
                    DECIMAL_NEGATIVE119=(CommonTree)match(input,DECIMAL_NEGATIVE,FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative8305); 

                    // TEMPLATE REWRITE
                    // 591:24: -> numericLiteralNegative(value=$DECIMAL_NEGATIVE.text)
                    {
                        retval.st = templateLib.getInstanceOf("numericLiteralNegative",new STAttrMap().put("value", (DECIMAL_NEGATIVE119!=null?DECIMAL_NEGATIVE119.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:592:7: DOUBLE_NEGATIVE
                    {
                    DOUBLE_NEGATIVE120=(CommonTree)match(input,DOUBLE_NEGATIVE,FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative8322); 

                    // TEMPLATE REWRITE
                    // 592:23: -> numericLiteralNegative(value=$DOUBLE_NEGATIVE.text)
                    {
                        retval.st = templateLib.getInstanceOf("numericLiteralNegative",new STAttrMap().put("value", (DOUBLE_NEGATIVE120!=null?DOUBLE_NEGATIVE120.getText():null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "booleanLiteral"
    // com\\googlecode\\sparkleg\\SparqlT.g:595:1: booleanLiteral : ( TRUE -> booleanLiteral(value=$TRUE.text)| FALSE -> booleanLiteral(value=$FALSE.text));
    public final SparqlT.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SparqlT.booleanLiteral_return retval = new SparqlT.booleanLiteral_return();
        retval.start = input.LT(1);


        CommonTree TRUE121=null;
        CommonTree FALSE122=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:596:5: ( TRUE -> booleanLiteral(value=$TRUE.text)| FALSE -> booleanLiteral(value=$FALSE.text))
            int alt150=2;
            switch ( input.LA(1) ) {
            case TRUE:
                {
                alt150=1;
                }
                break;
            case FALSE:
                {
                alt150=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;

            }

            switch (alt150) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:596:7: TRUE
                    {
                    TRUE121=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_booleanLiteral8348); 

                    // TEMPLATE REWRITE
                    // 596:12: -> booleanLiteral(value=$TRUE.text)
                    {
                        retval.st = templateLib.getInstanceOf("booleanLiteral",new STAttrMap().put("value", (TRUE121!=null?TRUE121.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:597:7: FALSE
                    {
                    FALSE122=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_booleanLiteral8365); 

                    // TEMPLATE REWRITE
                    // 597:13: -> booleanLiteral(value=$FALSE.text)
                    {
                        retval.st = templateLib.getInstanceOf("booleanLiteral",new STAttrMap().put("value", (FALSE122!=null?FALSE122.getText():null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "string"
    // com\\googlecode\\sparkleg\\SparqlT.g:600:1: string : ( STRING_LITERAL1 -> string(value=$STRING_LITERAL1.text)| STRING_LITERAL2 -> string(value=$STRING_LITERAL2.text)| STRING_LITERAL_LONG1 -> string(value=$STRING_LITERAL_LONG1.text)| STRING_LITERAL_LONG2 -> string(value=$STRING_LITERAL_LONG2.text));
    public final SparqlT.string_return string() throws RecognitionException {
        SparqlT.string_return retval = new SparqlT.string_return();
        retval.start = input.LT(1);


        CommonTree STRING_LITERAL1123=null;
        CommonTree STRING_LITERAL2124=null;
        CommonTree STRING_LITERAL_LONG1125=null;
        CommonTree STRING_LITERAL_LONG2126=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:601:5: ( STRING_LITERAL1 -> string(value=$STRING_LITERAL1.text)| STRING_LITERAL2 -> string(value=$STRING_LITERAL2.text)| STRING_LITERAL_LONG1 -> string(value=$STRING_LITERAL_LONG1.text)| STRING_LITERAL_LONG2 -> string(value=$STRING_LITERAL_LONG2.text))
            int alt151=4;
            switch ( input.LA(1) ) {
            case STRING_LITERAL1:
                {
                alt151=1;
                }
                break;
            case STRING_LITERAL2:
                {
                alt151=2;
                }
                break;
            case STRING_LITERAL_LONG1:
                {
                alt151=3;
                }
                break;
            case STRING_LITERAL_LONG2:
                {
                alt151=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;

            }

            switch (alt151) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:601:7: STRING_LITERAL1
                    {
                    STRING_LITERAL1123=(CommonTree)match(input,STRING_LITERAL1,FOLLOW_STRING_LITERAL1_in_string8391); 

                    // TEMPLATE REWRITE
                    // 601:23: -> string(value=$STRING_LITERAL1.text)
                    {
                        retval.st = templateLib.getInstanceOf("string",new STAttrMap().put("value", (STRING_LITERAL1123!=null?STRING_LITERAL1123.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:602:7: STRING_LITERAL2
                    {
                    STRING_LITERAL2124=(CommonTree)match(input,STRING_LITERAL2,FOLLOW_STRING_LITERAL2_in_string8408); 

                    // TEMPLATE REWRITE
                    // 602:23: -> string(value=$STRING_LITERAL2.text)
                    {
                        retval.st = templateLib.getInstanceOf("string",new STAttrMap().put("value", (STRING_LITERAL2124!=null?STRING_LITERAL2124.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:603:7: STRING_LITERAL_LONG1
                    {
                    STRING_LITERAL_LONG1125=(CommonTree)match(input,STRING_LITERAL_LONG1,FOLLOW_STRING_LITERAL_LONG1_in_string8425); 

                    // TEMPLATE REWRITE
                    // 603:28: -> string(value=$STRING_LITERAL_LONG1.text)
                    {
                        retval.st = templateLib.getInstanceOf("string",new STAttrMap().put("value", (STRING_LITERAL_LONG1125!=null?STRING_LITERAL_LONG1125.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:604:7: STRING_LITERAL_LONG2
                    {
                    STRING_LITERAL_LONG2126=(CommonTree)match(input,STRING_LITERAL_LONG2,FOLLOW_STRING_LITERAL_LONG2_in_string8442); 

                    // TEMPLATE REWRITE
                    // 604:28: -> string(value=$STRING_LITERAL_LONG2.text)
                    {
                        retval.st = templateLib.getInstanceOf("string",new STAttrMap().put("value", (STRING_LITERAL_LONG2126!=null?STRING_LITERAL_LONG2126.getText():null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "iriRef"
    // com\\googlecode\\sparkleg\\SparqlT.g:607:1: iriRef : ( IRI_REF -> iriRef(value=$IRI_REF.text)|p= prefixedName -> iriRef(prefixedName=$p.st));
    public final SparqlT.iriRef_return iriRef() throws RecognitionException {
        SparqlT.iriRef_return retval = new SparqlT.iriRef_return();
        retval.start = input.LT(1);


        CommonTree IRI_REF127=null;
        SparqlT.prefixedName_return p =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:608:5: ( IRI_REF -> iriRef(value=$IRI_REF.text)|p= prefixedName -> iriRef(prefixedName=$p.st))
            int alt152=2;
            switch ( input.LA(1) ) {
            case IRI_REF:
                {
                alt152=1;
                }
                break;
            case PNAME_LN:
            case PNAME_NS:
                {
                alt152=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;

            }

            switch (alt152) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:608:7: IRI_REF
                    {
                    IRI_REF127=(CommonTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef8468); 

                    // TEMPLATE REWRITE
                    // 608:15: -> iriRef(value=$IRI_REF.text)
                    {
                        retval.st = templateLib.getInstanceOf("iriRef",new STAttrMap().put("value", (IRI_REF127!=null?IRI_REF127.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:609:7: p= prefixedName
                    {
                    pushFollow(FOLLOW_prefixedName_in_iriRef8487);
                    p=prefixedName();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 609:22: -> iriRef(prefixedName=$p.st)
                    {
                        retval.st = templateLib.getInstanceOf("iriRef",new STAttrMap().put("prefixedName", (p!=null?p.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "prefixedName"
    // com\\googlecode\\sparkleg\\SparqlT.g:612:1: prefixedName : ( PNAME_LN -> prefixedName(name=$PNAME_LN.text)| PNAME_NS -> prefixedName(name=$PNAME_NS.text));
    public final SparqlT.prefixedName_return prefixedName() throws RecognitionException {
        SparqlT.prefixedName_return retval = new SparqlT.prefixedName_return();
        retval.start = input.LT(1);


        CommonTree PNAME_LN128=null;
        CommonTree PNAME_NS129=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:613:5: ( PNAME_LN -> prefixedName(name=$PNAME_LN.text)| PNAME_NS -> prefixedName(name=$PNAME_NS.text))
            int alt153=2;
            switch ( input.LA(1) ) {
            case PNAME_LN:
                {
                alt153=1;
                }
                break;
            case PNAME_NS:
                {
                alt153=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;

            }

            switch (alt153) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:613:7: PNAME_LN
                    {
                    PNAME_LN128=(CommonTree)match(input,PNAME_LN,FOLLOW_PNAME_LN_in_prefixedName8513); 

                    // TEMPLATE REWRITE
                    // 613:16: -> prefixedName(name=$PNAME_LN.text)
                    {
                        retval.st = templateLib.getInstanceOf("prefixedName",new STAttrMap().put("name", (PNAME_LN128!=null?PNAME_LN128.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:614:7: PNAME_NS
                    {
                    PNAME_NS129=(CommonTree)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixedName8530); 

                    // TEMPLATE REWRITE
                    // 614:16: -> prefixedName(name=$PNAME_NS.text)
                    {
                        retval.st = templateLib.getInstanceOf("prefixedName",new STAttrMap().put("name", (PNAME_NS129!=null?PNAME_NS129.getText():null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "blankNode"
    // com\\googlecode\\sparkleg\\SparqlT.g:617:1: blankNode : ( BLANK_NODE_LABEL -> blankNode(value=$BLANK_NODE_LABEL.text)|a= anon -> blankNode(anon=$a.st));
    public final SparqlT.blankNode_return blankNode() throws RecognitionException {
        SparqlT.blankNode_return retval = new SparqlT.blankNode_return();
        retval.start = input.LT(1);


        CommonTree BLANK_NODE_LABEL130=null;
        SparqlT.anon_return a =null;


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:618:5: ( BLANK_NODE_LABEL -> blankNode(value=$BLANK_NODE_LABEL.text)|a= anon -> blankNode(anon=$a.st))
            int alt154=2;
            switch ( input.LA(1) ) {
            case BLANK_NODE_LABEL:
                {
                alt154=1;
                }
                break;
            case OPEN_SQUARE_BRACKET:
                {
                alt154=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;

            }

            switch (alt154) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:618:7: BLANK_NODE_LABEL
                    {
                    BLANK_NODE_LABEL130=(CommonTree)match(input,BLANK_NODE_LABEL,FOLLOW_BLANK_NODE_LABEL_in_blankNode8556); 

                    // TEMPLATE REWRITE
                    // 618:24: -> blankNode(value=$BLANK_NODE_LABEL.text)
                    {
                        retval.st = templateLib.getInstanceOf("blankNode",new STAttrMap().put("value", (BLANK_NODE_LABEL130!=null?BLANK_NODE_LABEL130.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:619:7: a= anon
                    {
                    pushFollow(FOLLOW_anon_in_blankNode8575);
                    a=anon();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 619:14: -> blankNode(anon=$a.st)
                    {
                        retval.st = templateLib.getInstanceOf("blankNode",new STAttrMap().put("anon", (a!=null?a.st:null)));
                    }



                    }
                    break;

            }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "anon"
    // com\\googlecode\\sparkleg\\SparqlT.g:622:1: anon : OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET -> anon(;
    public final SparqlT.anon_return anon() throws RecognitionException {
        SparqlT.anon_return retval = new SparqlT.anon_return();
        retval.start = input.LT(1);


        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:623:5: ( OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET -> anon()
            // com\\googlecode\\sparkleg\\SparqlT.g:623:7: OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET
            {
            match(input,OPEN_SQUARE_BRACKET,FOLLOW_OPEN_SQUARE_BRACKET_in_anon8601); 

            match(input,CLOSE_SQUARE_BRACKET,FOLLOW_CLOSE_SQUARE_BRACKET_in_anon8603); 

            // TEMPLATE REWRITE
            // 623:48: -> anon(
            {
                retval.st = templateLib.getInstanceOf("anon");
            }



            }

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


 

    public static final BitSet FOLLOW_QUERY_in_query54 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_prologue_in_query58 = new BitSet(new long[]{0x0008001000002008L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectQuery_in_query62 = new BitSet(new long[]{0x0008001000002008L});
    public static final BitSet FOLLOW_constructQuery_in_query67 = new BitSet(new long[]{0x0008000000002008L});
    public static final BitSet FOLLOW_describeQuery_in_query72 = new BitSet(new long[]{0x0000000000002008L});
    public static final BitSet FOLLOW_askQuery_in_query77 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bindingsClause_in_query83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_query127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_update_in_query132 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_PROLOGUE_in_prologue162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_baseDecl_in_prologue167 = new BitSet(new long[]{0x0000000000010008L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_prefixDecl_in_prologue174 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_BASE_in_baseDecl209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IRI_REF_in_baseDecl211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIX_in_prefixDecl239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixDecl241 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IRI_REF_in_prefixDecl243 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_in_selectQuery277 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectClause_in_selectQuery281 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_datasetClause_in_selectQuery286 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_whereClause_in_selectQuery293 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011000L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_solutionModifier_in_selectQuery299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_in_subSelect343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectClause_in_subSelect347 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011000L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_whereClause_in_subSelect352 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011000L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_solutionModifier_in_subSelect359 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause403 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASTERISK_in_selectClause405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause426 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ASTERISK_in_selectClause428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause454 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ASTERISK_in_selectClause456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectVariables_in_selectClause485 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause508 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_selectVariables_in_selectClause513 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause541 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_selectVariables_in_selectClause546 = new BitSet(new long[]{0x0000000000000808L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_VAR_in_selectVariables581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_selectVariables585 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AS_in_selectVariables604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selectVariables608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_var_in_selectVariables612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_in_constructQuery648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constructTemplate_in_constructQuery652 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_datasetClause_in_constructQuery657 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_whereClause_in_constructQuery664 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011000L,0x0000000000000002L});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery670 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_in_constructQuery704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datasetClause_in_constructQuery709 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_whereClause_in_constructQuery716 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011000L,0x0000000000000002L});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeQuery760 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref_in_describeQuery765 = new BitSet(new long[]{0x0000000000004008L,0x0400010008011040L,0x0000000000000602L,0x0000000000004C00L});
    public static final BitSet FOLLOW_ASTERISK_in_describeQuery769 = new BitSet(new long[]{0x0000000000004008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_datasetClause_in_describeQuery775 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011040L,0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_whereClause_in_describeQuery782 = new BitSet(new long[]{0x0000000000000008L,0x0400010000011000L,0x0000000000000002L});
    public static final BitSet FOLLOW_solutionModifier_in_describeQuery788 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASK_in_askQuery836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datasetClause_in_askQuery841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_whereClause_in_askQuery847 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FROM_in_datasetClause880 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAMED_in_datasetClause882 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_datasetClause887 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_CLAUSE_in_whereClause920 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_whereClause925 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupClause_in_solutionModifier961 = new BitSet(new long[]{0x0000000000000002L,0x0400010000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_havingClause_in_solutionModifier968 = new BitSet(new long[]{0x0000000000000002L,0x0400010000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_orderClause_in_solutionModifier975 = new BitSet(new long[]{0x0000000000000002L,0x0400010000000000L});
    public static final BitSet FOLLOW_limitOffsetClauses_in_solutionModifier982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_BY_in_groupClause1027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupCondition_in_groupClause1032 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_GROUP_CONDITION_in_groupCondition1069 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_builtInCall_in_groupCondition1073 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_CONDITION_in_groupCondition1092 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionCall_in_groupCondition1096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_CONDITION_in_groupCondition1115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_groupCondition1119 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AS_in_groupCondition1122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_groupCondition1127 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_CONDITION_in_groupCondition1155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_groupCondition1157 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HAVING_in_havingClause1185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_havingClause1190 = new BitSet(new long[]{0x2000184885C00028L,0x0182882FE40600A1L,0x05387CF82F200000L,0x0000000000020086L});
    public static final BitSet FOLLOW_ORDER_BY_in_orderClause1225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_orderCondition_in_orderClause1230 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ORDER_CONDITION_in_orderCondition1260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASC_in_orderCondition1262 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_brackettedExpression_in_orderCondition1266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDER_CONDITION_in_orderCondition1290 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DESC_in_orderCondition1292 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_brackettedExpression_in_orderCondition1296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDER_CONDITION_in_orderCondition1320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_orderCondition1324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDER_CONDITION_in_orderCondition1343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_orderCondition1347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIMIT_in_limitOffsetClauses1380 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitOffsetClauses1384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OFFSET_in_limitOffsetClauses1389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitOffsetClauses1393 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OFFSET_in_limitOffsetClauses1419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitOffsetClauses1423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIMIT_in_limitOffsetClauses1428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitOffsetClauses1432 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BINDINGS_in_bindingsClause1467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_bindingsClause1472 = new BitSet(new long[]{0x0000000000080008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_bindingValueList_in_bindingsClause1479 = new BitSet(new long[]{0x0000000000080008L});
    public static final BitSet FOLLOW_BINDING_VALUE_in_bindingValueList1518 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bindingValue_in_bindingValueList1523 = new BitSet(new long[]{0x0700E00000000008L,0x0000000008E00008L,0x0007800000000600L,0x0000000000000011L});
    public static final BitSet FOLLOW_iriRef_in_bindingValue1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_bindingValue1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_bindingValue1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_bindingValue1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEF_in_bindingValue1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prologue_in_update1671 = new BitSet(new long[]{0x0802028008000042L,0x0005020000100000L});
    public static final BitSet FOLLOW_load_in_update1675 = new BitSet(new long[]{0x0802028008000042L,0x0005020000100000L});
    public static final BitSet FOLLOW_clear_in_update1680 = new BitSet(new long[]{0x0802028008000042L,0x0005000000100000L});
    public static final BitSet FOLLOW_drop_in_update1685 = new BitSet(new long[]{0x0802028000000042L,0x0005000000100000L});
    public static final BitSet FOLLOW_add_in_update1690 = new BitSet(new long[]{0x0002028000000042L,0x0005000000100000L});
    public static final BitSet FOLLOW_move_in_update1695 = new BitSet(new long[]{0x0002028000000002L,0x0005000000100000L});
    public static final BitSet FOLLOW_copy_in_update1700 = new BitSet(new long[]{0x0002028000000002L,0x0001000000100000L});
    public static final BitSet FOLLOW_create_in_update1705 = new BitSet(new long[]{0x0002020000000002L,0x0001000000100000L});
    public static final BitSet FOLLOW_insert_in_update1710 = new BitSet(new long[]{0x0002000000000002L,0x0001000000100000L});
    public static final BitSet FOLLOW_delete_in_update1715 = new BitSet(new long[]{0x0002000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_modify_in_update1720 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_LOAD_in_load1809 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_load1811 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000020000000600L});
    public static final BitSet FOLLOW_iriRef_in_load1816 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_graphRef_in_load1821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLEAR_in_clear1865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_clear1867 = new BitSet(new long[]{0x0001000000000080L,0x0008000000000100L,0x0000020000000000L});
    public static final BitSet FOLLOW_graphRefAll_in_clear1872 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DROP_in_drop1909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_drop1911 = new BitSet(new long[]{0x0001000000000080L,0x0008000000000100L,0x0000020000000000L});
    public static final BitSet FOLLOW_graphRefAll_in_drop1916 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_in_create1950 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_create1952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000020000000000L});
    public static final BitSet FOLLOW_graphRef_in_create1957 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_add1994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_add1996 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000020000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_add2001 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000000000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_add2005 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVE_in_move2047 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_move2049 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000020000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_move2054 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000000000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_move2058 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COPY_in_copy2100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_copy2102 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000020000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_copy2107 = new BitSet(new long[]{0x0001000000000000L,0x0000000008000100L,0x0000000000000600L});
    public static final BitSet FOLLOW_graphOrDefault_in_copy2111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_in_insert2149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DATA_in_insert2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_insert2155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_delete2189 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_deleteData_in_delete2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteWhere_in_delete2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_deleteData2233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DATA_in_deleteData2235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteData2239 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_deleteWhere2267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WHERE_in_deleteWhere2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteWhere2273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFY_in_modify2305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WITH_in_modify2308 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_modify2310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_deleteClause_in_modify2313 = new BitSet(new long[]{0x0002000000000000L,0x0000000000100000L,0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_insertClause_in_modify2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_usingClause_in_modify2319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_whereClause_in_modify2322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFY_in_modify2332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_deleteClause_in_modify2334 = new BitSet(new long[]{0x0002000000000000L,0x0000000000100000L,0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_insertClause_in_modify2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_usingClause_in_modify2340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004100L});
    public static final BitSet FOLLOW_whereClause_in_modify2343 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_deleteClause2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteClause2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insertClause2399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_insertClause2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_usingClause2430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAMED_in_usingClause2432 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_usingClause2437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFAULT_in_graphOrDefault2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphOrDefault2494 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_graphOrDefault2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphRef2535 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_graphRef2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphRef_in_graphRefAll2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_graphRefAll2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMED_in_graphRefAll2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_graphRefAll2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quads_in_quadPattern2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesTemplate_in_quads2674 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_quadsNotTriples_in_quads2681 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L,0x8000000000000000L});
    public static final BitSet FOLLOW_triplesTemplate_in_quads2686 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_GRAPH_in_quadsNotTriples2731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref_in_quadsNotTriples2735 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_triplesTemplate_in_quadsNotTriples2740 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRIPLES_TEMPLATE_in_triplesTemplate2779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesTemplate2784 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern2819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPatternSub_in_groupGraphPattern2824 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern2844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subSelect_in_groupGraphPattern2848 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern2867 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern2869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSub2900 = new BitSet(new long[]{0x0000000000020002L,0x4000400000008110L,0x0000000400000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_groupGraphPatternSubDetail_in_groupGraphPatternSub2905 = new BitSet(new long[]{0x0000000000020002L,0x4000400000008110L,0x0000000400000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_groupGraphPatternSubDetail_in_groupGraphPatternSub2932 = new BitSet(new long[]{0x0000000000020002L,0x4000400000008110L,0x0000000400000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_groupGraphPatternSubDetail2962 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_DOT_in_groupGraphPatternSubDetail2964 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSubDetail2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubjectPath_in_triplesBlock3008 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionalGraphPattern_in_graphPatternNotTriples3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minusGraphPattern_in_graphPatternNotTriples3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphGraphPattern_in_graphPatternNotTriples3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serviceGraphPattern_in_graphPatternNotTriples3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filter_in_graphPatternNotTriples3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_in_graphPatternNotTriples3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_optionalGraphPattern3183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_optionalGraphPattern3187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAPH_in_graphGraphPattern3215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref_in_graphGraphPattern3219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_graphGraphPattern3223 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SERVICE_in_serviceGraphPattern3256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_serviceGraphPattern3261 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L,0x0000000000000C00L});
    public static final BitSet FOLLOW_varOrIRIref_in_serviceGraphPattern3267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_serviceGraphPattern3271 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIND_in_bind3312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_bind3316 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_AS_in_bind3319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_bind3323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_KEYWORD_in_minusGraphPattern3363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_minusGraphPattern3367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNION_in_groupOrUnionGraphPattern3395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupOrUnionGraphPattern_in_groupOrUnionGraphPattern3400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern3404 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILTER_in_filter3456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_filter3460 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackettedExpression_in_constraint3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_constraint3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_constraint3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionCall3554 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_functionCall3558 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARG_LIST_in_functionCall3561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argList_in_functionCall3565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_nil_in_argList3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTINCT_in_argList3617 = new BitSet(new long[]{0x8640C00000004102L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_argList3623 = new BitSet(new long[]{0x8640C00000004102L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_LIST_in_expressionList3657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expressionList3662 = new BitSet(new long[]{0x8640C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_LIST_in_expressionList3683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nil_in_expressionList3687 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_TRIPLES_in_constructTemplate3717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constructTriples_in_constructTemplate3722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_triplesSameSubject_in_constructTriples3754 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubject3783 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triplesSameSubject3786 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubject3790 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject3795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubject3819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubject3823 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject3828 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_propertyListNotEmptyDetails_in_propertyListNotEmpty3869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PREDICATE_in_propertyListNotEmptyDetails3898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmptyDetails3903 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmptyDetails3907 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OBJECT_in_objectList3942 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_objectList3946 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varOrIRIref_in_verb3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_verb3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_in_verb4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubjectPath4040 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triplesSameSubjectPath4043 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubjectPath4047 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath4052 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubjectPath4076 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubjectPath4080 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath4085 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_in_path4124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pathSequence_in_path4129 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_PATH_SEQUENCE_in_pathSequence4160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence4165 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_INVERSE_in_pathEltOrInverse4198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_pathElt_in_pathEltOrInverse4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathPrimary_in_pathElt4244 = new BitSet(new long[]{0x0000000000004002L,0x1000000000000000L,0x0000000000100100L});
    public static final BitSet FOLLOW_pathMod_in_pathElt4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_pathMod4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_pathMod4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_pathMod4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_pathMod4335 = new BitSet(new long[]{0x0000000200000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod4340 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_COMMA_in_pathMod4345 = new BitSet(new long[]{0x0000000020000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod4354 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_pathMod4368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod4372 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_PRIMARY_in_pathPrimary4422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_pathPrimary4426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_PRIMARY_in_pathPrimary4445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_A_in_pathPrimary4447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_PRIMARY_in_pathPrimary4466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGATION_in_pathPrimary4468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_pathNegatedPropertySet_in_pathPrimary4472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_PRIMARY_in_pathPrimary4496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_path_in_pathPrimary4500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_NEGATED_in_pathNegatedPropertySet4528 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet4533 = new BitSet(new long[]{0x0000000000000018L,0x000000000A000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_INVERSE_in_pathOneInPropertySet4565 = new BitSet(new long[]{0x0000000000000010L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_pathOneInPropertySet4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_pathOneInPropertySet4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_in_triplesNode4614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_triplesNode4619 = new BitSet(new long[]{0x0700E00100300008L,0x2800000008E00008L,0x2007800000000600L,0x0000000000000C01L});
    public static final BitSet FOLLOW_TRIPLES_NODE_in_triplesNode4640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesNode4644 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varOrTerm_in_graphNode4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_graphNode4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_NODE_in_varOrTerm4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIRIref4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_varOrIRIref4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR1_in_var4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR2_in_var4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_graphTerm4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_graphTerm4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_graphTerm4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nil_in_graphTerm4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_nil5007 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_nil5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expression5033 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5037 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5041 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expression5071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5075 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5079 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expression5109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5113 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5117 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expression5149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5153 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5157 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_in_expression5187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5191 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_in_expression5225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5229 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5233 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_expression5263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5267 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5271 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_expression5301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5305 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5309 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_expression5341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5345 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5349 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression5379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_in_expression5381 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5385 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5389 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression5419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5423 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5427 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression5457 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5461 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5465 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_expression5496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5500 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5504 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_expression5534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression5538 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expression5542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_expression5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_expression5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_expression5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNARY_in_unaryExpression5642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGATION_in_unaryExpression5644 = new BitSet(new long[]{0x2700F94885C08020L,0x01829C2FE4E620A9L,0x073FFCF83F200000L,0x0000000000020C8FL});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression5648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_in_unaryExpression5672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression5674 = new BitSet(new long[]{0x2700F94885C08020L,0x01829C2FE4E620A9L,0x073FFCF83F200000L,0x0000000000020C8FL});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression5678 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_in_unaryExpression5702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression5704 = new BitSet(new long[]{0x2700F94885C08020L,0x01829C2FE4E620A9L,0x073FFCF83F200000L,0x0000000000020C8FL});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression5708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_in_unaryExpression5732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression5736 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackettedExpression_in_primaryExpression5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_primaryExpression5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRefOrFunction_in_primaryExpression5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_primaryExpression5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_primaryExpression5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_primaryExpression5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggregate_in_primaryExpression5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_primaryExpression5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BRACKETTED_EXPRESSION_in_brackettedExpression5951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_brackettedExpression5955 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STR_in_builtInCall5983 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall5987 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANG_in_builtInCall6011 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6015 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANGMATCHES_in_builtInCall6039 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6044 = new BitSet(new long[]{0x8640C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_DATATYPE_in_builtInCall6070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_in_builtInCall6098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_builtInCall6102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IRI_in_builtInCall6126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_URI_in_builtInCall6154 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall6182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAND_in_builtInCall6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABS_in_builtInCall6244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CEIL_in_builtInCall6272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOOR_in_builtInCall6300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROUND_in_builtInCall6328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_builtInCall6356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall6360 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_subStringExpression_in_builtInCall6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRLEN_in_builtInCall6403 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6407 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCASE_in_builtInCall6431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LCASE_in_builtInCall6459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6463 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENCODE_FOR_URI_in_builtInCall6487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6491 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTAINS_in_builtInCall6515 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6519 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall6523 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRSTARTS_in_builtInCall6552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6556 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall6560 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRENDS_in_builtInCall6589 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6593 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall6597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRBEFORE_in_builtInCall6626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6630 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall6634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRAFTER_in_builtInCall6663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6667 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall6671 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPLACE_in_builtInCall6700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6704 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall6708 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall6712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_in_builtInCall6746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_in_builtInCall6774 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6778 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_in_builtInCall6802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HOURS_in_builtInCall6830 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6834 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTES_in_builtInCall6858 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6862 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECONDS_in_builtInCall6886 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEZONE_in_builtInCall6914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6918 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TZ_in_builtInCall6942 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6946 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOW_in_builtInCall6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MD5_in_builtInCall6987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall6991 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA1_in_builtInCall7015 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7019 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA224_in_builtInCall7043 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7047 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA256_in_builtInCall7071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7075 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA384_in_builtInCall7099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7103 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA512_in_builtInCall7127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7131 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COALESCE_in_builtInCall7155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall7159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_builtInCall7183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7187 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall7191 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall7195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRLANG_in_builtInCall7229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7233 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall7237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRDT_in_builtInCall7266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7270 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall7274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMETERM_in_builtInCall7304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7308 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_builtInCall7312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISIRI_in_builtInCall7342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISURI_in_builtInCall7370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISBLANK_in_builtInCall7398 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7402 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISLITERAL_in_builtInCall7427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISNUMERIC_in_builtInCall7455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall7459 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_regexExpression_in_builtInCall7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_existsFunction_in_builtInCall7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExistsFunction_in_builtInCall7522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_regexExpression7549 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_regexExpression7554 = new BitSet(new long[]{0x8640C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSTR_in_subStringExpression7588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_subStringExpression7593 = new BitSet(new long[]{0x8640C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_in_existsFunction7627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_existsFunction7631 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EXISTS_in_notExistsFunction7659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_notExistsFunction7663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_aggregate7691 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7693 = new BitSet(new long[]{0x8660C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_aggregate7696 = new BitSet(new long[]{0x8640C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate7701 = new BitSet(new long[]{0x8640C00000004108L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_SUM_in_aggregate7736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7738 = new BitSet(new long[]{0x8660C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate7743 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MIN_in_aggregate7772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7774 = new BitSet(new long[]{0x8660C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate7779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAX_in_aggregate7808 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7810 = new BitSet(new long[]{0x8660C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate7815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVG_in_aggregate7844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7846 = new BitSet(new long[]{0x8660C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate7851 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMPLE_in_aggregate7880 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7882 = new BitSet(new long[]{0x8640C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate7887 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_CONCAT_in_aggregate7916 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate7918 = new BitSet(new long[]{0x8660C00000004100L,0x806020C000C80600L,0x0000000000000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_aggregate7923 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0007800000000000L});
    public static final BitSet FOLLOW_string_in_aggregate7927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_iriRefOrFunction7975 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_iriRefOrFunction7979 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ARG_LIST_in_iriRefOrFunction7982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argList_in_iriRefOrFunction7987 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_iriRefOrFunction8013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_iriRefOrFunction8017 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_string_in_rdfLiteral8051 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LANGTAG_in_rdfLiteral8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCE_in_rdfLiteral8059 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_iriRef_in_rdfLiteral8063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral8142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numericLiteralUnsigned8168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_numericLiteralUnsigned8185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_numericLiteralUnsigned8202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_POSITIVE_in_numericLiteralPositive8228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_POSITIVE_in_numericLiteralPositive8245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_POSITIVE_in_numericLiteralPositive8262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_NEGATIVE_in_numericLiteralNegative8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_NEGATIVE_in_numericLiteralNegative8305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_NEGATIVE_in_numericLiteralNegative8322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleanLiteral8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleanLiteral8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL1_in_string8391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL2_in_string8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG1_in_string8425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_LONG2_in_string8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef8487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PNAME_LN_in_prefixedName8513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixedName8530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_NODE_LABEL_in_blankNode8556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anon_in_blankNode8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_SQUARE_BRACKET_in_anon8601 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_CLOSE_SQUARE_BRACKET_in_anon8603 = new BitSet(new long[]{0x0000000000000002L});

}