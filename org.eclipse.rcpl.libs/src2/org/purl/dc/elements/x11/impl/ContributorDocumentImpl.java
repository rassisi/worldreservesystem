/*
 * An XML document type.
 * Localname: contributor
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.ContributorDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one contributor(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class ContributorDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.ContributorDocument
{
    
    public ContributorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTRIBUTOR$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "contributor");
    
    
    /**
     * Gets the "contributor" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getContributor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(CONTRIBUTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contributor" element
     */
    public void setContributor(org.purl.dc.elements.x11.SimpleLiteral contributor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(CONTRIBUTOR$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(CONTRIBUTOR$0);
            }
            target.set(contributor);
        }
    }
    
    /**
     * Appends and returns a new empty "contributor" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewContributor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(CONTRIBUTOR$0);
            return target;
        }
    }
}
