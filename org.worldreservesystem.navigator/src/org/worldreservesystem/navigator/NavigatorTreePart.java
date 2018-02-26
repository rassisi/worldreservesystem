package org.worldreservesystem.navigator;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.Folder;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.navigator.tree.parts.DefaultTreeTreePart;

import javafx.scene.control.Button;

/**
 * @author Ramin
 *
 */
public class NavigatorTreePart extends DefaultTreeTreePart {

	public NavigatorTreePart(Tool tool, boolean showRoot) {
		super(null, tool, (EObject)JOSession.getDefault().getRcpl(), showRoot);
	}


	@Override
	protected void defineDetailNode(EObject eObject) {
		super.defineDetailNode(eObject);
		
		if(eObject instanceof Folder) {
			String id = ((Folder)eObject).getId();
			setDetailNode(new Button(id));
		}
		
		
	}
	
	
}
