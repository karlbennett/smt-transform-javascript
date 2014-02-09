package shiver.me.timbers.transform.javascript;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;
import shiver.me.timbers.transform.antlr4.IterableTokenTransformations;
import shiver.me.timbers.transform.language.test.TransformerTestTemplate;

import static org.junit.Assert.assertEquals;
import static shiver.me.timbers.transform.javascript.FileConstants.INVALID_TEST_FILE_SOURCE;
import static shiver.me.timbers.transform.javascript.FileConstants.TEST_FILE_SOURCE;
import static shiver.me.timbers.transform.javascript.FileConstants.TRANSFORMED_COMMENTS_SOURCE;
import static shiver.me.timbers.transform.javascript.FileConstants.TRANSFORMED_INVALID_SOURCE;
import static shiver.me.timbers.transform.javascript.FileConstants.TRANSFORMED_KEYWORDS_SOURCE;
import static shiver.me.timbers.transform.javascript.FileConstants.TRANSFORMED_RULES_SOURCE;
import static shiver.me.timbers.transform.javascript.FileConstants.TRANSFORMED_SOURCE;
import static shiver.me.timbers.transform.javascript.FileConstants.TRANSFORMED_TYPES_SOURCE;
import static shiver.me.timbers.transform.javascript.TransformationsConstants.ALL_TRANSFORMATIONS;
import static shiver.me.timbers.transform.javascript.TransformationsConstants.COMMENT_TRANSFORMATIONS;
import static shiver.me.timbers.transform.javascript.TransformationsConstants.KEYWORD_TRANSFORMATIONS;
import static shiver.me.timbers.transform.javascript.TransformationsConstants.RULES_TRANSFORMATIONS;
import static shiver.me.timbers.transform.javascript.TransformationsConstants.TYPES_TRANSFORMATIONS;
import static shiver.me.timbers.transform.javascript.TransformationsConstants.UNUSED_TRANSFORMATIONS;

public class JavaScriptTransformerTest implements TransformerTestTemplate {

    @Test
    @Override
    public void testCreate() {

        new JavaScriptTransformer();
    }

    @Test
    @Override
    public void testTransform() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_SOURCE,
                new JavaScriptTransformer().transform(TEST_FILE_SOURCE, ALL_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformKeywordsOnly() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_KEYWORDS_SOURCE,
                new JavaScriptTransformer().transform(TEST_FILE_SOURCE, KEYWORD_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformCommentsOnly() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_COMMENTS_SOURCE,
                new JavaScriptTransformer().transform(TEST_FILE_SOURCE, COMMENT_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformWithInvalidSource() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_INVALID_SOURCE,
                new JavaScriptTransformer().transform(INVALID_TEST_FILE_SOURCE,
                        ALL_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformWithTypesOnly() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_TYPES_SOURCE,
                new JavaScriptTransformer().transform(TEST_FILE_SOURCE, TYPES_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformWithRulesOnly() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_RULES_SOURCE,
                new JavaScriptTransformer().transform(TEST_FILE_SOURCE, RULES_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformWithNoTransformations() {

        assertEquals("the source should be Transformed correctly.", TEST_FILE_SOURCE,
                new JavaScriptTransformer().transform(TEST_FILE_SOURCE, new IterableTokenTransformations())
        );
    }

    @Test
    @Override
    public void testTransformWithIrrelevantTransformations() {

        assertEquals("the source should be Transformed correctly.", TEST_FILE_SOURCE,
                new JavaScriptTransformer().transform(TEST_FILE_SOURCE, UNUSED_TRANSFORMATIONS));
    }

    @Test(expected = AssertionError.class)
    @Override
    public void testTransformWithNullTransformations() {

        new JavaScriptTransformer().transform(TEST_FILE_SOURCE, null);
    }

    @Test(expected = NullPointerException.class)
    @Override
    public void testTransformWithNullInput() {

        new JavaScriptTransformer().transform(null, ALL_TRANSFORMATIONS);
    }
}
