/*
 * XML Type:  CT_Types
 * Namespace: http://schemas.openxmlformats.org/package/2006/content-types
 * Java type: org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.xpackage.x2006.contentTypes.impl;
/**
 * An XML CT_Types(@http://schemas.openxmlformats.org/package/2006/content-types).
 *
 * This is a complex type.
 */
public class CTTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes
{
    
    public CTTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/content-types", "Default");
    private static final javax.xml.namespace.QName OVERRIDE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/content-types", "Override");
    
    
    /**
     * Gets a List of "Default" elements
     */
    public java.util.List<org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault> getDefaultList()
    {
        final class DefaultList extends java.util.AbstractList<org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault>
        {
            public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault get(int i)
                { return CTTypesImpl.this.getDefaultArray(i); }
            
            public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault set(int i, org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault o)
            {
                org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault old = CTTypesImpl.this.getDefaultArray(i);
                CTTypesImpl.this.setDefaultArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault o)
                { CTTypesImpl.this.insertNewDefault(i).set(o); }
            
            public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault remove(int i)
            {
                org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault old = CTTypesImpl.this.getDefaultArray(i);
                CTTypesImpl.this.removeDefault(i);
                return old;
            }
            
            public int size()
                { return CTTypesImpl.this.sizeOfDefaultArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DefaultList();
        }
    }
    
    /**
     * Gets array of all "Default" elements
     */
    public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault[] getDefaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEFAULT$0, targetList);
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault[] result = new org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Default" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault getDefaultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault)get_store().find_element_user(DEFAULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Default" element
     */
    public int sizeOfDefaultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULT$0);
        }
    }
    
    /**
     * Sets array of all "Default" element
     */
    public void setDefaultArray(org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault[] xdefaultArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xdefaultArray, DEFAULT$0);
        }
    }
    
    /**
     * Sets ith "Default" element
     */
    public void setDefaultArray(int i, org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault)get_store().find_element_user(DEFAULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Default" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault insertNewDefault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault)get_store().insert_element_user(DEFAULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Default" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault addNewDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault)get_store().add_element_user(DEFAULT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Default" element
     */
    public void removeDefault(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULT$0, i);
        }
    }
    
    /**
     * Gets a List of "Override" elements
     */
    public java.util.List<org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride> getOverrideList()
    {
        final class OverrideList extends java.util.AbstractList<org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride>
        {
            public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride get(int i)
                { return CTTypesImpl.this.getOverrideArray(i); }
            
            public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride set(int i, org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride o)
            {
                org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride old = CTTypesImpl.this.getOverrideArray(i);
                CTTypesImpl.this.setOverrideArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride o)
                { CTTypesImpl.this.insertNewOverride(i).set(o); }
            
            public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride remove(int i)
            {
                org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride old = CTTypesImpl.this.getOverrideArray(i);
                CTTypesImpl.this.removeOverride(i);
                return old;
            }
            
            public int size()
                { return CTTypesImpl.this.sizeOfOverrideArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OverrideList();
        }
    }
    
    /**
     * Gets array of all "Override" elements
     */
    public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride[] getOverrideArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OVERRIDE$2, targetList);
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride[] result = new org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Override" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride getOverrideArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride)get_store().find_element_user(OVERRIDE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Override" element
     */
    public int sizeOfOverrideArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OVERRIDE$2);
        }
    }
    
    /**
     * Sets array of all "Override" element
     */
    public void setOverrideArray(org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride[] overrideArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(overrideArray, OVERRIDE$2);
        }
    }
    
    /**
     * Sets ith "Override" element
     */
    public void setOverrideArray(int i, org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride override)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride)get_store().find_element_user(OVERRIDE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(override);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Override" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride insertNewOverride(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride)get_store().insert_element_user(OVERRIDE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Override" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride addNewOverride()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride)get_store().add_element_user(OVERRIDE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Override" element
     */
    public void removeOverride(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OVERRIDE$2, i);
        }
    }
}
