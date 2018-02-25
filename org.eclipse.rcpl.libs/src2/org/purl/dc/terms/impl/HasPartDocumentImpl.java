/*
 * An XML document type.
 * Localname: hasPart
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.HasPartDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one hasPart(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class HasPartDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.HasPartDocument
{
    
    public HasPartDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HASPART$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasPart");
    
    
    /**
     * Gets the "hasPart" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getHasPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(HASPART$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hasPart" element
     */
    public void setHasPart(org.purl.dc.elements.x11.SimpleLiteral hasPart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(HASPART$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(HASPART$0);
            }
            target.set(hasPart);
        }
    }
    
    /**
     * Appends and returns a new empty "hasPart" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewHasPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(HASPART$0);
            return target;
        }
    }
}
