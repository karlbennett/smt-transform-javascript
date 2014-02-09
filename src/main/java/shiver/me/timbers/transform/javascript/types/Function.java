package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Function extends CompositeTokenTransformation {
    public static final String NAME = "'function'";

    public Function(TokenApplier applier) {
        super(NAME, applier);
    }
}
