package org.wrs.rcpl.ui.detailpages;

import org.controlsfx.control.WorldMapView;
import org.eclipse.rcpl.detailpages.AbstractModelDetailPage;
import org.eclipse.rcpl.navigator.IModelDetailPageControler;

import javafx.scene.layout.StackPane;

/**
 * @author ramin
 *
 */
public class WrsNodesDetailPage extends AbstractModelDetailPage {

	@Override
	public void create(StackPane stackPane) {
//		URL location = getClass().getResource("wrs_my_account_detailpage.fxml");
//		FXMLLoader fxmlLoader = new FXMLLoader(location);
//		fxmlLoader.setController(getControler());

//		try {
//			VBox node = fxmlLoader.load();
//			stackPane.getChildren().add(node);
//		} catch (IOException e) {
//			e.printStackTrace();
//			// System.exit(1);
//		}

		WorldMapView worldmapView = new WorldMapView();
		stackPane.getChildren().add(worldmapView);

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
