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
 * Michele Mostarda, 14.12.2007 Added initial implementation of JSONObject.
 *
 */

package org.sparkleg;


import java.util.*;

public class JSONObject {

    /**
     * Mantains a map of the children of the current JSON object.
     */
    private Map<String,List<JSONObject>> children;

    /**
     * Represents a JSON leaf.
     */
    private class JSONLeaf extends JSONObject {

        private String value;

        protected JSONLeaf(String v) {
            value = v;
        }

        public void addElement(String name, JSONObject child) {
            throw new IllegalStateException();
        }

        public void addLeaf(String name, String value) {
            throw  new IllegalStateException();
        }


        public void toJSON(StringBuffer sb, int t) {
            println(sb, "'" + value + "'", t);
        }
    }

    /**
     * Constructor.
     */
    public JSONObject() { }

    /**
     * Adds a child with given name and body.
     *
     * @param name
     * @param child
     */
    public void addElement(String name, JSONObject child) {
        if(children == null) {
            children = new HashMap<String,List<JSONObject>>();
        }
        List l = children.get(name);
        if(l == null) {
            l = new ArrayList();
            children.put(name, l);
        }
        l.add(child);
    }

    /**
     * Adds a leaf to the current node.
     * @param name
     * @param value
     */
    public void addLeaf(String name, String value) {
        addElement(name, new JSONLeaf(value));
    }

    /**
     * Converts the current node to a JSON string.
     * @param sb
     * @param t  tabulation index.
     */
    public void toJSON(StringBuffer sb, int t) {
        if(children == null) {
             println(sb, "{}", t);
            return;
        }

        println(sb, "{", t);
        Iterator<Map.Entry<String, List<JSONObject>>> entries = children.entrySet().iterator();
        Map.Entry<String,List<JSONObject>> entry;
        while(entries.hasNext()) {
            entry = entries.next();
            if( entry instanceof JSONLeaf ) {
                print(sb,"'" + entry.getKey() + "' : ", t);
                if( entry.getValue() != null ) {
                    printArrayString(sb, entry.getValue(), t );
                } else {
                    print(sb,"null", t);    
                }
                print(sb, (entries.hasNext() ? "," : "") , t);
            } else {
                print(sb, "'" + entry.getKey() + "' : ", t);
                printArrayString(sb, entry.getValue(), t + 1);
                print(sb, (entries.hasNext() ? "," : ""), t + 1);
            }
        }
        println(sb, "}", t);
    }

    /**
     * Converts the current node to a JSON string.
     * @param t
     * @return
     */
    public String toJSON(int t) {
        StringBuffer sb = new StringBuffer();
        toJSON(sb, t);
        return sb.toString();
    }

    /**
     * Converts the current node to a JSON string.
     * @return
     */
    public String toJSON() {
        return toJSON(0);
    }

    /**
     * Prints a list of JSON objects as a JSON array.
     * @param sb
     * @param l
     * @param t
     */
    protected void printArrayString(StringBuffer sb, List<JSONObject> l, int t) {
        if(l.size() == 1) {
            l.get(0).toJSON(sb, t);
            return;
        } else {
            println(sb, "[", t);
            Iterator<JSONObject> i = l.iterator();
            while(i.hasNext()) {
                i.next().toJSON(sb,t);
                if(i.hasNext()) {
                    sb.append(",");
                }
            }
            println(sb, "]", t);
        }
    }

    /**
     * Prints a string in the string buffer.
     * @param sb
     * @param s
     * @param t
     */
    protected void print(StringBuffer sb, String s,int t) {
        for(int i = 0; i < t; i++) { sb.append("  "); }
        sb.append(s + "\n");
    }

    protected void println(StringBuffer sb, String s,int t) {
        print(sb, s + '\n', t);
    }

}
