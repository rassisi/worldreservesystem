package com.joffice.rcpl.plugin.office.internal.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.EnServiceId;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IService;
import org.eclipse.rcpl.IStyleTemplate;
import org.eclipse.rcpl.ITool;
import org.eclipse.rcpl.JOAction;
import org.eclipse.rcpl.RcplCommand;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.SVGImage;
import org.eclipse.rcpl.model.RCPLModel;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSimpleField;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;

import com.joffice.rcpl.plugin.office.JOObject;
import com.joffice.rcpl.plugin.office.databinding.types.JOTextboxType;
import com.joffice.rcpl.plugin.office.internal.figures.JOEditorFigure;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;

/**
 * @author eclipse
 * 
 */
public class JOInsertService extends JOAbstractOfficeService {
	//
	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOInsertService.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.joffice.rcpl.plugin.office.rcp.services.OOXMLService#
	 * doActionPerformed(com .joffice.services.JOCommand)
	 */
	@Override
	public Object doExecute(ICommand command) throws Exception {

		switch (command.getCommandId()) {
		case insertTextbox:
			insertTextbox(command);
			return null;
		default:
			break;
		}

		ITool iTool = command.getTool();

		Object img = iTool.getImage();
		if (img instanceof SVGImage) {

			SVGImage svgImage = (SVGImage) img;
			String id = svgImage.getId();

			if (id.startsWith("shape")) {
				IService serv = getService(EnServiceId.PICTURE_SERVICE);
				IEditor editor = getEditor(command);
				setEditor(editor);
				serv.setEditor(editor);
				serv.doExecute(command);
			}

			return null;
		}

		return null;
	}

	// if (getId(command).indexOf("actions/editor/select_slide") != -1) {
	// //$NON-NLS-1$
	// IButtonTool f = (IButtonTool) command.getNewData()[0];
	//
	// // TODO
	// // getEditorFigure().scrollToPage(tool.getType());
	// return true;
	// }
	//
	// if (getId(command).indexOf("actions/insert/insert_slide") != -1) {
	// //$NON-NLS-1$
	// JOPageFigure page = (JOPageFigure) JOUtil.getEditor()
	// .getSelectedPage();
	// JOSlideMasterPart slideMasterPart = page.getSlideMaster();
	// JOPresentationDocument doc = (JOPresentationDocument) JOUtil
	// .getDocument();
	// doc.addSlide(slideMasterPart, page.getSlide());
	// getLayoutService().layout();
	// return true;
	// }

	// if (getId(command).indexOf("actions/insert/wordart") != -1) {
	// //$NON-NLS-1$
	// JOTextArtType type = (JOTextArtType) command.getNewData()[0];
	// IStyle style = JO.getGlobalStyleTemplate().findStyleByName(
	// type.getId());
	//
	// // if (JOUtil.getEditor().getMovableFeebackFigureArray().length > 0)
	// // {
	// // for (JOMoveFeedbackFigure mff : JOUtil.getEditor()
	// // .getMovableFeebackFigureArray()) {
	// // ILayoutFigure selectedFigure = (ILayoutFigure)
	// // mff.getMovableFigure();
	// // if (selectedFigure instanceof JOPictFigure) {
	// // JOPictFigure pf = (JOPictFigure) selectedFigure;
	// // JOPict pict = pf.getPict();
	// // pict.getVml().setNoFill();
	// // }
	// //
	// // List<JOParagraphFigure> pars = selectedFigure
	// // .collectAllParagraphs();
	// // for (JOParagraphFigure joParagraphFigure : pars) {
	// // getParagraphService().setStyleBy(
	// // joParagraphFigure.getParagraph(),
	// // (JOStyle) style, true, true);
	// // }
	// // mff.dispose();
	// // }
	// // return true;
	// // }
	//
	// ILayoutFigure sel = JOUtil.getEditor().getSelectedFigure();
	// if (sel instanceof JOParagraphFigure) {
	// getParagraphService().setStyle(command,
	// ((JOParagraphFigure) sel).getParagraph(),
	// (JOStyle) style, true, true);
	// }
	// return true;
	// }

