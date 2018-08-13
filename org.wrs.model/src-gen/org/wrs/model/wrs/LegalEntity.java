/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.LegalEntity#getType <em>Type</em>}</li>
 *   <li>{@link org.wrs.model.wrs.LegalEntity#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.wrs.model.wrs.LegalEntity#getBusinessAccounts <em>Business Accounts</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getLegalEntity()
 * @model
 * @generated
 */
public interface LegalEntity extends HumanEntity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wrs.model.wrs.LegalEntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.wrs.model.wrs.LegalEntityType
	 * @see #setType(LegalEntityType)
	 * @see org.wrs.model.wrs.WrsPackage#getLegalEntity_Type()
	 * @model
	 * @generated
	 */
	LegalEntityType getType();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.LegalEntity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.wrs.model.wrs.LegalEntityType
	 * @see #getType()
	 * @generated
	 */
	void setType(LegalEntityType value);

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.AbstractAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getLegalEntity_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractAccount> getAccounts();

	/**
	 * Returns the value of the '<em><b>Business Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.BusinessAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Accounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Accounts</em>' containment reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getLegalEntity_BusinessAccounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessAccount> getBusinessAccounts();

} // LegalEntity
