package org.eclipse.rcpl;

import javafx.application.Platform;

/**
 * @author ramin
 *
 */
public abstract class WaitThread {

	private boolean wait;

	private IEditor editor;

	public WaitThread(IEditor editor) {
		this.editor = editor;
		if (editor == null || !editor.isDisposed()) {
			run();
		}
	}

	private void run() {
		if (Platform.isFxApplicationThread()) {
			doRun();
		} else {
			wait = true;
			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					doRun();
					wait = false;
				}
			});
			do {
				if (editor == null || editor.isDisposed()) {
					break;
				}
				if (!wait) {
					sleep();
					break;
				}
				sleep();
			} while (true);
		}

	}

	private void sleep() {
		try {
			Thread.sleep(0, 10);
		} catch (InterruptedException e) {
		}
	}

	public abstract void doRun();
}
