package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.Between
import org.gemoc.monilog.moniLog4DSL.Response

class SRespondsToPBetweenQAndR extends AbstractTemporalProperty {
	
	val String p
	val String q
	val String r
	val String s
	
	new(String name, Response response, Between between) {
		super(name)
		p = response.trigger.eventId
		q = between.lowerBound.eventId
		r = between.upperBound.eventId
		s = response.event.eventId
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P as P, Q as Q, R as R, S as S
					pattern (EoE | Q nPR* (P nRS* S nPR*)* (P nRS*)? (R | EoE))
					define
						P as P.«p»? is not null,
						Q as Q.«q»? is not null,
						R as R.«r»? is not null,
						S as S.«s»? is not null,
						nPR as nPR.«p»? is null and nPR.«r»? is null,
						nRS as nRS.«r»? is null and nRS.«s»? is null,
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
		val lR = events.get("R")
		val reachedR = !(lR === null || lR.empty)
		val lS = events.get("S")
		val nS = if (lS === null) 0 else lS.size
		if (reachedQ) {
			if (reachedR) {
				if (nP == nS) {
					return TruthValue.UNKNOWN
				} else {
					return TruthValue.VIOLATED
				}
			} else {
				return TruthValue.SATISFIED
			}
		} else {
			return TruthValue.SATISFIED
		}
	}
}