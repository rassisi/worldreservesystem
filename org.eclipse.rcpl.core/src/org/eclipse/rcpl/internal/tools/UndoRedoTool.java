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

import org.eclipse.rcpl.IButton;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IUndoRedoListener;
import org.eclipse.rcpl.Rcpl;

import javafx.scene.control.ButtonBase;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

/**
 * @author ramin
 * 
 */
public class UndoRedoTool implements IUndoRedoListener {

	private UndoCombo undoCombo;

	private UndoCombo redoCombo;

	private IButton undoButton;

	private IButton redoButton;

	class UndoCombo extends ComboBox<ICommand> {
		public UndoCombo() {
			setMaxWidth(80);
			setPrefWidth(80);
			setCellFactory(new Callback<ListView<ICommand>, ListCell<ICommand>>() {
				@Override
				public ListCell<ICommand> call(ListView<ICommand> p) {
					return new ListCell<ICommand>() {
						private final Label label;

						{
							setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
							label = new Label();
						}

						@Override
						protected void updateItem(ICommand item, boolean empty) {
							super.updateItem(item, empty);
							if (item == null || empty) {
								setGraphic(null);
							} else {

								if (item.getNewData() != null && item.getNewData().length > 0
										&& item.getNewData()[0] instanceof String) {
									label.setText(
											item.getCommandId().getDisplayName() + " " + (String) item.getNewData()[0]);
								} else {
									label.setText(item.getCommandId().getDisplayName());
								}
								setGraphic(label);
							}
						}
					};
				}
			});
		}
	}

	public UndoRedoTool() {
		init();
	}

	@Override
	public ButtonBase getRedoButton() {
		return redoButton.getNode();
	}

	@Override
	public Control getRedoCombo() {
		return redoCombo;
	}

	@Override
	public ButtonBase getUndoButton() {
		return undoButton.getNode();
	}

	@Override
	public Control getUndoCombo() {
		return undoCombo;
	}

	@Override
	public void handle(List<ICommand> commandStack, int commandStackPointer) {
		if (commandStack.isEmpty()) {
			redoButton.setDisable(true);
			undoButton.setDisable(true);
			undoCombo.setDisable(true);
			redoCombo.setDisable(true);
		} else {
			undoButton.setDisable(commandStackPointer <= 0);
			undoCombo.setDisable(false);
			redoCombo.setDisable(false);
			redoButton.setDisable(commandStackPointer == commandStack.size() - 1);
		}

		int counter = 0;
		undoCombo.getItems().clear();
		for (int i = commandStackPointer; i >= 0 && counter < 10; i--, counter++) {
			undoCombo.getItems().add(commandStack.get(i));
		}

		redoCombo.getItems().clear();
		for (int i = commandStackPointer + 1; i < commandStack.size() && counter < 10; i++, counter++) {
			redoCombo.getItems().add(commandStack.get(i));
		}

	}

	private void init() {

		undoButton = Rcpl.getFactory().createButton("undo", "", "Undo", "undo", false, null, true);
		undoButton.setDisable(true);

		undoCombo = new UndoCombo();
		undoCombo.setDisable(true);

		redoCombo = new UndoCombo();
		redoCombo.setDisable(true);

		redoButton = Rcpl.getFactory().createButton("", "", "Redo", "redo", false, null, true);
		undoButton.setDisable(true);

	}

}
