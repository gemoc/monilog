/*
 * generated by Xtext 2.22.0
 */
package org.gemoc.monilog.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.gemoc.monilog.ide.contentassist.antlr.internal.InternalMoniLog4DSLParser;
import org.gemoc.monilog.services.MoniLog4DSLGrammarAccess;

public class MoniLog4DSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MoniLog4DSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MoniLog4DSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getDefaultLanguageIDAlternatives_0_1_0(), "rule__Model__DefaultLanguageIDAlternatives_0_1_0");
			builder.put(grammarAccess.getEventAccess().getAlternatives(), "rule__Event__Alternatives");
			builder.put(grammarAccess.getBeforeEventAccess().getRuleIDAlternatives_1_0(), "rule__BeforeEvent__RuleIDAlternatives_1_0");
			builder.put(grammarAccess.getAfterEventAccess().getRuleIDAlternatives_1_0(), "rule__AfterEvent__RuleIDAlternatives_1_0");
			builder.put(grammarAccess.getBeforeAfterEventAccess().getRuleIDAlternatives_0_0(), "rule__BeforeAfterEvent__RuleIDAlternatives_0_0");
			builder.put(grammarAccess.getConditionAccess().getAlternatives(), "rule__Condition__Alternatives");
			builder.put(grammarAccess.getPatternAccess().getAlternatives(), "rule__Pattern__Alternatives");
			builder.put(grammarAccess.getBoundTypeAccess().getAlternatives(), "rule__BoundType__Alternatives");
			builder.put(grammarAccess.getScopeAccess().getAlternatives(), "rule__Scope__Alternatives");
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getAppenderAccess().getAlternatives(), "rule__Appender__Alternatives");
			builder.put(grammarAccess.getStreamAppenderAccess().getEventAlternatives_2_0(), "rule__StreamAppender__EventAlternatives_2_0");
			builder.put(grammarAccess.getLayoutAccess().getAlternatives(), "rule__Layout__Alternatives");
			builder.put(grammarAccess.getStreamEventAccess().getEventIdAlternatives_0_0(), "rule__StreamEvent__EventIdAlternatives_0_0");
			builder.put(grammarAccess.getEmptyOrPropertyValueAccess().getAlternatives(), "rule__EmptyOrPropertyValue__Alternatives");
			builder.put(grammarAccess.getLanguageExpressionAccess().getAlternatives(), "rule__LanguageExpression__Alternatives");
			builder.put(grammarAccess.getLanguageExpressionAccess().getLanguageIdAlternatives_0_1_0(), "rule__LanguageExpression__LanguageIdAlternatives_0_1_0");
			builder.put(grammarAccess.getLogLevelAccess().getAlternatives(), "rule__LogLevel__Alternatives");
			builder.put(grammarAccess.getTemporalPropertyConditionKindAccess().getAlternatives(), "rule__TemporalPropertyConditionKind__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getModelAccess().getGroup_0(), "rule__Model__Group_0__0");
			builder.put(grammarAccess.getMoniLogSpecAccess().getGroup(), "rule__MoniLogSpec__Group__0");
			builder.put(grammarAccess.getMoniLogSpecAccess().getGroup_2(), "rule__MoniLogSpec__Group_2__0");
			builder.put(grammarAccess.getMoniLogSpecAccess().getGroup_4(), "rule__MoniLogSpec__Group_4__0");
			builder.put(grammarAccess.getMoniLogSpecAccess().getGroup_4_3(), "rule__MoniLogSpec__Group_4_3__0");
			builder.put(grammarAccess.getMoniLogSpecAccess().getGroup_5(), "rule__MoniLogSpec__Group_5__0");
			builder.put(grammarAccess.getMoniLogSpecAccess().getGroup_5_3(), "rule__MoniLogSpec__Group_5_3__0");
			builder.put(grammarAccess.getMoniLogSpecAccess().getGroup_9(), "rule__MoniLogSpec__Group_9__0");
			builder.put(grammarAccess.getBeforeEventAccess().getGroup(), "rule__BeforeEvent__Group__0");
			builder.put(grammarAccess.getBeforeEventAccess().getGroup_2_0(), "rule__BeforeEvent__Group_2_0__0");
			builder.put(grammarAccess.getBeforeEventAccess().getGroup_2_1(), "rule__BeforeEvent__Group_2_1__0");
			builder.put(grammarAccess.getAfterEventAccess().getGroup(), "rule__AfterEvent__Group__0");
			builder.put(grammarAccess.getAfterEventAccess().getGroup_2_0(), "rule__AfterEvent__Group_2_0__0");
			builder.put(grammarAccess.getAfterEventAccess().getGroup_2_1(), "rule__AfterEvent__Group_2_1__0");
			builder.put(grammarAccess.getBeforeAfterEventAccess().getGroup(), "rule__BeforeAfterEvent__Group__0");
			builder.put(grammarAccess.getBeforeAfterEventAccess().getGroup_1_0(), "rule__BeforeAfterEvent__Group_1_0__0");
			builder.put(grammarAccess.getBeforeAfterEventAccess().getGroup_1_1(), "rule__BeforeAfterEvent__Group_1_1__0");
			builder.put(grammarAccess.getConditionAccess().getGroup_0(), "rule__Condition__Group_0__0");
			builder.put(grammarAccess.getConditionAccess().getGroup_0_4(), "rule__Condition__Group_0_4__0");
			builder.put(grammarAccess.getConditionAccess().getGroup_1(), "rule__Condition__Group_1__0");
			builder.put(grammarAccess.getTemporalPatternAccess().getGroup(), "rule__TemporalPattern__Group__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_0(), "rule__Pattern__Group_0__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_1(), "rule__Pattern__Group_1__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2(), "rule__Pattern__Group_2__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_3(), "rule__Pattern__Group_3__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_4(), "rule__Pattern__Group_4__0");
			builder.put(grammarAccess.getLowerBoundAccess().getGroup(), "rule__LowerBound__Group__0");
			builder.put(grammarAccess.getUpperBoundAccess().getGroup(), "rule__UpperBound__Group__0");
			builder.put(grammarAccess.getScopeAccess().getGroup_0(), "rule__Scope__Group_0__0");
			builder.put(grammarAccess.getScopeAccess().getGroup_1(), "rule__Scope__Group_1__0");
			builder.put(grammarAccess.getScopeAccess().getGroup_2(), "rule__Scope__Group_2__0");
			builder.put(grammarAccess.getScopeAccess().getGroup_3(), "rule__Scope__Group_3__0");
			builder.put(grammarAccess.getScopeAccess().getGroup_4(), "rule__Scope__Group_4__0");
			builder.put(grammarAccess.getActionAccess().getGroup_0(), "rule__Action__Group_0__0");
			builder.put(grammarAccess.getAppendAccess().getGroup(), "rule__Append__Group__0");
			builder.put(grammarAccess.getStreamAppenderAccess().getGroup(), "rule__StreamAppender__Group__0");
			builder.put(grammarAccess.getStreamAppenderAccess().getGroup_3(), "rule__StreamAppender__Group_3__0");
			builder.put(grammarAccess.getStreamAppenderAccess().getGroup_3_2(), "rule__StreamAppender__Group_3_2__0");
			builder.put(grammarAccess.getFileAppenderAccess().getGroup(), "rule__FileAppender__Group__0");
			builder.put(grammarAccess.getConsoleAppenderAccess().getGroup(), "rule__ConsoleAppender__Group__0");
			builder.put(grammarAccess.getStringLayoutAccess().getGroup(), "rule__StringLayout__Group__0");
			builder.put(grammarAccess.getStringLayoutAccess().getGroup_1(), "rule__StringLayout__Group_1__0");
			builder.put(grammarAccess.getExternalLayoutAccess().getGroup(), "rule__ExternalLayout__Group__0");
			builder.put(grammarAccess.getExternalLayoutAccess().getGroup_1(), "rule__ExternalLayout__Group_1__0");
			builder.put(grammarAccess.getStreamEventAccess().getGroup(), "rule__StreamEvent__Group__0");
			builder.put(grammarAccess.getStreamEventAccess().getGroup_1(), "rule__StreamEvent__Group_1__0");
			builder.put(grammarAccess.getStreamEventAccess().getGroup_1_2(), "rule__StreamEvent__Group_1_2__0");
			builder.put(grammarAccess.getEmptyOrPropertyValueAccess().getGroup_1(), "rule__EmptyOrPropertyValue__Group_1__0");
			builder.put(grammarAccess.getEmptyOrPropertyValueAccess().getGroup_1_2(), "rule__EmptyOrPropertyValue__Group_1_2__0");
			builder.put(grammarAccess.getLanguageExpressionAccess().getGroup_0(), "rule__LanguageExpression__Group_0__0");
			builder.put(grammarAccess.getLanguageExpressionAccess().getGroup_1(), "rule__LanguageExpression__Group_1__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getModelAccess().getDefaultLanguageIDAssignment_0_1(), "rule__Model__DefaultLanguageIDAssignment_0_1");
			builder.put(grammarAccess.getModelAccess().getMoniLogSpecsAssignment_1(), "rule__Model__MoniLogSpecsAssignment_1");
			builder.put(grammarAccess.getMoniLogSpecAccess().getNameAssignment_1(), "rule__MoniLogSpec__NameAssignment_1");
			builder.put(grammarAccess.getMoniLogSpecAccess().getLevelAssignment_2_1(), "rule__MoniLogSpec__LevelAssignment_2_1");
			builder.put(grammarAccess.getMoniLogSpecAccess().getEventsAssignment_4_2(), "rule__MoniLogSpec__EventsAssignment_4_2");
			builder.put(grammarAccess.getMoniLogSpecAccess().getEventsAssignment_4_3_1(), "rule__MoniLogSpec__EventsAssignment_4_3_1");
			builder.put(grammarAccess.getMoniLogSpecAccess().getConditionsAssignment_5_2(), "rule__MoniLogSpec__ConditionsAssignment_5_2");
			builder.put(grammarAccess.getMoniLogSpecAccess().getConditionsAssignment_5_3_1(), "rule__MoniLogSpec__ConditionsAssignment_5_3_1");
			builder.put(grammarAccess.getMoniLogSpecAccess().getActionsAssignment_8(), "rule__MoniLogSpec__ActionsAssignment_8");
			builder.put(grammarAccess.getMoniLogSpecAccess().getActionsAssignment_9_1(), "rule__MoniLogSpec__ActionsAssignment_9_1");
			builder.put(grammarAccess.getBeforeEventAccess().getRuleIDAssignment_1(), "rule__BeforeEvent__RuleIDAssignment_1");
			builder.put(grammarAccess.getBeforeEventAccess().getFrequencyAssignment_2_0_1(), "rule__BeforeEvent__FrequencyAssignment_2_0_1");
			builder.put(grammarAccess.getBeforeEventAccess().getLimitAssignment_2_1_1(), "rule__BeforeEvent__LimitAssignment_2_1_1");
			builder.put(grammarAccess.getAfterEventAccess().getRuleIDAssignment_1(), "rule__AfterEvent__RuleIDAssignment_1");
			builder.put(grammarAccess.getAfterEventAccess().getFrequencyAssignment_2_0_1(), "rule__AfterEvent__FrequencyAssignment_2_0_1");
			builder.put(grammarAccess.getAfterEventAccess().getLimitAssignment_2_1_1(), "rule__AfterEvent__LimitAssignment_2_1_1");
			builder.put(grammarAccess.getBeforeAfterEventAccess().getRuleIDAssignment_0(), "rule__BeforeAfterEvent__RuleIDAssignment_0");
			builder.put(grammarAccess.getBeforeAfterEventAccess().getFrequencyAssignment_1_0_1(), "rule__BeforeAfterEvent__FrequencyAssignment_1_0_1");
			builder.put(grammarAccess.getBeforeAfterEventAccess().getLimitAssignment_1_1_1(), "rule__BeforeAfterEvent__LimitAssignment_1_1_1");
			builder.put(grammarAccess.getConditionAccess().getPatternAssignment_0_3(), "rule__Condition__PatternAssignment_0_3");
			builder.put(grammarAccess.getConditionAccess().getKindAssignment_0_4_1(), "rule__Condition__KindAssignment_0_4_1");
			builder.put(grammarAccess.getConditionAccess().getExpressionAssignment_1_1(), "rule__Condition__ExpressionAssignment_1_1");
			builder.put(grammarAccess.getTemporalPatternAccess().getPatternAssignment_0(), "rule__TemporalPattern__PatternAssignment_0");
			builder.put(grammarAccess.getTemporalPatternAccess().getScopeAssignment_1(), "rule__TemporalPattern__ScopeAssignment_1");
			builder.put(grammarAccess.getPatternAccess().getEventAssignment_0_2(), "rule__Pattern__EventAssignment_0_2");
			builder.put(grammarAccess.getPatternAccess().getBoundAssignment_1_2(), "rule__Pattern__BoundAssignment_1_2");
			builder.put(grammarAccess.getPatternAccess().getEventAssignment_1_3(), "rule__Pattern__EventAssignment_1_3");
			builder.put(grammarAccess.getPatternAccess().getEventAssignment_2_2(), "rule__Pattern__EventAssignment_2_2");
			builder.put(grammarAccess.getPatternAccess().getPredecessorAssignment_3_1(), "rule__Pattern__PredecessorAssignment_3_1");
			builder.put(grammarAccess.getPatternAccess().getSuccessorAssignment_3_3(), "rule__Pattern__SuccessorAssignment_3_3");
			builder.put(grammarAccess.getPatternAccess().getEventAssignment_4_1(), "rule__Pattern__EventAssignment_4_1");
			builder.put(grammarAccess.getPatternAccess().getTriggerAssignment_4_3(), "rule__Pattern__TriggerAssignment_4_3");
			builder.put(grammarAccess.getExactBoundAccess().getNAssignment(), "rule__ExactBound__NAssignment");
			builder.put(grammarAccess.getLowerBoundAccess().getNAssignment_1(), "rule__LowerBound__NAssignment_1");
			builder.put(grammarAccess.getUpperBoundAccess().getNAssignment_1(), "rule__UpperBound__NAssignment_1");
			builder.put(grammarAccess.getScopeAccess().getLowerBoundAssignment_1_2(), "rule__Scope__LowerBoundAssignment_1_2");
			builder.put(grammarAccess.getScopeAccess().getUpperBoundAssignment_2_2(), "rule__Scope__UpperBoundAssignment_2_2");
			builder.put(grammarAccess.getScopeAccess().getLowerBoundAssignment_3_2(), "rule__Scope__LowerBoundAssignment_3_2");
			builder.put(grammarAccess.getScopeAccess().getUpperBoundAssignment_3_4(), "rule__Scope__UpperBoundAssignment_3_4");
			builder.put(grammarAccess.getScopeAccess().getLowerBoundAssignment_4_2(), "rule__Scope__LowerBoundAssignment_4_2");
			builder.put(grammarAccess.getScopeAccess().getUpperBoundAssignment_4_4(), "rule__Scope__UpperBoundAssignment_4_4");
			builder.put(grammarAccess.getAppendAccess().getAppenderAssignment_1(), "rule__Append__AppenderAssignment_1");
			builder.put(grammarAccess.getStreamAppenderAccess().getEventAssignment_2(), "rule__StreamAppender__EventAssignment_2");
			builder.put(grammarAccess.getStreamAppenderAccess().getValuesAssignment_3_1(), "rule__StreamAppender__ValuesAssignment_3_1");
			builder.put(grammarAccess.getStreamAppenderAccess().getValuesAssignment_3_2_1(), "rule__StreamAppender__ValuesAssignment_3_2_1");
			builder.put(grammarAccess.getFileAppenderAccess().getFilenameAssignment_2(), "rule__FileAppender__FilenameAssignment_2");
			builder.put(grammarAccess.getFileAppenderAccess().getLayoutAssignment_4(), "rule__FileAppender__LayoutAssignment_4");
			builder.put(grammarAccess.getConsoleAppenderAccess().getLayoutAssignment_2(), "rule__ConsoleAppender__LayoutAssignment_2");
			builder.put(grammarAccess.getStringLayoutAccess().getFormatStringAssignment_0(), "rule__StringLayout__FormatStringAssignment_0");
			builder.put(grammarAccess.getStringLayoutAccess().getValuesAssignment_1_1(), "rule__StringLayout__ValuesAssignment_1_1");
			builder.put(grammarAccess.getExternalLayoutAccess().getPathAssignment_0(), "rule__ExternalLayout__PathAssignment_0");
			builder.put(grammarAccess.getExternalLayoutAccess().getValuesAssignment_1_1(), "rule__ExternalLayout__ValuesAssignment_1_1");
			builder.put(grammarAccess.getStreamEventAccess().getEventIdAssignment_0(), "rule__StreamEvent__EventIdAssignment_0");
			builder.put(grammarAccess.getStreamEventAccess().getValuesAssignment_1_1(), "rule__StreamEvent__ValuesAssignment_1_1");
			builder.put(grammarAccess.getStreamEventAccess().getValuesAssignment_1_2_1(), "rule__StreamEvent__ValuesAssignment_1_2_1");
			builder.put(grammarAccess.getEmptyOrPropertyValueAccess().getIdAssignment_1_1(), "rule__EmptyOrPropertyValue__IdAssignment_1_1");
			builder.put(grammarAccess.getEmptyOrPropertyValueAccess().getValueAssignment_1_2_1(), "rule__EmptyOrPropertyValue__ValueAssignment_1_2_1");
			builder.put(grammarAccess.getLanguageExpressionAccess().getLanguageIdAssignment_0_1(), "rule__LanguageExpression__LanguageIdAssignment_0_1");
			builder.put(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_0_3(), "rule__LanguageExpression__ExpressionAssignment_0_3");
			builder.put(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_1_1(), "rule__LanguageExpression__ExpressionAssignment_1_1");
			builder.put(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), "rule__BeforeEvent__UnorderedGroup_2");
			builder.put(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), "rule__AfterEvent__UnorderedGroup_2");
			builder.put(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), "rule__BeforeAfterEvent__UnorderedGroup_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MoniLog4DSLGrammarAccess grammarAccess;

	@Override
	protected InternalMoniLog4DSLParser createParser() {
		InternalMoniLog4DSLParser result = new InternalMoniLog4DSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MoniLog4DSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MoniLog4DSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
