package org.eclipse.rcpl.model.cdo.client;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.rcpl.model.IJOSignIn;

import com.caucho.hessian.client.HessianProxyFactory;

/**
 * @author ramin
 *
 */
public class SignInClient {

	private final String host;

	/**
	 * @param host
	 */
	public SignInClient(String host) {
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
	public SignInClient() {
		this.host = getURL();
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {
		new SignInClient().signIn("test@test.com", "xxx");
	}

	/**
	 * @param user
	 * @param fileName
	 * @return
	 * @throws MalformedURLException
	 * @throws FileNotFoundException
	 */
	public String signIn(final String email, String password) {
		String url = "http://" + host + "/com.joffice.servlet/josignin";
		HessianProxyFactory factory = new HessianProxyFactory();
		IJOSignIn signIn;
		try {
			signIn = (IJOSignIn) factory.create(IJOSignIn.class, url);
			return signIn.signIn(email, password);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "NOK";
	}

}
