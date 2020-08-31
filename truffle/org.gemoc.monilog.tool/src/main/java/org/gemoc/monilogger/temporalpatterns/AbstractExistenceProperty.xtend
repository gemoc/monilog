package org.gemoc.monilogger.temporalpatterns

import org.gemoc.monilog.moniLog4DSL.Existence
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage

abstract class AbstractExistenceProperty extends AbstractTemporalProperty {
	
	protected val Existence exists
	
	new(String name, Existence exists) {
		super(name)
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
