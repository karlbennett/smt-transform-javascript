package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class New extends CompositeTokenTransformation {
    public static final String NAME = "'new'";

    public New(TokenApplier applier) {
        super(NAME, applier);
    }
}
