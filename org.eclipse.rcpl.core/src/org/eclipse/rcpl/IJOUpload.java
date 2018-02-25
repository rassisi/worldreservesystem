package org.eclipse.rcpl;

import java.io.InputStream;

/**
 * @author ramin
 *
 */
public interface IJOUpload {
	public String upload(String filename, String user, InputStream data);
}