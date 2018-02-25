/*
 * An XML document type.
 * Localname: accessRights
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.AccessRightsDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one accessRights(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class AccessRightsDocumentImpl extends org.purl.dc.elements.x11.impl.RightsDocumentImpl implements org.purl.dc.terms.AccessRightsDocument
{
    
    public AccessRightsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSRIGHTS$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accessRights");
    
    
    /**
     * Gets the "accessRights" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "accessRights" element
     */
    public void setAccessRights(org.purl.dc.elements.x11.SimpleLiteral accessRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ACCESSRIGHTS$0);
            }
            target.set(accessRights);
        }
    }
    
    /**
     * Appends and returns a new empty "accessRights" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ACCESSRIGHTS$0);
            return target;
        }
    }
}
