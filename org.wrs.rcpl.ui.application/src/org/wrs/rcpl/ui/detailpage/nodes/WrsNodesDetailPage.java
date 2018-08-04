package org.wrs.rcpl.ui.detailpage.nodes;

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

		WorldMapView worldmapView = new WorldMapView();

		worldmapView.getLocations().addAll(new WorldMapView.Location("SFO", 37.619751, -122.374366),
				new WorldMapView.Location("YYC", 51.128148, -114.010791),
				new WorldMapView.Location("ORD", 41.975806, -87.905294),
				new WorldMapView.Location("YOW", 45.321867, -75.668200),
				new WorldMapView.Location("JFK", 40.642660, -73.781232),
				new WorldMapView.Location("GRU", -23.427337, -46.478853),
				new WorldMapView.Location("RKV", 64.131830, -21.945686),
				new WorldMapView.Location("MAD", 40.483162, -3.579211),
				new WorldMapView.Location("CDG", 49.014162, 2.541908),
				new WorldMapView.Location("LHR", 51.471125, -0.461951),
				new WorldMapView.Location("SVO", 55.972401, 37.412537),
				new WorldMapView.Location("DEL", 28.555839, 77.100956),
				new WorldMapView.Location("PEK", 40.077624, 116.605458),
				new WorldMapView.Location("NRT", 35.766948, 140.385254),
				new WorldMapView.Location("SYD", -33.939040, 151.174996));

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
