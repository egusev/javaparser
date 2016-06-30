package com.github.javaparser.ast.jsx;

import com.github.javaparser.ast.Node;

/**
 * Created by eugene on 30/06/16.
 */
public abstract class JsxNode extends Node {
    public JsxNode() {
    }

    public JsxNode(int beginLine, int beginColumn, int endLine, int endColumn) {
        super(beginLine, beginColumn, endLine, endColumn);
    }
}
