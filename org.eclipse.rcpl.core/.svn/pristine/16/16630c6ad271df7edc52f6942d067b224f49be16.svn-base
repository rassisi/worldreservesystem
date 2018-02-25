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
 * Insert the type's description here. Creation date: (30.11.99 16:08:17)
 * 
 * @author:
 */
public class ADate {
	/**
	 * ADate constructor comment.
	 */
	public ADate() {
		super();
	}

	/**
	 * Insert the method's description here. Creation date: (30.11.99 16:09:03)
	 * 
	 * @return java.lang.String
	 * @param inputDate
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String dateToEnglishOutputDate(String date) {
		String result = "";

		try {
			result = new String(date.substring(6, 8) + "."
					+ date.substring(4, 6) + "." + date.substring(0, 4));
			result = new String(date.substring(0, 4) + "/"
					+ date.substring(4, 6) + "/" + date.substring(6, 8));
		} catch (Exception e) {
		}

		if (result.compareTo("0000/00/00") == 0)
			result = "-";

		return result;
	}

	/**
	 * Insert the method's description here. Creation date: (30.11.99 16:09:03)
	 * 
	 * @return java.lang.String
	 * @param inputDate
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String dateToInputDate(String date) {
		String result = "";

		try {
			result = new String(date.substring(6, 8) + "."
					+ date.substring(4, 6) + "." + date.substring(0, 4));
		} catch (Exception e) {
		}

		return result;
	}

	/**
	 * Insert the method's description here. Creation date: (30.11.99 16:09:03)
	 * 
	 * @return java.lang.String
	 * @param inputDate
	 *            java.lang.String
	 */
	public static String dateToInternationalOutputDate(String date) {
		return dateToEnglishOutputDate(date);
	}

	/**
	 * Insert the method's description here. Creation date: (30.11.99 16:09:03)
	 * 
	 * @return java.lang.String
	 * @param inputDate
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String inputDateToDate(String input) {
		String result = "";

		try {
			result = new String(input.substring(6, 10) + input.substring(3, 5)
					+ input.substring(0, 2));
		} catch (Exception e) {
		}

		return result;
	}
}
