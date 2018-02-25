package org.eclipse.rcpl;

/**
 * @author ramin
 *
 */
public enum EnMeasurementUnits {

	INCHES, CM, MILLIMETER, POINTS, PICAS, PIXEL,

	;

	public static EnMeasurementUnits valueOf(int index) {
		switch (index) {
		case 0:
			return INCHES;
		case 1:
			return CM;
		case 2:
			return MILLIMETER;
		case 3:
			return POINTS;
		case 4:
			return PICAS;
		case 5:
			return PIXEL;
		}
		return null;
	}
	// public JODefaultMeasurementUnits(){
	//
	// }
}
