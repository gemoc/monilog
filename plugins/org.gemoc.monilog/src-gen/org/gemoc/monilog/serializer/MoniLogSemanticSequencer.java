/*
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.gemoc.monilog.moniLog.ASTEvent;
import org.gemoc.monilog.moniLog.Absence;
import org.gemoc.monilog.moniLog.After;
import org.gemoc.monilog.moniLog.AfterASTEvent;
import org.gemoc.monilog.moniLog.AfterUntil;
import org.gemoc.monilog.moniLog.AppenderCall;
import org.gemoc.monilog.moniLog.Before;
import org.gemoc.monilog.moniLog.BeforeASTEvent;
import org.gemoc.monilog.moniLog.Between;
import org.gemoc.monilog.moniLog.ComplexEvent;
import org.gemoc.monilog.moniLog.Condition;
import org.gemoc.monilog.moniLog.Document;
import org.gemoc.monilog.moniLog.EmitEvent;
import org.gemoc.monilog.moniLog.Empty;
import org.gemoc.monilog.moniLog.ExactBound;
import org.gemoc.monilog.moniLog.Existence;
import org.gemoc.monilog.moniLog.ExternalAppender;
import org.gemoc.monilog.moniLog.ExternalLayout;
import org.gemoc.monilog.moniLog.Globally;
import org.gemoc.monilog.moniLog.Import;
import org.gemoc.monilog.moniLog.LanguageExpression;
import org.gemoc.monilog.moniLog.LayoutCall;
import org.gemoc.monilog.moniLog.LocalAppender;
import org.gemoc.monilog.moniLog.LocalLayout;
import org.gemoc.monilog.moniLog.LowerBound;
import org.gemoc.monilog.moniLog.MoniLogPackage;
import org.gemoc.monilog.moniLog.MoniLogger;
import org.gemoc.monilog.moniLog.ParameterDecl;
import org.gemoc.monilog.moniLog.ParameterReference;
import org.gemoc.monilog.moniLog.Precedence;
import org.gemoc.monilog.moniLog.PropertyValue;
import org.gemoc.monilog.moniLog.Response;
import org.gemoc.monilog.moniLog.SetVariable;
import org.gemoc.monilog.moniLog.StartMoniLogger;
import org.gemoc.monilog.moniLog.StopMoniLogger;
import org.gemoc.monilog.moniLog.StreamEvent;
import org.gemoc.monilog.moniLog.TemporalPattern;
import org.gemoc.monilog.moniLog.Universality;
import org.gemoc.monilog.moniLog.UpperBound;
import org.gemoc.monilog.moniLog.UserEvent;
import org.gemoc.monilog.services.MoniLogGrammarAccess;

@SuppressWarnings("all")
public class MoniLogSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MoniLogGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MoniLogPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MoniLogPackage.AST_EVENT:
				sequence_Event(context, (ASTEvent) semanticObject); 
				return; 
			case MoniLogPackage.ABSENCE:
				sequence_Pattern(context, (Absence) semanticObject); 
				return; 
			case MoniLogPackage.AFTER:
				sequence_Scope(context, (After) semanticObject); 
				return; 
			case MoniLogPackage.AFTER_AST_EVENT:
				sequence_ASTEventKind(context, (AfterASTEvent) semanticObject); 
				return; 
			case MoniLogPackage.AFTER_UNTIL:
				sequence_Scope(context, (AfterUntil) semanticObject); 
				return; 
			case MoniLogPackage.APPENDER_CALL:
				sequence_AppenderCall(context, (AppenderCall) semanticObject); 
				return; 
			case MoniLogPackage.BEFORE:
				sequence_Scope(context, (Before) semanticObject); 
				return; 
			case MoniLogPackage.BEFORE_AST_EVENT:
				sequence_ASTEventKind(context, (BeforeASTEvent) semanticObject); 
				return; 
			case MoniLogPackage.BETWEEN:
				sequence_Scope(context, (Between) semanticObject); 
				return; 
			case MoniLogPackage.COMPLEX_EVENT:
				sequence_Event(context, (ComplexEvent) semanticObject); 
				return; 
			case MoniLogPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case MoniLogPackage.DOCUMENT:
				sequence_Document(context, (Document) semanticObject); 
				return; 
			case MoniLogPackage.EMIT_EVENT:
				sequence_EmitEvent(context, (EmitEvent) semanticObject); 
				return; 
			case MoniLogPackage.EMPTY:
				sequence_EmptyOrPropertyValue(context, (Empty) semanticObject); 
				return; 
			case MoniLogPackage.EXACT_BOUND:
				sequence_ExactBound(context, (ExactBound) semanticObject); 
				return; 
			case MoniLogPackage.EXISTENCE:
				sequence_Pattern(context, (Existence) semanticObject); 
				return; 
			case MoniLogPackage.EXTERNAL_APPENDER:
				sequence_ExternalAppender(context, (ExternalAppender) semanticObject); 
				return; 
			case MoniLogPackage.EXTERNAL_LAYOUT:
				sequence_ExternalLayout(context, (ExternalLayout) semanticObject); 
				return; 
			case MoniLogPackage.GLOBALLY:
				sequence_Scope(context, (Globally) semanticObject); 
				return; 
			case MoniLogPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case MoniLogPackage.LANGUAGE_EXPRESSION:
				sequence_LanguageExpression(context, (LanguageExpression) semanticObject); 
				return; 
			case MoniLogPackage.LAYOUT_CALL:
				sequence_LayoutCall(context, (LayoutCall) semanticObject); 
				return; 
			case MoniLogPackage.LOCAL_APPENDER:
				sequence_LocalAppender(context, (LocalAppender) semanticObject); 
				return; 
			case MoniLogPackage.LOCAL_LAYOUT:
				sequence_LocalLayout(context, (LocalLayout) semanticObject); 
				return; 
			case MoniLogPackage.LOWER_BOUND:
				sequence_LowerBound(context, (LowerBound) semanticObject); 
				return; 
			case MoniLogPackage.MONI_LOGGER:
				sequence_MoniLogger(context, (MoniLogger) semanticObject); 
				return; 
			case MoniLogPackage.PARAMETER:
				sequence_Parameter(context, (org.gemoc.monilog.moniLog.Parameter) semanticObject); 
				return; 
			case MoniLogPackage.PARAMETER_DECL:
				if (rule == grammarAccess.getParameterDeclNoVarArgsRule()) {
					sequence_ParameterDeclNoVarArgs(context, (ParameterDecl) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getParameterDeclVarArgsRule()) {
					sequence_ParameterDeclVarArgs(context, (ParameterDecl) semanticObject); 
					return; 
				}
				else break;
			case MoniLogPackage.PARAMETER_REFERENCE:
				sequence_ParameterReference(context, (ParameterReference) semanticObject); 
				return; 
			case MoniLogPackage.PRECEDENCE:
				sequence_Pattern(context, (Precedence) semanticObject); 
				return; 
			case MoniLogPackage.PROPERTY_VALUE:
				sequence_PropertyValue(context, (PropertyValue) semanticObject); 
				return; 
			case MoniLogPackage.RESPONSE:
				sequence_Pattern(context, (Response) semanticObject); 
				return; 
			case MoniLogPackage.SET_VARIABLE:
				sequence_SetVariable(context, (SetVariable) semanticObject); 
				return; 
			case MoniLogPackage.START_MONI_LOGGER:
				sequence_MoniloggerCall(context, (StartMoniLogger) semanticObject); 
				return; 
			case MoniLogPackage.STOP_MONI_LOGGER:
				sequence_MoniloggerCall(context, (StopMoniLogger) semanticObject); 
				return; 
			case MoniLogPackage.STREAM_EVENT:
				sequence_StreamEvent(context, (StreamEvent) semanticObject); 
				return; 
			case MoniLogPackage.TEMPORAL_PATTERN:
				sequence_TemporalPattern(context, (TemporalPattern) semanticObject); 
				return; 
			case MoniLogPackage.UNIVERSALITY:
				sequence_Pattern(context, (Universality) semanticObject); 
				return; 
			case MoniLogPackage.UPPER_BOUND:
				sequence_UpperBound(context, (UpperBound) semanticObject); 
				return; 
			case MoniLogPackage.USER_EVENT:
				sequence_Event(context, (UserEvent) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ASTEventKind returns AfterASTEvent
	 *
	 * Constraint:
	 *     {AfterASTEvent}
	 */
	protected void sequence_ASTEventKind(ISerializationContext context, AfterASTEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ASTEventKind returns BeforeASTEvent
	 *
	 * Constraint:
	 *     {BeforeASTEvent}
	 */
	protected void sequence_ASTEventKind(ISerializationContext context, BeforeASTEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns AppenderCall
	 *     AppenderCall returns AppenderCall
	 *
	 * Constraint:
	 *     (appender=[Appender|QualifiedName] (args+=AppenderCallArgument args+=AppenderCallArgument*)?)
	 */
	protected void sequence_AppenderCall(ISerializationContext context, AppenderCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     expression=LanguageExpression
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.CONDITION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.CONDITION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getExpressionLanguageExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Document returns Document
	 *
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* (events+=Event | appenders+=Appender | layouts+=Layout | moniloggers+=MoniLogger)*)
	 */
	protected void sequence_Document(ISerializationContext context, Document semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns EmitEvent
	 *     EmitEvent returns EmitEvent
	 *
	 * Constraint:
	 *     (event=[UserEvent|ID] (args+=Expression args+=Expression*)?)
	 */
	protected void sequence_EmitEvent(ISerializationContext context, EmitEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EmptyOrPropertyValue returns Empty
	 *
	 * Constraint:
	 *     {Empty}
	 */
	protected void sequence_EmptyOrPropertyValue(ISerializationContext context, Empty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns ASTEvent
	 *
	 * Constraint:
	 *     (name=ID parameterDecl=ParameterDeclNoVarArgs? kind=ASTEventKind ruleID=ID)
	 */
	protected void sequence_Event(ISerializationContext context, ASTEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns ComplexEvent
	 *
	 * Constraint:
	 *     (name=ID kind=TemporalPatternKind? parameterDecl=ParameterDeclNoVarArgs? pattern=TemporalPattern)
	 */
	protected void sequence_Event(ISerializationContext context, ComplexEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns UserEvent
	 *
	 * Constraint:
	 *     (name=ID parameterDecl=ParameterDeclNoVarArgs?)
	 */
	protected void sequence_Event(ISerializationContext context, UserEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BoundType returns ExactBound
	 *     ExactBound returns ExactBound
	 *
	 * Constraint:
	 *     n=INT
	 */
	protected void sequence_ExactBound(ISerializationContext context, ExactBound semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.BOUND_TYPE__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.BOUND_TYPE__N));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExactBoundAccess().getNINTTerminalRuleCall_0(), semanticObject.getN());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Appender returns ExternalAppender
	 *     ExternalAppender returns ExternalAppender
	 *
	 * Constraint:
	 *     (name=ID parameterDecl=ParameterDeclVarArgs?)
	 */
	protected void sequence_ExternalAppender(ISerializationContext context, ExternalAppender semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Layout returns ExternalLayout
	 *     ExternalLayout returns ExternalLayout
	 *
	 * Constraint:
	 *     (name=ID parameterDecl=ParameterDeclVarArgs?)
	 */
	protected void sequence_ExternalLayout(ISerializationContext context, ExternalLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns LanguageExpression
	 *     AppenderCallArgument returns LanguageExpression
	 *     LayoutCallArgument returns LanguageExpression
	 *     Expression returns LanguageExpression
	 *     LanguageExpression returns LanguageExpression
	 *
	 * Constraint:
	 *     (languageId=ID expression=STRING)
	 */
	protected void sequence_LanguageExpression(ISerializationContext context, LanguageExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.LANGUAGE_EXPRESSION__LANGUAGE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.LANGUAGE_EXPRESSION__LANGUAGE_ID));
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.LANGUAGE_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.LANGUAGE_EXPRESSION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLanguageExpressionAccess().getLanguageIdIDTerminalRuleCall_0_0(), semanticObject.getLanguageId());
		feeder.accept(grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AppenderCallArgument returns LayoutCall
	 *     LayoutCall returns LayoutCall
	 *
	 * Constraint:
	 *     (layout=[Layout|QualifiedName] (args+=LayoutCallArgument args+=LayoutCallArgument*)?)
	 */
	protected void sequence_LayoutCall(ISerializationContext context, LayoutCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Appender returns LocalAppender
	 *     LocalAppender returns LocalAppender
	 *
	 * Constraint:
	 *     (annotations+=AppenderAnnotation* name=ID parameterDecl=ParameterDeclVarArgs? calls+=AppenderCall calls+=AppenderCall*)
	 */
	protected void sequence_LocalAppender(ISerializationContext context, LocalAppender semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Layout returns LocalLayout
	 *     LocalLayout returns LocalLayout
	 *
	 * Constraint:
	 *     (name=ID parameterDecl=ParameterDeclVarArgs? call=LayoutCall)
	 */
	protected void sequence_LocalLayout(ISerializationContext context, LocalLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BoundType returns LowerBound
	 *     LowerBound returns LowerBound
	 *
	 * Constraint:
	 *     n=INT
	 */
	protected void sequence_LowerBound(ISerializationContext context, LowerBound semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.BOUND_TYPE__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.BOUND_TYPE__N));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLowerBoundAccess().getNINTTerminalRuleCall_1_0(), semanticObject.getN());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MoniLogger returns MoniLogger
	 *
	 * Constraint:
	 *     (
	 *         annotations+=MoniLoggerAnnotation* 
	 *         name=ID 
	 *         parameterDecl=ParameterDeclVarArgs? 
	 *         level=LogLevel? 
	 *         streamEvent=StreamEvent 
	 *         (conditions+=Condition conditions+=Condition*)? 
	 *         actions+=Action 
	 *         actions+=Action*
	 *     )
	 */
	protected void sequence_MoniLogger(ISerializationContext context, MoniLogger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns StartMoniLogger
	 *     MoniloggerCall returns StartMoniLogger
	 *
	 * Constraint:
	 *     (monilogger=[MoniLogger|ID] (args+=Expression args+=Expression*)?)
	 */
	protected void sequence_MoniloggerCall(ISerializationContext context, StartMoniLogger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns StopMoniLogger
	 *     MoniloggerCall returns StopMoniLogger
	 *
	 * Constraint:
	 *     monilogger=[MoniLogger|ID]
	 */
	protected void sequence_MoniloggerCall(ISerializationContext context, StopMoniLogger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.MONILOGGER_CALL__MONILOGGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.MONILOGGER_CALL__MONILOGGER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerIDTerminalRuleCall_1_1_0_1(), semanticObject.eGet(MoniLogPackage.Literals.MONILOGGER_CALL__MONILOGGER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterDeclNoVarArgs returns ParameterDecl
	 *
	 * Constraint:
	 *     (parameters+=Parameter parameters+=Parameter*)?
	 */
	protected void sequence_ParameterDeclNoVarArgs(ISerializationContext context, ParameterDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterDeclVarArgs returns ParameterDecl
	 *
	 * Constraint:
	 *     (parameters+=Parameter parameters+=Parameter* varArgs=Parameter?)?
	 */
	protected void sequence_ParameterDeclVarArgs(ISerializationContext context, ParameterDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AppenderCallArgument returns ParameterReference
	 *     LayoutCallArgument returns ParameterReference
	 *     Expression returns ParameterReference
	 *     ParameterReference returns ParameterReference
	 *
	 * Constraint:
	 *     parameter=[Parameter|ID]
	 */
	protected void sequence_ParameterReference(ISerializationContext context, ParameterReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.PARAMETER_REFERENCE__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.PARAMETER_REFERENCE__PARAMETER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterReferenceAccess().getParameterParameterIDTerminalRuleCall_0_1(), semanticObject.eGet(MoniLogPackage.Literals.PARAMETER_REFERENCE__PARAMETER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Parameter(ISerializationContext context, org.gemoc.monilog.moniLog.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.PARAMETER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pattern returns Absence
	 *
	 * Constraint:
	 *     event=StreamEvent
	 */
	protected void sequence_Pattern(ISerializationContext context, Absence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.ABSENCE__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.ABSENCE__EVENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_2_2_0(), semanticObject.getEvent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pattern returns Existence
	 *
	 * Constraint:
	 *     (bound=BoundType? event=StreamEvent)
	 */
	protected void sequence_Pattern(ISerializationContext context, Existence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pattern returns Precedence
	 *
	 * Constraint:
	 *     (predecessor=StreamEvent successor=StreamEvent)
	 */
	protected void sequence_Pattern(ISerializationContext context, Precedence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.PRECEDENCE__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.PRECEDENCE__PREDECESSOR));
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.PRECEDENCE__SUCCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.PRECEDENCE__SUCCESSOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPatternAccess().getPredecessorStreamEventParserRuleCall_3_1_0(), semanticObject.getPredecessor());
		feeder.accept(grammarAccess.getPatternAccess().getSuccessorStreamEventParserRuleCall_3_3_0(), semanticObject.getSuccessor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pattern returns Response
	 *
	 * Constraint:
	 *     (event=StreamEvent trigger=StreamEvent)
	 */
	protected void sequence_Pattern(ISerializationContext context, Response semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.RESPONSE__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.RESPONSE__EVENT));
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.RESPONSE__TRIGGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.RESPONSE__TRIGGER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_4_1_0(), semanticObject.getEvent());
		feeder.accept(grammarAccess.getPatternAccess().getTriggerStreamEventParserRuleCall_4_3_0(), semanticObject.getTrigger());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Pattern returns Universality
	 *
	 * Constraint:
	 *     event=StreamEvent
	 */
	protected void sequence_Pattern(ISerializationContext context, Universality semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.UNIVERSALITY__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.UNIVERSALITY__EVENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_1_2_0(), semanticObject.getEvent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EmptyOrPropertyValue returns PropertyValue
	 *     PropertyValue returns PropertyValue
	 *
	 * Constraint:
	 *     ((id=ID value=Expression?) | value=LanguageExpression)
	 */
	protected void sequence_PropertyValue(ISerializationContext context, PropertyValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scope returns After
	 *
	 * Constraint:
	 *     lowerBound=StreamEvent
	 */
	protected void sequence_Scope(ISerializationContext context, After semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.AFTER__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.AFTER__LOWER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_1_2_0(), semanticObject.getLowerBound());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Scope returns AfterUntil
	 *
	 * Constraint:
	 *     (lowerBound=StreamEvent upperBound=StreamEvent)
	 */
	protected void sequence_Scope(ISerializationContext context, AfterUntil semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.AFTER_UNTIL__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.AFTER_UNTIL__LOWER_BOUND));
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.AFTER_UNTIL__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.AFTER_UNTIL__UPPER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_4_2_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_4_4_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Scope returns Before
	 *
	 * Constraint:
	 *     upperBound=StreamEvent
	 */
	protected void sequence_Scope(ISerializationContext context, Before semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.BEFORE__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.BEFORE__UPPER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_2_2_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Scope returns Between
	 *
	 * Constraint:
	 *     (lowerBound=StreamEvent upperBound=StreamEvent)
	 */
	protected void sequence_Scope(ISerializationContext context, Between semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.BETWEEN__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.BETWEEN__LOWER_BOUND));
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.BETWEEN__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.BETWEEN__UPPER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_3_2_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_3_4_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Scope returns Globally
	 *
	 * Constraint:
	 *     {Globally}
	 */
	protected void sequence_Scope(ISerializationContext context, Globally semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns SetVariable
	 *     SetVariable returns SetVariable
	 *
	 * Constraint:
	 *     (variable=STRING value=LanguageExpression)
	 */
	protected void sequence_SetVariable(ISerializationContext context, SetVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.SET_VARIABLE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.SET_VARIABLE__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.SET_VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.SET_VARIABLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSetVariableAccess().getVariableSTRINGTerminalRuleCall_2_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getSetVariableAccess().getValueLanguageExpressionParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StreamEvent returns StreamEvent
	 *
	 * Constraint:
	 *     (event=[Event|ID] (values+=EmptyOrPropertyValue values+=EmptyOrPropertyValue*)?)
	 */
	protected void sequence_StreamEvent(ISerializationContext context, StreamEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TemporalPattern returns TemporalPattern
	 *
	 * Constraint:
	 *     (pattern=Pattern scope=Scope)
	 */
	protected void sequence_TemporalPattern(ISerializationContext context, TemporalPattern semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.TEMPORAL_PATTERN__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.TEMPORAL_PATTERN__PATTERN));
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.TEMPORAL_PATTERN__SCOPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.TEMPORAL_PATTERN__SCOPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTemporalPatternAccess().getPatternPatternParserRuleCall_0_0(), semanticObject.getPattern());
		feeder.accept(grammarAccess.getTemporalPatternAccess().getScopeScopeParserRuleCall_1_0(), semanticObject.getScope());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BoundType returns UpperBound
	 *     UpperBound returns UpperBound
	 *
	 * Constraint:
	 *     n=INT
	 */
	protected void sequence_UpperBound(ISerializationContext context, UpperBound semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MoniLogPackage.Literals.BOUND_TYPE__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MoniLogPackage.Literals.BOUND_TYPE__N));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUpperBoundAccess().getNINTTerminalRuleCall_1_0(), semanticObject.getN());
		feeder.finish();
	}
	
	
}