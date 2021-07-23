package org.gemoc.monilogger;

import java.io.BufferedReader;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gemoc.instrumentationInterface.InstrumentationInterfaceStandaloneSetup;
import org.gemoc.monilog.moniLog.ASTEvent;
import org.gemoc.monilog.moniLog.ASTEventKind;
import org.gemoc.monilog.moniLog.Action;
import org.gemoc.monilog.moniLog.AfterASTEvent;
import org.gemoc.monilog.moniLog.Appender;
import org.gemoc.monilog.moniLog.AppenderCall;
import org.gemoc.monilog.moniLog.BeforeASTEvent;
import org.gemoc.monilog.moniLog.CallEvent;
import org.gemoc.monilog.moniLog.Condition;
import org.gemoc.monilog.moniLog.Document;
import org.gemoc.monilog.moniLog.Event;
import org.gemoc.monilog.moniLog.Expression;
import org.gemoc.monilog.moniLog.ExternalAppender;
import org.gemoc.monilog.moniLog.LanguageCall;
import org.gemoc.monilog.moniLog.LocalAppender;
import org.gemoc.monilog.moniLog.MoniLogPackage;
import org.gemoc.monilog.moniLog.MoniLogger;
import org.gemoc.monilog.moniLog.MoniloggerCall;
import org.gemoc.monilog.moniLog.ParameterDecl;
import org.gemoc.monilog.moniLog.Property;
import org.gemoc.monilog.moniLog.SetVariable;
import org.gemoc.monilog.moniLog.Setup;
import org.gemoc.monilog.moniLog.WriteEvent;
import org.gemoc.monilogger.nodes.MoniLoggerBlockNode;
import org.gemoc.monilogger.nodes.MoniLoggerCopyVariablesFromScopeNodeGen;
import org.gemoc.monilogger.nodes.MoniLoggerExecutableNode;
import org.gemoc.monilogger.nodes.MoniLoggerNode;
import org.gemoc.monilogger.nodes.MoniLoggerNodeGen;
import org.gemoc.monilogger.nodes.action.MoniLoggerExternalAppenderNodeGen;
import org.gemoc.monilogger.nodes.action.MoniLoggerSetVariableNodeGen;
import org.gemoc.monilogger.nodes.condition.MoniLoggerConditionalNode;
import org.gemoc.monilogger.nodes.condition.MoniLoggerConditionalNodeGen;
import org.gemoc.monilogger.nodes.expression.parser.SimpleExpressionParser;
import org.gemoc.monilogger.parser.MoniLogParser;
import org.graalvm.options.OptionCategory;
import org.graalvm.options.OptionDescriptors;
import org.graalvm.options.OptionKey;
import org.graalvm.options.OptionStability;
import org.graalvm.options.OptionValues;
import org.graalvm.polyglot.Value;

import com.google.common.collect.Streams;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.Option;
import com.oracle.truffle.api.TruffleContext;
import com.oracle.truffle.api.TruffleLogger;
import com.oracle.truffle.api.instrumentation.ContextsListener;
import com.oracle.truffle.api.instrumentation.EventBinding;
import com.oracle.truffle.api.instrumentation.Instrumenter;
import com.oracle.truffle.api.instrumentation.SourceSectionFilter;
import com.oracle.truffle.api.instrumentation.StandardTags.RootBodyTag;
import com.oracle.truffle.api.instrumentation.StandardTags.WriteVariableTag;
import com.oracle.truffle.api.instrumentation.TruffleInstrument;
import com.oracle.truffle.api.instrumentation.TruffleInstrument.Registration;
import com.oracle.truffle.api.nodes.LanguageInfo;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.utilities.CyclicAssumption;

@Registration(id = MoniLoggerInstrument.ID, name = "MoniLogger", version = "0.0.1", services = MoniLoggerInstrument.class)
public class MoniLoggerInstrument extends TruffleInstrument {

	static final OptionDescriptors CONTEXT_OPTIONS = new MoniLoggerContextOptionDescriptors();

	@Option(name = "polyglotContext", help = "Use polyglot context.", category = OptionCategory.EXPERT, stability = OptionStability.STABLE)
	public static final OptionKey<Boolean> USE_POLYGLOT_CONTEXT = new OptionKey<Boolean>(false);

