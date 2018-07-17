/**
 */
package org.wrs.wrs.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.wrs.wrs.Accounts;
import org.wrs.wrs.WrsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Accounts</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountsTest extends TestCase {

	/**
	 * The fixture for this Accounts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Accounts fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AccountsTest.class);
	}

	/**
	 * Constructs a new Accounts test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Accounts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Accounts fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Accounts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Accounts getFixture() {
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
		setFixture(WrsFactory.eINSTANCE.createAccounts());
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

} //AccountsTest
