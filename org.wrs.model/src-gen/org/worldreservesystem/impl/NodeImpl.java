/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.worldreservesystem.NetworkEngine;
import org.worldreservesystem.Node;
import org.worldreservesystem.WorldReserveSystem;
import org.worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.impl.NodeImpl#getWorldreservesystem <em>Worldreservesystem</em>}</li>
 *   <li>{@link org.worldreservesystem.impl.NodeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.worldreservesystem.impl.NodeImpl#getNetworkengine <em>Networkengine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends CDOObjectImpl implements Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorldreservesystemPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldReserveSystem getWorldreservesystem() {
		return (WorldReserveSystem) eGet(WorldreservesystemPackage.Literals.NODE__WORLDRESERVESYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldreservesystem(WorldReserveSystem newWorldreservesystem) {
		eSet(WorldreservesystemPackage.Literals.NODE__WORLDRESERVESYSTEM, newWorldreservesystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return (Double) eGet(WorldreservesystemPackage.Literals.NODE__WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		eSet(WorldreservesystemPackage.Literals.NODE__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkEngine getNetworkengine() {
		return (NetworkEngine) eGet(WorldreservesystemPackage.Literals.NODE__NETWORKENGINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkengine(NetworkEngine newNetworkengine) {
		eSet(WorldreservesystemPackage.Literals.NODE__NETWORKENGINE, newNetworkengine);
	}

} //NodeImpl
