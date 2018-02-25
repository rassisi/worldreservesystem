/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.rcpl.model_2_0_0.rcpl.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class RcplFactoryImpl extends EFactoryImpl implements RcplFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static RcplFactory init() {
		try {
			RcplFactory theRcplFactory = (RcplFactory) EPackage.Registry.INSTANCE.getEFactory(RcplPackage.eNS_URI);
			if (theRcplFactory != null) {
				return theRcplFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RcplFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public RcplFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RcplPackage.RCPL:
			return createRCPL();
		case RcplPackage.PERSPECTIVES:
			return createPerspectives();
		case RcplPackage.PERSPECTIVE:
			return createPerspective();
		case RcplPackage.PREFERENCE:
			return createPreference();
		case RcplPackage.LOGINS:
			return createLogins();
		case RcplPackage.LOGIN:
			return createLogin();
		case RcplPackage.FAVORITES:
			return createFavorites();
		case RcplPackage.FAVORITE:
			return createFavorite();
		case RcplPackage.FAVORITES_GROUP:
			return createFavoritesGroup();
		case RcplPackage.PREFERENCES:
			return createPreferences();
		case RcplPackage.PLUGINS:
			return createPlugins();
		case RcplPackage.PLUGIN:
			return createPlugin();
		case RcplPackage.TOOL:
			return createTool();
		case RcplPackage.TOOL_GROUP:
			return createToolGroup();
		case RcplPackage.TOOLS:
			return createTools();
		case RcplPackage.QUICK_TOOLS:
			return createQuickTools();
		case RcplPackage.TOP_TOOL_BAR:
			return createTopToolBar();
		case RcplPackage.SIDE_TOOL_BAR:
			return createSideToolBar();
		case RcplPackage.QUICK_TOOL_BAR:
			return createQuickToolBar();
		case RcplPackage.FOLDER:
			return createFolder();
		case RcplPackage.RESOURCE:
			return createResource();
		case RcplPackage.PERSON:
			return createPerson();
		case RcplPackage.PERSON_GROUP:
			return createPersonGroup();
		case RcplPackage.RESOURCES:
			return createResources();
		case RcplPackage.PREFERENCE_GROUP:
			return createPreferenceGroup();
		case RcplPackage.PERSONS:
			return createPersons();
		case RcplPackage.RCPL_TEMPLATES:
			return createRCPLTemplates();
		case RcplPackage.JPERSON:
			return createJPerson();
		case RcplPackage.NPERSON:
			return createNPerson();
		case RcplPackage.ADDRESS:
			return createAddress();
		case RcplPackage.COUNTRY:
			return createCountry();
		case RcplPackage.CITY:
			return createCity();
		case RcplPackage.GEO:
			return createGeo();
		case RcplPackage.WORLD_REGION:
			return createWorldRegion();
		case RcplPackage.STREET:
			return createStreet();
		case RcplPackage.HOUSE_NUMBER:
			return createHouseNumber();
		case RcplPackage.BUILDING:
			return createBuilding();
		case RcplPackage.CONTACT:
			return createContact();
		case RcplPackage.PHONE:
			return createPhone();
		case RcplPackage.DOMAINS:
			return createDomains();
		case RcplPackage.DOMAIN:
			return createDomain();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RcplPackage.TOOL_TYPE:
			return createToolTypeFromString(eDataType, initialValue);
		case RcplPackage.FONT_STYLES:
			return createFontStylesFromString(eDataType, initialValue);
		case RcplPackage.TOOL_BAR_REPLACEMENT_POLICY:
			return createToolBarReplacementPolicyFromString(eDataType, initialValue);
		case RcplPackage.GROUP_TYPE:
			return createGroupTypeFromString(eDataType, initialValue);
		case RcplPackage.ADDRESS_TYPE:
			return createAddressTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RcplPackage.TOOL_TYPE:
			return convertToolTypeToString(eDataType, instanceValue);
		case RcplPackage.FONT_STYLES:
			return convertFontStylesToString(eDataType, instanceValue);
		case RcplPackage.TOOL_BAR_REPLACEMENT_POLICY:
			return convertToolBarReplacementPolicyToString(eDataType, instanceValue);
		case RcplPackage.GROUP_TYPE:
			return convertGroupTypeToString(eDataType, instanceValue);
		case RcplPackage.ADDRESS_TYPE:
			return convertAddressTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public RCPL createRCPL() {
		RCPLImpl rcpl = new RCPLImpl();
		return rcpl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Perspectives createPerspectives() {
		PerspectivesImpl perspectives = new PerspectivesImpl();
		return perspectives;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Perspective createPerspective() {
		PerspectiveImpl perspective = new PerspectiveImpl();
		return perspective;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Preference createPreference() {
		PreferenceImpl preference = new PreferenceImpl();
		return preference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Logins createLogins() {
		LoginsImpl logins = new LoginsImpl();
		return logins;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Login createLogin() {
		LoginImpl login = new LoginImpl();
		return login;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Favorites createFavorites() {
		FavoritesImpl favorites = new FavoritesImpl();
		return favorites;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Favorite createFavorite() {
		FavoriteImpl favorite = new FavoriteImpl();
		return favorite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public FavoritesGroup createFavoritesGroup() {
		FavoritesGroupImpl favoritesGroup = new FavoritesGroupImpl();
		return favoritesGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Preferences createPreferences() {
		PreferencesImpl preferences = new PreferencesImpl();
		return preferences;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Plugins createPlugins() {
		PluginsImpl plugins = new PluginsImpl();
		return plugins;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Plugin createPlugin() {
		PluginImpl plugin = new PluginImpl();
		return plugin;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		tool.setLeaf(true);
		return tool;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ToolGroup createToolGroup() {
		ToolGroupImpl toolGroup = new ToolGroupImpl();
		return toolGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Tools createTools() {
		ToolsImpl tools = new ToolsImpl();
		return tools;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QuickTools createQuickTools() {
		QuickToolsImpl quickTools = new QuickToolsImpl();
		return quickTools;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public TopToolBar createTopToolBar() {
		TopToolBarImpl topToolBar = new TopToolBarImpl();
		return topToolBar;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public SideToolBar createSideToolBar() {
		SideToolBarImpl sideToolBar = new SideToolBarImpl();
		return sideToolBar;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QuickToolBar createQuickToolBar() {
		QuickToolBarImpl quickToolBar = new QuickToolBarImpl();
		return quickToolBar;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PersonGroup createPersonGroup() {
		PersonGroupImpl personGroup = new PersonGroupImpl();
		return personGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Resources createResources() {
		ResourcesImpl resources = new ResourcesImpl();
		return resources;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PreferenceGroup createPreferenceGroup() {
		PreferenceGroupImpl preferenceGroup = new PreferenceGroupImpl();
		return preferenceGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Persons createPersons() {
		PersonsImpl persons = new PersonsImpl();
		return persons;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public RCPLTemplates createRCPLTemplates() {
		RCPLTemplatesImpl rcplTemplates = new RCPLTemplatesImpl();
		return rcplTemplates;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public JPerson createJPerson() {
		JPersonImpl jPerson = new JPersonImpl();
		return jPerson;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NPerson createNPerson() {
		NPersonImpl nPerson = new NPersonImpl();
		return nPerson;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Geo createGeo() {
		GeoImpl geo = new GeoImpl();
		return geo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public WorldRegion createWorldRegion() {
		WorldRegionImpl worldRegion = new WorldRegionImpl();
		return worldRegion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Street createStreet() {
		StreetImpl street = new StreetImpl();
		return street;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public HouseNumber createHouseNumber() {
		HouseNumberImpl houseNumber = new HouseNumberImpl();
		return houseNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Building createBuilding() {
		BuildingImpl building = new BuildingImpl();
		return building;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Phone createPhone() {
		PhoneImpl phone = new PhoneImpl();
		return phone;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Domains createDomains() {
		DomainsImpl domains = new DomainsImpl();
		return domains;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ToolType createToolTypeFromString(EDataType eDataType, String initialValue) {
		ToolType result = ToolType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertToolTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FontStyles createFontStylesFromString(EDataType eDataType, String initialValue) {
		FontStyles result = FontStyles.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertFontStylesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ToolBarReplacementPolicy createToolBarReplacementPolicyFromString(EDataType eDataType, String initialValue) {
		ToolBarReplacementPolicy result = ToolBarReplacementPolicy.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertToolBarReplacementPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GroupType createGroupTypeFromString(EDataType eDataType, String initialValue) {
		GroupType result = GroupType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertGroupTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AddressType createAddressTypeFromString(EDataType eDataType, String initialValue) {
		AddressType result = AddressType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAddressTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public RcplPackage getRcplPackage() {
		return (RcplPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RcplPackage getPackage() {
		return RcplPackage.eINSTANCE;
	}

} // RcplFactoryImpl
