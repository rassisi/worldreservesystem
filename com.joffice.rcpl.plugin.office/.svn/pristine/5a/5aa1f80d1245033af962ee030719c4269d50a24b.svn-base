package com.joffice.rcpl.plugin.office.internal.services;

import java.io.IOException;
import java.net.MalformedURLException;

import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.WaitThread;
import org.eclipse.rcpl.model.RCPLModel;

import javafx.application.Platform;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 * @author ramin
 *
 */
public class JOFXLayoutService extends Service<String> {

	private IEditor editor;

	private boolean cancelled;

	private boolean firstTime = true;

	private boolean layouting;

	public JOFXLayoutService(IEditor editor) {
		this.editor = editor;
	}

	public static JOFXLayoutService create(IEditor editor) {

		JOFXLayoutService service = new JOFXLayoutService(editor);

		// service.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
		//
		// @Override
		// public void handle(WorkerStateEvent t) {
		// System.out."done:" + t.getSource().getValue());
		//
		// }
		// });
		service.start();
		return service;
	}

	@Override
	protected Task<String> createTask() {

		return new Task<String>() {
			@Override
			protected String call() throws IOException, MalformedURLException {

				final JOLayoutService s = new JOLayoutService();
				s.setEditor(getEditor());
				layouting = true;
				// new WaitThread() {
				// @Override
				// public void doRun() {
				// Rcpl.startProgress(0.01, false);
				// }
				// };

				do {
					new WaitThread(getEditor()) {

						@Override
						public void doRun() {
							s.layout();
							layouting = false;
						}
					};

					Rcpl.progressMessage("Page " + getEditor().getPageCount());

					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} while (!s.ld.compleated());

				doCompleated();

				for (; !cancelled;) {
					try {
						if (!layouting) {
							if (s.getEditor().isDirty()) {
								layouting = true;
								s.layout();
								layouting = false;
							}
						}
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
						}

					} catch (Throwable ex) {
						RCPLModel.logError(ex);
					}
					if (cancelled) {
						Rcpl.showProgress(false);
					}
				}
				String result = "OK";
				return result;
			}
		};

	}

	private void doLayout(JOLayoutService s) {
		s.layout();
		layouting = false;
		doCompleated();
	}

	private void doCompleated() {
		if (getEditor().getDocument().getRootParagraphs().size() > 0) {
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					if (firstTime) {
						firstTime = false;
						getEditor().getDocument().getRootParagraphs().get(0).activate();
						getEditor().setScale(RCPLModel.configuration.getDefaultZoom());
					}
				}
			});
		}
		Rcpl.showProgress(false);
		cancelled = true;
	}

	public IEditor getEditor() {
		return editor;
	}

	@Override
	public boolean cancel() {
		return super.cancel();
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public boolean isLayouting() {
		return layouting;
	}

}
