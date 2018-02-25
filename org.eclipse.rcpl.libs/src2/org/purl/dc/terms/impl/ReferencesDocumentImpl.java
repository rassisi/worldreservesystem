/*
 * An XML document type.
 * Localname: references
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.ReferencesDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one references(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class ReferencesDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.ReferencesDocument
{
    
    public ReferencesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCES$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "references");
    
    
    /**
     * Gets the "references" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(REFERENCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "references" element
     */
    public void setReferences(org.purl.dc.elements.x11.SimpleLiteral references)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(REFERENCES$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(REFERENCES$0);
            }
            target.set(references);
        }
    }
    
    /**
     * Appends and returns a new empty "references" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(REFERENCES$0);
            return target;
        }
    }
}
