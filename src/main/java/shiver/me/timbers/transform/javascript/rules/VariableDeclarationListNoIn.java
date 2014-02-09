package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class VariableDeclarationListNoIn extends CompositeTokenTransformation {
    public static final String NAME = "variableDeclarationListNoIn";

    public VariableDeclarationListNoIn(TokenApplier applier) {
        super(NAME, applier);
    }
}
