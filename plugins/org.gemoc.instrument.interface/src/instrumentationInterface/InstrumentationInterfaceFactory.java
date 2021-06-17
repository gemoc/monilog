/**
 */
package instrumentationInterface;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see instrumentationInterface.InstrumentationInterfacePackage
 * @generated
 */
public interface InstrumentationInterfaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstrumentationInterfaceFactory eINSTANCE = instrumentationInterface.impl.InstrumentationInterfaceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Callable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Callable Element</em>'.
	 * @generated
	 */
	CallableElement createCallableElement();

	/**
	 * Returns a new object of class '<em>Readable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Readable Element</em>'.
	 * @generated
	 */
	ReadableElement createReadableElement();

	/**
	 * Returns a new object of class '<em>Writeable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Writeable Element</em>'.
	 * @generated
	 */
	WriteableElement createWriteableElement();

	/**
	 * Returns a new object of class '<em>Instrumentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instrumentable Element</em>'.
	 * @generated
	 */
	InstrumentableElement createInstrumentableElement();

	/**
	 * Returns a new object of class '<em>Instrumentation Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instrumentation Interface</em>'.
	 * @generated
	 */
	InstrumentationInterface createInstrumentationInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InstrumentationInterfacePackage getInstrumentationInterfacePackage();

} //InstrumentationInterfaceFactory
