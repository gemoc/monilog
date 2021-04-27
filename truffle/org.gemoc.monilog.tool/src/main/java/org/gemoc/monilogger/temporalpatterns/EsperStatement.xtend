package org.gemoc.monilogger.temporalpatterns

import com.google.common.collect.Streams
import java.util.List
import java.util.Map
import java.util.Set
import org.gemoc.monilog.moniLog.ASTEvent
import org.gemoc.monilog.moniLog.Alternation
import org.gemoc.monilog.moniLog.BetweenNAndM
import org.gemoc.monilog.moniLog.ComplexEvent
import org.gemoc.monilog.moniLog.Concatenation
import org.gemoc.monilog.moniLog.Empty
import org.gemoc.monilog.moniLog.Event
import org.gemoc.monilog.moniLog.Grouping
import org.gemoc.monilog.moniLog.MoniLogPackage
import org.gemoc.monilog.moniLog.OneOrMore
import org.gemoc.monilog.moniLog.PropertyConstraint
import org.gemoc.monilog.moniLog.PropertyDefinition
import org.gemoc.monilog.moniLog.PropertyReference
import org.gemoc.monilog.moniLog.PropertyValue
import org.gemoc.monilog.moniLog.StreamEvent
import org.gemoc.monilog.moniLog.UserEvent
import org.gemoc.monilog.moniLog.ZeroOrMore
import org.gemoc.monilog.moniLog.ZeroOrOne

class EsperStatement {

	val ComplexEvent complexEvent
	
	val Set<String> complexEventParameters = newHashSet

	val Set<StreamEvent> childEvents = newHashSet
	
	val Map<String, List<StreamEvent>> baseEventNameToStreamEvents = newHashMap
	
	val Map<String, Set<StreamEvent>> propertyToStreamEvents = newHashMap
	
	val Map<StreamEvent, int[]> streamEventToPropertyConstraints = newHashMap
	
	val Map<StreamEvent, String> streamEventToUniqueEventName = newHashMap
	
	val Map<String, Boolean> isStreamEventMultiple = newHashMap
	val Map<String, Boolean> isStreamEventNullable = newHashMap
	
	val List<String> defines = newArrayList

	new(ComplexEvent complexEvent) {
		this.complexEvent = complexEvent
	}

	def String compilePattern() {
		complexEventParameters.addAll(complexEvent.properties.map[it.property.name])
		Streams.stream(complexEvent.pattern.eAllContents).filter[e|e instanceof StreamEvent].map[e|e as StreamEvent]
		return ""
	}

	/*
	 * TODO
	 * 
	 * For each property, store container StreamEvent. For all StreamEvents of a property, common container must not be alternation
	 * 
	 * 	B(c) {
	 * 		
	 * 	}
	 * 
	 * Treatments relating event properties to one another are supported through simple (boolean) expressions and translated into equivalent Esper expressions.
	 * 
	 * 	A(<Parameter>, <Parameter>) {
	 * 		*select* <StreamEventRef>.<PropertyRef> *as* <ParameterRef>, <StreamEventRef>.<PropertyRef> *as* <ParameterRef>
	 * 			=> this identifies which stream events to measure
	 * 		*from* (<StreamEventRef>[<PropertyRef>=<PropertySymbol>] | <StreamEventRef>[<PropertyRef>=<PropertySymbol>]) <StreamEventRef>
	 * 			=> this defines how the pattern will be compiled
	 * 		*where* <StreamEventRef>.<PropertyRef>=<StreamEventRef>.<PropertyRef>
	 * 			=> this defines the constraints between the events and their properties
	 * 		=> at any point, standard expressions can be used, and are translated into inlined_class in the generated esper statement.
	 * 	}
	 */
	def dispatch String compilePattern(StreamEvent streamEvent, boolean nullable, boolean multiple) {
		val streamEventName = '''«streamEvent.event.name»_«streamEvent.propertyConstraints.map[v|v.compileValue].reduce[v1, v2|'''«v1»_«v2»''']»'''
		childEvents.add(streamEvent)
		streamEventToUniqueEventName.put(streamEvent, streamEventName)
		isStreamEventNullable.put(streamEventName, nullable)
		isStreamEventMultiple.put(streamEventName, multiple)
		return streamEventName
	}

