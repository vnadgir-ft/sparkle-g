import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import com.googlecode.sparkleg.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SparqlLexer lex = new SparqlLexer(new ANTLRFileStream("C:\\Development\\projects\\ws\\sparql30\\sparkle-pretty-printer\\src\\main\\antlr3\\com\\googlecode\\sparkleg\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SparqlParser g = new SparqlParser(tokens, 49100, null);
        try {
            g.query();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}