/*
Copyright 2007-2011 The sparkle-g Team

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package com.googlecode.sparkleg;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

import java.io.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Jürgen
 * 
 * Select all queries from Sparql.testsuite with expected GUnit status OK.
 * The query is processed by the Sparkle Pretty Printer. The resulting
 * re-formatted query is stored in response1. This response1 query is
 * sent through the Sparkle Printer transformation pipeline, too.
 * The resulting output response2 is compared to the response1. In case
 * of equality the test case is evaluated as successfull.
 * A stable transformation algorithm should result in no changes when
 * repeatedly applied on the generated output.
 * This behaviour is neccessary but not sufficient, for this reason
 * the three data sequences: query, response1 and response2
 * are written for manual inspection in a log file.
 * 
 * The test queries enclosed are not part of the gunit testsuite.
 * This is due to the lack of UTF8 support for GUnit at the moment. 
 */
@RunWith(Parameterized.class)
public class IdentTest {

    static char[] data = null;
    static long n = -1;
    static OutputStreamWriter w = null;
    private String query;
    static int qcounter = 0;

    public IdentTest(String query) {
        this.query = query;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> generateParams() {

        ArrayList<Object[]> queries = new ArrayList<Object[]>();

        String q1 = "# $Id: kanji-01.rq,v 1.3 2005/11/06 08:27:50 eric Exp $\n"
                + "# test kanji QNames\n"
                + "PREFIX foaf: <http://xmlns.com/foaf/0.1/>"
                + "PREFIX 食: <http://www.w3.org/2001/sw/DataAccess/tests/data/i18n/kanji.ttl#>"
                + "SELECT ?name ?food WHERE {"
                + "  [ foaf:name ?name ;"
                + "    食:食べる ?food ] . }"
                + ""
                + "# $Id: kanji-02.rq,v 1.4 2005/11/06 08:27:50 eric Exp $\n"
                + "# test wide spaces\n"
                + "PREFIX foaf: <http://xmlns.com/foaf/0.1/>"
                + "PREFIX 食: <http://www.w3.org/2001/sw/DataAccess/tests/data/i18n/kanji.ttl#>"
                + "SELECT ?name WHERE {"
                + "  [ foaf:name ?name ;"
                + "    食:食べる 食:海老 ] . }";

        String q2 = "# Figure out what happens with normalization form C.\n"
                + "PREFIX foaf: <http://xmlns.com/foaf/0.1/>"
                + "PREFIX HR: <http://www.w3.org/2001/sw/DataAccess/tests/data/i18n/normalization.ttl#>"
                + "SELECT ?name"
                + " WHERE { [ foaf:name ?name; "
                + "           HR:resumé ?resume ] . }";

        String q3 = "# Example 1 from\n"
                + "# http://lists.w3.org/Archives/Public/public-rdf-dawg/2005JulSep/0096\n"
                + "# $Id: normalization-02.rq,v 1.1 2005/08/09 14:35:26 eric Exp $\n"
                + "PREFIX : <http://example/vocab#>"
                + "PREFIX p1: <eXAMPLE://a/./b/../b/%63/%7bfoo%7d#>"
                + ""
                + "SELECT ?S WHERE { ?S :p p1:xyz }";

        String q4 = "# Example 2 from\n"
                + "# http://lists.w3.org/Archives/Public/public-rdf-dawg/2005JulSep/0096\n"
                + "# $Id: normalization-03.rq,v 1.1 2005/08/09 14:35:26 eric Exp $\n"
                + "PREFIX : <http://example/vocab#>"
                + "PREFIX p2: <http://example.com:80/#>"
                + ""
                + "SELECT ?S WHERE { ?S :p p2:abc }";

        String q5 = "PREFIX : <http://example.org/ns#> SELECT * WHERE { [ ?x ?y ] :p [ ?pa ?b ] }";

        String q6 = "PREFIX : <http://example/> SELECT * WHERE { <\u0078> :\u0070 ?xx\u0078 }";

        String q7 = "#Unicode\n"
                + "PREFIX : <http://example/>"
                + "SELECT *"
                + "# Comments can contain \\ u \n"
                + "# <\u0078> :\u0070 ?xx\u0078\n"
                + "WHERE { <\u0078> :\u0070 ?xx\u0078 }";

        String q8 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
                + "PREFIX person: <http://localhost/persons/>"
                + "PREFIX foaf: <http://xmlns.com/foaf/0.1/>"
                + ""
                + "ASK {"
                + "  person:John_Q_Public rdf:type foaf:Person."
                + "}";

        String q9 = "# Just a comment and nothing else\n select * {}";

        queries.add(new Object[]{q1});
        queries.add(new Object[]{q2});
        queries.add(new Object[]{q3});
        queries.add(new Object[]{q4});
        queries.add(new Object[]{q5});
        queries.add(new Object[]{q6});
        queries.add(new Object[]{q7});
        queries.add(new Object[]{q8});
        queries.add(new Object[]{q9});

        return queries;
    }

    @BeforeClass
    public static void setUpClass() throws FileNotFoundException {
        String outFile = "./src/test/java/com/googlecode/sparkleg/syntactic_validator2.log";
        try {
            w = new OutputStreamWriter(new FileOutputStream(outFile), "UTF8");
        } catch (IOException ex) {
            Logger.getLogger(IdentGunitOkTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @AfterClass
    public static void tearDownClass() {
        try {
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(IdentGunitOkTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    public void validate(String query, String methodName) throws IOException {

        w.write("\n#~~~Input " + methodName + " :\n");
        w.write(query);

        try {

            String response1 = sparklegPrettyPrinter(query);
            String response2 = sparklegPrettyPrinter(response1);

            w.write("\n#+++Response 1:\n");
            w.write(response1);
            w.write("\n#---Response 2:\n");
            w.write(response2);

            assertEquals("+++++++++\nInput:\n" + query + "\nResponse:\n", response1, response2);
        } catch (Exception ex) {
            Logger.getLogger(IdentTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void syntacticValidator() {
        try {
            qcounter++;

            System.err.println("\n---Query "+qcounter+" START");

            w.write("\n#~~~Input " + qcounter + " :\n");
            w.write(query);

            try {
                String response1 = sparklegPrettyPrinter(this.query);
                String response2 = sparklegPrettyPrinter(response1);

                w.write("\n#+++Response 1:\n");
                w.write(response1);
                w.write("\n#---Response 2:\n");
                w.write(response2);

                assertEquals("+++++++++\nInput:\n" + query + "\nResponse:\n", response1, response2);
            } catch (Exception ex) {
                Logger.getLogger(IdentGunitOkTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(IdentGunitOkTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String sparklegPrettyPrinter(String query) throws Exception {

        String stringTemplate = "./src/main/antlr3/com/googlecode/sparkleg/ident.stg";

        /* transformation pipline
         * step 1: Unicode pre-processing
         * step 2: Lexical analysis
         */
        SparqlLexer lex = new SparqlLexer(new SparkleUnicodePreprocessorStringStream(query));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        /* transformation pipline
         * step 3: build parse tree
         * step 4: generate AST
         */
        SparqlParser parser = new SparqlParser(tokens);
        SparqlParser.query_return r = parser.query();

        /* transformation pipline
         * step 5: read AST
         * step 6: traverse AST, pass parameters to stringTemplate and write output to string
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
