package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class VariableDeclarationNoIn extends CompositeTokenTransformation {
    public static final String NAME = "variableDeclarationNoIn";

    public VariableDeclarationNoIn(TokenApplier applier) {
        super(NAME, applier);
    }
}
