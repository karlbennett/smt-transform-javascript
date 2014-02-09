package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Var extends CompositeTokenTransformation {
    public static final String NAME = "'var'";

    public Var(TokenApplier applier) {
        super(NAME, applier);
    }
}
