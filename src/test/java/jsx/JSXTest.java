package jsx;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.io.InputStream;

@RunWith(DataProviderRunner.class)
public class JSXTest {

    @Test
    @DataProvider(value = {
            "EmptyJava.java",
            "EmptyJSX1.java",
            "EmptyJSX2.java",
            "EmptyJSX3.java",
            "NameSpaceEmptyJSX1.java",
            "NameSpaceEmptyJSX2.java",
            "AttributesJSX1.java",
            "AttributesJSX2.java",
            "AttributesJSX3.java",
            "AttributesJSX4.java",
            "ChildrenJSX1.java",
            "ChildrenJSX2.java",
            "ChildrenJSX3.java",
            "ChildrenJSX4.java",
            "JSX1.java",
            "Test.java"
    })
    public void testSuccess(String resource) throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream(resource)) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test(expected = com.github.javaparser.ParseException.class)
    public void testFailedEmptyJSX1() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("FailedEmptyJSX1.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test(expected = com.github.javaparser.ParseException.class)
    public void testFailedEmptyJSX2() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("FailedEmptyJSX2.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test(expected = com.github.javaparser.ParseException.class)
    public void testFailedEmptyJSX3() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("FailedEmptyJSX3.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }
}
