package com.joffice.rcpl.plugin.office.internal.config;

import java.math.BigInteger;

import org.eclipse.rcpl.EnMeasurementUnits;
import org.eclipse.rcpl.IMonitor;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.model.RCPLModel;

import com.joffice.rcpl.plugin.office.databinding.types.JOEmu;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuCentimeter;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuInches;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPixel;
import com.joffice.rcpl.plugin.office.databinding.types.JOEmuPoint;

import javafx.scene.text.Text;

/**
 * 
 * 1 point = 8.269 inch = 2,54 cm; 16839 Hoehe A4 = / 20 --> 841.95 points
 * 841.95 x 8.269 = 6962.08455 inch 1140 so viel pixel bei 96 dot per inch 96 x
 * 8.269 = 16839 / 20 = 841.95 points bs = 10 zoll hoch
 * 
 * 47.7 cm = 18.78 inch = 1900 pixel -> 1 pixel = 101.17 pixel / inch 72.27
 * points / inch -> 879.27293 points. -> points2 pixel = 2.1608 --- kann nicht
 * sein
 * 
 * 101 points / inch -> 1167.984 points. -> points2 pixel = 1.6267
 * 
 * 
 * @author ramin
 * 
 */
public class JOConversion {

	private static double transFormFactor = -1;

	private static double point2PixelFactor = -1;

	private static double physicalWidth = -1;

	private static IMonitor actualMonitor;

	public static double getPoint2PixelFactor() {
		IMonitor m = Rcpl.getActualMonitor();

		if (actualMonitor != m) {

			double dpi = m.getDpi();
			//
			// double cmpi = m.getCmpi();
			// double pointInCm = 0.0352778;
			// // double pointInCm = (1.0 / 72.0) / 2.54;
			// double physicalWidth = m.getPhysicalWidthInCm();
			//
			// double dotsW = physicalWidth / pointInCm; // * cmpi;
			//
			// // double numberOfWidthPoints = physicalWidth / pointInCm;
			// double w = m.getPixelWidth();

			// point2PixelFactor = dotsW / w; /// numberOfWidthPoints;

			final Text text = new Text("1234567890abcdefghijklmnopqrstABCDEFGHIJKLMNOPQRSTUVW");
			// new Scene(new Group(text));
			text.applyCss();

			final double width = text.getLayoutBounds().getWidth();
			double widthFac = 438.97705078125 / width;

			RCPLModel.log(m, "widthFac = " + widthFac);
			point2PixelFactor = dpi / 72;

			// double fac2 = dpi / width;

			// double fac3 = width * fac2;

			RCPLModel.FONT_HEIGHT_FACTOR = point2PixelFactor * widthFac;
		}
		actualMonitor = m;
		return point2PixelFactor;
	}

	public class Emu {
		private BigInteger emu;
		private double points = -1;
		private double pixel = -1;

		public Emu(BigInteger emu) {
			this.emu = emu;
			this.points = emu2Points(emu);
		}

		public Emu(double points) {
			this.points = points;
			this.emu = Pt2Emu(points);
			this.pixel = pointsToPixel(points);
		}

		public BigInteger getEmu() {
			return emu;
		}

		public double getPoints() {
			return points;
		}

		public double getPixel() {
			return pixel;
		}

	}

	public static double pointsToPixel(double points) {
		return pointsToPixelDouble(points);
	}

	public static double pointsToPixelDouble(double points) {
		return points * getPoint2PixelFactor();
	}

	public static double pixelToPoints(double pixel) {
		return pixel / getPoint2PixelFactor();
	}

	public static double pointsAndInchesToPixel(String pointsAndInches) {
		if (pointsAndInches.endsWith("pt")) { //$NON-NLS-1$
			pointsAndInches = pointsAndInches.substring(0, pointsAndInches.length() - 2);
			return pointsToPixel(Double.valueOf(pointsAndInches));
		} else if (pointsAndInches.endsWith("in")) { //$NON-NLS-1$
			pointsAndInches = pointsAndInches.substring(0, pointsAndInches.length() - 2);
			return emu2Pixel(inch2Emu(Double.valueOf(pointsAndInches)));
		}
		return 0;
	}

