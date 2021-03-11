package org.gemoc.monilogger;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.gemoc.monilog.moniLog.ASTEvent;
import org.gemoc.monilog.moniLog.ComplexEvent;
import org.gemoc.monilog.moniLog.EmitEvent;
import org.gemoc.monilog.moniLog.Event;
import org.gemoc.monilog.moniLog.MoniLogger;
import org.gemoc.monilog.moniLog.StreamEvent;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.alg.shortestpath.FloydWarshallShortestPaths;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.DirectedWeightedPseudograph;

import com.google.common.collect.Streams;

public class EventSorter {

	public static Map<ASTEvent, List<Event>> getEventTrees(Collection<Event> events,
			Collection<MoniLogger> moniloggers) {
		final DirectedWeightedPseudograph<Event, DefaultWeightedEdge> graph = createGraph(events, moniloggers);
		final Map<ASTEvent, List<Event>> eventTrees = new HashMap<>();
		final FloydWarshallShortestPaths<Event, DefaultWeightedEdge> algo = new FloydWarshallShortestPaths<>(graph);
		graph.edgeSet().forEach(e -> graph.setEdgeWeight(e, -1));
		events.stream().filter(event -> event instanceof ASTEvent).map(event -> (ASTEvent) event).forEach(event -> {
			if (graph.degreeOf(event) > 0) {
				/*
				 * For each AST event, compute the order of the resulting events by computing
				 * maximum depth of each resulting event.
				 */
				final Map<Event, Integer> eventToDepth = computeDepth(event, graph, algo);
				eventTrees.put(event, eventToDepth.keySet().stream()
						.sorted((e1, e2) -> eventToDepth.get(e1) - eventToDepth.get(e2)).collect(Collectors.toList()));
			}
		});
		return eventTrees;
	}

	private static DirectedWeightedPseudograph<Event, DefaultWeightedEdge> createGraph(Collection<Event> events,
			Collection<MoniLogger> moniloggers) {
		// Create nodes
		final DirectedWeightedPseudograph<Event, DefaultWeightedEdge> graph = new DirectedWeightedPseudograph<>(
				DefaultWeightedEdge.class);
		events.forEach(event -> graph.addVertex(event));

		// For each complex event, iterate over composing events and add the complex
		// event as child event.
		events.stream().filter(event -> event instanceof ComplexEvent).map(event -> (ComplexEvent) event)
				.forEach(childEvent -> Streams.stream(childEvent.getPattern().eAllContents())
						.filter(o -> o instanceof StreamEvent).map(o -> ((StreamEvent) o).getEvent())
						.forEach(parentEvent -> graph.addEdge(parentEvent, childEvent)));

		// For each user event, iterate over triggering event of all moniloggers
		// emitting this event and add the user event as child event.
		moniloggers.forEach(monilogger -> {
			final Event parentEvent = monilogger.getStreamEvent().getEvent();
			monilogger.getActions().stream().filter(o -> o instanceof EmitEvent).map(o -> ((EmitEvent) o).getEvent())
					.forEach(childEvent -> graph.addEdge(parentEvent, childEvent));
		});

		final CycleDetector<Event, DefaultWeightedEdge> cycleDetector = new CycleDetector<>(graph);
		if (cycleDetector.detectCycles()) {
			final Set<Event> cycles = cycleDetector.findCycles();
			throw new IllegalStateException("Cycle detected: " + cycles.toString());
		}

		return graph;
	}

	private static Map<Event, Integer> computeDepth(Event sourceNode,
			DirectedWeightedPseudograph<Event, DefaultWeightedEdge> graph,
			FloydWarshallShortestPaths<Event, DefaultWeightedEdge> algo) {
		final Map<Event, Integer> result = new HashMap<>();
		result.put(sourceNode, 0);
		graph.vertexSet().stream().filter(event -> event != sourceNode).forEach(event -> {
			final GraphPath<Event, DefaultWeightedEdge> path = algo.getPath(sourceNode, event);
			if (path != null) {
				final int depth = (int) Math.abs(path.getWeight());
				result.put(event, depth);
			}
		});

		return result;
	}

}
