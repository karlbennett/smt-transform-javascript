package shiver.me.timbers.transform.javascript.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Do extends CompositeTokenTransformation {
    public static final String NAME = "'do'";

    public Do(TokenApplier applier) {
        super(NAME, applier);
    }
}
