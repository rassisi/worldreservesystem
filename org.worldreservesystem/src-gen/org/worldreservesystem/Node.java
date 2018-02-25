/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.Node#getWorldreservesystem <em>Worldreservesystem</em>}</li>
 *   <li>{@link org.worldreservesystem.Node#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.worldreservesystem.Node#getNetworkengine <em>Networkengine</em>}</li>
 * </ul>
 *
 * @see org.worldreservesystem.WorldreservesystemPackage#getNode()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Node extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Worldreservesystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worldreservesystem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worldreservesystem</em>' containment reference.
	 * @see #setWorldreservesystem(WorldReserveSystem)
	 * @see org.worldreservesystem.WorldreservesystemPackage#getNode_Worldreservesystem()
	 * @model containment="true"
	 * @generated
	 */
	WorldReserveSystem getWorldreservesystem();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.Node#getWorldreservesystem <em>Worldreservesystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worldreservesystem</em>' containment reference.
	 * @see #getWorldreservesystem()
	 * @generated
	 */
	void setWorldreservesystem(WorldReserveSystem value);

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
	 * @see org.worldreservesystem.WorldreservesystemPackage#getNode_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.Node#getWeight <em>Weight</em>}' attribute.
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
	 * @see org.worldreservesystem.WorldreservesystemPackage#getNode_Networkengine()
	 * @model required="true"
	 * @generated
	 */
	NetworkEngine getNetworkengine();

	/**
	 * Sets the value of the '{@link org.worldreservesystem.Node#getNetworkengine <em>Networkengine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networkengine</em>' reference.
	 * @see #getNetworkengine()
	 * @generated
	 */
	void setNetworkengine(NetworkEngine value);

} // Node
