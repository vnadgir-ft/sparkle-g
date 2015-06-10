

# Introduction #

A preprocessor substituting Unicode escape sequences by its character byte codes. This is the first step in the transformation pipeline for SPARQL queries.

# Details #

## Sparkle Unicode Preprocessor ##

### Unicode Escape Sequences ###

The www.w3.org states in chapter 19 for a SPARQL Query String:

> A SPARQL Query String is processed for codepoint escape sequences
> before parsing by the grammar defined in EBNF below.
> The codepoint escape sequences for a SPARQL query string are:

|Escape| Unicode code point|
|:-----|:------------------|
|'\u'HEX HEX HEX HEX | A Unicode code point in the range U+0 to U+FFFF  inclusive corresponding to the encoded hexadecimal value.|
|'\U' HEX HEX HEX HEX HEX HEX HEX HEX| A Unicode code point in the range U+0 to U+10FFFF inclusive corresponding to the encoded hexadecimal value.|

### Sparkle Unicode preprocessor ###

The implemented preprocessor for the conversion of Unicode escape sequences extends the `ANTLRStringStream` respectively the `ANTLRFileStream`.

It is implemented as a Finite State Automaton. It replaces Unicode escape sequences '\\u{1,n}xxxx', where {1,n} describes the multitude of occurences of u, by its character byte codes.

Examples of valid Unicode escape sequences:

  * \u0041	representing a capital A
  * \uuu0041	representing a capital A

Examples of invalid Unicode escape sequences:

  * \ u0041	blank between slash and u
  * \u41		a valid Unicode escape sequence consist of exactly four hex digits

Incomplete Unicode escape sequences are left as found in the file stream.

Some notes:

  * At the time of writing this documentation the ANTLR version 3.4 is used for parsing a SPARQL query. This ANLTR version 3.4 supports UTF-8 only. Therefore UTF-16 Unicode escape sequences, signaled by a capital \U are left untouched and emitted unchanged.

  * The character position in a line reported by ANTLR will most probably not reflect the correct position, when one or more Unicode substitutions have taken place. Take the character position issued not as an absolute value, but think of it as 'in the vicinity'.

  * No checking with respect to Unicode categories is done, e.g. wether a Unicode code point has a character representation assigned (Cn - Other, not Assigned) at all

  * No evaluation regarding character direction (Left-to-Right or Right-to-Left or embedded reverse character direction) is done

Two routines are available to be invoked for substitution of Unicode escape sequences:

  * [SparkleUnicodePreprocessorStringStream](http://sparkle-g.googlecode.com/svn/site/3.2/unicode-preprocessor/apidocs/index.html)
  * [SparkleUnicodePreprocessorFileStream](http://sparkle-g.googlecode.com/svn/site/3.2/unicode-preprocessor/apidocs/index.html)