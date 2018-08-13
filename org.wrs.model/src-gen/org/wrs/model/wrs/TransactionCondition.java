/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.TransactionCondition#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.wrs.model.wrs.TransactionCondition#getSignedInputs <em>Signed Inputs</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getTransactionCondition()
 * @model
 * @generated
 */
public interface TransactionCondition extends Layoutable {
	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see org.wrs.model.wrs.WrsPackage#getTransactionCondition_Formula()
	 * @model
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.TransactionCondition#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

	/**
	 * Returns the value of the '<em><b>Signed Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.SignedInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signed Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signed Inputs</em>' containment reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getTransactionCondition_SignedInputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignedInput> getSignedInputs();

} // TransactionCondition
