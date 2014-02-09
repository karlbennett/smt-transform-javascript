package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Initialiser extends CompositeTokenTransformation {
    public static final String NAME = "initialiser";

    public Initialiser(TokenApplier applier) {
        super(NAME, applier);
    }
}
