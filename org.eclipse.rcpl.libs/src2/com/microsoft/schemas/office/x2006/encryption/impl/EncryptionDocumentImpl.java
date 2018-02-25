/*
 * An XML document type.
 * Localname: encryption
 * Namespace: http://schemas.microsoft.com/office/2006/encryption
 * Java type: com.microsoft.schemas.office.x2006.encryption.EncryptionDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.encryption.impl;
/**
 * A document containing one encryption(@http://schemas.microsoft.com/office/2006/encryption) element.
 *
 * This is a complex type.
 */
public class EncryptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.x2006.encryption.EncryptionDocument
{
    
    public EncryptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCRYPTION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/encryption", "encryption");
    
    
    /**
     * Gets the "encryption" element
     */
    public com.microsoft.schemas.office.x2006.encryption.CTEncryption getEncryption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.encryption.CTEncryption target = null;
            target = (com.microsoft.schemas.office.x2006.encryption.CTEncryption)get_store().find_element_user(ENCRYPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "encryption" element
     */
    public void setEncryption(com.microsoft.schemas.office.x2006.encryption.CTEncryption encryption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.encryption.CTEncryption target = null;
            target = (com.microsoft.schemas.office.x2006.encryption.CTEncryption)get_store().find_element_user(ENCRYPTION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.encryption.CTEncryption)get_store().add_element_user(ENCRYPTION$0);
            }
            target.set(encryption);
        }
    }
    
    /**
     * Appends and returns a new empty "encryption" element
     */
    public com.microsoft.schemas.office.x2006.encryption.CTEncryption addNewEncryption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.encryption.CTEncryption target = null;
            target = (com.microsoft.schemas.office.x2006.encryption.CTEncryption)get_store().add_element_user(ENCRYPTION$0);
            return target;
        }
    }
}
