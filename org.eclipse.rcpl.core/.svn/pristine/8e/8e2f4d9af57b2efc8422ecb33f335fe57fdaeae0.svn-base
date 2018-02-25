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

@SuppressWarnings("nls")
public class ACookie {

	protected String name;

	@SuppressWarnings("unused")
	private static String cookiesIni;
	private static final String COOKIES_RELATIVE_PATH = ".xplosion/cookies/cookies.ini";
	static {
		cookiesIni = System.getenv("USERPROFILE") + "/" + COOKIES_RELATIVE_PATH;
	}

	public static final String VALUE = "value";

	public ACookie(String pName, String pValue) {
		this.name = pName;
		setValue(pValue);
	}

	private ACookie(String pName) {
		this.name = pName;
	}

	public static ACookie findCookie(String name) {
		return new ACookie(name);
	}

	@SuppressWarnings("unused")
	public boolean setValue(String pValue) {
		// return AFile.setWiniFileValue(cookiesIni, name, VALUE, pValue);
		return false;
	}

	public String getValue() {
		// return AFile.getWiniFileValue(cookiesIni, name, VALUE);
		return "";
	}

	public boolean remove() {
		// boolean result = AFile.removeWiniFileSection(cookiesIni, name);
		// return result;

		return true;
	}

	public boolean exists() {
		String v = getValue();
		if (v != null && v.length() > 0) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ACookie cookie1 = new ACookie("session_id", "12345");
		ACookie cookie2 = new ACookie("taskbar_handle", "99999");
		ACookie cookie3 = new ACookie("session_id");
		cookie1.remove();
	}
}