package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class PostfixExpression extends CompositeTokenTransformation {
    public static final String NAME = "postfixExpression";

    public PostfixExpression(TokenApplier applier) {
        super(NAME, applier);
    }
}
