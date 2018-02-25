package org.eclipse.rcpl.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.rcpl.model.RCPLModel;

/**
 * @author ramin
 *
 */
public class JOFileUtil {

	/**
	 * @param fileName
	 * @return
	 */
	public static boolean copyResourceToUserDir(Class<?> cl, String fileName) {
		String userDir = RCPLModel.mobileProvider.getApplicationDir().getAbsolutePath();
		return copyResourceToFile(cl, fileName, new File(userDir, fileName).getAbsolutePath());
	}

	/**
	 * @param pathToResource
	 * @param pathToFile
	 * @return
	 */
	public static boolean copyResourceToFile(Class<?> cl, String pathToResource, String pathToFile) {
		InputStream stream = cl.getResourceAsStream(pathToResource);
		if (stream == null) {
			RCPLModel.log(stream, "InputStream to " + pathToResource + " is null");
			return false;
		}
		OutputStream resStreamOut = null;
		int readBytes;
		File outFile = new File(pathToFile);
		outFile.getParentFile().mkdirs();
		byte[] buffer = new byte[4096];
		try {
			resStreamOut = new FileOutputStream(new File(pathToFile));
			while ((readBytes = stream.read(buffer)) > 0) {
				resStreamOut.write(buffer, 0, readBytes);
			}
		} catch (Throwable e1) {
			RCPLModel.logError(e1);
		} finally {
			try {
				stream.close();
				resStreamOut.close();
			} catch (IOException e) {
				RCPLModel.logError(e);
				return false;
			} catch (Throwable e) {
				RCPLModel.logError(e);
			}
		}
		return true;
	}
}
