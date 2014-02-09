package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class VariableDeclarationList extends CompositeTokenTransformation {
    public static final String NAME = "variableDeclarationList";

    public VariableDeclarationList(TokenApplier applier) {
        super(NAME, applier);
    }
}
