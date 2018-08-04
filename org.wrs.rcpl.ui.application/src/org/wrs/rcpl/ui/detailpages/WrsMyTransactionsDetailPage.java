package org.wrs.rcpl.ui.detailpages;

import org.controlsfx.control.spreadsheet.SpreadsheetView;
import org.eclipse.rcpl.detailpages.AbstractModelDetailPage;
import org.eclipse.rcpl.navigator.IModelDetailPageControler;

import javafx.scene.layout.StackPane;

/**
 * @author ramin
 *
 */
public class WrsMyTransactionsDetailPage extends AbstractModelDetailPage {

	@Override
	public void create(StackPane stackPane) {
		SpreadsheetView sv = new SpreadsheetView();
		stackPane.getChildren().add(sv);
	}

	@Override
	protected IModelDetailPageControler createControler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return "My Transactions";
	}

}
