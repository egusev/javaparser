package jsx;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.junit.Test;

import java.io.InputStream;

public class JSXTest {

    @Test
    public void testEmptyJava() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("EmptyJava.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test
    public void testEmptyJSX1() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("EmptyJSX1.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test
    public void testEmptyJSX2() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("EmptyJSX2.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }


    @Test
    public void testEmptyJSX3() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("EmptyJSX3.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test
    public void testEmptyJSX4() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("EmptyJSX4.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test
    public void testNameSpaceEmptyJSX1() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("NameSpaceEmptyJSX1.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test
    public void testNameSpaceEmptyJSX2() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("NameSpaceEmptyJSX2.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test
    public void testAttributesJSX1() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("AttributesJSX1.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test
    public void testAttributesJSX2() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("AttributesJSX2.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test
    public void testAttributesJSX3() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("AttributesJSX3.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test
    public void testAttributesJSX4() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("AttributesJSX4.java")) {
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

    @Test
    public void testJSX1() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("JSX1.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }

    @Test
    public void testTest() throws Exception {
        try (InputStream in = JSXTest.class.getResourceAsStream("Test.java")) {
            CompilationUnit cu = JavaParser.parse(in);
        }
    }
}
