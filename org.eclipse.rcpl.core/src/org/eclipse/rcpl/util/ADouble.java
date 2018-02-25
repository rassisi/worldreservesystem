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
 * Insert the type's description here. Creation date: (28.11.2002 17:50:56)
 * 
 * @author:
 */
public class ADouble {

	/**
	 * ADouble constructor comment.
	 */
	public ADouble() {
		super();
	}

	@SuppressWarnings("nls")
	static public double round(double d, int nk, int precision) {

		String resultString = AString.afterKomma(d + "", nk, precision);
		double result = 0.0;

		try {
			result = Double.valueOf(resultString).doubleValue();
		} catch (Exception ex) {

		}

		return result;

	}
}
