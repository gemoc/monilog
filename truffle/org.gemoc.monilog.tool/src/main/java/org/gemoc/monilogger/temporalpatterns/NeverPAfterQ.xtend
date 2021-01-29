package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.Absence
import org.gemoc.monilog.moniLog4DSL.After
import org.gemoc.monilog.moniLog4DSL.ComplexEvent

class NeverPAfterQ extends AbstractTemporalProperty {
	
	val String p
	val String q
	
	new(ComplexEvent event, Absence never, After after) {
		super(event)
		p = never.event.event.name
		q = after.lowerBound.event.name
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P as P
					pattern (EoE | Q A*? (P | EoE))
					define
						P as P.«p»? is not null,
						Q as Q.«q»? is not null,
						EoE as EoE.EoE? is not null
				)
			'''
		return result
	}
	
	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		val lP = events.get("P")
		val reachedP = !(lP === null || lP.empty)
		if (reachedP) {
			return TruthValue.VIOLATED
		} else {
			return TruthValue.SATISFIED
		}
	}
}