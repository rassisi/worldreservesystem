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

package com.joffice.rcpl.plugin.office.tools;

import java.util.List;

import org.eclipse.rcpl.EStyleType;
import org.eclipse.rcpl.EnCommandId;
import org.eclipse.rcpl.EnServiceId;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IFont;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IResourceEntry;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.IToolComponent;
import org.eclipse.rcpl.IToolGroup;
import org.eclipse.rcpl.IToolRegistry;
import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

/**
 * @author ramin
 *
 */
public class StyleListTool extends RcplTool {

	public static double LABEL_FONT_SIZE = 13;

	ObservableList<String> data = FXCollections.observableArrayList();

	private class ListTool extends ListView<String> {
		@Override
		public ObservableList<Node> getChildren() {
			return super.getChildren();
		}
	}

	public StyleListTool(Tool eTool) {
		super(eTool);

		List<IStyle> list = Rcpl.globalStyleTemplate().getStyles();

		for (IStyle iStyle : list) {

			if (EStyleType.PARAGRAPH.equals(iStyle.getType())) {
				if (!iStyle.getId().startsWith("textart")) {
					data.add(iStyle.getId());
				}
			}
		}

		getNode().setItems(data);

		getNode().setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
			@Override
			public ListCell<String> call(ListView<String> p) {
				return new ColorRectCell();

			}
		});

		// setOnAction(new EventHandler<ActionEvent>() {
		//
		// @Override
		// public void handle(ActionEvent arg0) {
		// String fontName = getSelectionModel().getSelectedItem();
		// setFont(new JOFont(fontName, LABEL_FONT_SIZE, 0));
		// }
		// });

		// setMinHeight(28);

		getNode().setPrefHeight(1000);
		getNode().setPrefWidth(1000);

	}

	class ColorRectCell extends ListCell<String> {
		private final Label label;

		{
			setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
			label = new Label();
		}

		@Override
		public void updateItem(String item, boolean empty) {
			super.updateItem(item, empty);

			if (item == null || empty) {
				setGraphic(null);
			} else {
				IStyle style = Rcpl.globalStyleTemplate().findStyle(item);
				label.setText(item);
				if (style != null) {
					if (style != null) {
						if (style.getForeGround() != null) {
							label.setTextFill(style.getForeGround().getFx());
						}
						label.setFont(style.getFont().getFx());
					}
				}
				// label.setId("fontNameComboLabel");
				setGraphic(label);

				label.setOnMouseClicked(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						String selectedItem = StyleListTool.this.getNode().getSelectionModel().getSelectedItem();
						IParagraph par = getEditor().getSelectedParagraph();

						IStyle style = Rcpl.globalStyleTemplate().findStyle(selectedItem);

						if (par != null) {
							ICommand command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.setStyle, par,
									null, style, true, true);
							Rcpl.service().execute(command);

						}
					}
				});
			}
		}
	}

	public void initSelection() {
		IFont font = Rcpl.globalStyleTemplate().getDefaultStyle().getFont();
		selectFont(font);
		setFont(font);
	}

	public void selectFont(IFont font) {
		// getSelectionModel().select(font.getName());
	}

	public void setFont(IFont font) {
		ObservableList<Node> chs = getNode().getChildren();
		for (Node node : chs) {
			if (node instanceof Labeled) {
				((Labeled) node).setFont(font.getFx());
				break;
			}
		}
	}

	@Override
	public IToolRegistry getToolRegistry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResourceEntry getEntry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IToolComponent getToolComponent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVisible(boolean visible) {
		// TODO Auto-generated method stub

	}

	@Override
	public IToolGroup getGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFullSize() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getToolHierarchy() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrap() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ListTool createNode() {
		return new ListTool();
	}

	@Override
	public ListTool getNode() {
		return (ListTool) super.getNode();
	}

}
