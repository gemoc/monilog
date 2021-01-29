package org.gemoc.monilog.instrument.internal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.gemoc.instrument.IContextWrapper;
import org.gemoc.instrument.IInstrument;
import org.gemoc.monilog.MoniLog4DSLStandaloneSetup;
import org.gemoc.monilog.api.IMoniLogAppender;
import org.gemoc.monilog.api.IMoniLogLayout;
import org.gemoc.monilog.moniLog4DSL.ASTEvent;
import org.gemoc.monilog.moniLog4DSL.AfterASTEvent;
import org.gemoc.monilog.moniLog4DSL.Appender;
import org.gemoc.monilog.moniLog4DSL.AppenderCall;
import org.gemoc.monilog.moniLog4DSL.BeforeASTEvent;
import org.gemoc.monilog.moniLog4DSL.CallArgument;
import org.gemoc.monilog.moniLog4DSL.Document;
import org.gemoc.monilog.moniLog4DSL.LanguageExpression;
import org.gemoc.monilog.moniLog4DSL.Layout;
import org.gemoc.monilog.moniLog4DSL.LayoutCall;
import org.gemoc.monilog.moniLog4DSL.LocalAppender;
import org.gemoc.monilog.moniLog4DSL.LocalLayout;
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage;
import org.gemoc.monilog.moniLog4DSL.MoniLogger;
import org.gemoc.monilog.moniLog4DSL.Parameter;
import org.gemoc.monilog.moniLog4DSL.ParameterDecl;
import org.gemoc.monilog.moniLog4DSL.ParameterReference;
import org.gemoc.monilog.moniLog4DSL.SetVariable;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Engine;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import com.google.common.collect.Streams;
import com.google.inject.Injector;

public class MoniLogInstrument implements IInstrument {

	private static MoniLog4DSLStandaloneSetup moniLogSetup = new MoniLog4DSLStandaloneSetup();

	private static Injector moniLogInjector = moniLogSetup.createInjectorAndDoEMFRegistration();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static ParseHelper<Document> moniLogParseHelper = moniLogInjector
			.<ParseHelper>getInstance(ParseHelper.class);

	private final Map<String, List<MoniLogger>> beforeEventToMoniLoggers = new HashMap<>();
	private final Map<String, List<MoniLogger>> afterEventToMoniLoggers = new HashMap<>();

	private final Map<LanguageExpression, Source> sourceCodeToSource = new HashMap<>();

	private final Map<Appender, IMoniLogAppender> appenderToExecutableExtension = new HashMap<>();
	private final Map<Layout, IMoniLogLayout> layoutToExecutableExtension = new HashMap<>();

	private final Set<String> languageIds = new HashSet<>();

	private final Engine engine = Engine.newBuilder() //
			.allowExperimentalOptions(true).build();

