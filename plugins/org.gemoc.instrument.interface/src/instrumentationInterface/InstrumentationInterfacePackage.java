/**
 */
package instrumentationInterface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see instrumentationInterface.InstrumentationInterfaceFactory
 * @model kind="package"
 * @generated
 */
public interface InstrumentationInterfacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instrumentationInterface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gemoc.org/instrument/InstrumentationInterface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instrumentationInterface";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstrumentationInterfacePackage eINSTANCE = instrumentationInterface.impl.InstrumentationInterfacePackageImpl.init();

	/**
	 * The meta object id for the '{@link instrumentationInterface.impl.InstrumentableElementImpl <em>Instrumentable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instrumentationInterface.impl.InstrumentableElementImpl
	 * @see instrumentationInterface.impl.InstrumentationInterfacePackageImpl#getInstrumentableElement()
	 * @generated
	 */
	int INSTRUMENTABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTABLE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Instrumentable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instrumentable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link instrumentationInterface.impl.CallableElementImpl <em>Callable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instrumentationInterface.impl.CallableElementImpl
	 * @see instrumentationInterface.impl.InstrumentationInterfacePackageImpl#getCallableElement()
	 * @generated
	 */
	int CALLABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__NAME = INSTRUMENTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__ELEMENT = INSTRUMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Callable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT_FEATURE_COUNT = INSTRUMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Callable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT_OPERATION_COUNT = INSTRUMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instrumentationInterface.impl.ReadableElementImpl <em>Readable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instrumentationInterface.impl.ReadableElementImpl
	 * @see instrumentationInterface.impl.InstrumentationInterfacePackageImpl#getReadableElement()
	 * @generated
	 */
	int READABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READABLE_ELEMENT__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READABLE_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Readable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Readable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link instrumentationInterface.impl.WriteableElementImpl <em>Writeable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instrumentationInterface.impl.WriteableElementImpl
	 * @see instrumentationInterface.impl.InstrumentationInterfacePackageImpl#getWriteableElement()
	 * @generated
	 */
	int WRITEABLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITEABLE_ELEMENT__NAME = INSTRUMENTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITEABLE_ELEMENT__ELEMENT = INSTRUMENTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Writeable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITEABLE_ELEMENT_FEATURE_COUNT = INSTRUMENTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Writeable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITEABLE_ELEMENT_OPERATION_COUNT = INSTRUMENTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link instrumentationInterface.impl.InstrumentationInterfaceImpl <em>Instrumentation Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see instrumentationInterface.impl.InstrumentationInterfaceImpl
	 * @see instrumentationInterface.impl.InstrumentationInterfacePackageImpl#getInstrumentationInterface()
	 * @generated
	 */
	int INSTRUMENTATION_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Instrumentable Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_INTERFACE__INSTRUMENTABLE_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Readable Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_INTERFACE__READABLE_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Instrumentation Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instrumentation Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUMENTATION_INTERFACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link instrumentationInterface.CallableElement <em>Callable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Element</em>'.
	 * @see instrumentationInterface.CallableElement
	 * @generated
	 */
	EClass getCallableElement();

	/**
	 * Returns the meta object for the reference '{@link instrumentationInterface.CallableElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see instrumentationInterface.CallableElement#getElement()
	 * @see #getCallableElement()
	 * @generated
	 */
	EReference getCallableElement_Element();

	/**
	 * Returns the meta object for class '{@link instrumentationInterface.ReadableElement <em>Readable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Readable Element</em>'.
	 * @see instrumentationInterface.ReadableElement
	 * @generated
	 */
	EClass getReadableElement();

	/**
	 * Returns the meta object for the reference '{@link instrumentationInterface.ReadableElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see instrumentationInterface.ReadableElement#getElement()
	 * @see #getReadableElement()
	 * @generated
	 */
	EReference getReadableElement_Element();

	/**
	 * Returns the meta object for the attribute '{@link instrumentationInterface.ReadableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see instrumentationInterface.ReadableElement#getName()
	 * @see #getReadableElement()
	 * @generated
	 */
	EAttribute getReadableElement_Name();

	/**
	 * Returns the meta object for class '{@link instrumentationInterface.WriteableElement <em>Writeable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writeable Element</em>'.
	 * @see instrumentationInterface.WriteableElement
	 * @generated
	 */
	EClass getWriteableElement();

	/**
	 * Returns the meta object for the reference '{@link instrumentationInterface.WriteableElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see instrumentationInterface.WriteableElement#getElement()
	 * @see #getWriteableElement()
	 * @generated
	 */
	EReference getWriteableElement_Element();

	/**
	 * Returns the meta object for class '{@link instrumentationInterface.InstrumentableElement <em>Instrumentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instrumentable Element</em>'.
	 * @see instrumentationInterface.InstrumentableElement
	 * @generated
	 */
	EClass getInstrumentableElement();

	/**
	 * Returns the meta object for the attribute '{@link instrumentationInterface.InstrumentableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see instrumentationInterface.InstrumentableElement#getName()
	 * @see #getInstrumentableElement()
	 * @generated
	 */
	EAttribute getInstrumentableElement_Name();

	/**
	 * Returns the meta object for class '{@link instrumentationInterface.InstrumentationInterface <em>Instrumentation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instrumentation Interface</em>'.
	 * @see instrumentationInterface.InstrumentationInterface
	 * @generated
	 */
	EClass getInstrumentationInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link instrumentationInterface.InstrumentationInterface#getInstrumentableElements <em>Instrumentable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instrumentable Elements</em>'.
	 * @see instrumentationInterface.InstrumentationInterface#getInstrumentableElements()
	 * @see #getInstrumentationInterface()
	 * @generated
	 */
	EReference getInstrumentationInterface_InstrumentableElements();

	/**
	 * Returns the meta object for the reference list '{@link instrumentationInterface.InstrumentationInterface#getReadableElements <em>Readable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Readable Elements</em>'.
	 * @see instrumentationInterface.InstrumentationInterface#getReadableElements()
	 * @see #getInstrumentationInterface()
	 * @generated
	 */
	EReference getInstrumentationInterface_ReadableElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstrumentationInterfaceFactory getInstrumentationInterfaceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link instrumentationInterface.impl.CallableElementImpl <em>Callable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instrumentationInterface.impl.CallableElementImpl
		 * @see instrumentationInterface.impl.InstrumentationInterfacePackageImpl#getCallableElement()
		 * @generated
		 */
		EClass CALLABLE_ELEMENT = eINSTANCE.getCallableElement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_ELEMENT__ELEMENT = eINSTANCE.getCallableElement_Element();

		/**
		 * The meta object literal for the '{@link instrumentationInterface.impl.ReadableElementImpl <em>Readable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instrumentationInterface.impl.ReadableElementImpl
		 * @see instrumentationInterface.impl.InstrumentationInterfacePackageImpl#getReadableElement()
		 * @generated
		 */
		EClass READABLE_ELEMENT = eINSTANCE.getReadableElement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READABLE_ELEMENT__ELEMENT = eINSTANCE.getReadableElement_Element();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READABLE_ELEMENT__NAME = eINSTANCE.getReadableElement_Name();

		/**
		 * The meta object literal for the '{@link instrumentationInterface.impl.WriteableElementImpl <em>Writeable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instrumentationInterface.impl.WriteableElementImpl
		 * @see instrumentationInterface.impl.InstrumentationInterfacePackageImpl#getWriteableElement()
		 * @generated
		 */
		EClass WRITEABLE_ELEMENT = eINSTANCE.getWriteableElement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITEABLE_ELEMENT__ELEMENT = eINSTANCE.getWriteableElement_Element();

		/**
		 * The meta object literal for the '{@link instrumentationInterface.impl.InstrumentableElementImpl <em>Instrumentable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instrumentationInterface.impl.InstrumentableElementImpl
		 * @see instrumentationInterface.impl.InstrumentationInterfacePackageImpl#getInstrumentableElement()
		 * @generated
		 */
		EClass INSTRUMENTABLE_ELEMENT = eINSTANCE.getInstrumentableElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUMENTABLE_ELEMENT__NAME = eINSTANCE.getInstrumentableElement_Name();

		/**
		 * The meta object literal for the '{@link instrumentationInterface.impl.InstrumentationInterfaceImpl <em>Instrumentation Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see instrumentationInterface.impl.InstrumentationInterfaceImpl
		 * @see instrumentationInterface.impl.InstrumentationInterfacePackageImpl#getInstrumentationInterface()
		 * @generated
		 */
		EClass INSTRUMENTATION_INTERFACE = eINSTANCE.getInstrumentationInterface();

		/**
		 * The meta object literal for the '<em><b>Instrumentable Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUMENTATION_INTERFACE__INSTRUMENTABLE_ELEMENTS = eINSTANCE.getInstrumentationInterface_InstrumentableElements();

		/**
		 * The meta object literal for the '<em><b>Readable Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUMENTATION_INTERFACE__READABLE_ELEMENTS = eINSTANCE.getInstrumentationInterface_ReadableElements();

	}

} //InstrumentationInterfacePackage
