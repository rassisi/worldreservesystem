package org.eclipse.rcpl.application.test;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.jnlp.BasicService;
import javax.jnlp.ServiceManager;
import javax.jnlp.UnavailableServiceException;

import com.joffice.application.JOfficeViewer;
import com.joffice.model.cdo.client.JOSession;

public class OfficeViewerExample extends Application {

	public static void main(String[] args) {

		BasicService basicService = null;
		try {
			try {
				basicService = (BasicService) ServiceManager
						.lookup("javax.jnlp.BasicService");
				JOSession.LAUNCHED_BY_JNLP = true;
			} catch (UnavailableServiceException e) {
				JOSession.LAUNCHED_BY_JNLP = false;
			}

			if (basicService != null) {
				JOSession.codeBase = basicService.getCodeBase().toString();

			} else {
				// JO. println("codeBase not determined");
			}
		} catch (Exception ex) {
			// ignore
		}

		launch(args);

	}

	private Scene scene;

	@Override
	public void start(final Stage stage) {

		JOfficeViewer viewer = new JOfficeViewer();
		scene = new Scene(viewer.getNode(), 1000, 800);
		viewer.initCss(scene);

		stage.centerOnScreen();
		stage.setTitle("J-Office");

		File file = new File(
				"c:/data/ws/joffice_fx/com.joffice.build.dist/web/joffice.eu/examples/docx/writer_functional_resume.docx");
		viewer.open(file);

		viewer.setScale(0.6);

		stage.setScene(scene);

		stage.show();
	}

}
