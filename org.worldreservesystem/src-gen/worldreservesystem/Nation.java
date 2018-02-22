/**
 * (c) 2018 World Resource Systems, Ramin Assisi
 */
package worldreservesystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.Nation#getFiatcurrency <em>Fiatcurrency</em>}</li>
 * </ul>
 *
 * @see worldreservesystem.WorldreservesystemPackage#getNation()
 * @model
 * @generated
 */
public interface Nation extends EObject {
	/**
	 * Returns the value of the '<em><b>Fiatcurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiatcurrency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiatcurrency</em>' containment reference.
	 * @see #setFiatcurrency(FiatCurrency)
	 * @see worldreservesystem.WorldreservesystemPackage#getNation_Fiatcurrency()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FiatCurrency getFiatcurrency();

	/**
	 * Sets the value of the '{@link worldreservesystem.Nation#getFiatcurrency <em>Fiatcurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiatcurrency</em>' containment reference.
	 * @see #getFiatcurrency()
	 * @generated
	 */
	void setFiatcurrency(FiatCurrency value);

} // Nation
