package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class LogicalANDExpression extends CompositeTokenTransformation {
    public static final String NAME = "logicalANDExpression";

    public LogicalANDExpression(TokenApplier applier) {
        super(NAME, applier);
    }
}
