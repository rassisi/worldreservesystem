/*
 * An XML document type.
 * Localname: valid
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.ValidDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one valid(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class ValidDocumentImpl extends org.purl.dc.elements.x11.impl.DateDocumentImpl implements org.purl.dc.terms.ValidDocument
{
    
    public ValidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALID$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "valid");
    
    
    /**
     * Gets the "valid" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(VALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valid" element
     */
    public void setValid(org.purl.dc.elements.x11.SimpleLiteral valid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(VALID$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(VALID$0);
            }
            target.set(valid);
        }
    }
    
    /**
     * Appends and returns a new empty "valid" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(VALID$0);
            return target;
        }
    }
}
