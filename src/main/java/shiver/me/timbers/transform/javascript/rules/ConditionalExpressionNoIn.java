package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ConditionalExpressionNoIn extends CompositeTokenTransformation {
    public static final String NAME = "conditionalExpressionNoIn";

    public ConditionalExpressionNoIn(TokenApplier applier) {
        super(NAME, applier);
    }
}
