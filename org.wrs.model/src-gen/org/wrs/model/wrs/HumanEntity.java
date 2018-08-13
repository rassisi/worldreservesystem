/**
 */
package org.wrs.model.wrs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Human Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.HumanEntity#getWorldeconomy <em>Worldeconomy</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getHumanEntity()
 * @model abstract="true"
 * @generated
 */
public interface HumanEntity extends Identity {

	/**
	 * Returns the value of the '<em><b>Worldeconomy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worldeconomy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worldeconomy</em>' reference.
	 * @see #setWorldeconomy(WorldEconomy)
	 * @see org.wrs.model.wrs.WrsPackage#getHumanEntity_Worldeconomy()
	 * @model
	 * @generated
	 */
	WorldEconomy getWorldeconomy();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.HumanEntity#getWorldeconomy <em>Worldeconomy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worldeconomy</em>' reference.
	 * @see #getWorldeconomy()
	 * @generated
	 */
	void setWorldeconomy(WorldEconomy value);
} // HumanEntity
