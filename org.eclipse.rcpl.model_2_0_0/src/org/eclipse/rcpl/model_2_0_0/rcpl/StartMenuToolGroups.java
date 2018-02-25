/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Menu Tool Groups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.StartMenuToolGroups#getStartMenuToolGroups <em>Start Menu Tool Groups</em>}</li>
 * </ul>
 *
 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getStartMenuToolGroups()
 * @model
 * @generated
 */
public interface StartMenuToolGroups extends Layoutable {
	/**
	 * Returns the value of the '<em><b>Start Menu Tool Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Menu Tool Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Menu Tool Groups</em>' containment reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getStartMenuToolGroups_StartMenuToolGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToolGroup> getStartMenuToolGroups();

} // StartMenuToolGroups
