/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Favorites</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorites#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorites#getDefaultSetId <em>Default Set Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getFavorites()
 * @model
 * @generated
 */
public interface Favorites extends Layoutable {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.FavoritesGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getFavorites_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FavoritesGroup> getChildren();

	/**
	 * Returns the value of the '<em><b>Default Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Set Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Set Id</em>' attribute.
	 * @see #setDefaultSetId(String)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getFavorites_DefaultSetId()
	 * @model
	 * @generated
	 */
	String getDefaultSetId();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.Favorites#getDefaultSetId <em>Default Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Set Id</em>' attribute.
	 * @see #getDefaultSetId()
	 * @generated
	 */
	void setDefaultSetId(String value);

} // Favorites
