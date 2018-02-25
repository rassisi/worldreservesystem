/*
 * An XML document type.
 * Localname: SignatureInfoV1
 * Namespace: http://schemas.microsoft.com/office/2006/digsig
 * Java type: com.microsoft.schemas.office.x2006.digsig.SignatureInfoV1Document
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.digsig.impl;
/**
 * A document containing one SignatureInfoV1(@http://schemas.microsoft.com/office/2006/digsig) element.
 *
 * This is a complex type.
 */
public class SignatureInfoV1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.x2006.digsig.SignatureInfoV1Document
{
    
    public SignatureInfoV1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNATUREINFOV1$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureInfoV1");
    
    
    /**
     * Gets the "SignatureInfoV1" element
     */
    public com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 getSignatureInfoV1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1)get_store().find_element_user(SIGNATUREINFOV1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SignatureInfoV1" element
     */
    public void setSignatureInfoV1(com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 signatureInfoV1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1)get_store().find_element_user(SIGNATUREINFOV1$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1)get_store().add_element_user(SIGNATUREINFOV1$0);
            }
            target.set(signatureInfoV1);
        }
    }
    
    /**
     * Appends and returns a new empty "SignatureInfoV1" element
     */
    public com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 addNewSignatureInfoV1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1)get_store().add_element_user(SIGNATUREINFOV1$0);
            return target;
        }
    }
}
