package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class ObjectLiteral extends CompositeTokenTransformation {
    public static final String NAME = "objectLiteral";

    public ObjectLiteral(TokenApplier applier) {
        super(NAME, applier);
    }
}
