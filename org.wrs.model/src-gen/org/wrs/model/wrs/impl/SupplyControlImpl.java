/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.wrs.model.wrs.Genesis;
import org.wrs.model.wrs.SupplyControl;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.SupplyControlImpl#getGenesis <em>Genesis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyControlImpl extends CDOObjectImpl implements SupplyControl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.SUPPLY_CONTROL;
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
	public Genesis getGenesis() {
		return (Genesis) eDynamicGet(WrsPackage.SUPPLY_CONTROL__GENESIS, WrsPackage.Literals.SUPPLY_CONTROL__GENESIS,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Genesis basicGetGenesis() {
		return (Genesis) eDynamicGet(WrsPackage.SUPPLY_CONTROL__GENESIS, WrsPackage.Literals.SUPPLY_CONTROL__GENESIS,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenesis(Genesis newGenesis) {
		eDynamicSet(WrsPackage.SUPPLY_CONTROL__GENESIS, WrsPackage.Literals.SUPPLY_CONTROL__GENESIS, newGenesis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.SUPPLY_CONTROL__GENESIS:
			if (resolve)
				return getGenesis();
			return basicGetGenesis();
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
		case WrsPackage.SUPPLY_CONTROL__GENESIS:
			setGenesis((Genesis) newValue);
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
		case WrsPackage.SUPPLY_CONTROL__GENESIS:
			setGenesis((Genesis) null);
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
		case WrsPackage.SUPPLY_CONTROL__GENESIS:
			return basicGetGenesis() != null;
		}
		return super.eIsSet(featureID);
	}

} //SupplyControlImpl
