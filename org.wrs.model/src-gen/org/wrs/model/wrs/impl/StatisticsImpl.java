/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.ecore.EClass;
import org.wrs.model.wrs.Statistics;
import org.wrs.model.wrs.StatisticsSource;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.StatisticsImpl#getStatisticssource <em>Statisticssource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticsImpl extends LayoutableImpl implements Statistics {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.STATISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticsSource getStatisticssource() {
		return (StatisticsSource) eDynamicGet(WrsPackage.STATISTICS__STATISTICSSOURCE,
				WrsPackage.Literals.STATISTICS__STATISTICSSOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticsSource basicGetStatisticssource() {
		return (StatisticsSource) eDynamicGet(WrsPackage.STATISTICS__STATISTICSSOURCE,
				WrsPackage.Literals.STATISTICS__STATISTICSSOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatisticssource(StatisticsSource newStatisticssource) {
		eDynamicSet(WrsPackage.STATISTICS__STATISTICSSOURCE, WrsPackage.Literals.STATISTICS__STATISTICSSOURCE,
				newStatisticssource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.STATISTICS__STATISTICSSOURCE:
			if (resolve)
				return getStatisticssource();
			return basicGetStatisticssource();
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
		case WrsPackage.STATISTICS__STATISTICSSOURCE:
			setStatisticssource((StatisticsSource) newValue);
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
		case WrsPackage.STATISTICS__STATISTICSSOURCE:
			setStatisticssource((StatisticsSource) null);
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
		case WrsPackage.STATISTICS__STATISTICSSOURCE:
			return basicGetStatisticssource() != null;
		}
		return super.eIsSet(featureID);
	}

} //StatisticsImpl
