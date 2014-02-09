package shiver.me.timbers.transform.javascript.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Program extends CompositeTokenTransformation {
    public static final String NAME = "program";

    public Program(TokenApplier applier) {
        super(NAME, applier);
    }
}