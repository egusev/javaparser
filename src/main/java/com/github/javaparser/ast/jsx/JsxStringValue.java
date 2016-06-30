package com.github.javaparser.ast.jsx;

import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;

/**
 * Created by eugene on 30/06/16.
 */
public class JsxStringValue extends JsxValue {
    private String value;
    private String symbol;

    public JsxStringValue(String value) {
        this.value = value.substring(1, value.length() - 1);
        symbol = value.substring(0, 1);
    }

    public JsxStringValue(int beginLine,
                          int beginColumn,
                          int endLine,
                          int endColumn,
                          String value) {
        super(beginLine, beginColumn, endLine, endColumn);
        this.value = value.substring(1, value.length() - 1);
        symbol = value.substring(0, 1);
    }

    public JsxStringValue() {
    }

    /**
     * Accept method for visitor support.
     *
     * @param v   the visitor implementation
     * @param arg the argument passed to the visitor
     * @return the result of the visit
     */
    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return null;
    }

    /**
     * Accept method for visitor support.
     *
     * @param v   the visitor implementation
     * @param arg
     */
    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        v.visit(this, arg);
    }

    public String getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }
}
