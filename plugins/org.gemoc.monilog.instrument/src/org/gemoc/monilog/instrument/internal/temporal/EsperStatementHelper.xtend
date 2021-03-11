package org.gemoc.monilog.instrument.internal.temporal

import java.util.List
import java.util.Map

class EsperStatementHelper {
	
	static def getConstrainedStatementHeader(Map<String, List<String>> eventToConstraints, String propertyName) {
		'''
			«IF !eventToConstraints.empty»
				create context «propertyName»Context partition by
					«FOR entry : eventToConstraints.entrySet SEPARATOR ','»
					«FOR c : entry.value SEPARATOR " and "»c«ENDFOR» from «entry.key»
					«ENDFOR»
«««					initiated by distinct(«FOR v : constraintProperties SEPARATOR ", "»«v»«ENDFOR») «pName» as distinct«name.toFirstUpper»;
					
				context «propertyName»Context
			«ENDIF»
		'''
	}
	
	static def getEventConstraints(List<String> constraintProperties, String eventName, String propertyName) {
		'''«IF !constraintProperties.empty» and «FOR v : constraintProperties SEPARATOR " and "»«eventName».«v»? = context.distinct«propertyName.toFirstUpper».«v»«ENDFOR»«ENDIF»'''
	}
	
	static def getEventNegConstraints(List<String> constraintProperties, String eventName, String propertyName) {
		'''«IF !constraintProperties.empty» or «FOR v : constraintProperties SEPARATOR " or "»«eventName».«v»? <> context.distinct«propertyName.toFirstUpper».«v»«ENDFOR»«ENDIF»'''
	}
	
}