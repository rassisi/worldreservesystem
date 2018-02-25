/******************************************************************************
 *
 * Copyright (c) 2009 Ramin Assisi
 * All rights reserved.
 *
 ****************************************************************************/

package com.joffice.rcpl.plugin.office.fx.figures;

import org.eclipse.rcpl.IEditor;
import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;

import com.joffice.rcpl.plugin.office.internal.figures.JOPageFigure;
import com.joffice.rcpl.plugin.office.internal.model.word.JOAbstractHeaderAndFooter;
import com.joffice.rcpl.plugin.office.internal.model.word.JOSection;

/**
 * @author ramin
 * 
 */
public abstract class JOFXAbstractHeaderAndFooterFigure extends JOFXAbstractFigure {

	@SuppressWarnings("unused")
	private JOSection section;

	private boolean editable = false;

	public JOFXAbstractHeaderAndFooterFigure(IEditor editorFigure, JOPageFigure pageFigure, JOSection section,
			JOAbstractHeaderAndFooter headerAndFooter) {
		super(section);
		this.section = section;

		setStyle("-fx-background-color: green;");
		for (ILayoutObject l : headerAndFooter.getLayoutObjects()) {
			ILayoutFigure layoutFigure = l.getLayoutFigure();
			add(layoutFigure);
		}

	}

	@Override
	public void refresh() {
		// JORectangle bounds = getBounds();
		// JORectangle r = new JORectangle(bounds);
		// int numberOfObjects = headerAndFooter.getLayoutObjects().size();
		// if (numberOfObjects > 0) {
		// int h = r.height / numberOfObjects;
		// int x1 = r.x;
		// int y1 = r.y;
		// for (OOXMLLayoutObject layoutObject : headerAndFooter
		// .getLayoutObjects()) {
		// OOXMLLayoutFigure layoutFigure = layoutObject.getLayoutFigure();
		// layoutFigure.setBounds(new JORectangle(x1, y1, r.width, h));
		// y1 += h;
		// }
		// }

	}

	public void setPageFigure(JOPageFigure pageFigure) {
		// this.pageFigure = pageFigure;

		// int h = 0;
		// for (OOXMLLayoutObject layoutObject : headerAndFooter
		// .getLayoutObjects()) {
		// if(layoutObject instanceof OOXMLParagraph){
		// OOXMLParagraph p = (OOXMLParagraph)layoutObject;
		// p.setWidth(pageFigure.getSize().width);
		// p.updateHeight();
		// h+=p.getSize().y;
		// h+=10;
		// }
		// }
		// headerAndFooter.getSize().y = h;
		// setSize(getSize().width, h);

	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

}
