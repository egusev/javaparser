package com.github.javaparser.ast.jsx;

/**
 * Created by eugene on 30/06/16.
 */
public abstract class JsxValue extends JsxNode {
    public JsxValue(int beginLine, int beginColumn, int endLine, int endColumn) {
        super(beginLine, beginColumn, endLine, endColumn);
    }

    public JsxValue() {
    }
}
