package com.joffice.rcpl.plugin.office.internal.impl;

import org.eclipse.rcpl.EnCustomToolIds;
import org.eclipse.rcpl.EnServiceId;
import org.eclipse.rcpl.ITool;
import org.eclipse.rcpl.internal.impl.RcplToolFactory;
import org.eclipse.rcpl.internal.tools.CharacterStyleListTool;
import org.eclipse.rcpl.internal.tools.FontNameTool;
import org.eclipse.rcpl.internal.tools.FontSizeTool;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import com.joffice.rcpl.plugin.office.tools.StyleListTool;

import javafx.scene.control.Control;

/**
 * @author ramin
 *
 */
public class JOfficeToolFactory extends RcplToolFactory {

	@Override
	public ITool createTool(final Tool eTool) {

		ITool tool = null;
		String id = eTool.getId();

		if (id != null && !Tool.ids.contains(id)) {
			Tool.ids.add(id);
		}

		switch (eTool.getType()) {

		case COMBO:
			if (EnCustomToolIds.FONT_NAME_TOOL.name().equals(eTool.getFormat())
					|| "fontName".equals(eTool.getFormat())) {
				FontNameTool fontNameTool = new FontNameTool(eTool);
				eTool.setService(EnServiceId.PARAGRAPH_SERVICE.name());
				fontNameTool.initSelection();
				tool = fontNameTool;
				updateNode(eTool, tool);
				return tool;
			} else if (EnCustomToolIds.FONT_SIZE_TOOL.name().equals(eTool.getFormat())
					|| "fontSize".equals(eTool.getFormat())) {
				FontSizeTool fontSizeTool = new FontSizeTool(eTool);
				tool = fontSizeTool;
				updateNode(eTool, tool);
				return tool;
			} else {
				return super.createTool(eTool);
			}

		case LISTVIEW:
			if (EnCustomToolIds.PARAGRAPH_STYLES_TOOL.name().equals(eTool.getFormat())
					|| "styleListTool".equals(eTool.getFormat())) {
				StyleListTool styleList = new StyleListTool(eTool);
				tool = styleList;
				updateNode(eTool, tool);
				return tool;
			} else if (EnCustomToolIds.CHARACTER_STYLES_TOOL.name().equals(eTool.getFormat())
					|| "characterListTool".equals(eTool.getFormat())) {
				tool = new CharacterStyleListTool(eTool);
				updateNode(eTool, tool);
				return tool;
			} else {
				return super.createTool(eTool);
			}

		case OTHER:
				return super.createTool(eTool);
		default:
			return super.createTool(eTool);
		}

	}

	private void updateNode(Tool tool, ITool node) {
		if (node instanceof Control) {
			double width = getWidth(tool);
			if (width > 0) {
				((Control) node).setMaxWidth(width);
			}
		}
		if (node != null) {
			node.getNode().setUserData(tool);
		}
	}

	private static double getWidth(Tool tool) {
		try {
			String format = tool.getFormat();
			if (format != null) {
				String[] splits = format.split(",");
				for (String tok : splits) {
					if (tok.startsWith("w=")) {
						return Integer.valueOf(tok.substring(2));
					}
				}

			}
		} catch (Exception ex) {
			// TODO
		}
		return -1;
	}

}
