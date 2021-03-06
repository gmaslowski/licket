package org.licket.framework.hippo;

import org.mozilla.javascript.ast.ExpressionStatement;

/**
 * @author activey
 */
public class ExpressionStatementBuilder extends AbstractAstNodeBuilder<ExpressionStatement> {

    private AbstractAstNodeBuilder<?> expr;

    private ExpressionStatementBuilder(AbstractAstNodeBuilder<?> expr) {
        this.expr = expr;
    }

    public static ExpressionStatementBuilder expressionStatement(FunctionCallBuilder functionCallBuilder) {
        return new ExpressionStatementBuilder(functionCallBuilder);
    }

    public static ExpressionStatementBuilder expressionStatement(AssignmentBuilder assignmentBuilder) {
        return new ExpressionStatementBuilder(assignmentBuilder);
    }

    @Override
    public ExpressionStatement build() {
        ExpressionStatement expressionStatement = new ExpressionStatement();
        expressionStatement.setExpression(expr.build());
        return expressionStatement;
    }
}
