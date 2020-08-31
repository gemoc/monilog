package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.Between
import org.gemoc.monilog.moniLog4DSL.Precedence

class SPrecedesPBetweenQAndR extends AbstractTemporalProperty {
	
	val String p
	val String q
	val String r
	val String s
	
	new(String name, Precedence precedence, Between between) {
		super(name)
		p = precedence.successor.eventId
		q = between.lowerBound.eventId
		r = between.upperBound.eventId
		s = precedence.predecessor.eventId
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P as P, R as R, EoE as EoE
					pattern (EoE | Q nPRS* (S nR* | P nR*)? (R | EoE))
					define
						P as P.«p»? is not null,
						Q as Q.«q»? is not null,
						R as R.«r»? is not null,
						S as S.«s»? is not null,
						nR as nR.«r»? is null,
						nPRS as nPRS.«p»? is null and nPRS.«s»? is null and nPRS.«r»? is null,
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
		val lEoE = events.get("EoE")
		val reachedEoE = !(lEoE === null || lEoE.empty)
		if (reachedP) {
			if (reachedR) {
				return TruthValue.VIOLATED
			} else {
				return TruthValue.SATISFIED
			}
		} else {
			if (reachedEoE) {
				return TruthValue.SATISFIED
			} else {
				return TruthValue.UNKNOWN
			}
		}
	}
}