package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ArrayLiteral extends CompositeTokenTransformation {
    public static final String NAME = "arrayLiteral";

    public ArrayLiteral(TokenApplier applier) {
        super(NAME, applier);
    }
}
