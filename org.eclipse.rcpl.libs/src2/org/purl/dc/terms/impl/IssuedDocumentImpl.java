/*
 * An XML document type.
 * Localname: issued
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.IssuedDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one issued(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class IssuedDocumentImpl extends org.purl.dc.elements.x11.impl.DateDocumentImpl implements org.purl.dc.terms.IssuedDocument
{
    
    public IssuedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISSUED$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "issued");
    
    
    /**
     * Gets the "issued" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ISSUED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "issued" element
     */
    public void setIssued(org.purl.dc.elements.x11.SimpleLiteral issued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ISSUED$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ISSUED$0);
            }
            target.set(issued);
        }
    }
    
    /**
     * Appends and returns a new empty "issued" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ISSUED$0);
            return target;
        }
    }
}
