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

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFRelation;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EnMeasurementUnits;
import org.eclipse.rcpl.EnPageSize;
import org.eclipse.rcpl.IColorProvider;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.RcplCountry;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.internal.config.RcplConfig;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFontsList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.FontsDocument;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javafx.geometry.Rectangle2D;

public class JOUtil2 {

	// private static final Logger LOGGER =
	// LoggerFactory.getLogger(JOUtil2.class);

	private static final Object[][] CP1252_ESCAPE =

	{

			{ Byte.valueOf((byte) 228), "&auml;" }, // 'ä',

			{ Byte.valueOf((byte) 252), "&uuml;" }, // 'ü'

	};

	// € 128
	// ‚
	// 201A
	// 130
	//
	// ƒ
	// 0192
	// 131
	//
	// „
	// 201E
	// 132
	// …
	// 2026
	// 133
	// †
	// 2020
	// 134
	// ‡
	// 2021
	// 135
	// ˆ
	// 02C6
	// 136
	// ‰
	// 2030
	// 137
	// Š
	// 0160
	// 138
	// ‹
	// 2039
	// 139
	// Œ
	// 0152
	// 140
	// Ž
	// 017D
	// 142
	//
	// 9_
	//
	// ‘
	// 2018
	// 145
	// ’
	// 2019
	// 146
	// “
	// 201C
	// 147
	// ”
	// 201D
	// 148
	// •
	// 2022
	// 149
	// –
	// 2013
	// 150
	// —
	// 2014
	// 151
	// ˜
	// 02DC
	// 152
	// ™
	// 2122
	// 153
	// š
	// 0161
	// 154
	// ›
	// 203A
	// 155
	// œ
	// 0153
	// 156
	// ž
	// 017E
	// 158
	// Ÿ
	// 0178
	// 159
	//
	// A_
	// NBSP
	// 00A0
	// 160
	// ¡
	// 00A1
	// 161
	// ¢
	// 00A2
	// 162
	// £
	// 00A3
	// 163
	// ¤
	// 00A4
	// 164
	// ¥
	// 00A5
	// 165
	// ¦
	// 00A6
	// 166
	// §
	// 00A7
	// 167
	// ¨
	// 00A8
	// 168
	// ©
	// 00A9
	// 169
	// ª
	// 00AA
	// 170
	// «
	// 00AB
	// 171
	// ¬
	// 00AC
	// 172
	// SHY
	// 00AD
	// 173
	// ®
	// 00AE
	// 174
	// ¯
	// 00AF
	// 175
	//
	// B_
	// °
	// 00B0
	// 176
	// ±
	// 00B1
	// 177
	// ²
	// 00B2
	// 178
	// ³
	// 00B3
	// 179
	// ´
	// 00B4
	// 180
	// µ
	// 00B5
	// 181
	// ¶
	// 00B6
	// 182
	// ·
	// 00B7
	// 183
	// ¸
	// 00B8
	// 184
	// ¹
	// 00B9
	// 185
	// º
	// 00BA
	// 186
	// »
	// 00BB
	// 187
	// ¼
	// 00BC
	// 188
	// ½
	// 00BD
	// 189
	// ¾
	// 00BE
	// 190
	// ¿
	// 00BF
	// 191
	//
	// C_
	// À
	// 00C0
	// 192
	// Á
	// 00C1
	// 193
	// Â
	// 00C2
	// 194
	// Ã
	// 00C3
	// 195
	// Ä
	// 00C4
	// 196
	// Å
	// 00C5
	// 197
	// Æ
	// 00C6
	// 198
	// Ç
	// 00C7
	// 199
	// È
	// 00C8
	// 200
	// É
	// 00C9
	// 201
	// Ê
	// 00CA
	// 202
	// Ë
	// 00CB
	// 203
	// Ì
	// 00CC
	// 204
	// Í
	// 00CD
	// 205
	// Î
	// 00CE
	// 206
	// Ï
	// 00CF
	// 207
	//
	// D_
	// Ð
	// 00D0
	// 208
	// Ñ
	// 00D1
	// 209
	// Ò
	// 00D2
	// 210
	// Ó
	// 00D3
	// 211
	// Ô
	// 00D4
	// 212
	// Õ
	// 00D5
	// 213
	// Ö
	// 00D6
	// 214
	// ×
	// 00D7
	// 215
	// Ø
	// 00D8
	// 216
	// Ù
	// 00D9
	// 217
	// Ú
	// 00DA
	// 218
	// Û
	// 00DB
	// 219
	// Ü
	// 00DC
	// 220
	// Ý
	// 00DD
	// 221
	// Þ
	// 00DE
	// 222
	// ß
	// 00DF
	// 223
	//
	// E_
	// à
	// 00E0
	// 224
	// á
	// 00E1
	// 225
	// â
	// 00E2
	// 226
	// ã
	// 00E3
	// 227
	//
	// å
	// 00E5
	// 229
	// æ
	// 00E6
	// 230
	// ç
	// 00E7
	// 231
	// è
	// 00E8
	// 232
	// é
	// 00E9
	// 233
	// ê
	// 00EA
	// 234
	// ë
	// 00EB
	// 235
	// ì
	// 00EC
	// 236
	// í
	// 00ED
	// 237
	// î
	// 00EE
	// 238
	// ï
	// 00EF
	// 239
	//
	// F_
	//
	// ð
	// 00F0
	// 240
	// ñ
	// 00F1
	// 241
	// ò
	// 00F2
	// 242
	// ó
	// 00F3
	// 243
	// ô
	// 00F4
	// 244
	// õ
	// 00F5
	// 245
	// ö
	// 00F6
	// 246
	// ÷
	// 00F7
	// 247
	// ø
	// 00F8
	// 248
	// ù
	// 00F9
	// 249
	// ú
	// 00FA
	// 250
	// û
	// 00FB
	// 251

	// ý
	// 00FD
	// 253
	// þ
	// 00FE
	// 254
	// ÿ
	// 00FF
	// 255

	public static Rectangle2D setHeight(Rectangle2D r, double height) {
		return new Rectangle2D(r.getMinX(), r.getMinY(), r.getWidth(), height);
	}

	public static Rectangle2D setSize(Rectangle2D r, double width, double height) {
		return new Rectangle2D(r.getMinX(), r.getMinY(), width, height);
	}

	public static Rectangle2D setWidth(Rectangle2D r, double width) {
		return new Rectangle2D(r.getMinX(), r.getMinY(), width, r.getHeight());
	}

	public static Rectangle2D setX(Rectangle2D r, double x) {
		return new Rectangle2D(x, r.getMinY(), r.getWidth(), r.getHeight());
	}

	public static Rectangle2D setY(Rectangle2D r, double y) {
		Rectangle2D r2 = new Rectangle2D(r.getMinX(), y, r.getWidth(), r.getHeight());
		return r2;
	}

	public static Rectangle2D setPosition(Rectangle2D r, double x, double y) {
		return new Rectangle2D(x, y, r.getWidth(), r.getHeight());
	}

	public static Rectangle2D addX(Rectangle2D r, double x) {
		if (x == 0) {
			return r;
		}
		return new Rectangle2D(r.getMinX() + x, r.getMinY(), r.getWidth(), r.getHeight());
	}

	public static Rectangle2D addY(Rectangle2D r, double y) {

		if (y == 0) {
			return r;
		}
		return new Rectangle2D(r.getMinX(), r.getMinY() + y, r.getWidth(), r.getHeight());
	}

	public static Rectangle2D copy(Rectangle2D r) {
		return new Rectangle2D(r.getMinX(), r.getMinY(), r.getWidth(), r.getHeight());
	}

	public static int getIndex(XmlObject xmlObject, boolean onlySameType) {
		Node node = xmlObject.getDomNode();
		String nodeName = node.getNodeName();
		Node parentNode = node.getParentNode();
		NodeList nodeList = parentNode.getChildNodes();
		int index = 0;
		int length = nodeList.getLength();

		int ind = 0;
		Node prev = node.getPreviousSibling();

		if (onlySameType) {
			for (int i = 0; i < length; i++) {
				Node node2 = nodeList.item(i);
				String nodeName2 = node2.getNodeName();
				if (nodeName.equals(nodeName2)) {
					if (node2 == node) {
						return index;
					}
					index++;
				}
			}
		} else {
			while (prev != null) {
				prev = prev.getPreviousSibling();
				ind++;
			}
			return ind;
			// for (index = 0; index < length; index++) {
			// Node node2 = nodeList.item(index);
			// if (node2 == node) {
			// if(ind!=index){
			// System.
			// }
			// return index;
			// }
			// }
		}
		return 0;
	}