	public static String pixelToPointString(double pixel) {
		return pixel / getPoint2PixelFactor() + "pt"; //$NON-NLS-1$
	}

	/**
	 * @param pointsAndInches
	 * @return
	 */
	public static BigInteger pointsAndInchesAndValuesToEmu(String pointsAndInches) {

		String s = pointsAndInches.replaceAll("width:", "").replaceAll("height:", "");

		try {
			if (s.startsWith("val ")) { //$NON-NLS-1$
				s = s.substring(4, s.length());
				return BigInteger.valueOf(Long.valueOf(s));

			}
			if (s.endsWith("pt")) { //$NON-NLS-1$
				s = s.substring(0, s.length() - 2);
				return Pt2Emu(Double.valueOf(s));
			} else if (s.endsWith("in")) { //$NON-NLS-1$
				s = s.substring(0, s.length() - 2);
				return inch2Emu(Double.valueOf(s));
			}
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
		return null;
	}

	public static double inchToCentimeter(double inch) {
		return inch * 2.54;
	}

	/**
	 * @param inch
	 * @return
	 */
	public static BigInteger inch2Emu(double inch) {
		return BigInteger.valueOf((long) (inch * 914400));
	}

	public static double emu2Inch(double emu) {
		return emu / 914400;
	}

	public static double getTransFormFactor() {
		if (transFormFactor == -1) {
			transFormFactor = 1.0 / pointsToPixelDouble(1.0 / 20.0);
		}
		return transFormFactor;
	}

	public static void setTransFormFactor(double transFormFactor) {
		JOConversion.transFormFactor = transFormFactor;
	}

	public static void setEuropean() {

	}

	public static double emu2Points(BigInteger emu) {
		return emu.doubleValue() / 12700.0;
	}

	public static double emu2Points(long emu) {
		return emu / 12700.0;
	}

	public static double emu2Points(double emu) {
		return emu / 12700.0;
	}

	public static BigInteger Pt2Emu(double points) {
		return BigInteger.valueOf((long) (points * 12700.0));
	}

	public static double emu2Pixel(BigInteger emu) {
		return pointsToPixel(emu2Points(emu));
	}

	public static double emu2Pixel(long emu) {
		return pointsToPixel(emu2Points(emu));
	}

	public static double emu2Pixel(double emu) {
		return pointsToPixel(emu2Points(emu));
	}

	public static double emu2Centimeter(double emu) {
		return emu / 360000.0;
	}

	public static double emu2Millimeter(double emu) {
		return emu / 36000.0;
	}

	public static double millimeterToEmu(double millimeter) {
		return millimeter * 36000.0;
	}

	public static double millimeterToPixel(double millimeter) {
		return emu2Pixel(millimeterToEmu(millimeter));
	}

	public static double ptToEmu() {
		return millimeterToEmu(127.0 * 36000.0);
	}

	public static double pixelToEmu(double pixel) {
		return Pt2Emu(pixelToPoints(pixel)).doubleValue();
	}

	/**
	 * @param from
	 * @param to
	 * @param value
	 * @return
	 */
	public static double unit2Unit(EnMeasurementUnits from, EnMeasurementUnits to, double value) {
		JOEmu fromEmu = null;
		switch (from) {
		case CM:
			fromEmu = new JOEmuCentimeter(value);
			break;
		case MILLIMETER:
			fromEmu = new JOEmuCentimeter(value / 10);
			break;
		case PICAS:
			fromEmu = new JOEmuPixel(value);
			break;
		case INCHES:
			fromEmu = new JOEmuInches(value);
			break;
		case PIXEL:
			fromEmu = new JOEmuPixel(value);
			break;
		case POINTS:
			fromEmu = new JOEmuPoint(value);
			break;
		}

		if (fromEmu != null) {
			switch (to) {
			case CM:
				return fromEmu.toCm();
			case MILLIMETER:
				return fromEmu.toCm() * 10;
			case PICAS:
				return fromEmu.toPixel();
			case INCHES:
				return fromEmu.toInch();
			case PIXEL:
				return fromEmu.toPixel();
			case POINTS:
				return fromEmu.toPoints();
			}
		}
		return value;

	}
}
