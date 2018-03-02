package com.joffice.rcpl.plugin.office.internal.services;

import java.math.BigInteger;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.eclipse.rcpl.DelayedExecution;
import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IFont;
import org.eclipse.rcpl.ILayoutObject;
import org.eclipse.rcpl.IParagraph;
import org.eclipse.rcpl.IStyle;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.RcplCommand;
import org.eclipse.rcpl.internal.tools.FontSizeTool;
import org.eclipse.rcpl.model.RCPLModel;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBrType;

import com.joffice.rcpl.plugin.office.internal.model.word.JOParagraph;
import com.joffice.rcpl.plugin.office.internal.model.word.JOTable;
import com.joffice.rcpl.plugin.office.poi.extension.XWPFDocumentCustom;

/**
 * @author ramin
 * 
 */
public class JOParagraphService extends JOAbstractOfficeService {

	public JOParagraphService() {
		super();
	}

	@Override
	public Object doExecute(ICommand command) throws Exception {

		List<IParagraph> paragraphs = getEditor().getDocument().getParagraphs();

		IParagraph selectedParagraph = getEditor().getSelectedParagraph();

		switch (command.getCommandId()) {
		case style_title:
			executeStyle("Title");
			break;
		case style_normal:
			executeStyle("Normal");
			break;
		case style_heading_1:
			executeStyle("Heading1");
			break;
		case style_heading_2:
			executeStyle("Heading2");
			break;
		case style_heading_3:
			executeStyle("Heading3");
			break;
		case style_heading_4:
			executeStyle("Heading4");
			break;
		case style_heading_5:
			executeStyle("Heading5");
			break;

		case setStyle:
			IStyle style = (IStyle) command.getNewData()[0];
			doExcecuteStyle(style, paragraphs, selectedParagraph);
			return true;
		case expandAfter:
			return expandAfter(command, (Boolean) command.getNewData()[0]);
		case expandBefore:
			return expandBefore(command, (Boolean) command.getNewData()[0]);
		case splitParagraph:
			return splitParagraph(command, (Integer) command.getNewData()[0], (Boolean) command.getNewData()[1]);
		case fontSize:
			FontSizeTool fontSizeTool = (FontSizeTool) command.getTool().getTool().getData();
			double newSize = fontSizeTool.getSize();
			doExcecuteFontSize(paragraphs, selectedParagraph, newSize);
			return true;

		case fontName:
			doExecuteFontName(command, paragraphs, selectedParagraph);
			break;
		case bold:
			doExcecuteBold(command, paragraphs, selectedParagraph);
			return true;

		case italic:
			doExcecuteItalic(command, paragraphs, selectedParagraph);
			return true;
		case underline:
			doExcecuteUnderline(command, paragraphs, selectedParagraph);
			return true;

		case insertText:
			doExecuteInsertText(command);
			return true;
		default:
			break;
		}

		String toolId = command.getTool().getTool().getId();

		if ("paragraphOnOff".equals(toolId)) {
			getEditor().showOutline(getEditor().isShowOutline());
			return true;
		}

		// if (match(command, "actions/paragraph/border")) { //$NON-NLS-1$
		// // if (command.isMenuButtonAction()) {
		// // if ((Boolean) command.getNewData()[1]) {
		// // showColorChooser(2);
		// // } else {
		// // JOUtil.getEditor().collapseGroup();
		// // }
		// // return true;
		// // }
		// return true;
		// }
		//
		// if (match(command, "actions/paragraph/shading")) { //$NON-NLS-1$
		// if (command.isMenuButtonAction()) {
		// if ((Boolean) command.getNewData()[1]) {
		// showColorChooser(2, -1);
		// } else {
		// JO.officePane.collapseGroup();
		// }
		// return true;
		// }
		// return true;
		// }
		//
		// if (match(command, "word/actions/paragraph/increase_indent")) {
		// //$NON-NLS-1$
		// changeIndent(command, true);
		// return true;
		// }
		//
		// if (match(command, "word/actions/paragraph/decrease_indent")) {
		// //$NON-NLS-1$
		// changeIndent(command, false);
		// return true;
		// }
		//
		// if (match(command, "actions/paragraph/outline_paragraph")) {
		// //$NON-NLS-1$
		// command.getEditor().setShowOutlineParagraph(
		// (Boolean) command.getNewData()[0]);
		// return true;
		// }
		// if (match(command, "actions/paragraph/bullets")) { //$NON-NLS-1$
		// setBullets(command, false);
		// return true;
		// }
		// if (match(command, "actions/paragraph/bullets_numbers")) {
		// //$NON-NLS-1$
		// setBullets(command, true);
		// return true;
		// }
		// if (match(command, "actions/paragraph/multilevel_list")) {
		// //$NON-NLS-1$
		// }
		//
		// if (match(command, "actions/paragraph/text_change")) { //$NON-NLS-1$
		// // JOSWTAbstractStyledText st = getEditor().getStyledText();
		// // JOParagraphFigure parFig = (JOParagraphFigure)
		// // command.getData()[0];
		// // if (getEditor().getFocusOwner() != parFig) {
		// // parFig.activate();
		// // }
		// // st.setText((String) command.getData()[1]);
		// // st.setStyleRanges((StyleRange[]) command.getData()[2]);
		// // st.setSelection((Point) command.getData()[3]);
		// // st.setCaretOffset((Integer) command.getData()[4]);
		// // getEditor().showCaret();
		// // st.setDirty(true);
		// // parFig.markAllCharactersDirty();
		// // parFig.repaint();
		// // JO.service.getParagraphService().updateParagraph(st,
		// // parFig.getParagraph());
		// return true;
		// }
		// if (match(command, "actions/paragraph_edit")) { //$NON-NLS-1$
		// // selectGroup(
		// // "word/actions/groups/paragraph",
		// command.getEntry().getShelfIndex(), (Boolean) command.getData()[0]);
		// //$NON-NLS-1$
		// return true;
		// }

		// if (match(command, "actions/paragraph_styles") //$NON-NLS-1$
		// ) {
		// boolean sel;
		// if (command.getData()[0] instanceof Boolean) {
		// sel = (Boolean) command.getData()[0];
		// } else {
		// sel = true;
		// }
		// selectGroup(
		// "word/actions/groups/styles", command.getEntry().getShelfIndex(),
		// sel); //$NON-NLS-1$
		// if (!sel) {
		// JO.officePane.collapseGroup();
		// }
		// return true;
		// }
		// if (match(command, "actions/paragraph/justify_left")) { //$NON-NLS-1$
		// // getEditor().setAlignment(ParagraphAlignment.LEFT);
		// return true;
		// }
		// if (match(command, "actions/paragraph/justify_center")) {
		// //$NON-NLS-1$
		// // getEditor().setAlignment(ParagraphAlignment.CENTER);
		// return true;
		// }
		// if (match(command, "actions/paragraph/justify_right")) {
		// //$NON-NLS-1$
		// // getEditor().setAlignment(ParagraphAlignment.RIGHT);
		// return true;
		// }
		// if (match(command, "actions/paragraph/justify_just")) { //$NON-NLS-1$
		// // getEditor().setAlignment(ParagraphAlignment.BOTH);
		// return true;
		// }
		//
		// if (getId(command).indexOf("actions/groups/styles/") != -1
		// //$NON-NLS-1$
		// || getId(command).startsWith("actions/style/draggedStyle")) {
		// //$NON-NLS-1$
		// // JOEditorFigure editorFigure = getEditor();
		// // Object[] toolData = null;
		// // if (command.getNewData().length > 2) {
		// // toolData = (Object[]) command.getNewData()[2];
		// // }
		// // JOStyle style;
		// // if (toolData != null && toolData.length > 0
		// // && toolData[0] instanceof JOStyle) {
		// // style = (JOStyle) toolData[0];
		// // } else {
		// // style = (JOStyle) command.getNewData()[0];
		// // }
		// // if (style.getType().equals(EStyleType.PARAGRAPH)) {
		// // JOParagraphFigure par = editorFigure
		// // .getSelectedParagraphFigure();
		// // setStyleBy(par.getParagraph(), style, true, true);
		// //
		// // JO.service.getParagraphService().updateParagraph(
		// // editorFigure.getStyledText(), par.getParagraph());
		// //
		// // JOUtil.getEditor().setDirtyLayout(par.getParagraph(), true, 1,
		// // true);
		// // par.repaint();
		// //
		// // } else if (style.getType().equals(EStyleType.CHARACTER)) {
		// // for (ILayoutObject l : getEditor().getDocument()
		// // .getRootObjects()) {
		// // if (l instanceof JOParagraph) {
		// // JOParagraph par = (JOParagraph) l;
		// // JOParagraphFigure figure = par.getLayoutFigure();
		// // if (figure.hasSelection()) {
		// // JOService.getFontService().setFontHeight(
		// // style.font.getFontData()[0].getHeight());
		// // JOService.getColorService().setSelectedObjectColor(
		// // style.foreground, null, 1);
		// // }
		// // }
		// // }
		// // }
		// // return true;
		// }
		return false;
	}

