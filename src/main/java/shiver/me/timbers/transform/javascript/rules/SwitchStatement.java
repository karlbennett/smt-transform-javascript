package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class SwitchStatement extends CompositeTokenTransformation {
    public static final String NAME = "switchStatement";

    public SwitchStatement(TokenApplier applier) {
        super(NAME, applier);
    }
}
