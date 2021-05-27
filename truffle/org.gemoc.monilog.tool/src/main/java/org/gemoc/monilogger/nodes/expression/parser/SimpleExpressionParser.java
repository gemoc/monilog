package org.gemoc.monilogger.nodes.expression.parser;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.monilog.moniLog.And;
import org.gemoc.monilog.moniLog.ArrayRef;
import org.gemoc.monilog.moniLog.ArraySize;
import org.gemoc.monilog.moniLog.BoolConstant;
import org.gemoc.monilog.moniLog.Comparison;
import org.gemoc.monilog.moniLog.ContextVarReference;
import org.gemoc.monilog.moniLog.ContractedIf;
import org.gemoc.monilog.moniLog.Div;
import org.gemoc.monilog.moniLog.Document;
import org.gemoc.monilog.moniLog.Equality;
import org.gemoc.monilog.moniLog.Expression;
import org.gemoc.monilog.moniLog.ExternalLayout;
import org.gemoc.monilog.moniLog.FieldReference;
import org.gemoc.monilog.moniLog.IntConstant;
import org.gemoc.monilog.moniLog.LanguageCall;
import org.gemoc.monilog.moniLog.LanguageExpression;
import org.gemoc.monilog.moniLog.LanguageValue;
import org.gemoc.monilog.moniLog.Layout;
import org.gemoc.monilog.moniLog.LayoutCall;
import org.gemoc.monilog.moniLog.LocalLayout;
import org.gemoc.monilog.moniLog.Minus;
import org.gemoc.monilog.moniLog.Modulo;
import org.gemoc.monilog.moniLog.MoniLogPackage;
import org.gemoc.monilog.moniLog.Mul;
import org.gemoc.monilog.moniLog.Not;
import org.gemoc.monilog.moniLog.Or;
import org.gemoc.monilog.moniLog.Parenthesis;
import org.gemoc.monilog.moniLog.Plus;
import org.gemoc.monilog.moniLog.PropertyDefinition;
import org.gemoc.monilog.moniLog.PropertyReference;
import org.gemoc.monilog.moniLog.RealConstant;
import org.gemoc.monilog.moniLog.StringConstant;
import org.gemoc.monilog.moniLog.UnaryMinus;
import org.gemoc.monilog.moniLog.VectorConstant;
import org.gemoc.monilogger.MoniLoggerInstrument;
import org.gemoc.monilogger.nodes.expression.MoniLoggerCallSourceNode;
import org.gemoc.monilogger.nodes.expression.MoniLoggerExternalLayoutNode;
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
import org.gemoc.monilogger.nodes.expression.SimpleExpressionReadFieldNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionReadLocalVariableNode;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionReadLocalVariableNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionReadPropertyNode;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionReadPropertyNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionStringLiteralNode;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionSubNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionUnboxValueNode;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionUnboxValueNodeGen;
import org.gemoc.monilogger.nodes.expression.SimpleExpressionVectorNode;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import com.oracle.truffle.api.nodes.Node;

public class SimpleExpressionParser {
	
	private static final SimpleExpressionNode[] EMPTY_ARRAY = new SimpleExpressionNode[0];
	
	private Map<String, Source> expressionToSource = new HashMap<>();
	private Map<String, Source> evaluatedSources = new HashMap<>();

