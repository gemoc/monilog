package org.gemoc.monilogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.gemoc.monilog.moniLog.ASTEvent;
import org.gemoc.monilog.moniLog.ComplexEvent;
import org.gemoc.monilog.moniLog.Event;
import org.gemoc.monilog.moniLog.MoniLogPackage;
import org.gemoc.monilog.moniLog.StreamEvent;
import org.gemoc.monilog.moniLog.UserEvent;

import com.espertech.esper.common.client.EPCompiled;
import com.espertech.esper.common.client.configuration.Configuration;
import com.espertech.esper.common.client.configuration.common.ConfigurationCommonVariantStream;
import com.espertech.esper.common.internal.event.map.MapEventBean;
import com.espertech.esper.compiler.client.CompilerArguments;
import com.espertech.esper.compiler.client.EPCompileException;
import com.espertech.esper.compiler.client.EPCompilerProvider;
import com.espertech.esper.runtime.client.EPDeployException;
import com.espertech.esper.runtime.client.EPDeployment;
import com.espertech.esper.runtime.client.EPRuntime;
import com.espertech.esper.runtime.client.EPRuntimeDestroyedException;
import com.espertech.esper.runtime.client.EPRuntimeProvider;
import com.google.common.collect.Streams;

public class MoniLogEsperConfigurator {

	private Configuration configuration;
	private EPRuntime epRuntime;
//	private Random rand = new Random();
	private Map<String, Map<String, Object>> eventTypes;
	private List<String> eventTypeNames;

//	private void executeScenario(int nbEvents) {
//		for (int i = 0; i < nbEvents; i++) {
//			final String eventTypeName = eventTypeNames.get(rand.nextInt(eventTypeNames.size()));
//			final Map<String, Object> eventType = eventTypes.get(eventTypeName);
//			final List<String> eventProperties = eventType.keySet().stream().collect(Collectors.toList());
//			final Map<String, Object> event = new HashMap<>();
//			for (String propertyName : eventProperties) {
//				final int value = rand.nextInt(2);
//				event.put(propertyName, value);
//			}
//			epRuntime.getEventService().sendEventMap(event, eventTypeName);
//		}
//	}

	public void processEvent(Event e) {
		switch (e.eClass().getClassifierID()) {
		case MoniLogPackage.AST_EVENT:
			processCallEvent((ASTEvent) e);
			break;
		case MoniLogPackage.USER_EVENT:
			processUserEvent((UserEvent) e);
			break;
		case MoniLogPackage.COMPLEX_EVENT:
			processComplexEvent((ComplexEvent) e);
			break;
		}
	}

	public void processCallEvent(ASTEvent astEvent) {
		// TODO: add as event type
	}

	public void processUserEvent(UserEvent userEvent) {
		// TODO: add as event type
	}

	public void processComplexEvent(ComplexEvent complexEvent) {
		// TODO: gather all child events, and process them.

		final Set<StreamEvent> childEvents = Streams.stream(complexEvent.getPattern().eAllContents())
				.filter(o -> o instanceof StreamEvent)
				.map(o -> (StreamEvent) o)
				.collect(Collectors.toSet());
		
		

		// create a

	}

	private void configureEsper() {

		eventTypes = new HashMap<>();

		configuration = new Configuration();

		{
			final String eventTypeName = "EventA";
			final Map<String, Object> eventType = new HashMap<>();
			eventType.put("uuid", Object.class);
			for (int j = 0; j < 3; j++) {
				eventType.put("argA" + j, Object.class);
			}
			eventTypes.put(eventTypeName, eventType);
		}
		{
			final String eventTypeName = "EventB";
			final Map<String, Object> eventType = new HashMap<>();
			eventType.put("uuid", Object.class);
			for (int j = 0; j < 6; j++) {
				eventType.put("argB" + j, Object.class);
			}
			eventTypes.put(eventTypeName, eventType);
		}
		{
			final String eventTypeName = "EventC";
			final Map<String, Object> eventType = new HashMap<>();
			eventType.put("uuid", Object.class);
			for (int j = 0; j < 4; j++) {
				eventType.put("argC" + j, Object.class);
			}
			eventTypes.put(eventTypeName, eventType);
		}

		eventTypeNames = eventTypes.keySet().stream().collect(Collectors.toList());
		eventTypes.forEach((e, p) -> configuration.getCommon().addEventType(e, p));
		final Map<String, Object> complexEventTypeProperties = new HashMap<>(eventTypes);
		configuration.getCommon().addEventType("MyComplexEventStream", complexEventTypeProperties);

		final List<String> streamInsertStatements = new ArrayList<>();
		final String streamName = "MyVariantStream";
		final ConfigurationCommonVariantStream variantStream = new ConfigurationCommonVariantStream();
		eventTypes.forEach((n, p) -> {
			variantStream.addEventTypeName(n);
			streamInsertStatements.add("insert into " + streamName + " select * from " + n);
		});
		configuration.getCommon().addVariantStream(streamName, variantStream);
		configuration.getCompiler().getExpression().setDuckTyping(true);
		epRuntime = EPRuntimeProvider.getRuntime("MyRuntimeID", configuration);

		streamInsertStatements.forEach(s -> compileAndDeploy(s));
//		EsperStatement.getSilentStatements().forEach(s -> compileAndDeploy(s));
//		EsperStatement.getObservedStatements().forEach(s -> compileAndDeployAndListen(s));
	}

	private void compileAndDeploy(String statement) {
		try {
			final EPCompiled compiled = EPCompilerProvider.getCompiler().compile(statement,
					new CompilerArguments(configuration));
			epRuntime.getDeploymentService().deploy(compiled);
		} catch (EPCompileException | EPRuntimeDestroyedException | EPDeployException e) {
			e.printStackTrace();
		}
	}

	private void compileAndDeployAndListen(String statement) {
		try {
			final EPCompiled compiled = EPCompilerProvider.getCompiler().compile(statement,
					new CompilerArguments(configuration));
			final EPDeployment deployment = epRuntime.getDeploymentService().deploy(compiled);
			Arrays.stream(deployment.getStatements())
					.forEach(deployedStatement -> deployedStatement.addListener((events, o, x, rt) -> {
						if (events != null) {
							final List<MapEventBean> eventBeans = Arrays.stream(events).map(e -> (MapEventBean) e)
									.collect(Collectors.toList());
							eventBeans.forEach(bean -> {
								System.out.println("=========================");
								bean.getProperties().entrySet().forEach(entry -> {
									final Object value = entry.getValue();
									if (value != null) {
										if (value instanceof Object[]) {
											System.out.println(entry.getKey() + " = "
													+ Arrays.asList((Object[]) value).toString());
										} else {
											System.out.println(entry.getKey() + " = " + value.toString());
										}
									} else {
										System.out.println(entry.getKey() + " = []");
									}
								});
							});
						}
					}));
		} catch (EPCompileException | EPRuntimeDestroyedException | EPDeployException e) {
			e.printStackTrace();
		}
	}

}
