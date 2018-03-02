package org.worldreservesystem.rcpl.plugin.internal.figures;

import org.eclipse.rcpl.IEditor;

public class JOBetweenPagesFigure {

	// private static final Logger LOGGER = LoggerFactory
	// .getLogger(JOBetweenPagesFigure.class);

	// private Cursor cursor;

	@SuppressWarnings("unused")
	private IEditor editorFigure;

	/**
	 * Only for sub class checking
	 */
	public JOBetweenPagesFigure() {
	}

	public JOBetweenPagesFigure(IEditor editorFigure) {
		this.editorFigure = editorFigure;
		// setOpaque(false);
		// addMouseListener(this);
		// addMouseMotionListener(this);
	}

	// private Cursor loadCursor() {
	//
	// Image image = JOResources.getImage("page_dist"); //$NON-NLS-1$
	// if (cursor == null) {
	// cursor = new Cursor(editorFigure.getCanvas()
	// .getDisplay(), image.getImageData(), 0, 0);
	// }
	// return cursor;
	// }

	// @Override
	// public void mousePressed(MouseEvent me) {
	// try {

	// JO.service.getPageService().changePageDistance(0);
	// } catch (Exception ex) {
	// LOGGER.error("in OOXMLBetweenFigures", ex); //$NON-NLS-1$
	// }
	//
	// }
	//
	// @Override
	// public void mouseReleased(MouseEvent me) {
	// if (JOUiConfig.pageDistance > 0) {
	// }
	// }

}
