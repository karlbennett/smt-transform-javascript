package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Finally extends CompositeTokenTransformation {
    public static final String NAME = "'finally'";

    public Finally(TokenApplier applier) {
        super(NAME, applier);
    }
}
