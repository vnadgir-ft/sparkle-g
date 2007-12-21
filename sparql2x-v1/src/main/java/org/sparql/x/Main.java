package org.sparql.x;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;

public class Main {
	public static void main(String[] args) throws Exception {

		CharStream input = new ANTLRFileStream(args[0]);
		SparqlLexer lexer = new SparqlLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SparqlParser parser = new SparqlParser(tokens);
		SparqlParser.query_return t = parser.query();
		System.out.println("tree="+((Tree)t.tree).toStringTree());
		System.out.println("-------------------------------");
		CommonTreeNodeStream nodes = new CommonTreeNodeStream((Tree)t.tree);
		nodes.setTokenStream(tokens);
		SparqlT walker = new SparqlT(nodes);
		StringTemplateGroup templates = new StringTemplateGroup(new FileReader("json.stg"), DefaultTemplateLexer.class);
    walker.setTemplateLib(templates);
    /*
    File out = new File("json.sql");
    walker.setOutput(out);
    */
		RuleReturnScope r = walker.query();
		System.out.println("+++++++++++++++++++++++++++++++");
	  System.out.println(r.getTemplate().toString());
    System.out.flush();
	}
}
