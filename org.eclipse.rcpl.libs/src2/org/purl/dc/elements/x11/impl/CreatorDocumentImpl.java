/*
 * An XML document type.
 * Localname: creator
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.CreatorDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one creator(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class CreatorDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.CreatorDocument
{
    
    public CreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATOR$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "creator");
    
    
    /**
     * Gets the "creator" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(CREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "creator" element
     */
    public void setCreator(org.purl.dc.elements.x11.SimpleLiteral creator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(CREATOR$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(CREATOR$0);
            }
            target.set(creator);
        }
    }
    
    /**
     * Appends and returns a new empty "creator" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(CREATOR$0);
            return target;
        }
    }
}
