/**
 */
package org.wrs.model.wrs;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistics Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wrs.model.wrs.StatisticsSource#getWebserviceUrl <em>Webservice Url</em>}</li>
 * </ul>
 *
 * @see org.wrs.model.wrs.WrsPackage#getStatisticsSource()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface StatisticsSource extends CDOObject {

	/**
	 * Returns the value of the '<em><b>Webservice Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webservice Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webservice Url</em>' attribute.
	 * @see #setWebserviceUrl(String)
	 * @see org.wrs.model.wrs.WrsPackage#getStatisticsSource_WebserviceUrl()
	 * @model
	 * @generated
	 */
	String getWebserviceUrl();

	/**
	 * Sets the value of the '{@link org.wrs.model.wrs.StatisticsSource#getWebserviceUrl <em>Webservice Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webservice Url</em>' attribute.
	 * @see #getWebserviceUrl()
	 * @generated
	 */
	void setWebserviceUrl(String value);
} // StatisticsSource
