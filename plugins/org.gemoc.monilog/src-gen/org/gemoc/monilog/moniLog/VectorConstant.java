/**
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.moniLog;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog.VectorConstant#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog.MoniLogPackage#getVectorConstant()
 * @model
 * @generated
 */
public interface VectorConstant extends SimpleExpression
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.monilog.moniLog.SimpleExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getVectorConstant_Values()
   * @model containment="true"
   * @generated
   */
  EList<SimpleExpression> getValues();

} // VectorConstant
