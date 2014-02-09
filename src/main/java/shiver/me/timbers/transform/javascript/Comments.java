package shiver.me.timbers.transform.javascript;

import shiver.me.timbers.transform.antlr4.StaticNameListBuilder;
import shiver.me.timbers.transform.javascript.types.Comment;
import shiver.me.timbers.transform.javascript.types.LineComment;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.unmodifiableList;

/**
 * This class contains constants to help with parsing JavaScript comments.
 */
public final class Comments {

    private Comments() {
    }

    /**
     * All the names of the JavaScript comment types.
     */
    @SuppressWarnings("unchecked")
    public static final List<Class> COMMENTS = unmodifiableList(
            Arrays.<Class>asList(Comment.class, LineComment.class));

    @SuppressWarnings("unchecked")
    public static final List<String> COMMENT_NAMES = unmodifiableList(
            new StaticNameListBuilder((Iterable) COMMENTS).build());
}
