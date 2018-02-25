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
 * Various character utilities.
 */
public class CharUtil {

	/**
	 * Converts char array into byte array. Chars are truncated to byte size.
	 *
	 * @param carr
	 *            char array to convert from
	 *
	 * @return byte array
	 */
	public static byte[] toByteArray(char[] carr) {
		if (carr == null) {
			return null;
		}
		byte[] barr = new byte[carr.length];
		for (int i = 0; i < carr.length; i++) {
			barr[i] = (byte) carr[i];
		}
		return barr;
	}

	/**
	 * Converts byte array to char array.
	 *
	 * @param barr
	 *            byte array to covnert from
	 *
	 * @return converted char array
	 */
	public static char[] toCharArray(byte[] barr) {
		if (barr == null) {
			return null;
		}
		char[] carr = new char[barr.length];
		for (int i = 0; i < barr.length; i++) {
			carr[i] = (char) barr[i];
		}
		return carr;
	}

	/**
	 * Match if character equals to any of the given character.
	 *
	 * @param c
	 *            input character
	 * @param match
	 *            array of matching characters
	 *
	 * @return <code>true</code> if characters match any chararacter from given
	 *         array, otherwise <code>false</code>
	 */
	public static boolean equals(char c, char[] match) {
		for (int i = 0; i < match.length; i++) {
			if (c == match[i]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Finds index of the first character in given array the matches any from
	 * the given set of characters.
	 *
	 * @param source
	 *            source to examine
	 * @param index
	 *            starting index
	 * @param match
	 *            array of characters to match
	 *
	 * @return index of matched character or -1
	 */
	public static int findFirstAny(char[] source, int index, char[] match) {
		for (int i = index; i < source.length; i++) {
			if (equals(source[i], match) == true) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Finds index of the first character in given array the differes from the
	 * given set of characters.
	 *
	 * @param source
	 *            source to examine
	 * @param index
	 *            starting index
	 * @param match
	 *            array of characters to match
	 *
	 * @return index of matched character or -1
	 */
	public static int findFirstDiff(char[] source, int index, char[] match) {
		for (int i = index; i < source.length; i++) {
			if (equals(source[i], match) == false) {
				return i;
			}
		}
		return -1;
	}

}