package org.eclipse.rcpl.application;

import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplFactory;
import org.eclipse.rcpl.IToolFactory;
import org.eclipse.rcpl.IWindowAdvisor;
import org.eclipse.rcpl.BasicFactory;
import org.eclipse.rcpl.RcplLogin;
import org.eclipse.rcpl.RcplUic;
import org.eclipse.rcpl.internal.impl.RcplToolFactory;

import javafx.stage.Stage;

public class DefaultApplicationStarter extends RcplApplicationStarter {

	public DefaultApplicationStarter(IRcplApplicationProvider applicationProvider) {
		super(applicationProvider);
	}

	@Override
	protected RcplUic createUIC(RcplLogin login) {
		return new RcplUic(this);
	}

	@Override
	public boolean start(RcplLogin login, Stage primaryStage) {

		// getRcplApplicationProvider().registerService(JOBrowserService.class);
		// getRcplApplicationProvider().registerService(JOCommandService.class);
		// getRcplApplicationProvider().registerService(JOContextMenuGeneralService.class);
		// getRcplApplicationProvider().registerService(JODeleteService.class);
		// getRcplApplicationProvider().registerService(JODocumentService.class);
		// getRcplApplicationProvider().registerService(JOEditorService.class);
		// getRcplApplicationProvider().registerService(JOGroupButtonService.class);
		// getRcplApplicationProvider().registerService(JOInfoTabService.class);
		// getRcplApplicationProvider().registerService(JOObjectService.class);
		// getRcplApplicationProvider().registerService(JOSetupService.class);
		// getRcplApplicationProvider().registerService(JOShapeService.class);
		// getRcplApplicationProvider().registerService(JOStartButtonService.class);

		return super.start(login, primaryStage);
	}

	@Override
	protected IWindowAdvisor createWindowAdvisor() {
		return new RcplWindowAdvisor(getRcplApplicationProvider(),
				getClass().getResource("/css/default.css").toExternalForm());
	}

	@Override
	protected IToolFactory createToolFactory() {
		return new RcplToolFactory();
	}

	@Override
	protected IRcplFactory createRcplFactory() {
		return new BasicFactory();
	}
}
