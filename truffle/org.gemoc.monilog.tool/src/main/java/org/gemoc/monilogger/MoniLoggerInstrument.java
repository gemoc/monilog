package org.gemoc.monilogger;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.logging.Level;
import java.util.stream.Collectors;

import org.eclipse.xtext.testing.util.ParseHelper;
import org.gemoc.monilog.MoniLog4DSLStandaloneSetup;
import org.gemoc.monilog.moniLog4DSL.Action;
import org.gemoc.monilog.moniLog4DSL.Append;
import org.gemoc.monilog.moniLog4DSL.Appender;
import org.gemoc.monilog.moniLog4DSL.Condition;
import org.gemoc.monilog.moniLog4DSL.ConsoleAppender;
import org.gemoc.monilog.moniLog4DSL.Event;
import org.gemoc.monilog.moniLog4DSL.ExplicitLanguageExpression;
import org.gemoc.monilog.moniLog4DSL.ExternalLayout;
import org.gemoc.monilog.moniLog4DSL.FileAppender;
import org.gemoc.monilog.moniLog4DSL.LanguageExpression;
import org.gemoc.monilog.moniLog4DSL.LanguageExpressionCondition;
import org.gemoc.monilog.moniLog4DSL.Layout;
import org.gemoc.monilog.moniLog4DSL.Model;
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage;
import org.gemoc.monilog.moniLog4DSL.MoniLogSpec;
import org.gemoc.monilog.moniLog4DSL.StreamAppender;
import org.gemoc.monilog.moniLog4DSL.StreamEvent;
import org.gemoc.monilog.moniLog4DSL.StringLayout;
import org.gemoc.monilog.moniLog4DSL.TemporalPropertyCondition;
import org.gemoc.monilogger.nodes.MoniLoggerBlockNode;
import org.gemoc.monilogger.nodes.MoniLoggerCallSourceNode;
import org.gemoc.monilogger.nodes.MoniLoggerCopyVariablesFromScopeNodeGen;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.gemoc.monilogger.nodes.MoniLoggerUnboxNodeGen;
import org.gemoc.monilogger.nodes.appender.MoniLoggerConsoleAppenderNode;
import org.gemoc.monilogger.nodes.appender.MoniLoggerFileAppenderNode;
import org.gemoc.monilogger.nodes.appender.MoniLoggerStreamAppenderNode;
import org.gemoc.monilogger.nodes.condition.MoniLoggerConditionalNode;
import org.gemoc.monilogger.nodes.condition.MoniLoggerTemporalPatternNode;
import org.gemoc.monilogger.temporalpatterns.AbstractTemporalProperty;
import org.gemoc.monilogger.temporalpatterns.PropertyProvider;
import org.graalvm.options.OptionCategory;
import org.graalvm.options.OptionDescriptors;
import org.graalvm.options.OptionKey;
import org.graalvm.options.OptionStability;
import org.graalvm.options.OptionValues;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

import com.espertech.esper.common.client.EPCompiled;
import com.espertech.esper.common.client.configuration.Configuration;
import com.espertech.esper.common.client.configuration.common.ConfigurationCommonVariantStream;
import com.espertech.esper.compiler.client.CompilerArguments;
import com.espertech.esper.compiler.client.EPCompileException;
import com.espertech.esper.compiler.client.EPCompilerProvider;
import com.espertech.esper.runtime.client.EPDeployException;
import com.espertech.esper.runtime.client.EPRuntime;
import com.espertech.esper.runtime.client.EPRuntimeDestroyedException;
import com.espertech.esper.runtime.client.EPRuntimeProvider;
import com.google.common.collect.Iterables;
import com.google.common.collect.Streams;
import com.google.inject.Injector;
import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.Option;
import com.oracle.truffle.api.TruffleContext;
import com.oracle.truffle.api.TruffleLogger;
import com.oracle.truffle.api.instrumentation.ContextsListener;
import com.oracle.truffle.api.instrumentation.EventBinding;
import com.oracle.truffle.api.instrumentation.Instrumenter;
import com.oracle.truffle.api.instrumentation.SourceSectionFilter;
import com.oracle.truffle.api.instrumentation.StandardTags.RootBodyTag;
import com.oracle.truffle.api.instrumentation.TruffleInstrument;
import com.oracle.truffle.api.instrumentation.TruffleInstrument.Registration;
import com.oracle.truffle.api.nodes.LanguageInfo;
import com.oracle.truffle.api.nodes.Node;

