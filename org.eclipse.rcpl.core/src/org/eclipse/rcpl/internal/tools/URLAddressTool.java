/*******************************************************************************
 * Copyright (c) 2003 - 2014 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/

package org.eclipse.rcpl.internal.tools;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.rcpl.IPage;
import org.eclipse.rcpl.IResourceEntry;
import org.eclipse.rcpl.IToolComponent;
import org.eclipse.rcpl.IToolGroup;
import org.eclipse.rcpl.IToolRegistry;
import org.eclipse.rcpl.IURLAddressTool;
import org.eclipse.rcpl.JOEvent;
import org.eclipse.rcpl.RcplTool;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.favicon.FavIconHandler;
import org.eclipse.rcpl.internal.fx.figures.JOButton;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.html.HTMLCollection;
import org.w3c.dom.html.HTMLDocument;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.concurrent.Worker.State;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

/**
 * @author ramin
 *
 */
public class URLAddressTool extends RcplTool implements IURLAddressTool {

	public URLAddressTool(Tool tool) {
		super(tool);
	}

	private GridPane layout;

	private VBox node;

	public static TextField urlAddress;

	@Override
	public void setToolGroup(ToolGroup toolGroup) {
		this.layout = new GridPane();
		HBox hBox = new HBox();
		getNode().getChildren().add(hBox);
		JOButton backButton = new JOButton("", "", "Back", "back", false) {
			@Override
			protected void doAction() {
				if (Rcpl.UIC.getBrowser() != null) {
					goBack();
				}
			};
		};
		HBox.setMargin(backButton.getNode(), new Insets(-2, 0, 0, 0));

		// backButton.setStyle("back_button");
		hBox.getChildren().add(backButton.getNode());

		JOButton forewardButton = new JOButton("", "", "Forward", "forward", false) {
			@Override
			protected void doAction() {
				if (Rcpl.UIC.getBrowser() != null) {
					goForward();
				}
			}
		};

		// forewardButton.setStyle("foreward_button");
		hBox.getChildren().add(forewardButton.getNode());
		HBox.setMargin(forewardButton.getNode(), new Insets(-2, 0, 0, 0));

		JOButton refreshButton = new JOButton("", "", "Refresh", "refresh", false) {
			@Override
			protected void doAction() {
				if (Rcpl.UIC.getBrowser() != null) {
					refreshBrowser();
				}
			}
		};
		hBox.getChildren().add(refreshButton.getNode());
		HBox.setMargin(refreshButton.getNode(), new Insets(-2, 0, 0, 0));

		JOButton browserHomeButton = new JOButton("", "", "Home", "browser", false) {
			@Override
			protected void doAction() {
				if (Rcpl.UIC.getBrowser() != null) {

				}
			}
		};
		hBox.getChildren().add(browserHomeButton.getNode());
		HBox.setMargin(browserHomeButton.getNode(), new Insets(-2, 0, 0, 0));

		urlAddress = new TextField();
		urlAddress.setAlignment(Pos.CENTER_LEFT);
		urlAddress.setPrefWidth(3000);
		urlAddress.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent ke) {
				go();
			}
		});
		HBox.setMargin(urlAddress, new Insets(3, 0, 0, 5));
		HBox.setHgrow(urlAddress, Priority.ALWAYS);
		urlAddress.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean isFocussed) {
				if (isFocussed) {
					Platform.runLater(new Runnable() {

						@Override
						public void run() {
							urlAddress.selectAll();
						}
					});

				}
			}
		});

		hBox.getChildren().add(urlAddress);

		urlAddress.setAlignment(Pos.CENTER_LEFT);

		HBox x = new HBox();
		x.setPadding(new Insets(6, 20, 0, -25));
		hBox.getChildren().add(x);

		JOButton b1 = new JOButton("HTML", "", "Convert To HTML", "24/html_document", true) {
			@Override
			protected void doAction() {
				if (isSelected()) {
					Rcpl.UIC.showHtmlEditor();
				} else {
					Rcpl.UIC.showBrowser();
				}
			};
		};

		HBox.setMargin(b1.getNode(), new Insets(0, 0, 0, -25));
		hBox.getChildren().add(b1.getNode());

		//
		// JOButton b2 = new JOButton("", "", "Spreadsheet Example",
		// "spreadsheet", false) {
		// protected void doAction() {
		// JO.UIC.handleOpenExample_2(null);
		//
		// };
		// };
		// HBox.setMargin(b2, new Insets(0, 0, 0, 10));
		//
		// JOButton b3 = new JOButton("", "", "Presentation Example",
		// "presentation", false) {
		// protected void doAction() {
		// JO.UIC.handleOpenExample_2(null);
		//
		// };
		// };
		// HBox.setMargin(b3, new Insets(0, 0, 0, 10));
		//
		// x.getChildren().addAll(b1, b2, b3);

	}

	public void go() {
		WebView browser = Rcpl.UIC.getBrowser();
		if (browser != null) {

			String urlString = urlAddress.getText();
			URL url = null;
			try {
				url = new URL(urlString);
			} catch (MalformedURLException e) {
				try {
					url = new URL("http://" + urlString);
				} catch (MalformedURLException e1) {
					return;
				}
			}
			String s = url.toExternalForm();
			browser.getEngine().load(s);
			// ((Tab) browser.getUserData()).setText(" " + url.getHost());
		}
	}

	@Override
	public VBox createNode() {
		node = new VBox();
		return node;
	}

	@Override
	public VBox getNode() {
		if (node == null) {
			node = createNode();
		}
		return node;
	}

	public void add(Node node, int col, int row) {
		this.layout.add(node, col, row);
	}

	public void add(Node node, int col, int row, int colSpan, int rowSpan) {
		this.layout.add(node, col, row, colSpan, rowSpan);
	}

	public String goBack() {
		final WebHistory history = Rcpl.UIC.getBrowser().getEngine().getHistory();
		ObservableList<WebHistory.Entry> entryList = history.getEntries();
		int currentIndex = history.getCurrentIndex();
		// Out("currentIndex = "+currentIndex);
		// Out(entryList.toString().replace("],","]\n"));

		if (currentIndex > 0) {
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					history.go(-1);
				}
			});
		}
		return entryList.get(currentIndex > 0 ? currentIndex - 1 : currentIndex).getUrl();
	}

	public String goForward() {
		final WebHistory history = Rcpl.UIC.getBrowser().getEngine().getHistory();
		ObservableList<WebHistory.Entry> entryList = history.getEntries();
		int currentIndex = history.getCurrentIndex();
		if (currentIndex < entryList.size() - 1) {
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					history.go(1);
				}
			});
		}
		return entryList.get(currentIndex < entryList.size() - 1 ? currentIndex + 1 : currentIndex).getUrl();
	}

	public void refreshBrowser() {

		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				Rcpl.UIC.getBrowser().getEngine().reload();
			}
		});
	}

	private static int webNotAvailable = 0;

	@Override
	public void addWebListener(final Tab newTab, final WebView newWebView) {

		newWebView.getEngine().getLoadWorker().exceptionProperty().addListener(new ChangeListener<Throwable>() {

			@Override
			public void changed(ObservableValue<? extends Throwable> observable, Throwable oldValue,
					Throwable newValue) {

				// try {
				// URL url = new URL(newWebView.getEngine()
				// .getLocation());
				//
				// if ("sample_1".equals(url.getHost())) {
				// JO.UIC.actionOpenExample_1(null);
				// } else if ("sample_2".equals(url.getHost())) {
				// JO.UIC.actionOpenExample_2(null);
				// } else if ("sample_3".equals(url.getHost())) {
				// JO.UIC.actionOpenExample_3(null);
				// }
				// } catch (MalformedURLException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }

			}
		});

		newWebView.getEngine().getLoadWorker().stateProperty().addListener(new ChangeListener<State>() {
			@Override
			public void changed(ObservableValue<? extends State> ov, State oldState, State newState) {
				// toolBar.getChildren().remove(showPrevDoc);
				if (newState == State.SUCCEEDED) {

					HTMLDocument doc = (HTMLDocument) newWebView.getEngine().getDocument();

					Transformer transformer;
					try {
						transformer = TransformerFactory.newInstance().newTransformer();

						transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
						transformer.setOutputProperty(OutputKeys.METHOD, "html");
						transformer.setOutputProperty(OutputKeys.INDENT, "yes");
						transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
						transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

						ByteArrayOutputStream bos = new ByteArrayOutputStream();

						transformer.transform(new DOMSource(doc),
								new StreamResult(new OutputStreamWriter(bos, "UTF-8")));

						// transformer.transform(new DOMSource(el), new
						// StreamResult(
						// new OutputStreamWriter(bos, "UTF-8")));
						String htmlText = bos.toString("UTF-8");

						int pos1 = htmlText.indexOf("imgurl=");
						if (pos1 != -1) {
							int pos2 = htmlText.indexOf("&", pos1);

							if (pos2 != -1) {

								String url = htmlText.substring(pos1, pos2);

							}

						}

					} catch (TransformerConfigurationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (TransformerFactoryConfigurationError e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (TransformerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					HTMLCollection images = doc.getImages();

					// for (int i = 0; i < images.getLength(); i++) {
					//
					// org.w3c.dom.Node imageNode = images.item(i);
					//
					// String name = imageNode.getLocalName();
					//
					// String s1 = imageNode.getTextContent();
					//
					// System. out.("image: " + i);
					//
					// NamedNodeMap map = imageNode.getAttributes();
					//
					// for (int j = 0; j < map.getLength(); j++) {
					// org.w3c.dom.Node att = map.item(j);
					//
					// String n = att.getLocalName();
					//
					// String s = att.getTextContent();
					//
					// System. out.("image att: " + n
					// + " / " + s);
					//
					// }
					//
					// }

					HTMLCollection links = doc.getLinks();

					for (int i = 0; i < links.getLength(); i++) {

						org.w3c.dom.Node linkNode = links.item(i);

						String name = linkNode.getLocalName();

						String s1 = linkNode.getTextContent();

						// System. out
						// .("link: ---------------------- "
						// + name + " / " + s1);

						NamedNodeMap map = linkNode.getAttributes();

						for (int j = 0; j < map.getLength(); j++) {
							org.w3c.dom.Node att = map.item(j);

							String n = att.getLocalName();

							String s = att.getTextContent();

							// System. out.("link att: " + n +
							// " / "
							// + s);

						}

					}

					// NodeList l1 = doc.getBody().getElementsByTagName(
					// "a");
					// for (int i = 0; i < l1.getLength(); i++) {
					//
					// org.w3c.dom.Node linkNode = l1.item(i);
					//
					// String name = linkNode.getLocalName();
					//
					// String s1 = linkNode.getTextContent();
					//
					// System. out.("link 2: " + name + " / "
					// + s1);
					//
					// }

					webNotAvailable = 0;

					try {
						URL url = new URL(newWebView.getEngine().getLocation());
						String s = "" + url.getHost().replaceAll("www.", " ");
						if (newTab != null) {
							newTab.setText(s);
							ImageView iv = FavIconHandler.getInstance()
									.fetchFavIcon(newWebView.getEngine().getLocation());

							newTab.setGraphic(iv);
						}
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					URLAddressTool.urlAddress.setText(newWebView.getEngine().getLocation());
				} else if (newState == State.FAILED) {

					webNotAvailable++;
					if (webNotAvailable > 10) {
						newWebView.getEngine().getLoadWorker().stateProperty().removeListener(this);
						Platform.runLater(new Runnable() {
							@Override
							public void run() {
								newWebView.getEngine().loadContent("Internet nicht verfügbar.");
							}
						});
					}

				}
			}
		});
	}

	@Override
	public void setText(String text) {
		urlAddress.setText(text);

	}

	@Override
	public Tool getTool() {
		return null;
	}

}
