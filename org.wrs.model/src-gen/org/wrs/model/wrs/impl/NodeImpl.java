/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.wrs.model.wrs.NetworkEngine;
import org.wrs.model.wrs.Node;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.NodeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.NodeImpl#getNetworkengine <em>Networkengine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNetworkengine() <em>Networkengine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkengine()
	 * @generated
	 * @ordered
	 */
	protected NetworkEngine networkengine;

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
		return WrsPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.NODE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkEngine getNetworkengine() {
		if (networkengine != null && networkengine.eIsProxy()) {
			InternalEObject oldNetworkengine = (InternalEObject) networkengine;
			networkengine = (NetworkEngine) eResolveProxy(oldNetworkengine);
			if (networkengine != oldNetworkengine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrsPackage.NODE__NETWORKENGINE,
							oldNetworkengine, networkengine));
			}
		}
		return networkengine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkEngine basicGetNetworkengine() {
		return networkengine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkengine(NetworkEngine newNetworkengine) {
		NetworkEngine oldNetworkengine = networkengine;
		networkengine = newNetworkengine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.NODE__NETWORKENGINE, oldNetworkengine,
					networkengine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.NODE__WEIGHT:
			return getWeight();
		case WrsPackage.NODE__NETWORKENGINE:
			if (resolve)
				return getNetworkengine();
			return basicGetNetworkengine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WrsPackage.NODE__WEIGHT:
			setWeight((Double) newValue);
			return;
		case WrsPackage.NODE__NETWORKENGINE:
			setNetworkengine((NetworkEngine) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WrsPackage.NODE__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case WrsPackage.NODE__NETWORKENGINE:
			setNetworkengine((NetworkEngine) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WrsPackage.NODE__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case WrsPackage.NODE__NETWORKENGINE:
			return networkengine != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