@Registration(id = MoniLoggerInstrument.ID, name = "MoniLogger", version = "0.0.1", services = MoniLoggerInstrument.class)
public class MoniLoggerInstrument extends TruffleInstrument {

	static final OptionDescriptors CONTEXT_OPTIONS = new MoniLoggerContextOptionDescriptors();

	@Option(name = "polyglotContext", help = "Use polyglot context.", category = OptionCategory.EXPERT, stability = OptionStability.STABLE)
	public static final OptionKey<Boolean> USE_POLYGLOT_CONTEXT = new OptionKey<Boolean>(false);

	public static final String ID = "monilogger";
	public static final String FILE_OPTION = ID + ".files";

	static final MoniLoggerExecutableNode[] EMPTY_ARRAY = new MoniLoggerExecutableNode[0];

	private static MoniLog4DSLStandaloneSetup moniLogSetup = new MoniLog4DSLStandaloneSetup();

	private static Injector moniLogInjector = moniLogSetup.createInjectorAndDoEMFRegistration();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static ParseHelper<Model> moniLogParseHelper = moniLogInjector.<ParseHelper>getInstance(ParseHelper.class);

	private Configuration configuration;
	private EPRuntime epRuntime;

	@CompilationFinal
	private int offset;

	@CompilationFinal
	private PrintStream out;

	@CompilationFinal
	private Instrumenter instrumenter;

	@CompilationFinal
	private Env env;
	@CompilationFinal
	private TruffleLogger logger;

	private Map<String, CallTarget> expressionToCallTarget = new HashMap<>();
	private Map<String, Source> expressionToSource = new HashMap<>();
	private Map<String, Set<String>> expressionToReadNames = new HashMap<>();
	private Map<String, AbstractTemporalProperty> temporalPropertyMap = new HashMap<>();
	private Map<String, List<String>> propertyNameToEventTypes = new HashMap<>();
	private Map<TemporalPropertyCondition, AbstractTemporalProperty> conditionToTemporalProperty = new HashMap<>();

	@Override
	protected void onCreate(Env env) {
		this.env = env;
		this.logger = this.env.getLogger(ID);
		
		instrumenter = env.getInstrumenter();
		env.registerService(this);
		out = new PrintStream(env.out());
		
		instrumenter.attachContextsListener(new ContextsListener() {

			final Map<TruffleContext, List<EventBinding<MoniLoggerExecutionEventNodeFactory>>> contextToFactory = new ConcurrentHashMap<>();

			@Override
			public void onLanguageContextInitialized(TruffleContext context, LanguageInfo language) {
			}

			@Override
			public void onLanguageContextFinalized(TruffleContext context, LanguageInfo language) {
			}

			@Override
			public void onLanguageContextDisposed(TruffleContext context, LanguageInfo language) {
			}

			@Override
			public void onLanguageContextCreated(TruffleContext context, LanguageInfo language) {
			}

			@Override
			public void onContextCreated(TruffleContext context) {
				final OptionValues contextOptions = env.getOptions(context);
				final List<String> files = MoniLoggerContext.FILES.getValue(contextOptions);
				final List<String> specs = files.stream().map(path -> {
					try {
						return new String(Files.readAllBytes(Paths.get(path)));
					} catch (IOException e) {
						e.printStackTrace();
						return "";
					}
				}).collect(Collectors.toList());
				
				
				if (!specs.isEmpty()) {
					final List<EventBinding<MoniLoggerExecutionEventNodeFactory>> bindings = enable(specs);
					contextToFactory.put(context, bindings);
				}
			}

			@Override
			public void onContextClosed(TruffleContext context) {
				if (epRuntime != null) {
					final Map<String, Object> event = new HashMap<>(1);
					event.put("EoE", "EoE");
					epRuntime.getEventService().sendEventMap(event, "EoE");
				}
				List<EventBinding<MoniLoggerExecutionEventNodeFactory>> bindings = contextToFactory.remove(context);
				if (bindings != null) {
					bindings.forEach(b -> b.dispose());
				}
				
			}
		}, true);
		
	}

