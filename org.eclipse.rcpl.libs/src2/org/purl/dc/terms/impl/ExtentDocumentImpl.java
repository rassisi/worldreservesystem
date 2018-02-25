/*
 * An XML document type.
 * Localname: extent
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.ExtentDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one extent(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class ExtentDocumentImpl extends org.purl.dc.elements.x11.impl.FormatDocumentImpl implements org.purl.dc.terms.ExtentDocument
{
    
    public ExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENT$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "extent");
    
    
    /**
     * Gets the "extent" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    public void setExtent(org.purl.dc.elements.x11.SimpleLiteral extent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(EXTENT$0);
            }
            target.set(extent);
        }
    }
    
    /**
     * Appends and returns a new empty "extent" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(EXTENT$0);
            return target;
        }
    }
}
