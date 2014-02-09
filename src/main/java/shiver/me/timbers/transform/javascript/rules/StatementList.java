package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class StatementList extends CompositeTokenTransformation {
    public static final String NAME = "statementList";

    public StatementList(TokenApplier applier) {
        super(NAME, applier);
    }
}
