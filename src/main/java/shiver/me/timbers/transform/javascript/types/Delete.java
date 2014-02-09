package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Delete extends CompositeTokenTransformation {
    public static final String NAME = "'delete'";

    public Delete(TokenApplier applier) {
        super(NAME, applier);
    }
}