	public static final String MONILOG_CONTEXT = "monilog-context";

	public static final String ID = "monilogger";
	public static final String FILE_OPTION = ID + ".files";

	static final MoniLoggerExecutableNode[] EMPTY_ARRAY = new MoniLoggerExecutableNode[0];

	private final SimpleExpressionParser expressionParser = new SimpleExpressionParser();

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

	private final CyclicAssumption contextActive = new CyclicAssumption("MoniLog context active");

	private Map<Event, List<MoniLogger>> eventToMoniLoggers = new HashMap<>();
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
				final List<String> specs = files.stream().filter(path -> path.endsWith(".mnlg")).map(path -> {
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
				final List<String> instrumentationInterfaces = files.stream().filter(path -> path.endsWith(".instritf"))
						.collect(Collectors.toList());

				if (!specs.isEmpty()) {
					final List<EventBinding<MoniLoggerASTEventNodeFactory>> bindings = enable(specs,
							instrumentationInterfaces);
					contextToFactory.put(context, bindings);
				}
			}

			private String readFromStream(InputStream is) {
				return (new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))).lines()
						.collect(Collectors.joining("\n"));
			}

			@Override
			public void onContextClosed(TruffleContext context) {
				expressionParser.clean();
				List<EventBinding<MoniLoggerASTEventNodeFactory>> bindings = contextToFactory.remove(context);
				if (bindings != null) {
					bindings.forEach(b -> b.dispose());
				}
				contextActive.invalidate("context closed");
			}
		}, true);
	}

	@Override
	protected void onFinalize(Env env) {

	}

	public CyclicAssumption getContextActive() {
		return contextActive;
	}

	private final Map<String, Map<String, Object>> eventTypes = new HashMap<>();

	private List<EventBinding<MoniLoggerASTEventNodeFactory>> enable(final List<String> specifications,
			final List<String> instrumentationInterfaces) {
		final List<Document> specificationModels = new ArrayList<>();
		final List<MoniLogger> moniloggers = new ArrayList<>();
		final List<Event> allEvents = new ArrayList<>();

		final List<EventBinding<MoniLoggerASTEventNodeFactory>> bindings = new ArrayList<>();

		final ResourceSet rs = parser.parse(specifications);

		final InstrumentationInterfaceStandaloneSetup setup = new InstrumentationInterfaceStandaloneSetup();
		setup.createInjectorAndDoEMFRegistration();
		
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("instritf", new XMIResourceFactoryImpl());
		
		instrumentationInterfaces.forEach(path -> {
			rs.getResource(URI.createFileURI(path), true);
		});

		EcoreUtil.resolveAll(rs);

		Streams.stream(rs.getAllContents()).filter(o -> o instanceof Document).map(o -> (Document) o).forEach(model -> {
			specificationModels.add(model);
			allEvents.addAll(model.getEvents());
			moniloggers.addAll(model.getMoniloggers());
		});

		eventTypes.clear();
		eventToMoniLoggers.clear();

		moniloggers.forEach(m -> processMonilogger(m));

		eventToMoniLoggers.forEach((event, triggeredMoniloggers) -> {
			if (event instanceof ASTEvent) {
				final List<Event> compositeEvents = eventToCompositeEvents.computeIfAbsent(event,
						e -> Collections.emptyList());
				final List<MoniLogger> related = new ArrayList<>(triggeredMoniloggers);
				related.addAll(compositeEvents.stream()
						.flatMap(e -> eventToMoniLoggers.getOrDefault(e, new ArrayList<>()).stream())
						.collect(Collectors.toList()));
				bindings.add(createASTEventBinding((ASTEvent) event, related));
			}
		});

		return bindings;
	}

	private void processMonilogger(MoniLogger monilogger) {
		final Event event = monilogger.getStreamEvent().getEvent();
//		monilogger.getStreamEvent().getProp()
		eventToMoniLoggers.computeIfAbsent(event, o -> new ArrayList<>()).add(monilogger);
		processEvent(event);
	}

	private final Map<Event, List<Event>> eventToCompositeEvents = new HashMap<>();

	private void processEvent(Event event) {
		if (events.add(event)) {
			switch (event.eClass().getClassifierID()) {
			case MoniLogPackage.WRITE_EVENT: {
				final WriteEvent writeEvent = (WriteEvent) event;
				final Map<String, Object> eventType = new HashMap<>();
				eventTypes.put(writeEvent.getName(), eventType);
				break;
			}
			case MoniLogPackage.CALL_EVENT: {
				final CallEvent astEvent = (CallEvent) event;
				final Map<String, Object> eventType = new HashMap<>();
				final ParameterDecl decl = astEvent.getParameterDecl();
				if (decl != null) {
					decl.getParameters().stream().forEach(p -> eventType.put(p.getProperty().getName(), Object.class));
				}
				final ASTEventKind kind = astEvent.getKind();
				if (kind instanceof AfterASTEvent) {
					eventType.put("result", Object.class);
				}
				eventTypes.put(astEvent.getName(), eventType);
				break;
			}
//			case MoniLogPackage.USER_EVENT: {
//				final UserEvent userEvent = (UserEvent) event;
//				final Map<String, Object> eventType = new HashMap<>();
//				userEvent.getParameterDecl().getParameters().stream()
//						.forEach(p -> eventType.put(p.getProperty().getName(), Object.class));
//				eventTypes.put(event.getName(), eventType);
//				break;
//			}
			}
		}
	}

	private SourceSectionFilter getSourceFilter(ASTEvent event) {
		switch (event.eClass().getClassifierID()) {
		case MoniLogPackage.WRITE_EVENT: {
			return SourceSectionFilter.newBuilder() //
					.includeInternal(false) //
					.tagIs(WriteVariableTag.class).build();
		}
		case MoniLogPackage.CALL_EVENT: {
			final String name = ((CallEvent) event).getElement().getName();
			return SourceSectionFilter.newBuilder() //
					.includeInternal(false) //
					.tagIs(RootBodyTag.class) //
					.rootNameIs(s -> name.equals(s)).build();
		}
		default:
			throw new UnsupportedOperationException();
		}
	}
	
