/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Menu Tools</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.StartMenuTools#getStartMenuTools <em>Start Menu Tools</em>}</li>
 * </ul>
 *
 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getStartMenuTools()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface StartMenuTools extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Start Menu Tools</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.Tool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Menu Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Menu Tools</em>' containment reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getStartMenuTools_StartMenuTools()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getStartMenuTools();

} // StartMenuTools
