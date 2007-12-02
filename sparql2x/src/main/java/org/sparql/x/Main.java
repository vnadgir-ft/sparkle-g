package org.sparql.x;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Main {
	public static void main(String[] args) throws Exception {

		CharStream input = new ANTLRFileStream(args[0]);
		SparqlLexer lexer = new SparqlLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SparqlParser parser = new SparqlParser(tokens);
		SparqlParser.query_return t = parser.query();
		System.out.println("tree="+((Tree)t.tree).toStringTree());
		CommonTreeNodeStream nodes = new CommonTreeNodeStream((Tree)t.tree);
		nodes.setTokenStream(tokens);
		SparqlT walker = new SparqlT(nodes);
		walker.query();
    System.out.flush();
	}
}
