/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.wrs.model.wrs.StatisticDatas;
import org.wrs.model.wrs.Statistics;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistic Datas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.StatisticDatasImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticDatasImpl extends CDOObjectImpl implements StatisticDatas {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticDatasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.STATISTIC_DATAS;
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
	public Statistics getChildren() {
		return (Statistics) eDynamicGet(WrsPackage.STATISTIC_DATAS__CHILDREN,
				WrsPackage.Literals.STATISTIC_DATAS__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistics basicGetChildren() {
		return (Statistics) eDynamicGet(WrsPackage.STATISTIC_DATAS__CHILDREN,
				WrsPackage.Literals.STATISTIC_DATAS__CHILDREN, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildren(Statistics newChildren) {
		eDynamicSet(WrsPackage.STATISTIC_DATAS__CHILDREN, WrsPackage.Literals.STATISTIC_DATAS__CHILDREN, newChildren);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.STATISTIC_DATAS__CHILDREN:
			if (resolve)
				return getChildren();
			return basicGetChildren();
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
		case WrsPackage.STATISTIC_DATAS__CHILDREN:
			setChildren((Statistics) newValue);
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
		case WrsPackage.STATISTIC_DATAS__CHILDREN:
			setChildren((Statistics) null);
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
		case WrsPackage.STATISTIC_DATAS__CHILDREN:
			return basicGetChildren() != null;
		}
		return super.eIsSet(featureID);
	}

} //StatisticDatasImpl
