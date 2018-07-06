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

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.rcpl.IApplicationStarter;
import org.eclipse.rcpl.IMonitor;
import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplAbstractService;
import org.eclipse.rcpl.RcplLogin;
import org.eclipse.rcpl.impl.RcplMonitor;
import org.eclipse.rcpl.internal.services.RcplService;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOSession;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

/**
 * @author ramin
 *
 */
public class RcplApplicationProvider implements IRcplApplicationProvider {

	private static IApplicationStarter rcplApplicationStarter;

	private boolean LOGIN_DEBUG = false;

	public static void init(String[] args) {

		// BasicService basicService = null;
		// try {
		// try {
		// basicService = (BasicService)
		// ServiceManager.lookup("javax.jnlp.BasicService");
		// JOSession.LAUNCHED_BY_JNLP = true;
		// } catch (UnavailableServiceException e) {
		// JOSession.LAUNCHED_BY_JNLP = false;
		// }
		//
		// if (basicService != null) {
		// JOSession.codeBase = basicService.getCodeBase().toString();
		//
		// } else {
		// // JO. log("codeBase not determined");
		// }
		// } catch (Exception ex) {
		// // ignore
		// }

		if (RCPLModel.mobileProvider == null) {
			RCPLModel.mobileProvider = new DefaultMobileProvider();
		}

		for (String arg : args) {

			if (arg.startsWith("-cdo")) {
				String[] splits = arg.split("=");
				if (splits.length == 2) {
					JOSession.getDefault().CDO_SERVER = splits[1].trim();
				}
			} else if (arg.startsWith("-codebase")) {
				String[] splits = arg.split("=");
				if (splits.length == 2) {
					JOSession.getDefault().codeBase = splits[1].trim();
				}
			}
		}

	}

	private boolean started = false;

	private Stage primaryStage;

	private StackPane mainStackPane;

	private StackPane mainContent;

	private StackPane progressGroup;

	private List<String> rcplPluginClassNames = new ArrayList<String>();

	private HashMap<String, IRcplPlugin> rcplPlugins = new HashMap<String, IRcplPlugin>();

	private Application fxApplication;

	private RcplLogin joLogin;

	public RcplApplicationProvider(Application fxApplication) {
		this.fxApplication = fxApplication;
	}

	@Override
	public Application getFxApplication() {
		return fxApplication;
	}

	@Override
	public void bindPluginsToModel() {
		for (IRcplPlugin plugin : rcplPlugins.values()) {
			try {
				plugin.bindToModel();
			} catch (Exception e) {
				Rcpl.progressMessage(e.getMessage());
			}
		}
	}

	@Override
	public StackPane getMainContentGroup() {
		return mainContent;
	}

	@Override
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	private IApplicationStarter getRcplApplicationStarter() {
		if (rcplApplicationStarter == null) {

			// first scan all custom application rcpl plugins

			for (IRcplPlugin plugin : rcplPlugins.values()) {
				if (plugin.isCustomApplication()) {
					IApplicationStarter applicationStarter = plugin.createApplicationStarter(this);
					if (applicationStarter != null) {
						rcplApplicationStarter = applicationStarter;
						return rcplApplicationStarter;
					}
				}
			}

			// now find the built-in application rcpl plugin

			// for (IRcplPlugin plugin : rcplPlugins) {
			// if (!plugin.isCustomApplication()) {
			// IApplicationStarter applicationStarter =
			// plugin.createApplicationStarter(this);
			// if (applicationStarter != null) {
			// rcplApplicationStarter = applicationStarter;
			// return rcplApplicationStarter;
			// }
			// }
			// }

			return new DefaultApplicationStarter(this);

		}
		return rcplApplicationStarter;
	}

	@Override
	public Collection<IRcplPlugin> getRcplPlugins() {
		return rcplPlugins.values();
	}

