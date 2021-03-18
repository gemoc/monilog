/**
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.moniLog;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contracted If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog.ContractedIf#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog.ContractedIf#getThen <em>Then</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog.ContractedIf#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog.MoniLogPackage#getContractedIf()
 * @model
 * @generated
 */
public interface ContractedIf extends SimpleExpression
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(SimpleExpression)
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getContractedIf_Condition()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getCondition();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog.ContractedIf#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(SimpleExpression)
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getContractedIf_Then()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getThen();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog.ContractedIf#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(SimpleExpression)
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getContractedIf_Else()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getElse();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog.ContractedIf#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(SimpleExpression value);

} // ContractedIf