	def dispatch String compileValue(Empty empty) {
		return ""
	}

	def dispatch String compileValue(PropertyDefinition propertyDefinition) {
		return propertyDefinition.property.name
	}

	def dispatch String compileValue(PropertyValue propertyValue) {
		val streamEvent = propertyValue.eContainer as StreamEvent
		val idx = streamEvent.propertyConstraints.indexOf(propertyValue)
		val array = streamEventToPropertyConstraints.computeIfAbsent(streamEvent, [e|newIntArrayOfSize(e.event.parameterCount)])
		val constraintId = array.get(idx) + 1
		array.set(idx, constraintId)
		return '''val«idx»$«constraintId»'''
	}

	def dispatch String compilePattern(Grouping grouping, boolean nullable, boolean multiple) {
		return '''(«grouping.pattern.compilePattern(nullable, multiple)»)'''
	}

	def dispatch String compilePattern(ZeroOrOne zeroOrOne, boolean nullable, boolean multiple) {
		return '''«zeroOrOne.pattern.compilePattern(true, multiple)»?«IF zeroOrOne.reluctant»?«ENDIF»'''
	}

	def dispatch String compilePattern(ZeroOrMore zeroOrMore, boolean nullable, boolean multiple) {
		val compiledPattern = zeroOrMore.pattern.compilePattern(true, true)
		return '''«compiledPattern»?«IF zeroOrMore.reluctant»?«ENDIF» «compiledPattern»*«IF zeroOrMore.reluctant»?«ENDIF»'''
	}

	def dispatch String compilePattern(OneOrMore oneOrMore, boolean nullable, boolean multiple) {
		val compiledPattern = oneOrMore.pattern.compilePattern(nullable, true)
		return '''«compiledPattern»«IF oneOrMore.reluctant»?«ENDIF» «compiledPattern»*«IF oneOrMore.reluctant»?«ENDIF»'''
	}

	def dispatch String compilePattern(BetweenNAndM betweenNAndM, boolean nullable, boolean multiple) {
		val isNullable = nullable || betweenNAndM.min == 0
		val isMultiple = multiple || betweenNAndM.max > 1
		val compiledPattern = betweenNAndM.pattern.compilePattern(isNullable, isMultiple)
		return '''«compiledPattern»{«betweenNAndM.min»,«betweenNAndM.max»}'''
	}

	def dispatch String compilePattern(Concatenation concatenation, boolean nullable, boolean multiple) {
		return '''«concatenation.left.compilePattern(nullable, multiple)» «concatenation.right.compilePattern(nullable, multiple)»'''
	}

	def dispatch String compilePattern(Alternation alternation, boolean nullable, boolean multiple) {
		return '''«alternation.left.compilePattern(nullable, multiple)» | «alternation.right.compilePattern(nullable, multiple)»'''
	}

	private dispatch def String getEsperEventName(StreamEvent evt) {
		return streamEventToUniqueEventName.get(evt)
	}

	/*
	 * Given a reference to a property, retrieve the name of the (Esper) event this property is defined in
	 */
	private dispatch def String getEsperEventName(PropertyReference ref) {
		return (ref.property.eContainer.eContainer as StreamEvent).esperEventName
	}

	/*
	 * Given a reference to a constraint, retrieve the name of the (Esper) event this property is defined in
	 */
	private dispatch def String getEsperEventName(PropertyConstraint constraint) {
		return (constraint.eContainer as StreamEvent).esperEventName
	}

