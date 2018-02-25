/*
 * An XML document type.
 * Localname: identifier
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.IdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one identifier(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class IdentifierDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.IdentifierDocument
{
    
    public IdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "identifier");
    private static final org.apache.xmlbeans.QNameSet IDENTIFIER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "bibliographicCitation"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "identifier"),
    });
    
    
    /**
     * Gets the "identifier" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(IDENTIFIER$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.purl.dc.elements.x11.SimpleLiteral identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(IDENTIFIER$1, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(IDENTIFIER$0);
            }
            target.set(identifier);
        }
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
}
