package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.AfterUntil
import org.gemoc.monilog.moniLog4DSL.ComplexEvent
import org.gemoc.monilog.moniLog4DSL.Precedence

class SPrecedesPAfterQUntilR extends AbstractTemporalProperty {
	
	val String p
	val String q
	val String r
	val String s
	
	new(ComplexEvent event, Precedence precedence, AfterUntil afterUntil) {
		super(event)
		p = precedence.successor.event.name
		q = afterUntil.lowerBound.event.name
		r = afterUntil.upperBound.event.name
		s = precedence.predecessor.event.name
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P as P, EoE as EoE
					pattern (EoE | Q A*? (EoE | R | S | P))
					define
						P as P.«p»? is not null,
						Q as Q.«q»? is not null,
						R as R.«r»? is not null,
						S as S.«s»? is not null,
						EoE as EoE.EoE? is not null
				)
			'''
		return result
	}
	
	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		val lP = events.get("P")
		val reachedP = !(lP === null || lP.empty)
		val lEoE = events.get("EoE")
		val reachedEoE = !(lEoE === null || lEoE.empty)
		if (reachedP) {
			return TruthValue.VIOLATED
		} else {
			if (reachedEoE) {
				return TruthValue.SATISFIED
			} else {
				return TruthValue.UNKNOWN
			}
		}
	}
}