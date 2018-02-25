/*
 * An XML document type.
 * Localname: abstract
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.AbstractDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one abstract(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class AbstractDocumentImpl extends org.purl.dc.elements.x11.impl.DescriptionDocumentImpl implements org.purl.dc.terms.AbstractDocument
{
    
    public AbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACT$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "abstract");
    
    
    /**
     * Gets the "abstract" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ABSTRACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "abstract" element
     */
    public void setAbstract(org.purl.dc.elements.x11.SimpleLiteral xabstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ABSTRACT$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ABSTRACT$0);
            }
            target.set(xabstract);
        }
    }
    
    /**
     * Appends and returns a new empty "abstract" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ABSTRACT$0);
            return target;
        }
    }
}
