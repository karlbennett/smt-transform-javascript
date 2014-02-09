package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class False extends CompositeTokenTransformation {
    public static final String NAME = "'false'";

    public False(TokenApplier applier) {
        super(NAME, applier);
    }
}
