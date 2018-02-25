package org.eclipse.rcpl;

/**
 * @author ramin
 *
 */
public interface ITable extends ILayoutObject {

	ITableCell[][] getCells();

	@Override
	ITableFigure getLayoutFigure();

	IStyle getTableStyle();

}
