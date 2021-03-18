/**
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.moniLog;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog.ArrayRef#getArray <em>Array</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog.ArrayRef#getIndices <em>Indices</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog.MoniLogPackage#getArrayRef()
 * @model
 * @generated
 */
public interface ArrayRef extends Ref
{
  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(Ref)
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getArrayRef_Array()
   * @model containment="true"
   * @generated
   */
  Ref getArray();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog.ArrayRef#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(Ref value);

  /**
   * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.monilog.moniLog.SimpleExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indices</em>' containment reference list.
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getArrayRef_Indices()
   * @model containment="true"
   * @generated
   */
  EList<SimpleExpression> getIndices();

} // ArrayRef