package org.eclipse.rcpl.application;

import java.io.File;

import org.eclipse.rcpl.model.IMobileProvider;
import org.eclipse.rcpl.model.RCPLModel;

/**
 * @author ramin
 *
 */
public class DefaultMobileProvider implements IMobileProvider {

	@Override
	public File getApplicationDir() {
		try {
			File f = new File(System.getProperty("user.home") + "/.rcpl");
			f.mkdirs();
			return f;
		} catch (Throwable ex) {
			RCPLModel.logError(ex);
		}
		return new File("");
	}

	@Override
	public void showSoftKeyboard() {
	}

	@Override
	public void hideSoftKeyboard() {

	}

	@Override
	public void appendLog(String text) {
	}

	@Override
	public void displayNotification(String message) {
	}

}
