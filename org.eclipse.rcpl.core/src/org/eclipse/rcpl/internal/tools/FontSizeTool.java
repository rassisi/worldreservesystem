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

import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IFont;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.JOEvent;
import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ComboBox;

public class FontSizeTool extends RcplTool {

	Double[] items = new Double[] { 8.0, 10.0, 11.0, 12.0, 14.0, 16.0, 18.0, 20.0, 22.0, 24.0, 26.0, 28.0, 36.0, 48.0,
			72.0 };

	boolean enableEvents = true;

	public FontSizeTool(final Tool tool) {
		super(tool);
		getNode().getItems().addAll(items);
		getNode().setPrefWidth(65);
		initSelection();
		addListener();
	}

	private ChangeListener<Double> changeListener;

	/**
	 * 
	 */
	private void addListener() {

		changeListener = new ChangeListener<Double>() {
			@Override
			public void changed(ObservableValue<? extends Double> observable, Double oldValue, Double newValue) {

				if (getEditor() != null) {
					getTool().setData(FontSizeTool.this);
					ICommand command = Rcpl.getFactory().createCommand(getEditor(), FontSizeTool.this);
					Rcpl.service().execute(command);
				}
			}
		};
		getNode().valueProperty().addListener(changeListener);
	}

	private void removeListener() {
		if (changeListener != null) {
			getNode().valueProperty().removeListener(changeListener);
			changeListener = null;
		}
	}

	private void initSelection() {
		if (Rcpl.globalStyleTemplate() != null) {
			IFont font = Rcpl.globalStyleTemplate().findStyle("Normal").getFont();
			getNode().getSelectionModel().select(font.getHeight());
			setFontSize(font.getHeight());
		}
	}

	public void setFontSize(double h) {
		removeListener();
		enableEvents = false;
		for (Double d : items) {
			if (d.doubleValue() >= h) {
				getNode().getSelectionModel().select(d);
				return;
			}
		}
		enableEvents = true;
	}

	public double getSize() {
		try {
			return getNode().getSelectionModel().getSelectedItem();
		} catch (Exception ex) {
			return 12;
		}
	}

	@Override
	public ComboBox<Double> createNode() {
		return new ComboBox<Double>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ComboBox<Double> getNode() {
		return (ComboBox<Double>) super.getNode();
	}

	@Override
	public void update(JOEvent event) {
		ILayoutObject lo = event.getLayoutObject();
		if (lo instanceof IParagraph) {
			IParagraph p = (IParagraph) lo;
			IStyle style = p.findCharacterStyleAtOffset();
			removeListener();
			setFontSize(style.getFont().getHeight());
			addListener();
		}
	}

	@Override
	public void setEditor(IEditor editor) {
		if (editor == null) {
			System.out.println();
		}
		super.setEditor(editor);
	}
}
