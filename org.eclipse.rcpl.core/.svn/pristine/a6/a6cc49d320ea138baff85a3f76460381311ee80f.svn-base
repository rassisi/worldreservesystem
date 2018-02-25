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

import org.eclipse.rcpl.util.JOUtil2;

/**
 * @author ramin
 * 
 */
public class RcplWebsiteLogin {

	public String url;
	public String user;
	public String password;

	/**
	 * @param masterPassword
	 * @return
	 */
	public String getPassword(String masterPassword) {
		String s = JOUtil2.createMD5(masterPassword + password, false);
		int l = JOUtil2.getGeneratedPasswordsLength();
		s = s.substring(0, l);
		return s;
	}

	/**
	 * 
	 */
	public void add() {
		// JOUtil.getWebsiteLogins().add(this);
		//		String loginString = url + "," + user + "," + password; //$NON-NLS-1$//$NON-NLS-2$
		// for (int i = 0; i < JO.MAX_LOGINS; i++) {
		// String s = JOUtil2.getDefaultString(JO.REGISTRY_WEBSITE_LOGIN + i);
		// if (loginString.equals(s)) {
		// return;
		// }
		// }
		// for (int i = 0; i < JO.MAX_LOGINS; i++) {
		// String s = JOUtil2.getDefaultString(JO.REGISTRY_WEBSITE_LOGIN + i);
		// if (s == null) {
		// JOUtil2.setDefaultProperty(JO.REGISTRY_WEBSITE_LOGIN + i,
		// loginString);
		// return;
		// }
		// }
	}

	/**
	 * @param url
	 * @return
	 */
	public static RcplWebsiteLogin find(String searchUrl) {
		//		int pos = searchUrl.indexOf("?"); //$NON-NLS-1$
		// if (pos != -1) {
		// searchUrl = searchUrl.substring(0, pos);
		// }
		// boolean googleLogin = false;
		//		if (searchUrl.equals("https://www.google.com/accounts/JOLogin") //$NON-NLS-1$
		// || searchUrl
		//						.equals("https://www.google.com/accounts/ServiceLogin") //$NON-NLS-1$
		// || searchUrl
		//						.equals("https://www.google.com/accounts/ServiceLoginAuth")) { //$NON-NLS-1$
		// googleLogin = true;
		// }
		// for (JOWebsiteLogin login : JOUtil.getWebsiteLogins()) {
		// String url0 = login.url;
		//			pos = url0.indexOf("?"); //$NON-NLS-1$
		// if (pos != -1) {
		// // https://www.google.com/accounts/ServiceLogin
		// // https://www.google.com/accounts/ServiceLoginAuth
		// url0 = url0.substring(0, pos);
		// }
		// if (url0.equals(searchUrl)) {
		// return login;
		// }
		// if (googleLogin) {
		//				if (url0.equals("https://www.google.com/accounts/JOLogin") //$NON-NLS-1$
		//						|| url0.equals("https://www.google.com/accounts/ServiceLogin") //$NON-NLS-1$
		//						|| url0.equals("https://www.google.com/accounts/ServiceLoginAuth")) { //$NON-NLS-1$
		// return login;
		// }
		//
		// }
		// }
		return null;
	}

}