	private final Context polyglotContext = Context.newBuilder().engine(engine).allowAllAccess(true)
			.option("python.Executable", "/home/dleroy/venv-graalpython/bin/graalpython") //
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
		documents.forEach(d -> Streams.stream(d.eAllContents()).filter(o -> o instanceof LanguageExpression)
				.forEach(o -> languageIds.add(((LanguageExpression) o).getLanguageId())));
		final Map<ASTEvent, List<MoniLogger>> eventToMoniLoggers = (new MoniLog2Ir()).buildIr(documents, Level.INFO);
		eventToMoniLoggers.forEach((e, l) -> {
			if (e.getKind() instanceof BeforeASTEvent) {
				beforeEventToMoniLoggers.put(e.getRuleID(), l);
			} else if (e.getKind() instanceof AfterASTEvent) {
				afterEventToMoniLoggers.put(e.getRuleID(), l);
			}
		});
	}

	@Override
	public void notifyBefore(String name, IContextWrapper context) {
		final List<MoniLogger> moniLoggers = beforeEventToMoniLoggers.get(name);
		if (moniLoggers != null && !moniLoggers.isEmpty()) {
			injectContext(context);
			moniLoggers.forEach(m -> {
				if (executeConditions(m, context)) {
					executeActions(m, context);
				}
			});
		}
	}

	@Override
	public void notifyAfter(String name, Object result, IContextWrapper context) {
		final List<MoniLogger> moniLoggers = afterEventToMoniLoggers.get(name);
		if (moniLoggers != null && !moniLoggers.isEmpty()) {
			// TODO handle result.
			injectContext(context);
			moniLoggers.forEach(m -> {
				if (executeConditions(m, context)) {
					executeActions(m, context);
				}
			});
		}
	}

	private void injectContext(IContextWrapper context) {
		languageIds.forEach(id -> {
			final Value bindings = polyglotContext.getBindings(id);
			context.getVariableNames().forEach(v -> {
				bindings.putMember(v, context.getVariableValue(v));
			});
		});
	}

	private boolean executeConditions(MoniLogger moniLogger, IContextWrapper context) {
		final int[] iPtr = new int[] { 0 };
		final String name = moniLogger.getName();
		return moniLogger.getConditions().stream().allMatch(c -> {
			final String sourceName = name + "_condition_" + iPtr[0]++;
			final Value result = executeLanguageExpression(c.getExpression(), sourceName);
			if (result.isBoolean()) {
				return result.asBoolean();
			} else {
				throw new IllegalArgumentException(name + ": condition at index " + iPtr[0]
						+ " did not return a boolean value, " + result.toString() + " received instead");
			}
		});
	}

	private void executeActions(MoniLogger moniLogger, IContextWrapper context) {
		final int[] iPtr = new int[] { 0 };
		final String name = moniLogger.getName();
		moniLogger.getActions().forEach(action -> {
			switch (action.eClass().getClassifierID()) {
			case MoniLog4DSLPackage.LANGUAGE_EXPRESSION: {
				final LanguageExpression languageExpression = (LanguageExpression) action;
				final String sourceName = name + "_action_" + iPtr[0];
				executeLanguageExpression(languageExpression, sourceName);
				break;
			}
			case MoniLog4DSLPackage.APPENDER_CALL:
				final AppenderCall appenderCall = (AppenderCall) action;
				executeAppenderCall(appenderCall, gatherCallArgs(appenderCall.getAppender().getParameterDecl(),
						appenderCall.getArgs(), Collections.emptyMap()));
				break;
			case MoniLog4DSLPackage.EMIT_EVENT:
				throw new UnsupportedOperationException();
			case MoniLog4DSLPackage.SET_VARIABLE:
				final SetVariable setVariable = (SetVariable) action;
				final String sourceName = name + "_action_" + iPtr[0];
				final Object value = executeLanguageExpression(setVariable.getValue(), sourceName).as(Object.class);
				context.setVariableValue(setVariable.getVariable(), value);
				break;
			case MoniLog4DSLPackage.MONILOGGER_CALL:
				throw new UnsupportedOperationException();
			default:
				throw new UnsupportedOperationException();
			}
			iPtr[0]++;
		});
	}

	private Value executeLanguageExpression(LanguageExpression expression, String sourceName) {
		final Source source = sourceCodeToSource.computeIfAbsent(expression, e -> {
			final String languageId = e.getLanguageId();
			final String sourceCode = e.getExpression();
			return Source.newBuilder(languageId, sourceCode, sourceName).buildLiteral();
		});
		return polyglotContext.eval(source);
	}

	private void executeAppenderCall(AppenderCall appenderCall, Map<String, Object> args) {
		final Appender appender = appenderCall.getAppender();
		switch (appender.eClass().getClassifierID()) {
		case MoniLog4DSLPackage.LOCAL_APPENDER:
			final LocalAppender localAppender = (LocalAppender) appender;
			localAppender.getCalls().forEach(innerCall -> {
				executeAppenderCall(innerCall,
						gatherCallArgs(innerCall.getAppender().getParameterDecl(), innerCall.getArgs(), args));
			});
			break;
		case MoniLog4DSLPackage.EXTERNAL_APPENDER:
			final IMoniLogAppender externalAppender = getExternalAppender(appender);
			final ParameterDecl parameterDecl = appenderCall.getAppender().getParameterDecl();
			final List<Parameter> parameters = parameterDecl.getParameters();
			final String message = args.get(parameters.get(0).getName()).toString();
			externalAppender.call(message, getArgs(parameterDecl, 1, args));
			break;
		default:
			throw new UnsupportedOperationException();
		}
	}

	private Object executeLayoutCall(LayoutCall layoutCall, Map<String, Object> args) {
		final Layout layout = layoutCall.getLayout();
		switch (layout.eClass().getClassifierID()) {
		case MoniLog4DSLPackage.LOCAL_LAYOUT:
			final LocalLayout localLayout = (LocalLayout) layout;
			// TODO populate args passed to innerCall with args of this layout call.
			final LayoutCall innerCall = localLayout.getCall();
			return executeLayoutCall(innerCall,
					gatherCallArgs(innerCall.getLayout().getParameterDecl(), innerCall.getArgs(), args));
		case MoniLog4DSLPackage.EXTERNAL_LAYOUT:
			final IMoniLogLayout externalLayout = getExternalLayout(layout);
			final ParameterDecl parameterDecl = layoutCall.getLayout().getParameterDecl();
			return externalLayout.call(getArgs(parameterDecl, 0, args));
		default:
			throw new UnsupportedOperationException();
		}
	}

	private Object[] getArgs(ParameterDecl parameterDecl, int offset, Map<String, Object> args) {
		final List<Parameter> parameters = parameterDecl.getParameters();
		final Object[] argsArray = parameters.subList(offset, parameters.size()).stream()
				.map(p -> args.get(p.getName())).collect(Collectors.toList()).toArray();
		if (parameterDecl.getVarArgs() != null) {
			// Varargs are provided as a List<Object>.
			final Object[] varArgsArray = ((List<?>) args.get(parameterDecl.getVarArgs().getName())).toArray();
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
	private Map<String, Object> gatherCallArgs(ParameterDecl parameterDecl, List<CallArgument> callArgs,
			Map<String, Object> args) {
		final List<Parameter> parameters = parameterDecl.getParameters();
		final Map<String, Object> result = new HashMap<>(args);
		int i = 0;
		for (; i < parameters.size(); i++) {
			// TODO eventually handle monilog parameter references.
			final Object argValue = evaluateCallArg(callArgs.get(i), args);
			result.put(parameters.get(i).getName(), argValue);
		}
		if (parameterDecl.getVarArgs() != null) {
			final String varArgsName = parameterDecl.getVarArgs().getName();
			final List<Object> varArgs = new ArrayList<>();
			for (; i < callArgs.size(); i++) {
				// TODO eventually handle monilog parameter references.
				final Object argValue = evaluateCallArg(callArgs.get(i), args);
				varArgs.add(argValue);
			}
			result.put(varArgsName, varArgs);
		}
		return result;
	}

	private Object evaluateCallArg(CallArgument arg, Map<String, Object> args) {
		switch (arg.eClass().getClassifierID()) {
		case MoniLog4DSLPackage.PARAMETER_REFERENCE:
			return args.get(((ParameterReference) arg).getParameter().getName());
		case MoniLog4DSLPackage.LAYOUT_CALL:
			final LayoutCall layoutCall = (LayoutCall) arg;
			return executeLayoutCall(layoutCall,
					gatherCallArgs(layoutCall.getLayout().getParameterDecl(), layoutCall.getArgs(), args));
		case MoniLog4DSLPackage.LANGUAGE_EXPRESSION:
			// TODO give it a proper name.
			return executeLanguageExpression((LanguageExpression) arg, "appender-call-arg").as(Object.class);
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
		final IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(extensionPointName);
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
	}
}
