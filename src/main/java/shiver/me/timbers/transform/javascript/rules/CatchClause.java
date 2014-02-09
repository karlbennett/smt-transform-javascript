package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class CatchClause extends CompositeTokenTransformation {
    public static final String NAME = "catchClause";

    public CatchClause(TokenApplier applier) {
        super(NAME, applier);
    }
}