//	private void egzegzeg(MoniloggerCall moniloggerCall) {
//		moniloggerCall.getMonilogger()
//	}

	private EventBinding<MoniLoggerASTEventNodeFactory> createASTEventBinding(ASTEvent event,
			List<MoniLogger> relatedMoniLoggers) {
		final boolean usePolyglotContext = USE_POLYGLOT_CONTEXT.getValue(env.getOptions());

		final SourceSectionFilter filterRules = getSourceFilter(event);

		final Function<Node, MoniLoggerExecutableNode> moniloggerFactory = new Function<Node, MoniLoggerExecutableNode>() {

			private boolean onEnter = event.getKind() instanceof BeforeASTEvent;
			private final List<MoniLogger> moniloggers = new ArrayList<>(relatedMoniLoggers);

			public MoniLoggerExecutableNode apply(Node node) {
				// for each monilogger that can be triggered by this AST event
				return new MoniLoggerBlockNode(moniloggers.stream().map(m -> {

					final Set<String> languages = Streams.stream(m.eAllContents())
							.filter(o -> o instanceof LanguageCall)
							.map(o -> ((LanguageCall) o).getLanguageID()).collect(Collectors.toSet());

					final Condition condition = m.getCondition();
					final List<Action> thenActions = m.getThenActions();
					final List<Action> elseActions = m.getElseActions();

					final List<MoniLoggerExecutableNode> prologNodes = new ArrayList<>();
					final List<MoniLoggerExecutableNode> thenActionNodes = new ArrayList<>();
					final List<MoniLoggerExecutableNode> elseActionNodes = new ArrayList<>();

					final MoniLoggerConditionalNode conditionNode = condition != null
							? MoniLoggerConditionalNodeGen
									.create(getExpressionNode(condition.getExpression(), node, onEnter))
							: null;

					final Function<Action, MoniLoggerExecutableNode> actionMapper = action -> {
						switch (action.eClass().getClassifierID()) {
						case MoniLogPackage.LANGUAGE_CALL: {
							final LanguageCall languageCall = (LanguageCall) action;
							return getExpressionNode(languageCall, node, onEnter);
						}
						case MoniLogPackage.APPENDER_CALL:
							return getAppenderExecutableNode(env, (AppenderCall) action, node, onEnter);
//						case MoniLogPackage.EMIT_EVENT:
//							return new MoniLoggerEmitEventNode(epRuntime, ((EmitEvent) action).getEvent().getName(),
//									EMPTY_ARRAY);
						case MoniLogPackage.SET_VARIABLE:
							final SetVariable setVariable = (SetVariable) action;
							return MoniLoggerSetVariableNodeGen.create(
									getPropertyFQN(setVariable.getVariable().getProperty()),
									getExpressionNode(setVariable.getValue(), node, onEnter));
						case MoniLogPackage.MONILOGGER_CALL:
//							TODO
							final MoniloggerCall moniloggerCall = (MoniloggerCall) action;
//							moniloggerCall.
							throw new UnsupportedOperationException();
						default:
							throw new UnsupportedOperationException();
						}
					};

					thenActionNodes.addAll(thenActions.stream().map(actionMapper).collect(Collectors.toList()));
					elseActionNodes.addAll(elseActions.stream().map(actionMapper).collect(Collectors.toList()));

					final MoniLoggerBlockNode thenActionNode = thenActionNodes.isEmpty() ? null
							: new MoniLoggerBlockNode(thenActionNodes.toArray(EMPTY_ARRAY));
					final MoniLoggerBlockNode elseActionNode = elseActionNodes.isEmpty() ? null
							: new MoniLoggerBlockNode(elseActionNodes.toArray(EMPTY_ARRAY));

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
							thenActionNode, elseActionNode);

					return moniloggerNode;
				}).collect(Collectors.toList()).toArray(EMPTY_ARRAY));
			}
		};

		final EventBinding<MoniLoggerASTEventNodeFactory> binding = instrumenter
				.attachExecutionEventFactory(filterRules, new MoniLoggerASTEventNodeFactory(event, moniloggerFactory));

		return binding;
	}

	public static String getPropertyFQN(Property property) {
		final String pName = property.getName();
		final EObject container = property.eContainer().eContainer();
		if (container instanceof MoniLogger) {
			final MoniLogger m = (MoniLogger) container;
			return ((Document) m.eContainer()).getName() + "." + m.getName() + "." + pName;
		} else if (container instanceof Setup) {
			return ((Document) container.eContainer()).getName() + "." + pName;
		} else {
			throw new UnsupportedOperationException();
		}
	}

	private MoniLoggerExecutableNode getAppenderExecutableNode(Env env, AppenderCall appenderCall, Node node,
			boolean onEnter) {
		final Appender appender = appenderCall.getAppender();

		switch (appender.eClass().getClassifierID()) {
		case MoniLogPackage.APPENDER: {
			throw new IllegalStateException("Can't find definition for " + appender.getName() + ".");
		}
		case MoniLogPackage.LOCAL_APPENDER: {
			final LocalAppender localAppender = (LocalAppender) appender;
			final MoniLoggerExecutableNode[] calls = localAppender.getCalls().stream()
					.map(call -> getAppenderExecutableNode(env, call, node, onEnter))
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
				final MoniLoggerExecutableNode[] valueNodes = appenderCall.getArgs().stream()
						.map(arg -> getExpressionNode(arg, node, onEnter)).collect(Collectors.toList())
						.toArray(EMPTY_ARRAY);
				return MoniLoggerExternalAppenderNodeGen.create(appenderValue,
						Arrays.copyOfRange(valueNodes, 1, valueNodes.length), valueNodes[0]);
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

	private MoniLoggerExecutableNode getExpressionNode(Expression expression, Node node, boolean onEnter) {
		return expressionParser.createExpressionNode(expression, node, onEnter);
	}

	@Override
	protected OptionDescriptors getOptionDescriptors() {
		return new MoniLoggerInstrumentOptionDescriptors();
	}

	protected OptionDescriptors getContextOptionDescriptors() {
		return CONTEXT_OPTIONS;
	}
}
