package org.eclipse.rcpl;

public interface IFontProvider {

	IFont loadFont(String fontName, double height, int fontStyle);

	IFont loadFont(IFont font, double height);

	IFont loadFont(IFont font, String fontName);

	IFont loadHalfSizeFont(IFont font);

	String getDefaultFontName(boolean minorFont);

	String getSystemFontName();

	IFont loadSystemFont();

	IFont loadFont(double size);
}
