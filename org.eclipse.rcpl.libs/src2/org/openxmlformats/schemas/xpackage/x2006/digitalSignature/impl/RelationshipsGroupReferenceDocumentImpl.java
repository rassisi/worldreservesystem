/*
 * An XML document type.
 * Localname: RelationshipsGroupReference
 * Namespace: http://schemas.openxmlformats.org/package/2006/digital-signature
 * Java type: org.openxmlformats.schemas.xpackage.x2006.digitalSignature.RelationshipsGroupReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.xpackage.x2006.digitalSignature.impl;
/**
 * A document containing one RelationshipsGroupReference(@http://schemas.openxmlformats.org/package/2006/digital-signature) element.
 *
 * This is a complex type.
 */
public class RelationshipsGroupReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.xpackage.x2006.digitalSignature.RelationshipsGroupReferenceDocument
{
    
    public RelationshipsGroupReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPSGROUPREFERENCE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/digital-signature", "RelationshipsGroupReference");
    
    
    /**
     * Gets the "RelationshipsGroupReference" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipsGroupReference getRelationshipsGroupReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipsGroupReference target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipsGroupReference)get_store().find_element_user(RELATIONSHIPSGROUPREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RelationshipsGroupReference" element
     */
    public void setRelationshipsGroupReference(org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipsGroupReference relationshipsGroupReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipsGroupReference target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipsGroupReference)get_store().find_element_user(RELATIONSHIPSGROUPREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipsGroupReference)get_store().add_element_user(RELATIONSHIPSGROUPREFERENCE$0);
            }
            target.set(relationshipsGroupReference);
        }
    }
    
    /**
     * Appends and returns a new empty "RelationshipsGroupReference" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipsGroupReference addNewRelationshipsGroupReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipsGroupReference target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTRelationshipsGroupReference)get_store().add_element_user(RELATIONSHIPSGROUPREFERENCE$0);
            return target;
        }
    }
}
