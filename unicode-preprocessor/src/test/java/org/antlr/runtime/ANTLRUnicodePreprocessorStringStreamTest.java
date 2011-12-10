/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
public class ANTLRUnicodePreprocessorStringStreamTest {

    public ANTLRUnicodePreprocessorStringStreamTest() {
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
        ANTLRUnicodePreprocessorStringStream up = new ANTLRUnicodePreprocessorStringStream("No Unicode\nno substitution");
        assertEquals("The strings should be equal", up.toString(), "No Unicode\nno substitution");
    }

    @Test
    public void testUnicodeSubstitution() {
        ANTLRUnicodePreprocessorStringStream up = new ANTLRUnicodePreprocessorStringStream("\u0055nicode\ns\u0075bstit\u0075tion");
        assertEquals("The strings should be equal", up.toString(), "Unicode\nsubstitution");
    }
    
    @Test
    public void testIllegalUnicodeSubstitution() {
        ANTLRUnicodePreprocessorStringStream up = new ANTLRUnicodePreprocessorStringStream("Unicode\ns\u00A90ubstitution");
        assertEquals("The strings should be equal", up.toString(), "Unicode\ns©0ubstitution");
    }
    
    @Test
    public void testLegalUnicodeSubstitution() {
        ANTLRUnicodePreprocessorStringStream up = new ANTLRUnicodePreprocessorStringStream("Unicode\ns\uuu00A90ubstitu\uuu00a99tion");
        assertEquals("The strings should be equal", up.toString(), "Unicode\ns©0ubstitu©9tion");
    }
}
