/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.wrs.model.wrs.NationalEconomies;
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
 * </ul>
 *
 * @generated
 */
public class WorldEconomyImpl extends MinimalEObjectImpl.Container implements WorldEconomy {
	/**
	 * The cached value of the '{@link #getNationaleconomies() <em>Nationaleconomies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationaleconomies()
	 * @generated
	 * @ordered
	 */
	protected EList<NationalEconomies> nationaleconomies;

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
	public EList<NationalEconomies> getNationaleconomies() {
		if (nationaleconomies == null) {
			nationaleconomies = new EObjectResolvingEList<NationalEconomies>(NationalEconomies.class, this,
					WrsPackage.WORLD_ECONOMY__NATIONALECONOMIES);
		}
		return nationaleconomies;
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
			getNationaleconomies().addAll((Collection<? extends NationalEconomies>) newValue);
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
			return nationaleconomies != null && !nationaleconomies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorldEconomyImpl
