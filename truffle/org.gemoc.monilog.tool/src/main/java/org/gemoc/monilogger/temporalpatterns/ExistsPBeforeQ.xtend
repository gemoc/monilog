package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.Before
import org.gemoc.monilog.moniLog4DSL.Existence
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage

class ExistsPBeforeQ extends AbstractExistenceProperty {
	
	val String p
	val String q
	
	new(String name, Existence exists, Before before) {
		super(name, exists)
		p = exists.event.eventId
		q = before.upperBound.eventId
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P1 as P, Q as Q, EoE as EoE
					«pattern»
					define
						«IF exists.bound.eClass.classifierID != MoniLog4DSLPackage.LOWER_BOUND && exists.bound.n > 1»P as P.«p»? is not null,«ENDIF»
						P1 as P1.«p»? is not null,
						nP as nP.«p»? is null,
						Q as Q.«q»? is not null,
						EoE as EoE.EoE? is not null
				)
			'''
		return result
	}
	
	private def String rec(int i) {
		'''«IF i == 0»
			nP*? ((EoE | Q) | P«IF exists.bound.eClass.classifierID == MoniLog4DSLPackage.LOWER_BOUND»1«ENDIF»)
			«ELSEIF i == 1»
			nP*? ((EoE | Q) | P1«IF exists.bound.eClass.classifierID != MoniLog4DSLPackage.LOWER_BOUND» «rec(i - 1)»«ENDIF»)
			«ELSE»
			nP*? ((EoE | Q) | P«IF exists.bound.eClass.classifierID == MoniLog4DSLPackage.UPPER_BOUND»1«ENDIF» «rec(i - 1)»)
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
			val lQ = events.get("Q")
			val reachedQ = !(lQ === null || lQ.empty)
			val execEnd = events.get("EoE")
			val reachedEoE = !(execEnd === null || execEnd.empty)
			if (exists.bound.eClass.classifierID == MoniLog4DSLPackage.UPPER_BOUND) {
				return if (reachedQ || reachedEoE) TruthValue.SATISFIED else TruthValue.VIOLATED
			} else {
				return if (reachedP && (reachedQ || reachedEoE)) TruthValue.SATISFIED else TruthValue.VIOLATED
			}
		}
	}
}