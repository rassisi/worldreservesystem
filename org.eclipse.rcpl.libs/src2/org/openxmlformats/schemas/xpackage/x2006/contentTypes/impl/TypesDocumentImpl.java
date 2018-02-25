/*
 * An XML document type.
 * Localname: Types
 * Namespace: http://schemas.openxmlformats.org/package/2006/content-types
 * Java type: org.openxmlformats.schemas.xpackage.x2006.contentTypes.TypesDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.xpackage.x2006.contentTypes.impl;
/**
 * A document containing one Types(@http://schemas.openxmlformats.org/package/2006/content-types) element.
 *
 * This is a complex type.
 */
public class TypesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.xpackage.x2006.contentTypes.TypesDocument
{
    
    public TypesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPES$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/content-types", "Types");
    
    
    /**
     * Gets the "Types" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes getTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes)get_store().find_element_user(TYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Types" element
     */
    public void setTypes(org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes types)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes)get_store().find_element_user(TYPES$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes)get_store().add_element_user(TYPES$0);
            }
            target.set(types);
        }
    }
    
    /**
     * Appends and returns a new empty "Types" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes addNewTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes)get_store().add_element_user(TYPES$0);
            return target;
        }
    }
}
