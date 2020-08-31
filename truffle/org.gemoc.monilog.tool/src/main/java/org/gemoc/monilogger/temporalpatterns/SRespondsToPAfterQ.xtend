package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.After
import org.gemoc.monilog.moniLog4DSL.Response

class SRespondsToPAfterQ extends AbstractTemporalProperty {
	
	val String p
	val String s
	val String q
	
	new(String name, Response response, After after) {
		super(name)
		p = response.trigger.eventId
		s = response.event.eventId
		q = after.lowerBound.eventId
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P as P, Q as Q, S as S
					pattern (EoE | Q nP* (P nS* S nP*)* (P nS*)? EoE)
					define
						P as P.«p»? is not null,
						S as S.«s»? is not null,
						Q as Q.«q»? is not null,
						nP as nP.«p»? is null,
						nS as nS.«s»? is null,
						EoE as EoE.EoE? is not null
				)
			'''
		return result
	}
	
	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		val lP = events.get("P")
		val nP = if (lP === null) 0 else lP.size
		val lQ = events.get("Q")
		val reachedQ = !(lQ === null || lQ.empty)
		val lS = events.get("S")
		val nS = if (lS === null) 0 else lS.size
		if (reachedQ) {
			if (nP == nS) {
				return TruthValue.SATISFIED
			} else {
				return TruthValue.VIOLATED
			}
		} else {
			return TruthValue.SATISFIED
		}
	}
}