	// if (getId(command).indexOf("/insert_columns_left") != -1) {
	// //$NON-NLS-1$
	// ILayoutFigure sel = JOUtil.getEditor().getSelectedFigure();
	// if (sel instanceof JOParagraphFigure) {
	// if (sel.getParentFigure() instanceof JOTableFigure) {
	// JOTableFigure tab = (JOTableFigure) sel.getParentFigure();
	// ((JOTable) tab.getLayoutObject()).addColumns(true, 1);
	// }
	// }
	// return true;
	// }

	// if (getId(command).indexOf("/insert_columns_right") != -1) {
	// //$NON-NLS-1$
	// ILayoutObject sel = JOUtil.getEditor().getSelectedLayoutObject();
	// if (sel instanceof JOParagraph) {
	// if (((JOParagraph) sel).getParent() instanceof JOTable) {
	// JOTableFigure tab = (JOTableFigure) sel.getParentObject();
	// ((JOTable) tab.getLayoutObject()).addColumns(false, 1);
	// }
	// }
	// return true;
	// }

	// if (getId(command).indexOf("/insert_rows_below") != -1) {
	// //$NON-NLS-1$
	// ILayoutFigure sel = JOUtil.getEditor().getSelectedFigure();
	// if (sel instanceof JOParagraphFigure) {
	// if (sel.getParentFigure() instanceof JOTableFigure) {
	// JOTableFigure tab = (JOTableFigure) sel.getParentFigure();
	// ((JOTable) tab.getLayoutObject()).addRow(true);
	// }
	// }
	// return true;
	// }

	// if (getId(command).indexOf("/insert_rows_above") != -1) {
	// //$NON-NLS-1$
	// ILayoutFigure sel = JOUtil.getEditor().getSelectedFigure();
	// if (sel instanceof JOParagraphFigure) {
	// if (sel.getParentFigure() instanceof JOTableFigure) {
	// JOTableFigure tab = (JOTableFigure) sel.getParentFigure();
	// ((JOTable) tab.getLayoutObject()).addRow(false);
	// }
	// }
	// return true;
	// }

	// if (getId(command).indexOf("/insert_shape_") != -1) { //$NON-NLS-1$
	// insertShape(JOUtil.getEditor(), command);
	// return true;
	// }

	private void insertTextbox(ICommand command) {
		JOTextboxType type = (JOTextboxType) command.getNewData()[0];
		String id = type.getId(); // table_middle_row_black";
		insertPictureTemplate(command, getEditor(), id);
	}

	//
	// if (match(command, "actions/insert/field")) { //$NON-NLS-1$
	// JOFieldsType type = (JOFieldsType) command.getNewData()[0];
	// String id = type.getId(); // table_middle_row_black";
	// insertFieldTemplate(command, JOUtil.getEditor(), id);
	// return true;
	// }

	/**
	 * @param command
	 * @param editorFigure
	 * @param id
	 */
	private void insertPictureTemplate(ICommand command, IEditor editorFigure, String id) {
		if (command.getEditor().getDocument().isWord()) {
			insertWordShape(editorFigure, id);
		} else if (command.getEditor().getDocument().isSpreadsheet()) {
			insertSpreadsheetShape(editorFigure, id);
		} else if (command.getEditor().getDocument().isPresentation()) {
			insertPresentationShape(editorFigure, id);
		}
	}

