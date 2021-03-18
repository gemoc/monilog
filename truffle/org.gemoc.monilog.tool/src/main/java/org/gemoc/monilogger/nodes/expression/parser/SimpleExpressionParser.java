package org.gemoc.monilogger.nodes.expression.parser;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.gemoc.monilog.moniLog.And;
import org.gemoc.monilog.moniLog.ArrayRef;
import org.gemoc.monilog.moniLog.ArraySize;
import org.gemoc.monilog.moniLog.BoolConstant;
import org.gemoc.monilog.moniLog.Comparison;
import org.gemoc.monilog.moniLog.ContractedIf;
import org.gemoc.monilog.moniLog.Div;
import org.gemoc.monilog.moniLog.Equality;
import org.gemoc.monilog.moniLog.IntConstant;
import org.gemoc.monilog.moniLog.Minus;
import org.gemoc.monilog.moniLog.Modulo;
import org.gemoc.monilog.moniLog.MoniLogExpression;
import org.gemoc.monilog.moniLog.MoniLogPackage;
import org.gemoc.monilog.moniLog.Mul;
import org.gemoc.monilog.moniLog.Not;
import org.gemoc.monilog.moniLog.Or;
import org.gemoc.monilog.moniLog.Parenthesis;
import org.gemoc.monilog.moniLog.Plus;
import org.gemoc.monilog.moniLog.PropertyRef;
import org.gemoc.monilog.moniLog.RealConstant;
import org.gemoc.monilog.moniLog.SimpleExpression;
import org.gemoc.monilog.moniLog.SimpleVarRef;
import org.gemoc.monilog.moniLog.StringConstant;
import org.gemoc.monilog.moniLog.UnaryMinus;
import org.gemoc.monilog.moniLog.VectorConstant;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionAddNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionAndNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionArraySizeNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionBooleanLiteralNode;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionDivNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionDoubleLiteralNode;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionEqNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionGreaterEqualNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionGreaterThanNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionIfNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionLessEqualNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionLessThanNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionLongLiteralNode;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionMinusNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionModNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionMulNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionNeqNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionNode;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionNotNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionOrNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionReadArrayNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionReadLocalVariableNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionReadPropertyNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionStringLiteralNode;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionSubNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionUnboxValueNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionVectorNode;

import com.oracle.truffle.api.nodes.Node;

public class SimpleExpressionParser {
	
	private static final SimpleExpressionNode[] EMPTY_ARRAY = new SimpleExpressionNode[0];

	public MoniLoggerExecutableNode createExpression(MoniLogExpression expression, Node node, boolean onEnter) {
		return createExpressionNode(expression.getExpression(), node, onEnter);
	}

