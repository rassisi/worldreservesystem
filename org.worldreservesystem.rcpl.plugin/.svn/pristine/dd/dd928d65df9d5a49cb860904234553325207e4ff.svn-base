package com.joffice.rcpl.plugin.office.internal;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.openxml4j.opc.ContentTypes;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipTypes;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.openxml4j.opc.internal.MemoryPackagePartOutputStream;
import org.apache.xmlbeans.XmlObject;
import org.eclipse.rcpl.IDocument;
import org.eclipse.rcpl.IPart;
import org.eclipse.rcpl.IResource;
import org.eclipse.rcpl.Rcpl;
import org.eclipse.rcpl.SVGImage;
import org.eclipse.rcpl.images.RcplImage;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.util.JOUtil2;

import javafx.geometry.Rectangle2D;

public abstract class JOAbstractPart implements IPart {

	// private final static Logger LOGGER = LoggerFactory
	// .getLogger(JOAbstractPart.class);

	protected IDocument document;

	protected XmlObject xmlDocument;

	protected PackagePart packagePart;

	protected Hashtable<String, String> relationsRegistry = new Hashtable<String, String>();

	private Hashtable<String, IImage> imageRegistry = new Hashtable<String, IImage>();

	private Hashtable<String, String> pathToId = new Hashtable<String, String>();

	private boolean dirty;

	public class ImageItem {
		public int index;
		public IResource image;
		public String fileName;
		public String id;

		public ImageItem(String fileName, IResource image, int index) {
			this.index = index;
			this.image = image;
			this.fileName = fileName;
		}
	}

	/**
	 * @param doc
	 * @param packagePart
	 */
	public JOAbstractPart(IDocument document, PackagePart packagePart, Object poiObject1, Object parent) {
		this.packagePart = packagePart;
		this.document = document;
		document.setPart(this);

		init(poiObject1, parent);
		createDocument();
		// processImageParts();
		updateFromXml();

	}

	// protected void processImageParts() {
	// try {
	// saveImagePart(getPackagePart());
	// Collections.sort(getImages(), new Comparator<ImageItem>() {
	// @Override
	// public int compare(ImageItem o1, ImageItem o2) {
	// return o1.index - o2.index;
	// }
	// });
	//
	// } catch (Exception e) {
	// LOGGER.error("", e); //$NON-NLS-1$
	// }
	// }

	protected void init(Object poiObject, Object parent) {

	}

	@Override
	public PackagePart getPackagePart() {
		return packagePart;
	}

	@Override
	public String getId() {
		return packagePart.getPartName().getName();
	}

	@Override
	public boolean isDirty() {
		return dirty;
	}

	@Override
	public Hashtable<String, String> getRelationsRegistry() {
		return relationsRegistry;
	}

	protected abstract void createDocument();

	protected abstract void updateFromXml();

	/**
	 * @param registry
	 * @param id
	 * @return
	 */
	@Override
	public IImage getImageByRelationId(String id) {
		Rcpl.profile("JOAbstractPart"); //$NON-NLS-1$
		IImage resource = imageRegistry.get(id);
		if (resource == null) {

			try {
				PackageRelationship rel = packagePart.getRelationship(id);
				if (rel == null) {
					return null;
				}
				PackagePart imagePart = JOUtil2.getTargetPart(getPackagePart().getPackage(), rel);
				if (imagePart.getContentType().equals(Rcpl.CONTENT_TYPE_IMAGE_SVG)) {
					resource = new SVGImage(imagePart.getInputStream(), id, 16, 16);
				} else {
					resource = new RcplImage(imagePart.getInputStream(), id, 16, 16);
				}
				if (resource != null) {
					imageRegistry.put(id, resource);
				}
			} catch (Exception ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
			}
		}
		Rcpl.profileEnd();
		return resource;
	}

	/**
	 * @param part
	 * @return
	 */
	private String getSimplePartName(PackagePart part) {
		String s = part.getPartName().getName();

		int pos = s.lastIndexOf("/"); //$NON-NLS-1$
		if (pos != -1) {
			s = s.substring(pos + 1, s.length());
		}

		// .replaceAll("/", "_"); //$NON-NLS-1$ //$NON-NLS-2$
		//
		//
		// int pos = s.lastIndexOf("/");
		// if(pos!=-1){
		// return s.substring(pos+1,s.length());
		// }
		return s;
	}

	/**
	 * @param relationId
	 */
	@Override
	public void removeRelationPart(String relationId) {
		getDocument().getPart().getPackagePart().removeRelationship(relationId);
		imageRegistry.remove(relationId);
	}

	/**
	 * @param id
	 * @return
	 */
	@Override
	public PackagePart getPackagePartByRelationId(String id) {
		try {
			PackageRelationship rel = packagePart.getRelationship(id);
			if (rel == null) {
				return null;
			}
			return JOUtil2.getTargetPart(getPackagePart().getPackage(), rel);
		} catch (Exception ex) {
			// LOGGER.error("", ex); //$NON-NLS-1$
		}
		return null;
	}

