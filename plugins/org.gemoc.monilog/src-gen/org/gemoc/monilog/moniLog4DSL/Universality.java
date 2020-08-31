/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.monilog.moniLog4DSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.Universality#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getUniversality()
 * @model
 * @generated
 */
public interface Universality extends Pattern
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(StreamEvent)
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getUniversality_Event()
   * @model containment="true"
   * @generated
   */
  StreamEvent getEvent();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog4DSL.Universality#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(StreamEvent value);

} // Universality
