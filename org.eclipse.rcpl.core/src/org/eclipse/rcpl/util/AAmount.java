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
 * Insert the type's description here. Creation date: (30.11.99 17:48:15)
 * 
 * @author:
 */
public class AAmount {

	/**
	 * AAmount constructor comment.
	 */
	public AAmount() {
		super();
	}

	/**
	 * Insert the method's description here. Creation date: (30.11.99 17:49:17)
	 * 
	 * @return java.lang.String
	 * @param amount
	 *            java.lang.String
	 */
	@SuppressWarnings("nls")
	public static String getDisplayValue(String amount) {
		String result = amount;
		String decim1 = "";
		String decim2 = "";
		StringBuffer tok = new StringBuffer();

		int dotpos, pos;

		dotpos = amount.indexOf(".");
		if (dotpos < 0) {
			decim2 = "";
			decim1 = amount;
		} else {
			decim1 = new String(amount.substring(0, dotpos));
			decim2 = new String(amount.substring(dotpos + 1, amount.length()));
		}

		StringBuffer decim1x = new StringBuffer();

		for (pos = decim1.length(); pos > 0;) {

			if (pos <= 3) {
				tok = new StringBuffer(decim1.substring(0, pos));
				tok.reverse();
				decim1x.append(tok.toString());
				break;
			}

			tok = new StringBuffer(decim1.substring(pos - 3, pos));
			tok.reverse();
			decim1x.append(tok.toString() + "'");
			pos -= 3;
		}

		decim1x.reverse();
		if (decim2.compareTo("") == 0) {
			decim2 = new String("00");
		}

		result = new String(decim1x.toString() + "." + decim2);

		return result;
	}

}
