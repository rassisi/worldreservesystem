/*
 * An XML document type.
 * Localname: hasVersion
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.HasVersionDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one hasVersion(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class HasVersionDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.HasVersionDocument
{
    
    public HasVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HASVERSION$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasVersion");
    
    
    /**
     * Gets the "hasVersion" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getHasVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(HASVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hasVersion" element
     */
    public void setHasVersion(org.purl.dc.elements.x11.SimpleLiteral hasVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(HASVERSION$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(HASVERSION$0);
            }
            target.set(hasVersion);
        }
    }
    
    /**
     * Appends and returns a new empty "hasVersion" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewHasVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(HASVERSION$0);
            return target;
        }
    }
}
