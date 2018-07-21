package org.wrs.navigator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.model.cdo.client.RcplSession;
import org.eclipse.rcpl.navigator.tree.parts.DefaultNavigatorTreePart;

/**
 * @author Ramin
 *
 */
public class WrsNavigatorTreePart extends DefaultNavigatorTreePart {

//	OverviewDetailPage overviewPage;
//
//	public WrsNavigatorTreePart(Pane detailPane, Tool tool, EObject eObject, boolean showRoot) {
//		super(detailPane, tool, eObject, showRoot);
//
//		Rcpl.addNavigatorListener(new INavigatorListener() {
//
//			@Override
//			public void selected(EObject eObject) {
//				defineDetailNode(eObject);
//
//			}
//		});
//	}
//
//	@Override
//	public Node createNode() {
//		Node node = super.createNode();
//		overviewPage = new OverviewDetailPage();
//		overviewPage.create();
//		return node;
//	}
//
//	@Override
//	protected void defineDetailNode(EObject eObject) {
//		super.defineDetailNode(eObject);
//
//		if (eObject instanceof Folder) {
//			String id = RcplSideToolBar.getNormalizedGroupId(((Folder) eObject).getId());
//			if (NavigatorConstants.WRS_NETWORK_OVERVIEW.equals(id)) {
//				setDetailNode(overviewPage.getRoot());
//			} else {
//				setDetailNode(null);
//			}
//		}
//
//	}

	@Override
	public EObject getRoot() {
		return RcplSession.getDefault().getRcpl().getAllPersons();
	}
}