	@Override
	public void login() {
		joLogin.getNode().setVisible(false);
		if (!Rcpl.isMobile()) {
			primaryStage.hide();
		}
		Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
		mainContent.getChildren().remove(joLogin.getNode());
		Rcpl.createProgress(progressGroup);
		Rcpl.startProgress(3.0, true);

		if (!Rcpl.isMobile()) {
			primaryStage.setWidth(bounds.getWidth() * 0.8);
			primaryStage.setHeight(bounds.getHeight() * 0.8);
			primaryStage.centerOnScreen();
			primaryStage.getScene().getRoot().setClip(null);
			primaryStage.show();
		}
		Rcpl.progressMessage("Register Plugins");
		registerPlugins();

		final IApplicationStarter applicationsStarter = getRcplApplicationStarter();
		if (applicationsStarter != null) {
			Rcpl.progressMessage("Application Starter found: " + applicationsStarter.getClass().getSimpleName());

			Platform.runLater(new Runnable() {

				@Override
				public void run() {
					boolean success = applicationsStarter.start(joLogin, primaryStage);
					if (!success) {
						joLogin.getController().setErrorInUserId();
						reStart();
					} else {
						Rcpl.progressMessage(
								"Application " + applicationsStarter.getClass().getSimpleName() + "started");
						joLogin.getController().setHeaderText("RCPL is starting.");
					}
				}
			});

//			final Task<Void> task = new Task<Void>() {
//				@Override
//				public Void call() {
//					boolean success = applicationsStarter.start(joLogin, primaryStage);
//					if (!success) {
//						joLogin.getController().setErrorInUserId();
//						reStart();
//					} else {
//						Rcpl.progressMessage(
//								"Application " + applicationsStarter.getClass().getSimpleName() + "started");
//						joLogin.getController().setHeaderText("RCPL is starting.");
//					}
//					return null;
//				}
//			};
//
//			new Thread(task).start();
		}

	}

	private void registerPlugins() {
		for (String pluginClass : rcplPluginClassNames) {
			IRcplPlugin rcplPlugin = createRcplPlugin(pluginClass);
			if (rcplPlugin != null) {
				Rcpl.progressMessage("RcplPlugin " + rcplPlugin.getDisplayName() + " registered.");
			}
		}
	}

	private IRcplPlugin createRcplPlugin(String rcplPluginClassName) {
		try {
			Class<?> pluginClass = Class.forName(rcplPluginClassName);
			Object plugin = pluginClass.newInstance();
			if (plugin instanceof IRcplPlugin) {
				IRcplPlugin rcplPlugin = (IRcplPlugin) plugin;
				rcplPlugins.put(rcplPluginClassName, rcplPlugin);
				Rcpl.progressMessage("RCPL - Plugin registered: " + rcplPlugin.getDisplayName());
				return rcplPlugin;
			}
		} catch (InstantiationException e) {
			RCPLModel.logError(e);
		} catch (IllegalAccessException e) {
			RCPLModel.logError(e);
		} catch (ClassNotFoundException e) {
			RCPLModel.logError(e);
		}
		return null;
	}

