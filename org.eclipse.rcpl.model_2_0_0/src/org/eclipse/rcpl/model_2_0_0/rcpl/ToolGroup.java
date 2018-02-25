/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Tool Group</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getToolGroups <em>Tool Groups</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#isGrid <em>Grid</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getFormat <em>Format</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getTools <em>Tools</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getToolGroup()
 * @model
 * @generated
 */
public interface ToolGroup extends AbstractTool {
	/**
	 * Returns the value of the '<em><b>Tool Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Tool Groups</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Groups</em>' containment reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getToolGroup_ToolGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToolGroup> getToolGroups();

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.Tool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tools</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getToolGroup_Tools()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Grid</em>' attribute.
	 * @see #setGrid(boolean)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getToolGroup_Grid()
	 * @model
	 * @generated
	 */
	boolean isGrid();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#isGrid <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' attribute.
	 * @see #isGrid()
	 * @generated
	 */
	void setGrid(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rcpl.model_2_0_0.rcpl.GroupType}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.GroupType
	 * @see #setType(GroupType)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getToolGroup_Type()
	 * @model
	 * @generated
	 */
	GroupType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.GroupType
	 * @see #getType()
	 * @generated
	 */
	void setType(GroupType value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getToolGroup_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup#getFormat
	 * <em>Format</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	void setReady(boolean ready);

} // ToolGroup
