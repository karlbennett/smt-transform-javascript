package shiver.me.timbers.transform.javascript;

import shiver.me.timbers.antlr4.JavaScriptParser;
import shiver.me.timbers.transform.antlr4.Antlr4StringTransformer;

import javax.activation.MimeType;

/**
 * A StringTransformer for JavaScript source code, it will apply any Transformations that have names matching the
 * different token and rule names. These names can be found in the {@link JavaScriptParser#tokenNames} and
 * {@link JavaScriptParser#ruleNames} arrays.
 */
public class JavaScriptTransformer extends Antlr4StringTransformer<JavaScriptParser> {

    public static final MimeType APPLICATION_JAVASCRIPT = quietMimeType("application", "javascript");

    public JavaScriptTransformer() {
        super(APPLICATION_JAVASCRIPT, new JavaScriptParserBuilder());
    }
}
