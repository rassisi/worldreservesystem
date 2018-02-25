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

		if (getPngFile().exists()) {
			iv = new ImageView(getPngFile().toURI().toString());
		} else if (getErrorPngFile().exists()) {
			iv = getErrorImageNode();
		} else if (getImageFromResource(resourcePath) != null) {
			iv = new ImageView(image);
		} else {
			if (JOSession.getDefault().isReachable()) {
				try {
					
					
					
//					TrustManager[] trustAllCerts = new TrustManager[]{
//						    new X509TrustManager() {
//						        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
//						            return null;
//						        }
//						        public void checkClientTrusted(
//						            java.security.cert.X509Certificate[] certs, String authType) {
//						        }
//						        public void checkServerTrusted(
//						            java.security.cert.X509Certificate[] certs, String authType) {
//						        }
//						    }
//						};
//
//						// Activate the new trust manager
//						try {
//						    SSLContext sc = SSLContext.getInstance("SSL");
//						    sc.init(null, trustAllCerts, new java.security.SecureRandom());
//						    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
//						} catch (Exception e) {
//						}
//					
//					URLConnection connection = url.openConnection();
//					
//					InputStream is = connection.getInputStream();
//					
//					
//					ByteArrayOutputStream baos = new ByteArrayOutputStream();
//					try {
//					  byte[] byteChunk = new byte[4096]; // Or whatever size you want to read in at a time.
//					  int n;
//
//					  while ( (n = is.read(byteChunk)) > 0 ) {
//					    baos.write(byteChunk, 0, n);
//					  }
//					}
//					catch (IOException e) {
//					  System.err.printf ("Failed while reading bytes from %s: %s", url.toExternalForm(), e.getMessage());
//					  e.printStackTrace ();
//					  // Perform any other exception handling that's appropriate.
//					}
//					finally {
//					  if (is != null) { is.close(); }
//					}
//					
//					
//					
//					//data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9Im5vIj8+CjwhLS0gQ3JlYXRlZCB3aXRoIElua3NjYXBlIChodHRwOi8vd3d3Lmlua3NjYXBlLm9yZy8pIC0tPgoKPHN2ZwogICB4bWxuczpkYz0iaHR0cDovL3B1cmwub3JnL2RjL2VsZW1lbnRzLzEuMS8iCiAgIHhtbG5zOmNjPSJodHRwOi8vY3JlYXRpdmVjb21tb25zLm9yZy9ucyMiCiAgIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyIKICAgeG1sbnM6c3ZnPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIKICAgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIgogICB4bWxuczp4bGluaz0iaHR0cDovL3d3dy53My5vcmcvMTk5OS94bGluayIKICAgeG1sbnM6c29kaXBvZGk9Imh0dHA6Ly9zb2RpcG9kaS5zb3VyY2Vmb3JnZS5uZXQvRFREL3NvZGlwb2RpLTAuZHRkIgogICB4bWxuczppbmtzY2FwZT0iaHR0cDovL3d3dy5pbmtzY2FwZS5vcmcvbmFtZXNwYWNlcy9pbmtzY2FwZSIKICAgaWQ9InN2ZzM5ODIiCiAgIHNvZGlwb2RpOmRvY25hbWU9IndvcmQuc3ZnIgogICB2aWV3Qm94PSIwIDAgNjE5LjU4IDc3NS41MSIKICAgdmVyc2lvbj0iMS4xIgogICBpbmtzY2FwZTp2ZXJzaW9uPSIwLjQ4LjUgcjEwMDQwIgogICB3aWR0aD0iMTAwJSIKICAgaGVpZ2h0PSIxMDAlIj4KICA8dGl0bGUKICAgICBpZD0idGl0bGU0MDU5Ij5Xb3JkIERvY3VtZW50IGljb248L3RpdGxlPgogIDxkZWZzCiAgICAgaWQ9ImRlZnMzOTg0Ij4KICAgIDxmaWx0ZXIKICAgICAgIGlkPSJmaWx0ZXI5NjAyLTEiCiAgICAgICBjb2xvci1pbnRlcnBvbGF0aW9uLWZpbHRlcnM9InNSR0IiCiAgICAgICBpbmtzY2FwZTpjb2xsZWN0PSJhbHdheXMiPgogICAgICA8ZmVHYXVzc2lhbkJsdXIKICAgICAgICAgaWQ9ImZlR2F1c3NpYW5CbHVyOTYwNC03IgogICAgICAgICBzdGREZXZpYXRpb249IjIuMzc3MDg5NCIKICAgICAgICAgaW5rc2NhcGU6Y29sbGVjdD0iYWx3YXlzIiAvPgogICAgPC9maWx0ZXI+CiAgICA8cmFkaWFsR3JhZGllbnQKICAgICAgIGlkPSJyYWRpYWxHcmFkaWVudDY2ODciCiAgICAgICBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIKICAgICAgIGN5PSIxMDI5IgogICAgICAgY3g9IjE3MjMuOCIKICAgICAgIGdyYWRpZW50VHJhbnNmb3JtPSJtYXRyaXgoLjAxMTE5NCAuOTkzODAgLTEuNDM2NyAuMDE2MTg0IDMxMjUuMyAtOTA1LjU5KSIKICAgICAgIHI9IjYyLjUiCiAgICAgICBpbmtzY2FwZTpjb2xsZWN0PSJhbHdheXMiPgogICAgICA8c3RvcAogICAgICAgICBpZD0ic3RvcDk1NTItMCIKICAgICAgICAgc3R5bGU9InN0b3AtY29sb3I6I2ZmZmZmZiIKICAgICAgICAgb2Zmc2V0PSIwIiAvPgogICAgICA8c3RvcAogICAgICAgICBpZD0ic3RvcDk1NTgtOSIKICAgICAgICAgc3R5bGU9InN0b3AtY29sb3I6I2ZmZmZmZiIKICAgICAgICAgb2Zmc2V0PSIuNSIgLz4KICAgICAgPHN0b3AKICAgICAgICAgaWQ9InN0b3A5NTU0LTQiCiAgICAgICAgIHN0eWxlPSJzdG9wLWNvbG9yOiM0ZDRkNGQiCiAgICAgICAgIG9mZnNldD0iMSIgLz4KICAgIDwvcmFkaWFsR3JhZGllbnQ+CiAgICA8ZmlsdGVyCiAgICAgICBpZD0iZmlsdGVyOTU3MC04IgogICAgICAgY29sb3ItaW50ZXJwb2xhdGlvbi1maWx0ZXJzPSJzUkdCIgogICAgICAgaW5rc2NhcGU6Y29sbGVjdD0iYWx3YXlzIj4KICAgICAgPGZlR2F1c3NpYW5CbHVyCiAgICAgICAgIGlkPSJmZUdhdXNzaWFuQmx1cjk1NzItOCIKICAgICAgICAgc3RkRGV2aWF0aW9uPSIwLjMwMTMzODQ1IgogICAgICAgICBpbmtzY2FwZTpjb2xsZWN0PSJhbHdheXMiIC8+CiAgICA8L2ZpbHRlcj4KICAgIDxsaW5lYXJHcmFkaWVudAogICAgICAgaWQ9ImxpbmVhckdyYWRpZW50NjY4OSIKICAgICAgIHkyPSI5NTIuNDQiCiAgICAgICBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIKICAgICAgIHgyPSIxNzgzLjYiCiAgICAgICBncmFkaWVudFRyYW5zZm9ybT0ibWF0cml4KC40NjAzNSAuMDA0OTAxNiAtLjAwNDkwMTYgLjQ2MDM1IDg3Ny42NSAzNDEuMykiCiAgICAgICB5MT0iOTY3LjUxIgogICAgICAgeDE9IjE3NTkuMSIKICAgICAgIGlua3NjYXBlOmNvbGxlY3Q9ImFsd2F5cyI+CiAgICAgIDxzdG9wCiAgICAgICAgIGlkPSJzdG9wOTU3Ni00IgogICAgICAgICBzdHlsZT0ic3RvcC1jb2xvcjojZjJmMmYyIgogICAgICAgICBvZmZzZXQ9IjAiIC8+CiAgICAgIDxzdG9wCiAgICAgICAgIGlkPSJzdG9wOTU3OC01IgogICAgICAgICBzdHlsZT0ic3RvcC1jb2xvcjojODA4MDgwIgogICAgICAgICBvZmZzZXQ9IjEiIC8+CiAgICA8L2xpbmVhckdyYWRpZW50PgogICAgPHJhZGlhbEdyYWRpZW50CiAgICAgICBpbmtzY2FwZTpjb2xsZWN0PSJhbHdheXMiCiAgICAgICB4bGluazpocmVmPSIjcmFkaWFsR3JhZGllbnQ2Njg3IgogICAgICAgaWQ9InJhZGlhbEdyYWRpZW50MzAxMyIKICAgICAgIGdyYWRpZW50VW5pdHM9InVzZXJTcGFjZU9uVXNlIgogICAgICAgZ3JhZGllbnRUcmFuc2Zvcm09Im1hdHJpeCgwLjAxMTE5NCwwLjk5MzgsLTEuNDM2NywwLjAxNjE4NCwzMTI1LjMsLTkwNS41OSkiCiAgICAgICBjeD0iMTcyMy44IgogICAgICAgY3k9IjEwMjkiCiAgICAgICByPSI2Mi41IiAvPgogICAgPGxpbmVhckdyYWRpZW50CiAgICAgICBpbmtzY2FwZTpjb2xsZWN0PSJhbHdheXMiCiAgICAgICB4bGluazpocmVmPSIjbGluZWFyR3JhZGllbnQ2Njg5IgogICAgICAgaWQ9ImxpbmVhckdyYWRpZW50MzAxNSIKICAgICAgIGdyYWRpZW50VW5pdHM9InVzZXJTcGFjZU9uVXNlIgogICAgICAgZ3JhZGllbnRUcmFuc2Zvcm09Im1hdHJpeCgwLjQ2MDM1LDAuMDA0OTAxNiwtMC4wMDQ5MDE2LDAuNDYwMzUsODc3LjY1LDM0MS4zKSIKICAgICAgIHgxPSIxNzU5LjEiCiAgICAgICB5MT0iOTY3LjUxIgogICAgICAgeDI9IjE3ODMuNiIKICAgICAgIHkyPSI5NTIuNDQiIC8+CiAgPC9kZWZzPgogIDxzb2RpcG9kaTpuYW1lZHZpZXcKICAgICBpZD0iYmFzZSIKICAgICBib3JkZXJjb2xvcj0iIzY2NjY2NiIKICAgICBpbmtzY2FwZTpwYWdlc2hhZG93PSIyIgogICAgIGlua3NjYXBlOndpbmRvdy15PSItOSIKICAgICBwYWdlY29sb3I9IiNmZmZmZmYiCiAgICAgaW5rc2NhcGU6d2luZG93LWhlaWdodD0iMTA1MSIKICAgICBpbmtzY2FwZTp3aW5kb3ctbWF4aW1pemVkPSIxIgogICAgIGlua3NjYXBlOnpvb209IjAuMzQ3OTQ5MjIiCiAgICAgaW5rc2NhcGU6d2luZG93LXg9IjMxNSIKICAgICBzaG93Z3JpZD0iZmFsc2UiCiAgICAgYm9yZGVyb3BhY2l0eT0iMS4wIgogICAgIGlua3NjYXBlOmN1cnJlbnQtbGF5ZXI9ImxheWVyMSIKICAgICBpbmtzY2FwZTpjeD0iNDg2LjAyNjY0IgogICAgIGlua3NjYXBlOmN5PSIzMDguNzAxMjkiCiAgICAgaW5rc2NhcGU6d2luZG93LXdpZHRoPSIxNTk2IgogICAgIGlua3NjYXBlOnBhZ2VvcGFjaXR5PSIwLjAiCiAgICAgaW5rc2NhcGU6ZG9jdW1lbnQtdW5pdHM9InB4IiAvPgogIDxnCiAgICAgaWQ9ImxheWVyMSIKICAgICBpbmtzY2FwZTpsYWJlbD0iTGF5ZXIgMSIKICAgICBpbmtzY2FwZTpncm91cG1vZGU9ImxheWVyIgogICAgIHRyYW5zZm9ybT0idHJhbnNsYXRlKC02Mi43OSAtNzguMjc1KSI+CiAgICA8ZwogICAgICAgaWQ9Imc2NjYxIgogICAgICAgdHJhbnNmb3JtPSJtYXRyaXgoOC43NDA5LC0wLjE1MjU3LDAuMTUyNTcsOC43NDA5LC0xNDMwNywtNjQ2MS4yKSI+CiAgICAgIDxwYXRoCiAgICAgICAgIGlua3NjYXBlOmNvbm5lY3Rvci1jdXJ2YXR1cmU9IjAiCiAgICAgICAgIGlua3NjYXBlOmV4cG9ydC14ZHBpPSI3MiIKICAgICAgICAgdHJhbnNmb3JtPSJtYXRyaXgoMC42NzAwNywtMC4xNTQ3LDAuMTU0NywwLjY3MDA3LDE5Ni4wOSw1OTIuMikiCiAgICAgICAgIGlua3NjYXBlOmV4cG9ydC1maWxlbmFtZT0iRzpcU0FGSCBJTlRFUk5BTFxXZWJzaXRlXFdlYiBHcmFwaGljc1xJbWFnZXNcZG93bmxvYWQtcGRmLWJnLnBuZyIKICAgICAgICAgaW5rc2NhcGU6ZXhwb3J0LXlkcGk9IjcyIgogICAgICAgICBkPSJtIDE5ODMsNzM5LjUzIC0yNy41NjgsMTEzLjg2IDgxLjMzMiwxOS42OTEgMjIuODIyLC05NC4yNjMgLTE0Ljg1NSwtMjQuMzQ2IC02MS43MywtMTQuOTQ2IHoiCiAgICAgICAgIHN0eWxlPSJmaWxsOiMwMDAwMDA7ZmlsdGVyOnVybCgjZmlsdGVyOTYwMi0xKSIKICAgICAgICAgaWQ9InBhdGg2NTc3IiAvPgogICAgICA8cGF0aAogICAgICAgICBpbmtzY2FwZTpjb25uZWN0b3ItY3VydmF0dXJlPSIwIgogICAgICAgICBpbmtzY2FwZTpleHBvcnQteGRwaT0iNzIiCiAgICAgICAgIGlua3NjYXBlOmV4cG9ydC1maWxlbmFtZT0iRzpcU0FGSCBJTlRFUk5BTFxXZWJzaXRlXFdlYiBHcmFwaGljc1xJbWFnZXNcZG93bmxvYWQtcGRmLWJnLnBuZyIKICAgICAgICAgaW5rc2NhcGU6ZXhwb3J0LXlkcGk9IjcyIgogICAgICAgICBkPSJtIDE2MzkuMiw3ODAuOTggLTAuODU3OSw4MC41NjIgNTcuNTQ0LDAuNjEyNzEgMC43MTAxLC02Ni42OTQgLTEzLjcyLC0xNC4wMTYgLTQzLjY3NiwtMC40NjUwNyB6IgogICAgICAgICBzdHlsZT0iZmlsbDojZTZlNmU2IgogICAgICAgICBpZD0icGF0aDY1NzkiIC8+CiAgICAgIDxwYXRoCiAgICAgICAgIGlua3NjYXBlOmNvbm5lY3Rvci1jdXJ2YXR1cmU9IjAiCiAgICAgICAgIGlua3NjYXBlOmV4cG9ydC14ZHBpPSI3MiIKICAgICAgICAgaW5rc2NhcGU6ZXhwb3J0LWZpbGVuYW1lPSJHOlxTQUZIIElOVEVSTkFMXFdlYnNpdGVcV2ViIEdyYXBoaWNzXEltYWdlc1xkb3dubG9hZC1wZGYtYmcucG5nIgogICAgICAgICBpbmtzY2FwZTpleHBvcnQteWRwaT0iNzIiCiAgICAgICAgIGQ9Im0gMTYzOS4yLDc4MC45OCAtMC44NTc5LDgwLjU2MiA1Ny41NDQsMC42MTI3MSAwLjcxMDEsLTY2LjY5NCAtMTMuNzIsLTE0LjAxNiAtNDMuNjc2LC0wLjQ2NTA3IHoiCiAgICAgICAgIHN0eWxlPSJvcGFjaXR5OjAuNjtmaWxsOnVybCgjcmFkaWFsR3JhZGllbnQzMDEzKSIKICAgICAgICAgaWQ9InBhdGg2NTgxIiAvPgogICAgICA8cGF0aAogICAgICAgICBpbmtzY2FwZTpjb25uZWN0b3ItY3VydmF0dXJlPSIwIgogICAgICAgICBpbmtzY2FwZTpleHBvcnQteGRwaT0iNzIiCiAgICAgICAgIHRyYW5zZm9ybT0ibWF0cml4KDAuNDYwMzUsMC4wMDQ5MDE2LC0wLjAwNDkwMTYsMC40NjAzNSw4OTEuNDQsNDQ0LjIyKSIKICAgICAgICAgaW5rc2NhcGU6ZXhwb3J0LWZpbGVuYW1lPSJHOlxTQUZIIElOVEVSTkFMXFdlYnNpdGVcV2ViIEdyYXBoaWNzXEltYWdlc1xkb3dubG9hZC1wZGYtYmcucG5nIgogICAgICAgICBzb2RpcG9kaTpub2RldHlwZXM9ImN6Y3pjYyIKICAgICAgICAgaW5rc2NhcGU6ZXhwb3J0LXlkcGk9IjcyIgogICAgICAgICBkPSJtIDE3MjYuNyw3MTQuNjkgYyAwLDAgMS43ODU4LDMuNzYxMiAxLjc4NTgsNS43ODEyIDAsMi4wMjIxIC0xLjYwNzIsMjQuMzUzIC0xLjYwNzIsMjQuMzUzIDAsMCAyMC43MjIsLTEuNjA3MiAyMy45MDYsLTEuNTE3OSAzLjE4MDgsMC4wODkzIDYuMDQ5LDEuNTE3OSA2LjA0OSwxLjUxNzkgbCAtMzAuMTM0LC0zMC4xMzQgeiIKICAgICAgICAgc3R5bGU9ImZpbGw6IzY2NjY2NjtmaWx0ZXI6dXJsKCNmaWx0ZXI5NTcwLTgpIgogICAgICAgICBpZD0icGF0aDY1ODMiIC8+CiAgICAgIDxwYXRoCiAgICAgICAgIGlua3NjYXBlOmNvbm5lY3Rvci1jdXJ2YXR1cmU9IjAiCiAgICAgICAgIGlua3NjYXBlOmV4cG9ydC14ZHBpPSI3MiIKICAgICAgICAgaW5rc2NhcGU6ZXhwb3J0LWZpbGVuYW1lPSJHOlxTQUZIIElOVEVSTkFMXFdlYnNpdGVcV2ViIEdyYXBoaWNzXEltYWdlc1xkb3dubG9hZC1wZGYtYmcucG5nIgogICAgICAgICBzb2RpcG9kaTpub2RldHlwZXM9ImN6Y3pjYyIKICAgICAgICAgaW5rc2NhcGU6ZXhwb3J0LXlkcGk9IjcyIgogICAgICAgICBkPSJtIDE2ODIuOSw3ODEuNDQgYyAwLDAgMC44MDM4LDEuNzQwMiAwLjc5MzgsMi42NzAyIC0wLjAxLDAuOTMwODcgLTAuODU5MiwxMS4yMDMgLTAuODU5MiwxMS4yMDMgMCwwIDkuNTQ3MiwtMC42MzgzNCAxMS4wMTMsLTAuNTgxNTggMS40NjM4LDAuMDU2NyAyLjc3NzIsMC43Mjg0IDIuNzc3MiwwLjcyODQgbCAtMTMuNzI1LC0xNC4wMiB6IgogICAgICAgICBzdHlsZT0iZmlsbDp1cmwoI2xpbmVhckdyYWRpZW50MzAxNSkiCiAgICAgICAgIGlkPSJwYXRoNjU4NSIgLz4KICAgIDwvZz4KICAgIDxnCiAgICAgICBpZD0iZzY2NDIiCiAgICAgICB0cmFuc2Zvcm09Im1hdHJpeCg4Ljc0MDksLTAuMTUyNTcsMC4xNTI1Nyw4Ljc0MDksLTE0MzAwLjA4NSwtNjQ5OC45MDQpIj4KICAgICAgPHJlY3QKICAgICAgICAgaWQ9InJlY3Q2NjA1IgogICAgICAgICBzdHlsZT0iZmlsbDojMDAzMzgwIgogICAgICAgICBoZWlnaHQ9IjUuNzE0MzAwMiIKICAgICAgICAgd2lkdGg9IjQ4LjIxNDAwMSIKICAgICAgICAgeT0iODUwLjAxMDAxIgogICAgICAgICB4PSIxNjQxLjgiIC8+CiAgICAgIDxyZWN0CiAgICAgICAgIGlkPSJyZWN0NjYyMyIKICAgICAgICAgc3R5bGU9ImZpbGw6IzAwMzM4MCIKICAgICAgICAgaGVpZ2h0PSI1LjcxNDMwMDIiCiAgICAgICAgIHdpZHRoPSI0OC4yMTQwMDEiCiAgICAgICAgIHk9Ijg0MC4wMTAwMSIKICAgICAgICAgeD0iMTY0MS44IiAvPgogICAgICA8cmVjdAogICAgICAgICBpZD0icmVjdDY2MjUiCiAgICAgICAgIHN0eWxlPSJmaWxsOiMwMDMzODAiCiAgICAgICAgIGhlaWdodD0iNS43MTQzMDAyIgogICAgICAgICB3aWR0aD0iMTcuNSIKICAgICAgICAgeT0iODMwLjAxMDAxIgogICAgICAgICB4PSIxNjcyLjUiIC8+CiAgICAgIDxyZWN0CiAgICAgICAgIGlkPSJyZWN0NjYyNyIKICAgICAgICAgc3R5bGU9ImZpbGw6IzAwMzM4MCIKICAgICAgICAgaGVpZ2h0PSI1LjcxNDMwMDIiCiAgICAgICAgIHdpZHRoPSIxNy41IgogICAgICAgICB5PSI4MjAuMDEwMDEiCiAgICAgICAgIHg9IjE2NzIuNSIgLz4KICAgICAgPHJlY3QKICAgICAgICAgaWQ9InJlY3Q2NjI5IgogICAgICAgICBzdHlsZT0iZmlsbDojMDAzMzgwIgogICAgICAgICBoZWlnaHQ9IjUuNzE0MzAwMiIKICAgICAgICAgd2lkdGg9IjE3LjUiCiAgICAgICAgIHk9IjgxMC4wMTAwMSIKICAgICAgICAgeD0iMTY3Mi41IiAvPgogICAgPC9nPgogICAgPHJlY3QKICAgICAgIHg9IjE4MC4xMTMyIgogICAgICAgeT0iMjU3LjcyMTk4IgogICAgICAgd2lkdGg9IjE5Mi45ODYzNiIKICAgICAgIGhlaWdodD0iMjgzLjMzMjciCiAgICAgICBzdHlsZT0iZmlsbDojZmZmZmZmO3N0cm9rZTojMDAzMzgwO3N0cm9rZS13aWR0aDoxNi41MDYxMjI1OSIKICAgICAgIGlkPSJyZWN0NjYzMSIKICAgICAgIHRyYW5zZm9ybT0ibWF0cml4KDAuOTk5NjcxNjQsLTAuMDI1NjI0MzMsMC4wMTE4ODUwMywwLjk5OTkyOTM3LDAsMCkiIC8+CiAgPC9nPgogIDxtZXRhZGF0YQogICAgIGlkPSJtZXRhZGF0YTM2Ij4KICAgIDxyZGY6UkRGPgogICAgICA8Y2M6V29yaz4KICAgICAgICA8ZGM6Zm9ybWF0PmltYWdlL3N2Zyt4bWw8L2RjOmZvcm1hdD4KICAgICAgICA8ZGM6dHlwZQogICAgICAgICAgIHJkZjpyZXNvdXJjZT0iaHR0cDovL3B1cmwub3JnL2RjL2RjbWl0eXBlL1N0aWxsSW1hZ2UiIC8+CiAgICAgICAgPGNjOmxpY2Vuc2UKICAgICAgICAgICByZGY6cmVzb3VyY2U9Imh0dHA6Ly9jcmVhdGl2ZWNvbW1vbnMub3JnL2xpY2Vuc2VzL3B1YmxpY2RvbWFpbi8iIC8+CiAgICAgICAgPGRjOnB1Ymxpc2hlcj4KICAgICAgICAgIDxjYzpBZ2VudAogICAgICAgICAgICAgcmRmOmFib3V0PSJodHRwOi8vb3BlbmNsaXBhcnQub3JnLyI+CiAgICAgICAgICAgIDxkYzp0aXRsZT5PcGVuY2xpcGFydDwvZGM6dGl0bGU+CiAgICAgICAgICA8L2NjOkFnZW50PgogICAgICAgIDwvZGM6cHVibGlzaGVyPgogICAgICAgIDxkYzp0aXRsZT5pdC13b3JkLWljb248L2RjOnRpdGxlPgogICAgICAgIDxkYzpkYXRlPjIwMTAtMDgtMDZUMjM6NDg6NTk8L2RjOmRhdGU+CiAgICAgICAgPGRjOmRlc2NyaXB0aW9uIC8+CiAgICAgICAgPGRjOnNvdXJjZT5odHRwczovL29wZW5jbGlwYXJ0Lm9yZy9kZXRhaWwvNzgyMTcvaXQtd29yZC1pY29uLWJ5LXNoZWlraF90dWhpbjwvZGM6c291cmNlPgogICAgICAgIDxkYzpjcmVhdG9yPgogICAgICAgICAgPGNjOkFnZW50PgogICAgICAgICAgICA8ZGM6dGl0bGU+c2hlaWtoX3R1aGluPC9kYzp0aXRsZT4KICAgICAgICAgIDwvY2M6QWdlbnQ+CiAgICAgICAgPC9kYzpjcmVhdG9yPgogICAgICAgIDxkYzpzdWJqZWN0PgogICAgICAgICAgPHJkZjpCYWc+CiAgICAgICAgICAgIDxyZGY6bGk+SVQ8L3JkZjpsaT4KICAgICAgICAgICAgPHJkZjpsaT5jb21wdXRlcjwvcmRmOmxpPgogICAgICAgICAgICA8cmRmOmxpPmZpbGU8L3JkZjpsaT4KICAgICAgICAgICAgPHJkZjpsaT5pY29uPC9yZGY6bGk+CiAgICAgICAgICA8L3JkZjpCYWc+CiAgICAgICAgPC9kYzpzdWJqZWN0PgogICAgICA8L2NjOldvcms+CiAgICAgIDxjYzpMaWNlbnNlCiAgICAgICAgIHJkZjphYm91dD0iaHR0cDovL2NyZWF0aXZlY29tbW9ucy5vcmcvbGljZW5zZXMvcHVibGljZG9tYWluLyI+CiAgICAgICAgPGNjOnBlcm1pdHMKICAgICAgICAgICByZGY6cmVzb3VyY2U9Imh0dHA6Ly9jcmVhdGl2ZWNvbW1vbnMub3JnL25zI1JlcHJvZHVjdGlvbiIgLz4KICAgICAgICA8Y2M6cGVybWl0cwogICAgICAgICAgIHJkZjpyZXNvdXJjZT0iaHR0cDovL2NyZWF0aXZlY29tbW9ucy5vcmcvbnMjRGlzdHJpYnV0aW9uIiAvPgogICAgICAgIDxjYzpwZXJtaXRzCiAgICAgICAgICAgcmRmOnJlc291cmNlPSJodHRwOi8vY3JlYXRpdmVjb21tb25zLm9yZy9ucyNEZXJpdmF0aXZlV29ya3MiIC8+CiAgICAgIDwvY2M6TGljZW5zZT4KICAgIDwvcmRmOlJERj4KICA8L21ldGFkYXRhPgo8L3N2Zz4K
//					
//					byte[] bA = baos.toByteArray();
//					
//					String s = baos.toString();
//					
//					
//					int nBytes = is.read(bA);
					
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
