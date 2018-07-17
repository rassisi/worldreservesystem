/**
 */
package org.wrs.wrs.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.wrs.wrs.TransactionCollection;
import org.wrs.wrs.WrsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transaction Collection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransactionCollectionTest extends TestCase {

	/**
	 * The fixture for this Transaction Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionCollection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransactionCollectionTest.class);
	}

	/**
	 * Constructs a new Transaction Collection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionCollectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transaction Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TransactionCollection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transaction Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionCollection getFixture() {
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
		setFixture(WrsFactory.eINSTANCE.createTransactionCollection());
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

} //TransactionCollectionTest
