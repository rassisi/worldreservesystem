package org.wrs.rcpl.ui.application;

import java.sql.SQLException;
import java.util.List;

import org.eclipse.rcpl.ip2location.IPEntry;
import org.eclipse.rcpl.ip2location.Ip2LocationFinder;
import org.eclipse.rcpl.libs.db.H2DB;
import org.eclipse.rcpl.ui.controls.RcplWorldMapView;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author ramin
 *
 */
public class HelloWorldMapView extends Application {

	public Node getPanel(Stage stage) {
		StackPane stackPane = new StackPane();
		RcplWorldMapView worldMapView = new RcplWorldMapView();

		StackPane.setAlignment(worldMapView, Pos.CENTER);
		stackPane.getChildren().add(worldMapView);

		Ip2LocationFinder locationFinder = new Ip2LocationFinder(new H2DB("wrs"));

		try {
			List<IPEntry> entries = locationFinder.findLocation("79.246.92.190");

			for (IPEntry ipEntry : entries) {
				worldMapView.getLocations().add(new RcplWorldMapView.IPLocation("WRS Node", ipEntry));
			}

			worldMapView.configureCountryAndLocationViewFactories();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return stackPane;
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		StackPane st = new StackPane();
		st.getChildren().add(getPanel(stage));
		Scene scene = new Scene(st, 600, 850);
		stage.setScene(scene);
		stage.centerOnScreen();
		stage.show();
	}
}
