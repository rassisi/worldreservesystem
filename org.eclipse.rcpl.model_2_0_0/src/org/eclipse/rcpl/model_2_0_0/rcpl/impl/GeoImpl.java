/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.rcpl.model_2_0_0.rcpl.Country;
import org.eclipse.rcpl.model_2_0_0.rcpl.Geo;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;
import org.eclipse.rcpl.model_2_0_0.rcpl.WorldRegion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.GeoImpl#getCountries <em>Countries</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.GeoImpl#getWorldregions <em>Worldregions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoImpl extends LayoutableImpl implements Geo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RcplPackage.Literals.GEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Country> getCountries() {
		return (EList<Country>)eGet(RcplPackage.Literals.GEO__COUNTRIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<WorldRegion> getWorldregions() {
		return (EList<WorldRegion>)eGet(RcplPackage.Literals.GEO__WORLDREGIONS, true);
	}

} //GeoImpl
