/**
 */
package instrumentationInterface.impl;

import instrumentationInterface.CallableElement;
import instrumentationInterface.InstrumentableElement;
import instrumentationInterface.InstrumentationInterface;
import instrumentationInterface.InstrumentationInterfaceFactory;
import instrumentationInterface.InstrumentationInterfacePackage;
import instrumentationInterface.ReadableElement;
import instrumentationInterface.WriteableElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstrumentationInterfacePackageImpl extends EPackageImpl implements InstrumentationInterfacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instrumentableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instrumentationInterfaceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see instrumentationInterface.InstrumentationInterfacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstrumentationInterfacePackageImpl() {
		super(eNS_URI, InstrumentationInterfaceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link InstrumentationInterfacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstrumentationInterfacePackage init() {
		if (isInited) return (InstrumentationInterfacePackage)EPackage.Registry.INSTANCE.getEPackage(InstrumentationInterfacePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInstrumentationInterfacePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InstrumentationInterfacePackageImpl theInstrumentationInterfacePackage = registeredInstrumentationInterfacePackage instanceof InstrumentationInterfacePackageImpl ? (InstrumentationInterfacePackageImpl)registeredInstrumentationInterfacePackage : new InstrumentationInterfacePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theInstrumentationInterfacePackage.createPackageContents();

		// Initialize created meta-data
		theInstrumentationInterfacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstrumentationInterfacePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstrumentationInterfacePackage.eNS_URI, theInstrumentationInterfacePackage);
		return theInstrumentationInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallableElement() {
		return callableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallableElement_Element() {
		return (EReference)callableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadableElement() {
		return readableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadableElement_Element() {
		return (EReference)readableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadableElement_Name() {
		return (EAttribute)readableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteableElement() {
		return writeableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteableElement_Element() {
		return (EReference)writeableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstrumentableElement() {
		return instrumentableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstrumentableElement_Name() {
		return (EAttribute)instrumentableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstrumentationInterface() {
		return instrumentationInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstrumentationInterface_InstrumentableElements() {
		return (EReference)instrumentationInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstrumentationInterface_ReadableElements() {
		return (EReference)instrumentationInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstrumentationInterfaceFactory getInstrumentationInterfaceFactory() {
		return (InstrumentationInterfaceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		callableElementEClass = createEClass(CALLABLE_ELEMENT);
		createEReference(callableElementEClass, CALLABLE_ELEMENT__ELEMENT);

		readableElementEClass = createEClass(READABLE_ELEMENT);
		createEReference(readableElementEClass, READABLE_ELEMENT__ELEMENT);
		createEAttribute(readableElementEClass, READABLE_ELEMENT__NAME);

		writeableElementEClass = createEClass(WRITEABLE_ELEMENT);
		createEReference(writeableElementEClass, WRITEABLE_ELEMENT__ELEMENT);

		instrumentableElementEClass = createEClass(INSTRUMENTABLE_ELEMENT);
		createEAttribute(instrumentableElementEClass, INSTRUMENTABLE_ELEMENT__NAME);

		instrumentationInterfaceEClass = createEClass(INSTRUMENTATION_INTERFACE);
		createEReference(instrumentationInterfaceEClass, INSTRUMENTATION_INTERFACE__INSTRUMENTABLE_ELEMENTS);
		createEReference(instrumentationInterfaceEClass, INSTRUMENTATION_INTERFACE__READABLE_ELEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		callableElementEClass.getESuperTypes().add(this.getInstrumentableElement());
		writeableElementEClass.getESuperTypes().add(this.getInstrumentableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(callableElementEClass, CallableElement.class, "CallableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallableElement_Element(), ecorePackage.getEObject(), null, "element", null, 1, 1, CallableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readableElementEClass, ReadableElement.class, "ReadableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadableElement_Element(), ecorePackage.getEObject(), null, "element", null, 1, 1, ReadableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadableElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, ReadableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writeableElementEClass, WriteableElement.class, "WriteableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteableElement_Element(), ecorePackage.getEObject(), null, "element", null, 1, 1, WriteableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instrumentableElementEClass, InstrumentableElement.class, "InstrumentableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstrumentableElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, InstrumentableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instrumentationInterfaceEClass, InstrumentationInterface.class, "InstrumentationInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstrumentationInterface_InstrumentableElements(), this.getInstrumentableElement(), null, "instrumentableElements", null, 0, -1, InstrumentationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstrumentationInterface_ReadableElements(), this.getReadableElement(), null, "readableElements", null, 0, -1, InstrumentationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //InstrumentationInterfacePackageImpl
