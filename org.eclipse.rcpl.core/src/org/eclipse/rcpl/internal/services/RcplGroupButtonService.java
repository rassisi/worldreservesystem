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

package org.eclipse.rcpl.internal.services;

import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.RcplCommand;

/**
 * @author ramin
 * 
 */
public class RcplGroupButtonService extends RcplService {

	/**
	 * 
	 */
	public RcplGroupButtonService() {
		super();
	}

	@Override
	public Object doExecute(ICommand command) throws Exception {

		//		if (getId(command).equals("word/actions/groups/fx")) { //$NON-NLS-1$
		// Object[] os = command.getNewData();
		// boolean sel = (Boolean) os[0];
		// if (sel) {
		// // JO.officePane.getEditor().showFxEditor(null);
		// } else {
		// JO.officePane.getEditor().showAspect(
		// JO.officePane.getEditor().getDocument()
		// .getDocumentType(), false);
		// }
		// return true;
		// }
		//
		//		if (getId(command).indexOf("/show_picture_group") != -1) { //$NON-NLS-1$
		//			selectGroup(command, "word/actions/groups/images"); //$NON-NLS-1$
		// return true;
		// }
		//
		//		if (getId(command).indexOf("/show_table_group") != -1) { //$NON-NLS-1$
		//			selectGroup(command, "word/actions/groups/tables"); //$NON-NLS-1$
		// return true;
		// }
		//
		//		if (getId(command).indexOf("/show_textbox_group") != -1) { //$NON-NLS-1$
		//			selectGroup(command, "word/actions/groups/textbox"); //$NON-NLS-1$
		// return true;
		// }
		//
		// IToolGroup toolGroup = JO.officePane.getToolRegistry().findToolGroup(
		// getId(command));
		// if (JO.officePane != null) {
		// JO.officePane.closeWWindows(true, false);
		// JO.officePane.setActivationPage(false);
		// }
		//
		// if (toolGroup != null) {
		// boolean sel = (Boolean) command.getNewData()[0];
		// if (sel) {
		// JO.UIC.getSideToolBar().groupSelected(toolGroup);
		//
		// if (toolGroup.getEntry().getKey()
		//						.equals("infotab/actions/groups/help")) { //$NON-NLS-1$
		//
		// if (JO.officePane != null) {
		// JO.officePane.showInfoAreaOpen();
		// }
		// } else if (toolGroup.getEntry().getKey()
		//						.equals("infotab/actions/groups/setup")) { //$NON-NLS-1$
		//
		// if (JO.officePane != null) {
		//
		// try {
		// ITool tool = JO.officePane
		// .getToolRegistry()
		// .findTools(
		//											"infotab/actions/setup/setup_editor").get(0); //$NON-NLS-1$
		// if (tool != null) {
		// tool.getToolComponent()
		// .setSelected(true, false);
		// tool.getToolComponent().doSelect(true);
		// }
		// } catch (Exception ex) {
		// // ignore
		// }
		// }
		// }
		//
		// } else {
		// // if (ef != null) {
		// // JO.officePane.collapseGroup();
		// // }
		// }
		// }
		return true;
	}

	/**
	 * @param command
	 * @param key
	 */
	private void selectGroup(RcplCommand command, String key) {
		boolean sel;
		if (command.getData()[0] instanceof Boolean) {
			sel = (Boolean) command.getData()[0];
		} else {
			sel = true;
		}
		// selectGroup(key, command.getEntry().getShelfIndex(), sel);
	}

}
