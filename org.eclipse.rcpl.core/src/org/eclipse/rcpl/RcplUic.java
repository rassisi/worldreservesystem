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
package org.eclipse.rcpl;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.rcpl.homepages.JOAboutHomePage;
import org.eclipse.rcpl.homepages.JONewHomePage;
import org.eclipse.rcpl.homepages.JOSamplesHomePage;
import org.eclipse.rcpl.homepages.PerspectiveHomePage;
import org.eclipse.rcpl.internal.fx.figures.JOButton;
import org.eclipse.rcpl.internal.tools.URLAddressTool;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOKey;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.Perspective;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.InnerShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @author ramin
 *
 */
public class RcplUic extends RcplAbstractUic {

	protected boolean viewer;

	protected URLAddressTool urlAddressTool;

	protected IHomePage samplesPage;

	protected IHomePage perspectivePage;

	protected IHomePage newPage;

	protected IHomePage aboutPage;

	protected IHomePage overviewPage;

	protected IHomePage preferencesPage;

	protected IHomePage tutorialsPage;

	protected IHomePage donationPage;

	protected IHomePage whatsNewPage;

	protected IHomePage contactUsPage;

	public String WELCOME_URL;

	// private IButton saveButton;
	//
	// private IButton saveAsButton;

	protected IButton buttonHome;

	protected Text titleText;

	protected Node onlineOfflineView;

	protected List<IHomePage> homepages = new ArrayList<IHomePage>();

	// ===================================================

	@FXML
	protected Button startMenuButton;

	@FXML
	protected VBox topArea;

	@FXML
	protected HBox homeHeaderHBox;

	@FXML
	protected HBox homeButtonsArea;

	@FXML
	protected HBox mainLeftArea;

	@FXML
	protected VBox mainLeftBox;

	@FXML
	protected HBox mainTopArea;

	@FXML
	protected StackPane mainTopStack;

	@FXML
	protected HBox mainBottomArea;

	@FXML
	protected HBox mainRightArea;

	@FXML
	protected TabPane tabPane;

	@FXML
	protected Text statusText;

	@FXML
	protected HBox titleArea;

	public RcplUic(IApplicationStarter rcplApplicationStarter) {
		this(rcplApplicationStarter, "Rcpl");
	}

	public RcplUic(IApplicationStarter rcplApplicationStarter, String id) {
		super(rcplApplicationStarter, id);
		this.urlAddressTool = new URLAddressTool(null);
		WELCOME_URL = JOSession.getDefault().codeBase + "joffice_welcome.html";

	}

	@Override
	public void updateStartMenuButton() {
		try {
			if (JOSession.getDefault().isOnline()) {
				// getStartMenuButton().setToolTip("Online");
				onlineOfflineView = Rcpl.resources().getImage("start_button", 20, 20).getNode();
				StackPane.setMargin(onlineOfflineView, new Insets(6, 0, 0, 0));
				// onlineOfflineView.setFitHeight(20);
				// onlineOfflineView.setFitWidth(20);
				Tooltip t = new Tooltip("Online");
				t.setId("joffice_tooltip");
				Tooltip.install(onlineOfflineView, t);
				addBlinkingAnimation(onlineOfflineView);
				if (blinkingTimeline != null) {
					blinkingTimeline.stop();
				}

			} else {
				// getStartMenuButton().setToolTip("Offline");
				IImage img = Rcpl.resources().getImage("start_button", 20, 20);
				onlineOfflineView = img.getNode();
				// img.getImage().;
				Tooltip t = new Tooltip("Offline");
				t.setId("joffice_tooltip");
				Tooltip.install(onlineOfflineView, t);
			}

			startMenuButton.setGraphic(onlineOfflineView);

		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}
	}

	private Timeline blinkingTimeline;

	private void addBlinkingAnimation(Node imageView) {
		blinkingTimeline = new Timeline();
		blinkingTimeline.setCycleCount(Timeline.INDEFINITE);
		blinkingTimeline.setAutoReverse(true);
		final KeyValue kv = new KeyValue(imageView.opacityProperty(), 0.0);
		final KeyFrame kf = new KeyFrame(Duration.millis(1000), kv);
		blinkingTimeline.getKeyFrames().add(kf);
		blinkingTimeline.play();
	}

