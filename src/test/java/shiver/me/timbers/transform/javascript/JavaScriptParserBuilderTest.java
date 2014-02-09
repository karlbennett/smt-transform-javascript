package shiver.me.timbers.transform.javascript;

import org.junit.Test;
import shiver.me.timbers.transform.language.test.ParserBuilderTestTemplate;

import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.buildParserTest;
import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.buildParserWithNullSourceStringTest;
import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.buildParserWithNullTransformationsTest;
import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.parseTest;
import static shiver.me.timbers.transform.language.test.ParserBuilderTestUtils.parseWithNullParserTest;

public class JavaScriptParserBuilderTest implements ParserBuilderTestTemplate {

    @Test
    @Override
    public void testBuildParser() {

        buildParserTest(new JavaScriptParserBuilder());
    }

    @Test(expected = NullPointerException.class)
    @Override
    public void testBuildParserWithNullSourceString() {

        buildParserWithNullSourceStringTest(new JavaScriptParserBuilder());
    }

    @Test(expected = AssertionError.class)
    @Override
    public void testBuildParserWithNullTransformations() {

        buildParserWithNullTransformationsTest(new JavaScriptParserBuilder());
    }

    @Test
    @Override
    public void testParse() {

        parseTest(new JavaScriptParserBuilder());
    }

    @Test(expected = NullPointerException.class)
    @Override
    public void testParseWithNullParser() {

        parseWithNullParserTest(new JavaScriptParserBuilder());
    }
}
