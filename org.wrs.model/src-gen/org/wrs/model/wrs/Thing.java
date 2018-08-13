/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.Thing#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link org.wrs.model.wrs.Thing#getThingAccounts <em>Thing Accounts</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends Identity {
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
	 * @see org.wrs.model.wrs.WrsPackage#getThing_BelongsTo()
	 * @model
	 * @generated
	 */
	Identity getBelongsTo();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.Thing#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(Identity value);

	/**
	 * Returns the value of the '<em><b>Thing Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.ThingAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thing Accounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thing Accounts</em>' containment reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getThing_ThingAccounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThingAccount> getThingAccounts();

} // Thing
