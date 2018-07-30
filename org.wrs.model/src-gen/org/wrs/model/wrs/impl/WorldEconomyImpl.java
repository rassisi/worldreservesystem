/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.wrs.model.wrs.NationalEconomy;
import org.wrs.model.wrs.StatisticDatas;
import org.wrs.model.wrs.StatisticsSource;
import org.wrs.model.wrs.WorldEconomy;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World Economy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.WorldEconomyImpl#getNationaleconomies <em>Nationaleconomies</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WorldEconomyImpl#getStatisticssource <em>Statisticssource</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.WorldEconomyImpl#getStatisticDatas <em>Statistic Datas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorldEconomyImpl extends CDOObjectImpl implements WorldEconomy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldEconomyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.WORLD_ECONOMY;
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
	@SuppressWarnings("unchecked")
	public EList<NationalEconomy> getNationaleconomies() {
		return (EList<NationalEconomy>) eDynamicGet(WrsPackage.WORLD_ECONOMY__NATIONALECONOMIES,
				WrsPackage.Literals.WORLD_ECONOMY__NATIONALECONOMIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticsSource getStatisticssource() {
		return (StatisticsSource) eDynamicGet(WrsPackage.WORLD_ECONOMY__STATISTICSSOURCE,
				WrsPackage.Literals.WORLD_ECONOMY__STATISTICSSOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatisticssource(StatisticsSource newStatisticssource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newStatisticssource, WrsPackage.WORLD_ECONOMY__STATISTICSSOURCE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatisticssource(StatisticsSource newStatisticssource) {
		eDynamicSet(WrsPackage.WORLD_ECONOMY__STATISTICSSOURCE, WrsPackage.Literals.WORLD_ECONOMY__STATISTICSSOURCE,
				newStatisticssource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticDatas getStatisticDatas() {
		return (StatisticDatas) eDynamicGet(WrsPackage.WORLD_ECONOMY__STATISTIC_DATAS,
				WrsPackage.Literals.WORLD_ECONOMY__STATISTIC_DATAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatisticDatas(StatisticDatas newStatisticDatas, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newStatisticDatas, WrsPackage.WORLD_ECONOMY__STATISTIC_DATAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatisticDatas(StatisticDatas newStatisticDatas) {
		eDynamicSet(WrsPackage.WORLD_ECONOMY__STATISTIC_DATAS, WrsPackage.Literals.WORLD_ECONOMY__STATISTIC_DATAS,
				newStatisticDatas);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WrsPackage.WORLD_ECONOMY__STATISTICSSOURCE:
			return basicSetStatisticssource(null, msgs);
		case WrsPackage.WORLD_ECONOMY__STATISTIC_DATAS:
			return basicSetStatisticDatas(null, msgs);
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
		case WrsPackage.WORLD_ECONOMY__NATIONALECONOMIES:
			return getNationaleconomies();
		case WrsPackage.WORLD_ECONOMY__STATISTICSSOURCE:
			return getStatisticssource();
		case WrsPackage.WORLD_ECONOMY__STATISTIC_DATAS:
			return getStatisticDatas();
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
		case WrsPackage.WORLD_ECONOMY__NATIONALECONOMIES:
			getNationaleconomies().clear();
			getNationaleconomies().addAll((Collection<? extends NationalEconomy>) newValue);
			return;
		case WrsPackage.WORLD_ECONOMY__STATISTICSSOURCE:
			setStatisticssource((StatisticsSource) newValue);
			return;
		case WrsPackage.WORLD_ECONOMY__STATISTIC_DATAS:
			setStatisticDatas((StatisticDatas) newValue);
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
		case WrsPackage.WORLD_ECONOMY__NATIONALECONOMIES:
			getNationaleconomies().clear();
			return;
		case WrsPackage.WORLD_ECONOMY__STATISTICSSOURCE:
			setStatisticssource((StatisticsSource) null);
			return;
		case WrsPackage.WORLD_ECONOMY__STATISTIC_DATAS:
			setStatisticDatas((StatisticDatas) null);
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
		case WrsPackage.WORLD_ECONOMY__NATIONALECONOMIES:
			return !getNationaleconomies().isEmpty();
		case WrsPackage.WORLD_ECONOMY__STATISTICSSOURCE:
			return getStatisticssource() != null;
		case WrsPackage.WORLD_ECONOMY__STATISTIC_DATAS:
			return getStatisticDatas() != null;
		}
		return super.eIsSet(featureID);
	}

} //WorldEconomyImpl