	// /**
	// * @param key
	// * @return
	// */
	// public static List<IToolComponent> findEditorToolComponents(String key) {
	// List<IToolComponent> editorToolComponents = new
	// ArrayList<IToolComponent>();
	// if (JO.officePane.getToolRegistry() != null) {
	// List<ITool> editorTools = JO.officePane.getToolRegistry()
	// .findTools(key);
	// for (ITool editorTool : editorTools) {
	// editorToolComponents.add((IToolComponent) editorTool
	// .getToolComponent());
	// }
	// }
	// return editorToolComponents;
	// }

	// /**
	// * @param key
	// * @return
	// */
	// public static List<IToolComponent> findToolComponents(String key) {
	// List<IToolComponent> toolComponents = new ArrayList<IToolComponent>();
	// List<IToolComponent> c = findEditorToolComponents(key);
	// if (c != null) {
	// toolComponents.addAll(c);
	// }
	//
	// List<ITool> officeTools = JO.officePane.getToolRegistry()
	// .findTools(key);
	// if (officeTools != null) {
	// for (ITool officeTool : officeTools) {
	// toolComponents.add((IToolComponent) officeTool
	// .getToolComponent());
	// }
	// }
	//
	// List<IToolComponent> topToolComponents = findTopTools(key);
	// toolComponents.addAll(topToolComponents);
	// return toolComponents;
	// }

	// /**
	// * @return
	// */
	// public static List<IToolComponent> findTopTools(String key) {
	// List<IToolComponent> tools = new ArrayList<IToolComponent>();
	// List<IToolComponent> topTools = JO.officePane.getTopTools()
	// .getToolComponents();
	// for (IToolComponent topTool : topTools) {
	// if (topTool != null && topTool.getEntry() != null
	// && topTool.getEntry().getKey().equals(key)) {
	// tools.add((IToolComponent) topTool);
	// }
	// }
	// return tools;
	// }

	// /**
	// * @param key
	// * @return
	// */
	// public static List<ITool> findEditorTools(String key) {
	// List<ITool> editorTools = new ArrayList<ITool>();
	// if (JO.officePane.getToolRegistry() == null) {
	// return null;
	// }
	// ITool[] tools = JO.officePane.getToolRegistry().findAllTools(key);
	// for (ITool joTool : tools) {
	// editorTools.add(joTool);
	// }
	// return editorTools;
	// }

	/**
	 * @param xmlObjects
	 * @param progress
	 */
	public static void sortXmlObjects(List<XmlObject> xmlObjects) {
		Rcpl.profile();
		Collections.sort(xmlObjects, new Comparator<XmlObject>() {
			@Override
			public int compare(XmlObject o1, XmlObject o2) {
				if (getIndex(o1, false) < getIndex(o2, false)) {
					return -1;
				}
				return 1;
			}
		});
		Rcpl.profileEnd();
	}

	// /**
	// * @param key
	// * @return
	// */
	// public static boolean getBooleanGuiState(String key) {
	// List<IToolComponent> tools = findToolComponents(key);
	// if (!tools.isEmpty()) {
	// return tools.get(0).isSelected();
	// }
	// return false;
	// }

	// /**
	// * @param key
	// * @return
	// */
	// public static int getComboGuiState(String key) {
	// List<IToolComponent> tools = findToolComponents(key);
	// if (!tools.isEmpty() && tools.get(0) instanceof IComboTool) {
	// return (Integer) ((IComboTool) tools.get(0)).getState();
	// }
	// return 0;
	// }

	// /**
	// * @param key
	// * @return
	// */
	// public static String getStringGuiState(String key) {
	// List<IToolComponent> tools = findEditorToolComponents(key);
	// if (!tools.isEmpty() && tools.get(0) instanceof ITextable) {
	// return ((ITextable) tools.get(0)).getText();
	// }
	// return null;
	// }

	// /**
	// * @param key
	// * @param text
	// */
	// public static void setStringGuiState(String key, String text) {
	// List<IToolComponent> tools = findEditorToolComponents(key);
	// if (!tools.isEmpty() && tools.get(0) instanceof ITextable) {
	// ((ITextable) tools.get(0)).setText(text);
	// }
	// }

	// /**
	// * @param key
	// * @param en
	// */
	// @SuppressWarnings("rawtypes")
	// public static void setComboGuiState(String key, Enum en) {
	// List<IToolComponent> tools = findEditorToolComponents(key);
	// if (!tools.isEmpty() && tools.get(0) instanceof IComboTool) {
	// ((IComboTool) tools.get(0)).setSelect(en);
	// }
	// }

	/**
	 * Get the PackagePart that is the target of a relationship.
	 * 
	 * @param rel
	 *            The relationship
	 * @param pkg
	 *            The package to fetch from
	 * @return The target part
	 * @throws InvalidFormatException
	 */
	public static PackagePart getTargetPart(OPCPackage pkg, PackageRelationship rel) throws InvalidFormatException {
		PackagePartName relName = PackagingURIHelper.createPartName(rel.getTargetURI());
		PackagePart part = pkg.getPart(relName);
		if (part == null) {
			throw new IllegalArgumentException("No part found for relationship " + rel); //$NON-NLS-1$
		}
		return part;
	}

