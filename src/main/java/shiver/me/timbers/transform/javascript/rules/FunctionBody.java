package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class FunctionBody extends CompositeTokenTransformation {
    public static final String NAME = "functionBody";

    public FunctionBody(TokenApplier applier) {
        super(NAME, applier);
    }
}
