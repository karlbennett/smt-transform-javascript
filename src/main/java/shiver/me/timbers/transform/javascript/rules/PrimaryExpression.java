package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class PrimaryExpression extends CompositeTokenTransformation {
    public static final String NAME = "primaryExpression";

    public PrimaryExpression(TokenApplier applier) {
        super(NAME, applier);
    }
}