	@Override
	public void registerRcplPluginClass(String rcplPluginClassName) {
		String className = rcplPluginClassName;
		if (rcplPluginClassName.endsWith(".class")) {
			className = rcplPluginClassName.substring(0, rcplPluginClassName.length() - 6);
		}
		
		try {
			Class.forName(rcplPluginClassName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		rcplPluginClassNames.add(className);
	}

	@Override
	public void registerService(Class<? extends RcplService> serviceClass) {
		RcplAbstractService.registerService(serviceClass);
	}

	protected URL resolve(URL url) {
		return url;
	}

	@Override
	public void reStart() {
		while (!((Pane) primaryStage.getScene().getRoot()).getChildren().isEmpty()) {
			((Pane) primaryStage.getScene().getRoot()).getChildren().remove(0);
		}
		JOSession.getDefault().close(true, true);
		start(primaryStage);
	}

	private void calculateMonitors() {
		int index = 0;
		for (Screen s : Screen.getScreens()) {
			IMonitor m = new RcplMonitor(s, index++);
			Rcpl.monitors.put(s, m);
		}
	}

	@Override
	public void start(final Stage primaryStage) {
		primaryStage.hide();
		this.primaryStage = primaryStage;
		Rcpl.rcplApplicationProvider = this;
		calculateMonitors();
		mainStackPane = new StackPane();
		mainContent = new StackPane();
		mainStackPane.setPrefSize(5000, 5000);
		mainContent.setPrefSize(5000, 5000);

		progressGroup = new StackPane();
		progressGroup.setPickOnBounds(false);
		mainStackPane.getChildren().addAll(mainContent, progressGroup);
		mainStackPane.setId("loginPage");

		if (!started) {
			this.primaryStage = primaryStage;
			Map<String, String> map = fxApplication.getParameters().getNamed();
			for (String key : map.keySet()) {
				if ("cdo".equals(key)) {
					JOSession.getDefault().CDO_SERVER = map.get(key);
					// JO.log("CDO Server: " + JOSession.CDO_SERVER);
				}
			}
		}

		joLogin = new RcplLogin(this);
		if (Rcpl.isMobile()) {
			StackPane.setAlignment(joLogin.getNode(), Pos.TOP_CENTER);
		}
		mainContent.getChildren().add(joLogin.getNode());

		// ---------------------------------------------------------

		if (Rcpl.isMobile()) {
			startMobile();
		}

		else {
			startPc();
		}

		primaryStage.show();
		started = true;
		mainStackPane.layout();
	}

	@Override
	public void setLoginDebug() {
		LOGIN_DEBUG = true;
	}

	@Override
	public boolean isLoginDebug() {
		return LOGIN_DEBUG;
	}

	private void startMobile() {
		Rcpl.progressMessage("Start Mobile Application");
		Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
		RCPLModel.log(this, "Screen bounds: " + bounds.getWidth() + "/" + bounds.getHeight());
		primaryStage.setScene(new Scene(mainStackPane, Color.YELLOW));
		primaryStage.getScene().getStylesheets().addAll(
				RcplApplicationProvider.class.getResource("/css/default.css").toExternalForm(),
				RcplApplicationProvider.class.getResource("/css/msoffice.css").toExternalForm());

		primaryStage.setWidth(bounds.getWidth());
		primaryStage.setHeight(bounds.getHeight());
		primaryStage.setX(0);
		primaryStage.setY(0);
		mainStackPane.layout();
		primaryStage.show();
	}

	private void startPc() {
		Rcpl.progressMessage("Start Desktop Application");

		final Undecorator undecorator = new Undecorator(primaryStage, mainStackPane);
		undecorator.getStylesheets().addAll("skin/undecorator.css", "/css/msoffice.css", "/css/default.css"); // ,
		// ,
		// );
		Scene scene = new Scene(undecorator);
		undecorator.installAccelerators(scene);
		undecorator.setFadeInTransition();

		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent we) {
				we.consume(); // Do not hide
				undecorator.setFadeOutTransition();
			}
		});

		scene.setFill(Color.TRANSPARENT);
		try {
			primaryStage.initStyle(StageStyle.TRANSPARENT);
		} catch (Throwable ex) {
			// ignore
		}

		primaryStage.setScene(scene);

		Rectangle2D bounds = Screen.getPrimary().getVisualBounds();

		primaryStage.setWidth(bounds.getWidth());
		primaryStage.setHeight(bounds.getHeight());
		primaryStage.centerOnScreen();

		double loginWidth = joLogin.getNode().getPrefWidth();
		double loginHeight = joLogin.getNode().getPrefHeight();
		Rectangle r = new Rectangle((bounds.getWidth() - loginWidth) / 2.0, (bounds.getHeight() - loginHeight) / 2.0,
				loginWidth, loginHeight);
		primaryStage.getScene().getRoot().setClip(r);
		primaryStage.toFront();

	}

	@Override
	public IRcplPlugin findRcplPlugin(String className) {
		return rcplPlugins.get(className);
	}

	@Override
	public IRcplPlugin findRcplPlugin(Class<? extends IRcplPlugin> pl) {
		for (IRcplPlugin p : rcplPlugins.values()) {

			for (Class<?> inf : p.getClass().getInterfaces()) {
				if (inf.getName().equals(pl.getName())) {
					return p;
				}
			}

		}
		return null;
	}

	@Override
	public void setMainStackPane(StackPane mainStackPane) {
		this.mainStackPane = mainStackPane;
	}

	@Override
	public StackPane getMainApplicationStack() {
		return mainStackPane;
	}

}
