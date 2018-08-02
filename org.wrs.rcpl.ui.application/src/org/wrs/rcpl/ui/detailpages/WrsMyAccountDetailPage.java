package org.wrs.rcpl.ui.detailpages;

import org.controlsfx.control.spreadsheet.SpreadsheetView;
import org.eclipse.rcpl.navigator.IModelDetailPageControler;
import org.eclipse.rcpl.navigator.details.AbstractModelDetailPage;

import javafx.scene.layout.StackPane;

/**
 * @author ramin
 *
 */
public class WrsMyAccountDetailPage extends AbstractModelDetailPage {

	@Override
	public void create(StackPane stackPane) {

//		Label l = new Label("AccountDetailPage");
//		stackPane.getChildren().add(l);

		SpreadsheetView sv = new SpreadsheetView();
		stackPane.getChildren().add(sv);

	}

	@Override
	protected IModelDetailPageControler createControler() {
		// TODO Auto-generated method stub
		return null;
	}

}
