package org.eclipse.rcpl;

import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.web.WebView;

import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;

public interface IURLAddressTool extends ITool {

	void setToolGroup(ToolGroup toolGroup);

	void setText(String text);

	void addWebListener(Tab newTab, WebView newWebView);

	Node getNode();
}
