package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.After
import org.gemoc.monilog.moniLog4DSL.BoundType
import org.gemoc.monilog.moniLog4DSL.Existence
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage

class ExistsPAfterQ extends AbstractExistenceProperty {
	
	val String p
	val String q
	
	new(String name, Existence exists, After after) {
		super(name, exists)
		p = exists.event.eventId
		q = after.lowerBound.eventId
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P1 as P, Q as Q, EoE as EoE
					«pattern»
					define
						«IF exists.bound.eClass.classifierID != MoniLog4DSLPackage.LOWER_BOUND && exists.bound.n > 1»
						P as P.«p»? is not null and ,
						«ENDIF»
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
				pattern (Q «rec(exists.bound.n)» | EoE)
			'''
		return pattern
	}
	
	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		val lP = events.get("P")
		val lQ = events.get("Q")
		val reachedP = !(lP === null || lP.empty)
		val reachedQ = !(lQ === null || lQ.empty)
		if (!reachedQ) {
			return TruthValue.SATISFIED
		} else if (exists.bound.eClass.classifierID == MoniLog4DSLPackage.LOWER_BOUND) {
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