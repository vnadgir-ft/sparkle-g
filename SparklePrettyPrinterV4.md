#### Table of Content ####



# Introduction #

## SPARKLE-G built on ANLTR V4 ##

### Pretty Printer and Syntactic Validator for the SPARQL 1.1 Query and Update Language ###
The sparkle-g project has released a pretty printer and syntactic validator for the [SPARQL 1.1 Query](http://www.w3.org/TR/sparql11-query/) and
[Update Language](http://www.w3.org/TR/2011/WD-sparql11-update-20110512/) [![](http://sparkle-g.googlecode.com/svn/site/images/sw-sparql-green.png)](http://www.w3.org/2001/sw/DataAccess/). The pretty printer and syntactic validator is based on the [ANTLR](http://antlr.org/) framework for constructing recognizers, interpreters, compilers, and translators. The generation of the formatted output text relies on the [StringTemplate](http://www.stringtemplate.org/) template engine. [ANTLR](http://antlr.org/) and
[StringTemplate](http://www.stringtemplate.org/) have both been crafted by [Terence Parr](http://www.cs.usfca.edu/~parrt/), a professor of computer science at the [University of San Francisco](http://www.cs.usfca.edu/).

The concept of Antlr V4 differs dramatically from its predecessors. The effects of these changes on the Sparkle project result in modifications of the grammar for the SPARQL 1.1 Query and Update Language, the omission of the AST generation and a complete new action interface.
The answer to the question “Why do we need ANTLR V4?” can be found [here](http://www.antlr.org/wiki/pages/viewpage.action?pageId=29130850).

### How to build the Pretty Printer ###
The prerelase uses Ant as build tool. You should have Ant version 1.8 or later installed.
Java 1.6 or later is obligatory.

Download the sparkle-pretty-printer-all-4-1.0.jar from the download page of the sparkle-g project. Unpack the  jar archive in a directory of your choice.

```
jar xvf sparkle-pretty-printer-all-4-1.0.jar
```

Change into the created sparkle-pretty-printer directory and type on the command line:

```
ant all
```

You should see a build progress information somehow like this:

```
Buildfile: /Users/jp/ws/sparql-v4/sparkle-pretty-printer/build.xml

antlr_home:
     [echo] Anltr V4 found in: jar:file:/Users/jp/ws/sparql-v4/sparkle-pretty-printer/lib/antlr4/antlr-4-1.0-complete.jar!/org/antlr/v4/Tool.class

init:
    [mkdir] Created dir: /Users/jp/ws/sparql-v4/sparkle-pretty-printer/target/classes/com/googlecode/sparkleg
    [mkdir] Created dir: /Users/jp/ws/sparql-v4/sparkle-pretty-printer/target/classes/META-INF
    [mkdir] Created dir: /Users/jp/ws/sparql-v4/sparkle-pretty-printer/target/dist
    [mkdir] Created dir: /Users/jp/ws/sparql-v4/sparkle-pretty-printer/target/dist/javadoc/com/googlecode/sparkleg
    [mkdir] Created dir: /Users/jp/ws/sparql-v4/sparkle-pretty-printer/target/test-classes/com/googlecode/sparkleg

clean:

antlr:

compile:
    [javac] Compiling 8 source files to /Users/jp/ws/sparql-v4/sparkle-pretty-printer/target/classes
    [javac] /Users/jp/ws/sparql-v4/sparkle-pretty-printer/src/main/antlr4/com/googlecode/sparkleg/IdentVisitor.java
    [javac] /Users/jp/ws/sparql-v4/sparkle-pretty-printer/src/main/antlr4/com/googlecode/sparkleg/SparqlLexer.java
    [javac] /Users/jp/ws/sparql-v4/sparkle-pretty-printer/src/main/antlr4/com/googlecode/sparkleg/SparqlMain.java
    [javac] /Users/jp/ws/sparql-v4/sparkle-pretty-printer/src/main/antlr4/com/googlecode/sparkleg/SparqlParser.java
    [javac] /Users/jp/ws/sparql-v4/sparkle-pretty-printer/src/main/antlr4/com/googlecode/sparkleg/SparqlParserBaseListener.java
    [javac] /Users/jp/ws/sparql-v4/sparkle-pretty-printer/src/main/antlr4/com/googlecode/sparkleg/SparqlParserBaseVisitor.java
    [javac] /Users/jp/ws/sparql-v4/sparkle-pretty-printer/src/main/antlr4/com/googlecode/sparkleg/SparqlParserListener.java
    [javac] /Users/jp/ws/sparql-v4/sparkle-pretty-printer/src/main/antlr4/com/googlecode/sparkleg/SparqlParserVisitor.java

manifest:

dist:
      [jar] Building jar: /Users/jp/ws/sparql-v4/sparkle-pretty-printer/target/dist/sparql4.jar

doc:
  [javadoc] Generating Javadoc
  [javadoc] Javadoc execution
  [javadoc] Loading source files for package com.googlecode.sparkleg...
  [javadoc] Constructing Javadoc information...
  [javadoc] Standard Doclet version 1.7.0_13
  [javadoc] Building tree for all the packages and classes...
  [javadoc] Building index for all the packages and classes...
  [javadoc] Building index for all classes...

run:
     [echo] running com.googlecode.sparkleg.Main with testfile input.rq

all:

BUILD SUCCESSFUL
Total time: 31 seconds
```

The run task opens a tree view of the example query contained in the input.rq file. Press the OK-Button to close the window.

# Automated Testing #

## Syntax Testing Using JUnit ##

JUnit is used for testing the SPARQL 1.1 syntax as defined in the Sparql.g grammar file. At the moment more than 500 test queries are part of the testsuite.

### Running the JUnit tests ###

```
ant junit
```

The execution of the test cases is logged in TEST-com.googlecode.sparkleg.IdentGunitOKTest.txt.
A detailed evaluation of each test case can be found in target/src/test/java/com/googlecode/sparkleg/syntactic\_validator1.log.

## Grammar Testing ##

A parameterized JUnit test is dynamically set up, which includes all queries from the Sparql.testsuite file with expected GUnit status OK.
```
final String REGEX = "(^\\s*<<)(.*?)(>>\\s*(OK|FAIL)\\s*$)";
```
All queries extracted from the GUnit file are treated as described below:

  1. a test query is processed by the Sparkle Pretty Printer
  1. the output of the transformation process, the re-formatted query is saved as response1
  1. this response1 query is sent through the Sparkle Printer transformation pipeline, too
  1. the resulting output response2 is compared to response1. In case of equality the test case is evaluated as successfull

A stable transformation algorithm should result in no changes when
repeatedly applied on the generated output. This behaviour is neccessary but not sufficient to yield a well formed reformatted query. For this reason the three data sequences: original query, response1 and response2 are written for manual inspection in a log file.

### DAWG Test Data ###

Most of the JUnit test cases are based on the DAWG `data-r2` and `data-sparql11` testsuites. The start of the DAWG test cases is marked in the `Sparql.testsuite` file and the `Sparql.gunit` file with the following disclaimer:

W3C(R) SOFTWARE NOTICE AND LICENSE
[http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231](http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231)

> This work (and included software, documentation such as READMEs, or other related items) is being provided by the copyright holders under the following license. By obtaining, using and/or copying this work, you (the  licensee) agree that you have read, understood, and will comply with the following terms and conditions.

> Permission to copy, modify, and distribute this software and its
> documentation, with or without modification, for any purpose and without fee or royalty is hereby granted, provided that you include the following on ALL copies of the software and documentation or portions thereof, including modifications:

  1. The full text of this NOTICE in a location viewable to users of the redistributed or derivative work.

> 2. Any pre-existing intellectual property disclaimers, notices, or terms and conditions. If none exist, the W3C Software Short Notice should be included (hypertext is preferred, text is permitted) within the body of any redistributed or derivative code.

> 3. Notice of any changes or modifications to the files, including  changes were made. (We recommend you provide URIs to the  location from which the code is derived.)

> THIS SOFTWARE AND DOCUMENTATION IS PROVIDED "AS IS," AND COPYRIGHT HOLDERS MAKE NO REPRESENTATIONS OR WARRANTIES, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO, WARRANTIES OF MERCHANTABILITY OR FITNESS FOR ANY PARTICULAR PURPOSE OR THAT THE USE OF THE SOFTWARE OR DOCUMENTATION WILL NOT INFRINGE ANY THIRD PARTY PATENTS, COPYRIGHTS, TRADEMARKS OR OTHER RIGHTS.

> COPYRIGHT HOLDERS WILL NOT BE LIABLE FOR ANY DIRECT, INDIRECT, SPECIAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF ANY USE OF THE SOFTWARE OR DOCUMENTATION.

> The name and trademarks of copyright holders may NOT be used in advertising or publicity pertaining to the software without specific, written prior permission. Title to copyright in this software and any associated documentation will at all times remain with copyright holders

### SPARQL 1.1 Example Queries ###

Another part of the test queries origin from the SPARQL 1.1 Query Language W3C Working Draft 12 May 2011 http://www.w3.org/TR/sparql11-query/.

The following note signals the start of those queries:
```
/* 
 * The following testcases are taken from the w3.org (http://www.w3.org/TR/sparql11-query/#grammar) SPARQL examples
 */
```
The chapter from which the queries had been taken is noted on top of the first query of a chapter. The example shows two queries from chapter `5.2.3 Group Graph Pattern Examples` followed by queries contained in chapter `6.1 Optional Pattern Matching`

```
// 5.2.3 Group Graph Pattern Examples
<<
PREFIX foaf:    <http://xmlns.com/foaf/0.1/>
SELECT ?name ?mbox 
  {
    ?x foaf:name ?name . FILTER regex(?name, "Smith")
    ?x foaf:mbox ?mbox .
  }
>> OK

<<
PREFIX foaf:    <http://xmlns.com/foaf/0.1/>
SELECT ?name ?mbox 
  {
    ?x foaf:name ?name .
    {}
    ?x foaf:mbox ?mbox .
  }
>> OK

// 6.1 Optional Pattern Matching
...
```

### Executing the Provided Tiny Example Program ###

Assemble the following jar-files in a directory of your choice:

  * antlr-4.0.1-complete.jar
  * sparql4.jar

Copy the ident.stg file and the query file input.rq into the directory, too.
Execute the following command:

The Windows way
```
java -cp antlr-4-1.0-complete.jar;sparql4.jar SparqlMain input.rq
```

The Unix way
```
java -cp antlr-4-1.0-complete.jar:sparql4.jar SparqlMain input.rq
```

You should receive the following output:

```
Work on file input.rq
Tokens: -------------------------------
Number of tokens 69
TokenList: -------------------------------
[@0,0:5='PREFIX',<3>,1:0]
[@1,6:6=' ',<1>,channel=99,1:6]
[@2,7:9='dc:',<116>,1:7]
[@3,10:12='   ',<1>,channel=99,1:10]
[@4,13:46='<http://purl.org/dc/elements/1.1/>',<115>,1:13]
[@5,47:49=' \r\n',<1>,channel=99,1:47]
[@6,50:55='PREFIX',<3>,2:0]
[@7,56:56=' ',<1>,channel=99,2:6]
[@8,57:57=':',<116>,2:7]
[@9,58:62='     ',<1>,channel=99,2:8]
[@10,63:88='<http://example.org/book/>',<115>,2:13]
[@11,89:91=' \r\n',<1>,channel=99,2:39]
[@12,92:97='PREFIX',<3>,3:0]
[@13,98:98=' ',<1>,channel=99,3:6]
[@14,99:101='ns:',<116>,3:7]
[@15,102:104='   ',<1>,channel=99,3:10]
[@16,105:128='<http://example.org/ns#>',<115>,3:13]
[@17,129:133=' \r\n\r\n',<1>,channel=99,3:37]
[@18,134:139='SELECT',<4>,5:0]
[@19,140:140=' ',<1>,channel=99,5:6]
[@20,141:145='?book',<119>,5:7]
[@21,146:146=' ',<1>,channel=99,5:12]
...
[@67,295:296='\r\n',<1>,channel=99,13:1]
[@68,297:296='<EOF>',<-1>,14:3]
Input from token list: -------------------------------
PREFIX dc:   <http://purl.org/dc/elements/1.1/> 
PREFIX :     <http://example.org/book/> 
PREFIX ns:   <http://example.org/ns#> 

SELECT ?book ?title ?price
{
   ?book dc:title ?title ;
         ns:price ?price .
}
Values (?book ?title) {
 (UNDEF "SPARQL Tutorial")
 (:book2 UNDEF)
}
Start parsing: -------------------------------
Parse tree: -------------------------------
(query (prologue (prefixDecl PREFIX dc: <http://purl.org/dc/elements/1.1/>) (prefixDecl PREFIX : <http://example.org/book/>) (prefixDecl PREFIX ns: <http://example.org/ns#>)) (selectQuery (selectClause SELECT (selectVariables (var ?book)) (selectVariables (var ?title)) (selectVariables (var ?price))) (whereClause (groupGraphPattern { (groupGraphPatternSub (triplesBlock (triplesSameSubjectPath (varOrTerm (var ?book)) (propertyListPathNotEmpty (verbPath (path (pathAlternative (pathSequence (pathEltOrInverse (pathElt (pathPrimary (iri (prefixedName dc:title))))))))) (objectListPath (objectPath (graphNodePath (varOrTerm (var ?title))))) ; (propertyListPathNotEmptyList (verbPath (path (pathAlternative (pathSequence (pathEltOrInverse (pathElt (pathPrimary (iri (prefixedName ns:price))))))))) (objectList (object (graphNode (varOrTerm (var ?price)))))))) .)) })) solutionModifier) (valuesClause Values (dataBlock (inlineDataFull ( (var ?book) (var ?title) ) { (dataBlockValues ( (dataBlockValue UNDEF) (dataBlockValue (rdfLiteral (string "SPARQL Tutorial"))) )) (dataBlockValues ( (dataBlockValue (iri (prefixedName :book2))) (dataBlockValue UNDEF) )) }))) <EOF>)
Read StringTemplate Group File: ident.stg-------------------------------
Emit reformatted query: -------------------------------
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX : <http://example.org/book/>
PREFIX ns: <http://example.org/ns#>

SELECT ?book ?title ?price
WHERE {
   ?book dc:title ?title;
         ns:price ?price
}
VALUES (?book ?title) {
   (UNDEF "SPARQL Tutorial")
   (:book2 UNDEF)
}
Emit original query: -------------------------------
PREFIX dc:   <http://purl.org/dc/elements/1.1/> 
PREFIX :     <http://example.org/book/> 
PREFIX ns:   <http://example.org/ns#> 

SELECT ?book ?title ?price
{
   ?book dc:title ?title ;
         ns:price ?price .
}
Values (?book ?title) {
 (UNDEF "SPARQL Tutorial")
 (:book2 UNDEF)
}
-------------------------------
Number of errors encountered: 0
```


### Syntax Highlighting ###

Switching to the StringTemplate group file html.stg renders a query in a simple HTML format.

An example of a reformatted query is shown here:

![http://sparkle-g.googlecode.com/svn/site/images/HTML-Formatted-Query.png](http://sparkle-g.googlecode.com/svn/site/images/HTML-Formatted-Query.png)

The colors, fonts, etc. can be adapted without modification of Java code, just by editing the html.stg template.