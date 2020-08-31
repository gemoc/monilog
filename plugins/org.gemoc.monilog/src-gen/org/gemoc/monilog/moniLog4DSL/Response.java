/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.monilog.moniLog4DSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.Response#getEvent <em>Event</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.Response#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends Pattern
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(StreamEvent)
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getResponse_Event()
   * @model containment="true"
   * @generated
   */
  StreamEvent getEvent();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog4DSL.Response#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(StreamEvent value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(StreamEvent)
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getResponse_Trigger()
   * @model containment="true"
   * @generated
   */
  StreamEvent getTrigger();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog4DSL.Response#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(StreamEvent value);

} // Response
