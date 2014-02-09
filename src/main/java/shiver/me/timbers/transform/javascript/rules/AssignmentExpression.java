package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class AssignmentExpression extends CompositeTokenTransformation {
    public static final String NAME = "assignmentExpression";

    public AssignmentExpression(TokenApplier applier) {
        super(NAME, applier);
    }
}
