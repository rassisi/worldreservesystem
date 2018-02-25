package org.eclipse.rcpl;

import java.util.Collection;

import org.eclipse.rcpl.internal.services.RcplService;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author ramin
 *
 */
public interface IRcplApplicationProvider {

	void setLoginDebug();

	boolean isLoginDebug();

	void reStart();

	Collection<IRcplPlugin> getRcplPlugins();

	void bindPluginsToModel();

	void registerRcplPluginClass(String rcpPluginClassName);

	IRcplPlugin findRcplPlugin(String className);

	void registerService(Class<? extends RcplService> serviceClass);

	void start(Stage primaryStage);

	void login();

	StackPane getMainContentGroup();

	void setMainStackPane(StackPane stackPane);

	Stage getPrimaryStage();

	Application getFxApplication();

	StackPane getMainApplicationStack();

}