	/**
	 * Copy the input stream into the output stream.
	 * 
	 * @param inStream
	 *            The source stream.
	 * @param outStream
	 *            The destination stream.
	 * @return <b>true</b> if the operation succeed, else return <b>false</b>.
	 */
	public static byte[] copyStreamTyByteArray(InputStream inStream) {
		try {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = inStream.read(buffer)) >= 0) {
				os.write(buffer, 0, bytesRead);
			}
			os.flush();
			os.close();
			return os.toByteArray();
		} catch (Exception e) {
			return new byte[0];
		}
	}

	public static int imageHandles = 0;

	/**
	 * @param xml
	 * @param rel
	 * @return
	 * @throws InvalidFormatException
	 */
	public static PackagePart getTargetPart(XWPFDocument xml, PackageRelationship rel) throws InvalidFormatException {
		return getTargetPart(xml.getPackage(), rel);
	}

	public static PackagePart[] getRelatedByType(XWPFDocument xml, String contentType) throws InvalidFormatException {
		PackageRelationshipCollection partsC = xml.getPackagePart().getRelationshipsByType(contentType);

		PackagePart[] parts = new PackagePart[partsC.size()];
		int count = 0;
		for (PackageRelationship rel : partsC) {
			parts[count] = getTargetPart(xml, rel);
			count++;
		}
		return parts;
	}

	/**
	 * Returns the styles object used
	 */
	public static CTOfficeStyleSheet getThemes(XWPFDocument xml) throws XmlException, IOException {
		PackagePart[] parts;
		try {
			// parts = getRelatedByType(xml, XWPFRelation.STYLES.getRelation());

			String s = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/theme"; //$NON-NLS-1$
			parts = getRelatedByType(xml, s);

		} catch (InvalidFormatException e) {
			throw new IllegalStateException(e);
		}
		if (parts.length != 1) {
			throw new IllegalStateException("" + parts.length); //$NON-NLS-1$
		}

		ThemeDocument themeDocument = ThemeDocument.Factory.parse(parts[0].getInputStream());
		CTOfficeStyleSheet theme = themeDocument.getTheme();

		return theme;
	}

	/**
	 * Returns the styles object used
	 */
	public static CTFontsList getFontTable(XWPFDocument xml) throws XmlException, IOException {
		PackagePart[] parts;
		try {
			parts = getRelatedByType(xml, XWPFRelation.FONT_TABLE.getRelation());
		} catch (InvalidFormatException e) {
			throw new IllegalStateException(e);
		}
		if (parts.length != 1) {
			throw new IllegalStateException("" + parts.length); //$NON-NLS-1$
		}

		FontsDocument fd = FontsDocument.Factory.parse(parts[0].getInputStream());
		return fd.getFonts();
	}

	/**
	 * @return
	 */
	public static boolean isWindows() {
		String os = System.getenv("os"); //$NON-NLS-1$
		return os.toLowerCase().indexOf("windows") != -1; //$NON-NLS-1$
	}

	public static File getUserLocalArea() {
		return RCPLModel.mobileProvider.getApplicationDir();
	}

	/**
	 * @return
	 */
	public static File getUserLocalTempArea() {
		File result = new File(RCPLModel.mobileProvider.getApplicationDir(), "temp");
		result.mkdirs();
		return result;
	}

	/**
	 * @return
	 */
	public static File getUserLocalCacheDir() {
		if (userLocalCacheDir == null) {
			userLocalCacheDir = new File(RCPLModel.mobileProvider.getApplicationDir(), "cache"); //$NON-NLS-1$
			userLocalCacheDir.mkdirs();
		}
		return userLocalCacheDir;
	}

	/**
	 * 
	 */
	public static void deleteOldLockFiles() {
		for (int i = 1; i < 10; i++) {
			File lockFile = new File(getUserLocalArea(), "joffice" + i + ".lock"); //$NON-NLS-1$//$NON-NLS-2$
			if (lockFile.exists()) {
				long diff = System.currentTimeMillis() - lockFile.lastModified();
				if (diff > 3000) {
					lockFile.delete();
				}
			}
		}
	}

	private static int instanceNumber;

	public static File lockFile;

	// /**
	// * @param officePane
	// * @return
	// */
	// public static File getPropertyFile() {
	//
	// instanceNumber = 1;
	// if (JO.officePane != null && JO.officePane.getContainer() != null) {
	// instanceNumber = JO.officePane.getContainer().getNumber();
	// }
	//
	// // ---------- get a new number for a new started office ----------------
	//
	// if (instanceNumber == 0) {
	// for (int i = 1; i < 4; i++) {
	// lockFile = new File(getUserLocalArea(), "joffice" + i + ".lock");
	// //$NON-NLS-1$//$NON-NLS-2$
	// if (!lockFile.exists()) {
	// instanceNumber = i;
	// JO.officePane.getContainer().setNumber(i);
	// break;
	// }
	// }
	// if (instanceNumber == 0) {
	// // MessageDialog.openError(new Shell(), Messages.JOUtil_Error,
	// // Messages.JOUtil_TooManyOfficeOpened);
	// System.exit(1);
	//
	// }
	// writeLockFile();
	// return new File(getUserLocalArea(),
	// "joffice" + instanceNumber + ".properties"); //$NON-NLS-1$ //$NON-NLS-2$
	// }
	//
	// return new File(getUserLocalArea(),
	// "joffice" + instanceNumber + ".properties"); //$NON-NLS-1$ //$NON-NLS-2$
	// }

	/**
	 * @param num
	 * @return
	 */
	public static File getPropertyFile(int num) {
		return new File(getUserLocalArea(), "rcpl" + num + ".properties"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	// public static ISpreadsheetTopTools getSpreadsheetTopTools() {
	// IOfficePane op = JO.officePane;
	// if (op != null) {
	// ITopTools tt = op.getTopTools();
	// if (tt instanceof ISpreadsheetTopTools) {
	// return (ISpreadsheetTopTools) tt;
	// }
	// }
	// return null;
	// }

	// /**
	// *
	// */
	// public static void writeLockFile() {
	// if (JO.officePane.getContainer() != null) {
	// int number = JO.officePane.getContainer().getNumber();
	// if (number > 0) {
	// // File lockFile = new File(getUserLocalArea(),
	// // "joffice" + number + ".lock"); //$NON-NLS-1$//$NON-NLS-2$
	// FileOutputStream fo;
	// try {
	// fo = new FileOutputStream(lockFile);
	// fo.close();
	// } catch (FileNotFoundException e) {
	// } catch (IOException e) {
	// }
	// }
	// }
	// }

	@SuppressWarnings("unused")
	private static File getDefaultPropertyFile() {
		return new File(getUserLocalArea(), "rcpl.properties"); //$NON-NLS-1$
	}

	public static File getOOXMLRegistryFile() {
		return new File(getUserLocalArea(), "rcpl.dat"); //$NON-NLS-1$
	}

	/**
	 * // * //
	 */
	// public static void deleteLocklFile() {
	// if (JO.officePane.getContainer() != null) {
	// int number = JO.officePane.getContainer().getNumber();
	// if (number != 0) {
	// File lockF = new File(getUserLocalArea(),
	// "joffice" + number + ".lock"); //$NON-NLS-1$//$NON-NLS-2$
	// if (lockF.exists()) {
	// lockF.delete();
	// }
	// }
	// }
	// }

	// /**
	// * @return
	// */
	// public static JOInstanceDB getInstanceDB() {
	// getPropertyFile();
	// JOInstanceDB instanceDB = null;
	// switch (instanceNumber) {
	// case 1:
	// instanceDB = getInstanceDB1();
	// break;
	// case 2:
	// instanceDB = getInstanceDB2();
	// break;
	// case 3:
	// instanceDB = getInstanceDB3();
	// break;
	// default:
	// break;
	// }
	// // if (getPropertyFile().exists()) {
	// // getPropertyFile().delete();
	// // }
	// return instanceDB;
	// }
	//
	// private static JODefaultDB defaultDB;
	//
	// private static JOInstanceDB instanceDB1;
	//
	// private static JOInstanceDB instanceDB2;
	//
	// private static JOInstanceDB instanceDB3;
	//
	// public static JODefaultDB getDefaultDB() {
	// if (defaultDB == null) {
	// defaultDB = new JODefaultDB();
	// }
	// // File f = JOUtil.getDefaultPropertyFile();
	// // if (f.exists()) {
	// // f.delete();
	// // }
	// return defaultDB;
	// }

	// public static JOInstanceDB getInstanceDB1() {
	// if (instanceDB1 == null) {
	// instanceDB1 = new JOInstanceDB(1);
	// }
	// return instanceDB1;
	// }
	//
	// public static JOInstanceDB getInstanceDB2() {
	// if (instanceDB2 == null) {
	// instanceDB2 = new JOInstanceDB(2);
	// }
	// return instanceDB2;
	// }
	//
	// public static JOInstanceDB getInstanceDB3() {
	// if (instanceDB3 == null) {
	// instanceDB3 = new JOInstanceDB(3);
	// }
	// return instanceDB3;
	// }

	private static void remove(Properties properties, String key) {
		// if (properties == getInstanceProperties()) {
		// getInstanceDB().remove(key);
		// } else if (properties == getDefaultProperties()) {
		// getDefaultDB().remove(key);
		// } else
		{
			properties.remove(key);
		}
	}

	public static void removeByValue(Properties properties, String value) {
		// if (properties == getInstanceProperties()) {
		// getInstanceDB().removeByValue(value);
		// } else if (properties == getDefaultProperties()) {
		// getDefaultDB().removeByValue(value);
		// } else
		{
			for (Object o : properties.keySet()) {
				if (o instanceof String) {
					String v = (String) properties.get(o);
					if (v.equals(value)) {
						properties.remove(o);
					}
				}
			}
		}
	}

	private static File userLocalCacheDir;

	// /**
	// * @param key
	// * @return
	// */
	// public static List<String> getAllInstancePropertiesLike(String key) {
	// getInstanceProperties();
	// return getInstanceDB().getLike(key);
	// }

	// /**
	// * @return
	// */
	// public static boolean isProductElderBrowser() {
	// String p = JOConfigStrings.product;
	// return p.equals("SeniorBrowser"); //$NON-NLS-1$
	// }

	// ---------- properties ---------------------------------------------------

	public static Object get(Properties properties, Object key) {
		// if (properties == getInstanceProperties()) {
		// return getInstanceDB().get((String) key);
		// } else if (properties == getDefaultProperties()) {
		// return getDefaultDB().get((String) key);
		// }
		return properties.get(key);
	}

	private static void put(Properties properties, Object key, Object value) {
		// if (properties == getInstanceProperties()) {
		// getInstanceDB().put((String) key, (String) value);
		// } else if (properties == getDefaultProperties()) {
		// getDefaultDB().put((String) key, (String) value);
		// }
		properties.put(key, value);
	}

	public static boolean IS_IDE = false;

	protected static final PackageAccess defaultPackageAccess = PackageAccess.READ_WRITE;

	private static final int PROPERTY_VERSION = 7;

	private static Properties instanceProperties;

	private static File installDir;

	/**
	 * 
	 */
	public static void updateSetupFields() {
		String idx = (String) get(defaultProperties, "infotab/actions/editor/show_measurements_in_units_of"); //$NON-NLS-1$
		int index = 1;
		if (idx != null) {
			try {
				index = Integer.valueOf(idx);
				if (index >= 0) {
					defaultMeasurementUnits = EnMeasurementUnits.valueOf(index);
				}
			} catch (Exception ex) {
			}
		}
	}

	public static EnMeasurementUnits defaultMeasurementUnits = EnMeasurementUnits.CM;

	/**
	 * @return
	 */
	@SuppressWarnings("unused")
	private static boolean migrateProperties() {
		// int version = getDefaultInteger("property_version"); //$NON-NLS-1$
		// if (version != PROPERTY_VERSION) {
		// // officeProperties.clear();
		// initDefaultProperties();
		// setDefaultProperty("property_version", PROPERTY_VERSION);
		// //$NON-NLS-1$
		// }
		//
		// // wenn es sich um die gleiche art von migration handelt, einfach
		// // version aendern, ansonsten alle migs nacheinander durchfuehren
		// // (mit den aeltesten beginnen).
		//
		// int migrationVersion = JOUiConfig.getVersion(0, 8, 11, 15);
		// Object migration = get(defaultProperties,
		// JO.REGISTRY_PROPERTIES_MIGRATION + migrationVersion);
		// if (migration == null) {
		// put(defaultProperties, JO.REGISTRY_PROPERTIES_MIGRATION
		// + migrationVersion, "OK"); //$NON-NLS-1$
		// removeAllDefaultProperties(JO.REGISTRY_RECENTLY_BROWSED_URL);
		// removeAllDefaultProperties(JO.REGISTRY_RECENTLY_USED_DOCUMENTS);
		// removeAllDefaultProperties(JO.REGISTRY_FAVORITE_URL);
		// for (int i = 1; i <= 3; i++) {
		// Properties properties = getOfficeInstanceProperties(i);
		// if (properties != null) {
		// removeAllProperties(properties,
		// JO.REGISTRY_RECENTLY_BROWSED_URL);
		// removeAllProperties(properties,
		// JO.REGISTRY_RECENTLY_USED_DOCUMENTS);
		// removeAllProperties(properties, JO.REGISTRY_BOOKMARK_URL);
		// removeAllProperties(properties, JO.REGISTRY_FAVORITE_URL);
		// }
		// }
		// instanceProperties = null;
		// return true;
		// }
		return false;
	}

	/**
	 * 
	 */
	private static void initDefaultProperties() {
		if (RcplConfig.preferenceColor_1 == null) {
			RcplConfig.preferenceColor_1 = (int[]) RcplConfig.getEditorColors()[5];
		}
		;
		if (RcplConfig.preferenceColor_2 == null) {
			RcplConfig.preferenceColor_2 = (int[]) RcplConfig.getEditorColors()[5];
		}
		;
		if (RcplConfig.preferenceColor_3 == null) {
			RcplConfig.preferenceColor_3 = (int[]) RcplConfig.getEditorColors()[5];
		}

		setDefaultIfNull("infotab/actions/color/show_background_images", false); //$NON-NLS-1$
		setDefaultIfNull(IColorProvider.COLOR_MAIN_OFFICE_COLOR, 164 + "," + 196 + "," + 246); //$NON-NLS-1$ //$NON-NLS-2$
		setDefaultIfNull("profile_mode", 0); //$NON-NLS-1$
		setDefaultIfNull("spreadsheet/actions/editor/grid", true); //$NON-NLS-1$
		setDefaultIfNull("infotab/actions/editor/generated_password_length", 10); //$NON-NLS-1$
		setDefaultIfNull("word/actions/editor/match_case", true); //$NON-NLS-1$

		setDefaultIfNull("infotab/actions/color/show_background_images", false); //$NON-NLS-1$
		setDefaultIfNull("profile_mode", 0); //$NON-NLS-1$
		setDefaultIfNull("spreadsheet/actions/editor/grid", true); //$NON-NLS-1$

		setDefaultIfNullOrEmpty("infotab/actions/setup/setup_browser_url_home", "http://google.com"); //$NON-NLS-1$ //$NON-NLS-2$
		setDefaultIfNullOrEmpty("infotab/actions/setup/setup_search_url_1", //$NON-NLS-1$
				"http://www.google.co.uk/search?q=" + Rcpl.TEMPLATEVAR_1 + "&ie=utf-8&oe=utf-8&aq=t"); //$NON-NLS-1$ //$NON-NLS-2$
		setDefaultIfNullOrEmpty("infotab/actions/setup/setup_search_url_2", //$NON-NLS-1$
				"http://uk.search.yahoo.com/search?p=" + Rcpl.TEMPLATEVAR_1 + "&ei=UTF-8&fr=chrf-ytbm"); //$NON-NLS-1$ //$NON-NLS-2$
		setDefaultIfNullOrEmpty("infotab/actions/setup/setup_search_url_3", //$NON-NLS-1$
				"http://www.amazon.co.uk/s?ie=UTF8&tag=firefox-uk-21&index=blended&link_code=qs&field-keywords=" //$NON-NLS-1$
						+ Rcpl.TEMPLATEVAR_1 + ""); //$NON-NLS-1$
		setDefaultIfNullOrEmpty("infotab/actions/setup/setup_search_url_4", //$NON-NLS-1$
				"http://www.answers.com/main/ntquery?s=" + Rcpl.TEMPLATEVAR_1 + "&gwp=13"); //$NON-NLS-1$ //$NON-NLS-2$
		setDefaultIfNullOrEmpty("infotab/actions/setup/setup_search_url_5", //$NON-NLS-1$
				"http://www.chambersharrap.co.uk/chambers/features/chref/chref.py/main?query=" + Rcpl.TEMPLATEVAR_1 //$NON-NLS-1$
						+ "&title=21st"); //$NON-NLS-1$
		setDefaultIfNullOrEmpty("infotab/actions/setup/setup_search_url_6", //$NON-NLS-1$
				"http://search.creativecommons.org/?q=" + Rcpl.TEMPLATEVAR_1 + "&sourceid=Mozilla-search"); //$NON-NLS-1$ //$NON-NLS-2$
		setDefaultIfNullOrEmpty("infotab/actions/setup/setup_search_url_7", //$NON-NLS-1$
				"http://shop.ebay.co.uk/i.html?_nkw=" + Rcpl.TEMPLATEVAR_1 + "&_armrs=1&_from=&_ipg="); //$NON-NLS-1$ //$NON-NLS-2$
		setDefaultIfNullOrEmpty("infotab/actions/setup/setup_search_url_8", //$NON-NLS-1$
				"http://en.wikipedia.org/wiki/" + Rcpl.TEMPLATEVAR_1 + ""); //$NON-NLS-1$ //$NON-NLS-2$
		setDefaultIfNullOrEmpty("infotab/actions/setup/setup_search_url_9", //$NON-NLS-1$
				"http://www.youtube.com/results?search_query=" + Rcpl.TEMPLATEVAR_1 + "&aq=f"); //$NON-NLS-1$ //$NON-NLS-2$
		// infotab/actions/setup/setup_search_url
		int index;

		index = 1;

		setDefaultIfNull("browser/actions/browser/search_engine_default_" + index, true); //$NON-NLS-1$
		setIfNull("browser/actions/browser/search_engine_default_" + index, true); //$NON-NLS-1$

		setDefaultIfNull("infotab/actions/setup/setup_my_web_host", JOSession.getDefault().codeBase); //$NON-NLS-1$ //$NON-NLS-2$
		setDefaultIfNull("infotab/actions/setup/setup_my_web_port", 8088); //$NON-NLS-1$

		RcplCountry country = RcplCountry.getCountry(Locale.getDefault());
		initDefaultProperties(country);
	}

	/**
	 * @param country
	 */
	public static void initDefaultProperties(RcplCountry country) {

		// ---------- us -------------------------------------------------------

		if (country.equals(RcplCountry.UNITED_STATES)
				|| country.equals(RcplCountry.UNITED_STATES_MINOR_OUTLYING_ISLANDS)

		) {
			setDefaultIfNull("infotab/actions/editor/default_page_size", //$NON-NLS-1$
					EnPageSize.LETTER.ordinal());
			setDefaultIfNull("infotab/actions/editor/show_measurements_in_units_of", 0); //$NON-NLS-1$

			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_mail", "http://gmail.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_news", "http://nbc.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_messenger", "http://webmessenger.yahoo.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_finance", "http://finance.yahoo.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_maps", "http://maps.google.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_sports", "http://www.skysports.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_travel", "http://www.thomascook.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_weather", "http://weather.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_cars", "http://www.whatcar.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_answers", "http://www.answers.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_dating", "http://www.datingforseniors.com/"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_games", "http://www.games.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_groups", "http://groups.google.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_horoscopes", "http://www.horoscopes.co.uk"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_lifestyle", "http://uk.lifestyle.yahoo.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_health", "http://uk.reuters.com/news/health"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_video", "http://www.youtube.com/"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_radio", "http://www.live365.com/index.live"); //$NON-NLS-1$//$NON-NLS-2$
		}

		// ---------- uk -------------------------------------------------------

		else {
			setDefaultIfNull("infotab/actions/editor/default_page_size", //$NON-NLS-1$
					EnPageSize.A4.ordinal());
			setDefaultIfNull("infotab/actions/editor/show_measurements_in_units_of", 1); //$NON-NLS-1$

			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_mail", "http://gmail.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_news", "http://bbc.co.uk"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_messenger", "http://webmessenger.yahoo.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_finance", "http://finance.yahoo.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_maps", "http://maps.google.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_sports", "http://www.skysports.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_travel", "http://www.thomascook.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_weather", "http://news.bbc.co.uk/weather"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_cars", "http://www.whatcar.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_answers", "http://www.answers.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_dating", "http://www.seniordatinggroup.co.uk/"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_games", "http://www.games.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_groups", "http://groups.google.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_horoscopes", "http://www.horoscopes.co.uk"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_lifestyle", "http://uk.lifestyle.yahoo.com"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_health", "http://www.bbc.co.uk/health/"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_video", "http://www.youtube.com/"); //$NON-NLS-1$//$NON-NLS-2$
			setDefaultIfNullOrEmpty("infotab/actions/setup/setup_site_radio", //$NON-NLS-1$
					"http://www.bbc.co.uk/iplayer/console/bbc_radio_one"); //$NON-NLS-1$
		}
	}

	/**
	 * @return
	 */
	public static int getGeneratedPasswordsLength() {
		int length = getDefaultInteger("infotab/actions/editor/generated_password_length"); //$NON-NLS-1$
		if (length == 0) {
			length = 10;
		}
		return length;
	}

	/**
	 * @param key
	 * @return
	 */
	public static long getDefaultLong(String key) {
		String result = (String) get(getDefaultProperties(), key);
		if (result == null) {
			return 0;
		}
		return Long.valueOf(result);
	}

	/**
	 * @param key
	 * @return
	 */
	public static int getDefaultInteger(String key) {
		String result = (String) get(getDefaultProperties(), key);
		if (result == null) {
			return 0;
		}
		return Integer.valueOf(result);
	}

	/**
	 * @param key
	 * @return
	 */
	public static boolean getDefaultBoolean(String key) {
		String result = (String) get(getDefaultProperties(), key);
		if (result == null) {
			return false;
		}
		return "t".equals(result) ? true : false; //$NON-NLS-1$
	}

	/**
	 * @param key
	 * @return
	 */
	public static String getDefaultString(String key) {
		String result = (String) get(getDefaultProperties(), key);
		return result;
	}

	private static Properties defaultProperties;

	/**
	 * @return
	 */
	public static Properties getDefaultProperties() {
		if (defaultProperties == null) {
			defaultProperties = new Properties();
			// try {
			// File f = JOUtil.getDefaultPropertyFile();
			// if (f.exists()) {
			// defaultProperties.load(new FileInputStream(f));
			// }
			// } catch (FileNotFoundException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
			// } catch (IOException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
			// }
			initDefaultProperties();
			updateSetupFields();

			// if (migrateProperties()){
			// return getDefaultProperties();
			// }

			if (defaultProperties == null) {
				return getDefaultProperties();
			}

		}

		return defaultProperties;
	}

	/**
	 * @param key
	 * @param value
	 * @param save
	 */
	public static void set(String key, Object value) {
		if (value instanceof Boolean) {
			if (key.startsWith("word/actions/groups/styles")) { //$NON-NLS-1$
				return;
			}
			put(getInstanceProperties(), key, ((Boolean) value) ? "t" : "f"); //$NON-NLS-1$//$NON-NLS-2$
		} else {
			put(getInstanceProperties(), key, value.toString());
		}
	}

	/**
	 * @param key
	 * @param value
	 * @param save
	 */
	public static void setDefaultProperty(String key, Object value) {
		if (value instanceof Boolean) {
			if (key.startsWith("word/actions/groups/styles")) { //$NON-NLS-1$
				return;
			}
			put(getDefaultProperties(), key, ((Boolean) value) ? "t" : "f"); //$NON-NLS-1$//$NON-NLS-2$
		} else {
			put(getDefaultProperties(), key, value.toString());
		}
	}

	/**
	 * @param key
	 * @param value
	 * @param save
	 */
	public static void setIfNull(String key, Object value) {
		if (get(getInstanceProperties(), key) == null) {
			set(key, value);
		}
	}

	public static void setDefaultIfNull(String key, Object value) {
		if (get(getDefaultProperties(), key) == null) {
			setDefaultProperty(key, value);
		}
	}

	public static void setDefaultIfNullOrEmpty(String key, Object value) {
		Object oldValue = get(getDefaultProperties(), key);
		if (oldValue == null || oldValue instanceof String && ((String) oldValue).length() == 0) {
			setDefaultProperty(key, value);
		}
	}

	/**
	 * @param key
	 * @return
	 */
	public static String getString(String key) {
		String result = (String) get(getInstanceProperties(), key);
		return result;
	}

	/**
	 * @param key
	 * @return
	 */
	public static boolean getBoolean(String key) {
		String result = (String) get(getInstanceProperties(), key);
		if (result == null) {
			return false;
		}
		return "t".equals(result) ? true : false; //$NON-NLS-1$
	}

	/**
	 * @param key
	 * @return
	 */
	public static int getInteger(String key) {
		String result = (String) get(getInstanceProperties(), key);
		if (result == null) {
			return 0;
		}
		return Integer.valueOf(result);
	}

	public static float getFloat(String s) {
		float result = 0.0f;
		if (s == null) {
			return result;
		}
		if (s.endsWith("f")) { //$NON-NLS-1$
			s = s.substring(0, s.length() - 1);
		}
		try {
			return Float.valueOf(s);
		} catch (Exception ex) {

		}
		return result;
	}

	public static double getDouble(String key) {
		String result = (String) get(getInstanceProperties(), key);
		if (result == null) {
			return 0.0;
		}
		if (result.endsWith("d")) { //$NON-NLS-1$
			result = result.substring(0, result.length() - 1);
		}
		try {
			return Double.valueOf(result);
		} catch (Exception ex) {

		}
		return 0.0;
	}

	/**
	 * @param key
	 * @return
	 */
	public static long getLong(String key) {
		String result = (String) get(getInstanceProperties(), key);
		if (result == null) {
			return 0;
		}
		return Long.valueOf(result);
	}

	public static void remove(String key) {
		remove(getInstanceProperties(), key);
	}

	// /**
	// * @param matchKey
	// */
	// public static void removeAllDefaultProperties(String matchKey) {
	// List<String> keys = getDefaultDB().getKeysLike(matchKey);
	// for (String key : keys) {
	// remove(defaultProperties, key);
	// }
	// }

	/**
	 * If a shell container is used then all properties will be linked to that.
	 * Otherwise there is only one set.
	 * 
	 * @return
	 */
	public static Properties getInstanceProperties() {
		if (instanceProperties == null) {
			instanceProperties = new Properties();
			// try {
			// File file = JOUtil.getPropertyFile();
			// instanceProperties.load(new FileInputStream(file));
			// } catch (FileNotFoundException e) {
			// } catch (IOException e) {
			// }
			initProperties();
			int version = getInteger("property_version"); //$NON-NLS-1$
			if (version != PROPERTY_VERSION) {
				instanceProperties.clear();
				set("property_version", PROPERTY_VERSION); //$NON-NLS-1$
				// try {
				// instanceProperties.load(new FileInputStream(
				// getDefaultPropertyFile()));
				// } catch (FileNotFoundException e) {
				// } catch (IOException e) {
				// }
				initProperties();
			}
			// if (migrateProperties()) {
			// return getInstanceProperties();
			// }
			if (instanceProperties == null) {
				return getInstanceProperties();
			}
		}
		return instanceProperties;
	}

	public static Properties getOfficeInstanceProperties(int num) {
		Properties properties = new Properties();
		initProperties();
		return properties;

		// try {
		// File file = JOUtil.getPropertyFile(num);
		// properties.load(new FileInputStream(file));
		// initProperties();
		// return properties;
		// } catch (FileNotFoundException e) {
		// } catch (IOException e) {
		// }
		// return null;
	}

	/**
	 * 
	 */
	public static void initProperties() {

		if (RcplConfig.preferenceColor_1 == null) {
			RcplConfig.preferenceColor_1 = (int[]) RcplConfig.getEditorColors()[5];
		}
		;
		if (RcplConfig.preferenceColor_2 == null) {
			RcplConfig.preferenceColor_2 = (int[]) RcplConfig.getEditorColors()[5];
		}
		;
		if (RcplConfig.preferenceColor_3 == null) {
			RcplConfig.preferenceColor_3 = (int[]) RcplConfig.getEditorColors()[5];
		}

		int number = 1;
		// if (JO.officePane != null && JO.officePane.getContainer() != null) {
		// number = JO.officePane.getContainer().getNumber();
		// }
		switch (number) {
		case 1:
			setIfNull(IColorProvider.COLOR_MAIN_OFFICE_COLOR, RcplConfig.preferenceColor_1[0] + "," //$NON-NLS-1$
					+ RcplConfig.preferenceColor_1[1] + "," + RcplConfig.preferenceColor_1[2]); //$NON-NLS-1$
			break;
		case 2:
			setIfNull(IColorProvider.COLOR_MAIN_OFFICE_COLOR, RcplConfig.preferenceColor_2[0] + "," //$NON-NLS-1$
					+ RcplConfig.preferenceColor_2[1] + "," + RcplConfig.preferenceColor_2[2]); //$NON-NLS-1$
			break;
		case 3:
			setIfNull(IColorProvider.COLOR_MAIN_OFFICE_COLOR, RcplConfig.preferenceColor_3[0] + "," //$NON-NLS-1$
					+ RcplConfig.preferenceColor_3[1] + "," + RcplConfig.preferenceColor_3[2]); //$NON-NLS-1$
			break;
		}
		setIfNull("infotab/actions/color/show_background_images", false); //$NON-NLS-1$
		setIfNull("profile_mode", 0); //$NON-NLS-1$
		setIfNull("spreadsheet/actions/editor/grid", true); //$NON-NLS-1$

		setIfNull("infotab/actions/setup/setup_browser_url_home", "http://google.com"); //$NON-NLS-1$ //$NON-NLS-2$
		setIfNull("infotab/actions/setup/setup_search_url_1", //$NON-NLS-1$
				"http://www.google.co.uk/search?q=" + Rcpl.TEMPLATEVAR_1 + "&ie=utf-8&oe=utf-8&aq=t"); //$NON-NLS-1$ //$NON-NLS-2$
		setIfNull("infotab/actions/setup/setup_search_url_2", //$NON-NLS-1$
				"http://uk.search.yahoo.com/search?p=" + Rcpl.TEMPLATEVAR_1 + "&ei=UTF-8&fr=chrf-ytbm"); //$NON-NLS-1$ //$NON-NLS-2$
		setIfNull("infotab/actions/setup/setup_search_url_3", //$NON-NLS-1$
				"http://www.amazon.co.uk/s?ie=UTF8&tag=firefox-uk-21&index=blended&link_code=qs&field-keywords=" //$NON-NLS-1$
						+ Rcpl.TEMPLATEVAR_1 + ""); //$NON-NLS-1$
		setIfNull("infotab/actions/setup/setup_search_url_4", //$NON-NLS-1$
				"http://www.answers.com/main/ntquery?s=" + Rcpl.TEMPLATEVAR_1 + "&gwp=13"); //$NON-NLS-1$ //$NON-NLS-2$
		setIfNull("infotab/actions/setup/setup_search_url_5", //$NON-NLS-1$
				"http://www.chambersharrap.co.uk/chambers/features/chref/chref.py/main?query=" + Rcpl.TEMPLATEVAR_1 //$NON-NLS-1$
						+ "&title=21st"); //$NON-NLS-1$
		setIfNull("infotab/actions/setup/setup_search_url_6", //$NON-NLS-1$
				"http://search.creativecommons.org/?q=" + Rcpl.TEMPLATEVAR_1 + "&sourceid=Mozilla-search"); //$NON-NLS-1$ //$NON-NLS-2$
		setIfNull("infotab/actions/setup/setup_search_url_7", //$NON-NLS-1$
				"http://shop.ebay.co.uk/i.html?_nkw=" + Rcpl.TEMPLATEVAR_1 + "&_armrs=1&_from=&_ipg="); //$NON-NLS-1$ //$NON-NLS-2$
		setIfNull("infotab/actions/setup/setup_search_url_8", //$NON-NLS-1$
				"http://en.wikipedia.org/wiki/" + Rcpl.TEMPLATEVAR_1 + ""); //$NON-NLS-1$ //$NON-NLS-2$
		setIfNull("infotab/actions/setup/setup_search_url_9", ""); //$NON-NLS-1$//$NON-NLS-2$

		setIfNull("infotab/actions/setup/setup_my_web_host", JOSession.getDefault().codeBase); //$NON-NLS-1$ //$NON-NLS-2$
		setIfNull("infotab/actions/setup/setup_my_web_port", 8088); //$NON-NLS-1$

		RcplCountry country = RcplCountry.getCountry(Locale.getDefault());
		if (country.equals(RcplCountry.UNITED_STATES)
				|| country.equals(RcplCountry.UNITED_STATES_MINOR_OUTLYING_ISLANDS)

		) {
			setIfNull("infotab/actions/editor/default_page_size", //$NON-NLS-1$
					EnPageSize.LETTER.ordinal());
		} else {
			setIfNull("infotab/actions/editor/default_page_size", //$NON-NLS-1$
					EnPageSize.A4.ordinal());
		}

	}

	/**
	 * @param matchKey
	 */
	public static void removeAllInstanceProperties(String matchKey) {
		Enumeration<Object> keys = instanceProperties.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			if (key.startsWith(matchKey)) {
				remove(instanceProperties, key);
			}
		}
	}

	/**
	 * @param properties
	 * @param matchKey
	 */
	public static void removeAllProperties(Properties properties, String matchKey) {
		Enumeration<Object> keys = properties.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			if (key.startsWith(matchKey)) {
				remove(properties, key);
			}
		}
	}

	/**
	 * @param properties
	 * @param key
	 * @param value
	 * @param save
	 */
	public static void setProperty(Properties properties, String key, String value) {
		put(properties, key, value);
	}

	// /**
	// * @param key
	// * @return
	// */
	// public static List<String> getAllDefaultPropertiesLike(String key) {
	// getDefaultProperties();
	// return getDefaultDB().getLike(key);
	//
	// // List<String> values = new ArrayList<String>();
	// // Set<Object> keys = getDefaultOfficeProperties().keySet();
	// // for (Object object : keys) {
	// // if (((String) object).startsWith(key)) {
	// // values.add(object + "," //$NON-NLS-1$
	// // + (String) getDefaultOfficeProperties().get(object));
	// // }
	// // }
	// // return values;
	// }

	/**
	 * @param properties
	 * @param key
	 * @return
	 */
	// public static List<String> getAllPropertiesLike(Properties properties,
	// String key) {
	//
	// if (properties == getInstanceProperties()) {
	// return getInstanceDB().getLike(key);
	// } else if (properties == getDefaultProperties()) {
	// return getDefaultDB().getLike(key);
	// } else {
	//
	// List<String> values = new ArrayList<String>();
	// Set<Object> keys = properties.keySet();
	// for (Object object : keys) {
	// if (((String) object).startsWith(key)) {
	// values.add(object + "," //$NON-NLS-1$
	// + (String) properties.get(object));
	// }
	// }
	// return values;
	// }
	// }
	//
	// public static List<String> getAllPropertyKeysLike(Properties properties,
	// String key) {
	// if (properties == getInstanceProperties()) {
	// return getInstanceDB().getKeysLike(key);
	// } else if (properties == getDefaultProperties()) {
	// return getDefaultDB().getKeysLike(key);
	// } else {
	// List<String> values = new ArrayList<String>();
	// Set<Object> keys = properties.keySet();
	// for (Object object : keys) {
	// if (((String) object).startsWith(key)) {
	// values.add(object + "," //$NON-NLS-1$
	// + (String) properties.get(object));
	// }
	// }
	// return values;
	// }
	// }
	//
	/**
	 * @return
	 */
	public static File getInstallDir() {
		if (installDir == null) {
			String classPath = System.getProperty("java.class.path", "."); //$NON-NLS-1$//$NON-NLS-2$
			String os = System.getProperty("os.name"); //$NON-NLS-1$
			String separator = ";"; //$NON-NLS-1$
			if (!os.toLowerCase().startsWith("windows")) { //$NON-NLS-1$
				separator = ":"; //$NON-NLS-1$
			}
			String[] classPathElements = classPath.split(separator);
			for (String cl : classPathElements) {
				if (cl.indexOf("ooxml.jar") != -1) { //$NON-NLS-1$
					File f = new File(cl);
					installDir = f.getParentFile();
					break;
				} else if (cl.indexOf("org.eclipse.rcpl.app\\bin") != -1) { //$NON-NLS-1$
					File f = new File(cl);
					installDir = new File(f.getParentFile().getParentFile(),
							"org.eclipse.rcpl.build/installer/components"); //$NON-NLS-1$
				}
			}
		}
		return installDir;

	}

	/**
	 * @return
	 */
	public static File getLogFile() {
		File file = new File(getInstallDir(), "joffice.log"); //$NON-NLS-1$
		if (file.exists()) {
			return file;
		}
		file = new File(getInstallDir(), "xulrunner/joffice.log"); //$NON-NLS-1$
		if (file.exists()) {
			return file;
		}
		file = new File(getInstallDir(), "../../../org.eclipse.rcpl.app/joffice.log"); //$NON-NLS-1$
		if (file.exists()) {
			return file;
		}
		return null;
	}

	/**
	 * @return
	 */
	public static File getInkscapeProgram() {
		return new File(getInstallDir(), "inkscape/inkscape_portable.exe");// inkscape_portable.exe"); //$NON-NLS-1$
	}

	/**
	 * @param s
	 * @return
	 */
	public static String createMD5(String s, boolean removeDashesAndSpaces) {
		if (removeDashesAndSpaces) {
			s = s.replaceAll(" ", ""); //$NON-NLS-1$//$NON-NLS-2$
			s = s.replaceAll("-", ""); //$NON-NLS-1$ //$NON-NLS-2$
		}
		MessageDigest algorithm;
		try {
			algorithm = MessageDigest.getInstance("MD5"); //$NON-NLS-1$
			algorithm.reset();
			algorithm.update(s.getBytes());
			byte messageDigest[] = algorithm.digest();
			StringBuffer hexString = new StringBuffer();
			for (int i = 0; i < messageDigest.length; i++) {
				hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
			}
			// String foo = messageDigest.toString();
			return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
	}

	// /**
	// * @param templateResourceName
	// * @return
	// */
	// public static InputStream loadSvgTemplate(String templateResourceName) {
	// return loadLibTemplate("/com/joffice/ui/resources/svg/" //$NON-NLS-1$
	// + templateResourceName + ".svg"); //$NON-NLS-1$
	// }

	/**
	 * @param is
	 * @return
	 * @throws IOException
	 */
	public static String convertStreamToString(InputStream is) {
		if (is != null) {
			StringBuilder sb = new StringBuilder();
			String line;
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8")); //$NON-NLS-1$
				while ((line = reader.readLine()) != null) {
					sb.append(line).append("\n"); //$NON-NLS-1$
				}
			} catch (IOException ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
			} finally {
				try {
					is.close();
				} catch (IOException e) {
					// LOGGER.error("", e); //$NON-NLS-1$
				}
			}
			return sb.toString();
		}
		return ""; //$NON-NLS-1$

	}

	/**
	 * @param templateResourceName
	 * @return
	 */
	public static String loadTemplateAsString(String templateResourceName) {
		InputStream is = loadTemplate(templateResourceName);
		return convertStreamToString(is);
	}

	// /**
	// * @param templateResourceName
	// * @return
	// */
	// public static InputStream loadLibTemplate(String templateResourceName) {
	// InputStream is = RcplResourcesPlugin.class
	// .getResourceAsStream(templateResourceName);
	// return is;
	// }

	public static InputStream loadTemplate(String templateResourceName) {
		InputStream is = Rcpl.class.getResourceAsStream(Rcpl.getDefaultTemplatesPath() + templateResourceName); // $NON-NLS-1$
		return is;
	}

	/**
	 * @param layoutObjects
	 * @param progress
	 */
	public static void sortRootObjects(List<ILayoutObject> layoutObjects) {
		indexAllRootObjects(layoutObjects);
		Collections.sort(layoutObjects, new Comparator<ILayoutObject>() {
			@Override
			public int compare(ILayoutObject o1, ILayoutObject o2) {
				if (o1.getIndex() < o2.getIndex()) {
					return -1;
				}
				return 1;
			}
		});
	}

	/**
	 * @param editorFigure
	 */
	public static void indexAllRootObjects(List<ILayoutObject> layoutObjects) {

		ILayoutObject firstRootObject = null;
		for (ILayoutObject l : layoutObjects) {
			if (l.isRootObject()) {
				firstRootObject = l;
				break;
			}
		}
		Node firstNode = null;
		if (firstRootObject != null) {
			XmlObject startNode = firstRootObject.getXmlObject();
			firstNode = startNode.getDomNode().getParentNode().getFirstChild();
			Node next = firstNode;
			int ind = 0;
			while (next != null) {
				for (ILayoutObject l : layoutObjects) {
					if (next == l.getXmlObject().getDomNode()) {
						l.setXmlIndex(ind);
						break;
					}
				}
				next = next.getNextSibling();
				ind++;
			}
		}
	}

	/**
	 * @param in
	 * @param out
	 * @throws IOException
	 */
	public static final String copyInputStream(InputStream in, OutputStream out, boolean escapeHtml)
			throws IOException {
		if (in == null) {
			return null;
		}
		byte[] buffer = new byte[1024];
		byte[] buffer2 = new byte[1024 * 3];

		int len;
		while ((len = in.read(buffer)) >= 0) {

			if (escapeHtml) {
				escapeHtml(out, buffer, buffer2, len);
			} else {
				out.write(buffer, 0, len);
			}
		}

		String result = "";
		if (out instanceof StringOutputStream) {
			out.flush();
			result = out.toString();

		}

		in.close();
		out.close();
		return result;
	}

	/**
	 * @param out
	 * @param buffer
	 * @param buffer2
	 * @param len
	 * @throws IOException
	 */
	private static void escapeHtml(OutputStream out, byte[] buffer, byte[] buffer2, int len) throws IOException {
		for (int i = 0, j = 0; i < len; i++, j++) {

			boolean found = false;
			for (int k = 0; k < CP1252_ESCAPE.length; k++) {
				if (buffer[i] == (Byte) CP1252_ESCAPE[k][0]) {
					String s = (String) CP1252_ESCAPE[k][1];
					byte[] bytes = s.getBytes();
					buffer2[j++] = bytes[0];
					buffer2[j++] = bytes[1];
					buffer2[j++] = bytes[2];
					buffer2[j++] = bytes[3];
					buffer2[j++] = bytes[4];
					buffer2[j] = bytes[5];
					found = true;
					break;
				}
			}

			// if (buffer[i] == (byte) 0xfc) {
			// buffer2[j++] = '&';
			// buffer2[j++] = 'u';
			// buffer2[j++] = 'u';
			// buffer2[j++] = 'm';
			// buffer2[j++] = 'l';
			// buffer2[j] = ';';
			// } else {
			// buffer2[j] = buffer[i];
			// }

			if (!found) {
				buffer2[j] = buffer[i];
			}

		}
		out.write(buffer2, 0, len);
	}

	/**
	 * @param in
	 * @param out
	 * @throws IOException
	 */
	public static final String copyInputStream(InputStreamReader in, OutputStreamWriter out) throws IOException {

		if (in == null) {
			return null;
		}
		char[] buffer = new char[1024];
		int len;
		while ((len = in.read(buffer)) >= 0) {
			out.write(buffer, 0, len);
		}

		in.close();

		return out.toString();
	}

	public static float round(double val, int rpl) {
		return round((float) val, rpl);
	}

	/**
	 * @param Rval
	 * @param Rpl
	 * @return
	 */
	public static float round(float val, int rpl) {
		float p = (float) Math.pow(10, rpl);
		val = val * p;
		float tmp = Math.round(val);
		return tmp / p;
	}

	/**
	 * @param inFile
	 * @param outFile
	 * @throws IOException
	 */
	public static final void copyFile(File inFile, File outFile, boolean escapeHtml) throws IOException {
		FileInputStream fis = new FileInputStream(inFile);
		copyInputStream(fis, new FileOutputStream(outFile), escapeHtml);
	}

	public static final void copyInputStream(InputStream is, File outFile, boolean escapeHtml) throws IOException {
		copyInputStream(is, new FileOutputStream(outFile), escapeHtml);
	}

	public static final File copyFileFromUrlToCache(URL url, boolean escapeHtml) {
		String fileName = url.getFile();
		InputStream is;
		try {
			is = url.openStream();
		} catch (IOException e1) {
			return null;
		}
		File outFile = new File(getUserLocalCacheDir(), fileName);
		outFile.getParentFile().mkdirs();
		try {
			copyInputStream(is, new FileOutputStream(outFile), escapeHtml);
		} catch (FileNotFoundException e) {
			return null;
		} catch (IOException e) {
			return null;
		}
		return outFile;
	}

	/**
	 * @param is
	 * @param fileName
	 * @return
	 */
	public static final File copyInputStreamToCache(InputStream is, File outFile) {
		outFile.getParentFile().mkdirs();
		try {
			copyInputStream(is, new FileOutputStream(outFile), false);
		} catch (FileNotFoundException e) {
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return outFile;
	}

	/**
	 * @param is
	 * @param fileName
	 * @return
	 */
	public static final File copyInputStreamToCache(InputStream is, String fileName) {
		File outFile = new File(getUserLocalCacheDir(), fileName);
		outFile.getParentFile().mkdirs();
		try {
			copyInputStream(is, new FileOutputStream(outFile), false);
		} catch (FileNotFoundException e) {
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return outFile;
	}

	/**
	 * @param fileName
	 * @return
	 */
	public static long getCachedFileSize(String fileName) {
		File file = new File(getUserLocalCacheDir(), fileName);
		if (file.exists()) {
			return file.length();
		}
		return 0;
	}

	/**
	 * @param fileName
	 * @return
	 */
	public static File getCachedFile(String fileName) {
		File file = new File(getUserLocalCacheDir(), fileName);
		if (file.exists()) {
			return file;
		}
		return null;
	}

	/**
	 * @param is
	 * @param fileName
	 * @return
	 */
	public static final File copyByteArrayToCache(byte[] byteArray, String fileName) {
		File outFile = new File(getUserLocalCacheDir(), fileName);
		outFile.getParentFile().mkdirs();
		try {
			OutputStream os = new FileOutputStream(outFile);
			os.write(byteArray);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return outFile;
	}

	/**
	 * @param templateResourceName
	 * @return
	 */
	public static File loadTemplateDocumentToFile(String name, boolean escapeHtml) {

		String path = Rcpl.getDefaultTemplatesPath() + name;
		InputStream is = JOUtil2.class.getResourceAsStream(path); // $NON-NLS-1$
		if (is == null) {
			return null;
		}
		File outFile = new File(JOUtil2.getUserLocalTempArea(),
				// "temp_" + new Date().getTime() + "_" +
				name);
		try {
			JOUtil2.copyInputStream(is, outFile, escapeHtml);

		} catch (Throwable e) {
			RCPLModel.logError(e);
		}

		return outFile;
	}

	public static File loadTemplateDocumentToTempFile(String name, boolean escapeHtml) {
		File outFile = new File(JOUtil2.getUserLocalTempArea(),
				// "temp_" + new Date().getTime() + "_" +
				name);
		loadTemplateDocumentToFile(name, outFile, escapeHtml);
		return outFile;
	}

	/**
	 * @param templateResourceName
	 * @return
	 */
	public static void loadTemplateDocumentToFile(String name, File outFile, boolean escapeHtml) {
		InputStream is = JOUtil2.class.getResourceAsStream(Rcpl.getDefaultTemplatesPath() + name); // $NON-NLS-1$
		try {
			JOUtil2.copyInputStream(is, outFile, escapeHtml);
		} catch (IOException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}
	}

	public static String loadTemplateHTMLDocument(String name, HashMap<String, String> wordReplacements,
			boolean escapeHtml) {

		InputStream is = JOUtil2.class.getResourceAsStream(Rcpl.getDefaultTemplatesPath() + name); // $NON-NLS-1$

		// InputStreamReader r;
		// OutputStreamWriter w;

		try {
			// r = new InputStreamReader(is, Charset.forName("windows-1252"));

			StringOutputStream out = new StringOutputStream();
			// w = new OutputStreamWriter(out, Charset.forName("UTF-8"));

			try {
				String htmlText = JOUtil2.copyInputStream(is, out, escapeHtml);
				out.flush();
				out.close();
				htmlText = new String(htmlText.getBytes("windows-1252"));
				return htmlText;

			} catch (IOException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			}

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return null;
	}

	public static Rectangle2D union(Rectangle2D src1, Rectangle2D src2) {
		Rectangle2D result = null;
		double x1;
		double y1;
		double x2;
		double y2;

		if (src1 == null && src2 == null) {
			return null;
		} else if (src1 != null && src2 != null) {
			x1 = Math.min(src1.getMinX(), src2.getMinX());
			y1 = Math.min(src1.getMinY(), src2.getMinY());
			x2 = Math.max(src1.getMaxX(), src2.getMaxX());
			y2 = Math.max(src1.getMaxY(), src2.getMaxY());

		} else if (src1 != null) {
			x1 = src1.getMinX();
			y1 = src1.getMinY();
			x2 = src1.getMaxX();
			y2 = src1.getMaxY();

		} else {
			// only src2 is non-null
			x1 = src2.getMinX();
			y1 = src2.getMinY();
			x2 = src2.getMaxX();
			y2 = src2.getMaxY();

		}

		result = new Rectangle2D(x1, y1, x2 - x1, y2 - y1);
		return result;
	}

	// public static Response showConfirmDialog( Stage owner, String message,
	// String title ) {
	// VBox vb = new VBox();
	// Scene scene = new Scene( vb );
	// final Dialog dial = new Dialog( title, owner, scene, "res/Confirm.png" );
	// vb.setPadding( Layout.PADDING );
	// vb.setSpacing( Layout.SPACING );
	// Button yesButton = new Button( "Yes" );
	// yesButton.setOnAction( new EventHandler<ActionEvent>() {
	// @Override public void handle( ActionEvent e ) {
	// dial.close();
	// buttonSelected = Response.YES;
	// }
	// } );
	// Button noButton = new Button( "No" );
	// noButton.setOnAction( new EventHandler<ActionEvent>() {
	// @Override public void handle( ActionEvent e ) {
	// dial.close();
	// buttonSelected = Response.NO;
	// }
	// } );
	// BorderPane bp = new BorderPane();
	// HBox buttons = new HBox();
	// buttons.setAlignment( Pos.CENTER );
	// buttons.setSpacing( Layout.SPACING );
	// buttons.getChildren().addAll( yesButton, noButton );
	// bp.setCenter( buttons );
	// HBox msg = new HBox();
	// msg.setSpacing( Layout.SPACING_SMALL );
	// msg.getChildren().addAll( icon, new Message( message ) );
	// vb.getChildren().addAll( msg, bp );
	// dial.showDialog();
	// return buttonSelected;
	// }

}
