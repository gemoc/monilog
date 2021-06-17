/**
 */
package instrumentationInterface.impl;

import instrumentationInterface.InstrumentableElement;
import instrumentationInterface.InstrumentationInterface;
import instrumentationInterface.InstrumentationInterfacePackage;
import instrumentationInterface.ReadableElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instrumentation Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instrumentationInterface.impl.InstrumentationInterfaceImpl#getInstrumentableElements <em>Instrumentable Elements</em>}</li>
 *   <li>{@link instrumentationInterface.impl.InstrumentationInterfaceImpl#getReadableElements <em>Readable Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstrumentationInterfaceImpl extends MinimalEObjectImpl.Container implements InstrumentationInterface {
	/**
	 * The cached value of the '{@link #getInstrumentableElements() <em>Instrumentable Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrumentableElements()
	 * @generated
	 * @ordered
	 */
	protected EList<InstrumentableElement> instrumentableElements;

	/**
	 * The cached value of the '{@link #getReadableElements() <em>Readable Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadableElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadableElement> readableElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstrumentationInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstrumentationInterfacePackage.Literals.INSTRUMENTATION_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstrumentableElement> getInstrumentableElements() {
		if (instrumentableElements == null) {
			instrumentableElements = new EObjectContainmentEList<InstrumentableElement>(InstrumentableElement.class, this, InstrumentationInterfacePackage.INSTRUMENTATION_INTERFACE__INSTRUMENTABLE_ELEMENTS);
		}
		return instrumentableElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReadableElement> getReadableElements() {
		if (readableElements == null) {
			readableElements = new EObjectResolvingEList<ReadableElement>(ReadableElement.class, this, InstrumentationInterfacePackage.INSTRUMENTATION_INTERFACE__READABLE_ELEMENTS);
		}
		return readableElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstrumentationInterfacePackage.INSTRUMENTATION_INTERFACE__INSTRUMENTABLE_ELEMENTS:
				return ((InternalEList<?>)getInstrumentableElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstrumentationInterfacePackage.INSTRUMENTATION_INTERFACE__INSTRUMENTABLE_ELEMENTS:
				return getInstrumentableElements();
			case InstrumentationInterfacePackage.INSTRUMENTATION_INTERFACE__READABLE_ELEMENTS:
				return getReadableElements();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InstrumentationInterfacePackage.INSTRUMENTATION_INTERFACE__INSTRUMENTABLE_ELEMENTS:
				getInstrumentableElements().clear();
				getInstrumentableElements().addAll((Collection<? extends InstrumentableElement>)newValue);
				return;
			case InstrumentationInterfacePackage.INSTRUMENTATION_INTERFACE__READABLE_ELEMENTS:
				getReadableElements().clear();
				getReadableElements().addAll((Collection<? extends ReadableElement>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case InstrumentationInterfacePackage.INSTRUMENTATION_INTERFACE__INSTRUMENTABLE_ELEMENTS:
				getInstrumentableElements().clear();
				return;
			case InstrumentationInterfacePackage.INSTRUMENTATION_INTERFACE__READABLE_ELEMENTS:
				getReadableElements().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstrumentationInterfacePackage.INSTRUMENTATION_INTERFACE__INSTRUMENTABLE_ELEMENTS:
				return instrumentableElements != null && !instrumentableElements.isEmpty();
			case InstrumentationInterfacePackage.INSTRUMENTATION_INTERFACE__READABLE_ELEMENTS:
				return readableElements != null && !readableElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstrumentationInterfaceImpl
