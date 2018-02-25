package org.eclipse.rcpl;

import java.io.InputStream;

import javafx.geometry.Rectangle2D;

import org.eclipse.rcpl.Rcpl.ResourceType;
import org.eclipse.rcpl.model.IImage;

public interface IResource {

	IImage getImage();

	public ResourceType getType();

	public String getContent();

	public InputStream getInputStream();

	Rectangle2D getBounds();

	void setId(String id);
}
