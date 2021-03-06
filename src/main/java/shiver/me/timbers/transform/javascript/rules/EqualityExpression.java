package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class EqualityExpression extends CompositeTokenTransformation {
    public static final String NAME = "equalityExpression";

    public EqualityExpression(TokenApplier applier) {
        super(NAME, applier);
    }
}
