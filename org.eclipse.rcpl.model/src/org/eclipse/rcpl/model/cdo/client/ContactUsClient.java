package org.eclipse.rcpl.model.cdo.client;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.rcpl.model.IJOContactUs;

import com.caucho.hessian.client.HessianProxyFactory;

/**
 * @author ramin
 *
 */
public class ContactUsClient {

	private final String host;

	/**
	 * @param host
	 */
	public ContactUsClient(String host) {
		this.host = host;
	}

	final static String URL_STRING = "85.25.100.163:8080";

	public static String getURL() {
		try {
			URL url = new URL(JOSession.getDefault().codeBase);
			if ("localhost".equals(url.getHost())) {
				String res = url.getHost() + ":8080";
				return res;
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return URL_STRING;

	}

	/**
	 * 
	 */
	public ContactUsClient() {
		this.host = getURL();
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {
		new ContactUsClient().contactUs("test@test.com");
	}

	/**
	 * @param user
	 * @param fileName
	 * @return
	 * @throws MalformedURLException
	 * @throws FileNotFoundException
	 */
	public String contactUs(final String message) {
		String url = "http://" + host + "/com.joffice.servlet/jocontactus";
		HessianProxyFactory factory = new HessianProxyFactory();
		IJOContactUs contactUs;
		try {
			contactUs = (IJOContactUs) factory.create(IJOContactUs.class, url);
			return contactUs.contactUs(message);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch blockcont
			e.printStackTrace();
		}
		return "NOK";
	}

}
