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

import org.eclipse.rcpl.EnPageSize;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.util.JOUtil2;

/**
 * @author ramin
 * 
 */
public class RcplInfoTabService extends RcplService {

	public RcplInfoTabService() {
		super();
	}

	// private LocationListener ll = null;

	private int activationType = 0;

	private boolean firstTimeOpenWebBrowser = true;

	@Override
	public Object doExecute(ICommand command) throws Exception {

		// if (command.getNewData() != null) {
		// if (command.getNewData()[0].equals(JO.DOC_ENTRY_PAR_SUBGROUP)) {
		// JO.officePane.showInfoAreaSubGroup(getId(command));
		// return true;
		// }
		// }
		//
		//		if (getId(command).startsWith("infotab/actions/setup/setup_")) { //$NON-NLS-1$
		// JO.officePane.showInfoAreaSubGroup(getId(command));
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/open_last_browser_tabs")) { //$NON-NLS-1$
		// String lastUrls = JOUtil2
		// .getString(JO.REGISTRY_LAST_OPENED_BROWSER_TABS);
		// if (lastUrls != null && lastUrls.length() > 0) {
		//				String[] urls = lastUrls.split(","); //$NON-NLS-1$
		// for (String url : urls) {
		// JO.officePane.addBrowserTab(url, null, true, false);
		// }
		// }
		//
		// int index = JOUtil2
		// .getInteger(JO.REGISTRY_LAST_OPENED_BROWSER_TAB_INDEX);
		// if (index != -1) {
		// if (index < (JO.officePane.getEditorFolder().getItemCount() - 2)) {
		// JO.officePane.getEditorFolder().setSelection(index);
		// }
		// }
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/open_last_document")) { //$NON-NLS-1$
		// String fName = JOUtil2.getString(getId(command));
		// if (fName != null && fName.length() > 0) {
		// JO.officePane.load(new File(fName), false);
		// }
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/manual_activation")) { //$NON-NLS-1$
		//
		// // if (JOUtil.isEclipse()) {
		// // return true;
		// // }
		// // InputDialog dlg = new InputDialog(Display.getCurrent()
		// // .getActiveShell(),
		//			//					"", Messages.JOInfoTabService_EnterTheActivationCode, //$NON-NLS-1$
		//			//					"", new JOActivationCodeValidator()); //$NON-NLS-1$
		// // if (dlg.open() == Window.OK) {
		// // // User clicked OK; update the label with the input
		// // String s = dlg.getValue();
		// // final Browser browser = (Browser) JO.officePane.getBrowser();
		//			//				if (s.equals("deactivate")) { //$NON-NLS-1$
		// // JOActivation.deActivate(
		// // JOActivation.ACTIVATION_JOFFICE_SUBSCRIPTION, true);
		// // String activationHtml = JOActivation.createActivationHtml();
		// // browser.addLocationListener(ll);
		// // JO.officePane.setHtml(activationHtml);
		// // JO.officePane.showActivationButton(true);
		// // } else {
		// // String md5 = JOUtil.createMD5(s, true);
		// // if (md5.equals(JOActivation.manualActivationCode)) {
		// // JOActivation.activate(
		// // JOActivation.ACTIVATION_JOFFICE_SUBSCRIPTION,
		// // true);
		// // String activationHtml = JOActivation
		// // .createActivationHtml();
		// // browser.addLocationListener(ll);
		// // JO.officePane.setHtml(activationHtml);
		// // JO.officePane.showActivationButton(false);
		// // }
		// // }
		// // }
		//
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/update")) { //$NON-NLS-1$
		// // if (JOUtil.isEclipse()) {
		// // return true;
		// // }
		// // IEnabling toolButton = (IEnabling) command.getSource();
		// // toolButton.setEnable(false);
		// // File f = JOUtil.downloadUpdate(false);
		// // if (f != null) {
		//			//				JO.officePane.setProgressMessage(""); //$NON-NLS-1$
		// // System.exit(99);
		// // } else {
		// // toolButton.setEnable(true);
		// // MessageDialog.openInformation(JOUtil.getShell(),
		// // Messages.JOInfoTabService_Error,
		// // Messages.JOInfoTabService_AnErrorOccuredPleaseTryLater);
		// // }
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/major_update")) { //$NON-NLS-1$
		// // if (JOUtil.isEclipse()) {
		// // return true;
		// // }
		// //
		// // IEnabling toolButton = (IEnabling) command.getSource();
		// // // if (MessageDialog
		// // // .openQuestion(
		// // // JOUtil.getShell(),
		// // // "Update",
		// // //
		// //
		// "A Major Update is available. During this process some functions are not available"
		// // // + "\n" + "Do you want to install now?")) {
		// // toolButton.setEnable(false);
		// // JO.officePane.setMajorUpdateActive(true);
		// // File f = JOUtil.downloadUpdate(true);
		// // if (f != null) {
		//			//				JO.officePane.setProgressMessage(""); //$NON-NLS-1$
		// // System.exit(99);
		// // } else {
		// // toolButton.setEnable(true);
		// // MessageDialog.openInformation(JOUtil.getShell(),
		// // Messages.JOInfoTabService_Error,
		// // Messages.JOInfoTabService_AnErrorOccurePleaseTryLater);
		// // }
		// // }
		//
		// // JO.officePane
		//			//					.setUrl("http://www.joffice.eu/htdocs/index.html"); //$NON-NLS-1$
		// // MessageDialog
		// // .openInformation(
		// // JOUtil.getShell(),
		// // "Update",
		// // "A Major Update is available. Please IJODownload it from\n"
		// // + "our site, close JOffice and install a new version");
		//
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/profile")) { //$NON-NLS-1$
		// // Point loc = (Point)event.getNewData()[0];
		// // JO.officePane.getStartDialog().toggle(loc.x,
		// // loc.y);
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/web_browser")) { //$NON-NLS-1$
		//
		// // if (firstTimeOpenWebBrowser) {
		// // firstTimeOpenWebBrowser = false;
		// // if (JO.officePane.getEditorFolder().getItemCount() > 1) {
		// // JO.officePane.getEditorFolder().setSelection(1);
		// // ((Control) JO.officePane).getDisplay().asyncExec(
		// // new Runnable() {
		// //
		// // @Override
		// // public void run() {
		// // JOEditorFigure ef = JOUtil.getEditor();
		// // if (ef != null) {
		// // ef.showAspect(EnDocumentType.BROWSER,
		// // false);
		// // }
		// // }
		// // });
		// // } else {
		// // JO.officePane.addBrowserTab(false, true);
		// // }
		// // } else {
		// // JO.officePane.addBrowserTab(true, true);
		// // JO.officePane.getEditor().showAspect();
		// //
		// // }
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/my_web_windows")) { //$NON-NLS-1$
		// boolean selected = (Boolean) command.getNewData()[0];
		// if (selected) {
		//
		// // String host = JOUtil
		//				//						.getString("infotab/actions/setup/setup_my_web_host"); //$NON-NLS-1$
		// // int port = JOUtil
		//				//						.getInteger("infotab/actions/setup/setup_my_web_port"); //$NON-NLS-1$
		//
		// // TODO
		// // if (!JO.officePane.showWWindows(host, port)) {
		// // ISelectable b = (ISelectable) command.getSource();
		// // b.setSelected(false, false);
		// // }
		// }
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/color/show_background_images")) { //$NON-NLS-1$
		// // TODO
		// // JO.officePane
		// // .setShowBackgroundImages((Boolean) command.getNewData()[0]);
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/new")) { //$NON-NLS-1$
		// createNewWordDocument();
		// return true;
		// }
		//
		//		//		if (match(event, "infotab/actions/setup_editor")) { //$NON-NLS-1$
		// // return true;
		// // }
		//		//		if (match(event, "infotab/actions/setup_document")) { //$NON-NLS-1$
		// // return true;
		// // }
		//		//		if (match(event, "infotab/actions/setup_browser")) { //$NON-NLS-1$
		// // return true;
		// // }
		//
		//		if (match(command, "infotab/actions/help/open_1")) { //$NON-NLS-1$
		//
		// if (JO.officePane.isInfoAreaOpen()) {
		// JO.officePane.doLoad();
		// } else {
		// JO.officePane.showInfoAreaOpen();
		// JO.officePane.doLoad();
		// }
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/openDocumentDialog")) { //$NON-NLS-1$
		//
		// JO.officePane.doLoad();
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/close")) { //$NON-NLS-1$
		//
		// // if (JO.officePane != null) {
		// // if (MessageDialog.openQuestion(
		// // (Shell) JO.officePane.getShell(),
		// // Messages.OOXMLInfoTabService_CloseOffice,
		// // Messages.OOXMLInfoTabService_AreYouSureToClose)) {
		// // JO.officePane.getContainer().dispose();
		// // }
		// // }
		// return true;
		// }
		//
		//		//		if (event.getKey().equals("actions/startmenu/what_is_new")) { //$NON-NLS-1$
		// // ((OOXMLOfficePane) editorPane).getStartDialog().getShell()
		// // .setVisible(false);
		// // ((OOXMLOfficePane) editorPane)
		//		//					.loadTemplateDocument("what_is_new.docx"); //$NON-NLS-1$
		// // return true;
		// // }
		//
		//		if (match(command, "infotab/actions/help/save")) { //$NON-NLS-1$
		//
		// // if (getEditorFigure() != null) {
		// // getEditorFigure().getDocument().save();
		// // }
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/save_as")) { //$NON-NLS-1$
		// JO.officePane.saveAs();
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/new_blank_workbook")) { //$NON-NLS-1$
		//			JO.officePane.loadTemplateDocument("blank_workbook.xlsx"); //$NON-NLS-1$
		//
		// // getEditor(command).setShowGrid(true);
		//
		// List<ILayoutFigure> figures = getEditor(command).getLayoutFigures();
		// for (ILayoutFigure ooxmlLayoutFigure : figures) {
		// if (ooxmlLayoutFigure instanceof JOParagraphFigure) {
		// ((JOParagraphFigure) ooxmlLayoutFigure).activate(0, 0,
		// false);
		// break;
		// }
		// }
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/new_blank_presentation")) { //$NON-NLS-1$
		//
		//			JO.officePane.loadTemplateDocument("blank_presentation.pptx"); //$NON-NLS-1$
		// return true;
		// }
		//
		//		if (match(command, "actions/startmenu/open")) { //$NON-NLS-1$
		//
		// JO.officePane.doLoad();
		// return true;
		// }
		//		if (match(command, "actions/startmenu/close")) { //$NON-NLS-1$
		//
		// // if (MessageDialog.openQuestion((Shell) JO.officePane.getShell(),
		// // Messages.OOXMLInfoTabService_CloseOffice,
		// // Messages.OOXMLInfoTabService_AreYouSureToClose)) {
		// // JO.officePane.close();
		// // }
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/groups")) { //$NON-NLS-1$
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help")) { //$NON-NLS-1$
		//
		// JO.officePane.showInfoArea();
		// }
		//
		//		if (match(command, "infotab/actions/help/what_is_new")) { //$NON-NLS-1$
		//
		//			JO.officePane.loadTemplateDocument("what_is_new.docx"); //$NON-NLS-1$
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/help_content")) { //$NON-NLS-1$
		//
		//			JO.officePane.setUrl("http://help.joffice.eu/help/index.jsp"); //$NON-NLS-1$
		// return true;
		// }
		//
		// // ---------- avtivate modules
		// // -----------------------------------------
		//
		//		if (match(command, "infotab/actions/help/activation")) { //$NON-NLS-1$
		// showActivationPage();
		// return true;
		// }
		//
		// // ---------- forum
		// // ----------------------------------------------------
		//
		//		if (match(command, "infotab/actions/help/ooxml_forum")) { //$NON-NLS-1$
		//
		//			JO.officePane.setUrl(JOSession.codeBase + "/phPBB3/index.php"); //$NON-NLS-1$
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/web_page_assisi_home")) { //$NON-NLS-1$
		//
		//			JO.officePane.setUrl("JOSession.codeBase); //$NON-NLS-1$
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/web_page_ooxml_ecma")) { //$NON-NLS-1$
		//
		// JO.officePane
		//					.setUrl("http://www.ecma-international.org/publications/standards/Ecma-376.htm"); //$NON-NLS-1$
		// return true;
		// }
		//
		//		if (match(command, "infotab/actions/help/contact_us")) { //$NON-NLS-1$
		//
		// JO.officePane
		//					.setUrl(JOSession.codeBase + "/htdocs/contact_us/contact-form.php"); //$NON-NLS-1$
		// return true;
		// }
		//
		//		if (match(command, "actions/startmenu2/pinned")) { //$NON-NLS-1$
		//
		// }
		//
		//		if (match(command, "actions/startmenu/save")) { //$NON-NLS-1$
		//
		// if (getEditor(command) != null) {
		// getEditor(command).getDocument().save();
		// }
		// return true;
		// }
		//
		//		if (match(command, "actions/startmenu/save_as")) { //$NON-NLS-1$
		// JO.officePane.saveAs();
		// return true;
		// }

		return false;
	}

