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

import java.util.Arrays;
import java.util.List;

import org.eclipse.rcpl.EnCommandId;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IFont;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import com.joffice.rcpl.plugin.office.databinding.types.JOTextboxType;

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
public class TextboxListTool extends RcplTool {

	public static double LABEL_FONT_SIZE = 13;

	ObservableList<JOTextboxType> data = FXCollections.observableArrayList();

	private class ListTool extends ListView<JOTextboxType> {
		@Override
		public ObservableList<Node> getChildren() {
			return super.getChildren();
		}
	}

	public TextboxListTool(Tool eTool) {
		super(eTool);

		List<JOTextboxType> list = Arrays.asList(JOTextboxType.values());

		for (JOTextboxType iTable : list) {
			data.add(iTable);
		}

		getNode().setItems(data);

		getNode().setCellFactory(new Callback<ListView<JOTextboxType>, ListCell<JOTextboxType>>() {
			@Override
			public ListCell<JOTextboxType> call(ListView<JOTextboxType> p) {
				return new ColorRectCell();

			}
		});

		getNode().setPrefHeight(1000);
		getNode().setPrefWidth(1000);

	}

	class ColorRectCell extends ListCell<JOTextboxType> {
		private final Label label;

		{
			setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
			label = new Label();
		}

		@Override
		public void updateItem(JOTextboxType item, boolean empty) {
			super.updateItem(item, empty);

			if (item == null || empty) {
				setGraphic(null);
			} else {

				// IStyle style = Rcpl.globalStyleTemplate().findStyle(item);
				label.setText(item.getDisplayName());
				// if (style != null) {
				// if (style != null) {
				// if (style.getForeGround() != null) {
				// label.setTextFill(style.getForeGround().getFx());
				// }
				// label.setFont(style.getFont().getFx());
				// }
				// }
				// label.setId("fontNameComboLabel");
				setGraphic(label);

				label.setOnMouseClicked(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						JOTextboxType selectedItem = TextboxListTool.this.getNode().getSelectionModel()
								.getSelectedItem();
						IParagraph par = getEditor().getSelectedParagraph();
						if (par != null) {
							ICommand command = Rcpl.getFactory().createCommand(getEditor(), EnCommandId.insertTextbox,
									par, null, selectedItem);
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
	public ListTool createNode() {
		return new ListTool();
	}

	@Override
	public ListTool getNode() {
		return (ListTool) super.getNode();
	}

}
