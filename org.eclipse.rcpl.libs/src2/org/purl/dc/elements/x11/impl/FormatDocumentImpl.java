/*
 * An XML document type.
 * Localname: format
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.FormatDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one format(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class FormatDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.FormatDocument
{
    
    public FormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "format");
    private static final org.apache.xmlbeans.QNameSet FORMAT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "format"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "medium"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "extent"),
    });
    
    
    /**
     * Gets the "format" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(FORMAT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "format" element
     */
    public void setFormat(org.purl.dc.elements.x11.SimpleLiteral format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(FORMAT$1, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(FORMAT$0);
            }
            target.set(format);
        }
    }
    
    /**
     * Appends and returns a new empty "format" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(FORMAT$0);
            return target;
        }
    }
}
