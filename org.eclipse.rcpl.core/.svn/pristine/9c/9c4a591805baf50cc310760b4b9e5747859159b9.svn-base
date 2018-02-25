package org.eclipse.rcpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.model_2_0_0.rcpl.Plugin;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;

import javafx.scene.Node;

public interface IRcplPlugin {

	String USECASE_CONTACTS_CLASS = "org.eclipse.rcpl.ui.parts.contacts.EContactsUseCase";
	String USECASE_TOOLS_CLASS = "org.eclipse.rcpl.client.uc.tools.parts.EToolsUseCase";
	String USECASE_IT_CLASS = "org.eclipse.rcpl.uc.it.parts.EITUseCase";

	//
	// String[] registeredUseCases = new String[] {
	//
	// USECASE_CONTACTS,
	//
	// USECASE_TOOLS,
	//
	// USECASE_IT
	//
	// };

	void init();

	String getId();

	Node getNode();

	Plugin getEmfModel();

	String getDisplayName();

	Class<? extends EObject> getRootClass();

	void setRootClass(Class<? extends EObject> cl);

	void setTool(Tool tool);

	Tool getTool();

	void setAsEditor(boolean asEditor);

	boolean isAsEditor();

	void executeCommand(ICommand command);

	IApplicationStarter createApplicationStarter(IRcplApplicationProvider rcplApplication);

	void bindToModel() throws Exception;

	boolean isCustomApplication();
}