	private def String getParameterName(Event event, int idx) {
		switch (event.eClass.classifierID) {
			case MoniLogPackage.USER_EVENT: {
				// Retrieve the name of the parameter at this index in the event declaration
				return (event as UserEvent).parameterDecl.parameters.get(idx).name
			}
			case MoniLogPackage.AST_EVENT: {
				// Retrieve the name of the parameter at this index in the event declaration
				return (event as ASTEvent).parameterDecl.parameters.get(idx).name
			}
			case MoniLogPackage.COMPLEX_EVENT: {
				// Retrieve the name of the parameter at this index in the event declaration
				return (event as ComplexEvent).properties.get(idx).property.name
			}
		}
	}
	
	private dispatch def int getParameterCount(UserEvent event) {
		return (event as UserEvent).parameterDecl.parameters.size
	}
	
	private dispatch def int getParameterCount(ASTEvent event) {
		return (event as ASTEvent).parameterDecl.parameters.size
	}
	
	private dispatch def int getParameterCount(ComplexEvent event) {
		return (event as ComplexEvent).properties.size
	}

	private def String getParameterName(PropertyConstraint constraint) {
		val streamEvent = constraint.eContainer as StreamEvent
		// Compute the index of the referred property in the constraints of the StreamEvent that declares it
		val idx = streamEvent.propertyConstraints.indexOf(constraint)
		val event = streamEvent.event
		return event.getParameterName(idx)
	}

	/*
	 * Given a reference to a property, retrieve the name of the parameter this property acts as a constraint for.
	 */
	private def String getParameterName(PropertyReference ref) {
		val constraint = ref.property.eContainer as PropertyConstraint
		return constraint.parameterName
	}
	
	/*
	 * Given a property constraint and the reference to its property, computes the corresponding Esper predicate.
	 */
	private def String getEsperPredicate(PropertyConstraint propertyConstraint, PropertyReference propertyReference) {
		val constrainedEventName = propertyConstraint.esperEventName
		val constrainedEventParameterName = propertyConstraint.parameterName
		if (propertyReference === null) {
			if (isStreamEventMultiple.get(constrainedEventName)) {
				return '''and («constrainedEventName».«constrainedEventParameterName»? = prev(«constrainedEventName».«constrainedEventParameterName»?))'''
			} else {
				return ""
			}
		} else {
			val constraintEventName = propertyReference.esperEventName
			val constraintEventParameterName = propertyReference.parameterName
			val nullPredicate = if (isStreamEventNullable.get(constraintEventName)) {
				'''«constraintEventName» is null or '''
			}
			val nonNullPredicate = if (isStreamEventMultiple.get(constraintEventName)) {
				'''«constraintEventName».allOf(v => v.«constraintEventParameterName»? = «constrainedEventName».«constrainedEventParameterName»?))'''
			} else {
				'''«constrainedEventName».«constrainedEventParameterName»? = «constraintEventName».«constraintEventParameterName»?'''
			}
			return '''and («nullPredicate»«nonNullPredicate»)'''
		}
	}
	
	private dispatch def String getEsperPredicate(PropertyDefinition propertyDefinition) {
		return propertyDefinition.getEsperPredicate(propertyDefinition.value)
	}
	
	private dispatch def String getEsperPredicate(PropertyValue propertyValue) {
		return propertyValue.getEsperPredicate(propertyValue.value)
	}

	def String getSilentStatement() {
		'''
			insert into «complexEvent.name»Stream
			select * from «complexEvent.name»VariantStream
			match_recognize (
				measures «FOR p : complexEvent.properties SEPARATOR ', '»«p.esperEventName».«p.parameterName»? as «p.property.name»«ENDFOR»
				pattern («compilePattern»)
				define
					«FOR e : childEvents SEPARATOR ','»
					«e.esperEventName» as typeof(«e.esperEventName») = '«e.event.name»'
						«FOR c : e.propertyConstraints.filter[constraint|!(constraint instanceof Empty)]»
						«c.esperPredicate»
						«ENDFOR»
					«ENDFOR»
			);
		'''
	}

	def String getObservedStatement() {
		'''select * from «complexEvent.name»Stream'''
	}

}
