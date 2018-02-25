package org.eclipse.rcpl;

import java.io.File;
import java.net.URL;

/**
 * @author ramin
 *
 */
public interface IOfficeUIC {

	void openDocument(File file);

	void openDocument(URL url);

}
