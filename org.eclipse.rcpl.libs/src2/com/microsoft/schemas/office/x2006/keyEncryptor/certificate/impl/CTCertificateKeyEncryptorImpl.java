/*
 * XML Type:  CT_CertificateKeyEncryptor
 * Namespace: http://schemas.microsoft.com/office/2006/keyEncryptor/certificate
 * Java type: com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.keyEncryptor.certificate.impl;
/**
 * An XML CT_CertificateKeyEncryptor(@http://schemas.microsoft.com/office/2006/keyEncryptor/certificate).
 *
 * This is a complex type.
 */
public class CTCertificateKeyEncryptorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor
{
    
    public CTCertificateKeyEncryptorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCRYPTEDKEYVALUE$0 = 
        new javax.xml.namespace.QName("", "encryptedKeyValue");
    private static final javax.xml.namespace.QName X509CERTIFICATE$2 = 
        new javax.xml.namespace.QName("", "X509Certificate");
    private static final javax.xml.namespace.QName CERTVERIFIER$4 = 
        new javax.xml.namespace.QName("", "certVerifier");
    
    
    /**
     * Gets the "encryptedKeyValue" attribute
     */
    public byte[] getEncryptedKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCRYPTEDKEYVALUE$0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "encryptedKeyValue" attribute
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetEncryptedKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(ENCRYPTEDKEYVALUE$0);
            return target;
        }
    }
    
    /**
     * Sets the "encryptedKeyValue" attribute
     */
    public void setEncryptedKeyValue(byte[] encryptedKeyValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCRYPTEDKEYVALUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCRYPTEDKEYVALUE$0);
            }
            target.setByteArrayValue(encryptedKeyValue);
        }
    }
    
    /**
     * Sets (as xml) the "encryptedKeyValue" attribute
     */
    public void xsetEncryptedKeyValue(org.apache.xmlbeans.XmlBase64Binary encryptedKeyValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(ENCRYPTEDKEYVALUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_attribute_user(ENCRYPTEDKEYVALUE$0);
            }
            target.set(encryptedKeyValue);
        }
    }
    
    /**
     * Gets the "X509Certificate" attribute
     */
    public byte[] getX509Certificate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(X509CERTIFICATE$2);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "X509Certificate" attribute
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetX509Certificate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(X509CERTIFICATE$2);
            return target;
        }
    }
    
    /**
     * Sets the "X509Certificate" attribute
     */
    public void setX509Certificate(byte[] x509Certificate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(X509CERTIFICATE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(X509CERTIFICATE$2);
            }
            target.setByteArrayValue(x509Certificate);
        }
    }
    
    /**
     * Sets (as xml) the "X509Certificate" attribute
     */
    public void xsetX509Certificate(org.apache.xmlbeans.XmlBase64Binary x509Certificate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(X509CERTIFICATE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_attribute_user(X509CERTIFICATE$2);
            }
            target.set(x509Certificate);
        }
    }
    
    /**
     * Gets the "certVerifier" attribute
     */
    public byte[] getCertVerifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CERTVERIFIER$4);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "certVerifier" attribute
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetCertVerifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(CERTVERIFIER$4);
            return target;
        }
    }
    
    /**
     * Sets the "certVerifier" attribute
     */
    public void setCertVerifier(byte[] certVerifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CERTVERIFIER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CERTVERIFIER$4);
            }
            target.setByteArrayValue(certVerifier);
        }
    }
    
    /**
     * Sets (as xml) the "certVerifier" attribute
     */
    public void xsetCertVerifier(org.apache.xmlbeans.XmlBase64Binary certVerifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(CERTVERIFIER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_attribute_user(CERTVERIFIER$4);
            }
            target.set(certVerifier);
        }
    }
}
