/*
 * Copyright 2015, Yahoo Inc.
 * Copyrights licensed under the Apache 2.0 License.
 * See the accompanying LICENSE file for terms.
 */
package com.yahoo.squidb.sql;

import java.util.List;

class RawFunction<TYPE> extends Function<TYPE> {

    public RawFunction(String expression) {
        super(expression);
    }

    @Override
    protected void appendFunctionExpression(StringBuilder sql, List<Object> selectionArgsBuilder) {
        sql.append(expression);
    }

    @Override
    public String getExpression() {
        return expression;
    }
}
