package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class SourceElements extends CompositeTokenTransformation {
    public static final String NAME = "sourceElements";

    public SourceElements(TokenApplier applier) {
        super(NAME, applier);
    }
}
