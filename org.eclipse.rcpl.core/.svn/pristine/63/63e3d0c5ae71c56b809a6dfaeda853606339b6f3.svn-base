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

package org.eclipse.rcpl.internal.tools;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;

import org.eclipse.rcpl.EValueType;
import org.eclipse.rcpl.IProperty2;
import org.eclipse.rcpl.IResourceEntry;
import org.eclipse.rcpl.ITool;
import org.eclipse.rcpl.IToolComponent;
import org.eclipse.rcpl.IToolGroupFigure;
import org.eclipse.rcpl.IToolRegistry;
import org.eclipse.rcpl.internal.services.RcplActionListener;

/**
 * @author ramin
 * 
 */
public interface JOToolComponent extends IToolComponent {

	public IProperty2 getDatabindingProperty();

	/**
	 * @param property
	 */
	public void update(IProperty2 property);

	public EValueType getValueType();

	public IResourceEntry getEntry();

	public Rectangle2D getToolBounds();

	public void doSelect(boolean notify);

	public void setVisible(boolean visible);

	public void setEnabled(boolean enable);

	public boolean isEnabled();

	public Object getState();

	public ITool getTool();

	public void setImage(Image image);

	/**
	 * @param listener
	 */
	public void addActionListener(RcplActionListener listener);

	/**
	 * 
	 */
	public void addDragSupport(Object control);

	public Object[] getToolData();

	public Object getDragData();

	public void setSelectedImage(Image selectedImage);

	public IToolRegistry getToolRegistry();

	public Image getSelectedImage();

	public Image getImage();

	public boolean isEnterAction();

	public void setEnterAction(boolean enterAction);

	public IToolGroupFigure getButtonGroup();

	public boolean isAutoSelect();

	public void setAutoSelect(boolean autoSelect);

	public boolean isSelected();

	public void setSelected(boolean selected, boolean notify);

	public boolean isEntered();

	public void setEntered(boolean entered);

	public int getStyle();

	public void setLocation(int x, int y);

	public void setBounds(int x, int y, int width, int height);

	public boolean isVisible();

	public void setGroupButton(boolean groupButton);

	public void setData(Object data);

	public Object getData();

	public void setToolData(Object[] data);

	public boolean setFocus();
}
