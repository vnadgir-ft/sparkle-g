/*
 * Copyright 2007 the original author or authors.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following
 * conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following
 * disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * Neither the name of the author or authors nor the names of its contributors may be used to endorse or promote
 * products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * @author Simone Tripodi   (simone.tripodi)
 * @author Michele Mostarda (michele.mostarda)
 * @author Juergen Pfundt   (Juergen.Pfundt)
 *
 * Michele Mostarda, 14.12.2007 Added initial implementation of Sparql2JSONConverter.
 *
 */

package org.sparkleg;

import org.antlr.runtime.*;
import org.antlr.runtime.debug.BlankDebugEventListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;

/**
 * This is a first implementation of the Sparql To JSON converter.
 * This converter generates a full JSON representation of the Parse Tree.
 * Currenlty this converter is an implementation of the
 * <code>DebugEventListener</code>, so to compile this class you need to
 * activate the debug options in executing the AntLR grammar compilation.
 * Next release will provide an implementation based on the
 * <code>SparqlT.g<code> grammar.
 *
 */
public class Sparql2JSONConverter {

    /**
     * Internal parse event listener.
     */
    public class JSONGenerator extends BlankDebugEventListener {

        /**
         * The stack of JSON objects.
         */
        private Stack<JSONObject> stack;

        /**
         * Constructor.
         */
        public JSONGenerator() {
            stack = new Stack<JSONObject>();
            clear();
        }

        /**
         * Returns the JSON representation of the top element
         * of the stack.
         * @return
         */
        public String getJSON() {
            return stack.peek().toJSON();
        }

        /**
         * Reinitializes the stack.
         */
        public void clear() {
            stack.clear();
            stack.push( new JSONObject() );
        }

        public void enterRule(String string) {
            JSONObject newObject = new JSONObject();
            stack.peek().addElement(string, newObject);
            stack.push(newObject);
        }

        public void exitRule(String string) {
            stack.pop();
        }

        public void terminate() {}

        public void createNode(Object object, Token token) {
            String t = "undef";
            try  {
              t = SparqlParser.tokenNames[ token.getType() ];
              t = t.replaceAll("'", "");
            }catch(Exception e) {}
            stack.peek().addLeaf(t, token.getText());
        }
    }

    /**
     * JSONGenerator single instance.
     */
    private final JSONGenerator jsonGenerator;

    public Sparql2JSONConverter() {
        jsonGenerator = new JSONGenerator();
    }

    private static final String USAGE = "Usage: Sparql2JSONConverter <file.sparql>";

    public static void main(String[] args) throws Exception {
        if( args.length < 1 ) {
            System.out.println(USAGE);
            System.exit(0);
        }

        File f = new File(args[0]);
        if( ! f.exists() ) {
            System.err.println("Cannot find file: " + f);
            System.err.println(USAGE);
            System.exit(1);
        }

        Sparql2JSONConverter converter = new Sparql2JSONConverter();
        System.out.println( converter.parseFile(f) );
        System.exit(0);
    }

    /**
     * Parses a file containing a Sparql query and
     * returns a string containing a JSON object representing the Parse Tree.
     * //TODO: add a link to the formal algorithm used to generate the JSON object.
     * @param file
     * @return
     * @throws IOException
     * @throws RecognitionException
     */
    public String parseFile(File file) throws IOException, RecognitionException {
        FileInputStream fis = new FileInputStream(file);
        ANTLRInputStream inputStream = new ANTLRInputStream(fis);
        return parse(inputStream);
    }

    /**
     * Parses a buffer containing a Sparql query and
     * returns a string containing a JSON object representing the Parse Tree.
     * //TODO: add a link to the formal algorithm used to generate the JSON object.
     * @param sparql
     * @return
     * @throws IOException
     * @throws RecognitionException
     */
    public String parseBuffer(String sparql) throws IOException, RecognitionException {
        ANTLRStringStream stringStream = new ANTLRStringStream(sparql);
        return parse(stringStream);
    }

     protected String parse(CharStream cs) throws RecognitionException {
        SparqlLexer lexer = new SparqlLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // IMPORTANT NOTE: to generate a SparqlParser object accepting
        //                 DebugEventListener TURN ON the debug option.
        jsonGenerator.clear();
        SparqlParser parser = new SparqlParser(tokens, jsonGenerator);
        parser.query();
        return jsonGenerator.getJSON();
    }

}
