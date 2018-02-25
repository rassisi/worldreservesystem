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
package org.eclipse.rcpl.internal.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.rcpl.EnServiceId;
import org.eclipse.rcpl.ITool;
import org.eclipse.rcpl.IToolFactory;
import org.eclipse.rcpl.IURLAddressTool;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.internal.fx.figures.JOButton;
import org.eclipse.rcpl.internal.tools.FontNameTool;
import org.eclipse.rcpl.internal.tools.FontSizeTool;
import org.eclipse.rcpl.internal.tools.CheckBoxTool;
import org.eclipse.rcpl.internal.tools.ComboBoxTool;
import org.eclipse.rcpl.internal.tools.DateTool;
import org.eclipse.rcpl.internal.tools.JOFlowPaneTool;
import org.eclipse.rcpl.internal.tools.GridPaneTool;
import org.eclipse.rcpl.internal.tools.JOHtmlTool;
import org.eclipse.rcpl.internal.tools.JOHyperLinkTool;
import org.eclipse.rcpl.internal.tools.JOImageTool;
import org.eclipse.rcpl.internal.tools.LabelTool;
import org.eclipse.rcpl.internal.tools.JOListTool;
import org.eclipse.rcpl.internal.tools.JOMenuButtonTool;
import org.eclipse.rcpl.internal.tools.JOPasswordTool;
import org.eclipse.rcpl.internal.tools.JOProgressBarTool;
import org.eclipse.rcpl.internal.tools.JOProgressIndicatorTool;
import org.eclipse.rcpl.internal.tools.JORadioButtonTool;
import org.eclipse.rcpl.internal.tools.JOSeparatorTool;
import org.eclipse.rcpl.internal.tools.JOSliderTool;
import org.eclipse.rcpl.internal.tools.JOSplitMenuTool;
import org.eclipse.rcpl.internal.tools.JOTextAreaTool;
import org.eclipse.rcpl.internal.tools.JOTextFieldTool;
import org.eclipse.rcpl.internal.tools.JOWebBrowserTool;
import org.eclipse.rcpl.internal.tools.URLAddressTool;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;

import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;

public class RcplToolFactory implements IToolFactory {

	@Override
	public ITool createURLAddressTool(ToolGroup toolGroup) {
		IURLAddressTool iurl = new URLAddressTool(null);
		iurl.setToolGroup(toolGroup);
		return iurl;
	}

	@Override
	public ITool createTool(final Tool emfTool) {
		return createTool(emfTool, 0, 0);
	}

