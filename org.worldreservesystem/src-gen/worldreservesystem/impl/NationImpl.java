/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package worldreservesystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import worldreservesystem.FiatCurrency;
import worldreservesystem.Nation;
import worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.impl.NationImpl#getFiatcurrency <em>Fiatcurrency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NationImpl extends MinimalEObjectImpl.Container implements Nation {
	/**
	 * The cached value of the '{@link #getFiatcurrency() <em>Fiatcurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiatcurrency()
	 * @generated
	 * @ordered
	 */
	protected FiatCurrency fiatcurrency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorldreservesystemPackage.Literals.NATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiatCurrency getFiatcurrency() {
		return fiatcurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFiatcurrency(FiatCurrency newFiatcurrency, NotificationChain msgs) {
		FiatCurrency oldFiatcurrency = fiatcurrency;
		fiatcurrency = newFiatcurrency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.NATION__FIATCURRENCY, oldFiatcurrency, newFiatcurrency);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiatcurrency(FiatCurrency newFiatcurrency) {
		if (newFiatcurrency != fiatcurrency) {
			NotificationChain msgs = null;
			if (fiatcurrency != null)
				msgs = ((InternalEObject) fiatcurrency).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorldreservesystemPackage.NATION__FIATCURRENCY, null, msgs);
			if (newFiatcurrency != null)
				msgs = ((InternalEObject) newFiatcurrency).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorldreservesystemPackage.NATION__FIATCURRENCY, null, msgs);
			msgs = basicSetFiatcurrency(newFiatcurrency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorldreservesystemPackage.NATION__FIATCURRENCY,
					newFiatcurrency, newFiatcurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorldreservesystemPackage.NATION__FIATCURRENCY:
			return basicSetFiatcurrency(null, msgs);
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
		case WorldreservesystemPackage.NATION__FIATCURRENCY:
			return getFiatcurrency();
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
		case WorldreservesystemPackage.NATION__FIATCURRENCY:
			setFiatcurrency((FiatCurrency) newValue);
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
		case WorldreservesystemPackage.NATION__FIATCURRENCY:
			setFiatcurrency((FiatCurrency) null);
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
		case WorldreservesystemPackage.NATION__FIATCURRENCY:
			return fiatcurrency != null;
		}
		return super.eIsSet(featureID);
	}

} //NationImpl
