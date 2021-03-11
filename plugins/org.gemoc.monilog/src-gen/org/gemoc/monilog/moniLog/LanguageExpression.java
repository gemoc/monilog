/**
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.moniLog;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog.LanguageExpression#getLanguageId <em>Language Id</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog.LanguageExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog.MoniLogPackage#getLanguageExpression()
 * @model
 * @generated
 */
public interface LanguageExpression extends Action, Expression
{
  /**
   * Returns the value of the '<em><b>Language Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language Id</em>' attribute.
   * @see #setLanguageId(String)
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getLanguageExpression_LanguageId()
   * @model
   * @generated
   */
  String getLanguageId();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog.LanguageExpression#getLanguageId <em>Language Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language Id</em>' attribute.
   * @see #getLanguageId()
   * @generated
   */
  void setLanguageId(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' attribute.
   * @see #setExpression(String)
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getLanguageExpression_Expression()
   * @model
   * @generated
   */
  String getExpression();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog.LanguageExpression#getExpression <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' attribute.
   * @see #getExpression()
   * @generated
   */
  void setExpression(String value);

} // LanguageExpression