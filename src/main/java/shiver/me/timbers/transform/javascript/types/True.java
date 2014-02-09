package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class True extends CompositeTokenTransformation {
    public static final String NAME = "'true'";

    public True(TokenApplier applier) {
        super(NAME, applier);
    }
}
