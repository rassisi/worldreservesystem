/*******************************************************************************
 * Copyright (c) 2003 - 2014 Ramin Assisi and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Ramin Assisi - initial implementation
 *******************************************************************************/
package org.eclipse.rcpl.images;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.eclipse.rcpl.application.DefaultMobileProvider;
import org.eclipse.rcpl.model.IImage;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model.cdo.client.JOSession;
import org.eclipse.rcpl.util.JOUtil2;

import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * @author ramin
 *
 */
public class RcplImage implements IImage {

	private Image image;

	private InputStream is;

	private URL url;

	private URL pngUrl;

	private String id;

	private boolean gray;

	private Node imageNode;

	private double contrast = 0.0;

	private double hue = 0.0;

	private double brightness = 0.0;

	private double saturation = 0.0;

	private double width = 16;

	private double height = 16;

	private boolean svg;

	private ImageView errorImageNode;

	private Image errorImage;

	private String resourcePath;

	// @Override
	// public ImageView getImageView() {
	// if (imageView == null) {
	// imageView = new ImageView(getFx());
	// ColorAdjust colorAdjust = new ColorAdjust();
	// colorAdjust.setContrast(contrast);
	// colorAdjust.setHue(hue);
	// colorAdjust.setBrightness(brightness);
	// colorAdjust.setSaturation(saturation);
	// imageView.setEffect(colorAdjust);
	// }
	// return imageView;
	// }

	private File pngFile;

	private File errorPngFile;

	public RcplImage(InputStream is, String id, double width, double height) {
		this.is = is;
		this.id = id;
		this.width = width;
		this.height = height;
	}

	public RcplImage(String path, double width, double height) {
		this.width = width;
		this.height = height;

		if (path.indexOf("strike") != -1) {
			System.out.println();
		}
		if (path != null) {
			preLoadImage(path);
		}
	}

	private ImageView createBatikImageNode(InputStream is, double width, double height) {
		OutputStream png_ostream;
		try {
			TranscoderInput transIn = new TranscoderInput(is);
			png_ostream = new ByteArrayOutputStream();
			TranscoderOutput output_png_image = new TranscoderOutput(png_ostream);
			PNGTranscoder pngTranscoder = new PNGTranscoder();
			pngTranscoder.addTranscodingHint(PNGTranscoder.KEY_HEIGHT, (float) height);
			pngTranscoder.addTranscodingHint(PNGTranscoder.KEY_WIDTH, (float) width);
			pngTranscoder.addTranscodingHint(PNGTranscoder.KEY_XML_PARSER_VALIDATING, false);
			pngTranscoder.transcode(transIn, output_png_image);
			png_ostream.flush();
			png_ostream.close();
			ByteArrayInputStream isImage = new ByteArrayInputStream(
					((ByteArrayOutputStream) png_ostream).toByteArray());
			image = new Image(isImage);
			isImage.close();
			isImage = new ByteArrayInputStream(((ByteArrayOutputStream) png_ostream).toByteArray());
			FileOutputStream fos = new FileOutputStream(getPngFile());
			byte[] data = new byte[10000];

			do {
				int length = isImage.read(data);
				if (length == -1) {
					break;
				}
				fos.write(data, 0, length);
			} while (true);

			fos.flush();
			fos.close();

			isImage.close();

			return new ImageView(image);
		} catch (Throwable ex) {
			// ignore as all images wrong will be saved under the __ERROR__
			// folder
			System.out.println();
		}
		return null;
	}

	/**
	 * Diese Methode wird aus JOImage aufgerufen, um ein Image aus einem
	 * PackagePart (OOXML) auszulesen.
	 * 
	 * @param is
	 * @param fileName
	 * @param width
	 * @param height
	 * @return
	 */
	public Node createImageNode(InputStream is, double width, double height) {

		if (isSvg()) {
			Node node = createBatikImageNode(is, width, height);
			if (node != null) {
				return node;
			}
			return getErrorImageNode();
		} else {
			try {
				image = new Image(is);
				ImageView iv = new ImageView();
				if (image != null) {
					iv.setImage(image);
					iv.setFitWidth(width);
					iv.setFitHeight(height);
				}
				try {
					is.close();
				} catch (Exception ex) {
					// ignore as all images wrong will be saved under the
					// __ERROR__ folder
				}
				return iv;
			} catch (Exception ex) {
				return null;
			}
		}

	}

