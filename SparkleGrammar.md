# Introduction #

Add your content here.


# Details #

Some notes

  * basis for other target languages

  * inital adaptions for C-Version already done (see [issue 4](https://code.google.com/p/sparkle-g/issues/detail?id=4)).
> The increase in size for the C lexer seemed to be caused by the great number of case independent keywords. The Sparql lexer had been designed with attention to language independence. Only a few Java specific snippets are embedded in the ANTLR lexer and grammar rules. The keyword recognition had been shifted into some methods written in Java. This resulted in a drastic reduction in size of the generated files when compiling the grammar with Antlr. The generated C lexer size shrinked to only double the size of the lexer with target language Java. The warnings "no lexer rule corresponding to token:" can safely be ignored!
  * what has to be done:
> Replacement of the Java methods by C methods in the Sparql.g grammar.
  * preparation for first commit in svn ongoing

- to be continued -