package org.wrs.rcpl.ui.detailpage.nodes;

import java.sql.SQLException;
import java.util.List;

import org.controlsfx.control.WorldMapView;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.detailpages.AbstractModelDetailPage;
import org.eclipse.rcpl.ip2location.IPEntry;
import org.eclipse.rcpl.ip2location.Ip2LocationFinder;
import org.eclipse.rcpl.navigator.IModelDetailPageControler;
import org.eclipse.rcpl.ui.controls.RcplWorldMapView;

import javafx.scene.layout.StackPane;

/**
 * @author ramin
 *
 */
public class WrsNodesDetailPage extends AbstractModelDetailPage {

	@Override
	public void create(StackPane stackPane) {
		setImage("nodes");
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

		RcplWorldMapView worldmapView = new RcplWorldMapView();

		Ip2LocationFinder locationFinder = new Ip2LocationFinder(Rcpl.UIC.getH2DB());

		try {

			locationFinder.findMyIPAddress();

			List<IPEntry> entries = locationFinder.findMyLocation();

			for (IPEntry ipEntry : entries) {
				worldmapView.getLocations()
						.add(new WorldMapView.Location("WRS Node", ipEntry.getLatitude(), ipEntry.getLongitude()));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
