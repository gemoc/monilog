package org.gemoc.monilog.instrument.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.gemoc.monilog.instrument.internal.temporal.AbstractTemporalProperty;
import org.gemoc.monilog.instrument.internal.temporal.PropertyProvider;
import org.gemoc.monilog.moniLog4DSL.ASTEvent;
import org.gemoc.monilog.moniLog4DSL.ComplexEvent;
import org.gemoc.monilog.moniLog4DSL.Document;
import org.gemoc.monilog.moniLog4DSL.Event;
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage;
import org.gemoc.monilog.moniLog4DSL.MoniLogger;
import org.gemoc.monilog.moniLog4DSL.StreamEvent;
import org.gemoc.monilog.moniLog4DSL.UserEvent;

import com.google.common.collect.Streams;

public class MoniLog2Ir {

//	private Map<String, Source> expressionToSource = new HashMap<>();
//	private Map<String, AbstractTemporalProperty> temporalPropertyMap = new HashMap<>();
//	private Map<String, List<String>> propertyNameToEventTypes = new HashMap<>();
	private Map<Event, AbstractTemporalProperty> eventToTemporalProperty = new HashMap<>();
	private Map<Event, List<MoniLogger>> eventToMoniLoggers = new HashMap<>();
	private Map<Event, Map<String, Object>> eventToEventProperties = new HashMap<>();

	/*
	 * This method computes which moniloggers must be triggered in which order after
	 * which events, according to the current logging level.
	 * 
	 * The resulting IR associates to each enabled ASTEvent an ordered list of the
	 * moniloggers to be triggered on that event. For each monilogger triggered upon
	 * an user or a complex event, it also provides a corresponding Esper statement.
	 */
	public Map<ASTEvent, List<MoniLogger>> buildIr(final List<Document> specificationModels, Level loggingLevel) {
		final List<Event> allEvents = new ArrayList<>();
		final List<MoniLogger> moniloggers = new ArrayList<>();
		specificationModels.forEach(model -> {
			allEvents.addAll(model.getEvents());
			model.getMoniloggers().forEach(monilogger -> {
//				TODO: filter out moniloggers that are not loggable
//				final Level level = Level.parse(monilogger.getLevel().getLiteral());
//				if (loggingLevel.intValue() < level.intValue()) {
				moniloggers.add(monilogger);
				processEvent(monilogger);
//				}
			});
		});

		final Map<ASTEvent, List<MoniLogger>> result = new HashMap<>();
		EventSorter.getEventTrees(allEvents, moniloggers)
				.forEach((e, l) -> result.put(e, l.stream()
						.flatMap(ev -> eventToMoniLoggers.get(ev).stream())
						.collect(Collectors.toList())));

		return result;
	}

	private void processEvent(MoniLogger monilogger) {
		final Event event = monilogger.getStreamEvent().getEvent();
		eventToMoniLoggers.computeIfAbsent(event, o -> new ArrayList<>()).add(monilogger);
		final EClass eClass = event.eClass();
		final int classifierID = eClass.getClassifierID();
		switch (classifierID) {
		case MoniLog4DSLPackage.AST_EVENT: {
			final ASTEvent ev = (ASTEvent) event;
			final Map<String, Object> eventProperties = new HashMap<>();
			if (ev.getParameterDecl() != null) {
				ev.getParameterDecl().getParameters().forEach(p -> eventProperties.put(p.getName(), Object.class));
			}
			eventToEventProperties.put(ev, eventProperties);
			break;
		}
		case MoniLog4DSLPackage.COMPLEX_EVENT: {
			final ComplexEvent ev = (ComplexEvent) event;
			// TODO stream events => get event type or processEvent to get event type
			final List<Event> events = Streams.stream(ev.eAllContents())
					.filter(o -> o instanceof StreamEvent)
					.map(o -> ((StreamEvent) o).getEvent())
					.collect(Collectors.toList());
			
			
			// Creating esper statement and subscriber for complex event directly referred
			// to by moniloggers
			eventToTemporalProperty.put(event, PropertyProvider.compileProperty(monilogger.getStreamEvent()));
			break;
		}
		case MoniLog4DSLPackage.USER_EVENT: {
			final UserEvent ev = (UserEvent) event;
			final Map<String, Object> eventProperties = new HashMap<>();
			ev.getParameterDecl().getParameters().forEach(p -> eventProperties.put(p.getName(), Object.class));
			eventToEventProperties.put(ev, eventProperties);
			// Creating esper statement and subscriber for user events directly referred to
			// by moniloggers
			eventToTemporalProperty.put(event, PropertyProvider.compileProperty(monilogger.getStreamEvent()));
			break;
		}
		}
	}
	
	private Map<String, Object> getEventProperties(Event event) {
		return eventToEventProperties.computeIfAbsent(event, e -> {
			final Map<String, Object> eventProperties = new HashMap<>();
			e.getParameterDecl().getParameters().forEach(p -> eventProperties.put(p.getName(), Object.class));
			return eventProperties;
		});
	}
}