	@Override
	public ITool createTool(final Tool emfTool, double width, double height) {

		ITool tool = null;
		String id = emfTool.getId();

		if (id != null && !Tool.ids.contains(id)) {
			Tool.ids.add(id);
		}

		switch (emfTool.getType()) {
		case NAVIGATOR:

			break;
		case BUTTON:
			tool = new JOButton(emfTool);
			tool.setBounds(0, 0, width, height);
			break;
		case CHECKBOX:
			tool = new CheckBoxTool(emfTool);
			emfTool.setLabeled(true);
			break;
		case COMBO:

			if ("fontName".equals(emfTool.getFormat())) {
				tool = new FontNameTool(emfTool);
				emfTool.setService(EnServiceId.PARAGRAPH_SERVICE.name());
				GridPane.setHgrow(tool.getNode(), Priority.ALWAYS);
				break;
			}

			if ("fontSize".equals(emfTool.getFormat())) {
				tool = new FontSizeTool(emfTool);
				emfTool.setService(EnServiceId.PARAGRAPH_SERVICE.name());
				GridPane.setHgrow(tool.getNode(), Priority.ALWAYS);
				break;
			}
			ComboBoxTool combo = new ComboBoxTool(emfTool);
			GridPane.setHgrow(combo.getNode(), Priority.ALWAYS);
			tool = combo;
			if (emfTool.getFormat() != null) {

				try {
					Class<?> clazz = Class.forName(emfTool.getFormat());
					if (clazz.isEnum()) {
						Object[] values = clazz.getEnumConstants();

						for (int i = 0; i < values.length; i++) {
							combo.getNode().getItems().add(values[i].toString());
						}
					}
				} catch (ClassNotFoundException e) {
					if (emfTool.getFormat() != null) {
						List<String> list = new ArrayList<String>(Arrays.asList(emfTool.getFormat().split(",")));

						List<String> list2 = new ArrayList<String>();
						int index = 0;
						int sel = -1;
						for (String string : list) {
							int pos = string.indexOf("{");
							if (pos != -1) {
								string = string.substring(0, pos);
								sel = index++;
							}
							list2.add(string);
						}
						combo.getNode().getItems().addAll(list2);
						combo.getNode().getSelectionModel().select(sel);
					}
				}

			}
			break;
		case DATEANDTIMEFIELD:
			tool = new DateTool(emfTool);
			break;
		case DATEFIELD:
			tool = new DateTool(emfTool);
			break;
		case PASSWORDFIELD:
			tool = new JOPasswordTool(emfTool);
			break;
		case RADIOBUTTON:
			tool = new JORadioButtonTool(emfTool);
			break;
		case SPLITMENUBUTTON:
			JOSplitMenuTool b = new JOSplitMenuTool(emfTool);
			b.getNode().setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, null, null)));

			String imName = emfTool.getImage();
			if (imName != null) {
				Node im = Rcpl.resources().getImage(imName, 16, 16).getNode();
				if (im != null) {
					b.getNode().setGraphic(im);
				} else {

				}
			}
			b.getNode().setMaxHeight(18);
			tool = b;
			break;
		case TEXTFIELD:
			tool = new JOTextFieldTool(emfTool);
			break;
		case TOGGLEBUTTON:
			tool = new JOButton(emfTool);
			((JOButton) tool).setSelected(false);
			break;
		case CHOICEBOX:
			break;
		case COLOR_CHOOSER:
			break;
		case HTMLEDITOR:
			tool = new JOHtmlTool(emfTool);
			break;
		case HYPERLINK:
			tool = new JOHyperLinkTool(emfTool);
			break;
		case IMAGEVIEW:
			tool = new JOImageTool(emfTool);
			break;
		case LABEL:
			tool = new LabelTool(emfTool);
			break;
		case LISTVIEW:
			tool = new JOListTool(emfTool);
			break;
		case MENUBAR:
			tool = new JOMenuButtonTool(emfTool);
			break;
		case MENUBUTTON:
			tool = new JOMenuButtonTool(emfTool);
			break;
		case PROGRESSBAR:
			tool = new JOProgressBarTool(emfTool);
			break;
		case PROGRESSINDICATOR:
			tool = new JOProgressIndicatorTool(emfTool);
			break;
		case SEPARATOR_HORIZONTAL:
			tool = new JOSeparatorTool(emfTool); // (Orientation.HORIZONTAL);
			break;
		case SEPARATOR_VERTICAL:
			tool = new JOSeparatorTool(emfTool); // Orientation.VERTICAL);
			break;
		case SLIDER_HORIZONTAL:
			JOSliderTool sl = new JOSliderTool(emfTool);
			sl.getNode().setOrientation(Orientation.HORIZONTAL);
			tool = sl;
			break;
		case SLIDER_VERTICAL:
			sl = new JOSliderTool(emfTool);
			sl.getNode().setOrientation(Orientation.VERTICAL);
			tool = sl;
			break;
		case TEXTAREA:
			tool = new JOTextAreaTool(emfTool);
			break;
		case WEBVIEW:
			tool = new JOWebBrowserTool(emfTool);
			break;
		case GRIDPANE:
			tool = new GridPaneTool(emfTool);
			break;
		case FLOWPANE:
			tool = new JOFlowPaneTool(emfTool);
			break;
		default:
			break;

		}

		if (tool instanceof Control) {
			double w = getWidth(emfTool);
			if (w > 0) {
				((Control) tool).setMaxWidth(w);
			}
		}
		if (tool != null) {
			tool.getNode().setUserData(emfTool);
		}
		return tool;
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
