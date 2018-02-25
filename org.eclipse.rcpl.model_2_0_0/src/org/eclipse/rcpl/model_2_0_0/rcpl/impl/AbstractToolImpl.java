/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl#getGridX <em>Grid X</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl#getGridY <em>Grid Y</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl#getSpanX <em>Span X</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl#getSpanY <em>Span Y</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl#isLabeled <em>Labeled</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl#isNotImplemented <em>Not Implemented</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.AbstractToolImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractToolImpl extends LayoutableImpl implements AbstractTool {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RcplPackage.Literals.ABSTRACT_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX() {
		return (Double)eGet(RcplPackage.Literals.ABSTRACT_TOOL__X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		eSet(RcplPackage.Literals.ABSTRACT_TOOL__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return (Double)eGet(RcplPackage.Literals.ABSTRACT_TOOL__Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		eSet(RcplPackage.Literals.ABSTRACT_TOOL__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return (Double)eGet(RcplPackage.Literals.ABSTRACT_TOOL__WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		eSet(RcplPackage.Literals.ABSTRACT_TOOL__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return (Double)eGet(RcplPackage.Literals.ABSTRACT_TOOL__HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		eSet(RcplPackage.Literals.ABSTRACT_TOOL__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGridX() {
		return (Integer)eGet(RcplPackage.Literals.ABSTRACT_TOOL__GRID_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridX(int newGridX) {
		eSet(RcplPackage.Literals.ABSTRACT_TOOL__GRID_X, newGridX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGridY() {
		return (Integer)eGet(RcplPackage.Literals.ABSTRACT_TOOL__GRID_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridY(int newGridY) {
		eSet(RcplPackage.Literals.ABSTRACT_TOOL__GRID_Y, newGridY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpanX() {
		return (Integer)eGet(RcplPackage.Literals.ABSTRACT_TOOL__SPAN_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpanX(int newSpanX) {
		eSet(RcplPackage.Literals.ABSTRACT_TOOL__SPAN_X, newSpanX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpanY() {
		return (Integer)eGet(RcplPackage.Literals.ABSTRACT_TOOL__SPAN_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpanY(int newSpanY) {
		eSet(RcplPackage.Literals.ABSTRACT_TOOL__SPAN_Y, newSpanY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLabeled() {
		return (Boolean)eGet(RcplPackage.Literals.ABSTRACT_TOOL__LABELED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabeled(boolean newLabeled) {
		eSet(RcplPackage.Literals.ABSTRACT_TOOL__LABELED, newLabeled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotImplemented() {
		return (Boolean)eGet(RcplPackage.Literals.ABSTRACT_TOOL__NOT_IMPLEMENTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotImplemented(boolean newNotImplemented) {
		eSet(RcplPackage.Literals.ABSTRACT_TOOL__NOT_IMPLEMENTED, newNotImplemented);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getService() {
		return (String)eGet(RcplPackage.Literals.ABSTRACT_TOOL__SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(String newService) {
		eSet(RcplPackage.Literals.ABSTRACT_TOOL__SERVICE, newService);
	}

} //AbstractToolImpl
