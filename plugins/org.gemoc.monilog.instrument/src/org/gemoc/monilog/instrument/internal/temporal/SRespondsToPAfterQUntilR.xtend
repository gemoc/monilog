package org.gemoc.monilog.instrument.internal.temporal

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.AfterUntil
import org.gemoc.monilog.moniLog4DSL.ComplexEvent
import org.gemoc.monilog.moniLog4DSL.Response

class SRespondsToPAfterQUntilR extends AbstractTemporalProperty {
	
	val String p
	val String q
	val String r
	val String s
	
	new(ComplexEvent event, Response response, AfterUntil afterUntil) {
		super(event)
		p = response.trigger.event.name
		q = afterUntil.lowerBound.event.name
		r = afterUntil.upperBound.event.name
		s = response.event.event.name
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
			if (nP == nS) {
				if (reachedR) {
					return TruthValue.UNKNOWN
				} else {
					return TruthValue.SATISFIED
				}
			} else {
				return TruthValue.VIOLATED
			}
		} else {
			return TruthValue.SATISFIED
		}
	}
}