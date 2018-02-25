/*
 * An XML document type.
 * Localname: isReferencedBy
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.IsReferencedByDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one isReferencedBy(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class IsReferencedByDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.IsReferencedByDocument
{
    
    public IsReferencedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISREFERENCEDBY$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isReferencedBy");
    
    
    /**
     * Gets the "isReferencedBy" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getIsReferencedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ISREFERENCEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "isReferencedBy" element
     */
    public void setIsReferencedBy(org.purl.dc.elements.x11.SimpleLiteral isReferencedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ISREFERENCEDBY$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ISREFERENCEDBY$0);
            }
            target.set(isReferencedBy);
        }
    }
    
    /**
     * Appends and returns a new empty "isReferencedBy" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewIsReferencedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ISREFERENCEDBY$0);
            return target;
        }
    }
}
