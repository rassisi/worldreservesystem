package com.joffice.rcpl.plugin.office.internal.services;

import org.eclipse.rcpl.EnPageSize;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.internal.config.RcplConfig;
import org.eclipse.rcpl.util.JOUtil2;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuCentimeter;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuInches;

/**
 * @author eclipse
 * 
 */
public class JOPageService extends JOAbstractOfficeService {

	// @SuppressWarnings("unused")
	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOPageService.class);

	@Override
	public Object doExecute(ICommand command) throws Exception {

		// if (getId(command).indexOf("word/actions/page/columns") != -1) {
		// //$NON-NLS-1$
		// JOPageFigure page = (JOPageFigure) JO.officePane.getEditor()
		// .getSelectedPage();
		// CTSectPr sectPr = (CTSectPr) page.getSection().getXmlObject();
		//
		// double spacing = (page.getSize().getWidth() * 0.06);
		//
		// String nC = JOUtil2
		// .getStringGuiState("word/actions/page/number_of_columns");
		// //$NON-NLS-1$
		// if (nC.length() == 0) {
		// nC = "2"; //$NON-NLS-1$
		// JOUtil2.setStringGuiState(
		// "word/actions/page/number_of_columns", //$NON-NLS-1$
		// nC);
		// }
		// int numberOfColumns = Integer.valueOf(nC);
		// if (!sectPr.isSetCols()) {
		// CTColumns columns = sectPr.addNewCols();
		// columns.setSpace(BigInteger.valueOf(((long) new JOEmuPixel(
		// spacing).toPoints() * 20)));
		// columns.setNum(BigInteger.valueOf(numberOfColumns));
		// CTColumn[] colArray = new CTColumn[numberOfColumns];
		// for (int i = 0; i < numberOfColumns; i++) {
		// colArray[i] = CTColumn.Factory.newInstance();
		// colArray[i].setW(BigInteger.valueOf((long) (new JOEmuPixel(
		// page.getSize().getWidth() / numberOfColumns)
		// .toPoints() * 20)));
		// colArray[i].setSpace(BigInteger.valueOf(2));
		// }
		// columns.setColArray(colArray);
		// } else {
		// sectPr.unsetCols();
		// }
		// page.getSection().updateFromXml();
		// page.repaint();
		// ((JOEditorFigure) JO.officePane.getEditor())
		// .setDirtyLayout((JOObject) JO.officePane.getEditor()
		// .getDocument().getRootObjects().get(0));
		// return true;
		// }
		//
		// if (getId(command).indexOf("word/actions/page/page_borders") != -1) {
		// //$NON-NLS-1$
		// IPage page = JOUtil.getEditor().getSelectedPage();
		// CTSectPr sectPr = (CTSectPr) page.getSection().getXmlObject();
		// CTPageBorders pageBorders;
		// if (!sectPr.isSetPgBorders()) {
		// pageBorders = sectPr.addNewPgBorders();
		// CTBorder border = CTBorder.Factory.newInstance();
		// border.setSpace(BigInteger.valueOf(24));
		// border.setSz(BigInteger.valueOf(4 * 12));
		// // border.setColor(JO.colorProvider.getBytesFromCOLOR(JOUtil
		// // .getEditor().getActualForgroundColor()));
		// pageBorders.setTop(border);
		//
		// border = CTBorder.Factory.newInstance();
		// border.setSpace(BigInteger.valueOf(24));
		// border.setSz(BigInteger.valueOf(4 * 12));
		// // border.setColor(JO.colorProvider.getBytesFromCOLOR(JOUtil
		// // .getEditor().getActualForgroundColor()));
		// pageBorders.setBottom(border);
		//
		// border = CTBorder.Factory.newInstance();
		// border.setSpace(BigInteger.valueOf(24));
		// border.setSz(BigInteger.valueOf(4 * 12));
		// // border.setColor(JO.colorProvider.getBytesFromCOLOR(JOUtil
		// // .getEditor().getActualForgroundColor()));
		// pageBorders.setLeft(border);
		//
		// border = CTBorder.Factory.newInstance();
		// border.setSpace(BigInteger.valueOf(24));
		// border.setSz(BigInteger.valueOf(4 * 12));
		// // border.setColor(JO.colorProvider.getBytesFromCOLOR(JOUtil
		// // .getEditor().getActualForgroundColor()));
		// pageBorders.setRight(border);
		//
		// } else {
		// sectPr.unsetPgBorders();
		// }
		// page.getSection().updateFromXml();
		// page.repaint();
		// return true;
		// }
		//
		// if (getId(command).indexOf("word/actions/page/watermark") != -1) {
		// //$NON-NLS-1$
		// String text = JOUtil2
		// .getStringGuiState("word/actions/page/watermark_text"); //$NON-NLS-1$
		// JOUtil.getDocument().addWatermark(text);
		// return true;
		// }
		//
		// if (getId(command).indexOf("actions/page/set_landscape") != -1) {
		// //$NON-NLS-1$
		// layoutDocument();
		// return true;
		// }
		//
		// if (getId(command).indexOf("actions/page/set_portrait") != -1) {
		// //$NON-NLS-1$
		// layoutDocument();
		// return true;
		// }
		//
		// if (getId(command).indexOf("actions/page/size_") != -1) {
		// //$NON-NLS-1$
		// layoutDocument();
		// return true;
		// }
		//
		// if (getId(command).indexOf("actions/page/page_size") != -1) {
		// //$NON-NLS-1$
		// EnPageSize pageSize = (EnPageSize) command.getNewData()[1];
		// setPageSize(pageSize);
		// return true;
		// }
		//
		// if (match(command, "word/actions/page/margin_left") //$NON-NLS-1$
		// || match(command, "word/actions/page/margin_top") //$NON-NLS-1$
		// || match(command, "word/actions/page/margin_right") //$NON-NLS-1$
		// || match(command, "word/actions/page/margin_bottom")) { //$NON-NLS-1$
		//
		// // if (JOUtil.getEditor().isAllObjectLayoutedAfterLoading()) {
		// // JO.service.getLayoutService().layoutPages();
		// // List<ILayoutObject> rootObjects = JOUtil.getEditor()
		// // .getDocument().getRootObjects();
		// // for (ILayoutObject joObject : rootObjects) {
		// // joObject.setDirtyLayout(true);
		// // }
		// // JOUtil.getEditor().setDirtyLayout(null);
		// // }
		// return true;
		// }
		//
		// if (match(command, "actions/page/show_rulers")) { //$NON-NLS-1$
		// // JO.service.getPageService()
		// // .showRuler((Boolean) command.getData()[0]);
		// // //
		// // firstLineIndentFigure.setVisible(buttonShowRulers.isSelected());
		// return true;
		// }
		//
		// if (match(command, "actions/page_edit")) { //$NON-NLS-1$
		// // selectGroup(
		// // "word/actions/groups/page", command.getEntry().getShelfIndex(),
		// (Boolean) command.getData()[0]); //$NON-NLS-1$
		// return true;
		// }
		//
		// if (match(command, "actions/page/two_pages")) { //$NON-NLS-1$
		// if (JOUtil.getEditor().getDocument() == null) {
		// return true;
		// }
		// int pageColumns = ((Boolean) command.getNewData()[0]) ? 2 : 1;
		// getLayoutService().setPageLayout(pageColumns);
		// if (JO.officePane != null) {
		// if (pageColumns == 2) {
		// JO.officePane.selectTwoPages(true);
		// JOUtil.getEditor().getDocument()
		// .set(JO.REGISTRY_TWO_PAGE_LAYOUT, true);
		// } else {
		// JO.officePane.selectTwoPages(false);
		// JOUtil.getEditor().getDocument()
		// .set(JO.REGISTRY_TWO_PAGE_LAYOUT, false);
		// }
		// }
		//
		// return true;
		// }
		// if (match(command, "actions/page/multi_pages")) { //$NON-NLS-1$
		// getLayoutService().setPageLayout(
		// ((Boolean) command.getNewData()[0]) ? 2 : 1);
		// return true;
		// }
		return false;
	}

	/**
	 * @param show
	 */
	public void showRuler(boolean show) {
		// JOEditorFigure ef = JOUtil.getEditor();
		// if (show) {
		// ef.getCornerRuler().setVisible(true);
		// ef.expandHorizontalRuler();
		// ef.expandVerticalArea();
		// if (ef.getVerticalRuler() != null) {
		// ef.getVerticalRuler().repaint();
		// }
		// } else {
		// ef.getCornerRuler().setVisible(false);
		// ef.collapseHorizontalRuler();
		// ef.collapseVerticalArea();
		// }
		// if (ef.getHorizontalRuler() != null) {
		// ef.getHorizontalRuler().getFirstLineIndentFigure().setVisible(show);
		// ef.getHorizontalRuler().getHangingLineIndentFigure()
		// .setVisible(show);
		// ef.getHorizontalRuler().getLeftLineIndentFigure().setVisible(show);
		// }
		// ef.setShowRulers(show);

	}

	public void changeColor(Object color) {
		// getEditorFigure().setForegroundColor((Color) color);
	}

	/**
	 * 
	 */
	private void layoutDocument() {
		// JOEditorFigure ef = JOUtil.getEditor();
		// if (ef != null) {
		// if (!ef.isAllObjectLayoutedAfterLoading()) {
		// return;
		// }
		// JO.service.getLayoutService().layoutPages();
		// List<ILayoutObject> rootObjects = JOUtil.getEditor().getDocument()
		// .getRootObjects();
		// // for (ILayoutObject joObject : rootObjects) {
		// // ((JOObject) joObject).setDirtyHeight(true);
		// // if (joObject instanceof JOParagraph) {
		// // ((JOParagraph) joObject).updateWidth();
		// // JO.service.getParagraphService().updateParagraphHeight(
		// // (IParagraphFigure) joObject.getLayoutFigure(),
		// // null, false);
		// // }
		// // joObject.setDirtyLayout(true);
		// // }
		// JOUtil.getEditor().setDirtyLayout(null);
		// }
	}

	/**
	 * @param pageSize
	 */
	public void setPageSize(EnPageSize pageSize) {
		double cmWidth = pageSize.getCmWidth();
		double cmHeight = pageSize.getCmHeight();
		double inchWidth = pageSize.getInchWidth();
		double inchHeight = pageSize.getInchHeight();
		double inchMargin = pageSize.getInchMargin();
		double cmMargin = pageSize.getCmMargin();
		JOEmu emuW;
		JOEmu emuH;
		JOEmu emuM;
		if (cmWidth > 0) {
			emuW = new JOEmuCentimeter(cmWidth);
			emuH = new JOEmuCentimeter(cmHeight);
		} else {
			emuW = new JOEmuInches(inchWidth);
			emuH = new JOEmuInches(inchHeight);
		}
		if (emuW.toPixel() == 0 || emuH.toPixel() == 0) {
			return;
		}
		if (cmMargin > 0) {
			emuM = new JOEmuCentimeter(cmMargin);
		} else {
			emuM = new JOEmuInches(inchMargin);
		}

		// TODO
		// JOWTToolComponentTextField cWidth = (JOWTToolComponentTextField)
		// JOUtil
		// .findEditorToolComponents("word/actions/page/size_width").get(0);
		// //$NON-NLS-1$
		// JOWTToolComponentTextField cHeight = (JOWTToolComponentTextField)
		// JOUtil
		// .findEditorToolComponents("word/actions/page/size_height").get(0);
		// //$NON-NLS-1$
		//
		// JOWTToolComponentTextField cMarginLeft = (JOWTToolComponentTextField)
		// JOUtil
		// .findEditorToolComponents("word/actions/page/margin_left").get(0);
		// //$NON-NLS-1$
		// JOWTToolComponentTextField cMarginRight =
		// (JOWTToolComponentTextField) JOUtil
		// .findEditorToolComponents("word/actions/page/margin_right").get(0);
		// //$NON-NLS-1$
		// JOWTToolComponentTextField cMarginTop = (JOWTToolComponentTextField)
		// JOUtil
		// .findEditorToolComponents("word/actions/page/margin_top").get(0);
		// //$NON-NLS-1$
		// JOWTToolComponentTextField cMarginBottom =
		// (JOWTToolComponentTextField) JOUtil
		// .findEditorToolComponents("word/actions/page/margin_bottom").get(0);
		// //$NON-NLS-1$

		int index = JOUtil2.getDefaultInteger("infotab/actions/editor/show_measurements_in_units_of"); //$NON-NLS-1$

		// inch;cm;millimeter;points;picas;pixel
		// switch (index) {
		// case 0:
		// cWidth.getFormattedText().setValue(emuW.toInch());
		// cHeight.getFormattedText().setValue(emuH.toInch());
		// cMarginBottom.getFormattedText().setValue(emuM.toInch());
		// cMarginLeft.getFormattedText().setValue(emuM.toInch());
		// cMarginRight.getFormattedText().setValue(emuM.toInch());
		// cMarginTop.getFormattedText().setValue(emuM.toInch());
		// break;
		// case 1:
		// cWidth.getFormattedText().setValue(emuW.toCm());
		// cHeight.getFormattedText().setValue(emuH.toCm());
		// cMarginBottom.getFormattedText().setValue(emuM.toCm());
		// cMarginLeft.getFormattedText().setValue(emuM.toCm());
		// cMarginRight.getFormattedText().setValue(emuM.toCm());
		// cMarginTop.getFormattedText().setValue(emuM.toCm());
		// break;
		// case 2:
		// cWidth.getFormattedText().setValue(emuW.toCm() * 10);
		// cHeight.getFormattedText().setValue(emuH.toCm() * 10);
		// cMarginBottom.getFormattedText().setValue(emuM.toCm() * 10);
		// cMarginLeft.getFormattedText().setValue(emuM.toCm() * 10);
		// cMarginRight.getFormattedText().setValue(emuM.toCm() * 10);
		// cMarginTop.getFormattedText().setValue(emuM.toCm() * 10);
		// break;
		// case 3:
		// cWidth.getFormattedText().setValue(emuW.toPoints());
		// cHeight.getFormattedText().setValue(emuH.toPoints());
		// cMarginBottom.getFormattedText().setValue(emuM.toPoints());
		// cMarginLeft.getFormattedText().setValue(emuM.toPoints());
		// cMarginRight.getFormattedText().setValue(emuM.toPoints());
		// cMarginTop.getFormattedText().setValue(emuM.toPoints());
		// break;
		// case 4:
		// cWidth.getFormattedText().setValue(emuW.toPoints());
		// cHeight.getFormattedText().setValue(emuH.toPoints());
		// cMarginBottom.getFormattedText().setValue(emuM.toPoints());
		// cMarginLeft.getFormattedText().setValue(emuM.toPoints());
		// cMarginRight.getFormattedText().setValue(emuM.toPoints());
		// cMarginTop.getFormattedText().setValue(emuM.toPoints());
		// break;
		// case 5:
		// cWidth.getFormattedText().setValue(emuW.toPixel());
		// cHeight.getFormattedText().setValue(emuH.toPixel());
		// cMarginBottom.getFormattedText().setValue(emuM.toPixel());
		// cMarginLeft.getFormattedText().setValue(emuM.toPixel());
		// cMarginRight.getFormattedText().setValue(emuM.toPixel());
		// cMarginTop.getFormattedText().setValue(emuM.toPixel());
		// break;
		// }
		// if (cHeight.updateProperty()) {
		// cHeight.notifyListeners();
		// }
		// if (cWidth.updateProperty()) {
		// cWidth.notifyListeners();
		// }
		layoutDocument();
		// JOUtil2.setComboGuiState("word/actions/page/page_size", pageSize);
		// //$NON-NLS-1$

	}

}
