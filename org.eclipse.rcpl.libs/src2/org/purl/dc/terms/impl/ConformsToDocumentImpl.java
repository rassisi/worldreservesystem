/*
 * An XML document type.
 * Localname: conformsTo
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.ConformsToDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one conformsTo(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class ConformsToDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.ConformsToDocument
{
    
    public ConformsToDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFORMSTO$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "conformsTo");
    
    
    /**
     * Gets the "conformsTo" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getConformsTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(CONFORMSTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conformsTo" element
     */
    public void setConformsTo(org.purl.dc.elements.x11.SimpleLiteral conformsTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(CONFORMSTO$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(CONFORMSTO$0);
            }
            target.set(conformsTo);
        }
    }
    
    /**
     * Appends and returns a new empty "conformsTo" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewConformsTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(CONFORMSTO$0);
            return target;
        }
    }
}
