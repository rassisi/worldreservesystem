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

package org.eclipse.rcpl.internal.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IResource;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.images.RcplImage;
import org.eclipse.rcpl.util.JOUtil2;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javafx.scene.Parent;
import javafx.scene.image.Image;

/**
 * @author ramin
 * 
 */
public class JOUtil {

	// public static HashMap<Integer, Properties> officeProperties = new
	// HashMap<Integer, Properties>();

	// private static final Logger LOGGER =
	// LoggerFactory.getLogger(JOUtil.class);

	private static HashMap<String, FavIcon> faviconRegistry = new HashMap<String, FavIcon>();

	/**
	 * @return
	 */
	public static boolean isNoMainPage() {
		return false;
	}

	/**
	 * @return
	 */
	public static boolean isNoTabs() {

		return false;

		// if (getAbstractOfficePane() == null) {
		// return false;
		// }
		// try {
		// return getAbstractOfficePane().getContainer().isNoTabs();
		// } catch (Exception ex) {
		// return false;
		// }
	}

	public static boolean isNoUpdates() {
		return true;
		// if (JO.officePane == null) {
		// return false;
		// }
		// try {
		// return JO.officePane.getContainer().isNoUpdates();
		// } catch (Exception ex) {
		// return false;
		// }
	}

	// /**
	// * @return
	// */
	// public static boolean isNoDownloads() {
	// // try {
	// // return JO.officePane.getContainer().isNoDownloads();
	// // } catch (Exception ex) {
	// // return false;
	// // }
	//
	// return false;
	// }

	// /**
	// * @return
	// */
	// public static boolean isNoToolBar() {
	//
	// try {
	// return JO.officePane.getContainer().isNoToolBar();
	// } catch (Exception ex) {
	// return false;
	// }
	// }

	// /**
	// * @return
	// */
	// public static boolean isNoStatusBar() {
	//
	// try {
	// return JO.officePane.getContainer().isNoStatusBar();
	// } catch (Exception ex) {
	// return false;
	// }
	// }

