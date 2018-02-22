/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.Asset#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link org.worldreservesystem.Asset#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @see org.worldreservesystem.WorldreservesystemPackage#getAsset()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Asset extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Asset Type</b></em>' attribute.
	 * The default value is <code>"UDOLLAR"</code>.
	 * The literals are from the enumeration {@link org.worldreservesystem.AssetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Type</em>' attribute.
	 * @see org.worldreservesystem.AssetType
	 * @see #setAssetType(AssetType)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getAsset_AssetType()
	 * @model default="UDOLLAR"
	 * @generated
	 */
	AssetType getAssetType();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.Asset#getAssetType <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Type</em>' attribute.
	 * @see org.worldreservesystem.AssetType
	 * @see #getAssetType()
	 * @generated
	 */
	void setAssetType(AssetType value);

	/**
	 * Returns the value of the '<em><b>Materials</b></em>' reference list.
	 * The list contents are of type {@link org.worldreservesystem.Material}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Materials</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materials</em>' reference list.
	 * @see org.worldreservesystem.WorldreservesystemPackage#getAsset_Materials()
	 * @model
	 * @generated
	 */
	EList<Material> getMaterials();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void register();

} // Asset
