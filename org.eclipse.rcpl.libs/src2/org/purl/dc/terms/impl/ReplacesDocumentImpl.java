/*
 * An XML document type.
 * Localname: replaces
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.ReplacesDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one replaces(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class ReplacesDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.ReplacesDocument
{
    
    public ReplacesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPLACES$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "replaces");
    
    
    /**
     * Gets the "replaces" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getReplaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(REPLACES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "replaces" element
     */
    public void setReplaces(org.purl.dc.elements.x11.SimpleLiteral replaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(REPLACES$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(REPLACES$0);
            }
            target.set(replaces);
        }
    }
    
    /**
     * Appends and returns a new empty "replaces" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewReplaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(REPLACES$0);
            return target;
        }
    }
}
