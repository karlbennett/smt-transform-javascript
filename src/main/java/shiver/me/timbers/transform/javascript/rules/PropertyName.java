package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class PropertyName extends CompositeTokenTransformation {
    public static final String NAME = "propertyName";

    public PropertyName(TokenApplier applier) {
        super(NAME, applier);
    }
}
