/**
 */
package instrumentationInterface.util;

import instrumentationInterface.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see instrumentationInterface.InstrumentationInterfacePackage
 * @generated
 */
public class InstrumentationInterfaceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstrumentationInterfacePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstrumentationInterfaceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InstrumentationInterfacePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstrumentationInterfaceSwitch<Adapter> modelSwitch =
		new InstrumentationInterfaceSwitch<Adapter>() {
			@Override
			public Adapter caseCallableElement(CallableElement object) {
				return createCallableElementAdapter();
			}
			@Override
			public Adapter caseReadableElement(ReadableElement object) {
				return createReadableElementAdapter();
			}
			@Override
			public Adapter caseWriteableElement(WriteableElement object) {
				return createWriteableElementAdapter();
			}
			@Override
			public Adapter caseInstrumentableElement(InstrumentableElement object) {
				return createInstrumentableElementAdapter();
			}
			@Override
			public Adapter caseInstrumentationInterface(InstrumentationInterface object) {
				return createInstrumentationInterfaceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link instrumentationInterface.CallableElement <em>Callable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instrumentationInterface.CallableElement
	 * @generated
	 */
	public Adapter createCallableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instrumentationInterface.ReadableElement <em>Readable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instrumentationInterface.ReadableElement
	 * @generated
	 */
	public Adapter createReadableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instrumentationInterface.WriteableElement <em>Writeable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instrumentationInterface.WriteableElement
	 * @generated
	 */
	public Adapter createWriteableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instrumentationInterface.InstrumentableElement <em>Instrumentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instrumentationInterface.InstrumentableElement
	 * @generated
	 */
	public Adapter createInstrumentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link instrumentationInterface.InstrumentationInterface <em>Instrumentation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see instrumentationInterface.InstrumentationInterface
	 * @generated
	 */
	public Adapter createInstrumentationInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InstrumentationInterfaceAdapterFactory
