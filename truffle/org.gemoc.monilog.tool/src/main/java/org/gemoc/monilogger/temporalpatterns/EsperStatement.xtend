package org.gemoc.monilogger.temporalpatterns

import com.google.common.collect.Streams
import java.util.List
import java.util.Map
import java.util.Set
import org.gemoc.monilog.moniLog.Alternation
import org.gemoc.monilog.moniLog.BetweenNAndM
import org.gemoc.monilog.moniLog.ComplexEvent
import org.gemoc.monilog.moniLog.Concatenation
import org.gemoc.monilog.moniLog.Empty
import org.gemoc.monilog.moniLog.Grouping
import org.gemoc.monilog.moniLog.OneOrMore
import org.gemoc.monilog.moniLog.PropertyValue
import org.gemoc.monilog.moniLog.StreamEvent
import org.gemoc.monilog.moniLog.ZeroOrMore
import org.gemoc.monilog.moniLog.ZeroOrOne

class EsperStatement {

	val ComplexEvent complexEvent
	
	val Set<String> complexEventParameters = newHashSet

	val Set<String> childEvents = newHashSet
	
	val Map<String, Set<StreamEvent>> propertyToStreamEvents = newHashMap

	val List<String> defines = newArrayList

	new(ComplexEvent complexEvent) {
		this.complexEvent = complexEvent
	}

	def String compilePattern() {
		complexEventParameters.addAll(complexEvent.parameterDecl.parameters.map[it.name])
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
	 * 		*from* (<StreamEventRef>[<PropertyRef>=<PropertySymbol>] | <StreamEventRef>[<PropertyRef>=<PropertySymbol>]) <StreamEventRef>
	 * 		*where* <StreamEventRef>.<PropertyRef>=<StreamEventRef>.<PropertyRef>
	 * 	}
	 */
	def dispatch String compilePattern(StreamEvent streamEvent) {
		val streamEventString = '''«streamEvent.event.name»_«streamEvent.values.map[v|v.compileValue].reduce[v1, v2|'''«v1»_«v2»''']»'''
		childEvents.add(streamEventString)
		return streamEventString
	}

	def dispatch String compileValue(Empty empty) {
		return ""
	}

	def dispatch String compileValue(PropertyValue propertyValue) {
		val a = propertyValue.eContainer as StreamEvent
		val set = propertyToStreamEvents.computeIfAbsent(propertyValue.id, [p|newHashSet])
		if (set.forall[b|
//			b.e
		]) {
			set.add(a)
		}
		return propertyValue.id
	}

	def dispatch String compilePattern(Grouping grouping) {
		return '''(«grouping.pattern.compilePattern»)'''
	}

	def dispatch String compilePattern(ZeroOrMore zeroOrMore) {
		return '''«zeroOrMore.pattern.compilePattern»?«IF zeroOrMore.reluctant»?«ENDIF» «zeroOrMore.pattern.compilePattern»*«IF zeroOrMore.reluctant»?«ENDIF»'''
	}

	def dispatch String compilePattern(OneOrMore oneOrMore) {
		return '''«oneOrMore.pattern.compilePattern»«IF oneOrMore.reluctant»?«ENDIF» «oneOrMore.pattern.compilePattern»*«IF oneOrMore.reluctant»?«ENDIF»'''
	}

	def dispatch String compilePattern(ZeroOrOne zeroOrOne) {
		return '''«zeroOrOne.pattern.compilePattern»?«IF zeroOrOne.reluctant»?«ENDIF»'''
	}

	def dispatch String compilePattern(BetweenNAndM betweenNAndM) {
		return '''«betweenNAndM.pattern.compilePattern»{«betweenNAndM.min»,«betweenNAndM.max»}'''
	}

	def dispatch String compilePattern(Concatenation concatenation) {
		return '''«concatenation.left.compilePattern» «concatenation.right.compilePattern»'''
	}

	def dispatch String compilePattern(Alternation alternation) {
		return '''«alternation.left.compilePattern» | «alternation.right.compilePattern»'''
	}

	def String getSilentStatement() {

		'''
			insert into «complexEvent.name»Stream
			select * from «complexEvent.name»VariantStream
			match_recognize (
			«««				If all events share a property,
«««				and have an identical constraint on it,
«««				add a "partition by <propertyName>"
				partition by uui<
				measures A as A, B as B, C as C
				pattern («compilePattern»)
				define
					A as typeof(A) = 'EventA',
					B as typeof(B) = 'EventB'
						and B.argB0? = A.argA0?
						and B.argB1? = A.argA1?,
					C as typeof(C) = 'EventC'
						and B.allOf(v=> v.argB2? = C.argC0?)
						and B.allOf(v=> v.argB3? = C.argC1?)
			);
		'''
	}

	def String getObservedStatement() {
		'''select * from «complexEvent.name»Stream'''
	}

}
