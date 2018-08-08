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

import javafx.application.Platform;
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
			Rcpl.printErrorln("", e);
		}

		worldmapView = new RcplWorldMapView();
		worldmapView.configureCountryAndLocationViewFactories();

		mapView.getChildren().add(worldmapView);
		controlPane.getChildren().add(new Button("test"));

		startTask("Loading World Reserve System Nodes...", 1);
	}

	@Override
	protected void task_1() {
		updateLocations();
	}

	private void updateLocations() {
		Ip2LocationFinder locationFinder = new Ip2LocationFinder(Rcpl.UIC.getH2DB());
		try {
			taskMessage("Collect IP-Adresses");
			locationFinder.findMyIPAddress();
			taskMessage("Find Locations");
			List<IPEntry> entries = locationFinder.findMyLocation();

			Platform.runLater(new Runnable() {

				@Override
				public void run() {
					for (IPEntry ipEntry : entries) {
						worldmapView.getLocations().add(new RcplWorldMapView.IPLocation("WRS Node", ipEntry));
					}
				}
			});
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
