/**
 */
package org.wrs.model.wrs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.wrs.model.wrs.AbstractAccount;
import org.wrs.model.wrs.Asset;
import org.wrs.model.wrs.Identity;
import org.wrs.model.wrs.Transaction;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.AbstractAccountImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.AbstractAccountImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.wrs.model.wrs.impl.AbstractAccountImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractAccountImpl extends MinimalEObjectImpl.Container implements AbstractAccount {
	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

	/**
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected Transaction transaction;

	/**
	 * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsTo()
	 * @generated
	 * @ordered
	 */
	protected Identity belongsTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.ABSTRACT_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectResolvingEList<Asset>(Asset.class, this, WrsPackage.ABSTRACT_ACCOUNT__ASSETS);
		}
		return assets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction getTransaction() {
		if (transaction != null && transaction.eIsProxy()) {
			InternalEObject oldTransaction = (InternalEObject) transaction;
			transaction = (Transaction) eResolveProxy(oldTransaction);
			if (transaction != oldTransaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION,
							oldTransaction, transaction));
			}
		}
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction basicGetTransaction() {
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(Transaction newTransaction) {
		Transaction oldTransaction = transaction;
		transaction = newTransaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION,
					oldTransaction, transaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getBelongsTo() {
		if (belongsTo != null && belongsTo.eIsProxy()) {
			InternalEObject oldBelongsTo = (InternalEObject) belongsTo;
			belongsTo = (Identity) eResolveProxy(oldBelongsTo);
			if (belongsTo != oldBelongsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO,
							oldBelongsTo, belongsTo));
			}
		}
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity basicGetBelongsTo() {
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(Identity newBelongsTo) {
		Identity oldBelongsTo = belongsTo;
		belongsTo = newBelongsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO, oldBelongsTo,
					belongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.ABSTRACT_ACCOUNT__ASSETS:
			return getAssets();
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION:
			if (resolve)
				return getTransaction();
			return basicGetTransaction();
		case WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO:
			if (resolve)
				return getBelongsTo();
			return basicGetBelongsTo();
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
		case WrsPackage.ABSTRACT_ACCOUNT__ASSETS:
			getAssets().clear();
			getAssets().addAll((Collection<? extends Asset>) newValue);
			return;
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION:
			setTransaction((Transaction) newValue);
			return;
		case WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO:
			setBelongsTo((Identity) newValue);
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
		case WrsPackage.ABSTRACT_ACCOUNT__ASSETS:
			getAssets().clear();
			return;
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION:
			setTransaction((Transaction) null);
			return;
		case WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO:
			setBelongsTo((Identity) null);
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
		case WrsPackage.ABSTRACT_ACCOUNT__ASSETS:
			return assets != null && !assets.isEmpty();
		case WrsPackage.ABSTRACT_ACCOUNT__TRANSACTION:
			return transaction != null;
		case WrsPackage.ABSTRACT_ACCOUNT__BELONGS_TO:
			return belongsTo != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractAccountImpl
