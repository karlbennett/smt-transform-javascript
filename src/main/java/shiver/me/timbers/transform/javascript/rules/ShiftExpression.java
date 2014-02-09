package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ShiftExpression extends CompositeTokenTransformation {
    public static final String NAME = "shiftExpression";

    public ShiftExpression(TokenApplier applier) {
        super(NAME, applier);
    }
}
