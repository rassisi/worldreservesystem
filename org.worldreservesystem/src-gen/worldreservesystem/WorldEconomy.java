/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package worldreservesystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World Economy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.WorldEconomy#getNationaleconomies <em>Nationaleconomies</em>}</li>
 * </ul>
 *
 * @see worldreservesystem.WorldreservesystemPackage#getWorldEconomy()
 * @model
 * @generated
 */
public interface WorldEconomy extends EObject {
	/**
	 * Returns the value of the '<em><b>Nationaleconomies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationaleconomies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationaleconomies</em>' containment reference.
	 * @see #setNationaleconomies(NationalEconomies)
	 * @see worldreservesystem.WorldreservesystemPackage#getWorldEconomy_Nationaleconomies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NationalEconomies getNationaleconomies();

	/**
	 * Sets the value of the '{@link worldreservesystem.WorldEconomy#getNationaleconomies <em>Nationaleconomies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationaleconomies</em>' containment reference.
	 * @see #getNationaleconomies()
	 * @generated
	 */
	void setNationaleconomies(NationalEconomies value);

} // WorldEconomy
