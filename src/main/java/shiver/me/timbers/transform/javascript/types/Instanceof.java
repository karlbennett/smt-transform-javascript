package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Instanceof extends CompositeTokenTransformation {
    public static final String NAME = "'instanceof'";

    public Instanceof(TokenApplier applier) {
        super(NAME, applier);
    }
}
