package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class NumericLiteral extends CompositeTokenTransformation {
    public static final String NAME = "NumericLiteral";

    public NumericLiteral(TokenApplier applier) {
        super(NAME, applier);
    }
}
