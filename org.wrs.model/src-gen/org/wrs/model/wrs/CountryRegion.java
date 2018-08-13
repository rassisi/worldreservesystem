/**
 */
package org.wrs.model.wrs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.CountryRegion#getRegionaleconomy <em>Regionaleconomy</em>}</li>
 *   <li>{@link org.wrs.model.wrs.CountryRegion#getRegionidentities <em>Regionidentities</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getCountryRegion()
 * @model
 * @generated
 */
public interface CountryRegion extends Layoutable {

	/**
	 * Returns the value of the '<em><b>Regionaleconomy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regionaleconomy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regionaleconomy</em>' containment reference.
	 * @see #setRegionaleconomy(regionalEconomy)
	 * @see org.wrs.model.wrs.WrsPackage#getCountryRegion_Regionaleconomy()
	 * @model containment="true"
	 * @generated
	 */
	regionalEconomy getRegionaleconomy();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.CountryRegion#getRegionaleconomy <em>Regionaleconomy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regionaleconomy</em>' containment reference.
	 * @see #getRegionaleconomy()
	 * @generated
	 */
	void setRegionaleconomy(regionalEconomy value);

	/**
	 * Returns the value of the '<em><b>Regionidentities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regionidentities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regionidentities</em>' containment reference.
	 * @see #setRegionidentities(RegionIdentities)
	 * @see org.wrs.model.wrs.WrsPackage#getCountryRegion_Regionidentities()
	 * @model containment="true"
	 * @generated
	 */
	RegionIdentities getRegionidentities();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.CountryRegion#getRegionidentities <em>Regionidentities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regionidentities</em>' containment reference.
	 * @see #getRegionidentities()
	 * @generated
	 */
	void setRegionidentities(RegionIdentities value);
} // CountryRegion
