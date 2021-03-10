package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog.Absence
import org.gemoc.monilog.moniLog.ComplexEvent

class NeverPGlobally extends AbstractTemporalProperty {
	
	val String p
	
	new(ComplexEvent event, Absence never) {
		super(event)
		p = never.event.event.name
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P as P
					pattern (P | EoE)
					define
						P as P.«p»? is not null,
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