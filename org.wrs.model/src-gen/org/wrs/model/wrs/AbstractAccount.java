/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

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
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getAbstractAccount()
 * @model abstract="true"
 * @generated
 */
public interface AbstractAccount extends Layoutable {
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
	 * Returns the value of the '<em><b>Transaction</b></em>' reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.Transaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getAbstractAccount_Transaction()
	 * @model
	 * @generated
	 */
	EList<Transaction> getTransaction();

} // AbstractAccount
