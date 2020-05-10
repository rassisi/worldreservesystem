/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.wrs.model.wrs.AbstractAccount;
import org.wrs.model.wrs.Accounts;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accounts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.AccountsImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountsImpl extends LayoutableContainerImpl implements Accounts {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.ACCOUNTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractAccount> getChildren() {
		return (EList<AbstractAccount>) eDynamicGet(WrsPackage.ACCOUNTS__CHILDREN,
				WrsPackage.Literals.ACCOUNTS__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.ACCOUNTS__CHILDREN:
			return getChildren();
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
		case WrsPackage.ACCOUNTS__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends AbstractAccount>) newValue);
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
		case WrsPackage.ACCOUNTS__CHILDREN:
			getChildren().clear();
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
		case WrsPackage.ACCOUNTS__CHILDREN:
			return !getChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccountsImpl
