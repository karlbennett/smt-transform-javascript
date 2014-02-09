package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class CallExpression extends CompositeTokenTransformation {
    public static final String NAME = "callExpression";

    public CallExpression(TokenApplier applier) {
        super(NAME, applier);
    }
}
