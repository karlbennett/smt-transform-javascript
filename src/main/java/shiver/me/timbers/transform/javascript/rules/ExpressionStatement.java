package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ExpressionStatement extends CompositeTokenTransformation {
    public static final String NAME = "expressionStatement";

    public ExpressionStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
