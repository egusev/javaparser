package com.github.javaparser.ast.jsx;

import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;

/**
 * Created by eugene on 29/06/16.
 */
public class JsxExpression extends JsxValue {
    private Expression expression;

    public JsxExpression(int beginLine,
                         int beginColumn,
                         int endLine,
                         int endColumn,
                         Expression expression) {
        super(beginLine, beginColumn, endLine, endColumn);
        this.expression = expression;
        setAsParentNodeOf(expression);
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

    public Expression getExpression() {
        return expression;
    }
}
