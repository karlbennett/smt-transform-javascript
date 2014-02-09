package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class UnaryExpression extends CompositeTokenTransformation {
    public static final String NAME = "unaryExpression";

    public UnaryExpression(TokenApplier applier) {
        super(NAME, applier);
    }
}
