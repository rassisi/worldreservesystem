package com.joffice.rcpl.plugin.office.application;

import java.io.File;
import java.net.URL;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IHomePage;
import org.eclipse.rcpl.INavigatorListener;
import org.eclipse.rcpl.IOfficeUIC;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplUic;
import org.eclipse.rcpl.WaitThread;
import org.eclipse.rcpl.application.RcplApplicationStarter;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOKey;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.model_2_0_0.rcpl.Resource;
import org.eclipse.rcpl.util.JOUtil2;

import com.joffice.rcpl.plugin.office.homepages.JOOfficeNewHomePage;
import com.joffice.rcpl.plugin.office.homepages.JOOfficeSamplesHomePage;

import javafx.event.ActionEvent;
import javafx.geometry.Orientation;
import javafx.scene.control.Separator;
import javafx.scene.control.Tab;
import javafx.stage.FileChooser;

/**
 * @author ramin
 *
 */
public class JOUic extends RcplUic implements IOfficeUIC {

	public JOUic(RcplApplicationStarter rcp) {
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

	@Override
	public void actionAddPresentationTab() {



	}

	public void actionAddSpreadsheetTab() {
		IDocument document = null;

	}

	public void actionAddWordTab() {
		openTemplate("blank_A4.docx", " New Document");
	}

	@Override
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
			RCPLModel.logError(ex);
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
		return new JOOfficeNewHomePage(this, "office_new");
	}

	@Override
	protected IHomePage createSamplesHomePage() {
		return new JOOfficeSamplesHomePage(this, "office_samples");
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

//		Rcpl.startProgress(0, false);
//
//		Tab tab = searchTab(file, null);
//		if (tab != null) {
//			showTab(tab);
//			return;
//		}
//
//		if (file.getName().endsWith(".docx")) {
//			actionPerspectiveWord();
//		} else if (file.getName().endsWith(".pptx")) {
//			actionPerspectivePresentation();
//		} else if (file.getName().endsWith(".xlsx")) {
//			actionPerspectiveSpreadsheet();
//		}
//
//		final Tab newTab = createNewTab(file.getName());
//		final IEditor f = Rcpl.getFactory().createEditor(newTab, false);
//		IDocument doc = JOAbstractDocument.load(file, false, null, false);
//
//		f.setDocument(doc);
//		setContent(f);
//		newTab.setId("wordTab");
//		newTab.setClosable(true);
//		newTab.setUserData(f);
//		internalTabPane.getSelectionModel().select(newTab);
//		editorArea.getChildren().clear();
//		editorArea.getChildren().add(f.getMainPane());
//		updatePerspective(newTab);
//		updateButtons(false);
//		getSideToolBarControl().showPerspective(Rcpl.UIC.getPerspective(), false);
//		internalTabPane.getSelectionModel().select(newTab);

	}

	@Override
	public void openDocument(URL url) {
		File file = JOUtil2.copyFileFromUrlToCache(url, false);
		Tab tab = searchTab(file, null);
		if (tab != null) {
			showTab(tab);
			return;
		}
		openDocument(file);

	}

	private IEditor editor;

