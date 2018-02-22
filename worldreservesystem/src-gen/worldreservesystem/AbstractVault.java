/**
 */
package worldreservesystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Vault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.AbstractVault#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @see worldreservesystem.WorldreservesystemPackage#getAbstractVault()
 * @model
 * @generated
 */
public interface AbstractVault extends EObject {
	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link worldreservesystem.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see worldreservesystem.WorldreservesystemPackage#getAbstractVault_Assets()
	 * @model
	 * @generated
	 */
	EList<Asset> getAssets();

} // AbstractVault
