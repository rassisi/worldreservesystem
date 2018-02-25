/*
 * An XML document type.
 * Localname: isRequiredBy
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.IsRequiredByDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one isRequiredBy(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class IsRequiredByDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.IsRequiredByDocument
{
    
    public IsRequiredByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISREQUIREDBY$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isRequiredBy");
    
    
    /**
     * Gets the "isRequiredBy" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getIsRequiredBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ISREQUIREDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "isRequiredBy" element
     */
    public void setIsRequiredBy(org.purl.dc.elements.x11.SimpleLiteral isRequiredBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ISREQUIREDBY$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ISREQUIREDBY$0);
            }
            target.set(isRequiredBy);
        }
    }
    
    /**
     * Appends and returns a new empty "isRequiredBy" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewIsRequiredBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ISREQUIREDBY$0);
            return target;
        }
    }
}
