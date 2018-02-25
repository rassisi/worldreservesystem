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

package org.eclipse.rcpl.upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.rcpl.IJOUpload;
import org.eclipse.rcpl.model.cdo.client.JOSession;

import com.caucho.hessian.client.HessianProxyFactory;

public class JOUploadClient {

	private final String host;

	final static String URL_STRING = "85.25.100.163:8080";

	public static String getURL() {
		try {
			URL url = new URL(JOSession.getDefault().codeBase);
			if ("localhost".equals(url.getHost())) {
				String res = url.getHost() + ":8080";
				return res;
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return URL_STRING;

	}

	public JOUploadClient(String host) {
		this.host = host;
	}

	public JOUploadClient() {
		this.host = getURL();
	}

	// public static void main(String[] args) throws Exception {
	//
	// File file = new File(
	// "C:/Users/ramin/Desktop/sanierung_bussestrasse_5a.docx");
	//
	// new JOUploadClient().upload("templates", "test3/", file);
	//
	// // System. out.("back from call");
	//
	// }

	static String uploadingFile;

	public void upload(final String user, final String path, final File file)
			throws MalformedURLException, FileNotFoundException {
		if (file.isFile()) {

			new Thread() {
				@Override
				public void run() {
					String url = "http://" + host + "/org.eclipse.rcpl.servlet/jo";
					HessianProxyFactory factory = new HessianProxyFactory();
					IJOUpload upload;
					try {
						upload = (IJOUpload) factory.create(IJOUpload.class, url);
						uploadingFile = path + file.getName();
						upload.upload(uploadingFile, user, new FileInputStream(file));
						uploadingFile = null;
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}.start();

		}
	}
}