package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class BitwiseXORExpressionNoIn extends CompositeTokenTransformation {
    public static final String NAME = "bitwiseXORExpressionNoIn";

    public BitwiseXORExpressionNoIn(TokenApplier applier) {
        super(NAME, applier);
    }
}
