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

import worldreservesystem.NationalEconomies;
import worldreservesystem.WorldEconomy;
import worldreservesystem.WorldreservesystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World Economy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.impl.WorldEconomyImpl#getNationaleconomies <em>Nationaleconomies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorldEconomyImpl extends MinimalEObjectImpl.Container implements WorldEconomy {
	/**
	 * The cached value of the '{@link #getNationaleconomies() <em>Nationaleconomies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationaleconomies()
	 * @generated
	 * @ordered
	 */
	protected NationalEconomies nationaleconomies;

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
	public NationalEconomies getNationaleconomies() {
		return nationaleconomies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNationaleconomies(NationalEconomies newNationaleconomies, NotificationChain msgs) {
		NationalEconomies oldNationaleconomies = nationaleconomies;
		nationaleconomies = newNationaleconomies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.WORLD_ECONOMY__NATIONALECONOMIES, oldNationaleconomies,
					newNationaleconomies);
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
	public void setNationaleconomies(NationalEconomies newNationaleconomies) {
		if (newNationaleconomies != nationaleconomies) {
			NotificationChain msgs = null;
			if (nationaleconomies != null)
				msgs = ((InternalEObject) nationaleconomies).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorldreservesystemPackage.WORLD_ECONOMY__NATIONALECONOMIES, null,
						msgs);
			if (newNationaleconomies != null)
				msgs = ((InternalEObject) newNationaleconomies).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorldreservesystemPackage.WORLD_ECONOMY__NATIONALECONOMIES, null,
						msgs);
			msgs = basicSetNationaleconomies(newNationaleconomies, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WorldreservesystemPackage.WORLD_ECONOMY__NATIONALECONOMIES, newNationaleconomies,
					newNationaleconomies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorldreservesystemPackage.WORLD_ECONOMY__NATIONALECONOMIES:
			return basicSetNationaleconomies(null, msgs);
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
		case WorldreservesystemPackage.WORLD_ECONOMY__NATIONALECONOMIES:
			return getNationaleconomies();
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
		case WorldreservesystemPackage.WORLD_ECONOMY__NATIONALECONOMIES:
			setNationaleconomies((NationalEconomies) newValue);
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
		case WorldreservesystemPackage.WORLD_ECONOMY__NATIONALECONOMIES:
			setNationaleconomies((NationalEconomies) null);
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
		case WorldreservesystemPackage.WORLD_ECONOMY__NATIONALECONOMIES:
			return nationaleconomies != null;
		}
		return super.eIsSet(featureID);
	}

} //WorldEconomyImpl
