import java.io.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import com.googlecode.sparkleg.*;


public class __Test__ { 

    public static void main(String args[]) throws Exception {
        SparqlLexer lex = new SparqlLexer(new ANTLRFileStream("C:\\Development\\projects\\ws\\sparql11\\sparkle-all\\sparkle-grammar\\src\\main\\antlr3\\com\\googlecode\\sparkleg\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        SparqlParser parser = new SparqlParser(tokens);
        SparqlParser.query_return r = parser.query();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        SparqlT walker = new SparqlT(nodes);
        
        StringTemplateGroup g = new StringTemplateGroup(new FileReader("\\ident.stg"), AngleBracketTemplateLexer.class);
        walker.setTemplateLib(g);
        RuleReturnScope t = null;
        try {
            t = walker.query();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

        System.out.println(t.toString());
        System.out.println("-------------------------------");
   }
}