package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class MemberExpression extends CompositeTokenTransformation {
    public static final String NAME = "memberExpression";

    public MemberExpression(TokenApplier applier) {
        super(NAME, applier);
    }
}