	@Override
	public void openTemplate(final String docName, String tabName) {

//		boolean test = false;
//
//		if (test) {
//			System.out.println();
//			printMemory("vor load document     ");
//			IDocument doc = new JODocumentProvider().createTemplateDocument(docName, (HashMap<String, String>) null,
//					false);
//
//			final Tab newTab = new Tab(tabName);
//			editor = Rcpl.getFactory().createEditor(newTab, false);
//
//			Rcpl.startProgress(0.01, false);
//
//			newTab.setUserData(editor);
//
//			// createNewTab(newTab, tabName);
//			// newTab.setId("wordTab");
//
//			doLayoutDocument(editor, new IDocument[] { doc });
//			doCompleated(editor, newTab, tabName);
//
//			updateButtons(false);
//			getSideToolBarControl().showPerspective(Rcpl.UIC.getPerspective(), false);
//			getTopToolBarControl().hideAll();
//
//			editor.showPageGroup(false);
//			closeEditor(editor);
//
//			doc.save();
//			doc.dispose();
//
//			printMemory("nach doc.dispose()    ");
//			return;
//		}
//
//		Rcpl.startProgress(0.001, false);
//
//		try
//
//		{
//			Tab tab = searchTab(tabName);
//			if (tab != null) {
//				showTab(tab);
//				return;
//			}
//
//			final IDocument[] document = new IDocument[1];
//			final String title = tabName != null ? tabName : docName;
//			final Tab newTab = new Tab(tabName);
//
//			new DelayedExecution(500) {
//
//				@Override
//				protected void execute() {
//					editor = Rcpl.getFactory().createEditor(newTab, false);
//
//					if (docName.endsWith(".docx")) {
//						actionPerspectiveWord();
//					} else if (docName.endsWith(".pptx")) {
//						actionPerspectivePresentation();
//					} else if (docName.endsWith(".xlsx")) {
//						actionPerspectiveSpreadsheet();
//					}
//
//					newTab.setUserData(editor);
//					createNewTab(newTab, title);
//					newTab.setId("wordTab");
//
//					new Thread() {
//						@Override
//						public void run() {
//							document[0] = new JODocumentProvider().createTemplateDocument(docName,
//									(HashMap<String, String>) null, false);
//							if (document[0] == null) {
//								Rcpl.showProgress(false);
//								showMessage("Error", "Document could not be opened.");
//							} else {
//								doLayoutDocument(editor, document);
//								doCompleated(editor, newTab, title);
//							}
//
//							updateButtons(false);
//							// getSideToolBarControl().showPerspective(Rcpl.UIC.getPerspective(),
//							// false);
//							getTopToolBarControl().hideAll();
//
//						};
//					}.start();
//				}
//			};
//
//			return;
//		} catch (Throwable ex) {
//			RCPLModel.logError(ex);
//		}

	}

	private void doLayoutDocument(final IEditor editor, final IDocument[] document) {
//		document[0].setEditorFigure(editor);
//		final JOLayoutService s = new JOLayoutService();
//		s.setEditor(editor);
//		do {
//			new WaitThread(editor) {
//				@Override
//				public void doRun() {
//					s.layout();
//				}
//			};
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//			}
//
//			if (editor.isDisposed()) {
//				break;
//			}
//		} while (!s.ld.compleated() && editor.getFirstDirtyLayoutObject() != null);

	}

	private void doCompleated(final IEditor editor, final Tab newTab, final String title) {
		if (editor.getDocument().getRootParagraphs().size() > 0) {

			new WaitThread(editor) {

				@Override
				public void doRun() {
					internalTabPane.getSelectionModel().select(newTab);
					editor.getDocument().getRootParagraphs().get(0).activate();
					editor.setScale(RCPLModel.configuration.getDefaultZoom());
					Rcpl.showProgress(false);
				}
			};

			editor.finishAddPages();

		}
	}

	private Tab searchTab(String name) {
		String[] splits1 = name.split("\\.");

		for (Tab t : tabPane.getTabs()) {
			String[] splits = t.getText().split("\\.");
			if (splits1[0].trim().equals(splits[0].trim())) {
				return t;
			}
		}
		return null;
	}

	private Tab searchTab(File file, Tab excludeTab) {
		for (Tab tab : tabPane.getTabs()) {

			Object o = tab.getUserData();
			if (o instanceof IEditor) {
				IDocument doc = ((IEditor) o).getDocument();
				File f = doc.getFile();
				if (f.equals(file)) {
					return tab;
				}
			}
		}
		return null;
	}

	@Override
	protected void registerServices() {
		Rcpl.progressMessage("Register Services");
		super.registerServices();
//		Rcpl.service().registerService(EnServiceId.COLOR_SERVICE, new JOColorService());
//		Rcpl.service().registerService(EnServiceId.FONT_SERVICE, new JOFontService());
//		Rcpl.service().registerService(EnServiceId.INSERT_SERVICE, new JOInsertService());
//		Rcpl.service().registerService(EnServiceId.LAYOUT_SERVICE, new JOLayoutService());
//		Rcpl.service().registerService(EnServiceId.PARAGRAPH_SERVICE, new JOParagraphService());
//		Rcpl.service().registerService(EnServiceId.PICTURE_SERVICE, new JOPictureService());
//		Rcpl.service().registerService(EnServiceId.TABLE_SERVICE, new JOTableService());
		Rcpl.progressMessage("Services registered");
	}

}
