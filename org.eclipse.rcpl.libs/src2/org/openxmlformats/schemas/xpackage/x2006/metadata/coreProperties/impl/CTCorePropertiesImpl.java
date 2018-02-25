/*
 * XML Type:  CT_CoreProperties
 * Namespace: http://schemas.openxmlformats.org/package/2006/metadata/core-properties
 * Java type: org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CTCoreProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.impl;
/**
 * An XML CT_CoreProperties(@http://schemas.openxmlformats.org/package/2006/metadata/core-properties).
 *
 * This is a complex type.
 */
public class CTCorePropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.xpackage.x2006.metadata.coreProperties.CTCoreProperties
{
    
    public CTCorePropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/metadata/core-properties", "category");
    private static final javax.xml.namespace.QName CONTENTSTATUS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/metadata/core-properties", "contentStatus");
    private static final javax.xml.namespace.QName CONTENTTYPE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/metadata/core-properties", "contentType");
    private static final javax.xml.namespace.QName CREATED$6 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "created");
    private static final javax.xml.namespace.QName CREATOR$8 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "creator");
    private static final javax.xml.namespace.QName DESCRIPTION$10 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description");
    private static final org.apache.xmlbeans.QNameSet DESCRIPTION$11 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "abstract"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "tableOfContents"),
    });
    private static final javax.xml.namespace.QName IDENTIFIER$12 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "identifier");
    private static final org.apache.xmlbeans.QNameSet IDENTIFIER$13 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "bibliographicCitation"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "identifier"),
    });
    private static final javax.xml.namespace.QName KEYWORDS$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/metadata/core-properties", "keywords");
    private static final javax.xml.namespace.QName LANGUAGE$16 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "language");
    private static final javax.xml.namespace.QName LASTMODIFIEDBY$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/metadata/core-properties", "lastModifiedBy");
    private static final javax.xml.namespace.QName LASTPRINTED$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/metadata/core-properties", "lastPrinted");
    private static final javax.xml.namespace.QName MODIFIED$22 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "modified");
    private static final javax.xml.namespace.QName REVISION$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/metadata/core-properties", "revision");
    private static final javax.xml.namespace.QName SUBJECT$26 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "subject");
    private static final javax.xml.namespace.QName TITLE$28 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "title");
    private static final org.apache.xmlbeans.QNameSet TITLE$29 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "alternative"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "title"),
    });
    private static final javax.xml.namespace.QName VERSION$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/package/2006/metadata/core-properties", "version");
    
    
    /**
     * Gets the "category" element
     */
    public java.lang.String getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "category" element
     */
    public org.apache.xmlbeans.XmlString xgetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "category" element
     */
    public boolean isSetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$0) != 0;
        }
    }
    
    /**
     * Sets the "category" element
     */
    public void setCategory(java.lang.String category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORY$0);
            }
            target.setStringValue(category);
        }
    }
    
    /**
     * Sets (as xml) the "category" element
     */
    public void xsetCategory(org.apache.xmlbeans.XmlString category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORY$0);
            }
            target.set(category);
        }
    }
    
    /**
     * Unsets the "category" element
     */
    public void unsetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$0, 0);
        }
    }
    
    /**
     * Gets the "contentStatus" element
     */
    public java.lang.String getContentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTSTATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contentStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetContentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTSTATUS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "contentStatus" element
     */
    public boolean isSetContentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTSTATUS$2) != 0;
        }
    }
    
    /**
     * Sets the "contentStatus" element
     */
    public void setContentStatus(java.lang.String contentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTSTATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENTSTATUS$2);
            }
            target.setStringValue(contentStatus);
        }
    }
    
    /**
     * Sets (as xml) the "contentStatus" element
     */
    public void xsetContentStatus(org.apache.xmlbeans.XmlString contentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTSTATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENTSTATUS$2);
            }
            target.set(contentStatus);
        }
    }
    
    /**
     * Unsets the "contentStatus" element
     */
    public void unsetContentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTSTATUS$2, 0);
        }
    }
    
    /**
     * Gets the "contentType" element
     */
    public java.lang.String getContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contentType" element
     */
    public org.apache.xmlbeans.XmlString xgetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "contentType" element
     */
    public boolean isSetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "contentType" element
     */
    public void setContentType(java.lang.String contentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENTTYPE$4);
            }
            target.setStringValue(contentType);
        }
    }
    
    /**
     * Sets (as xml) the "contentType" element
     */
    public void xsetContentType(org.apache.xmlbeans.XmlString contentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENTTYPE$4);
            }
            target.set(contentType);
        }
    }
    
    /**
     * Unsets the "contentType" element
     */
    public void unsetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "created" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(CREATED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "created" element
     */
    public boolean isSetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATED$6) != 0;
        }
    }
    
    /**
     * Sets the "created" element
     */
    public void setCreated(org.purl.dc.elements.x11.SimpleLiteral created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(CREATED$6, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(CREATED$6);
            }
            target.set(created);
        }
    }
    
    /**
     * Appends and returns a new empty "created" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(CREATED$6);
            return target;
        }
    }
    
    /**
     * Unsets the "created" element
     */
    public void unsetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATED$6, 0);
        }
    }
    
    /**
     * Gets the "creator" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(CREATOR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "creator" element
     */
    public boolean isSetCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATOR$8) != 0;
        }
    }
    
    /**
     * Sets the "creator" element
     */
    public void setCreator(org.purl.dc.elements.x11.SimpleLiteral creator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(CREATOR$8, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(CREATOR$8);
            }
            target.set(creator);
        }
    }
    
    /**
     * Appends and returns a new empty "creator" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(CREATOR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "creator" element
     */
    public void unsetCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATOR$8, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(DESCRIPTION$11, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$11) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.purl.dc.elements.x11.SimpleLiteral description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(DESCRIPTION$11, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(DESCRIPTION$10);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(DESCRIPTION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$11, 0);
        }
    }
    
    /**
     * Gets the "identifier" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(IDENTIFIER$13, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "identifier" element
     */
    public boolean isSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$13) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.purl.dc.elements.x11.SimpleLiteral identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(IDENTIFIER$13, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(IDENTIFIER$12);
            }
            target.set(identifier);
        }
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(IDENTIFIER$12);
            return target;
        }
    }
    
    /**
     * Unsets the "identifier" element
     */
    public void unsetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$13, 0);
        }
    }
    
    /**
     * Gets the "keywords" element
     */
    public java.lang.String getKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "keywords" element
     */
    public org.apache.xmlbeans.XmlString xgetKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "keywords" element
     */
    public boolean isSetKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORDS$14) != 0;
        }
    }
    
    /**
     * Sets the "keywords" element
     */
    public void setKeywords(java.lang.String keywords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORDS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORDS$14);
            }
            target.setStringValue(keywords);
        }
    }
    
    /**
     * Sets (as xml) the "keywords" element
     */
    public void xsetKeywords(org.apache.xmlbeans.XmlString keywords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORDS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYWORDS$14);
            }
            target.set(keywords);
        }
    }
    
    /**
     * Unsets the "keywords" element
     */
    public void unsetKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORDS$14, 0);
        }
    }
    
    /**
     * Gets the "language" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(LANGUAGE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "language" element
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGE$16) != 0;
        }
    }
    
    /**
     * Sets the "language" element
     */
    public void setLanguage(org.purl.dc.elements.x11.SimpleLiteral language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(LANGUAGE$16, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(LANGUAGE$16);
            }
            target.set(language);
        }
    }
    
    /**
     * Appends and returns a new empty "language" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(LANGUAGE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "language" element
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGE$16, 0);
        }
    }
    
    /**
     * Gets the "lastModifiedBy" element
     */
    public java.lang.String getLastModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDBY$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastModifiedBy" element
     */
    public org.apache.xmlbeans.XmlString xgetLastModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTMODIFIEDBY$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "lastModifiedBy" element
     */
    public boolean isSetLastModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTMODIFIEDBY$18) != 0;
        }
    }
    
    /**
     * Sets the "lastModifiedBy" element
     */
    public void setLastModifiedBy(java.lang.String lastModifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTMODIFIEDBY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTMODIFIEDBY$18);
            }
            target.setStringValue(lastModifiedBy);
        }
    }
    
    /**
     * Sets (as xml) the "lastModifiedBy" element
     */
    public void xsetLastModifiedBy(org.apache.xmlbeans.XmlString lastModifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LASTMODIFIEDBY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LASTMODIFIEDBY$18);
            }
            target.set(lastModifiedBy);
        }
    }
    
    /**
     * Unsets the "lastModifiedBy" element
     */
    public void unsetLastModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTMODIFIEDBY$18, 0);
        }
    }
    
    /**
     * Gets the "lastPrinted" element
     */
    public java.util.Calendar getLastPrinted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTPRINTED$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastPrinted" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLastPrinted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTPRINTED$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "lastPrinted" element
     */
    public boolean isSetLastPrinted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTPRINTED$20) != 0;
        }
    }
    
    /**
     * Sets the "lastPrinted" element
     */
    public void setLastPrinted(java.util.Calendar lastPrinted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTPRINTED$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTPRINTED$20);
            }
            target.setCalendarValue(lastPrinted);
        }
    }
    
    /**
     * Sets (as xml) the "lastPrinted" element
     */
    public void xsetLastPrinted(org.apache.xmlbeans.XmlDateTime lastPrinted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTPRINTED$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTPRINTED$20);
            }
            target.set(lastPrinted);
        }
    }
    
    /**
     * Unsets the "lastPrinted" element
     */
    public void unsetLastPrinted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTPRINTED$20, 0);
        }
    }
    
    /**
     * Gets the "modified" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(MODIFIED$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modified" element
     */
    public boolean isSetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIED$22) != 0;
        }
    }
    
    /**
     * Sets the "modified" element
     */
    public void setModified(org.purl.dc.elements.x11.SimpleLiteral modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(MODIFIED$22, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(MODIFIED$22);
            }
            target.set(modified);
        }
    }
    
    /**
     * Appends and returns a new empty "modified" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(MODIFIED$22);
            return target;
        }
    }
    
    /**
     * Unsets the "modified" element
     */
    public void unsetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIED$22, 0);
        }
    }
    
    /**
     * Gets the "revision" element
     */
    public java.lang.String getRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVISION$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "revision" element
     */
    public org.apache.xmlbeans.XmlString xgetRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REVISION$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "revision" element
     */
    public boolean isSetRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVISION$24) != 0;
        }
    }
    
    /**
     * Sets the "revision" element
     */
    public void setRevision(java.lang.String revision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVISION$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REVISION$24);
            }
            target.setStringValue(revision);
        }
    }
    
    /**
     * Sets (as xml) the "revision" element
     */
    public void xsetRevision(org.apache.xmlbeans.XmlString revision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REVISION$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REVISION$24);
            }
            target.set(revision);
        }
    }
    
    /**
     * Unsets the "revision" element
     */
    public void unsetRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVISION$24, 0);
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(SUBJECT$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$26) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.purl.dc.elements.x11.SimpleLiteral subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(SUBJECT$26, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(SUBJECT$26);
            }
            target.set(subject);
        }
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(SUBJECT$26);
            return target;
        }
    }
    
    /**
     * Unsets the "subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$26, 0);
        }
    }
    
    /**
     * Gets the "title" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(TITLE$29, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$29) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(org.purl.dc.elements.x11.SimpleLiteral title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(TITLE$29, 0);
            if (target == null)
            {
                target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(TITLE$28);
            }
            target.set(title);
        }
    }
    
    /**
     * Appends and returns a new empty "title" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(TITLE$28);
            return target;
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$29, 0);
        }
    }
    
    /**
     * Gets the "version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$30) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$30);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$30);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$30, 0);
        }
    }
}
