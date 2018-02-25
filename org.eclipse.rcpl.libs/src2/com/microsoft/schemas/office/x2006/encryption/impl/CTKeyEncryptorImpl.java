/*
 * XML Type:  CT_KeyEncryptor
 * Namespace: http://schemas.microsoft.com/office/2006/encryption
 * Java type: com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.encryption.impl;
/**
 * An XML CT_KeyEncryptor(@http://schemas.microsoft.com/office/2006/encryption).
 *
 * This is a complex type.
 */
public class CTKeyEncryptorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor
{
    
    public CTKeyEncryptorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCRYPTEDPASSWORDKEY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/keyEncryptor/password", "encryptedKey");
    private static final javax.xml.namespace.QName ENCRYPTEDCERTIFICATEKEY$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/keyEncryptor/certificate", "encryptedKey");
    private static final javax.xml.namespace.QName URI$4 = 
        new javax.xml.namespace.QName("", "uri");
    
    
    /**
     * Gets the "encryptedKey" element
     */
    public com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor getEncryptedPasswordKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor target = null;
            target = (com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor)get_store().find_element_user(ENCRYPTEDPASSWORDKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "encryptedKey" element
     */
    public boolean isSetEncryptedPasswordKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCRYPTEDPASSWORDKEY$0) != 0;
        }
    }
    
    /**
     * Sets the "encryptedKey" element
     */
    public void setEncryptedPasswordKey(com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor encryptedPasswordKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor target = null;
            target = (com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor)get_store().find_element_user(ENCRYPTEDPASSWORDKEY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor)get_store().add_element_user(ENCRYPTEDPASSWORDKEY$0);
            }
            target.set(encryptedPasswordKey);
        }
    }
    
    /**
     * Appends and returns a new empty "encryptedKey" element
     */
    public com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor addNewEncryptedPasswordKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor target = null;
            target = (com.microsoft.schemas.office.x2006.keyEncryptor.password.CTPasswordKeyEncryptor)get_store().add_element_user(ENCRYPTEDPASSWORDKEY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "encryptedKey" element
     */
    public void unsetEncryptedPasswordKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCRYPTEDPASSWORDKEY$0, 0);
        }
    }
    
    /**
     * Gets the "encryptedKey" element
     */
    public com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor getEncryptedCertificateKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor target = null;
            target = (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor)get_store().find_element_user(ENCRYPTEDCERTIFICATEKEY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "encryptedKey" element
     */
    public boolean isSetEncryptedCertificateKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCRYPTEDCERTIFICATEKEY$2) != 0;
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
            target = (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor)get_store().find_element_user(ENCRYPTEDCERTIFICATEKEY$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor)get_store().add_element_user(ENCRYPTEDCERTIFICATEKEY$2);
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
            target = (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor)get_store().add_element_user(ENCRYPTEDCERTIFICATEKEY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "encryptedKey" element
     */
    public void unsetEncryptedCertificateKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCRYPTEDCERTIFICATEKEY$2, 0);
        }
    }
    
    /**
     * Gets the "uri" attribute
     */
    public com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor.Uri.Enum getUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$4);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor.Uri.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "uri" attribute
     */
    public com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor.Uri xgetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor.Uri target = null;
            target = (com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor.Uri)get_store().find_attribute_user(URI$4);
            return target;
        }
    }
    
    /**
     * True if has "uri" attribute
     */
    public boolean isSetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URI$4) != null;
        }
    }
    
    /**
     * Sets the "uri" attribute
     */
    public void setUri(com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor.Uri.Enum uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$4);
            }
            target.setEnumValue(uri);
        }
    }
    
    /**
     * Sets (as xml) the "uri" attribute
     */
    public void xsetUri(com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor.Uri uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor.Uri target = null;
            target = (com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor.Uri)get_store().find_attribute_user(URI$4);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor.Uri)get_store().add_attribute_user(URI$4);
            }
            target.set(uri);
        }
    }
    
    /**
     * Unsets the "uri" attribute
     */
    public void unsetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URI$4);
        }
    }
    /**
     * An XML uri(@).
     *
     * This is an atomic type that is a restriction of com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor$Uri.
     */
    public static class UriImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor.Uri
    {
        
        public UriImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected UriImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
