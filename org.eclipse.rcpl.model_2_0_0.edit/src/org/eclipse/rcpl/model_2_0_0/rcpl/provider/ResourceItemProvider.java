/**
 */
package org.eclipse.rcpl.model_2_0_0.rcpl.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rcpl.model.RCPLModel;
import org.eclipse.rcpl.model_2_0_0.rcpl.RcplPackage;
import org.eclipse.rcpl.model_2_0_0.rcpl.Resource;

/**
 * This is the item provider adapter for a
 * {@link org.eclipse.rcpl.model_2_0_0.rcpl.Resource} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResourceItemProvider extends LayoutableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUriPropertyDescriptor(object);
			addTemplatePropertyDescriptor(object);
			addLinkedResourcesPropertyDescriptor(object);
			addMainPerspectivePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uri feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Resource_uri_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Resource_uri_feature",
								"_UI_Resource_type"),
						RcplPackage.Literals.RESOURCE__URI, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Template feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Resource_template_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Resource_template_feature",
								"_UI_Resource_type"),
						RcplPackage.Literals.RESOURCE__TEMPLATE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Linked Resources feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLinkedResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Resource_linkedResources_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Resource_linkedResources_feature",
								"_UI_Resource_type"),
						RcplPackage.Literals.RESOURCE__LINKED_RESOURCES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Main Perspective feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addMainPerspectivePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Resource_mainPerspective_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Resource_mainPerspective_feature",
								"_UI_Resource_type"),
						RcplPackage.Literals.RESOURCE__MAIN_PERSPECTIVE, true, false, true, null, null, null));
	}

	/**
	 * This returns Address.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {

		Resource resource = (Resource) object;
		if (resource.getUri() != null) {
			if (resource.getUri().endsWith(".docx")) {
				return RCPLModel.resources.getSvgImage("word", 24, 24).getNode();
			} else if (resource.getUri().endsWith(".xlsx")) {
				return RCPLModel.resources.getSvgImage("spreadsheet", 24, 24).getNode();
			}
			if (resource.getUri().endsWith(".pptx")) {
				return RCPLModel.resources.getSvgImage("presentation", 24, 24).getNode();
			}
		}
		return RCPLModel.resources.getSvgImage(getClass().getSimpleName().replaceAll("ItemProvider", ""), 16, 16)
				.getNode();
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {

		Resource res = (Resource) object;
		if (res.getName() != null) {
			return res.getName();
		}
		return super.getText(object);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Resource.class)) {
		case RcplPackage.RESOURCE__URI:
		case RcplPackage.RESOURCE__TEMPLATE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
