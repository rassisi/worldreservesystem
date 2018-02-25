package org.eclipse.rcpl.model.cdo.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.emf.cdo.common.util.CDOException;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.etypes.EtypesPackage;
import org.eclipse.emf.cdo.expressions.ExpressionsPackage;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.security.Access;
import org.eclipse.emf.cdo.security.Assignee;
import org.eclipse.emf.cdo.security.Directory;
import org.eclipse.emf.cdo.security.FilterPermission;
import org.eclipse.emf.cdo.security.Group;
import org.eclipse.emf.cdo.security.PatternStyle;
import org.eclipse.emf.cdo.security.Permission;
import org.eclipse.emf.cdo.security.PermissionFilter;
import org.eclipse.emf.cdo.security.Realm;
import org.eclipse.emf.cdo.security.ResourceFilter;
import org.eclipse.emf.cdo.security.Role;
import org.eclipse.emf.cdo.security.SecurityFactory;
import org.eclipse.emf.cdo.security.SecurityPackage;
import org.eclipse.emf.cdo.security.User;
import org.eclipse.emf.cdo.security.UserPassword;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.lifecycle.LifecycleException;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.log.PrintLogHandler;
import org.eclipse.net4j.util.om.trace.PrintTraceHandler;
import org.eclipse.net4j.util.security.IPasswordCredentialsProvider;
import org.eclipse.net4j.util.security.PasswordCredentialsProvider;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model_2_0_0.rcpl.AbstractTool;
import org.eclipse.rcpl.model_2_0_0.rcpl.Folder;
import org.eclipse.rcpl.model_2_0_0.rcpl.Logins;
import org.eclipse.rcpl.model_2_0_0.rcpl.Perspective;
import org.eclipse.rcpl.model_2_0_0.rcpl.Plugin;
import org.eclipse.rcpl.model_2_0_0.rcpl.RCPL;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplFactory;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;
import org.eclipse.rcpl.model_2_0_0.rcpl.Resource;
import org.eclipse.rcpl.model_2_0_0.rcpl.SideToolBar;
import org.eclipse.rcpl.model_2_0_0.rcpl.Tool;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroup;
import org.eclipse.rcpl.model_2_0_0.rcpl.ToolGroups;
import org.eclipse.rcpl.model_2_0_0.rcpl.TopToolBar;
import org.eclipse.rcpl.model_2_0_0.rcpl.provider.RcplItemProviderAdapterFactory;

/**
 * @author Ramin
 * 
 */
public class JOSession {

	public static boolean FORCE_NEW_XMI = false;
	public static final String USER_TEMPLATES = "templates";
	public static final String USER_ADMINISTRATOR = "Administrator";
	public static final String USER_COMPANY_1 = "user1@company.com";
	public static final String USER_COMPANY_2 = "user2@company.com";
	public static final String USER_COMPANY_3 = "user3@company.com";

	public static final String ROLE_TEMPLATES_WRITER = "ROLE_TEMPLATES_WRITER";
	public static final String ROLE_TEMPLATES_READER = "ROLE_TEMPLATES_READER";
	public static final String ROLE_SECURITY_READER = "ROLE_SECURITY_READER";
	public static final String ROLE_COMMUNICATION = "ROLE_COMMUNICATION";
	public static final String ROLE_HOME = "Home Folder /home";
	public static final String ROLE_ADMINISTRATION = "Administration";
	public static final String ROLE_IT_ARCHITECT = "ROLE_IT_ARCHITECT";
	public static final String ROLE_PRODUCT_TECH_COORDINATER = "ROLE_PKT";
	public static final String ROLE_PROJECT_LEADER = "ROLE_PL";

	public static final String GROUP_ADMINISTRATORS = "Administrators";
	public static final String GROUP_TEMPLATES_READER = "GROUP_TR";
	public static final String GROUP_TEMPLATES_WRITER = "GROUP_TW";
	public static final String GROUP_COMPANY = "GROUP_COMPANY";
	public static final String GROUP_IT_ARCHITECTS = "GROUP_ITA";
	public static final String GROUP_PRODUCT_TECH_COORDINATERS = "GROUP_PKT";
	public static final String GROUP_Users = "Users";
	public static final String GROUP_PROJECT_LEADERS = "GROUP_PL";

	// Ist in Wirklichkeit ein user!
	public static final String GROUPCOMM = "GROUPCOMM";
	// Ist in Wirklichkeit eine Rolle!
	public static final String GROUPCOMM2 = "GROUPCOMM2";

	public static final String MESSAGE_REGISTRATION = "kxlklqp&78dn(xLGGc0whka_registration";

	public static final String MESSAGE_CONFIRMATION_1_SEND = "qwelkxlx7klqp&78dn(xLGGc0whka_conf_1";

	public static final String MESSAGE_CONFIRMATION_2_SEND = "qweHHwxn77klqp&78dn(xLGGc0whka_conf2";

	public static boolean connectionFailed = false;

	private static JOSession INSTANCE;

	public final static Perspective PERSPECTIVE_OVERVIEW = RcplFactory.eINSTANCE.createPerspective();

	private final static String PERSPECTIVE_OVERVIEW_ID = "PERSPECTIVE_OVERVIEW";

	static {
		PERSPECTIVE_OVERVIEW.setId(PERSPECTIVE_OVERVIEW_ID);
		SideToolBar st = RcplFactory.eINSTANCE.createSideToolBar();
		PERSPECTIVE_OVERVIEW.setSideToolBar(st);
	}

