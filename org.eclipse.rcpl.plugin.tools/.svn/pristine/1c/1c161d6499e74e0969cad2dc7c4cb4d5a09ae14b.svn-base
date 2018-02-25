package org.eclipse.rcpl.plugin.tools.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroups;
import org.eclipse.rcpl.plugin.tools.UCToolsPlugin;
import org.eclipse.rcpl.plugin.tools.parts.EToolsTreePart;

public class AddToolGroupHandler {

	private EToolsTreePart eToolsTreePart;

	public AddToolGroupHandler(EToolsTreePart eToolsTreePart) {
		this.eToolsTreePart = eToolsTreePart;
	}

	@Execute
	public void execute() {

		if (eToolsTreePart.getSelectedObject() instanceof ToolGroup) {
			eToolsTreePart.getUseCase().getController().unbindAll();
			ToolGroup rootGroup = ((ToolGroup) eToolsTreePart
					.getSelectedObject());

			ToolGroup group = RcplFactory.eINSTANCE.createToolGroup();
			group.setId("New Tool Group");
			group.setName("New Tool Group");

			Command command = AddCommand.create(UCToolsPlugin.getDefault()
					.getToolsManager().getEditingDomain(), rootGroup,
					RcplPackage.Literals.TOOL_GROUP, group);
			if (command != null && command.canExecute())
				UCToolsPlugin.getDefault().getToolsManager().getEditingDomain()
						.getCommandStack().execute(command);
		}

		else if (eToolsTreePart.getSelectedObject() instanceof ToolGroups) {

			eToolsTreePart.getUseCase().getController().unbindAll();
			ToolGroups rootGroups = ((ToolGroups) eToolsTreePart
					.getSelectedObject());

			ToolGroup group = RcplFactory.eINSTANCE.createToolGroup();
			group.setId("New Tool Group");
			group.setName("New Tool Group");

			Command command = AddCommand.create(UCToolsPlugin.getDefault()
					.getToolsManager().getEditingDomain(), rootGroups,
					RcplPackage.Literals.TOOL_GROUP, group);
			if (command != null && command.canExecute())
				UCToolsPlugin.getDefault().getToolsManager().getEditingDomain()
						.getCommandStack().execute(command);

		}

	}

}
