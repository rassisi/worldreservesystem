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

package org.eclipse.rcpl.internal.services;

import org.eclipse.rcpl.ICommand;
import org.eclipse.rcpl.JOAction;
import org.eclipse.rcpl.RcplCommand;

/**
 * @author eclipse
 * 
 */
public class RcplContextMenuGeneralService extends RcplService {

	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOContextMenuGeneralService.class);

	public RcplContextMenuGeneralService() {
		super();
	}

	@Override
	public Object doExecute(ICommand command) {
		//		if (getId(command).indexOf("/delete_") != -1) { //$NON-NLS-1$
		// deleteLayoutFigure(command);
		// return true;
		//		} else if (getId(command).indexOf("/edit_") != -1) { //$NON-NLS-1$
		// editLayoutFigure(command);
		// return true;
		//		} else if (getId(command).indexOf("/insert_") != -1) { //$NON-NLS-1$
		// // insertLayoutFigure(command);
		// return true;
		//		} else if (getId(command).indexOf("/z_order_") != -1) { //$NON-NLS-1$
		// zOrderLayoutFigure(command);
		// return true;
		// }

		return false;
	}

	/**
	 * @param command
	 */
	public boolean deleteLayoutFigure(RcplCommand command) {
		// try {
		// Object[] data = command.getNewData();
		// // JOAction actionType = (JOAction) data[0];
		// IFigure figure = (IFigure) data[1];
		// if (figure instanceof JOFigure) {
		// ((ILayoutFigure) figure).getLayoutObject().dispose();
		// } else {
		// getDeleteService().doActionPerformed(command);
		// }
		// } catch (Exception ex) {
		//			LOGGER.error("", ex); //$NON-NLS-1$
		// }
		return false;
	}

	/**
	 * @param event
	 */
	protected boolean zOrderLayoutFigure(RcplCommand event) {
		// Object[] data = event.getNewData();
		// JOAction actionType = (JOAction) data[0];
		// IFigure figure = (IFigure) data[1];
		// if (figure instanceof JOFigure) {
		// JOFigure layoutFigure = ((ILayoutFigure) figure);
		// layoutFigure.setZOrder(actionType);
		// return true;
		// }
		return false;
	}

	/**
	 * @param command
	 */
	protected boolean editLayoutFigure(RcplCommand cmd) {
		Object[] data = cmd.getNewData();
		JOAction actionType = (JOAction) data[0];
		// if (cmd.getNewData()[1] instanceof JODrawingFigure) {
		// JODrawingFigure df = (JODrawingFigure) cmd.getNewData()[1];
		// if (df.getDrawing().getSvg() != null) {
		// if (df.getDrawing().getSvg().getFileName() != null) {
		// File file = new File(df.getDrawing().getSvg()
		// .createIndividualFileName());
		// df.getDrawing().getSvg()
		// .setFileName(file.getAbsolutePath());
		// df.getDrawing().getSvg().save(null);
		// try {
		// cmd.setOldData(new Object[] { file.getAbsolutePath(),
		// file.lastModified() });
		// // JOUtil.getEditor().addExternalEditCommand(cmd);
		// JOUtil.startInkscape(file.getAbsolutePath());
		// } catch (Exception e) {
		//						LOGGER.error("", e); //$NON-NLS-1$
		// }
		// return true;
		// }
		// }
		// }

		// stdin = process.getOutputStream ();
		// stderr = process.getErrorStream ();
		// stdout = process.getInputStream ();

		// IFigure figure = (IFigure) data[1];
		//
		// JOEditorFigure ef = null;
		//
		// if (figure instanceof JOPageFigure) {
		// ef = getEditorFigure();
		// } else if (figure instanceof ILayoutFigure) {
		// ef = ((ILayoutFigure) figure).getEditor();
		// }

		// if (ef != null) {
		// Iterator<IToolGroup> it = JO.officePane.getToolRegistry()
		// .groupIterator();
		// while (it.hasNext()) {
		// IToolGroup toolGroup = it.next();
		// String groupKey = toolGroup.getEntry().getKey();
		// String actionGroupKey = actionType.getGroup();
		// if (groupKey.equals(actionGroupKey)) {
		// toolGroup.getToolComponent().setSelected(true, false);
		// ((JOToolComponentButtonFigure) toolGroup.getToolComponent())
		// .doSelect(true);
		// return true;
		// }
		// }
		//
		// }

		return false;
	}
}
