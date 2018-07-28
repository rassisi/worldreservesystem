/**
 */
package wrs.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import wrs.Country;
import wrs.CountryRegion;
import wrs.FiatCurrency;
import wrs.NationalEconomies;
import wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wrs.impl.CountryImpl#getFiatcurrency <em>Fiatcurrency</em>}</li>
 *   <li>{@link wrs.impl.CountryImpl#getNationaleconomies <em>Nationaleconomies</em>}</li>
 *   <li>{@link wrs.impl.CountryImpl#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryImpl extends CDOObjectImpl implements Country {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.COUNTRY;
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
	public FiatCurrency getFiatcurrency() {
		return (FiatCurrency)eGet(WrsPackage.Literals.COUNTRY__FIATCURRENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiatcurrency(FiatCurrency newFiatcurrency) {
		eSet(WrsPackage.Literals.COUNTRY__FIATCURRENCY, newFiatcurrency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationalEconomies getNationaleconomies() {
		return (NationalEconomies)eGet(WrsPackage.Literals.COUNTRY__NATIONALECONOMIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationaleconomies(NationalEconomies newNationaleconomies) {
		eSet(WrsPackage.Literals.COUNTRY__NATIONALECONOMIES, newNationaleconomies);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CountryRegion> getRegions() {
		return (EList<CountryRegion>)eGet(WrsPackage.Literals.COUNTRY__REGIONS, true);
	}

} //CountryImpl
