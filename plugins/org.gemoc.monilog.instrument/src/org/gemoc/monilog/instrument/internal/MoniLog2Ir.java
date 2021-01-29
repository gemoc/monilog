package org.gemoc.monilog.instrument.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.gemoc.monilog.moniLog4DSL.ASTEvent;
import org.gemoc.monilog.moniLog4DSL.ComplexEvent;
import org.gemoc.monilog.moniLog4DSL.Document;
import org.gemoc.monilog.moniLog4DSL.EmitEvent;
import org.gemoc.monilog.moniLog4DSL.Event;
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage;
import org.gemoc.monilog.moniLog4DSL.MoniLogger;
import org.gemoc.monilog.moniLog4DSL.StreamEvent;
import org.gemoc.monilog.moniLog4DSL.UserEvent;
//import org.gemoc.monilogger.temporalpatterns.AbstractTemporalProperty;
//import org.gemoc.monilogger.temporalpatterns.PropertyProvider;
//import org.graalvm.polyglot.Source;

import com.google.common.collect.Streams;

public class MoniLog2Ir {

//	private Map<String, Source> expressionToSource = new HashMap<>();
//	private Map<String, AbstractTemporalProperty> temporalPropertyMap = new HashMap<>();
//	private Map<String, List<String>> propertyNameToEventTypes = new HashMap<>();
//	private Map<Event, AbstractTemporalProperty> eventToTemporalProperty = new HashMap<>();
	private Map<Event, List<MoniLogger>> eventToMoniLoggers = new HashMap<>();
	private final Map<Event, Set<Event>> eventToParentEvents = new HashMap<>();
	private final Map<Event, Set<Event>> eventToChildEvents = new HashMap<>();
	private final Set<Event> events = new HashSet<>();

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
		final Map<ASTEvent, List<MoniLogger>> astEventToMoniLogger = new HashMap<>();
		specificationModels.forEach(model -> {
			allEvents.addAll(model.getEvents());
			model.getMoniloggers().forEach(monilogger -> {
//				TODO: filter out moniloggers that are not loggable
//				final Level level = Level.parse(monilogger.getLevel().getLiteral());
//				if (loggingLevel.intValue() < level.intValue()) {
					moniloggers.add(monilogger);
					processEvent(monilogger, astEventToMoniLogger);
//				}
			});
		});
		return astEventToMoniLogger;
	}

	private void processEvent(MoniLogger monilogger, Map<ASTEvent, List<MoniLogger>> astEventToMoniLogger) {
		final Event event = monilogger.getStreamEvent().getEvent();
		final EClass eClass = event.eClass();
		final int classifierID = eClass.getClassifierID();
		eventToMoniLoggers.computeIfAbsent(event, o -> new ArrayList<>()).add(monilogger);
		final List<UserEvent> emittedEvents = monilogger.getActions().stream().filter(a -> a instanceof EmitEvent)
				.map(a -> ((EmitEvent) a).getEvent()).collect(Collectors.toList());
		events.add(event);
		events.addAll(emittedEvents);
		setChildEvents(event, emittedEvents);
		switch (classifierID) {
		case MoniLog4DSLPackage.AST_EVENT: {
			final ASTEvent ev = (ASTEvent) event;
			astEventToMoniLogger.computeIfAbsent(ev, o -> new ArrayList<>()).add(monilogger);
			break;
		}
		case MoniLog4DSLPackage.COMPLEX_EVENT: {
			final ComplexEvent ev = (ComplexEvent) event;
			// Creating esper statement and subscriber for complex event directly referred
			// to by moniloggers
//			eventToTemporalProperty.put(event, PropertyProvider.compileProperty(monilogger.getStreamEvent()));
			final Set<Event> parentEvents = Streams.stream(ev.eAllContents()).filter(o -> o instanceof StreamEvent)
					.map(o -> ((StreamEvent) o).getEvent()).collect(Collectors.toSet());
			events.addAll(parentEvents);
			setParentEvents(ev, parentEvents);
			break;
		}
		case MoniLog4DSLPackage.USER_EVENT: {
			// Creating esper statement and subscriber for user events directly referred to
			// by moniloggers
//			eventToTemporalProperty.put(event, PropertyProvider.compileProperty(monilogger.getStreamEvent()));
			break;
		}
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
}