	public final static String SWITCH_TO_PERSPECTIVE_AND_CREATE_DOCUMENT_IF_NEEDED = "SWITCH_TO_PERSPECTIVE_AND_CREATE_DOCUMENT_IF_NEEDED";



	public static void println(String msg) {
		System.out.println(msg);
	}

	private static String BASE_URL = "http://joffice.eu/";
	
	public static String codeBase = BASE_URL;

	public String CDO_SERVER;

	public final String DEFAULT_PASSWORD;

	protected final String COMM1;

	public final int SOURCE_PORT;

	public final int DESTINATION_PORT;

	private final String DB_NAME;

	protected final String REPOSITORY;

	public boolean DEBUG_RECREATE;

	public boolean ENV_DEV;

	public boolean STANDALONE;

	protected CDOSession session;

	protected CDOTransaction transaction;

	private JOFactory factory;

	private org.eclipse.emf.ecore.resource.Resource xmiCDO;

	private org.eclipse.emf.ecore.resource.Resource xmiLocal;

	protected CDONet4jSessionConfiguration configuration;

	private JOUserPreferences userPreferences;

	private JOSystemPreferences systemPreferences;

	public Hashtable<String, Object> coreDataTable;

	private Connection connection;

	private RCPL rcpl;

	private Perspective wordPerspective;

	private Perspective spreadsheetPerspective;

	private Perspective presentationPerspective;

	private Perspective webPerspective;

	private Perspective settingsPerspective;

	private String perspektiveType;

	private Logins logins;

	protected String COMM2;

	public String userId;

	public String password;

	private String cacheDir;

	private Hashtable<String, String> cdoIds;

	private User user;

	private Realm realm;

	private Directory directory;

	private boolean reachable;

	public static JOSession getDefault() {
		return getDefault(codeBase);
	}
	
	public static JOSession getDefault(String url) {
		if (INSTANCE == null) {
			INSTANCE = new JOSession(url);
		}
		return INSTANCE;
	}
	
	public JOSession() throws SecurityException {
		this(codeBase);
	}
	
	/**
	 * @param port
	 * @param ePackage
	 */
	public JOSession(String url) throws SecurityException {

		INSTANCE = this;
		codeBase = url;
		testReachable();

		// if (!testReachable()) {
		// this.codeBase = "http://localhost/";
		// testReachable();
		// }

		if (!isReachable()) {
			System.out.println("Server not running!");
		}
		this.CDO_SERVER = null; // "85.25.100.163:80";
		this.DEFAULT_PASSWORD = "joffice";
		this.COMM1 = "b86645f289952e618043e5f2f70c";
		this.SOURCE_PORT = 2037;
		this.DESTINATION_PORT = 2036;
		this.DB_NAME = "joffice";
		this.REPOSITORY = "joffice";
		this.DEBUG_RECREATE = false;
		this.ENV_DEV = false;
		this.STANDALONE = false;
		this.perspektiveType = "WORD";
		this.COMM2 = "2a647b6a1184d48d712042f946420cc48280";
		this.userId = "";
		this.password = "";
		this.coreDataTable = new Hashtable<String, Object>();
		this.factory = new JOFactoryImpl(this);
		this.cdoIds = new Hashtable<String, String>();

		// BasicService basicService = null;
		// try {
		// try {
		// basicService = (BasicService)
		// ServiceManager.lookup("javax.jnlp.BasicService");
		// LAUNCHED_BY_JNLP = true;
		// println("Launched By JNLP");
		// } catch (UnavailableServiceException e) {
		// LAUNCHED_BY_JNLP = false;
		// println("Launched Standalone");
		// }
		//
		// if (basicService != null) {
		// codeBase = basicService.getCodeBase().toString();
		// println("codeBase: " + codeBase);
		// } else {
		// println("codeBase not determined");
		// }
		// } catch (Exception ex) {
		// // ignore
		// }

	}

	private boolean testReachable() {
		URL url;
		try {
			url = new URL(this.codeBase);
			InetAddress[] ia = Inet4Address.getAllByName(url.getHost());
			reachable = ia[0].isReachable(3000);
		} catch (MalformedURLException e) {
			reachable = false;
		} catch (UnknownHostException e) {
			reachable = false;
		} catch (IOException e) {
			reachable = false;
		}
		return reachable;
	}

	public void addDocument(RCPL joffice, Resource eNewDocument) {
		findMyDocumentsFolder(joffice).getResources().add(eNewDocument);
		getOpenedResources(joffice).add(eNewDocument);
	}

	public void addUserToGroup(Group group, User... users) {
		for (User user : users) {
			if (!group.getUsers().contains(user)) {
				group.getUsers().add(user);
				user.getGroups().add(group);
			}
		}
	}

	/**
	 * @param assignee
	 * @param roles
	 */
	public void assignRoles(Assignee assignee, Role... roles) {
		for (Role role : roles) {
			if (role != null) {
				if (!assignee.getRoles().contains(role)) {
					assignee.getRoles().add(role);
					commit();
				}
			}
		}
	}

	/**
	 * 
	 */
	public void close(boolean commit, boolean close) {

		if (session != null) {

			if (hasTemplatesWriterRole()) {
				saveXMI_Local();
			}

			if (isDirty()) {
				if (commit) {
					commit();
				} else {
					transaction.rollback();
				}
			}

			if (close) {
				try {
					// if (!transaction.isClosed()) {
					// transaction.close();
					// }
					transaction = null;
				} catch (Exception ex) {
					//
				}
				try {
					session.close();
					session = null;
				} catch (Exception ex) {
					//
				}
			}
		} else {
			saveXMI_Local();
		}

		xmiLocal = null;
	}

