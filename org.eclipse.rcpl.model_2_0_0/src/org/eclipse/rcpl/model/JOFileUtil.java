package org.eclipse.rcpl.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author ramin
 *
 */
public class JOFileUtil {

	/**
	 * @param fileName
	 * @return
	 */
	public static boolean copyTemplateResourceToUserDir(Class cl, String fileName) {
		return JOFileUtil.copyResourceToUserDir(cl, fileName, fileName);
	}

	/**
	 * @param pathToResource
	 * @param fileName
	 * @return
	 */
	public static boolean copyResourceToUserDir(Class cl, String pathToResource, String fileName) {
		String userDir = System.getProperty("user.home") + "/.rcpl";
		return copyResourceToFile(pathToResource, cl, new File(userDir, fileName).getAbsolutePath());
	}

	/**
	 * @param pathToResource
	 * @param pathToFile
	 * @return
	 */
	public static boolean copyResourceToFile(String pathToResource, Class cl, String pathToFile) {

		InputStream stream = cl.getResourceAsStream(pathToResource);

		if (stream == null) {
			// send your exception or warning
			return false;
		}
		OutputStream resStreamOut = null;
		int readBytes;
		byte[] buffer = new byte[4096];
		try {
			resStreamOut = new FileOutputStream(new File(pathToFile));
			while ((readBytes = stream.read(buffer)) > 0) {
				resStreamOut.write(buffer, 0, readBytes);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				stream.close();
				resStreamOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
}
