/**
 */
package org.wrs.wrs.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.wrs.wrs.AbstractVault;
import org.wrs.wrs.WrsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Vault</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractVaultTest extends TestCase {

	/**
	 * The fixture for this Abstract Vault test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractVault fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractVaultTest.class);
	}

	/**
	 * Constructs a new Abstract Vault test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractVaultTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abstract Vault test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AbstractVault fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abstract Vault test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractVault getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WrsFactory.eINSTANCE.createAbstractVault());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AbstractVaultTest
