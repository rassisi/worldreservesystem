package org.eclipse.rcpl.model;

/**
 * @author ramin
 *
 */
public interface IResources {

	IImage getImage(String id, double width, double height);

	IImage getSvgImage(String id, double width, double height);

	boolean isValidImage(String path);

}
