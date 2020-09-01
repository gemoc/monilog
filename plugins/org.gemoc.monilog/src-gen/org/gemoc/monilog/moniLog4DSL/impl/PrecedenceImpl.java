/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.monilog.moniLog4DSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage;
import org.gemoc.monilog.moniLog4DSL.Precedence;
import org.gemoc.monilog.moniLog4DSL.StreamEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precedence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.impl.PrecedenceImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.impl.PrecedenceImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrecedenceImpl extends PatternImpl implements Precedence
{
  /**
   * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredecessor()
   * @generated
   * @ordered
   */
  protected StreamEvent predecessor;

  /**
   * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuccessor()
   * @generated
   * @ordered
   */
  protected StreamEvent successor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrecedenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MoniLog4DSLPackage.Literals.PRECEDENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StreamEvent getPredecessor()
  {
    return predecessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredecessor(StreamEvent newPredecessor, NotificationChain msgs)
  {
    StreamEvent oldPredecessor = predecessor;
    predecessor = newPredecessor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoniLog4DSLPackage.PRECEDENCE__PREDECESSOR, oldPredecessor, newPredecessor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPredecessor(StreamEvent newPredecessor)
  {
    if (newPredecessor != predecessor)
    {
      NotificationChain msgs = null;
      if (predecessor != null)
        msgs = ((InternalEObject)predecessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MoniLog4DSLPackage.PRECEDENCE__PREDECESSOR, null, msgs);
      if (newPredecessor != null)
        msgs = ((InternalEObject)newPredecessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MoniLog4DSLPackage.PRECEDENCE__PREDECESSOR, null, msgs);
      msgs = basicSetPredecessor(newPredecessor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoniLog4DSLPackage.PRECEDENCE__PREDECESSOR, newPredecessor, newPredecessor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StreamEvent getSuccessor()
  {
    return successor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuccessor(StreamEvent newSuccessor, NotificationChain msgs)
  {
    StreamEvent oldSuccessor = successor;
    successor = newSuccessor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoniLog4DSLPackage.PRECEDENCE__SUCCESSOR, oldSuccessor, newSuccessor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuccessor(StreamEvent newSuccessor)
  {
    if (newSuccessor != successor)
    {
      NotificationChain msgs = null;
      if (successor != null)
        msgs = ((InternalEObject)successor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MoniLog4DSLPackage.PRECEDENCE__SUCCESSOR, null, msgs);
      if (newSuccessor != null)
        msgs = ((InternalEObject)newSuccessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MoniLog4DSLPackage.PRECEDENCE__SUCCESSOR, null, msgs);
      msgs = basicSetSuccessor(newSuccessor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoniLog4DSLPackage.PRECEDENCE__SUCCESSOR, newSuccessor, newSuccessor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MoniLog4DSLPackage.PRECEDENCE__PREDECESSOR:
        return basicSetPredecessor(null, msgs);
      case MoniLog4DSLPackage.PRECEDENCE__SUCCESSOR:
        return basicSetSuccessor(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MoniLog4DSLPackage.PRECEDENCE__PREDECESSOR:
        return getPredecessor();
      case MoniLog4DSLPackage.PRECEDENCE__SUCCESSOR:
        return getSuccessor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MoniLog4DSLPackage.PRECEDENCE__PREDECESSOR:
        setPredecessor((StreamEvent)newValue);
        return;
      case MoniLog4DSLPackage.PRECEDENCE__SUCCESSOR:
        setSuccessor((StreamEvent)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MoniLog4DSLPackage.PRECEDENCE__PREDECESSOR:
        setPredecessor((StreamEvent)null);
        return;
      case MoniLog4DSLPackage.PRECEDENCE__SUCCESSOR:
        setSuccessor((StreamEvent)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MoniLog4DSLPackage.PRECEDENCE__PREDECESSOR:
        return predecessor != null;
      case MoniLog4DSLPackage.PRECEDENCE__SUCCESSOR:
        return successor != null;
    }
    return super.eIsSet(featureID);
  }

} //PrecedenceImpl