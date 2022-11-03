import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;


public class Main {
    public static void main(String[] args) throws Exception {
        try{
            // Crear un analizador lexico que se alimenta de la entrada
            CoralLexer lexer;
            if (args.length > 0){
                lexer = new CoralLexer(CharStreams.fromFileName(args[0]));
            }
            else{
                lexer = new CoralLexer(CharStreams.fromStream(System.in));
            }

            // Identificar el analizador lexico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto del analizador sintactico que se alimenta del buffer de tokens
            CoralParser parser = new CoralParser(tokens);
            ParseTree tree = parser.inicio();
            System.out.println(tree.toStringTree(parser));

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new FunctionTranslate(), tree);
            System.out.println();


        } catch (Exception e){
            System.err.println("Errror (test): " + e);
        }
    }
}
