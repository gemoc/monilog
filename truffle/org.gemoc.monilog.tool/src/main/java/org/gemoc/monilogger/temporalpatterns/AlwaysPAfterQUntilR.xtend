package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.AfterUntil
import org.gemoc.monilog.moniLog4DSL.Universality

class AlwaysPAfterQUntilR extends AbstractTemporalProperty {
	
	val String p
	val String q
	val String r
	
	new(String name, Universality always, AfterUntil afterUntil) {
		super(name)
		p = always.event.eventId
		q = afterUntil.lowerBound.eventId
		r = afterUntil.upperBound.eventId
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures nP as nP, EoE as EoE
					pattern (EoE | (Q P*? nP*? P*? (EoE | R)))
					define
						P as P.«p»? is not null,
						nP as nP.«p»? is null,
						Q as Q.«q»? is not null,
						R as R.«r»? is not null,
						EoE as EoE.EoE? is not null
				)
			'''
		return result
	}
	
	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		val execEnd = events.get("EoE")
		val lnP = events.get("nP")
		if ((execEnd === null || execEnd.empty)) {
			return if (lnP === null || lnP.empty) TruthValue.UNKNOWN else TruthValue.VIOLATED
		} else {
			return if (lnP === null || lnP.empty) TruthValue.SATISFIED else TruthValue.VIOLATED
		}
	}
}