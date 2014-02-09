package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ForStatement extends CompositeTokenTransformation {
    public static final String NAME = "forStatement";

    public ForStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
