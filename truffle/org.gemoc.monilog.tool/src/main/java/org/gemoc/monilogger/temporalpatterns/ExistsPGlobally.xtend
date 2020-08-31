package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.Existence
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage
import org.gemoc.monilog.moniLog4DSL.PropertyValue

class ExistsPGlobally extends AbstractExistenceProperty {
	
	val String p
	val List<String> distinctValueExpressions
	
	new(String name, Existence exists) {
		super(name, exists)
		p = exists.event.eventId
		distinctValueExpressions = newArrayList
		exists.event.values.forEach[v, i|
			if (v instanceof PropertyValue) {
				distinctValueExpressions.add("prop"+i)
			}
		]
	}
	
	override protected String getStatementString() {
		val result =
			'''
				«IF !distinctValueExpressions.empty»
				create context «safeName»Context
					initiated by distinct(«FOR v : distinctValueExpressions SEPARATOR ", "»«v»«ENDFOR») «p» as distinct«safeName.toFirstUpper»;
				context «safeName»Context
				«ENDIF»
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P1 as P, EoE as EoE
					«pattern»
					define
						«IF distinctValueExpressions.empty»
						«IF exists.bound.eClass.classifierID != MoniLog4DSLPackage.LOWER_BOUND && exists.bound.n > 1»
						P as P.«p»? is not null,
						«ENDIF»
						P1 as P1.«p»? is not null,
						nP as nP.«p»? is null,
						«ELSE»
«««						«IF exists.bound.eClass.classifierID != MoniLog4DSLPackage.LOWER_BOUND && exists.bound.n > 1»
						P as P.«p»? is not null and «FOR v : distinctValueExpressions SEPARATOR " and "»P.«v»? = context.distinct«safeName.toFirstUpper».«v»«ENDFOR»,
«««						«ENDIF»
						P1 as P1.«p»? is not null and «FOR v : distinctValueExpressions SEPARATOR " and "»P1.«v»? = context.distinct«safeName.toFirstUpper».«v»«ENDFOR»,
						nP as nP.«p»? is null or «FOR v : distinctValueExpressions SEPARATOR " or "»nP.«v»? <> context.distinct«safeName.toFirstUpper».«v»«ENDFOR»,
						«ENDIF»
						EoE as EoE.EoE? is not null
				)
			'''
		return result
	}
	
	private def String rec(int i) {
		'''«IF i == 0»
			nP*? (P«IF exists.bound.eClass.classifierID == MoniLog4DSLPackage.LOWER_BOUND»1«ENDIF» | EoE)
			«ELSEIF i == 1»
			nP*? (P1«IF exists.bound.eClass.classifierID != MoniLog4DSLPackage.LOWER_BOUND» «rec(i - 1)»«ENDIF» | EoE)
			«ELSE»
			nP*? (P«IF exists.bound.eClass.classifierID == MoniLog4DSLPackage.UPPER_BOUND»1«ENDIF» «rec(i - 1)» | EoE)
			«ENDIF»'''
	}
	
	private def getPattern() {
		val pattern =
			'''
				pattern («rec(exists.bound.n)»)
			'''
		return pattern
	}
	
	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		val lP = events.get("P")
		val reachedP = !(lP === null || lP.empty)
		if (exists.bound.eClass.classifierID == MoniLog4DSLPackage.LOWER_BOUND) {
			return if (reachedP) TruthValue.SATISFIED else TruthValue.VIOLATED
		} else {
			val execEnd = events.get("EoE")
			val reachedEoE = !(execEnd === null || execEnd.empty)
			if (exists.bound.eClass.classifierID == MoniLog4DSLPackage.UPPER_BOUND) {
				return if (reachedEoE) TruthValue.SATISFIED else TruthValue.VIOLATED
			} else {
				return if (reachedP && reachedEoE) TruthValue.SATISFIED else TruthValue.VIOLATED
			}
		}
	}
}