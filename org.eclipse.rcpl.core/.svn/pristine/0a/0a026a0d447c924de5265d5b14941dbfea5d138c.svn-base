package org.eclipse.rcpl;

import org.eclipse.rcpl.model_2_0_0.rcpl.Perspective;

/**
 * @author ramin
 *
 */
public interface ISideToolBar {

	public static int MARGIN_BOX_1 = 5;

	public final static int WIDTH_HIDDEN = 0;
	public final static int WIDTH_HIDDEN_BOTTOM = WIDTH_HIDDEN + 6;
	public final static int WIDTH_COLLAPSED = 44; // 51;
	public final static int WIDTH_COLLAPSED_MOBILE = 20; // 51;

	public final static int WIDTH_COLLAPSED_BOTTOM = WIDTH_COLLAPSED + 6;

	public final static int WIDTH_EXPANDED_1 = 364;

	public final static int WIDTH_EXPANDED_IMAGES = 364; // 550;

	void collapseToolPane();

	void expandHierarchy2();

	void init();

	void showPerspective(Perspective perspective, boolean collapse);

	void showGroup(String groupId, boolean collapse);

	void showHomeTools();

	void showSideTools();

	void setEditor(IEditor editor);

}
