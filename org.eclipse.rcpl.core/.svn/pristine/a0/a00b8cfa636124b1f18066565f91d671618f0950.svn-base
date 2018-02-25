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
package org.eclipse.rcpl.internal.resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.rcpl.SVGImage;
import org.eclipse.rcpl.images.RcplImage;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.model.IResources;
import org.eclipse.rcpl.model_2_0_0.IImageProvider;
import org.eclipse.rcpl.model_2_0_0.ITextProvider;
import org.eclipse.rcpl.model_2_0_0.JOfficeModelGeneratedPlugin;
import org.eclipse.rcpl.util.JOUtil2;

import javafx.scene.Node;

/**
 * @author Ramin Assisi
 * 
 */
public class JOResources implements IResources, IImageProvider, ITextProvider {

	public JOResources() {
		JOfficeModelGeneratedPlugin.imageProvider = this;
		JOfficeModelGeneratedPlugin.textProvider = this;
	}

	private HashMap<String, IImage> imageRegistry = new HashMap<String, IImage>();

	/**
	 * Delegate method which puts an image in the registry
	 * 
	 * @param key
	 *            the key to match to
	 * @param image
	 *            the image
	 */
	public void put(String key, IImage image) {
		imageRegistry.put(key + image.getWidth() + image.getHeight(), image);
	}

	public IImage get(String key, double width, double height) {
		return imageRegistry.get(key + width + height);
	}

	/**
	 * @param id
	 * @return
	 */
	@Override
	public IImage getImage(String id, double width, double height) {
		if (id == null) {
			id = "error_ID";
		}
		IImage img = get(id, width, height);
		if (img != null) {
			return img;
		}

		img = new RcplImage(id, width, height);
		put(id, img);
		return img;
	}

	/**
	 * @param id
	 * @return
	 */
	@Override
	public IImage getSvgImage(String id, double width, double height) {
		if (id == null) {
			return new RcplImage("error", width, height);
		}

		IImage img = imageRegistry.get(id);

		if (img != null) {
			return img;
		}

		img = new SVGImage(id, width, height);
		put(id, img);
		return img;
	}

	/**
	 * @param key
	 * @return
	 */
	public static String getGeneralKey(String key) {
		if (key.startsWith("word/")) { //$NON-NLS-1$
			key = key.substring(5, key.length());
		} else if (key.startsWith("presentation/")) { //$NON-NLS-1$
			key = key.substring(13, key.length());
		} else if (key.startsWith("spreadsheet/")) { //$NON-NLS-1$
			key = key.substring(12, key.length());
		}
		return key;
	}

	public void savePartToFile(String partName, byte[] imageBytes) {
		if (imageBytes != null) {
			File f = new File(JOUtil2.getUserLocalTempArea() + partName);
			f.getParentFile().mkdirs();
			FileOutputStream fo;
			try {
				fo = new FileOutputStream(f);
				fo.write(imageBytes);
				fo.flush();
				fo.close();
			} catch (FileNotFoundException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			} catch (IOException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			}
		}
	}

	@Override
	public boolean isValidImage(String imageName) {
		imageName = imageName.toLowerCase();
		return imageName.endsWith(".jpg") //$NON-NLS-1$
				|| imageName.endsWith(".jpeg") || imageName.endsWith(".bmp") //$NON-NLS-1$//$NON-NLS-2$
				|| imageName.endsWith(".png") || imageName.endsWith(".gif") || imageName.endsWith(".tif") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				|| imageName.endsWith(".tiff"); //$NON-NLS-1$
	}

	@Override
	public String getString(String id) {
		return id;
	}

	@Override
	public Node getImageNode(String id, double width, double height) {
		return getImage(id, width, height).getNode();
	}

}
