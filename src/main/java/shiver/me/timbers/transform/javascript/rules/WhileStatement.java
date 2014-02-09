package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class WhileStatement extends CompositeTokenTransformation {
    public static final String NAME = "whileStatement";

    public WhileStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
