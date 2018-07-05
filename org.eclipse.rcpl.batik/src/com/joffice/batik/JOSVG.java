package com.joffice.batik;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.batik.transcoder.TranscoderException;
import org.eclipse.rcpl.model.cdo.client.JOSession;

import javafx.scene.Node;
import javafx.scene.web.WebView;

/**
 * @author ramin
 *
 */
public class JOSVG {

	static String errorUrl = JOSession.getDefault().getCodeBase() + "images/save.png";

	static WebView errorImage;

	static WebView getErrorImage() {
		if (errorImage == null) {
			errorImage = new WebView();
			errorImage.getEngine().load(errorUrl);
		}
		return errorImage;
	}

	/**
	 * Diese Methode wird aus JOImage aufgerufen.
	 * 
	 * @param file
	 * @param width
	 * @param height
	 * @return
	 * @throws TranscoderException
	 * @throws IOException
	 */
	public Node createPng(File file, double width, double height) {

		WebView wv = new WebView();

		wv.setMinWidth(width);
		wv.setPrefWidth(width);
		wv.setMaxWidth(width);
		wv.setMinHeight(height);
		wv.setPrefHeight(height);
		wv.setMaxHeight(height);
		wv.getEngine().load(file.toURI().toString());

		return wv;

		// try {
		//
		//
		//
		//
		// TranscoderInput input_svg_image = new
		// TranscoderInput(file.toURI().toString());
		// String folderName = "";
		// if (width == height) {
		// folderName = "" + (int) width + "/";
		// } else {
		// folderName = (int) width + "_" + (int) height + "/";
		// }
		// String pngFileName = JOSession.getDefault().getCacheDir() +
		// "/images/" + folderName
		// + file.getName().replaceAll("svg/", "").replaceAll(".svg", ".png");
		// return createImageView(input_svg_image, pngFileName, width, height);
		// } catch (Exception ex) {
		// //
		// }
		// return getErrorImage();
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
	public Node createPng(InputStream is, String fileName, double width, double height) {

		WebView wv = new WebView();

		wv.setMinWidth(width);
		wv.setPrefWidth(width);
		wv.setMaxWidth(width);
		wv.setMinHeight(height);
		wv.setPrefHeight(height);
		wv.setMaxHeight(height);

		String content = convertStreamToString(is);

		wv.getEngine().loadContent(content);

		return wv;

		// try {
		// TranscoderInput input_svg_image = new TranscoderInput(is);
		// String folderName = "";
		// if (width == height) {
		// folderName = "" + (int) width;
		// } else {
		// folderName = (int) width + "_" + (int) height;
		// }
		// if (!fileName.endsWith(".png")) {
		// fileName += ".png";
		// }
		// String pngFileName = JOSession.getDefault().getCacheDir() +
		// "/images/" + folderName + fileName;
		// return createImageView(input_svg_image, pngFileName, width, height);
		// } catch (Exception ex) {
		// return getErrorImage();
		// }
	}

	/**
	 * @param is
	 * @return
	 * @throws IOException
	 */
	public String convertStreamToString(InputStream is) {
		if (is != null) {
			StringBuilder sb = new StringBuilder();
			String line;
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8")); //$NON-NLS-1$
				while ((line = reader.readLine()) != null) {
					sb.append(line).append("\n"); //$NON-NLS-1$
				}
			} catch (IOException ex) {
				// LOGGER.error("", ex); //$NON-NLS-1$
			} finally {
				try {
					is.close();
				} catch (IOException e) {
					// LOGGER.error("", e); //$NON-NLS-1$
				}
			}
			return sb.toString();
		}
		return ""; //$NON-NLS-1$

	}

	/**
	 * @param svgUrl
	 * @param pngFile
	 * @param width
	 * @param height
	 * @return
	 */
	public Node createPng(String svgUrl, File pngFile, double width, double height) {

		WebView wv = new WebView();
		wv.setMinWidth(width);
		wv.setPrefWidth(width);
		wv.setMaxWidth(width);
		wv.setMinHeight(height);
		wv.setPrefHeight(height);
		wv.setMaxHeight(height);

		try {
			URL url = new URL(svgUrl);
			boolean localFile = "file".equals(url.getProtocol());
			if (!localFile) {
				if (!JOSession.getDefault().isReachable() || !existsAtUrl(svgUrl)) {
					return wv;
				}
			}

			StringBuffer sb = new StringBuffer();

			sb.append(

			"<head>" + "<title></title>"

			+ "<style type=\"text/css\">"

			+ "#myDiv"

			+ "{"

			+ "height:100%;"

			+ "width:100%;"

			+ "}"

			+ "#myDiv img"

			+ "{"

			+ "width:100%; "

			+ "height:100%;"

			+ "margin:auto;"

			+ "display:block;"

			+ "}" + "</style>" + "</head>"

			+ "<div id=\"myDiv\">"

			+ "<img alt=\"Client Logo\" title=\"Client Logo\""

			+ "src=\"" + svgUrl + "\" />"

			+ "</div>"

			);

			wv.getEngine().loadContent(sb.toString());

			// wv.getEngine().load(sb.toString());

			//
			// TranscoderInput input_svg_image = new TranscoderInput(svgUrl);
			// String pngFileName;
			// if (localFile) {
			// pngFileName = url.getFile();
			// } else {
			// pngFileName = pngFile.getAbsolutePath();
			// }
			//
			// return createImageView(input_svg_image, pngFileName, width,
			// height);
		} catch (Exception ex) {
			// return getErrorImage();
		}

		final com.sun.webkit.WebPage webPage = com.sun.javafx.webkit.Accessor.getPageFor(wv.getEngine());
		webPage.setBackgroundColor(0);

		return wv;

	}

	private boolean existsAtUrl(String URLName) {
		try {
			HttpURLConnection.setFollowRedirects(false);
			// HttpURLConnection.setInstanceFollowRedirects(false)
			HttpURLConnection con = (HttpURLConnection) new URL(URLName).openConnection();
			con.setRequestMethod("HEAD");
			return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
		} catch (Exception e) {

			try {
				URL url = new URL(URLName);
				String host = url.getHost();
				url = new URL(JOSession.getDefault().codeBase);
				String host2 = url.getHost();
				if (host.equals(host2)) {
					JOSession.getDefault().setReachable(false);
				}
			} catch (MalformedURLException e1) {
			}
			return false;
		}
	}

}