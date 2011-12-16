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

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

import java.io.*;

import java.util.ArrayList;
import java.util.Collection;


/**
 *
 * @author Jürgen
 * 
 * Select all queries from Sparql.testsuite with expected GUnit status OK.
 * The query is processed by the Sparkle Pretty Printer, The resulting
 * re-formatted query is stored in response1.
 * This response1 query is again sent through the Sparkle Printer transformation
 * pipeline. The resulting response2 query is compared to response1. In case
 * of equality the test case is evaluated as succesfull.
 * A stable transformation algorithm should result in no changes when
 * repeatedly applied on the generated output.
 * This behaviour is neccessary but not sufficient, so the three input sequences
 * query, response1 and response2 are written for manual inspection in a log 
 * file.
 */
@RunWith(Parameterized.class)
public class IdentGunitOkTest {

    static char[] data = null;
    static long n = -1;
    static OutputStreamWriter w = null;
    private String query;
    static int qcounter = 0;

    public IdentGunitOkTest(String query) {
        this.query = query;
    }

    private static void loadTestData(final String fileName) throws IOException {
        if (fileName == null) {
            return;
        }
        File f = new File(fileName);
        int size = (int) f.length();
        InputStreamReader isr;
        FileInputStream fis = new FileInputStream(fileName);
        isr = new InputStreamReader(fis, "UTF8");

        try {
            data = new char[size];
            n = isr.read(data);
        } finally {
            isr.close();
        }
    }

    @Parameterized.Parameters
    public static Collection<Object[]> generateParams() {

        final String inFile = "./src/test/java/com/googlecode/sparkleg/Sparql.testsuite";

        try {
            loadTestData(inFile);
        } catch (IOException ex) {
            Logger.getLogger(IdentGunitOkTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /* Match all queries from Sparql.testsuite 
         * Only valid queries are being added to this JUnit testsuite (GUnit status OK). 
         */

        final String REGEX = "(^\\s*<<)(.*?)(>>\\s*(OK|FAIL)\\s*$)";

        Pattern p = Pattern.compile(REGEX, Pattern.MULTILINE | Pattern.DOTALL | Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(new String(data));
        int count = 0;

        ArrayList<Object[]> queries = new ArrayList<Object[]>();

        while (m.find()) {
            count++;
            if (m.group(4).equalsIgnoreCase("OK")) {
                if (!queries.add(new Object[]{m.group(2)})) {
                    System.err.println("Could not add " + count + " to queries!!!");
                }
            }
        }

        return queries;
    }

    @BeforeClass
    public static void setUpClass() throws FileNotFoundException {
        String outFile = "./src/test/java/com/googlecode/sparkleg/formatter.log";
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

    @Test
    public void formatter() {
        try {
            qcounter++;
            w.write("\n#~~~Input " + qcounter + " :\n");
            w.write(query);

            try {
                String response1 = sparklegPrettyPrinter(this.query);
                String response2 = sparklegPrettyPrinter(response1);

                w.write("\n#+++Response 1:\n");
                w.write(response1);
                w.write("\n#---Response 2\n");
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
