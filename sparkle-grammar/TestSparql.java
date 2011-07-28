
import org.antlr.gunit.gUnitBaseTest;

public class TestSparql extends gUnitBaseTest {
	
	public void setUp() {
		this.packagePath = "./com/googlecode/sparkleg";
		this.lexerPath = "com.googlecode.sparkleg.SparqlLexer";
		this.parserPath = "com.googlecode.sparkleg.SparqlParser";
	}

	public void testQuery1() throws Exception {
		// gunit test on line 31
		Object retval = execParser("query", 31, "PREFIX : <http://example/> \r\n\r\nSELECT ?v\r\n{ :x :p ?v . FILTER(?v = 1) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery2() throws Exception {
		// gunit test on line 37
		Object retval = execParser("query", 37, "PREFIX : <http://example/> \r\n\r\nSELECT ?v\r\n{ :x :p ?v . { FILTER(?v = 1) } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery3() throws Exception {
		// gunit test on line 43
		Object retval = execParser("query", 43, "PREFIX : <http://example/>\r\n\r\nSELECT ?v \r\n{ \r\n    ?s :p ?v . \r\n    FILTER (?v = 2)\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery4() throws Exception {
		// gunit test on line 52
		Object retval = execParser("query", 52, "PREFIX : <http://example/>\r\n\r\nSELECT ?v \r\n{ \r\n    FILTER (?v = 2)\r\n    ?s :p ?v . \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery5() throws Exception {
		// gunit test on line 61
		Object retval = execParser("query", 61, "PREFIX : <http://example/>\r\n\r\nSELECT ?v ?w\r\n{ \r\n    FILTER (?v = 2)\r\n    FILTER (?w = 3)\r\n    ?s :p ?v . \r\n    ?s :q ?w .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery6() throws Exception {
		// gunit test on line 72
		Object retval = execParser("query", 72, "PREFIX :    <http://example/>\r\n\r\nSELECT *\r\n{ \r\n    :x :p ?v . \r\n    { :x :q ?w \r\n      OPTIONAL {  :x :p ?v2 FILTER(?v = 1) }\r\n    }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery7() throws Exception {
		// gunit test on line 83
		Object retval = execParser("query", 83, "PREFIX :    <http://example/>\r\n\r\nSELECT ?a ?y ?d ?z\r\n{ \r\n    ?a :p ?c OPTIONAL { ?a :r ?d }. \r\n    ?a ?p 1 { ?p a ?y } UNION { ?a ?z ?p } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery8() throws Exception {
		// gunit test on line 91
		Object retval = execParser("query", 91, "PREFIX :    <http://example/>\r\n\r\nSELECT ?x ?y ?z\r\n{ \r\n    GRAPH ?g { ?x ?p 1 } { ?x :p ?y } UNION { ?p a ?z }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery9() throws Exception {
		// gunit test on line 99
		Object retval = execParser("query", 99, "PREFIX :    <http://example/>\r\n\r\nSELECT *\r\n{ \r\n  ?x :p ?v .\r\n  OPTIONAL\r\n  { \r\n    ?y :q ?w .\r\n    FILTER(?v=2)\r\n  }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery10() throws Exception {
		// gunit test on line 112
		Object retval = execParser("query", 112, "PREFIX :    <http://example/>\r\n\r\nSELECT *\r\n{ \r\n  ?x :p ?v .\r\n  OPTIONAL\r\n  { \r\n    ?y :q ?w .\r\n    FILTER(?v=2)\r\n    FILTER(?w=3)\r\n  }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery11() throws Exception {
		// gunit test on line 126
		Object retval = execParser("query", 126, "PREFIX :    <http://example/>\r\n\r\nSELECT *\r\n{ \r\n    :x :p ?v . \r\n    { :x :q ?w \r\n      # ?v is not in scope so ?v2 never set\r\n      OPTIONAL {  :x :p ?v2 FILTER(?v = 1) }\r\n    }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery12() throws Exception {
		// gunit test on line 138
		Object retval = execParser("query", 138, "PREFIX :    <http://example/>\r\n\r\n## The nested optional example, rewritten to a form that is the same\r\n## for the SPARQL algebra and the declarative semantics.\r\nSELECT *\r\n{ \r\n    :x1 :p ?v .\r\n    OPTIONAL { :x3 :q ?w }\r\n    OPTIONAL { :x3 :q ?w  . :x2 :p ?v }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery13() throws Exception {
		// gunit test on line 150
		Object retval = execParser("query", 150, "PREFIX :    <http://example/>\r\n\r\nSELECT *\r\n{ \r\n    :x1 :p ?v .\r\n    OPTIONAL\r\n    {\r\n      :x3 :q ?w .\r\n      OPTIONAL { :x2 :p ?v }\r\n    }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery14() throws Exception {
		// gunit test on line 163
		Object retval = execParser("query", 163, "PREFIX : <http://example/>\r\n\r\nSELECT *\r\n{ \r\n  ?X  :name \"paul\"\r\n  {?Y :name \"george\" . OPTIONAL { ?X :email ?Z } }\r\n}\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery15() throws Exception {
		// gunit test on line 173
		Object retval = execParser("query", 173, "PREFIX :   <http://example/>\r\n\r\nASK { :x :p 1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery16() throws Exception {
		// gunit test on line 178
		Object retval = execParser("query", 178, "PREFIX :   <http://example/>\r\n\r\nASK { :x :p 99 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery17() throws Exception {
		// gunit test on line 183
		Object retval = execParser("query", 183, "PREFIX :   <http://example/>\r\n\r\nASK { :x :p ?x }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery18() throws Exception {
		// gunit test on line 188
		Object retval = execParser("query", 188, "PREFIX :   <http://example/>\r\n\r\nASK { :x :p ?x . FILTER(?x = 99) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery19() throws Exception {
		// gunit test on line 193
		Object retval = execParser("query", 193, "BASE <http://example.org/x/> \r\nPREFIX : <>\r\n\r\nSELECT * WHERE { :x ?p ?v } ", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery20() throws Exception {
		// gunit test on line 199
		Object retval = execParser("query", 199, "BASE <http://example.org/x/> \r\nPREFIX : <#>\r\n\r\nSELECT * WHERE { :x ?p ?v } ", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery21() throws Exception {
		// gunit test on line 205
		Object retval = execParser("query", 205, "PREFIX ns: <http://example.org/ns#>\r\nPREFIX x:  <http://example.org/x/>\r\n\r\nSELECT * WHERE { x:x ns:p ?v } ", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery22() throws Exception {
		// gunit test on line 211
		Object retval = execParser("query", 211, "BASE <http://example.org/x/>\r\n\r\nSELECT * WHERE { <x> <p> ?v } ", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery23() throws Exception {
		// gunit test on line 216
		Object retval = execParser("query", 216, "BASE <http://example.org/x/>\r\n\r\nSELECT * WHERE { <#x> <#p> ?v } ", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery24() throws Exception {
		// gunit test on line 221
		Object retval = execParser("query", 221, "PREFIX : <http://example.org/>\r\nPREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?x\r\nWHERE {\r\n  ?x foaf:name \"John Smith\" ;\r\n       a foaf:Womble .\r\n}\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery25() throws Exception {
		// gunit test on line 231
		Object retval = execParser("query", 231, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?p\r\n{ :x ?p () . }\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery26() throws Exception {
		// gunit test on line 238
		Object retval = execParser("query", 238, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?p\r\n{ :x ?p (1) . }\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery27() throws Exception {
		// gunit test on line 245
		Object retval = execParser("query", 245, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?p ?v\r\n{ :x ?p (?v) . }\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery28() throws Exception {
		// gunit test on line 252
		Object retval = execParser("query", 252, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?p ?v ?w\r\n{ :x ?p (?v ?w) . }\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery29() throws Exception {
		// gunit test on line 259
		Object retval = execParser("query", 259, "PREFIX ex: <http://example.org/ns#x> \r\nSELECT ?p {\r\n  ex: ?p 1 .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery30() throws Exception {
		// gunit test on line 265
		Object retval = execParser("query", 265, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?x\r\n{ ?x ?p '''x''' }\r\n\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery31() throws Exception {
		// gunit test on line 273
		Object retval = execParser("query", 273, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?x\r\n{ ?x ?p \"\"\"x\"\"\" }\r\n\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery32() throws Exception {
		// gunit test on line 281
		Object retval = execParser("query", 281, "# This query uses UNIX line end conventions.\r\n# It is in CVS in binary.\r\nPREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?x\r\n{ ?x ?p '''x\r\ny'''\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery33() throws Exception {
		// gunit test on line 291
		Object retval = execParser("query", 291, "# This query uses UNIX line end conventions.\r\n# It is in CVS in binary.\r\nPREFIX : <http://example.org/ns#>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#> \r\n\r\nSELECT ?x\r\n{ ?x ?p \"\"\"x\r\ny\"\"\"^^:someType\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery34() throws Exception {
		// gunit test on line 302
		Object retval = execParser("query", 302, "PREFIX : <http://example.org/ns#> \r\nPREFIX xsd:        <http://www.w3.org/2001/XMLSchema#> \r\n\r\nSELECT ?s WHERE {\r\n ?s :p1 1, 2 .\r\n}\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery35() throws Exception {
		// gunit test on line 311
		Object retval = execParser("query", 311, "PREFIX :     <http://example.org/ns#>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT * { :x ?p true . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery36() throws Exception {
		// gunit test on line 317
		Object retval = execParser("query", 317, "PREFIX :     <http://example.org/ns#>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT * { :x ?p false }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery37() throws Exception {
		// gunit test on line 323
		Object retval = execParser("query", 323, "PREFIX :     <http://example.org/ns#>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT * { :x a ?C . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery38() throws Exception {
		// gunit test on line 329
		Object retval = execParser("query", 329, "PREFIX :     <http://example.org/ns#>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT * { :x ?p 123.0 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery39() throws Exception {
		// gunit test on line 335
		Object retval = execParser("query", 335, "PREFIX :     <http://example.org/ns#>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT * { :x ?p 123.0. }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery40() throws Exception {
		// gunit test on line 341
		Object retval = execParser("query", 341, "PREFIX :     <http://example.org/ns#>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\n\r\n# DOT is part of the decimal.\r\nSELECT * { :x ?p 456. }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery41() throws Exception {
		// gunit test on line 348
		Object retval = execParser("query", 348, "PREFIX :     <http://example.org/ns#>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\n\r\n# DOT is part of the decimal.\r\nSELECT * { :x ?p 456. . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery42() throws Exception {
		// gunit test on line 355
		Object retval = execParser("query", 355, "PREFIX :     <http://example.org/ns#>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\n\r\n# DOT is part of the decimal.\r\nSELECT * { :x ?p +5 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery43() throws Exception {
		// gunit test on line 362
		Object retval = execParser("query", 362, "PREFIX :     <http://example.org/ns#>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\n\r\n# DOT is part of the decimal.\r\nSELECT * { :x ?p -18 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery44() throws Exception {
		// gunit test on line 369
		Object retval = execParser("query", 369, "PREFIX :     <http://example.org/ns#>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT * { :x ?p $v }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery45() throws Exception {
		// gunit test on line 375
		Object retval = execParser("query", 375, "PREFIX :     <http://example.org/ns#>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT * { :x ?p $v . :x ?p ?v }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery46() throws Exception {
		// gunit test on line 381
		Object retval = execParser("query", 381, "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\nPREFIX  foaf:       <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?x ?y\r\nWHERE {\r\n  ?x foaf:knows ?y .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery47() throws Exception {
		// gunit test on line 390
		Object retval = execParser("query", 390, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/ns#>\r\nSELECT  ?a\r\nWHERE\r\n    { ?a :p ?v . \r\n      FILTER (?v) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery48() throws Exception {
		// gunit test on line 399
		Object retval = execParser("query", 399, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/ns#>\r\nSELECT  ?a\r\nWHERE\r\n    { ?a :p ?v . \r\n      FILTER ( ! ?v ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery49() throws Exception {
		// gunit test on line 408
		Object retval = execParser("query", 408, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/ns#>\r\nSELECT  ?a\r\nWHERE\r\n    { ?a :p ?v . \r\n      FILTER (\"true\"^^xsd:boolean && ?v) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery50() throws Exception {
		// gunit test on line 417
		Object retval = execParser("query", 417, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/ns#>\r\nSELECT  ?a\r\nWHERE\r\n    { ?a :p ?v . \r\n      FILTER (\"false\"^^xsd:boolean || ?v) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery51() throws Exception {
		// gunit test on line 426
		Object retval = execParser("query", 426, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/ns#>\r\nSELECT  ?a\r\nWHERE\r\n    { ?a :p ?v . \r\n      OPTIONAL\r\n        { ?a :q ?w } . \r\n      FILTER (?w) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery52() throws Exception {
		// gunit test on line 437
		Object retval = execParser("query", 437, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/ns#>\r\nSELECT  ?a ?w\r\nWHERE\r\n    { ?a :p ?v . \r\n      OPTIONAL\r\n        { ?a :q ?w } . \r\n      FILTER ( ! ?w ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery53() throws Exception {
		// gunit test on line 448
		Object retval = execParser("query", 448, "prefix : <http://example.org/ns#>\r\nselect ?x where {\r\n    ?x :p \"foo\" .\r\n    FILTER (true) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery54() throws Exception {
		// gunit test on line 455
		Object retval = execParser("query", 455, "PREFIX  : <http://example.org/ns#>\r\nSELECT  ?a ?c\r\nWHERE\r\n    { ?a :b ?c . \r\n      OPTIONAL\r\n        { ?c :d ?e } . \r\n      FILTER (! bound(?e)) \r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery55() throws Exception {
		// gunit test on line 465
		Object retval = execParser("query", 465, "PREFIX : <http://example.org/>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nSELECT ?s WHERE {\r\n    ?s :p ?v .\r\n    FILTER(datatype(xsd:boolean(?v)) = xsd:boolean) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery56() throws Exception {
		// gunit test on line 474
		Object retval = execParser("query", 474, "PREFIX : <http://example.org/>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nSELECT ?s WHERE {\r\n    ?s :p ?v .\r\n    FILTER(datatype(xsd:double(?v)) = xsd:double) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery57() throws Exception {
		// gunit test on line 483
		Object retval = execParser("query", 483, "PREFIX : <http://example.org/>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nSELECT ?s WHERE {\r\n    ?s :p ?v .\r\n    FILTER(datatype(xsd:decimal(?v)) = xsd:decimal) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery58() throws Exception {
		// gunit test on line 492
		Object retval = execParser("query", 492, "PREFIX : <http://example.org/>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nSELECT ?s WHERE {\r\n    ?s :p ?v .\r\n    FILTER(datatype(xsd:dateTime(?v)) = xsd:dateTime) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery59() throws Exception {
		// gunit test on line 501
		Object retval = execParser("query", 501, "PREFIX : <http://example.org/>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nSELECT ?s WHERE {\r\n    ?s :p ?v .\r\n    FILTER(datatype(xsd:float(?v)) = xsd:float) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery60() throws Exception {
		// gunit test on line 510
		Object retval = execParser("query", 510, "PREFIX : <http://example.org/>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nSELECT ?s WHERE {\r\n    ?s :p ?v .\r\n    FILTER(datatype(xsd:integer(?v)) = xsd:integer) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery61() throws Exception {
		// gunit test on line 519
		Object retval = execParser("query", 519, "PREFIX : <http://example.org/>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nSELECT ?s WHERE {\r\n    ?s :p ?v .\r\n    FILTER(datatype(xsd:string(?v)) = xsd:string) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery62() throws Exception {
		// gunit test on line 528
		Object retval = execParser("query", 528, "PREFIX : <http://example/> \r\n\r\nCONSTRUCT { ?x :p2 ?v }\r\n\r\nWHERE\r\n{\r\n  ?x :p ?o .\r\n  OPTIONAL {?o :q ?v }\r\n}\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery63() throws Exception {
		// gunit test on line 540
		Object retval = execParser("query", 540, "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\nPREFIX  foaf:       <http://xmlns.com/foaf/0.1/>\r\n\r\nCONSTRUCT { ?s ?p ?o . }\r\nWHERE {\r\n  ?s ?p ?o .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery64() throws Exception {
		// gunit test on line 549
		Object retval = execParser("query", 549, "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\nPREFIX  foaf:       <http://xmlns.com/foaf/0.1/>\r\n\r\nCONSTRUCT { [ rdf:subject ?s ;\r\n              rdf:predicate ?p ;\r\n              rdf:object ?o ] . }\r\nWHERE {\r\n  ?s ?p ?o .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery65() throws Exception {
		// gunit test on line 560
		Object retval = execParser("query", 560, "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\nPREFIX  foaf:       <http://xmlns.com/foaf/0.1/>\r\n\r\nCONSTRUCT { _:a rdf:subject ?s ;\r\n                rdf:predicate ?p ;\r\n                rdf:object ?o  . }\r\nWHERE {\r\n  ?s ?p ?o .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery66() throws Exception {
		// gunit test on line 571
		Object retval = execParser("query", 571, "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\nPREFIX  foaf:       <http://xmlns.com/foaf/0.1/>\r\n\r\nCONSTRUCT { ?s foaf:name ?o . }\r\nWHERE {\r\n  ?s foaf:name ?o .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery67() throws Exception {
		// gunit test on line 580
		Object retval = execParser("query", 580, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g1.ttl>\r\n{ ?s ?p ?o }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery68() throws Exception {
		// gunit test on line 587
		Object retval = execParser("query", 587, "PREFIX : <http://example/> \r\n\r\nSELECT *\r\nFROM NAMED <data-g1.ttl>\r\n{ ?s ?p ?o }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery69() throws Exception {
		// gunit test on line 594
		Object retval = execParser("query", 594, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM NAMED <data-g1.ttl>\r\n{ \r\n    GRAPH ?g { ?s ?p ?o }\r\n}\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery70() throws Exception {
		// gunit test on line 604
		Object retval = execParser("query", 604, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g1.ttl>\r\n{ \r\n    GRAPH ?g { ?s ?p ?o }\r\n}\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery71() throws Exception {
		// gunit test on line 614
		Object retval = execParser("query", 614, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g1.ttl>\r\nFROM NAMED <data-g2.ttl>\r\n{ ?s ?p ?o }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery72() throws Exception {
		// gunit test on line 622
		Object retval = execParser("query", 622, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g1.ttl>\r\nFROM NAMED <data-g2.ttl>\r\n{ \r\n    GRAPH ?g { ?s ?p ?o }\r\n}\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery73() throws Exception {
		// gunit test on line 633
		Object retval = execParser("query", 633, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g1.ttl>\r\nFROM NAMED <data-g2.ttl>\r\n{ \r\n   { ?s ?p ?o }\r\n  UNION\r\n   { GRAPH ?g { ?s ?p ?o } }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery74() throws Exception {
		// gunit test on line 645
		Object retval = execParser("query", 645, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g1.ttl>\r\nFROM NAMED <data-g2.ttl>\r\n{ \r\n   ?s ?p ?o\r\n   GRAPH ?g { ?s ?q ?v }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery75() throws Exception {
		// gunit test on line 656
		Object retval = execParser("query", 656, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g3.ttl>\r\nFROM NAMED <data-g3.ttl>{ \r\n   ?s ?p ?o\r\n   GRAPH ?g { ?s ?q ?v }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery76() throws Exception {
		// gunit test on line 666
		Object retval = execParser("query", 666, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g3-dup.ttl>\r\nFROM NAMED <data-g3.ttl>{ \r\n   ?s ?p ?o\r\n   GRAPH ?g { ?s ?q ?v }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery77() throws Exception {
		// gunit test on line 676
		Object retval = execParser("query", 676, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g3.ttl>\r\nFROM NAMED <data-g3.ttl>\r\n{ \r\n   ?s ?p ?o\r\n   GRAPH ?g { ?s ?q ?v }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery78() throws Exception {
		// gunit test on line 687
		Object retval = execParser("query", 687, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g3-dup.ttl>\r\nFROM NAMED <data-g3.ttl>\r\n{ \r\n   ?s ?p ?o\r\n   GRAPH ?g { ?s ?q ?v }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery79() throws Exception {
		// gunit test on line 698
		Object retval = execParser("query", 698, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g1.ttl>\r\nFROM NAMED <data-g1.ttl>\r\nFROM NAMED <data-g2.ttl>\r\nFROM NAMED <data-g3.ttl>\r\nFROM NAMED <data-g4.ttl>\r\n{ \r\n   { ?s ?p ?o }\r\n  UNION\r\n   { GRAPH ?g { ?s ?p ?o } }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery80() throws Exception {
		// gunit test on line 713
		Object retval = execParser("query", 713, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g1.ttl>\r\nFROM <data-g2.ttl>\r\nFROM <data-g3.ttl>\r\nFROM <data-g4.ttl>\r\nFROM NAMED <data-g1.ttl>\r\nFROM NAMED <data-g2.ttl>\r\nFROM NAMED <data-g3.ttl>\r\nFROM NAMED <data-g4.ttl>\r\n{ \r\n   { ?s ?p ?o }\r\n  UNION\r\n   { GRAPH ?g { ?s ?p ?o } }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery81() throws Exception {
		// gunit test on line 731
		Object retval = execParser("query", 731, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\nFROM <data-g1-dup.ttl>\r\nFROM <data-g2-dup.ttl>\r\nFROM <data-g3-dup.ttl>\r\nFROM <data-g4-dup.ttl>\r\nFROM NAMED <data-g1.ttl>\r\nFROM NAMED <data-g2.ttl>\r\nFROM NAMED <data-g3.ttl>\r\nFROM NAMED <data-g4.ttl>\r\n{ \r\n   { ?s ?p ?o }\r\n  UNION\r\n   { GRAPH ?g { ?s ?p ?o } }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery82() throws Exception {
		// gunit test on line 749
		Object retval = execParser("query", 749, "PREFIX :      <http://example/> \r\nPREFIX xsd:   <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT DISTINCT ?v\r\n{\r\n    ?x ?p ?v .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery83() throws Exception {
		// gunit test on line 758
		Object retval = execParser("query", 758, "PREFIX :      <http://example/> \r\nPREFIX xsd:   <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT DISTINCT ?v\r\n{\r\n    :x1 ?p ?o\r\n    OPTIONAL { ?o :q ?v }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery84() throws Exception {
		// gunit test on line 768
		Object retval = execParser("query", 768, "PREFIX :         <http://example/> \r\nPREFIX xsd:      <http://www.w3.org/2001/XMLSchema#> \r\nSELECT DISTINCT * \r\nWHERE { \r\n  { ?s :p ?o } UNION { ?s :q ?o }\r\n}\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery85() throws Exception {
		// gunit test on line 777
		Object retval = execParser("query", 777, "SELECT ?v\r\n{\r\n    ?x ?p ?v .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery86() throws Exception {
		// gunit test on line 783
		Object retval = execParser("query", 783, "PREFIX :      <http://example/> \r\nPREFIX xsd:   <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?v\r\n{\r\n    :x1 ?p ?o\r\n    OPTIONAL { ?o :q ?v }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery87() throws Exception {
		// gunit test on line 793
		Object retval = execParser("query", 793, "# Test: 'xyz'@en = 'xyz'@EN\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX     :    <http://example/>\r\n\r\nSELECT *\r\n{\r\n    ?x1 :p ?v1 .\r\n    ?x2 :p ?v2 .\r\n    FILTER ( ?v1 = ?v2 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery88() throws Exception {
		// gunit test on line 806
		Object retval = execParser("query", 806, "# Test: 'xyz'@en != 'xyz'@EN\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX     :    <http://example/>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT *\r\n{\r\n    ?x1 :p ?v1 .\r\n    ?x2 :p ?v2 .\r\n    FILTER ( ?v1 != ?v2 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery89() throws Exception {
		// gunit test on line 820
		Object retval = execParser("query", 820, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x ?v\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER isBlank(?v) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery90() throws Exception {
		// gunit test on line 829
		Object retval = execParser("query", 829, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x ?v\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER ( datatype(?v) = xsd:double ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery91() throws Exception {
		// gunit test on line 838
		Object retval = execParser("query", 838, "# Which literals have a datatype and which are errors.\r\n\r\nPREFIX : <http://example/> \r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?x\r\n{ ?x :p ?v . \r\n  FILTER(  datatype(?v) != <http://example/NotADataTypeIRI> ) \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery92() throws Exception {
		// gunit test on line 849
		Object retval = execParser("query", 849, "# Whichliterals have xsd:string as a datatype\r\n\r\nPREFIX : <http://example/> \r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?x\r\n{ ?x :p ?v . \r\n  FILTER( datatype(?v) = xsd:string ) \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery93() throws Exception {
		// gunit test on line 860
		Object retval = execParser("query", 860, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x ?v\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER isIRI(?v) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery94() throws Exception {
		// gunit test on line 869
		Object retval = execParser("query", 869, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example/>\r\nSELECT  ?x \r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER isLiteral(?v) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery95() throws Exception {
		// gunit test on line 878
		Object retval = execParser("query", 878, "# Test which things have a lang tag of some form.\r\n\r\nPREFIX : <http://example/> \r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?x\r\n{ ?x :p ?v . \r\n  FILTER ( lang(?v) != '@NotALangTag@' )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery96() throws Exception {
		// gunit test on line 889
		Object retval = execParser("query", 889, "PREFIX : <http://example/> \r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?x\r\n{ ?x :p ?v . \r\n  FILTER ( lang(?v) = '' )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery97() throws Exception {
		// gunit test on line 898
		Object retval = execParser("query", 898, "PREFIX : <http://example/> \r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?x\r\n{ ?x :p \"string\"@EN\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery98() throws Exception {
		// gunit test on line 906
		Object retval = execParser("query", 906, "PREFIX : <http://example.org/#>\r\n\r\nSELECT *\r\n{ :x ?p ?v . FILTER langMatches(lang(?v), \"en-GB\") . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery99() throws Exception {
		// gunit test on line 912
		Object retval = execParser("query", 912, "PREFIX : <http://example.org/#>\r\n\r\nSELECT *\r\n{ :x ?p ?v . FILTER langMatches(lang(?v), \"en\") . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery100() throws Exception {
		// gunit test on line 918
		Object retval = execParser("query", 918, "PREFIX : <http://example.org/#>\r\n\r\nSELECT *\r\n{ :x ?p ?v . FILTER langMatches(lang(?v), \"*\") . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery101() throws Exception {
		// gunit test on line 924
		Object retval = execParser("query", 924, "PREFIX : <http://example.org/#>\r\n\r\nSELECT *\r\n{ :x ?p ?v . FILTER (! langMatches(lang(?v), \"*\")) . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery102() throws Exception {
		// gunit test on line 930
		Object retval = execParser("query", 930, "# q-langMatches-de-de.rq\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX : <http://example.org/#>\r\n\r\nSELECT *\r\n{ :x ?p ?v . FILTER langMatches(lang(?v), \"de-de\") . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery103() throws Exception {
		// gunit test on line 939
		Object retval = execParser("query", 939, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x ?v\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER ( str(?v) = \"1\" ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery104() throws Exception {
		// gunit test on line 948
		Object retval = execParser("query", 948, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x ?v\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER ( str(?v) = \"01\" ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery105() throws Exception {
		// gunit test on line 957
		Object retval = execParser("query", 957, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x ?v\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER ( str(?v) = \"zzz\" ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery106() throws Exception {
		// gunit test on line 966
		Object retval = execParser("query", 966, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x ?v\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER ( str(?v) = \"\"  ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery107() throws Exception {
		// gunit test on line 975
		Object retval = execParser("query", 975, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x ?v\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER isURI(?v) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery108() throws Exception {
		// gunit test on line 984
		Object retval = execParser("query", 984, "# Test: sameTerm and eq\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX     :    <http://example.org/things#>\r\n\r\nSELECT *\r\n{\r\n    ?x1 :p ?v1 .\r\n    ?x2 :p ?v2 .\r\n    FILTER ( sameTerm(?v1, ?v2) && ?v1 = ?v2 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery109() throws Exception {
		// gunit test on line 997
		Object retval = execParser("query", 997, "# Test: !sameTerm and eq\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX     :    <http://example.org/things#>\r\n\r\nSELECT *\r\n{\r\n    ?x1 :p ?v1 .\r\n    ?x2 :p ?v2 .\r\n    FILTER ( !sameTerm(?v1, ?v2) && ?v1 = ?v2 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery110() throws Exception {
		// gunit test on line 1010
		Object retval = execParser("query", 1010, "# Test: sameTerm\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX     :    <http://example.org/things#>\r\n\r\nSELECT *\r\n{\r\n    ?x1 :p ?v1 .\r\n    ?x2 :p ?v2 .\r\n    FILTER sameTerm(?v1, ?v2)\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery111() throws Exception {
		// gunit test on line 1023
		Object retval = execParser("query", 1023, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER ( ?v = 1 ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery112() throws Exception {
		// gunit test on line 1032
		Object retval = execParser("query", 1032, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER ( ?v = 1.0e0 )  .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery113() throws Exception {
		// gunit test on line 1041
		Object retval = execParser("query", 1041, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER ( ?v = \"1\" ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery114() throws Exception {
		// gunit test on line 1050
		Object retval = execParser("query", 1050, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER ( ?v = \"zzz\" ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery115() throws Exception {
		// gunit test on line 1059
		Object retval = execParser("query", 1059, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER ( ?v = :z  ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery116() throws Exception {
		// gunit test on line 1068
		Object retval = execParser("query", 1068, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x\r\nWHERE\r\n    { ?x :p 1 . \r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery117() throws Exception {
		// gunit test on line 1076
		Object retval = execParser("query", 1076, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x\r\nWHERE\r\n    { ?x :p 1.0e0 .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery118() throws Exception {
		// gunit test on line 1084
		Object retval = execParser("query", 1084, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x\r\nWHERE\r\n    { ?x :p \"1\"\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery119() throws Exception {
		// gunit test on line 1092
		Object retval = execParser("query", 1092, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x\r\nWHERE\r\n    { ?x :p \"zzz\" .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery120() throws Exception {
		// gunit test on line 1100
		Object retval = execParser("query", 1100, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x\r\nWHERE\r\n    { ?x :p ?v . \r\n      FILTER ( ?v = :z  ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery121() throws Exception {
		// gunit test on line 1109
		Object retval = execParser("query", 1109, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?v1 ?v2\r\nWHERE\r\n    { ?x1 :p ?v1 .\r\n      ?x2 :p ?v2 . \r\n      FILTER ( ?v1 = ?v2 ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery122() throws Exception {
		// gunit test on line 1119
		Object retval = execParser("query", 1119, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?v1 ?v2\r\nWHERE\r\n    { ?x1 :p ?v1 .\r\n      ?x2 :p ?v2 . \r\n      FILTER ( ?v1 != ?v2 ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery123() throws Exception {
		// gunit test on line 1129
		Object retval = execParser("query", 1129, "PREFIX  xsd: <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX  : <http://example.org/things#>\r\nSELECT  ?x1 ?x2 ?v\r\nWHERE\r\n    { ?x1 :p ?v .\r\n      ?x2 :p ?v . \r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery124() throws Exception {
		// gunit test on line 1138
		Object retval = execParser("query", 1138, "PREFIX : <http://example.org/>\r\nSELECT ?s WHERE {\r\n    ?s :p ?o .\r\n    FILTER(?o >= 3) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery125() throws Exception {
		// gunit test on line 1145
		Object retval = execParser("query", 1145, "PREFIX : <http://example.org/>\r\nSELECT ?s WHERE {\r\n    ?s :p ?o .\r\n    FILTER(?o <= 2) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery126() throws Exception {
		// gunit test on line 1152
		Object retval = execParser("query", 1152, "PREFIX : <http://example.org/>\r\nSELECT ?s WHERE {\r\n    ?s :p ?o .\r\n    ?s2 :p ?o2 .\r\n    FILTER(?o - ?o2 = 3) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery127() throws Exception {
		// gunit test on line 1160
		Object retval = execParser("query", 1160, "PREFIX : <http://example.org/>\r\nSELECT ?s WHERE {\r\n    ?s :p ?o .\r\n    ?s2 :p ?o2 .\r\n    FILTER(?o * ?o2 = 4) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery128() throws Exception {
		// gunit test on line 1168
		Object retval = execParser("query", 1168, "PREFIX : <http://example.org/>\r\nSELECT ?s WHERE {\r\n    ?s :p ?o .\r\n    ?s2 :p ?o2 .\r\n    FILTER(?o + ?o2 = 3) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery129() throws Exception {
		// gunit test on line 1176
		Object retval = execParser("query", 1176, "PREFIX : <http://example.org/>\r\nSELECT ?s WHERE {\r\n    ?s :p ?o .\r\n    FILTER(-?o = -2) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery130() throws Exception {
		// gunit test on line 1183
		Object retval = execParser("query", 1183, "PREFIX : <http://example.org/>\r\nSELECT ?s WHERE {\r\n    ?s :p ?o .\r\n    FILTER(?o = +3) .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery131() throws Exception {
		// gunit test on line 1190
		Object retval = execParser("query", 1190, "PREFIX : <http://example/> \r\n\r\nSELECT * { ?s ?p ?o }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery132() throws Exception {
		// gunit test on line 1195
		Object retval = execParser("query", 1195, "PREFIX : <http://example/> \r\n\r\nSELECT * { ?s ?p ?o }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery133() throws Exception {
		// gunit test on line 1200
		Object retval = execParser("query", 1200, "PREFIX : <http://example/> \r\n\r\nSELECT * { \r\n    GRAPH ?g { ?s ?p ?o }\r\n}\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery134() throws Exception {
		// gunit test on line 1208
		Object retval = execParser("query", 1208, "PREFIX : <http://example/> \r\n\r\nSELECT * { \r\n    GRAPH ?g { ?s ?p ?o }\r\n}\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery135() throws Exception {
		// gunit test on line 1216
		Object retval = execParser("query", 1216, "PREFIX : <http://example/> \r\n\r\nSELECT * { ?s ?p ?o }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery136() throws Exception {
		// gunit test on line 1221
		Object retval = execParser("query", 1221, "PREFIX : <http://example/> \r\n\r\nSELECT * { \r\n    GRAPH ?g { ?s ?p ?o }\r\n}\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery137() throws Exception {
		// gunit test on line 1229
		Object retval = execParser("query", 1229, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\n{ \r\n   { ?s ?p ?o }\r\n  UNION\r\n   { GRAPH ?g { ?s ?p ?o } }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery138() throws Exception {
		// gunit test on line 1239
		Object retval = execParser("query", 1239, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\n{ \r\n   ?s ?p ?o\r\n   GRAPH ?g { ?s ?q ?v }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery139() throws Exception {
		// gunit test on line 1248
		Object retval = execParser("query", 1248, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\n{ \r\n   ?s ?p ?o\r\n   GRAPH ?g { ?s ?q ?v }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery140() throws Exception {
		// gunit test on line 1257
		Object retval = execParser("query", 1257, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\n{ \r\n   ?s ?p ?o\r\n   GRAPH ?g { ?s ?q ?v }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery141() throws Exception {
		// gunit test on line 1266
		Object retval = execParser("query", 1266, "PREFIX : <http://example/> \r\n\r\nSELECT * \r\n{ \r\n   { ?s ?p ?o }\r\n  UNION\r\n   { GRAPH ?g { ?s ?p ?o } }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery142() throws Exception {
		// gunit test on line 1276
		Object retval = execParser("query", 1276, "# Example 1 from\r\n# http://lists.w3.org/Archives/Public/public-rdf-dawg/2005JulSep/0096\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\nPREFIX : <http://example/vocab#>\r\nPREFIX p1: <eXAMPLE://a/./b/../b/%63/%7bfoo%7d#>\r\n\r\nSELECT ?S WHERE { ?S :p p1:xyz }\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery143() throws Exception {
		// gunit test on line 1286
		Object retval = execParser("query", 1286, "# Example 2 from\r\n# http://lists.w3.org/Archives/Public/public-rdf-dawg/2005JulSep/0096\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\nPREFIX : <http://example/vocab#>\r\nPREFIX p2: <http://example.com:80/#>\r\n\r\nSELECT ?S WHERE { ?S :p p2:abc }\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery144() throws Exception {
		// gunit test on line 1296
		Object retval = execParser("query", 1296, "PREFIX     :    <http://example/>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT *\r\n{\r\n    ?x :r ?v .\r\n    FILTER ( ?v = \"2006-08-23\"^^xsd:date )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery145() throws Exception {
		// gunit test on line 1306
		Object retval = execParser("query", 1306, "PREFIX     :    <http://example/>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT *\r\n{\r\n    ?x :r ?v .\r\n    FILTER ( ?v != \"2006-08-23\"^^xsd:date )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery146() throws Exception {
		// gunit test on line 1316
		Object retval = execParser("query", 1316, "PREFIX     :    <http://example/>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT *\r\n{\r\n    ?x :r ?v .\r\n    FILTER ( ?v > \"2006-08-22\"^^xsd:date )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery147() throws Exception {
		// gunit test on line 1326
		Object retval = execParser("query", 1326, "PREFIX     :    <http://example/>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?x ?date\r\n{\r\n    ?x :s ?date .\r\n    FILTER ( datatype(?date) = xsd:date )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery148() throws Exception {
		// gunit test on line 1336
		Object retval = execParser("query", 1336, "PREFIX      :    <http://example/> \r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?x ?v1 ?v2\r\n{\r\n    ?x :p [ :v1 ?v1 ; :v2 ?v2 ] .\r\n    FILTER ( ?v1 < ?v2 || ?v1 > ?v2 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery149() throws Exception {
		// gunit test on line 1346
		Object retval = execParser("query", 1346, "PREFIX      :    <http://example/> \r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?x ?v1 ?v2\r\n{\r\n    ?x :p [ :v1 ?v1 ; :v2 ?v2 ] .\r\n    FILTER ( ?v1 < ?v2 || ?v1 = ?v2 || ?v1 > ?v2 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery150() throws Exception {
		// gunit test on line 1356
		Object retval = execParser("query", 1356, "# SPARQL is defined over simple entailment so\r\n# only syntactic matches show.  \r\n# (Some systems may match because they do\r\n# value-based matching in the graph (D-entailment))\r\n\r\n# Does not strictly match \"1\"^xsd:integer\r\n\r\nPREFIX  :       <http://example/ns#>\r\nPREFIX  t:      <http://example/t#>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT *\r\n{ ?x :p \"001\"^^xsd:integer }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery151() throws Exception {
		// gunit test on line 1370
		Object retval = execParser("query", 1370, "# Test matching in a graph pattern\r\n# Unknown type\r\n\r\nPREFIX  :       <http://example/ns#>\r\nPREFIX  t:      <http://example/t#>\r\n\r\nSELECT *\r\n{ ?x :p \"a\"^^t:type1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery152() throws Exception {
		// gunit test on line 1380
		Object retval = execParser("query", 1380, "# SPARQL FILTER test by value.\r\n# A processor knows about XSD integer\r\n# so 1 and 01 pass the filter\r\n\r\nPREFIX  :       <http://example/ns#>\r\nPREFIX  t:      <http://example/t#>\r\nPREFIX  rdf:    <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX  rdfs:   <http://www.w3.org/2000/01/rdf-schema#>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT *\r\n{ ?x :p ?v \r\n  FILTER ( ?v = 1 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery153() throws Exception {
		// gunit test on line 1396
		Object retval = execParser("query", 1396, "# SPARQL FILTER test by value.\r\n# A processor knows about XSD integer\r\n# so 1 and 01 are excluded by the filter\r\n\r\nPREFIX  :       <http://example/ns#>\r\nPREFIX  t:      <http://example/t#>\r\nPREFIX  rdf:    <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX  rdfs:   <http://www.w3.org/2000/01/rdf-schema#>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT *\r\n{ ?x :p ?v \r\n  FILTER ( ?v != 1 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery154() throws Exception {
		// gunit test on line 1412
		Object retval = execParser("query", 1412, "# SPARQL FILTER test by value.\r\n# Only one valus is known to be \"a\"^^t:type1\r\n# (others maybe but the processor does not positively know this)\r\n\r\nPREFIX  :       <http://example/ns#>\r\nPREFIX  t:      <http://example/t#>\r\n\r\nSELECT *\r\n{ ?x :p ?v \r\n  FILTER ( ?v = \"a\"^^t:type1 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery155() throws Exception {
		// gunit test on line 1425
		Object retval = execParser("query", 1425, "# SPARQL FILTER test by value for known types.\r\n# Nothing is known to be not the same value as  \"a\"^^t:type1\r\n#  \"b\"^^t:type1 might be a different lexical form for the same value\r\n#  \"a\"^^t:type2 might have overlapping value spaces for this lexicial form.\r\n\r\nPREFIX  :       <http://example/ns#>\r\nPREFIX  t:      <http://example/t#>\r\n\r\nSELECT *\r\n{ ?x :p ?v \r\n  FILTER ( ?v != \"a\"^^t:type1 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery156() throws Exception {
		// gunit test on line 1439
		Object retval = execParser("query", 1439, "PREFIX     :    <http://example/>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT *\r\n{\r\n    ?x1 :p ?v1 .\r\n    ?x2 :p ?v2 .\r\n    FILTER ( ?v1 = ?v2 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery157() throws Exception {
		// gunit test on line 1450
		Object retval = execParser("query", 1450, "PREFIX     :    <http://example/>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT *\r\n{\r\n    ?x1 :p ?v1 .\r\n    ?x2 :p ?v2 .\r\n    FILTER ( ?v1 != ?v2 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery158() throws Exception {
		// gunit test on line 1461
		Object retval = execParser("query", 1461, "PREFIX     :    <http://example/>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT *\r\n{\r\n    ?x :p ?v1 .\r\n    ?y :q ?v2 .\r\n    FILTER ( ?v1 = ?v2 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery159() throws Exception {
		// gunit test on line 1472
		Object retval = execParser("query", 1472, "PREFIX     :    <http://example/>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT *\r\n{\r\n    ?x :p ?v1 .\r\n    ?y :q ?v2 .\r\n    FILTER ( ?v1 != ?v2 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery160() throws Exception {
		// gunit test on line 1483
		Object retval = execParser("query", 1483, "PREFIX     :    <http://example/>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT *\r\n{\r\n    ?x :p ?v1 .\r\n    ?y :q ?v2 .\r\n    FILTER ( ?v1 != ?v2 || ?v1 = ?v2 )\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery161() throws Exception {
		// gunit test on line 1494
		Object retval = execParser("query", 1494, "PREFIX     :    <http://example/>\r\nPREFIX  xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?x ?v1 ?y ?v2\r\n{\r\n    ?x :p ?v1 .\r\n    ?y :p ?v2 .\r\n    OPTIONAL { ?y :p ?v3 . FILTER( ?v1 != ?v3 || ?v1 = ?v3 )}\r\n    FILTER (!bound(?v3))\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery162() throws Exception {
		// gunit test on line 1506
		Object retval = execParser("query", 1506, "PREFIX  foaf:   <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?mbox ?name\r\n   {\r\n     ?x foaf:mbox ?mbox .\r\n     OPTIONAL { ?x foaf:name  ?name } .\r\n   }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery163() throws Exception {
		// gunit test on line 1515
		Object retval = execParser("query", 1515, "PREFIX  foaf:   <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?mbox ?name ?nick\r\n   {\r\n     ?x foaf:mbox ?mbox .\r\n     OPTIONAL { ?x foaf:name  ?name } .\r\n     OPTIONAL { ?x foaf:nick  ?nick } .\r\n   }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery164() throws Exception {
		// gunit test on line 1525
		Object retval = execParser("query", 1525, "PREFIX  foaf:   <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?mbox ?name\r\n   {\r\n     { ?x foaf:mbox ?mbox }\r\n   UNION \r\n     { ?x foaf:mbox ?mbox . ?x foaf:name  ?name }\r\n   }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery165() throws Exception {
		// gunit test on line 1535
		Object retval = execParser("query", 1535, "PREFIX  foaf:   <http://xmlns.com/foaf/0.1/>\r\nSELECT ?person ?nick ?page ?img ?name ?firstN\r\n{ \r\n    ?person foaf:nick ?nick\r\n    OPTIONAL { ?person foaf:isPrimaryTopicOf ?page } \r\n    OPTIONAL { \r\n        ?person foaf:name ?name \r\n        { ?person foaf:depiction ?img } UNION \r\n        { ?person foaf:firstName ?firstN } \r\n    } FILTER ( bound(?page) || bound(?img) || bound(?firstN) ) \r\n} ", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery166() throws Exception {
		// gunit test on line 1547
		Object retval = execParser("query", 1547, "PREFIX  foaf:   <http://xmlns.com/foaf/0.1/>\r\nPREFIX    ex:   <http://example.org/things#>\r\nSELECT ?id ?ssn\r\nWHERE \r\n{ \r\n    ?person \r\n        a foaf:Person;\r\n        foaf:name ?name . \r\n    GRAPH ?x { \r\n        [] foaf:name ?name;\r\n           foaf:nick ?nick\r\n    } \r\n    OPTIONAL { \r\n        { ?person ex:empId ?id } UNION { ?person ex:ssn ?ssn } \r\n    } \r\n} ", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery167() throws Exception {
		// gunit test on line 1564
		Object retval = execParser("query", 1564, "PREFIX  foaf:   <http://xmlns.com/foaf/0.1/>\r\nPREFIX    ex:   <http://example.org/things#>\r\nSELECT ?name ?nick ?plan ?dept\r\nWHERE \r\n{ \r\n    ?person \r\n        a foaf:Person;\r\n        foaf:name ?name . \r\n    GRAPH ?x { \r\n        [] foaf:name ?name;\r\n           foaf:nick ?nick\r\n    } \r\n    OPTIONAL { \r\n        ?person ex:healthplan ?plan \r\n        OPTIONAL { ?person ex:department ?dept } \r\n    } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery168() throws Exception {
		// gunit test on line 1582
		Object retval = execParser("query", 1582, "PREFIX  foaf:   <http://xmlns.com/foaf/0.1/>\r\nPREFIX    ex:   <http://example.org/things#>\r\nSELECT ?name ?plan ?dept ?img \r\nWHERE \r\n{ \r\n    ?person foaf:name ?name  \r\n    { ?person ex:healthplan ?plan } UNION { ?person ex:department ?dept } \r\n    OPTIONAL { \r\n        ?person a foaf:Person\r\n        GRAPH ?g { \r\n            [] foaf:name ?name;\r\n               foaf:depiction ?img \r\n        } \r\n    } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery169() throws Exception {
		// gunit test on line 1598
		Object retval = execParser("query", 1598, "PREFIX  dc: <http://purl.org/dc/elements/1.1/>\r\nPREFIX  x: <http://example.org/ns#>\r\nSELECT  ?title ?price\r\nWHERE\r\n    { ?book dc:title ?title . \r\n      OPTIONAL\r\n        { ?book x:price ?price . \r\n          FILTER (?price < 15) .\r\n        } .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery170() throws Exception {
		// gunit test on line 1610
		Object retval = execParser("query", 1610, "PREFIX  dc: <http://purl.org/dc/elements/1.1/>\r\nPREFIX  x: <http://example.org/ns#>\r\nSELECT  ?title ?price\r\nWHERE\r\n    { ?book dc:title ?title . \r\n      OPTIONAL\r\n        { ?book x:price ?price } . \r\n      FILTER (?price < 15)  .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery171() throws Exception {
		// gunit test on line 1621
		Object retval = execParser("query", 1621, "PREFIX  dc: <http://purl.org/dc/elements/1.1/>\r\nPREFIX  x: <http://example.org/ns#>\r\nSELECT  ?title ?price\r\nWHERE\r\n    { ?book dc:title ?title . \r\n      OPTIONAL\r\n        { ?book x:price ?price } . \r\n      FILTER ( ( ! bound(?price) ) || ( ?price < 15 ) ) .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery172() throws Exception {
		// gunit test on line 1632
		Object retval = execParser("query", 1632, "PREFIX  dc: <http://purl.org/dc/elements/1.1/>\r\nPREFIX  x: <http://example.org/ns#>\r\nSELECT  ?title ?price\r\nWHERE\r\n    { ?book dc:title ?title . \r\n      OPTIONAL\r\n        { ?book x:price ?price . \r\n          FILTER (?price < 15 && ?title = \"TITLE 2\") .\r\n        } .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery173() throws Exception {
		// gunit test on line 1644
		Object retval = execParser("query", 1644, "PREFIX  dc: <http://purl.org/dc/elements/1.1/>\r\nPREFIX  x: <http://example.org/ns#>\r\nSELECT  ?title ?price\r\nWHERE\r\n    { ?book dc:title ?title . \r\n      OPTIONAL\r\n        {\r\n          { \r\n            ?book x:price ?price . \r\n            FILTER (?title = \"TITLE 2\") .\r\n          }\r\n        } .\r\n    }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery174() throws Exception {
		// gunit test on line 1659
		Object retval = execParser("query", 1659, "PREFIX :         <http://example/> \r\nPREFIX xsd:      <http://www.w3.org/2001/XMLSchema#> \r\nSELECT REDUCED * \r\nWHERE { \r\n  { ?s :p ?o } UNION { ?s :q ?o }\r\n}\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery175() throws Exception {
		// gunit test on line 1668
		Object retval = execParser("query", 1668, "PREFIX :      <http://example/> \r\nPREFIX xsd:   <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT REDUCED ?v\r\n{\r\n    ?x ?p ?v .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery176() throws Exception {
		// gunit test on line 1677
		Object retval = execParser("query", 1677, "PREFIX  rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX  ex: <http://example.com/#>\r\n\r\nSELECT ?val\r\nWHERE {\r\n\tex:foo rdf:value ?val .\r\n\tFILTER regex(?val, \"GHI\")\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery177() throws Exception {
		// gunit test on line 1687
		Object retval = execParser("query", 1687, "PREFIX  ex: <http://example.com/#>\r\nPREFIX  rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\n\r\nSELECT ?val\r\nWHERE {\r\n\tex:foo rdf:value ?val .\r\n\tFILTER regex(?val, \"DeFghI\", \"i\")\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery178() throws Exception {
		// gunit test on line 1697
		Object retval = execParser("query", 1697, "PREFIX  rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX  ex:  <http://example.com/#>\r\n\r\nSELECT ?val\r\nWHERE {\r\n\tex:foo rdf:value ?val .\r\n\tFILTER regex(?val, \"example\\\\.com\")\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery179() throws Exception {
		// gunit test on line 1707
		Object retval = execParser("query", 1707, "PREFIX  rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX  ex: <http://example.com/#>\r\nSELECT ?val\r\nWHERE {\r\n\tex:foo rdf:value ?val .\r\n\tFILTER regex(str(?val), \"example\\\\.com\")\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery180() throws Exception {
		// gunit test on line 1716
		Object retval = execParser("query", 1716, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?v\r\nWHERE { [] :num ?v }\r\nORDER BY ?v\r\nLIMIT 1", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery181() throws Exception {
		// gunit test on line 1724
		Object retval = execParser("query", 1724, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?v\r\nWHERE { [] :num ?v }\r\nORDER BY ?v\r\nLIMIT 100\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery182() throws Exception {
		// gunit test on line 1733
		Object retval = execParser("query", 1733, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?v\r\nWHERE { [] :num ?v }\r\nORDER BY ?v\r\nLIMIT 0", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery183() throws Exception {
		// gunit test on line 1741
		Object retval = execParser("query", 1741, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT DISTINCT ?v\r\nWHERE { [] :num ?v }\r\nORDER BY ?v\r\nLIMIT 100", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery184() throws Exception {
		// gunit test on line 1749
		Object retval = execParser("query", 1749, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?v\r\nWHERE { [] :num ?v }\r\nORDER BY ?v\r\nOFFSET 1", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery185() throws Exception {
		// gunit test on line 1757
		Object retval = execParser("query", 1757, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?v\r\nWHERE { [] :num ?v }\r\nORDER BY ?v\r\nOFFSET 0", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery186() throws Exception {
		// gunit test on line 1765
		Object retval = execParser("query", 1765, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?v\r\nWHERE { [] :num ?v }\r\nORDER BY ?v\r\nOFFSET 100", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery187() throws Exception {
		// gunit test on line 1773
		Object retval = execParser("query", 1773, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT DISTINCT ?v\r\nWHERE { [] :num ?v }\r\nORDER BY ?v\r\nOFFSET 2", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery188() throws Exception {
		// gunit test on line 1781
		Object retval = execParser("query", 1781, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?v\r\nWHERE { [] :num ?v }\r\nORDER BY ?v\r\nLIMIT 1\r\nOFFSET 1\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery189() throws Exception {
		// gunit test on line 1791
		Object retval = execParser("query", 1791, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?v\r\nWHERE { [] :num ?v }\r\nORDER BY ?v\r\nOFFSET 1\r\nLIMIT 2", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery190() throws Exception {
		// gunit test on line 1799
		Object retval = execParser("query", 1799, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT ?v\r\nWHERE { [] ?p ?v }\r\nORDER BY ?v\r\nOFFSET 100\r\nLIMIT 1", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery191() throws Exception {
		// gunit test on line 1807
		Object retval = execParser("query", 1807, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT  ?v\r\nWHERE { [] :num ?v }\r\nORDER BY ?v\r\nOFFSET 2\r\nLIMIT 5", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery192() throws Exception {
		// gunit test on line 1815
		Object retval = execParser("query", 1815, "PREFIX : <http://example.org/ns#>\r\n\r\nSELECT  DISTINCT ?v\r\nWHERE { [] :num ?v }\r\nORDER BY ?v\r\nOFFSET 2\r\nLIMIT 5", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery193() throws Exception {
		// gunit test on line 1824
		Object retval = execParser("query", 1824, "PREFIX foaf:       <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name\r\nWHERE { ?x foaf:name ?name }\r\nORDER BY ?name", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery194() throws Exception {
		// gunit test on line 1830
		Object retval = execParser("query", 1830, "PREFIX foaf:       <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name\r\nWHERE { ?x foaf:name ?name }\r\nORDER BY DESC(?name)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery195() throws Exception {
		// gunit test on line 1836
		Object retval = execParser("query", 1836, "PREFIX foaf:       <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name\r\nWHERE { ?x foaf:name ?name }\r\nORDER BY DESC(?name)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery196() throws Exception {
		// gunit test on line 1842
		Object retval = execParser("query", 1842, "PREFIX foaf:       <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\nWHERE { ?x foaf:name ?name .\r\n           OPTIONAL { ?x foaf:mbox ?mbox }\r\n      }\r\nORDER BY ASC(?mbox)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery197() throws Exception {
		// gunit test on line 1850
		Object retval = execParser("query", 1850, "PREFIX foaf:       <http://xmlns.com/foaf/0.1/>\r\nPREFIX ex:        <http://example.org/things#> \r\n\r\nSELECT ?name ?emp\r\nWHERE { ?x foaf:name ?name ;\r\n           ex:empId ?emp\r\n      }\r\nORDER BY ASC(?emp)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery198() throws Exception {
		// gunit test on line 1860
		Object retval = execParser("query", 1860, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nPREFIX ex:      <http://example.org/things#> \r\n\r\nSELECT ?name ?emp\r\nWHERE { ?x foaf:name ?name ; \r\n           ex:empId ?emp \r\n      }\r\nORDER BY ?name DESC(?emp)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery199() throws Exception {
		// gunit test on line 1870
		Object retval = execParser("query", 1870, "PREFIX ex:      <http://example.org/things#> \r\n\r\nSELECT ?address\r\nWHERE { ?x ex:address ?address }\r\nORDER BY ASC(?address)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery200() throws Exception {
		// gunit test on line 1877
		Object retval = execParser("query", 1877, "PREFIX foaf:       <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name\r\nWHERE { ?x foaf:name ?name }\r\nORDER BY ?name", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery201() throws Exception {
		// gunit test on line 1883
		Object retval = execParser("query", 1883, "PREFIX : <http://example.org/>\r\nSELECT ?s WHERE {\r\n  ?s :p ?o .\r\n} ORDER BY str(?o)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery202() throws Exception {
		// gunit test on line 1889
		Object retval = execParser("query", 1889, "PREFIX : <http://example.org/>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nSELECT ?s WHERE {\r\n  ?s :p ?o .\r\n} ORDER BY xsd:integer(?o)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery203() throws Exception {
		// gunit test on line 1896
		Object retval = execParser("query", 1896, "PREFIX : <http://example.org/>\r\nSELECT ?s WHERE {\r\n  ?s :p ?o1 ; :q ?o2 .\r\n} ORDER BY (?o1 + ?o2)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery204() throws Exception {
		// gunit test on line 1902
		Object retval = execParser("query", 1902, "SELECT *\r\nWHERE { }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery205() throws Exception {
		// gunit test on line 1906
		Object retval = execParser("query", 1906, "SELECT * {}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery206() throws Exception {
		// gunit test on line 1909
		Object retval = execParser("query", 1909, "# No trailing dot\r\nPREFIX : <http://example.org/ns#> \r\nSELECT *\r\nWHERE { ?x ?y ?z }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery207() throws Exception {
		// gunit test on line 1915
		Object retval = execParser("query", 1915, "# With trailing dot\r\nSELECT *\r\nWHERE { ?x ?y ?z . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery208() throws Exception {
		// gunit test on line 1920
		Object retval = execParser("query", 1920, "# Two triples : no trailing dot\r\nSELECT *\r\nWHERE { ?x ?y ?z . ?a ?b ?c }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery209() throws Exception {
		// gunit test on line 1925
		Object retval = execParser("query", 1925, "# Two triples : with trailing dot\r\nSELECT *\r\nWHERE { ?x ?y ?z . ?a ?b ?c . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery210() throws Exception {
		// gunit test on line 1930
		Object retval = execParser("query", 1930, "PREFIX : <http://example.org/ns#>\r\nSELECT * WHERE { [:p :q ] }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery211() throws Exception {
		// gunit test on line 1934
		Object retval = execParser("query", 1934, "PREFIX : <http://example.org/ns#>\r\nSELECT * WHERE { [] :p :q }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery212() throws Exception {
		// gunit test on line 1938
		Object retval = execParser("query", 1938, "PREFIX : <http://example.org/ns#>\r\nSELECT * WHERE { [ ?x ?y ] :p [ ?pa ?b ] }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery213() throws Exception {
		// gunit test on line 1942
		Object retval = execParser("query", 1942, "PREFIX : <http://example.org/ns#> \r\nSELECT *\r\nWHERE { [ :p :q ; ] }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery214() throws Exception {
		// gunit test on line 1947
		Object retval = execParser("query", 1947, "PREFIX : <http://example.org/ns#> \r\nSELECT *\r\nWHERE { _:a :p1 :q1 .\r\n        _:a :p2 :q2 .\r\n      }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery215() throws Exception {
		// gunit test on line 1954
		Object retval = execParser("query", 1954, "SELECT *\r\nWHERE { ?s ?p ?o . FILTER (?o) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery216() throws Exception {
		// gunit test on line 1958
		Object retval = execParser("query", 1958, "SELECT *\r\nWHERE { ?s ?p ?o . FILTER REGEX(?o, \"foo\") }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery217() throws Exception {
		// gunit test on line 1962
		Object retval = execParser("query", 1962, "SELECT *\r\nWHERE { ?s ?p ?o . FILTER REGEX(?o, \"foo\", \"i\") }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery218() throws Exception {
		// gunit test on line 1966
		Object retval = execParser("query", 1966, "PREFIX xsd:   <http://www.w3.org/2001/XMLSchema#>\r\nSELECT *\r\nWHERE { ?s ?p ?o . FILTER xsd:integer(?o) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery219() throws Exception {
		// gunit test on line 1971
		Object retval = execParser("query", 1971, "PREFIX :      <http://example.org/ns#> \r\nPREFIX xsd:   <http://www.w3.org/2001/XMLSchema#>\r\nSELECT *\r\nWHERE { ?s ?p ?o . FILTER :myFunc(?s,?o) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery220() throws Exception {
		// gunit test on line 1977
		Object retval = execParser("query", 1977, "PREFIX : <http://example.org/ns#>\r\nSELECT * WHERE { ( [ ?x ?y ] ) :p ( [ ?pa ?b ] 57 ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery221() throws Exception {
		// gunit test on line 1981
		Object retval = execParser("query", 1981, "PREFIX : <http://example.org/ns#>\r\nSELECT * WHERE { ( [] [] ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery222() throws Exception {
		// gunit test on line 1985
		Object retval = execParser("query", 1985, "PREFIX :      <http://example.org/ns#> \r\nSELECT *\r\n{ ?s ?p ?o }\r\nORDER BY ?o\r\nLIMIT 5", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery223() throws Exception {
		// gunit test on line 1992
		Object retval = execParser("query", 1992, "# LIMIT and OFFSET can be in either order\r\nPREFIX :      <http://example.org/ns#> \r\nSELECT *\r\n{ ?s ?p ?o }\r\nORDER BY ?o\r\nLIMIT 5\r\nOFFSET 3", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery224() throws Exception {
		// gunit test on line 2001
		Object retval = execParser("query", 2001, "# LIMIT and OFFSET can be in either order\r\nPREFIX :      <http://example.org/ns#> \r\nSELECT *\r\n{ ?s ?p ?o }\r\nORDER BY ?o\r\nOFFSET 3\r\nLIMIT 5", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery225() throws Exception {
		// gunit test on line 2010
		Object retval = execParser("query", 2010, "PREFIX :      <http://example.org/ns#> \r\nSELECT *\r\n{ ?s ?p ?o }\r\nORDER BY ?o\r\nOFFSET 3", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery226() throws Exception {
		// gunit test on line 2017
		Object retval = execParser("query", 2017, "PREFIX : <http://example.org/ns#> \r\nSELECT * WHERE { ( ?x ) :p ?z  }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery227() throws Exception {
		// gunit test on line 2021
		Object retval = execParser("query", 2021, "PREFIX : <http://example.org/ns#> \r\nSELECT * WHERE { ?x :p ( ?z ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery228() throws Exception {
		// gunit test on line 2025
		Object retval = execParser("query", 2025, "SELECT * WHERE { ( ?z ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery229() throws Exception {
		// gunit test on line 2028
		Object retval = execParser("query", 2028, "SELECT * WHERE { ( ( ?z ) ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery230() throws Exception {
		// gunit test on line 2031
		Object retval = execParser("query", 2031, "SELECT * WHERE { ( ( ) ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery231() throws Exception {
		// gunit test on line 2034
		Object retval = execParser("query", 2034, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p \"x\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery232() throws Exception {
		// gunit test on line 2039
		Object retval = execParser("query", 2039, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p 'x' }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery233() throws Exception {
		// gunit test on line 2044
		Object retval = execParser("query", 2044, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p \"x\\\"y'z\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery234() throws Exception {
		// gunit test on line 2049
		Object retval = execParser("query", 2049, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p 'x\"y\\'z' }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery235() throws Exception {
		// gunit test on line 2054
		Object retval = execParser("query", 2054, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p \"x\\\"\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery236() throws Exception {
		// gunit test on line 2059
		Object retval = execParser("query", 2059, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p 'x\\'' }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery237() throws Exception {
		// gunit test on line 2064
		Object retval = execParser("query", 2064, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p 123 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery238() throws Exception {
		// gunit test on line 2069
		Object retval = execParser("query", 2069, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p 123. . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery239() throws Exception {
		// gunit test on line 2074
		Object retval = execParser("query", 2074, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p \"\"\"Long\r\n\"\"\r\nLiteral\r\n\"\"\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery240() throws Exception {
		// gunit test on line 2082
		Object retval = execParser("query", 2082, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p '''Long\r\n'' \"\"\"\r\nLiteral''' }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery241() throws Exception {
		// gunit test on line 2089
		Object retval = execParser("query", 2089, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p \"\"\"Long\"\"\\\"Literal\"\"\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery242() throws Exception {
		// gunit test on line 2094
		Object retval = execParser("query", 2094, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p '''Long''\\'Literal''' }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery243() throws Exception {
		// gunit test on line 2099
		Object retval = execParser("query", 2099, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p \"\"\"Long\\\"\"\"Literal\"\"\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery244() throws Exception {
		// gunit test on line 2104
		Object retval = execParser("query", 2104, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p '''Long\\'''Literal''' }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery245() throws Exception {
		// gunit test on line 2109
		Object retval = execParser("query", 2109, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p '''Long '' Literal''' }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery246() throws Exception {
		// gunit test on line 2114
		Object retval = execParser("query", 2114, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p '''Long ' Literal''' }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery247() throws Exception {
		// gunit test on line 2119
		Object retval = execParser("query", 2119, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p '''Long''\\\\Literal with '\\\\ single quotes ''' }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery248() throws Exception {
		// gunit test on line 2124
		Object retval = execParser("query", 2124, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p \"\"\"Long \"\" Literal\"\"\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery249() throws Exception {
		// gunit test on line 2129
		Object retval = execParser("query", 2129, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p \"\"\"Long \" Literal\"\"\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery250() throws Exception {
		// gunit test on line 2134
		Object retval = execParser("query", 2134, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT * WHERE { :x :p \"\"\"Long\"\"\\\\Literal with \"\\\\ single quotes\"\"\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery251() throws Exception {
		// gunit test on line 2139
		Object retval = execParser("query", 2139, "PREFIX :      <http://example.org/ns#> \r\nSELECT *\r\n{ ?s ?p ?o }\r\nORDER BY ?o", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery252() throws Exception {
		// gunit test on line 2145
		Object retval = execParser("query", 2145, "PREFIX :      <http://example.org/ns#> \r\nSELECT *\r\n{ ?s ?p ?o }\r\nORDER BY (?o+5)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery253() throws Exception {
		// gunit test on line 2151
		Object retval = execParser("query", 2151, "PREFIX :      <http://example.org/ns#> \r\nSELECT *\r\n{ ?s ?p ?o }\r\nORDER BY ASC(?o)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery254() throws Exception {
		// gunit test on line 2157
		Object retval = execParser("query", 2157, "PREFIX :      <http://example.org/ns#> \r\nSELECT *\r\n{ ?s ?p ?o }\r\nORDER BY DESC(?o)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery255() throws Exception {
		// gunit test on line 2163
		Object retval = execParser("query", 2163, "PREFIX :      <http://example.org/ns#> \r\nSELECT *\r\n{ ?s ?p ?o }\r\nORDER BY DESC(:func(?s, ?o))", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery256() throws Exception {
		// gunit test on line 2169
		Object retval = execParser("query", 2169, "PREFIX :      <http://example.org/ns#> \r\nSELECT *\r\n{ ?s ?p ?o }\r\nORDER BY \r\n  DESC(?o+57) :func2(?o) ASC(?s)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery257() throws Exception {
		// gunit test on line 2176
		Object retval = execParser("query", 2176, "PREFIX :      <http://example.org/ns#> \r\nSELECT *\r\n{ ?s ?p ?o }\r\nORDER BY str(?o)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery258() throws Exception {
		// gunit test on line 2182
		Object retval = execParser("query", 2182, "PREFIX : <http://example.org/ns#> \r\nSELECT *\r\n{ }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery259() throws Exception {
		// gunit test on line 2187
		Object retval = execParser("query", 2187, "# No DOT after optional\r\nPREFIX : <http://example.org/ns#> \r\nSELECT *\r\n{ ?a :b :c OPTIONAL{:x :y :z} :x ?y ?z }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery260() throws Exception {
		// gunit test on line 2193
		Object retval = execParser("query", 2193, "# No DOT between non-triples patterns\r\nPREFIX : <http://example.org/ns#> \r\nSELECT *\r\n{ ?a :b :c \r\n  OPTIONAL{:x :y :z} \r\n  { :x1 :y1 :z1 } UNION { :x2 :y2 :z2 }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery261() throws Exception {
		// gunit test on line 2202
		Object retval = execParser("query", 2202, "# No DOT between non-triples patterns\r\nPREFIX : <http://example.org/ns#> \r\nSELECT *\r\n{\r\n  OPTIONAL{:x :y :z} \r\n  ?a :b :c \r\n  { :x1 :y1 :z1 } UNION { :x2 :y2 :z2 }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery262() throws Exception {
		// gunit test on line 2212
		Object retval = execParser("query", 2212, "PREFIX : <http://example.org/ns#> \r\nSELECT *\r\n{ ?x :p ?z }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery263() throws Exception {
		// gunit test on line 2217
		Object retval = execParser("query", 2217, "PREFIX : <http://example.org/ns#> \r\nSELECT *\r\nWHERE { :x :p :z . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery264() throws Exception {
		// gunit test on line 2222
		Object retval = execParser("query", 2222, "PREFIX : <http://example.org/ns#> \r\nSELECT *\r\nWHERE { :_1 :p.rdf :z.z . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery265() throws Exception {
		// gunit test on line 2227
		Object retval = execParser("query", 2227, "PREFIX :  <http://example.org/ns#> \r\nPREFIX a: <http://example.org/ns2#> \r\nSELECT *\r\nWHERE { : a: :a . : : : . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery266() throws Exception {
		// gunit test on line 2233
		Object retval = execParser("query", 2233, "PREFIX :  <> \r\nSELECT *\r\nWHERE { : : : . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery267() throws Exception {
		// gunit test on line 2238
		Object retval = execParser("query", 2238, "PREFIX :  <#> \r\nSELECT *\r\nWHERE { : : : . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery268() throws Exception {
		// gunit test on line 2243
		Object retval = execParser("query", 2243, "BASE   <http://example.org/>\r\nPREFIX :  <#> \r\nSELECT *\r\nWHERE { : : : . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery269() throws Exception {
		// gunit test on line 2249
		Object retval = execParser("query", 2249, "BASE   <http://example.org/>\r\nPREFIX :  <#>\r\nPREFIX x.y:  <x#>\r\nSELECT *\r\nWHERE { :a.b  x.y:  : . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery270() throws Exception {
		// gunit test on line 2256
		Object retval = execParser("query", 2256, "# Operator\r\nPREFIX :  <http://example.org/ns#> \r\nSELECT *\r\n{ OPTIONAL { } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery271() throws Exception {
		// gunit test on line 2262
		Object retval = execParser("query", 2262, "# Operator\r\nPREFIX :  <http://example.org/ns#> \r\nSELECT *\r\n{ OPTIONAL { :a :b :c } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery272() throws Exception {
		// gunit test on line 2268
		Object retval = execParser("query", 2268, "# Triple, no DOT, operator\r\nPREFIX :  <http://example.org/ns#> \r\nSELECT *\r\n{ :p :q :r OPTIONAL { :a :b :c } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery273() throws Exception {
		// gunit test on line 2274
		Object retval = execParser("query", 2274, "# Triple, DOT, operator\r\nPREFIX :  <http://example.org/ns#> \r\nSELECT *\r\n{ :p :q :r . OPTIONAL { :a :b :c } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery274() throws Exception {
		// gunit test on line 2280
		Object retval = execParser("query", 2280, "# Triple, DOT, operator, DOT\r\nPREFIX :  <http://example.org/ns#> \r\nSELECT *\r\n{ :p :q :r . OPTIONAL { :a :b :c } . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery275() throws Exception {
		// gunit test on line 2286
		Object retval = execParser("query", 2286, "# Operator, no DOT\r\nPREFIX :  <http://example.org/ns#> \r\nSELECT *\r\n{ OPTIONAL { :a :b :c } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery276() throws Exception {
		// gunit test on line 2292
		Object retval = execParser("query", 2292, "# Operator, DOT\r\nPREFIX :  <http://example.org/ns#> \r\nSELECT *\r\n{ OPTIONAL { :a :b :c } . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery277() throws Exception {
		// gunit test on line 2298
		Object retval = execParser("query", 2298, "# Operator, triple\r\nPREFIX :  <http://example.org/ns#> \r\nSELECT *\r\n{ OPTIONAL { :a :b :c } ?x ?y ?z }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery278() throws Exception {
		// gunit test on line 2304
		Object retval = execParser("query", 2304, "# Operator, DOT triple\r\nPREFIX :  <http://example.org/ns#> \r\nSELECT *\r\n{ OPTIONAL { :a :b :c } . ?x ?y ?z }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery279() throws Exception {
		// gunit test on line 2310
		Object retval = execParser("query", 2310, "# Triple, semi, operator\r\nPREFIX :  <http://example.org/ns#>\r\nSELECT *\r\n{ :p :q :r ; OPTIONAL { :a :b :c } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery280() throws Exception {
		// gunit test on line 2316
		Object retval = execParser("query", 2316, "# Triple, semi, DOT, operator\r\nPREFIX :  <http://example.org/ns#>\r\nSELECT *\r\n{ :p :q :r ; . OPTIONAL { :a :b :c } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery281() throws Exception {
		// gunit test on line 2322
		Object retval = execParser("query", 2322, "# Two elements in the group\r\nPREFIX :  <http://example.org/ns#>\r\nSELECT *\r\n{ :p :q :r . OPTIONAL { :a :b :c } \r\n  :p :q :r . OPTIONAL { :a :b :c } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery282() throws Exception {
		// gunit test on line 2330
		Object retval = execParser("query", 2330, "# Two elements in the group\r\nPREFIX :  <http://example.org/ns#>\r\nSELECT *\r\n{ :p :q :r  OPTIONAL { :a :b :c } \r\n  :p :q :r  OPTIONAL { :a :b :c } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery283() throws Exception {
		// gunit test on line 2338
		Object retval = execParser("query", 2338, "PREFIX : <http://example.org/ns#>\r\nSELECT *\r\n{\r\n  { ?s ?p ?o } UNION { ?a ?b ?c } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery284() throws Exception {
		// gunit test on line 2345
		Object retval = execParser("query", 2345, "PREFIX : <http://example.org/ns#>\r\nSELECT *\r\n{\r\n  { ?s ?p ?o } UNION { ?a ?b ?c } UNION { ?r ?s ?t }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery285() throws Exception {
		// gunit test on line 2352
		Object retval = execParser("query", 2352, "PREFIX : <http://example.org/>\r\nSELECT * WHERE { [] :p [] }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery286() throws Exception {
		// gunit test on line 2356
		Object retval = execParser("query", 2356, "PREFIX : <http://example.org/>\r\n# Tab\r\nSELECT * WHERE { [ ] :p [\r\n\t] }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery287() throws Exception {
		// gunit test on line 2362
		Object retval = execParser("query", 2362, "PREFIX : <http://example.org/>\r\nSELECT * WHERE { [ :p :q \r\n ] }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery288() throws Exception {
		// gunit test on line 2367
		Object retval = execParser("query", 2367, "PREFIX : <http://example.org/>\r\nSELECT ?x\r\nFROM <http://example.org/graph>\r\nWHERE {}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery289() throws Exception {
		// gunit test on line 2373
		Object retval = execParser("query", 2373, "PREFIX : <http://example.org/>\r\nSELECT ?x\r\nFROM NAMED <http://example.org/graph1>\r\nWHERE {}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery290() throws Exception {
		// gunit test on line 2379
		Object retval = execParser("query", 2379, "PREFIX : <http://example.org/>\r\nSELECT ?x\r\nFROM NAMED :graph1\r\nFROM NAMED :graph2\r\nWHERE {}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery291() throws Exception {
		// gunit test on line 2386
		Object retval = execParser("query", 2386, "PREFIX : <http://example.org/>\r\nSELECT ?x\r\nFROM :g1\r\nFROM :g2\r\nFROM NAMED :graph1\r\nFROM NAMED :graph2\r\nWHERE {}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery292() throws Exception {
		// gunit test on line 2395
		Object retval = execParser("query", 2395, "SELECT *\r\nWHERE { <x> <p> \"\\t\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery293() throws Exception {
		// gunit test on line 2399
		Object retval = execParser("query", 2399, "SELECT *\r\nWHERE { <x> <p> \"x\\t\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery294() throws Exception {
		// gunit test on line 2403
		Object retval = execParser("query", 2403, "SELECT *\r\nWHERE { <x> <p> \"\\tx\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery295() throws Exception {
		// gunit test on line 2408
		Object retval = execParser("query", 2408, "ASK {}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery296() throws Exception {
		// gunit test on line 2411
		Object retval = execParser("query", 2411, "CONSTRUCT { ?s <p1> <o> . ?s <p2> ?o } WHERE {?s ?p ?o}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery297() throws Exception {
		// gunit test on line 2414
		Object retval = execParser("query", 2414, "CONSTRUCT { ?s <p1> <o> . ?s <p2> ?o .} WHERE {?s ?p ?o}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery298() throws Exception {
		// gunit test on line 2417
		Object retval = execParser("query", 2417, "PREFIX  rdf:    <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nCONSTRUCT { [] rdf:subject ?s ;\r\n               rdf:predicate ?p ;\r\n               rdf:object ?o }\r\nWHERE {?s ?p ?o}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery299() throws Exception {
		// gunit test on line 2424
		Object retval = execParser("query", 2424, "PREFIX  rdf:    <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nCONSTRUCT { [] rdf:subject ?s ;\r\n               rdf:predicate ?p ;\r\n               rdf:object ?o . }\r\nWHERE {?s ?p ?o}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery300() throws Exception {
		// gunit test on line 2431
		Object retval = execParser("query", 2431, "CONSTRUCT {} WHERE {}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery301() throws Exception {
		// gunit test on line 2434
		Object retval = execParser("query", 2434, "DESCRIBE <u>", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery302() throws Exception {
		// gunit test on line 2437
		Object retval = execParser("query", 2437, "DESCRIBE <u> ?u WHERE { <x> <q> ?u . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery303() throws Exception {
		// gunit test on line 2440
		Object retval = execParser("query", 2440, "SELECT * WHERE { }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery304() throws Exception {
		// gunit test on line 2443
		Object retval = execParser("query", 2443, "SELECT * { }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery305() throws Exception {
		// gunit test on line 2446
		Object retval = execParser("query", 2446, "PREFIX q: <http://example.org/>\r\nSELECT * WHERE { FILTER (q:name()) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery306() throws Exception {
		// gunit test on line 2450
		Object retval = execParser("query", 2450, "PREFIX q: <http://example.org/>\r\nSELECT * WHERE { FILTER (q:name( )) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery307() throws Exception {
		// gunit test on line 2454
		Object retval = execParser("query", 2454, "PREFIX q: <http://example.org/>\r\nSELECT * WHERE { FILTER (q:name(\r\n)) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery308() throws Exception {
		// gunit test on line 2459
		Object retval = execParser("query", 2459, "PREFIX q: <http://example.org/>\r\nSELECT * WHERE { FILTER (q:name(1\r\n)) . FILTER (q:name(1,2)) . FILTER (q:name(1\r\n,2))}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery309() throws Exception {
		// gunit test on line 2465
		Object retval = execParser("query", 2465, "SELECT * WHERE { <a><b><c> }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery310() throws Exception {
		// gunit test on line 2468
		Object retval = execParser("query", 2468, "SELECT * WHERE { <a><b>_:x }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery311() throws Exception {
		// gunit test on line 2471
		Object retval = execParser("query", 2471, "SELECT * WHERE { <a><b>1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery312() throws Exception {
		// gunit test on line 2474
		Object retval = execParser("query", 2474, "SELECT * WHERE { <a><b>+11 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery313() throws Exception {
		// gunit test on line 2477
		Object retval = execParser("query", 2477, "SELECT * WHERE { <a><b>-1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery314() throws Exception {
		// gunit test on line 2480
		Object retval = execParser("query", 2480, "SELECT * WHERE { <a><b>1.0 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery315() throws Exception {
		// gunit test on line 2483
		Object retval = execParser("query", 2483, "SELECT * WHERE { <a><b>+1.0 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery316() throws Exception {
		// gunit test on line 2486
		Object retval = execParser("query", 2486, "SELECT * WHERE { <a><b>-1.0 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery317() throws Exception {
		// gunit test on line 2489
		Object retval = execParser("query", 2489, "SELECT * WHERE { <a><b>1.0e0 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery318() throws Exception {
		// gunit test on line 2492
		Object retval = execParser("query", 2492, "SELECT * WHERE { <a><b>+1.0e+1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery319() throws Exception {
		// gunit test on line 2495
		Object retval = execParser("query", 2495, "SELECT * WHERE { <a><b>-1.0e-1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery320() throws Exception {
		// gunit test on line 2498
		Object retval = execParser("query", 2498, "# Legal, if unusual, IRIs\r\nSELECT * WHERE { <a> <b> <?z> }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery321() throws Exception {
		// gunit test on line 2502
		Object retval = execParser("query", 2502, "# Legal, if unusual, IRIs\r\nBASE <http://example/page.html>\r\nSELECT * WHERE { <a> <b> <#x> }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery322() throws Exception {
		// gunit test on line 2507
		Object retval = execParser("query", 2507, "# Legal, if unusual, IRIs\r\nBASE <http://example/page.html?query>\r\nSELECT * WHERE { <a> <b> <&param=value> }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery323() throws Exception {
		// gunit test on line 2512
		Object retval = execParser("query", 2512, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  GRAPH ?g { } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery324() throws Exception {
		// gunit test on line 2520
		Object retval = execParser("query", 2520, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  GRAPH :a { } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery325() throws Exception {
		// gunit test on line 2528
		Object retval = execParser("query", 2528, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  GRAPH ?g { :x :b ?a } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery326() throws Exception {
		// gunit test on line 2536
		Object retval = execParser("query", 2536, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  :x :p :z\r\n  GRAPH ?g { :x :b ?a } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery327() throws Exception {
		// gunit test on line 2545
		Object retval = execParser("query", 2545, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  :x :p :z\r\n  GRAPH ?g { :x :b ?a . GRAPH ?g2 { :x :p ?x } }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery328() throws Exception {
		// gunit test on line 2554
		Object retval = execParser("query", 2554, "# use keyword FILTER as a namespace prefix\r\nPREFIX FILTER: <http://example.org/ns#> \r\nSELECT *\r\nWHERE { ?x FILTER:foo ?z FILTER (?z) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery329() throws Exception {
		// gunit test on line 2560
		Object retval = execParser("query", 2560, "# use keyword FILTER as a local name\r\nPREFIX : <http://example.org/ns#> \r\nSELECT *\r\nWHERE { ?x :FILTER ?z FILTER (?z) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery330() throws Exception {
		// gunit test on line 2566
		Object retval = execParser("query", 2566, "# use keyword UNION as a namespace prefix\r\nPREFIX UNION: <http://example.org/ns#> \r\nSELECT *\r\nWHERE { ?x UNION:foo ?z }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery331() throws Exception {
		// gunit test on line 2572
		Object retval = execParser("query", 2572, "PREFIX : <http://example.org/>\r\nSELECT * WHERE { () :p 1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery332() throws Exception {
		// gunit test on line 2576
		Object retval = execParser("query", 2576, "PREFIX : <http://example.org/>\r\nSELECT * WHERE { ( ) :p 1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery333() throws Exception {
		// gunit test on line 2580
		Object retval = execParser("query", 2580, "PREFIX : <http://example.org/>\r\nSELECT * WHERE { ( \r\n) :p 1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery334() throws Exception {
		// gunit test on line 2585
		Object retval = execParser("query", 2585, "PREFIX : <http://example.org/>\r\nSELECT * WHERE { ( 1 2\r\n) :p 1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery335() throws Exception {
		// gunit test on line 2590
		Object retval = execParser("query", 2590, "PREFIX : <http://example.org/>\r\nSELECT * WHERE { ( 1 2\r\n) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery336() throws Exception {
		// gunit test on line 2595
		Object retval = execParser("query", 2595, "# Dot after triple\r\nSELECT * WHERE\r\n{ ?s ?p ?o . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery337() throws Exception {
		// gunit test on line 2600
		Object retval = execParser("query", 2600, "# No dot after triple\r\nSELECT * WHERE\r\n{ ?s ?p ?o }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery338() throws Exception {
		// gunit test on line 2605
		Object retval = execParser("query", 2605, "SELECT * WHERE\r\n{ ?s ?p ?o . ?s ?p ?o . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery339() throws Exception {
		// gunit test on line 2609
		Object retval = execParser("query", 2609, "# No dot\r\nSELECT * WHERE\r\n{ ?s ?p ?o . ?s ?p ?o }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery340() throws Exception {
		// gunit test on line 2614
		Object retval = execParser("query", 2614, "# DOT after non-triples\r\nSELECT * WHERE\r\n{ FILTER (?o>5) . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery341() throws Exception {
		// gunit test on line 2619
		Object retval = execParser("query", 2619, "# DOT after non-triples\r\nSELECT * WHERE\r\n{ FILTER (?o>5) . ?s ?p ?o }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery342() throws Exception {
		// gunit test on line 2624
		Object retval = execParser("query", 2624, "# Trailing ;\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE\r\n{ :s :p :o ; FILTER(?x) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery343() throws Exception {
		// gunit test on line 2630
		Object retval = execParser("query", 2630, "# Broken ;\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE\r\n{ :s :p :o ; . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery344() throws Exception {
		// gunit test on line 2636
		Object retval = execParser("query", 2636, "# More a test that bad syntax tests work!\r\nPREFIX ex:   <http://example/ns#>\r\nSELECT *", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery345() throws Exception {
		// gunit test on line 2641
		Object retval = execParser("query", 2641, "# Missing DOT, 2 triples\r\nPREFIX :   <http://example/ns#>\r\nSELECT *\r\n{ :s1 :p1 :o1 :s2 :p2 :o2 . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery346() throws Exception {
		// gunit test on line 2647
		Object retval = execParser("query", 2647, "# Missing DOT between triples\r\nPREFIX :   <http://example/ns#>\r\nSELECT *\r\n{ :s1 :p1 :o1 :s2 :p2 :o2 . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery347() throws Exception {
		// gunit test on line 2653
		Object retval = execParser("query", 2653, "# Missing DOT after ; between triples\r\nPREFIX :   <http://example/ns#>\r\nSELECT *\r\n{ :s1 :p1 :o1 ; :s2 :p2 :o2 . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery348() throws Exception {
		// gunit test on line 2659
		Object retval = execParser("query", 2659, "# DOT, no triples\r\nSELECT * WHERE\r\n{ . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery349() throws Exception {
		// gunit test on line 2664
		Object retval = execParser("query", 2664, "# DOT, no triples\r\nSELECT * WHERE\r\n{ . . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery350() throws Exception {
		// gunit test on line 2669
		Object retval = execParser("query", 2669, "# DOT, then triples\r\nSELECT * WHERE\r\n{ . ?s ?p ?o }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery351() throws Exception {
		// gunit test on line 2674
		Object retval = execParser("query", 2674, "# Multiple DOTs\r\nSELECT * WHERE\r\n{ ?s ?p ?o . . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery352() throws Exception {
		// gunit test on line 2679
		Object retval = execParser("query", 2679, "# Multiple DOTs\r\nSELECT * WHERE\r\n{ ?s ?p ?o .. }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery353() throws Exception {
		// gunit test on line 2684
		Object retval = execParser("query", 2684, "# Multiple DOTs\r\nSELECT * WHERE\r\n{ ?s ?p ?o . . ?s1 ?p1 ?o1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery354() throws Exception {
		// gunit test on line 2689
		Object retval = execParser("query", 2689, "# Multiple DOTs\r\nSELECT * WHERE\r\n{ ?s ?p ?o .. ?s1 ?p1 ?o1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery355() throws Exception {
		// gunit test on line 2694
		Object retval = execParser("query", 2694, "# Multiple DOTs\r\nSELECT * WHERE\r\n{ ?s ?p ?o . . ?s1 ?p1 ?o1 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery356() throws Exception {
		// gunit test on line 2699
		Object retval = execParser("query", 2699, "# Multiple DOTs\r\nSELECT * WHERE\r\n{ ?s ?p ?o . ?s1 ?p1 ?o1 .. }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery357() throws Exception {
		// gunit test on line 2704
		Object retval = execParser("query", 2704, "# DOT, no triples\r\nSELECT * WHERE\r\n{ . FILTER(?x) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery358() throws Exception {
		// gunit test on line 2709
		Object retval = execParser("query", 2709, "# Broken ;\r\nSELECT * WHERE\r\n{ ; FILTER(?x) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery359() throws Exception {
		// gunit test on line 2714
		Object retval = execParser("query", 2714, "# Broken ;\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE\r\n{ :s ; :p :o }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery360() throws Exception {
		// gunit test on line 2720
		Object retval = execParser("query", 2720, "# Broken ;\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE\r\n{ :s :p ; }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery361() throws Exception {
		// gunit test on line 2726
		Object retval = execParser("query", 2726, "# Broken ;\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE\r\n{ :s :p ; FILTER(?x) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery362() throws Exception {
		// gunit test on line 2732
		Object retval = execParser("query", 2732, "# Broken ;\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE\r\n{ :s :p :o . ;  }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery363() throws Exception {
		// gunit test on line 2738
		Object retval = execParser("query", 2738, "# Broken ,\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE\r\n{ :s , :p :o  }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery364() throws Exception {
		// gunit test on line 2744
		Object retval = execParser("query", 2744, "# Broken ,\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE\r\n{ :s  :p , :o  }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery365() throws Exception {
		// gunit test on line 2750
		Object retval = execParser("query", 2750, "# Broken ,\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE\r\n{ :s  :p , }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery366() throws Exception {
		// gunit test on line 2756
		Object retval = execParser("query", 2756, "# Broken , can't trail\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE\r\n{ :s  :p :o , }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery367() throws Exception {
		// gunit test on line 2762
		Object retval = execParser("query", 2762, "# Broken , (should be ;)\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE\r\n{ :s :p1 :o1 , :p2 :o2}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery368() throws Exception {
		// gunit test on line 2768
		Object retval = execParser("query", 2768, "CONSTRUCT ", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery369() throws Exception {
		// gunit test on line 2771
		Object retval = execParser("query", 2771, "# Tokenizing matters.\r\n# \"longest token rule\" means this isn't a \"<\" and \"&&\"\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE\r\n{ FILTER (?x<?a&&?b>?y) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery370() throws Exception {
		// gunit test on line 2778
		Object retval = execParser("query", 2778, "PREFIX : <http://example.org/ns#>\r\nSELECT * WHERE { :x [] :q }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery371() throws Exception {
		// gunit test on line 2782
		Object retval = execParser("query", 2782, "PREFIX : <http://example.org/ns#>\r\nSELECT * WHERE { :x _:a :q }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery372() throws Exception {
		// gunit test on line 2786
		Object retval = execParser("query", 2786, "# Syntactic blank node in a filter.\r\nSELECT * WHERE { <a><b>_:x FILTER(_:x) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery373() throws Exception {
		// gunit test on line 2790
		Object retval = execParser("query", 2790, "# Syntactic blank node in a filter.\r\nSELECT * WHERE { <a><b>_:x FILTER(_:x < 3) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery374() throws Exception {
		// gunit test on line 2794
		Object retval = execParser("query", 2794, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  GRAPH [] { } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery375() throws Exception {
		// gunit test on line 2802
		Object retval = execParser("query", 2802, "# NegativeSyntax/bnode-dot.rq\r\nSELECT * WHERE {[] . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery376() throws Exception {
		// gunit test on line 2806
		Object retval = execParser("query", 2806, "# NegativeSyntax/bnodes-missing-pvalues.rq\r\nPREFIX :   <http://example/ns#>\r\nSELECT * WHERE { [,] :p [;] . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery377() throws Exception {
		// gunit test on line 2811
		Object retval = execParser("query", 2811, "# NegativeSyntax/bnodes-missing-pvalues-02.rq\r\nSELECT * WHERE {() . [,] . [,;] }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery378() throws Exception {
		// gunit test on line 2815
		Object retval = execParser("query", 2815, "# NegativeSyntax/empty-optional.rq\r\nSELECT * { OPTIONAL FILTER (?x) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery379() throws Exception {
		// gunit test on line 2819
		Object retval = execParser("query", 2819, "# NegativeSyntax/empty-optional-02.rq\r\nSELECT * { OPTIONAL GRAPH ?v OPTIONAL FILTER (?x) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery380() throws Exception {
		// gunit test on line 2823
		Object retval = execParser("query", 2823, "# NegativeSyntax/filter-missing-parens.rq\r\nSELECT * { ?s ?p ?o FILTER ?x }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery381() throws Exception {
		// gunit test on line 2827
		Object retval = execParser("query", 2827, "# NegativeSyntax/lone-list.rq\r\nSELECT * WHERE { () }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery382() throws Exception {
		// gunit test on line 2831
		Object retval = execParser("query", 2831, "# NegativeSyntax/lone-node.rq\r\nSELECT * WHERE {<a>}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.FAIL, retval);
		Object expecting = "FAIL";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery383() throws Exception {
		// gunit test on line 2835
		Object retval = execParser("query", 2835, "# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n# BNode label used across a FILTER.\r\nPREFIX : <http://xmlns.com/foaf/0.1/>\r\n\r\nASK { _:who :homepage ?homepage \r\n      FILTER REGEX(?homepage, \"^http://example.org/\") \r\n      _:who :schoolHomepage ?schoolPage }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery384() throws Exception {
		// gunit test on line 2844
		Object retval = execParser("query", 2844, "# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n# BNode label used across a GRAPH.\r\nPREFIX : <http://xmlns.com/foaf/0.1/>\r\n\r\nASK { _:who :homepage ?homepage \r\n      GRAPH ?g { ?someone :made ?homepage } \r\n      _:who :schoolHomepage ?schoolPage }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery385() throws Exception {
		// gunit test on line 2853
		Object retval = execParser("query", 2853, "# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n# BNode label used across an OPTIONAL.\r\n# This isn't necessarily a *syntax* test, but references to bnode labels\r\n# may not span basic graph patterns.\r\nPREFIX foaf: \t<http://xmlns.com/foaf/0.1/>\r\n\r\nASK { _:who foaf:homepage ?homepage \r\n      OPTIONAL { ?someone foaf:made ?homepage } \r\n      _:who foaf:schoolHomepage ?schoolPage }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery386() throws Exception {
		// gunit test on line 2864
		Object retval = execParser("query", 2864, "# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n# BNode label used across a UNION.\r\n# This isn't necessarily a *syntax* test, but references to bnode labels\r\n# may not span basic graph patterns.\r\nPREFIX foaf: \t<http://xmlns.com/foaf/0.1/>\r\n\r\nASK { _:who foaf:homepage ?homepage \r\n      { ?someone foaf:made ?homepage }\r\n      UNION\r\n      { ?homepage foaf:maker ?someone }\r\n      _:who foaf:schoolHomepage ?schoolPage }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery387() throws Exception {
		// gunit test on line 2877
		Object retval = execParser("query", 2877, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  _:a ?p ?v .  _:a ?q 1 \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery388() throws Exception {
		// gunit test on line 2885
		Object retval = execParser("query", 2885, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  { _:a ?p ?v .  _:a ?q _:a } UNION { _:b ?q _:c }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery389() throws Exception {
		// gunit test on line 2893
		Object retval = execParser("query", 2893, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  _:a ?p ?v .  FILTER(true) . [] ?q _:a\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery390() throws Exception {
		// gunit test on line 2901
		Object retval = execParser("query", 2901, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  _:a ?p ?v . { _:a ?q 1 }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery391() throws Exception {
		// gunit test on line 2909
		Object retval = execParser("query", 2909, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  { _:a ?p ?v . } _:a ?q 1 \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery392() throws Exception {
		// gunit test on line 2917
		Object retval = execParser("query", 2917, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  { _:a ?p ?v . } UNION { _:a ?q 1 } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery393() throws Exception {
		// gunit test on line 2925
		Object retval = execParser("query", 2925, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  { _:a ?p ?v . } _:a ?q 1 \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery394() throws Exception {
		// gunit test on line 2933
		Object retval = execParser("query", 2933, "PREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  _:a ?p ?v . OPTIONAL {_:a ?q 1 }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery395() throws Exception {
		// gunit test on line 2941
		Object retval = execParser("query", 2941, "# bad: re-used BNode label after GRAPH\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  _:a ?p ?v . GRAPH ?g { ?s ?p ?v } _:a ?q 1\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery396() throws Exception {
		// gunit test on line 2952
		Object retval = execParser("query", 2952, "# bad: re-used BNode label after OPTIONAL\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  _:a ?p ?v . OPTIONAL { ?s ?p ?v } _:a ?q 1\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery397() throws Exception {
		// gunit test on line 2963
		Object retval = execParser("query", 2963, "# bad: re-used BNode label after UNION\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n# This isn't necessarily a *syntax* test, but references to bnode labels\r\n# may not span basic graph patterns.\r\n\r\nPREFIX : <http://example.org/>\r\nSELECT *\r\nWHERE\r\n{\r\n  _:a ?p ?v1 { ?s <p1> ?o } UNION { ?s <p2> ?o } _:a ?p ?v2\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery398() throws Exception {
		// gunit test on line 2976
		Object retval = execParser("query", 2976, "PREFIX dob: <http://placetime.com/interval/gregorian/1977-01-18T04:00:00Z/P> \r\nPREFIX time: <http://www.ai.sri.com/daml/ontologies/time/Time.daml#>\r\nPREFIX dc: <http://purl.org/dc/elements/1.1/>\r\nSELECT ?desc\r\nWHERE  { \r\n  dob:1D a time:ProperInterval;\r\n         dc:description ?desc.\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery399() throws Exception {
		// gunit test on line 2986
		Object retval = execParser("query", 2986, "SELECT REDUCED * WHERE { ?x ?y ?z }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery400() throws Exception {
		// gunit test on line 2989
		Object retval = execParser("query", 2989, "SELECT REDUCED ?x ?y WHERE { ?x ?y ?z }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery401() throws Exception {
		// gunit test on line 2992
		Object retval = execParser("query", 2992, "PREFIX : <http://example.org/data/>\r\n\r\nSELECT *\r\nWHERE { :x ?p ?q . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery402() throws Exception {
		// gunit test on line 2998
		Object retval = execParser("query", 2998, "PREFIX : <http://example.org/data/>\r\n\r\nSELECT *\r\nWHERE { ?x :p ?q . }\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery403() throws Exception {
		// gunit test on line 3005
		Object retval = execParser("query", 3005, "SELECT *\r\nWHERE { ?a ?a ?b . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery404() throws Exception {
		// gunit test on line 3009
		Object retval = execParser("query", 3009, "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\nPREFIX  foaf:       <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?name\r\nWHERE {\r\n  ?x rdf:type foaf:Person .\r\n  ?x foaf:name ?name .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery405() throws Exception {
		// gunit test on line 3019
		Object retval = execParser("query", 3019, "PREFIX : <http://example.org/data/>\r\n\r\nSELECT *\r\nWHERE { ?x :p ?q . }\r\n", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery406() throws Exception {
		// gunit test on line 3026
		Object retval = execParser("query", 3026, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:byte1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:short ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery407() throws Exception {
		// gunit test on line 3038
		Object retval = execParser("query", 3038, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:byte1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery408() throws Exception {
		// gunit test on line 3050
		Object retval = execParser("query", 3050, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:decimal1 rdf:value ?l .\r\n         t:decimal1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:decimal ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery409() throws Exception {
		// gunit test on line 3062
		Object retval = execParser("query", 3062, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:double1 rdf:value ?l .\r\n         t:decimal1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:decimal ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery410() throws Exception {
		// gunit test on line 3074
		Object retval = execParser("query", 3074, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:double1 rdf:value ?l .\r\n         t:decimal1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:double ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery411() throws Exception {
		// gunit test on line 3086
		Object retval = execParser("query", 3086, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:double1 rdf:value ?l .\r\n         t:double1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:double ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery412() throws Exception {
		// gunit test on line 3098
		Object retval = execParser("query", 3098, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:double1 rdf:value ?l .\r\n         t:float1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:float ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery413() throws Exception {
		// gunit test on line 3110
		Object retval = execParser("query", 3110, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:double1 rdf:value ?l .\r\n         t:float1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:double ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery414() throws Exception {
		// gunit test on line 3122
		Object retval = execParser("query", 3122, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:float1 rdf:value ?l .\r\n         t:decimal1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:decimal ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery415() throws Exception {
		// gunit test on line 3134
		Object retval = execParser("query", 3134, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:float1 rdf:value ?l .\r\n         t:decimal1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:float ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery416() throws Exception {
		// gunit test on line 3146
		Object retval = execParser("query", 3146, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:float1 rdf:value ?l .\r\n         t:float1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:float ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery417() throws Exception {
		// gunit test on line 3158
		Object retval = execParser("query", 3158, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:int1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery418() throws Exception {
		// gunit test on line 3170
		Object retval = execParser("query", 3170, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:integer1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery419() throws Exception {
		// gunit test on line 3182
		Object retval = execParser("query", 3182, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:long1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery420() throws Exception {
		// gunit test on line 3194
		Object retval = execParser("query", 3194, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:negativeIntegerN1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery421() throws Exception {
		// gunit test on line 3206
		Object retval = execParser("query", 3206, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:nonNegativeInteger1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery422() throws Exception {
		// gunit test on line 3218
		Object retval = execParser("query", 3218, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:nonPositiveIntegerN1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery423() throws Exception {
		// gunit test on line 3230
		Object retval = execParser("query", 3230, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:positiveInteger1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery424() throws Exception {
		// gunit test on line 3242
		Object retval = execParser("query", 3242, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:short1 rdf:value ?l .\r\n         t:byte1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:double ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery425() throws Exception {
		// gunit test on line 3254
		Object retval = execParser("query", 3254, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:short1 rdf:value ?l .\r\n         t:decimal1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:decimal ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery426() throws Exception {
		// gunit test on line 3266
		Object retval = execParser("query", 3266, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:short1 rdf:value ?l .\r\n         t:double1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:double ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery427() throws Exception {
		// gunit test on line 3278
		Object retval = execParser("query", 3278, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:short1 rdf:value ?l .\r\n         t:float1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:float ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery428() throws Exception {
		// gunit test on line 3290
		Object retval = execParser("query", 3290, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:short1 rdf:value ?l .\r\n         t:int1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:float ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery429() throws Exception {
		// gunit test on line 3302
		Object retval = execParser("query", 3302, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:short1 rdf:value ?l .\r\n         t:long1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:decimal ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery430() throws Exception {
		// gunit test on line 3314
		Object retval = execParser("query", 3314, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:short1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:short ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery431() throws Exception {
		// gunit test on line 3326
		Object retval = execParser("query", 3326, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:short1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery432() throws Exception {
		// gunit test on line 3338
		Object retval = execParser("query", 3338, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:unsignedByte1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery433() throws Exception {
		// gunit test on line 3350
		Object retval = execParser("query", 3350, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:unsignedInt1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery434() throws Exception {
		// gunit test on line 3362
		Object retval = execParser("query", 3362, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:unsignedLong1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery435() throws Exception {
		// gunit test on line 3374
		Object retval = execParser("query", 3374, "# Positive test: product of type promotion within the xsd:decimal type tree.\r\n# $Id: Sparql.gunit 202 2011-07-24 21:35:40Z Juergen.Pfundt@web.de $\r\n\r\nPREFIX t: <http://www.w3.org/2001/sw/DataAccess/tests/data/TypePromotion/tP-0#>\r\nPREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\nASK\r\n WHERE { t:unsignedShort1 rdf:value ?l .\r\n         t:short1 rdf:value ?r .\r\n         FILTER ( datatype(?l + ?r) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery436() throws Exception {
		// gunit test on line 3386
		Object retval = execParser("query", 3386, "SELECT ?title\r\nWHERE\r\n{\r\n  <http://example.org/book/book1> <http://purl.org/dc/elements/1.1/title> ?title .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery437() throws Exception {
		// gunit test on line 3392
		Object retval = execParser("query", 3392, "PREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\nWHERE\r\n  { ?x foaf:name ?name .\r\n    ?x foaf:mbox ?mbox }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery438() throws Exception {
		// gunit test on line 3398
		Object retval = execParser("query", 3398, "SELECT ?v WHERE { ?v ?p \"cat\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery439() throws Exception {
		// gunit test on line 3400
		Object retval = execParser("query", 3400, "SELECT ?v WHERE { ?v ?p 42 }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery440() throws Exception {
		// gunit test on line 3402
		Object retval = execParser("query", 3402, "PREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\nSELECT ?x ?name\r\nWHERE  { ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery441() throws Exception {
		// gunit test on line 3406
		Object retval = execParser("query", 3406, "PREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\nSELECT ( fn:concat(?G, \" \", ?S) AS ?name )\r\nWHERE  { ?P foaf:givenName ?G ; foaf:surname ?S }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery442() throws Exception {
		// gunit test on line 3410
		Object retval = execParser("query", 3410, "PREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\nPREFIX org:    <http://example.com/ns#>\r\n\r\nCONSTRUCT { ?x foaf:name ?name }\r\nWHERE  { ?x org:employeeName ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery443() throws Exception {
		// gunit test on line 3416
		Object retval = execParser("query", 3416, "PREFIX  dc:  <http://purl.org/dc/elements/1.1/>\r\nSELECT  ?title\r\nWHERE   { ?x dc:title ?title\r\n          FILTER regex(?title, \"^SPARQL\") \r\n        }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery444() throws Exception {
		// gunit test on line 3422
		Object retval = execParser("query", 3422, "PREFIX  dc:  <http://purl.org/dc/elements/1.1/>\r\nSELECT  ?title\r\nWHERE   { ?x dc:title ?title\r\n          FILTER regex(?title, \"web\", \"i\" ) \r\n        }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery445() throws Exception {
		// gunit test on line 3428
		Object retval = execParser("query", 3428, "PREFIX  dc:  <http://purl.org/dc/elements/1.1/>\r\nPREFIX  ns:  <http://example.org/ns#>\r\nSELECT  ?title ?price\r\nWHERE   { ?x ns:price ?price .\r\n          FILTER (?price < 30.5)\r\n          ?x dc:title ?title . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery446() throws Exception {
		// gunit test on line 3435
		Object retval = execParser("query", 3435, "PREFIX  dc: <http://purl.org/dc/elements/1.1/>\r\nSELECT  ?title\r\nWHERE   { <http://example.org/book/book1> dc:title ?title }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery447() throws Exception {
		// gunit test on line 3439
		Object retval = execParser("query", 3439, "PREFIX  dc: <http://purl.org/dc/elements/1.1/>\r\nPREFIX  : <http://example.org/book/>\r\n\r\nSELECT  $title\r\nWHERE   { :book1  dc:title  $title }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery448() throws Exception {
		// gunit test on line 3445
		Object retval = execParser("query", 3445, "BASE    <http://example.org/book/>\r\nPREFIX  dc: <http://purl.org/dc/elements/1.1/>\r\n\r\nSELECT  $title\r\nWHERE   { <book1>  dc:title  ?title }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery449() throws Exception {
		// gunit test on line 3451
		Object retval = execParser("query", 3451, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\nWHERE  {\r\n          ?x foaf:name ?name .\r\n          ?x foaf:mbox ?mbox .\r\n       }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery450() throws Exception {
		// gunit test on line 3458
		Object retval = execParser("query", 3458, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\nWHERE  { { ?x foaf:name ?name . }\r\n         { ?x foaf:mbox ?mbox . }\r\n       }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery451() throws Exception {
		// gunit test on line 3464
		Object retval = execParser("query", 3464, "SELECT ?x\r\nWHERE {}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery452() throws Exception {
		// gunit test on line 3467
		Object retval = execParser("query", 3467, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\nWHERE  { ?x foaf:name  ?name .\r\n         OPTIONAL { ?x  foaf:mbox  ?mbox }\r\n       }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery453() throws Exception {
		// gunit test on line 3473
		Object retval = execParser("query", 3473, "PREFIX  dc:  <http://purl.org/dc/elements/1.1/>\r\nPREFIX  ns:  <http://example.org/ns#>\r\nSELECT  ?title ?price\r\nWHERE   { ?x dc:title ?title .\r\n          OPTIONAL { ?x ns:price ?price . FILTER (?price < 30) }\r\n        }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery454() throws Exception {
		// gunit test on line 3480
		Object retval = execParser("query", 3480, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox ?hpage\r\nWHERE  { ?x foaf:name  ?name .\r\n         OPTIONAL { ?x foaf:mbox ?mbox } .\r\n         OPTIONAL { ?x foaf:homepage ?hpage }\r\n       }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery455() throws Exception {
		// gunit test on line 3487
		Object retval = execParser("query", 3487, "PREFIX dc10:  <http://purl.org/dc/elements/1.0/>\r\nPREFIX dc11:  <http://purl.org/dc/elements/1.1/>\r\n\r\nSELECT ?title\r\nWHERE  { { ?book dc10:title  ?title } UNION { ?book dc11:title  ?title } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery456() throws Exception {
		// gunit test on line 3493
		Object retval = execParser("query", 3493, "PREFIX dc10:  <http://purl.org/dc/elements/1.0/>\r\nPREFIX dc11:  <http://purl.org/dc/elements/1.1/>\r\n\r\nSELECT ?x ?y\r\nWHERE  { { ?book dc10:title ?x } UNION { ?book dc11:title  ?y } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery457() throws Exception {
		// gunit test on line 3499
		Object retval = execParser("query", 3499, "PREFIX dc10:  <http://purl.org/dc/elements/1.0/>\r\nPREFIX dc11:  <http://purl.org/dc/elements/1.1/>\r\n\r\nSELECT ?title ?author\r\nWHERE  { { ?book dc10:title ?title .  ?book dc10:creator ?author }\r\n         UNION\r\n         { ?book dc11:title ?title .  ?book dc11:creator ?author }\r\n       }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery458() throws Exception {
		// gunit test on line 3508
		Object retval = execParser("query", 3508, "PREFIX  rdf:    <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\nPREFIX  foaf:   <http://xmlns.com/foaf/0.1/> \r\n\r\nSELECT ?person\r\nWHERE \r\n{\r\n    ?person rdf:type  foaf:Person .\r\n    FILTER NOT EXISTS { ?person foaf:name ?name }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery459() throws Exception {
		// gunit test on line 3518
		Object retval = execParser("query", 3518, "PREFIX  rdf:    <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\nPREFIX  foaf:   <http://xmlns.com/foaf/0.1/> \r\n\r\nSELECT ?person\r\nWHERE \r\n{\r\n    ?person rdf:type  foaf:Person .\r\n    FILTER EXISTS { ?person foaf:name ?name }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery460() throws Exception {
		// gunit test on line 3528
		Object retval = execParser("query", 3528, "PREFIX :       <http://example/>\r\nPREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT DISTINCT ?s\r\nWHERE {\r\n   ?s ?p ?o .\r\n   MINUS {\r\n      ?s foaf:givenName \"Bob\" .\r\n   }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery461() throws Exception {
		// gunit test on line 3539
		Object retval = execParser("query", 3539, "SELECT * { ?s ?p ?o FILTER NOT EXISTS { ?x ?y ?z } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery462() throws Exception {
		// gunit test on line 3541
		Object retval = execParser("query", 3541, "SELECT * { ?s ?p ?o MINUS { ?x ?y ?z } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery463() throws Exception {
		// gunit test on line 3543
		Object retval = execParser("query", 3543, "PREFIX : <http://example/>\r\nSELECT * \r\n{ \r\n  ?s ?p ?o \r\n  FILTER NOT EXISTS { :a :b :c }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery464() throws Exception {
		// gunit test on line 3550
		Object retval = execParser("query", 3550, "PREFIX : <http://example/>\r\nSELECT * \r\n{ \r\n  ?s ?p ?o \r\n  MINUS { :a :b :c }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery465() throws Exception {
		// gunit test on line 3557
		Object retval = execParser("query", 3557, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT  ?name\r\nFROM    <http://example.org/foaf/aliceFoaf>\r\nWHERE   { ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery466() throws Exception {
		// gunit test on line 3562
		Object retval = execParser("query", 3562, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX dc: <http://purl.org/dc/elements/1.1/>\r\n\r\nSELECT ?who ?g ?mbox\r\nFROM <http://example.org/dft.ttl>\r\nFROM NAMED <http://example.org/alice>\r\nFROM NAMED <http://example.org/bob>\r\nWHERE\r\n{\r\n   ?g dc:publisher ?who .\r\n   GRAPH ?g { ?x foaf:mbox ?mbox }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery467() throws Exception {
		// gunit test on line 3575
		Object retval = execParser("query", 3575, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?src ?bobNick\r\nFROM NAMED <http://example.org/foaf/aliceFoaf>\r\nFROM NAMED <http://example.org/foaf/bobFoaf>\r\nWHERE\r\n  {\r\n    GRAPH ?src\r\n    { ?x foaf:mbox <mailto:bob@work.example> .\r\n      ?x foaf:nick ?bobNick\r\n    }\r\n  }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery468() throws Exception {
		// gunit test on line 3588
		Object retval = execParser("query", 3588, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX data: <http://example.org/foaf/>\r\n\r\nSELECT ?nick\r\nFROM NAMED <http://example.org/foaf/aliceFoaf>\r\nFROM NAMED <http://example.org/foaf/bobFoaf>\r\nWHERE\r\n  {\r\n     GRAPH data:bobFoaf {\r\n         ?x foaf:mbox <mailto:bob@work.example> .\r\n         ?x foaf:nick ?nick }\r\n  }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery469() throws Exception {
		// gunit test on line 3601
		Object retval = execParser("query", 3601, "PREFIX  data:  <http://example.org/foaf/>\r\nPREFIX  foaf:  <http://xmlns.com/foaf/0.1/>\r\nPREFIX  rdfs:  <http://www.w3.org/2000/01/rdf-schema#>\r\n\r\nSELECT ?mbox ?nick ?ppd\r\nFROM NAMED <http://example.org/foaf/aliceFoaf>\r\nFROM NAMED <http://example.org/foaf/bobFoaf>\r\nWHERE\r\n{\r\n  GRAPH data:aliceFoaf\r\n  {\r\n    ?alice foaf:mbox <mailto:alice@work.example> ;\r\n           foaf:knows ?whom .\r\n    ?whom  foaf:mbox ?mbox ;\r\n           rdfs:seeAlso ?ppd .\r\n    ?ppd  a foaf:PersonalProfileDocument .\r\n  } .\r\n  GRAPH ?ppd\r\n  {\r\n      ?w foaf:mbox ?mbox ;\r\n         foaf:nick ?nick\r\n  }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery470() throws Exception {
		// gunit test on line 3625
		Object retval = execParser("query", 3625, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX dc:   <http://purl.org/dc/elements/1.1/>\r\n\r\nSELECT ?name ?mbox ?date\r\nWHERE\r\n  {  ?g dc:publisher ?name ;\r\n        dc:date ?date .\r\n    GRAPH ?g\r\n      { ?person foaf:name ?name ; foaf:mbox ?mbox }\r\n  }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery471() throws Exception {
		// gunit test on line 3636
		Object retval = execParser("query", 3636, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?name\r\nWHERE { ?x foaf:name ?name }\r\nORDER BY ?name", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery472() throws Exception {
		// gunit test on line 3642
		Object retval = execParser("query", 3642, "PREFIX     :    <http://example.org/ns#>\r\nPREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?name\r\nWHERE { ?x foaf:name ?name ; :empId ?emp }\r\nORDER BY DESC(?emp)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery473() throws Exception {
		// gunit test on line 3649
		Object retval = execParser("query", 3649, "PREFIX     :    <http://example.org/ns#>\r\nPREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?name\r\nWHERE { ?x foaf:name ?name ; :empId ?emp }\r\nORDER BY ?name DESC(?emp)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery474() throws Exception {
		// gunit test on line 3656
		Object retval = execParser("query", 3656, "PREFIX foaf:       <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name\r\nWHERE\r\n { ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery475() throws Exception {
		// gunit test on line 3661
		Object retval = execParser("query", 3661, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name WHERE { ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery476() throws Exception {
		// gunit test on line 3664
		Object retval = execParser("query", 3664, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nSELECT DISTINCT ?name WHERE { ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery477() throws Exception {
		// gunit test on line 3667
		Object retval = execParser("query", 3667, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nSELECT REDUCED ?name WHERE { ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery478() throws Exception {
		// gunit test on line 3670
		Object retval = execParser("query", 3670, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT  ?name\r\nWHERE   { ?x foaf:name ?name }\r\nORDER BY ?name\r\nLIMIT   5\r\nOFFSET  10", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery479() throws Exception {
		// gunit test on line 3678
		Object retval = execParser("query", 3678, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?name\r\nWHERE { ?x foaf:name ?name }\r\nLIMIT 20", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery480() throws Exception {
		// gunit test on line 3684
		Object retval = execParser("query", 3684, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nSELECT ?nameX ?nameY ?nickY\r\nWHERE\r\n  { ?x foaf:knows ?y ;\r\n       foaf:name ?nameX .\r\n    ?y foaf:name ?nameY .\r\n    OPTIONAL { ?y foaf:nick ?nickY }\r\n  }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery481() throws Exception {
		// gunit test on line 3693
		Object retval = execParser("query", 3693, "PREFIX  dc:  <http://purl.org/dc/elements/1.1/>\r\nPREFIX  ns:  <http://example.org/ns#>\r\nSELECT  ?title (?p*(1-?discount) AS ?price)\r\n   { ?x ns:price ?p .\r\n     ?x dc:title ?title . \r\n     ?x ns:discount ?discount \r\n   }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery482() throws Exception {
		// gunit test on line 3701
		Object retval = execParser("query", 3701, "PREFIX  dc:  <http://purl.org/dc/elements/1.1/>\r\nPREFIX  ns:  <http://example.org/ns#>\r\nSELECT  ?title (?p AS ?fullPrice) (?fullPrice*(1-?discount) AS ?customerPrice)\r\n   { ?x ns:price ?p .\r\n     ?x dc:title ?title . \r\n     ?x ns:discount ?discount \r\n   }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery483() throws Exception {
		// gunit test on line 3709
		Object retval = execParser("query", 3709, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nPREFIX vcard:   <http://www.w3.org/2001/vcard-rdf/3.0#>\r\nCONSTRUCT   { <http://example.org/person#Alice> vcard:FN ?name }\r\nWHERE       { ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery484() throws Exception {
		// gunit test on line 3714
		Object retval = execParser("query", 3714, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nPREFIX vcard:   <http://www.w3.org/2001/vcard-rdf/3.0#>\r\n\r\nCONSTRUCT { ?x  vcard:N _:v .\r\n            _:v vcard:givenName ?gname .\r\n            _:v vcard:familyName ?fname }\r\nWHERE\r\n {\r\n    { ?x foaf:firstname ?gname } UNION  { ?x foaf:givenname   ?gname } .\r\n    { ?x foaf:surname   ?fname } UNION  { ?x foaf:family_name ?fname } .\r\n }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery485() throws Exception {
		// gunit test on line 3726
		Object retval = execParser("query", 3726, "PREFIX  dc: <http://purl.org/dc/elements/1.1/>\r\nPREFIX app: <http://example.org/ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\n\r\nCONSTRUCT { ?s ?p ?o } WHERE\r\n {\r\n   GRAPH ?g { ?s ?p ?o } .\r\n   { ?g dc:publisher <http://www.w3.org/> } .\r\n   { ?g dc:date ?date } .\r\n   FILTER ( app:customDate(?date) > \"2005-02-28T00:00:00Z\"^^xsd:dateTime ) .\r\n }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery486() throws Exception {
		// gunit test on line 3738
		Object retval = execParser("query", 3738, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX site: <http://example.org/stats#>\r\n\r\nCONSTRUCT { [] foaf:name ?name }\r\nWHERE\r\n{ [] foaf:name ?name ;\r\n     site:hits ?hits .\r\n}\r\nORDER BY desc(?hits)\r\nLIMIT 2", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery487() throws Exception {
		// gunit test on line 3749
		Object retval = execParser("query", 3749, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nASK  { ?x foaf:name  \"Alice\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery488() throws Exception {
		// gunit test on line 3752
		Object retval = execParser("query", 3752, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nASK  { ?x foaf:name  \"Alice\" ;\r\n          foaf:mbox  <mailto:alice@work.example> }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery489() throws Exception {
		// gunit test on line 3756
		Object retval = execParser("query", 3756, "DESCRIBE <http://example.org/> ", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery490() throws Exception {
		// gunit test on line 3758
		Object retval = execParser("query", 3758, "PREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\nDESCRIBE ?x\r\nWHERE    { ?x foaf:mbox <mailto:alice@org> }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery491() throws Exception {
		// gunit test on line 3762
		Object retval = execParser("query", 3762, "PREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\nDESCRIBE ?x\r\nWHERE    { ?x foaf:name \"Alice\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery492() throws Exception {
		// gunit test on line 3766
		Object retval = execParser("query", 3766, "PREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\nDESCRIBE ?x ?y <http://example.org/>\r\nWHERE    {?x foaf:knows ?y}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery493() throws Exception {
		// gunit test on line 3770
		Object retval = execParser("query", 3770, "PREFIX ent:  <http://org.example.com/employees#>\r\nDESCRIBE ?x WHERE { ?x ent:employeeId \"1234\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery494() throws Exception {
		// gunit test on line 3773
		Object retval = execParser("query", 3773, "PREFIX a:      <http://www.w3.org/2000/10/annotation-ns#>\r\nPREFIX dc:     <http://purl.org/dc/elements/1.1/>\r\nPREFIX xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?annot\r\nWHERE { ?annot  a:annotates  <http://www.w3.org/TR/rdf-sparql-query/> .\r\n        ?annot  dc:date      ?date .\r\n        FILTER ( ?date > \"2005-01-01T00:00:00Z\"^^xsd:dateTime ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery495() throws Exception {
		// gunit test on line 3782
		Object retval = execParser("query", 3782, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX dc:   <http://purl.org/dc/elements/1.1/>\r\nPREFIX xsd:   <http://www.w3.org/2001/XMLSchema#>\r\nSELECT ?givenName\r\n WHERE { ?x foaf:givenName  ?givenName .\r\n         OPTIONAL { ?x dc:date ?date } .\r\n         FILTER ( bound(?date) ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery496() throws Exception {
		// gunit test on line 3790
		Object retval = execParser("query", 3790, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX dc:   <http://purl.org/dc/elements/1.1/>\r\nSELECT ?name\r\n WHERE { ?x foaf:givenName  ?name .\r\n         OPTIONAL { ?x dc:date ?date } .\r\n         FILTER (!bound(?date)) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery497() throws Exception {
		// gunit test on line 3797
		Object retval = execParser("query", 3797, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\n WHERE { ?x foaf:name  ?name ;\r\n            foaf:mbox  ?mbox .\r\n         FILTER isIRI(?mbox) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery498() throws Exception {
		// gunit test on line 3803
		Object retval = execParser("query", 3803, "PREFIX a:      <http://www.w3.org/2000/10/annotation-ns#>\r\nPREFIX dc:     <http://purl.org/dc/elements/1.1/>\r\nPREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?given ?family\r\n WHERE { ?annot  a:annotates  <http://www.w3.org/TR/rdf-sparql-query/> .\r\n         ?annot  dc:creator   ?c .\r\n         OPTIONAL { ?c  foaf:given   ?given ; foaf:family  ?family } .\r\n         FILTER isBlank(?c)\r\n       }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery499() throws Exception {
		// gunit test on line 3814
		Object retval = execParser("query", 3814, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\n WHERE { ?x foaf:name  ?name ;\r\n           foaf:mbox  ?mbox .\r\n         FILTER isLiteral(?mbox) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery500() throws Exception {
		// gunit test on line 3820
		Object retval = execParser("query", 3820, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\n WHERE { ?x foaf:name  ?name ;\r\n            foaf:mbox  ?mbox .\r\n         FILTER regex(str(?mbox), \"@work.example\") }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery501() throws Exception {
		// gunit test on line 3826
		Object retval = execParser("query", 3826, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\n WHERE { ?x foaf:name  ?name ;\r\n            foaf:mbox  ?mbox .\r\n         FILTER ( lang(?name) = \"ES\" ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery502() throws Exception {
		// gunit test on line 3832
		Object retval = execParser("query", 3832, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX eg:   <http://biometrics.example/ns#>\r\nSELECT ?name ?shoeSize\r\n WHERE { ?x foaf:name  ?name ; eg:shoeSize  ?shoeSize .\r\n         FILTER ( datatype(?shoeSize) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery503() throws Exception {
		// gunit test on line 3839
		Object retval = execParser("query", 3839, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name1 ?name2\r\n WHERE { ?x foaf:name  ?name1 ;\r\n            foaf:mbox  ?mbox1 .\r\n         ?y foaf:name  ?name2 ;\r\n            foaf:mbox  ?mbox2 .\r\n         FILTER (?mbox1 = ?mbox2 && ?name1 != ?name2)\r\n       }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery504() throws Exception {
		// gunit test on line 3848
		Object retval = execParser("query", 3848, "PREFIX a:      <http://www.w3.org/2000/10/annotation-ns#>\r\nPREFIX dc:     <http://purl.org/dc/elements/1.1/>\r\nPREFIX xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?annotates\r\nWHERE { ?annot  a:annotates  ?annotates .\r\n        ?annot  dc:date      ?date .\r\n        FILTER ( ?date = xsd:dateTime(\"2005-01-01T00:00:00Z\") ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery505() throws Exception {
		// gunit test on line 3857
		Object retval = execParser("query", 3857, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name1 ?name2\r\n WHERE { ?x foaf:name  ?name1 ;\r\n            foaf:mbox  ?mbox1 .\r\n         ?y foaf:name  ?name2 ;\r\n            foaf:mbox  ?mbox2 .\r\n         FILTER (sameTerm(?mbox1, ?mbox2) && !sameTerm(?name1, ?name2))\r\n       }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery506() throws Exception {
		// gunit test on line 3866
		Object retval = execParser("query", 3866, "PREFIX  :      <http://example.org/WMterms#>\r\nPREFIX  t:     <http://example.org/types#>\r\n\r\nSELECT ?aLabel1 ?bLabel\r\nWHERE { ?a  :label        ?aLabel .\r\n        ?a  :weight       ?aWeight .\r\n        ?a  :displacement ?aDisp .\r\n\r\n        ?b  :label        ?bLabel .\r\n        ?b  :weight       ?bWeight .\r\n        ?b  :displacement ?bDisp .\r\n\r\n        FILTER ( sameTerm(?aWeight, ?bWeight) && !sameTerm(?aDisp, ?bDisp)) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery507() throws Exception {
		// gunit test on line 3880
		Object retval = execParser("query", 3880, "PREFIX dc: <http://purl.org/dc/elements/1.1/>\r\nSELECT ?title\r\n WHERE { ?x dc:title  \"That Seventies Show\"@en ;\r\n            dc:title  ?title .\r\n         FILTER langMatches( lang(?title), \"FR\" ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery508() throws Exception {
		// gunit test on line 3886
		Object retval = execParser("query", 3886, "PREFIX dc: <http://purl.org/dc/elements/1.1/>\r\nSELECT ?title\r\n WHERE { ?x dc:title  ?title .\r\n         FILTER langMatches( lang(?title), \"*\" ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery509() throws Exception {
		// gunit test on line 3891
		Object retval = execParser("query", 3891, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name\r\n WHERE { ?x foaf:name  ?name\r\n         FILTER regex(?name, \"^ali\", \"i\") }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery510() throws Exception {
		// gunit test on line 3896
		Object retval = execParser("query", 3896, "PREFIX aGeo: <http://example.org/geo#>\r\n\r\nSELECT ?neighbor\r\nWHERE { ?a aGeo:placeName \"Grenoble\" .\r\n        ?a aGeo:location ?axLoc .\r\n        ?a aGeo:location ?ayLoc .\r\n\r\n        ?b aGeo:placeName ?neighbor .\r\n        ?b aGeo:location ?bxLoc .\r\n        ?b aGeo:location ?byLoc .\r\n\r\n        FILTER ( aGeo:distance(?axLoc, ?ayLoc, ?bxLoc, ?byLoc) < 10 ) .\r\n      }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery511() throws Exception {
		// gunit test on line 3910
		Object retval = execParser("query", 3910, "PREFIX person: <http://localhost/persons/>\r\n\r\nSELECT ?subject ?predicate\r\nWHERE {\r\n  ?subject ?predicate person:Paul_Erdoes\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery512() throws Exception {
		// gunit test on line 3918
		Object retval = execParser("query", 3918, "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\r\n\r\nSELECT ?ee\r\nWHERE {\r\n  ?publication rdfs:seeAlso ?ee\r\n}\r\nORDER BY ?ee\r\nLIMIT 10\r\nOFFSET 50", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery513() throws Exception {
		// gunit test on line 3929
		Object retval = execParser("query", 3929, "PREFIX rdf:   <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX foaf:  <http://xmlns.com/foaf/0.1/>\r\nPREFIX bench: <http://localhost/vocabulary/bench/>\r\nPREFIX dc:    <http://purl.org/dc/elements/1.1/>\r\n\r\nASK {\r\n  ?article rdf:type bench:Article .\r\n  ?article dc:creator ?person1 .\r\n  ?inproc  rdf:type bench:Inproceedings .\r\n  ?inproc  dc:creator ?person2 .\r\n  ?person1 foaf:name ?name1 .\r\n  ?person2 foaf:name ?name2\r\n  FILTER (?name1=?name2)\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery514() throws Exception {
		// gunit test on line 3945
		Object retval = execParser("query", 3945, "PREFIX xsd:  <http://www.w3.org/2001/XMLSchema#> \r\nPREFIX rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX dc:   <http://purl.org/dc/elements/1.1/>\r\n\r\nASK {\r\n  ?erdoes rdf:type foaf:Person .\r\n  ?erdoes foaf:name \"Paul Erdoes\"^^xsd:string .\r\n  {\r\n    ?document dc:creator ?erdoes .\r\n    ?document dc:creator ?author .\r\n    ?document2 dc:creator ?author .\r\n    ?document2 dc:creator ?author2 .\r\n    ?author2 foaf:name ?name\r\n    FILTER (?author!=?erdoes &&\r\n            ?document2!=?document &&\r\n            ?author2!=?erdoes &&\r\n            ?author2!=?author)\r\n  } UNION {\r\n    ?document dc:creator ?erdoes .\r\n    ?document dc:creator ?author .\r\n    ?author foaf:name ?name \r\n    FILTER (?author!=?erdoes)\r\n  }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery515() throws Exception {
		// gunit test on line 3972
		Object retval = execParser("query", 3972, "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX person: <http://localhost/persons/>\r\nPREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\n\r\nASK {\r\n  person:John_Q_Public rdf:type foaf:Person.\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery516() throws Exception {
		// gunit test on line 3981
		Object retval = execParser("query", 3981, "PREFIX rdf:     <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX rdfs:    <http://www.w3.org/2000/01/rdf-schema#>\r\nPREFIX swrc:    <http://swrc.ontoware.org/ontology#>\r\nPREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nPREFIX bench:   <http://localhost/vocabulary/bench/>\r\nPREFIX dc:      <http://purl.org/dc/elements/1.1/>\r\nPREFIX dcterms: <http://purl.org/dc/terms/>\r\n\r\nSELECT ?inproc ?author ?booktitle ?title \r\n       ?proc ?ee ?page ?url ?yr ?abstract\r\nWHERE {\r\n  ?inproc rdf:type bench:Inproceedings .\r\n  ?inproc dc:creator ?author .\r\n  ?inproc bench:booktitle ?booktitle .\r\n  ?inproc dc:title ?title .\r\n  ?inproc dcterms:partOf ?proc .\r\n  ?inproc rdfs:seeAlso ?ee .\r\n  ?inproc swrc:pages ?page .\r\n  ?inproc foaf:homepage ?url .\r\n  ?inproc dcterms:issued ?yr \r\n  OPTIONAL {\r\n    ?inproc bench:abstract ?abstract\r\n  }\r\n}\r\nORDER BY ?yr", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery517() throws Exception {
		// gunit test on line 4008
		Object retval = execParser("query", 4008, "PREFIX rdf:   <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX bench: <http://localhost/vocabulary/bench/>\r\nPREFIX swrc:  <http://swrc.ontoware.org/ontology#>\r\n\r\nSELECT ?article\r\nWHERE {\r\n  ?article rdf:type bench:Article .\r\n  ?article ?property ?value \r\n  FILTER (?property=swrc:pages) \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery518() throws Exception {
		// gunit test on line 4020
		Object retval = execParser("query", 4020, "PREFIX rdf:   <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX bench: <http://localhost/vocabulary/bench/>\r\nPREFIX swrc:  <http://swrc.ontoware.org/ontology#>\r\n\r\nSELECT ?article\r\nWHERE {\r\n  ?article rdf:type bench:Article .\r\n  ?article ?property ?value\r\n  FILTER (?property=swrc:month)\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery519() throws Exception {
		// gunit test on line 4032
		Object retval = execParser("query", 4032, "PREFIX rdf:   <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX swrc:  <http://swrc.ontoware.org/ontology#>\r\nPREFIX bench: <http://localhost/vocabulary/bench/>\r\n\r\nSELECT ?article\r\nWHERE {\r\n  ?article rdf:type bench:Article .\r\n  ?article ?property ?value\r\n  FILTER (?property=swrc:isbn)\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery520() throws Exception {
		// gunit test on line 4044
		Object retval = execParser("query", 4044, "PREFIX rdf:     <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX bench:   <http://localhost/vocabulary/bench/>\r\nPREFIX dc:      <http://purl.org/dc/elements/1.1/>\r\nPREFIX dcterms: <http://purl.org/dc/terms/>\r\nPREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nPREFIX swrc:    <http://swrc.ontoware.org/ontology#>\r\n\r\nSELECT DISTINCT ?name1 ?name2 \r\nWHERE {\r\n  ?article1 rdf:type bench:Article .\r\n  ?article2 rdf:type bench:Article .\r\n  ?article1 dc:creator ?author1 .\r\n  ?author1 foaf:name ?name1 .\r\n  ?article2 dc:creator ?author2 .\r\n  ?author2 foaf:name ?name2 .\r\n  ?article1 swrc:journal ?journal .\r\n  ?article2 swrc:journal ?journal\r\n  FILTER (?name1<?name2)\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery521() throws Exception {
		// gunit test on line 4065
		Object retval = execParser("query", 4065, "PREFIX rdf:   <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX foaf:  <http://xmlns.com/foaf/0.1/>\r\nPREFIX bench: <http://localhost/vocabulary/bench/>\r\nPREFIX dc:    <http://purl.org/dc/elements/1.1/>\r\n\r\nSELECT DISTINCT ?person ?name\r\nWHERE {\r\n  ?article rdf:type bench:Article .\r\n  ?article dc:creator ?person .\r\n  ?inproc rdf:type bench:Inproceedings .\r\n  ?inproc dc:creator ?person2 .\r\n  ?person foaf:name ?name .\r\n  ?person2 foaf:name ?name2\r\n  FILTER (?name=?name2)\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery522() throws Exception {
		// gunit test on line 4082
		Object retval = execParser("query", 4082, "PREFIX rdf:   <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX foaf:  <http://xmlns.com/foaf/0.1/>\r\nPREFIX bench: <http://localhost/vocabulary/bench/>\r\nPREFIX dc:    <http://purl.org/dc/elements/1.1/>\r\n\r\nSELECT DISTINCT ?person ?name\r\nWHERE {\r\n  ?article rdf:type bench:Article .\r\n  ?article dc:creator ?person .\r\n  ?inproc rdf:type bench:Inproceedings .\r\n  ?inproc dc:creator ?person .\r\n  ?person foaf:name ?name\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery523() throws Exception {
		// gunit test on line 4097
		Object retval = execParser("query", 4097, "PREFIX rdf:     <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX rdfs:    <http://www.w3.org/2000/01/rdf-schema#>\r\nPREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nPREFIX dc:      <http://purl.org/dc/elements/1.1/>\r\nPREFIX dcterms: <http://purl.org/dc/terms/>\r\n\r\nSELECT ?yr ?name ?document\r\nWHERE {\r\n  ?class rdfs:subClassOf foaf:Document .\r\n  ?document rdf:type ?class .\r\n  ?document dcterms:issued ?yr .\r\n  ?document dc:creator ?author .\r\n  ?author foaf:name ?name\r\n  OPTIONAL {\r\n    ?class2 rdfs:subClassOf foaf:Document .\r\n    ?document2 rdf:type ?class2 .\r\n    ?document2 dcterms:issued ?yr2 .\r\n    ?document2 dc:creator ?author2 \r\n    FILTER (?author=?author2 && ?yr2<?yr)\r\n  } FILTER (!bound(?author2))\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery524() throws Exception {
		// gunit test on line 4120
		Object retval = execParser("query", 4120, "PREFIX rdf:     <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX rdfs:    <http://www.w3.org/2000/01/rdf-schema#>\r\nPREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nPREFIX dc:      <http://purl.org/dc/elements/1.1/>\r\nPREFIX dcterms: <http://purl.org/dc/terms/>\r\n\r\nSELECT DISTINCT ?title\r\nWHERE {\r\n  ?class rdfs:subClassOf foaf:Document .\r\n  ?doc rdf:type ?class .\r\n  ?doc dc:title ?title .\r\n  ?bag2 ?member2 ?doc .\r\n  ?doc2 dcterms:references ?bag2\r\n  OPTIONAL {\r\n    ?class3 rdfs:subClassOf foaf:Document .\r\n    ?doc3 rdf:type ?class3 .\r\n    ?doc3 dcterms:references ?bag3 .\r\n    ?bag3 ?member3 ?doc\r\n    OPTIONAL {\r\n      ?class4 rdfs:subClassOf foaf:Document .\r\n      ?doc4 rdf:type ?class4 .\r\n      ?doc4 dcterms:references ?bag4 .\r\n      ?bag4 ?member4 ?doc3\r\n    } FILTER (!bound(?doc4))\r\n  } FILTER (!bound(?doc3))\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery525() throws Exception {
		// gunit test on line 4148
		Object retval = execParser("query", 4148, "PREFIX xsd:  <http://www.w3.org/2001/XMLSchema#> \r\nPREFIX rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX dc:   <http://purl.org/dc/elements/1.1/>\r\n\r\nSELECT DISTINCT ?name\r\nWHERE {\r\n  ?erdoes rdf:type foaf:Person .\r\n  ?erdoes foaf:name \"Paul Erdoes\"^^xsd:string .\r\n  {\r\n    ?document dc:creator ?erdoes .\r\n    ?document dc:creator ?author .\r\n    ?document2 dc:creator ?author .\r\n    ?document2 dc:creator ?author2 .\r\n    ?author2 foaf:name ?name\r\n    FILTER (?author!=?erdoes &&\r\n            ?document2!=?document &&\r\n            ?author2!=?erdoes &&\r\n            ?author2!=?author)\r\n  } UNION {\r\n    ?document dc:creator ?erdoes.\r\n    ?document dc:creator ?author.\r\n    ?author foaf:name ?name\r\n    FILTER (?author!=?erdoes)\r\n  }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery526() throws Exception {
		// gunit test on line 4176
		Object retval = execParser("query", 4176, "PREFIX rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\nPREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT DISTINCT ?predicate\r\nWHERE {\r\n  {\r\n    ?person rdf:type foaf:Person .\r\n    ?subject ?predicate ?person\r\n  } UNION {\r\n    ?person rdf:type foaf:Person .\r\n    ?person ?predicate ?object\r\n  }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery527() throws Exception {
		// gunit test on line 4191
		Object retval = execParser("query", 4191, "PREFIX dc: <http://purl.org/dc/elements/1.1/>\r\nINSERT DATA\r\n{ <http://example/book3> dc:title    \"A new book\" ;\r\n                         dc:creator  \"A.N.Other\" .\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery528() throws Exception {
		// gunit test on line 4198
		Object retval = execParser("query", 4198, "PREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\nSELECT ( CONCAT(?G, \" \", ?S) AS ?name )\r\nWHERE  { ?P foaf:givenName ?G ; foaf:surname ?S }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery529() throws Exception {
		// gunit test on line 4202
		Object retval = execParser("query", 4202, "PREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name\r\nWHERE  { \r\n   ?P foaf:givenName ?G ; \r\n      foaf:surname ?S \r\n   BIND(CONCAT(?G, \" \", ?S) AS ?name)\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery530() throws Exception {
		// gunit test on line 4210
		Object retval = execParser("query", 4210, "PREFIX  dc:  <http://purl.org/dc/elements/1.1/>\r\nSELECT  ?title\r\nWHERE   { ?x dc:title ?title\r\n          FILTER regex(?title, \"^SPARQL\") \r\n        }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery531() throws Exception {
		// gunit test on line 4216
		Object retval = execParser("query", 4216, "PREFIX  dc:  <http://purl.org/dc/elements/1.1/>\r\nPREFIX  ns:  <http://example.org/ns#>\r\nSELECT  ?title ?price\r\nWHERE   { ?x ns:price ?price .\r\n          FILTER (?price < 30.5)\r\n          ?x dc:title ?title . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery532() throws Exception {
		// gunit test on line 4223
		Object retval = execParser("query", 4223, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\nWHERE  { { ?x foaf:name ?name . }\r\n         { ?x foaf:mbox ?mbox . }\r\n       }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery533() throws Exception {
		// gunit test on line 4229
		Object retval = execParser("query", 4229, "PREFIX  dc:  <http://purl.org/dc/elements/1.1/>\r\nPREFIX  ns:  <http://example.org/ns#>\r\nSELECT  ?title ?price\r\nWHERE   { ?x dc:title ?title .\r\n          OPTIONAL { ?x ns:price ?price . FILTER (?price < 30) }\r\n        }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery534() throws Exception {
		// gunit test on line 4236
		Object retval = execParser("query", 4236, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox ?hpage\r\nWHERE  { ?x foaf:name  ?name .\r\n         OPTIONAL { ?x foaf:mbox ?mbox } .\r\n         OPTIONAL { ?x foaf:homepage ?hpage }\r\n       }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery535() throws Exception {
		// gunit test on line 4243
		Object retval = execParser("query", 4243, "PREFIX dc10:  <http://purl.org/dc/elements/1.0/>\r\nPREFIX dc11:  <http://purl.org/dc/elements/1.1/>\r\n\r\nSELECT ?title\r\nWHERE  { { ?book dc10:title  ?title } UNION { ?book dc11:title  ?title } }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery536() throws Exception {
		// gunit test on line 4249
		Object retval = execParser("query", 4249, "PREFIX  rdf:    <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\nPREFIX  foaf:   <http://xmlns.com/foaf/0.1/> \r\n\r\nSELECT ?person\r\nWHERE \r\n{\r\n    ?person rdf:type  foaf:Person .\r\n    FILTER NOT EXISTS { ?person foaf:name ?name }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery537() throws Exception {
		// gunit test on line 4259
		Object retval = execParser("query", 4259, "PREFIX  rdf:    <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\nPREFIX  foaf:   <http://xmlns.com/foaf/0.1/> \r\n\r\nSELECT ?person\r\nWHERE \r\n{\r\n    ?person rdf:type  foaf:Person .\r\n    FILTER EXISTS { ?person foaf:name ?name }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery538() throws Exception {
		// gunit test on line 4269
		Object retval = execParser("query", 4269, "PREFIX :       <http://example/>\r\nPREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT DISTINCT ?s\r\nWHERE {\r\n   ?s ?p ?o .\r\n   MINUS {\r\n      ?s foaf:givenName \"Bob\" .\r\n   }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery539() throws Exception {
		// gunit test on line 4280
		Object retval = execParser("query", 4280, "SELECT *\r\n{ \r\n  ?s ?p ?o\r\n  FILTER NOT EXISTS { ?x ?y ?z }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery540() throws Exception {
		// gunit test on line 4286
		Object retval = execParser("query", 4286, "SELECT *\r\n{ \r\n   ?s ?p ?o \r\n   MINUS \r\n     { ?x ?y ?z }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery541() throws Exception {
		// gunit test on line 4293
		Object retval = execParser("query", 4293, "PREFIX : <http://example/>\r\nSELECT * \r\n{ \r\n  ?s ?p ?o \r\n  FILTER NOT EXISTS { :a :b :c }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery542() throws Exception {
		// gunit test on line 4300
		Object retval = execParser("query", 4300, "PREFIX : <http://example/>\r\nSELECT * \r\n{ \r\n  ?s ?p ?o \r\n  MINUS { :a :b :c }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery543() throws Exception {
		// gunit test on line 4307
		Object retval = execParser("query", 4307, "PREFIX : <http://example.com/>\r\nSELECT * WHERE {\r\n        ?a :p ?n\r\n        FILTER NOT EXISTS {\r\n                ?a :q ?m .\r\n                FILTER(?n = ?m)\r\n        }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery544() throws Exception {
		// gunit test on line 4316
		Object retval = execParser("query", 4316, "PREFIX : <http://example/>\r\nSELECT * WHERE {\r\n        ?x :p ?n\r\n        MINUS {\r\n                ?x :q ?m .\r\n                FILTER(?n = ?m)\r\n        }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery545() throws Exception {
		// gunit test on line 4325
		Object retval = execParser("query", 4325, "PREFIX :   <http://example/>\r\nSELECT * \r\n{  ?s :p/:q ?o . }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery546() throws Exception {
		// gunit test on line 4329
		Object retval = execParser("query", 4329, "PREFIX :   <http://example/>\r\nSELECT * \r\n{ :x :p+ ?o }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery547() throws Exception {
		// gunit test on line 4333
		Object retval = execParser("query", 4333, "PREFIX :   <http://example/>\r\nSELECT * \r\n{  \r\n   { :x :p{0} ?o } UNION { :x :p+ ?o } \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery548() throws Exception {
		// gunit test on line 4339
		Object retval = execParser("query", 4339, "PREFIX  dc:  <http://purl.org/dc/elements/1.1/>\r\nPREFIX  ns:  <http://example.org/ns#>\r\n\r\nSELECT  ?title ?price\r\n{  ?x ns:price ?p .\r\n   ?x ns:discount ?discount\r\n   BIND (?p*(1-?discount) AS ?price)\r\n   FILTER(?price < 20)\r\n   ?x dc:title ?title . \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery549() throws Exception {
		// gunit test on line 4350
		Object retval = execParser("query", 4350, "PREFIX dc:   <http://purl.org/dc/elements/1.1/> \r\nPREFIX :     <http://example.org/book/> \r\nPREFIX ns:   <http://example.org/ns#> \r\n\r\nSELECT ?book ?title ?price\r\n{\r\n   ?book dc:title ?title ;\r\n         ns:price ?price .\r\n}\r\nBINDINGS ?book {\r\n (:book1)\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery550() throws Exception {
		// gunit test on line 4363
		Object retval = execParser("query", 4363, "PREFIX dc:   <http://purl.org/dc/elements/1.1/> \r\nPREFIX :     <http://example.org/book/> \r\nPREFIX ns:   <http://example.org/ns#> \r\n\r\nSELECT ?book ?title ?price\r\n{\r\n   ?book dc:title ?title ;\r\n         ns:price ?price .\r\n}\r\nBINDINGS ?book ?title {\r\n (UNDEF \"SPARQL Tutorial\")\r\n (:book2 UNDEF)\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery551() throws Exception {
		// gunit test on line 4377
		Object retval = execParser("query", 4377, "PREFIX : <http://books.example/>\r\nSELECT (SUM(?lprice) AS ?totalPrice)\r\nWHERE {\r\n  ?org :affiliates ?auth .\r\n  ?auth :writesBook ?book .\r\n  ?book :price ?lprice .\r\n}\r\nGROUP BY ?org\r\nHAVING (SUM(?lprice) > 10)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery552() throws Exception {
		// gunit test on line 4387
		Object retval = execParser("query", 4387, "SELECT (AVG(?y) AS ?avg)\r\nWHERE {\r\n  ?a :x ?x ;\r\n     :y ?y .\r\n}\r\nGROUP BY ?x", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery553() throws Exception {
		// gunit test on line 4394
		Object retval = execParser("query", 4394, "PREFIX : <http://data.example/>\r\nSELECT (AVG(?size) AS ?asize)\r\nWHERE {\r\n  ?x :size ?size\r\n}\r\nGROUP BY ?x\r\nHAVING(AVG(?size) > 10)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery554() throws Exception {
		// gunit test on line 4402
		Object retval = execParser("query", 4402, "PREFIX : <http://example.com/data/#>\r\nSELECT ?g (AVG(?p) AS ?avg) ((MIN(?p) + MAX(?p)) / 2 AS ?c)\r\nWHERE {\r\n  ?g :p ?p .\r\n}\r\nGROUP BY ?g", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery555() throws Exception {
		// gunit test on line 4409
		Object retval = execParser("query", 4409, "PREFIX : <http://people.example/>\r\nPREFIX : <http://people.example/>\r\nSELECT ?y ?minName\r\nWHERE {\r\n  :alice :knows ?y .\r\n  {\r\n    SELECT ?y (MIN(?name) AS ?minName)\r\n    WHERE {\r\n      ?y :name ?name .\r\n    } GROUP BY ?y\r\n  }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery556() throws Exception {
		// gunit test on line 4422
		Object retval = execParser("query", 4422, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT  ?name\r\nFROM    <http://example.org/foaf/aliceFoaf>\r\nWHERE   { ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery557() throws Exception {
		// gunit test on line 4427
		Object retval = execParser("query", 4427, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX dc: <http://purl.org/dc/elements/1.1/>\r\n\r\nSELECT ?who ?g ?mbox\r\nFROM <http://example.org/dft.ttl>\r\nFROM NAMED <http://example.org/alice>\r\nFROM NAMED <http://example.org/bob>\r\nWHERE\r\n{\r\n   ?g dc:publisher ?who .\r\n   GRAPH ?g { ?x foaf:mbox ?mbox }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery558() throws Exception {
		// gunit test on line 4440
		Object retval = execParser("query", 4440, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?src ?bobNick\r\nFROM NAMED <http://example.org/foaf/aliceFoaf>\r\nFROM NAMED <http://example.org/foaf/bobFoaf>\r\nWHERE\r\n  {\r\n    GRAPH ?src\r\n    { ?x foaf:mbox <mailto:bob@work.example> .\r\n      ?x foaf:nick ?bobNick\r\n    }\r\n  }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery559() throws Exception {
		// gunit test on line 4453
		Object retval = execParser("query", 4453, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX data: <http://example.org/foaf/>\r\n\r\nSELECT ?nick\r\nFROM NAMED <http://example.org/foaf/aliceFoaf>\r\nFROM NAMED <http://example.org/foaf/bobFoaf>\r\nWHERE\r\n  {\r\n     GRAPH data:bobFoaf {\r\n         ?x foaf:mbox <mailto:bob@work.example> .\r\n         ?x foaf:nick ?nick }\r\n  }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery560() throws Exception {
		// gunit test on line 4466
		Object retval = execParser("query", 4466, "PREFIX  data:  <http://example.org/foaf/>\r\nPREFIX  foaf:  <http://xmlns.com/foaf/0.1/>\r\nPREFIX  rdfs:  <http://www.w3.org/2000/01/rdf-schema#>\r\n\r\nSELECT ?mbox ?nick ?ppd\r\nFROM NAMED <http://example.org/foaf/aliceFoaf>\r\nFROM NAMED <http://example.org/foaf/bobFoaf>\r\nWHERE\r\n{\r\n  GRAPH data:aliceFoaf\r\n  {\r\n    ?alice foaf:mbox <mailto:alice@work.example> ;\r\n           foaf:knows ?whom .\r\n    ?whom  foaf:mbox ?mbox ;\r\n           rdfs:seeAlso ?ppd .\r\n    ?ppd  a foaf:PersonalProfileDocument .\r\n  } .\r\n  GRAPH ?ppd\r\n  {\r\n      ?w foaf:mbox ?mbox ;\r\n         foaf:nick ?nick\r\n  }\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery561() throws Exception {
		// gunit test on line 4490
		Object retval = execParser("query", 4490, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX dc:   <http://purl.org/dc/elements/1.1/>\r\n\r\nSELECT ?name ?mbox ?date\r\nWHERE\r\n  {  ?g dc:publisher ?name ;\r\n        dc:date ?date .\r\n    GRAPH ?g\r\n      { ?person foaf:name ?name ; foaf:mbox ?mbox }\r\n  }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery562() throws Exception {
		// gunit test on line 4501
		Object retval = execParser("query", 4501, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?name\r\nWHERE { ?x foaf:name ?name }\r\nORDER BY ?name", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery563() throws Exception {
		// gunit test on line 4507
		Object retval = execParser("query", 4507, "PREFIX     :    <http://example.org/ns#>\r\nPREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?name\r\nWHERE { ?x foaf:name ?name ; :empId ?emp }\r\nORDER BY DESC(?emp)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery564() throws Exception {
		// gunit test on line 4514
		Object retval = execParser("query", 4514, "PREFIX     :    <http://example.org/ns#>\r\nPREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?name\r\nWHERE { ?x foaf:name ?name ; :empId ?emp }\r\nORDER BY ?name DESC(?emp)", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery565() throws Exception {
		// gunit test on line 4521
		Object retval = execParser("query", 4521, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nSELECT DISTINCT ?name WHERE { ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery566() throws Exception {
		// gunit test on line 4524
		Object retval = execParser("query", 4524, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nSELECT REDUCED ?name WHERE { ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery567() throws Exception {
		// gunit test on line 4527
		Object retval = execParser("query", 4527, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT  ?name\r\nWHERE   { ?x foaf:name ?name }\r\nORDER BY ?name\r\nLIMIT   5\r\nOFFSET  10", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery568() throws Exception {
		// gunit test on line 4535
		Object retval = execParser("query", 4535, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?name\r\nWHERE { ?x foaf:name ?name }\r\nLIMIT 20", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery569() throws Exception {
		// gunit test on line 4541
		Object retval = execParser("query", 4541, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nSELECT ?nameX ?nameY ?nickY\r\nWHERE\r\n  { ?x foaf:knows ?y ;\r\n       foaf:name ?nameX .\r\n    ?y foaf:name ?nameY .\r\n    OPTIONAL { ?y foaf:nick ?nickY }\r\n  }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery570() throws Exception {
		// gunit test on line 4550
		Object retval = execParser("query", 4550, "PREFIX  dc:  <http://purl.org/dc/elements/1.1/>\r\nPREFIX  ns:  <http://example.org/ns#>\r\nSELECT  ?title (?p*(1-?discount) AS ?price)\r\n{ ?x ns:price ?p .\r\n  ?x dc:title ?title . \r\n  ?x ns:discount ?discount \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery571() throws Exception {
		// gunit test on line 4558
		Object retval = execParser("query", 4558, "PREFIX  dc:  <http://purl.org/dc/elements/1.1/>\r\nPREFIX  ns:  <http://example.org/ns#>\r\nSELECT  ?title (?p AS ?fullPrice) (?fullPrice*(1-?discount) AS ?customerPrice)\r\n{ ?x ns:price ?p .\r\n   ?x dc:title ?title . \r\n   ?x ns:discount ?discount \r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery572() throws Exception {
		// gunit test on line 4566
		Object retval = execParser("query", 4566, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nPREFIX vcard:   <http://www.w3.org/2001/vcard-rdf/3.0#>\r\nCONSTRUCT   { <http://example.org/person#Alice> vcard:FN ?name }\r\nWHERE       { ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery573() throws Exception {
		// gunit test on line 4571
		Object retval = execParser("query", 4571, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nPREFIX vcard:   <http://www.w3.org/2001/vcard-rdf/3.0#>\r\n\r\nCONSTRUCT { ?x  vcard:N _:v .\r\n            _:v vcard:givenName ?gname .\r\n            _:v vcard:familyName ?fname }\r\nWHERE\r\n {\r\n    { ?x foaf:firstname ?gname } UNION  { ?x foaf:givenname   ?gname } .\r\n    { ?x foaf:surname   ?fname } UNION  { ?x foaf:family_name ?fname } .\r\n }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery574() throws Exception {
		// gunit test on line 4583
		Object retval = execParser("query", 4583, "PREFIX  dc: <http://purl.org/dc/elements/1.1/>\r\nPREFIX app: <http://example.org/ns#>\r\nPREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\n\r\nCONSTRUCT { ?s ?p ?o } WHERE\r\n {\r\n   GRAPH ?g { ?s ?p ?o } .\r\n   ?g dc:publisher <http://www.w3.org/> .\r\n   ?g dc:date ?date .\r\n   FILTER ( app:customDate(?date) > \"2005-02-28T00:00:00Z\"^^xsd:dateTime ) .\r\n }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery575() throws Exception {
		// gunit test on line 4595
		Object retval = execParser("query", 4595, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX site: <http://example.org/stats#>\r\n\r\nCONSTRUCT { [] foaf:name ?name }\r\nWHERE\r\n{ [] foaf:name ?name ;\r\n     site:hits ?hits .\r\n}\r\nORDER BY desc(?hits)\r\nLIMIT 2", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery576() throws Exception {
		// gunit test on line 4606
		Object retval = execParser("query", 4606, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nCONSTRUCT WHERE { ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery577() throws Exception {
		// gunit test on line 4609
		Object retval = execParser("query", 4609, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\n\r\nCONSTRUCT { ?x foaf:name ?name } \r\nWHERE\r\n{ ?x foaf:name ?name }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery578() throws Exception {
		// gunit test on line 4615
		Object retval = execParser("query", 4615, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nASK  { ?x foaf:name  \"Alice\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery579() throws Exception {
		// gunit test on line 4618
		Object retval = execParser("query", 4618, "PREFIX foaf:    <http://xmlns.com/foaf/0.1/>\r\nASK  { ?x foaf:name  \"Alice\" ;\r\n          foaf:mbox  <mailto:alice@work.example> }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery580() throws Exception {
		// gunit test on line 4622
		Object retval = execParser("query", 4622, "PREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\nDESCRIBE ?x\r\nWHERE    { ?x foaf:mbox <mailto:alice@org> }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery581() throws Exception {
		// gunit test on line 4626
		Object retval = execParser("query", 4626, "PREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\nDESCRIBE ?x\r\nWHERE    { ?x foaf:name \"Alice\" }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery582() throws Exception {
		// gunit test on line 4630
		Object retval = execParser("query", 4630, "PREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\nDESCRIBE ?x ?y <http://example.org/>\r\nWHERE    {?x foaf:knows ?y}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery583() throws Exception {
		// gunit test on line 4634
		Object retval = execParser("query", 4634, "PREFIX a:      <http://www.w3.org/2000/10/annotation-ns#>\r\nPREFIX dc:     <http://purl.org/dc/elements/1.1/>\r\nPREFIX xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?annot\r\nWHERE { ?annot  a:annotates  <http://www.w3.org/TR/rdf-sparql-query/> .\r\n        ?annot  dc:date      ?date .\r\n        FILTER ( ?date > \"2005-01-01T00:00:00Z\"^^xsd:dateTime ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery584() throws Exception {
		// gunit test on line 4643
		Object retval = execParser("query", 4643, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX dc:   <http://purl.org/dc/elements/1.1/>\r\nPREFIX xsd:   <http://www.w3.org/2001/XMLSchema#>\r\nSELECT ?givenName\r\n WHERE { ?x foaf:givenName  ?givenName .\r\n         OPTIONAL { ?x dc:date ?date } .\r\n         FILTER ( bound(?date) ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery585() throws Exception {
		// gunit test on line 4651
		Object retval = execParser("query", 4651, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX dc:   <http://purl.org/dc/elements/1.1/>\r\nSELECT ?name\r\n WHERE { ?x foaf:givenName  ?name .\r\n         OPTIONAL { ?x dc:date ?date } .\r\n         FILTER (!bound(?date)) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery586() throws Exception {
		// gunit test on line 4658
		Object retval = execParser("query", 4658, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name1 ?name2\r\nWHERE { ?x foaf:name  ?name1 ;\r\n        foaf:mbox  ?mbox1 .\r\n        ?y foaf:name  ?name2 ;\r\n        foaf:mbox  ?mbox2 .\r\n        FILTER (?mbox1 = ?mbox2 && ?name1 != ?name2)\r\n      }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery587() throws Exception {
		// gunit test on line 4667
		Object retval = execParser("query", 4667, "PREFIX a:      <http://www.w3.org/2000/10/annotation-ns#>\r\nPREFIX dc:     <http://purl.org/dc/elements/1.1/>\r\nPREFIX xsd:    <http://www.w3.org/2001/XMLSchema#>\r\n\r\nSELECT ?annotates\r\nWHERE { ?annot  a:annotates  ?annotates .\r\n        ?annot  dc:date      ?date .\r\n        FILTER ( ?date = xsd:dateTime(\"2005-01-01T00:00:00Z\") ) \r\n      }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery588() throws Exception {
		// gunit test on line 4677
		Object retval = execParser("query", 4677, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name1 ?name2\r\nWHERE { ?x foaf:name  ?name1 ;\r\n        foaf:mbox  ?mbox1 .\r\n         ?y foaf:name  ?name2 ;\r\n         foaf:mbox  ?mbox2 .\r\n         FILTER (sameTerm(?mbox1, ?mbox2) && !sameTerm(?name1, ?name2))\r\n      }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery589() throws Exception {
		// gunit test on line 4686
		Object retval = execParser("query", 4686, "PREFIX  :      <http://example.org/WMterms#>\r\nPREFIX  t:     <http://example.org/types#>\r\n\r\nSELECT ?aLabel1 ?bLabel\r\nWHERE { ?a  :label        ?aLabel .\r\n        ?a  :weight       ?aWeight .\r\n        ?a  :displacement ?aDisp .\r\n\r\n        ?b  :label        ?bLabel .\r\n        ?b  :weight       ?bWeight .\r\n        ?b  :displacement ?bDisp .\r\n\r\n        FILTER ( sameTerm(?aWeight, ?bWeight) && !sameTerm(?aDisp, ?bDisp)) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery590() throws Exception {
		// gunit test on line 4700
		Object retval = execParser("query", 4700, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\n WHERE { ?x foaf:name  ?name ;\r\n            foaf:mbox  ?mbox .\r\n         FILTER isIRI(?mbox) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery591() throws Exception {
		// gunit test on line 4706
		Object retval = execParser("query", 4706, "PREFIX a:      <http://www.w3.org/2000/10/annotation-ns#>\r\nPREFIX dc:     <http://purl.org/dc/elements/1.1/>\r\nPREFIX foaf:   <http://xmlns.com/foaf/0.1/>\r\n\r\nSELECT ?given ?family\r\nWHERE { ?annot  a:annotates  <http://www.w3.org/TR/rdf-sparql-query/> .\r\n  ?annot  dc:creator   ?c .\r\n  OPTIONAL { ?c  foaf:given   ?given ; foaf:family  ?family } .\r\n  FILTER isBlank(?c)\r\n}", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery592() throws Exception {
		// gunit test on line 4717
		Object retval = execParser("query", 4717, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\nWHERE { ?x foaf:name  ?name ;\r\n        foaf:mbox  ?mbox .\r\n        FILTER isLiteral(?mbox) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery593() throws Exception {
		// gunit test on line 4723
		Object retval = execParser("query", 4723, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\n WHERE { ?x foaf:name  ?name ;\r\n            foaf:mbox  ?mbox .\r\n         FILTER regex(str(?mbox), \"@work.example\") }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery594() throws Exception {
		// gunit test on line 4729
		Object retval = execParser("query", 4729, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name ?mbox\r\n WHERE { ?x foaf:name  ?name ;\r\n            foaf:mbox  ?mbox .\r\n         FILTER ( lang(?name) = \"ES\" ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery595() throws Exception {
		// gunit test on line 4735
		Object retval = execParser("query", 4735, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX xsd:  <http://www.w3.org/2001/XMLSchema#>\r\nPREFIX eg:   <http://biometrics.example/ns#>\r\nSELECT ?name ?shoeSize\r\n WHERE { ?x foaf:name  ?name ; eg:shoeSize  ?shoeSize .\r\n         FILTER ( datatype(?shoeSize) = xsd:integer ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery596() throws Exception {
		// gunit test on line 4742
		Object retval = execParser("query", 4742, "PREFIX dc: <http://purl.org/dc/elements/1.1/>\r\nSELECT ?title\r\n WHERE { ?x dc:title  \"That Seventies Show\"@en ;\r\n            dc:title  ?title .\r\n         FILTER langMatches( lang(?title), \"FR\" ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery597() throws Exception {
		// gunit test on line 4748
		Object retval = execParser("query", 4748, "PREFIX dc: <http://purl.org/dc/elements/1.1/>\r\nSELECT ?title\r\n WHERE { ?x dc:title  ?title .\r\n         FILTER langMatches( lang(?title), \"*\" ) }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery598() throws Exception {
		// gunit test on line 4753
		Object retval = execParser("query", 4753, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nSELECT ?name\r\n WHERE { ?x foaf:name  ?name\r\n         FILTER regex(?name, \"^ali\", \"i\") }", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}

	public void testQuery599() throws Exception {
		// gunit test on line 4758
		Object retval = execParser("query", 4758, "PREFIX foaf: <http://xmlns.com/foaf/0.1/>\r\nPREFIX func: <http://example.org/functions#>\r\nSELECT ?name ?id\r\nWHERE { ?x foaf:name  ?name ;\r\n           func:empId   ?id .\r\n        FILTER (func:even(?id)) } ", false);
		Object actual = examineExecResult(org.antlr.gunit.gUnitParser.OK, retval);
		Object expecting = "OK";

		assertEquals("testing rule "+"query", expecting, actual);
	}



}