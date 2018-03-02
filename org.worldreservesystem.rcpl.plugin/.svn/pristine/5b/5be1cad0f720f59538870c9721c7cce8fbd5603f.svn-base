package com.joffice.rcpl.plugin.office.internal.services;

import java.util.Iterator;

import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IParagraphFigure;
import org.eclipse.rcpl.RcplColor;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.internal.tools.ColorTool;
import org.eclipse.rcpl.internal.util.JOUtil;

import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;

import javafx.scene.paint.Color;

/**
 * @author ramin
 * 
 */
public class JOColorService extends JOAbstractOfficeService {

	public JOColorService() {
		super();
	}

	@Override
	public Object doExecute(ICommand event) throws Exception {
		IParagraph par = getEditor(event).getSelectedParagraph();

		switch (event.getCommandId()) {
		case foregroundColor:
			if (par.getTextBuffer().length() == 0) {
				return true;
			}
			ColorTool cp1 = (ColorTool) event.getTool().getTool().getData();
			Color color = cp1.getNode().getValue();
			int start = par.getSelectionStart();
			int length = par.getSelectionLength();
			if (start == -1) {
				start = 0;
				length = par.getTextBuffer().length();
			}
			par.applyForeground(start, length, new RcplColor(color));
			par.setDirtyContent(true);
			par.getLayoutFigure().updateFx();
			return true;
		default:
			break;
		}

		// Object[] colorData = event.getNewData();

		// if (match(event, "actions/colors/editor")) { //$NON-NLS-1$
		// // IColor fg = (IColor) colorData[0];
		//
		// JO.officePane.updateBgImages();
		// JO.officePane.refreshColors();
		// return true;
		// }

		// int type = (Integer) colorData[2];
		// if (match(event, "actions/colors/standard")) { //$NON-NLS-1$
		// // event.getUndo();
		// setSelectedObjectColor((IColor) colorData[0],
		// (IColor) colorData[1], type);
		// } else if (match(event, "actions/colors/theme")) { //$NON-NLS-1$
		// // event.getUndo();
		// setSelectedObjectColor((IColor) colorData[0],
		// (IColor) colorData[1], type);
		// } else if (match(event, "actions/colors/highlight")) { //$NON-NLS-1$
		// // event.getUndo();
		//
		// // setSelectedObjectColor(getEditor().getActualForgroundColor(),
		// // JOUtil.getEditor().getActualHiglightColor(), type);
		// }
		// if (type == 1) {
		// updateFgColorTool();
		// } else {
		// updateHighlightColorTool();
		// updateFillColorTool();
		// }
		return true;
	}

	/**
	 * 
	 */
	public void updateFgColorTool() {
		// IColor fg = JOUtil.getEditor().getActualForgroundColor();
		// IToolComponent tool = JOUtil2.findToolComponents(
		// "word/actions/font/font_color").get(0); //$NON-NLS-1$
		// Image image = (Image) tool.getJOImage().get();
		// GC gc = new GC(image);
		// gc.setBackground((Color) fg.getSwt());
		// gc.fillRectangle(1, 13, 14, 3);
		// gc.dispose();
		// ((Figure) tool).repaint();
	}

	/**
	 * 
	 */
	public void updateHighlightColorTool() {
		// IColor fg = JOUtil.getEditor().getActualHiglightColor();
		// IToolComponent tool = JOUtil2.findToolComponents(
		// "word/actions/font/text_highlight_color").get(0); //$NON-NLS-1$
		// Image image = (Image) tool.getJOImage().get();
		// GC gc = new GC(image);
		// gc.setBackground((Color) fg.getSwt());
		// gc.fillRectangle(1, 13, 14, 3);
		// gc.dispose();
		// ((Figure) tool).repaint();
	}

