package org.eclipse.rcpl;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.openxml4j.opc.PackagePart;

public interface ISVG {

	void setPackagePart(PackagePart packagePart);

	void save(OutputStream mos);

	File getFile();

	void setFileName(String fName);

	void setRotation(double rotation);

	void load(InputStream is);

	void flipX();

	void flipY();

	File getImageFile();

	String getFileName();

	void setStrokeColor(IColor color);

	void setFillColor(IColor color);

	void setBorderWidth(double width);

	public String createIndividualFileName();

}
