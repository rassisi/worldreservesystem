/*
 * An XML document type.
 * Localname: encryptedKey
 * Namespace: http://schemas.microsoft.com/office/2006/keyEncryptor/certificate
 * Java type: com.microsoft.schemas.office.x2006.keyEncryptor.certificate.EncryptedCertificateKey
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.keyEncryptor.certificate.impl;
/**
 * A document containing one encryptedKey(@http://schemas.microsoft.com/office/2006/keyEncryptor/certificate) element.
 *
 * This is a complex type.
 */
public class EncryptedCertificateKeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.x2006.keyEncryptor.certificate.EncryptedCertificateKey
{
    
    public EncryptedCertificateKeyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCRYPTEDCERTIFICATEKEY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/keyEncryptor/certificate", "encryptedKey");
    
    
    /**
     * Gets the "encryptedKey" element
     */
    public com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor getEncryptedCertificateKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor target = null;
            target = (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor)get_store().find_element_user(ENCRYPTEDCERTIFICATEKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "encryptedKey" element
     */
    public void setEncryptedCertificateKey(com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor encryptedCertificateKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor target = null;
            target = (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor)get_store().find_element_user(ENCRYPTEDCERTIFICATEKEY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor)get_store().add_element_user(ENCRYPTEDCERTIFICATEKEY$0);
            }
            target.set(encryptedCertificateKey);
        }
    }
    
    /**
     * Appends and returns a new empty "encryptedKey" element
     */
    public com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor addNewEncryptedCertificateKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor target = null;
            target = (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor)get_store().add_element_user(ENCRYPTEDCERTIFICATEKEY$0);
            return target;
        }
    }
}
