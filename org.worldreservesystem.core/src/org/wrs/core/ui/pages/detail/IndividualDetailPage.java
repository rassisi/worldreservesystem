package org.wrs.core.ui.pages.detail;

import java.io.IOException;
import java.net.URL;

import org.eclipse.rcpl.IModelDetailPage;
import org.eclipse.rcpl.detailpages.AbstractModelDetailPage;
import org.eclipse.rcpl.navigator.IModelDetailPageControler;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class IndividualDetailPage extends AbstractModelDetailPage implements IModelDetailPage {

	public IndividualDetailPage() {
		super();

	}

	@Override
	protected IModelDetailPageControler createControler() {
		return new IndividualDetailPageController();
	}

	@Override
	public void create(StackPane stackPane) {
		URL location = getClass().getResource("/org/wrs/core/ui/pages/detail/IndividualDetailPage.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		fxmlLoader.setController(getControler());

		try {
			VBox node = fxmlLoader.load();
			stackPane.getChildren().add(node);
		} catch (IOException e) {
			e.printStackTrace();
			// System.exit(1);
		}

	}

	@Override
	public String getName() {
		return "Tools Setup";
	}

}
