package org.eclipse.rcpl;

import javafx.stage.Stage;

/**
 * @author ramin
 *
 */
public interface IApplicationStarter {

	boolean start(final RcplLogin login, final Stage primaryStage);

	IRcplApplicationProvider getRcplApplicationProvider();

}
