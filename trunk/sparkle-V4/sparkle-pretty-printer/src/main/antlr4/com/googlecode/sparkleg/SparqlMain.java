/*
 *    Copyright 2007-2012 The sparkle-g Team
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
 * @author Simone Tripodi (simone.tripodi)
 * @author Michele Mostarda (michele.mostarda)
 * @author Juergen Pfundt (Juergen.Pfundt)
 * @version $Id: Sparql.g 523 2012-02-17 23:10:57Z Juergen.Pfundt@gmail.com $
 */
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.stringtemplate.v4.*;

import java.util.List;
import java.util.*;

import com.googlecode.sparkleg.*;

public class SparqlMain {

    public static void main(String args[]) throws Exception {

        System.out.println("Work on file " + args[0]);

        SparqlLexer lex = new SparqlLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        System.out.println("Tokens: -------------------------------");
		
		tokens.fill();
		System.out.println("Number of tokens "+tokens.getTokens().size());

        List tokenList = tokens.getTokens();

        System.out.println("TokenList: -------------------------------");
        Iterator it = tokenList.iterator();
        while (it.hasNext()) {
            Token t = (Token) it.next();
            System.out.println(t.toString());
        }
        System.out.flush();

        SparqlParser parser = new SparqlParser(tokens);
        parser.setBuildParseTree(true);

        ParserRuleContext<Token> t = parser.query();

        System.out.flush();
        System.out.println("Parse tree: -------------------------------");
        System.out.println(t.toStringTree(parser));

        // visualize parse tree in dialog box 
        // t.inspect(parser);
		
        if (parser.getNumberOfSyntaxErrors() <= 0) {

            //ParseTreeWalker walker = new ParseTreeWalker();

            String groupFile = "ident.stg";
            if (args.length > 1) {
                groupFile = args[1];
            }
            System.out.println("Read StringTemplate Group File: " + groupFile + "-------------------------------");

            STGroup g = new STGroupFile(groupFile);
            IdentVisitor visitor = new IdentVisitor();
            visitor.setSTGroup(g);
            ST query = visitor.visit(t);

            System.out.println("Emit reformatted query: -------------------------------");

            System.out.println(query.render());
        }
        System.out.println("-------------------------------");
        System.out.println("Number of errors encountered: " + parser.getNumberOfSyntaxErrors());
    }
}
