/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wrs.model.wrs.NetworkEngine;
import org.wrs.model.wrs.Node;
import org.wrs.model.wrs.NodeAccount;
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
 *   <li>{@link org.wrs.model.wrs.impl.NodeImpl#getNodeAccounts <em>Node Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends LayoutableImpl implements Node {
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
		return (Double) eDynamicGet(WrsPackage.NODE__WEIGHT, WrsPackage.Literals.NODE__WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		eDynamicSet(WrsPackage.NODE__WEIGHT, WrsPackage.Literals.NODE__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkEngine getNetworkengine() {
		return (NetworkEngine) eDynamicGet(WrsPackage.NODE__NETWORKENGINE, WrsPackage.Literals.NODE__NETWORKENGINE,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkEngine basicGetNetworkengine() {
		return (NetworkEngine) eDynamicGet(WrsPackage.NODE__NETWORKENGINE, WrsPackage.Literals.NODE__NETWORKENGINE,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkengine(NetworkEngine newNetworkengine) {
		eDynamicSet(WrsPackage.NODE__NETWORKENGINE, WrsPackage.Literals.NODE__NETWORKENGINE, newNetworkengine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NodeAccount> getNodeAccounts() {
		return (EList<NodeAccount>) eDynamicGet(WrsPackage.NODE__NODE_ACCOUNTS, WrsPackage.Literals.NODE__NODE_ACCOUNTS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.NODE__NODE_ACCOUNTS:
			return ((InternalEList<?>) getNodeAccounts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case WrsPackage.NODE__NODE_ACCOUNTS:
			return getNodeAccounts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WrsPackage.NODE__WEIGHT:
			setWeight((Double) newValue);
			return;
		case WrsPackage.NODE__NETWORKENGINE:
			setNetworkengine((NetworkEngine) newValue);
			return;
		case WrsPackage.NODE__NODE_ACCOUNTS:
			getNodeAccounts().clear();
			getNodeAccounts().addAll((Collection<? extends NodeAccount>) newValue);
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
		case WrsPackage.NODE__NODE_ACCOUNTS:
			getNodeAccounts().clear();
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
			return getWeight() != WEIGHT_EDEFAULT;
		case WrsPackage.NODE__NETWORKENGINE:
			return basicGetNetworkengine() != null;
		case WrsPackage.NODE__NODE_ACCOUNTS:
			return !getNodeAccounts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
