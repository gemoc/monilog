package org.gemoc.monilog.instrument.internal;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.gemoc.instrument.IContextWrapper;
import org.gemoc.instrument.IInstrument;
import org.gemoc.instrumentationInterface.InstrumentationInterfaceStandaloneSetup;
import org.gemoc.monilog.MoniLogStandaloneSetup;
import org.gemoc.monilog.api.IMoniLogAppender;
import org.gemoc.monilog.api.IMoniLogLayout;
import org.gemoc.monilog.moniLog.ASTEvent;
import org.gemoc.monilog.moniLog.Action;
import org.gemoc.monilog.moniLog.AfterASTEvent;
import org.gemoc.monilog.moniLog.Appender;
import org.gemoc.monilog.moniLog.AppenderCall;
import org.gemoc.monilog.moniLog.BeforeASTEvent;
import org.gemoc.monilog.moniLog.BoolConstant;
import org.gemoc.monilog.moniLog.CallEvent;
import org.gemoc.monilog.moniLog.Comparison;
import org.gemoc.monilog.moniLog.ContextVarReference;
import org.gemoc.monilog.moniLog.Document;
import org.gemoc.monilog.moniLog.Expression;
import org.gemoc.monilog.moniLog.FileAlias;
import org.gemoc.monilog.moniLog.IntConstant;
import org.gemoc.monilog.moniLog.LanguageCall;
import org.gemoc.monilog.moniLog.Layout;
import org.gemoc.monilog.moniLog.LayoutCall;
import org.gemoc.monilog.moniLog.MoniLogPackage;
import org.gemoc.monilog.moniLog.MoniLogger;
import org.gemoc.monilog.moniLog.Mul;
import org.gemoc.monilog.moniLog.ParameterDecl;
import org.gemoc.monilog.moniLog.Plus;
import org.gemoc.monilog.moniLog.Property;
import org.gemoc.monilog.moniLog.PropertyReference;
import org.gemoc.monilog.moniLog.RealConstant;
import org.gemoc.monilog.moniLog.SetVariable;
import org.gemoc.monilog.moniLog.StopMoniLogger;
import org.gemoc.monilog.moniLog.StringConstant;
import org.gemoc.monilog.moniLog.WriteEvent;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Engine;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import com.google.common.collect.Streams;
import com.google.inject.Injector;

public class MoniLogInstrument implements IInstrument {

	private static MoniLogStandaloneSetup moniLogSetup = new MoniLogStandaloneSetup();

	private static Injector moniLogInjector = moniLogSetup.createInjectorAndDoEMFRegistration();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static ParseHelper<Document> moniLogParseHelper = moniLogInjector
			.<ParseHelper>getInstance(ParseHelper.class);

//	private final Map<String, Map<String, List<MoniLogger>>> beforeEventToMoniLoggers = new HashMap<>();
//	private final Map<String, Map<String, List<MoniLogger>>> afterEventToMoniLoggers = new HashMap<>();
	private final Map<String, List<MoniLogger>> beforeEventToMoniLoggers = new HashMap<>();
	private final Map<String, List<MoniLogger>> afterEventToMoniLoggers = new HashMap<>();

	private final Map<Appender, IMoniLogAppender> appenderToExecutableExtension = new HashMap<>();
	private final Map<Layout, IMoniLogLayout> layoutToExecutableExtension = new HashMap<>();

	private final Set<String> languageIds = new HashSet<>();

	private final Map<Property, Object> propertyToValue = new HashMap<>();

	private final Engine engine = Engine.newBuilder() //
			.allowExperimentalOptions(true).build();

	private final Context polyglotContext = Context.newBuilder().engine(engine).allowAllAccess(true)
//			.option("python.Executable", "/home/dleroy/test-venv/bin/graalpython") //
//			.option("python.ForceImportSite", "true")
			.build();

