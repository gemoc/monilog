/**
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.moniLog;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog.RealConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog.MoniLogPackage#getRealConstant()
 * @model
 * @generated
 */
public interface RealConstant extends SimpleExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getRealConstant_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog.RealConstant#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // RealConstant
