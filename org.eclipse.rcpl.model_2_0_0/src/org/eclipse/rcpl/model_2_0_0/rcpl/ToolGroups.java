/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Groups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroups#getToolGroups <em>Tool Groups</em>}</li>
 * </ul>
 *
 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getToolGroups()
 * @model
 * @generated
 */
public interface ToolGroups extends Layoutable {
	/**
	 * Returns the value of the '<em><b>Tool Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Groups</em>' containment reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getToolGroups_ToolGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToolGroup> getToolGroups();

} // ToolGroups
