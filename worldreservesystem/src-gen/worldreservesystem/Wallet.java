/**
 */
package worldreservesystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wallet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link worldreservesystem.Wallet#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link worldreservesystem.Wallet#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @see worldreservesystem.WorldreservesystemPackage#getWallet()
 * @model
 * @generated
 */
public interface Wallet extends AbstractVault {
	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Key</em>' attribute.
	 * @see #setPublicKey(String)
	 * @see worldreservesystem.WorldreservesystemPackage#getWallet_PublicKey()
	 * @model
	 * @generated
	 */
	String getPublicKey();

	/**
	 * Sets the value of the '{@link worldreservesystem.Wallet#getPublicKey <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key</em>' attribute.
	 * @see #getPublicKey()
	 * @generated
	 */
	void setPublicKey(String value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(Identity)
	 * @see worldreservesystem.WorldreservesystemPackage#getWallet_BelongsTo()
	 * @model
	 * @generated
	 */
	Identity getBelongsTo();

	/**
	 * Sets the value of the '{@link worldreservesystem.Wallet#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(Identity value);

} // Wallet
