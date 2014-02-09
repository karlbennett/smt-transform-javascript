package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class FunctionDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "functionDeclaration";

    public FunctionDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
