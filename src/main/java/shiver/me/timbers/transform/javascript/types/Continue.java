package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Continue extends CompositeTokenTransformation {
    public static final String NAME = "'continue'";

    public Continue(TokenApplier applier) {
        super(NAME, applier);
    }
}
