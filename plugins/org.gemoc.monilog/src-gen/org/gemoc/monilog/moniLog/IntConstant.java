/**
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.moniLog;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog.IntConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog.MoniLogPackage#getIntConstant()
 * @model
 * @generated
 */
public interface IntConstant extends SimpleExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getIntConstant_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog.IntConstant#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // IntConstant
