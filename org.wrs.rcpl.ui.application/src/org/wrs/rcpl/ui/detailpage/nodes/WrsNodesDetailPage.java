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
			Rcpl.get().printErrorln("", e);
		}

		worldmapView = new RcplWorldMapView();
		worldmapView.configureCountryAndLocationViewFactories();

		mapView.getChildren().add(worldmapView);
		controlPane.getChildren().add(new Button("test"));

		startTask("Loading World Reserve System Nodes...", 1, null);
	}

	@Override
	protected Object task_1(RcplTask task, Object[] parameters) {
		Ip2LocationFinder locationFinder = new Ip2LocationFinder(Rcpl.UIC().getH2DB());
		try {
			progress(1, "Collect IP-Adresses", 0, 0);
			locationFinder.findMyIPAddress();
			progress(1, "Find Locations", 0, 0);
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
			Rcpl.get().printErrorln("", e);
		}
		return null;
	}

	@Override
	protected IModelDetailPageControler createControler() {
		return null;
	}

	@Override
	public String getName() {
		return "Nodes";
	}

}
