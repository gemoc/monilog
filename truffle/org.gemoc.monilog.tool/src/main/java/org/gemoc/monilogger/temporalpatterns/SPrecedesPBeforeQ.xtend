package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.Before
import org.gemoc.monilog.moniLog4DSL.Precedence

class SPrecedesPBeforeQ extends AbstractTemporalProperty {
	
	val String p
	val String q
	val String s
	
	new(String name, Precedence precedence, Before before) {
		super(name)
		p = precedence.successor.eventId
		q = before.upperBound.eventId
		s = precedence.predecessor.eventId
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P as P
					pattern (EoE | Q | S | P)
					define
						P as P.«p»? is not null,
						Q as Q.«q»? is not null,
						S as S.«s»? is not null,
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