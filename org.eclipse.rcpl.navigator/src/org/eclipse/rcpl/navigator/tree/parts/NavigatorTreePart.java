package org.eclipse.rcpl.navigator.tree.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

/**
 * @author Ramin
 *
 */
public class NavigatorTreePart extends EEmfTreeTreePart {

	public NavigatorTreePart(Tool tool, boolean showRoot) {
		super(null, tool, (EObject)JOSession.getDefault().getRcpl(), showRoot);
		// Pane detailPane, Tool tool, EObject root, boolean showRoot
	}

}
