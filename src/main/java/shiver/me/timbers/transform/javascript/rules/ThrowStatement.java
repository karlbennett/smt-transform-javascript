package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ThrowStatement extends CompositeTokenTransformation {
    public static final String NAME = "throwStatement";

    public ThrowStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
