package org.wrs.rcpl.ui.detailpages;

import org.eclipse.rcpl.navigator.details.AbstractDetailPane;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 * @author ramin
 *
 */
public class WrsMyAccountDetailPage extends AbstractDetailPane {

	@Override
	public void create(StackPane stackPane) {
		Label l = new Label("AccountDetailPage");
		stackPane.getChildren().add(l);

	}

}
