/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.Node#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.wrs.model.wrs.Node#getNetworkengine <em>Networkengine</em>}</li>
 *   <li>{@link org.wrs.model.wrs.Node#getNodeAccounts <em>Node Accounts</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Layoutable {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see org.wrs.model.wrs.WrsPackage#getNode_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.Node#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Networkengine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networkengine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networkengine</em>' reference.
	 * @see #setNetworkengine(NetworkEngine)
	 * @see org.wrs.model.wrs.WrsPackage#getNode_Networkengine()
	 * @model required="true"
	 * @generated
	 */
	NetworkEngine getNetworkengine();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.Node#getNetworkengine <em>Networkengine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networkengine</em>' reference.
	 * @see #getNetworkengine()
	 * @generated
	 */
	void setNetworkengine(NetworkEngine value);

	/**
	 * Returns the value of the '<em><b>Node Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.wrs.model.wrs.NodeAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Accounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Accounts</em>' containment reference list.
	 * @see org.wrs.model.wrs.WrsPackage#getNode_NodeAccounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeAccount> getNodeAccounts();

} // Node
