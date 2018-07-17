package org.worldreservesystem.navigator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.INavigatorListener;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.app.toolcontrols.RcplSideToolBar;
import org.eclipse.rcpl.model_2_0_0.rcpl.Folder;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.navigator.tree.parts.DefaultTreeTreePart;
import org.worldreservesystem.navigator.detailpages.OverviewDetailPage;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 * @author Ramin
 *
 */
public class NavigatorTreePart extends DefaultTreeTreePart {

	OverviewDetailPage overviewPage;

	public NavigatorTreePart(Pane detailPane, Tool tool, EObject eObject, boolean showRoot) {
		super(detailPane, tool, eObject, showRoot);

		Rcpl.addNavigatorListener(new INavigatorListener() {

			@Override
			public void selected(EObject eObject) {
				defineDetailNode(eObject);

			}
		});
	}

	@Override
	public Node createNode() {
		Node node = super.createNode();
		overviewPage = new OverviewDetailPage();
		overviewPage.create();
		return node;
	}

	@Override
	protected void defineDetailNode(EObject eObject) {
		super.defineDetailNode(eObject);

		if (eObject instanceof Folder) {
			String id = RcplSideToolBar.getNormalizedGroupId(((Folder) eObject).getId());
			if (NavigatorConstants.WRS_NETWORK_OVERVIEW.equals(id)) {
				setDetailNode(overviewPage.getRoot());
			} else {
				setDetailNode(null);
			}
		}

	}

}
