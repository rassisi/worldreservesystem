/*
 * An XML document type.
 * Localname: dateCopyrighted
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.DateCopyrightedDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one dateCopyrighted(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class DateCopyrightedDocumentImpl extends org.purl.dc.elements.x11.impl.DateDocumentImpl implements org.purl.dc.terms.DateCopyrightedDocument
{
    
    public DateCopyrightedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATECOPYRIGHTED$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "dateCopyrighted");
    
    
    /**
     * Gets the "dateCopyrighted" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getDateCopyrighted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(DATECOPYRIGHTED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dateCopyrighted" element
     */
    public void setDateCopyrighted(org.purl.dc.elements.x11.SimpleLiteral dateCopyrighted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(DATECOPYRIGHTED$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(DATECOPYRIGHTED$0);
            }
            target.set(dateCopyrighted);
        }
    }
    
    /**
     * Appends and returns a new empty "dateCopyrighted" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewDateCopyrighted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(DATECOPYRIGHTED$0);
            return target;
        }
    }
}
