/******************************************************************************
 * Copyright (c) 2007-2008 APPLIED SOFT Ltd
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    APPLIED Soft Ltd. - initial API and implementation 
 *    Ramin Assisi
 ****************************************************************************/
package org.eclipse.rcpl;

/**
 * @author ramin
 * 
 */
public interface IEditorListener {

	void setEditor(IEditor editor);

	public void setActivePage(IPage page);

	public void setTabs(Object tabs);

	public void textChanged(String formattedText);

	public void doSave();

	public void doLoad();

	public void handleSizeChanged(int width, int height);

	public void selectAll();

	public void handleDeletePressed();

	public void deletePressed();

	public void handlePaste(IPage page);

	public void rendered(int pageNumber);

	public void undoPossible(boolean enabled);

	public void redoPossible(boolean enabled);

	public void close();

	public void maximize();

	public void minimize();

	public void fullScreen();

	public void update(JOEvent event);
}
