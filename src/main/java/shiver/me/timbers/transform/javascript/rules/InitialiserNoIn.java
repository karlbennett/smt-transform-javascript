package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class InitialiserNoIn extends CompositeTokenTransformation {
    public static final String NAME = "initialiserNoIn";

    public InitialiserNoIn(TokenApplier applier) {
        super(NAME, applier);
    }
}
