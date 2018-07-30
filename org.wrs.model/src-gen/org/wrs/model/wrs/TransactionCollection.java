/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.TransactionCollection#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getTransactionCollection()
 * @model
 * @generated
 */
public interface TransactionCollection extends AbstractTransaction {

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.Transaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getTransactionCollection_Transactions()
	 * @model
	 * @generated
	 */
	EList<Transaction> getTransactions();
} // TransactionCollection