	/**
	 * @param path
	 * @return
	 */
	public PackagePartName getImagePartName(String path) {
		File imageFile = new File(path);
		if ("".equals(path)) //$NON-NLS-1$
			throw new IllegalArgumentException("path"); //$NON-NLS-1$
		String filename = path.substring(path.lastIndexOf(File.separatorChar) + 1);

		PackagePartName thumbnailPartName = null;
		try {
			String imageName = imageFile.getName().replaceAll(" ", "_"); //$NON-NLS-1$//$NON-NLS-2$
			thumbnailPartName = PackagingURIHelper.createPartName("/" + getPrefix() + "/media/" + imageName); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (InvalidFormatException e) {
			try {
				thumbnailPartName = PackagingURIHelper.createPartName("/" + getPrefix() + "/media/image" //$NON-NLS-1$ //$NON-NLS-2$
						+ path.substring(path.lastIndexOf(".") + 1)); //$NON-NLS-1$
			} catch (InvalidFormatException e2) {
				throw new InvalidOperationException("Can't add a thumbnail file named '" + filename + "'"); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}

		return thumbnailPartName;

	}

	/**
	 * @param path
	 * @param imageName
	 * @throws IOException
	 */
	@Override
	public String addImage(InputStream is, String fileName, Rectangle2D imageBounds) throws IOException {
		try {
			PackagePartName thumbnailPartName = getImagePartName(fileName);
			PackagePart imagePart = null;
			String contentType = ContentTypes.getContentTypeFromFileExtension(fileName);
			if (contentType == null) {
				contentType = Rcpl.CONTENT_TYPE_IMAGE_SVG;
			}
			if (packagePart.getPackage().getPart(thumbnailPartName) != null) {
				imagePart = packagePart.getPackage().getPart(thumbnailPartName);
			} else {
				imagePart = packagePart.getPackage().createPart(thumbnailPartName, contentType);
			}
			MemoryPackagePartOutputStream os = (MemoryPackagePartOutputStream) imagePart.getOutputStream();
			byte[] bytes = JOUtil2.copyStreamTyByteArray(is);
			os.write(bytes);
			os.flush();
			os.close();
			PackagePart documentPart = packagePart.getPackage()
					.getPart(PackagingURIHelper.createPartName("/" + getPrefix() //$NON-NLS-1$
							+ "/document.xml")); //$NON-NLS-1$
			PackageRelationship rel = documentPart.addRelationship(thumbnailPartName, TargetMode.INTERNAL,
					PackageRelationshipTypes.IMAGE_PART);

			String id = rel.getId();
			imagePart.flush();
			// !!!
			// pathToId.put(path, id);
			return id;
		} catch (InvalidFormatException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}

		return null;

	}

	public String getPrefix() {
		String name = getPackagePart().getPartName().getName();
		if (name.equals("/word/document.xml")) { //$NON-NLS-1$
			return "word"; //$NON-NLS-1$
		}
		if (name.equals("/ppt/presentation.xml")) { //$NON-NLS-1$
			return "ppt"; //$NON-NLS-1$
		}
		if (name.equals("/xl/workbook.xml")) { //$NON-NLS-1$
			return "xl"; //$NON-NLS-1$
		}
		if (name.equals("document")) { //$NON-NLS-1$
			return "word"; //$NON-NLS-1$
		}
		return ""; //$NON-NLS-1$
	}

	@Override
	public void dispose() {
		// for (ImageItem imageItem : images) {
		// if (imageItem.image.getImage() != null
		// && !imageItem.image.getImage().isDisposed()) {
		// JOUtil.disposeResource(imageItem.image.getImage());
		// }
		// }
	}

	/**
	 * @param partName
	 * @param imageBytes
	 */
	protected void savePartToFile(String partName, byte[] imageBytes) {
		if (imageBytes != null) {
			File f = new File(JOUtil2.getUserLocalTempArea() + partName);
			f.getParentFile().mkdirs();
			FileOutputStream fo;
			try {
				fo = new FileOutputStream(f);
				fo.write(imageBytes);
				fo.flush();
				fo.close();
			} catch (FileNotFoundException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			} catch (IOException e) {
				// LOGGER.error("", e); //$NON-NLS-1$
			}
		}
	}

	/**
	 * @param part
	 * @return
	 */
	protected byte[] getPartBytes(PackagePart part) {
		InputStream is;
		try {
			is = part.getInputStream();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			final int BUF_SIZE = 1 << 8; // 1KiB buffer
			byte[] buffer = new byte[BUF_SIZE];
			int bytesRead = -1;
			while ((bytesRead = is.read(buffer)) > -1) {
				out.write(buffer, 0, bytesRead);
			}
			is.close();
			byte[] partBytes = out.toByteArray();
			out.close();
			return partBytes;
		} catch (IOException e) {
			// LOGGER.error("", e); //$NON-NLS-1$
		}
		return null;
	}

	public IDocument getDocument() {
		return document;
	}

	/**
	 * @param path
	 * @return
	 */
	@Override
	public String getIdFromPath(String path) {
		return pathToId.get(path);
	}

	// public ImageItem findImageById(String id) {
	// for (ImageItem imageItem : images) {
	// if (id.equals(imageItem.id)) {
	// return imageItem;
	// }
	// }
	// return null;
	// }

	// public JOResource findImageResourceById(String id) {
	// ImageItem result = findImageById(id);
	// if (result != null) {
	// return result.image;
	// }
	// return null;
	// }

}
