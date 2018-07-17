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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.rcpl.IFont;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.RcplFont;
import org.eclipse.rcpl.Rcpl;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class StyleCombo extends ComboBox<String> {

	public static double LABEL_FONT_SIZE = 13;

	List<String> listAsString;

	public StyleCombo() {
		super();
		setId("fontNameTool");

		List<IStyle> list = Rcpl.globalStyleTemplate().getStyles();

		listAsString = new ArrayList<String>();
		for (IStyle iStyle : list) {
			listAsString.add(iStyle.getId());
		}

		getItems().addAll(listAsString);

		setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
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
							IStyle style = Rcpl.globalStyleTemplate().findStyle(
									item);
							label.setText(item);
							label.setTextFill(style.getForeGround().getFx());
							if (style != null) {
								label.setFont(style.getFont().getFx());
							}
							label.setId("fontNameComboLabel");
							setGraphic(label);
						}
					}
				};
			}
		});

		setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String fontName = getSelectionModel().getSelectedItem();
				setFont(new RcplFont(fontName, LABEL_FONT_SIZE, 0));
			}
		});

		setMinHeight(28);
	}

	public void initSelection() {
		IFont font = Rcpl.globalStyleTemplate().getDefaultStyle().getFont();
		selectFont(font);
		setFont(font);
	}

	public void selectFont(IFont font) {
		getSelectionModel().select(font.getName());
	}

	public void setFont(IFont font) {
		ObservableList<Node> chs = getChildren();
		for (Node node : chs) {
			if (node instanceof Labeled) {
				((Labeled) node).setFont(font.getFx());
				break;
			}
		}
	}

	public List<String> getListAsString() {
		return listAsString;
	}

}
