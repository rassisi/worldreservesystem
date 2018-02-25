/*
 * An XML document type.
 * Localname: audience
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.AudienceDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one audience(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class AudienceDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.terms.AudienceDocument
{
    
    public AudienceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDIENCE$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "audience");
    private static final org.apache.xmlbeans.QNameSet AUDIENCE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "mediator"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "audience"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "educationLevel"),
    });
    
    
    /**
     * Gets the "audience" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getAudience()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(AUDIENCE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "audience" element
     */
    public void setAudience(org.purl.dc.elements.x11.SimpleLiteral audience)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(AUDIENCE$1, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(AUDIENCE$0);
            }
            target.set(audience);
        }
    }
    
    /**
     * Appends and returns a new empty "audience" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewAudience()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(AUDIENCE$0);
            return target;
        }
    }
}
