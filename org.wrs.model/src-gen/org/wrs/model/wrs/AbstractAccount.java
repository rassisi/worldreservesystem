/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.AbstractAccount#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.wrs.model.wrs.AbstractAccount#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.wrs.model.wrs.AbstractAccount#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getAbstractAccount()
 * @model
 * @generated
 */
public interface AbstractAccount extends EObject {
	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getAbstractAccount_Assets()
	 * @model
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' reference.
	 * @see #setTransaction(Transaction)
	 * @see org.wrs.model.wrs.WrsPackage#getAbstractAccount_Transaction()
	 * @model
	 * @generated
	 */
	Transaction getTransaction();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.AbstractAccount#getTransaction <em>Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' reference.
	 * @see #getTransaction()
	 * @generated
	 */
	void setTransaction(Transaction value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(Identity)
	 * @see org.wrs.model.wrs.WrsPackage#getAbstractAccount_BelongsTo()
	 * @model
	 * @generated
	 */
	Identity getBelongsTo();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.AbstractAccount#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(Identity value);

} // AbstractAccount
