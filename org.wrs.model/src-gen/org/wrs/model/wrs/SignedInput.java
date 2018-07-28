/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signed Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.SignedInput#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.wrs.model.wrs.SignedInput#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.wrs.model.wrs.SignedInput#getValue <em>Value</em>}</li>
 *   <li>{@link org.wrs.model.wrs.SignedInput#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getSignedInput()
 * @model
 * @generated
 */
public interface SignedInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see org.wrs.model.wrs.WrsPackage#getSignedInput_VariableName()
	 * @model
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.SignedInput#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' reference.
	 * @see #setIdentity(Identity)
	 * @see org.wrs.model.wrs.WrsPackage#getSignedInput_Identity()
	 * @model
	 * @generated
	 */
	Identity getIdentity();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.SignedInput#getIdentity <em>Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' reference.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(Identity value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.wrs.model.wrs.WrsPackage#getSignedInput_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.SignedInput#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.wrs.model.wrs.InputValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.wrs.model.wrs.InputValueType
	 * @see #setType(InputValueType)
	 * @see org.wrs.model.wrs.WrsPackage#getSignedInput_Type()
	 * @model
	 * @generated
	 */
	InputValueType getType();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.SignedInput#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.wrs.model.wrs.InputValueType
	 * @see #getType()
	 * @generated
	 */
	void setType(InputValueType value);

} // SignedInput
