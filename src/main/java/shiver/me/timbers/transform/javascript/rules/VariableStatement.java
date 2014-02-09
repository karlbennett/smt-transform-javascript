package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class VariableStatement extends CompositeTokenTransformation {
    public static final String NAME = "variableStatement";

    public VariableStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
