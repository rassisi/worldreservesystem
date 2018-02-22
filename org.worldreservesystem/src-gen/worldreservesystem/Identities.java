/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package worldreservesystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.Identities#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see worldreservesystem.WorldreservesystemPackage#getIdentities()
 * @model
 * @generated
 */
public interface Identities extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link worldreservesystem.Identity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see worldreservesystem.WorldreservesystemPackage#getIdentities_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identity> getChildren();

} // Identities
