/*
 * Copyright [2011] [Jürgen Pfundt]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.antlr.runtime;

import java.io.*;

/**
 *
 * @author Jürgen Pfundt
 * 
 * Preprocessor to convert Unicode literals into character values extending
 * ANTLRFileStream.
 * 
 * Part of the SPARQL 1.1 Update ANTLR grammar.
 * 
 */
public class ANTLRUnicodePreprocessorFileStream extends ANTLRFileStream {

    /**
     * 
     * @param fileName
     * @throws IOException
     */
    public ANTLRUnicodePreprocessorFileStream(String fileName) throws IOException {
        super(fileName, null);
    }

    /**
     * 
     * @param fileName
     * @param encoding
     * @throws IOException
     */
    public ANTLRUnicodePreprocessorFileStream(String fileName, String encoding) throws IOException {
        super(fileName, encoding);
    }

    /**
     * 
     * @param fileName
     * @param encoding
     * @throws IOException
     */
    @Override
    public void load(String fileName, String encoding) throws IOException {
        if (fileName == null) {
            return;
        }
        File f = new File(fileName);
        int size = (int) f.length();
        InputStreamReader isr;
        FileInputStream fis = new FileInputStream(fileName);
        if (encoding != null) {
            isr = new InputStreamReader(fis, encoding);
        } else {
            isr = new InputStreamReader(fis);
        }
        try {
            data = new char[size];
            super.n = convertUnicodeLiteralToChar(isr.read(data));
        } finally {
            isr.close();
        }
    }

    /**
     * Finite state automaton for replacing Unicode escape sequences '\\uxxxx' 
     * with character values. Incomplete Unicode escape sequences are written
     * back unchanged in the file stream.
     * Optimizations to avoid write operations lead to MODIFIED_DATA_STATE 
     * and data_buffer_modified. The rationale for deviations from pure doctrine 
     * where to keep the number of status small.
     * In the usual case of no Unicode escape sequences in the data stream 
     * the maxime is to do (nearly) nothing, just loop in the START_STATE.
     * Incomplete Unicode escape sequences are left as found in the file stream. 
     * @param n number of characters read into data buffer
     */
    private int convertUnicodeLiteralToChar(int n) {

        int map[] = new int[128];

        // fill '1' to '9' with nibble values 0001 to 1001
        for (int k = 0x31; k < 0x3A; k++) {
            map[k] = k - 0x30;
        }

        // fill 'a' to 'f' and 'A' to 'F' with nibble values 1010 to 1111
        for (int k = 0x41; k < 0x47; k++) {
            map[k] = k - 0x37;
            map[k + 0x20] = map[k];
        }

        final int START_STATE = 1;
        final int MODIFIED_DATA_STATE = START_STATE + 1;
        final int START_OF_ESCAPE = MODIFIED_DATA_STATE + 1;
        final int UNICODE_NIBBLE1 = START_OF_ESCAPE + 1;
        final int UNICODE_NIBBLE2 = UNICODE_NIBBLE1 + 1;
        final int UNICODE_NIBBLE3 = UNICODE_NIBBLE2 + 1;
        final int UNICODE_NIBBLE4 = UNICODE_NIBBLE3 + 1;

        int state = START_STATE;
        boolean data_buffer_modified = false;

        char u1 = 0, u2 = 0, u3 = 0, c = 0;

        int i = 0;
        int j = 0;

        while (i < n) {
            c = data[i++];
            switch (state) {
                case START_STATE:
                    if (c == '\\') {
                        j = i - 1;
                        state = START_OF_ESCAPE;
                    }
                    break;
                case MODIFIED_DATA_STATE:
                    if (c != '\\') {
                        data[j++] = c;
                    } else {
                        state = START_OF_ESCAPE;
                    }
                    break;
                case START_OF_ESCAPE:
                    if (c != 'u') {
                        if (data_buffer_modified) {
                            data[j++] = '\\';
                            data[j++] = c;
                            state = MODIFIED_DATA_STATE;
                        } else {
                            state = START_STATE;
                        }
                    } else {
                        state = UNICODE_NIBBLE1;
                    }
                    break;
                case UNICODE_NIBBLE1:
                    if (isHexadecimalDigit(c)) {
                        u1 = c;
                        state = UNICODE_NIBBLE2;
                    } else {
                        if (data_buffer_modified) {
                            data[j++] = '\\';
                            data[j++] = 'u';
                            data[j++] = c;
                            state = MODIFIED_DATA_STATE;
                        } else {
                            state = START_STATE;
                        }
                    }
                    break;
                case UNICODE_NIBBLE2:
                    if (isHexadecimalDigit(c)) {
                        u2 = c;
                        state = UNICODE_NIBBLE3;
                    } else {
                        if (data_buffer_modified) {
                            data[j++] = '\\';
                            data[j++] = 'u';
                            data[j++] = u1;
                            data[j++] = c;
                            state = MODIFIED_DATA_STATE;
                        } else {
                            state = START_STATE;
                        }
                    }
                    break;
                case UNICODE_NIBBLE3:
                    if (isHexadecimalDigit(c)) {
                        u3 = c;
                        state = UNICODE_NIBBLE4;
                    } else {
                        if (data_buffer_modified) {
                            data[j++] = '\\';
                            data[j++] = 'u';
                            data[j++] = u1;
                            data[j++] = u2;
                            data[j++] = c;
                            state = MODIFIED_DATA_STATE;
                        } else {
                            state = START_STATE;
                        }
                    }
                    break;
                case UNICODE_NIBBLE4:
                    if (isHexadecimalDigit(c)) {
                        data[j++] = (char) ((((((map[u1] << 4) + map[u2]) << 4) + map[u3]) << 4) + map[c]);
                        if (!data_buffer_modified) {
                            data_buffer_modified = true;
                        }
                        state = MODIFIED_DATA_STATE;
                    } else {
                        if (data_buffer_modified) {
                            data[j++] = '\\';
                            data[j++] = 'u';
                            data[j++] = u1;
                            data[j++] = u2;
                            data[j++] = u3;
                            data[j++] = c;
                            state = MODIFIED_DATA_STATE;
                        } else {
                            state = START_STATE;
                        }
                    }
                    break;
            }
        }
        // afterthoughts
        if (data_buffer_modified) {
            switch (state) {
                case START_OF_ESCAPE:
                    data[j++] = '\\';
                    break;
                case UNICODE_NIBBLE1:
                    data[j++] = '\\';
                    data[j++] = 'u';
                    break;
                case UNICODE_NIBBLE2:
                    data[j++] = '\\';
                    data[j++] = 'u';
                    data[j++] = u1;
                    break;
                case UNICODE_NIBBLE3:
                    data[j++] = '\\';
                    data[j++] = 'u';
                    data[j++] = u1;
                    data[j++] = u2;
                    break;
                case UNICODE_NIBBLE4:
                    data[j++] = '\\';
                    data[j++] = 'u';
                    data[j++] = u1;
                    data[j++] = u2;
                    data[j++] = u3;
                    break;
            }
            n = j;
        }
        return n;
    }

    /**
     * Determines if a character is a legal hexadecimal digit
     * @param c c is a legal hexadecimal digit if:
     *          c is in '0'..'9' or
     *          c is in 'a'..'f' or
     *          c is in 'A'..'F'
     * @return true if c is a hexadecimal digit else false
     */
    private boolean isHexadecimalDigit(char c) {
        return ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'));
    }
}
