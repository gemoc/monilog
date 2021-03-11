package org.gemoc.monilog.instrument.internal.temporal;

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.PropertyValue
import org.gemoc.monilog.moniLog4DSL.StreamEvent

class UserEventProperty extends AbstractTemporalProperty {

	val StreamEvent streamEvent
	val List<String> distinctValueExpressions

	protected new(StreamEvent event) {
		super(event.event)
		streamEvent = event
		distinctValueExpressions = newArrayList
		streamEvent.values.forEach [ v, i |
			if (v instanceof PropertyValue) {
				distinctValueExpressions.add("prop" + i)
			}
		]
	}

	override protected String getStatementString() {
		'''
			«IF !distinctValueExpressions.empty»
				create context «name»Context
					initiated by distinct(«FOR v : distinctValueExpressions SEPARATOR ", "»«v»«ENDFOR») «name» as distinct«name.toFirstUpper»;
				context «name»Context
			«ENDIF»
			select * from «name»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
		'''
	}

	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		return TruthValue.SATISFIED
	}
}
