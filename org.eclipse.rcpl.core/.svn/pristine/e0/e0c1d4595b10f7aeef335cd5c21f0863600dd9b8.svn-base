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
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.eclipse.rcpl.IDownload;
import org.eclipse.rcpl.util.JOUtil2;

import com.caucho.hessian.client.HessianProxyFactory;

/**
 * @author ramin
 *
 */
public class DownloadClient {

	private final String host;

	/**
	 * @param host
	 */
	public DownloadClient(String host) {
		this.host = host;
	}

	/**
	 * 
	 */
	public DownloadClient() {
		this.host = JOUploadClient.getURL();
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		new DownloadClient().download("templates", "test3/sanierung_bussestrasse_5a.docx");
		// System. out.("back from call");
	}

	/**
	 * @param user
	 * @param fileName
	 * @return
	 * @throws MalformedURLException
	 * @throws FileNotFoundException
	 */
	public File download(final String user, final String fileName) throws MalformedURLException, FileNotFoundException {

		if (JOUploadClient.uploadingFile != null && JOUploadClient.uploadingFile.equals(fileName)) {
			return null;
		}

		String url = "http://" + host + "/org.eclipse.rcpl.servlet/jodownload";
		HessianProxyFactory factory = new HessianProxyFactory();
		IDownload download;
		try {
			download = (IDownload) factory.create(IDownload.class, url);
			long cachedFileSize = JOUtil2.getCachedFileSize(fileName);
			byte[] bArray = download.download(fileName, user, cachedFileSize);
			if (bArray != null) {
				if (bArray.length == 1 && bArray[0] == -1) {
					return JOUtil2.getCachedFile(fileName);
				}
				return JOUtil2.copyByteArrayToCache(bArray, fileName);
			} else {
				return null;
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {

		}
		return null;
	}

}