	/**
	 * 
	 */
	public void showActivationPage() {

		// if (JO.officePane == null) {
		// return;
		// }
		//
		// final JOAdvancedBrowser browser = (JOAdvancedBrowser) JO.officePane
		// .getBrowser();
		// ll = new LocationListener() {
		// @Override
		// public void changing(LocationEvent e) {
		// browser.setCursor(Display.getDefault().getSystemCursor(
		// SWT.CURSOR_WAIT));
		// }
		//
		// @Override
		// public void changed(LocationEvent e) {
		// // String s = browser.getText();
		//				//				if ((s.indexOf("Click to view purchase details") != -1 //$NON-NLS-1$
		//				//						|| s.indexOf("Your purchase was successful") != -1 //$NON-NLS-1$
		//				//				|| s.indexOf("Log in to complete your checkout") != -1 //$NON-NLS-1$
		// // )) {
		//				//					if (s.indexOf("joffice_subscription") != -1) { //$NON-NLS-1$
		// // activationType = 1;
		//				//					} else if (s.indexOf("joffice_subscription") != -1) { //$NON-NLS-1$
		// // activationType = 1;
		//				//					} else if (s.indexOf("joffice_subscription") != -1) { //$NON-NLS-1$
		// // activationType = 1;
		// // }
		// // }
		// //
		// // switch (activationType) {
		// // case JOActivation.ACTIVATION_JOFFICE_SUBSCRIPTION:
		//				//					if ((s.indexOf("Congratulations - your payment was sent.") != -1) //$NON-NLS-1$
		//				//							|| s.indexOf("Thank you") != -1 //$NON-NLS-1$
		//				//							|| s.indexOf("Your purchase was successful") != -1) {//$NON-NLS-1$
		// // JOActivation.activate(activationType, true);
		// // activationType = 0;
		// // JO.officePane.setHtml(JOActivation
		// // .createActivationHtml());
		// // }
		// // break;
		// // case JOActivation.ACTIVATION_JOFFICE_SVG_INTEGRATION:
		//				//					if (s.indexOf("Congratulations - your payment was sent.") != -1 //$NON-NLS-1$
		//				//							|| (s.indexOf("Thank you") != -1 && s.indexOf("$1.20") != -1)) { //$NON-NLS-1$ //$NON-NLS-2$
		// // JOActivation.activate(activationType, true);
		// // JO.officePane.setHtml(JOActivation
		// // .createActivationHtml());
		// // activationType = 0;
		// // }
		// // break;
		// // case JOActivation.ACTIVATION_JOFFICE_SDK:
		//				//					if (s.indexOf("Congratulations - your payment was sent.") != -1 //$NON-NLS-1$
		//				//							|| (s.indexOf("Thank you") != -1 && s.indexOf("$99") != -1)) { //$NON-NLS-1$ //$NON-NLS-2$
		// // JOActivation.activate(activationType, true);
		// // JO.officePane.setHtml(JOActivation
		// // .createActivationHtml());
		// // activationType = 0;
		// // }
		// // break;
		// // }
		//
		// browser.setCursor(null);
		// }
		// };

		// browser.addProgressListener(new ProgressListener() {
		//
		// @Override
		// public void completed(ProgressEvent e) {
		// browser.setCursor(null);
		// }
		//
		// @Override
		// public void changed(ProgressEvent e) {
		// browser.setCursor(Display.getDefault().getSystemCursor(
		// SWT.CURSOR_WAIT));
		// }
		// });

		// String activationHtml = JOActivation.createActivationHtml();
		// // browser.addLocationListener(ll);
		// JO.officePane.setHtml(activationHtml);
		// JO.officePane.setActivationPage(true);

	}

	public void createNewWordDocument() {
		int index = JOUtil2
				.getInteger("infotab/actions/editor/default_page_size"); //$NON-NLS-1$
		EnPageSize defaultPageSize = EnPageSize.valueOf(index);

		// if (defaultPageSize.equals(EnPageSize.LETTER)) {
		//			JO.officePane.loadTemplateDocument("blank_letter.docx"); //$NON-NLS-1$
		// } else {
		//			JO.officePane.loadTemplateDocument("blank_A4.docx"); //$NON-NLS-1$
		// }
	}

}
