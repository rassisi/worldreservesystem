/*
 * XML Type:  CT_SignatureTime
 * Namespace: http://schemas.openxmlformats.org/package/2006/digital-signature
 * Java type: org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTSignatureTime
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.xpackage.x2006.digitalSignature.impl;
/**
 * An XML CT_SignatureTime(@http://schemas.openxmlformats.org/package/2006/digital-signature).
 *
 * This is a complex type.
 */
public class CTSignatureTimeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.xpackage.x2006.digitalSignature.CTSignatureTime
{
    
    public CTSignatureTimeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/digital-signature", "Format");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/digital-signature", "Value");
    
    
    /**
     * Gets the "Format" element
     */
    public java.lang.String getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Format" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STFormat xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STFormat target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STFormat)get_store().find_element_user(FORMAT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Format" element
     */
    public void setFormat(java.lang.String format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMAT$0);
            }
            target.setStringValue(format);
        }
    }
    
    /**
     * Sets (as xml) the "Format" element
     */
    public void xsetFormat(org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STFormat format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STFormat target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STFormat)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STFormat)get_store().add_element_user(FORMAT$0);
            }
            target.set(format);
        }
    }
    
    /**
     * Gets the "Value" element
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Value" element
     */
    public org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STValue xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STValue target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STValue)get_store().find_element_user(VALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Value" element
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "Value" element
     */
    public void xsetValue(org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STValue value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STValue target = null;
            target = (org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STValue)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.xpackage.x2006.digitalSignature.STValue)get_store().add_element_user(VALUE$2);
            }
            target.set(value);
        }
    }
}
