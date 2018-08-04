package org.wrs.rcpl.ui.detailpages;

import java.io.IOException;
import java.net.URL;

import org.eclipse.rcpl.detailpages.AbstractModelDetailPage;
import org.eclipse.rcpl.navigator.IModelDetailPageControler;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author ramin
 *
 */
public class WrsMyAccountDetailPage extends AbstractModelDetailPage {

	@Override
	public void create(StackPane stackPane) {
		URL location = getClass().getResource("wrs_my_account_detailpage.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
//		fxmlLoader.setController(getControler());

		try {
			VBox node = fxmlLoader.load();
			stackPane.getChildren().add(node);
		} catch (IOException e) {
			e.printStackTrace();
			// System.exit(1);
		}
	}

	@Override
	protected IModelDetailPageControler createControler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return "My Account";
	}

}
