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
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplCommand;

/**
 * @author eclipse
 * 
 */
public class RcplEditorService extends RcplService {

	public RcplEditorService() {
	}

	@Override
	public Object doExecute(ICommand command) throws Exception {

		// Rcpl.UIC.

		switch (command.getCommandId()) {
		case open:
			Rcpl.UIC.actionOpen();
			break;
		case open_last_document:
			Rcpl.UIC.actionOpenLast();
			break;
		case save:
			// Rcpl.UIC.save();
			break;
		case save_as:
			// Rcpl.UIC.saveAs();
			break;
		case test_layout:
			IParagraph sel = getEditor().getSelectedParagraph();
			if (sel != null) {
				sel.setDirtyLayout(true);
				sel.getDocument().getEditor().layoutDocument();
			}
			break;
		case test_z_order:
			getEditor().getPage(1).zOrder();
			break;
		default:
			break;

		}

		// if (getId(command).equals("word/actions/editor/open_home")) {
		// //$NON-NLS-1$
		// JO.officePane.closeAllEditors();
		// getBrowserService().showWelcomePage();
		// return true;
		// }
		//
		// if (getId(command).equals("actions/editor/select")) { //$NON-NLS-1$
		// selectObjectsAndParagraphs(command);
		// return true;
		// }
		//
		// if (getId(command).indexOf("word/actions/editor/find_next") != -1) {
		// //$NON-NLS-1$
		// boolean allOccurencies = false;
		// ITextable tool = (ITextable) JOUtil2.findEditorToolComponents(
		// "word/actions/editor/find_what").get(0); //$NON-NLS-1$
		// boolean matchCase = JOUtil2
		// .getBooleanGuiState("word/actions/editor/match_case"); //$NON-NLS-1$
		//
		// String searchString = tool.getText();
		// List<IParagraph> pars = JOUtil.getDocument().getParagraphs();
		// IParagraph startPar = getEditor().getSelectedParagraph();
		// int startOffset = 0;
		// if (startPar == null) {
		// startPar = pars.get(0);
		// } else {
		// // startOffset = startPar.getStyledText().getCaretOffset();
		// }
		// if (!matchCase) {
		// searchString = searchString.toLowerCase();
		// }
		// for (IParagraph joParagraph = startPar; joParagraph != null;
		// joParagraph = joParagraph
		// .getNextParagraph()) {
		// if (!allOccurencies) {
		// joParagraph.unselect();
		// }
		// String parText = joParagraph.getTextBuffer().toString();
		// if (!matchCase) {
		// parText = parText.toLowerCase();
		// }
		// if (joParagraph == startPar) {
		// parText = parText.substring(startOffset, parText.length());
		// }
		// int pos = parText.indexOf(searchString);
		// if (pos != -1) {
		// joParagraph.getFigure().activate(0, 0, false);
		//
		// // TODO:
		// // joParagraph.setsel
		// // getFigure().setStartOffset(pos);
		// // joParagraph.getFigure().setEndOffset(
		// // pos + searchString.length());
		//
		// joParagraph.getFigure().setCaretOffset(
		// pos + searchString.length());
		// break;
		// }
		// }
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/select_objects_mode")) {
		// //$NON-NLS-1$
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/distribute_random")) {
		// //$NON-NLS-1$
		// distributeRandomly();
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/distribute_left")) {
		// //$NON-NLS-1$
		// distribute(true);
		// return true;
		// }
		//
		// if (match(command,
		// "word/actions/editor/distribute_horizontal_center")) { //$NON-NLS-1$
		// distribute(true);
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/distribute_right")) {
		// //$NON-NLS-1$
		// distribute(true);
		// return true;
		// }
		//
		// if (match(command,
		// "word/actions/editor/distribute_horizontal_gapes")) { //$NON-NLS-1$
		// distribute(true);
		// return true;
		// }
		//
		// // ---------- vertical distribution
		// ------------------------------------
		//
		// if (match(command, "word/actions/editor/distribute_top")) {
		// //$NON-NLS-1$
		// distribute(false);
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/distribute_vertical_center"))
		// { //$NON-NLS-1$
		// distribute(false);
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/distribute_bottom")) {
		// //$NON-NLS-1$
		// distribute(false);
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/distribute_vertical_gapes"))
		// { //$NON-NLS-1$
		// distribute(false);
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/align_vertical_center")) {
		// //$NON-NLS-1$
		// // Rectangle r = null;
		// // Rectangle realBounds = new Rectangle();
		// // for (IMovableFeedbackFigure mff0 : JOUtil.getEditor()
		// // .getMovableFeebackFigures()) {
		// // JOMoveFeedbackFigure mff = (JOMoveFeedbackFigure) mff0;
		// // if (r == null) {
		// // r = mff.getBounds();
		// // realBounds = mff.getRealBounds();
		// // } else {
		// // int y = mff.getLocation().y;
		// // int x = realBounds.x + realBounds.width / 2
		// // - mff.getRealBounds().width / 2
		// // - mff.getDiffWidth();
		// // mff.setLocation(x, y);
		// // mff.changeBounds();
		// // }
		// // }
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/align_horizontal_center")) {
		// //$NON-NLS-1$
		// // Rectangle r = null;
		// // Rectangle realBounds = new Rectangle();
		// // for (IMovableFeedbackFigure mff0 : JOUtil.getEditor()
		// // .getMovableFeebackFigures()) {
		// // JOMoveFeedbackFigure mff = (JOMoveFeedbackFigure) mff0;
		// // if (r == null) {
		// // r = mff.getBounds();
		// // realBounds = mff.getRealBounds();
		// // } else {
		// // int x = mff.getLocation().x;
		// // int y = realBounds.y + realBounds.height / 2
		// // - mff.getRealBounds().height / 2
		// // - mff.getDiffHeight();
		// // mff.setLocation(x, y);
		// // mff.changeBounds();
		// // }
		// // }
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/align_top")) { //$NON-NLS-1$
		// // Rectangle r = null;
		// // Rectangle realBounds = new Rectangle();
		// // for (IMovableFeedbackFigure mff0 : JOUtil.getEditor()
		// // .getMovableFeebackFigures()) {
		// // JOMoveFeedbackFigure mff = (JOMoveFeedbackFigure) mff0;
		// // if (r == null) {
		// // r = mff.getBounds();
		// // realBounds = mff.getRealBounds();
		// // } else {
		// // int x = mff.getLocation().x;
		// // int y = realBounds.y - mff.getDiffHeight();
		// // mff.setLocation(x, y);
		// // mff.changeBounds();
		// // }
		// // }
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/align_bottom")) {
		// //$NON-NLS-1$
		// // Rectangle r = null;
		// // Rectangle realBounds = new Rectangle();
		// // for (IMovableFeedbackFigure mff0 : JOUtil.getEditor()
		// // .getMovableFeebackFigures()) {
		// // JOMoveFeedbackFigure mff = (JOMoveFeedbackFigure) mff0;
		// // if (r == null) {
		// // r = mff.getBounds();
		// // realBounds = mff.getRealBounds();
		// // } else {
		// // int x = mff.getLocation().x;
		// // int y = realBounds.y + realBounds.height
		// // - mff.getRealBounds().height - mff.getDiffHeight();
		// // mff.setLocation(x, y);
		// // mff.changeBounds();
		// // }
		// // }
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/align_left")) { //$NON-NLS-1$
		// // Rectangle r = null;
		// // Rectangle realBounds = new Rectangle();
		// // for (IMovableFeedbackFigure mff0 : JOUtil.getEditor()
		// // .getMovableFeebackFigures()) {
		// // JOMoveFeedbackFigure mff = (JOMoveFeedbackFigure) mff0;
		// // if (r == null) {
		// // r = mff.getBounds();
		// // realBounds = mff.getRealBounds();
		// // } else {
		// // int y = mff.getLocation().y;
		// // int x = realBounds.x - mff.getDiffWidth();
		// // mff.setLocation(x, y);
		// // mff.changeBounds();
		// // }
		// // }
		// return true;
		// }
		//
		// if (match(command, "word/actions/editor/align_right")) {
		// //$NON-NLS-1$
		// // Rectangle r = null;
		// // Rectangle realBounds = new Rectangle();
		// // for (IMovableFeedbackFigure mff0 : JOUtil.getEditor()
		// // .getMovableFeebackFigures()) {
		// // JOMoveFeedbackFigure mff = (JOMoveFeedbackFigure) mff0;
		// // if (r == null) {
		// // r = mff.getBounds();
		// // realBounds = mff.getRealBounds();
		// // } else {
		// // int y = mff.getLocation().y;
		// // int x = realBounds.x + realBounds.width
		// // - mff.getRealBounds().width - mff.getDiffWidth();
		// // mff.setLocation(x, y);
		// // mff.changeBounds();
		// // }
		// // }
		// return true;
		// }
		//
		// // ---------- not implemented yet
		// --------------------------------------
		//
		// if (match(command, "word/actions/editor/show_picture_group")) {
		// //$NON-NLS-1$
		// return true;
		// }
		// if (match(command, "word/actions/editor/show_textbox_group")) {
		// //$NON-NLS-1$
		// return true;
		// }
		// if (match(command, "word/actions/editor/show_table_group")) {
		// //$NON-NLS-1$
		// return true;
		// }
		// if (match(command, "actions/editor/system_info")) { //$NON-NLS-1$
		// JO.officePane.showSystemInfoShell();
		// return true;
		// }
		// if (match(command, "actions/editor/show_log")) { //$NON-NLS-1$
		//
		// JO.officePane.showLogShell();
		// return true;
		// }
		//
		// if (match(command, "actions/editor/match_case")) { //$NON-NLS-1$
		// return true;
		// }
		//
		// if (match(command, "actions/editor/find_whole_word_only")) {
		// //$NON-NLS-1$
		// return true;
		// }
		//
		// if (match(command, "actions/editor/use_wildcards")) { //$NON-NLS-1$
		// return true;
		// }
		//
		// if (match(command, "actions/editor/sounds_like_english")) {
		// //$NON-NLS-1$
		// return true;
		// }
		//
		// if (match(command, "actions/editor/find_all_words_forms")) {
		// //$NON-NLS-1$
		// return true;
		// }
		//
		// if (match(command, "actions/editor/match_prefix")) { //$NON-NLS-1$
		// return true;
		// }
		//
		// if (match(command, "actions/editor/match_suffix")) { //$NON-NLS-1$
		// return true;
		// }
		//
		// if (match(command, "actions/editor/ignore_punctuation_characters")) {
		// //$NON-NLS-1$
		// return true;
		// }
		//
		// if (match(command, "actions/editor/ignore_white_space_characters")) {
		// //$NON-NLS-1$
		// return true;
		// }
		//
		// if (match(command, "actions/editor/special")) { //$NON-NLS-1$
		// return true;
		// }
		//
		// // ---------- implemented
		// ----------------------------------------------
		//
		// if (match(command, JO.TOOL_INSERT_PARAGRAPH)) {
		// // if (command.isUndo()) {
		// // JOParagraph par = (JOParagraph) command.getObject();
		// // JOParagraph dirtyPar = par.getPreviousRootParagraph();
		// // if (dirtyPar == null) {
		// // dirtyPar = par.getNextRootParagraph();
		// // }
		// // par.dispose();
		// // if (dirtyPar != null) {
		// // getEditor().setDirtyLayout(dirtyPar);
		// // dirtyPar.getFigure().activate();
		// // dirtyPar.getFigure().setCaretOffset(command.getOffset());
		// // }
		// // } else {
		// // IParagraph par = (JOParagraph) command.getNewData()[0];
		// // boolean insertBefore = (Boolean) command.getNewData()[1];
		// // if (insertBefore) {
		// // JO.service.getParagraphService().expandAfter(par, false);
		// // // JOService.getParagraphService().expandBefore(par);
		// // } else {
		// // JO.service.getParagraphService().expandAfter(par, false);
		// // }
		// // // JOService.getParagraphService().insertParagraph(par, "",
		// //$NON-NLS-1$
		// // // insertBefore);
		// // JOUtil.getEditor().setDirtyLayout(
		// // par.getPreviousRootParagraph());
		// // }
		// return true;
		// }
		//
		// if (match(command, "actions/editor/recalculate")) { //$NON-NLS-1$
		// // ((JOEditorFigure) JOUtil.getEditor()).getSpreadsheetFigure()
		// // .getSheet().getWorkbook().recalculate();
		// return true;
		// }
		//
		// if (match(command, "actions/editor/zoom_automatic")) { //$NON-NLS-1$
		// // boolean zoomAutomatic = (Boolean) command.getNewData()[0];
		// // if (JOUtil.getEditor().getDocument() != null) {
		// // JOUtil.getEditor().setResizeAutomatic(zoomAutomatic);
		// // JOUtil.getEditor().getDocument()
		// // .set(JO.REGISTRY_AUTOMATIC_RESIZE, zoomAutomatic);
		// // } else if (((JOEditorFigure) JOUtil.getEditor()).getEditorArea()
		// // .getAdvancedBrowser() != null) {
		// //
		// // }
		// return true;
		// }
		//
		// if (match(command, "actions/editor/view_presentation_normal")) {
		// //$NON-NLS-1$
		// // getEditor().setSlideMasterView(false);
		// // JO.service.getLayoutService().layout(editorFigure);
		// return true;
		// }
		// if (match(command, "actions/editor/view_presentation_master_slide"))
		// { //$NON-NLS-1$
		// // editorFigure.setSlideMasterView(true);
		// // JO.service.getLayoutService().layout(editorFigure);
		// return true;
		// }
		//
		// if (match(command, "actions/editor/view_slidemaster")) {
		// //$NON-NLS-1$
		// // boolean slideMasterView = (Boolean) command.getNewData()[0];
		// // editorFigure.setSlideMasterView(slideMasterView);
		// // JO.service.getLayoutService().layout(editorFigure);
		// return true;
		// }
		//
		// if (match(command, "actions/editor/bounds_changed")) { //$NON-NLS-1$
		// // JOFigure layoutFigure = (ILayoutFigure) command.getData()[0];
		// // org.eclipse.draw2d.geometry.Rectangle r =
		// // (org.eclipse.draw2d.geometry.Rectangle) command
		// // .getData()[1];
		// // layoutFigure.setRealBounds(r);
		// return true;
		// }
		//
		// if (match(command, "actions/editor/zoom_100")) { //$NON-NLS-1$
		// // if (editorFigure == null) {
		// // return true;
		// // }
		// // editorFigure.setScale(1);
		// return true;
		// }
		// if (match(command, "actions/editor/zoom_out")) { //$NON-NLS-1$
		// // if (editorFigure == null) {
		// // return true;
		// // }
		// // editorFigure.setScale(editorFigure.getScale() * 0.9);
		// return true;
		// }
		// if (match(command, "actions/editor/zoom_in")) { //$NON-NLS-1$
		// // if (editorFigure == null) {
		// // return true;
		// // }
		// // double scale = editorFigure.getScale();
		// // scale = scale * 1.1;
		// // editorFigure.setScale(scale);
		// return true;
		// }
		// if (match(command, "actions/editor/grid", false)) { //$NON-NLS-1$
		// // if (editorFigure == null) {
		// // return true;
		// // }
		// // boolean showGrid = (Boolean) command.getData()[0];
		// // editorFigure.setShowGrid(showGrid);
		// return true;
		// }
		// if (match(command, "actions/editor/outline", false)) { //$NON-NLS-1$
		// // if (editorFigure == null) {
		// // return true;
		// // }
		// // editorFigure.setShowOutline((Boolean) command.getNewData()[0]);
		// // return true;
		// }

		return false;
	}

