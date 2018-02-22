/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package org.worldreservesystem.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.worldreservesystem.NationalEconomies;
import org.worldreservesystem.WorldEconomy;
import org.worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World Economy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.worldreservesystem.impl.WorldEconomyImpl#getNationaleconomies <em>Nationaleconomies</em>}</li>
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
		return WorldreservesystemPackage.Literals.WORLD_ECONOMY;
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
	public NationalEconomies getNationaleconomies() {
		return (NationalEconomies) eGet(WorldreservesystemPackage.Literals.WORLD_ECONOMY__NATIONALECONOMIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationaleconomies(NationalEconomies newNationaleconomies) {
		eSet(WorldreservesystemPackage.Literals.WORLD_ECONOMY__NATIONALECONOMIES, newNationaleconomies);
	}

} //WorldEconomyImpl
