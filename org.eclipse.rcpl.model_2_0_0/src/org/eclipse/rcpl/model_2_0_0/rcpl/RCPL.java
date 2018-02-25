/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RCPL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPlugins <em>All Plugins</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPerspectives <em>All Perspectives</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPreferences <em>All Preferences</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllTools <em>All Tools</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllFavorites <em>All Favorites</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionMajor <em>Version Major</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionMinor <em>Version Minor</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionMaintenance <em>Version Maintenance</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getBuildNumber <em>Build Number</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionDescription <em>Version Description</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllResources <em>All Resources</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPersons <em>All Persons</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getLinkedRcpls <em>Linked Rcpls</em>}</li>
 * </ul>
 *
 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL()
 * @model
 * @generated
 */
public interface RCPL extends Layoutable {
	/**
	 * Returns the value of the '<em><b>All Plugins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Plugins</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Plugins</em>' containment reference.
	 * @see #setAllPlugins(Plugins)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_AllPlugins()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Plugins getAllPlugins();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPlugins <em>All Plugins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Plugins</em>' containment reference.
	 * @see #getAllPlugins()
	 * @generated
	 */
	void setAllPlugins(Plugins value);

	/**
	 * Returns the value of the '<em><b>All Perspectives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Perspectives</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Perspectives</em>' containment reference.
	 * @see #setAllPerspectives(Perspectives)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_AllPerspectives()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Perspectives getAllPerspectives();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPerspectives <em>All Perspectives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Perspectives</em>' containment reference.
	 * @see #getAllPerspectives()
	 * @generated
	 */
	void setAllPerspectives(Perspectives value);

	/**
	 * Returns the value of the '<em><b>All Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Preferences</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Preferences</em>' containment reference.
	 * @see #setAllPreferences(Preferences)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_AllPreferences()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Preferences getAllPreferences();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPreferences <em>All Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Preferences</em>' containment reference.
	 * @see #getAllPreferences()
	 * @generated
	 */
	void setAllPreferences(Preferences value);

	/**
	 * Returns the value of the '<em><b>All Tools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Tools</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Tools</em>' containment reference.
	 * @see #setAllTools(Tools)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_AllTools()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tools getAllTools();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllTools <em>All Tools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Tools</em>' containment reference.
	 * @see #getAllTools()
	 * @generated
	 */
	void setAllTools(Tools value);

	/**
	 * Returns the value of the '<em><b>All Favorites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Favorites</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Favorites</em>' containment reference.
	 * @see #setAllFavorites(Favorites)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_AllFavorites()
	 * @model containment="true"
	 * @generated
	 */
	Favorites getAllFavorites();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllFavorites <em>All Favorites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Favorites</em>' containment reference.
	 * @see #getAllFavorites()
	 * @generated
	 */
	void setAllFavorites(Favorites value);

	/**
	 * Returns the value of the '<em><b>Version Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Major</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Major</em>' attribute.
	 * @see #setVersionMajor(int)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_VersionMajor()
	 * @model
	 * @generated
	 */
	int getVersionMajor();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionMajor <em>Version Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Major</em>' attribute.
	 * @see #getVersionMajor()
	 * @generated
	 */
	void setVersionMajor(int value);

	/**
	 * Returns the value of the '<em><b>Version Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Minor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Minor</em>' attribute.
	 * @see #setVersionMinor(int)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_VersionMinor()
	 * @model
	 * @generated
	 */
	int getVersionMinor();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionMinor <em>Version Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Minor</em>' attribute.
	 * @see #getVersionMinor()
	 * @generated
	 */
	void setVersionMinor(int value);

	/**
	 * Returns the value of the '<em><b>Version Maintenance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Maintenance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Maintenance</em>' attribute.
	 * @see #setVersionMaintenance(int)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_VersionMaintenance()
	 * @model
	 * @generated
	 */
	int getVersionMaintenance();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionMaintenance <em>Version Maintenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Maintenance</em>' attribute.
	 * @see #getVersionMaintenance()
	 * @generated
	 */
	void setVersionMaintenance(int value);

	/**
	 * Returns the value of the '<em><b>Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Number</em>' attribute.
	 * @see #setBuildNumber(String)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_BuildNumber()
	 * @model
	 * @generated
	 */
	String getBuildNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getBuildNumber <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Number</em>' attribute.
	 * @see #getBuildNumber()
	 * @generated
	 */
	void setBuildNumber(String value);

	/**
	 * Returns the value of the '<em><b>Version Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Description</em>' attribute.
	 * @see #setVersionDescription(String)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_VersionDescription()
	 * @model
	 * @generated
	 */
	String getVersionDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getVersionDescription <em>Version Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Description</em>' attribute.
	 * @see #getVersionDescription()
	 * @generated
	 */
	void setVersionDescription(String value);

	/**
	 * Returns the value of the '<em><b>All Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Resources</em>' containment reference.
	 * @see #setAllResources(Resources)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_AllResources()
	 * @model containment="true"
	 * @generated
	 */
	Resources getAllResources();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllResources <em>All Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Resources</em>' containment reference.
	 * @see #getAllResources()
	 * @generated
	 */
	void setAllResources(Resources value);

	/**
	 * Returns the value of the '<em><b>All Persons</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Persons</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Persons</em>' containment reference.
	 * @see #setAllPersons(Persons)
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_AllPersons()
	 * @model containment="true"
	 * @generated
	 */
	Persons getAllPersons();

	/**
	 * Sets the value of the '{@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL#getAllPersons <em>All Persons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Persons</em>' containment reference.
	 * @see #getAllPersons()
	 * @generated
	 */
	void setAllPersons(Persons value);

	/**
	 * Returns the value of the '<em><b>Linked Rcpls</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rcpl.model_2_0_0.rcpl.RCPL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Rcpls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Rcpls</em>' reference list.
	 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage#getRCPL_LinkedRcpls()
	 * @model
	 * @generated
	 */
	EList<RCPL> getLinkedRcpls();

} // RCPL