	/**
	 * @param horizontal
	 */
	private void distribute(boolean horizontal) {
		// int number = JOUtil.getEditor().getMovableFeebackFigures().size();
		// if (number < 2) {
		// return;
		// }
		// if (horizontal) {
		// int horSize = 0;
		// int x = ((JOMoveFeedbackFigure) JOUtil.getEditor()
		// .getMovableFeebackFigures().get(0)).getRealBounds().x;
		//
		// Rectangle lastRealBounds = ((JOMoveFeedbackFigure) ((JOEditorFigure)
		// JOUtil
		// .getEditor()).getMovableFeebackFigures().get(
		// JOUtil.getEditor().getMovableFeebackFigures().size() - 1))
		// .getRealBounds();
		// int x2 = lastRealBounds.x + lastRealBounds.width;
		//
		// int diff = x2 - x;
		// for (IMovableFeedbackFigure mff0 : ((JOEditorFigure) JOUtil
		// .getEditor()).getMovableFeebackFigures()) {
		// JOMoveFeedbackFigure mff = (JOMoveFeedbackFigure) mff0;
		// horSize += mff.getRealBounds().width;
		// }
		// int gap = (diff - horSize) / (number - 1);
		//
		// // sort first
		//
		// x = ((JOMovableFigure) JOUtil.getEditor()
		// .getMovableFeebackFigures().get(0)).getRealBounds().x;
		//
		// for (IMovableFeedbackFigure mff0 : ((JOEditorFigure) JOUtil
		// .getEditor()).getMovableFeebackFigures()) {
		// JOMoveFeedbackFigure mff = (JOMoveFeedbackFigure) mff0;
		// Rectangle realBounds = mff.getRealBounds();
		// int y = mff.getLocation().y;
		// mff.setLocation(new Point(x - mff.getDiffWidth(), y));
		// mff.changeBounds();
		// x += realBounds.width + gap;
		// }
		// } else {
		// int vertSize = 0;
		// int y = ((JOMovableFigure) JOUtil.getEditor()
		// .getMovableFeebackFigures().get(0)).getRealBounds().y;
		//
		// Rectangle lastRealBounds = ((JOMovableFigure) ((JOEditorFigure)
		// JOUtil
		// .getEditor()).getMovableFeebackFigures().get(
		// JOUtil.getEditor().getMovableFeebackFigures().size() - 1))
		// .getRealBounds();
		// int y2 = lastRealBounds.y + lastRealBounds.height;
		//
		// int diff = y2 - y;
		// for (IMovableFeedbackFigure mff0 : ((JOEditorFigure) JOUtil
		// .getEditor()).getMovableFeebackFigures()) {
		// JOMoveFeedbackFigure mff = (JOMoveFeedbackFigure) mff0;
		// vertSize += mff.getRealBounds().height;
		// }
		// int gap = (diff - vertSize) / (number - 1);
		//
		// // sort first
		//
		// y = ((JOMoveFeedbackFigure) JOUtil.getEditor()
		// .getMovableFeebackFigures().get(0)).getRealBounds().y;
		//
		// for (IMovableFeedbackFigure mff0 : ((JOEditorFigure) JOUtil
		// .getEditor()).getMovableFeebackFigures()) {
		// JOMoveFeedbackFigure mff = (JOMoveFeedbackFigure) mff0;
		// Rectangle realBounds = mff.getRealBounds();
		// int x = mff.getLocation().x;
		// mff.setLocation(new Point(x, y - mff.getDiffHeight()));
		// mff.changeBounds();
		// y += realBounds.height + gap;
		// }
		// }

	}

