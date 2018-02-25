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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class AString {

	// US-ASCII Seven-bit ASCII, a.k.a. ISO646-US, a.k.a. the Basic Latin block
	// of the Unicode character set
	@SuppressWarnings("nls")
	public static final String CHARSET_US_ASCII = "US-ASCII";
	// ISO-8859-1 ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1
	@SuppressWarnings("nls")
	public static final String CHARSET_ISO_8859_1 = "ISO-8859-1";
	// UTF-8 Eight-bit UCS Transformation Format
	@SuppressWarnings("nls")
	public static final String CHARSET_UTF_8 = "UTF-8";
	// UTF-16BE Sixteen-bit UCS Transformation Format, big-endian byte order
	@SuppressWarnings("nls")
	public static final String CHARSET_UTF_16BE = "UTF-16BE";
	// UTF-16LE Sixteen-bit UCS Transformation Format, little-endian byte order
	@SuppressWarnings("nls")
	public static final String CHARSET_UTF_16LE = "UTF-16LE";
	// UTF-16 Sixteen-bit UCS Transformation Format, byte order identified by an
	// optional byte-order mark
	@SuppressWarnings("nls")
	public static final String CHARSET_UTF_16 = "UTF-16";

	@SuppressWarnings("nls")
	public static void main(String[] args) {

		String test = "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert.\n"
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert."
				+ "Dies ist ein Test, um zu sehen, ob"
				+ "zip to string und umgekehrt funktioniert.";

		// byte[] zip = stringToZipUTF8(test);
		byte[] zip = stringToZipC(test, CHARSET_UTF_16BE);

		String result = "";
		try {
			// result = zipToStringUTF8(zip);
			result = zipToStringC(zip, CHARSET_UTF_16BE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System. out.println(test + "\n" + result);

	}

	@SuppressWarnings("nls")
	static public String extractXML(String text, String tag) {

		if (!tag.startsWith("<")) {
			tag = "<" + tag;
		}

		if (tag.endsWith(">")) {
			tag = tag.substring(0, tag.length() - 1);
		}

		int pos = text.indexOf(tag);

		String endTag = "</" + tag.substring(1, tag.length()) + ">";
		int endPos = text.indexOf(endTag);
		if (pos != -1 && endPos != -1) {
			endPos += (endTag.length());
			String result = new String(text.substring(pos, endPos));
			return result;
		}
		return "";
	}

	/**
	 * AString - Konstruktorkommentar.
	 */
	public AString() {
		super();
	}

	/*
	 * static public int toInt(String s){ try{ return
	 * Integer.valueOf(s).intValue(); } catch(Exception ex){ return 0; } return
	 * 0; }
	 */

	static public int toInt(String s) {
		int result = 0;
		try {
			result = Integer.valueOf(s).intValue();
		} catch (Exception ex) {
			result = 0;
		}

		return result;
	}

	@SuppressWarnings("nls")
	static public String getLeafName(String s) {
		String result = s;
		int pos = result.lastIndexOf(".");
		if (pos != -1) {
			result = s.substring(pos + 1, s.length());
		}
		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */

	@SuppressWarnings("nls")
	public static String afterKomma(String str, int nk_stellen, int precision_) {

		try {

			String result = str;
			String vorkomma = "";
			String nachkomma = "";

			int overflow = 0;

			for (int i = 0; i < nk_stellen; i++) {
				if (i == 0)
					overflow = 10;
				else
					overflow *= 10;
			}

			int pos1 = str.indexOf(".");

			double precision = precision_;
			double n2_2 = precision / 2.0;

			if (pos1 != -1) {
				vorkomma = str.substring(0, pos1);
				if (vorkomma.trim().equals(""))
					vorkomma = "0";
				double vk = Double.valueOf(vorkomma).doubleValue();
				nachkomma = str.substring(pos1 + 1, str.length());

				if (nachkomma.length() < nk_stellen) {
				} else {
					double nk1 = Double.valueOf(
							nachkomma.substring(0, nk_stellen)).doubleValue();
					double nk2 = 0;

					if (nachkomma.length() > nk_stellen) {
						nk2 = Double
								.valueOf(
										nachkomma.substring(nk_stellen,
												nk_stellen + 1)).doubleValue();
					}

					// int nk1n =
					// Integer.valueOf(nachkomma.substring(n-1,n)).intValue();
					if (nk2 > 4)
						nk1++;

					if (nk1 >= overflow) {
						nk1 = 0.0;
						if (vk < 0.0) {
							vk--;
						} else {
							vk++;
						}
					} else if (precision != 0) {

						double nk1modulo = nk1 % precision;
						if (nk1modulo < n2_2)
							nk1 -= nk1modulo;
						else
							nk1 += precision - nk1modulo;

						if (nk1 >= overflow) {
							nk1 = 0;
							if (vk < 0.0) {
								vk--;
							} else {
								vk++;
							}
						}
					}

					nachkomma = "" + (int) nk1;
					vorkomma = "" + (int) vk;

				}
			} else {
				vorkomma = str;
			}

			for (int i = 0; nachkomma.length() < nk_stellen; i++) {
				nachkomma += "0";
			}

			result = vorkomma + "." + nachkomma;

			return result;

		}

		catch (Exception ex) {
			return str;
		}

	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	public static String arrayToDotString(String[] str) {

		StringBuffer result = new StringBuffer(str[0]);

		for (int i = 1; i < str.length; i++) {
			result.append(str[i]);

		}
		return result.toString();
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String arrayToStringList(String[] strarray) {

		int i;
		StringBuffer result = new StringBuffer();

		for (i = 0; i < java.lang.reflect.Array.getLength(strarray); i++) {
			if (strarray[i] == null)
				break;
			result.append(strarray[i]);
			result.append(",");
		}

		return result.toString();
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String beginToEqualSign(String str) {

		int pos;

		String result = str;

		if (str != null) {

			if ((pos = str.indexOf("=")) != -1) {
				result = str.substring(0, pos).trim();
			}
		}

		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String beginToKomma(String str) {

		int pos;
		String result = str;

		if (result != null) {
			if ((pos = str.indexOf(",")) != -1) {
				result = str.substring(0, pos).trim();
			}
		}

		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	public static int count(String s1, String tok) {

		int pos = -1;
		int i;
		for (i = 0; (pos = s1.indexOf(tok, pos + 1)) != -1; i++)
			;
		return i;

	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */

	@SuppressWarnings("nls")
	public static String deleteToEndOfLine(String str, String tok) {

		int pos = -1;
		while ((pos = str.indexOf(tok)) != -1) {
			int pos2 = str.indexOf("\n", pos);
			String tok2 = "";
			if (pos2 != -1) {
				tok2 = str.substring(pos, pos2);
			} else {
				tok2 = str.substring(pos, str.length());
			}
			str = replace(str, tok2, "");

		}

		return str;

	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @return java.lang.String
	 * @param s
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String delToken(String text, String s) {
		return (replace(text, s, ""));
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @return java.lang.String
	 * @param s
	 *            java.lang.String
	 */
	public static String delToken(String text, String begin, String end) {
		int beginx = text.indexOf(begin);
		if (beginx == (-1))
			return text;
		int endx = text.indexOf(end, beginx) + end.length();
		if (endx == (-1))
			return text;

		String result = new String(text.substring(0, beginx)
				+ text.substring(endx, text.length()));
		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String equalSignToEnd(String str) {

		int pos;
		String result = "";

		if ((pos = str.indexOf("=")) != -1) {
			result = str.substring(pos + 1, str.length()).trim();
		}

		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @return java.lang.String
	 * @param s
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String getAlphaPart(String s) {

		String result = "";

		for (int i = 0; i < s.length(); i++) {
			String temp = s.substring(i, i + 1);
			if (temp.compareTo("0") >= 0 && temp.compareTo("9") <= 0) {
				break;
			}
			result += temp;

		}

		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @return java.lang.String
	 * @param s
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String getNumericPart(String s) {

		String result = "";
		String temp;
		int i = 0;

		for (; i < s.length(); i++) {
			temp = s.substring(i, i + 1);
			if (temp.compareTo("0") >= 0 && temp.compareTo("9") <= 0) {
				break;
			}
		}

		for (; i < s.length(); i++) {
			temp = s.substring(i, i + 1);
			if (temp.compareTo("0") >= 0 && temp.compareTo("9") <= 0) {
				result += temp;
			} else {
				break;
			}

		}

		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @return java.lang.String
	 * @param s
	 *            java.lang.String
	 */
	public static String getTokenBetween(String s, String s1, String s2) {
		int pos1;
		int pos2;
		String result = new String();

		pos1 = s.indexOf(s1);
		if (pos1 == -1)
			return result;
		pos2 = s.indexOf(s2);
		if (pos2 == -1)
			return result;
		result = s.substring(pos1 + s1.length(), pos2);
		return (result);
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @return java.lang.String
	 * @param htmlString
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String htmlToString(String htmlstring) {
		String result;

		result = replace(htmlstring, "&auml;", "ä");
		result = replace(htmlstring, "&ouml;", "ö");
		result = replace(htmlstring, "&uuml;", "ü");
		result = replace(htmlstring, "&Auml;", "Ä");
		result = replace(htmlstring, "&Ouml;", "Ö");
		result = replace(htmlstring, "&Uuml;", "Ü");
		result = replace(htmlstring, "&eacute;", "é");
		result = replace(htmlstring, "&egrave;", "è");
		result = replace(htmlstring, "&agrave;", "à");

		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String kommaToEnd(String str) {

		String result = str;

		try {
			int pos1 = str.indexOf(",");
			if (pos1 != -1) {
				result = str.substring(pos1 + 1, str.length()).trim();
			}
		} catch (Exception ex) {
			result = "";
		}

		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String kommaToEqualSign(String str) {

		String result = str;

		try {
			int pos1 = str.indexOf(",");
			int pos2 = str.indexOf("=");

			if (pos1 != -1) {
				if (pos2 != -1) {
					result = str.substring(pos1 + 1, pos2).trim();
				} else {
					result = str.substring(pos1 + 1, str.length()).trim();
				}
			} else {
				if (pos2 != -1) {
					result = str.substring(0, pos2).trim();
				}
			}
		} catch (Exception ex) {
			result = "";
		}

		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String makeEndsWithSlash(String str) {
		if (!str.endsWith("/") && !str.endsWith("\\")) {
			return str + "/";
		}
		return str;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String makesEndsWithSlash(String str) {
		if (!str.endsWith("/")) {
			return str + "/";
		}
		return str;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String[] newLineStringToStringArray(String str) {

		java.util.StringTokenizer tok = new java.util.StringTokenizer(str, "\n");

		String[] result = new String[tok.countTokens()];

		for (int i = 0; tok.hasMoreTokens(); i++) {
			result[i] = tok.nextToken();
		}
		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String normBlank(String str, int l, int corr) {

		while (str.length() > l) {
			l += corr;
		}

		while (str.length() < l) {
			str += " ";
		}
		return str;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String normCenteredBlank(String str, int l, int corr) {

		while (str.length() > l) {
			l += corr;
		}

		boolean toggel = false;

		while (str.length() < l) {
			if (toggel) {
				str = " " + str;
				toggel = false;
			} else {
				str += " ";
				toggel = true;
			}
		}
		return str;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String normRightBlank(String str, int l, int corr) {

		while (str.length() > l) {
			l += corr;
		}

		while (str.length() < l) {
			str = " " + str;
		}
		return str;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings({ "unused", "nls" })
	public static String replace(String str, String tok1, String tok2) {

		/*
		 * 
		 * if(tok2.equals("\n")){ tok2 = " \n"; }
		 */

		// 012345678
		/*
		 * str = "abc;;;abc";
		 * 
		 * tok1 = ";;"; tok2 = ";abc;";
		 */

		/*
		 * if(tok1.equals("")){ for(;str.index;){ } }
		 */

		if (str.length() == 0) {
			return str;
		}

		if (str.indexOf(tok1) == -1) {
			return str;
		}

		if (tok1 == null || tok1.length() == 0) {
			return str;
		}

		if (tok2.equals("")) {
			int pos = -1;
			for (; (pos = str.indexOf(tok1)) != -1;) {
				String s1 = str.substring(0, pos);
				String s2 = str.substring(pos + tok1.length(), str.length());
				str = s1 + s2;
			}
			return str;
		}

		int tok1_length = tok1.length();
		int tok2_length = tok2.length();

		// abc\t \t \t abc...
		// abc\t-\t-\t abc

		int pos1 = 0;
		int pos2 = 0;
		int pos3 = 0;

		while ((pos2 = str.indexOf(tok1, pos1)) != -1) {

			String s1 = "";
			String s2 = "";

			if (pos2 > 0) {
				s1 = str.substring(0, pos2);
			}

			pos1 = pos2 + tok1_length;
			s2 = str.substring(pos1, str.length());

			str = s1 + tok2 + s2;

		}

		return str;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @param str
	 *            java.lang.String
	 * @param tok1
	 *            java.lang.String
	 * @param tok2
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String[] stringListToArray(String str) {

		int i;
		int pos1;
		int pos2;
		int count;

		if (!str.endsWith(",")) {
			str = new String(str + ",");
		}

		for (count = 0, i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals(",")) {
				count++;
			}
		}

		String[] result = new String[count];

		for (pos1 = 0, i = 0; i < count;) {
			pos2 = str.indexOf(",", pos1);
			if (pos2 != -1) {
				result[i++] = new String(str.substring(pos1, pos2));
				pos1 = pos2 + 1;
			} else
				break;
		}

		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @return java.lang.String
	 * @param htmlString
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String stringToHtml(String htmlstring) {
		String result;

		result = replace(htmlstring, "ä", "&auml;");
		result = replace(result, "ö", "&ouml;");
		result = replace(result, "ü", "&uuml;");
		result = replace(result, "À", "&Auml;");
		result = replace(result, "Ö", "&Ouml;");
		result = replace(result, "Ü", "&Uuml;");
		result = replace(result, "é", "&eacute;");
		result = replace(result, "è", "&egrave;");
		result = replace(result, "à", "&agrave;");

		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @return java.lang.String
	 * @param htmlString
	 *            java.lang.String
	 */
	public static String stringToUtf8(String s) {
		String result = s;

		return result;

	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @return java.lang.String
	 * @param htmlString
	 *            java.lang.String
	 */
	@SuppressWarnings({ "rawtypes", "nls" })
	public static String[] vectorToStringArray(Vector v) {

		if (v != null && v.size() > 0) {

			String[] result = new String[v.size()];
			for (int i = 0; i < v.size(); i++) {
				try {
					result[i] = (String) v.get(i);
				} catch (Exception ex) {
					result[i] = "";
				}
			}

			return result;

		}

		return null;

	}

	public static String byteArrayToString(byte[] ba) {
		return byteArrayToStringC(ba, CHARSET_UTF_8);
	}

	public static String byteArrayToStringUTF8(byte[] ba) {
		return byteArrayToStringC(ba, Charset.defaultCharset().name());
	}

	public static String byteArrayToStringC(byte[] ba, String charset) {
		try {
			return new String(ba, charset);
		} catch (UnsupportedEncodingException e) {
			return new String(ba);
		}
	}

	public static byte[] stringToByteArray(String string) {
		return stringToByteArrayC(string, Charset.defaultCharset().name());
	}

	public static byte[] stringToByteArrayUTF8(String string) {
		return stringToByteArrayC(string, CHARSET_UTF_8);
	}

	public static byte[] stringToByteArrayC(String string, String charset) {
		try {
			return string.getBytes(charset);
		} catch (UnsupportedEncodingException e) {
			return string.getBytes();
		}
	}

	public static String zipToString(byte[] zip) throws Exception {
		return zipToStringC(zip, Charset.defaultCharset().name());
	}

	public static String zipToStringUTF8(byte[] zip) throws Exception {
		return zipToStringC(zip, CHARSET_UTF_8);
	}

	public static String zipToStringC(byte[] zip, String charset)
			throws Exception {
		return byteArrayToStringC(zipToByteArray(zip), charset);
	}

	public static String readCurrentZipEntryToString(ZipInputStream zipIn)
			throws Exception {
		return readCurrentZipEntryToStringC(zipIn, Charset.defaultCharset()
				.name());
	}

	public static String readCurrentZipEntryToStringUTF8(ZipInputStream zipIn)
			throws Exception {
		return readCurrentZipEntryToStringC(zipIn, CHARSET_UTF_8);
	}

	public static String readCurrentZipEntryToStringC(ZipInputStream zipIn,
			String charset) throws Exception {
		return byteArrayToStringC(readCurrentZipEntryToByteArray(zipIn),
				charset);
	}

	public static byte[] readCurrentZipEntryToByteArray(ZipInputStream zipIn)
			throws Exception {
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		byte[] buffer = new byte[2048];

		int len = 0;

		try {
			while ((len = zipIn.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
		} catch (EOFException ex) {
		}

		out.flush();
		out.close();
		return out.toByteArray();
	}

	public static byte[] zipToByteArray(byte[] zip) throws Exception {
		ByteArrayInputStream in = new ByteArrayInputStream(zip);
		ZipInputStream zipIn = new ZipInputStream(in);
		ZipEntry entry = zipIn.getNextEntry();
		if (entry == null) {
			return new byte[0];
		}

		byte[] ba = readCurrentZipEntryToByteArray(zipIn);

		zipIn.closeEntry();
		zipIn.close();

		return ba;
	}

	public static byte[] stringToZip(String string) {
		return stringToZipC(string, Charset.defaultCharset().name());
	}

	public static byte[] stringToZipUTF8(String string) {
		return stringToZipC(string, CHARSET_UTF_8);
	}

	public static byte[] stringToZipC(String string, String charset) {
		return byteArrayToZip(stringToByteArrayC(string, charset));
	}

	@SuppressWarnings("nls")
	public static byte[] byteArrayToZip(byte[] ba) {

		byte[] result = null;

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			ZipOutputStream zipOut = new ZipOutputStream(out);
			ZipEntry entry = new ZipEntry("default");
			zipOut.putNextEntry(entry);
			zipOut.write(ba);
			zipOut.flush();
			zipOut.close();
			result = out.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;

	}

	/**
	 * Converts comma separated value (csv) string into a list of strings.
	 * 
	 * @param csv
	 * @return
	 */
	@SuppressWarnings("nls")
	public static List<String> csvToList(String csv) {
		List<String> list = new ArrayList<String>();
		StringTokenizer tokenizer = new StringTokenizer(csv, ",");
		while (tokenizer.hasMoreTokens()) {
			String s = tokenizer.nextToken().trim();
			if (s.length() > 0)
				list.add(s);
		}

		return list;
	}

	/**
	 * Converts a list of strings into a comma separated value (csv) string.
	 * 
	 * @param strings
	 * @return
	 */
	@SuppressWarnings("nls")
	public static String listToCsv(List<String> strings) {
		StringBuffer buf = new StringBuffer();
		boolean first = true;
		for (String string : strings) {
			if (!first)
				buf.append(",");
			buf.append(string);
			first = false;
		}
		return buf.toString();
	}

	/**
	 * Checks whether the <code>string</code> is considered empty. Empty means
	 * that the string may contain whitespace, but no visible characters.
	 * 
	 * "\n\t " is considered empty, while " a" is not.
	 * 
	 * @param string
	 *            The string
	 * @return True if the string is null or ""
	 */
	public static boolean isEmpty(final CharSequence string) {
		return string == null || string.length() == 0
				|| string.toString().trim().length() == 0;
	}

}
