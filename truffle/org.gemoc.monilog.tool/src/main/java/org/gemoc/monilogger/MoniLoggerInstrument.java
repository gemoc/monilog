package org.gemoc.monilogger;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.logging.Level;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gemoc.monilog.moniLog.ASTEvent;
import org.gemoc.monilog.moniLog.ASTEventKind;
import org.gemoc.monilog.moniLog.ASTReference;
import org.gemoc.monilog.moniLog.Action;
import org.gemoc.monilog.moniLog.AfterASTEvent;
import org.gemoc.monilog.moniLog.Appender;
import org.gemoc.monilog.moniLog.AppenderCall;
import org.gemoc.monilog.moniLog.BeforeASTEvent;
import org.gemoc.monilog.moniLog.CallableElementNamedReference;
import org.gemoc.monilog.moniLog.Condition;
import org.gemoc.monilog.moniLog.Document;
import org.gemoc.monilog.moniLog.Event;
import org.gemoc.monilog.moniLog.Expression;
import org.gemoc.monilog.moniLog.ExternalAppender;
import org.gemoc.monilog.moniLog.ExternalLayout;
import org.gemoc.monilog.moniLog.LanguageCall;
import org.gemoc.monilog.moniLog.LanguageExpression;
import org.gemoc.monilog.moniLog.LanguageValue;
import org.gemoc.monilog.moniLog.Layout;
import org.gemoc.monilog.moniLog.LayoutCall;
import org.gemoc.monilog.moniLog.LocalAppender;
import org.gemoc.monilog.moniLog.LocalLayout;
import org.gemoc.monilog.moniLog.MoniLogExpression;
import org.gemoc.monilog.moniLog.MoniLogPackage;
import org.gemoc.monilog.moniLog.MoniLogger;
import org.gemoc.monilog.moniLog.Parameter;
import org.gemoc.monilog.moniLog.ParameterReference;
import org.gemoc.monilog.moniLog.SourceRangeReference;
import org.gemoc.monilogger.nodes.MoniLoggerBlockNode;
import org.gemoc.monilogger.nodes.MoniLoggerCallSourceNode;
import org.gemoc.monilogger.nodes.MoniLoggerCopyVariablesFromScopeNodeGen;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.gemoc.monilogger.nodes.MoniLoggerNode;
import org.gemoc.monilogger.nodes.MoniLoggerNodeGen;
import org.gemoc.monilogger.nodes.action.MoniLoggerExternalAppenderNodeGen;
import org.gemoc.monilogger.nodes.action.MoniLoggerExternalLayoutNode;
import org.gemoc.monilogger.nodes.condition.MoniLoggerConditionalNode;
import org.gemoc.monilogger.nodes.expression.parser.SimpleExpressionParser;
import org.gemoc.monilogger.parser.MoniLogParser;
import org.graalvm.options.OptionCategory;
import org.graalvm.options.OptionDescriptors;
import org.graalvm.options.OptionKey;
import org.graalvm.options.OptionStability;
import org.graalvm.options.OptionValues;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import com.espertech.esper.common.client.EPCompiled;
import com.espertech.esper.common.client.configuration.Configuration;
import com.espertech.esper.compiler.client.CompilerArguments;
import com.espertech.esper.compiler.client.EPCompileException;
import com.espertech.esper.compiler.client.EPCompilerProvider;
import com.espertech.esper.runtime.client.EPDeployException;
import com.espertech.esper.runtime.client.EPRuntime;
import com.espertech.esper.runtime.client.EPRuntimeDestroyedException;
import com.espertech.esper.runtime.client.EPRuntimeProvider;
import com.google.common.collect.Streams;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.Option;
import com.oracle.truffle.api.TruffleContext;
import com.oracle.truffle.api.TruffleLogger;
import com.oracle.truffle.api.instrumentation.ContextsListener;
import com.oracle.truffle.api.instrumentation.EventBinding;
import com.oracle.truffle.api.instrumentation.Instrumenter;
import com.oracle.truffle.api.instrumentation.SourceSectionFilter;
import com.oracle.truffle.api.instrumentation.SourceSectionFilter.IndexRange;
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

	public Env getEnv() {
		return env;
	}

	@CompilationFinal
	private TruffleLogger logger;

	private Map<String, Source> expressionToSource = new HashMap<>();
	private Map<String, org.graalvm.polyglot.Source> evaluatedSources = new HashMap<>();
