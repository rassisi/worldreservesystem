package org.eclipse.rcpl;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

public interface IHomePage {

	void setTitle(String title);
	
	void setImage(String image);
	
	Pane getContentPane();

	Node getNode();

	int getRow();

	void refresh();

}
