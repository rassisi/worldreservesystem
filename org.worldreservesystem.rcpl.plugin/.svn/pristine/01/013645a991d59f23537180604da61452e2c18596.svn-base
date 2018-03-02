package com.joffice.rcpl.plugin.office.databinding.types;

import java.math.BigInteger;

import org.eclipse.rcpl.IColor;
import org.eclipse.rcpl.Rcpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties;

/**
 * @author ramin
 * 
 */
public class JOCharacterProperties {

	public boolean bold;
	public boolean italic;
	public boolean underline;
	private JOEmu size;
	public IColor fgColor;

	@SuppressWarnings("unused")
	private CTColorMapping ctColorMapping;

	public JOCharacterProperties(
			CTTextCharacterProperties ctCharacterproperties,
			CTColorMapping ctColorMapping) {

		bold = ctCharacterproperties.getB();
		italic = ctCharacterproperties.getI();
		// cProps.underline = props.getU();

		this.ctColorMapping = ctColorMapping;

		ctCharacterproperties.getCs();

		if (ctCharacterproperties.getSz() > 0) {
			int siz = ctCharacterproperties.getSz();
			setSize(new JOEmu100ThPoint(BigInteger.valueOf(siz)));
		}

		CTSolidColorFillProperties ctSolidColorFillProperties = ctCharacterproperties
				.getSolidFill();

		if (ctSolidColorFillProperties != null) {
			fgColor = Rcpl.colorProvider().get(ctColorMapping,
					ctSolidColorFillProperties);
		}
		CTEffectList ctEffectList = ctCharacterproperties.getEffectLst();

	}

	public void setSize(JOEmu size) {
		this.size = size;
	}

	public int getFontSize() {
		if (size != null) {
			return (int) size.toPoints();
		}
		return 0;
	}

}
