package org.eclipse.rcpl;

import javafx.scene.paint.Color;

public interface IColor {

	public static Color SELECTION_COLOR = Color.rgb(168, 205, 241);

	public final static IColor BLACK = new RcplColor(Color.BLACK);
	public final static IColor WHITE = new RcplColor(Color.WHITE);
	public final static IColor RED = new RcplColor(Color.RED);
	public final static IColor BLUE = new RcplColor(Color.BLUE);
	public final static IColor YELLOW = new RcplColor(Color.YELLOW);
	public final static IColor CYAN = new RcplColor(Color.CYAN);
	public final static IColor GREEN = new RcplColor(Color.GREEN);
	public final static IColor DARK_BLUE = new RcplColor(Color.DARKBLUE);
	public final static IColor GRAY = new RcplColor(Color.GRAY);
	public final static IColor ORANGE = new RcplColor(Color.ORANGE);
	public final static IColor LIGHT_GRAY = new RcplColor(Color.LIGHTGREY);

	double getRed();

	double getGreen();

	double getBlue();

	double getOpacity();

	Color getFx();

	IColor copy();

}
