package org.worldreservesystem.navigator.detailpages;

import java.io.IOException;
import java.net.URL;

import org.eclipse.rcpl.IDetailPage;

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

	
//    final Option<String> config = parser.addStringOption('c', "config");
//    final Option<String> port = parser.addStringOption('p', "port");
//    final Option<String> rportudp = parser.addStringOption('u', "udp-receiver-port");
//    final Option<String> rporttcp = parser.addStringOption('t', "tcp-receiver-port");
//    final Option<Boolean> debug = parser.addBooleanOption('d', "debug");
//    final Option<Boolean> remote = parser.addBooleanOption("remote");
//    final Option<String> remoteLimitApi = parser.addStringOption("remote-limit-api");
//    final Option<String> remoteAuth = parser.addStringOption("remote-auth");
//    final Option<String> neighbors = parser.addStringOption('n', "neighbors");
//    final Option<Boolean> export = parser.addBooleanOption("export");
//    final Option<Boolean> help = parser.addBooleanOption('h', "help");
//    final Option<Boolean> testnet = parser.addBooleanOption("testnet");
//    final Option<Boolean> revalidate = parser.addBooleanOption("revalidate");
//    final Option<Boolean> rescan = parser.addBooleanOption("rescan");
//    final Option<String> sendLimit = parser.addStringOption("send-limit");
//    final Option<Boolean> sync = parser.addBooleanOption("sync");
//    final Option<Boolean> dnsResolutionFalse = parser.addBooleanOption("dns-resolution-false");
//    final Option<String> maxPeers = parser.addStringOption("max-peers");

	
	
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
