package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class StatementBlock extends CompositeTokenTransformation {
    public static final String NAME = "statementBlock";

    public StatementBlock(TokenApplier applier) {
        super(NAME, applier);
    }
}
