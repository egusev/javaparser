/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2015 The JavaParser Team.
 *
 * This file is part of JavaParser.
 * 
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License 
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */

package com.github.javaparser.ast.jsx;

import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;

import java.util.List;

import static com.github.javaparser.ast.internal.Utils.ensureNotNull;

public final class JsxElementStmt extends Statement {

    private String name;

    private boolean oneTag;

    private List<JsxElementAttribute> attributes;

    private List<Statement> children;

    public JsxElementStmt(final int beginLine, final int beginColumn,
                          final int endLine, final int endColumn,
                          final String name,
                          final boolean oneTag,
                          final List<JsxElementAttribute> attributes,
                          final List<Statement> children) {
        super(beginLine, beginColumn, endLine, endColumn);
        setChildren(children);
        setAttributes(attributes);
        this.name = name;
        this.oneTag = oneTag;
    }

    @Override
    public <R, A> R accept(final GenericVisitor<R, A> v, final A arg) {
//        return v.visit(this, arg);
        return null;
    }

    @Override
    public <A> void accept(final VoidVisitor<A> v, final A arg) {
        v.visit(this, arg);
    }

    public List<Statement> getChildren() {
        children = ensureNotNull(children);
        return children;
    }

    public void setChildren(final List<Statement> children) {
        this.children = children;
        setAsParentNodeOf(this.children);
    }

    public List<JsxElementAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<JsxElementAttribute> attributes) {
        attributes = ensureNotNull(attributes);
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOneTag() {
        return oneTag;
    }

    public void setOneTag(boolean oneTag) {
        this.oneTag = oneTag;
    }
}
