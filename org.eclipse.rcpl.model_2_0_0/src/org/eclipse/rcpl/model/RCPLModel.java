package org.eclipse.rcpl.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool;

/**
 * @author ramin
 *
 */
public class RCPLModel {

	public static final String USE_CASE_TOOLS_ID = "USE_CASE_TOOLS";
	public static final String USE_CASE_IT_ID = "USE_CASE_TOGAV";
	public static final String USE_CASE_CONTACTS_ID = "USE_CASE_CONTACTS";

	public static final String PERSPECTIVE_SUFFIX = "_PERSPECTIVE";

	public static IMobileProvider mobileProvider;

	public static StringBuilder errorBuf = new StringBuilder();

	public static StringBuilder logBuf = new StringBuilder();

	public static IResources resources;

	public static double FONT_HEIGHT_FACTOR = 1.35;

	public static IConfig configuration;

	public static final String DEFAULT_XMI_NAME = "rcpl";

	public static final String XMI_EXTENSION = ".xmi";

	public static String XMIName = DEFAULT_XMI_NAME;

	public static Class<? extends RCPLModel> modelClass = RCPLModel.class;

	public static AbstractTool collectObjectByClass(EObject eo, List<EObject> list, Class<?> cl) {
		try {
			for (Class<?> cl2 : eo.getClass().getInterfaces()) {
				if (cl2 == cl) {
					list.add(eo);
				}
			}
			for (EObject g : eo.eContents()) {
				collectObjectByClass(g, list, cl);
			}
		} catch (Exception ex) {
			RCPLModel.logError(ex);
		}
		return null;
	}

	public static void logError(String text) {
		logError(new Exception(text));
	}

	public static void logError(Throwable ex) {

		StringBuilder sb = new StringBuilder();
		sb.append(ex.getClass().getName() + " ");
		sb.append("message: " + ex.getMessage() + "\r\n");
		StackTraceElement[] st = ex.getStackTrace();
		int count = 0;
		String tab = "";
		for (StackTraceElement stackTraceElement : st) {
			sb.append(tab + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "() line: "
					+ stackTraceElement.getLineNumber() + "\r\n");

			if (count++ == 0) {
				tab = "   ";
			}

			if (count == 3) {
				break;
			}
		}
		errorBuf.append(sb.toString());
		mobileProvider.appendLog(sb.toString());
	}

	public static void log(Object o, String message) {
		logBuf.append(o.getClass().getName() + ": " + message + "\r\n");
		mobileProvider.appendLog(message + "\r\n");
	}

	public static void clearLog() {
		logBuf.setLength(0);
		errorBuf.setLength(0);
	}

}
