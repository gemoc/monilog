/**
 */
package instrumentationInterface.impl;

import instrumentationInterface.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstrumentationInterfaceFactoryImpl extends EFactoryImpl implements InstrumentationInterfaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstrumentationInterfaceFactory init() {
		try {
			InstrumentationInterfaceFactory theInstrumentationInterfaceFactory = (InstrumentationInterfaceFactory)EPackage.Registry.INSTANCE.getEFactory(InstrumentationInterfacePackage.eNS_URI);
			if (theInstrumentationInterfaceFactory != null) {
				return theInstrumentationInterfaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstrumentationInterfaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstrumentationInterfaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InstrumentationInterfacePackage.CALLABLE_ELEMENT: return createCallableElement();
			case InstrumentationInterfacePackage.READABLE_ELEMENT: return createReadableElement();
			case InstrumentationInterfacePackage.WRITEABLE_ELEMENT: return createWriteableElement();
			case InstrumentationInterfacePackage.INSTRUMENTABLE_ELEMENT: return createInstrumentableElement();
			case InstrumentationInterfacePackage.INSTRUMENTATION_INTERFACE: return createInstrumentationInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableElement createCallableElement() {
		CallableElementImpl callableElement = new CallableElementImpl();
		return callableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadableElement createReadableElement() {
		ReadableElementImpl readableElement = new ReadableElementImpl();
		return readableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteableElement createWriteableElement() {
		WriteableElementImpl writeableElement = new WriteableElementImpl();
		return writeableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstrumentableElement createInstrumentableElement() {
		InstrumentableElementImpl instrumentableElement = new InstrumentableElementImpl();
		return instrumentableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstrumentationInterface createInstrumentationInterface() {
		InstrumentationInterfaceImpl instrumentationInterface = new InstrumentationInterfaceImpl();
		return instrumentationInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstrumentationInterfacePackage getInstrumentationInterfacePackage() {
		return (InstrumentationInterfacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstrumentationInterfacePackage getPackage() {
		return InstrumentationInterfacePackage.eINSTANCE;
	}

} //InstrumentationInterfaceFactoryImpl
