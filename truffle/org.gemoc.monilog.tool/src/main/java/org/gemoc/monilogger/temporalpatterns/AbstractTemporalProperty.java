package org.gemoc.monilogger.temporalpatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.gemoc.monilog.moniLog4DSL.Event;

import com.espertech.esper.common.client.EPCompiled;
import com.espertech.esper.common.client.configuration.Configuration;
import com.espertech.esper.common.internal.event.map.MapEventBean;
import com.espertech.esper.compiler.client.CompilerArguments;
import com.espertech.esper.compiler.client.EPCompileException;
import com.espertech.esper.compiler.client.EPCompilerProvider;
import com.espertech.esper.runtime.client.EPDeployException;
import com.espertech.esper.runtime.client.EPDeployment;
import com.espertech.esper.runtime.client.EPRuntime;

public abstract class AbstractTemporalProperty {

	private final PropertyState propertyState;

	private final Event event;
	protected final List<TruthValue> notifyOn;
	protected final int windowLength;
	

	protected EPCompiled compiledStatement;
	
	protected AbstractTemporalProperty(Event event) {
		this(event, 0, Arrays.asList(new TruthValue[] { TruthValue.SATISFIED }));
	}

	protected AbstractTemporalProperty(Event event, int windowLength) {
		this(event, windowLength, Arrays.asList(new TruthValue[] { TruthValue.SATISFIED }));
	}
	
	protected AbstractTemporalProperty(Event event, int windowLength, List<TruthValue> notifyOn) {
		this.event = event;
		this.notifyOn = new ArrayList<>(notifyOn);
		this.windowLength = windowLength;
		this.propertyState = new PropertyState(event.getName(), TruthValue.UNKNOWN);
	}

	public String getName() {
		return event.getName();
	}
	
	public String getSafeName() {
		return event.getName();
	}

	protected abstract String getStatementString();

	protected abstract TruthValue getStatus(Map<String, List<Map<?, ?>>> events);

	public void compileEPL(Configuration configuration) {
		try {
			compiledStatement = EPCompilerProvider.getCompiler().compile(getStatementString(),
					new CompilerArguments(configuration));
		} catch (EPCompileException e) {
			e.printStackTrace();
		}
	}

	public void deploy(EPRuntime epRuntime) {
		try {
			final EPDeployment deployment = epRuntime.getDeploymentService().deploy(compiledStatement);
			Arrays.stream(deployment.getStatements()).forEach(statement -> statement.addListener((events, o, x, rt) -> {
				if (events != null) {
					triggered(Arrays.stream(events).map(e -> (MapEventBean) e).collect(Collectors.toList()));
				}
			}));
		} catch (EPDeployException e) {
			throw new RuntimeException(e);
		}
	}

	protected TruthValue triggered(List<MapEventBean> triggeringEvents) {
		final Map<String, List<Map<?, ?>>> result = new HashMap<>();
		triggeringEvents.forEach(eventBean -> {
			eventBean.getProperties().entrySet().forEach(e -> {
				if (e.getValue() != null) {
					final List<Map<?, ?>> list = result.computeIfAbsent(e.getKey(), k -> new ArrayList<>());
					if (e.getValue() instanceof Map<?, ?>[]) {
						Arrays.stream((Map<?, ?>[]) e.getValue()).forEach(m -> list.add(m));
					} else {
						list.add((Map<?, ?>) e.getValue());
					}
				}
			});
		});
		final TruthValue status = getStatus(result);
		propertyState.setValue(status);
		return status;
	}

	public PropertyState getPropertyState() {
		return propertyState;
	}

	public static class PropertyState {
		private final String name;
		private TruthValue value;
		
		private Map<Object, ?> propertyValues;

		public PropertyState(String name, TruthValue value) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public TruthValue getValue() {
			return value;
		}

		public void setValue(TruthValue value) {
			this.value = value;
		}
	}
}
