package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Typeof extends CompositeTokenTransformation {
    public static final String NAME = "'typeof'";

    public Typeof(TokenApplier applier) {
        super(NAME, applier);
    }
}
