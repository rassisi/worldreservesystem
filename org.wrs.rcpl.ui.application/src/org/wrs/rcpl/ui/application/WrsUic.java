package org.wrs.rcpl.ui.application;

import java.io.File;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.INavigatorListener;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.application.RcplApplicationStarter;
import org.eclipse.rcpl.model_2_0_0.rcpl.Resource;
import org.eclipse.rcpl.ui.controler.RcplUic;

import javafx.event.ActionEvent;
import javafx.geometry.Orientation;
import javafx.scene.control.Separator;

/**
 * @author ramin
 *
 */
public class WrsUic extends RcplUic {

	public WrsUic(RcplApplicationStarter rcp) {
		super(rcp);
		Rcpl.addNavigatorListener(new INavigatorListener() {

			@Override
			public void selected(EObject eObject) {

				if (eObject instanceof Resource) {
					Resource doc = (Resource) eObject;
					final String uri = doc.getUri();
					final String tabName = uri.split("\\.")[0];

					if (doc.isTemplate()) {
						openTemplate(uri, tabName);
					}
				}
			}
		});
	}

	public void actionAddWordTab() {
		openTemplate("blank_A4.docx", " New Document");
	}

	public void actionOpenExample_1(ActionEvent event) {
		// openTemplate("ecma_376_fundamentals_4.docx", null);
		openTemplate("example_bach.docx", null);
	}

	public void actionOpenExample_2(ActionEvent event) {
		// openTemplate("family-budget-planner.xlsx");
		openTemplate("business_schedule_1.xlsx", null);
	}

	public void actionOpenExample_3(ActionEvent event) {
		openTemplate("impress_4.pptx", null);
	}

	@Override
	public void actionOpenLast() {
		if (lastDocumentFile != null) {
			if (lastDocumentFile.exists()) {
				openDocument(lastDocumentFile);
			} else {
				// TODO
				// editModeLabel.setText(event.getMessage());
			}
		}
	}

	// protected Tab openTemplate(String name, String tabName) {
	// Tab newTab = super.openTemplate(name, tabName);
	// if (getEditor() != null) {
	// status_button_2_pages
	// .setSelected(getEditor().getPageColumns() >= 2);
	// }
	// addGeneralQuickTools_1();
	// return newTab;
	// }

	@Override
	protected void doCreateContent() {
		super.doCreateContent();
		Separator sep1 = new Separator(Orientation.HORIZONTAL);
		sep1.setPrefWidth(10);
		sep1.setVisible(false);

		Separator sep12 = new Separator(Orientation.HORIZONTAL);
		sep12.setPrefWidth(10);
		sep12.setVisible(false);

		Separator sep13 = new Separator(Orientation.HORIZONTAL);
		sep13.setPrefWidth(10);
		sep13.setVisible(false);

		Separator sep2 = new Separator(Orientation.HORIZONTAL);
		sep2.setPrefWidth(10);
		sep2.setVisible(false);

		// if (!Rcpl.isMobile()) {
		// IButton openDocumentButton = Rcpl.factory.createButton("", "", "Open
		// Document", "open", false,
		// new IButtonListener() {
		//
		// @Override
		// public void doAction() {
		// actionOpen();
		//
		// }
		// }, true);
		//
		// IButton openLastDocumentButton = Rcpl.factory.createButton("", "",
		// "Open Last Document",
		// "open_last_document", false, new IButtonListener() {
		//
		// @Override
		// public void doAction() {
		// actionOpenLast();
		//
		// }
		// }, true);
		// quickToolsArea.getChildren().addAll(
		//
		// openDocumentButton.getNode(), openLastDocumentButton.getNode(),
		//
		// sep2);
		// }

	}

	// @Override
	// public IEditor getEditor() {
	// if (internalBorderPane != null) {
	// Node n = internalBorderPane.getCenter();
	// if (n != null) {
	// Object o = n.getUserData();
	// if (o instanceof JODocumentHomePage) {
	// return ((JODocumentHomePage) o).getDocument().getEditor();
	// }
	// }
	// }
	// return null;
	// }

	@Override
	public void openDocument(File file) {

	}

	@Override
	public void openTemplate(final String docName, String tabName) {

	}

	@Override
	protected void registerServices() {
		Rcpl.progressMessage("Register Services");
		super.registerServices();

		Rcpl.progressMessage("Services registered");
	}

}
