/**
 */
package org.wrs.wrs.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.wrs.wrs.NationalEconomies;
import org.wrs.wrs.WorldEconomy;
import org.wrs.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World Economy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.wrs.impl.WorldEconomyImpl#getNationaleconomies <em>Nationaleconomies</em>}</li>
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
	public EList<NationalEconomies> getNationaleconomies() {
		return (EList<NationalEconomies>)eGet(WrsPackage.Literals.WORLD_ECONOMY__NATIONALECONOMIES, true);
	}

} //WorldEconomyImpl
