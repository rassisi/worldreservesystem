package org.eclipse.rcpl.model.cdo.client;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rcpl.model_2_0_0.rcpl.Folder;
import org.eclipse.rcpl.model_2_0_0.rcpl.Perspective;
import org.eclipse.rcpl.model_2_0_0.rcpl.RCPL;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.Resource;
import org.eclipse.rcpl.model_2_0_0.rcpl.SideToolBar;
import org.eclipse.rcpl.model_2_0_0.rcpl.TopToolBar;

public class JOFactoryImpl implements JOFactory {

	private JOSession session;

	public static JOFactoryImpl INSTANCE;

	public JOFactoryImpl(JOSession cdoSession) {
		this.session = (JOSession) cdoSession;
		INSTANCE = this;
	}

	/**
	   *
	   */
	public static String getSHAHash(String password) {
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("SHA-1");
			digest.reset();
			byte[] input = digest.digest(password.getBytes("UTF-8"));
			return byteToHexString(input);
		} catch (NoSuchAlgorithmException e) {
		} catch (UnsupportedEncodingException e) {
		}
		return null;
	}

	private static String byteToHexString(byte[] array) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; ++i) {
			sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(
					1, 3));
		}
		return sb.toString();
	}

	/**
	   *
	   */
	public static String getMD5Hash(String password) {
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("MD5");
			digest.reset();
			byte[] input = digest.digest(password.getBytes("UTF-8"));
			return byteToHexString(input);
		} catch (NoSuchAlgorithmException e) {
		} catch (UnsupportedEncodingException e) {
		}
		return null;
	}

	/**
	 * @return
	 */
	private RCPL createRCPL() {
		RCPL office = RcplFactory.eINSTANCE.createRCPL();

		// create Containers

		office.setAllTools(RcplFactory.eINSTANCE.createTools());
		office.setAllPreferences(RcplFactory.eINSTANCE.createPreferences());
		office.setAllPerspectives(RcplFactory.eINSTANCE.createPerspectives());
		office.setAllPlugins(RcplFactory.eINSTANCE.createPlugins());

		office.setAllFavorites(RcplFactory.eINSTANCE.createFavorites());
		office.setAllPersons(RcplFactory.eINSTANCE.createPersons());
		office.setAllResources(RcplFactory.eINSTANCE.createResources());


		// preferences

		// resources
		Folder resources = RcplFactory.eINSTANCE.createFolder();
		office.getAllResources().getChildren().add(resources);
		// contacts
		// EContactGroup contacts = RcplFactory.eINSTANCE.createEContactGroup();
		// office.setContacts(contacts);

		return office;
	}

	@Override
	public Perspective createPerspective(RCPL office, String id, String name) {
		Perspective perspective = RcplFactory.eINSTANCE.createPerspective();
		office.getAllPerspectives().getChildren().add(perspective);
		perspective.setId(id);
		perspective.setName(name);

		SideToolBar sideToolBar = RcplFactory.eINSTANCE.createSideToolBar();
		perspective.setSideToolBar(sideToolBar);
		TopToolBar mainToolBar = RcplFactory.eINSTANCE.createTopToolBar();
		perspective.setTopToolBar(mainToolBar);
		return perspective;
	}

	public RCPL copyOfficeFromTemplate(String name) {
		for (EObject o : session.getContents()) {
			if (o instanceof RCPL) {
				RCPL jo = (RCPL) o;
				if (jo.getId().equals(name)) {
					return EcoreUtil.copy(jo);
				}
			}
		}
		return null;
	}

	public Resource createTemplateDocument(String name) {
		Resource eDocument = createOfficeDocument(name, "");
		eDocument.setTemplate(true);
		return eDocument;
	}

	public Resource createOfficeDocument(String id, String uri) {
		Resource officeDocument = RcplFactory.eINSTANCE.createResource();
		officeDocument.setUri(uri);
		officeDocument.setId(id);
		// EParagraph p1 = RcplFactory.eINSTANCE.createEParagraph();
		// p1.setLayoutX(0);
		// p1.setLayoutY(0);
		// ETextRun run = RcplFactory.eINSTANCE.createETextRun();
		// run.setText("");
		// p1.getTextRuns().add(run);
		// officeDocument.getParagraphs().add(p1);
		return officeDocument;
	}

	// private EOfficeFolder createFolder(RCPL joffice, String id) {
	// EOfficeFolder templateFolder = RcplFactory.eINSTANCE
	// .createEOfficeFolder();
	// templateFolder.setId(id);
	// joffice.getOfficeResources().getFolders().add(templateFolder);
	// return templateFolder;
	// }

}
