package org.worldreservesystem.navigator.detailpages;

import java.io.IOException;
import java.net.URL;

import org.eclipse.rcpl.IDetailPage;
import org.eclipse.rcpl.Rcpl;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

/**
 * @author Ramin
 *
 */
public class OverviewDetailPage implements IDetailPage {

	private OverviewDetailPageController controller;
	private GridPane root;
	
	public OverviewDetailPage() {
		super();
	}

	@Override
	public Node create() {
		URL location = getClass().getResource("/org/worldreservesystem/navigator/detailpages/content.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		controller = new OverviewDetailPageController();
		fxmlLoader.setController(controller);

		try {
			
			root = fxmlLoader.load();
			
//			internalBorderPane.setCenter(editorArea);
//			init(internalBorderPane);
			
			return root;

		} catch (IOException e) {
			e.printStackTrace();
			// System.exit(1);
		}
		return null;
	}


	public GridPane getRoot() {
		return root;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "WRS_NETWORK_OVERVIEW";
	}
	
	
	
}
