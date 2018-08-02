package org.wrs.rcpl.ui.detailpages;

import org.controlsfx.control.spreadsheet.SpreadsheetView;
import org.eclipse.rcpl.navigator.INavigatorDetailPageControler;
import org.eclipse.rcpl.navigator.details.AbstractNavigatorDetailPage;

import javafx.scene.layout.StackPane;

/**
 * @author ramin
 *
 */
public class WrsMyAccountDetailPage extends AbstractNavigatorDetailPage {

	@Override
	public void create(StackPane stackPane) {

//		Label l = new Label("AccountDetailPage");
//		stackPane.getChildren().add(l);

		SpreadsheetView sv = new SpreadsheetView();
		stackPane.getChildren().add(sv);

	}

	@Override
	protected INavigatorDetailPageControler createControler() {
		// TODO Auto-generated method stub
		return null;
	}

}
