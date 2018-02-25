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
 * Insert the type's description here.
 * Creation date: (19.02.2002 15:37:16)
 * @author: 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import buffer

public class SystemUtil {
	/**
	 * System constructor comment.
	 */
	public SystemUtil() {
		super();
	}

	/**
	 * System constructor comment.
	 */
	@SuppressWarnings("nls")
	static public int exec(String cmd) {

		java.util.Properties systemProperties = System.getProperties();
		String osName = systemProperties.getProperty("os.name").toLowerCase();

		Runtime rt = Runtime.getRuntime();
		Process pr = null;

		try {
			if (osName.indexOf("windows") != -1) {
				pr = rt.exec("command.com /c " + cmd);
			} else {
				pr = rt.exec(cmd);
			}

			BufferedReader procout = new BufferedReader(new InputStreamReader(
					pr.getInputStream()));
			String line;
			while ((line = procout.readLine()) != null) {
				// System. out.println("  OUT< " + line);
			}
		} catch (IOException ex) {
		}

		/*
		 * if(pr!=null){ return pr.exitValue(); }
		 */

		return 0;

	}
}
