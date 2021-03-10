package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog.ComplexEvent
import org.gemoc.monilog.moniLog.Existence
import org.gemoc.monilog.moniLog.MoniLogPackage
import org.gemoc.monilog.moniLog.StreamEvent

class ExistsPGlobally extends AbstractExistenceProperty {

	val StreamEvent p
	val String pName

	new(ComplexEvent event, Existence exists) {
		this(event, 0, #[TruthValue::SATISFIED], exists)
	}

	new(ComplexEvent event, int windowLength, Existence exists) {
		this(event, windowLength, #[TruthValue::SATISFIED], exists)
	}

	new(ComplexEvent event, int windowLength, List<TruthValue> notifyOn, Existence exists) {
		super(event, windowLength, notifyOn, exists)
		p = exists.event
		p.values
		pName = p.event.name
	}

	override protected String getStatementString() {
		val result = '''
			«IF !constraintProperties.empty»
				create context «name»Context
					initiated by distinct(«FOR v : constraintProperties SEPARATOR ", "»«v»«ENDFOR») «pName» as distinct«name.toFirstUpper»;
				context «name»Context
			«ENDIF»
			select * from «name»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
			match_recognize (
				measures P1 as P, EoE as EoE
				«pattern»
				define
					«IF constraintProperties.empty»
						«IF exists.bound.eClass.classifierID != MoniLogPackage.LOWER_BOUND && exists.bound.n > 1»
							P as P.«pName»? is not null,
						«ENDIF»
						P1 as P1.«pName»? is not null,
						nP as nP.«pName»? is null,
					«ELSE»
						«IF exists.bound.eClass.classifierID != MoniLogPackage.LOWER_BOUND && exists.bound.n > 1»
							P as P.«pName»? is not null and «FOR v : constraintProperties SEPARATOR " and "»P.«v»? = context.distinct«name.toFirstUpper».«v»«ENDFOR»,
						«ENDIF»
						P1 as P1.«pName»? is not null and «FOR v : constraintProperties SEPARATOR " and "»P1.«v»? = context.distinct«name.toFirstUpper».«v»«ENDFOR»,
						nP as nP.«pName»? is null or «FOR v : constraintProperties SEPARATOR " or "»nP.«v»? <> context.distinct«name.toFirstUpper».«v»«ENDFOR»,
					«ENDIF»
					EoE as EoE.EoE? is not null
			)
		'''
		return result
	}

	private def String rec(int i) {
		'''«IF i == 0»
			nP*? (P«IF exists.bound.eClass.classifierID == MoniLogPackage.LOWER_BOUND»1«ENDIF» | EoE)
			«ELSEIF i == 1»
			nP*? (P1«IF exists.bound.eClass.classifierID != MoniLogPackage.LOWER_BOUND» «rec(i - 1)»«ENDIF» | EoE)
			«ELSE»
			nP*? (P«IF exists.bound.eClass.classifierID == MoniLogPackage.UPPER_BOUND»1«ENDIF» «rec(i - 1)» | EoE)
			«ENDIF»'''
	}

	private def getPattern() {
		val pattern = '''
			pattern («rec(exists.bound.n)»)
		'''
		return pattern
	}

	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		val lP = events.get("P")
		val reachedP = !(lP === null || lP.empty)
		if (exists.bound.eClass.classifierID == MoniLogPackage.LOWER_BOUND) {
			return if(reachedP) TruthValue.SATISFIED else TruthValue.VIOLATED
		} else {
			val execEnd = events.get("EoE")
			val reachedEoE = !(execEnd === null || execEnd.empty)
			if (exists.bound.eClass.classifierID == MoniLogPackage.UPPER_BOUND) {
				return if(reachedEoE) TruthValue.SATISFIED else TruthValue.VIOLATED
			} else {
				return if(reachedP && reachedEoE) TruthValue.SATISFIED else TruthValue.VIOLATED
			}
		}
	}
}
