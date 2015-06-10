#### Table of Content ####



# Introduction #

## SPARKLE-G ##

### Pretty Printer and Syntactic Validator for the SPARQL 1.1 Query and Update Language ###

The sparkle-g project has released a pretty printer and syntactic validator for the [SPARQL 1.1 Query](http://www.w3.org/TR/sparql11-query/) and
[Update Language](http://www.w3.org/TR/2011/WD-sparql11-update-20110512/) [![](http://sparkle-g.googlecode.com/svn/site/images/sw-sparql-green.png)](http://www.w3.org/2001/sw/DataAccess/). The pretty printer and syntactic validator is based on the [ANTLR](http://antlr.org/) framework for constructing recognizers, interpreters, compilers, and translators. The generation of the formatted output text relies on the [StringTemplate](http://www.stringtemplate.org/) template engine. [ANTLR](http://antlr.org/) and
[StringTemplate](http://www.stringtemplate.org/) have both been crafted by [Terence Parr](http://www.cs.usfca.edu/~parrt/), a professor of computer science at the [University of San Francisco](http://www.cs.usfca.edu/).

On developing the pretty printer emphasis had been placed on target language independence. Only a few Java constructs are embedded in the lexical and grammatical description of the [SPARQL 1.1 Query](http://www.w3.org/TR/sparql11-query/) and
[Update Language](http://www.w3.org/TR/2011/WD-sparql11-update-20110512/). Therefore it should be possible to generate the SPARQL pretty printer with only some small adaptions for a variety of [target languages](http://www.antlr.org/wiki/display/ANTLR3/Code+Generation+Targets) in addition to Java, e.g. C, which are supported by [ANTLR](http://antlr.org/) and the [StringTemplate](http://www.stringtemplate.org/) template engine.


# Details #

## The Transformation Pipeline ##

Here a brief description of the transformation pipeline which every query is undergoing.

### Conversion of Unicode Escape Sequences ###

The `UnicodePreprocessorFileStream` substitutes Unicode escape sequences (\uxxxx) by its UTF8 code.

The example SPARQL query has encoded the character S as Unicode escape sequence \u0053.

```
# $Id: kanji-02.rq,v 1.4 2005/11/06 08:27:50 eric Exp $
# test wide spaces
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX 食: <http://www.w3.org/kanji.ttl#>
\u0053ELECT ?name WHERE {
  [ foaf:name ?name ;
    食:食べる 食:海老 ] . }
```

After passing through the Unicode pre-processor the Unicode escape sequence is replaced by its UTF8 character code.

```
# $Id: kanji-02.rq,v 1.4 2005/11/06 08:27:50 eric Exp $
# test wide spaces
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX 食: <http://www.w3.org/kanji.ttl#>
SELECT ?name WHERE {
  [ foaf:name ?name ;
    食:食べる 食:海老 ] . }
```

### Tokenizing of the SPARQL Query ###

The preprocessed query is passed on to the `SparqlLexer`. It splits the query into tokens which serve as input for the `SparqlParser`.

![http://sparkle-g.googlecode.com/svn/site/images/SPP_1_Tokenizer.png](http://sparkle-g.googlecode.com/svn/site/images/SPP_1_Tokenizer.png)

### Parsing of the Query ###

The `SparqlParser` matches the query tokens delivered by the `SparqlLexer` against the SPARQL grammar defined by ANTLR rules. The Parse Tree below represents the sequence of rule invocations used to match the input query.

![http://sparkle-g.googlecode.com/svn/site/images/SPP_2_ParseTree_Text.png](http://sparkle-g.googlecode.com/svn/site/images/SPP_2_ParseTree_Text.png)

### AST generation ###

The Abstract Syntax Tree is defined by adding rewrite rules to the parser grammar. The AST nodes below have been generated from the input query invoking the sequence of affected rewrite rules attached to the parser grammar rules.

![http://sparkle-g.googlecode.com/svn/site/images/SPP_3_AST.png](http://sparkle-g.googlecode.com/svn/site/images/SPP_3_AST.png)

### Traversing the AST ###

The AST is input for the Tree Grammar. The imaginary UP and DOWN nodes have been added by ANTLR. The two graphics display the AST generated for the kanji input query.

![http://sparkle-g.googlecode.com/svn/site/images/SPP_4_TreeWalker_Text1.png](http://sparkle-g.googlecode.com/svn/site/images/SPP_4_TreeWalker_Text1.png)

![http://sparkle-g.googlecode.com/svn/site/images/SPP_5_TreeWalker_Text2.png](http://sparkle-g.googlecode.com/svn/site/images/SPP_5_TreeWalker_Text2.png)

### Emitting the Formatted Query ###

The Tree Grammar rules have been augmented with `StringTemplate` rewrite rules. The template rewrites for the pretty printer are defined in the Ident.stg `StringTemplate` group file. Traversing the Tree Grammar rules invokes the referenced template. The generated formatted output of the kanji query is shown below.

```
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX 食: <http://www.w3.org/kanji.ttl#>

SELECT ?name
WHERE {
   [ foaf:name ?name;
   食:食べる 食:海老 ]
}
```

## How to Get the SPARQL Pretty Printer to Work ##

### A Sample Routine Showing the Transformation Pipeline ###

The transformation pipeline just described, now cast into Java statements:

```
    private String sparklegPrettyPrinter(String query) throws Exception {

        /* Path to StringTemplate Group File.
         * Location of ident.stg can/should be modified to your needs.
         * Fixed assignment just to keep all neccessary parts in one place.
         */
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
```

## Executing the Provided Tiny Example Program ##

Assemble the following jar-files in a directory of your choice:

  * antlr-3.4-complete.jar
  * sparkle-pretty-printer-3.2.jar
  * unicode-preprocessor-3.2.jar

Copy the `ident.stg` file and the query file `input-01.rq` into the directory, too.

Execute the following command:

```
java -cp antlr-3.4-complete.jar;sparkle-pretty-printer-3.2.jar;unicode-preprocessor-3.2.jar SparqlMain input-01.rq
```

You should receive the following output:

```
Working on file input-01.rq
Sparql parser tree=(QUERY PROLOGUE (SELECT (SELECT_CLAUSE *) (WHERE_CLAUSE (GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN))))
-------------------------------
List of CommonTreeNodes
 QUERY DOWN PROLOGUE SELECT DOWN SELECT_CLAUSE DOWN * UP WHERE_CLAUSE DOWN GROUP_GRAPH_PATTERN DOWN GROUP_GRAPH_PATTERN UP UP UP UP EOF
-------------------------------
CommonTreeNodes tree=(QUERY PROLOGUE (SELECT (SELECT_CLAUSE *) (WHERE_CLAUSE (GROUP_GRAPH_PATTERN GROUP_GRAPH_PATTERN))))
-------------------------------
SELECT *
WHERE {
}
```

# Automated Testing #

## Syntax Testing Using GUnit ##

GUnit is used for testing the SPARQL syntax as defined in the Sparql.g grammar file. At the moment about 950 test queries are part of the testsuite.

### DAWG Test Data ###

One part of the GUnit test cases is based on the DAWG `data-r2` and `data-sparql11` testsuites. The start of the DAWG test cases is marked in the `Sparql.testsuite` file and the `Sparql.gunit` file with the following disclaimer:

> W3C(R) SOFTWARE NOTICE AND LICENSE
> [http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231](http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231)

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

## Tree Grammar Testing ##

JUnit is being used for testing the Tree Grammar, respectively the reformatted query emitted.

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

# Example Usages of ANTLR generated SPARQL Lexer and Parser #

A prototype of a netbeans platform based application has been built. This prototype uses the ANTLR generated SPARQL lexer for syntax colouring. The implementation of this feature had been made more than easy by the nice step by step guidance which can be found here:

[Using an ANTLR Lexer For Syntax Coloring Tutorial](http://wiki.netbeans.org/SyntaxColoringANTLR)

A sample image of a coloured query from the DAWG testsuite looks like this:

![http://sparkle-g.googlecode.com/svn/site/images/Syntax-Coloring.png](http://sparkle-g.googlecode.com/svn/site/images/Syntax-Coloring.png)

The SPARQL grammar is being used for syntax checking. How to integrate an ANTLR grammar in a netbeans platform based application is explained in the [New Language Support Tutorial Antlr](http://wiki.netbeans.org/New_Language_Support_Tutorial_Antlr).

Depicted below an error message emitted by the SPARQL grammar:

![http://sparkle-g.googlecode.com/svn/site/images/LanguageIntegration.png](http://sparkle-g.googlecode.com/svn/site/images/LanguageIntegration.png)

- to be continued -