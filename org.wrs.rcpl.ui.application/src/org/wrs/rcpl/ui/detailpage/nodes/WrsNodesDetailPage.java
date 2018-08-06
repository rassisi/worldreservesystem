package org.wrs.rcpl.ui.detailpage.nodes;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.controlsfx.control.TaskProgressView;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.detailpages.AbstractModelDetailPage;
import org.eclipse.rcpl.ip2location.IPEntry;
import org.eclipse.rcpl.ip2location.Ip2LocationFinder;
import org.eclipse.rcpl.navigator.IModelDetailPageControler;
import org.eclipse.rcpl.ui.controls.RcplWorldMapView;

import javafx.application.Platform;
import javafx.concurrent.Task;
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

	private TaskProgressView<MyTask> taskProgressView;

	private ExecutorService executorService = Executors.newCachedThreadPool();

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

		taskProgressView = new TaskProgressView<WrsNodesDetailPage.MyTask>();
		getProgressViewArea().getChildren().add(taskProgressView);
		worldmapView = new RcplWorldMapView();
		worldmapView.configureCountryAndLocationViewFactories();

		mapView.getChildren().add(worldmapView);
		controlPane.getChildren().add(new Button("test"));

		startTask();
	}

	private void updateLocations() {
		Ip2LocationFinder locationFinder = new Ip2LocationFinder(Rcpl.UIC.getH2DB());
		try {
			task.message("Collect IP-Adresses");
			locationFinder.findMyIPAddress();
			task.message("Find Locations");
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

	class MyTask extends Task<Void> {

		public MyTask(String title) {
			updateTitle(title);

		}

		public void message(String msg) {
			task.updateMessage(msg);
		}

		@Override
		protected Void call() throws Exception {

			updateLocations();

//				updateMessage("Message " + i);
//				updateProgress(i, max);

			updateProgress(0, 0);
			Platform.runLater(new Runnable() {

				@Override
				public void run() {
					collapseTaskView();
				}
			});

			done();

			return null;
		}
	}

	private MyTask task;

	int taskCounter = 0;

	private void startTask() {
		taskCounter++;
		expandTaskView();
		task = new MyTask(taskCounter + ". Loading World Reserve System Nodes..."); // + taskCounter);
		taskProgressView.getTasks().add(task);
		executorService.submit(task);
	}
}
