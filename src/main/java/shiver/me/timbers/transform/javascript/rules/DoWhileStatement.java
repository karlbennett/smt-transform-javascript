package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class DoWhileStatement extends CompositeTokenTransformation {
    public static final String NAME = "doWhileStatement";

    public DoWhileStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
