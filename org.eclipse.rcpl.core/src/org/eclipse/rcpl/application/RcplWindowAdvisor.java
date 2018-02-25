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
package org.eclipse.rcpl.application;

import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.IWindowAdvisor;
import org.eclipse.rcpl.RcplVersion;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOKey;
import org.eclipse.rcpl.model.cdo.client.JOSession;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * @author Ramin Assisi
 * 
 */
public class RcplWindowAdvisor implements IWindowAdvisor {

	boolean startMenu;

	double lastMinWidth = 0;
	double lastMaxWidth = 0;

	double maxWidth = 0;

	private Pane splashLayout;
	private ProgressBar loadProgress;
	private Text progressText;

	private String splashMessage = "...";

	private double initialStageX;
	private double initialStageY;

	private double initialStageWidth;
	private double initialStageHeight;

	private IRcplApplicationProvider applicationProvider;

	private String cssStyleSheetResource;

	/**
	 * @param rcplApplicationProvider
	 * @param cssStyleSheetResource
	 */
	public RcplWindowAdvisor(IRcplApplicationProvider rcplApplicationProvider, String cssStyleSheetResource) {
		this.applicationProvider = rcplApplicationProvider;
		this.cssStyleSheetResource = cssStyleSheetResource;
	}

	/**
	 * @param stage
	 */
	@Override
	public void start() {

		splashMessage = "JOfficeRCP Version " + RcplVersion.getVersion();

		// ---------- PREFERENCES ------------------------------------

		String xs = "0";
		String ys = "0";

		try {
			xs = JOSession.getDefault().getSystemPreferences().getString(JOKey.STAGE_X);
			ys = JOSession.getDefault().getSystemPreferences().getString(JOKey.STAGE_Y);
		} catch (Exception ex) {
			Rcpl.progressMessage(ex);
		}
		double maxWidth = 0;

		ObservableList<Screen> screens = Screen.getScreens();
		for (Screen screen : screens) {
			maxWidth += screen.getBounds().getWidth();
		}

		if (xs != null && ys != null) {
			try {
				initialStageX = Double.valueOf(xs);
				initialStageY = Double.valueOf(ys);
				if (initialStageX > (maxWidth - 300)) {
					initialStageX = -1;
				}
			} catch (Exception ex) {
				// ignore
			}
		}

		Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

		initialStageWidth = primaryScreenBounds.getWidth() * 0.8;
		initialStageHeight = primaryScreenBounds.getHeight() * 0.8;

		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				createMainWindow();
			}
		});

	}

	private void createMainWindow() {
		applicationProvider.getPrimaryStage().show();
		Rcpl.progressMessage("RCPL.createMainWindow()");
		splashMessage = "RCPL  Version " + RcplVersion.getVersion();
		Rcpl.progressMessage("Init Use Cases");
		for (IRcplPlugin uc : applicationProvider.getRcplPlugins()) {
			Rcpl.UIC.getTopToolBarControl().processTopBarMainGroups(uc);
			uc.init();
		}
		Rcpl.progressMessage("Configure Top Area");
		Rcpl.UIC.expandTopAra(true);
		splashMessage = "J Office  Version " + RcplVersion.getVersion();
		StackPane stackPane = applicationProvider.getMainContentGroup();
		stackPane.getChildren().clear();
		Rcpl.UIC.addtoApplicationStack(applicationProvider.getMainContentGroup());
		splashMessage = "J Office  Version " + RcplVersion.getVersion();
		Rcpl.progressMessage("OfficeRCP.createMainWindow()#2");
		Rcpl.showProgress(false);

	}

	@Override
	public void openMainWindow() {
		applicationProvider.getPrimaryStage().centerOnScreen();
		applicationProvider.getPrimaryStage().setTitle("RCPL");

		if (initialStageX <= 0) {
			applicationProvider.getPrimaryStage().centerOnScreen();
		} else {
			applicationProvider.getPrimaryStage().setX(initialStageX);
			applicationProvider.getPrimaryStage().setY(initialStageY);
		}
		splashMessage = "J Office  Version " + RcplVersion.getVersion();
		splashMessage = "Success";
		Rcpl.progressMessage("Create Default Theme");
		Rcpl.UIC.handleThemeDefault(null);
		addKeyListener();
		Rcpl.progressMessage("OfficeRCP.createMainWindow()#3");
	}

	private EventHandler<KeyEvent> keyhandler = null;

	private void addKeyListener() {
		if (keyhandler == null) {
			keyhandler = new EventHandler<KeyEvent>() {

				@Override
				public void handle(KeyEvent event) {
					if (event.isControlDown()) {
						if (event.getText().equals("x") && event.isShiftDown()) {
							Rcpl.UIC.showPerspective(RCPLModel.USE_CASE_IT_ID, false);
							event.consume();
							return;
						}
					}
				}
			};
		}
		applicationProvider.getPrimaryStage().getScene().setOnKeyPressed(keyhandler);
	}

	// private void applyStyle(final Stage stage, final String style) {
	// final Scene scene = stage.getScene();
	// removeAllStyles(stage);
	// scene.getStylesheets().add(style);
	// }

	private void removeAllStyles(Stage stage) {
		if (Rcpl.UIC.getStylesRegistry() != null) {
			for (String style : Rcpl.UIC.getStylesRegistry()) {
				stage.getScene().getStylesheets().remove(style);
			}
		}
	}

	protected void handleOk() {

	}

}
