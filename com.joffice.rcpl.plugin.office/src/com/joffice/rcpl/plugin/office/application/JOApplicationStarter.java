package com.joffice.rcpl.plugin.office.application;

import org.eclipse.rcpl.IRcplApplicationProvider;
import org.eclipse.rcpl.IRcplFactory;
import org.eclipse.rcpl.IToolFactory;
import org.eclipse.rcpl.IWindowAdvisor;
import org.eclipse.rcpl.RcplLogin;
import org.eclipse.rcpl.RcplUic;
import org.eclipse.rcpl.application.RcplApplicationStarter;
import org.eclipse.rcpl.application.RcplWindowAdvisor;
import org.eclipse.rcpl.internal.services.RcplBrowserService;
import org.eclipse.rcpl.internal.services.RcplCommandService;
import org.eclipse.rcpl.internal.services.RcplContextMenuGeneralService;
import org.eclipse.rcpl.internal.services.RcplDeleteService;
import org.eclipse.rcpl.internal.services.RcplDocumentService;
import org.eclipse.rcpl.internal.services.RcplEditorService;
import org.eclipse.rcpl.internal.services.RcplGroupButtonService;
import org.eclipse.rcpl.internal.services.RcplInfoTabService;
import org.eclipse.rcpl.internal.services.RcplObjectService;
import org.eclipse.rcpl.internal.services.RcplSetupService;
import org.eclipse.rcpl.internal.services.RcplStartButtonService;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOSession;

import com.joffice.rcpl.plugin.office.internal.JOfficeFactory;
import com.joffice.rcpl.plugin.office.internal.impl.JOfficeToolFactory;

import javafx.stage.Stage;

public class JOApplicationStarter extends RcplApplicationStarter {

	public JOApplicationStarter(IRcplApplicationProvider applicationProvider) {
		super(applicationProvider);
	}

	@Override
	protected RcplUic createUIC(RcplLogin login) {
		return new JOUic(this);
	}

	@Override
	public boolean start(RcplLogin login, Stage primaryStage) {
		JOSession.getDefault("https://github.com/rassisi/worldreservesystem/raw/master/org.worldreservesystem.doc/");
		RCPLModel.mobileProvider.appendLog("register Services");
		getRcplApplicationProvider().registerService(RcplBrowserService.class);
		getRcplApplicationProvider().registerService(RcplCommandService.class);
		getRcplApplicationProvider().registerService(RcplContextMenuGeneralService.class);
		getRcplApplicationProvider().registerService(RcplDeleteService.class);
		getRcplApplicationProvider().registerService(RcplDocumentService.class);
		getRcplApplicationProvider().registerService(RcplEditorService.class);
		getRcplApplicationProvider().registerService(RcplGroupButtonService.class);
		getRcplApplicationProvider().registerService(RcplInfoTabService.class);
		getRcplApplicationProvider().registerService(RcplObjectService.class);
		getRcplApplicationProvider().registerService(RcplSetupService.class);
		getRcplApplicationProvider().registerService(RcplStartButtonService.class);

		RCPLModel.mobileProvider.appendLog("super.start(login, primaryStage)");

		return super.start(login, primaryStage);
	}

	@Override
	protected IWindowAdvisor createWindowAdvisor() {
		return new RcplWindowAdvisor(getRcplApplicationProvider(),
				getClass().getResource("/css/default.css").toExternalForm());
	}

	@Override
	protected IToolFactory createToolFactory() {
		return new JOfficeToolFactory();
	}

	@Override
	protected IRcplFactory createRcplFactory() {
		return new JOfficeFactory();
	}
}
