package com.googlecode.sparkleg;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;


/**
 *
 * @author Jürgen
 */
public class IdentTest {

    public IdentTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test1() {
        try {
            String query = "PREFIX foaf: <http://xmlns.com/foaf/0.1/> SELECT ?name ?mbox WHERE  { ?x foaf:name ?name . ?x foaf:mbox ?mbox . }";

            String response1 = sparklegPrettyPrinter(query);
            String response2 = sparklegPrettyPrinter(response1);

            assertEquals("The formatted queries should be equal - ", response1, response2);
        } catch (Exception ex) {
            Logger.getLogger(IdentTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void test2() {
        try {
            String query = "PREFIX foaf: <http://xmlns.com/foaf/0.1/> SELECT ?name ?mbox WHERE  { { ?x foaf:name ?name . } { ?x foaf:mbox ?mbox . } }";

            String response1 = sparklegPrettyPrinter(query);
            String response2 = sparklegPrettyPrinter(response1);

            assertEquals("The formatted queries should be equal - ", response1, response2);
        } catch (Exception ex) {
            Logger.getLogger(IdentTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void test3() {
        try {
            String query = "SELECT ?x WHERE {}";

            String response1 = sparklegPrettyPrinter(query);
            String response2 = sparklegPrettyPrinter(response1);

            assertEquals("The formatted queries should be equal - ", response1, response2);
        } catch (Exception ex) {
            Logger.getLogger(IdentTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    @Test
    public void test4() {
        try {
            String query = "PREFIX foaf: <http://xmlns.com/foaf/0.1/> SELECT ?name ?mbox { ?x foaf:name ?name . ?x foaf:mbox ?mbox . FILTER regex(?name, \"Smith\") }";

            String response1 = sparklegPrettyPrinter(query);
            String response2 = sparklegPrettyPrinter(response1);

            assertEquals("The formatted queries should be equal - ", response1, response2);
        } catch (Exception ex) {
            Logger.getLogger(IdentTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
         
    @Test
    public void test5() {
        try {
            String query = "PREFIX foaf: <http://xmlns.com/foaf/0.1/> SELECT ?name ?mbox { FILTER regex(?name, \"Smith\") ?x foaf:name ?name . ?x foaf:mbox ?mbox . }";

            String response1 = sparklegPrettyPrinter(query);
            String response2 = sparklegPrettyPrinter(response1);

            assertEquals("The formatted queries should be equal - ", response1, response2);
        } catch (Exception ex) {
            Logger.getLogger(IdentTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String sparklegPrettyPrinter(String query) throws Exception {

        String stringTemplate = "./ident.stg";
        
        /* transformation pipline
         * step 1: Unicode pre-processing
         * step 2: Lexical analysis
         */
        SparqlLexer lex = new SparqlLexer(new ANTLRUnicodePreprocessorStringStream(query));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        /* transformation pipline
         * step 3: build parse tree
         * step 4: generate AST
         */
        SparqlParser parser = new SparqlParser(tokens);
        SparqlParser.query_return r = parser.query();

        /* transformation pipline
         * step 5: read AST
         * step 6: traverse AST and write output to file
         */
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());
        SparqlT walker = new SparqlT(nodes);

        StringTemplateGroup g = new StringTemplateGroup(new FileReader(stringTemplate), AngleBracketTemplateLexer.class);
        walker.setTemplateLib(g);
        RuleReturnScope t = null;
        try {
            t = walker.query();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

        return t.toString();
    }
}
