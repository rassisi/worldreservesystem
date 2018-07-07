package org.eclipse.rcpl.model;

import javafx.scene.image.ImageView;

/**
 * @author ramin
 *
 */
public interface IResources {

	IImage getImage(String id, double width, double height);

	IImage getSvgImage(String id, double width, double height);

	boolean isValidImage(String path);
	
	ImageView getImageView(String imagename);

}
