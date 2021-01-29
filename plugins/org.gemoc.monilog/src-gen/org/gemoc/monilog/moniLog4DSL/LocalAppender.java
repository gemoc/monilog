/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.monilog.moniLog4DSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Appender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.LocalAppender#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.LocalAppender#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getLocalAppender()
 * @model
 * @generated
 */
public interface LocalAppender extends Appender
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' attribute list.
   * The list contents are of type {@link org.gemoc.monilog.moniLog4DSL.AppenderAnnotation}.
   * The literals are from the enumeration {@link org.gemoc.monilog.moniLog4DSL.AppenderAnnotation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' attribute list.
   * @see org.gemoc.monilog.moniLog4DSL.AppenderAnnotation
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getLocalAppender_Annotations()
   * @model unique="false"
   * @generated
   */
  EList<AppenderAnnotation> getAnnotations();

  /**
   * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.monilog.moniLog4DSL.AppenderCall}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calls</em>' containment reference list.
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getLocalAppender_Calls()
   * @model containment="true"
   * @generated
   */
  EList<AppenderCall> getCalls();

} // LocalAppender
