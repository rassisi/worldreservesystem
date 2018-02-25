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

package org.eclipse.rcpl.contacts.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.rcpl.contacts.plugin.OsgiContactsPlugin;
import org.eclipse.rcpl.model_2_0_0.rcpl.Person;
import org.eclipse.rcpl.model_2_0_0.rcpl.PersonGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;

public class AddContactHandler {

	private Object selectedItem;

	@Execute
	public void execute() {

		if (selectedItem instanceof PersonGroup) {
			PersonGroup group = (PersonGroup) selectedItem;
			Person contact = RcplFactory.eINSTANCE.createPerson();
			PersonGroup rootGroup = group; // JO.session.getJoffice().getContacts();
			Command command = AddCommand.create(
					OsgiContactsPlugin.getEditingDomain(), rootGroup,
					RcplPackage.Literals.PERSON_GROUP__PERSONS, contact);
			if (command != null && command.canExecute())
				OsgiContactsPlugin.getEditingDomain().getCommandStack()
						.execute(command);
		}
	}

	public boolean canExecute(@Optional Object selectedItem) {
		// EGroup group = null;
		//
		// if (selectedItem instanceof EContact)
		// // get containing Group if selection is a Contact
		// group = (EGroup) ((EContact) selectedItem).eContainer();
		//
		// else if (selectedItem instanceof EGroup)
		// group = (EGroup) selectedItem;
		//
		// if (group != null) {
		// command =
		// PasteFromClipboardCommand.create(contactsManager.getEditingDomain(),
		// group,
		// JOfficePackage.eINSTANCE.getEGroup_Contacts());
		// return command.canExecute();
		// }
		//
		// return false;

		return true;
	}

	public Object getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(Object selectedItem) {
		this.selectedItem = selectedItem;
	}

}
