package org.wrs.rcpl.ui.detailpage.nodes;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;

import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.detailpages.AbstractModelDetailPage;
import org.eclipse.rcpl.ip2location.IPEntry;
import org.eclipse.rcpl.ip2location.Ip2LocationFinder;
import org.eclipse.rcpl.navigator.IModelDetailPageControler;
import org.eclipse.rcpl.ui.controls.RcplWorldMapView;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * @author ramin
 *
 */
public class WrsNodesDetailPage extends AbstractModelDetailPage {

	@FXML
	StackPane mapView;

	@FXML
	StackPane controlPane;

	VBox node;

	private RcplWorldMapView worldmapView;

	@Override
	public void create(StackPane stackPane) {
		setImage("nodes");
		URL location = getClass().getResource("nodes_detailpage.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		fxmlLoader.setController(this);

		try {
			node = fxmlLoader.load();
			stackPane.getChildren().add(node);
		} catch (IOException e) {
			e.printStackTrace();
			// System.exit(1);
		}

		worldmapView = new RcplWorldMapView();

//		Rcpl.showProgress(true);
//		Rcpl.progressMessage("Load Nodes Map", 100);
//		Rcpl.startProgress(1, false);
//
//		Platform.runLater(new Runnable() {
//
//			@Override
//			public void run() {
//				updateLocations();
//			}
//		});

		updateLocations();

		mapView.getChildren().add(worldmapView);
		controlPane.getChildren().add(new Button("test"));

	}

	private void updateLocations() {
		Ip2LocationFinder locationFinder = new Ip2LocationFinder(Rcpl.UIC.getH2DB());
		try {
			locationFinder.findMyIPAddress();
			List<IPEntry> entries = locationFinder.findMyLocation();
			for (IPEntry ipEntry : entries) {
				worldmapView.getLocations().add(new RcplWorldMapView.IPLocation("WRS Node", ipEntry));
			}
			worldmapView.configureCountryAndLocationViewFactories();
		} catch (SQLException e) {
			Rcpl.printErrorln("", e);
		}
		Rcpl.showProgress(false);
	}

	@Override
	protected IModelDetailPageControler createControler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return "Nodes";
	}

}
