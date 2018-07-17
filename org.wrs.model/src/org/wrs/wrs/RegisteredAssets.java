/**
 */
package org.wrs.wrs;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered Assets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.RegisteredAssets#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.wrs.wrs.WrsPackage#getRegisteredAssets()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface RegisteredAssets extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.wrs.wrs.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.wrs.wrs.WrsPackage#getRegisteredAssets_Children()
	 * @model
	 * @generated
	 */
	EList<Asset> getChildren();

} // RegisteredAssets