	@Override
	protected void onFinalize(Env env) {
		if (epRuntime != null) {
			epRuntime.destroy();
		}
	}

	@TruffleBoundary
	private void configureEsper(Map<String, Map<String, Object>> streamEvents) {
		configuration = new Configuration();
		ClassLoader oldClassLoader = Thread.currentThread().getContextClassLoader();
		Thread.currentThread().setContextClassLoader(configuration.getClass().getClassLoader());
		try {
			final List<String> streamInsertStatements = new ArrayList<>();
			streamEvents.forEach((e, p) -> configuration.getCommon().addEventType(e, p));
			final Map<String, Object> eoeEventProperties = new HashMap<>();
			eoeEventProperties.put("EoE", String.class);
			configuration.getCommon().addEventType("EoE", eoeEventProperties);
			temporalPropertyMap.forEach((n, p) -> {
				final ConfigurationCommonVariantStream variantStream = new ConfigurationCommonVariantStream();
				propertyNameToEventTypes.get(n).forEach(eventType -> {
					variantStream.addEventTypeName(eventType);
					streamInsertStatements.add("insert into " + n + " select * from " + eventType);
				});
				variantStream.addEventTypeName("EoE");
				streamInsertStatements.add("insert into " + n + " select * from " + "EoE");
				configuration.getCommon().addVariantStream(n, variantStream);
			});
			configuration.getCompiler().getExpression().setDuckTyping(true);
			epRuntime = EPRuntimeProvider.getRuntime(ID, configuration);
			streamInsertStatements.forEach(s -> compileAndDeploy(s));
			temporalPropertyMap.values().forEach(p -> {
				p.compileEPL(configuration);
				p.deploy(epRuntime);
			});
		} finally {
			Thread.currentThread().setContextClassLoader(oldClassLoader);
		}
	}

	private void compileAndDeploy(String statement) {
		try {
			final EPCompiled compiled = EPCompilerProvider.getCompiler().compile(statement,
					new CompilerArguments(configuration));
			epRuntime.getDeploymentService().deploy(compiled);
		} catch (EPCompileException | EPRuntimeDestroyedException | EPDeployException e1) {
			e1.printStackTrace();
		}
	}

