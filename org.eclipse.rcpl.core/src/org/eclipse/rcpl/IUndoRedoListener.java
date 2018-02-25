package org.eclipse.rcpl;

import java.util.List;

import javafx.scene.control.ButtonBase;
import javafx.scene.control.Control;

/**
 * @author ramin
 *
 */
public interface IUndoRedoListener {

	void handle(List<ICommand> commandStack, int commandStackPointer);

	Control getUndoCombo();

	Control getRedoCombo();

	ButtonBase getUndoButton();

	ButtonBase getRedoButton();

}