	private SimpleExpressionNode createExpressionNode(SimpleExpression expression, Node node, boolean onEnter) {
		final SimpleExpressionNode expressionNode;
		switch (expression.eClass().getClassifierID()) {
		case MoniLogPackage.INT_CONSTANT:
			expressionNode = createSimpleExpressionIntConstantNode(((IntConstant) expression).getValue());
			break;
		case MoniLogPackage.REAL_CONSTANT:
			expressionNode = createSimpleExpressionRealConstantNode(((RealConstant) expression).getValue());
			break;
		case MoniLogPackage.BOOL_CONSTANT:
			expressionNode = createSimpleExpressionBooleanConstantNode(((BoolConstant) expression).isValue());
			break;
		case MoniLogPackage.STRING_CONSTANT:
			expressionNode = createSimpleExpressionStringConstantNode(((StringConstant) expression).getValue());
			break;
		case MoniLogPackage.VECTOR_CONSTANT:
			expressionNode = createSimpleExpressionVectorNode((VectorConstant) expression, node, onEnter);
			break;
		case MoniLogPackage.SIMPLE_VAR_REF:
			expressionNode = createReadVariableNode((SimpleVarRef) expression, node, onEnter);
			break;
		case MoniLogPackage.ARRAY_REF:
			expressionNode = createReadArrayNode((ArrayRef) expression, node, onEnter);
			break;
		case MoniLogPackage.PROPERTY_REF:
			expressionNode = createReadPropertyNode((PropertyRef) expression, node, onEnter);
			break;
		case MoniLogPackage.PARENTHESIS:
			expressionNode = createExpressionNode(((Parenthesis) expression).getExpression(), node, onEnter);
			break;
		case MoniLogPackage.CONTRACTED_IF:
			expressionNode = createIfNode((ContractedIf) expression, node, onEnter);
			break;
		case MoniLogPackage.EQUALITY:
			expressionNode = createEqNode((Equality) expression, node, onEnter);
			break;
		case MoniLogPackage.AND:
			expressionNode = createAndNode((And) expression, node, onEnter);
			break;
		case MoniLogPackage.OR:
			expressionNode = createOrNode((Or) expression, node, onEnter);
			break;
		case MoniLogPackage.PLUS:
			expressionNode = createPlusNode((Plus) expression, node, onEnter);
			break;
		case MoniLogPackage.MINUS:
			expressionNode = createMinusNode((Minus) expression, node, onEnter);
			break;
		case MoniLogPackage.MUL:
			expressionNode = createMulNode((Mul) expression, node, onEnter);
			break;
		case MoniLogPackage.MODULO:
			expressionNode = createModuloNode((Modulo) expression, node, onEnter);
			break;
		case MoniLogPackage.DIV:
			expressionNode = createDivNode((Div) expression, node, onEnter);
			break;
		case MoniLogPackage.COMPARISON:
			expressionNode = createComparisonNode((Comparison) expression, node, onEnter);
			break;
		case MoniLogPackage.UNARY_MINUS:
			expressionNode = createMinusNode((UnaryMinus) expression, node, onEnter);
			break;
		case MoniLogPackage.NOT:
			expressionNode = createNotNode((Not) expression, node, onEnter);
			break;
		case MoniLogPackage.ARRAY_SIZE:
			expressionNode = createArraySizeNode((ArraySize) expression, node, onEnter);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return expressionNode;
	}

	private SimpleExpressionNode createSimpleExpressionIntConstantNode(int value) {
		return new SimpleExpressionLongLiteralNode(value);
	}

	private SimpleExpressionNode createSimpleExpressionRealConstantNode(String value) {
		return new SimpleExpressionDoubleLiteralNode(Double.valueOf(value));
	}

	private SimpleExpressionNode createSimpleExpressionBooleanConstantNode(boolean value) {
		return new SimpleExpressionBooleanLiteralNode(value);
	}

	private SimpleExpressionNode createSimpleExpressionStringConstantNode(String value) {
		return new SimpleExpressionStringLiteralNode(value);
	}

	private SimpleExpressionNode createSimpleExpressionVectorNode(VectorConstant value, Node node, boolean onEnter) {
		final SimpleExpressionNode[] valueNodes = value.getValues().stream().map(e -> createExpressionNode(e, node, onEnter)).collect(Collectors.toList()).toArray(EMPTY_ARRAY);
		return new SimpleExpressionVectorNode(valueNodes);
	}

	private SimpleExpressionNode createReadVariableNode(SimpleVarRef varRef, Node node, boolean onEnter) {
		return SimpleExpressionReadLocalVariableNodeGen.create(varRef.getTarget(), node, onEnter);
	}

	private SimpleExpressionNode createReadArrayNode(ArrayRef arrayRef, Node node, boolean onEnter) {
		SimpleExpressionNode array = createExpressionNode(arrayRef.getArray(), node, onEnter);
		final List<SimpleExpression> indices = arrayRef.getIndices();
		final Iterator<SimpleExpression> indicesIterator = indices.iterator();
		while (indicesIterator.hasNext()) {
			array = SimpleExpressionReadArrayNodeGen.create(array, createExpressionNode(indicesIterator.next(), node, onEnter));
		}
		return SimpleExpressionUnboxValueNodeGen.create(array);
	}

	private SimpleExpressionNode createReadPropertyNode(PropertyRef propRef, Node node, boolean onEnter) {
		final SimpleExpressionNode object = createExpressionNode(propRef.getObject(), node, onEnter);
		final SimpleExpressionNode value = SimpleExpressionReadPropertyNodeGen.create(propRef.getProperty(), object);
		return SimpleExpressionUnboxValueNodeGen.create(value);
	}

	private SimpleExpressionNode createIfNode(ContractedIf contractedIf, Node node, boolean onEnter) {
		final SimpleExpressionNode condition = createExpressionNode(contractedIf.getCondition(), node, onEnter);
		final SimpleExpressionNode thenNode = createExpressionNode(contractedIf.getThen(), node, onEnter);
		final SimpleExpressionNode elseNode = createExpressionNode(contractedIf.getElse(), node, onEnter);
		return SimpleExpressionIfNodeGen.create(condition, thenNode, elseNode);
	}

	private SimpleExpressionNode createEqNode(Equality eq, Node node, boolean onEnter) {
		final SimpleExpressionNode left = createExpressionNode(eq.getLeft(), node, onEnter);
		final SimpleExpressionNode right = createExpressionNode(eq.getRight(), node, onEnter);
		switch (eq.getOp()) {
		case "==":
			return SimpleExpressionEqNodeGen.create(left, right);
		case "!=":
			return SimpleExpressionNeqNodeGen.create(left, right);
		default:
			throw new IllegalArgumentException("Unknown operator: " + eq.getOp());
		}
		
	}

	private SimpleExpressionNode createAndNode(And plus, Node node, boolean onEnter) {
		final SimpleExpressionNode left = createExpressionNode(plus.getLeft(), node, onEnter);
		final SimpleExpressionNode right = createExpressionNode(plus.getRight(), node, onEnter);
		return SimpleExpressionAndNodeGen.create(left, right);
	}

	private SimpleExpressionNode createOrNode(Or plus, Node node, boolean onEnter) {
		final SimpleExpressionNode left = createExpressionNode(plus.getLeft(), node, onEnter);
		final SimpleExpressionNode right = createExpressionNode(plus.getRight(), node, onEnter);
		return SimpleExpressionOrNodeGen.create(left, right);
	}

	private SimpleExpressionNode createPlusNode(Plus plus, Node node, boolean onEnter) {
		final SimpleExpressionNode left = createExpressionNode(plus.getLeft(), node, onEnter);
		final SimpleExpressionNode right = createExpressionNode(plus.getRight(), node, onEnter);
		return SimpleExpressionAddNodeGen.create(left, right);
	}

	private SimpleExpressionNode createMinusNode(Minus minus, Node node, boolean onEnter) {
		final SimpleExpressionNode left = createExpressionNode(minus.getLeft(), node, onEnter);
		final SimpleExpressionNode right = createExpressionNode(minus.getRight(), node, onEnter);
		return SimpleExpressionSubNodeGen.create(left, right);
	}

	private SimpleExpressionNode createMulNode(Mul mul, Node node, boolean onEnter) {
		final SimpleExpressionNode left = createExpressionNode(mul.getLeft(), node, onEnter);
		final SimpleExpressionNode right = createExpressionNode(mul.getRight(), node, onEnter);
		return SimpleExpressionMulNodeGen.create(left, right);
	}

	private SimpleExpressionNode createModuloNode(Modulo modulo, Node node, boolean onEnter) {
		final SimpleExpressionNode left = createExpressionNode(modulo.getLeft(), node, onEnter);
		final SimpleExpressionNode right = createExpressionNode(modulo.getRight(), node, onEnter);
		return SimpleExpressionModNodeGen.create(left, right);
	}

	private SimpleExpressionNode createDivNode(Div div, Node node, boolean onEnter) {
		final SimpleExpressionNode left = createExpressionNode(div.getLeft(), node, onEnter);
		final SimpleExpressionNode right = createExpressionNode(div.getRight(), node, onEnter);
		return SimpleExpressionDivNodeGen.create(left, right);
	}

	private SimpleExpressionNode createMinusNode(UnaryMinus minus, Node node, boolean onEnter) {
		final SimpleExpressionNode expr = createExpressionNode(minus.getExpression(), node, onEnter);
		return SimpleExpressionMinusNodeGen.create(expr);
	}

	private SimpleExpressionNode createComparisonNode(Comparison comparison, Node node, boolean onEnter) {
		final SimpleExpressionNode left = createExpressionNode(comparison.getLeft(), node, onEnter);
		final SimpleExpressionNode right = createExpressionNode(comparison.getRight(), node, onEnter);
		switch (comparison.getOp()) {
		case ">=":
			return SimpleExpressionGreaterEqualNodeGen.create(left, right);
		case "<=":
			return SimpleExpressionLessEqualNodeGen.create(left, right);
		case ">":
			return SimpleExpressionGreaterThanNodeGen.create(left, right);
		case "<":
			return SimpleExpressionLessThanNodeGen.create(left, right);
		default:
			throw new IllegalArgumentException("Unknown operator: " + comparison.getOp());
		}
	}

	private SimpleExpressionNode createNotNode(Not not, Node node, boolean onEnter) {
		final SimpleExpressionNode expr = createExpressionNode(not.getExpression(), node, onEnter);
		return SimpleExpressionNotNodeGen.create(expr);
	}

	private SimpleExpressionNode createArraySizeNode(ArraySize arraySize, Node node, boolean onEnter) {
		final SimpleExpressionNode expr = createExpressionNode(arraySize.getArray(), node, onEnter);
		return SimpleExpressionArraySizeNodeGen.create(expr);
	}
	
}