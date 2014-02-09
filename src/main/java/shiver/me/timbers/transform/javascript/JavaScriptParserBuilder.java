package shiver.me.timbers.transform.javascript;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import shiver.me.timbers.antlr4.JavaScriptLexer;
import shiver.me.timbers.antlr4.JavaScriptParser;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.antlr4.ParserBuilder;
import shiver.me.timbers.transform.antlr4.TokenTransformation;
import shiver.me.timbers.transform.antlr4.listeners.LoggingErrorListener;
import shiver.me.timbers.transform.antlr4.listeners.TransformationAwareErrorListener;

/**
 * A {@code ParserBuilder} for the ANTLR4 {@code JavaScriptParser}.
 */
public class JavaScriptParserBuilder implements ParserBuilder<JavaScriptParser> {

    @Override
    public JavaScriptParser buildParser(String source, Transformations<TokenTransformation> errorTransformations) {

        final CharStream charStream = new ANTLRInputStream(source);

        final JavaScriptLexer lexer = new JavaScriptLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new LoggingErrorListener());

        final TokenStream tokenStream = new BufferedTokenStream(lexer);

        final JavaScriptParser parser = new JavaScriptParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new TransformationAwareErrorListener(new LoggingErrorListener(), errorTransformations));

        return parser;
    }

    @Override
    public ParseTree parse(JavaScriptParser parser) {

        return parser.program();
    }
}
