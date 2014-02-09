package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class LogicalANDExpressionNoIn extends CompositeTokenTransformation {
    public static final String NAME = "logicalANDExpressionNoIn";

    public LogicalANDExpressionNoIn(TokenApplier applier) {
        super(NAME, applier);
    }
}
