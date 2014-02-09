package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class AdditiveExpression extends CompositeTokenTransformation {
    public static final String NAME = "additiveExpression";

    public AdditiveExpression(TokenApplier applier) {
        super(NAME, applier);
    }
}
