/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.rcpl.model_2_0_0.rcpl.Building;
import org.eclipse.rcpl.model_2_0_0.rcpl.HouseNumber;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;
import org.eclipse.rcpl.model_2_0_0.rcpl.Street;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Street</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.StreetImpl#getHousenumbers <em>Housenumbers</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.StreetImpl#getBuildings <em>Buildings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreetImpl extends LayoutableImpl implements Street {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RcplPackage.Literals.STREET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<HouseNumber> getHousenumbers() {
		return (EList<HouseNumber>)eGet(RcplPackage.Literals.STREET__HOUSENUMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Building> getBuildings() {
		return (EList<Building>)eGet(RcplPackage.Literals.STREET__BUILDINGS, true);
	}

} //StreetImpl
