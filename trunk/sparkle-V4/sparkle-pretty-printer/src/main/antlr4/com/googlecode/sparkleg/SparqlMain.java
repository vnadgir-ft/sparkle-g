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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SparqlMain {

	/**
	 *
	 * @param args
	 */
	public static void main(String args[]) throws Exception {

		System.out.println("Work on file " + args[0]);

		int lineWidth = 80;
		if (args.length >= 2) {
			lineWidth = Integer.parseInt(args[1]);
		}

		SparqlLexer lex = null;
		try {
			lex = new SparqlLexer(new ANTLRFileStream(args[0]));
		} catch (IOException ex) {
			Logger.getLogger(SparqlMain.class.getName()).log(Level.SEVERE, null, ex);
		}
		CommonTokenStream tokens = new CommonTokenStream(lex);

		System.out.println("Tokens: -------------------------------");

		tokens.fill();
		System.out.println("Number of tokens " + tokens.getTokens().size());

		List tokenList = tokens.getTokens();

		System.out.println("TokenList: -------------------------------");
		Iterator it = tokenList.iterator();
		while (it.hasNext()) {
			Token t = (Token) it.next();
			System.out.println(t.toString());
		}
		System.out.flush();

		System.out.println("Input from token list: -------------------------------");

		it = tokenList.iterator();
		while (it.hasNext()) {
			Token t = (Token) it.next();
			if (t.getType() != SparqlParser.EOF) {
				if (t.getType() == SparqlParser.WS || t.getType() == SparqlParser.COMMENT) {
					String s = t.getText();
					s = s.replace("\r\n", "\n");
					if (!System.lineSeparator().equals("\n")) {
						s = s.replace("\n", System.lineSeparator());
					}
					System.out.print(s);
				} else {
					System.out.print(t.getText());
				}
			}
		}
		System.out.flush();

		SparqlParser parser = new SparqlParser(tokens);
		parser.setBuildParseTree(true);
		
		System.out.println("Start parsing: -------------------------------");
		System.out.flush();

		ParserRuleContext t = parser.query();

		System.out.flush();
		System.out.println("Parse tree: -------------------------------");
		System.out.println(t.toStringTree(parser));

		// visualize parse tree in dialog box 
		t.inspect(parser);

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

			System.out.println(query.render(lineWidth));

			System.out.println("Emit original query: -------------------------------");

			String q = query.render(lineWidth);

			/* get common token stream */
			File tmpFile = File.createTempFile("query_", ".rq");
			FileOutputStream fo = new FileOutputStream(tmpFile);
			OutputStreamWriter ow = new OutputStreamWriter(fo, "UTF8");
			ow.write(q);
			ow.close();
			/* transformation pipline
			 * step 1: Unicode pre-processing
			 * step 2: Lexical analysis
			 */
			lex = new SparqlLexer(new ANTLRFileStream(tmpFile.getCanonicalPath(), "UTF8"));
			tokens = new CommonTokenStream(lex);

			List formattedTokenList = tokens.getTokens();

			it = tokenList.iterator();
			Iterator fit = formattedTokenList.iterator();			

			boolean lineSeparatorHasToBeModified = !System.lineSeparator().equals("\n");

			while (it.hasNext()) {
				Token originalToken = (Token) it.next();
				if (originalToken.getType() != SparqlParser.EOF) {
					if (originalToken.getType() == SparqlParser.WS || originalToken.getType() == SparqlParser.COMMENT) {
						String s = originalToken.getText();
						s = s.replace("\r\n", "\n");
						if (lineSeparatorHasToBeModified) {
							s = s.replace("\n", System.lineSeparator());
						}
						System.out.print(s);
					} else {
						System.out.print(originalToken.getText());
					}
				}
			}
			System.out.flush();

		}
		System.out.println("-------------------------------");
		System.out.println("Number of errors encountered: " + parser.getNumberOfSyntaxErrors());
	}
}
