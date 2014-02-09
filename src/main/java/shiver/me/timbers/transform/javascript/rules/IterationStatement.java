package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class IterationStatement extends CompositeTokenTransformation {
    public static final String NAME = "iterationStatement";

    public IterationStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
