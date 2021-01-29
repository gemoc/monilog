package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.Before
import org.gemoc.monilog.moniLog4DSL.ComplexEvent
import org.gemoc.monilog.moniLog4DSL.Response

class SRespondsToPBeforeQ extends AbstractTemporalProperty {
	
	val String p
	val String q
	val String s
	
	new(ComplexEvent event, Response response, Before before) {
		super(event)
		p = response.trigger.event.name
		q = before.upperBound.event.name
		s = response.event.event.name
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P as P, S as S
					pattern ((EoE | Q) | P nS*? ((EoE | Q) | S))
					define
						P as P.«p»? is not null,
						S as S.«s»? is not null,
						Q as Q.«q»? is not null,
						nS as nS.«s»? is null,
						EoE as EoE.EoE? is not null
				)
			'''
		return result
	}
	
	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		val lP = events.get("P")
		val reachedP = !(lP === null || lP.empty)
		val lS = events.get("S")
		val reachedS = !(lS === null || lS.empty)
		if (reachedP) {
			if (reachedS) {
				return TruthValue.UNKNOWN
			} else {
				return TruthValue.VIOLATED
			}
		} else {
			if (reachedS) {
				return TruthValue.VIOLATED
			} else {
				return TruthValue.SATISFIED
			}
		}
	}
}