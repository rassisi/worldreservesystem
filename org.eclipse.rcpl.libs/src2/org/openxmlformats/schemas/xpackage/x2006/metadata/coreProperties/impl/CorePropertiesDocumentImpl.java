/*
 * An XML document type.
 * Localname: coreProperties
 * Namespace: http://schemas.openxmlformats.org/package/2006/metadata/core-properties
 * Java type: org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CorePropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.impl;
/**
 * A document containing one coreProperties(@http://schemas.openxmlformats.org/package/2006/metadata/core-properties) element.
 *
 * This is a complex type.
 */
public class CorePropertiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CorePropertiesDocument
{
    
    public CorePropertiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COREPROPERTIES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/metadata/core-properties", "coreProperties");
    
    
    /**
     * Gets the "coreProperties" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CTCoreProperties getCoreProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CTCoreProperties target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CTCoreProperties)get_store().find_element_user(COREPROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coreProperties" element
     */
    public void setCoreProperties(org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CTCoreProperties coreProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CTCoreProperties target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CTCoreProperties)get_store().find_element_user(COREPROPERTIES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CTCoreProperties)get_store().add_element_user(COREPROPERTIES$0);
            }
            target.set(coreProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "coreProperties" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CTCoreProperties addNewCoreProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CTCoreProperties target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CTCoreProperties)get_store().add_element_user(COREPROPERTIES$0);
            return target;
        }
    }
}
