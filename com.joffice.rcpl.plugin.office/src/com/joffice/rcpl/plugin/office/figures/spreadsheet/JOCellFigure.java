package com.joffice.rcpl.plugin.office.figures.spreadsheet;

import org.eclipse.rcpl.ILayoutFigure;
import org.eclipse.rcpl.ILayoutObject;

import com.joffice.rcpl.plugin.office.fx.figures.JOFXAbstractFigure;

public class JOCellFigure extends JOFXAbstractFigure implements ILayoutFigure {

	public JOCellFigure(ILayoutObject layoutObject) {
		super(layoutObject);
	}

	@Override
	public void showOutline(boolean show) {
		// super.showOutline(show);
	}
}