	public SimpleExpressionNode createExpressionNode(Expression expression, Node node, boolean onEnter) {
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
		case MoniLogPackage.PROPERTY_REFERENCE:
			expressionNode = createReadPropertyNode((PropertyReference) expression, node, onEnter);
			break;
		case MoniLogPackage.CONTEXT_VAR_REFERENCE:
			expressionNode = createReadVariableNode((ContextVarReference) expression, node, onEnter);
			break;
		case MoniLogPackage.ARRAY_REF:
			expressionNode = createReadArrayNode((ArrayRef) expression, node, onEnter);
			break;
		case MoniLogPackage.FIELD_REFERENCE:
			expressionNode = createFieldReferenceNode((FieldReference) expression, node, onEnter);
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
		case MoniLogPackage.LANGUAGE_VALUE:
			final LanguageValue languageValue = (LanguageValue) expression;
			expressionNode = createLanguageValue(languageValue.getLanguageId(), languageValue, node, onEnter);
			break;
		case MoniLogPackage.LAYOUT_CALL:
			final LayoutCall layoutCall = (LayoutCall) expression;
			expressionNode = createLayoutExecutableNode(layoutCall, node, onEnter);
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

	private SimpleExpressionNode createReadVariableNode(ContextVarReference varRef, Node node, boolean onEnter) {
		final SimpleExpressionReadLocalVariableNode readLocal = SimpleExpressionReadLocalVariableNodeGen.create(varRef.getTarget(), node, onEnter);
		final SimpleExpressionUnboxValueNode unbox = SimpleExpressionUnboxValueNodeGen.create(readLocal);
		return unbox;
	}

	private SimpleExpressionNode createReadPropertyNode(PropertyReference varRef, Node node, boolean onEnter) {
		final PropertyDefinition def = (PropertyDefinition) varRef.getProperty().eContainer();
		final SimpleExpressionNode defaultValue = createExpressionNode(def.getValue(), node, onEnter);
		final String varName = MoniLoggerInstrument.getPropertyFQN(varRef.getProperty());
		final SimpleExpressionReadPropertyNode readProperty = SimpleExpressionReadPropertyNodeGen.create(varName, defaultValue);
		final SimpleExpressionUnboxValueNode unbox = SimpleExpressionUnboxValueNodeGen.create(readProperty);
		return unbox;
	}

	private SimpleExpressionNode createReadArrayNode(ArrayRef arrayRef, Node node, boolean onEnter) {
		SimpleExpressionNode array = createExpressionNode(arrayRef.getArray(), node, onEnter);
		final List<Expression> indices = arrayRef.getIndices();
		final Iterator<Expression> indicesIterator = indices.iterator();
		while (indicesIterator.hasNext()) {
			array = SimpleExpressionReadArrayNodeGen.create(array, createExpressionNode(indicesIterator.next(), node, onEnter));
		}
		return SimpleExpressionUnboxValueNodeGen.create(array);
	}

	private SimpleExpressionNode createFieldReferenceNode(FieldReference fieldRef, Node node, boolean onEnter) {
		final SimpleExpressionNode object = createExpressionNode(fieldRef.getObject(), node, onEnter);
		final SimpleExpressionNode value = SimpleExpressionReadFieldNodeGen.create(fieldRef.getField(), object);
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
	
	private SimpleExpressionNode createLanguageValue(String languageId, LanguageValue languageValue, Node node,
			boolean onEnter) {
		final EObject value = languageValue.getValue();
		switch (value.eClass().getClassifierID()) {
		case MoniLogPackage.LANGUAGE_EXPRESSION: {
			final LanguageExpression expression = (LanguageExpression) value;
			final String expressionString = expression.getExpression();
			final SimpleExpressionNode callNode = new MoniLoggerCallSourceNode(Context.getCurrent(),
					expressionToSource.computeIfAbsent(expressionString,
							s -> Source.newBuilder(languageId, s, null).buildLiteral()));
			return callNode;
		}
		case MoniLogPackage.LANGUAGE_CALL: {
			final LanguageCall call = (LanguageCall) value;
			final String filePath = call.getFile().getFilePath();
			final Source source = evaluatedSources.computeIfAbsent(filePath, p -> {
				Source src;
				try {
					src = Source.newBuilder(languageId, new File(filePath)).build();
					Context.getCurrent().eval(src);
					return src;
				} catch (IOException e) {
					e.printStackTrace();
					return null;
				}
			});
			final Value ast = Context.getCurrent().getBindings(languageId).getMember(call.getFqn());
			final SimpleExpressionNode[] args = call.getArgs().stream()
					.map(e -> createExpressionNode(e, node, onEnter)).collect(Collectors.toList())
					.toArray(EMPTY_ARRAY);
			final SimpleExpressionNode callNode = new MoniLoggerCallSourceNode(Context.getCurrent(), source, ast,
					args);
			return callNode;
		}
		default:
			throw new UnsupportedOperationException();
		}
	}
	
	private List<Expression> computeLayoutCallActualArgs(LayoutCall childCall, LayoutCall parentCall,
			Map<LayoutCall, List<Expression>> layoutCallToActualArgs) {
		return childCall.getArgs().stream().map(a -> {
//			FIXME
//			if (a instanceof ParameterReference) {
//				final Parameter param = ((ParameterReference) a).getParameter();
//				final int paramIdx = parentCall.getLayout().getParameterDecl().getParameters().indexOf(param);
//				if (paramIdx > -1) {
//					return layoutCallToActualArgs.get(parentCall).get(paramIdx);
//				} else {
//					throw new IllegalArgumentException("Referenced parameter " + param.getName()
//							+ " not found in calling layout definition " + parentCall.getLayout().getName() + ".");
//				}
//			}
			return a;
		}).collect(Collectors.toList());
	}
	
	private SimpleExpressionNode createLayoutExecutableNode(LayoutCall layoutCall, Node node, boolean onEnter) {
		final Layout layout = layoutCall.getLayout();
		switch (layout.eClass().getClassifierID()) {
		case MoniLogPackage.LOCAL_LAYOUT: {
			final LocalLayout localLayout = (LocalLayout) layout;
			final LayoutCall childCall = localLayout.getCall();
			return createLayoutExecutableNode(childCall, node, onEnter);
		}
		case MoniLogPackage.EXTERNAL_LAYOUT: {
			final ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
			final ExternalLayout externalLayout = (ExternalLayout) layout;
			final String className = ((Document) externalLayout.eContainer()).getName() + "."
					+ externalLayout.getName();
			try {
				final Class<?> layoutClass = contextClassLoader.loadClass(className);
				final Constructor<?> constructor = layoutClass.getConstructor();
				final Value layoutValue = Value.asValue(constructor.newInstance());
				final SimpleExpressionNode[] valueNodes = layoutCall.getArgs().stream()
						.map(arg -> createExpressionNode(arg, node, onEnter)).collect(Collectors.toList())
						.toArray(EMPTY_ARRAY);
				return new MoniLoggerExternalLayoutNode(layoutValue, valueNodes);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		default:
			throw new UnsupportedOperationException();
		}
	}
	
	public void clean() {
		evaluatedSources.clear();
	}
}
