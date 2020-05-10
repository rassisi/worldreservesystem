/**
 */
package org.wrs.model.wrs.impl;

import org.eclipse.emf.ecore.EClass;
import org.wrs.model.wrs.StatisticsSource;
import org.wrs.model.wrs.WrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistics Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.impl.StatisticsSourceImpl#getWebserviceUrl <em>Webservice Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticsSourceImpl extends LayoutableImpl implements StatisticsSource {
	/**
	 * The default value of the '{@link #getWebserviceUrl() <em>Webservice Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebserviceUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSERVICE_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticsSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrsPackage.Literals.STATISTICS_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebserviceUrl() {
		return (String) eDynamicGet(WrsPackage.STATISTICS_SOURCE__WEBSERVICE_URL,
				WrsPackage.Literals.STATISTICS_SOURCE__WEBSERVICE_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebserviceUrl(String newWebserviceUrl) {
		eDynamicSet(WrsPackage.STATISTICS_SOURCE__WEBSERVICE_URL, WrsPackage.Literals.STATISTICS_SOURCE__WEBSERVICE_URL,
				newWebserviceUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WrsPackage.STATISTICS_SOURCE__WEBSERVICE_URL:
			return getWebserviceUrl();
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
		case WrsPackage.STATISTICS_SOURCE__WEBSERVICE_URL:
			setWebserviceUrl((String) newValue);
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
		case WrsPackage.STATISTICS_SOURCE__WEBSERVICE_URL:
			setWebserviceUrl(WEBSERVICE_URL_EDEFAULT);
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
		case WrsPackage.STATISTICS_SOURCE__WEBSERVICE_URL:
			return WEBSERVICE_URL_EDEFAULT == null ? getWebserviceUrl() != null
					: !WEBSERVICE_URL_EDEFAULT.equals(getWebserviceUrl());
		}
		return super.eIsSet(featureID);
	}

} //StatisticsSourceImpl
