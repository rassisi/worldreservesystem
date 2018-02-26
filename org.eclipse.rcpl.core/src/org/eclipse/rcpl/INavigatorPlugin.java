package org.eclipse.rcpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import javafx.scene.layout.Pane;

/**
 * @author ramin
 *
 */
public interface INavigatorPlugin extends IRcplPlugin {

	RcplTool create(Pane detailPane, Tool tool, EObject root, boolean showRoot);
}
