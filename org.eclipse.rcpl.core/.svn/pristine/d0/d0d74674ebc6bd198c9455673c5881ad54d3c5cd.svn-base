package org.eclipse.rcpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

import javafx.geometry.Rectangle2D;

import org.apache.poi.openxml4j.opc.PackagePart;

/**
 * @author ramin
 * 
 */
public interface IPart extends IPartable {

	public PackagePart getPackagePart();

	public String getId();

	public boolean isDirty();

	public PackagePart getPackagePartByRelationId(String id);

	public Hashtable<String, String> getRelationsRegistry();

	public String addImage(InputStream is, String fileName,
			Rectangle2D imageBounds) throws IOException;

	public void dispose();

	public String getIdFromPath(String path);

	public void removeRelationPart(String relationId);

}
