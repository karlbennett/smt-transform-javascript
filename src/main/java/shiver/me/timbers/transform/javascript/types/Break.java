package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Break extends CompositeTokenTransformation {
    public static final String NAME = "'break'";

    public Break(TokenApplier applier) {
        super(NAME, applier);
    }
}
