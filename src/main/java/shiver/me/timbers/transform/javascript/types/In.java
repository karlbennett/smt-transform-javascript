package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class In extends CompositeTokenTransformation {
    public static final String NAME = "'in'";

    public In(TokenApplier applier) {
        super(NAME, applier);
    }
}
