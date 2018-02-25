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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;

import javafx.scene.Node;

/**
 * @author ramin
 *
 */
public abstract class RcplTool implements ITool {

	private final Tool tool;

	protected Node node;

	protected boolean selected;

	private IEditor editor;

	public RcplTool(String id, String name, String toolTip, String imageName, boolean toggle) {
		this(RcplFactory.eINSTANCE.createTool());
		tool.setName(name);
		tool.setId(id);
		tool.setImage(imageName);
		tool.setToolTip(toolTip);
	}

	public RcplTool(Tool tool) {
		this.tool = tool;
		Rcpl.getEditorListeners().add(this);
	}

	@Override
	public abstract Node createNode();

	@Override
	public Node getNode() {
		if (node == null) {
			node = createNode();
		}
		return node;
	}

	@Override
	public Tool getTool() {
		return tool;
	}

	@Override
	public String getService() {
		String sn = tool.getService();
		if (sn == null) {
			EObject ea = tool;
			while (ea != null) {
				ea = ea.eContainer();
				if (ea instanceof ToolGroup) {
					if (((ToolGroup) ea).getService() != null) {
						sn = ((ToolGroup) ea).getService();
						break;
					}
				}
			}
		}
		return sn;

	}

	@Override
	public void setBounds(double x, double y, double Width, double height) {
	}

	@Override
	public void setActivePage(IPage page) {
	}

	@Override
	public void setTabs(Object tabs) {
	}

	@Override
	public void textChanged(String formattedText) {
	}

	@Override
	public void doSave() {
	}

	@Override
	public void doLoad() {
	}

	@Override
	public void handleSizeChanged(int width, int height) {
	}

	@Override
	public void selectAll() {
	}

	@Override
	public void handleDeletePressed() {
	}

	@Override
	public void deletePressed() {
	}

	@Override
	public void handlePaste(IPage page) {
	}

	@Override
	public void rendered(int pageNumber) {
	}

	@Override
	public void undoPossible(boolean enabled) {
	}

	@Override
	public void redoPossible(boolean enabled) {
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
	public IToolRegistry getToolRegistry() {
		return null;
	}

	@Override
	public IResourceEntry getEntry() {
		return null;
	}

	@Override
	public IToolComponent getToolComponent() {
		return null;
	}

	@Override
	public void setVisible(boolean visible) {
	}

	@Override
	public IToolGroup getGroup() {
		return null;
	}

	@Override
	public boolean isFullSize() {
		return false;
	}

	@Override
	public int getToolHierarchy() {
		return 0;
	}

	@Override
	public Object getImage() {
		return null;
	}

	private String getId() {
		if (tool != null) {
			return tool.getId();
		}
		return "";
	}

	@Override
	public boolean isWrap() {
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RcplTool other = (RcplTool) obj;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		return true;
	}

	@Override
	public void update(JOEvent event) {

	}

	public IEditor getEditor() {
		return editor;
	}

	public void setEditor(IEditor editor) {
		this.editor = editor;
	}

}