	/**
	 * 
	 */
	public void updateFillColorTool() {
		// try {
		// IColor fg = JOUtil.getEditor().getActualBackgroundColor();
		// IToolComponent tool = JOUtil2.findToolComponents(
		// "word/actions/paragraph/shading").get(0); //$NON-NLS-1$
		// Image image = (Image) tool.getJOImage().get();
		// GC gc = new GC(image);
		// gc.setBackground((Color) fg.getSwt());
		// gc.fillRectangle(1, 13, 14, 3);
		// gc.dispose();
		// ((Figure) tool).repaint();
		// } catch (Exception ex) {
		// // LOGG
		// }
	}

	/**
	 * @param fg
	 */
	public void setSelectedObjectColor(IColor fg, IColor bg, int colorType) {
		// initSelectedObjects();
		IEditor ef = getEditor();

		// for (IMovableFeedbackFigure mff0 : ef.getMovableFeebackFigures()) {
		// JOMoveFeedbackFigure mff = (JOMoveFeedbackFigure) mff0;
		// JOFigure f = (ILayoutFigure) mff.getMovableFigure();
		// if (f instanceof JODrawingFigure) {
		// JODrawingFigure df = (JODrawingFigure) f;
		// if (colorType == 1) {
		// df.getDrawing().setBorderColor(fg);
		// } else if (colorType == 2) {
		// df.getDrawing().setFillColor(bg);
		// }
		// df.getDrawing().getLayoutFigure().repaint();
		// }
		// return;
		// }

		// ---------- paragraphs -----------------------------------------------

		Iterator<ILayoutObject> it = getEditor().getDocument().layoutObjects();
		while (it.hasNext()) {
			ILayoutObject l = it.next();
			if (l instanceof JOParagraph) {
				JOParagraph par = (JOParagraph) l;
				IParagraphFigure figure = par.getLayoutFigure();
				// simulateSelection(figure);
				if (par.hasSelection()) {
					// createChangeCommand(
					// par,
					// new JOResourceEntry(
					// "actions/object/color",
					// Messages.JOColorService_ChangeColor, null));
					// //$NON-NLS-1$
					// JO.service.getParagraphService().updateStyledText(par,
					// figure.getStyledText());
					// if (colorType == 1) {
					// figure.getStyledText().getStyledTextUtil()
					// .setForegoundColor(fg);
					// } else if (colorType == 2) {
					// figure.getStyledText().setShading(bg);
					// } else {
					// figure.getStyledText().getStyledTextUtil()
					// .setBackgoundColor(bg);
					// }
					par.setDirtyContent(true);
					// JOService.getParagraphService().updateParagraph(
					// figure.getStyledText(), par);
					// finalizeCommand();
					if (selectionSimulation) {
						break;
					}
				}
			}
		}
		// finalizeSelectedObjects();
	}

	public void setHighlightColor(IColor highlight) {
		// initSelectedObjects();
		// // JOEditorFigure ef = JOUtil.getEditorFigure();
		//
		// // ---------- paragraphs
		// -----------------------------------------------
		//
		// for (ILayoutObject l : getDocument().getLayoutObjects()) {
		// if (l instanceof JOParagraph) {
		// JOParagraph par = (JOParagraph) l;
		// JOParagraphFigure figure = par.getLayoutFigure();
		// simulateSelection(figure);
		// if (figure.hasSelection()) {
		// createChangeCommand(
		// par,
		// new JOResourceEntry(
		// "actions/object/color", Messages.JOColorService_ChangeColor, null));
		// //$NON-NLS-1$
		// JOService.getParagraphService().updateStyledText(par,
		// figure.getStyledText());
		// figure.getStyledText().getStyledTextUtil()
		// .setBackgoundColor(highlight);
		// par.setDirty(true);
		// JOService.getParagraphService().updateParagraph(
		// figure.getStyledText(), par);
		// figure.markAllCharactersDirty();
		// figure.repaint();
		// finalizeCommand();
		// if (selectionSimulation) {
		// break;
		// }
		// }
		// }
		// }
		// finalizeSelectedObjects();
	}

}
