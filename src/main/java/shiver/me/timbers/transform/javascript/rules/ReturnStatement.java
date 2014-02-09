package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ReturnStatement extends CompositeTokenTransformation {
    public static final String NAME = "returnStatement";

    public ReturnStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
