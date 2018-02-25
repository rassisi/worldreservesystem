/*
 * XML Type:  CT_DataIntegrity
 * Namespace: http://schemas.microsoft.com/office/2006/encryption
 * Java type: com.microsoft.schemas.office.x2006.encryption.CTDataIntegrity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.encryption.impl;
/**
 * An XML CT_DataIntegrity(@http://schemas.microsoft.com/office/2006/encryption).
 *
 * This is a complex type.
 */
public class CTDataIntegrityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.x2006.encryption.CTDataIntegrity
{
    
    public CTDataIntegrityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCRYPTEDHMACKEY$0 = 
        new javax.xml.namespace.QName("", "encryptedHmacKey");
    private static final javax.xml.namespace.QName ENCRYPTEDHMACVALUE$2 = 
        new javax.xml.namespace.QName("", "encryptedHmacValue");
    
    
    /**
     * Gets the "encryptedHmacKey" attribute
     */
    public byte[] getEncryptedHmacKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCRYPTEDHMACKEY$0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "encryptedHmacKey" attribute
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetEncryptedHmacKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(ENCRYPTEDHMACKEY$0);
            return target;
        }
    }
    
    /**
     * Sets the "encryptedHmacKey" attribute
     */
    public void setEncryptedHmacKey(byte[] encryptedHmacKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCRYPTEDHMACKEY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCRYPTEDHMACKEY$0);
            }
            target.setByteArrayValue(encryptedHmacKey);
        }
    }
    
    /**
     * Sets (as xml) the "encryptedHmacKey" attribute
     */
    public void xsetEncryptedHmacKey(org.apache.xmlbeans.XmlBase64Binary encryptedHmacKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(ENCRYPTEDHMACKEY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_attribute_user(ENCRYPTEDHMACKEY$0);
            }
            target.set(encryptedHmacKey);
        }
    }
    
    /**
     * Gets the "encryptedHmacValue" attribute
     */
    public byte[] getEncryptedHmacValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCRYPTEDHMACVALUE$2);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "encryptedHmacValue" attribute
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetEncryptedHmacValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(ENCRYPTEDHMACVALUE$2);
            return target;
        }
    }
    
    /**
     * Sets the "encryptedHmacValue" attribute
     */
    public void setEncryptedHmacValue(byte[] encryptedHmacValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCRYPTEDHMACVALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCRYPTEDHMACVALUE$2);
            }
            target.setByteArrayValue(encryptedHmacValue);
        }
    }
    
    /**
     * Sets (as xml) the "encryptedHmacValue" attribute
     */
    public void xsetEncryptedHmacValue(org.apache.xmlbeans.XmlBase64Binary encryptedHmacValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_attribute_user(ENCRYPTEDHMACVALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_attribute_user(ENCRYPTEDHMACVALUE$2);
            }
            target.set(encryptedHmacValue);
        }
    }
}
