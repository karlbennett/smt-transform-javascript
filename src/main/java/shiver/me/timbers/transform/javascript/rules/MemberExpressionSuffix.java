package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class MemberExpressionSuffix extends CompositeTokenTransformation {
    public static final String NAME = "memberExpressionSuffix";

    public MemberExpressionSuffix(TokenApplier applier) {
        super(NAME, applier);
    }
}
