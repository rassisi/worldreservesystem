/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package worldreservesystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered Asstets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.RegisteredAsstets#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see worldreservesystem.WorldreservesystemPackage#getRegisteredAsstets()
 * @model
 * @generated
 */
public interface RegisteredAsstets extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link worldreservesystem.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see worldreservesystem.WorldreservesystemPackage#getRegisteredAsstets_Children()
	 * @model
	 * @generated
	 */
	EList<Asset> getChildren();

} // RegisteredAsstets
