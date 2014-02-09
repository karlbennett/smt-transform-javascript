package shiver.me.timbers.transform.javascript;

import shiver.me.timbers.transform.antlr4.StaticNameListBuilder;
import shiver.me.timbers.transform.javascript.types.Break;
import shiver.me.timbers.transform.javascript.types.Case;
import shiver.me.timbers.transform.javascript.types.Catch;
import shiver.me.timbers.transform.javascript.types.Continue;
import shiver.me.timbers.transform.javascript.types.Default;
import shiver.me.timbers.transform.javascript.types.Delete;
import shiver.me.timbers.transform.javascript.types.Do;
import shiver.me.timbers.transform.javascript.types.Else;
import shiver.me.timbers.transform.javascript.types.False;
import shiver.me.timbers.transform.javascript.types.Finally;
import shiver.me.timbers.transform.javascript.types.For;
import shiver.me.timbers.transform.javascript.types.Function;
import shiver.me.timbers.transform.javascript.types.If;
import shiver.me.timbers.transform.javascript.types.In;
import shiver.me.timbers.transform.javascript.types.Instanceof;
import shiver.me.timbers.transform.javascript.types.New;
import shiver.me.timbers.transform.javascript.types.Null;
import shiver.me.timbers.transform.javascript.types.Return;
import shiver.me.timbers.transform.javascript.types.Switch;
import shiver.me.timbers.transform.javascript.types.This;
import shiver.me.timbers.transform.javascript.types.Throw;
import shiver.me.timbers.transform.javascript.types.True;
import shiver.me.timbers.transform.javascript.types.Try;
import shiver.me.timbers.transform.javascript.types.Typeof;
import shiver.me.timbers.transform.javascript.types.Var;
import shiver.me.timbers.transform.javascript.types.Void;
import shiver.me.timbers.transform.javascript.types.While;
import shiver.me.timbers.transform.javascript.types.With;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.unmodifiableList;

/**
 * This class contains constants to help with parsing JavaScript keywords.
 */
public final class KeyWords {

    private KeyWords() {
    }

    /**
     * All the transformation types of the JavaScript keyword types.
     */
    @SuppressWarnings("unchecked")
    public static final List<Class> KEYWORDS = unmodifiableList(Arrays.<Class>asList(
            Break.class, Case.class, Catch.class, Continue.class, Default.class, Delete.class, Do.class, Else.class,
            False.class, Finally.class, For.class, Function.class, If.class, In.class, Instanceof.class, New.class,
            Null.class, Return.class, Switch.class, This.class, Throw.class, True.class, Try.class, Typeof.class,
            Var.class, Void.class, While.class, With.class
    ));

    /**
     * All the names of the JavaScript keyword types.
     */
    @SuppressWarnings("unchecked")
    public static final List<String> KEYWORD_NAMES = unmodifiableList(
            new StaticNameListBuilder((Iterable) KEYWORDS).build());
}
