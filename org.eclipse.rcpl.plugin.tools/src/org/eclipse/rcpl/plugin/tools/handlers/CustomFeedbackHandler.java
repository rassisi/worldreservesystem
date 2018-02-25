package org.eclipse.rcpl.plugin.tools.handlers;

import javafx.scene.control.Cell;
import javafx.scene.control.TableView;

import org.eclipse.fx.emf.edit.ui.dnd.EditingDomainCellDropAdapter.IDnDFeedbackHandler;

/**
 * A custom {@link IDnDFeedbackHandler} that increases the padding to make room
 * for the dragged {@link Cell}. This does not work well with {@link TableView}
 * s.
 */
public class CustomFeedbackHandler implements IDnDFeedbackHandler {

	@Override
	public void onFeedbackInsertBefore(Cell<?> cell) {
		cell.setStyle("-fx-padding: 15 3 3 3;");
	}

	@Override
	public void onFeedbackInsertAfter(Cell<?> cell) {
		cell.setStyle("-fx-padding: 3 3 15 3;");
	}

	@Override
	public void onFeedbackSelect(Cell<?> cell) {
		cell.setStyle(null);
	}

	@Override
	public void onFeedbackNone(Cell<?> cell) {
		cell.setStyle(null);
	}

}