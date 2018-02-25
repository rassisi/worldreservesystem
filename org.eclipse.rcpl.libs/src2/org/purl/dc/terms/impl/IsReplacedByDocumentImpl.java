/*
 * An XML document type.
 * Localname: isReplacedBy
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.IsReplacedByDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one isReplacedBy(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class IsReplacedByDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.IsReplacedByDocument
{
    
    public IsReplacedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISREPLACEDBY$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isReplacedBy");
    
    
    /**
     * Gets the "isReplacedBy" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getIsReplacedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ISREPLACEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "isReplacedBy" element
     */
    public void setIsReplacedBy(org.purl.dc.elements.x11.SimpleLiteral isReplacedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ISREPLACEDBY$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ISREPLACEDBY$0);
            }
            target.set(isReplacedBy);
        }
    }
    
    /**
     * Appends and returns a new empty "isReplacedBy" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewIsReplacedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ISREPLACEDBY$0);
            return target;
        }
    }
}
