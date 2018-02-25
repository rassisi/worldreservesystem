/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.rcpl.model_2_0_0.rcpl.Perspective;
import org.eclipse.rcpl.model_2_0_0.rcpl.QuickToolBar;
import org.eclipse.rcpl.model_2_0_0.rcpl.QuickTools;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;
import org.eclipse.rcpl.model_2_0_0.rcpl.SideToolBar;
import org.eclipse.rcpl.model_2_0_0.rcpl.TopToolBar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PerspectiveImpl#getSideToolBar <em>Side Tool Bar</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PerspectiveImpl#getTopToolBar <em>Top Tool Bar</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PerspectiveImpl#getQuickToolBar <em>Quick Tool Bar</em>}</li>
 *   <li>{@link org.eclipse.rcpl.model_2_0_0.rcpl.impl.PerspectiveImpl#getQuickTools <em>Quick Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerspectiveImpl extends LayoutableImpl implements Perspective {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RcplPackage.Literals.PERSPECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SideToolBar getSideToolBar() {
		return (SideToolBar)eGet(RcplPackage.Literals.PERSPECTIVE__SIDE_TOOL_BAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideToolBar(SideToolBar newSideToolBar) {
		eSet(RcplPackage.Literals.PERSPECTIVE__SIDE_TOOL_BAR, newSideToolBar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopToolBar getTopToolBar() {
		return (TopToolBar)eGet(RcplPackage.Literals.PERSPECTIVE__TOP_TOOL_BAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopToolBar(TopToolBar newTopToolBar) {
		eSet(RcplPackage.Literals.PERSPECTIVE__TOP_TOOL_BAR, newTopToolBar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuickToolBar getQuickToolBar() {
		return (QuickToolBar)eGet(RcplPackage.Literals.PERSPECTIVE__QUICK_TOOL_BAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuickToolBar(QuickToolBar newQuickToolBar) {
		eSet(RcplPackage.Literals.PERSPECTIVE__QUICK_TOOL_BAR, newQuickToolBar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuickTools getQuickTools() {
		return (QuickTools)eGet(RcplPackage.Literals.PERSPECTIVE__QUICK_TOOLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuickTools(QuickTools newQuickTools) {
		eSet(RcplPackage.Literals.PERSPECTIVE__QUICK_TOOLS, newQuickTools);
	}

} //PerspectiveImpl
