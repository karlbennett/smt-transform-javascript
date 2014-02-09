package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class For extends CompositeTokenTransformation {
    public static final String NAME = "'for'";

    public For(TokenApplier applier) {
        super(NAME, applier);
    }
}
