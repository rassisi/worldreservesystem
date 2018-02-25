package org.eclipse.rcpl;

import java.util.List;

import javafx.scene.Parent;

/**
 * @author ramin
 *
 */
public interface IEditor extends ICommandProvider {

	void updateOutline();

	boolean isDisposed();

	void showPageGroup(boolean show);

	void updateDocumentInfo();

	void layoutDocument();

	void finishAddPages();

	void setActualPage(IPage actualPage);

	void stopScroll();

	boolean updateScrollTargetForCaret();

	void scrollPageDown();

	void scrollPageUp();

	boolean isDirty();

	IPage getLastPage();

	IPage getFirstPage();

	List<IPage> getPages();

	// void startLayoutService();

	void removeEmptyPages();

	void addPage(IPage page);

	void centerHorizontally();

	void collapseHorizontalRuler();

	void dispose();

	void expandHorizontalRuler();

	void expandVerticalArea();

	IPage findFistPageOfSection();

	ILayoutObject getAnchorObject();

	IDocument getDocument();

	EnDocumentType getDocumentType();

	ILayoutObject getFirstDirtyLayoutObject();

	Parent getMainPane();

	IPage getPage(int index);

	int getPageColumns();

	int getPageCount();

	int getPageIndex(IPage page);

	double getScale();

	ILayoutObject getSelectedLayoutObject();

	IPage getSelectedPage();

	IParagraph getSelectedParagraph();

	Object getTabItem();

	boolean hasPages();

	boolean isEnableCommandStack();

	boolean isLastPage(IPage page);

	boolean isReadOnly();

	boolean isShowLines();

	boolean isShowOutline();

	boolean isSlideMasterView();

	boolean isSortMode();

	boolean isSuppressClipChildren();

	boolean isTwoPageLayout();

	void positionToLastEditParagraph();

	void redo();

	void removePage(IPage page);

	void resetAll();

	void setAnchorObject(ILayoutObject lo);

	void setBrowser(IBrowser browser);

	void setDocument(IDocument document);

	void setEnableCommandStack(boolean enable);

	void setPageColumns(int columns);

	void setPages(List<IPage> pages);

	void setPrintMode(boolean noParagraphImages);

	void setResizeAutomatic(boolean auto);

	void setScale(double scale);

	boolean setSelectedPage(IPage page);

	void setSelectedParagraph(IParagraph paragraph);

	void setShowGrid(boolean show);

	void setShowLines(boolean showLines);

	void setShowOutline(boolean show);

	void setShowOutlineParagraph(boolean show);

	void setSortMode(boolean sortMode);

	void setSuppressClipChildren(boolean suppress);

	void showAspect();

	void showAspect(EnDocumentType type, boolean fx);

	void showOutline(boolean show);

	void undo();

	void updateCanvasSize();

	void updatePageVisibility();

	void updateTabText(String text, boolean dirty);

	void select(IParagraph paragraph);

	ISelectionShape getSelectionStartShape();

	ISelectionShape getSelectionEndShape();

	void unselect();

	void updateAllSelections();

	boolean hasSelection();

	double getZoom();

	boolean isEditable();

	IUndoRedoListener getUndoRedoListener();

	void showTools(boolean show);

	void hideAnchor();

	void showAnchor(ILayoutFigure figure);

}
