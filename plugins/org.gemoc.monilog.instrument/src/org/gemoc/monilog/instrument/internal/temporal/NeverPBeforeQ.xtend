package org.gemoc.monilog.instrument.internal.temporal

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.Absence
import org.gemoc.monilog.moniLog4DSL.Before
import org.gemoc.monilog.moniLog4DSL.ComplexEvent

class NeverPBeforeQ extends AbstractTemporalProperty {
	
	val String p
	val String q
	
	new(ComplexEvent event, Absence never, Before before) {
		super(event)
		p = never.event.event.name
		q = before.upperBound.event.name
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P as P
					pattern (P | Q | EoE)
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