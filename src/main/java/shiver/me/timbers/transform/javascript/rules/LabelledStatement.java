package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class LabelledStatement extends CompositeTokenTransformation {
    public static final String NAME = "labelledStatement";

    public LabelledStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
