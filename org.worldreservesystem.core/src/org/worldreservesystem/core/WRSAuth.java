package org.worldreservesystem.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.SecureRandom;

import org.apache.commons.codec.binary.Base32;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;



/**
 * @author Ramin
 *
 */
public class WRSAuth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		new WRSAuth().registerNewUser("ramin.assisi@gmail.com", WRS.WORLD_RESERVE_SYSTEM_WEB_SITE);
		new WRSAuth().validateUser("w4tc  afw w yy bs x b7g  vc7c  ooo f qp rh fbnw");
	}

	/**
	 * @param user
	 * @param webSite
	 */
	public void registerNewUser(String user, String webSite) {
		String secret = getRandomSecretKey().toLowerCase().replaceAll("(.{4})(?=.{4})", "$1 ");
		
		
		GoogleAuthenticator ga = new GoogleAuthenticator();
		final GoogleAuthenticatorKey key = ga.createCredentials(user);
		
		
		
		
//		final String secret = key.getKey().toLowerCase().replaceAll("(.{4})(?=.{4})", "$1 ");
		System.out.println("secret = " + secret);
		String barCodeData = getGoogleAuthenticatorBarCode(secret, user, webSite);
		try {
		    String property = "java.io.tmpdir";
		    String tempDir = System.getProperty(property);
			File tempFile = File.createTempFile("barcode", ".png", new File(tempDir));
			tempFile.delete();
			System.out.println("create barcode as " + tempFile.getAbsolutePath());
			createQRCode(barCodeData, tempFile.getAbsolutePath(), 512, 512);
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	/**
	 * @param user
	 * @param webSite
	 */
	public void validateUser(String secret) {
		GoogleAuthenticator gAuth = new GoogleAuthenticator();
		int code = gAuth.getTotpPassword(secret);
		System.out.println("code = " + code);
	}
	
	/**
	 * @return
	 */
	public static String getRandomSecretKey() {
		SecureRandom random = new SecureRandom();
		byte[] bytes = new byte[20];
		random.nextBytes(bytes);
		Base32 base32 = new Base32();
		String secretKey = base32.encodeToString(bytes);
		// make the secret key more human-readable by lower-casing and
		// inserting spaces between each group of 4 characters
		return secretKey.toLowerCase().replaceAll("(.{4})(?=.{4})", "$1 ");
	}

	/**
	 * @param secretKey
	 * @param account
	 * @param issuer
	 * @return
	 */
	public static String getGoogleAuthenticatorBarCode(String secretKey, String account, String issuer) {
		String normalizedBase32Key = secretKey.replace(" ", "").toUpperCase();
		try {
			return "otpauth://totp/" + URLEncoder.encode(issuer + ":" + account, "UTF-8").replace("+", "%20")
					+ "?secret=" + URLEncoder.encode(normalizedBase32Key, "UTF-8").replace("+", "%20") + "&issuer="
					+ URLEncoder.encode(issuer, "UTF-8").replace("+", "%20");
		} catch (UnsupportedEncodingException e) {
			throw new IllegalStateException(e);
		}
	}

	/**
	 * @param barCodeData
	 * @param filePath
	 * @param height
	 * @param width
	 * @throws WriterException
	 * @throws IOException
	 */
	public static void createQRCode(String barCodeData, String filePath, int height, int width)
			throws WriterException, IOException {
		BitMatrix matrix = new MultiFormatWriter().encode(barCodeData, BarcodeFormat.QR_CODE, width, height);
		try (FileOutputStream out = new FileOutputStream(filePath)) {
			MatrixToImageWriter.writeToStream(matrix, "png", out);
		}
	}
	
//	public static String getTOTPCode(String secretKey) {
//	    String normalizedBase32Key = secretKey.replace(" ", "").toUpperCase();
//	    Base32 base32 = new Base32();
//	    byte[] bytes = base32.decode(normalizedBase32Key);
//	    String hexKey = Hex.encodeHexString(bytes);
//	    long time = (System.currentTimeMillis() / 1000) / 30;
//	    String hexTime = Long.toHexString(time);
//	    
//
//	    
//	    return TOTP.generateTOTP(hexKey, hexTime, "6");
//	}
}