	/**
	 * @param svgUrl
	 * @param pngFile
	 * @param width
	 * @param height
	 * @return
	 */
	public Node createImageNode(URL url, double width, double height) {

		ImageView iv = null;

		if (url.toString().endsWith(".svg")) {
			svg = true;
		}

		
		
		System.out.println(pngUrl);
		
		if (getPngFile().exists()) {
			iv = new ImageView(getPngFile().toURI().toString());
		} else if (getErrorPngFile().exists()) {
			iv = getErrorImageNode();
		} else if (getImageFromResource(resourcePath) != null) {
			iv = new ImageView(image);
		} else {
			if (JOSession.getDefault().isReachable()) {
				try {
					InputStream is = url.openStream();
					if (svg) {
						iv = createBatikImageNode(is, width, height);
						if (iv == null) {
							try {
								image = new Image(pngUrl.toString());
							} catch (Throwable ex) {
								writeErrorPngFile();
								return getErrorImageNode();
							}
							if (image.isError()) {
								writeErrorPngFile();
								return getErrorImageNode();
							}
							iv = new ImageView(image);
						}
						is.close();
					} else {
						image = new Image(is);
						iv = new ImageView(image);
						is.close();
					}

				} catch (Exception ex) {
					iv = getErrorImageNode();
					writeErrorPngFile();
				}
			} else {
				iv = getErrorImageNode();
				writeErrorPngFile();
			}
		}
		iv.setFitWidth(width);
		iv.setFitHeight(height);
		return iv;
	}

	// private boolean existsAtUrl(String URLName) {
	// try {
	// HttpURLConnection.setFollowRedirects(false);
	// // HttpURLConnection.setInstanceFollowRedirects(false)
	// HttpURLConnection con = (HttpURLConnection) new
	// URL(URLName).openConnection();
	// con.setRequestMethod("HEAD");
	// return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
	// } catch (Exception e) {
	//
	// try {
	// URL url = new URL(URLName);
	// String host = url.getHost();
	// url = new URL(JOSession.getDefault().codeBase);
	// String host2 = url.getHost();
	// if (host.equals(host2)) {
	// JOSession.getDefault().setReachable(false);
	// }
	// } catch (MalformedURLException e1) {
	// }
	// return false;
	// }
	// }

	@Override
	public Rectangle2D getBounds() {
		return null;
	}

	public double getBrightness() {
		return brightness;
	}

	public double getContrast() {
		return contrast;
	}

	private Image getImageFromResource(String resourcePath) {
		if (resourcePath == null) {
			return null;
		}
		InputStream is = RcplImage.class.getResourceAsStream(resourcePath);
		if (is != null) {
			image = new Image(is);
		}
		try {
			if (is != null) {
				is.close();
			}
		} catch (IOException e) {
			// ignore as all images wrong will be saved under the __ERROR__
			// folder
		}
		return image;

	}

	private Image getErrorImage() {
		if (errorImage == null) {
			errorImage = getImageFromResource("16.0_16.0/error.png");
		}
		return errorImage;
	}

	private ImageView getErrorImageNode() {
		if (errorImageNode == null) {
			errorImageNode = new ImageView(getErrorImage());
			errorImageNode.setFitHeight(16);
			errorImageNode.setFitWidth(16);
		} else {
			errorImageNode = new ImageView();
		}
		try {
			if (is != null) {
				is.close();
			}
		} catch (IOException e) {
		}
		return errorImageNode;

	}

	private File getErrorPngFile() {
		if (errorPngFile == null) {
			errorPngFile = new File(JOUtil2.getUserLocalCacheDir(),
					"images/___ERROR___/" + width + "_" + height + "/" + id + ".png");
		}
		return errorPngFile;

	}

	@Override
	public double getHeight() {
		return height;
	}

	public double getHue() {
		return hue;
	}

	public String getId() {
		return id;
	}

	public InputStream getIs() {
		return is;
	}

	@Override
	public Node getNode() {

		try {
			if (imageNode != null) {
				return imageNode;
			}
			if (is != null) {
				imageNode = createImageNode(is, width, height);
			} else {
				if (url != null) {
					try {
						imageNode = createImageNode(url, width, height);
					} catch (Exception ex) {
						imageNode = getErrorImageNode();
						writeErrorPngFile();
					}
				}
			}
			return imageNode;
		} catch (Throwable ex) {
			imageNode = getErrorImageNode();
			writeErrorPngFile();
			return imageNode;
		}
	}

	@Override
	public Node getCopyNode() {
		getNode();
		if (image != null) {
			ImageView iv = new ImageView(image);
			iv.setFitWidth(width);
			iv.setFitHeight(height);
			return iv;
		}
		ImageView iv = new ImageView(getErrorImage());
		iv.setFitWidth(width);
		iv.setFitHeight(height);
		return iv;
	}

	@Override
	public File getPngFile() {
		if (pngFile == null) {
			pngFile = new File(JOUtil2.getUserLocalCacheDir(), "images/" + width + "_" + height + "/" + id + ".png");
			pngFile.getParentFile().mkdirs();
		}
		return pngFile;

	}

	public double getSaturation() {
		return saturation;
	}

	public URL getUrl() {
		return url;
	}

	@Override
	public double getWidth() {
		return width;
	}

