package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog.After
import org.gemoc.monilog.moniLog.ComplexEvent
import org.gemoc.monilog.moniLog.Universality

class AlwaysPAfterQ extends AbstractTemporalProperty {
	
	val String p
	val String q
	
	new(ComplexEvent event, Universality prop, After after) {
		super(event)
		p = prop.event.event.name
		q = after.lowerBound.event.name
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures nP as nP
					pattern (EoE | (Q P* (nP | EoE)))
					define
						P as P.«p»? is not null,
						nP as nP.«q»? is null,
						Q as Q.«q»? is not null,
						EoE as EoE.EoE? is not null
				)
			'''
		return result
	}
	
	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		val lnP = events.get("nP")
		return if (lnP === null || lnP.empty) TruthValue.SATISFIED else TruthValue.VIOLATED
	}
}