	public void createPages() {

		if (overviewPage == null) {
			internalTitle.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					showAboutPage();
				}
			});

			overviewPage = Rcpl.getFactory().createOverviewHomePage(RcplUic.this, "My JOffice Cloud", "internet_cloud");

			perspectivePage = createPerspectivePage();

			samplesPage = createSamplesHomePage();
			newPage = createNewHomePage();

			whatsNewPage = Rcpl.getFactory().createWebHomePage(RcplUic.this, "What's New",
					JOSession.getDefault().codeBase + "joffice_new_and_noteworthy.html", "office_whatsnew");

			String url = "http://85.25.100.163:8081/help/index.jsp";

			// if (JOSession.codeBase.endsWith("/")) {
			// helpUrl = JOSession.codeBase.substring(0,
			// JOSession.codeBase.length() - 1)
			// + ":8081/help/index.jsp";
			// }

			tutorialsPage = Rcpl.getFactory().createWebHomePage(RcplUic.this, "JOffice Help", url, "help");

			url = "http://joffice.eu/joffice_donation_text.html";
			donationPage = Rcpl.getFactory().createWebHomePage(RcplUic.this, "Donation", url, "donation");

			contactUsPage = Rcpl.getFactory().createContactUsHomePage(RcplUic.this, "Contact Us", "contact_us");

			preferencesPage = Rcpl.getFactory().createPreferencesHomePage(RcplUic.this, "Preferences",
					"preferences_clipart");

			aboutPage = createAboutHomePage();
		}

	}

	protected IHomePage createSamplesHomePage() {
		return new JOSamplesHomePage(RcplUic.this, "office_samples");
	}

	protected IHomePage createPerspectivePage() {
		return new PerspectiveHomePage(RcplUic.this);
	}

	protected IHomePage createNewHomePage() {
		return new JONewHomePage(RcplUic.this, "office_new");
	}

	protected IHomePage createAboutHomePage() {
		return new JOAboutHomePage(RcplUic.this, "joffice");
	}

	@Override
	public void actionLogout() {
		getRcplApplicationStarter().getRcplApplicationProvider().reStart();
	}

	public void actionAddWebBrowserTab() {
		final Tab newTab = createNewTab("Google");
		newTab.setClosable(true);
		newTab.setId("webBrowserTab");
		final WebView newWebView = new WebView();
		newWebView.getEngine().setJavaScriptEnabled(true);
		newWebView.setEffect(new InnerShadow());
		newWebView.setUserData(newTab);
		newTab.setUserData(newWebView);
		newWebView.getEngine().load("http://www.google.com");
		urlAddressTool.addWebListener(newTab, newWebView);
		setContent(newWebView);
		newWebView.setUserData(newTab);
		tabPane.getSelectionModel().select(newTab);
		newTab.setOnSelectionChanged(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				if (newTab.isSelected()) {
					setContent(newWebView);
					updatePerspective(newTab);
				}
			}
		});
		updatePerspective(newTab);
		updateButtons(false);
	}

	public void logout() {

	}

	@Override
	protected void copyFXToInternal() {
		internalTabPane = tabPane;
		internalMainBottomArea = mainBottomArea;
	}

	@Override
	protected Tab createNewTab(String title) {
		return createNewTab(new Tab(), title);
	}

	protected Tab createNewTab(final Tab tab, String title) {
		if (title == null) {
			title = "-";
		}

		IImage img = null;

		if (title.endsWith("docx")) {
			img = Rcpl.resources().getImage("word", 16, 16);
		} else if (title.endsWith("xlsx")) {
			img = Rcpl.resources().getImage("spreadsheet", 16, 16);
		} else if (title.endsWith("pptx")) {
			img = Rcpl.resources().getImage("presentation", 16, 16);
		}

		title = title.replaceAll("\\.docx", "");
		title = title.replaceAll("\\.xlsx", "");
		title = title.replaceAll("\\.pptx", "").trim();

		tab.setText(title);

		if (img != null) {
			tab.setGraphic(img.getNode());
		}
		try {

			tab.selectedProperty().addListener(new ChangeListener<Boolean>() {
				@Override
				public void changed(ObservableValue<? extends Boolean> paramObservableValue, Boolean paramT1,
						Boolean isSelected) {
					if (isSelected) {
						showTab(tab);
					}
				}
			});
			tab.setOnClosed(new EventHandler<Event>() {
				@Override
				public void handle(Event arg0) {
					closeTab(tab);
				}
			});

			tabPane.getTabs().add(tab);

			double h = tabPane.getTabMinHeight();
			tabPane.setTabMinHeight(h + 1);
			tabPane.setTabMinHeight(h);

		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}
		return tab;
	}

	@Override
	protected void doCreateContent() {

		Rcpl.progressMessage("Rcpl.doCreateContent()");

		URL location = getClass().getResource("/org/eclipse/rcpl/RcplUic.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		fxmlLoader.setController(Rcpl.UIC);

		try {
			internalBorderPane = fxmlLoader.load();
			internalBorderPane.setCenter(editorArea);
			init(internalBorderPane);

		} catch (IOException e) {
			e.printStackTrace();
			// System.exit(1);
		}

		internalBorderPane.setRight(null);

		if (viewer) {
			internalBorderPane.setTop(null);
			internalBorderPane.setBottom(null);
			internalBorderPane.setLeft(null);
			return;
		}

		try {
			createTitelArea();
			createBorderDragger();
			updateWebViewDragger();
			createRecentDocumentList();

			updateTabPane();
			updateEditorListener();

			statusText.setText("JOffice " + RcplVersion.getVersion());
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

		if (Rcpl.isMobile()) {

			topArea.getChildren().remove(titleArea);
			topArea.getChildren().remove(titleText);

			internalBorderPane.setTop(titleArea);
			internalBorderPane.setBottom(null);

		}

		startMenuButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				showHomePage();
			}
		});

		Rcpl.showProgress(false);

	}

	private void createTitelArea() {
		titleText = new Text("JOffice " + RcplVersion.getVersion() + " - " + JOSession.getDefault().userId + " ("
				+ (JOSession.getDefault().isOnline() ? "Online" : "Offline") + ")");
		titleText.setId("joffice_title_version");
		titleText.setOpacity(0.8);
		if (Rcpl.isMobile()) {
			titleArea.setAlignment(Pos.CENTER_LEFT);
		} else {
			titleArea.setAlignment(Pos.CENTER_RIGHT);
		}

		StackPane.setAlignment(titleText, Pos.TOP_LEFT);
		StackPane.setMargin(titleText, new Insets(7, 0, 0, 55));

	}

	protected void debugCollapsingAndHiding() {

		final ToggleButton top = new ToggleButton("T");
		top.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				getTopToolBarControl().collapse(!top.isSelected());
			}

		});
		mainTopArea.getChildren().add(1, top);

		final ToggleButton side = new ToggleButton("S");
		side.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (!side.isSelected()) {
					getSideToolBarControl().collapseToolPane();

				} else {
					getSideToolBarControl().showSideTools();
				}
			}
		});
		mainTopArea.getChildren().add(2, side);

		final ToggleButton bottom = new ToggleButton("B");
		bottom.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub

			}
		});
		mainTopArea.getChildren().add(3, bottom);
	}

	// private void createQuickToolButtons() {
	//
	// if (!Rcpl.isBigDisplay()) {
	// buttonHome = Rcpl.factory.createButton("", "", "Home", "home", false, new
	// IButtonListener() {
	//
	// @Override
	// public void doAction() {
	// showOverviewPage();
	// }
	// }, true);
	// }
	//
	// saveButton = Rcpl.factory.createButton("", "", "Save", "save", false, new
	// IButtonListener() {
	//
	// @Override
	// public void doAction() {
	// actionSaveDocument();
	// }
	// }, true);
	//
	// saveAsButton = Rcpl.factory.createButton("", "", "Save As...", "save_as",
	// false, new IButtonListener() {
	//
	// @Override
	// public void doAction() {
	// actionSaveDocumentAs();
	// }
	// }, true);
	//
	// // buttonLogout = Rcpl.factory.createButton("logout", "Log Out", "Log
	// // Out", "logout", false,
	// // new IButtonListener() {
	// //
	// // @Override
	// // public void doAction() {
	// // actionLogout();
	// //
	// // }
	// // }, true);
	// }

	private void createBorderDragger() {
		if (!Rcpl.isMobile()) {
			internalBorderPane.setOnMousePressed(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {

					internalMouseDragOffsetX = event.getSceneX();
					internalMouseDragOffsetY = event.getSceneY();
				}
			});

			internalBorderPane.setOnMouseDragged(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					Stage w = getStage();
					w.setX(event.getScreenX() - internalMouseDragOffsetX);
					w.setY(event.getScreenY() - internalMouseDragOffsetY);
				}
			});
		}
	}

	private void updateTabPane() {

		tabPane.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (!internalDragMode) { // && isHome()) {
					showTabPane();
				}
				internalDragMode = false;
			}
		});

		if (Rcpl.isBigDisplay()) {

			tabPane.setOnMousePressed(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					internalMouseDragOffsetX = event.getSceneX();
					internalMouseDragOffsetY = event.getSceneY();

				}
			});

			tabPane.setOnMouseReleased(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					internalMouseDragOffsetX = event.getSceneX();
					internalMouseDragOffsetY = event.getSceneY();
				}
			});

			tabPane.setOnMouseDragged(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					Stage w = getStage();
					w.setX(event.getScreenX() - internalMouseDragOffsetX);
					w.setY(event.getScreenY() - internalMouseDragOffsetY);
					internalDragMode = true;
				}
			});
		}
	}

	private void updateWebViewDragger() {
		if (!Rcpl.isMobile()) {
			getInternalWebView().setOnMousePressed(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					internalMouseDragOffsetX = event.getSceneX();
					internalMouseDragOffsetY = event.getSceneY();
				}
			});

			getInternalWebView().setOnMouseDragged(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					if (event.isControlDown()) {
						Stage w = getStage();
						w.setX(event.getScreenX() - internalMouseDragOffsetX);
						w.setY(event.getScreenY() - internalMouseDragOffsetY);
					}
				}
			});
		}
	}

	private void updateEditorListener() {
		Rcpl.getEditorListeners().add(new RcplEditorListenerAdapter() {
			@Override
			public void update(final JOEvent event) {
				if (event.getEditMode() != null) {
					Platform.runLater(new Runnable() {

						@Override
						public void run() {
							statusText.setText(event.getEditMode().name());
						}
					});

				} else if (event.getMessage() != null) {
					Platform.runLater(new Runnable() {

						@Override
						public void run() {
							statusText.setText(event.getMessage());
						}
					});

				}

			}
		});
	}

	private void createRecentDocumentList() {

		try {
			if (JOSession.getDefault().getSystemPreferences() != null)

			{
				String lastDoc = JOSession.getDefault().getSystemPreferences().getLastDocument();
				if (lastDoc != null && lastDoc.trim().length() > 0) {
					lastDocumentFile = new File(lastDoc);
				}
			}
		} catch (Exception ex) {

		}

	}

	@Override
	public void doInitStyles() {
		internalStyleMsOffice = RcplUic.class.getResource("/css/msoffice.css").toExternalForm();
		getInternalStylesRegistry().add(internalStyleMsOffice);
		internalStyleWindows7 = RcplUic.class.getResource("/css/windows_7.css").toExternalForm();
		getInternalStylesRegistry().add(internalStyleWindows7);
		internalStyleDark = RcplUic.class.getResource("/css/theme_dark.css").toExternalForm();
		getInternalStylesRegistry().add(internalStyleDark);
	}

	@Override
	public void expandAllToolBars() {
		if (!viewer) {
			getTopToolbarControl().expandAll();
			expandBottomAra(true);
		}
	}

	@Override
	public void expandLeftAra(final boolean expand) {

		if (!expand) {
			getSideToolBarControl().collapseToolPane();
			mainLeftArea.setPrefWidth(0);
			mainLeftArea.setMinWidth(0);
			mainLeftArea.setMaxWidth(0);
		} else {
			mainLeftArea.setPrefWidth(ISideToolBar.WIDTH_COLLAPSED);
			mainLeftArea.setMinWidth(ISideToolBar.WIDTH_COLLAPSED);
			mainLeftArea.setMaxWidth(ISideToolBar.WIDTH_COLLAPSED);
		}
		mainLeftArea.layout();
	}

	@Override
	public void setStatusText(String text) {
		statusText.setText(text);
	}

	@Override
	public HBox getMainBottomArea() {
		return mainBottomArea;
	}

	@Override
	public HBox getMainLeftArea() {
		return mainLeftArea;
	}

	@Override
	public VBox getMainLeftBox() {
		return mainLeftBox;
	}

	public HBox getMainRightArea() {
		return mainRightArea;
	}

	@Override
	public HBox getMainTopArea() {
		return mainTopArea;
	}

	@Override
	public StackPane getMainTopStack() {
		return mainTopStack;
	}

	@Override
	public ITopToolbar getTopToolBarControl() {
		return getTopToolbarControl();
	}

	@FXML
	public void handleClose(ActionEvent event) {
		JOSession.getDefault().getSystemPreferences().put(JOKey.STAGE_X, "" + getStage().getX());
		JOSession.getDefault().getSystemPreferences().put(JOKey.STAGE_Y, "" + getStage().getY());
		JOSession.getDefault().commit();

		JOSession.getDefault().close(true, true);
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				Platform.exit();
			}
		});
	}

	public void handleCollapseAll(ActionEvent event) {
		collapseAll();
	}

	@Override
	public void handleThemeDark(ActionEvent event) {

		final Scene scene = getStage().getScene();

		removeAllStyles();
		scene.getStylesheets().add(getClass().getResource("/css/theme_dark.css").toExternalForm());

	}

	@Override
	public void handleThemeDefault(ActionEvent event) {

		final Scene scene = getStage().getScene();

		removeAllStyles();
		scene.getStylesheets().add(internalStyleMsOffice);

	}

	@Override
	public void handleThemeSilver(ActionEvent event) {

		removeAllStyles();

	}

	@Override
	public void handleThemeWIndows7(ActionEvent event) {

		final Scene scene = getStage().getScene();

		removeAllStyles();
		scene.getStylesheets().add(internalStyleWindows7);

	}

	@Override
	public void init(BorderPane parent) {
		super.init(parent);
		internalBorderPane = parent;
		internalTabPane = tabPane;
		internalMainBottomArea = mainBottomArea;
		// internalTabPane.setStyle("-fx-open-tab-animation: NONE;
		// -fx-close-tab-animation: NONE;");
		tabPane.setPrefSize(10, 10);
	}

	private Label debugLabel;

	@Override
	public void setDebugText(String text) {
		if (debugLabel != null) {
			debugLabel.setText(text);
		}
	}

	@Override
	public void preDestroy() {
		try {
			JOSession.getDefault().close(true, true);
		} catch (Exception ex) {
		} catch (Throwable ex) {
		}
	}

	// @Override
	// public void recreateSideBar() {
	// IRcplPlugin useCase = getInternalActiveUsePlugin();
	// setInternalInhibitUI(true);
	// // String groupId = getSideToolBarControl().getActiveGroupId();
	// getSideToolBarControl().init();
	// setInternalInhibitUI(false);
	// getSideToolBarControl().show();
	// // getSideToolBarControl().setActiveGroupId(groupId);
	// getSideToolBarControl().showSideTools();
	// showPluginPerspective(useCase);
	// }

	// @Override
	// public void recreateTopBar() {
	// IRcplPlugin useCase = getInternalActiveUsePlugin();
	// setInternalInhibitUI(true);
	// getTopToolbarControl().init();
	// setInternalInhibitUI(false);
	// Perspective p = getActivePerspective();
	// if (p != null) {
	// // !!! 1
	// // getTopToolbarControl().show(p.getPerspectiveType());
	// }
	// showPluginPerspective(useCase);
	// }

	@Override
	public void restorePerspective() {
		updatePerspective(tabPane.getSelectionModel().getSelectedItem());
	}

	@Override
	public void setTopAreaHeight(double height) {
		mainTopArea.setMaxHeight(height);
		mainTopArea.setMinHeight(height);
		mainTopArea.setPrefHeight(height);
		if (height <= 30) {
			height = 0;
		}
		mainTopStack.setMaxHeight(height);
		mainTopStack.setMinHeight(height);
		mainTopStack.setPrefHeight(height);
	}

	@Override
	public void showAboutPage() {
		createPages();
		setContent(aboutPage.getNode());
		updateButtons(true);
	}

	@Override
	public void showHomePage() {
		createPages();
		showHomePage(-1);
		updateButtons(true);
	}

	@Override
	public void showNewPage() {
		createPages();
		setContent(newPage.getNode());
		updateButtons(true);
	}

	@Override
	public void showPerspectivePage() {
		createPages();
		setContent(perspectivePage.getNode());
		updateButtons(true);
	}

	@Override
	public boolean isHome() {
		if (overviewPage == null) {
			return true;
		}
		return internalBorderPane.getCenter() == overviewPage.getNode();
	}

	@Override
	public void showOverviewPage() {
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				createPages();
				if (overviewPage != null) {
					setContent(overviewPage.getNode());
				}

				getSideToolBarControl().showHomeTools();

				setPerspective(JOSession.PERSPECTIVE_OVERVIEW);

			}
		});

	}

	/**
	 * 
	 */
	@Override
	public void showPreferencesPage() {
		createPages();
		if (preferencesPage != null) {
			setContent(preferencesPage.getNode());
		}

		// quickToolsArea.getChildren().removeAll((Node) saveAsButton.getNode(),
		// (Node) saveButton.getNode(),
		// (Node) getInternalUndoRedoListener());
		// getTopToolbarControl().show((PerspectiveType) null);
		// getSideToolBarControl().show((PerspectiveType) null, true);
		// getSideToolBarControl().collapseToolBar();
		updateButtons(true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rcpl.IUIC#showSamplesPage()
	 */
	@Override
	public void showSamplesPage() {
		createPages();
		setContent(samplesPage.getNode());
		updateButtons(true);
	}

	@Override
	public void showTutorialsPage() {
		createPages();
		setContent(tutorialsPage.getNode());
		updateButtons(true);
		tutorialsPage.refresh();
	}

	@Override
	public void showDonationPage() {
		createPages();
		setContent(donationPage.getNode());
		updateButtons(true);
		// donationPage.refresh();

		// Application app = (Application)
		// getRcplApplicationStarter().getRcplApplicationProvider();
		// HostServicesDelegate hostServices =
		// HostServicesFactory.getInstance(app);
		// hostServices.showDocument("http://joffice.eu/joffice_donation.html");
	}

	@Override
	public void showWhatsNewPage() {
		createPages();
		setContent(whatsNewPage.getNode());
		updateButtons(true);
	}

	@Override
	public void showContactUsPage() {
		createPages();
		setContent(contactUsPage.getNode());
		updateButtons(true);
	}

	@Override
	public void updateButtons(boolean home) {
	}

	@Override
	public void updatePerspective(Tab tab) {
		try {
			super.updatePerspective(tab);
			if (tab == null) {
				return;
			}

			// if (tab.getContent() instanceof WebView) {
			// JO.officePane.setBrowser((WebView) tab.getContent());
			// actionPerspectiveWebbrowser();
			// JO.officePane.setEditor(null);
			// } else
			{
				Object o = tab.getUserData();
				if (o instanceof WebView) {
					actionPerspectiveWebbrowser();
				} else {
					if (o instanceof IEditor) {

						IEditor e = (IEditor) o;

						if (e.getDocument() != null && e.getDocument().getDefaultPerspective() != null) {
							if ("PRESENTATION".equals(e.getDocument().getDefaultPerspective())) {
								actionPerspectivePresentation();
							} else if ("SETTINGS".equals(e.getDocument().getDefaultPerspective())) {
								actionPerspectiveSettings();
							} else if ("SPREADSHEET".equals(e.getDocument().getDefaultPerspective())) {
								actionPerspectiveSpreadsheet();
							} else if ("WEB".equals(e.getDocument().getDefaultPerspective())) {
								actionPerspectiveWebbrowser();
							} else if ("WORD".equals(e.getDocument().getDefaultPerspective())) {
								actionPerspectiveWord();
							} else if ("USECASE".equals(e.getDocument().getDefaultPerspective())) {
							}
						}

					}
				}

				getTopToolbarControl().updateHeight();
			}

			if (getBrowser() != null) {
				urlAddressTool.setText(getBrowser().getEngine().getLocation());
			}
		} catch (Exception ex) {

		}
	}

	public TabPane getTabPane() {
		return internalTabPane;
	}

	@Override
	public Perspective findPerspective(String id) {
		for (Perspective p : JOSession.getDefault().getRcpl().getAllPerspectives().getChildren()) {
			if (id.equals(p.getId())) {
				return p;
			}
		}
		return null;
	}

	public IHomePage getOverviewPage() {
		return overviewPage;
	}

	@Override
	public boolean isViewer() {
		return viewer;
	}

	@Override
	public void setViewer(boolean viewer) {
		this.viewer = viewer;
	}

	private static Timeline caretTimeline;

	private static Rectangle caret;

	// private IEditor getEditor(){
	// Tab tab = tabPane.getSelectionModel().getSelectedItem();
	// Object o = tab.getUserData();
	// if(o instanceof IEditor){
	// return (IEditor)o;
	// }
	// return null;
	// }

	// private static ChangeListener<Bounds> caretYListener;

	public static void setCaretLocation(double x, double y) {
		getCaret().setX(x);
		getCaret().setY(y);
	}

	public static void setCaretHeight(double height) {
		getCaret().setHeight(height);
	}

	public static void setCaretWidth(double width) {
		getCaret().setWidth(width);
	}

	public static void showCaret(IParagraphFigure figure) {

		if (!figure.getPane().getChildren().contains(RcplUic.getCaret())) {
			figure.getPane().getChildren().add(RcplUic.getCaret());
		}

		getCaretTimeline().playFromStart();
		getCaret().setVisible(true);

	}

	public static double getCaretX() {
		return getCaret().getX();
	}

	public static double getCaretY() {
		return getCaret().getY();
	}

	public static double getCaretHeight() {
		return getCaret().getHeight();
	}

	/**
	 * 
	 */
	public static Rectangle getCaret() {

		if (caret == null) {
			caret = new Rectangle(3, 0, 1.6, 18);
			caret.setX(80);
			caret.setFill(Color.BLACK);
			caretTimeline = new Timeline();
			caretTimeline.setCycleCount(Timeline.INDEFINITE);
			caretTimeline.getKeyFrames().addAll(new KeyFrame(Duration.ZERO, new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					Node n = Rcpl.UIC.getFocusOwner();
					if (n instanceof ComboBox<?>) {
						caret.setFill(Color.TRANSPARENT);
						return;
					}
					caret.setFill(Color.BLACK);
					Parent parent = caret.getParent();
					if (parent != null) {
						parent.requestFocus();
					}
					IEditor editor = Rcpl.UIC.getEditor();
					if (editor != null) {
						// editor.updateScrollTargetForCaret();
					}
				}
			}), new KeyFrame(Duration.seconds(.5), new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					caret.setFill(Color.TRANSPARENT);
				}
			}), new KeyFrame(Duration.seconds(1)));
			caretTimeline.play();
		}
		return caret;
	}

	private static Timeline getCaretTimeline() {
		return caretTimeline;
	}

	@Override
	protected void registerServices() {
	}

	private VBox messageBox;

	public void showMessage(final String title, final String message) {

		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				StackPane stackPane = getRcplApplicationStarter().getRcplApplicationProvider().getMainContentGroup();
				if (messageBox != null) {
					stackPane.getChildren().remove(messageBox);
				}

				Bounds b = stackPane.getBoundsInLocal();

				messageBox = new VBox();

				messageBox.setSpacing(10);
				messageBox.setFillWidth(true);
				messageBox.setStyle("-fx-background-color: beige");
				messageBox.setMinSize(b.getWidth() / 2, b.getHeight() / 2);
				messageBox.setPrefSize(b.getWidth() / 2, b.getHeight() / 2);
				messageBox.setMaxSize(b.getWidth() / 2, b.getHeight() / 2);
				if (title != null) {
					Label lTitle = new Label(title);
					VBox.setMargin(lTitle, new Insets(10));
					messageBox.getChildren().add(lTitle);
				}
				TextArea messageText = new TextArea(message);
				messageText.setPrefHeight(1000);
				VBox.setMargin(messageText, new Insets(10));
				messageText.setWrapText(true);
				messageBox.getChildren().add(messageText);
				stackPane.getChildren().add(messageBox);
				HBox buttonBox = new HBox();
				VBox.setMargin(buttonBox, new Insets(10));
				Button button = new Button("OK");
				HBox.setHgrow(button, Priority.ALWAYS);
				buttonBox.setPrefHeight(30);
				buttonBox.setMaxHeight(30);
				buttonBox.getChildren().add(button);
				button.setAlignment(Pos.CENTER_RIGHT);
				button.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						new DelayedExecution(30) {
							@Override
							protected void execute() {
								StackPane stackPane = getRcplApplicationStarter().getRcplApplicationProvider()
										.getMainContentGroup();
								stackPane.getChildren().remove(messageBox);
							}
						};
					}
				});
				VBox.setVgrow(buttonBox, Priority.NEVER);
				messageBox.getChildren().add(buttonBox);
			}
		});

	}

	@Override
	public void actionAddPresentationTab() {
	}

	@Override
	public void actionOpen() {
	}

	@Override
	public void actionOpenLast() {
	}

	@Override
	public void openDocument(File file) {
	}

	@Override
	public void openTemplate(String name, String tabName) {
	}

	@Override
	public void setTopContent(Node content) {
		internalBorderPane.setTop(content);
	}

	@Override
	public void showStartMenuButton(boolean show) {
		startMenuButton.setDisable(!show);
	}

	@Override
	public void setContent(Node node) {
		for (IHomePage h : getHomepages()) {
			if (node == h.getNode()) {
				showHomeButtons(true);
				super.setContent(node);
				return;
			}
		}
		showHomeButtons(false);
		super.setContent(node);
	}

	private void showHomeButtons(boolean show) {

		if (show) {
			if (homeButtonsArea.getChildren().isEmpty()) {
				doCreateHomeButtons();
			}
		} else {
			homeButtonsArea.getChildren().clear();
		}

	}

	protected void doCreateHomeButtons() {

		addHomeButton(EnCommandId.homeShowOverview.name(), "My Cloud", "Show Documents in the Cloud", "internet_cloud",
				false);
		addHomeButton("homeShowNew", "New", "New Document", "office_new", false);

		addHomeButton(EnCommandId.homeShowSamples.name(), "Samples", "Show Samples Page", "office_samples", false);

		if (Rcpl.isBigDisplay()) {
			if (!Rcpl.isMobile()) {
				addHomeButton(EnCommandId.homeShowWhatsNew.name(), "What's New", "What's New", "office_whatsnew",
						false);
			}
			addHomeButton(EnCommandId.homeShowPreferences.name(), "Preferences", "Preferences", "office_preferences",
					false);

			addHomeButton(EnCommandId.CONTACT_US.name(), "Contact Us", "Contact Us", "contact_us", false);

			if (!Rcpl.isMobile()) {
				addHomeButton(EnCommandId.homeShowDonation.name(), "Donation", "Show Donation Page", "donation", false);
			}
			addHomeButton(EnCommandId.homeShowTutorials.name(), "Help", "Show Help Page", "office_help", false);

			addHomeButton(EnCommandId.homeShowAbout.name(), "About", "About", "joffice", false);
		}

	}

	protected void addHomeButton(String id, String name, String toolTip, String image, boolean toggle) {
		IButton homeButton = new JOButton(id, name, toolTip, image, false);
		homeButton.setWidth(20);
		homeButton.setHeight(20);
		if (homeButtonsArea.getChildren().isEmpty()) {
			HBox.setMargin(homeButtonsArea, new Insets(-4, 0, 0, 48));
			homeButtonsArea.setSpacing(2);
		}
		homeButtonsArea.getChildren().add(homeButton.getNode());
	}

	@Override
	public List<IHomePage> getHomepages() {
		return homepages;
	}

}
