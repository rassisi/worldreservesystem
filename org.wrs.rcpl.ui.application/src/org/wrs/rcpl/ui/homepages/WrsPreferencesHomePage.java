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
package org.wrs.rcpl.ui.homepages;

import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.homepages.DefaultPreferencesHomePage;
import org.eclipse.rcpl.model_2_0_0.rcpl.HomePage;

/**
 * @author ramin
 *
 */
public class WrsPreferencesHomePage extends DefaultPreferencesHomePage {

	/**
	 * @param uic
	 * @param title
	 * @param image
	 */
	public WrsPreferencesHomePage(IRcplUic uic, HomePage modelHomePage) {
		super(uic, modelHomePage);
	}

}
