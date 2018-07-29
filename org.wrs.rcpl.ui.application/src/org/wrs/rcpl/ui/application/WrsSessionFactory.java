package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.model.ISession;
import org.eclipse.rcpl.model.ISessionFacory;
import org.wrs.model.wrs.WRS;

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
