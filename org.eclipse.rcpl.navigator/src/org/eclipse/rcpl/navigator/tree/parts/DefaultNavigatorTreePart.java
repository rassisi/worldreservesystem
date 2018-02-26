package org.eclipse.rcpl.navigator.tree.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

/**
 * @author Ramin
 *
 */
public class DefaultNavigatorTreePart extends DefaultTreeTreePart {

	public DefaultNavigatorTreePart(Tool tool, boolean showRoot) {
		super(null, tool, (EObject)JOSession.getDefault().getRcpl(), showRoot);
	}


	@Override
	protected void defineDetailNode(EObject eObject) {
		super.defineDetailNode(eObject);
	}
	
	
	@Override
	protected DefaultTreeContextMenuProvider createContextMenuProvider() {
		return new DefaultNavigatorContextMenuProvider(this);
	}
	
}
