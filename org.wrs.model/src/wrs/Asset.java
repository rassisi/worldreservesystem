/**
 */
package wrs;

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
 *   <li>{@link wrs.Asset#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link wrs.Asset#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @see wrs.WrsPackage#getAsset()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Asset extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Asset Type</b></em>' attribute.
	 * The default value is <code>"UDOLLAR"</code>.
	 * The literals are from the enumeration {@link wrs.AssetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Type</em>' attribute.
	 * @see wrs.AssetType
	 * @see #setAssetType(AssetType)
	 * @see wrs.WrsPackage#getAsset_AssetType()
	 * @model default="UDOLLAR"
	 * @generated
	 */
	AssetType getAssetType();

	/**
	 * Sets the value of the '{@link wrs.Asset#getAssetType <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Type</em>' attribute.
	 * @see wrs.AssetType
	 * @see #getAssetType()
	 * @generated
	 */
	void setAssetType(AssetType value);

	/**
	 * Returns the value of the '<em><b>Materials</b></em>' reference list.
	 * The list contents are of type {@link wrs.Thing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Materials</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materials</em>' reference list.
	 * @see wrs.WrsPackage#getAsset_Materials()
	 * @model
	 * @generated
	 */
	EList<Thing> getMaterials();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void register();

} // Asset
