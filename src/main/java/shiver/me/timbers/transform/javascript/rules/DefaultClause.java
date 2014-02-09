package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class DefaultClause extends CompositeTokenTransformation {
    public static final String NAME = "defaultClause";

    public DefaultClause(TokenApplier applier) {
        super(NAME, applier);
    }
}
