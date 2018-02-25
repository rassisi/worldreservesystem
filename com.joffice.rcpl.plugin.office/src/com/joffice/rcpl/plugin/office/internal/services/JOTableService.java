package com.joffice.rcpl.plugin.office.internal.services;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IStyleTemplate;
import org.eclipse.rcpl.ITable;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.internal.config.RcplConfig;
import org.eclipse.rcpl.internal.util.JOUtil;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;

import com.joffice.rcpl.plugin.office.databinding.types.JOTableType;
import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;
import com.joffice.rcpl.plugin.office.internal.model.word.JOTable;

/**
 * @author eclipse
 * 
 */
public class JOTableService extends JOAbstractOfficeService {

	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOTableService.class);

	@Override
	public Object doExecute(ICommand command) throws Exception {

		switch (command.getCommandId()) {
		case insertTable:
			JOTableType tableType = (JOTableType) command.getNewData()[0];
			insertTable(tableType.getId());
			return true;

		case tableInsertRowsAbove:

			break;
		case tableInsertRowsBelow:

			break;
		case tableInsertColumnsLeft:

			break;
		case tableInsertColumnsRight:

			break;
		case tableDeleteCells:

			break;
		case tableDeleteColumns:

			break;
		case tableDeleteRows:

			break;
		case tableDeleteTable:
			deleteTable(command);
			break;
		case tableMergeCells:

			break;
		case tableSplitCells:

		default:
			break;
		}

		// if (match(event, "actions/tables/insert_table")) { //$NON-NLS-1$
		// JOTableType tableType = (JOTableType) event.getNewData()[0];
		// String name = tableType.getId(); // table_middle_row_black";
		// insertTable(getEditor(), name);
		// return true;
		// }
		return false;
	}

	/**
	 * @param show
	 */
	public void showRuler(boolean show) {
		IEditor ef = getEditor();
		if (show) {
			// ef.getCornerRuler().setVisible(true);
			ef.expandHorizontalRuler();
			ef.expandVerticalArea();
			// ef.getVerticalRuler().repaint();
		} else {
			// ef.getCornerRuler().setVisible(false);
			ef.collapseHorizontalRuler();
			// ef.collapseVerticalArea();
		}
		// ef.getHorizontalRuler().getFirstLineIndentFigure().setVisible(show);
		// ef.getHorizontalRuler().getHangingLineIndentFigure().setVisible(show);
		// ef.getHorizontalRuler().getLeftLineIndentFigure().setVisible(show);
		// ef.setShowRulers(show);

	}

	public void changeColor(Object color) {
		// getEditorFigure().setForegroundColor((Color) color);
	}

	/**
	 * @param distance
	 */
	public void changePageDistance(int distance) {
		RcplConfig.pageDistance = distance;
		getLayoutService().layoutPages();
	}

	private void deleteTable(ICommand command) {

		if (command.getLayoutObject() instanceof IParagraph) {
			ITable table = ((IParagraph) command.getLayoutObject()).getTableCell().getTable();
			table.dispose();
		}

	}

	/**
	 * @param editor
	 * @param tableName
	 */
	private void insertTable(String tableName) {

		IEditor editorFigure = getEditor();
		if (editorFigure == null || editorFigure.getSelectedLayoutObject() == null) {
			return;
		}

		try {

			IParagraph parF = editorFigure.getSelectedParagraph();
			if (parF != null) {
				// parF.getStyledText().setCaretAtEnd();
				JOParagraph selPar = (JOParagraph) parF;
				selPar.setDirtyLayout(true);
				int index = selPar.getRootObjectIndex();
				if (selPar.isLastParagraph() || selPar.getNextRootObject() instanceof JOTable) {
					getParagraphService().expandOneLine(null, selPar, false, true);
				}

				XmlCursor xmlCursor = selPar.getXmlObject().newCursor();

				QName tblName = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", //$NON-NLS-1$
						"tbl"); //$NON-NLS-1$
				xmlCursor.toNextSibling();
				xmlCursor.insertElement(tblName);
				xmlCursor = selPar.getXmlObject().newCursor();
				// xmlCursor.selectPath("./*");
				xmlCursor.toNextSibling();
				CTTbl table = (CTTbl) xmlCursor.getObject();
				IStyleTemplate templates = Rcpl.globalStyleTemplate();
				XmlObject ctTblTemplate = templates.getTemplateXml(tableName).copy();
				table.set(ctTblTemplate);
				JOTable t = new JOTable(selPar.getDocument(), null, table, false, true, index + 1);
				t.setTemplate(ctTblTemplate);
				t.setDirtyLayout(true);

				// ---------- layout -------------------------------------------

				selPar.setDirtyLayout(true);
				selPar.getDocument().getEditor().layoutDocument();

			}
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

}
