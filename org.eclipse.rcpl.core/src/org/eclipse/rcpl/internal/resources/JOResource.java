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

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.eclipse.rcpl.IResource;
import org.eclipse.rcpl.Rcpl.ResourceType;
import org.eclipse.rcpl.images.RcplImage;
import org.eclipse.rcpl.model.IImage;

import javafx.geometry.Rectangle2D;

/**
 * @author ramin
 * 
 */
public class JOResource implements IResource {

	private IImage image;

	private String content;

	private ResourceType type;

	private String id;

	private PackagePart packagePart;

	private InputStream inputStream;

	/**
	 * @param image
	 */
	public JOResource(IImage image) {
		this.image = image;
		this.type = ResourceType.IMAGE;
	}

	/**
	 * @param svgContent
	 */
	public JOResource(ResourceType type, String content) {
		this.content = content;
		this.type = type;
	}

	/**
	 * @param type
	 * @param packagePart
	 */
	public JOResource(ResourceType type, PackagePart packagePart, String content) {
		this.content = content;
		this.packagePart = packagePart;
		this.type = type;
	}

	@Override
	public IImage getImage() {

		return image;
	}

	@Override
	public String getContent() {
		return content;
	}

	@Override
	public ResourceType getType() {
		return type;
	}

	public void setImage(RcplImage image) {
		this.image = image;
	}

	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	public PackagePart getPackagePart() {
		return packagePart;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	/**
	 * @return
	 */
	@Override
	public InputStream getInputStream() {
		if (inputStream != null) {
			try {
				inputStream.reset();
				return inputStream;
			} catch (IOException e) {
			}
			return inputStream;
		}
		if (packagePart != null) {
			try {
				return packagePart.getInputStream();
			} catch (IOException e) {
				return null;
			}
		}
		return null;
	}

	@Override
	public Rectangle2D getBounds() {
		// if (getSwtImage() != null) {
		// // Rectangle r = getSwtImage().getBounds();
		// // return new Rectangle2D(r.x, r.y, r.width, r.height);
		// return null;
		// }
		// if (getFxImage() != null) {
		// return new Rectangle2D(0, 0, (int) getFxImage().getWidth(),
		// (int) getFxImage().getHeight());
		// }
		return new Rectangle2D(0, 0, 0, 0);
	}

}
