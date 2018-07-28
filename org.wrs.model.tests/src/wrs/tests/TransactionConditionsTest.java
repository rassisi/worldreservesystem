/**
 */
package wrs.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import wrs.TransactionConditions;
import wrs.WrsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transaction Conditions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransactionConditionsTest extends TestCase {

	/**
	 * The fixture for this Transaction Conditions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionConditions fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransactionConditionsTest.class);
	}

	/**
	 * Constructs a new Transaction Conditions test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionConditionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transaction Conditions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TransactionConditions fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transaction Conditions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionConditions getFixture() {
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
		setFixture(WrsFactory.eINSTANCE.createTransactionConditions());
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

} //TransactionConditionsTest
