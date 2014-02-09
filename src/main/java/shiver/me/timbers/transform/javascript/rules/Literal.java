package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Literal extends CompositeTokenTransformation {
    public static final String NAME = "literal";

    public Literal(TokenApplier applier) {
        super(NAME, applier);
    }
}
