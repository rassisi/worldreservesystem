/*
 * An XML document type.
 * Localname: dateSubmitted
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.DateSubmittedDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one dateSubmitted(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class DateSubmittedDocumentImpl extends org.purl.dc.elements.x11.impl.DateDocumentImpl implements org.purl.dc.terms.DateSubmittedDocument
{
    
    public DateSubmittedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATESUBMITTED$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "dateSubmitted");
    
    
    /**
     * Gets the "dateSubmitted" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getDateSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(DATESUBMITTED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dateSubmitted" element
     */
    public void setDateSubmitted(org.purl.dc.elements.x11.SimpleLiteral dateSubmitted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(DATESUBMITTED$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(DATESUBMITTED$0);
            }
            target.set(dateSubmitted);
        }
    }
    
    /**
     * Appends and returns a new empty "dateSubmitted" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewDateSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(DATESUBMITTED$0);
            return target;
        }
    }
}
