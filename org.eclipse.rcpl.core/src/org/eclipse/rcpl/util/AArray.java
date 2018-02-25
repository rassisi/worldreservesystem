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
public class AArray {
	/**
	 * AArray - Konstruktorkommentar.
	 */
	public AArray() {
		super();
	}

	public static int countTruesInBooleanArray(boolean[] inp) {
		int result = 0;

		for (int i = 0; inp != null && i < inp.length; i++) {
			if (inp[i] == true) {
				result++;
			}
		}
		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @return java.lang.Object[]
	 * @param x
	 *            java.lang.Object[]
	 */
	public static Object[] invers(Object[] x) {

		int i;
		int j;

		if (x == null)
			return null;

		int n = java.lang.reflect.Array.getLength(x);

		Object[] result = new Object[n];

		for (i = 0; i < n; i++) {
			if (x[i] == null)
				break;
		}
		if (i > 0)
			i--;

		for (j = 0; i >= 0; i--, j++) {
			result[j] = new Object();
			// x[i];
		}

		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @return java.lang.Object[]
	 * @param x
	 *            java.lang.Object[]
	 */
	public static String[] inversStringArray(String[] x) {

		int i;
		int j;

		if (x == null)
			return null;

		int n = java.lang.reflect.Array.getLength(x);

		String[] result = new String[n];

		for (i = 0; i < n; i++) {
			if (x[i] == null)
				break;
		}
		if (i > 0)
			i--;

		for (j = 0; i >= 0; i--, j++) {
			result[j] = new String(x[i]);
		}

		return result;
	}

	/**
	 * Diese Methode wurde in VisualAge erstellt.
	 * 
	 * @return java.lang.Object[]
	 * @param x
	 *            java.lang.Object[]
	 */
	public static String[] trimStringArray(String[] x) {

		int i;
		int j;

		if (x == null)
			return null;

		int n = java.lang.reflect.Array.getLength(x);

		for (i = 0; i < n; i++) {
			if (x[i] == null)
				break;
		}

		n = i;

		String[] result = new String[n];

		for (j = 0, i = 0; i < n; i++, j++) {
			result[j] = new String(x[i]);
		}

		return result;
	}
}
