package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ForInStatement extends CompositeTokenTransformation {
    public static final String NAME = "forInStatement";

    public ForInStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
