package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class CaseBlock extends CompositeTokenTransformation {
    public static final String NAME = "caseBlock";

    public CaseBlock(TokenApplier applier) {
        super(NAME, applier);
    }
}
