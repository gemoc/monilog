/**
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.moniLog;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog.BoolConstant#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog.MoniLogPackage#getBoolConstant()
 * @model
 * @generated
 */
public interface BoolConstant extends SimpleExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(boolean)
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getBoolConstant_Value()
   * @model
   * @generated
   */
  boolean isValue();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog.BoolConstant#isValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #isValue()
   * @generated
   */
  void setValue(boolean value);

} // BoolConstant
