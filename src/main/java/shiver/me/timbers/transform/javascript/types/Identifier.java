package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Identifier extends CompositeTokenTransformation {
    public static final String NAME = "Identifier";

    public Identifier(TokenApplier applier) {
        super(NAME, applier);
    }
}
