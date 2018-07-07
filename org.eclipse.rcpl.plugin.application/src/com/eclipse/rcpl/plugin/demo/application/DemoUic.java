package com.eclipse.rcpl.plugin.demo.application;

import java.io.File;
import java.net.URL;

import org.eclipse.rcpl.IButtonListener;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IHomePage;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplUic;
import org.eclipse.rcpl.application.RcplApplicationStarter;
import org.eclipse.rcpl.model.cdo.client.JOKey;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.util.JOUtil2;

import com.rcpl.rcpl.plugin.demo.homepages.DocumentHomePage;
import com.rcpl.rcpl.plugin.demo.homepages.NewHomePage;
import com.rcpl.rcpl.plugin.demo.homepages.SamplesHomePage;

import javafx.event.ActionEvent;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.Separator;
import javafx.scene.control.Tab;
import javafx.stage.FileChooser;

public class DemoUic extends RcplUic {

	public DemoUic(RcplApplicationStarter rcp, String progressMessage) {
		super(rcp, progressMessage);
		// new JOPointToPixelCalculator().init();

	}

	public void actionAddWordTab() {
		openTemplate("blank_A4.docx", "   New Document");
	}

	public void actionOpen() {

		final FileChooser fileChooser = new FileChooser();
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Word Documents", "*.docx");
		fileChooser.getExtensionFilters().add(extFilter);
		extFilter = new FileChooser.ExtensionFilter("Spreadsheets", "*.xlsx");
		fileChooser.getExtensionFilters().add(extFilter);
		extFilter = new FileChooser.ExtensionFilter("Presentions", "*.pptx");
		fileChooser.getExtensionFilters().add(extFilter);
		extFilter = new FileChooser.ExtensionFilter("All", "*.*");
		fileChooser.getExtensionFilters().add(extFilter);

		try {
			File dir = JOSession.getDefault().getSystemPreferences().getFile(JOKey.FILE_DIALOG_DIR);
			if (dir != null && dir.exists()) {
				fileChooser.setInitialDirectory(dir);
			}
		} catch (Exception ex) {
			// System. out.println();
		}
		File file = fileChooser.showOpenDialog(getStage());
		JOSession.getDefault().commit();
		if (file != null) {
			JOSession.getDefault().getSystemPreferences().put(JOKey.FILE_DIALOG_DIR, file.getParentFile());
			lastDocumentFile = file;
			JOSession.getDefault().getSystemPreferences().setLastDocument(file.getAbsolutePath());
			JOSession.getDefault().commit();
			openDocument(file);
		}
		updateButtons(false);
	}

	public void actionOpenExample_1(ActionEvent event) {
		openTemplate("ecma_376_fundamentals_4.docx", null);
	}

	public void actionOpenExample_2(ActionEvent event) {
		// openTemplate("family-budget-planner.xlsx");
		openTemplate("business_schedule_1.xlsx", null);
	}

	public void actionOpenExample_3(ActionEvent event) {
		openTemplate("impress_4.pptx", null);
	}

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

	@Override
	protected IHomePage createAboutHomePage() {
		return super.createAboutHomePage();
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
	protected IHomePage createNewHomePage() {
		return new NewHomePage(this, "64_48/office_new");
	}

	@Override
	protected IHomePage createSamplesHomePage() {
		return new SamplesHomePage(this, "64_48/office_samples");
	}

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
		quickToolsArea.getChildren().addAll(

				Rcpl.getFactory().createButton("", "", "Open Document", "open", false, new IButtonListener() {

					@Override
					public void doAction() {
						actionOpen();

					}
				}, true).getNode(),

				Rcpl.getFactory()
						.createButton("", "", "Open Last Document", "open_last_document", false, new IButtonListener() {

							@Override
							public void doAction() {
								actionOpenLast();

							}
						}, true).getNode(),

				sep2,

				// JO.factory.createButton("", "", "New Browser Tab",
				// "webbrowser", false, new IButtonListener() {
				//
				// @Override
				// public void doAction() {
				// actionAddWebBrowserTab();
				//
				// }
				// }).getNode(),

				Rcpl.getFactory().createButton("", "", "New Word Document", "word", false, new IButtonListener() {

					@Override
					public void doAction() {
						actionAddWordTab();

					}
				}, true).getNode(),
				Rcpl.getFactory().createButton("", "", "New Spreadsheet", "spreadsheet", false, new IButtonListener() {

					@Override
					public void doAction() {
						// actionAddSpreadsheetTab();
					}
				}, true).getNode(),

				Rcpl.getFactory()
						.createButton("", "", "New Presentation", "presentation", false, new IButtonListener() {

							@Override
							public void doAction() {
								// actionAddPresentationTab();
							}
						}, true).getNode(),

				sep12,

				buttonLogout.getNode(),

				sep13

		)

		;

	}

	public IEditor getEditor() {

		IEditor result = super.getEditor();
		if (result != null) {
			return result;
		}

		if (internalBorderPane != null) {
			Node n = internalBorderPane.getCenter();
			if (n != null) {
				Object o = n.getUserData();
				if (o instanceof DocumentHomePage) {
					return ((DocumentHomePage) o).getDocument().getEditor();
				}
			}
		}
		return editor;
	}

	public void openDocument(File file) {

		if (file.getName().endsWith(".docx")) {
			actionPerspectiveWord();
		} else if (file.getName().endsWith(".pptx")) {
			actionPerspectivePresentation();
		} else if (file.getName().endsWith(".xlsx")) {
			actionPerspectiveSpreadsheet();
		}

		final Tab newTab = createNewTab(file.getName());
		// final IEditor f = factory().createEditor(newTab, false);
		// IDocument doc = JOAbstractDocument.load(file, false, null, false);
		//
		// f.setDocument(doc);
		// centerEditor(f);
		newTab.setId("wordTab");
		newTab.setClosable(true);
		// newTab.setUserData(f);
		internalTabPane.getSelectionModel().select(newTab);
		// internalBorderPane.setCenter(f.getMainPane());
		updatePerspective(newTab);
		updateButtons(false);
		getSideToolBarControl().show();
		internalTabPane.getSelectionModel().select(newTab);

		status_button_2_pages.setSelected(getEditor().getPageColumns() >= 2);
	}

	public void openDocument(URL url) {
		File file = JOUtil2.copyFileFromUrlToCache(url, false);
		openDocument(file);

	}

	protected void openTemplate(String name, String tabName) {

		if (name.endsWith(".docx")) {
			actionPerspectiveWord();
		} else if (name.endsWith(".pptx")) {
			actionPerspectivePresentation();
		} else if (name.endsWith(".xlsx")) {
			actionPerspectiveSpreadsheet();
		}

		IDocument document = null;
		String title = tabName != null ? tabName : name;

		final Tab newTab = createNewTab(title);
		newTab.setId("wordTab");
//		IEditor f = factory().createEditor(newTab, false);
//		document = new JODocumentProvider().createTemplateDocument(name, (HashMap<String, String>) null, false);
//		f.setDocument(document);
//		internalBorderPane.setCenter(f.getMainPane());
//		newTab.setUserData(f);
		updatePerspective(newTab);
		updateButtons(false);
		getSideToolBarControl().show();
		internalTabPane.getSelectionModel().select(newTab);

		if (getEditor() != null) {
			status_button_2_pages.setSelected(getEditor().getPageColumns() >= 2);
		}
		addGeneralQuickTools_1();

		return newTab;
	}


	@Override
	protected void registerServices() {
		super.registerServices();
//		JO.service().registerService(EnServiceId.COLOR_SERVICE, new JOColorService());
	}
}
