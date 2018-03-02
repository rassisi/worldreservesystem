package com.joffice.rcpl.plugin.office.internal.services;

import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.internal.util.JOUtil;

import com.joffice.rcpl.plugin.office.JOStyle;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;

public class JOFontService extends JOAbstractOfficeService {

	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOFontService.class);

	@Override
	public Object doExecute(ICommand command) throws Exception {
		IEditor editorFigure = getEditor();

		switch (command.getCommandId()) {
		case bold:
			break;

		}

		// if (match(command, "word/actions/font/strikethrough")) {
		// //$NON-NLS-1$
		// // command.setUndoable(false);
		// // JOStyle style = new JOStyle("", ""); //$NON-NLS-1$//$NON-NLS-2$
		// // style.setStrikeThrough(true);
		// // boolean heightChanged = setFontStyle(style, false);
		// // if (heightChanged) {
		// // if (editorFigure.getSelectedParagraphFigure().getParagraph() !=
		// // null)
		// // {
		// // editorFigure.setDirtyLayout(editorFigure
		// // .getSelectedParagraphFigure().getParagraph(), true,
		// // 0, true);
		// // } else {
		// // LOGGER.error("Should not happen!"); //$NON-NLS-1$
		// // }
		// // }
		// return true;
		// }
		//
		// if (match(command, "word/actions/font/change_case")) { //$NON-NLS-1$
		// // JOParagraphFigure par = JOUtil.getEditor()
		// // .getSelectedParagraphFigure();
		// // if (par != null) {
		// // String parS = par.getStyledText().getText();
		// // StringBuffer buf = new StringBuffer();
		// // int start = 0;
		// // int end = parS.length();
		// // if (par.hasSelection()) {
		// // start = par.getStartOffset();
		// // end = par.getEndOffset();
		// // }
		// // if (start > 0) {
		// // buf.append(parS.substring(0, start));
		// // }
		// // for (int i = start; i < end; i++) {
		// // if (Character.isLowerCase(parS.charAt(i))) {
		// // buf.append(Character.toUpperCase(parS.charAt(i)));
		// // } else {
		// // buf.append(Character.toLowerCase(parS.charAt(i)));
		// // }
		// // }
		// // if (end < parS.length()) {
		// // buf.append(parS.substring(end, parS.length()));
		// // }
		// //
		// // par.getStyledText().setText(buf.toString());
		// // par.getStyledText().setDirty(true);
		// // // JOService.getParagraphService().updateParagraph(
		// // // par.getStyledText(), par.getParagraph());
		// // par.markAllCharactersDirty();
		// // par.repaint();
		// // }
		// return true;
		// }
		//
		// if (match(command, "word/actions/font/superscript")) { //$NON-NLS-1$
		// // command.getUndo();
		// // JOStyle style = new JOStyle("", ""); //$NON-NLS-1$//$NON-NLS-2$
		// // style.setSuperScript(true);
		// // setFontStyle(style, false);
		// // return true;
		// }
		//
		// if (match(command, "word/actions/font/subscript")) { //$NON-NLS-1$
		// // command.getUndo();
		// JOStyle style = new JOStyle("", ""); //$NON-NLS-1$//$NON-NLS-2$
		// // style.setSubScript(true);
		// setFontStyle(style, false);
		// return true;
		// }
		//
		// if (match(command, "word/actions/font/text_highlight_color")) {
		// //$NON-NLS-1$
		// if (command.isMenuButtonAction()) {
		// if ((Boolean) command.getNewData()[1]) {
		// showColorChooser(3, -1);
		// } else {
		// JO.officePane.collapseGroup();
		// }
		// return true;
		// }
		// // getColorService().setHighlightColor(
		// // getEditorFigure().getActualHiglightColor());
		// return true;
		// }
		//
		// if (match(command, "word/actions/font/font_color")) { //$NON-NLS-1$
		// if (command.isMenuButtonAction()) {
		// if ((Boolean) command.getNewData()[1]) {
		// showColorChooser(1, -1);
		// } else {
		// JO.officePane.collapseGroup();
		// }
		// return true;
		// }
		// // getColorService().setSelectedObjectColor(
		// // getEditorFigure().getActualForgroundColor(), null, 1);
		// return true;
		// }
		//
		// if (match(command, "word/actions/font/clear_formatting")) {
		// //$NON-NLS-1$
		// // JOParagraphFigure p = JOUtil.getEditor()
		// // .getSelectedParagraphFigure();
		// // if (p != null) {
		// // p.select();
		// // JOStyle style = p.getParagraph().getJOStyle();
		// // setFontStyle(style, true);
		// // }
		// return true;
		// }
		//
		// if (match(command, "word/actions/font/grow_font")) { //$NON-NLS-1$
		// // JOParagraphFigure p = JOUtil.getEditor()
		// // .getSelectedParagraphFigure();
		// // // if (p != null) {
		// // // JOStyle style = p.getStyledText().getStyleAtCaretPosition();
		// // // if (style != null) {
		// // // int height = style.getFont().getFontData()[0].getHeight();
		// // // if (height ==
		// // JOUiConfig.FONT_SIZES[JOUiConfig.FONT_SIZES.length
		// // // - 1]) {
		// // // return true;
		// // // }
		// // // for (int i = 0; i < JOUiConfig.FONT_SIZES.length; i++) {
		// // // if (height == JOUiConfig.FONT_SIZES[i]) {
		// // // height = JOUiConfig.FONT_SIZES[i + 1];
		// // // setFontHeight(height);
		// // // return true;
		// // // }
		// // // }
		// // //
		// // // }
		// // // }
		// return true;
		// }
		//
		// if (match(command, "word/actions/font/shrink_font")) { //$NON-NLS-1$
		// // JOParagraphFigure p = JOUtil.getEditor()
		// // .getSelectedParagraphFigure();
		// // // if (p != null) {
		// // // JOStyle style = p.getStyledText().getStyleAtCaretPosition();
		// // // if (style != null) {
		// // // int height = style.getFont().getFontData()[0].getHeight();
		// // // if (height == JOUiConfig.FONT_SIZES[0]) {
		// // // return true;
		// // // }
		// // // for (int i = 0; i < JOUiConfig.FONT_SIZES.length; i++) {
		// // // if (height == JOUiConfig.FONT_SIZES[i]) {
		// // // height = JOUiConfig.FONT_SIZES[i - 1];
		// // // setFontHeight(height);
		// // // return true;
		// // // }
		// // // }
		// // //
		// // // }
		// // // }
		// return true;
		// }
		//
		// if (match(command, "actions/font/bold")) { //$NON-NLS-1$
		// // command.setUndoable(false);
		// // JOStyle style = new JOStyle("", ""); //$NON-NLS-1$//$NON-NLS-2$
		// // style.setBold(true);
		// // boolean heightChanged = setFontStyle(style, false);
		// // if (heightChanged) {
		// // if (editorFigure.getSelectedParagraphFigure().getParagraph() !=
		// // null)
		// // {
		// // editorFigure.setDirtyLayout(editorFigure
		// // .getSelectedParagraphFigure().getParagraph(), true,
		// // 0, true);
		// // } else {
		// // LOGGER.error("Should not happen!"); //$NON-NLS-1$
		// // }
		// // }
		// return true;
		// }
		// if (match(command, "actions/font/italic")) { //$NON-NLS-1$
		// // command.getUndo();
		// JOStyle style = new JOStyle("", ""); //$NON-NLS-1$//$NON-NLS-2$
		// style.setItalic(true);
		// setFontStyle(style, false);
		// return true;
		// }
		// if (match(command, "actions/font/underline")) { //$NON-NLS-1$
		// // command.getUndo();
		// JOStyle style = new JOStyle("", ""); //$NON-NLS-1$//$NON-NLS-2$
		// style.setUnderline(true);
		// setFontStyle(style, false);
		// return true;
		// }
		// if (match(command, "actions/font/fontname")) { //$NON-NLS-1$
		// // command.getUndo();
		// setFontName(command.getNewData()[0]);
		// return true;
		// }
		return false;
	}

	/**
	 * This method is only intended to set the following styles: BOLD, ITALIC
	 * and UNDERLINE
	 * 
	 * @param styleType
	 * @param value
	 */
	public boolean setFontStyle(JOStyle style, boolean clear) {
		// JO.profile();
		// initSelectedObjects();
		// JOEditorFigure editorFigure = JOUtil.getEditor();
		// boolean heightChanged = false;
		// JOParagraph firstPar = null;
		// for (JOObject l : JOUtil
		// .getEditor()
		// .getDocument()
		// .getLayoutObjects()
		// .toArray(
		// new JOObject[JOUtil.getEditor().getDocument()
		// .getLayoutObjects().size()])) {
		// if (l instanceof JOParagraph) {
		// JOParagraph par = (JOParagraph) l;
		// IParagraphFigure figure = par.getFigure();
		// // simulateSelection(figure);
		// if (figure.hasSelection()) {
		// if (firstPar == null) {
		// firstPar = par;
		// }
		// createChangeCommand(
		// par,
		// new JOResourceEntry(
		// "actions/paragraph/change_font_style",
		// Messages.JOFontService_ChangeFontStyle, null)); //$NON-NLS-1$
		// JO.service.getParagraphService().updateStyledText(par,
		// editorFigure.getStyledText());
		// if (clear) {
		// figure.markAllCharactersDirty();
		// JOStyle newStyles = style.clone();
		// editorFigure.getStyledText().getStyledTextUtil()
		// .setStyleDirect(newStyles);
		// editorFigure.getStyledText().setShading(null);
		// } else {
		// editorFigure.getStyledText().getStyledTextUtil()
		// .setStyle(style, false, true);
		// }
		// par.setDirty(true);
		// double oldHeight = par.getHeightPixel();
		// // JO.service.getParagraphService().updateParagraph(
		// // editorFigure.getStyledText(), par);
		// double newHeight = par.getHeightPixel();
		// heightChanged = oldHeight != newHeight;
		// figure.markAllCharactersDirty();
		// figure.repaint();
		// finalizeCommand();
		// }
		// }
		// }
		// finalizeSelectedObjects();
		//
		// if (firstPar != null) {
		// editorFigure.setDirtyLayout(firstPar);
		// }
		//
		// JO.profileEnd();
		// return heightChanged;

		return true;
	}

	/**
	 * @param value
	 */
	public void setFontHeight(Object value) {
		// initSelectedObjects();
		JOParagraph firstPar = null;

		// for (JOObject l : JOUtil
		// .getEditor()
		// .getDocument()
		// .getLayoutObjects()
		// .toArray(
		// new JOObject[JOUtil.getEditor().getDocument()
		// .getLayoutObjects().size()])) {
		// if (l instanceof JOParagraph) {
		// JOParagraph par = (JOParagraph) l;
		// JOParagraphFigure figure = par.getFigure();
		// styledText = figure.getStyledText();
		// simulateSelection(figure);
		// if (figure.hasSelection()) {
		// if (firstPar == null) {
		// firstPar = par;
		// }
		// createChangeCommand(
		// par,
		// new JOResourceEntry(
		// "actions/font/change_font_height",
		// Messages.JOFontService_ChangeFontHeight, null)); //$NON-NLS-1$
		// JOService.getParagraphService().updateStyledText(par,
		// styledText);
		// styledText.getStyledTextUtil().setStyleHeight(
		// (Integer) value);
		// JOService.getParagraphService().updateParagraph(styledText,
		// par);
		// JOService.getParagraphService().updateParagraphHeight(
		// figure, styledText, false);
		// figure.markAllCharactersDirty();
		// dirtyLayoutObjects.add(par);
		// finalizeCommand();
		// if (selectionSimulation) {
		// break;
		// }
		// }
		// }
		// }
		// finalizeSelectedObjects();
		if (firstPar != null) {
			firstPar.setDirtyLayout(true);
			firstPar.getDocument().getEditor().layoutDocument();
		}

	}

}
