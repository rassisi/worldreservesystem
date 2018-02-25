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
package org.eclipse.rcpl;

/**
 * @author Ramin Assisi
 *
 */
public class RcplEditorListenerAdapter implements IEditorListener {

	/**
	 * @see org.eclipse.rcpl.IEditorListener.ui.draw2d.wysiwyg.figures.IEditorListener#doLoad()
	 */
	@Override
	public void doLoad() {
	}

	/**
	 * @see org.eclipse.rcpl.IEditorListener.ui.draw2d.wysiwyg.figures.IEditorListener#doSave()
	 */
	@Override
	public void doSave() {
	}

	/**
	 * @see org.eclipse.rcpl.IEditorListener.ui.draw2d.wysiwyg.figures.IEditorListener#textChanged(java.lang.String)
	 */
	@Override
	public void textChanged(String formattedText) {
	}

	/**
	 * @see org.eclipse.rcpl.IEditorListener.ui.draw2d.wysiwyg.figures.IEditorListener#setActivePage(org.eclipse.rcpl.ui.internal.internal.figures.JOPageFigure.draw2d.wysiwyg.figures.PageFigure)
	 */
	@Override
	public void setActivePage(IPage page) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public void handleSizeChanged(int width, int height) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.rcpl.IEditorListener.ui.draw2d.wysiwyg.figures.IEditorListener#select()
	 */
	@Override
	public void selectAll() {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.rcpl.IEditorListener.ui.draw2d.wysiwyg.figures.IEditorListener#handleDeletePressed()
	 */
	@Override
	public void handleDeletePressed() {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.rcpl.IEditorListener.ui.draw2d.wysiwyg.figures.IEditorListener#deletePressed()
	 */
	@Override
	public void deletePressed() {
	}

	/**
	 * @see org.eclipse.rcpl.IEditorListener.ui.draw2d.wysiwyg.figures.IEditorListener#handlePaste(org.eclipse.rcpl.ui.internal.internal.figures.JOPageFigure.draw2d.wysiwyg.figures.PageFigure)
	 */
	@Override
	public void handlePaste(IPage page) {
	}

	/**
	 * @see org.eclipse.rcpl.IEditorListener.ui.draw2d.wysiwyg.figures.IEditorListener#rendered(int)
	 */
	@Override
	public void rendered(int pageNumber) {
	}

	/**
	 * @see org.eclipse.rcpl.IEditorListener.ui.draw2d.wysiwyg.figures.IEditorListener#redoPossible(boolean)
	 */
	@Override
	public void redoPossible(boolean enabled) {
	}

	/**
	 * @see org.eclipse.rcpl.IEditorListener.ui.draw2d.wysiwyg.figures.IEditorListener#undoPossible(boolean)
	 */
	@Override
	public void undoPossible(boolean enabled) {
	}

	@Override
	public void close() {
	}

	@Override
	public void maximize() {
	}

	@Override
	public void minimize() {
	}

	@Override
	public void fullScreen() {
	}

	@Override
	public void setTabs(Object tabs) {
	}

	@Override
	public void update(JOEvent event) {
	}

	@Override
	public void setEditor(IEditor editor) {
		// TODO Auto-generated method stub

	}

}
