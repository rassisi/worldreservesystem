package org.wrs.rcpl.ui.factories;

import org.eclipse.rcpl.model.ISession;
import org.eclipse.rcpl.model.ISessionFacory;
import org.wrs.model.wrs.WRS;
import org.wrs.rcpl.ui.application.WrsSession;

/**
 * @author ramin
 *
 */
public class WrsSessionFactory implements ISessionFacory {

	@Override
	public ISession createSession() {
		return new WrsSession<WRS>();
	}

}
