/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preference Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup#getLinkedPreferences <em>Linked Preferences</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup#getPreferencegroups <em>Preferencegroups</em>}</li>
 * </ul>
 *
 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getPreferenceGroup()
 * @model
 * @generated
 */
public interface PreferenceGroup extends Layoutable {
	/**
	 * Returns the value of the '<em><b>Preferences</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.Preference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences</em>' containment reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getPreferenceGroup_Preferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Preference> getPreferences();

	/**
	 * Returns the value of the '<em><b>Linked Preferences</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.Preference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Preferences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Preferences</em>' reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getPreferenceGroup_LinkedPreferences()
	 * @model
	 * @generated
	 */
	EList<Preference> getLinkedPreferences();

	/**
	 * Returns the value of the '<em><b>Preferencegroups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.PreferenceGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferencegroups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferencegroups</em>' containment reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getPreferenceGroup_Preferencegroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<PreferenceGroup> getPreferencegroups();

} // PreferenceGroup
