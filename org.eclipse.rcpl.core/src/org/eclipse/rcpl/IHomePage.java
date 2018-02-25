package org.eclipse.rcpl;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

public interface IHomePage {

	Pane getContentPane();

	Node getNode();

	int getRow();

	void refresh();

}