	/**
	 * @param editorFigure
	 * @param id
	 */
	@SuppressWarnings("unused")
	private void insertWordPictureTemplate(JOEditorFigure editorFigure, String id) {
		if (editorFigure == null || editorFigure.getSelectedParagraph() == null) {
			return;
		}
		try {

			IParagraph par = editorFigure.getSelectedParagraph();

			par.setDirtyLayout(true);
			par.setDirtyContent(true);
			CTR run = par.createRun();
			IStyleTemplate templates = Rcpl.globalStyleTemplate();
			org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture pic = run.addNewPict();
			XmlObject xmlObject = templates.getTemplateXml(id);
			if (xmlObject != null) {
				pic.set(xmlObject.copy());
				par.removeChildren();
				par.updateFromXml();
				par.setDirtyLayout(true);
				ILayoutObject lastObject = par.getChildren()[par.getChildren().length - 1];
				lastObject.getLayoutFigure().setZOrder(JOAction.Z_ORDER_BRING_TOFRONT2);
				par.getDocument().getEditor().layoutDocument();
			} else {
				// LOGGER.error("shape template " + id + " not found!");
				// //$NON-NLS-1$ //$NON-NLS-2$
			}
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

	private void insertFieldTemplate(RcplCommand command, IEditor editorFigure, String id) {
		if (command.getEditor().getDocument().isWord()) {
			insertWordFieldTemplate(editorFigure, id);
		} else if (command.getEditor().getDocument().isSpreadsheet()) {
			insertSpreadsheetFieldTemplate(editorFigure, id);
		} else if (command.getEditor().getDocument().isPresentation()) {
			insertPresentationFieldTemplate(editorFigure, id);
		}
	}

	@SuppressWarnings("unused")
	private void insertSpreadsheetFieldTemplate(IEditor editorFigure, String id) {
	}

	@SuppressWarnings("unused")
	private void insertPresentationFieldTemplate(IEditor editorFigure, String id) {
	}

	/**
	 * @param editorFigure
	 * @param id
	 */
	private void insertWordFieldTemplate(IEditor editorFigure, String id) {
		if (editorFigure == null || editorFigure.getSelectedParagraph() == null) {
			return;
		}

		try {

			JOParagraph par = (JOParagraph) editorFigure.getSelectedParagraph();
			par.setDirtyLayout(true);
			par.setDirtyContent(true);
			IStyleTemplate templates = Rcpl.globalStyleTemplate();
			XmlObject xmlObject = templates.getTemplateXml(id);
			if (xmlObject != null) {
				if (xmlObject instanceof CTSimpleField) {
					CTSimpleField ctSimpleField = ((CTP) par.getXmlObject()).addNewFldSimple();
					ctSimpleField.set(xmlObject.copy());
					CTR run = ctSimpleField.getRArray(0);
					CTText ctText = run.getTArray(0); // addNewT();
					String instrString = ctSimpleField.getInstr();
					// CTText fieldData = ctSimpleField.getFldData();
					if (instrString.indexOf("DATE") != -1) { //$NON-NLS-1$
						Calendar cal = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
						cal.setTime(new Date());
						SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); //$NON-NLS-1$
						String dateString = df.format(cal.getTime());
						ctText.setStringValue(dateString);
					} else if (instrString.indexOf("AUTHOR") != -1) { //$NON-NLS-1$
						ctText.setStringValue(getEditor().getDocument().getCreator());
					}
				} else if (xmlObject instanceof CTP) {
					// CTR[] runs = ((CTP) xmlObject).getRArray();
					// for (CTR ctr : runs) {
					//
					// }
				}
				par.removeChildren();
				par.updateFromXml();
				par.activate();
				par.setDirtyLayout(true);
				par.getDocument().getEditor().layoutDocument();
			} else {
				// LOGGER.error("shape template " + id + " not found!");
				// //$NON-NLS-1$ //$NON-NLS-2$
			}
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

	private void insertShape(IEditor editorFigure, RcplCommand command) {
		String picName = getId(command);
		int pos = picName.indexOf("/insert_"); //$NON-NLS-1$ S
		String s = picName.substring(pos + 8, picName.length());
		if (command.getEditor().getDocument().isWord()) {
			insertWordShape(editorFigure, s);
		} else if (command.getEditor().getDocument().isSpreadsheet()) {
			insertSpreadsheetShape(editorFigure, s);
		} else if (command.getEditor().getDocument().isPresentation()) {
			insertPresentationShape(editorFigure, s);
		}
	}

	private void insertSpreadsheetShape(IEditor editorFigure, String templateResourceName) {
	}

	private void insertPresentationShape(IEditor editorFigure, String templateResourceName) {
	}

	/**
	 * @param editorFigure
	 */
	private void insertWordShape(IEditor editorFigure, String templateResourceName) {
		if (editorFigure == null || editorFigure.getSelectedParagraph() == null) {
			return;
		}
		// InputStream is = JOUtil2.loadSvgTemplate(templateResourceName);
		// File tempFile = new File(JOUtil2.getUserLocalCacheDir(),
		// templateResourceName.replaceAll("/", "_") + ".svg"); //$NON-NLS-1$
		// //$NON-NLS-2$ //$NON-NLS-3$
		//
		// if (is != null) {
		// // JO.service.getPictureService().insertPicture(JOImageType.DEFAULT,
		// // tempFile, is, new Rectangle(0, 0, 100, 100), 1);
		// try {
		// is.close();
		// } catch (IOException e) {
		// // ignore
		// }
		// return;
		// }
		try {

			IParagraph par = editorFigure.getSelectedParagraph();
			par.setDirtyLayout(true);

			CTR run = par.createRun();
			org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPicture pic = run.addNewPict();

			XmlObject xmlObject = Rcpl.globalStyleTemplate().getTemplateXml(templateResourceName);
			if (xmlObject != null) {
				pic.set(xmlObject.copy());
				XmlObject parXml = par.getXmlObject();
				if (parXml instanceof CTP) {
					// ((CTP) parXml).getRList().add(run);
					par.removeChildren();
					par.setDirtyContent(true);
					par.updateFromXml();
					par.setDirtyLayout(true);
				}
				// JOObject lastObject =
				// par.getChildren()[par.getChildren().length - 1];
				// lastObject.getLayoutFigure().setZOrder(JOAction.Z_ORDER_BRING_TOFRONT2);
				par.getDocument().getEditor().layoutDocument();
			} else {
				// LOGGER.error("shape template " + templateResourceName + " not
				// found!"); //$NON-NLS-1$ //$NON-NLS-2$
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	// /**
	// * @param editorFigure
	// * @param tableName
	// */
	// private void insertTable(JOEditorFigure editorFigure, String tableName) {
	// if (editorFigure == null
	// || editorFigure.getSelectedParagraphFigure() == null) {
	// return;
	// }
	// try {
	// editorFigure.updateFocusOwner();
	// JOParagraphFigure parF = editorFigure.getSelectedParagraphFigure();
	// if (parF != null) {
	// JOParagraph par = parF.getParagraph();
	// par.setDirtyLayout(true);
	// par.setDirtyContent(true);
	//
	// // CTBody body = ((XWPFDocumentCustom)
	// // par.getDocument().getXml())
	// // .getDocument().getBody();
	//
	// XmlCursor xmlCursor = par.getXmlObject().newCursor();
	//
	// QName tblName = new QName(
	// "http://schemas.openxmlformats.org/wordprocessingml/2006/main",
	// //$NON-NLS-1$
	// "tbl"); //$NON-NLS-1$
	// xmlCursor.insertElement(tblName);
	// xmlCursor = par.getXmlObject().newCursor();
	// // xmlCursor.selectPath("./*");
	//
	// xmlCursor.toPrevSibling();
	// CTTbl table = (CTTbl) xmlCursor.getObject();
	// // int parRootIndex = par.getRootObjectIndex();
	//
	// JOStyleTemplate templates = JOAbstractOfficePane.globalStyleTemplate;
	// XmlObject ctTblTemplate = templates.getTemplateXml(tableName)
	// .copy();
	// table.set(ctTblTemplate);
	//
	// JOTable t = new JOTable(par.getDocument(), null, table, false,
	// true);
	// // t.setDirty(true);
	// editorFigure.getDocument().addRootObject(t,
	// par.getRootObjectIndex());
	// JOObject prev = par.getPreviousRootObject();
	// if (prev != null) {
	// editorFigure.setDirtyLayout(prev, true, 0, true);
	// } else {
	// editorFigure.setDirtyLayout(t, true, 0, true);
	// }
	// }
	// } catch (Exception ex) {
	// // LOGGER.error("", ex); //$NON-NLS-1$
	// }
	// }

}
