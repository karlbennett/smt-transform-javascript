package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class WithStatement extends CompositeTokenTransformation {
    public static final String NAME = "withStatement";

    public WithStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