	private List<EventBinding<MoniLoggerExecutionEventNodeFactory>> enable(final List<String> specifications) {
		final List<EventBinding<MoniLoggerExecutionEventNodeFactory>> bindings = new ArrayList<>();
		final Map<String, Map<String, Object>> streamEvents = new HashMap<>();
		specifications.forEach(specification -> {
			if (!specification.isBlank()) {
				try {
					final Model model = moniLogParseHelper.parse(specification);
					final String defaultLanguageId = model.getDefaultLanguageID();
					final List<MoniLogSpec> moniLogSpecs = model.getMoniLogSpecs();
					moniLogSpecs.forEach(spec -> {
						final Level level = Level.parse(spec.getLevel().getLiteral());
						if (logger.isLoggable(level)) {
							bindings.add(createMoniLogger(spec, level, defaultLanguageId, streamEvents));
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		if (!temporalPropertyMap.isEmpty()) {
			configureEsper(streamEvents);
		}
		
		return bindings;
	}

	private Set<String> gatherLanguages(MoniLogSpec spec, String defaultLanguageId) {
		final Set<String> languageIds = Streams.stream(spec.eAllContents())
				.filter(o -> o.eClass().getClassifierID() == MoniLog4DSLPackage.EXPLICIT_LANGUAGE_EXPRESSION)
				.map(o -> (ExplicitLanguageExpression) o).map(e -> e.getLanguageId()).collect(Collectors.toSet());
		if (Streams.stream(spec.eAllContents())
				.anyMatch(o -> o.eClass().getClassifierID() == MoniLog4DSLPackage.LANGUAGE_EXPRESSION)
				&& defaultLanguageId != null && defaultLanguageId.isBlank()) {
			languageIds.add(defaultLanguageId);
		}
		return languageIds;
	}

	private EventBinding<MoniLoggerExecutionEventNodeFactory> createMoniLogger(MoniLogSpec spec, Level level, String defaultLanguageId,
			Map<String, Map<String, Object>> streamEvents) {
		final Set<String> languages = gatherLanguages(spec, defaultLanguageId);
		final boolean usePolyglotContext = USE_POLYGLOT_CONTEXT.getValue(env.getOptions());
		final List<Event> events = spec.getEvents();
		final Set<String> rules = events.stream().map(e -> e.getRuleID()).collect(Collectors.toSet());
		final Set<String> expressionStrings = new HashSet<>();
		final List<Condition> conditions = spec.getConditions();
		conditions.stream().filter(c -> c instanceof TemporalPropertyCondition).map(c -> (TemporalPropertyCondition) c)
				.forEach(c -> {
					final List<String> eventTypeNames = Streams.stream(c.getPattern().eAllContents())
							.filter(o -> o instanceof StreamEvent).map(o -> ((StreamEvent) o).getEventId())
							.collect(Collectors.toList());
					final AbstractTemporalProperty property = PropertyProvider.compileProperty(c.getPattern());
					final String safePropertyName = property.getSafeName();
					propertyNameToEventTypes.putIfAbsent(safePropertyName, eventTypeNames);
					conditionToTemporalProperty.put(c,
							temporalPropertyMap.computeIfAbsent(safePropertyName, s -> property));
				});
		final List<Action> actions = spec.getActions();
		actions.stream().filter(a -> a instanceof Append).map(a -> ((Append) a).getAppender())
				.filter(a -> a instanceof StreamAppender).map(a -> (StreamAppender) a)
				.forEach(appender -> streamEvents.computeIfAbsent(appender.getEvent(), n -> {
					final Map<String, Object> properties = new LinkedHashMap<String, Object>();
					properties.put(n, String.class);
					for (int i = 0; i < appender.getValues().size(); i++) {
						properties.put("prop" + i, Object.class);
					}
					return properties;
				}));

		final SourceSectionFilter filterRules = SourceSectionFilter.newBuilder() //
				.tagIs(RootBodyTag.class) //
				.rootNameIs(s -> rules.isEmpty() || rules.contains(s)) //
				.includeInternal(true).build();

		final BiFunction<String, Node, MoniLoggerExecutableNode> conditionFactory = (hostLanguageId, node) -> {

			final List<MoniLoggerExecutableNode> conditionNodes = new ArrayList<>();

			if (!conditions.isEmpty()) {
				conditionNodes.addAll(languages.stream()
						.map(l -> MoniLoggerCopyVariablesFromScopeNodeGen.create(l,
								frame -> Iterables.concat(env.findLocalScopes(node, frame),
										env.findTopScopes(hostLanguageId)),
								usePolyglotContext))
						.collect(Collectors.toList()));
			}

			conditionNodes.addAll(conditions.stream().map(condition -> {
				switch (condition.eClass().getClassifierID()) {
				case MoniLog4DSLPackage.LANGUAGE_EXPRESSION_CONDITION:
					final LanguageExpressionCondition expressionCondition = (LanguageExpressionCondition) condition;
					final LanguageExpression expression = expressionCondition.getExpression();
					return getExpressionNode(expression, defaultLanguageId, node, hostLanguageId, expressionStrings);
				case MoniLog4DSLPackage.TEMPORAL_PROPERTY_CONDITION:
					final TemporalPropertyCondition temporalCondition = (TemporalPropertyCondition) condition;
					final AbstractTemporalProperty temporalProperty = conditionToTemporalProperty
							.get(temporalCondition);
					return new MoniLoggerTemporalPatternNode(null, temporalProperty.getPropertyState(),
							temporalCondition.getKind());
				default:
					throw new UnsupportedOperationException();
				}
			}).collect(Collectors.toList()));
			final MoniLoggerConditionalNode conditionalNode = new MoniLoggerConditionalNode(
					conditionNodes.toArray(EMPTY_ARRAY));
			return conditionalNode;
		};

		final BiFunction<String, Node, MoniLoggerExecutableNode> actionFactory = (hostLanguageId, node) -> {

			final List<MoniLoggerExecutableNode> actionNodes = new ArrayList<>();

			if (conditions.isEmpty()) {
				actionNodes.addAll(languages.stream()
						.map(l -> MoniLoggerCopyVariablesFromScopeNodeGen.create(l,
								frame -> Iterables.concat(env.findLocalScopes(node, frame),
										env.findTopScopes(hostLanguageId)),
								usePolyglotContext))
						.collect(Collectors.toList()));
			}

			actionNodes.addAll(actions.stream().map(action -> {
				switch (action.eClass().getClassifierID()) {
				case MoniLog4DSLPackage.NOTIFY:
					throw new UnsupportedOperationException("Notify action is not yet supported");
				case MoniLog4DSLPackage.APPEND:
					final Appender appender = ((Append) action).getAppender();
					final MoniLoggerExecutableNode result = getAppenderExecutableNodes(env, appender, level,
							defaultLanguageId, node, hostLanguageId, expressionStrings);
					return result;
				default:
					throw new UnsupportedOperationException();
				}
			}).collect(Collectors.toList()));
			;
			final MoniLoggerBlockNode actionNode = new MoniLoggerBlockNode(actionNodes.toArray(EMPTY_ARRAY));
			return actionNode;
		};
		
		final EventBinding<MoniLoggerExecutionEventNodeFactory> binding = instrumenter
				.attachExecutionEventFactory(filterRules,
						new MoniLoggerExecutionEventNodeFactory(events, conditionFactory, actionFactory));
		
		return binding;
	}

	private MoniLoggerExecutableNode getAppenderExecutableNodes(Env env, Appender appender, Level level,
			String defaultLanduageId, Node node, String currentLanguageId, Set<String> expressionStrings) {
		switch (appender.eClass().getClassifierID()) {
		case MoniLog4DSLPackage.STREAM_APPENDER: {
			final StreamAppender streamAppender = (StreamAppender) appender;
			final MoniLoggerExecutableNode[] values = streamAppender.getValues().stream()
					.map(e -> getExpressionNode(e, defaultLanduageId, node, currentLanguageId, expressionStrings))
					.collect(Collectors.toList()).toArray(EMPTY_ARRAY);
			return new MoniLoggerStreamAppenderNode(epRuntime, streamAppender.getEvent(), values);
		}
		case MoniLog4DSLPackage.CONSOLE_APPENDER: {
			final ConsoleAppender consoleAppender = (ConsoleAppender) appender;
			final Layout layout = consoleAppender.getLayout();
			switch (layout.eClass().getClassifierID()) {
			case MoniLog4DSLPackage.STRING_LAYOUT:
				final StringLayout stringLayout = (StringLayout) layout;
				final String formatString = stringLayout.getFormatString();
				final MoniLoggerExecutableNode[] expressionNodes = stringLayout.getValues().stream()
						.map(e -> getExpressionNode(e, defaultLanduageId, node, currentLanguageId, expressionStrings))
						.map(e -> MoniLoggerUnboxNodeGen.create(e)).collect(Collectors.toList()).toArray(EMPTY_ARRAY);
				return new MoniLoggerConsoleAppenderNode(formatString == null ? "" : formatString, expressionNodes,
						level);
			case MoniLog4DSLPackage.EXTERNAL_LAYOUT:
				final ExternalLayout externalLayout = (ExternalLayout) layout;
				throw new UnsupportedOperationException();
			default:
				throw new UnsupportedOperationException();
			}
		}
		case MoniLog4DSLPackage.FILE_APPENDER: {
			final FileAppender fileAppender = (FileAppender) appender;
			final String filename = fileAppender.getFilename();
			final Layout layout = fileAppender.getLayout();
			switch (layout.eClass().getClassifierID()) {
			case MoniLog4DSLPackage.STRING_LAYOUT:
				final StringLayout stringLayout = (StringLayout) layout;
				final String formatString = stringLayout.getFormatString();
				final MoniLoggerExecutableNode[] expressionNodes = stringLayout.getValues().stream()
						.map(e -> getExpressionNode(e, defaultLanduageId, node, currentLanguageId, expressionStrings))
						.map(e -> MoniLoggerUnboxNodeGen.create(e)).collect(Collectors.toList()).toArray(EMPTY_ARRAY);
				return new MoniLoggerFileAppenderNode(env.getTruffleFile(filename),
						formatString == null ? "" : formatString, expressionNodes);
			case MoniLog4DSLPackage.EXTERNAL_LAYOUT:
				final ExternalLayout externalLayout = (ExternalLayout) layout;
				throw new UnsupportedOperationException();
			default:
				throw new UnsupportedOperationException();
			}
		}
		default:
			throw new UnsupportedOperationException();
		}
	}

	private MoniLoggerExecutableNode getExpressionNode(LanguageExpression expression, String defaultLanguageId,
			Node node, String hostLanguageId, Set<String> expressionStrings) {
		final String languageId;
		switch (expression.eClass().getClassifierID()) {
		case MoniLog4DSLPackage.DEFAULT_LANGUAGE_EXPRESSION:
			languageId = defaultLanguageId;
			break;
		case MoniLog4DSLPackage.EXPLICIT_LANGUAGE_EXPRESSION:
			languageId = ((ExplicitLanguageExpression) expression).getLanguageId();
			break;
		default:
			throw new IllegalArgumentException();
		}
		final String expressionString = expression.getExpression();
//		if (expressionStrings.contains(expressionString)) {
		processLanguageExpression(expressionString, languageId);
//			final Set<String> names = expressionToReadNames.get(expressionString);
//		final CallTarget callTarget = expressionToCallTarget.get(expressionString);

//			final List<MoniLoggerExecutableNode> nodes = names.stream().map(n -> {
//				return MoniLoggerReadFromScopeNodeGen.create(n, languageId, (frame) -> {
//					return Iterables.concat(env.findLocalScopes(node, frame), env.findTopScopes(hostLanguageId));
//				});
//			}).collect(Collectors.toList());
//			nodes.add(new MoniLoggerCallNode(Truffle.getRuntime().createDirectCallNode(callTarget)));
//			final MoniLoggerExecutableNode[] nodeArray = nodes.toArray(EMPTY_ARRAY);

//		final MoniLoggerExecutableNode copyNode = MoniLoggerCopyVariablesFromScopeNodeGen.create(languageId,
//				(frame) -> Iterables.concat(env.findLocalScopes(node, frame), env.findTopScopes(hostLanguageId)));
		final MoniLoggerExecutableNode callNode = new MoniLoggerCallSourceNode(Context.getCurrent(),
				expressionToSource.get(expressionString));
		// new MoniLoggerCallNode(Truffle.getRuntime().createDirectCallNode(callTarget))
//		final MoniLoggerExecutableNode[] nodeArray = new MoniLoggerExecutableNode[] { copyNode, callNode };
//		return new MoniLoggerBlockNode(nodeArray);
		return callNode;
//		} else {
//			processLanguageExpression(expressionString, languageId);
////			final Set<String> names = expressionToReadNames.get(expressionString);
//			final CallTarget callTarget = expressionToCallTarget.get(expressionString);
////			final List<MoniLoggerExecutableNode> nodes = names.stream().map(n -> {
////				return MoniLoggerReadFromScopeNodeGen.create(n, languageId, (frame) -> {
////					return Iterables.concat(env.findLocalScopes(node, frame), env.findTopScopes(hostLanguageId));
////				});
////			}).collect(Collectors.toList());
////			nodes.add(new MoniLoggerCallNode(Truffle.getRuntime().createDirectCallNode(callTarget)));
////			final MoniLoggerExecutableNode[] nodeArray = nodes.toArray(EMPTY_ARRAY);
//			final MoniLoggerExecutableNode[] nodeArray = new MoniLoggerExecutableNode[] {
//					MoniLoggerCopyVariablesFromScopeNodeGen.create(languageId, (frame) ->
//					Iterables.concat(env.findLocalScopes(node, frame), env.findTopScopes(hostLanguageId))),
//					new MoniLoggerCallNode(Truffle.getRuntime().createDirectCallNode(callTarget))
//			};
//			return new MoniLoggerBlockNode(nodeArray);
//		}
	}

//	private MoniLoggerGuestLanguageExecutionEventNodeFactory getExecutionEventNodeFactory(String hostLanguageId,
//			String guestLanguageId, Node hostNode) {
//		final SourceSectionFilter filterRules = SourceSectionFilter.newBuilder() //
//				.sourceIs(s -> s.getLanguage().equals(guestLanguageId)) //
//				.includeInternal(false) //
//				.tagIs(RootBodyTag.class) //
//				.build();
//
//		final MoniLoggerGuestLanguageExecutionEventNodeFactory result = new MoniLoggerGuestLanguageExecutionEventNodeFactory(
//				hostNode, env, guestLanguageId, hostLanguageId);
//
//		instrumenter.attachExecutionEventFactory(filterRules, result);
//
//		return result;
//	}

	private void processLanguageExpression(String expressionString, String languageId) {
//		final CallTarget callTarget = expressionToCallTarget.computeIfAbsent(expressionString, expr -> {
//			try {
//				return env.parse(Source.newBuilder(languageId, expr, "(eval " + languageId + ")").build());
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
//			return null;
//		});
//		if (callTarget != null) {
//			final Set<String> readNames = expressionToReadNames.computeIfAbsent(expressionString, s -> new HashSet<>());
//			final DirectCallNode callNode = Truffle.getRuntime().createDirectCallNode(callTarget);
//			callNode.getCurrentRootNode().accept(new NodeVisitor() {
//				@Override
//				public boolean visit(Node node) {
//					if (node instanceof InstrumentableNode) {
//						final InstrumentableNode instrumentableNode = (InstrumentableNode) node;
//						if (instrumentableNode.hasTag(ReadVariableTag.class)) {
//							final Object obj = instrumentableNode.getNodeObject();
//							if (obj != null) {
//								final InteropLibrary lib = InteropLibrary.getFactory().create(obj);
//								try {
//									final String n = lib.readMember(obj, StandardTags.ReadVariableTag.NAME).toString();
//									readNames.add(n);
//								} catch (Exception e) {
//									e.printStackTrace();
//								}
//							}
//						}
//					}
//					return true;
//				}
//			});
//		}
		expressionToSource.computeIfAbsent(expressionString,
				s -> org.graalvm.polyglot.Source.newBuilder(languageId, s, null).buildLiteral());
	}

	@Override
	protected OptionDescriptors getOptionDescriptors() {
		return new MoniLoggerInstrumentOptionDescriptors();
	}

	protected OptionDescriptors getContextOptionDescriptors() {
		return CONTEXT_OPTIONS;
	}

}
