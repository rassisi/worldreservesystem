/*
 * XML Type:  CT_SignatureInfoV1
 * Namespace: http://schemas.microsoft.com/office/2006/digsig
 * Java type: com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.digsig.impl;
/**
 * An XML CT_SignatureInfoV1(@http://schemas.microsoft.com/office/2006/digsig).
 *
 * This is a complex type.
 */
public class CTSignatureInfoV1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1
{
    
    public CTSignatureInfoV1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETUPID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "SetupID");
    private static final javax.xml.namespace.QName SIGNATURETEXT$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureText");
    private static final javax.xml.namespace.QName SIGNATUREIMAGE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureImage");
    private static final javax.xml.namespace.QName SIGNATURECOMMENTS$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureComments");
    private static final javax.xml.namespace.QName WINDOWSVERSION$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "WindowsVersion");
    private static final javax.xml.namespace.QName OFFICEVERSION$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "OfficeVersion");
    private static final javax.xml.namespace.QName APPLICATIONVERSION$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "ApplicationVersion");
    private static final javax.xml.namespace.QName MONITORS$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "Monitors");
    private static final javax.xml.namespace.QName HORIZONTALRESOLUTION$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "HorizontalResolution");
    private static final javax.xml.namespace.QName VERTICALRESOLUTION$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "VerticalResolution");
    private static final javax.xml.namespace.QName COLORDEPTH$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "ColorDepth");
    private static final javax.xml.namespace.QName SIGNATUREPROVIDERID$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureProviderId");
    private static final javax.xml.namespace.QName SIGNATUREPROVIDERURL$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureProviderUrl");
    private static final javax.xml.namespace.QName SIGNATUREPROVIDERDETAILS$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureProviderDetails");
    private static final javax.xml.namespace.QName SIGNATURETYPE$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureType");
    private static final javax.xml.namespace.QName DELEGATESUGGESTEDSIGNER$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "DelegateSuggestedSigner");
    private static final javax.xml.namespace.QName DELEGATESUGGESTEDSIGNER2$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "DelegateSuggestedSigner2");
    private static final javax.xml.namespace.QName DELEGATESUGGESTEDSIGNEREMAIL$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "DelegateSuggestedSignerEmail");
    private static final javax.xml.namespace.QName MANIFESTHASHALGORITHM$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/office/2006/digsig", "ManifestHashAlgorithm");
    
    
    /**
     * Gets the "SetupID" element
     */
    public java.lang.String getSetupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETUPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SetupID" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces xgetSetupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces)get_store().find_element_user(SETUPID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SetupID" element
     */
    public void setSetupID(java.lang.String setupID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SETUPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SETUPID$0);
            }
            target.setStringValue(setupID);
        }
    }
    
    /**
     * Sets (as xml) the "SetupID" element
     */
    public void xsetSetupID(com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces setupID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces)get_store().find_element_user(SETUPID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces)get_store().add_element_user(SETUPID$0);
            }
            target.set(setupID);
        }
    }
    
    /**
     * Gets the "SignatureText" element
     */
    public java.lang.String getSignatureText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURETEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SignatureText" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STSignatureText xgetSignatureText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureText target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureText)get_store().find_element_user(SIGNATURETEXT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SignatureText" element
     */
    public void setSignatureText(java.lang.String signatureText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURETEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATURETEXT$2);
            }
            target.setStringValue(signatureText);
        }
    }
    
    /**
     * Sets (as xml) the "SignatureText" element
     */
    public void xsetSignatureText(com.microsoft.schemas.office.x2006.digsig.STSignatureText signatureText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureText target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureText)get_store().find_element_user(SIGNATURETEXT$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STSignatureText)get_store().add_element_user(SIGNATURETEXT$2);
            }
            target.set(signatureText);
        }
    }
    
    /**
     * Gets the "SignatureImage" element
     */
    public byte[] getSignatureImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREIMAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "SignatureImage" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetSignatureImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SIGNATUREIMAGE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SignatureImage" element
     */
    public void setSignatureImage(byte[] signatureImage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREIMAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATUREIMAGE$4);
            }
            target.setByteArrayValue(signatureImage);
        }
    }
    
    /**
     * Sets (as xml) the "SignatureImage" element
     */
    public void xsetSignatureImage(org.apache.xmlbeans.XmlBase64Binary signatureImage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SIGNATUREIMAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(SIGNATUREIMAGE$4);
            }
            target.set(signatureImage);
        }
    }
    
    /**
     * Gets the "SignatureComments" element
     */
    public java.lang.String getSignatureComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURECOMMENTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SignatureComments" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STSignatureComments xgetSignatureComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureComments target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureComments)get_store().find_element_user(SIGNATURECOMMENTS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SignatureComments" element
     */
    public void setSignatureComments(java.lang.String signatureComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURECOMMENTS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATURECOMMENTS$6);
            }
            target.setStringValue(signatureComments);
        }
    }
    
    /**
     * Sets (as xml) the "SignatureComments" element
     */
    public void xsetSignatureComments(com.microsoft.schemas.office.x2006.digsig.STSignatureComments signatureComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureComments target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureComments)get_store().find_element_user(SIGNATURECOMMENTS$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STSignatureComments)get_store().add_element_user(SIGNATURECOMMENTS$6);
            }
            target.set(signatureComments);
        }
    }
    
    /**
     * Gets the "WindowsVersion" element
     */
    public java.lang.String getWindowsVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDOWSVERSION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WindowsVersion" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STVersion xgetWindowsVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STVersion target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().find_element_user(WINDOWSVERSION$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WindowsVersion" element
     */
    public void setWindowsVersion(java.lang.String windowsVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDOWSVERSION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WINDOWSVERSION$8);
            }
            target.setStringValue(windowsVersion);
        }
    }
    
    /**
     * Sets (as xml) the "WindowsVersion" element
     */
    public void xsetWindowsVersion(com.microsoft.schemas.office.x2006.digsig.STVersion windowsVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STVersion target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().find_element_user(WINDOWSVERSION$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().add_element_user(WINDOWSVERSION$8);
            }
            target.set(windowsVersion);
        }
    }
    
    /**
     * Gets the "OfficeVersion" element
     */
    public java.lang.String getOfficeVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFICEVERSION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OfficeVersion" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STVersion xgetOfficeVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STVersion target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().find_element_user(OFFICEVERSION$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OfficeVersion" element
     */
    public void setOfficeVersion(java.lang.String officeVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFICEVERSION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFICEVERSION$10);
            }
            target.setStringValue(officeVersion);
        }
    }
    
    /**
     * Sets (as xml) the "OfficeVersion" element
     */
    public void xsetOfficeVersion(com.microsoft.schemas.office.x2006.digsig.STVersion officeVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STVersion target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().find_element_user(OFFICEVERSION$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().add_element_user(OFFICEVERSION$10);
            }
            target.set(officeVersion);
        }
    }
    
    /**
     * Gets the "ApplicationVersion" element
     */
    public java.lang.String getApplicationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONVERSION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ApplicationVersion" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STVersion xgetApplicationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STVersion target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().find_element_user(APPLICATIONVERSION$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ApplicationVersion" element
     */
    public void setApplicationVersion(java.lang.String applicationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPLICATIONVERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPLICATIONVERSION$12);
            }
            target.setStringValue(applicationVersion);
        }
    }
    
    /**
     * Sets (as xml) the "ApplicationVersion" element
     */
    public void xsetApplicationVersion(com.microsoft.schemas.office.x2006.digsig.STVersion applicationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STVersion target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().find_element_user(APPLICATIONVERSION$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STVersion)get_store().add_element_user(APPLICATIONVERSION$12);
            }
            target.set(applicationVersion);
        }
    }
    
    /**
     * Gets the "Monitors" element
     */
    public int getMonitors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONITORS$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Monitors" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STPositiveInteger xgetMonitors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(MONITORS$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Monitors" element
     */
    public void setMonitors(int monitors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONITORS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONITORS$14);
            }
            target.setIntValue(monitors);
        }
    }
    
    /**
     * Sets (as xml) the "Monitors" element
     */
    public void xsetMonitors(com.microsoft.schemas.office.x2006.digsig.STPositiveInteger monitors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(MONITORS$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().add_element_user(MONITORS$14);
            }
            target.set(monitors);
        }
    }
    
    /**
     * Gets the "HorizontalResolution" element
     */
    public int getHorizontalResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORIZONTALRESOLUTION$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "HorizontalResolution" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STPositiveInteger xgetHorizontalResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(HORIZONTALRESOLUTION$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HorizontalResolution" element
     */
    public void setHorizontalResolution(int horizontalResolution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HORIZONTALRESOLUTION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HORIZONTALRESOLUTION$16);
            }
            target.setIntValue(horizontalResolution);
        }
    }
    
    /**
     * Sets (as xml) the "HorizontalResolution" element
     */
    public void xsetHorizontalResolution(com.microsoft.schemas.office.x2006.digsig.STPositiveInteger horizontalResolution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(HORIZONTALRESOLUTION$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().add_element_user(HORIZONTALRESOLUTION$16);
            }
            target.set(horizontalResolution);
        }
    }
    
    /**
     * Gets the "VerticalResolution" element
     */
    public int getVerticalResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERTICALRESOLUTION$18, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "VerticalResolution" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STPositiveInteger xgetVerticalResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(VERTICALRESOLUTION$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VerticalResolution" element
     */
    public void setVerticalResolution(int verticalResolution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERTICALRESOLUTION$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERTICALRESOLUTION$18);
            }
            target.setIntValue(verticalResolution);
        }
    }
    
    /**
     * Sets (as xml) the "VerticalResolution" element
     */
    public void xsetVerticalResolution(com.microsoft.schemas.office.x2006.digsig.STPositiveInteger verticalResolution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(VERTICALRESOLUTION$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().add_element_user(VERTICALRESOLUTION$18);
            }
            target.set(verticalResolution);
        }
    }
    
    /**
     * Gets the "ColorDepth" element
     */
    public int getColorDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLORDEPTH$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ColorDepth" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STPositiveInteger xgetColorDepth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(COLORDEPTH$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ColorDepth" element
     */
    public void setColorDepth(int colorDepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLORDEPTH$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLORDEPTH$20);
            }
            target.setIntValue(colorDepth);
        }
    }
    
    /**
     * Sets (as xml) the "ColorDepth" element
     */
    public void xsetColorDepth(com.microsoft.schemas.office.x2006.digsig.STPositiveInteger colorDepth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STPositiveInteger target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().find_element_user(COLORDEPTH$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STPositiveInteger)get_store().add_element_user(COLORDEPTH$20);
            }
            target.set(colorDepth);
        }
    }
    
    /**
     * Gets the "SignatureProviderId" element
     */
    public java.lang.String getSignatureProviderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREPROVIDERID$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SignatureProviderId" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces xgetSignatureProviderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces)get_store().find_element_user(SIGNATUREPROVIDERID$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SignatureProviderId" element
     */
    public void setSignatureProviderId(java.lang.String signatureProviderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREPROVIDERID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATUREPROVIDERID$22);
            }
            target.setStringValue(signatureProviderId);
        }
    }
    
    /**
     * Sets (as xml) the "SignatureProviderId" element
     */
    public void xsetSignatureProviderId(com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces signatureProviderId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces)get_store().find_element_user(SIGNATUREPROVIDERID$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces)get_store().add_element_user(SIGNATUREPROVIDERID$22);
            }
            target.set(signatureProviderId);
        }
    }
    
    /**
     * Gets the "SignatureProviderUrl" element
     */
    public java.lang.String getSignatureProviderUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREPROVIDERURL$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SignatureProviderUrl" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl xgetSignatureProviderUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl)get_store().find_element_user(SIGNATUREPROVIDERURL$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SignatureProviderUrl" element
     */
    public void setSignatureProviderUrl(java.lang.String signatureProviderUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREPROVIDERURL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATUREPROVIDERURL$24);
            }
            target.setStringValue(signatureProviderUrl);
        }
    }
    
    /**
     * Sets (as xml) the "SignatureProviderUrl" element
     */
    public void xsetSignatureProviderUrl(com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl signatureProviderUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl)get_store().find_element_user(SIGNATUREPROVIDERURL$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl)get_store().add_element_user(SIGNATUREPROVIDERURL$24);
            }
            target.set(signatureProviderUrl);
        }
    }
    
    /**
     * Gets the "SignatureProviderDetails" element
     */
    public int getSignatureProviderDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREPROVIDERDETAILS$26, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SignatureProviderDetails" element
     */
    public org.apache.xmlbeans.XmlInt xgetSignatureProviderDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SIGNATUREPROVIDERDETAILS$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SignatureProviderDetails" element
     */
    public void setSignatureProviderDetails(int signatureProviderDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREPROVIDERDETAILS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATUREPROVIDERDETAILS$26);
            }
            target.setIntValue(signatureProviderDetails);
        }
    }
    
    /**
     * Sets (as xml) the "SignatureProviderDetails" element
     */
    public void xsetSignatureProviderDetails(org.apache.xmlbeans.XmlInt signatureProviderDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SIGNATUREPROVIDERDETAILS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SIGNATUREPROVIDERDETAILS$26);
            }
            target.set(signatureProviderDetails);
        }
    }
    
    /**
     * Gets the "SignatureType" element
     */
    public int getSignatureType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURETYPE$28, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SignatureType" element
     */
    public com.microsoft.schemas.office.x2006.digsig.STSignatureType xgetSignatureType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureType target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureType)get_store().find_element_user(SIGNATURETYPE$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SignatureType" element
     */
    public void setSignatureType(int signatureType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURETYPE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATURETYPE$28);
            }
            target.setIntValue(signatureType);
        }
    }
    
    /**
     * Sets (as xml) the "SignatureType" element
     */
    public void xsetSignatureType(com.microsoft.schemas.office.x2006.digsig.STSignatureType signatureType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.STSignatureType target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.STSignatureType)get_store().find_element_user(SIGNATURETYPE$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.office.x2006.digsig.STSignatureType)get_store().add_element_user(SIGNATURETYPE$28);
            }
            target.set(signatureType);
        }
    }
    
    /**
     * Gets the "DelegateSuggestedSigner" element
     */
    public java.lang.String getDelegateSuggestedSigner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELEGATESUGGESTEDSIGNER$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DelegateSuggestedSigner" element
     */
    public org.apache.xmlbeans.XmlString xgetDelegateSuggestedSigner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELEGATESUGGESTEDSIGNER$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "DelegateSuggestedSigner" element
     */
    public boolean isSetDelegateSuggestedSigner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELEGATESUGGESTEDSIGNER$30) != 0;
        }
    }
    
    /**
     * Sets the "DelegateSuggestedSigner" element
     */
    public void setDelegateSuggestedSigner(java.lang.String delegateSuggestedSigner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELEGATESUGGESTEDSIGNER$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELEGATESUGGESTEDSIGNER$30);
            }
            target.setStringValue(delegateSuggestedSigner);
        }
    }
    
    /**
     * Sets (as xml) the "DelegateSuggestedSigner" element
     */
    public void xsetDelegateSuggestedSigner(org.apache.xmlbeans.XmlString delegateSuggestedSigner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELEGATESUGGESTEDSIGNER$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DELEGATESUGGESTEDSIGNER$30);
            }
            target.set(delegateSuggestedSigner);
        }
    }
    
    /**
     * Unsets the "DelegateSuggestedSigner" element
     */
    public void unsetDelegateSuggestedSigner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELEGATESUGGESTEDSIGNER$30, 0);
        }
    }
    
    /**
     * Gets the "DelegateSuggestedSigner2" element
     */
    public java.lang.String getDelegateSuggestedSigner2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELEGATESUGGESTEDSIGNER2$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DelegateSuggestedSigner2" element
     */
    public org.apache.xmlbeans.XmlString xgetDelegateSuggestedSigner2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELEGATESUGGESTEDSIGNER2$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "DelegateSuggestedSigner2" element
     */
    public boolean isSetDelegateSuggestedSigner2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELEGATESUGGESTEDSIGNER2$32) != 0;
        }
    }
    
    /**
     * Sets the "DelegateSuggestedSigner2" element
     */
    public void setDelegateSuggestedSigner2(java.lang.String delegateSuggestedSigner2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELEGATESUGGESTEDSIGNER2$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELEGATESUGGESTEDSIGNER2$32);
            }
            target.setStringValue(delegateSuggestedSigner2);
        }
    }
    
    /**
     * Sets (as xml) the "DelegateSuggestedSigner2" element
     */
    public void xsetDelegateSuggestedSigner2(org.apache.xmlbeans.XmlString delegateSuggestedSigner2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELEGATESUGGESTEDSIGNER2$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DELEGATESUGGESTEDSIGNER2$32);
            }
            target.set(delegateSuggestedSigner2);
        }
    }
    
    /**
     * Unsets the "DelegateSuggestedSigner2" element
     */
    public void unsetDelegateSuggestedSigner2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELEGATESUGGESTEDSIGNER2$32, 0);
        }
    }
    
    /**
     * Gets the "DelegateSuggestedSignerEmail" element
     */
    public java.lang.String getDelegateSuggestedSignerEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELEGATESUGGESTEDSIGNEREMAIL$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DelegateSuggestedSignerEmail" element
     */
    public org.apache.xmlbeans.XmlString xgetDelegateSuggestedSignerEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELEGATESUGGESTEDSIGNEREMAIL$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "DelegateSuggestedSignerEmail" element
     */
    public boolean isSetDelegateSuggestedSignerEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELEGATESUGGESTEDSIGNEREMAIL$34) != 0;
        }
    }
    
    /**
     * Sets the "DelegateSuggestedSignerEmail" element
     */
    public void setDelegateSuggestedSignerEmail(java.lang.String delegateSuggestedSignerEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELEGATESUGGESTEDSIGNEREMAIL$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELEGATESUGGESTEDSIGNEREMAIL$34);
            }
            target.setStringValue(delegateSuggestedSignerEmail);
        }
    }
    
    /**
     * Sets (as xml) the "DelegateSuggestedSignerEmail" element
     */
    public void xsetDelegateSuggestedSignerEmail(org.apache.xmlbeans.XmlString delegateSuggestedSignerEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DELEGATESUGGESTEDSIGNEREMAIL$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DELEGATESUGGESTEDSIGNEREMAIL$34);
            }
            target.set(delegateSuggestedSignerEmail);
        }
    }
    
    /**
     * Unsets the "DelegateSuggestedSignerEmail" element
     */
    public void unsetDelegateSuggestedSignerEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELEGATESUGGESTEDSIGNEREMAIL$34, 0);
        }
    }
    
    /**
     * Gets the "ManifestHashAlgorithm" element
     */
    public java.lang.String getManifestHashAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANIFESTHASHALGORITHM$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ManifestHashAlgorithm" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetManifestHashAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(MANIFESTHASHALGORITHM$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "ManifestHashAlgorithm" element
     */
    public boolean isSetManifestHashAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANIFESTHASHALGORITHM$36) != 0;
        }
    }
    
    /**
     * Sets the "ManifestHashAlgorithm" element
     */
    public void setManifestHashAlgorithm(java.lang.String manifestHashAlgorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANIFESTHASHALGORITHM$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANIFESTHASHALGORITHM$36);
            }
            target.setStringValue(manifestHashAlgorithm);
        }
    }
    
    /**
     * Sets (as xml) the "ManifestHashAlgorithm" element
     */
    public void xsetManifestHashAlgorithm(org.apache.xmlbeans.XmlAnyURI manifestHashAlgorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(MANIFESTHASHALGORITHM$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(MANIFESTHASHALGORITHM$36);
            }
            target.set(manifestHashAlgorithm);
        }
    }
    
    /**
     * Unsets the "ManifestHashAlgorithm" element
     */
    public void unsetManifestHashAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANIFESTHASHALGORITHM$36, 0);
        }
    }
}