	protected void imageLoaded() {

	}

	@Override
	public boolean isGray() {
		return gray;
	}

	@Override
	public boolean isSvg() {
		return svg;
	}

	/**
	 * 
	 * @param id0
	 *            Format: 1.)
	 *            http://host/imagename[?saturation=x;brightness=x;hue=x;
	 *            contrast=x;] 2.)
	 */
	private void preLoadImage(String id) {

		if (id == null) {
			return;
		}

		if (id.startsWith("http")) {
			try {
				url = new URL(id);

				String idTemp = url.getFile();

				int pos = idTemp.lastIndexOf("/");
				if (pos != -1) {
					idTemp = idTemp.substring(pos + 1, idTemp.length());
				}

				pos = idTemp.lastIndexOf(".");
				if (pos != -1) {
					idTemp = idTemp.substring(0, pos);
				}

				this.id = idTemp;

			} catch (MalformedURLException e) {
			}
			return;
		}

		try {
			url = new URL(JOSession.getDefault().getCodeBase() + "svg/" + id + ".svg");
			pngUrl = new URL(JOSession.getDefault().getCodeBase() + "images/" + getWidth() + "_" + getHeight() + "/"
					+ id + ".png");
			resourcePath = getWidth() + "_" + getHeight() + "/" + id + ".png";
		} catch (Exception ex) {
		}
		this.id = id;

	}

	public void setBrightness(double brightness) {
		this.brightness = brightness;
	}

	public void setContrast(double contrast) {
		this.contrast = contrast;
	}

	@Override
	public void setGray(boolean gray) {
		this.gray = gray;
	}

	@Override
	public void setHeight(double height) {
		try {
			pngUrl = new URL(JOSession.getDefault().getCodeBase() + "images/" + getWidth() + "_" + getHeight() + "/"
					+ id + ".png");
		} catch (MalformedURLException e) {
			// ignore
		}
		this.height = height;
	}

	public void setHue(double hue) {
		this.hue = hue;
	}

	public void setSaturation(double saturation) {
		this.saturation = saturation;
	}

	@Override
	public void setSvg(boolean svg) {
		this.svg = svg;
	}

	@Override
	public void setWidth(double width) {
		try {
			pngUrl = new URL(JOSession.getDefault().getCodeBase() + "images/" + getWidth() + "_" + getHeight() + "/"
					+ id + ".png");
		} catch (MalformedURLException e) {
			// ignore
		}
		this.width = width;
	}

	private void writeErrorPngFile() {
		try {
			getErrorPngFile().getParentFile().mkdirs();
			getErrorPngFile().createNewFile();
		} catch (IOException e) {
		}
	}

	@Override
	public Image getImage() {
		if (image != null) {
			return image;
		}
		return getErrorImage();
	}

	// WebView wv = new WebView();
	// wv.setMinWidth(width);
	// wv.setPrefWidth(width);
	// wv.setMaxWidth(width);
	// wv.setMinHeight(height);
	// wv.setPrefHeight(height);
	// wv.setMaxHeight(height);
	//
	// URL url = new URL(svgUrl);
	// boolean localFile = "file".equals(url.getProtocol());
	// if (!localFile) {
	// if (!JOSession.getDefault().isReachable() ||
	// !existsAtUrl(svgUrl)) {
	// ImageView iv = getErrorImageNode();
	// iv.setFitWidth(width);
	// iv.setFitHeight(height);
	// return iv;
	// }
	// }

	// StringBuffer sb = new StringBuffer();
	//
	// sb.append(
	//
	// "<head>" + "<title></title>"
	//
	// + "<style type=\"text/css\">"
	//
	// + "#myDiv"
	//
	// + "{"
	//
	// + "height:100%;"
	//
	// + "width:100%;"
	//
	// + "}"
	//
	// + "#myDiv img"
	//
	// + "{"
	//
	// + "width:100%; "
	//
	// + "height:100%;"
	//
	// + "margin:auto;"
	//
	// + "display:block;"
	//
	// + "}" + "</style>" + "</head>"
	//
	// + "<div id=\"myDiv\">"
	//
	// + "<img alt=\"Client Logo\" title=\"Client Logo\""
	//
	// + "src=\"" + svgUrl + "\" />"
	//
	// + "</div>"
	//
	// );
	// wv.getEngine().loadContent(sb.toString());
	//
	// try {
	// final com.sun.webkit.WebPage webPage =
	// com.sun.javafx.webkit.Accessor.getPageFor(wv.getEngine());
	// webPage.setBackgroundColor(0);
	// } catch (Throwable ex) {
	// }
	// return wv;

	public static void main(String[] args) {
		RCPLModel.mobileProvider = new DefaultMobileProvider();

		String path = "http://joffice.eu/svg/shape_parallelogram.svg";

		new RcplImage(path, 15, 15).getNode();

	}
}