	/**
	 * 
	 */
	private void distributeRandomly() {
		// int number = JOUtil.getEditor().getMovableFeebackFigures().size();
		// if (number < 2) {
		// return;
		// }
		// int x = ((JOMoveFeedbackFigure) JOUtil.getEditor()
		// .getMovableFeebackFigures().get(0)).getRealBounds().x;
		// int y = ((JOMoveFeedbackFigure) JOUtil.getEditor()
		// .getMovableFeebackFigures().get(0)).getRealBounds().y;
		//
		// Rectangle lastRealBounds = ((JOMovableFigure) ((JOEditorFigure)
		// JOUtil
		// .getEditor()).getMovableFeebackFigures().get(
		// JOUtil.getEditor().getMovableFeebackFigures().size() - 1))
		// .getRealBounds();
		// int x2 = lastRealBounds.x + lastRealBounds.width;
		// int y2 = lastRealBounds.y + lastRealBounds.height;
		// for (IMovableFeedbackFigure mff0 : ((JOEditorFigure)
		// JOUtil.getEditor())
		// .getMovableFeebackFigures()) {
		// JOMoveFeedbackFigure mff = (JOMoveFeedbackFigure) mff0;
		// double random = Math.random();
		// double xRandom = (double) (x + (x2 - x) * random);
		// double yRandom = (double) (y + (y2 - y) * random);
		// mff.setLocation(new Point(xRandom - mff.getDiffWidth(), yRandom
		// - mff.getDiffHeight()));
		// mff.changeBounds();
		// }
	}

