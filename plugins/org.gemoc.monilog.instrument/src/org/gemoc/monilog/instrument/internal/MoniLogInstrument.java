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
import java.util.logging.Level;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.gemoc.instrument.IContextWrapper;
import org.gemoc.instrument.IInstrument;
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
import org.gemoc.monilog.moniLog.Comparison;
import org.gemoc.monilog.moniLog.ContextVarReference;
import org.gemoc.monilog.moniLog.Document;
import org.gemoc.monilog.moniLog.Expression;
import org.gemoc.monilog.moniLog.FileAlias;
import org.gemoc.monilog.moniLog.LanguageCall;
import org.gemoc.monilog.moniLog.LanguageValue;
import org.gemoc.monilog.moniLog.Layout;
import org.gemoc.monilog.moniLog.LayoutCall;
import org.gemoc.monilog.moniLog.LocalAppender;
import org.gemoc.monilog.moniLog.LocalLayout;
import org.gemoc.monilog.moniLog.MoniLogPackage;
import org.gemoc.monilog.moniLog.MoniLogger;
import org.gemoc.monilog.moniLog.ParameterDecl;
import org.gemoc.monilog.moniLog.Property;
import org.gemoc.monilog.moniLog.PropertyDefinition;
import org.gemoc.monilog.moniLog.PropertyReference;
import org.gemoc.monilog.moniLog.RealConstant;
import org.gemoc.monilog.moniLog.SetVariable;
import org.gemoc.monilog.moniLog.StopMoniLogger;
import org.gemoc.monilog.moniLog.StringConstant;
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
			.option("python.Executable", "/home/dleroy/test-venv/bin/graalpython") //
			.option("python.ForceImportSite", "true").build();

	public MoniLogInstrument(List<String> specificationFiles) {
		final ResourceSet rs = new XtextResourceSet();
		final List<Document> documents = specificationFiles.stream().map(path -> {
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
		EcoreUtil.resolveAll(rs);
		documents.forEach(d -> {
			Streams.stream(d.eAllContents()).filter(o -> o instanceof LanguageValue)
					.forEach(o -> languageIds.add(((LanguageValue) o).getLanguageId()));
			Optional.ofNullable(d.getSetup())
					.ifPresent(s -> s.getProperties().forEach(p -> propertyToValue.put(p.getProperty(),
							evaluateExpression((Expression) p.getValue(), null, Collections.emptyMap()))));
		});

		final Map<ASTEvent, List<MoniLogger>> eventToMoniLoggers = (new MoniLog2Ir()).buildIr(documents, Level.INFO);
		eventToMoniLoggers.forEach((e, l) -> {
			if (e.getKind() instanceof BeforeASTEvent) {
				beforeEventToMoniLoggers.put(((CallableElementNamedReference) e.getElement()).getTarget(), l);
			} else if (e.getKind() instanceof AfterASTEvent) {
				afterEventToMoniLoggers.put(((CallableElementNamedReference) e.getElement()).getTarget(), l);
			}
		});
	}

	@Override
	public void notifyBefore(String rule, String element, IContextWrapper context) {
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
	public void notifyAfter(String rule, String element, Object result, IContextWrapper context) {
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

	private boolean executeConditions(MoniLogger moniLogger, IContextWrapper context) {
		final Value result = Value.asValue(
				evaluateExpression(moniLogger.getCondition().getExpression(), context, Collections.emptyMap()));
		if (result.isBoolean()) {
			return result.asBoolean();
		} else {
			return result != null;
		}
	}

	private void executeActions(List<Action> actions, IContextWrapper context) {
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

	private void executeAppenderCall(AppenderCall appenderCall, IContextWrapper context, Map<String, Object> args) {
		final Appender appender = appenderCall.getAppender();
		switch (appender.eClass().getClassifierID()) {
		case MoniLogPackage.LOCAL_APPENDER:
			final LocalAppender localAppender = (LocalAppender) appender;
			localAppender.getCalls().forEach(innerCall -> {
				executeAppenderCall(innerCall, context,
						gatherCallArgs(innerCall.getAppender().getParameterDecl(), innerCall.getArgs(), context, args));
			});
			break;
		case MoniLogPackage.EXTERNAL_APPENDER:
			final IMoniLogAppender externalAppender = getExternalAppender(appender);
			final ParameterDecl parameterDecl = appenderCall.getAppender().getParameterDecl();
			final List<PropertyDefinition> parameters = parameterDecl.getParameters();
			final String message = args.get(parameters.get(0).getProperty().getName()).toString();
			externalAppender.call(message, getArgs(parameterDecl, 1, args));
			break;
		default:
			throw new UnsupportedOperationException();
		}
	}

	private Object executeLayoutCall(LayoutCall layoutCall, IContextWrapper context, Map<String, Object> args) {
		final Layout layout = layoutCall.getLayout();
		switch (layout.eClass().getClassifierID()) {
		case MoniLogPackage.LOCAL_LAYOUT:
			final LocalLayout localLayout = (LocalLayout) layout;
			// TODO populate args passed to innerCall with args of this layout call.
			final LayoutCall innerCall = localLayout.getCall();
			return executeLayoutCall(innerCall, context,
					gatherCallArgs(innerCall.getLayout().getParameterDecl(), innerCall.getArgs(), context, args));
		case MoniLogPackage.EXTERNAL_LAYOUT:
			final IMoniLogLayout externalLayout = getExternalLayout(layout);
			final ParameterDecl parameterDecl = layoutCall.getLayout().getParameterDecl();
			return externalLayout.call(getArgs(parameterDecl, 0, args));
		default:
			throw new UnsupportedOperationException();
		}
	}

	private Object[] getArgs(ParameterDecl parameterDecl, int offset, Map<String, Object> args) {
		final List<PropertyDefinition> parameters = parameterDecl.getParameters();
		final Object[] argsArray = parameters.subList(offset, parameters.size()).stream()
				.map(p -> args.get(p.getProperty().getName())).collect(Collectors.toList()).toArray();
		if (parameterDecl.getVarArgs() != null) {
			// Varargs are provided as a List<Object>.
			final Object[] varArgsArray = ((List<?>) args.get(parameterDecl.getVarArgs().getProperty().getName()))
					.toArray();
			final Object[] completeArgs = new Object[argsArray.length + varArgsArray.length];
			System.arraycopy(argsArray, 0, completeArgs, 0, argsArray.length);
			System.arraycopy(varArgsArray, 0, completeArgs, argsArray.length, varArgsArray.length);
			return completeArgs;
		} else {
			return argsArray;
		}
	}

	/*
	 * Varargs are provided as a List<Object>.
	 */
	private Map<String, Object> gatherCallArgs(ParameterDecl parameterDecl, List<Expression> callArgs,
			IContextWrapper context, Map<String, Object> args) {
		final List<PropertyDefinition> parameters = parameterDecl.getParameters();
		final Map<String, Object> result = new HashMap<>(args);
		int i = 0;
		for (; i < parameters.size(); i++) {
			// TODO eventually handle monilog parameter references.
			final Object argValue = evaluateExpression(callArgs.get(i), context, args);
			result.put(parameters.get(i).getProperty().getName(), argValue);
		}
		if (parameterDecl.getVarArgs() != null) {
			final String varArgsName = parameterDecl.getVarArgs().getProperty().getName();
			final List<Object> varArgs = new ArrayList<>();
			for (; i < callArgs.size(); i++) {
				// TODO eventually handle monilog parameter references.
				final Object argValue = evaluateExpression(callArgs.get(i), context, args);
				varArgs.add(argValue);
			}
			result.put(varArgsName, varArgs);
		}
		return result;
	}

	private Map<String, Value> fileAliasToAST = new HashMap<>();
	private Map<String, Value> memberToAST = new HashMap<>();

	private Object evaluateExpression(Expression arg, IContextWrapper context, Map<String, Object> args) {
		switch (arg.eClass().getClassifierID()) {
		case MoniLogPackage.LAYOUT_CALL:
			final LayoutCall layoutCall = (LayoutCall) arg;
			return executeLayoutCall(layoutCall, context,
					gatherCallArgs(layoutCall.getLayout().getParameterDecl(), layoutCall.getArgs(), context, args));
		case MoniLogPackage.CONTEXT_VAR_REFERENCE:
			final ContextVarReference contextVarReference = (ContextVarReference) arg;
			return context.getVariableValue(contextVarReference.getTarget().getName());
		case MoniLogPackage.PROPERTY_REFERENCE:
			final PropertyReference specVarNameReference = (PropertyReference) arg;
			return propertyToValue.get(specVarNameReference.getProperty());
		case MoniLogPackage.LANGUAGE_VALUE:
			final LanguageValue languageValue = (LanguageValue) arg;
			final String languageId = languageValue.getLanguageId();
			switch (languageValue.getValue().eClass().getClassifierID()) {
			case MoniLogPackage.LANGUAGE_CALL:
				final LanguageCall languageCall = (LanguageCall) languageValue.getValue();
				final String memberName = languageCall.getFqn();
				final FileAlias alias = languageCall.getFile();
				final Value ast = memberToAST.computeIfAbsent(alias.getName() + "." + memberName, fqn -> {
					try {
						polyglotContext.eval(Source.newBuilder(languageId, new File(alias.getFilePath())).build());
						final Value languageBindings = polyglotContext.getBindings(languageId);
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
							.map(a -> evaluateExpression(a, context, args)).collect(Collectors.toList()).toArray();
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
			default:
				throw new UnsupportedOperationException();
			}
		case MoniLogPackage.STRING_CONSTANT:
			return ((StringConstant) arg).getValue();
		case MoniLogPackage.BOOL_CONSTANT:
			return ((BoolConstant) arg).isValue();
		case MoniLogPackage.REAL_CONSTANT:
			return Double.valueOf(((RealConstant) arg).getValue());
		case MoniLogPackage.COMPARISON:
			final Comparison comp = (Comparison) arg;
			final Value left = Value.asValue(evaluateExpression(comp.getLeft(), context, args));
			final Value right = Value.asValue(evaluateExpression(comp.getRight(), context, args));
			return left.asDouble() < right.asDouble();
		default:
			throw new UnsupportedOperationException();
		}
	}

	private IMoniLogAppender getExternalAppender(Appender appender) {
		return appenderToExecutableExtension.computeIfAbsent(appender, a -> {
			try {
				return (IMoniLogAppender) getExecutableExtension(a.getName(), "org.gemoc.monilog.appender");
			} catch (ClassNotFoundException | CoreException e) {
				e.printStackTrace();
				return null;
			}
		});
	}

	private IMoniLogLayout getExternalLayout(Layout layout) {
		return layoutToExecutableExtension.computeIfAbsent(layout, l -> {
			try {
				return (IMoniLogLayout) getExecutableExtension(l.getName(), "org.gemoc.monilog.layout");
			} catch (ClassNotFoundException | CoreException e) {
				e.printStackTrace();
				return null;
			}
		});
	}

	private Object getExecutableExtension(String extensionName, String extensionPointName)
			throws ClassNotFoundException, CoreException {
		IConfigurationElement configurationElement = null;
		final IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		if (extensionRegistry != null) {
			final IExtensionPoint extensionPoint = extensionRegistry.getExtensionPoint(extensionPointName);
			final IConfigurationElement[] configurationElements = extensionPoint.getConfigurationElements();
			for (int i = 0; i < configurationElements.length; i++) {
				if (configurationElements[i].getAttribute("name").equals(extensionName)) {
					configurationElement = configurationElements[i];
				}
			}
			if (configurationElement != null) {
				return configurationElement.createExecutableExtension("class");
			} else {
				throw new ClassNotFoundException(
						"Could not find class " + extensionName + " within extensions org.gemoc.monilog.appender");
			}
		} else {
			final Class<?> extensionClass = Class.forName("org.gemoc.monilog.stl." + extensionName);
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
