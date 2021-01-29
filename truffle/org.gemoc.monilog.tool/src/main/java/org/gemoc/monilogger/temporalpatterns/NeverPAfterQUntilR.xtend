package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.Absence
import org.gemoc.monilog.moniLog4DSL.AfterUntil
import org.gemoc.monilog.moniLog4DSL.ComplexEvent

class NeverPAfterQUntilR extends AbstractTemporalProperty {
	
	val String p
	val String q
	val String r
	
	new(ComplexEvent event, Absence never, AfterUntil afterUntil) {
		super(event)
		p = never.event.event.name
		q = afterUntil.lowerBound.event.name
		r = afterUntil.upperBound.event.name
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P as P, R as R
					pattern (EoE | Q A*? (EoE | R | P))
					define
						P as P.«p»? is not null,
						Q as Q.«q»? is not null,
						R as R.«r»? is not null,
						EoE as EoE.EoE? is not null
				)
			'''
		return result
	}
	
	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		val lP = events.get("P")
		val reachedP = !(lP === null || lP.empty)
		val lR = events.get("R")
		val reachedR = !(lR === null || lR.empty)
		if (reachedP) {
			return TruthValue.VIOLATED
		} else {
			if (reachedR) {
				return TruthValue.UNKNOWN
			} else {
				return TruthValue.SATISFIED
			}
		}
	}
}