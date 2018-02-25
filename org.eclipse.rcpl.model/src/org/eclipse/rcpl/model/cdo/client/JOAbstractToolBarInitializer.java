package org.eclipse.rcpl.model.cdo.client;

import org.eclipse.rcpl.model_2_0_0.rcpl.Perspective;
import org.eclipse.rcpl.model_2_0_0.rcpl.RCPL;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolType;

/**
 * @author Ramin
 * 
 */
abstract public class JOAbstractToolBarInitializer {

	protected final JOSession session;
	protected final RCPL joffice;

	protected double width;
	protected double height;

	protected ToolGroup mainGroup;

	public JOAbstractToolBarInitializer(JOSession session, RCPL joffice) {
		this.session = session;
		this.joffice = joffice;
	}

	public Tool createTool(RCPL joffice, ToolGroup group, String id,
			String name, String image) {
		return createTool(joffice, group, id, name, name, image, 0, 0, 0, 0,
				ToolType.BUTTON);
	}

	//
	// public Tool createTool(RCPL joffice, ToolGroup group, String id,
	// String name, String toolTip, String image, ToolType type) {
	// return createTool(joffice, group, id, name, image, 0, 0, 0, 0, type);
	// }

	protected Tool createColorTool(RCPL joffice, ToolGroup group, String id,
			String name, double red, double green, double blue) {
		Tool tool = RcplFactory.eINSTANCE.createTool();
		tool.setId(id);
		tool.setName(name);
		group.getTools().add(tool);
		// EColor color = RcplFactory.eINSTANCE.createEColor();
		// color.setRed(red);
		// color.setGreen(green);
		// color.setBlue(blue);
		// color.setOpacity(1.0);
		tool.setFormat(red + "," + green + "," + blue);
		tool.setType(ToolType.COLOR_CHOOSER);
		return tool;
	}

	protected ToolGroup createToolGroup(RCPL joffice, Perspective perspective,
			String id) {
		ToolGroup group = session.findToolGroup(joffice, id);
		if (group != null) {
			perspective.getSideToolBar().getToolGroups().add(group);
		} else {
			// System. out.println();
		}
		return group;
	}

	protected ToolGroup createToolGroup(RCPL joffice, Perspective perspective,
			String id, String name, String image, double x, double y,
			double width, double height) {
		ToolGroup group = createToolGroup(joffice, id, name, image, x, y,
				width, height);
		perspective.getSideToolBar().getToolGroups().add(group);
		return group;
	}

	protected Tool createNavigatorTool(RCPL joffice, ToolGroup group,
			String id, String name, String image) {
		Tool tool = RcplFactory.eINSTANCE.createTool();
		tool.setId(id);
		tool.setName(name);
		tool.setImage(image);
		group.getTools().add(tool);
		return tool;
	}

	protected Tool createTool(RCPL joffice, ToolGroup group, String id,
			String name, String toolTip, String image, int gridX, int gridY,
			int spanX, int spanY, ToolType type) {
		Tool tool = RcplFactory.eINSTANCE.createTool();
		tool.setImage(image);
		tool.setId(id);
		tool.setName(name);
		tool.setToolTip(toolTip);
		tool.setGridX(gridX);
		tool.setGridY(gridY);
		tool.setSpanX(spanX);
		tool.setSpanY(spanY);
		tool.setType(type);
		group.getTools().add(tool);
		return tool;
	}

	protected ToolGroup createToolGroup(RCPL joffice, String id, String name,
			String image, double x, double y, double width, double height) {
		ToolGroup group = RcplFactory.eINSTANCE.createToolGroup();
		group.setImage(image);
		group.setId(id);
		group.setName(name);
		group.setWidth(width);
		group.setHeight(height);
		joffice.getAllTools().getToolgroupChildren().add(group);
		return group;
	}

	protected ToolGroup createSideBarToolGroup(RCPL joffice, String id,
			String name, String image) {
		return createToolGroup(joffice, id, name, image, 0, 0, session
				.getSystemPreferences().getToolSideBarWidth(), session
				.getSystemPreferences().getToolSideBarHeight());
	}

	protected ToolGroup createToolGroup(RCPL joffice, ToolGroup toolGroup,
			String id, String name, String image) {
		return createToolGroup(joffice, toolGroup, id, name, image, 0, 0, 0, 0);
	}

	protected ToolGroup createGridToolGroup(RCPL joffice, ToolGroup toolGroup,
			String id, int gridX, int gridY, int spanX, int spanY) {
		ToolGroup g = createToolGroup(joffice, toolGroup, id, id, null, 0, 0,
				0, 0);
		g.setGridX(gridX);
		g.setGridY(gridY);
		g.setSpanX(spanX);
		g.setSpanY(spanY);
		return g;
	}

	protected ToolGroup createToolGroup(RCPL joffice, ToolGroup toolGroup,
			String id, String name, String image, double x, double y,
			double width, double height) {
		ToolGroup group = createToolGroup(joffice, id, name, image, x, y,
				width, height);
		toolGroup.getToolGroups().add(group);

		return group;
	}

	public String getId() {
		return mainGroup.getId();
	}

	public ToolGroup getMainGroup() {
		return mainGroup;
	}
}
