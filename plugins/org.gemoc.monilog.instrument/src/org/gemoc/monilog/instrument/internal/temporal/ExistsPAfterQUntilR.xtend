package org.gemoc.monilog.instrument.internal.temporal

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog4DSL.AfterUntil
import org.gemoc.monilog.moniLog4DSL.ComplexEvent
import org.gemoc.monilog.moniLog4DSL.Existence
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage

class ExistsPAfterQUntilR extends AbstractExistenceProperty {
	
	val String p
	val String q
	val String r
	
	new(ComplexEvent event, Existence exists, AfterUntil afterUntil) {
		super(event, exists)
		p = exists.event.event.name
		q = afterUntil.lowerBound.event.name
		r = afterUntil.upperBound.event.name
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
						R as R.«r»? is not null,
						EoE as EoE.EoE? is not null
				)
			'''
		return result
	}
	
	private def String rec(int i) {
		'''«IF i == 0»
			nP*? (P«IF exists.bound.eClass.classifierID == MoniLog4DSLPackage.LOWER_BOUND»1«ENDIF» | R | EoE)
			«ELSEIF i == 1»
			nP*? (P1«IF exists.bound.eClass.classifierID != MoniLog4DSLPackage.LOWER_BOUND» «rec(i - 1)»«ENDIF» | R | EoE)
			«ELSE»
			nP*? (P«IF exists.bound.eClass.classifierID == MoniLog4DSLPackage.UPPER_BOUND»1«ENDIF» «rec(i - 1)» | R | EoE)
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
		val lQ = events.get("Q")
		val reachedQ = !(lQ === null || lQ.empty)
		if (reachedQ) {
			val lP = events.get("P")
			val reachedP = !(lP === null || lP.empty)
			val execEnd = events.get("EoE")
			val reachedEoE = !(execEnd === null || execEnd.empty)
			if (reachedP) {
				if (reachedEoE) {
					return TruthValue.SATISFIED
				} else {
					return TruthValue.UNKNOWN
				}
			} else {
				if (exists.bound.eClass.classifierID == MoniLog4DSLPackage.UPPER_BOUND) {
					val lR = events.get("R")
					val reachedR = !(lR === null || lR.empty)
					if (reachedEoE || reachedR) {
						return TruthValue.SATISFIED // For upper bound, satisfied if no P1 found at all
					} else {
						return TruthValue.VIOLATED // But violated if a P (and not R or EoE) caused the final match
					}
				} else {
					return TruthValue.VIOLATED // Otherwise, violated
				}
			}
		} else {
			return TruthValue.SATISFIED // EoE
		}
	}
}