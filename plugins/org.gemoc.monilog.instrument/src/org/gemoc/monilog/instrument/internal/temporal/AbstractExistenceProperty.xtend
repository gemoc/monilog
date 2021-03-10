package org.gemoc.monilog.instrument.internal.temporal

import java.util.List
import org.gemoc.monilog.moniLog4DSL.ComplexEvent
import org.gemoc.monilog.moniLog4DSL.Existence
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage

abstract class AbstractExistenceProperty extends AbstractComplexEventProperty {
	
	protected val Existence exists
	
	new(ComplexEvent event, Existence exists) {
		this(event, 0, #[ TruthValue::SATISFIED ], exists)
	}
	
	new(ComplexEvent event, int windowLength, Existence exists) {
		this(event, windowLength, #[ TruthValue::SATISFIED ], exists)
	}
	
	new(ComplexEvent event, int windowLength, List<TruthValue> notifyOn, Existence exists) {
		super(event, windowLength, notifyOn)
		this.exists = exists
	}
	
	protected def getRange() {
		switch (exists.bound.eClass.classifierID) {
			case MoniLog4DSLPackage.EXACT_BOUND: {
				'''{«exists.bound.n»}'''
			}
			case MoniLog4DSLPackage.LOWER_BOUND: {
				'''{«exists.bound.n», }'''
			}
			case MoniLog4DSLPackage.UPPER_BOUND: {
				'''{ , «exists.bound.n»}'''
			}
		}
	}
	
	protected def getComplementaryRange() {
		switch (exists.bound.eClass.classifierID) {
			case MoniLog4DSLPackage.EXACT_BOUND: {
				'''{ , «exists.bound.n - 1»}'''
			}
			case MoniLog4DSLPackage.LOWER_BOUND: {
				'''{ , «exists.bound.n - 1»}'''
			}
			case MoniLog4DSLPackage.UPPER_BOUND: {
				'''{«exists.bound.n + 1», }'''
			}
			default: {
				""
			}
		}
	}
}
