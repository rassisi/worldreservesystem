/*
 * An XML document type.
 * Localname: publisher
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.PublisherDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one publisher(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class PublisherDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.PublisherDocument
{
    
    public PublisherDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHER$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "publisher");
    
    
    /**
     * Gets the "publisher" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(PUBLISHER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "publisher" element
     */
    public void setPublisher(org.purl.dc.elements.x11.SimpleLiteral publisher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(PUBLISHER$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(PUBLISHER$0);
            }
            target.set(publisher);
        }
    }
    
    /**
     * Appends and returns a new empty "publisher" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(PUBLISHER$0);
            return target;
        }
    }
}
