package org.eclipse.rcpl;

import org.eclipse.rcpl.model.IImage;

public interface IPartable {

	/**
	 * @param registry
	 * @param id
	 * @return
	 */
	public IImage getImageByRelationId(String id);

}