	public MoniLogInstrument(List<String> specificationFiles) {
//		final ResourceSet rs = new XtextResourceSet();
		final ResourceSet rs = new ResourceSetImpl();
		
		final InstrumentationInterfaceStandaloneSetup setup = new InstrumentationInterfaceStandaloneSetup();
		setup.createInjectorAndDoEMFRegistration();
		
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("instritf", new XMIResourceFactoryImpl());
		
		final List<Document> documents = specificationFiles.stream()
				.filter(path -> path.endsWith(".mnlg"))
				.map(path -> {
			try {
				return new String(Files.readAllBytes(Paths.get(path)));
			} catch (IOException e) {
				e.printStackTrace();
				return "";
			}
		}).map(specification -> {
			if (!specification.isBlank()) {
				try {
					return moniLogParseHelper.parse(specification, rs);
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
			}
			return null;
		}).filter(specification -> specification != null).collect(Collectors.toList());
		specificationFiles.stream().filter(path -> path.endsWith(".instritf")).forEach(path -> {
			rs.getResource(URI.createFileURI(path), true);
		});
		EcoreUtil.resolveAll(rs);
		documents.forEach(d -> {
			Streams.stream(d.eAllContents()).filter(o -> o instanceof LanguageCall)
					.forEach(o -> languageIds.add(((LanguageCall) o).getLanguageID()));
			Optional.ofNullable(d.getSetup())
					.ifPresent(s -> s.getProperties().forEach(p -> propertyToValue.put(p.getProperty(),
							evaluateExpression((Expression) p.getValue(), null, Collections.emptyMap()))));
		});

		final Map<ASTEvent, List<MoniLogger>> eventToMoniLoggers = (new MoniLog2Ir()).buildIr(documents, Level.INFO);
		eventToMoniLoggers.forEach((e, l) -> {
			final String element;
			switch (e.eClass().getClassifierID()) {
			case MoniLogPackage.CALL_EVENT:
				element = ((CallEvent) e).getElement().getName();
				break;
			case MoniLogPackage.WRITE_EVENT:
				element = ((WriteEvent) e).getElement().getName();
				break;
			default:
				throw new IllegalStateException("Event " + e.toString() + " is neither a call nor a write event.");
			}
			if (e.getKind() instanceof BeforeASTEvent) {
				beforeEventToMoniLoggers.put(element, l);
			} else if (e.getKind() instanceof AfterASTEvent) {
				afterEventToMoniLoggers.put(element, l);
			}
		});
	}

	@Override
	public void notifyBefore(String rule, String element, Supplier<IContextWrapper> context) {
//		final Map<String, List<MoniLogger>> candidateMoniLoggers = beforeEventToMoniLoggers.get(rule);
//		if (candidateMoniLoggers != null && !candidateMoniLoggers.isEmpty()) {
//			final List<MoniLogger> moniLoggers = candidateMoniLoggers.get(element);
			final List<MoniLogger> moniLoggers = beforeEventToMoniLoggers.get(element);
			if (moniLoggers != null && !moniLoggers.isEmpty()) {
				moniLoggers.forEach(m -> {
					if (m.getCondition() == null || executeConditions(m, context)) {
						executeActions(m.getThenActions(), context);
					} else {
						executeActions(m.getElseActions(), context);
					}
				});
			}
//		}
	}

	@Override
	public void notifyAfter(String rule, String element, Object result, Supplier<IContextWrapper> context) {
//		final Map<String, List<MoniLogger>> candidateMoniLoggers = afterEventToMoniLoggers.get(rule);
//		if (candidateMoniLoggers != null && !candidateMoniLoggers.isEmpty()) {
//			final List<MoniLogger> moniLoggers = candidateMoniLoggers.get(element);
			final List<MoniLogger> moniLoggers = afterEventToMoniLoggers.get(element);
			if (moniLoggers != null && !moniLoggers.isEmpty()) {
				// TODO handle result.
				moniLoggers.forEach(m -> {
					if (m.getCondition() == null || executeConditions(m, context)) {
						executeActions(m.getThenActions(), context);
					} else {
						executeActions(m.getElseActions(), context);
					}
				});
			}
//		}
	}

	private boolean executeConditions(MoniLogger moniLogger, Supplier<IContextWrapper> context) {
		final Object result = evaluateExpression(moniLogger.getCondition().getExpression(), context, Collections.emptyMap());
		final Value resultValue = Value.asValue(result);
		if (resultValue.isBoolean()) {
			return resultValue.asBoolean();
		} else {
			return result != null;
		}
	}

	private void executeActions(List<Action> actions, Supplier<IContextWrapper> context) {
		final int[] iPtr = new int[] { 0 };
		actions.forEach(action -> {
			switch (action.eClass().getClassifierID()) {
			case MoniLogPackage.APPENDER_CALL:
				final AppenderCall appenderCall = (AppenderCall) action;
				executeAppenderCall(appenderCall, context, gatherCallArgs(appenderCall.getAppender().getParameterDecl(),
						appenderCall.getArgs(), context, Collections.emptyMap()));
				break;
			case MoniLogPackage.STOP_MONI_LOGGER:
				final StopMoniLogger stop = (StopMoniLogger) action;
				final MoniLogger toStop = stop.getMonilogger();
				// FIXME concurrent mod
				beforeEventToMoniLoggers.keySet().forEach(s -> beforeEventToMoniLoggers.get(s).remove(toStop));
				afterEventToMoniLoggers.keySet().forEach(s -> afterEventToMoniLoggers.get(s).remove(toStop));
				break;
			case MoniLogPackage.SET_VARIABLE:
				final SetVariable setVariable = (SetVariable) action;
				final Value value = Value
						.asValue(evaluateExpression(setVariable.getValue(), context, Collections.emptyMap()));
				propertyToValue.put(setVariable.getVariable().getProperty(), value);
				break;
			case MoniLogPackage.EMIT_EVENT:
				throw new UnsupportedOperationException();
			default:
				throw new UnsupportedOperationException();
			}
			iPtr[0]++;
		});
	}

	private void executeAppenderCall(AppenderCall appenderCall, Supplier<IContextWrapper> context, List<Object> args) {
		final Appender appender = appenderCall.getAppender();
		switch (appender.eClass().getClassifierID()) {
		case MoniLogPackage.LOCAL_APPENDER:
			throw new UnsupportedOperationException();
//			final LocalAppender localAppender = (LocalAppender) appender;
//			localAppender.getCalls().forEach(innerCall -> {
//				executeAppenderCall(innerCall, context,
//						gatherCallArgs(innerCall.getAppender().getParameterDecl(), innerCall.getArgs(), context, args));
//			});
//			break;
		case MoniLogPackage.EXTERNAL_APPENDER:
			final IMoniLogAppender externalAppender = getExternalAppender(appender);
			externalAppender.call(args.toArray());
			break;
		default:
			throw new UnsupportedOperationException();
		}
	}

	private Object executeLayoutCall(LayoutCall layoutCall, Supplier<IContextWrapper> context, List<Object> args) {
		final Layout layout = layoutCall.getLayout();
		switch (layout.eClass().getClassifierID()) {
		case MoniLogPackage.LOCAL_LAYOUT:
			throw new UnsupportedOperationException();
//			final LocalLayout localLayout = (LocalLayout) layout;
//			// TODO populate args passed to innerCall with args of this layout call.
//			final LayoutCall innerCall = localLayout.getCall();
//			return executeLayoutCall(innerCall, context, args,
//					gatherCallArgs(innerCall.getLayout().getParameterDecl(), innerCall.getArgs(), context, env));
		case MoniLogPackage.EXTERNAL_LAYOUT:
			final IMoniLogLayout externalLayout = getExternalLayout(layout);
			return externalLayout.call(args.toArray());
		default:
			throw new UnsupportedOperationException();
		}
	}

//	private Object[] getArgs(ParameterDecl parameterDecl, int offset, Map<String, Object> args) {
//		final List<PropertyDefinition> parameters = parameterDecl.getParameters();
//		final Object[] argsArray = parameters.subList(offset, parameters.size()).stream()
//				.map(p -> args.get(p.getProperty().getName())).collect(Collectors.toList()).toArray();
//		if (parameterDecl.getVarArgs() != null) {
//			// Varargs are provided as a List<Object>.
//			final Object[] varArgsArray = ((List<?>) args.get(parameterDecl.getVarArgs().getProperty().getName()))
//					.toArray();
//			final Object[] completeArgs = new Object[argsArray.length + varArgsArray.length];
//			System.arraycopy(argsArray, 0, completeArgs, 0, argsArray.length);
//			System.arraycopy(varArgsArray, 0, completeArgs, argsArray.length, varArgsArray.length);
//			return completeArgs;
//		} else {
//			return argsArray;
//		}
//	}
	
	private Object unboxValue(Object value) {
		if (value instanceof Value) {
			final Value v = (Value) value;
			if (v.isNumber()) {
				if (v.fitsInInt()) {
					return v.asInt();
				} else if (v.fitsInDouble()) {
					return v.asDouble();
				} else {
					throw new UnsupportedOperationException();
				}
			} else if (v.isBoolean()) {
				return v.asBoolean();
			} else if (v.isString()) {
				return v.asString();
			} else {
				return v;
			}
		} else {
			return value;
		}
	}
	
	/*
	 * Varargs are provided as a List<Object>.
	 */
	private List<Object> gatherCallArgs(ParameterDecl parameterDecl, List<Expression> callArgs,
			Supplier<IContextWrapper> context, Map<String, Object> env) {
		final List<Object> result = new ArrayList<>();
		for (int i = 0; i < callArgs.size(); i++) {
			final Object argValue = evaluateExpression(callArgs.get(i), context, env);
			if (argValue instanceof Value) {
				final Value v = (Value) argValue;
				if (v.isNumber()) {
					if (v.fitsInInt()) {
						result.add(v.asInt());
					} else if (v.fitsInDouble()) {
						result.add(v.asDouble());
					} else {
						throw new UnsupportedOperationException();
					}
				} else if (v.isBoolean()) {
					result.add(v.asBoolean());
				} else if (v.isString()) {
					result.add(v.asString());
				} else {
					result.add(v);
				}
			} else {
				result.add(argValue);
			}
		}
//		final List<PropertyDefinition> parameters = parameterDecl.getParameters();
//		for (; i < parameters.size(); i++) {
//			// TODO eventually handle monilog parameter references.
//			final Object argValue = evaluateExpression(callArgs.get(i), context, args);
//			result.put(parameters.get(i).getProperty().getName(), argValue);
//		}
//		if (parameterDecl.getVarArgs() != null) {
//			final String varArgsName = parameterDecl.getVarArgs().getProperty().getName();
//			final List<Object> varArgs = new ArrayList<>();
//			for (; i < callArgs.size(); i++) {
//				// TODO eventually handle monilog parameter references.
//				final Object argValue = evaluateExpression(callArgs.get(i), context, args);
//				varArgs.add(argValue);
//			}
//			result.put(varArgsName, varArgs);
//		}
		return result;
	}

	private Map<String, Value> memberToAST = new HashMap<>();

	private Object evaluateExpression(Expression arg, Supplier<IContextWrapper> context, Map<String, Object> env) {
		switch (arg.eClass().getClassifierID()) {
		case MoniLogPackage.LAYOUT_CALL:
			final LayoutCall layoutCall = (LayoutCall) arg;
			return executeLayoutCall(layoutCall, context,
					gatherCallArgs(layoutCall.getLayout().getParameterDecl(), layoutCall.getArgs(), context, env));
		case MoniLogPackage.CONTEXT_VAR_REFERENCE:
			final ContextVarReference contextVarReference = (ContextVarReference) arg;
			return context.get().getVariableValue(contextVarReference.getTarget().getName());
		case MoniLogPackage.PROPERTY_REFERENCE:
			final PropertyReference specVarNameReference = (PropertyReference) arg;
			return unboxValue(propertyToValue.get(specVarNameReference.getProperty()));
		case MoniLogPackage.LANGUAGE_CALL:
			final LanguageCall languageCall = (LanguageCall) arg;
			final String memberName = languageCall.getFqn();
			final FileAlias alias = languageCall.getFile();
			final Value ast = memberToAST.computeIfAbsent(alias.getName() + "." + memberName, fqn -> {
				try {
					polyglotContext.eval(Source.newBuilder(languageCall.getLanguageID(), new File(alias.getFilePath())).build());
					final Value languageBindings = polyglotContext.getBindings(languageCall.getLanguageID());
					if (languageBindings.hasMember(memberName)) {
						return languageBindings.getMember(memberName);
					} else {
						return null;
					}
				} catch (IOException e) {
					e.printStackTrace();
					return null;
				}
			});
			if (ast != null) {
				final Object[] callArgs = languageCall.getArgs().stream()
						.map(a -> evaluateExpression(a, context, env)).collect(Collectors.toList()).toArray();
				if (callArgs.length == 0) {
					return ast.execute();
				} else if (callArgs.length == 1) {
					return ast.execute(callArgs[0]);
				} else {
					return ast.execute(callArgs);
				}
			} else {
				return null;
			}
		case MoniLogPackage.STRING_CONSTANT:
			return ((StringConstant) arg).getValue();
		case MoniLogPackage.BOOL_CONSTANT:
			return ((BoolConstant) arg).isValue();
		case MoniLogPackage.REAL_CONSTANT:
			return Double.valueOf(((RealConstant) arg).getValue());
		case MoniLogPackage.INT_CONSTANT:
			return Integer.valueOf(((IntConstant) arg).getValue());
		case MoniLogPackage.COMPARISON: {
			final Comparison comp = (Comparison) arg;
			final Value left = Value.asValue(evaluateExpression(comp.getLeft(), context, env));
			final Value right = Value.asValue(evaluateExpression(comp.getRight(), context, env));
			switch (comp.getOp()) {
			case ">=": return left.asDouble() >= right.asDouble();
			case "<=": return left.asDouble() <= right.asDouble();
			case ">": return left.asDouble() > right.asDouble();
			case "<": return left.asDouble() < right.asDouble();
			default:
				throw new UnsupportedOperationException();
			}
		}
		case MoniLogPackage.PLUS: {
			final Plus plus = (Plus) arg;
			final Value left = Value.asValue(evaluateExpression(plus.getLeft(), context, env));
			final Value right = Value.asValue(evaluateExpression(plus.getRight(), context, env));
			return Context.create("js").eval("js", left.toString() + "+" + right.toString());
		}
		case MoniLogPackage.MUL: {
			final Mul mul = (Mul) arg;
			final Value left = Value.asValue(evaluateExpression(mul.getLeft(), context, env));
			final Value right = Value.asValue(evaluateExpression(mul.getRight(), context, env));
			return Context.create("js").eval("js", left.toString() + "*" + right.toString());
		}
		default:
			throw new UnsupportedOperationException();
		}
	}

	private IMoniLogAppender getExternalAppender(Appender appender) {
		return appenderToExecutableExtension.computeIfAbsent(appender, a -> {
			try {
				return (IMoniLogAppender) getExecutableExtension(((Document) a.eContainer()).getName(), a.getName(), "org.gemoc.monilog.appender");
			} catch (ClassNotFoundException | CoreException e) {
				e.printStackTrace();
				return null;
			}
		});
	}

	private IMoniLogLayout getExternalLayout(Layout layout) {
		return layoutToExecutableExtension.computeIfAbsent(layout, l -> {
			try {
				return (IMoniLogLayout) getExecutableExtension(((Document) l.eContainer()).getName(), l.getName(), "org.gemoc.monilog.layout");
			} catch (ClassNotFoundException | CoreException e) {
				e.printStackTrace();
				return null;
			}
		});
	}

	private Object getExecutableExtension(String packageName, String className, String extensionPointName)
			throws ClassNotFoundException, CoreException {
		IConfigurationElement configurationElement = null;
		final IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		if (extensionRegistry != null) {
			final IExtensionPoint extensionPoint = extensionRegistry.getExtensionPoint(extensionPointName);
			final IConfigurationElement[] configurationElements = extensionPoint.getConfigurationElements();
			for (int i = 0; i < configurationElements.length; i++) {
				if (configurationElements[i].getAttribute("name").equals(className)) {
					configurationElement = configurationElements[i];
				}
			}
			if (configurationElement != null) {
				return configurationElement.createExecutableExtension("class");
			} else {
				throw new ClassNotFoundException(
						"Could not find class " + className + " within extensions org.gemoc.monilog.appender");
			}
		} else {
			final Class<?> extensionClass = Thread.currentThread().getContextClassLoader().loadClass(packageName + "." + className);
//			final Class<?> extensionClass = Class.forName(packageName + "." + className);
			return Arrays.stream(extensionClass.getConstructors()).findFirst().map(c -> {
				try {
					return c.newInstance();
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
					return null;
				}
			}).orElseThrow();
		}
	}
}
