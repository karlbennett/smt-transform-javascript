package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ForInStatementInitialiserPart extends CompositeTokenTransformation {
    public static final String NAME = "forInStatementInitialiserPart";

    public ForInStatementInitialiserPart(TokenApplier applier) {
        super(NAME, applier);
    }
}
