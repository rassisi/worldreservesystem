package org.eclipse.rcpl.ui.parts.contacts;

import org.eclipse.rcpl.IRcplPlugin;
import org.eclipse.rcpl.RcplAbstractMigration;
import org.eclipse.rcpl.contacts.plugin.RcplContactsPlugin;

public class EContactsMigration extends RcplAbstractMigration {

	public EContactsMigration(IRcplPlugin useCase) {
		super(useCase);
	}

	@Override
	protected void migrate() {

		// removeGroupFromTopBar(JOModel.USE_CASE_CONTACTS,
		// "sideBar/clipboard");
		// removeGroupFromTopBar(JOModel.USE_CASE_CONTACTS, "topBar/contacts");
		// removeGroupFromTopBar(JOModel.USE_CASE_CONTACTS, "topBar/Contacts");
		// addGroupToTopBar(JOModel.USE_CASE_CONTACTS, "sideBar/clipboard", 0);

		// IUseCase ucContacts = JO.UIC.findUsecase(JOModel.USE_CASE_CONTACTS);
		// ucContacts.getEUseCase().setName("Contacts");
		//
		addGroupToTopBar(useCase, "addContact_419", "Add Contact",
				"addContact_419", 0);
		addGroupToTopBar(useCase, "addContactsGroup", "Add Contact Group",
				"addContactsGroup", 0);

		// removeGroupFromTopBar(EContactsUseCase.ID, "addItProject");

		addToolToQuickBar(RcplContactsPlugin.ID, "openContactsPerspective",
				"Open Contacts Perspective", "contacts", 0);

		// addToolToQuickBar(JOModel.USE_CASE_CONTACTS, "addContactsGroup", 0);
		//
		// addToolToQuickBar(JOModel.USE_CASE_CONTACTS, "deleteContactItem", 0);

	}
}
