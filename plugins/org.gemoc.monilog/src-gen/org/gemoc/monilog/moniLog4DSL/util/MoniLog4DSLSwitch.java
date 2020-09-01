/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.monilog.moniLog4DSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.monilog.moniLog4DSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage
 * @generated
 */
public class MoniLog4DSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MoniLog4DSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoniLog4DSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MoniLog4DSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MoniLog4DSLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.MONI_LOG_SPEC:
      {
        MoniLogSpec moniLogSpec = (MoniLogSpec)theEObject;
        T result = caseMoniLogSpec(moniLogSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.BEFORE_EVENT:
      {
        BeforeEvent beforeEvent = (BeforeEvent)theEObject;
        T result = caseBeforeEvent(beforeEvent);
        if (result == null) result = caseEvent(beforeEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.AFTER_EVENT:
      {
        AfterEvent afterEvent = (AfterEvent)theEObject;
        T result = caseAfterEvent(afterEvent);
        if (result == null) result = caseEvent(afterEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.BEFORE_AFTER_EVENT:
      {
        BeforeAfterEvent beforeAfterEvent = (BeforeAfterEvent)theEObject;
        T result = caseBeforeAfterEvent(beforeAfterEvent);
        if (result == null) result = caseEvent(beforeAfterEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.TEMPORAL_PATTERN:
      {
        TemporalPattern temporalPattern = (TemporalPattern)theEObject;
        T result = caseTemporalPattern(temporalPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.PATTERN:
      {
        Pattern pattern = (Pattern)theEObject;
        T result = casePattern(pattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.BOUND_TYPE:
      {
        BoundType boundType = (BoundType)theEObject;
        T result = caseBoundType(boundType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.EXACT_BOUND:
      {
        ExactBound exactBound = (ExactBound)theEObject;
        T result = caseExactBound(exactBound);
        if (result == null) result = caseBoundType(exactBound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.LOWER_BOUND:
      {
        LowerBound lowerBound = (LowerBound)theEObject;
        T result = caseLowerBound(lowerBound);
        if (result == null) result = caseBoundType(lowerBound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.UPPER_BOUND:
      {
        UpperBound upperBound = (UpperBound)theEObject;
        T result = caseUpperBound(upperBound);
        if (result == null) result = caseBoundType(upperBound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.SCOPE:
      {
        Scope scope = (Scope)theEObject;
        T result = caseScope(scope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.APPEND:
      {
        Append append = (Append)theEObject;
        T result = caseAppend(append);
        if (result == null) result = caseAction(append);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.APPENDER:
      {
        Appender appender = (Appender)theEObject;
        T result = caseAppender(appender);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.STREAM_APPENDER:
      {
        StreamAppender streamAppender = (StreamAppender)theEObject;
        T result = caseStreamAppender(streamAppender);
        if (result == null) result = caseAppender(streamAppender);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.FILE_APPENDER:
      {
        FileAppender fileAppender = (FileAppender)theEObject;
        T result = caseFileAppender(fileAppender);
        if (result == null) result = caseAppender(fileAppender);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.CONSOLE_APPENDER:
      {
        ConsoleAppender consoleAppender = (ConsoleAppender)theEObject;
        T result = caseConsoleAppender(consoleAppender);
        if (result == null) result = caseAppender(consoleAppender);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.LAYOUT:
      {
        Layout layout = (Layout)theEObject;
        T result = caseLayout(layout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.STRING_LAYOUT:
      {
        StringLayout stringLayout = (StringLayout)theEObject;
        T result = caseStringLayout(stringLayout);
        if (result == null) result = caseLayout(stringLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.EXTERNAL_LAYOUT:
      {
        ExternalLayout externalLayout = (ExternalLayout)theEObject;
        T result = caseExternalLayout(externalLayout);
        if (result == null) result = caseLayout(externalLayout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.STREAM_EVENT:
      {
        StreamEvent streamEvent = (StreamEvent)theEObject;
        T result = caseStreamEvent(streamEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.EMPTY_OR_PROPERTY_VALUE:
      {
        EmptyOrPropertyValue emptyOrPropertyValue = (EmptyOrPropertyValue)theEObject;
        T result = caseEmptyOrPropertyValue(emptyOrPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.LANGUAGE_EXPRESSION:
      {
        LanguageExpression languageExpression = (LanguageExpression)theEObject;
        T result = caseLanguageExpression(languageExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.TEMPORAL_PROPERTY_CONDITION:
      {
        TemporalPropertyCondition temporalPropertyCondition = (TemporalPropertyCondition)theEObject;
        T result = caseTemporalPropertyCondition(temporalPropertyCondition);
        if (result == null) result = caseCondition(temporalPropertyCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.LANGUAGE_EXPRESSION_CONDITION:
      {
        LanguageExpressionCondition languageExpressionCondition = (LanguageExpressionCondition)theEObject;
        T result = caseLanguageExpressionCondition(languageExpressionCondition);
        if (result == null) result = caseCondition(languageExpressionCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.UNIVERSALITY:
      {
        Universality universality = (Universality)theEObject;
        T result = caseUniversality(universality);
        if (result == null) result = casePattern(universality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.EXISTENCE:
      {
        Existence existence = (Existence)theEObject;
        T result = caseExistence(existence);
        if (result == null) result = casePattern(existence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.ABSENCE:
      {
        Absence absence = (Absence)theEObject;
        T result = caseAbsence(absence);
        if (result == null) result = casePattern(absence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.PRECEDENCE:
      {
        Precedence precedence = (Precedence)theEObject;
        T result = casePrecedence(precedence);
        if (result == null) result = casePattern(precedence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.RESPONSE:
      {
        Response response = (Response)theEObject;
        T result = caseResponse(response);
        if (result == null) result = casePattern(response);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.GLOBALLY:
      {
        Globally globally = (Globally)theEObject;
        T result = caseGlobally(globally);
        if (result == null) result = caseScope(globally);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.AFTER:
      {
        After after = (After)theEObject;
        T result = caseAfter(after);
        if (result == null) result = caseScope(after);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.BEFORE:
      {
        Before before = (Before)theEObject;
        T result = caseBefore(before);
        if (result == null) result = caseScope(before);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.BETWEEN:
      {
        Between between = (Between)theEObject;
        T result = caseBetween(between);
        if (result == null) result = caseScope(between);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.AFTER_UNTIL:
      {
        AfterUntil afterUntil = (AfterUntil)theEObject;
        T result = caseAfterUntil(afterUntil);
        if (result == null) result = caseScope(afterUntil);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.NOTIFY:
      {
        Notify notify = (Notify)theEObject;
        T result = caseNotify(notify);
        if (result == null) result = caseAction(notify);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.EMPTY:
      {
        Empty empty = (Empty)theEObject;
        T result = caseEmpty(empty);
        if (result == null) result = caseEmptyOrPropertyValue(empty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.PROPERTY_VALUE:
      {
        PropertyValue propertyValue = (PropertyValue)theEObject;
        T result = casePropertyValue(propertyValue);
        if (result == null) result = caseEmptyOrPropertyValue(propertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.EXPLICIT_LANGUAGE_EXPRESSION:
      {
        ExplicitLanguageExpression explicitLanguageExpression = (ExplicitLanguageExpression)theEObject;
        T result = caseExplicitLanguageExpression(explicitLanguageExpression);
        if (result == null) result = caseLanguageExpression(explicitLanguageExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MoniLog4DSLPackage.DEFAULT_LANGUAGE_EXPRESSION:
      {
        DefaultLanguageExpression defaultLanguageExpression = (DefaultLanguageExpression)theEObject;
        T result = caseDefaultLanguageExpression(defaultLanguageExpression);
        if (result == null) result = caseLanguageExpression(defaultLanguageExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Moni Log Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Moni Log Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoniLogSpec(MoniLogSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Before Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Before Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBeforeEvent(BeforeEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfterEvent(AfterEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Before After Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Before After Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBeforeAfterEvent(BeforeAfterEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Temporal Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Temporal Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemporalPattern(TemporalPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern(Pattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bound Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bound Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoundType(BoundType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exact Bound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exact Bound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExactBound(ExactBound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lower Bound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lower Bound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLowerBound(LowerBound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Upper Bound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Upper Bound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpperBound(UpperBound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScope(Scope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Append</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Append</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppend(Append object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Appender</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Appender</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppender(Appender object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream Appender</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream Appender</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStreamAppender(StreamAppender object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Appender</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Appender</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileAppender(FileAppender object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Console Appender</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Console Appender</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsoleAppender(ConsoleAppender object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayout(Layout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLayout(StringLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalLayout(ExternalLayout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStreamEvent(StreamEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Or Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Or Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyOrPropertyValue(EmptyOrPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguageExpression(LanguageExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Temporal Property Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Temporal Property Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemporalPropertyCondition(TemporalPropertyCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language Expression Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language Expression Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguageExpressionCondition(LanguageExpressionCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Universality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Universality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniversality(Universality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Existence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Existence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistence(Existence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Absence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Absence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbsence(Absence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precedence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precedence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrecedence(Precedence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Response</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResponse(Response object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Globally</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Globally</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobally(Globally object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfter(After object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Before</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Before</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBefore(Before object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Between</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Between</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBetween(Between object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After Until</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After Until</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfterUntil(AfterUntil object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Notify</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Notify</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotify(Notify object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmpty(Empty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyValue(PropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Explicit Language Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Explicit Language Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExplicitLanguageExpression(ExplicitLanguageExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Language Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Language Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultLanguageExpression(DefaultLanguageExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MoniLog4DSLSwitch