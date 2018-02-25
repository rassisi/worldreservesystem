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

package org.eclipse.rcpl.internal.tools;

import java.util.List;

import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IFont;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.JOEvent;
import org.eclipse.rcpl.RcplFont;
import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.text.Font;
import javafx.util.Callback;

/**
 * @author ramin
 *
 */
public class FontNameTool extends RcplTool {

	private static double LABEL_FONT_SIZE = 12;

	private class ToolCombo extends ComboBox<String> {
		@Override
		public ObservableList<Node> getChildren() {
			return super.getChildren();
		}
	}

	private ToolCombo node;

	public FontNameTool(final Tool tool) {
		super(tool);

		List<String> list = Font.getFamilies();

		getNode().getItems().addAll(list);

		node.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
			@Override
			public ListCell<String> call(ListView<String> p) {
				return new ListCell<String>() {
					private final Label label;

					{
						setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
						label = new Label();
					}

					@Override
					protected void updateItem(String item, boolean empty) {
						super.updateItem(item, empty);
						if (item == null || empty) {
							setGraphic(null);
						} else {
							label.setText(item);
							label.setFont(Font.font(item, LABEL_FONT_SIZE));
							label.setId("fontNameComboLabel");
							setGraphic(label);
						}
					}
				};
			}
		});

		addListener();

		// node.setOnAction(new EventHandler<ActionEvent>() {
		//
		// @Override
		// public void handle(ActionEvent arg0) {
		// IParagraph paragraph = Rcpl.UIC.getEditor().getSelectedParagraph();
		// // paragraph.getStyle()
		// String fontName = node.getSelectionModel().getSelectedItem();
		// if (Rcpl.UIC.getEditor() != null) {
		// ICommand command = Rcpl.getFactory().createCommand(FontNameTool.this,
		// paragraph, null, fontName);
		// Rcpl.service().execute(command);
		// }
		// }
		// });

		node.setMinHeight(26);

		node.setPrefWidth(150);
	}

	private ChangeListener<String> changeListener;

	/**
	 * 
	 */
	private void addListener() {

		changeListener = new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

				if (getEditor() != null) {
					IParagraph paragraph = getEditor().getSelectedParagraph();
					String fontName = node.getSelectionModel().getSelectedItem();
					ICommand command = Rcpl.getFactory().createCommand(getEditor(), FontNameTool.this, paragraph, null,
							fontName);
					Rcpl.service().execute(command);
				}
			}
		};
		node.valueProperty().addListener(changeListener);
	}

	private void removeListener() {
		if (changeListener != null) {
			node.valueProperty().removeListener(changeListener);
			changeListener = null;
		}
	}

	public void initSelection() {
		if (Rcpl.globalStyleTemplate() != null) {
			IFont font = Rcpl.globalStyleTemplate().getDefaultStyle().getFont();
			selectFont(font);
		}
		// setFont(font);
	}

	public void selectFont(IFont font) {
		node.getSelectionModel().select(font.getName());

		// removeListener();
		// enableEvents = false;
		// for (String d : items) {
		// if (d.doubleValue() >= h) {
		// getSelectionModel().select(d);
		// addListener();
		// return;
		// }
		// }
		// enableEvents = true;
		// addListener();
		// }

	}

	public void setStyle(IStyle style) {
		ObservableList<Node> chs = node.getChildren();
		for (Node node : chs) {
			if (node instanceof Labeled) {
				double height = Math.min(15, style.getFont().getHeight());
				height = Math.max(14, height);

				((Labeled) node)
						.setFont(new RcplFont(style.getFont().getName(), height, style.getFont().getStyle()).getFx());
				// if (style.getForeGround() != null) {
				// ((Labeled) node).setTextFill(style.getForeGround().getFx());
				// }
				break;
			}
		}
	}

	@Override
	public ComboBox<String> createNode() {
		return new ToolCombo();
	}

	@Override
	public ComboBox<String> getNode() {
		if (node == null) {
			node = (ToolCombo) super.getNode();
		}
		return node;
	}

	@Override
	public void update(JOEvent event) {
		try {
			ILayoutObject lo = event.getLayoutObject();
			if (lo instanceof IParagraph) {
				IParagraph p = (IParagraph) lo;
				IStyle style = p.findCharacterStyleAtOffset();
				removeListener();
				selectFont(style.getFont());
				addListener();
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}
}
