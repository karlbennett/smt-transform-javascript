package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class LogicalORExpressionNoIn extends CompositeTokenTransformation {
    public static final String NAME = "logicalORExpressionNoIn";

    public LogicalORExpressionNoIn(TokenApplier applier) {
        super(NAME, applier);
    }
}
