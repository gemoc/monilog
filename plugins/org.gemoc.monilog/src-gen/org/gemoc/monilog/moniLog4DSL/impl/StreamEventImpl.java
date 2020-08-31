/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.monilog.moniLog4DSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.monilog.moniLog4DSL.EmptyOrPropertyValue;
import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage;
import org.gemoc.monilog.moniLog4DSL.StreamEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.impl.StreamEventImpl#getEventId <em>Event Id</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.impl.StreamEventImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamEventImpl extends MinimalEObjectImpl.Container implements StreamEvent
{
  /**
   * The default value of the '{@link #getEventId() <em>Event Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventId()
   * @generated
   * @ordered
   */
  protected static final String EVENT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEventId() <em>Event Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventId()
   * @generated
   * @ordered
   */
  protected String eventId = EVENT_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<EmptyOrPropertyValue> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StreamEventImpl()
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
    return MoniLog4DSLPackage.Literals.STREAM_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEventId()
  {
    return eventId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEventId(String newEventId)
  {
    String oldEventId = eventId;
    eventId = newEventId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoniLog4DSLPackage.STREAM_EVENT__EVENT_ID, oldEventId, eventId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EmptyOrPropertyValue> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<EmptyOrPropertyValue>(EmptyOrPropertyValue.class, this, MoniLog4DSLPackage.STREAM_EVENT__VALUES);
    }
    return values;
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
      case MoniLog4DSLPackage.STREAM_EVENT__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
      case MoniLog4DSLPackage.STREAM_EVENT__EVENT_ID:
        return getEventId();
      case MoniLog4DSLPackage.STREAM_EVENT__VALUES:
        return getValues();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MoniLog4DSLPackage.STREAM_EVENT__EVENT_ID:
        setEventId((String)newValue);
        return;
      case MoniLog4DSLPackage.STREAM_EVENT__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends EmptyOrPropertyValue>)newValue);
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
      case MoniLog4DSLPackage.STREAM_EVENT__EVENT_ID:
        setEventId(EVENT_ID_EDEFAULT);
        return;
      case MoniLog4DSLPackage.STREAM_EVENT__VALUES:
        getValues().clear();
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
      case MoniLog4DSLPackage.STREAM_EVENT__EVENT_ID:
        return EVENT_ID_EDEFAULT == null ? eventId != null : !EVENT_ID_EDEFAULT.equals(eventId);
      case MoniLog4DSLPackage.STREAM_EVENT__VALUES:
        return values != null && !values.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (eventId: ");
    result.append(eventId);
    result.append(')');
    return result.toString();
  }

} //StreamEventImpl
