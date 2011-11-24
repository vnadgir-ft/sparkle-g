/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googlecode.sparkleg;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;

import java.io.*;

import difflib.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jürgen
 */
public class IdentTest {

    /**
     * Methods with the annotation ’BeforeClass ’ are executed once before
     * the first of the series of tests . External resources that are used
     * by all tests should be initialised here .
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * Methods with the annotation ’AfterClass ’ are executed once after the
     * last test has been run. Resources used by the tests that need to be
     * released such as streams etc. should be set free here . In our
     * example there is nothing to be done .
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }


    public IdentTest() {
    }

    public void convert(String inFile, String outFile, String stringTemplate) throws Exception {

        SparqlLexer lex = new SparqlLexer(new ANTLRUnicodePreprocessorFileStream(inFile, "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SparqlParser parser = new SparqlParser(tokens);
        SparqlParser.query_return r = parser.query();
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

        OutputStreamWriter w = new OutputStreamWriter(new FileOutputStream(outFile), "UTF8"); 
        w.write(t.toString());
        w.close();
    }

    /**
     * Methods with the annotation ’Test ’ are the actual test methods .
     */
    @Test
    public void doTest(String infile, String outFile, String stringTemplate) {
    	  System.out.println("CONVERT "+ infile + " TO " + outFile + " USING " + stringTemplate);
        try {
            convert(infile, outFile, stringTemplate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String outFile2 = outFile + "2";

        try {
            convert(outFile, outFile2, stringTemplate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(" Testing " + infile, diff(outFile, outFile2));
    }

    // Helper method for get the file content
    private static List<String> fileToLines(String filename) {
        List<String> lines = new LinkedList<String>();
        String line = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(filename)));
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private boolean diff(String inFile1, String inFile2) {

        List<String> original = fileToLines(inFile1);
        List<String> revised = fileToLines(inFile2);

        // Compute diff. Get the Patch object. Patch is the container for computed deltas.
        Patch patch = DiffUtils.diff(original, revised);

        for (Delta delta : patch.getDeltas()) {
            System.out.println(delta);
        }

        return patch.getDeltas().isEmpty();
    }

    public static void main(String[] args) {
        String stringTemplate = args[0];
        System.out.println("Looking for template in: " + stringTemplate);
        String path = new File(args[1]).getAbsolutePath();
        System.out.println("Looking in path: " + path);
        FileFinder ff = new FileFinder();
        List<File> files = ff.find(path, ".rq", ".ru");
        /*System.out.printf( "Found %d file%s%n",
        files.size(), (files.size() == 1 ? "." : "s.") );*/
        IdentTest id = new IdentTest();
        for (File f : files) {
            id.doTest(f.getAbsolutePath(),f.getAbsolutePath()+"1", stringTemplate);
        }
    }
 }
