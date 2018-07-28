/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.Nodes#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getNodes()
 * @model
 * @generated
 */
public interface Nodes extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getNodes_Children()
	 * @model
	 * @generated
	 */
	EList<Node> getChildren();

} // Nodes
