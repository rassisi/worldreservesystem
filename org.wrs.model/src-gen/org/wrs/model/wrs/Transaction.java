/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.Transaction#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.wrs.model.wrs.Transaction#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link org.wrs.model.wrs.Transaction#getData <em>Data</em>}</li>
 *   <li>{@link org.wrs.model.wrs.Transaction#getNanoTime <em>Nano Time</em>}</li>
 *   <li>{@link org.wrs.model.wrs.Transaction#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.wrs.model.wrs.Transaction#getTransactioncondition <em>Transactioncondition</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends AbstractTransaction {
	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference.
	 * @see #setAssets(Asset)
	 * @see org.wrs.model.wrs.WrsPackage#getTransaction_Assets()
	 * @model
	 * @generated
	 */
	Asset getAssets();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.Transaction#getAssets <em>Assets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assets</em>' reference.
	 * @see #getAssets()
	 * @generated
	 */
	void setAssets(Asset value);

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.AbstractAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getTransaction_Transactions()
	 * @model
	 * @generated
	 */
	EList<AbstractAccount> getTransactions();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see org.wrs.model.wrs.WrsPackage#getTransaction_Data()
	 * @model default=""
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.Transaction#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Nano Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nano Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nano Time</em>' attribute.
	 * @see #setNanoTime(double)
	 * @see org.wrs.model.wrs.WrsPackage#getTransaction_NanoTime()
	 * @model
	 * @generated
	 */
	double getNanoTime();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.Transaction#getNanoTime <em>Nano Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nano Time</em>' attribute.
	 * @see #getNanoTime()
	 * @generated
	 */
	void setNanoTime(double value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see org.wrs.model.wrs.WrsPackage#getTransaction_Amount()
	 * @model
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.Transaction#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

	/**
	 * Returns the value of the '<em><b>Transactioncondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactioncondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactioncondition</em>' containment reference.
	 * @see #setTransactioncondition(TransactionCondition)
	 * @see org.wrs.model.wrs.WrsPackage#getTransaction_Transactioncondition()
	 * @model containment="true"
	 * @generated
	 */
	TransactionCondition getTransactioncondition();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.Transaction#getTransactioncondition <em>Transactioncondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactioncondition</em>' containment reference.
	 * @see #getTransactioncondition()
	 * @generated
	 */
	void setTransactioncondition(TransactionCondition value);

} // Transaction
