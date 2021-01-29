package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.ComplexEvent
import org.gemoc.monilog.moniLog4DSL.Universality

class AlwaysPGlobally extends AbstractTemporalProperty {
	
	val String p
	
	new(ComplexEvent event, Universality always) {
		super(event)
		p = always.event.event.name
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures nP as nP, EoE as EoE
					pattern (P* (EoE | nP))
					define
						P as P.«p»? is not null,
						nP as nP.«p»? is null,
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