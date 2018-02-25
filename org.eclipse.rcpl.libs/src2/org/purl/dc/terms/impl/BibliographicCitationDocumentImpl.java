/*
 * An XML document type.
 * Localname: bibliographicCitation
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.BibliographicCitationDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one bibliographicCitation(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class BibliographicCitationDocumentImpl extends org.purl.dc.elements.x11.impl.IdentifierDocumentImpl implements org.purl.dc.terms.BibliographicCitationDocument
{
    
    public BibliographicCitationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BIBLIOGRAPHICCITATION$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "bibliographicCitation");
    
    
    /**
     * Gets the "bibliographicCitation" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getBibliographicCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(BIBLIOGRAPHICCITATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bibliographicCitation" element
     */
    public void setBibliographicCitation(org.purl.dc.elements.x11.SimpleLiteral bibliographicCitation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(BIBLIOGRAPHICCITATION$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(BIBLIOGRAPHICCITATION$0);
            }
            target.set(bibliographicCitation);
        }
    }
    
    /**
     * Appends and returns a new empty "bibliographicCitation" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewBibliographicCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(BIBLIOGRAPHICCITATION$0);
            return target;
        }
    }
}
