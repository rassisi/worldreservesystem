/*
 * An XML document type.
 * Localname: Reference
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.w3.x2000.x09.xmldsig.ReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2000.x09.xmldsig.impl;
/**
 * A document containing one Reference(@http://www.w3.org/2000/09/xmldsig#) element.
 *
 * This is a complex type.
 */
public class ReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2000.x09.xmldsig.ReferenceDocument
{
    
    public ReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Reference");
    
    
    /**
     * Gets the "Reference" element
     */
    public org.w3.x2000.x09.xmldsig.ReferenceType getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2000.x09.xmldsig.ReferenceType target = null;
            target = (org.w3.x2000.x09.xmldsig.ReferenceType)get_store().find_element_user(REFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Reference" element
     */
    public void setReference(org.w3.x2000.x09.xmldsig.ReferenceType reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2000.x09.xmldsig.ReferenceType target = null;
            target = (org.w3.x2000.x09.xmldsig.ReferenceType)get_store().find_element_user(REFERENCE$0, 0);
            if (target == null)
            {
                target = (org.w3.x2000.x09.xmldsig.ReferenceType)get_store().add_element_user(REFERENCE$0);
            }
            target.set(reference);
        }
    }
    
    /**
     * Appends and returns a new empty "Reference" element
     */
    public org.w3.x2000.x09.xmldsig.ReferenceType addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2000.x09.xmldsig.ReferenceType target = null;
            target = (org.w3.x2000.x09.xmldsig.ReferenceType)get_store().add_element_user(REFERENCE$0);
            return target;
        }
    }
}
