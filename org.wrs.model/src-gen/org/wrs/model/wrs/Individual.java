/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.Individual#getWorksFor <em>Works For</em>}</li>
 *   <li>{@link org.wrs.model.wrs.Individual#getLegalPartnerOf <em>Legal Partner Of</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getIndividual()
 * @model
 * @generated
 */
public interface Individual extends Identity {
	/**
	 * Returns the value of the '<em><b>Works For</b></em>' reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.LegalEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works For</em>' reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getIndividual_WorksFor()
	 * @model
	 * @generated
	 */
	EList<LegalEntity> getWorksFor();

	/**
	 * Returns the value of the '<em><b>Legal Partner Of</b></em>' reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.LegalEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legal Partner Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal Partner Of</em>' reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getIndividual_LegalPartnerOf()
	 * @model
	 * @generated
	 */
	EList<LegalEntity> getLegalPartnerOf();

} // Individual