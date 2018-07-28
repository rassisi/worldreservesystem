/**
 */
package wrs.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import wrs.Genesis;
import wrs.SupplyControl;
import wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wrs.impl.SupplyControlImpl#getGenesis <em>Genesis</em>}</li>
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
		return (Genesis)eGet(WrsPackage.Literals.SUPPLY_CONTROL__GENESIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenesis(Genesis newGenesis) {
		eSet(WrsPackage.Literals.SUPPLY_CONTROL__GENESIS, newGenesis);
	}

} //SupplyControlImpl
