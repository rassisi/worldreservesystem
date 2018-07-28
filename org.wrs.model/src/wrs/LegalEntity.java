/**
 */
package wrs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wrs.LegalEntity#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see wrs.WrsPackage#getLegalEntity()
 * @model
 * @generated
 */
public interface LegalEntity extends Identity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link wrs.LegalEntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see wrs.LegalEntityType
	 * @see #setType(LegalEntityType)
	 * @see wrs.WrsPackage#getLegalEntity_Type()
	 * @model
	 * @generated
	 */
	LegalEntityType getType();

	/**
	 * Sets the value of the '{@link wrs.LegalEntity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see wrs.LegalEntityType
	 * @see #getType()
	 * @generated
	 */
	void setType(LegalEntityType value);

} // LegalEntity
