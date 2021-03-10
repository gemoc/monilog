package org.gemoc.monilogger.temporalpatterns

import java.util.List
import org.gemoc.monilog.moniLog.ComplexEvent
import org.gemoc.monilog.moniLog.Existence
import org.gemoc.monilog.moniLog.MoniLogPackage

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
			case MoniLogPackage.EXACT_BOUND: {
				'''{«exists.bound.n»}'''
			}
			case MoniLogPackage.LOWER_BOUND: {
				'''{«exists.bound.n», }'''
			}
			case MoniLogPackage.UPPER_BOUND: {
				'''{ , «exists.bound.n»}'''
			}
		}
	}
	
	protected def getComplementaryRange() {
		switch (exists.bound.eClass.classifierID) {
			case MoniLogPackage.EXACT_BOUND: {
				'''{ , «exists.bound.n - 1»}'''
			}
			case MoniLogPackage.LOWER_BOUND: {
				'''{ , «exists.bound.n - 1»}'''
			}
			case MoniLogPackage.UPPER_BOUND: {
				'''{«exists.bound.n + 1», }'''
			}
			default: {
				""
			}
		}
	}
}
