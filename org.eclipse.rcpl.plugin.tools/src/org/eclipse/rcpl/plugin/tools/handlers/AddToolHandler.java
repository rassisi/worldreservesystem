/*******************************************************************************
 * Copyright (c) 2009, 2010 Siemens AG and others.
 * 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Kai Tödter - initial implementation
 ******************************************************************************/

package org.eclipse.rcpl.plugin.tools.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;
import org.eclipse.rcpl.plugin.tools.UCToolsPlugin;
import org.eclipse.rcpl.plugin.tools.parts.EToolsTreePart;

public class AddToolHandler {

	private EToolsTreePart eToolsTreePart;

	public AddToolHandler(EToolsTreePart eToolsTreePart) {
		this.eToolsTreePart = eToolsTreePart;
	}

	@Execute
	public void execute() {
		// final TreeItem<Object> item = eToolsTreePart.getTreeView()
		// .getSelectionModel().getSelectedItem();

		if (eToolsTreePart.getSelectedObject() instanceof ToolGroup) {
			eToolsTreePart.getUseCase().getController().unbindAll();
			Tool tool = RcplFactory.eINSTANCE.createTool();
			ToolGroup rootGroup = ((ToolGroup) eToolsTreePart
					.getSelectedObject());
			Command command = AddCommand.create(UCToolsPlugin.getDefault()
					.getToolsManager().getEditingDomain(), rootGroup,
					RcplPackage.Literals.TOOL_GROUP, tool);
			if (command != null && command.canExecute())
				UCToolsPlugin.getDefault().getToolsManager().getEditingDomain()
						.getCommandStack().execute(command);

		}
	}

	public boolean canExecute(Object selectedItem) {
		ToolGroup group = null;
		if (selectedItem instanceof ToolGroup) {
			group = (ToolGroup) selectedItem;
		}
		if (group != null) {
			return true;
			// Command command = PasteFromClipboardCommand.create(
			// contactsManager.getEditingDomain(), group,
			// JOfficePackage.eINSTANCE.getEGroup_Contacts());
			// return command.canExecute();
		}

		return false;

	}

}
