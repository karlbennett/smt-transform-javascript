package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class VariableDeclaration extends CompositeTokenTransformation {
    public static final String NAME = "variableDeclaration";

    public VariableDeclaration(TokenApplier applier) {
        super(NAME, applier);
    }
}
