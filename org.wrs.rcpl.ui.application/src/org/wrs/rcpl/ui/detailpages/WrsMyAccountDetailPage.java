package org.wrs.rcpl.ui.detailpages;

import org.eclipse.rcpl.navigator.IModelDetailPageControler;
import org.eclipse.rcpl.navigator.details.AbstractModelDetailPage;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 * @author ramin
 *
 */
public class WrsMyAccountDetailPage extends AbstractModelDetailPage {

	@Override
	public void create(StackPane stackPane) {
		Label l = new Label("My Account");
		stackPane.getChildren().add(l);
	}

	@Override
	protected IModelDetailPageControler createControler() {
		// TODO Auto-generated method stub
		return null;
	}

}
