/*
 * An XML document type.
 * Localname: tableOfContents
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.TableOfContentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one tableOfContents(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class TableOfContentsDocumentImpl extends org.purl.dc.elements.x11.impl.DescriptionDocumentImpl implements org.purl.dc.terms.TableOfContentsDocument
{
    
    public TableOfContentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLEOFCONTENTS$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "tableOfContents");
    
    
    /**
     * Gets the "tableOfContents" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getTableOfContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(TABLEOFCONTENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tableOfContents" element
     */
    public void setTableOfContents(org.purl.dc.elements.x11.SimpleLiteral tableOfContents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(TABLEOFCONTENTS$0, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(TABLEOFCONTENTS$0);
            }
            target.set(tableOfContents);
        }
    }
    
    /**
     * Appends and returns a new empty "tableOfContents" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewTableOfContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(TABLEOFCONTENTS$0);
            return target;
        }
    }
}
