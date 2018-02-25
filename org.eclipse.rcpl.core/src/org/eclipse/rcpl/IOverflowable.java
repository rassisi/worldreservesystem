package org.eclipse.rcpl;

/**
 * Root paragraphs & Tables can overflow (devided) into next column or page
 * 
 * @author ramin
 *
 */
public interface IOverflowable {

	double getOverflowExcess();

	double getRemaining();

	void setOverflowExcess(double excess, double remaining);

}