	public void closeConnection() {
		// try {
		// connection.close();
		// connection = null;
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	public void commit() {
		if (session != null) {
			try {
				// IProgressMonitor m = CDOObjectImpl.progressTask;
				transaction.commit(null); // m);
				// hasCommits = true;
			} catch (CommitException ex) {

				try {
					transaction.commit();

				} catch (Exception ex2) {
					try {
						transaction.rollback();
						ex.printStackTrace();
					} catch (Exception ex3) {
						// ;
					}
				}
			}
		}
		sleep(10);
	}

	// /**
	// * @param message
	// */
	// public void communicate(String message) {
	// User u = null;
	// for (EObject eo : xmiCommunication.getContents()) {
	// if (eo instanceof User) {
	// if (((User) eo).getId().equals(userId)) {
	// u = (User) eo;
	// break;
	// }
	// }
	// }
	//
	// if (u == null) {
	// u = SecurityFactory.eINSTANCE.createUser();
	// u.setId(userId);
	// u.setEmail(message);
	// xmiCommunication.getContents().add(u);
	// commit();
	// }
	// }

	/**
	*
	*/
	public String createDisplayDate(Date date) {
		return new SimpleDateFormat("EEEE MMMM DD, YYYY").format(date);
	}

	public Resource createNewOfficeDocument(RCPL joffice, String templateName) {
		Resource template = findDocument(joffice, templateName);
		if (template != null) {

			if (findOpenedDocument(joffice, templateName) == null) {
				getOpenedResources(joffice).add(template);
			}
			commit();
			return template;
		}
		for (Resource doc : findTemplatesFolder(joffice).getResources()) {
			if (doc instanceof Resource && templateName.equals(doc.getId())) {
				Resource eNewDocument = EcoreUtil.copy(doc);
				eNewDocument.setMainPerspective(findPerspective(perspektiveType));
				// eNewDocument.layout();
				addDocument(joffice, eNewDocument);
				commit();
				return eNewDocument;

			}
		}
		return null;
	}

	/**
	 * @param role
	 * @param path
	 * @param patternStyle
	 * @param access
	 * @param clear
	 */
	protected void createPermissionFilter(Role role, String path, PatternStyle patternStyle, Access access,
			boolean clear) {
		EList<Permission> permissions = role.getPermissions();
		if (clear) {
			permissions.clear();
		} else {
			for (Permission p : permissions) {
				if (p instanceof FilterPermission) {
					FilterPermission f = (FilterPermission) p;
					for (PermissionFilter pf : f.getFilters()) {
						if (pf instanceof ResourceFilter) {
							ResourceFilter r = (ResourceFilter) pf;
							if (r.getPath().equals(path) && r.getPatternStyle().equals(patternStyle)
									&& access.equals(p.getAccess())) {
								return;
							}
						}
					}
				}
			}
		}

		FilterPermission permission = SecurityFactory.eINSTANCE.createFilterPermission();
		ResourceFilter resourceFilter = SecurityFactory.eINSTANCE.createResourceFilter(path, patternStyle);
		permission.getFilters().add(resourceFilter);
		permission.setAccess(access);
		permissions.add(permission);
	}

	private CDOResource createResource(CDOTransaction cdoTransaction) throws CommitException {
		// CDOResource cdoResource = transaction.createResource("/res1");
		// cdoTransaction.commit();
		// factory.initRepository();
		// cdoTransaction.commit();
		// return cdoResource;
		return null;
	}

	private Statement createStatement() {
		try {
			Statement s = connection.createStatement();
			return s;
			// }
			// catch (MySQLNonTransientConnectionException e) {
			// connection = null;
			// connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param outStream
	 * @param buf
	 * @param byteRead
	 * @param byteWritten
	 * @param progress
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private void downloadBuf(OutputStream outStream, byte[] buf, int[] byteRead, int[] byteWritten) throws IOException {
		outStream.write(buf, 0, byteRead[0]);
		byteWritten[0] += byteRead[0];
		// if (progress && JOUtil.getAbstractOfficePane() != null) {
		// JOAbstractOfficePane.getInstance().updateProgressBar();
		// if (JOAbstractOfficePane.getInstance().getProgressSelection() >=
		// 1000) {
		// JOAbstractOfficePane.getInstance().setProgress(0);
		// }
		// }
	}

	public AbstractTool findAbstractTool(RCPL joffice, String id) {
		try {
			for (ToolGroup g : joffice.getAllTools().getToolgroupChildren()) {
				AbstractTool t = findAbstractTool2(g, id);
				if (t != null) {
					return t;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public AbstractTool findAbstractTool2(AbstractTool tool, String id) {
		if (tool == null) {
			return null;
		}
		if (tool.getId() == null) {
			println("Tool without ID!:" + tool.getName());
			return null;
		}
		try {
			if (tool.getId().equals(id)) {
				return tool;
			}
			if (tool instanceof ToolGroup) {

				ToolGroup tg = (ToolGroup) tool;
				for (ToolGroup g : tg.getToolGroups()) {
					if (g.getId() != null && g.getId().equals(id)) {
						return g;
					}
					AbstractTool at = findAbstractTool2(g, id);
					if (at != null) {
						return at;
					}
				}
				for (Tool t : tg.getTools()) {
					if (t.getId() != null && t.getId().equals(id)) {
						return t;
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public Resource findDocument(RCPL joffice, String name) {
		for (Folder folder : joffice.getAllResources().getChildren()) {
			for (Resource doc : folder.getResources()) {
				if (doc instanceof Resource && doc.getId().equals(name)) {
					return doc;
				}
			}
			for (Resource doc : folder.getLinkedResources()) {
				if (doc instanceof Resource && doc.getId().equals(name)) {
					return doc;
				}
			}
		}
		return null;
	}

	@SuppressWarnings("unused")
	private EObject findEObject(String table, String idName, String id) {
		List<EObject> eObjects = findEObjects(table, idName, id);
		if (eObjects.size() > 1) {
			// TODO: ERROR
			return eObjects.get(0);
		}
		if (eObjects.size() == 1) {
			return eObjects.get(0);
		}
		return null;
	}

	public List<EObject> findEObjects(String table) {
		return findEObjects(table, null, null);
	}

	/**
	 * @param table
	 * @param idName
	 * @param id
	 * @return
	 */
	public List<EObject> findEObjects(String table, String idName, String id) {
		List<EObject> eObjects = new ArrayList<EObject>();
		Statement s = null;
		try {
			s = createStatement();
			String sqlString = "SELECT * FROM " + DB_NAME + "." + table;
			if (id != null && id.length() > 0) {
				sqlString += " where " + idName + " = '" + id + "'";
			}
			s.executeQuery(sqlString);
			ResultSet rs = s.getResultSet();
			while (rs.next()) {
				int idVal = (int) rs.getDouble("cdo_id");
				EObject eObject = xmiCDO.getEObject("L" + idVal);
				eObjects.add(eObject);
			}
			rs.close();
			s.close();
		} catch (SQLException e) {
		} catch (Exception e) {
			//
			if (s == null || connection == null) {
				// connect();
				if (connection != null) {
					return findEObjects(table, idName, id);
				}
			}
		}
		return eObjects;
	}

	public Folder findMyDocumentsFolder() {
		return findMyDocumentsFolder(rcpl);
	}

	public Folder findMyDocumentsFolder(RCPL joffice) {
		for (Folder e : joffice.getAllResources().getChildren()) {
			if (JOFactory.MY_DOCUMENTS_FOLDER.equals(e.getId())) {
				return e;
			}
		}
		return null;
	}

	public Resource findOfficeDocumentTemplate(RCPL joffice, String id) {
		for (Resource doc : findTemplatesFolder(joffice).getResources()) {
			if (doc instanceof Resource && id.equals(doc.getId())) {
				return doc;
			}
		}
		return null;
	}

	private RCPL findOfficeTemplate(String id) {
		for (EObject o : getContents()) {
			if (o instanceof RCPL) {
				RCPL jo = (RCPL) o;
				if (id.equals(jo.getId())) {
					return jo;
				}
			}
		}
		return null;
	}

	public Resource findOpenedDocument(RCPL joffice, String name) {
		for (Resource doc : getOpenedResources(joffice)) {
			if (doc instanceof Resource && doc.getId().equals(name)) {
				return doc;
			}
		}
		return null;
	}

	public Resource findOpenedDocument(String name) {
		return findOpenedDocument(rcpl, name);
	}

	public Resource findOpenedDocumentByUri(RCPL joffice, String uri) {
		for (Resource doc : getOpenedResources(joffice)) {
			if (doc instanceof Resource && doc.getUri().equals(uri)) {
				return doc;
			}
		}
		return null;
	}

	public Resource findOpenedDocumentByUri(String uri) {
		return findOpenedDocumentByUri(rcpl, uri);
	}

	public Perspective findPerspective(String id) {
		for (Perspective p : rcpl.getAllPerspectives().getChildren()) {
			if (id.equalsIgnoreCase(p.getId())) {
				return p;
			}
		}

		if (PERSPECTIVE_OVERVIEW.getId().equals(id)) {
			if (PERSPECTIVE_OVERVIEW.getSideToolBar().getToolGroups().isEmpty()) {
				for (Perspective p2 : rcpl.getAllPerspectives().getChildren()) {
					ToolGroup pt = RcplFactory.eINSTANCE.createToolGroup();
					pt.setId(SWITCH_TO_PERSPECTIVE_AND_CREATE_DOCUMENT_IF_NEEDED + p2.getId());
					pt.setImage(p2.getId().toLowerCase());
					pt.setDescription(p2.getDescription());
					PERSPECTIVE_OVERVIEW.getSideToolBar().getToolGroups().add(pt);
				}
			}

			ToolGroup pt = RcplFactory.eINSTANCE.createToolGroup();
			pt.setId("logout");
			pt.setImage("logout");
			PERSPECTIVE_OVERVIEW.getSideToolBar().getToolGroups().add(pt);

			return PERSPECTIVE_OVERVIEW;
		}

		return null;
	}

	public Folder findTemplatesFolder(RCPL joffice) {
		for (Folder e : joffice.getAllResources().getChildren()) {
			if (JOFactory.TEMPLATE_FOLDER.equals(e.getId())) {
				return e;
			}
		}
		return null;
	}

	public Tool findTool(RCPL joffice, String id) {
		AbstractTool t = findAbstractTool(joffice, id);
		if (t instanceof Tool) {
			return (Tool) t;
		}
		return null;
	}

	public ToolGroup findToolGroup(RCPL joffice, String id) {
		AbstractTool t = findAbstractTool(joffice, id);
		if (t instanceof ToolGroup) {
			return (ToolGroup) t;
		}
		return null;
	}

	/**
	 * @param sideToolBar
	 * @param id
	 * @return
	 */
	public ToolGroup findToolGroup(SideToolBar sideToolBar, String id) {
		for (ToolGroup g : sideToolBar.getToolGroups()) {
			String gid = g.getId();
			if (id.equals(gid)) {
				return g;
			}
		}
		return null;
	}

	/**
	 * @param topToolBar
	 * @param id
	 * @return
	 */
	public ToolGroup findToolGroup(TopToolBar topToolBar, String id) {
		if (topToolBar != null) {
			for (ToolGroup g : topToolBar.getToolGroups()) {
				if (id.equals(g.getId())) {
					return g;
				}
			}
		}
		return null;
	}

	public User findUser(String id) {
		return getRealm().getUser(id);
	}

	/**
	*
	*/
	public String formatAmount(double amount, String currency) {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		Currency curr = Currency.getInstance(currency);
		numberFormat.setCurrency(curr);
		String result = numberFormat.format(amount);
		return result;
	}
	//
	// public static void main(String[] args) {
	// // try {
	// // RapCDOSession session = new RapCDOSession();
	// // session.initCdoSession();
	// // session.createLogin("ramin_" + System.currentTimeMillis(), "123");
	// // session.close(true);
	// // } catch (CommitException e) {
	// // }
	//
	// }

	public String getCacheDir() {
		if (cacheDir == null) {
			cacheDir = System.getProperty("user.home") + "/.rcpl/cache";
			new File(cacheDir).mkdirs();
		}
		return cacheDir;
	}

	/**
	*
	*/
	public EObject getCdoObject(String key) {
		String uriFragment = cdoIds.get(key);
		EObject eo = getResource().getEObject(uriFragment);
		return eo;
	}

	/**
	*
	*/
	public EObject getCdoObjectFromId(String id) {
		EObject eObject = getResource().getEObject("L" + id);
		return eObject;
	}

	public String getCodeBase() {
		return codeBase;
	}

	public EList<EObject> getContents() {
		if (getResource() == null) {
			return null;
		}
		return getResource().getContents();
	}

	protected Directory getDirectory() {
		if (directory == null) {
			CDOResource security = transaction.getResource("security");
			TreeIterator<EObject> it = security.getAllContents();
			while (it.hasNext()) {
				EObject eo = it.next();
				if (eo instanceof Directory) {
					directory = (Directory) eo;
					// break;
				}
			}

			// User connectedUser = getRealm().getUser("user2");
			// UserPassword password = connectedUser.getPassword();
			// String encryptedPassword = password.getEncrypted();

			// if (password == null) {
			// password = SecurityFactory.eINSTANCE.createUserPassword();
			// // password.setEncrypted(value);
			// connectedUser.setPassword(password);
			// }
			// transaction.commit();
		}
		return directory;
	}

	public JOFactory getFactory() {
		return factory;
	}

	public org.eclipse.emf.ecore.resource.Resource getLocalResource() {
		return xmiLocal;
	}

	// private EOfficeVersion findVersion() {
	// for (EObject o : getContents()) {
	// if (o instanceof EOfficeVersion) {
	// return (EOfficeVersion) o;
	// }
	// }
	// return null;
	// }

	/**
	 * @return
	 */
	public Logins getLogins() {
		if (getContents() == null) {
			return null;
		}
		if (logins == null) {
			for (EObject o : getContents()) {
				if (o instanceof Logins) {
					logins = (Logins) o;
					break;
				}
			}
		}
		return logins;
	}

	public List<Resource> getMyResources(RCPL joffice) {
		for (Folder e : joffice.getAllResources().getChildren()) {
			if (e instanceof Folder) {
				if (JOFactory.MY_DOCUMENTS_FOLDER.equals(e.getId())) {
					return e.getResources();
				}
			}
		}
		return null;
	}

	// public Company getCompany() {
	// if (company == null) {
	// for (EObject o : getContents()) {
	// if (o instanceof Company) {
	// company = (Company) o;
	// break;
	// }
	// }
	// }
	// return company;
	// }

	public EList<Plugin> getOfficeParts(RCPL joffice) {
		return joffice.getAllPlugins().getChildren();
	}

	// public double getDouble(JOKey key) {
	// String v = getString(key);
	// if (v == null) {
	// return 0;
	// }
	// try {
	// return Double.valueOf(v);
	// } catch (Exception ex) {
	// return 0;
	// }
	// }

	public List<Resource> getOpenedResources() {
		return getOpenedResources(rcpl);
	}

	public List<Resource> getOpenedResources(RCPL joffice) {
		for (Folder f : joffice.getAllResources().getChildren()) {
			for (Resource e : f.getResources()) {
				if (JOFactory.RECENTLY_OPENED_DOCUMENTS_FOLDER.equals(e.getId())) {
					return e.getLinkedResources();
				}
			}
			for (Resource e : f.getLinkedResources()) {
				if (JOFactory.RECENTLY_OPENED_DOCUMENTS_FOLDER.equals(e.getId())) {
					return e.getLinkedResources();
				}
			}
		}
		return null;
	}

	public Group getOrCreateGroup(String id) {
		Group g = getRealm().getGroup(id);
		if (g == null) {
			g = getRealm().addGroup(id);
			commit();
		}
		return g;
	}

	/**
	 * @param id
	 * @return
	 */
	public Role getOrCreateRole(String id) {
		try {
			Role r = getRealm().getRole(id);
			if (r == null) {
				r = getRealm().addRole(id);
				commit();
			}
			return r;
		} catch (Exception ex) {
			return null;
		}
	}

	public User getOrCreateUser(String id, String newPassword) {
		User u = getRealm().getUser(id);
		if (u == null) {
			u = getRealm().addUser(id);
			setUserPasswordIfNotSet(id, newPassword);
			commit();
		} else if (newPassword != null) {

			// credentials = createCredentials(userID, password.toCharArray());
			// getRealm().removeUser(id);
			// commit();
			// u = getRealm().addUser(id);
			// setUserPasswordIfNotSet(id, newPassword);
			// commit();

			// UserPassword pass = u.getPassword(); //
			// SecurityFactory.eINSTANCE.createUserPassword();
			// pass.setEncrypted(newPassword);
			// u.setPassword(pass);
			// commit();
		}
		return u;
	}

	public String getPassword() {
		return password;
	}

	public String getPerspektiveType() {
		return perspektiveType;
	}

	public Perspective getPresentationPerspective() {
		if (presentationPerspective == null) {
			presentationPerspective = findPerspective("PRESENTATION");
		}
		return presentationPerspective;
	}

	/**
	 * @return
	 */
	public RCPL getRcpl() {
		if (rcpl == null) {
			try {
				for (EObject eo : getResource().getContents()) {
					if (eo instanceof RCPL) {
						rcpl = (RCPL) eo;
						this.systemPreferences = new JOSystemPreferences();
						this.userPreferences = new JOUserPreferences();
						break;
					}
				}
			} catch (Exception ex) {

			}
		}
		return rcpl;
	}

	protected Realm getRealm() {
		try {
			if (realm == null) {
				CDOResource security = transaction.getResource("security");
				TreeIterator<EObject> it = security.getAllContents();
				while (it.hasNext()) {
					EObject eo = it.next();
					if (eo instanceof Realm) {
						realm = (Realm) eo;
						break;
					}
				}
			}
		} catch (Exception ex) {
			// user has no rights
		}
		return realm;
	}

	public org.eclipse.emf.ecore.resource.Resource getResource() {
		if (xmiCDO != null) {
			return xmiCDO;
		}
		return xmiLocal;
	}

	public List<String> getRoleIds() {
		List<String> result = new ArrayList<String>();
		if (user != null) {
			for (Role r : user.getRoles()) {
				result.add(r.getId());
			}

			for (Group g : user.getGroups()) {
				for (Role r : g.getRoles()) {
					result.add(r.getId());
				}
			}
		}

		return result;
	}

	public CDOSession getSession() {
		return session;
	}

	public Perspective getSettingsPerspective() {
		if (settingsPerspective == null) {
			settingsPerspective = findPerspective("SETTINGS");
		}
		return settingsPerspective;
	}

	// public String getString(JOKey key) {
	// if (getJoffice() == null) {
	// return key.toString();
	// }
	// for (EPreference pref : getJoffice().getPreferences().getChildren()) {
	// if (key.name().equals(pref.getKey())) {
	// return pref.getValue();
	// }
	// }
	// return null;
	// }

	public Perspective getSpreadsheetPerspective() {
		if (spreadsheetPerspective == null) {
			spreadsheetPerspective = findPerspective("SPREADSHEET");
		}
		return spreadsheetPerspective;
	}

	public JOSystemPreferences getSystemPreferences() {
		if (systemPreferences == null) {
			systemPreferences = new JOSystemPreferences();
		}
		return systemPreferences;
	}

	public CDOTransaction getTransaction() {
		return transaction;
	}

	public User getUser() {
		return user;
	}

	public JOUserPreferences getUserPreferences() {
		if (userPreferences == null) {
			userPreferences = new JOUserPreferences();
		}
		return userPreferences;
	}

	public Perspective getWebPerspective() {
		if (webPerspective == null) {
			webPerspective = findPerspective("WEB");
		}
		return webPerspective;
	}

	public Perspective getWordPerspective() {
		if (wordPerspective == null) {
			wordPerspective = findPerspective("WORD");
		}
		return wordPerspective;
	}

	public boolean hasRole(String roleId) {
		if (user != null) {
			try {
				for (Role r : user.getRoles()) {
					String userRoleId = r.getId();
					if (userRoleId != null && userRoleId.equals(roleId)) {
						return true;
					}
				}
				for (Group g : user.getGroups()) {
					for (Role r : g.getRoles()) {
						String userRoleId = r.getId();
						if (userRoleId.equals(roleId)) {
							return true;
						}
					}
				}

			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return false;
	}

	private boolean hasTemplatesWriterRole() {

		if ("templates".equals(userId)) {
			return true;
		}

		// try {
		// if (session != null) {
		// for (Role r : user.getRoles()) {
		// if (ROLE_TEMPLATES_WRITER.equals(r.getId())) {
		// return true;
		// }
		// }
		//
		// // for (Group g : user.getGroups()) {
		// // for (Role r : g.getRoles()) {
		// // if (ROLE_TEMPLATES_WRITER.equals(r.getId())) {
		// // return true;
		// // }
		// // }
		// // }
		// }
		// } catch (Exception ex) {
		// // obviously no rights
		// }
		return false;
	}

	public boolean isDemo() {
		return "demo".equals(userId);
	}

	/**
	 * @return
	 */
	public boolean isDirty() {
		return !transaction.isClosed() && transaction.isDirty();
	}

	public boolean isOnline() {
		return transaction != null && !transaction.isClosed();
	}

	public boolean isValid() {
		if (xmiCDO != null) {
			return transaction == null || !transaction.isClosed();
		}
		return xmiLocal != null;
	}

	public boolean launchedByJNLP() {

		return true;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void loadJOfficeXMI_Local() {

		try {
			ResourceSet rs = new ResourceSetImpl();
			ComposedAdapterFactory adapterFactory;
			adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			adapterFactory.addAdapterFactory(new RcplItemProviderAdapterFactory());

			adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
			AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(adapterFactory,
					new BasicCommandStack());

			rs = domain.getResourceSet();

			File localXMIFile = new File(RCPLModel.mobileProvider.getApplicationDir(),
					RCPLModel.XMIName + RCPLModel.XMI_EXTENSION);
			// localXMIFile.delete();

			if (FORCE_NEW_XMI || !localXMIFile.exists()) {

				try {
					copyInputStream(
							RCPLModel.modelClass.getResourceAsStream(RCPLModel.XMIName + RCPLModel.XMI_EXTENSION),
							localXMIFile);
				} catch (Throwable ex) {
					RCPLModel.logError(ex);
				}
			}

			if (localXMIFile.exists()) {
				RCPLModel.log(this, "XMI File: " + localXMIFile.getAbsolutePath() + " exists");
			}

			URI xmiURI = URI.createFileURI(localXMIFile.getAbsolutePath());
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMLResourceFactoryImpl());
			xmiLocal = rs.createResource(xmiURI);
			xmiLocal.setURI(xmiURI);
			// for performance reason, don't ask
			((ResourceImpl) xmiLocal).setIntrinsicIDToEObjectMap(new HashMap());
			// xmiLocal = new XMIResourceImpl();

			xmiLocal.load(new FileInputStream(localXMIFile), new HashMap<Object, Object>());
		} catch (Throwable e) {
			String msg = e.getMessage();
			if (msg.indexOf("Feature 'version' not found") != -1) {
				return;
			}
			RCPLModel.logError(e);
		}

	}

	/**
	 * @param user
	 * @param password
	 * @throws Throwable
	 */
	public void openSessionAndTransaction(String id, String password) throws Throwable {

		try {
			OMPlatform.INSTANCE.setDebugging(false);
			OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
			OMPlatform.INSTANCE.addTraceHandler(PrintTraceHandler.CONSOLE);
			IManagedContainer container = ContainerUtil.createContainer();
			Net4jUtil.prepareContainer(container);
			TCPUtil.prepareContainer(container);
			CDONet4jUtil.prepareContainer(container);
			container.activate();
			IConnector connector = TCPUtil.getConnector(container, CDO_SERVER); // $NON-NLS-1$
			configuration = CDONet4jUtil.createNet4jSessionConfiguration();

			configuration.setConnector(connector);
			configuration.setRepositoryName(REPOSITORY); // $NON-NLS-1$
			IPasswordCredentialsProvider credentialsProvider = new PasswordCredentialsProvider(id, password);
			configuration.setCredentialsProvider(credentialsProvider);
			session = configuration.openNet4jSession();
			registerPackages();
			transaction = session.openTransaction();
		} catch (LifecycleException ex) {
			// Server is not running
		}
	}

	/**
	*
	*/
	public void putCdoId(String key, EObject eObject) {
		String uriFragment = getResource().getURIFragment(eObject);
		cdoIds.put(key, uriFragment);
	}

	/**
	 * 
	 */
	public void registerPackages() throws Throwable {

		RcplPackage.eINSTANCE.eClass();
		// SdPackage.eINSTANCE.eClass();
		SecurityPackage.eINSTANCE.eClass();

		if (session != null) {
			session.getPackageRegistry().putEPackage(RcplPackage.eINSTANCE);
			// session.getPackageRegistry().putEPackage(SdPackage.eINSTANCE);
			session.getPackageRegistry().putEPackage(SecurityPackage.eINSTANCE);
			session.getPackageRegistry().putEPackage(EcorePackage.eINSTANCE);
			session.getPackageRegistry().putEPackage(ExpressionsPackage.eINSTANCE);
			session.getPackageRegistry().putEPackage(EtypesPackage.eINSTANCE);
		}

	}

	// JOSession.xmiFile = new File(System.getProperty("user.dir"),
	// "joffice.xmi");
	//
	// LOGGER.debug(JOSession.xmiFile.toString());
	//
	// if (!JOSession.xmiFile.exists()) {
	// // copy
	//
	// InputStream stream = JOfficeStandalone.class
	// .getResourceAsStream("/com/joffice/templates/joffice.xmi");
	// if (stream == null) {
	// // send your exception or warning
	// }
	// OutputStream resStreamOut = null;
	// int readBytes;
	// byte[] buffer = new byte[4096];
	// try {
	// resStreamOut = new FileOutputStream(JOSession.xmiFile);
	// while ((readBytes = stream.read(buffer)) > 0) {
	// resStreamOut.write(buffer, 0, readBytes);
	// }
	// } catch (IOException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// } finally {
	// try {
	// stream.close();
	// if (resStreamOut != null) {
	// resStreamOut.close();
	// }
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// }

	public void removeCdoId(String key) {
		cdoIds.remove(key);
	}

	public void requestRegistration(String password) {
		if ("demo".equals(userId)) {
			return;
		}

		new SignInClient().signIn(userId, password);

		// openSessionAndTransaction(GROUPCOMM, COMM1 + COMM2);
		// xmiCommunication = transaction
		// .getOrCreateResource("/communication/communication.xmi");
		// //$NON-NLS-1$
		// communicate(MESSAGE_REGISTRATION);
		// x

	}

	public void rollback() {
		transaction.rollback();
	}

	private void saveXMI_Local() {

		if (xmiLocal != null

		// && (xmiLocal.isModified() || hasTemplatesWriterRole())) {

		) {

			try {
				// copy content from a cdo user to the local user storage
				if (xmiCDO != null && !xmiCDO.getContents().isEmpty()) { // &&
																			// !hasTemplatesWriterRole())
																			// {

					while (!xmiLocal.getContents().isEmpty()) {
						xmiLocal.getContents().remove(0);
					}

					for (EObject eo : xmiCDO.getContents()) {
						EObject eo2 = EcoreUtil.copy(eo);
						xmiLocal.getContents().add(eo2);
					}
					File localXMIFile = new File(
							"C:/Users/ramin/Documents/wss/rcpl/org.eclipse.rcpl.model_2_0_0/src/org/eclipse/rcpl/model/"
									+ RCPLModel.XMIName + RCPLModel.XMI_EXTENSION);
					// System.getProperty("user.home"), "joffice.xmi");
					URI xmiURI = URI.createFileURI(localXMIFile.getAbsolutePath());
					xmiLocal.setURI(xmiURI);
					xmiLocal.save(Collections.EMPTY_MAP);
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public void setLogins(Logins logins) {
		this.logins = logins;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPerspektiveType(String perspektiveType) {
		this.perspektiveType = perspektiveType;
	}

	public void setUser(User user) {
		this.user = user;
	}

	protected void setUserPassword(String userId, String pass) {
		User user = getRealm().getUser(userId);
		UserPassword password = user.getPassword();
		password = SecurityFactory.eINSTANCE.createUserPassword();
		password.setEncrypted(pass);
		user.setPassword(password);
		commit();
	}

	// private void createPermissionFilter(Assignee role, String path,
	// PatternStyle patternStyle, Access access, boolean clear) {
	// EList<Permission> permissions = role.getPermissions();
	// if (clear) {
	// permissions.clear();
	// }
	// FilterPermission permission = SecurityFactory.eINSTANCE
	// .createFilterPermission();
	// ResourceFilter resourceFilter = SecurityFactory.eINSTANCE
	// .createResourceFilter(path, patternStyle);
	// permission.getFilters().add(resourceFilter);
	// permission.setAccess(access);
	// permissions.add(permission);
	// }
	protected void setUserPasswordIfNotSet(String userId, String pass) {
		User user = getRealm().getUser(userId);
		UserPassword password = user.getPassword();
		if (password == null) {
			password = SecurityFactory.eINSTANCE.createUserPassword();
			password.setEncrypted(pass);
			user.setPassword(password);
			// String encryptedPassword = password.getEncrypted();s
		}
	}

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param register
	 * @throws Throwable
	 */
	public boolean start() throws Throwable {

		loadJOfficeXMI_Local();
		if ("demo".equals(userId) || "".equals(userId)) {
			return true;
		}
		try {

			openSessionAndTransaction(userId, password);

			if (!isOnline()) {
				return false;
			}

			try {
				user = getRealm().getUser(userId);
			} catch (Exception ex) {
				// user has no right
			}

			xmiCDO = transaction
					.getOrCreateResource("/home/" + userId + "/" + RCPLModel.XMIName + RCPLModel.XMI_EXTENSION); //$NON-NLS-1$

		} catch (CDOException ex) {
			return false;
		} catch (LifecycleException ex) {
			return false;
		} catch (SecurityException ex) {
			if (!USER_ADMINISTRATOR.equals(userId)) {
				return false;
			}
		} catch (Exception ex) {
			return false;
		}

		if (getContents().isEmpty()) {
			DEBUG_RECREATE = true;
		}

		if (DEBUG_RECREATE) {
			while (!getContents().isEmpty()) {
				getContents().remove(0);
			}
			EList<EObject> cont = null;

			cont = xmiLocal.getContents();

			for (EObject eo : cont) {
				EObject eo2 = EcoreUtil.copy(eo);
				if (eo2 instanceof RCPL) {
					getContents().add(eo2);
					break;
				}
			}

			commit();
		}

		return true;
	}

	/**
	 * @return
	 */
	protected boolean valid() {
		if (session == null) {
			return false;
		}
		if (getContents() == null) {
			return false;
		}
		return true;
	}

	public boolean isReachable() {
		return reachable;
	}

	public void setReachable(boolean reachable) {
		this.reachable = reachable;
	}

	/**
	 * @param in
	 * @param out
	 * @throws IOException
	 */
	public static final String copyInputStream(InputStream in, File outFile) throws IOException {
		if (in == null) {
			return null;
		}
		byte[] buffer = new byte[1024];

		FileOutputStream fos = new FileOutputStream(outFile);

		int len;
		while ((len = in.read(buffer)) >= 0) {
			fos.write(buffer, 0, len);
		}

		String result = "";

		in.close();
		fos.close();
		return result;
	}
}
