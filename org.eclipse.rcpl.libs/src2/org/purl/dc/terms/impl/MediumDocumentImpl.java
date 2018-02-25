/*
 * An XML document type.
 * Localname: medium
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.MediumDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one medium(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class MediumDocumentImpl extends org.purl.dc.elements.x11.impl.FormatDocumentImpl implements org.purl.dc.terms.MediumDocument
{
    
    public MediumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIUM$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "medium");
    
    
    /**
     * Gets the "medium" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(MEDIUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "medium" element
     */
    public void setMedium(org.purl.dc.elements.x11.SimpleLiteral medium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(MEDIUM$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(MEDIUM$0);
            }
            target.set(medium);
        }
    }
    
    /**
     * Appends and returns a new empty "medium" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(MEDIUM$0);
            return target;
        }
    }
}