	private void executeStyle(String styleName) {
		List<IParagraph> paragraphs = getEditor().getDocument().getParagraphs();
		IParagraph selectedParagraph = getEditor().getSelectedParagraph();
		IStyle style = Rcpl.globalStyleTemplate().findStyle(styleName);
		if (style != null) {
			doExcecuteStyle(style, paragraphs, selectedParagraph);
		}
	}

	private void doExecuteInsertText(final ICommand command) {
		IParagraph p = (IParagraph) command.getLayoutObject();
		String c = (String) command.getNewData()[0];

		if (p.isOverflowActive()) {
			p.getOverflowParagraphFigure().insertText(p, c);
		} else {
			p.getLayoutFigure().insertText(p, c);
		}

		p.commit();
	}

	/**
	 * Update the paragraph from a styled text content
	 * 
	 */
	private boolean updateParagraph(ICommand command, IParagraph paragraph) {
		if (!paragraph.isDirtyContent()) {
			return false;
		}
		try {
			int caretOffset = paragraph.getCaretOffset();
			paragraph.commit();
			paragraph.setCaretOffset(caretOffset);
			paragraph.setDirtyContent(false);
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}

		return true;

	}

	/**
	 * 
	 */
	private void refreshNumbering(IParagraph paragraph) {
		try {
			List<IParagraph> paragraphs = paragraph.getDocument().getParagraphs();
			for (int i = 0; i < paragraphs.size(); i++) {
				JOParagraph par = (JOParagraph) paragraphs.get(i);
				if (par.getNumbering() != null && par.getNumbering().getBulletText().startsWith("%")) { //$NON-NLS-1$
					par.getNumbering().setNumber(1);
					if (i < paragraphs.size() - 1) {
						int j = 1;
						for (; i + j - 1 < paragraphs.size(); j++) {
							int nextIndex = i + j;
							if (nextIndex < paragraphs.size()) {
								JOParagraph next = (JOParagraph) paragraphs.get(nextIndex);
								if (next != null) {
									if (next.getNumbering() != null) {
										if (next.getNumbering().getBulletText().startsWith("%")) { //$NON-NLS-1$
											next.getNumbering().setNumber(j + 1);
										} else {
											break;
										}
									} else {
										break;
									}
								}
							}
						}
						i += j - 1;
					}
				}
			}
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
	}

	/**
	 * 
	 */
	IParagraph expandOneLine(ICommand command, IParagraph paragraph, boolean pageBreak, boolean forceAtEnd) {
		IParagraph newPar = null;
		try {
			Rcpl.profile();

			paragraph.getDocument().setDirty(true);

			// int rIndex = paragraph.getRootObjectIndex();

			int offset = paragraph.getCaretOffset();
			int charCount = paragraph.getCharCount();

			String txt = paragraph.getTextBuffer().toString();

			if (forceAtEnd) {
				newPar = expandAfter(command, pageBreak);
			}

			// ---------- am anfang --------------------------------------------

			else if (!forceAtEnd && (txt.length() > 0 && offset == 0) || txt.length() == 0) {
				if (paragraph.getPreviousRootObject() instanceof JOTable) {
					newPar = expandAfter(command, pageBreak);
				} else {
					newPar = expandBefore(command, pageBreak);
				}
			}

			// ---------- am ende des textes -------------------------------

			else if (offset > charCount - 1) {
				newPar = expandAfter(command, pageBreak);
			}

			// ---------- in the middle of a paragraph ---------------------

			else {
				newPar = splitParagraph(command, offset, pageBreak);
			}

			refreshNumbering(newPar);

		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

		return newPar;
	}

	/**
	 * @param rootObject
	 * @return
	 */
	private IParagraph insertParagraph(ICommand command, ILayoutObject rootObject, String text, boolean insertBefore) {
		IParagraph par;

		if (rootObject instanceof JOParagraph) {
			par = (JOParagraph) rootObject;
		} else {
			par = rootObject.getPreviousRootParagraph();
			if (par == null) {
				par = rootObject.getNextRootParagraph();
			}
		}

		// IEditor editorFigure = JO.officePane.getEditor();
		boolean enableCommandStack = getEditor().isEnableCommandStack();
		try {
			XWPFParagraph newPoiParagraph = null;

			try {
				getEditor().setEnableCommandStack(false);

				// ---------- create a POI paragraph ----------------------

				IDocument ooxmlDoc = getEditor().getDocument();
				XWPFDocumentCustom doc = (XWPFDocumentCustom) ooxmlDoc.getXml();
				int i = 0;
				int poiIndex = 0;
				List<XWPFParagraph> poiParagraphs = doc.getParagraphs();

				poiIndex = 0;

				for (XWPFParagraph xwpfParagraph : poiParagraphs) {
					if (xwpfParagraph.getCTP() == rootObject.getXmlObject()) {
						break;
					}
					poiIndex++;
				}
				newPoiParagraph = doc.insertParagraph(insertBefore ? poiIndex : poiIndex + 1);
			} catch (Exception ex) {
				RCPLModel.logError(ex);
			}
			boolean inTextBox = false;
			if (rootObject instanceof JOParagraph && ((JOParagraph) rootObject).isInTextBox()) {
				inTextBox = true;
			}
			boolean isRoot = rootObject.isRootObject();

			int layoutIndex = rootObject.getLayoutIndex();

			if (!insertBefore) {
				layoutIndex++;
			}

			IParagraph newPar = null;
			try {
				newPar = new JOParagraph(getEditor().getDocument(), null, null, newPoiParagraph.getCTP(), 0, -1, 0.0,
						0.0, 0.0, 0.0, null, false, inTextBox, null, null, isRoot, layoutIndex, newPoiParagraph);

				CTR run = ((JOParagraph) newPar).createRun();
				((JOParagraph) newPar).setText(run, text);
				newPar.setText(text);
				((JOParagraph) newPar).setXmlObject(newPar.getXmlObject());
				IStyle nextStyle = par.getStyle();
				if (nextStyle.getNextStyle() != null) {
					nextStyle = nextStyle.getNextStyle();
				}
				setStyle(command, newPar, nextStyle, false, false);
			} catch (Exception ex) {
				RCPLModel.logError(ex);
			}
			// ooxmlDoc.getLayoutObjects().remove(newPar);

			if (!insertBefore) {
				if (rootObject instanceof JOParagraph && ((JOParagraph) rootObject).getNumbering() != null) {
					((JOParagraph) newPar).setNumbering(((JOParagraph) rootObject).getNumbering().copy());
					refreshNumbering(newPar);
				}

			}

			rootObject.getDocument().setDirty(true);

			getEditor().setEnableCommandStack(enableCommandStack);
			if (enableCommandStack) {
				// createCommand(editorFigure, newPar, new JOResourceEntry(
				// JO.TOOL_INSERT_PARAGRAPH,
				// Messages.JOParagraphService_InsertParagraph, null),
				// null, new Object[] { rootObject, insertBefore, }, null);
			}

			refreshAllIndexes();
			getEditor().updateOutline();
			return newPar;

		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}

		return null;
	}

	private void refreshAllIndexes() {
		try {
			for (ILayoutObject p : getEditor().getDocument().getRootObjects()) {
				p.getLayoutFigure().refreshOutline();
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
	}

	@SuppressWarnings("unused")
	private boolean deleteSelectedParagraphs() {
		boolean done = false;
		// try {
		// JOParagraph lastNotSelected = null;
		// JOParagraph lastPar = null;
		// JOParagraph firstUnselectedAfterSelcted = null;
		//
		// boolean disposeOccured = false;
		// List<ILayoutObject> pars = new ArrayList<ILayoutObject>();
		// pars.addAll(getEditor().getDocument().getRootObjects());
		//
		// for (ILayoutObject l : pars) {
		// if (l instanceof JOParagraph) {
		//
		// JOParagraph par = (JOParagraph) l;
		// JOParagraphFigure figure = (JOParagraphFigure) par
		// .getLayoutFigure();
		// if (figure.hasSelection()) {
		// if (lastNotSelected == null) {
		// if (lastPar != null
		// && !lastPar.getLayoutFigure().hasSelection()) {
		// lastNotSelected = lastPar;
		// }
		// }
		// if (figure.isAllSelected()) {
		// if (getEditor().getDocument()
		// .getRootObjects().size() < 3) {
		// par.setText(""); //$NON-NLS-1$
		// par.setDirty(true);
		// break;
		// }
		// par.dispose();
		// disposeOccured = true;
		// firstUnselectedAfterSelcted = null;
		//
		// done = true;
		// } else {
		// JO.service.getParagraphService().updateStyledText(
		// par, getEditor().getStyledText());
		// Event e = new Event();
		// e.type = SWT.KeyDown;
		// e.button = 0;
		// e.keyCode = SWT.DEL;
		// e.character = (char) 0;
		// getEditor().getStyledText().handleKeyDown2(e);
		// getEditor().getStyledText().setDirty(true);
		// updateParagraph(getEditor().getStyledText(),
		// par);
		// par.setDirty(true);
		// figure.markAllCharactersDirty();
		// figure.repaint();
		// }
		// } else {
		// if (disposeOccured) {
		// if (firstUnselectedAfterSelcted == null) {
		// firstUnselectedAfterSelcted = par;
		// }
		// }
		// }
		// lastPar = par;
		// }
		// }
		//
		// if (done) {
		// if (lastNotSelected != null) {
		// getEditor().setDirtyLayout(lastNotSelected);
		// lastNotSelected.getLayoutFigure().activate();
		// } else if (firstUnselectedAfterSelcted != null) {
		// getEditor().setDirtyLayout(
		// firstUnselectedAfterSelcted);
		// firstUnselectedAfterSelcted.getLayoutFigure().activate();
		// } else {
		// getEditor().setDirtyLayout(
		// ((JOWordDocument) getEditor().getDocument())
		// .getFirstParagraph());
		// ((JOWordDocument) getEditor().getDocument())
		// .getFirstParagraph().getLayoutFigure().activate();
		// }
		// }
		// } catch (Exception ex) {
		// // LOGGER.error("", ex); //$NON-NLS-1$
		// }

		return done;
	}

	/**
	 * @param pageBreak
	 */
	@SuppressWarnings("deprecation")
	private void createPageBreak(ICommand command, IParagraph paragraph, boolean pageBreak) {
		if (paragraph.getXmlObject() instanceof CTP) {
			if (pageBreak) {
				((JOParagraph) paragraph).setPageBreakAfter(true);
				paragraph.setDirtyLayout(true);
				paragraph.setDirtyContent(true);
				CTP ctp = (CTP) paragraph.getXmlObject();
				CTR run = ctp.addNewR();
				CTBr ctBr;
				ctBr = run.addNewBr();
				ctBr.setType(STBrType.PAGE);
			} else {
				CTP ctp = (CTP) paragraph.getXmlObject();
				CTR[] runs = ctp.getRArray();
				if (runs != null && runs.length > 0) {
					CTBr[] ctBrArray = runs[0].getBrArray();
					if (ctBrArray != null && ctBrArray.length > 0) {
						int index = 0;
						for (CTBr ctBr : ctBrArray) {
							if (ctBr.getType().equals(STBrType.PAGE)) {
								runs[0].removeBr(index);
								break;
							}
						}
					}
				}
				((JOParagraph) paragraph).setPageBreakAfter(false);
			}
		}
		getEditor().getDocument().setDirty(true);
	}

	/**
	 * @param paragraph
	 * @return
	 */
	private IParagraph expandBefore(ICommand command, boolean pageBreak) {
		final IParagraph paragraph = (IParagraph) command.getLayoutObject();
		if (pageBreak) {
			IParagraph prev = paragraph.getPreviousRootParagraph();
			IParagraph breakParagraph = null;
			if (prev != null) {
				prev.setDirtyLayout(true);
				breakParagraph = insertParagraph(command, prev, "", false); //$NON-NLS-1$
				breakParagraph.setRootObject(prev.isRootObject());
				breakParagraph.setPage(prev.getPage());
				createPageBreak(command, breakParagraph, true);
				paragraph.getDocument().getEditor().layoutDocument();
				new DelayedExecution(100) {
					@Override
					protected void execute() {
						paragraph.getDocument().getEditor().updateScrollTargetForCaret();
					}
				};
				return prev;
			}
		}
		final JOParagraph newPar = (JOParagraph) insertParagraph(command, paragraph, "", true); //$NON-NLS-1$
		newPar.setRootObject(paragraph.isRootObject());
		newPar.setPage(paragraph.getPage());

		if (paragraph.getPreviousRootParagraph() != null) {
			paragraph.getPreviousRootParagraph().setDirtyLayout(true);
		} else {
			paragraph.setDirtyLayout(true);
		}
		paragraph.getDocument().getEditor().layoutDocument();

		new DelayedExecution(1, 10, 100) {
			@Override
			protected void execute() {
				paragraph.activate();
			}
		};

		return newPar;
	}

	/**
	 * @param paragraph
	 * @param pageBreak
	 * @return
	 */
	private IParagraph expandAfter(ICommand command, boolean pageBreak) {
		IParagraph paragraph = (IParagraph) command.getLayoutObject();
		updateParagraph(null, paragraph);

		IParagraph breakParagraph = null;
		if (pageBreak) {
			if (command != null) {
				breakParagraph = insertParagraph(command, paragraph, "", false); //$NON-NLS-1$
				createPageBreak(command, breakParagraph, true);
			}
		}

		CTSectPr section = null;

		if (paragraph.isStartNewSection()) {
			section = ((CTP) paragraph.getXmlObject()).getPPr().getSectPr();
		}

		final IParagraph newPar = insertParagraph(command, breakParagraph != null ? breakParagraph : paragraph, "", //$NON-NLS-1$
				false);

		if (section != null) {
			CTSectPr newSection = ((CTP) newPar.getXmlObject()).getPPr().addNewSectPr();
			newSection.set(section);
			((CTP) paragraph.getXmlObject()).getPPr().unsetSectPr();
			newPar.setDirtyContent(true);
			newPar.updateFromXml();
		}

		paragraph.setDirtyLayout(true);
		paragraph.getDocument().getEditor().layoutDocument();

		new DelayedExecution(1, 10, 100) {
			@Override
			protected void execute() {
				if (newPar != null) {
					newPar.activate();
				} else {
					RCPLModel.logError("newPar.activate() - null");
				}
			}
		};
		return newPar;
	}

	/**
	 * @param editorFigure
	 * @param paragraph
	 * @param txt
	 * @param offset
	 * @return
	 */
	private IParagraph splitParagraph(ICommand command, int offset, boolean pageBreak) {

		IParagraph paragraph = (IParagraph) command.getLayoutObject();

		String txt = paragraph.getTextBuffer().toString();
		String s1 = paragraph.getTextBuffer().toString().substring(0, offset);
		String s2 = txt.substring(offset, txt.length());

		// ---------- update first part text and styles ----------------

		paragraph.setText(s1);

		// ---------- insert 2. part -----------------------------------

		IParagraph secondSplitPartParagraph = expandAfter(command, pageBreak);

		secondSplitPartParagraph.setText(s2);

		refreshAllIndexes();
		paragraph.setDirtyLayout(true);
		secondSplitPartParagraph.activate();
		paragraph.getDocument().getEditor().layoutDocument();
		return secondSplitPartParagraph;

	}

	/**
	 * @param par
	 * @param style
	 */
	@SuppressWarnings("deprecation")
	void setStyle(ICommand command, IParagraph par, IStyle style, boolean dirtyLayout, boolean finalize) {
		IFont oldFont = par.getStyle().getFont();
		initSelectedObjects(command);

		// ---------- execute the undo/redo command

		// createChangeCommand(
		// par,
		// new JOResourceEntry(
		// "actions/paragraph/change_style",
		// Messages.JOParagraphService_ChangeParagraphStyle, null));
		// //$NON-NLS-1$
		if (par.getDocument().isWord()) {
			CTP ctp = (CTP) par.getXmlObject();

			if (!style.getName().startsWith("textart_")) { //$NON-NLS-1$
				CTR[] runs = ctp.getRArray();
				for (int i = 0; i < runs.length; i++) {
					if (runs[i].getRPr() != null) {
						if (runs[i].getRPr().getRFonts() != null) {
							runs[i].getRPr().unsetRFonts();
						}
						if (runs[i].getRPr().getSz() != null) {
							runs[i].getRPr().unsetSz();
						}
						if (runs[i].getRPr().getSzCs() != null) {
							runs[i].getRPr().unsetSzCs();
						}
					}
				}
			}

			String styleId = style.getId();
			CTString s = CTString.Factory.newInstance();
			s.setVal(styleId);
			if (ctp.getPPr() == null) {
				ctp.addNewPPr();
			}
			ctp.getPPr().setPStyle(s);

		} else if (par.getDocument().isSpreadsheet()) {
			// TODO:
		} else if (par.getDocument().isPresentation()) {
			// TODO:
		}

		par.setStyle(style);
		par.setDirtyContent(false);
		par.update();

		if (style.getId().startsWith("textart")) {
			style.setFont(oldFont);
		}

		if (dirtyLayout) {
			par.setDirtyLayout(true);
			par.getDocument().getEditor().layoutDocument();
		}

		// if (finalize) {
		// finalizeCommand(command);
		// finalizeSelectedObjects();
		// }
	}

	// /**
	// * @param paragraph
	// * @param st
	// */
	// private void updateTabs(JOParagraph paragraph, JOSWTAbstractStyledText
	// st) {
	// try {
	// if (paragraph.getTabs() != null
	// && paragraph.getTabs().get().getTabCount() > 0) {
	// Rectangle textBounds = st.getBounds();
	// @SuppressWarnings("unused")
	// JOPropertyTabs<JOTabArray> vt = paragraph.getTabs();
	// JOTabArray tabArray = paragraph.getTabs().get();
	//
	// List<Integer> tabs = new ArrayList<Integer>();
	// for (int i = 0; i < tabArray.getTabCount(); i++) {
	// JOTab tab = tabArray.getTab(i);
	// int pos = tab.getPos();
	// if (tab.getType().equals(JOTabType.RIGHT)) {
	// if (pos > textBounds.width - 30) {
	// pos -= 30;
	// }
	// }
	// tabs.add(pos);
	// }
	//
	// Collections.sort(tabs);
	// int[] ts = new int[tabs.size()];
	// int i = 0;
	// for (Integer pos1 : tabs) {
	// ts[i] = pos1;
	// i++;
	// }
	//
	// st.setTabStops(ts);
	// } else {
	// st.setTabStops(null);
	// }
	// } catch (Exception ex) {
	// // LOGGER.error("", ex); //$NON-NLS-1$
	// }
	// }

	/**
	 * @param cmd
	 * @param increase
	 */
	private void changeIndent(RcplCommand cmd, boolean increase) {
		// initSelectedObjects();
		// for (IParagraph par : JOUtil.getDocument().getRootParagraphs()) {
		// IParagraphFigure figure = ((JOParagraph) par).getLayoutFigure();
		// if (JOUtil.getEditor().getSelectedParagraphFigure() == figure) {
		// styledText = JOUtil.getEditor().getStyledText();
		// } else {
		// styledText = JOUtil.getPaintStyledText();
		// }
		// simulateSelection((JOParagraphFigure) figure);
		// if (figure.hasSelection()) {
		// createChangeCommand((JOParagraph) par, cmd.getEntry());
		// CTPPr ctpPr = ((CTP) par.getXmlObject()).getPPr();
		// JOEmuCentimeter cm = new JOEmuCentimeter(1);
		// if (ctpPr == null) {
		// ctpPr = ((CTP) par.getXmlObject()).addNewPPr();
		// }
		// CTInd ind = ctpPr.getInd();
		// if (ind == null) {
		// ind = ctpPr.addNewInd();
		// ind.setLeft(BigInteger.valueOf((long) (cm.toPoints() * 20)));
		// } else {
		// JOEmu indLeft = new JOEmu20ThPoint(ind.getLeft());
		// if (increase) {
		// indLeft.add(cm);
		// } else {
		// indLeft.subtract(cm);
		// if (indLeft.getValue().doubleValue() < 0) {
		// indLeft = new JOEmu();
		// }
		// }
		// ind.setLeft(BigInteger.valueOf((long) (indLeft.toPoints() * 20)));
		// }
		// par.setDirty(true);
		// par.updateFromXml(true);
		// figure.markAllCharactersDirty();
		// figure.repaint();
		// dirtyLayoutObjects.add((JOParagraph) par);
		// finalizeCommand();
		// if (selectionSimulation) {
		// break;
		// }
		// }
		// }
		// finalizeSelectedObjects();
	}

	/**
	 * @param command
	 */
	private void setBullets(ICommand command, boolean number) {
		// initSelectedObjects();
		for (IParagraph par : getEditor().getDocument().getRootParagraphs()) {

			simulateSelection(command, par);
			if (par.hasSelection()) {
				// createChangeCommand((JOParagraph) par);
				CTP ctp = (CTP) par.getXmlObject();
				CTNumPr numPr = ctp.getPPr().addNewNumPr();
				// level
				CTDecimalNumber dec = CTDecimalNumber.Factory.newInstance();
				dec.setVal(BigInteger.ZERO);
				numPr.setIlvl(dec);
				if (number) {
					dec = CTDecimalNumber.Factory.newInstance();
					dec.setVal(BigInteger.ONE);
					numPr.setNumId(dec);
				}
			}
			par.setDirtyContent(true);
			par.updateFromXml(true);
			dirtyLayoutObjects.add(par);
			// finalizeCommand();
			if (selectionSimulation) {
				break;
			}
		}
		// finalizeSelectedObjects();
	}

	/**
	 * @param style
	 * @param paragraphs
	 * @param selectedParagraph
	 */
	private void doExcecuteStyle(IStyle style, List<IParagraph> paragraphs, IParagraph selectedParagraph) {
		boolean selectionFound = false;
		for (IParagraph p : paragraphs) {
			if (p.hasSelection()) {
				p.setStyle(style);
				p.setDirtyContent(true);
				p.getLayoutFigure().updateFx();
				selectionFound = true;
			}
		}
		if (!selectionFound) {
			selectedParagraph.setStyle(style);
			selectedParagraph.getLayoutFigure().updateFx();
			selectedParagraph.getLayoutFigure().updateCaret();
			// selectedParagraph.getLayoutFigure().updateTools();
			selectedParagraph.setDirtyLayout(true);
			selectedParagraph.getDocument().getEditor().layoutDocument();
		}

	}

	/**
	 * @param paragraphs
	 * @param newHeight
	 */
	private void doExcecuteFontSize(List<IParagraph> paragraphs, IParagraph selectedParagraph, double newHeight) {
		boolean selectionFound = false;
		for (IParagraph p : paragraphs) {
			if (p.hasSelection()) {
				p.applyHeight(p.getSelectionStart(), p.getSelectionLength(), newHeight);
				p.getLayoutFigure().updateFx();
				selectionFound = true;
				p.setDirtyContent(true);
				p.getLayoutFigure().updateFx();
				p.setDirtyLayout(true);
				p.getDocument().getEditor().layoutDocument();
			}
		}
		if (selectionFound) {
			getLayoutService().layout();
			// paragraphs.get(0);
		} else {
			if (selectedParagraph != null) {
				selectedParagraph.setFontSize(newHeight);
				selectedParagraph.getLayoutFigure().updateCaret();
				selectedParagraph.setDirtyLayout(true);
				selectedParagraph.getDocument().getEditor().layoutDocument();
			}
		}
	}

	private void doExcecuteBold(ICommand command, List<IParagraph> paragraphs, IParagraph selectedParagraph) {
		boolean selectionFound = false;
		boolean bold = getBoolean(command.getTool().getTool());
		for (IParagraph p : paragraphs) {
			if (p.hasSelection()) {
				selectionFound = true;
				p.applyBold(p.getSelectionStart(), p.getSelectionLength(), bold); // bold);
				p.setDirtyContent(true);
				p.getLayoutFigure().updateFx();
			}
		}
		if (!selectionFound) {
			selectedParagraph.setBold(bold);
		}
	}

	private void doExcecuteItalic(ICommand command, List<IParagraph> paragraphs, IParagraph selectedParagraph) {
		boolean selectionFound = false;
		boolean italic = getBoolean(command.getTool().getTool());
		for (IParagraph p : paragraphs) {
			if (p.hasSelection()) {
				p.applyItalic(p.getSelectionStart(), p.getSelectionLength(), italic);
				p.setDirtyContent(true);
				p.getLayoutFigure().updateFx();
				updateParagraph(null, p);
				selectionFound = true;
			}
		}
		if (!selectionFound) {
			selectedParagraph.setItalic(italic);
		}
	}

	private void doExcecuteUnderline(ICommand command, List<IParagraph> paragraphs, IParagraph selectedParagraph) {
		boolean selectionFound = false;
		boolean underline = getBoolean(command.getTool().getTool());
		for (IParagraph p : paragraphs) {
			if (p.hasSelection()) {
				selectionFound = true;
				p.applyUnderline(p.getSelectionStart(), p.getSelectionLength(), underline);
				p.setDirtyContent(true);
				p.getLayoutFigure().updateFx();
				updateParagraph(null, p);
			}
		}
		if (!selectionFound) {
			selectedParagraph.getStyle().setUnderline(underline);
		}
	}

	/**
	 * @param value
	 */
	public void doExecuteFontName(ICommand command, List<IParagraph> paragraphs, IParagraph selectedParagraph) {

		String fontName = command.getNewStringValue();

		if (fontName == null) {
			return;
		}

		IParagraph firstParagraphWidthSelection = null;
		int startOffset = 0;
		if (getEditor().hasSelection()) {
			startOffset = getEditor().getSelectionStartShape().getCharacterIndex();
			for (IParagraph p : paragraphs) {
				if (p.hasSelection()) {
					if (firstParagraphWidthSelection == null) {
						firstParagraphWidthSelection = p;
					}
					p.applyFontName(p.getSelectionStart(), p.getSelectionLength(), fontName);
					p.getLayoutFigure().updateFx();
					p.setDirtyContent(true);
					p.getLayoutFigure().updateFx();
					p.setDirtyLayout(true);
					p.getDocument().getEditor().layoutDocument();
				}
			}
		}
		if (firstParagraphWidthSelection != null) {
			firstParagraphWidthSelection.commit();
			firstParagraphWidthSelection.activate();
			firstParagraphWidthSelection.setCaretOffset(startOffset);
			firstParagraphWidthSelection.getLayoutFigure().updateCaret();
			getEditor().unselect();
			firstParagraphWidthSelection.setDirtyLayout(true);
		} else {
			if (selectedParagraph != null) {
				selectedParagraph.setFontName(fontName);
				selectedParagraph.getLayoutFigure().updateCaret();
				selectedParagraph.setDirtyLayout(true);
				getLayoutService().layout();
				getEditor().unselect();
				selectedParagraph.setDirtyContent(true);
			}
		}

		// initSelectedObjects();
		// for (ILayoutObject l : JOUtil.getEditor().getDocument()
		// .getLayoutObjects()) {
		// if (l instanceof JOParagraph) {
		// JOParagraph par = (JOParagraph) l;
		// createChangeCommand(
		// par,
		// new JOResourceEntry(
		// "actions/paragraph/change_font_name", "Change Font Name", null));
		// //$NON-NLS-1$//$NON-NLS-2$
		// IParagraphFigure figure = par.getLayoutFigure();
		// if (JOUtil.getEditor().getSelectedParagraphFigure() == figure) {
		// styledText = JOUtil.getEditor().getStyledText();
		// } else {
		// styledText = JOUtil.getPaintStyledText();
		// }
		// // simulateSelection(figure);
		// if (figure.hasSelection()) {
		// JO.service.getParagraphService().updateStyledText(par,
		// styledText);
		//
		// styledText.getStyledTextUtil().setFontname((String) value);
		// // JO.service.getParagraphService().updateParagraph(
		// // styledText, par);
		// // JO.service.getParagraphService().updateParagraphHeight(
		// // figure, null, false);
		// figure.markAllCharactersDirty();
		// figure.repaint();
		// dirtyLayoutObjects.add(par);
		// finalizeCommand();
		// if (selectionSimulation) {
		// break;
		// }
		//
		// }
		// }
		// }
		// finalizeSelectedObjects();
	}

}
