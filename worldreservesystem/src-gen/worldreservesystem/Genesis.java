/**
 */
package worldreservesystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.Genesis#getMainvault <em>Mainvault</em>}</li>
 * </ul>
 *
 * @see worldreservesystem.WorldreservesystemPackage#getGenesis()
 * @model
 * @generated
 */
public interface Genesis extends EObject {
	/**
	 * Returns the value of the '<em><b>Mainvault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mainvault</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainvault</em>' reference.
	 * @see #setMainvault(MainVault)
	 * @see worldreservesystem.WorldreservesystemPackage#getGenesis_Mainvault()
	 * @model required="true"
	 * @generated
	 */
	MainVault getMainvault();

	/**
	 * Sets the value of the '{@link worldreservesystem.Genesis#getMainvault <em>Mainvault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mainvault</em>' reference.
	 * @see #getMainvault()
	 * @generated
	 */
	void setMainvault(MainVault value);

} // Genesis
