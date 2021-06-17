/**
 */
package instrumentationInterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instrumentation Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instrumentationInterface.InstrumentationInterface#getInstrumentableElements <em>Instrumentable Elements</em>}</li>
 *   <li>{@link instrumentationInterface.InstrumentationInterface#getReadableElements <em>Readable Elements</em>}</li>
 * </ul>
 *
 * @see instrumentationInterface.InstrumentationInterfacePackage#getInstrumentationInterface()
 * @model
 * @generated
 */
public interface InstrumentationInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Instrumentable Elements</b></em>' containment reference list.
	 * The list contents are of type {@link instrumentationInterface.InstrumentableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrumentable Elements</em>' containment reference list.
	 * @see instrumentationInterface.InstrumentationInterfacePackage#getInstrumentationInterface_InstrumentableElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstrumentableElement> getInstrumentableElements();

	/**
	 * Returns the value of the '<em><b>Readable Elements</b></em>' reference list.
	 * The list contents are of type {@link instrumentationInterface.ReadableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readable Elements</em>' reference list.
	 * @see instrumentationInterface.InstrumentationInterfacePackage#getInstrumentationInterface_ReadableElements()
	 * @model
	 * @generated
	 */
	EList<ReadableElement> getReadableElements();

} // InstrumentationInterface
