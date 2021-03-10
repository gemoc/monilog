package org.gemoc.monilog.instrument.internal.temporal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.xtext.util.Strings;
import org.gemoc.monilog.moniLog4DSL.ComplexEvent;
import org.gemoc.monilog.moniLog4DSL.PropertyValue;
import org.gemoc.monilog.moniLog4DSL.StreamEvent;

import com.espertech.esper.common.internal.event.map.MapEventBean;
import com.google.common.collect.Streams;

public abstract class AbstractComplexEventProperty extends AbstractTemporalProperty {

	protected final List<String> exportedProperties = new ArrayList<>();

	protected final Map<StreamEvent, String> streamEventToName = new HashMap<>();

	// childEventInstanceName -> otherChildEventInstanceNames -> constraints
	protected final Map<String, Map<String, List<String>>> constraintProperties = new HashMap<>();

	protected AbstractComplexEventProperty(ComplexEvent event) {
		this(event, 0, Arrays.asList(new TruthValue[] { TruthValue.SATISFIED }));
	}

	protected AbstractComplexEventProperty(ComplexEvent event, int windowLength) {
		this(event, windowLength, Arrays.asList(new TruthValue[] { TruthValue.SATISFIED }));
	}

	protected AbstractComplexEventProperty(ComplexEvent event, int windowLength, List<TruthValue> notifyOn) {
		super(event, windowLength, notifyOn);
		/*
		 * TODO:
		 * 
		 * call A(arg0, arg1, arg2) { before SomeJob }
		 * 
		 * user B(arg0, arg1)
		 * 
		 * complex C(a, b, c) { A(a, , b) before B(a, c) }
		 * 
		 * 2 pieces of information inferred from this specification: - 1) Event C takes
		 * its properties from (A|B).arg0 (a), A.arg2 (b), and B.arg1 (c) - 2) Esper
		 * statement must create distinct streams where A.arg0 (a) = B.arg0 (a)
		 * 
		 * complex D(c) { A(0, b, c) after B(, b) }
		 * 
		 * 3 pieces of information inferred from this specification: - 1) Event D takes
		 * its property from B.arg2 (c) - 2) Esper statement must create distinct
		 * streams where A.arg1 = B.arg1 (b) - 3) Esper statement must constrain A.arg0
		 * = 0
		 * 
		 */

		/*
		 * 3 non-exclusive cases: - property in at least one child event and in complex
		 * event properties declaration => property of emitted complex event takes value
		 * of the property in child event - property in at least two child events =>
		 * constraint between child events (requires distinct streams) - property with
		 * expression in child event => constraint on the property to be equal to the
		 * result of the expression
		 */

		final List<StreamEvent> childStreamEvents = Streams.stream(event.eAllContents())
				.filter(o -> o instanceof StreamEvent).map(o -> (StreamEvent) o).collect(Collectors.toList());

		final Map<String, Integer> tmp = new HashMap<>();
		childStreamEvents.forEach(e -> tmp.compute(e.getEvent().getName(), (s, i) -> i + 1));
		childStreamEvents.forEach(e -> streamEventToName.put(e, e.getEvent().getName() + tmp.get(e)));

		childStreamEvents.forEach(e -> e.getValues());

		final Map<String, List<StreamEvent>> propertyValueToStreamEvents = new HashMap<>();

		final List<PropertyValue> values = Streams.stream(event.eAllContents()).filter(o -> o instanceof StreamEvent)
				.map(o -> (StreamEvent) o).flatMap(e -> {
					return e.getValues().stream().filter(v -> v instanceof PropertyValue).map(v -> (PropertyValue) v);
				}).collect(Collectors.toList());
		final Set<String> localNames = values.stream().map(v -> v.getId()).collect(Collectors.toSet());
		// Exported properties are properties of the event that are bound by child event
		// parameters.
		exportedProperties.addAll(event.getParameterDecl().getParameters().stream().map(p -> p.getName())
				.filter(n -> localNames.contains(n)).collect(Collectors.toList()));

		values.forEach(v -> propertyValueToStreamEvents.computeIfAbsent(v.getId(), id -> new ArrayList<>())
				.add((StreamEvent) v.eContainer()));

		localNames.forEach(n -> propertyValueToStreamEvents.computeIfPresent(n,
				(name, list) -> list.size() > 1 ? list : Collections.emptyList()));

		// instanceName -> property -> otherInstanceNames
		final Map<String, Map<String, List<String>>> constraintsMap = new HashMap<>();
		
		propertyValueToStreamEvents.forEach((p, l) -> l.forEach(e -> {
			final String eventInstanceName = streamEventToName.get(e);
			final List<String> otherEventInstanceNames = l.stream()
					.filter(o -> !o.equals(e))
					.map(o -> streamEventToName.get(o))
					.collect(Collectors.toList());
			constraintsMap.computeIfAbsent(eventInstanceName, n -> new HashMap<>()).put(p, otherEventInstanceNames);
		}));

		final Set<String> acc = new HashSet<>();
		final Set<String> constraintNames = new HashSet<>();
		for (PropertyValue value : values) {
			if (!acc.add(value.getId())) {
				constraintNames.add(value.getId());
			}
		}

		// We need to identify constrained stream events, which are events whose child
		// events have properties bound to other child events or child events of other
		// stream events.
		Streams.stream(event.eAllContents()).filter(o -> o instanceof StreamEvent).map(o -> (StreamEvent) o)
				.forEach(e -> {
					final List<String> constraints = e.getValues().stream().filter(o -> o instanceof PropertyValue)
							.map(o -> ((PropertyValue) o).getId()).filter(n -> !constraintNames.contains(n))
							.collect(Collectors.toList());
					if (!constraints.isEmpty()) {
//						constraintProperties.put(e.getEvent().getName(), constraints); TODO
					}
				});
	}

	protected String getConstrainedStatementHeader(List<String> constrainedEvents) {
		return EsperStatementHelper.getConstrainedStatementHeader(null, getName()).toString();
	}

	protected String getEventConstraints(String eventInstanceName, String eventTypeName) {
//		return EsperStatementHelper
//				.getEventConstraints(constraintProperties.get(eventTypeName), eventInstanceName, eventTypeName)
//				.toString(); TODO
		return "";
	}

	protected String getEventNegConstraints(String eventInstanceName, String eventTypeName) {
//		return EsperStatementHelper
//				.getEventNegConstraints(constraintProperties.get(eventTypeName), eventInstanceName, eventTypeName)
//				.toString(); TODO
		return "";
	}

	@Override
	protected TruthValue triggered(List<MapEventBean> triggeringEvents) {
		final TruthValue status = super.triggered(triggeringEvents);

		if (notifyOn.contains(status)) {
			// TODO: instantiate and inject new event based on the StreamEvent this property
			// is built on.
		}
		return status;
	}

}
