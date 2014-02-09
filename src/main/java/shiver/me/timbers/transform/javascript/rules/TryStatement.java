package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class TryStatement extends CompositeTokenTransformation {
    public static final String NAME = "tryStatement";

    public TryStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
