
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.stringtemplate.v4.*;

import java.util.List;
import java.util.*;

import com.googlecode.sparkleg.*;

public class SparqlMain {

    public static void main(String args[]) throws Exception {

        System.out.println("Working on file " + args[0]);

        SparqlLexer lex = new SparqlLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        System.out.println("Tokens: -------------------------------");
        System.out.println(tokens.toString());

        List tokenList = tokens.getTokens();

        System.out.println("TokenList: -------------------------------");
        Iterator<CommonToken> it = tokenList.iterator();
        while (it.hasNext()) {
            Token t = it.next();
            System.out.println(t.toString());
        }

        SparqlParser parser = new SparqlParser(tokens);
        parser.setBuildParseTree(true);

        ParserRuleContext<Token> t = parser.query();

        System.out.println("tree: -------------------------------");
        System.out.println(t.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();

        System.out.println("Read StringTemplate Group File: "+"ident.stg"+"-------------------------------");

        STGroup g = new STGroupFile("ident.stg");
        IdentVisitor visitor = new IdentVisitor();
        visitor.setSTGroup(g);
        ST query = visitor.visit(t);

        System.out.println("Emit reformatted query: -------------------------------");
        
        System.out.println(query.render());
        System.out.println("-------------------------------");
    }
}