	/**
	 * @param doc
	 * @return
	 */
	public static void saveDocumentLayout(IDocument doc) {
		// try {
		// ObjectOutputStream oo = new ObjectOutputStream(
		// new FileOutputStream(new File(doc.getFile().getParent(),
		// doc.getFile() + ".properties"))); //$NON-NLS-1$
		//
		// // for(OOXMLParagraph : doc.
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	public static final void saveImage(Image image, String fName) {
		// if (image != null && fName != null) {
		// ImageLoader loader = new ImageLoader();
		// loader.data = new ImageData[] { image.getImageData() };
		// if (fName.toLowerCase().endsWith(".png")) { //$NON-NLS-1$
		// loader.save(fName, SWT.IMAGE_PNG);
		// } else if (fName.toLowerCase().endsWith(".bmp")) { //$NON-NLS-1$
		// loader.save(fName, SWT.IMAGE_BMP);
		// } else if (fName.toLowerCase().endsWith(".gif")) { //$NON-NLS-1$
		// loader.save(fName, SWT.IMAGE_GIF);
		// } else if (fName.toLowerCase().endsWith(".ico")) { //$NON-NLS-1$
		// loader.save(fName, SWT.IMAGE_ICO);
		// } else if (fName.toLowerCase().endsWith(".jpg")) { //$NON-NLS-1$
		// loader.save(fName, SWT.IMAGE_JPEG);
		// } else if (fName.toLowerCase().endsWith(".jpeg")) { //$NON-NLS-1$
		// loader.save(fName, SWT.IMAGE_JPEG);
		// } else if (fName.toLowerCase().endsWith(".tiff")) { //$NON-NLS-1$
		// loader.save(fName, SWT.IMAGE_TIFF);
		// }
		// LOGGER.error("Unknown image type"); //$NON-NLS-1$
		// }
	}

	/**
	 * 
	 */
	public static void hideStartDialog() {
	}

	/**
	 * @param fileName
	 * @return
	 */
	public static String getFileExtension(String fileName) {
		File f = new File(fileName);
		fileName = f.getName();
		int pos = fileName.lastIndexOf("."); //$NON-NLS-1$
		if (pos != -1) {
			String ext = fileName.substring(pos + 1, fileName.length());
			return ext;
		}
		return ""; //$NON-NLS-1$
	}

	public static String getFileNameWithoutExtension(String fileName) {
		int pos = fileName.lastIndexOf("."); //$NON-NLS-1$
		if (pos != -1) {
			return fileName.substring(0, pos);
		}
		return ""; //$NON-NLS-1$
	}

	public static void startInkscape(String filePath) {
		// shutDownInskapeThread = new ShutDown();
		File inkscapeProgram = JOUtil2.getInkscapeProgram();

		File workingDir = inkscapeProgram.getAbsoluteFile().getParentFile();
		String inkScapeName = inkscapeProgram.getName();

		inkScapeName = inkscapeProgram.getAbsolutePath();

		try {
			Runtime.getRuntime().exec(new String[] { inkScapeName, filePath }, null, workingDir);// ,

			// Runtime.getRuntime().exec(inkScapeName,new String[]{"svgfile=" +
			// filePath}, //$NON-NLS-1$
			// workingDir);// ,

			// null, workingDir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Runtime rt = Runtime.getRuntime();
		// // rt.addShutdownHook(shutDownInskapeThread);
		// process = rt.exec(f.getAbsolutePath() + " " + filePath);
		// //$NON-NLS-1$
		// process.waitFor();

		//
		// while (true) {
		//
		// Display.getCurrent().readAndDispatch();
		// Thread.sleep(100);
		// try {
		// process.getInputStream().available();
		// } catch (Exception ex) {
		// }
		// }
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// ignore
		}
	}

	/**
	 * @return
	 */
	public static String getMemoryInfo() {
		return "FreeMemory " + Runtime.getRuntime().freeMemory() + "\n" //$NON-NLS-1$
				+ "TotalHeapSize " + Runtime.getRuntime().maxMemory() + "\n" //$NON-NLS-1$
				+ "CurrentHeapSize " + Runtime.getRuntime().totalMemory();
	}

	/**
	 * @param w
	 * @param h
	 * @return
	 */
	public static double getPythagoras(double w, double h) {
		return Math.sqrt(w * w + h * h);
	}

	/**
	 * @param x
	 * @param y
	 * @param xm
	 * @param ym
	 * @return
	 */
	public static double calculateAngle(double x, double y, double xm, double ym) {
		double dx = Math.abs(x - xm);
		double dy = Math.abs(y - ym);
		double r = JOUtil.getPythagoras(dx, dy);
		double umfang = 2 * Math.PI;
		double winkel = 0.0;
		switch (getQuadrant(xm, ym, x, y)) {

		case 1:
			winkel = Math.acos(dy / r) / umfang * 360;
			break;
		case 2:
			winkel = Math.asin(dy / r) / umfang * 360 + 90;
			break;
		case 3:
			winkel = Math.acos(dy / r) / umfang * 360 + 180;
			break;
		case 4:
			winkel = Math.asin(dy / r) / umfang * 360 + 270;
			break;
		}
		return winkel;
	}

	public static double calculateRealAngle(double x, double y, double xm, double ym) {
		double dx = Math.abs(x - xm);
		double dy = Math.abs(y - ym);
		double r = JOUtil.getPythagoras(dx, dy);
		double umfang = 2 * Math.PI;
		double winkel = 0.0;
		switch (getQuadrant(xm, ym, x, y)) {
		case 1:
			winkel = Math.acos(dy / r) / umfang * 360;
			break;
		case 2:
			winkel = Math.acos(dy / r) / umfang * 360 - 90;
			break;
		case 3:
			winkel = Math.asin(dy / r) / umfang * 360 + 180;
			break;
		case 4:
			winkel = Math.acos(dy / r) / umfang * 360 - 270;
			break;
		}
		return winkel;
	}

	/**
	 * @param xm
	 * @param ym
	 * @param x
	 * @param y
	 * @return
	 */
	public static int getQuadrant(double xm, double ym, double x, double y) {
		int quadrant = 0;
		if (x >= xm && y < ym) {
			quadrant = 1;
		} else if (x > xm && y >= ym) {
			quadrant = 2;
		} else if (x <= xm && y < ym) {
			quadrant = 4;
		} else if (x < xm && y >= ym) {
			quadrant = 3;
		} else {
			quadrant = 3;
		}

		return quadrant;

	}

	/**
	 * @param xm
	 * @param ym
	 * @param r
	 * @param angle
	 * @return
	 */
	public static double[] calculateCoordinates(double xm, double ym, double r, double angle) {
		double[] result = new double[2];
		result[0] = Math.sin(2 * Math.PI * (angle / 360.0)) * r + xm;
		result[1] = -Math.cos(2 * Math.PI * (angle / 360.0)) * r + ym;
		return result;
	}

	/**
	 * @param xm
	 * @param ym
	 * @param x1
	 * @param y1
	 * @param degree
	 * @return
	 */
	public static double[] calculateRotation(double xm, double ym, double x, double y, double rotation) {
		double[] result = new double[2];
		double dx = x - xm;
		double dy = y - ym;
		double r = JOUtil.getPythagoras(dx, dy);

		double startAngle = calculateAngle(x, y, xm, ym);

		double newRotation = startAngle + rotation;
		if (newRotation >= 360) {
			newRotation -= 360;
		}

		result = calculateCoordinates(xm, ym, r, newRotation);
		return result;
	}

	/**
	 * @param xm
	 * @param ym
	 * @param x
	 * @param y
	 * @param rotation
	 * @return
	 */
	public static double recalculateRotation(double xm, double ym, double x, double y, double rotation) {
		double result = rotation;

		switch (getQuadrant(xm, ym, x, y)) {
		case 1:
			result = Math.abs(90 - rotation);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}

		return result;
	}

	// /**
	// * @param args
	// */
	// public static void main(String[] args) {
	//
	// double i = 151.0;
	//
	// double[] coordinates = calculateCoordinates(0, 0, 100, 45);
	// double x = coordinates[0];
	// double y = coordinates[1];
	//
	// // System. out
	// // .("Quadrant for " + 90 + " = " + getQuadrant(0, 0, x, y));
	// //$NON-NLS-1$ //$NON-NLS-2$
	//
	// for (i = 0; i < 360; i += 1) {
	//
	// coordinates = calculateCoordinates(0, 0, 100, i);
	// x = coordinates[0];
	// y = coordinates[1];
	//
	// double angle = calculateAngle(x, y, 0, 0);
	//
	// // System. out.("Quadrant for " + i + " = "
	// // + getQuadrant(0, 0, x, y) + " angle = " + angle);
	//
	// }
	//
	// }

	/**
	 * @param value
	 * @return
	 */
	public static String getBooleanString(boolean value) {
		return value ? "1" : "0"; //$NON-NLS-1$//$NON-NLS-2$
	}

	/**
	 * @param value
	 * @return
	 */
	public static boolean stringToBoolean(String value) {
		return value.equals("1") ? true : false; //$NON-NLS-1$
	}

	/**
	 * @param value
	 * @return
	 */
	public static int stringToInteger(String value) {
		try {
			return Integer.valueOf(value);
		} catch (Exception ex) {

		}
		return 0;
	}

	// /**
	// * @param s
	// * @param font
	// * @return
	// */
	// public static Point getTextExtent(String s, IFont font) {
	// Point result;
	// GC gc;
	// Shell shell = null;
	// if (JO.officePane != null) {
	// gc = new GC((Drawable) JO.officePane);
	// } else {
	// shell = new Shell();
	// gc = new GC(shell);
	//
	// }
	// if (font != null) {
	// gc.setFont((Font) font.getSwt());
	// }
	// result = gc.textExtent(s);
	// gc.dispose();
	// if (shell != null) {
	// shell.dispose();
	// }
	// return result;
	// }

	// /**
	// * @param s
	// * @param font
	// * @return
	// */
	// public static Point getTextExtent(String s, Font font) {
	// Point result;
	// GC gc;
	// Shell shell = null;
	// if (JO.officePane != null) {
	// gc = new GC((Drawable) JO.officePane);
	// } else {
	// shell = new Shell();
	// gc = new GC(shell);
	//
	// }
	// if (font != null) {
	// gc.setFont((Font) font);
	// }
	// result = gc.textExtent(s);
	// gc.dispose();
	// if (shell != null) {
	// shell.dispose();
	// }
	// return result;
	// }

	public static int[] createCirclePolygon(int r, int offsetX, int offsetY) {
		int f1 = 8;
		int[] polygon = new int[f1 * r + f1 / 2];
		for (int i = 0; i < 2 * r + 1; i++) {
			int x = i - r;
			int y = (int) Math.sqrt(r * r - x * x);
			polygon[2 * i] = offsetX + x;
			polygon[2 * i + 1] = offsetY + y;
			polygon[f1 * r - 2 * i - 2] = offsetX + x;
			polygon[f1 * r - 2 * i - 1] = offsetY - y;
		}
		return polygon;
	}

	/**
	 * @param var
	 * @param replacement
	 */
	public static String replaceTemplateVariable(String buf, String var, String replacement) {
		int pos = 0;
		while (true) {
			String key = Rcpl.JO_TEMPLATE_VAR + var;
			pos = buf.indexOf(key, pos);
			if (pos == -1) {
				break;
			}
			buf = buf.substring(0, pos) + replacement + buf.substring(pos + key.length(), buf.length());

		}
		return buf;
	}

	private static String actualMajorVersion = null;

	private static String actualMinorVersion = null;

	private static String actualPatchVersion = null;

	@SuppressWarnings("unused")
	private static String getActualMajorVersion() {
		if (actualMajorVersion == null) {
			loadActualVersion();
		}
		return actualMajorVersion;
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unused")
	private static String getActualMinorVersion() {
		if (actualMinorVersion == null) {
			loadActualVersion();
		}
		return actualMinorVersion;
	}

	/**
	 * @return
	 */
	private static String getActualPatchVersion() {
		if (actualPatchVersion == null) {
			loadActualVersion();
		}
		return actualPatchVersion;
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unused")
	private static String getActualPatchVersion1() {
		String s = getActualPatchVersion();
		String[] splits = s.split(" "); //$NON-NLS-1$
		return splits[0];
	}

	/**
	 * @return new version, otherwise null
	 */
	public static String versionChanged() {
		// try {
		// String activationString = JOActivation
		// .getDownloadString(JOActivation.ACTIVATION_JOFFICE_SUBSCRIPTION);
		//
		// String url = JO.WEB_HOME + "/" + activationString //$NON-NLS-1$
		// + "/version.properties"; //$NON-NLS-1$
		// //
		// JOSession.codeBase +
		// "/downloads/87da3e54906a2dde3b31371cfa46e94e/version.properties
		//
		// //
		// JOSession.codeBase +
		// "/87da3e54906a2dde3b31371cfa46e94e/version.properties;
		//
		// File versionPropertyFile = JOResourceList.download(url, true,
		// false, false, 1, null, null);
		// if (versionPropertyFile != null) {
		//
		// Properties props = new Properties();
		// FileInputStream fis;
		// try {
		// fis = new FileInputStream(versionPropertyFile);
		// props.load(fis);
		// String major = props.getProperty("major"); //$NON-NLS-1$
		// String minor = props.getProperty("minor"); //$NON-NLS-1$
		// String patch = props.getProperty("patch"); //$NON-NLS-1$
		// JOActivation.manualActivationCode = props
		// .getProperty("activation"); //$NON-NLS-1$
		// String force_older_than_major = props
		// .getProperty("force_older_than_major"); //$NON-NLS-1$
		// String force_older_than_minor = props
		// .getProperty("force_older_than_minor"); //$NON-NLS-1$
		// String force_older_than_patch = props
		// .getProperty("force_older_than_patch"); //$NON-NLS-1$
		//
		// if (!JOUiConfig.MAJOR_VERSION.equals(major)
		// || !JOUiConfig.MINOR_VERSION.equals(minor)
		// || !JOUiConfig.PATCH_VERSION.equals(patch)) {
		// fis.close();
		// calculateActivations(props);
		// return major
		// + "." + minor + "." + patch + "," + force_older_than_major + "." +
		// force_older_than_minor + "." + force_older_than_patch;
		// //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
		// }
		// fis.close();
		// calculateActivations(props);
		// } catch (FileNotFoundException e) {
		// } catch (IOException e) {
		// }
		// }
		// } catch (Exception ex) {
		// // ignore
		// }
		return null;
	}

	/**
	 * @param props
	 */
	private static void calculateActivations(Properties props) {
		// String email = JOUtil2
		// .getDefaultString("infotab/actions/editor/user_e_mail");
		// //$NON-NLS-1$
		// if (email != null && email.length() > 0) {
		// for (int i = 1;; i++) {
		// String subsription = props.getProperty("subscription_" + i);
		// //$NON-NLS-1$
		// if (subsription == null) {
		// break;
		// }
		// if (email.equals(subsription)) {
		// JOActivation
		// .activate(
		// JOActivation.ACTIVATION_JOFFICE_SUBSCRIPTION,
		// false);
		// break;
		// }
		// }
		// }

	}

	/**
	 * 
	 */
	private static void loadActualVersion() {
		// String activationString = JOActivation
		// .getDownloadString(JOActivation.ACTIVATION_JOFFICE_SUBSCRIPTION);
		// File versionPropertyFile = JOResourceList
		// .download(
		// JO.WEB_HOME
		// + "/" + activationString + "/version.properties", true, false, false,
		// 1, null, null); //$NON-NLS-1$//$NON-NLS-2$
		// if (versionPropertyFile != null) {
		//
		// Properties props = new Properties();
		// FileInputStream fis;
		// try {
		// fis = new FileInputStream(versionPropertyFile);
		// props.load(fis);
		// actualMajorVersion = props.getProperty("major"); //$NON-NLS-1$
		// actualMinorVersion = props.getProperty("minor"); //$NON-NLS-1$
		// actualPatchVersion = props.getProperty("patch"); //$NON-NLS-1$
		// fis.close();
		// } catch (FileNotFoundException e) {
		// } catch (IOException e) {
		// }
		// }

	}

	// /**
	// * @param image
	// * @param angle
	// * @return
	// */
	// public static Image rotate(Image image, int angle) {
	// BufferedImage img = convertToAWT(image.getImageData());
	// int w = img.getWidth();
	// int h = img.getHeight();
	// BufferedImage dimg = new BufferedImage(w, h, img.getType());
	// Graphics2D g = dimg.createGraphics();
	// g.rotate(Math.toRadians(angle), w / 2, h / 2);
	// g.drawImage(img, null, 0, 0);
	// image.dispose();
	// Image newImage = JOUtil2.createImage(convertToSWT(img));
	//
	// // showImage("", newImage);
	//
	// return newImage;
	// }

	// public static void playClickSoundEnter() {
	// boolean soundOnClicks = JOUtil2
	// .getBoolean("infotab/actions/editor/sound_on_clicks"); //$NON-NLS-1$
	// if (soundOnClicks) {
	// playTemplateClip(Rcpl.SOUND_CLAVES, -50f);
	// }
	// }
	//
	// public static void playClickSoundClick() {
	// boolean soundOnClicks = JOUtil2
	// .getBoolean("infotab/actions/editor/sound_on_clicks"); //$NON-NLS-1$
	// if (soundOnClicks) {
	// playTemplateClip(Rcpl.SOUND_CLAVES, -40f);
	// }
	// }

	// /**
	// * @param name
	// */
	// public static void playTemplateClip(String name, float volume) {
	// InputStream is = RcplResourcesPlugin.class
	// .getResourceAsStream("/com/joffice/sound/" + name + ".wav");
	// //$NON-NLS-1$ //$NON-NLS-2$
	// playClip(is, volume);
	// }

	/**
	 * @param is
	 */
	public static void playClip(InputStream is, float volume) {
		AudioInputStream sound;
		try {
			sound = AudioSystem.getAudioInputStream(is);
			DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
			Clip clip = (Clip) AudioSystem.getLine(info);
			clip.open(sound);
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(volume);
			clip.start();
			clip.addLineListener(new LineListener() {
				@Override
				public void update(LineEvent event) {
					if (event.getType() == LineEvent.Type.STOP) {
						event.getLine().close();
					}
				}
			});
		} catch (UnsupportedAudioFileException e) {
		} catch (IOException e) {
		} catch (LineUnavailableException e) {
		}

		// play the sound clip

	}

	public static void embeddWindowsApplication() {

		// HWND myWindow; //Handle to my application window
		// HWND externalWindow; //Handle to external application window
		//
		// SetParent(myWindow,externalWindow);
		//
		// //Remove WS_POPUP style and add WS_CHILD style
		// DWORD style = GetWindowLong(myWindow,GWL_STYLE);
		// style = style & ~(WS_POPUP);
		// style = style | WS_CHILD;
		// SetWindowLong(myWindow,GWL_STYLE,style);

		// To fix the issue with the main app losing focus you need to use the
		// AttachThreadInput function to attach the embedded window thread to
		// the main app thread.
		// Also, one can use the TranslateAccelerator function in response to
		// WM_KEYDOWN messages to ensure accelerator messages of the main app
		// are triggered.
	}

	// /**
	// * @param image
	// * @param style
	// * @return
	// */
	// public static Image createImage(Image image, int style) {
	// Image image2 = new Image(null, image, style);
	// JOUtil2.imageHandles++;
	// return image2;
	// }
	//
	// public static Image createImage(ImageData data) {
	// Image image = new Image(null, data);
	// JOUtil2.imageHandles++;
	// return image;
	// }

	// public static Image createImage(int width, int height) {
	// try {
	// Image image = new Image(null, width, height);
	// JOUtil2.imageHandles++;
	// return image;
	// } catch (Exception ex) {
	// LOGGER.debug("", ex); //$NON-NLS-1$
	// }
	// return null;
	// }

	// /**
	// * @param fName
	// * @return
	// */
	// public static IImage<Image, javafx.scene.image.Image> createImage(
	// String fName) {
	// try {
	//
	// JOImage image = new JOImage(new Image(null, fName), null);
	// imageHandles++;
	// return image;
	// } catch (Exception ex) {
	// LOGGER.error("", ex); //$NON-NLS-1$
	// }
	// return null;
	// }

	/**
	 * @param fName
	 * @return
	 */
	// public static IImage createImage(String fName) {
	// try {
	// JOImage image = new JOImage(new FileInputStream(fName));
	// JOUtil2.imageHandles++;
	// return image;
	// } catch (Exception ex) {
	// LOGGER.error("", ex); //$NON-NLS-1$
	// }
	// return null;
	// }

	/**
	 * @param resource
	 */
	public static void disposeResource(IResource resource) {

		// if (resource.getImage() != null && resource.getImage().get() != null)
		// {
		// if (resource.getImage().get() instanceof Resource) {
		//
		// try {
		// if (resource != null
		// && !resource.getImage().get().isDisposed()) {
		// JOUtil2.imageHandles--;
		// resource.getImage().get().dispose();
		// }
		// } catch (Exception ex) {
		// LOGGER.error("", ex); //$NON-NLS-1$
		// }
		// }
		// }
	}

	/**
	 * @param resource
	 */
	public static void disposeResource(RcplImage resource) {

		// if (resource != null) {
		// if (resource.get() instanceof Resource) {
		//
		// try {
		// if (resource != null && !resource.get().isDisposed()) {
		// JOUtil2.imageHandles--;
		// resource.get().dispose();
		// }
		// } catch (Exception ex) {
		// LOGGER.error("", ex); //$NON-NLS-1$
		// }
		// }
		// }
	}

	/**
	 * @param loc
	 * @return
	 */
	public static Image loadFavIcon(String loc0) {
		// if (loc0 == null) {
		// return null;
		// }
		// Image favicon = null;
		// String hostString = getUrlDisplayName(loc0);
		//
		// if (JOUtil.isNoDownloads()) {
		// favicon = JO.getResources().getImage("webbrowser").get();
		// //$NON-NLS-1$
		// FavIcon fav = new FavIcon();
		// fav.loaded = false;
		// fav.image = favicon;
		// faviconRegistry.put(hostString, fav);
		// JO.profileEnd();
		// return favicon;
		// }
		// FavIcon fav = faviconRegistry.get(hostString);
		// if (fav != null && fav.loaded) {
		// return fav.image;
		// }
		// String loc = null;
		// JO.profile("loadFacIcon"); //$NON-NLS-1$
		// try {
		// if (!loc0.startsWith("http://") && !loc0.startsWith("https://")) {
		// //$NON-NLS-1$ //$NON-NLS-2$
		// loc0 = "http://" + loc0; //$NON-NLS-1$
		// }
		// URL url = new URL(loc0);
		// loc = url.getProtocol() + "://" + getDomain(url.getHost());
		// //$NON-NLS-1$
		// } catch (Exception ex) {
		// return null;
		// }
		//
		// File f = null;
		//
		// try {
		// f = JOResourceList.download(loc + "/favicon.ico", //$NON-NLS-1$
		// false, false, false, 0, "images/webbrowser", null); //$NON-NLS-1$
		// if (f != null) {
		// try {
		// favicon = new Image(null, f.getAbsolutePath());
		// Rectangle r = favicon.getBounds();
		// if (r.width != 16 || r.height != 16) {
		// Image image16 = copyImage(favicon, 16, 16);
		// fav = new FavIcon();
		// fav.loaded = true;
		// fav.imageOriginal = favicon;
		// fav.image = image16;
		// faviconRegistry.put(hostString, fav);
		// return image16;
		// }
		// fav = new FavIcon();
		// fav.loaded = true;
		// fav.image = favicon;
		// faviconRegistry.put(hostString, fav);
		// JO.profileEnd();
		// return favicon;
		// } catch (Exception ex) {
		// f.delete();
		// }
		// }
		// } catch (Exception ex) {
		// if (favicon != null && !favicon.isDisposed()) {
		// favicon.dispose();
		// favicon = null;
		// }
		// }
		// if (f != null) {
		// JOResourceList.saveDefaultImage(f, "images/webbrowser");
		// //$NON-NLS-1$
		// }
		// favicon = JOSWT.getResources().getImage("images/webbrowser").get();
		// //$NON-NLS-1$
		// fav = new FavIcon();
		// fav.loaded = false;
		// fav.image = favicon;
		// faviconRegistry.put(hostString, fav);
		// JO.profileEnd();
		// return favicon;

		return null;
	}

	public static String getDomainFromUrl(String url) {
		try {
			if (!url.startsWith("http://") && !url.startsWith("https://")) { //$NON-NLS-1$ //$NON-NLS-2$
				url = "http://" + url; //$NON-NLS-1$
			}
			URL url2 = new URL(url);
			return getDomain(url2.getHost());

		} catch (Exception ex) {
		}
		return url;
	}

	/**
	 * @param host
	 * @return
	 */
	public static String getDomain(String host) {
		String[] splits = host.split("\\."); //$NON-NLS-1$
		if (splits.length < 3) {
			return host;
		}
		String domain = splits[splits.length - 2] + "." + splits[splits.length - 1]; //$NON-NLS-1$
		if (host.endsWith("co.uk")) { //$NON-NLS-1$
			domain = splits[splits.length - 3] + "." + domain; //$NON-NLS-1$
		} else if (splits[splits.length - 2].equals("gov")) { //$NON-NLS-1$
			domain = splits[splits.length - 3] + "." + domain; //$NON-NLS-1$
		} else if (splits[splits.length - 2].equals("edu")) { //$NON-NLS-1$
			domain = splits[splits.length - 3] + "." + domain; //$NON-NLS-1$
		} else if (splits[splits.length - 2].equals("mil")) { //$NON-NLS-1$
			domain = splits[splits.length - 3] + "." + domain; //$NON-NLS-1$
		}
		return domain;
	}

	/**
	 * @param host
	 * @return
	 */
	public static String getLastSegmentOfDomainName(String url) {
		String domain = getDomainFromUrl(url);
		String[] splits = domain.split("\\."); //$NON-NLS-1$
		return splits[splits.length - 1];
	}

	/**
	 * @param host
	 * @return
	 */
	public static javafx.scene.image.Image getDomainImage(String host) {
		String[] splits = host.split("\\."); //$NON-NLS-1$
		String countryDomain = splits[splits.length - 1];

		Image image = null;
		// IResource res = Rcpl.resources().getResource("domain_" +
		// countryDomain); //$NON-NLS-1$
		// if (res != null) {
		// image = res.getImage().getFx();
		// }
		// if (image == null) {
		// image = Rcpl.resources().getImage("webbrowser").getFx();
		// //$NON-NLS-1$
		//
		// }
		return image;
	}

	// /**
	// * @param text
	// */
	// public static void setSplashText(String text, boolean log) {
	// if (text.length() > 40) {
	// text = "..." + text.substring(text.length() - 40, text.length());
	// //$NON-NLS-1$
	// }
	// JO.officePane.getContainer().setSplashText(text);
	// if (log) {
	// LOGGER.info(text);
	// }
	// }

	/**
	 * @param url
	 * @return
	 */
	public static String getUrlDisplayName(String url) {
		if (url == null) {
			return null;
		}
		if (!url.startsWith("http://") && !url.startsWith("https://")) { //$NON-NLS-1$ //$NON-NLS-2$
			url = "http://" + url; //$NON-NLS-1$
		}
		try {
			URL u = new URL(url);
			return u.getHost();
		} catch (MalformedURLException e) {
		}
		if (url.startsWith("http://")) { //$NON-NLS-1$
			url = url.substring(7, url.length());
		}
		if (url.startsWith("https://")) { //$NON-NLS-1$
			url = url.substring(8, url.length());
		}
		return url;
	}

	private static HashMap<String, String> htmlEntities;

	static {
		htmlEntities = new HashMap<String, String>();
		htmlEntities.put("&lt;", "<"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&gt;", ">"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&amp;", "&"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&quot;", "\""); //$NON-NLS-1$ //$NON-NLS-2$

		htmlEntities.put("&agrave;", "�"); //$NON-NLS-1$//$NON-NLS-2$
		htmlEntities.put("&Agrave;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&acirc;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&auml;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Auml;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Acirc;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&aring;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Aring;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&aelig;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&AElig;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&ccedil;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Ccedil;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&eacute;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Eacute;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Egrave;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&ecirc;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Ecirc;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&euml;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Euml;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&iuml;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&ocirc;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Ocirc;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&ouml;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Ouml;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&oslash;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Oslash;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&szlig;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&ugrave;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Ugrave;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&ucirc;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Ucirc;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&uuml;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&Uuml;", "�"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&nbsp;", " "); //$NON-NLS-1$ //$NON-NLS-2$

		htmlEntities.put("&copy;", "\u00a9"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&reg;", "\u00ae"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("&euro;", "\u20a0"); //$NON-NLS-1$ //$NON-NLS-2$
		htmlEntities.put("%20", " "); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/*
	 * Here the original recursive version. It is fine unless you pass a big
	 * string then a Stack Overflow is possible :-(
	 * 
	 * 
	 * public static final String unescapeHTML(String source, int start){ int
	 * i,j;
	 * 
	 * i = source.indexOf("&", start); if (i > -1) { j = source.indexOf(";" ,i);
	 * if (j > i) { String entityToLookFor = source.substring(i , j + 1); String
	 * value = (String)htmlEntities.get(entityToLookFor); if (value != null) {
	 * source = new StringBuffer().append(source.substring(0 , i))
	 * .append(value) .append(source.substring(j + 1)) .toString(); return
	 * unescapeHTML(source, i + 1); // recursive call } } } return source; }
	 * 
	 * M. McNeely Jr. has sent a version with do...while()loop which is more
	 * robust. Thanks to him!
	 */

	public static final String unescapeHTML(String source) {
		int i, j;

		boolean continueLoop;
		int skip = 0;
		do {
			continueLoop = false;
			i = source.indexOf("&", skip); //$NON-NLS-1$
			if (i > -1) {
				j = source.indexOf(";", i); //$NON-NLS-1$
				if (j > i) {
					String entityToLookFor = source.substring(i, j + 1);
					String value = htmlEntities.get(entityToLookFor);
					if (value != null) {
						source = source.substring(0, i) + value + source.substring(j + 1);
						continueLoop = true;
					} else {
						skip = i + 1;
						continueLoop = true;
					}
				}
			}
		} while (continueLoop);

		if (source.indexOf("%20") != -1) { //$NON-NLS-1$
			source = source.replaceAll("%20", " "); //$NON-NLS-1$//$NON-NLS-2$
		}

		return source;
	}

	/**
	 * @param key
	 */
	public static void showGroup(String key) {
		showGroup(key, -1);
	}

	/**
	 * @param key
	 */
	public static void showGroup(String key, int shelfIndex) {
		// JO.service.getGroupButtonService().selectGroup(key, shelfIndex,
		// true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// manueller activation code

		// String code = "XGH7-L8S5-FEC8-BUX5";
		// String s1 = createMD5("XGH7-L8S5-FEC8- BUX5", true);
		// System. out.(s1);

		// JOActivation.deActivate(JOActivation.ACTIVATION_JOFFICE_SUBSCRIPTION,
		// false);
	}

	/**
	 * @param key2
	 * @return
	 */
	public static String getImageResourceName(String key2) {
		int pos = key2.lastIndexOf("/"); //$NON-NLS-1$
		if (pos != -1) {
			return "images" + key2.substring(pos, key2.length()); //$NON-NLS-1$
		}
		return "images" + key2; //$NON-NLS-1$

	}

	/**
	 * @param s
	 * @param delimiter
	 * @return
	 */
	public static String getLastSegment(String s, String delimiter) {
		int pos = s.lastIndexOf(delimiter);
		if (pos != -1) {
			return s.substring(pos + 1, s.length());
		}
		return s;

	}

	private static String titleSpaceString;

	public static boolean isEclipse() {
		return false;
	}

	public static boolean isOnlyBrowser() {
		return false;
	}

	public static Node getNode(String tagName, NodeList nodes) {
		for (int x = 0; x < nodes.getLength(); x++) {
			Node node = nodes.item(x);
			if (node.getNodeName().equalsIgnoreCase(tagName)) {
				return node;
			}
		}

		return null;
	}

	public static String getNodeValue(Node node) {
		NodeList childNodes = node.getChildNodes();
		for (int x = 0; x < childNodes.getLength(); x++) {
			Node data = childNodes.item(x);
			if (data.getNodeType() == Node.TEXT_NODE)
				return data.getNodeValue();
		}
		return "";
	}

	public static void setNodeValue(Node node, String value) {
		NodeList childNodes = node.getChildNodes();
		for (int x = 0; x < childNodes.getLength(); x++) {
			Node data = childNodes.item(x);
			if (data.getNodeType() == Node.TEXT_NODE)
				data.setNodeValue(value);
		}
	}

	public static String getNodeValue(String tagName, NodeList nodes) {
		for (int x = 0; x < nodes.getLength(); x++) {
			Node node = nodes.item(x);
			if (node.getNodeName().equalsIgnoreCase(tagName)) {
				NodeList childNodes = node.getChildNodes();
				for (int y = 0; y < childNodes.getLength(); y++) {
					Node data = childNodes.item(y);
					if (data.getNodeType() == Node.TEXT_NODE)
						return data.getNodeValue();
				}
			}
		}
		return "";
	}

	public static String getNodeAttr(String attrName, Node node) {
		NamedNodeMap attrs = node.getAttributes();
		for (int y = 0; y < attrs.getLength(); y++) {
			Node attr = attrs.item(y);
			if (attr.getNodeName().equalsIgnoreCase(attrName)) {
				return attr.getNodeValue();
			}
		}
		return "";
	}

	public static String getNodeAttr(String tagName, String attrName, NodeList nodes) {
		for (int x = 0; x < nodes.getLength(); x++) {
			Node node = nodes.item(x);
			if (node.getNodeName().equalsIgnoreCase(tagName)) {
				NodeList childNodes = node.getChildNodes();
				for (int y = 0; y < childNodes.getLength(); y++) {
					Node data = childNodes.item(y);
					if (data.getNodeType() == Node.ATTRIBUTE_NODE) {
						if (data.getNodeName().equalsIgnoreCase(attrName))
							return data.getNodeValue();
					}
				}
			}
		}

		return "";
	}

	public static Node findNode(Node node, String tag) {

		NodeList nodes = node.getChildNodes();
		String name = node.getNodeName();
		if (tag.equals(name)) {
			return node;
		}

		if (nodes != null) {
			for (int x = 0; x < nodes.getLength(); x++) {
				Node n2 = nodes.item(x);
				Node res = findNode(n2, tag);
				if (res != null) {
					return res;
				}
			}
		}
		return null;
	}

	public static HashMap<String, String> parseNode(Node node) {
		HashMap<String, String> result = new HashMap<String, String>();
		StringBuffer path = new StringBuffer();
		path.append("/" + node.getNodeName());
		return parseNode(result, path, node);
	}

	private static HashMap<String, String> parseNode(HashMap<String, String> result, StringBuffer path, Node node) {

		String name = node.getNodeName();
		// String value = getNodeValue(node);
		// System. out.("n: " + name + " v: " + value);

		NamedNodeMap map = node.getAttributes();
		if (map != null) {
			for (int i = 0; i < map.getLength(); i++) {
				org.w3c.dom.Node n = map.item(i);

				String attributeName = path.toString() + "/" + n.getNodeName();
				String attributeValue = getNodeValue(n);

				// System. out.("attributeName: " + attributeName
				// + " attributeValue: " + attributeValue);

				// if
				// ("/a:graphicData/pic:pic/pic:nvPicPr/pic:cNvPr/pic:cNvPicPr/a:picLocks/pic:blipFill/a:blip/r:embed"
				// .equals(attributeName)) {
				//
				// setNodeValue(n, "rId7");
				// // System. out.();
				//
				// }

				result.put(attributeName, attributeValue);
			}
		}

		NodeList nodes = node.getChildNodes();
		if (nodes != null) {
			for (int x = 0; x < nodes.getLength(); x++) {
				Node n2 = nodes.item(x);
				path.append("/" + n2.getNodeName());
				parseNode(result, path, n2);
			}
		}

		return result;
	}

	// /**
	// * @return
	// */
	// public static JOEditorFigure getEditor() {
	// try {
	// if (JO.officePane != null) {
	// return (JOEditorFigure) JO.officePane.getEditor();
	// }
	// } catch (Exception ex) {
	//
	// }
	// return null;
	// }

	// /**
	// * @return
	// */
	// public static IDocument getDocument() {
	// IEditor ef = getEditor();
	// if (ef != null) {
	// return ef.getDocument();
	// }
	// return null;
	// }

	// /**
	// * @return
	// */
	// public static boolean isNoMainPage() {
	// return false;
	// }

	// /**
	// * @return
	// */
	// public static boolean isNoTabs() {
	//
	// return false;
	//
	// // if (getAbstractOfficePane() == null) {
	// // return false;
	// // }
	// // try {
	// // return getAbstractOfficePane().getContainer().isNoTabs();
	// // } catch (Exception ex) {
	// // return false;
	// // }
	// }
	//
	// public static boolean isNoUpdates() {
	// return true;
	// // if (JO.officePane == null) {
	// // return false;
	// // }
	// // try {
	// // return JO.officePane.getContainer().isNoUpdates();
	// // } catch (Exception ex) {
	// // return false;
	// // }
	// }
	//
	// /**
	// * @return
	// */
	// public static boolean isNoDownloads() {
	// try {
	// return JO.officePane.getContainer().isNoDownloads();
	// } catch (Exception ex) {
	// return false;
	// }
	// }
	//
	// /**
	// * @return
	// */
	// public static boolean isNoToolBar() {
	//
	// try {
	// return JO.officePane.getContainer().isNoToolBar();
	// } catch (Exception ex) {
	// return false;
	// }
	// }
	//
	// /**
	// * @return
	// */
	// public static boolean isNoStatusBar() {
	//
	// try {
	// return JO.officePane.getContainer().isNoStatusBar();
	// } catch (Exception ex) {
	// return false;
	// }
	// }

	// /**
	// * @return
	// */
	// public static boolean isOnlyOffice() {
	//
	// try {
	// return JO.officePane.getContainer().isOnlyOffice();
	// } catch (Exception ex) {
	// return false;
	// }
	// }

	// /**
	// * @return
	// */
	// public static Shell getShell() {
	// Shell shell = ((Composite) JO.officePane).getShell();
	// if (shell != null) {
	// return shell;
	// }
	// return new Shell();
	// }

	// /**
	// * @return
	// */
	// public static Display getDisplay() {
	// Display display = Display.getCurrent();
	// return display != null ? display : Display.getDefault();
	// }
	//
	// /**
	// * @return
	// */
	// public static Shell getDefaultShell() {
	// Shell shell = null;
	//
	// try {
	// shell = Display.getDefault().getActiveShell();
	// } catch (Exception e) {
	// // ignore
	// }
	//
	// return shell;
	// }
	//
	// public static void clearEventLoop() {
	// while (getDisplay().readAndDispatch())
	// ;
	// }

	// /**
	// * @param doc
	// * @return
	// */
	// public static void saveDocumentLayout(IDocument doc) {
	// // try {
	// // ObjectOutputStream oo = new ObjectOutputStream(
	// // new FileOutputStream(new File(doc.getFile().getParent(),
	// // doc.getFile() + ".properties"))); //$NON-NLS-1$
	// //
	// // // for(OOXMLParagraph : doc.
	// // } catch (FileNotFoundException e) {
	// // // TODO Auto-generated catch block
	// // e.printStackTrace();
	// // } catch (IOException e) {
	// // // TODO Auto-generated catch block
	// // e.printStackTrace();
	// // }
	// }
	//
	// public static final void saveImage(Image image, String fName) {
	// if (image != null && fName != null) {
	// ImageLoader loader = new ImageLoader();
	// loader.data = new ImageData[] { image.getImageData() };
	// if (fName.toLowerCase().endsWith(".png")) { //$NON-NLS-1$
	// loader.save(fName, SWT.IMAGE_PNG);
	// } else if (fName.toLowerCase().endsWith(".bmp")) { //$NON-NLS-1$
	// loader.save(fName, SWT.IMAGE_BMP);
	// } else if (fName.toLowerCase().endsWith(".gif")) { //$NON-NLS-1$
	// loader.save(fName, SWT.IMAGE_GIF);
	// } else if (fName.toLowerCase().endsWith(".ico")) { //$NON-NLS-1$
	// loader.save(fName, SWT.IMAGE_ICO);
	// } else if (fName.toLowerCase().endsWith(".jpg")) { //$NON-NLS-1$
	// loader.save(fName, SWT.IMAGE_JPEG);
	// } else if (fName.toLowerCase().endsWith(".jpeg")) { //$NON-NLS-1$
	// loader.save(fName, SWT.IMAGE_JPEG);
	// } else if (fName.toLowerCase().endsWith(".tiff")) { //$NON-NLS-1$
	// loader.save(fName, SWT.IMAGE_TIFF);
	// }
	// LOGGER.error("Unknown image type"); //$NON-NLS-1$
	// }
	// }
	//
	// /**
	// *
	// */
	// public static void hideStartDialog() {
	// }
	//
	// /**
	// * @param fileName
	// * @return
	// */
	// public static String getFileExtension(String fileName) {
	// File f = new File(fileName);
	// fileName = f.getName();
	// int pos = fileName.lastIndexOf("."); //$NON-NLS-1$
	// if (pos != -1) {
	// String ext = fileName.substring(pos + 1, fileName.length());
	// return ext;
	// }
	// return ""; //$NON-NLS-1$
	// }
	//
	// public static String getFileNameWithoutExtension(String fileName) {
	// int pos = fileName.lastIndexOf("."); //$NON-NLS-1$
	// if (pos != -1) {
	// return fileName.substring(0, pos);
	// }
	// return ""; //$NON-NLS-1$
	// }

	// public static void removeFigure(IFigure parent, IFigure child) {
	// if (parent.getChildren().contains(child)) {
	// parent.remove(child);
	// }
	// }

	// public static void uiPause(int millis) {
	// long startTime = System.currentTimeMillis();
	// while (System.currentTimeMillis() - startTime < millis) {
	// getDisplay().readAndDispatch();
	// }
	// }

	// static class ShutDown extends Thread {
	// public ShutDown() {
	//
	// }
	//
	// @Override
	// public void run() {
	// Runtime.getRuntime().removeShutdownHook(this);
	// }
	// }

	// private static ShutDown shutDownInskapeThread;

	// private static Process process = null;

	// public static void startInkscape(String filePath) {
	// // shutDownInskapeThread = new ShutDown();
	// File inkscapeProgram = JOUtil2.getInkscapeProgram();
	// // try {
	//
	// // Program.launch(filePath); // f.getAbsolutePath() + " " + filePath);

	// C:\Users\ramin\AppData\Local\Temp\word\media\PeterM_Penguin_with_a_shirt.svg
	//
	// File workingDir = inkscapeProgram.getAbsoluteFile().getParentFile();
	// String inkScapeName = inkscapeProgram.getName();
	//
	// inkScapeName = inkscapeProgram.getAbsolutePath();
	//
	// try {
	// Runtime.getRuntime().exec(new String[] { inkScapeName, filePath },
	// null, workingDir);// ,
	//
	// // Runtime.getRuntime().exec(inkScapeName,new String[]{"svgfile=" +
	// filePath}, //$NON-NLS-1$
	// // workingDir);// ,
	//
	// // null, workingDir);
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// // Runtime rt = Runtime.getRuntime();
	// // // rt.addShutdownHook(shutDownInskapeThread);
	// // process = rt.exec(f.getAbsolutePath() + " " + filePath); //$NON-NLS-1$
	// // process.waitFor();
	//
	// //
	// // while (true) {
	// //
	// // Display.getCurrent().readAndDispatch();
	// // Thread.sleep(100);
	// // try {
	// // process.getInputStream().available();
	// // } catch (Exception ex) {
	// // }
	// // }
	// // } catch (IOException e) {
	// // // TODO Auto-generated catch block
	// // e.printStackTrace();
	// // } catch (InterruptedException e) {
	// // // TODO Auto-generated catch block
	// // e.printStackTrace();
	// // }
	//
	// }
	//
	// public static void sleep(long millis) {
	// try {
	// Thread.sleep(millis);
	// } catch (InterruptedException e) {
	// // ignore
	// }
	// }
	//
	// /**
	// * @return
	// */
	// public static String getMemoryInfo() {
	// return Messages.JOUtil_FreeMemory
	// + +Runtime.getRuntime().freeMemory()
	// + "\n" //$NON-NLS-1$
	// + Messages.JOUtil_TotalHeapSize
	// + Runtime.getRuntime().maxMemory()
	// + "\n" //$NON-NLS-1$
	// + Messages.JOUtil_CurrentHeapSize
	// + Runtime.getRuntime().totalMemory();
	// }
	//
	// /**
	// * @param w
	// * @param h
	// * @return
	// */
	// public static double getPythagoras(double w, double h) {
	// return Math.sqrt(w * w + h * h);
	// }
	//
	// /**
	// * @param x
	// * @param y
	// * @param xm
	// * @param ym
	// * @return
	// */
	// public static double calculateAngle(double x, double y, double xm, double
	// ym) {
	// double dx = Math.abs(x - xm);
	// double dy = Math.abs(y - ym);
	// double r = JOUtil.getPythagoras(dx, dy);
	// double umfang = 2 * Math.PI;
	// double winkel = 0.0;
	// switch (getQuadrant(xm, ym, x, y)) {
	//
	// case 1:
	// winkel = Math.acos(dy / r) / umfang * 360;
	// break;
	// case 2:
	// winkel = Math.asin(dy / r) / umfang * 360 + 90;
	// break;
	// case 3:
	// winkel = Math.acos(dy / r) / umfang * 360 + 180;
	// break;
	// case 4:
	// winkel = Math.asin(dy / r) / umfang * 360 + 270;
	// break;
	// }
	// return winkel;
	// }
	//
	// public static double calculateRealAngle(double x, double y, double xm,
	// double ym) {
	// double dx = Math.abs(x - xm);
	// double dy = Math.abs(y - ym);
	// double r = JOUtil.getPythagoras(dx, dy);
	// double umfang = 2 * Math.PI;
	// double winkel = 0.0;
	// switch (getQuadrant(xm, ym, x, y)) {
	// case 1:
	// winkel = Math.acos(dy / r) / umfang * 360;
	// break;
	// case 2:
	// winkel = Math.acos(dy / r) / umfang * 360 - 90;
	// break;
	// case 3:
	// winkel = Math.asin(dy / r) / umfang * 360 + 180;
	// break;
	// case 4:
	// winkel = Math.acos(dy / r) / umfang * 360 - 270;
	// break;
	// }
	// return winkel;
	// }
	//
	// /**
	// * @param xm
	// * @param ym
	// * @param x
	// * @param y
	// * @return
	// */
	// public static int getQuadrant(double xm, double ym, double x, double y) {
	// int quadrant = 0;
	// if (x >= xm && y < ym) {
	// quadrant = 1;
	// } else if (x > xm && y >= ym) {
	// quadrant = 2;
	// } else if (x <= xm && y < ym) {
	// quadrant = 4;
	// } else if (x < xm && y >= ym) {
	// quadrant = 3;
	// } else {
	// quadrant = 3;
	// }
	//
	// return quadrant;
	//
	// }
	//
	// /**
	// * @param xm
	// * @param ym
	// * @param r
	// * @param angle
	// * @return
	// */
	// public static double[] calculateCoordinates(double xm, double ym, double
	// r,
	// double angle) {
	// double[] result = new double[2];
	// result[0] = Math.sin(2 * Math.PI * (angle / 360.0)) * r + xm;
	// result[1] = -Math.cos(2 * Math.PI * (angle / 360.0)) * r + ym;
	// return result;
	// }
	//
	// /**
	// * @param xm
	// * @param ym
	// * @param x1
	// * @param y1
	// * @param degree
	// * @return
	// */
	// public static double[] calculateRotation(double xm, double ym, double x,
	// double y, double rotation) {
	// double[] result = new double[2];
	// double dx = x - xm;
	// double dy = y - ym;
	// double r = JOUtil.getPythagoras(dx, dy);
	//
	// double startAngle = calculateAngle(x, y, xm, ym);
	//
	// double newRotation = startAngle + rotation;
	// if (newRotation >= 360) {
	// newRotation -= 360;
	// }
	//
	// result = calculateCoordinates(xm, ym, r, newRotation);
	// return result;
	// }
	//
	// /**
	// * @param xm
	// * @param ym
	// * @param x
	// * @param y
	// * @param rotation
	// * @return
	// */
	// public static double recalculateRotation(double xm, double ym, double x,
	// double y, double rotation) {
	// double result = rotation;
	//
	// switch (getQuadrant(xm, ym, x, y)) {
	// case 1:
	// result = Math.abs(90 - rotation);
	// break;
	// case 2:
	// break;
	// case 3:
	// break;
	// case 4:
	// break;
	// }
	//
	// return result;
	// }

	// /**
	// * @param args
	// */
	// public static void main(String[] args) {
	//
	// double i = 151.0;
	//
	// double[] coordinates = calculateCoordinates(0, 0, 100, 45);
	// double x = coordinates[0];
	// double y = coordinates[1];
	//
	// // System. out
	// // .("Quadrant for " + 90 + " = " + getQuadrant(0, 0, x, y));
	// //$NON-NLS-1$ //$NON-NLS-2$
	//
	// for (i = 0; i < 360; i += 1) {
	//
	// coordinates = calculateCoordinates(0, 0, 100, i);
	// x = coordinates[0];
	// y = coordinates[1];
	//
	// double angle = calculateAngle(x, y, 0, 0);
	//
	// // System. out.("Quadrant for " + i + " = "
	// // + getQuadrant(0, 0, x, y) + " angle = " + angle);
	//
	// }
	//
	// }

	// /**
	// * @param value
	// * @return
	// */
	// public static String getBooleanString(boolean value) {
	// return value ? "1" : "0"; //$NON-NLS-1$//$NON-NLS-2$
	// }
	//
	// /**
	// * @param value
	// * @return
	// */
	// public static boolean stringToBoolean(String value) {
	// return value.equals("1") ? true : false; //$NON-NLS-1$
	// }
	//
	// /**
	// * @param value
	// * @return
	// */
	// public static int stringToInteger(String value) {
	// try {
	// return Integer.valueOf(value);
	// } catch (Exception ex) {
	//
	// }
	// return 0;
	// }
	//
	// static BufferedImage convertToAWT(ImageData data) {
	// ColorModel colorModel = null;
	// PaletteData palette = data.palette;
	// if (palette.isDirect) {
	// colorModel = new DirectColorModel(data.depth, palette.redMask,
	// palette.greenMask, palette.blueMask);
	// BufferedImage bufferedImage = new BufferedImage(colorModel,
	// colorModel.createCompatibleWritableRaster(data.width,
	// data.height), false, null);
	// WritableRaster raster = bufferedImage.getRaster();
	// int[] pixelArray = new int[3];
	// for (int y = 0; y < data.height; y++) {
	// for (int x = 0; x < data.width; x++) {
	// int pixel = data.getPixel(x, y);
	// RGB rgb = palette.getRGB(pixel);
	// pixelArray[0] = rgb.red;
	// pixelArray[1] = rgb.green;
	// pixelArray[2] = rgb.blue;
	// raster.setPixels(x, y, 1, 1, pixelArray);
	// }
	// }
	// return bufferedImage;
	// }
	// RGB[] rgbs = palette.getRGBs();
	// byte[] red = new byte[rgbs.length];
	// byte[] green = new byte[rgbs.length];
	// byte[] blue = new byte[rgbs.length];
	// for (int i = 0; i < rgbs.length; i++) {
	// RGB rgb = rgbs[i];
	// red[i] = (byte) rgb.red;
	// green[i] = (byte) rgb.green;
	// blue[i] = (byte) rgb.blue;
	// }
	// if (data.transparentPixel != -1) {
	// colorModel = new IndexColorModel(data.depth, rgbs.length, red,
	// green, blue, data.transparentPixel);
	// } else {
	// colorModel = new IndexColorModel(data.depth, rgbs.length, red,
	// green, blue);
	// }
	// BufferedImage bufferedImage = new BufferedImage(colorModel,
	// colorModel.createCompatibleWritableRaster(data.width,
	// data.height), false, null);
	// WritableRaster raster = bufferedImage.getRaster();
	// int[] pixelArray = new int[1];
	// for (int y = 0; y < data.height; y++) {
	// for (int x = 0; x < data.width; x++) {
	// int pixel = data.getPixel(x, y);
	// pixelArray[0] = pixel;
	// raster.setPixel(x, y, pixelArray);
	// }
	// }
	// return bufferedImage;
	// }
	//
	// /**
	// * @param bufferedImage
	// * @return
	// */
	// static ImageData convertToSWT(BufferedImage bufferedImage) {
	// if (bufferedImage.getColorModel() instanceof DirectColorModel) {
	// DirectColorModel colorModel = (DirectColorModel) bufferedImage
	// .getColorModel();
	// PaletteData palette = new PaletteData(colorModel.getRedMask(),
	// colorModel.getGreenMask(), colorModel.getBlueMask());
	// ImageData data = new ImageData(bufferedImage.getWidth(),
	// bufferedImage.getHeight(), colorModel.getPixelSize(),
	// palette);
	// WritableRaster raster = bufferedImage.getRaster();
	// int[] pixelArray = new int[3];
	// for (int y = 0; y < data.height; y++) {
	// for (int x = 0; x < data.width; x++) {
	// raster.getPixel(x, y, pixelArray);
	// int pixel = palette.getPixel(new RGB(pixelArray[0],
	// pixelArray[1], pixelArray[2]));
	// data.setPixel(x, y, pixel);
	// }
	// }
	// return data;
	// } else if (bufferedImage.getColorModel() instanceof IndexColorModel) {
	// IndexColorModel colorModel = (IndexColorModel) bufferedImage
	// .getColorModel();
	// int size = colorModel.getMapSize();
	// byte[] reds = new byte[size];
	// byte[] greens = new byte[size];
	// byte[] blues = new byte[size];
	// colorModel.getReds(reds);
	// colorModel.getGreens(greens);
	// colorModel.getBlues(blues);
	// RGB[] rgbs = new RGB[size];
	// for (int i = 0; i < rgbs.length; i++) {
	// rgbs[i] = new RGB(reds[i] & 0xFF, greens[i] & 0xFF,
	// blues[i] & 0xFF);
	// }
	// PaletteData palette = new PaletteData(rgbs);
	// ImageData data = new ImageData(bufferedImage.getWidth(),
	// bufferedImage.getHeight(), colorModel.getPixelSize(),
	// palette);
	// data.transparentPixel = colorModel.getTransparentPixel();
	// WritableRaster raster = bufferedImage.getRaster();
	// int[] pixelArray = new int[1];
	// for (int y = 0; y < data.height; y++) {
	// for (int x = 0; x < data.width; x++) {
	// raster.getPixel(x, y, pixelArray);
	// data.setPixel(x, y, pixelArray[0]);
	// }
	// }
	// return data;
	// }
	// return null;
	// }
	//
	// public static void showImage(final String title, final Image image) {
	// showImage(JOUtil.getShell(), title, image);
	// }
	//
	// static ImageData createSampleImage(Display display) {
	// Image image = JOUtil2.createImage(100, 100);
	// Rectangle bounds = image.getBounds();
	// GC gc = new GC(image);
	// gc.setBackground(display.getSystemColor(SWT.COLOR_BLUE));
	// gc.fillRectangle(bounds);
	// gc.setBackground(display.getSystemColor(SWT.COLOR_GREEN));
	// gc.fillOval(0, 0, bounds.width, bounds.height);
	// gc.setForeground(display.getSystemColor(SWT.COLOR_RED));
	// gc.drawLine(0, 0, bounds.width, bounds.height);
	// gc.drawLine(bounds.width, 0, 0, bounds.height);
	// gc.dispose();
	// ImageData data = image.getImageData();
	// image.dispose();
	// return data;
	// }
	//

	//
	// /**
	// * @param s
	// * @param font
	// * @return
	// */
	// public static Point getTextExtent(String s, IFont font) {
	// Point result;
	// GC gc;
	// Shell shell = null;
	// if (JO.officePane != null) {
	// gc = new GC((Drawable) JO.officePane);
	// } else {
	// shell = new Shell();
	// gc = new GC(shell);
	//
	// }
	// if (font != null) {
	// gc.setFont((Font) font.getSwt());
	// }
	// result = gc.textExtent(s);
	// gc.dispose();
	// if (shell != null) {
	// shell.dispose();
	// }
	// return result;
	// }
	//
	// /**
	// * @param s
	// * @param font
	// * @return
	// */
	// public static Point getTextExtent(String s, Font font) {
	// Point result;
	// GC gc;
	// Shell shell = null;
	// if (JO.officePane != null) {
	// gc = new GC((Drawable) JO.officePane);
	// } else {
	// shell = new Shell();
	// gc = new GC(shell);
	//
	// }
	// if (font != null) {
	// gc.setFont((Font) font);
	// }
	// result = gc.textExtent(s);
	// gc.dispose();
	// if (shell != null) {
	// shell.dispose();
	// }
	// return result;
	// }
	//
	// public static int[] createCirclePolygon(int r, int offsetX, int offsetY)
	// {
	// int f1 = 8;
	// int[] polygon = new int[f1 * r + f1 / 2];
	// for (int i = 0; i < 2 * r + 1; i++) {
	// int x = i - r;
	// int y = (int) Math.sqrt(r * r - x * x);
	// polygon[2 * i] = offsetX + x;
	// polygon[2 * i + 1] = offsetY + y;
	// polygon[f1 * r - 2 * i - 2] = offsetX + x;
	// polygon[f1 * r - 2 * i - 1] = offsetY - y;
	// }
	// return polygon;
	// }

	// /**
	// * @param var
	// * @param replacement
	// */
	// public static String replaceTemplateVariable(String buf, String var,
	// String replacement) {
	// int pos = 0;
	// while (true) {
	// String key = JO.JO_TEMPLATE_VAR + var;
	// pos = buf.indexOf(key, pos);
	// if (pos == -1) {
	// break;
	// }
	// buf = buf.substring(0, pos) + replacement
	// + buf.substring(pos + key.length(), buf.length());
	//
	// }
	// return buf;
	// }
	//
	// private static String actualMajorVersion = null;
	//
	// private static String actualMinorVersion = null;
	//
	// private static String actualPatchVersion = null;
	//
	// @SuppressWarnings("unused")
	// private static String getActualMajorVersion() {
	// if (actualMajorVersion == null) {
	// loadActualVersion();
	// }
	// return actualMajorVersion;
	// }
	//
	// /**
	// * @return
	// */
	// @SuppressWarnings("unused")
	// private static String getActualMinorVersion() {
	// if (actualMinorVersion == null) {
	// loadActualVersion();
	// }
	// return actualMinorVersion;
	// }
	//
	// /**
	// * @return
	// */
	// private static String getActualPatchVersion() {
	// if (actualPatchVersion == null) {
	// loadActualVersion();
	// }
	// return actualPatchVersion;
	// }
	//
	// /**
	// * @return
	// */
	// @SuppressWarnings("unused")
	// private static String getActualPatchVersion1() {
	// String s = getActualPatchVersion();
	// String[] splits = s.split(" "); //$NON-NLS-1$
	// return splits[0];
	// }
	//
	// /**
	// * @return new version, otherwise null
	// */
	// public static String versionChanged() {
	// // try {
	// // String activationString = JOActivation
	// // .getDownloadString(JOActivation.ACTIVATION_JOFFICE_SUBSCRIPTION);
	// //
	// // String url = JO.WEB_HOME + "/" + activationString //$NON-NLS-1$
	// // + "/version.properties"; //$NON-NLS-1$
	// // //
	// //
	// hJOSession.codeBase +
	// "/downloads/87da3e54906a2dde3b31371cfa46e94e/version.properties
	// //
	// // //
	// // JOSession.codeBase +
	// "/87da3e54906a2dde3b31371cfa46e94e/version.properties;
	// //
	// // File versionPropertyFile = JOResourceList.download(url, true,
	// // false, false, 1, null, null);
	// // if (versionPropertyFile != null) {
	// //
	// // Properties props = new Properties();
	// // FileInputStream fis;
	// // try {
	// // fis = new FileInputStream(versionPropertyFile);
	// // props.load(fis);
	// // String major = props.getProperty("major"); //$NON-NLS-1$
	// // String minor = props.getProperty("minor"); //$NON-NLS-1$
	// // String patch = props.getProperty("patch"); //$NON-NLS-1$
	// // JOActivation.manualActivationCode = props
	// // .getProperty("activation"); //$NON-NLS-1$
	// // String force_older_than_major = props
	// // .getProperty("force_older_than_major"); //$NON-NLS-1$
	// // String force_older_than_minor = props
	// // .getProperty("force_older_than_minor"); //$NON-NLS-1$
	// // String force_older_than_patch = props
	// // .getProperty("force_older_than_patch"); //$NON-NLS-1$
	// //
	// // if (!JOUiConfig.MAJOR_VERSION.equals(major)
	// // || !JOUiConfig.MINOR_VERSION.equals(minor)
	// // || !JOUiConfig.PATCH_VERSION.equals(patch)) {
	// // fis.close();
	// // calculateActivations(props);
	// // return major
	// // + "." + minor + "." + patch + "," + force_older_than_major + "." +
	// force_older_than_minor + "." + force_older_than_patch;
	// //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
	// // }
	// // fis.close();
	// // calculateActivations(props);
	// // } catch (FileNotFoundException e) {
	// // } catch (IOException e) {
	// // }
	// // }
	// // } catch (Exception ex) {
	// // // ignore
	// // }
	// return null;
	// }
	//
	// /**
	// * @param props
	// */
	// private static void calculateActivations(Properties props) {
	// // String email = JOUtil2
	// // .getDefaultString("infotab/actions/editor/user_e_mail"); //$NON-NLS-1$
	// // if (email != null && email.length() > 0) {
	// // for (int i = 1;; i++) {
	// // String subsription = props.getProperty("subscription_" + i);
	// //$NON-NLS-1$
	// // if (subsription == null) {
	// // break;
	// // }
	// // if (email.equals(subsription)) {
	// // JOActivation
	// // .activate(
	// // JOActivation.ACTIVATION_JOFFICE_SUBSCRIPTION,
	// // false);
	// // break;
	// // }
	// // }
	// // }
	//
	// }
	//
	// /**
	// *
	// */
	// private static void loadActualVersion() {
	// // String activationString = JOActivation
	// // .getDownloadString(JOActivation.ACTIVATION_JOFFICE_SUBSCRIPTION);
	// // File versionPropertyFile = JOResourceList
	// // .download(
	// // JO.WEB_HOME
	// // + "/" + activationString + "/version.properties", true, false, false,
	// 1, null, null); //$NON-NLS-1$//$NON-NLS-2$
	// // if (versionPropertyFile != null) {
	// //
	// // Properties props = new Properties();
	// // FileInputStream fis;
	// // try {
	// // fis = new FileInputStream(versionPropertyFile);
	// // props.load(fis);
	// // actualMajorVersion = props.getProperty("major"); //$NON-NLS-1$
	// // actualMinorVersion = props.getProperty("minor"); //$NON-NLS-1$
	// // actualPatchVersion = props.getProperty("patch"); //$NON-NLS-1$
	// // fis.close();
	// // } catch (FileNotFoundException e) {
	// // } catch (IOException e) {
	// // }
	// // }
	//
	// }
	//
	// /**
	// * @param image
	// * @param angle
	// * @return
	// */
	// public static Image rotate(Image image, int angle) {
	// BufferedImage img = convertToAWT(image.getImageData());
	// int w = img.getWidth();
	// int h = img.getHeight();
	// BufferedImage dimg = new BufferedImage(w, h, img.getType());
	// Graphics2D g = dimg.createGraphics();
	// g.rotate(Math.toRadians(angle), w / 2, h / 2);
	// g.drawImage(img, null, 0, 0);
	// image.dispose();
	// Image newImage = JOUtil2.createImage(convertToSWT(img));
	//
	// // showImage("", newImage);
	//
	// return newImage;
	// }
	//
	// /**
	// * @param r
	// * @return
	// */
	// public static Rectangle draw2dToSwtRect(Rectangle2D r) {
	// return new Rectangle((int) r.getMinX(), (int) r.getMinY(),
	// (int) r.getWidth(), (int) r.getHeight());
	// }
	//
	// /**
	// * @param r
	// * @param angle
	// * @return
	// */
	// public static Rectangle2D calculateBoundingBox(Rectangle2D r, double
	// angle) {
	//
	// Rectangle2D result = r;
	// // if (angle != 0.0)
	// {
	//
	// double x = r.getMinX();
	// double y = r.getMinY();
	// double width = r.getWidth();
	// double height = r.getHeight();
	//
	// // Angle in radians
	// double radians = Math.toRadians(angle);
	// double sin_a = Math.sin(radians);
	// double cos_a = Math.cos(radians);
	//
	// boolean sin_positive = (sin_a >= 0.0f);
	// boolean cos_positive = (cos_a >= 0.0f);
	//
	// double mx = x + width / 2;
	// double my = y + height / 2;
	//
	// double left_x = x - mx;
	// double right_x = x + width - mx;
	// double top_y = y - my;
	// double bottom_y = y + height - my;
	//
	// double left_x_cos = left_x * cos_a;
	// double left_x_sin = left_x * sin_a;
	// double right_x_cos = right_x * cos_a;
	// double right_x_sin = right_x * sin_a;
	// double top_y_cos = top_y * cos_a;
	// double top_y_sin = top_y * sin_a;
	// double bottom_y_cos = bottom_y * cos_a;
	// double bottom_y_sin = bottom_y * sin_a;
	//
	// double left, right, top, bottom;
	//
	// if (sin_positive) {
	// // First quadrant 0-90 degrees: point 3 (bottom left) will be
	// // leftmost
	// if (cos_positive) {
	// left = mx + left_x_cos - bottom_y_sin;
	// right = mx + right_x_cos - top_y_sin;
	//
	// top = my + top_y_cos + left_x_sin;
	// bottom = my + bottom_y_cos + right_x_sin;
	// }
	// // cos is negative: second quadrant 90-180 degrees, point 4
	// // (bottom right) will be leftmost
	// else {
	// left = mx + right_x_cos - bottom_y_sin;
	// right = mx + left_x_cos - top_y_sin;
	//
	// top = my + bottom_y_cos + left_x_sin;
	// bottom = my + top_y_cos + right_x_sin;
	// }
	//
	// }
	// // sin is negative
	// else {
	// // cos is positive: fourth quadrant 270-360 degrees, point 1
	// // (top left) will be leftmost
	// if (cos_positive) {
	// left = mx + left_x_cos - top_y_sin;
	// right = mx + right_x_cos - bottom_y_sin;
	//
	// top = my + top_y_cos + right_x_sin;
	// bottom = my + bottom_y_cos + left_x_sin;
	//
	// }
	// // cos is negative: third quadrant 180-270 degrees, point 2 (top
	// // right) will be leftmost
	// else {
	// left = mx + right_x_cos - top_y_sin;
	// right = mx + left_x_cos - bottom_y_sin;
	//
	// top = my + bottom_y_cos + right_x_sin;
	// bottom = my + top_y_cos + left_x_sin;
	// }
	//
	// }
	//
	// x = (int) left;
	// width = (int) (right - left);
	// y = (int) top;
	// height = (int) (bottom - top);
	// result = new Rectangle2D(x, y, width, height);
	// }
	//
	// return result;
	// }
	//
	// public static void playClickSoundEnter() {
	// boolean soundOnClicks = JOUtil2
	// .getBoolean("infotab/actions/editor/sound_on_clicks"); //$NON-NLS-1$
	// if (soundOnClicks) {
	// playTemplateClip(JO.SOUND_CLAVES, -50f);
	// }
	// }
	//
	// public static void playClickSoundClick() {
	// boolean soundOnClicks = JOUtil2
	// .getBoolean("infotab/actions/editor/sound_on_clicks"); //$NON-NLS-1$
	// if (soundOnClicks) {
	// playTemplateClip(JO.SOUND_CLAVES, -40f);
	// }
	// }
	//
	// /**
	// * @param name
	// */
	// public static void playTemplateClip(String name, float volume) {
	// InputStream is = JOResourcesPlugin.class
	// .getResourceAsStream("/com/joffice/sound/" + name + ".wav");
	// //$NON-NLS-1$ //$NON-NLS-2$
	// playClip(is, volume);
	// }
	//
	// /**
	// * @param is
	// */
	// public static void playClip(InputStream is, float volume) {
	// AudioInputStream sound;
	// try {
	// sound = AudioSystem.getAudioInputStream(is);
	// DataLine.Info info = new DataLine.Info(Clip.class,
	// sound.getFormat());
	// Clip clip = (Clip) AudioSystem.getLine(info);
	// clip.open(sound);
	// FloatControl gainControl = (FloatControl) clip
	// .getControl(FloatControl.Type.MASTER_GAIN);
	// gainControl.setValue(volume);
	// clip.start();
	// clip.addLineListener(new LineListener() {
	// @Override
	// public void update(LineEvent event) {
	// if (event.getType() == LineEvent.Type.STOP) {
	// event.getLine().close();
	// }
	// }
	// });
	// } catch (UnsupportedAudioFileException e) {
	// } catch (IOException e) {
	// } catch (LineUnavailableException e) {
	// }
	//
	// // play the sound clip
	//
	// }
	//
	// public static void embeddWindowsApplication() {
	//
	// // HWND myWindow; //Handle to my application window
	// // HWND externalWindow; //Handle to external application window
	// //
	// // SetParent(myWindow,externalWindow);
	// //
	// // //Remove WS_POPUP style and add WS_CHILD style
	// // DWORD style = GetWindowLong(myWindow,GWL_STYLE);
	// // style = style & ~(WS_POPUP);
	// // style = style | WS_CHILD;
	// // SetWindowLong(myWindow,GWL_STYLE,style);
	//
	// // To fix the issue with the main app losing focus you need to use the
	// // AttachThreadInput function to attach the embedded window thread to
	// // the main app thread.
	// // Also, one can use the TranslateAccelerator function in response to
	// // WM_KEYDOWN messages to ensure accelerator messages of the main app
	// // are triggered.
	// }
	//
	// /**
	// * @param image
	// * @param style
	// * @return
	// */
	// public static Image createImage(Image image, int style) {
	// Image image2 = new Image(null, image, style);
	// JOUtil2.imageHandles++;
	// return image2;
	// }
	//
	// public static Image createImage(ImageData data) {
	// Image image = new Image(null, data);
	// JOUtil2.imageHandles++;
	// return image;
	// }
	//
	// public static JOImage createImage(InputStream is) {
	// JOImage image = new JOImage(new Image(null, is), null);
	// image.setIs(is);
	// JOUtil2.imageHandles++;
	// return image;
	// }
	//
	// public static Image createImage(int width, int height) {
	// try {
	// Image image = new Image(null, width, height);
	// JOUtil2.imageHandles++;
	// return image;
	// } catch (Exception ex) {
	// LOGGER.debug("", ex); //$NON-NLS-1$
	// }
	// return null;
	// }
	//
	// // /**
	// // * @param fName
	// // * @return
	// // */
	// // public static IImage<Image, javafx.scene.image.Image> createImage(
	// // String fName) {
	// // try {
	// //
	// // JOImage image = new JOImage(new Image(null, fName), null);
	// // imageHandles++;
	// // return image;
	// // } catch (Exception ex) {
	// // LOGGER.error("", ex); //$NON-NLS-1$
	// // }
	// // return null;
	// // }
	//
	// /**
	// * @param fName
	// * @return
	// */
	// public static IImage createImage(String fName) {
	// try {
	//
	// JOImage image = new JOImage(new Image(null, fName), null);
	// JOUtil2.imageHandles++;
	// return image;
	// } catch (Exception ex) {
	// LOGGER.error("", ex); //$NON-NLS-1$
	// }
	// return null;
	// }
	//
	// /**
	// * @param resource
	// */
	// public static void disposeResource(IResource resource) {
	//
	// // if (resource.getImage() != null) {
	// // if (resource.getImage().getSwt() instanceof Resource) {
	// //
	// // try {
	// // if (resource != null
	// // && !resource.getImage().get().isDisposed()) {
	// // JOUtil2.imageHandles--;
	// // resource.getImage().get().dispose();
	// // }
	// // } catch (Exception ex) {
	// // LOGGER.error("", ex); //$NON-NLS-1$
	// // }
	// // }
	// // }
	// }
	//
	// /**
	// * @param resource
	// */
	// public static void disposeResource(JOImage resource) {
	//
	// // if (resource != null) {
	// // if (resource.get() instanceof Resource) {
	// //
	// // try {
	// // if (resource != null && !resource.get().isDisposed()) {
	// // JOUtil2.imageHandles--;
	// // resource.get().dispose();
	// // }
	// // } catch (Exception ex) {
	// // LOGGER.error("", ex); //$NON-NLS-1$
	// // }
	// // }
	// // }
	// }
	//
	// /**
	// * @param resource
	// */
	// public static void disposeResource(Resource resource) {
	// try {
	// if (resource != null && !resource.isDisposed()) {
	// JOUtil2.imageHandles--;
	// resource.dispose();
	// }
	// } catch (Exception ex) {
	// LOGGER.error("", ex); //$NON-NLS-1$
	// }
	// }
	//
	// /**
	// * @return
	// */
	// public static File downloadUpdate(boolean major) {
	// // String activationString = JOActivation
	// // .getDownloadString(JOActivation.ACTIVATION_JOFFICE_SUBSCRIPTION);
	// String updateUrl = JO.WEB_HOME
	// + "/downloads/" + JOConfigStrings.campaign + "/update_" +
	// JOConfigStrings.campaign + ".exe"; //$NON-NLS-1$//$NON-NLS-2$
	// //$NON-NLS-3$
	// String majorUpdateUrl = JO.WEB_HOME
	// + "/downloads/" + JOConfigStrings.campaign + "/install_" +
	// JOConfigStrings.campaign + ".exe"; //$NON-NLS-1$ //$NON-NLS-2$
	// //$NON-NLS-3$
	// File f = null;
	// if (major) {
	// f = JOResourceList.download(majorUpdateUrl, true, true, true,
	// JOUiConfig.INSTALLER_SIZE_MEGABYTE, false, null,
	// Messages.JOUtil_ItTakesAFewMinutes);
	// if (f != null) {
	// File f2 = new File(f.getParentFile(), "update_joffice.exe");
	// //$NON-NLS-1$
	// if (f2.exists()) {
	// f2.delete();
	// }
	// f.renameTo(f2);
	// return f2;
	// }
	// } else {
	// f = JOResourceList.download(updateUrl, true, true, true,
	// JOUiConfig.INSTALLER_UPDATE_SIZE_MEGABYTE, false, null,
	// null);
	// if (f != null) {
	// File f2 = new File(f.getParentFile(), "update_joffice.exe");
	// //$NON-NLS-1$
	// if (f2.exists()) {
	// f2.delete();
	// }
	// f.renameTo(f2);
	// return f2;
	// }
	// }
	// return f;
	// }

	/**
		 * 
		 */
	public static void dispose() {
		// try {
		// Collection<FavIcon> c = faviconRegistry.values();
		// FavIcon[] images = c.toArray(new FavIcon[faviconRegistry.values()
		// .size()]);
		// for (FavIcon image : images) {
		// if (image.image != null) {
		// image.image.dispose();
		// }
		// if (image.imageOriginal != null) {
		// image.imageOriginal.dispose();
		// }
		// }
		// faviconRegistry.clear();
		// } catch (Exception ex) {
		// LOGGER.error("", ex); //$NON-NLS-1$
		// }
		// // JOUtil2.getDefaultDB().close();
		// if (JOUtil2.lockFile != null) {
		// JOUtil2.lockFile.delete();
		// }
	}

	// /**
	// * @param loc
	// * @return
	// */
	// @SuppressWarnings("unchecked")
	// public static Image loadFavIcon(String loc0) {
	// if (loc0 == null) {
	// return null;
	// }
	// Image favicon = null;
	// // String hostString = getUrlDisplayName(loc0);
	// //
	// // if (JOUtil.isNoDownloads()) {
	// // favicon = JOSWT.getResources().getImage("webbrowser").get();
	// //$NON-NLS-1$
	// // FavIcon fav = new FavIcon();
	// // fav.loaded = false;
	// // fav.image = favicon;
	// // faviconRegistry.put(hostString, fav);
	// // JO.profileEnd();
	// // return favicon;
	// // }
	// // FavIcon fav = faviconRegistry.get(hostString);
	// // if (fav != null && fav.loaded) {
	// // return fav.image;
	// // }
	// // String loc = null;
	// // JO.profile("loadFacIcon"); //$NON-NLS-1$
	// // try {
	// // if (!loc0.startsWith("http://") && !loc0.startsWith("https://")) {
	// //$NON-NLS-1$ //$NON-NLS-2$
	// // loc0 = "http://" + loc0; //$NON-NLS-1$
	// // }
	// // URL url = new URL(loc0);
	// // loc = url.getProtocol() + "://" + getDomain(url.getHost());
	// //$NON-NLS-1$
	// // } catch (Exception ex) {
	// // return null;
	// // }
	// //
	// // File f = null;
	// //
	// // try {
	// // f = JOResourceList.download(loc + "/favicon.ico", //$NON-NLS-1$
	// // false, false, false, 0, "images/webbrowser", null); //$NON-NLS-1$
	// // if (f != null) {
	// // try {
	// // favicon = new Image(null, f.getAbsolutePath());
	// // Rectangle r = favicon.getBounds();
	// // if (r.width != 16 || r.height != 16) {
	// // Image image16 = copyImage(favicon, 16, 16);
	// // fav = new FavIcon();
	// // fav.loaded = true;
	// // fav.imageOriginal = favicon;
	// // fav.image = image16;
	// // faviconRegistry.put(hostString, fav);
	// // return image16;
	// // }
	// // fav = new FavIcon();
	// // fav.loaded = true;
	// // fav.image = favicon;
	// // faviconRegistry.put(hostString, fav);
	// // JO.profileEnd();
	// // return favicon;
	// // } catch (Exception ex) {
	// // f.delete();
	// // }
	// // }
	// // } catch (Exception ex) {
	// // if (favicon != null && !favicon.isDisposed()) {
	// // favicon.dispose();
	// // favicon = null;
	// // }
	// // }
	// // if (f != null) {
	// // JOResourceList.saveDefaultImage(f, "images/webbrowser"); //$NON-NLS-1$
	// // }
	// // favicon = JOSWT.getResources().getImage("images/webbrowser").get();
	// //$NON-NLS-1$
	// // fav = new FavIcon();
	// // fav.loaded = false;
	// // fav.image = favicon;
	// // faviconRegistry.put(hostString, fav);
	// // JO.profileEnd();
	// return favicon;
	// }
	//
	// public static String getDomainFromUrl(String url) {
	// try {
	// if (!url.startsWith("http://") && !url.startsWith("https://")) {
	// //$NON-NLS-1$ //$NON-NLS-2$
	// url = "http://" + url; //$NON-NLS-1$
	// }
	// URL url2 = new URL(url);
	// return getDomain(url2.getHost());
	//
	// } catch (Exception ex) {
	// }
	// return url;
	// }
	//
	// /**
	// * @param host
	// * @return
	// */
	// public static String getDomain(String host) {
	// String[] splits = host.split("\\."); //$NON-NLS-1$
	// if (splits.length < 3) {
	// return host;
	// }
	// String domain = splits[splits.length - 2]
	// + "." + splits[splits.length - 1]; //$NON-NLS-1$
	// if (host.endsWith("co.uk")) { //$NON-NLS-1$
	// domain = splits[splits.length - 3] + "." + domain; //$NON-NLS-1$
	// } else if (splits[splits.length - 2].equals("gov")) { //$NON-NLS-1$
	// domain = splits[splits.length - 3] + "." + domain; //$NON-NLS-1$
	// } else if (splits[splits.length - 2].equals("edu")) { //$NON-NLS-1$
	// domain = splits[splits.length - 3] + "." + domain; //$NON-NLS-1$
	// } else if (splits[splits.length - 2].equals("mil")) { //$NON-NLS-1$
	// domain = splits[splits.length - 3] + "." + domain; //$NON-NLS-1$
	// }
	// return domain;
	// }
	//
	// /**
	// * @param host
	// * @return
	// */
	// public static String getLastSegmentOfDomainName(String url) {
	// String domain = getDomainFromUrl(url);
	// String[] splits = domain.split("\\."); //$NON-NLS-1$
	// return splits[splits.length - 1];
	// }
	//
	// /**
	// * @param url
	// * @return
	// */
	// public static String getDomainDisplayName(String url) {
	// String domain = getDomainFromUrl(url);
	// String[] segments = domain.split("\\."); //$NON-NLS-1$
	// String lastSegement = segments[segments.length - 1];
	// for (String[] d : domains) {
	// if (d[0].equals(lastSegement)) {
	// return d[1];
	// }
	// }
	// return url;
	// }
	//
	// /**
	// * @param host
	// * @return
	// */
	// @SuppressWarnings("unchecked")
	// public static Image getDomainImage(String host) {
	// // String[] splits = host.split("\\."); //$NON-NLS-1$
	// // String countryDomain = splits[splits.length - 1];
	// //
	// // Image image = null;
	// // JOResource res = JOSWT.getResources().getResource(
	// // "domain_" + countryDomain); //$NON-NLS-1$
	// // if (res != null) {
	// // image = ((JOImage) res.getImage()).get();
	// // }
	// // if (image == null) {
	// // image = JOSWT.getResources().getImage("webbrowser").get();
	// //$NON-NLS-1$
	// //
	// // }
	// // return image;
	//
	// return null;
	// }
	//

	// shell.open();
	// }
	//
	// private static HashMap<String, String> htmlEntities;
	// static {
	// htmlEntities = new HashMap<String, String>();
	// htmlEntities.put("&lt;", "<");htmlEntities.put("&gt;", ">");
	// //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	// htmlEntities.put("&amp;", "&");htmlEntities.put("&quot;", "\"");
	// //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	//
	// htmlEntities.put("&agrave;", "à"); //$NON-NLS-1$//$NON-NLS-2$
	// htmlEntities.put("&Agrave;", "À"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&acirc;", "â"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&auml;", "ä"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Auml;", "Ä"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Acirc;", "Â"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&aring;", "å"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Aring;", "Å"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&aelig;", "æ"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&AElig;", "Æ"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&ccedil;", "ç"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Ccedil;", "Ç"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&eacute;", "é"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Eacute;", "É"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Egrave;", "È"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&ecirc;", "ê"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Ecirc;", "Ê"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&euml;", "ë"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Euml;", "Ë"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&iuml;", "ï"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&ocirc;", "ô"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Ocirc;", "Ô"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&ouml;", "ö"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Ouml;", "Ö"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&oslash;", "ø"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Oslash;", "Ø"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&szlig;", "ß"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&ugrave;", "ù"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Ugrave;", "Ù"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&ucirc;", "û"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Ucirc;", "Û"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&uuml;", "ü"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&Uuml;", "Ü"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&nbsp;", " "); //$NON-NLS-1$ //$NON-NLS-2$
	//
	// htmlEntities.put("&copy;", "\u00a9"); //$NON-NLS-1$ //$NON-NLS-2$
	// htmlEntities.put("&reg;", "\u00ae"); //$NON-NLS-1$ //$NON-NLS-2$ // // // // //
																					// //
																					// //
																					// //
																					// //
																					// //
																					// //
																					// //
																					// //
																					// htmlEntities.put("&euro;",
																					// //
																					// //
																					// //
																					// //
																					// "\u20a0");
	// //
	// //$NON-NLS-1$ // //$NON-NLS-2$
	// //
	// htmlEntities.put("%20",
	// "
	// ");
	// //$NON-NLS-1$
	// //$NON-NLS-2$
	// }
	//
	// /*
	// *
	// Here
	// the
	// original
	// recursive
	// version.
	// It
	// is
	// fine
	// unless
	// you
	// pass
	// a
	// big
	// *
	// string
	// then
	// a
	// Stack
	// Overflow
	// is
	// possible
	// :-(
	// *
	// *
	// *
	// public
	// static
	// final
	// String
	// unescapeHTML(String
	// source,
	// int
	// start){
	// int
	// *
	// i,j;
	// *
	// *
	// i
	// =
	// source.indexOf("&",
	// start);
	// if
	// (i
	// >
	// -1)
	// {
	// j
	// =
	// source.indexOf(";"
	// ,i);
	// *
	// if
	// (j
	// >
	// i)
	// {
	// String
	// entityToLookFor
	// =
	// source.substring(i
	// ,
	// j
	// +
	// 1);
	// String
	// *
	// value
	// =
	// (String)htmlEntities.get(entityToLookFor);
	// if
	// (value
	// !=
	// null)
	// {
	// *
	// source
	// =
	// new
	// StringBuffer().append(source.substring(0
	// ,
	// i))
	// *
	// .append(value)
	// .append(source.substring(j
	// +
	// 1))
	// .toString();
	// return
	// *
	// unescapeHTML(source,
	// i
	// +
	// 1);
	// //
	// recursive
	// call
	// }
	// }
	// }
	// return
	// source;
	// }
	// *
	// *
	// M.
	// McNeely
	// Jr.
	// has
	// sent
	// a
	// version
	// with
	// do...while()loop
	// which
	// is
	// more
	// *
	// robust.
	// Thanks
	// to
	// him!
	// */
	//
	// public
	// static
	// final
	// String
	// unescapeHTML(String
	// source)
	// {
	// int
	// i,
	// j;
	//
	// boolean
	// continueLoop;
	// int
	// skip
	// =
	// 0;
	// do
	// {
	// continueLoop
	// =
	// false;
	// i
	// =
	// source.indexOf("&",
	// skip);
	// //$NON-NLS-1$
	// if
	// (i
	// >
	// -1)
	// {
	// j
	// =
	// source.indexOf(";",
	// i);
	// //$NON-NLS-1$
	// if
	// (j
	// >
	// i)
	// {
	// String
	// entityToLookFor
	// =
	// source.substring(i,
	// j
	// +
	// 1);
	// String
	// value
	// =
	// htmlEntities.get(entityToLookFor);
	// if
	// (value
	// !=
	// null)
	// {
	// source
	// =
	// source.substring(0,
	// i)
	// +
	// value
	// +
	// source.substring(j
	// +
	// 1);
	// continueLoop
	// =
	// true;
	// }
	// else
	// {
	// skip
	// =
	// i
	// +
	// 1;
	// continueLoop
	// =
	// true;
	// }
	// }
	// }
	// }
	// while
	// (continueLoop);
	//
	// if
	// (source.indexOf("%20")
	// !=
	// -1)
	// {
	// //$NON-NLS-1$
	// source
	// =
	// source.replaceAll("%20",
	// "
	// ");
	// //$NON-NLS-1$//$NON-NLS-2$
	// }
	//
	// return
	// source;
	// }
	//
	// /**
	// *
	// @param
	// key
	// */
	// public
	// static
	// void
	// showGroup(String
	// key)
	// {
	// showGroup(key,
	// -1);
	// }
	//

	// public static javafx.scene.image.Image
	// bufferedImageToFXImage(java.awt.Image image) throws IOException {
	// if (!(image instanceof RenderedImage)) {
	// BufferedImage bufferedImage = new BufferedImage(image.getWidth(null),
	// image.getHeight(null),
	// BufferedImage.TYPE_INT_ARGB);
	// Graphics g = bufferedImage.createGraphics();
	// g.drawImage(image, 0, 0, null);
	// g.dispose();
	// image = bufferedImage;
	// }
	// ByteArrayOutputStream out = new ByteArrayOutputStream();
	// ImageIO.write((RenderedImage) image, "png", out);
	// out.flush();
	// ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
	// return new javafx.scene.image.Image(in);
	// }

	// debugging routine to dump the scene graph.
	public static void dump(javafx.scene.Node n) {
		dump(n, 0);
	}

	private static void dump(javafx.scene.Node n, int depth) {
		for (int i = 0; i < depth; i++)
			System.out.print("  ");
		// System.out.log("*** dump: " + n);
		if (n instanceof Parent)
			for (javafx.scene.Node c : ((Parent) n).getChildrenUnmodifiable())
				dump(c, depth + 1);
	}

	// debugging routine to highlight the borders of nodes.
	public static void highlight(javafx.scene.Node n) {
		highlight(n, 0);
	}

	private static void highlight(javafx.scene.Node n, int depth) {
		n.setStyle("-fx-stroke: red; -fx-stroke-width: 1; -fx-stroke-type: inside;");
		if (n instanceof Parent)
			for (javafx.scene.Node c : ((Parent) n).getChildrenUnmodifiable())
				highlight(c, depth + 1);
	}

}

/**
 * @author ramin
 * 
 */
class FavIcon {
	public Image image;
	public Image imageOriginal;
	public boolean loaded;
}