	public void selectObjectsAndParagraphs(RcplCommand command) {

		// initSelectedObjects();

		// ---------- execute the undo/redo command ----------------------------

		// List<IFigure> collectedFigures = (List<IFigure>)
		// command.getNewData()[0];
		// List<ParagraphSelection> collectedParagraphs =
		// (List<ParagraphSelection>) command
		// .getNewData()[1];
		// if (command.isUndo()) {
		// for (IFigure f : collectedFigures) {
		// if (f instanceof JOMovableFigure) {
		// ((JOMovableFigure) f).unselect();
		// }
		// }
		// for (ParagraphSelection ps : collectedParagraphs) {
		// ps.paaragraph.unselect();
		// }
		// } else if (command.isRedo()) {
		// for (IFigure f : collectedFigures) {
		// if (f instanceof JOMovableFigure) {
		// ((JOMovableFigure) f).select();
		// }
		// }
		// for (ParagraphSelection ps : collectedParagraphs) {
		// ps.paaragraph.setStartOffset(ps.start);
		// ps.paaragraph.setEndOffset(ps.end);
		// ps.paaragraph.repaint();
		// }
		// } else {
		//
		// try {
		// boolean selectObjectMode = false;
		// JOToolComponent joTool = JOUtil.findTopTools(
		// "word/actions/editor/select_objects_mode").get(0); //$NON-NLS-1$
		// if (joTool != null) {
		// selectObjectMode = joTool.isSelected();
		// }
		// for (IFigure f : collectedFigures) {
		// if (f instanceof JOFigure) {
		// if (selectObjectMode) {
		// if (f instanceof JOMovableFigure) {
		// ((ILayoutFigure) f).dragSelect();
		// }
		// } else {
		// ((ILayoutFigure) f).dragSelect();
		// }
		// }
		// }
		//
		// if (joTool != null) {
		// joTool.setSelected(false, false);
		// }
		//
		// if (!collectedParagraphs.isEmpty()) {
		// ParagraphSelection lastSel = collectedParagraphs
		// .get(collectedParagraphs.size() - 1);
		// JOParagraphFigure lastP = lastSel.paaragraph;
		// lastP.activate(FocusReason.POSITION_TO_END_OF_SELECTION);
		// }
		// } catch (Exception ex) {
		// LOGGER.error("", "", ex);
		// }
		//
		// }

	}

	public void closeEditor() {

	}
}
