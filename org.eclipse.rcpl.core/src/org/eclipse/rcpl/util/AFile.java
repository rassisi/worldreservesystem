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

package org.eclipse.rcpl.util;

/**
 * Dieser Typ wurde in VisualAge erstellt.
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class AFile {

	/**
	 * AFile - Konstruktorkommentar.
	 */
	public AFile() {
		super();
	}

	@SuppressWarnings("nls")
	public static void main(String[] args) {

		String content = loadZipFileAsStringUTF8(new File("c:/temp/oo/oo1/text.zip"), new File("content.xml"));

		// System. out.("1:\n" + content + "\n");

		saveZipFileUTF8("c:/temp/oo/oo1/content", content);

		content = loadZipFileAsStringUTF8(new File("c:/temp/oo/oo1/content"));

		// System. out.("2:\n" + content + "\n");

		// String zipName = "c:/temp/oo/oo1/text.zip";

		// AFile.unzip3(zipName, "content.xml");

		// AFile.unZip2(zipName, "c:/temp/oo/oo1");

		// byte[] data = AFile.unZipExtract(zipName, "content.xml");

		// AFile.saveFile(new File("c:/temp/oo/oo1/content.xml"), data);

		/*
		 * try { AFile.makeZip("c:/temp/testzip/testzip1/",
		 * "c:/temp/testzip/out/test.odt"); } catch (FileNotFoundException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); } catch
		 * (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		/*
		 * try{ File file = new File("c:/temp/testzip/testzip1/content.xml");
		 * ZipOutputStream zos = new ZipOutputStream(new
		 * FileOutputStream("c:/temp/testzip/out/test.zip"));
		 * 
		 * //recurseFiles(zos, dir);
		 * 
		 * byte[] buf = new byte[1024]; int len; //Create a new Zip entry with
		 * the file's name.
		 * 
		 * String zipEntryName = "/" + file.getName(); ZipEntry zipEntry = new
		 * ZipEntry(zipEntryName); //file.toString()); //Create a buffered input
		 * stream out of the file //we're trying to add into the Zip archive.
		 * FileInputStream fin = new FileInputStream(file); BufferedInputStream
		 * in = new BufferedInputStream(fin); zos.putNextEntry(zipEntry); //Read
		 * bytes from the file and write into the Zip archive. while ((len =
		 * in.read(buf)) >= 0) { zos.write(buf, 0, len); } //Close the input
		 * stream. in.close(); //Close this entry in the Zip stream.
		 * zos.closeEntry();
		 * 
		 * 
		 * zos.close(); } catch(Exception ex){
		 * 
		 * }
		 */

	}

	static File tempDir = null;

	static String tempDirString = null;

	@SuppressWarnings("nls")
	public static File getTempDirFile() {

		if (tempDir == null) {
			// String tempdir=System.getProperty("java.io.tmpdir");

			try {
				tempDir = File.createTempFile("temp", "tmp").getParentFile();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}

		return tempDir;
	}

	@SuppressWarnings("nls")
	public static String getTempDir() {
		if (tempDirString == null) {
			File f = getTempDirFile();
			if (f != null) {
				tempDirString = f.getAbsolutePath();
				if (!tempDirString.endsWith("\\") && !tempDirString.endsWith("/")) {
					tempDirString = tempDirString + "/";
				}
			}
		}
		return tempDirString;
	}

	@SuppressWarnings("nls")
	public static String getIniFileValue(String fileName, String key) {
		File file = new File(fileName);
		if (!file.exists())
			return "";
		return getIniFileValue(file, key);
	}

	@SuppressWarnings("nls")
	public static String getIniFileValue(File file, String key) {
		String result = "";
		if (file.exists()) {
			try {
				String iniString = AFile.loadFileAsString(file);
				StringTokenizer tok = new StringTokenizer(iniString, "\n");
				while (tok.hasMoreTokens()) {
					String line = tok.nextToken();
					StringTokenizer lineTok = new StringTokenizer(line, "=");
					String keyX = lineTok.nextToken().toUpperCase();
					String value = lineTok.nextToken();
					if (keyX.equals(key)) {
						result = value;
						break;
					}
				}
			} catch (Exception ex) {
				return "";
			}
		}

		if (result.endsWith("\r"))
			result = result.substring(0, result.length() - 1);
		return result;
	}

	@SuppressWarnings("nls")
	public static void setIniFileValue(File file, String key, String value) {
		StringBuffer result = new StringBuffer();

		if (file.exists()) {
			try {
				String iniString = AFile.loadFileAsString(file);
				StringTokenizer tok = new StringTokenizer(iniString, "\n");
				while (tok.hasMoreTokens()) {
					String line = tok.nextToken();
					StringTokenizer lineTok = new StringTokenizer(line, "=");
					String keyX = lineTok.nextToken();
					lineTok.nextToken();
					if (keyX.equals(key)) {
						result.append(keyX + "=" + value + "\n");
					} else {
						result.append(line + "\n");
					}
				}
			} catch (Exception ex) {
			}
			AFile.saveFile(file, result.toString());
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
	public static String getDir(File file) {

		if (file == null) {
			return null;
		}

		String path = AString.replace(file.getAbsolutePath(), "\\", "/");
		String name = file.getName();
		String dir = "";

		if (path.length() > name.length()) {
			dir = path.substring(0, path.length() - name.length());
		}

		return dir;
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings({ "nls", "rawtypes", "unchecked" })
	public static String getExtension(File file) {

		String name = file.getName();

		StringTokenizer tok = new StringTokenizer(name, ".");
		Vector v = new Vector();
		while (tok.hasMoreTokens()) {
			v.add(tok.nextToken());
		}
		int n = v.size();
		if (n > 1) {
			return (String) v.get(v.size() - 1);
		}
		return "";
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String getNameWithoutExtension(File file) {
		String name = file.getName();
		int pos = name.length() - 1;
		int pos2 = name.lastIndexOf(".", pos);
		if (pos2 != -1) {
			String result = name.substring(0, pos2);
			return result;
		}
		return name;

	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */

	// public static String loadFile(File f) {
	// }

	@SuppressWarnings("unused")
	public static byte[] loadFile(File f) {

		/* Die Methode getHtmlTemplateText ausführen. */
		byte[] data = new byte[1];
		InputStream in = null;
		FileInputStream fis;

		try {
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

	public static String loadFileAsString(File file) {
		return loadFileAsStringC(file, Charset.defaultCharset().name());
	}

	public static String loadFileAsStringUTF8(File file) {
		return loadFileAsStringC(file, AString.CHARSET_UTF_8);
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings("unused")
	public static String loadFileAsStringC(File file, String charset) {

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

		try {
			return new String(data, charset);
		} catch (UnsupportedEncodingException e) {
			return new String(data);
		}
	}

	public static String loadGZipFileAsString(File file) {
		return loadGZipFileAsString(file, Charset.defaultCharset().name());
	}

	public static String loadGZipFileAsStringUTF8(File file) {
		return loadGZipFileAsString(file, AString.CHARSET_UTF_8);
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings("unused")
	public static String loadGZipFileAsString(File file, String charset) {

		byte[] data = new byte[1];
		InputStream in = null;
		FileInputStream fis;

		try {
			if (file.exists()) {
				fis = new FileInputStream(file);
				GZIPInputStream zI = new GZIPInputStream(fis);
				int size = (int) file.length();
				data = new byte[size];
				zI.read(data);
				zI.close();
			}
		} catch (Exception e) {
			// System. out.println(e);
			return null;
		}

		try {
			return new String(data, charset);
		} catch (UnsupportedEncodingException e) {
			return new String(data);
		}
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings("cast")
	public static Object loadObject(File file) {

		Object result = null;

		if (file == null) {
			return null;
		}
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream(file);
				// GZIPInputStream gzis = new GZIPInputStream( fis );
				ObjectInputStream ino = new ObjectInputStream(fis);
				// ino. useProtocolVersion(ino.PROTOCOL_VERSION_2);
				result = ino.readObject();
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
	public static Object[] loadObjects(File file) {

		Object temp = null;
		FileInputStream fis = null;
		java.util.Vector resultV = new java.util.Vector();

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
			// + file.getPath());
		}

		return resultV.toArray();
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	public static String loadZipFileAsStringC(File file, String charset) {
		return loadZipFileAsStringC(null, file, charset);
	}

	public static String loadZipFileAsString(File file) {
		return loadZipFileAsStringC(file, Charset.defaultCharset().name());
	}

	public static String loadZipFileAsStringUTF8(File file) {
		return loadZipFileAsStringC(file, AString.CHARSET_UTF_8);
	}

	public static String loadZipFileAsString(File zipFile, File file) {
		return loadZipFileAsStringC(zipFile, file, Charset.defaultCharset().name());
	}

	public static String loadZipFileAsStringUTF8(File zipFile, File file) {
		return loadZipFileAsStringC(zipFile, file, AString.CHARSET_UTF_8);
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings({ "nls", "unused" })
	public static String loadZipFileAsStringC(File zipFile, File file, String charset) {

		if (zipFile == null) {
			zipFile = new File(AString.replace(file.getPath(), ".xml", "") + ".zip");
		}

		String fn = file.getName();

		try {
			if (zipFile.exists()) {

				ZipInputStream zI = new ZipInputStream(new FileInputStream(zipFile));
				byte[] data = new byte[10240];
				for (;;) {
					ZipEntry entry = zI.getNextEntry();
					if (entry == null) {
						break;
					}

					String entryName = entry.getName();
					String fileName = AString.replace(file.getPath(), "\\", "/");
					StringBuffer buf = new StringBuffer();

					if (entryName.equals(fn)) {
						return AString.readCurrentZipEntryToStringC(zI, charset);
					}
				}
			}
		} catch (Exception e) {
			// System. out.println(e);
			return null;
		}

		return null;

	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static FileInputStream lockFile(File file) {

		FileInputStream fis;

		try {
			AFile.saveFile(file.getPath(), "-");
			fis = new FileInputStream(file);
			return fis;
		} catch (Exception e) {
			// System. out.println(e);
		}

		return null;

	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String mkDirs(String dirs) {

		String dirname = AString.replace(dirs, "\\", "/"); //$NON-NLS-1$

		File fd = new File(dirname);
		if (!fd.exists()) {
			fd.mkdirs();
		}

		return slash(dirname);
	}

	public static boolean saveFile(File file, String data_) {
		return saveFileC(file, data_, Charset.defaultCharset().name());
	}

	public static boolean saveFileUTF8(File file, String data_) {
		return saveFileC(file, data_, AString.CHARSET_UTF_8);
	}

	@SuppressWarnings("nls")
	public static boolean saveFileC(File file, String data_, String charset) {

		String dir = "";

		dir = file.getPath();
		dir = org.eclipse.rcpl.util.AString.replace(dir, "\\", "/");

		int pos = dir.lastIndexOf("/");
		if (pos != -1) {
			dir = dir.substring(0, pos + 1);
			File dirFile = new java.io.File(dir);
			dirFile.mkdirs();
		} else {
			dir = "";
		}

		byte[] data = AString.stringToByteArrayC(data_, charset);

		try {
			FileOutputStream fx = new FileOutputStream(file);
			fx.write(data);
			fx.flush();
			fx.close();
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public static boolean saveFile(String fileName, String data_) {
		return saveFileC(fileName, data_, Charset.defaultCharset().name());
	}

	public static boolean saveFileUTF8(String fileName, String data_) {
		return saveFileC(fileName, data_, AString.CHARSET_UTF_8);
	}

	@SuppressWarnings("nls")
	public static boolean saveFileC(String fileName, String data_, String charset) {

		try {

			fileName = org.eclipse.rcpl.util.AString.replace(fileName, "\\", "/");
			fileName = org.eclipse.rcpl.util.AString.replace(fileName, "//", "/");

			java.io.File f = new java.io.File(fileName);

			if (f.isDirectory()) {
				// System. out
				// .println("@@@ AFile.saveFile# error file is directory");
				return false;
			}

			File dir = f.getParentFile();
			dir.mkdirs();

			byte[] data = AString.stringToByteArrayC(data_, charset);

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

	public static boolean saveFile(File file, byte[] data) {
		file.getParentFile().mkdirs();
		try {
			FileOutputStream fx = new FileOutputStream(file);
			fx.write(data);
			fx.flush();
			fx.close();
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public static boolean saveFile(String dir, String file, String data_) {
		return saveFileC(dir, file, data_, Charset.defaultCharset().name());
	}

	public static boolean saveFileUTF8(String dir, String file, String data_) {
		return saveFileC(dir, file, data_, AString.CHARSET_UTF_8);
	}

	public static boolean saveFileC(String dir, String file, String data_, String charset) {

		byte[] data = AString.stringToByteArrayC(data_, charset);

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

	public static boolean saveGZipFile(String fileName, String data_) {
		return saveGZipFileC(fileName, data_, Charset.defaultCharset().name());
	}

	public static boolean saveGZipFileUTF8(String fileName, String data_) {
		return saveGZipFileC(fileName, data_, AString.CHARSET_UTF_8);
	}

	@SuppressWarnings({ "nls", "unused" })
	public static boolean saveGZipFileC(String fileName, String data_, String charset) {

		String dir = "";
		String file = "";

		fileName = AString.replace(fileName, "\\", "/");
		fileName = AString.replace(fileName, "//", "/");

		java.io.File f = new java.io.File(fileName);
		dir = f.getPath();
		dir = AString.replace(dir, "\\", "/");

		int pos = dir.lastIndexOf("/");
		if (pos != -1) {
			dir = dir.substring(0, pos + 1);
			f = new java.io.File(dir);
			f.mkdirs();
		} else {
			dir = "";
		}

		byte[] data = AString.stringToByteArrayC(data_, charset);

		try {
			FileOutputStream fx = new FileOutputStream(fileName);
			GZIPOutputStream zO = new GZIPOutputStream(fx);
			zO.write(data);
			// zO.flush();
			zO.close();

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
	@SuppressWarnings("nls")
	public static void saveObject(File file, Object object_) {

		String dir = getDir(file);
		AFile.mkDirs(dir);

		try {

			FileOutputStream fos = new FileOutputStream(file);
			// GZIPOutputStream gzos = new GZIPOutputStream( fos );
			ObjectOutputStream outo = new ObjectOutputStream(fos);
			outo.useProtocolVersion(ObjectOutputStream.PROTOCOL_VERSION_1);

			outo.writeObject(object_);
			outo.flush();
			fos.close();
			return;
		} catch (IOException e) {

			// System. out.println("@@@ error: xxxx : write object to "
			// + file.getPath());

			return;
		}

	}

	public static boolean saveZipFile(String fileName, String data_) {
		return saveZipFileC(fileName, data_, Charset.defaultCharset().name());
	}

	public static boolean saveZipFileUTF8(String fileName, String data_) {
		return saveZipFileC(fileName, data_, AString.CHARSET_UTF_8);
	}

	public static boolean saveZipFileC(String fileName, String data_, String charset) {
		return saveZipFileC(null, fileName, data_, charset);
	}

	public static boolean saveZipFile(String zipFileName, String fileName, String data_) {
		return saveZipFileC(zipFileName, fileName, data_, Charset.defaultCharset().name());
	}

	public static boolean saveZipFileUTF8(String zipFileName, String fileName, String data_) {
		return saveZipFileC(zipFileName, fileName, data_, AString.CHARSET_UTF_8);
	}

	@SuppressWarnings({ "nls", "unused" })
	public static boolean saveZipFileC(String zipFileName, String fileName, String data_, String charset) {

		String dir = "";
		String file = "";

		fileName = AString.replace(fileName, "\\", "/");
		fileName = AString.replace(fileName, "//", "/");

		java.io.File f = new java.io.File(fileName);
		dir = f.getPath();
		dir = AString.replace(dir, "\\", "/");

		int pos = dir.lastIndexOf("/");
		if (pos != -1) {
			dir = dir.substring(0, pos + 1);
			f = new java.io.File(dir);
			f.mkdirs();
		} else {
			dir = "";
		}

		File fX = new File(fileName);

		String fn = fX.getName();

		byte[] data = AString.stringToByteArrayC(data_, charset);

		if (zipFileName == null) {
			zipFileName = fileName + ".zip";
		}

		try {
			ZipOutputStream zipFile = new ZipOutputStream(new FileOutputStream(zipFileName));
			ZipEntry entry = new ZipEntry(fn);

			int length = data.length;

			entry.setSize(length);

			zipFile.putNextEntry(entry);

			for (int pointer = 0;; pointer += 10000) {
				int x = length - pointer;
				if ((x) <= 10000) {
					zipFile.write(data, pointer, x);
					break;
				}
				zipFile.write(data, pointer, 10000);
			}

			zipFile.closeEntry();
			zipFile.flush();

			zipFile.close();
			// System. out.println("*** ZIP file " + zipFileName + " read.");
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
	@SuppressWarnings("nls")
	public static String slash(String dir) {

		if (!dir.endsWith("/")) {
			dir = dir + "/";
		}

		return dir;
	}

	/**
	 * Die Methode getHtmlTemplateText ausführen.
	 * 
	 * @return java.lang.String
	 * @param file
	 *            java.lang.String
	 */
	public static void unLockFile(FileInputStream fis) {

		try {
			fis.close();
		} catch (Exception e) {
			// System. out.println(e);
		}
	}

	@SuppressWarnings({ "nls", "unused" })
	public static void unZip(String zipFileName, String destinationDir) {
		final int BUFFER = 2048000;
		String name = "";
		try {
			BufferedOutputStream dest = null;
			FileInputStream fis = new FileInputStream(zipFileName);
			ZipInputStream zis = new ZipInputStream(new BufferedInputStream(fis));
			ZipEntry entry;
			while (true) {
				try {

					entry = zis.getNextEntry();
					if (entry == null) {
						break;
					}
					// System. out.println("Extracting: " + entry);
					int count;
					byte data[] = new byte[BUFFER];
					name = entry.getName();
					File entryFile = new File(name);
					if (entry.isDirectory()) {
						mkDirs(destinationDir + "/" + name);
						continue;
					}
					FileOutputStream fos = new FileOutputStream(destinationDir + "/" + name);
					dest = new BufferedOutputStream(fos, BUFFER);
					while ((count = zis.read(data, 0, BUFFER)) != -1) {
						dest.write(data, 0, count);
					}
					dest.flush();
					dest.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			zis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "nls", "rawtypes", "null" })
	static public void unZip2(String zipFileName, String destinationDir) {
		final int BUFFER = 2048;
		String name = "";
		try {
			BufferedOutputStream dest = null;
			BufferedInputStream is = null;
			ZipEntry entry;
			ZipFile zipfile = new ZipFile(zipFileName);
			Enumeration e = zipfile.entries();
			while (e.hasMoreElements()) {
				entry = (ZipEntry) e.nextElement();
				name = destinationDir + "/" + entry.getName();
				File destFile = new File(name);
				if (entry.isDirectory()) {
					mkDirs(name);
					continue;
				}
				String destFileName = AFile.getDir(destFile);
				mkDirs(destFileName);

				// System. out.println("Extracting: " + entry);
				is = new BufferedInputStream(zipfile.getInputStream(entry));
				int count;
				byte data[] = new byte[BUFFER];

				String outFileName = name; // AString.replace(name, ".project",
											// "x.project");

				for (int i = 0; i < 10; i++) {
					try {
						File fX = new File(outFileName);
						FileOutputStream fos;
						try {
							fos = new FileOutputStream(fX);
							dest = new BufferedOutputStream(fos, BUFFER);
						} catch (Exception ex) {
							ex.printStackTrace();
						}

						while ((count = is.read(data, 0, BUFFER)) != -1) {
							dest.write(data, 0, count);
						}
						dest.flush();
						dest.close();
						is.close();
						break;
					} catch (Exception ex) {
						is = new BufferedInputStream(zipfile.getInputStream(entry));
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "nls", "rawtypes" })
	static public byte[] unZipExtract(String zipFileName, String entryName) {

		zipFileName = AString.replace(zipFileName, "\\", "/");
		final int BUFFER = 2048;
		String name = "";
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		try {
			BufferedInputStream is = null;
			ZipEntry entry;
			ZipFile zipfile = new ZipFile(zipFileName);
			Enumeration e = zipfile.entries();
			while (e.hasMoreElements()) {
				entry = (ZipEntry) e.nextElement();
				name = entry.getName();
				if (name.equals(entryName)) {
					is = new BufferedInputStream(zipfile.getInputStream(entry));
					int count;
					byte data[] = new byte[BUFFER];
					while ((count = is.read(data, 0, BUFFER)) != -1) {
						bo.write(data, 0, count);
					}
					bo.flush();
					bo.close();
					is.close();
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bo.toByteArray();

	}

	@SuppressWarnings("nls")
	public static void copy(String fromFileName, String toFileName) throws IOException {
		File fromFile = new File(fromFileName);
		File toFile = new File(toFileName);

		if (!fromFile.exists())
			throw new IOException("FileCopy: " + "no such source file: " + fromFileName);
		if (!fromFile.isFile())
			throw new IOException("FileCopy: " + "can't copy directory: " + fromFileName);
		if (!fromFile.canRead())
			throw new IOException("FileCopy: " + "source file is unreadable: " + fromFileName);

		if (toFile.isDirectory())
			toFile = new File(toFile, fromFile.getName());

		if (toFile.exists()) {
			if (!toFile.canWrite())
				throw new IOException("FileCopy: " + "destination file is unwriteable: " + toFileName);
			// System. out.print("Overwrite existing file " + toFile.getName()
			// + "? (Y/N): ");
			// System. out.flush();
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String response = in.readLine();
			if (!response.equals("Y") && !response.equals("y"))
				throw new IOException("FileCopy: " + "existing file was not overwritten.");
		} else {
			String parent = toFile.getParent();
			if (parent == null)
				parent = System.getProperty("user.dir");
			File dir = new File(parent);
			if (!dir.exists())
				throw new IOException("FileCopy: " + "destination directory doesn't exist: " + parent);
			if (dir.isFile())
				throw new IOException("FileCopy: " + "destination is not a directory: " + parent);
			if (!dir.canWrite())
				throw new IOException("FileCopy: " + "destination directory is unwriteable: " + parent);
		}

		FileInputStream from = null;
		FileOutputStream to = null;
		try {
			from = new FileInputStream(fromFile);
			to = new FileOutputStream(toFile);
			byte[] buffer = new byte[4096];
			int bytesRead;

			while ((bytesRead = from.read(buffer)) != -1)
				to.write(buffer, 0, bytesRead); // write
		} finally {
			if (from != null)
				try {
					from.close();
				} catch (IOException e) {
					;
				}
			if (to != null)
				try {
					to.close();
				} catch (IOException e) {
					;
				}
		}
	}

	@SuppressWarnings({ "unused", "nls" })
	static public void zip(String outFileName, String outDir, String[] filenames) {

		byte[] buf = new byte[1024];

		try {
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFileName));
			for (int i = 0; i < filenames.length; i++) {

				File fx = new File(filenames[i]);

				/*
				 * File dir = fx.getParentFile(); if(dir!=null){ dir.mkdirs(); }
				 */

				String zipEntryName = "/" + filenames[i].substring(outDir.length(), filenames[i].length());

				if (fx.exists()) {

					if (fx.isDirectory()) {
						ZipEntry entry = new ZipEntry(filenames[i]);
						out.putNextEntry(entry);
						out.closeEntry();
					} else {
						FileInputStream in = new FileInputStream(filenames[i]);
						ZipEntry entry = new ZipEntry(filenames[i]);
						// entry.setMethod(ZipEntry.DEFLATED);
						out.putNextEntry(entry);
						int len;
						while ((len = in.read(buf)) > 0) {
							out.write(buf, 0, len);
						}
						out.closeEntry();
						in.close();
					}
				}
			}

			out.close();
		} catch (IOException e) {
		}
	}

	/**
	 * Creates a Zip archive. If the name of the file passed in is a directory,
	 * the directory's contents will be made into a Zip file.
	 */
	@SuppressWarnings("unused")
	public static void makeZip(String fileName, String zipFileName) throws IOException, FileNotFoundException {
		File file = new File(zipFileName);
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFileName));
		// Call recursion.
		File dir = new File(fileName);
		recurseFiles(fileName, zos, dir);
		// We are done adding entries to the zip archive,
		// so close the Zip output stream.
		zos.close();
	}

	/**
	 * Recurses down a directory and its subdirectories to look for files to add
	 * to the Zip. If the current file being looked at is not a directory, the
	 * method adds it to the Zip file.
	 */
	@SuppressWarnings("nls")
	private static void recurseFiles(String dir, ZipOutputStream zos, File file)
			throws IOException, FileNotFoundException {
		if (file.isDirectory()) {
			// Create an array with all of the files and subdirectories
			// of the current directory.
			String[] fileNames = file.list();
			if (fileNames != null) {
				// Recursively add each array entry to make sure that we get
				// subdirectories as well as normal files in the directory.
				for (int i = 0; i < fileNames.length; i++) {
					recurseFiles(dir, zos, new File(file, fileNames[i]));
				}
			}
		}
		// Otherwise, a file so add it as an entry to the Zip file.
		else {
			byte[] buf = new byte[1024];
			int len;
			// Create a new Zip entry with the file's name.

			// String zipEntryName = "/" + file.getName();
			String zipEntryName = file.toString();
			zipEntryName = zipEntryName.substring(dir.length(), zipEntryName.length());
			if (zipEntryName.equals(file.getName())) {
				// return;
			}
			zipEntryName = AString.replace(zipEntryName, "\\", "/");

			ZipEntry zipEntry = new ZipEntry(zipEntryName);
			// Create a buffered input stream out of the file
			// we're trying to add into the Zip archive.
			FileInputStream fin = new FileInputStream(file);
			BufferedInputStream in = new BufferedInputStream(fin);
			zos.putNextEntry(zipEntry);
			// Read bytes from the file and write into the Zip archive.
			while ((len = in.read(buf)) >= 0) {
				zos.write(buf, 0, len);
			}
			// Close the input stream.
			in.close();
			// Close this entry in the Zip stream.
			zos.closeEntry();
		}
	}

	@SuppressWarnings("nls")
	public static void unzip3(String zipName, String entryName) {
		try {
			byte[] buf = new byte[4096];

			File zipFile = new File(zipName);
			ZipInputStream in = new ZipInputStream(new FileInputStream(zipName));
			while (true) {
				// Nächsten Eintrag lesen
				ZipEntry entry = in.getNextEntry();

				if (entry == null) {
					break;
				}

				if (entry.getName().equals(entryName)) {
					// Beschreibung ausgeben
					// System. out.println(entry.getName() + " ("
					// + entry.getCompressedSize() + "/" + entry.getSize()
					// + ")");
					// Ausgabedatei erzeugen
					FileOutputStream out = new FileOutputStream(new File(zipFile.getParentFile(), entry.getName()));

					int len;
					while ((len = in.read(buf)) > 0) {
						out.write(buf, 0, len);
					}
					out.close();
					// Eintrag schließen
					in.closeEntry();
					break;
				}
			}
			in.close();
		} catch (IOException e) {
			// System. err.println(e.toString());
		}
	}

	@SuppressWarnings("nls")
	public static byte[] unzip3ToByteArray(File zipFile, String entryName) {
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] buf = new byte[4096];

			ZipInputStream in = new ZipInputStream(new FileInputStream(zipFile));
			while (true) {
				// Nächsten Eintrag lesen
				ZipEntry entry = in.getNextEntry();

				if (entry == null) {
					break;
				}

				if (entry.getName().equals(entryName)) {
					// Beschreibung ausgeben
					// System. out.println(entry.getName() + " ("
					// + entry.getCompressedSize() + "/" + entry.getSize()
					// + ")");

					int len;
					while ((len = in.read(buf)) > 0) {
						out.write(buf, 0, len);
					}
					out.close();
					// Eintrag schließen
					in.closeEntry();
					break;
				}
			}
			in.close();
			return out.toByteArray();
		} catch (IOException e) {
			// System. err.println(e.toString());
		}
		return null;
	}

}
