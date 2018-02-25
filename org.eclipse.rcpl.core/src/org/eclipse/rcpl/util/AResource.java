/*******************************************************************************
 * Copyright (c) 2003 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/

package org.eclipse.rcpl.util;

/**
 * Dieser Typ wurde in VisualAge erstellt.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;

public class AResource {
	/**
	 * AFile - Konstruktorkommentar.
	 */
	public AResource() {
		super();
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String getFilePartWithoutExtension(String fileName) {

		String result = "";
		StringTokenizer tok = new StringTokenizer(fileName, ".");

		int n = tok.countTokens();

		if (n == 1) {
			result = (String) tok.nextElement();
		} else if (n == 2) {
			result = (String) tok.nextElement();
		} else if (n == 3) {
			tok.nextElement();
			result = (String) tok.nextElement();
		}

		int pos = result.lastIndexOf("/");
		if (pos == -1) {
			pos = result.lastIndexOf("\\");
		}
		if (pos != -1) {
			result = result.substring(pos + 1, result.length());
		}

		return result;
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings("unused")
	public static byte[] loadFile(String file) {

		/* Die Methode getHtmlTemplateText ausführen. */
		byte[] data = new byte[1];
		InputStream in = null;
		FileInputStream fis;

		try {
			File f = new File(file);
			if (f.exists()) {
				fis = new FileInputStream(f);
				int size = (int) f.length();
				data = new byte[size];
				fis.read(data);
				fis.close();
			}
		} catch (Exception e) {
			// System. out.println(e);
		}

		return data;
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings("unused")
	public static String loadFileAsString(File file) {

		byte[] data = new byte[1];
		InputStream in = null;
		FileInputStream fis;

		try {
			if (file.exists()) {
				fis = new FileInputStream(file);
				int size = (int) file.length();
				data = new byte[size];
				fis.read(data);
				fis.close();
			}
		} catch (Exception e) {
			// System. out.println(e);
		}

		return new String(data);
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */

	public static String loadFileAsString(String file) {
		File f = new File(file);
		return loadFileAsString(f);
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings("cast")
	public static Object loadObject(String fileName) {

		Object result = null;

		File file = new File(fileName);

		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream(file);
				// GZIPInputStream gzis = new GZIPInputStream( fis );
				ObjectInputStream ino = new ObjectInputStream(fis);
				// ino. useProtocolVersion(ino.PROTOCOL_VERSION_2);
				result = (Object) ino.readObject();
				fis.close();

			} catch (Exception e) {
			}
		} else {
		}

		return result;
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings({ "rawtypes", "unchecked", "null", "nls" })
	public static Object[] loadObjects(String fileName) {

		Object temp = null;
		FileInputStream fis = null;
		java.util.Vector resultV = new java.util.Vector();

		File file = new File(fileName);
		try {
			fis = new FileInputStream(file);
			// GZIPInputStream gzis = new GZIPInputStream( fis );
			ObjectInputStream ino = new ObjectInputStream(fis);
			while ((temp = ino.readObject()) != null) {
				resultV.add(temp);
			}
			fis.close();

		} catch (Exception e) {
			try {
				fis.close();
			} catch (Exception e2) {
			}
			// System. out.println("@@@ error: xxxx : reading object from "
			// + fileName);
		}

		return resultV.toArray();
	}

	/**
	 * Haupteingangspunkt - Startet die Komponente, wenn sie als Anwendung
	 * ausgeführt wird
	 * 
	 * @param args
	 *            java.lang.String[]
	 */
	@SuppressWarnings("nls")
	public static void main(java.lang.String[] args) {
		try {

			AResource.saveResourceAs("c:\\opt\\migsys\\bin\\", "WordAPI.exe",
					"lib/WordAPI.exe");

		} catch (Throwable exception) {
			// System. err
			// .println("In main() von java.awt.Frame trat eine Ausnahmebedingung auf");
			exception.printStackTrace(System.out);
		}
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings({ "unused", "nls" })
	public static String makeFileDirName(String dirs) {

		String dirname = new String(dirs);

		int pos;
		File fd = new File("c:\\");
		try {
			if (fd.exists()) {
				// Windows
				dirname = AString.replace(dirname, "/", "\\");
			} else {
				// UNIX
				dirname = AString.replace(dirname, "\\", "/");
			}
		} catch (Exception e) {
			// UNIX
			dirname = AString.replace(dirname, "\\", "/");
		}

		return dirname;
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	public static String mkDirs(String dirs) {

		String dirname = makeFileDirName(dirs);

		File fd = new File(dirname);
		if (!fd.exists()) {
			fd.mkdirs();
		}

		return dirname;
	}

	@SuppressWarnings({ "nls", "unused" })
	public static boolean saveFile(String fileName, String data_) {

		String dir = "";
		String file = "";

		fileName = org.eclipse.rcpl.util.AString.replace(fileName, "\\", "/");
		fileName = org.eclipse.rcpl.util.AString.replace(fileName, "//", "/");

		java.io.File f = new java.io.File(fileName);
		dir = f.getPath();
		dir = org.eclipse.rcpl.util.AString.replace(dir, "\\", "/");

		int pos = dir.lastIndexOf("/");
		if (pos != -1) {
			dir = dir.substring(0, pos + 1);
			f = new java.io.File(dir);
			f.mkdirs();
		} else {
			dir = "";
		}

		byte[] data = data_.getBytes();

		try {
			FileOutputStream fx = new FileOutputStream(fileName);
			fx.write(data);
			fx.flush();
			fx.close();
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public static boolean saveFile(String dir, String file, byte[] data) {

		dir = AFile.mkDirs(dir);
		try {
			String dirx = AString.makeEndsWithSlash(dir);
			FileOutputStream fx = new FileOutputStream(dirx + file);
			fx.write(data);
			fx.flush();
			fx.close();
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public static boolean saveFile(String dir, String file, String data_) {

		byte[] data = data_.getBytes();

		dir = AFile.mkDirs(dir);
		try {
			String dirx = AString.makeEndsWithSlash(dir);
			FileOutputStream fx = new FileOutputStream(dirx + file);
			fx.write(data);
			fx.flush();
			fx.close();
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings({ "unused", "nls", "null" })
	public static void saveObject(String fileName, Object[] objects) {

		File f = new File(fileName);
		ObjectOutputStream outo = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(fileName);
			// ZipOutputStream gzos = new ZipOutputStream( fos );
			outo = new ObjectOutputStream(fos);
			// outo.useProtocolVersion(outo.PROTOCOL_VERSION_1);
			int n = objects.length;
			for (int i = 0; i < n; i++) {
				try {
					/*
					 * if(i==0){ objects[i] = "-"; }
					 */
					outo.writeObject(objects[i]);
				} catch (IOException e2) {

					System.out
							.println("@@@ error: xxxx : could not write object "
									+ objects[i].getClass().getName());

					Object newObject = new Object();
					try {
						newObject = objects[i].getClass().newInstance();
					} catch (InstantiationException ix) {
					} catch (IllegalAccessException iy) {
					}

					outo.writeObject(newObject);
				}
			}
			outo.flush();
			fos.close();
			return;
		} catch (IOException e) {

			try {
				outo.flush();
				fos.close();
			} catch (IOException e2) {
			}

			// System. out.println("@@@ error: xxxx : write object to " +
			// fileName);

			return;
		}

	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static void saveObject(String fileName_, Object object_) {

		// String filename2 = new String( publishRoot + "data/tree.bak" );

		File f = new File(fileName_);

		String dir = "";
		String file = "";

		try {

			file = f.getName();

			dir = fileName_.substring(0, fileName_.length() - file.length());
		} catch (Exception e) {
		}

		AFile.mkDirs(dir);

		/*
		 * File f2 = new File( filename2 );
		 * 
		 * if( f.exists()){ if( f2.exists() ) f2.delete(); f.renameTo( f2 ); }
		 */

		try {

			FileOutputStream fos = new FileOutputStream(fileName_);
			// GZIPOutputStream gzos = new GZIPOutputStream( fos );
			ObjectOutputStream outo = new ObjectOutputStream(fos);
			outo.useProtocolVersion(ObjectOutputStream.PROTOCOL_VERSION_1);

			outo.writeObject(object_);
			outo.flush();
			fos.close();
			return;
		} catch (IOException e) {

			System.out
					.println("@@@ error: xxxx : write object to " + fileName_);

			return;
		}

	}

	@SuppressWarnings({ "rawtypes", "nls" })
	public static boolean saveResourceAs(String fileName, String resourceName) {

		try {
			Class clazz = resourceName.getClass();

			InputStream is = clazz.getResourceAsStream("/" + resourceName);

			// System. out.println("*** is = " + is);
			// java.net.URL url = clazz.getResource("/" + resourceName);

			byte[] data = new byte[100000];
			is.read(data);

			AFile.saveFile(fileName, "WordAPI", data);

		} catch (Exception ex) {
		}

		return true;
	}

	@SuppressWarnings({ "rawtypes", "nls", "unused" })
	public static boolean saveResourceAs(String dir, String fileName,
			String resourceName) {

		try {
			Class clazz = resourceName.getClass();

			InputStream is = clazz.getResourceAsStream("/" + resourceName);

			System.out.println("*** is = " + is);
			// java.net.URL url = clazz.getResource("/" + resourceName);

			byte[] data = new byte[500000];
			int n = is.read(data);

			AFile.saveFile(dir, fileName, data);

		} catch (Exception ex) {
		}

		return true;
	}
}
