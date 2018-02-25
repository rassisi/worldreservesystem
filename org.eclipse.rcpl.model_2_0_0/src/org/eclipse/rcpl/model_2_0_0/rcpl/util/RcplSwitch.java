/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.rcpl.model_2_0_0.rcpl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage
 * @generated
 */
public class RcplSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RcplPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RcplSwitch() {
		if (modelPackage == null) {
			modelPackage = RcplPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RcplPackage.LAYOUTABLE: {
				Layoutable layoutable = (Layoutable)theEObject;
				T result = caseLayoutable(layoutable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.RCPL: {
				RCPL rcpl = (RCPL)theEObject;
				T result = caseRCPL(rcpl);
				if (result == null) result = caseLayoutable(rcpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.PERSPECTIVES: {
				Perspectives perspectives = (Perspectives)theEObject;
				T result = casePerspectives(perspectives);
				if (result == null) result = caseLayoutable(perspectives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.PERSPECTIVE: {
				Perspective perspective = (Perspective)theEObject;
				T result = casePerspective(perspective);
				if (result == null) result = caseLayoutable(perspective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.PREFERENCE: {
				Preference preference = (Preference)theEObject;
				T result = casePreference(preference);
				if (result == null) result = caseLayoutable(preference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.LOGINS: {
				Logins logins = (Logins)theEObject;
				T result = caseLogins(logins);
				if (result == null) result = caseLayoutable(logins);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.LOGIN: {
				Login login = (Login)theEObject;
				T result = caseLogin(login);
				if (result == null) result = caseLayoutable(login);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.FAVORITES: {
				Favorites favorites = (Favorites)theEObject;
				T result = caseFavorites(favorites);
				if (result == null) result = caseLayoutable(favorites);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.FAVORITE: {
				Favorite favorite = (Favorite)theEObject;
				T result = caseFavorite(favorite);
				if (result == null) result = caseLayoutable(favorite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.FAVORITES_GROUP: {
				FavoritesGroup favoritesGroup = (FavoritesGroup)theEObject;
				T result = caseFavoritesGroup(favoritesGroup);
				if (result == null) result = caseLayoutable(favoritesGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.PREFERENCES: {
				Preferences preferences = (Preferences)theEObject;
				T result = casePreferences(preferences);
				if (result == null) result = caseLayoutable(preferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.PLUGINS: {
				Plugins plugins = (Plugins)theEObject;
				T result = casePlugins(plugins);
				if (result == null) result = caseLayoutable(plugins);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.PLUGIN: {
				Plugin plugin = (Plugin)theEObject;
				T result = casePlugin(plugin);
				if (result == null) result = caseLayoutable(plugin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.ABSTRACT_TOOL: {
				AbstractTool abstractTool = (AbstractTool)theEObject;
				T result = caseAbstractTool(abstractTool);
				if (result == null) result = caseLayoutable(abstractTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseAbstractTool(tool);
				if (result == null) result = caseLayoutable(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.TOOL_GROUP: {
				ToolGroup toolGroup = (ToolGroup)theEObject;
				T result = caseToolGroup(toolGroup);
				if (result == null) result = caseAbstractTool(toolGroup);
				if (result == null) result = caseLayoutable(toolGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.TOOLS: {
				Tools tools = (Tools)theEObject;
				T result = caseTools(tools);
				if (result == null) result = caseLayoutable(tools);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.QUICK_TOOLS: {
				QuickTools quickTools = (QuickTools)theEObject;
				T result = caseQuickTools(quickTools);
				if (result == null) result = caseLayoutable(quickTools);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.TOP_TOOL_BAR: {
				TopToolBar topToolBar = (TopToolBar)theEObject;
				T result = caseTopToolBar(topToolBar);
				if (result == null) result = caseLayoutable(topToolBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.SIDE_TOOL_BAR: {
				SideToolBar sideToolBar = (SideToolBar)theEObject;
				T result = caseSideToolBar(sideToolBar);
				if (result == null) result = caseLayoutable(sideToolBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.QUICK_TOOL_BAR: {
				QuickToolBar quickToolBar = (QuickToolBar)theEObject;
				T result = caseQuickToolBar(quickToolBar);
				if (result == null) result = caseLayoutable(quickToolBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.FOLDER: {
				Folder folder = (Folder)theEObject;
				T result = caseFolder(folder);
				if (result == null) result = caseLayoutable(folder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseLayoutable(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseLayoutable(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.PERSON_GROUP: {
				PersonGroup personGroup = (PersonGroup)theEObject;
				T result = casePersonGroup(personGroup);
				if (result == null) result = caseLayoutable(personGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.RESOURCES: {
				Resources resources = (Resources)theEObject;
				T result = caseResources(resources);
				if (result == null) result = caseLayoutable(resources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.PREFERENCE_GROUP: {
				PreferenceGroup preferenceGroup = (PreferenceGroup)theEObject;
				T result = casePreferenceGroup(preferenceGroup);
				if (result == null) result = caseLayoutable(preferenceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.PERSONS: {
				Persons persons = (Persons)theEObject;
				T result = casePersons(persons);
				if (result == null) result = caseLayoutable(persons);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.RCPL_TEMPLATES: {
				RCPLTemplates rcplTemplates = (RCPLTemplates)theEObject;
				T result = caseRCPLTemplates(rcplTemplates);
				if (result == null) result = caseLayoutable(rcplTemplates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.JPERSON: {
				JPerson jPerson = (JPerson)theEObject;
				T result = caseJPerson(jPerson);
				if (result == null) result = casePerson(jPerson);
				if (result == null) result = caseLayoutable(jPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.NPERSON: {
				NPerson nPerson = (NPerson)theEObject;
				T result = caseNPerson(nPerson);
				if (result == null) result = casePerson(nPerson);
				if (result == null) result = caseLayoutable(nPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = caseLayoutable(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.COUNTRY: {
				Country country = (Country)theEObject;
				T result = caseCountry(country);
				if (result == null) result = caseLayoutable(country);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.CITY: {
				City city = (City)theEObject;
				T result = caseCity(city);
				if (result == null) result = caseLayoutable(city);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.GEO: {
				Geo geo = (Geo)theEObject;
				T result = caseGeo(geo);
				if (result == null) result = caseLayoutable(geo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.WORLD_REGION: {
				WorldRegion worldRegion = (WorldRegion)theEObject;
				T result = caseWorldRegion(worldRegion);
				if (result == null) result = caseLayoutable(worldRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.STREET: {
				Street street = (Street)theEObject;
				T result = caseStreet(street);
				if (result == null) result = caseLayoutable(street);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.HOUSE_NUMBER: {
				HouseNumber houseNumber = (HouseNumber)theEObject;
				T result = caseHouseNumber(houseNumber);
				if (result == null) result = caseLayoutable(houseNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.BUILDING: {
				Building building = (Building)theEObject;
				T result = caseBuilding(building);
				if (result == null) result = caseLayoutable(building);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.CONTACT: {
				Contact contact = (Contact)theEObject;
				T result = caseContact(contact);
				if (result == null) result = caseLayoutable(contact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.PHONE: {
				Phone phone = (Phone)theEObject;
				T result = casePhone(phone);
				if (result == null) result = caseLayoutable(phone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.DOMAINS: {
				Domains domains = (Domains)theEObject;
				T result = caseDomains(domains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RcplPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layoutable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layoutable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutable(Layoutable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RCPL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RCPL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRCPL(RCPL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspectives</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspectives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspectives(Perspectives object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspective(Perspective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreference(Preference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logins</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logins</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogins(Logins object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogin(Login object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Favorites</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Favorites</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFavorites(Favorites object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Favorite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Favorite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFavorite(Favorite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Favorites Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Favorites Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFavoritesGroup(FavoritesGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreferences(Preferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugins</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugins</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlugins(Plugins object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlugin(Plugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTool(AbstractTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolGroup(ToolGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tools</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tools</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTools(Tools object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quick Tools</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quick Tools</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuickTools(QuickTools object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Tool Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Tool Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopToolBar(TopToolBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Side Tool Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Side Tool Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSideToolBar(SideToolBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quick Tool Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quick Tool Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuickToolBar(QuickToolBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolder(Folder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonGroup(PersonGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResources(Resources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preference Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preference Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreferenceGroup(PreferenceGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersons(Persons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RCPL Templates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RCPL Templates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRCPLTemplates(RCPLTemplates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JPerson</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JPerson</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJPerson(JPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NPerson</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NPerson</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNPerson(NPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountry(Country object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>City</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCity(City object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeo(Geo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>World Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>World Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorldRegion(WorldRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Street</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Street</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreet(Street object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>House Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>House Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHouseNumber(HouseNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Building</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilding(Building object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContact(Contact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhone(Phone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomains(Domains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RcplSwitch
