/*
 * XML Type:  CT_KeyEncryptors
 * Namespace: http://schemas.microsoft.com/office/2006/encryption
 * Java type: com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptors
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.encryption.impl;
/**
 * An XML CT_KeyEncryptors(@http://schemas.microsoft.com/office/2006/encryption).
 *
 * This is a complex type.
 */
public class CTKeyEncryptorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptors
{
    
    public CTKeyEncryptorsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYENCRYPTOR$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/encryption", "keyEncryptor");
    
    
    /**
     * Gets a List of "keyEncryptor" elements
     */
    public java.util.List<com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor> getKeyEncryptorList()
    {
        final class KeyEncryptorList extends java.util.AbstractList<com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor>
        {
            public com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor get(int i)
                { return CTKeyEncryptorsImpl.this.getKeyEncryptorArray(i); }
            
            public com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor set(int i, com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor o)
            {
                com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor old = CTKeyEncryptorsImpl.this.getKeyEncryptorArray(i);
                CTKeyEncryptorsImpl.this.setKeyEncryptorArray(i, o);
                return old;
            }
            
            public void add(int i, com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor o)
                { CTKeyEncryptorsImpl.this.insertNewKeyEncryptor(i).set(o); }
            
            public com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor remove(int i)
            {
                com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor old = CTKeyEncryptorsImpl.this.getKeyEncryptorArray(i);
                CTKeyEncryptorsImpl.this.removeKeyEncryptor(i);
                return old;
            }
            
            public int size()
                { return CTKeyEncryptorsImpl.this.sizeOfKeyEncryptorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new KeyEncryptorList();
        }
    }
    
    /**
     * Gets array of all "keyEncryptor" elements
     */
    public com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor[] getKeyEncryptorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYENCRYPTOR$0, targetList);
            com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor[] result = new com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "keyEncryptor" element
     */
    public com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor getKeyEncryptorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor target = null;
            target = (com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor)get_store().find_element_user(KEYENCRYPTOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "keyEncryptor" element
     */
    public int sizeOfKeyEncryptorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYENCRYPTOR$0);
        }
    }
    
    /**
     * Sets array of all "keyEncryptor" element
     */
    public void setKeyEncryptorArray(com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor[] keyEncryptorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyEncryptorArray, KEYENCRYPTOR$0);
        }
    }
    
    /**
     * Sets ith "keyEncryptor" element
     */
    public void setKeyEncryptorArray(int i, com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor keyEncryptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor target = null;
            target = (com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor)get_store().find_element_user(KEYENCRYPTOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyEncryptor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "keyEncryptor" element
     */
    public com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor insertNewKeyEncryptor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor target = null;
            target = (com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor)get_store().insert_element_user(KEYENCRYPTOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "keyEncryptor" element
     */
    public com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor addNewKeyEncryptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor target = null;
            target = (com.microsoft.schemas.office.x2006.encryption.CTKeyEncryptor)get_store().add_element_user(KEYENCRYPTOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "keyEncryptor" element
     */
    public void removeKeyEncryptor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYENCRYPTOR$0, i);
        }
    }
}
