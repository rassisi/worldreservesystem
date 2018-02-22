/**
 */
package worldreservesystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import worldreservesystem.Genesis;
import worldreservesystem.MainVault;
import worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genesis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.impl.GenesisImpl#getMainvault <em>Mainvault</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenesisImpl extends MinimalEObjectImpl.Container implements Genesis {
	/**
	 * The cached value of the '{@link #getMainvault() <em>Mainvault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainvault()
	 * @generated
	 * @ordered
	 */
	protected MainVault mainvault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenesisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorldreservesystemPackage.Literals.GENESIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainVault getMainvault() {
		if (mainvault != null && mainvault.eIsProxy()) {
			InternalEObject oldMainvault = (InternalEObject) mainvault;
			mainvault = (MainVault) eResolveProxy(oldMainvault);
			if (mainvault != oldMainvault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WorldreservesystemPackage.GENESIS__MAINVAULT, oldMainvault, mainvault));
			}
		}
		return mainvault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainVault basicGetMainvault() {
		return mainvault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainvault(MainVault newMainvault) {
		MainVault oldMainvault = mainvault;
		mainvault = newMainvault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorldreservesystemPackage.GENESIS__MAINVAULT,
					oldMainvault, mainvault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorldreservesystemPackage.GENESIS__MAINVAULT:
			if (resolve)
				return getMainvault();
			return basicGetMainvault();
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
		case WorldreservesystemPackage.GENESIS__MAINVAULT:
			setMainvault((MainVault) newValue);
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
		case WorldreservesystemPackage.GENESIS__MAINVAULT:
			setMainvault((MainVault) null);
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
		case WorldreservesystemPackage.GENESIS__MAINVAULT:
			return mainvault != null;
		}
		return super.eIsSet(featureID);
	}

} //GenesisImpl
