/*******************************************************************************
 * Copyright (c) 2003 - 2014 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/

package org.eclipse.rcpl.internal.services;

import org.eclipse.rcpl.ICommand;

/**
 * @author eclipse
 * 
 */
public class RcplDocumentService extends RcplService {

	public RcplDocumentService() {
		super();
	}

	@Override
	public Object doExecute(ICommand event) throws Exception {

		//		if (match(event, "actions/document/print")) { //$NON-NLS-1$
		// // if (getEditorFigure() != null
		// // && getEditorFigure().getSelectedPage() != null) {
		// // JOPrint.openPrintDialog();
		// // } else if (getEditorFigure().getEditorArea().getAdvancedBrowser()
		// // !=
		// // null) {
		// // getEditorFigure().getEditorArea().getAdvancedBrowser().print();
		// // }
		// return true;
		// }

		//		if (match(event, "actions/document/print_settings")) { //$NON-NLS-1$
		// // if (getEditorFigure() != null
		// // && getEditorFigure().getSelectedPage() != null) {
		// // JOPrint.openPrintDialog();
		// // } else if (getEditorFigure().getEditorArea().getAdvancedBrowser()
		// // !=
		// // null) {
		// // getEditorFigure().getEditorArea().getAdvancedBrowser()
		// // .printerSettings();
		// // }
		// return true;
		// }

		//		if (match(event, "actions/document/save")) { //$NON-NLS-1$
		// if (getEditor() != null) {
		// //
		// // if (getEditorFigure().getEditorArea().getAdvancedBrowser() !=
		// // null) {
		// // editorPane.saveAs();
		// // } else {
		// // if (getEditorFigure().getDocument().isNewDocument()) {
		// // editorPane.saveAs();
		// // } else {
		// // getEditorFigure().getDocument().save(false);
		// // }
		// // }
		// }
		// return true;
		// }

		//		if (match(event, "actions/document/save_as")) { //$NON-NLS-1$
		// editorPane.saveAs();
		// return true;
		// }
		//
		//		if (match(event, "actions/document/pdf")) { //$NON-NLS-1$
		// try {
		//				String pdfFile = JOUtil2.getUserLocalTempArea() + "/temp_" //$NON-NLS-1$
		//						+ System.currentTimeMillis() + ".pdf"; //$NON-NLS-1$
		// File pdfF = new File(pdfFile);
		// String s = pdfF.toURI().toString();
		// // JOEditorUtil.printPdf(editorPane, pdfFile);
		//				JO.officePane.addSimpleBrowserTab(s, "default.pdf"); //$NON-NLS-1$
		// } catch (Exception ex) {
		// // LOGG
		// return true;
		// }
		// return true;
		// }
		//
		//		if (match(event, "actions/document/open")) { //$NON-NLS-1$
		// JO.officePane.doLoad();
		// return true;
		// }

		// TODO
		// if (event.getEntry().getKey()
		// .startsWith(JOStartDialog.OPEN_RECENTLY_OPENED_DOCUMENT)) {
		// try {
		//
		// JOOfficePane ep = (JOOfficePane) editorPane;
		// File file = (File) event.getNewData()[0];
		// CTabItem2[] items = ep.getEditorFolder().getItems();
		// for (CTabItem2 cTabItem : items) {
		//
		// if (cTabItem.getControl() == null
		// || !(cTabItem.getControl() instanceof JOEditorArea)) {
		// continue;
		// }
		// if (((JOEditorArea) cTabItem.getControl()).getEditor() != null
		// && ((JOEditorArea) cTabItem.getControl())
		// .getEditor().getDocument() != null) {
		// File f = ((JOEditorArea) cTabItem.getControl())
		// .getEditor().getDocument().getFile();
		// if (f.getAbsolutePath().equals(file.getAbsolutePath())) {
		// ep.getEditorFolder().setSelection(cTabItem);
		// return true;
		// }
		// }
		// return true;
		// }
		// editorPane.load((File) event.getNewData()[0], false);
		// return true;
		// } catch (Exception ex) {
		// // LOGG
		// }
		// }
		return false;
	}
}
