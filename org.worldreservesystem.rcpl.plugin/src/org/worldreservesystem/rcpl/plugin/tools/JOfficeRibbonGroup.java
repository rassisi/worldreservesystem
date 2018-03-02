/*******************************************************************************
 * Copyright (c) 2003 - 2014 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/

package org.worldreservesystem.rcpl.plugin.tools;

import org.eclipse.rcpl.IButton;
import org.eclipse.rcpl.ITool;
import org.eclipse.rcpl.JOEvent;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.WaitThread;
import org.eclipse.rcpl.internal.fx.figures.JOButton;
import org.eclipse.rcpl.internal.tools.FontNameTool;
import org.eclipse.rcpl.internal.tools.FontSizeTool;
import org.eclipse.rcpl.internal.tools.JORibbonGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;

import javafx.application.Platform;

public class JOfficeRibbonGroup extends JORibbonGroup {

	private StyleCombo styleComboTool;

	// public JOTool(String id, String name, String toolTip, String imageName,
	// boolean toggle) {

	public JOfficeRibbonGroup(ToolGroup toolGroup, boolean first, boolean dialogButton) {
		super(toolGroup, first, dialogButton);
	}

	protected ITool createTool(Tool eTool) {

		ITool tool = Rcpl.getToolFactory().createTool(eTool);

		return tool;
	}

	@Override
	protected int processRibbonGroup() {
		int lastX = super.processRibbonGroup();
		if ("topBar/styles".equals(toolGroup.getId())) {
			styleComboTool = new StyleCombo();
			add(styleComboTool, ++lastX, 0, 1, 1);
		}
		return lastX;
	}

	@Override
	protected void updateToolGroup(JOEvent event) {
		try {
			String id = toolGroup.getId();

			if ("topBar/font".equals(id)) {

				for (ToolGroup g : toolGroup.getToolGroups()) {

					try {
						id = g.getId();
						if ("characterStyle".equals(id)) {
							for (Tool tool : g.getTools()) {
								id = tool.getId();

								if ("bold".equals(id)) {
									ITool n = registry.get(tool);
									if (n instanceof IButton) {
										((IButton) n).setSelected(event.getStyle().isBold());
									}
								}

								if ("italic".equals(id)) {
									JOButton n = (JOButton) registry.get(tool);
									if (n != null) {
										n.setSelected(event.getStyle().isItalic());
									}
								}
							}
						}
					} catch (Exception ex) {
						// TODO
						//
					}

				}

			}

		} catch (Exception ex) {
			// TODO
			// ();
		}
		if ("topBar/styles".equals(toolGroup.getId())) {

			String styleId = event.getLayoutObject().getStyle().getId();
			final int index = Math.max(0, styleComboTool.getListAsString().indexOf(styleId));

			// System. out.("index: " + index);
			new WaitThread(getEditor()) {

				@Override
				public void doRun() {
					styleComboTool.getSelectionModel().select(index);
				}
			};

			for (Tool t : toolGroup.getTools()) {

				try {
					String id = t.getId();

					JOButton n = (JOButton) registry.get(t);
					n.setSelected(styleId.equals(id));

				} catch (Exception ex) {
					// TODO
					//

				}

			}

		}
	}
}
