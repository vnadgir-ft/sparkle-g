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
package org.antlr.runtime;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jürgen
 */
public class SparkleUnicodePreprocessorStringStreamTest {

    public SparkleUnicodePreprocessorStringStreamTest() {
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
    public void testNoSubstitution() {
        SparkleUnicodePreprocessorStringStream up = new SparkleUnicodePreprocessorStringStream("No Unicode\nno substitution");
        assertEquals("The strings should be equal - ", up.toString(), "No Unicode\nno substitution");
    }

    @Test
    public void testUnicodeSubstitution1() {
        SparkleUnicodePreprocessorStringStream up = new SparkleUnicodePreprocessorStringStream("\u0055nicode\ns\u0075bstit\u0075tion");
        assertEquals("The strings should be equal - ", up.toString(), "Unicode\nsubstitution");
    }
    
    @Test
    public void testUnicodeSubstitution2() {
        SparkleUnicodePreprocessorStringStream up = new SparkleUnicodePreprocessorStringStream("Unicode\ns\u00A90ubstitution");
        assertEquals("The strings should be equal - ", up.toString(), "Unicode\ns©0ubstitution");
    }
    
    @Test
    public void testUnicodeSubstitution3() {
        SparkleUnicodePreprocessorStringStream up = new SparkleUnicodePreprocessorStringStream("Unicode\ns\u0001ubstitution");
        assertEquals("The strings should be equal  - ", up.toString(), "Unicode\nsubstitution");
    }
    
    @Test
    public void testUnicodeSubstitution4() {
        /* The transformation into the normalized form \\uxxxx is taken care of by the Java compiler */
        SparkleUnicodePreprocessorStringStream up = new SparkleUnicodePreprocessorStringStream("Unicode\ns\uuu00A90ubstitu\uuu00a99tion");
        assertEquals("The strings should be equal", up.toString(), "Unicode\ns©0ubstitu©9tion");
    }
}
