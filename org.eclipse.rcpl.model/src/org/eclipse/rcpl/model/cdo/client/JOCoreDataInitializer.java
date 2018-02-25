package org.eclipse.rcpl.model.cdo.client;


public class JOCoreDataInitializer {

	@SuppressWarnings("unused")
	private JOSession cdoSession;

	public JOCoreDataInitializer(JOSession cdoSession) {
		this.cdoSession = cdoSession;

	}

	public void process(){
		createOffice();
	}





	/**
	 * @param code
	 * @param name
	 */
	private void createOffice() {
//		JOfficeFactory.eINSTANCE.createEJOffice();
//		cdoSession.
//		cdoSession.coreDataTable.put("cURRENCY_" + code, currency);
	}

}
