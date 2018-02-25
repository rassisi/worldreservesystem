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
package org.eclipse.rcpl;

public class RcplVersion {
	private static int major = 0;
	private static int minor = 4;
	private static int micro = 3;
	private static String qualifier = "1001";
	private static String version = major + "." + minor + "." + micro + " (" + qualifier + ")";

	public static String getVersion() {
		return version.replaceAll(" (@buildnumber@)", "");
	}
}
