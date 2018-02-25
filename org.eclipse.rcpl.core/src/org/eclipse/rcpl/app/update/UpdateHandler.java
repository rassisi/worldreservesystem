/*******************************************************************************
 * Copyright (c) 2003 - 2014 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/
package org.eclipse.rcpl.app.update;

public class UpdateHandler {

	// private static final String REPOSITORY_LOC = System.getProperty(
	// "UpdateHandler.Repo", "file://home/repository");

	public void execute() {

		// final IProvisioningAgent agent = new ProvisioningAgent();
		//
		// Job j = new Job("Update Job") {
		// private boolean doInstall = false;
		//
		// @Override
		// protected IStatus run(final IProgressMonitor monitor) {
		//
		// /* 1. Prepare update plumbing */
		//
		// final ProvisioningSession session = new ProvisioningSession(
		// agent);
		// final UpdateOperation operation = new UpdateOperation(session);
		//
		// // create uri
		// URI uri = null;
		// try {
		// uri = new URI(REPOSITORY_LOC);
		// } catch (final URISyntaxException e) {
		// // sync.syncExec(new Runnable() {
		// // @Override
		// // public void run() {
		// // MessageDialog.openError(parent, "URI invalid",
		// // e.getMessage());
		// // }
		// // });
		// return Status.CANCEL_STATUS;
		// }
		//
		// // set location of artifact and metadata repo
		// operation.getProvisioningContext().setArtifactRepositories(
		// new URI[] { uri });
		// operation.getProvisioningContext().setMetadataRepositories(
		// new URI[] { uri });
		//
		// /* 2. check for updates */
		//
		// // run update checks causing I/O
		// final IStatus status = operation.resolveModal(monitor);
		//
		// // failed to find updates (inform user and exit)
		// if (status.getCode() == UpdateOperation.STATUS_NOTHING_TO_UPDATE) {
		// // sync.syncExec(new Runnable() {
		// // @Override
		// // public void run() {
		// // MessageDialog
		// // .openWarning(parent, "No update",
		// // "No updates for the current installation have been found");
		// // }
		// // });
		// return Status.CANCEL_STATUS;
		// }
		//
		// /* 3. Ask if updates should be installed and run installation */
		//
		// // found updates, ask user if to install?
		// if (status.isOK() && status.getSeverity() != IStatus.ERROR) {
		// // sync.syncExec(new Runnable() {
		// // @Override
		// // public void run() {
		// // String updates = "";
		// // Update[] possibleUpdates = operation
		// // .getPossibleUpdates();
		// // for (Update update : possibleUpdates) {
		// // updates += update + "\n";
		// // }
		// // doInstall = MessageDialog.openQuestion(parent,
		// // "Really install updates?", updates);
		// // }
		// // });
		// }
		//
		// // start installation
		// if (doInstall) {
		// final ProvisioningJob provisioningJob = operation
		// .getProvisioningJob(monitor);
		// // updates cannot run from within Eclipse IDE!!!
		// if (provisioningJob == null) {
		// System.err

		// throw new NullPointerException();
		// }
		//
		// // register a job change listener to track
		// // installation progress and notify user upon success
		// provisioningJob
		// .addJobChangeListener(new JobChangeAdapter() {
		// @Override
		// public void done(IJobChangeEvent event) {
		// if (event.getResult().isOK()) {
		// // sync.syncExec(new Runnable() {
		// //
		// // @Override
		// // public void run() {
		// // // boolean restart = MessageDialog
		// // // .openQuestion(
		// // // parent,
		// // // "Updates installed, restart?",
		// // //
		// //
		// "Updates have been installed successfully, do you want to restart?");
		// // // if (restart) {
		// // // workbench.restart();
		// // // }
		// // }
		// // });
		//
		// }
		// super.done(event);
		// }
		// });
		//
		// provisioningJob.schedule();
		// }
		// return Status.OK_STATUS;
		// }
		// };
		// j.schedule();
	}
}