//	private Map<String, AbstractTemporalProperty> temporalPropertyMap = new HashMap<>();
	private Map<String, List<String>> propertyNameToEventTypes = new HashMap<>();
//	private Map<Event, AbstractTemporalProperty> eventToTemporalProperty = new HashMap<>();
	private Map<Event, List<MoniLogger>> eventToMoniLoggers = new HashMap<>();
	private final Map<Event, Set<Event>> eventToParentEvents = new HashMap<>();
	private final Map<Event, Set<Event>> eventToChildEvents = new HashMap<>();
	private final Set<Event> events = new HashSet<>();

	private MoniLogParser parser = new MoniLogParser();

	@Override
	protected void onCreate(Env env) {
		this.env = env;
		this.logger = this.env.getLogger(ID);

		instrumenter = env.getInstrumenter();
		env.registerService(this);
		out = new PrintStream(env.out());

		instrumenter.attachContextsListener(new ContextsListener() {

			final Map<TruffleContext, List<EventBinding<MoniLoggerASTEventNodeFactory>>> contextToFactory = new ConcurrentHashMap<>();

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
				final ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();

				final OptionValues contextOptions = env.getOptions(context);
				
				final List<String> files = MoniLoggerContext.FILES.getValue(contextOptions);
				final List<String> specs = files.stream().map(path -> {
					try {
						return new String(Files.readAllBytes(Paths.get(path)));
					} catch (IOException e) {
					}
					final InputStream is = contextClassLoader.getResourceAsStream(path);
					if (is != null) {
						return readFromStream(is);
					} else {
						return "";
					}
				}).collect(Collectors.toList());

				if (!specs.isEmpty()) {
					final List<EventBinding<MoniLoggerASTEventNodeFactory>> bindings = enable(specs);
					contextToFactory.put(context, bindings);
				}
			}

			private String readFromStream(InputStream is) {
				return (new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))).lines()
						.collect(Collectors.joining("\n"));
			}

			@Override
			public void onContextClosed(TruffleContext context) {
				if (epRuntime != null) {
					final Map<String, Object> event = new HashMap<>(1);
					event.put("EoE", "EoE");
					epRuntime.getEventService().sendEventMap(event, "EoE");
				}
				evaluatedSources.clear();
				List<EventBinding<MoniLoggerASTEventNodeFactory>> bindings = contextToFactory.remove(context);
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

	/*
	 * 1) Collect all the specification models. 2) Collect all the enabled
	 * moniloggers (w.r.t. logging level). 3) Compute the tree of the events of
	 * interest. 4) For each complex event from which a monilogger is directly or
	 * transitively accessible, create a possibly parameterized Esper statement. 5)
	 * For each monilogger directly referring to a user or complex event, create a
	 * possibly parameterized Esper statement and subscriber. 6) For each AST event
	 * directly referred to by a monilogger or a complex event, create an AST
	 * execution event node pushing the AST event to the stream, and calling every
	 * moniloggers directly and transitively accessible from that AST event through
	 * the event tree.
	 * 
	 * OR
	 * 
	 * Let Esper do the work, gather matches in a Queue and process them FIFO,
	 * emitted events being only taken into account the next time -> violates the
	 * hypothesis allowing to only instrument a few AST nodes and not all of them ->
	 * all must be resolved upon reaching an observable state. If a monilogger is
	 * triggered upon a single user event, it must be called after all moniloggers
	 * that can emit such event on a particular AST node.
	 */
	private List<EventBinding<MoniLoggerASTEventNodeFactory>> enable(final List<String> specifications) {
		final List<Document> specificationModels = new ArrayList<>();
		final List<EventBinding<MoniLoggerASTEventNodeFactory>> bindings = new ArrayList<>();
		final Map<ASTEvent, List<MoniLogger>> astEventToMoniLogger = new HashMap<>();
		final List<MoniLogger> moniloggers = new ArrayList<>();
		final List<Event> allEvents = new ArrayList<>();

		final ResourceSet rs = parser.parse(specifications);
		Streams.stream(rs.getAllContents()).filter(o -> o instanceof Document).map(o -> (Document) o).forEach(model -> {
			specificationModels.add(model);
			allEvents.addAll(model.getEvents());
			model.getMoniloggers().forEach(monilogger -> {
				final Level level = Level.parse(monilogger.getLevel().getLiteral());
				if (logger.isLoggable(level)) {
					// Collect all enabled moniloggers
					moniloggers.add(monilogger);
					processEvent(monilogger, astEventToMoniLogger);
				}
			});
		});

//		TODO: properly handle complex events
//		allEvents.stream().filter(e -> e instanceof ComplexEvent).map(e -> {
//			final ComplexEvent ev = (ComplexEvent) e;
//			final String statement = "insert into" + e.getName() + "select";
//			// TODO create esper statement selecting events from 
//			return "";
//		});

//		TODO: compute the ordering of moniloggers triggered by user or complex events
//		/*
//		 * At this point, moniloggers and events are computed, so we can compute the partial ordering
//		 * of events from each AST event.
//		 */
//		Map<ASTEvent, List<Event>> eventTrees = EventSorter.getEventTrees(events, moniloggers);
//		eventTrees.forEach((event, children) -> {
//			/* 
//			 * For each event in the event tree, check the status of their associated subscriber,
//			 * then 1) re-inject events into the esper runtime (for complex events), and 2) call
//			 * the associated moniloggers.
//			 */
//			children.stream().map(e -> {
//				
//				return "";
//			});
//		});

		astEventToMoniLogger.forEach((event, triggeredMoniloggers) -> {
			final List<MoniLogger> related = new ArrayList<>(triggeredMoniloggers);
//			TODO: add the transitive closure of moniloggers triggered by 'event'
//			final Set<Event> openSet = new HashSet<>();
//			final Set<Event> closedSet = new HashSet<>();
//			openSet.add(event);
//			while (!openSet.isEmpty()) {
//				final Event current = openSet.stream().findFirst().get();
//				openSet.remove(current);
//				final Set<Event> childEvents = eventToChildEvents.get(current);
//				childEvents.stream().filter(e -> closedSet.contains(e)).forEach(e -> {
//					openSet.add(e);
//					related.addAll(eventToMoniLoggers.computeIfAbsent(e, o -> new ArrayList<>()));
//				});
//				closedSet.add(current);
//			}

			bindings.add(createASTEventBinding(event, related));
		});

//		List<String> moniloggerS
//		moniloggers.stream().filter(m -> !(m.getEvent().getEvent() instanceof ASTEvent))
//				.map(m -> m.getEvent());

//		configureEsper(streamEvents);

		return bindings;
	}

	private void processEvent(MoniLogger monilogger, Map<ASTEvent, List<MoniLogger>> astEventToMoniLogger) {
		final Event event = monilogger.getStreamEvent().getEvent();
		final EClass eClass = event.eClass();
		final int classifierID = eClass.getClassifierID();
		eventToMoniLoggers.computeIfAbsent(event, o -> new ArrayList<>()).add(monilogger);
//		TODO:
//		final List<UserEvent> emittedEvents = monilogger.getActions().stream().filter(a -> a instanceof EmitEvent)
//				.map(a -> ((EmitEvent) a).getEvent()).collect(Collectors.toList());
		events.add(event);
//		events.addAll(emittedEvents);
//		setChildEvents(event, emittedEvents);
		switch (classifierID) {
		case MoniLogPackage.AST_EVENT: {
			final ASTEvent ev = (ASTEvent) event;
			astEventToMoniLogger.computeIfAbsent(ev, o -> new ArrayList<>()).add(monilogger);
			break;
		}
//		case MoniLogPackage.COMPLEX_EVENT: {
//			final ComplexEvent ev = (ComplexEvent) event;
//			// Creating esper statement and subscriber for complex event directly referred
//			// to by moniloggers
//			eventToTemporalProperty.put(event, PropertyProvider.compileProperty(monilogger.getStreamEvent()));
//			final Set<Event> parentEvents = Streams.stream(ev.eAllContents()).filter(o -> o instanceof StreamEvent)
//					.map(o -> ((StreamEvent) o).getEvent()).collect(Collectors.toSet());
//			events.addAll(parentEvents);
//			setParentEvents(ev, parentEvents);
//			break;
//		}
//		case MoniLogPackage.USER_EVENT: {
//			// Creating esper statement and subscriber for user events directly referred to
//			// by moniloggers
//			eventToTemporalProperty.put(event, PropertyProvider.compileProperty(monilogger.getStreamEvent()));
//			break;
//		}
		}
	}

	private void setChildEvents(Event parent, Collection<? extends Event> children) {
		eventToChildEvents.computeIfAbsent(parent, o -> new HashSet<>()).addAll(children);
		children.forEach(e -> eventToParentEvents.computeIfAbsent(e, o -> new HashSet<>()).add(parent));
	}

	private void setParentEvents(Event child, Collection<? extends Event> parents) {
		eventToParentEvents.computeIfAbsent(child, o -> new HashSet<>()).addAll(parents);
		parents.forEach(e -> eventToChildEvents.computeIfAbsent(e, o -> new HashSet<>()).add(child));
	}

	@TruffleBoundary
	private void configureEsper(List<MoniLogger> moniloggers) {

		final Map<Event, Set<Event>> eventToSubEvents = new HashMap<>();
		final Map<String, Map<String, Object>> streamEvents = new HashMap<>();

		configuration = new Configuration();
		ClassLoader oldClassLoader = Thread.currentThread().getContextClassLoader();
		Thread.currentThread().setContextClassLoader(configuration.getClass().getClassLoader());

		events.stream().forEach(e -> {
			switch (e.eClass().getClassifierID()) {
			case MoniLogPackage.AST_EVENT: {
				final ASTEvent ev = (ASTEvent) e;
				final Map<String, Object> streamEvent = new HashMap<>();
				streamEvent.put(ev.getName(), String.class);
				ev.getParameterDecl().getParameters().stream().forEach(p -> streamEvent.put(p.getName(), Object.class));
				final ASTEventKind kind = ev.getKind();
				if (kind instanceof AfterASTEvent) {
					streamEvent.put("result", Object.class);
				}
				streamEvents.put(ev.getName(), streamEvent);
				break;
			}
//			TODO:
//			case MoniLogPackage.COMPLEX_EVENT: {
//				final ComplexEvent ev = (ComplexEvent) e;
//				final Map<String, Object> streamEvent = new HashMap<>();
//				streamEvent.put(e.getName(), String.class);
//				ev.getParameterDecl().getParameters().stream().forEach(p -> streamEvent.put(p.getName(), Object.class));
//				streamEvents.put(e.getName(), streamEvent);
//				eventToSubEvents.computeIfAbsent(ev, o -> new HashSet<>()).addAll(eventToParentEvents.get(ev));
//				break;
//			}
//			case MoniLogPackage.USER_EVENT: {
//				final UserEvent ev = (UserEvent) e;
//				final Map<String, Object> streamEvent = new HashMap<>();
//				streamEvent.put(e.getName(), String.class);
//				ev.getParameterDecl().getParameters().stream().forEach(p -> streamEvent.put(p.getName(), Object.class));
//				streamEvents.put(e.getName(), streamEvent);
//				// User event streams are only created if they are directly used by monilogger.
//				eventToSubEvents.computeIfAbsent(ev, o -> Collections.singleton(o));
//				break;
//			}
			}
		});

		try {
			final List<String> streamInsertStatements = new ArrayList<>();
			streamEvents.forEach((e, p) -> configuration.getCommon().addEventType(e, p));
			final Map<String, Object> eoeEventProperties = new HashMap<>();
			eoeEventProperties.put("EoE", String.class);
			configuration.getCommon().addEventType("EoE", eoeEventProperties);
			// Creating the insert statements for events involved in complex events and for
			// user events directly referred to by moniloggers.
//			eventToSubEvents.forEach((e, es) -> {
//				final String eventName = e.getName();
//				final ConfigurationCommonVariantStream variantStream = new ConfigurationCommonVariantStream();
//				es.forEach(subEvent -> {
//					final String eventType = subEvent.getName();
//					variantStream.addEventTypeName(eventType);
//					streamInsertStatements.add("insert into " + eventName + " select * from " + eventType);
//				});
//				variantStream.addEventTypeName("EoE");
//				streamInsertStatements.add("insert into " + eventName + " select * from EoE");
//				configuration.getCommon().addVariantStream(eventName, variantStream);
//			});
			configuration.getCompiler().getExpression().setDuckTyping(true);
			epRuntime = EPRuntimeProvider.getRuntime(ID, configuration);
			streamInsertStatements.forEach(s -> compileAndDeploy(s));
//			temporalPropertyMap.values().forEach(p -> {
//				p.compileEPL(configuration);
//				p.deploy(epRuntime);
//			});
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
	
	private SourceSectionFilter getSourceFilter(ASTEvent event) {
		final ASTReference astReference = event.getElement();
		switch (astReference.eClass().getClassifierID()) {
//		TODO case MoniLogPackage.CALLABLE_ELEMENT_OBJECT_REFERENCE:
//		final EStructuralFeature nameFeature = callableElementReference.eClass()
//		.getEAllStructuralFeatures().stream().filter(f -> f.getName().equals("name")).findFirst().orElse(null);
//		if (nameFeature != null) {
//			return ((CallableElementObjectReference) callableElementReference).getTarget().eGet(nameFeature).toString();
//		} else {
//			return "";
//		}
		case MoniLogPackage.CALLABLE_ELEMENT_NAMED_REFERENCE:
			final String name = ((CallableElementNamedReference) astReference).getTarget();
			return SourceSectionFilter.newBuilder() //
					.includeInternal(false) //
					.tagIs(RootBodyTag.class) //
					.rootNameIs(s -> name.equals(s)).build();
		case MoniLogPackage.SOURCE_RANGE_REFERENCE:
			final SourceRangeReference range = (SourceRangeReference) astReference;
			final int line = range.getLine();
			final int start = range.getFrom();
			final int end = range.getTo();
			return SourceSectionFilter.newBuilder() //
					.includeInternal(false) //
					.lineIs(line)
					.columnStartsIn(IndexRange.byLength(start, 1))
					.columnEndsIn(IndexRange.byLength(end, 1)).build();
		default: throw new UnsupportedOperationException();
		}
	}

	private EventBinding<MoniLoggerASTEventNodeFactory> createASTEventBinding(ASTEvent event,
			List<MoniLogger> relatedMoniLoggers) {
		final boolean usePolyglotContext = USE_POLYGLOT_CONTEXT.getValue(env.getOptions());
		
		final SourceSectionFilter filterRules = getSourceFilter(event);

		final BiFunction<String, Node, MoniLoggerExecutableNode> moniloggerFactory = new BiFunction<String, Node, MoniLoggerExecutableNode>() {

			private boolean onEnter = event.getKind() instanceof BeforeASTEvent;
			private final List<MoniLogger> moniloggers = new ArrayList<>(relatedMoniLoggers);

			public MoniLoggerExecutableNode apply(String hostLanguageId, Node node) {
				// for each monilogger that can be triggered by this AST event
				return new MoniLoggerBlockNode(moniloggers.stream().map(m -> {

					final Level level = Level.parse(m.getLevel().getLiteral());
					final Set<String> languages = new HashSet<>();

					final List<Condition> conditions = m.getConditions();
					final List<Action> actions = m.getActions();

					final List<MoniLoggerExecutableNode> prologNodes = new ArrayList<>();
					final List<MoniLoggerExecutableNode> conditionNodes = new ArrayList<>();
					final List<MoniLoggerExecutableNode> actionNodes = new ArrayList<>();

					conditionNodes.addAll(conditions.stream().map(condition -> {
						final Expression value = condition.getExpression();
						return getExpressionNode(value, node, onEnter, languages);
					}).collect(Collectors.toList()));

					final MoniLoggerConditionalNode conditionNode = new MoniLoggerConditionalNode(
							conditionNodes.toArray(EMPTY_ARRAY));

					actionNodes.addAll(actions.stream().map(action -> {
						switch (action.eClass().getClassifierID()) {
						case MoniLogPackage.LANGUAGE_VALUE: {
							final LanguageValue languageValue = (LanguageValue) action;
							return getExpressionNode(languageValue, node, onEnter, languages);
						}
						case MoniLogPackage.APPENDER_CALL:
							return getAppenderExecutableNode(env, (AppenderCall) action, level, node, onEnter, languages,
									new HashMap<>());
//						TODO:
//						case MoniLogPackage.EMIT_EVENT:
//							return new MoniLoggerEmitEventNode(epRuntime, ((EmitEvent) action).getEvent().getName(),
//									EMPTY_ARRAY);
//						case MoniLogPackage.SET_VARIABLE:
//							final SetVariable setVariable = (SetVariable) action;
//							return MoniLoggerSetVariableNodeGen.create(setVariable.getVariable(), node, onEnter,
//									getExpressionNode(setVariable.getValue(), node, languages));
						case MoniLogPackage.MONILOGGER_CALL:
							throw new UnsupportedOperationException();
						default:
							throw new UnsupportedOperationException();
						}
					}).collect(Collectors.toList()));

					final MoniLoggerBlockNode actionNode = new MoniLoggerBlockNode(actionNodes.toArray(EMPTY_ARRAY));

					prologNodes.addAll(languages.stream().map(
							l -> MoniLoggerCopyVariablesFromScopeNodeGen.create(l, node, onEnter, usePolyglotContext))
							.collect(Collectors.toList()));

					final MoniLoggerBlockNode prologNode;
					if (!prologNodes.isEmpty()) {
						prologNode = new MoniLoggerBlockNode(prologNodes.toArray(EMPTY_ARRAY));
					} else {
						prologNode = null;
					}

					final MoniLoggerNode moniloggerNode = MoniLoggerNodeGen.create(prologNode, conditionNode,
							actionNode);

					return moniloggerNode;
				}).collect(Collectors.toList()).toArray(EMPTY_ARRAY));
			}
		};

		final EventBinding<MoniLoggerASTEventNodeFactory> binding = instrumenter.attachExecutionEventFactory(
				filterRules, new MoniLoggerASTEventNodeFactory(event, moniloggerFactory, epRuntime));

		return binding;
	}

	private List<Expression> computeAppenderCallActualArgs(AppenderCall childCall, AppenderCall parentCall,
			Map<AppenderCall, List<Expression>> appenderCallToActualArgs) {
		return childCall.getArgs().stream().map(a -> {
			if (a instanceof ParameterReference) {
				final Parameter param = ((ParameterReference) a).getParameter();
				final int paramIdx = parentCall.getAppender().getParameterDecl().getParameters().indexOf(param);
				if (paramIdx > -1) {
					return appenderCallToActualArgs.get(parentCall).get(paramIdx);
				} else {
					throw new IllegalArgumentException("Referenced parameter " + param.getName()
							+ " not found in calling appender definition " + parentCall.getAppender().getName() + ".");
				}
			}
			return a;
		}).collect(Collectors.toList());
	}

	private MoniLoggerExecutableNode getAppenderExecutableNode(Env env, AppenderCall appenderCall, Level level,
			Node node, boolean onEnter, Set<String> languages,
			Map<AppenderCall, List<Expression>> appenderCallToActualArgs) {
		if (appenderCall.getArgs().stream().allMatch(a -> !(a instanceof ParameterReference))) {
			appenderCallToActualArgs.putIfAbsent(appenderCall, new ArrayList<>(appenderCall.getArgs()));
		}
		final Appender appender = appenderCall.getAppender();

		switch (appender.eClass().getClassifierID()) {
		case MoniLogPackage.APPENDER: {
			throw new IllegalStateException("Can't find definition for " + appender.getName() + ".");
		}
		case MoniLogPackage.LOCAL_APPENDER: {
			final LocalAppender localAppender = (LocalAppender) appender;
			localAppender.getCalls().forEach(childCall -> appenderCallToActualArgs.computeIfAbsent(childCall,
					a -> computeAppenderCallActualArgs(a, appenderCall, appenderCallToActualArgs)));
			final MoniLoggerExecutableNode[] calls = localAppender.getCalls().stream()
					.map(call -> getAppenderExecutableNode(env, call, level, node, onEnter, languages,
							appenderCallToActualArgs))
					.collect(Collectors.toList()).toArray(EMPTY_ARRAY);
			return new MoniLoggerBlockNode(calls);
		}
		case MoniLogPackage.EXTERNAL_APPENDER: {
			final ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
			final ExternalAppender externalAppender = (ExternalAppender) appender;
			final String className = ((Document) externalAppender.eContainer()).getName() + "."
					+ externalAppender.getName();
			try {
				final Class<?> appenderClass = contextClassLoader.loadClass(className);
				final Constructor<?> constructor = appenderClass.getConstructor();
				final Value appenderValue = Value.asValue(constructor.newInstance());
				final List<Expression> actualArgs = appenderCallToActualArgs.get(appenderCall);
				final MoniLoggerExecutableNode[] valueNodes = actualArgs.stream()
						.map(arg -> getExpressionNode(arg, node, onEnter, languages)).collect(Collectors.toList())
						.toArray(EMPTY_ARRAY);
				return MoniLoggerExternalAppenderNodeGen.create(appenderValue,
						Arrays.copyOfRange(valueNodes, 1, valueNodes.length), level, valueNodes[0]);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}

			return null;
		}
		default:
			throw new UnsupportedOperationException();
		}
	}

	private List<Expression> computeLayoutCallActualArgs(LayoutCall childCall, LayoutCall parentCall,
			Map<LayoutCall, List<Expression>> layoutCallToActualArgs) {
		return childCall.getArgs().stream().map(a -> {
			if (a instanceof ParameterReference) {
				final Parameter param = ((ParameterReference) a).getParameter();
				final int paramIdx = parentCall.getLayout().getParameterDecl().getParameters().indexOf(param);
				if (paramIdx > -1) {
					return layoutCallToActualArgs.get(parentCall).get(paramIdx);
				} else {
					throw new IllegalArgumentException("Referenced parameter " + param.getName()
							+ " not found in calling layout definition " + parentCall.getLayout().getName() + ".");
				}
			}
			return a;
		}).collect(Collectors.toList());
	}

	private MoniLoggerExecutableNode getLayoutExecutableNode(Env env, LayoutCall layoutCall, Node node, boolean onEnter,
			Set<String> languages, Map<LayoutCall, List<Expression>> layoutCallToActualArgs) {
		if (layoutCall.getArgs().stream().allMatch(a -> a instanceof Expression)) {
			layoutCallToActualArgs.putIfAbsent(layoutCall,
					layoutCall.getArgs().stream().map(a -> (Expression) a).collect(Collectors.toList()));
		}
		final Layout layout = layoutCall.getLayout();
		switch (layout.eClass().getClassifierID()) {
		case MoniLogPackage.LOCAL_LAYOUT: {
			final LocalLayout localLayout = (LocalLayout) layout;
			final LayoutCall childCall = localLayout.getCall();
			layoutCallToActualArgs.computeIfAbsent(childCall,
					l -> computeLayoutCallActualArgs(l, layoutCall, layoutCallToActualArgs));
			return getLayoutExecutableNode(env, childCall, node, onEnter, languages, layoutCallToActualArgs);
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
				final MoniLoggerExecutableNode[] valueNodes = layoutCallToActualArgs.get(layoutCall).stream()
						.map(arg -> getExpressionNode(arg, node, onEnter, languages)).collect(Collectors.toList())
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

	private final SimpleExpressionParser expressionParser = new SimpleExpressionParser();

	private MoniLoggerExecutableNode getExpressionNode(Expression expression, Node node, boolean onEnter,
			Set<String> languages) {
		switch (expression.eClass().getClassifierID()) {
		case MoniLogPackage.MONI_LOG_EXPRESSION: {
			return expressionParser.createExpression((MoniLogExpression) expression, node, onEnter);
		}
		case MoniLogPackage.LANGUAGE_VALUE: {
			final LanguageValue languageValue = (LanguageValue) expression;
			final String languageId = languageValue.getLanguageId();
			languages.add(languageId);
			return getLanguageValue(languageId, languageValue, node, onEnter, languages);
		}
		case MoniLogPackage.LAYOUT_CALL:
			return getLayoutExecutableNode(env, (LayoutCall) expression, node, onEnter, languages,
					/* TODO */ new HashMap<>());
		default:
			throw new UnsupportedOperationException();
		}
	}

	private MoniLoggerExecutableNode getLanguageValue(String languageId, LanguageValue languageValue, Node node,
			boolean onEnter, Set<String> languages) {
		final EObject value = languageValue.getValue();
		switch (value.eClass().getClassifierID()) {
		case MoniLogPackage.LANGUAGE_EXPRESSION: {
			final LanguageExpression expression = (LanguageExpression) value;
			final String expressionString = expression.getExpression();
			final MoniLoggerExecutableNode callNode = new MoniLoggerCallSourceNode(Context.getCurrent(),
					expressionToSource.computeIfAbsent(expressionString,
							s -> Source.newBuilder(languageId, s, null).buildLiteral()));
			return callNode;
		}
		case MoniLogPackage.LANGUAGE_CALL: {
			final LanguageCall call = (LanguageCall) value;
			final String filePath = call.getFile().getFilePath();
			final org.graalvm.polyglot.Source source = evaluatedSources.computeIfAbsent(filePath, p -> {
				org.graalvm.polyglot.Source src;
				try {
					src = org.graalvm.polyglot.Source.newBuilder(languageId, new File(filePath)).build();
					Context.getCurrent().eval(src);
					return src;
				} catch (IOException e) {
					e.printStackTrace();
					return null;
				}
			});
			final Value ast = Context.getCurrent().getBindings(languageId).getMember(call.getFqn());
			final MoniLoggerExecutableNode[] args = call.getArgs().stream()
					.map(e -> getExpressionNode(e, node, onEnter, languages)).collect(Collectors.toList())
					.toArray(EMPTY_ARRAY);
			final MoniLoggerExecutableNode callNode = new MoniLoggerCallSourceNode(Context.getCurrent(), source, ast,
					args);
			return callNode;
		}
		default:
			throw new UnsupportedOperationException();
		}
	}

	@Override
	protected OptionDescriptors getOptionDescriptors() {
		return new MoniLoggerInstrumentOptionDescriptors();
	}

	protected OptionDescriptors getContextOptionDescriptors() {
		return CONTEXT_OPTIONS;
	}
}
