package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class SourceElement extends CompositeTokenTransformation {
    public static final String NAME = "sourceElement";

    public SourceElement(TokenApplier applier) {
        super(NAME, applier);
    }
}
