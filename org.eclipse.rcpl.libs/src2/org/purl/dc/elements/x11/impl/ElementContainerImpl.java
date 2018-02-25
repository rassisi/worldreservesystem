/*
 * XML Type:  elementContainer
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.ElementContainer
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * An XML elementContainer(@http://purl.org/dc/elements/1.1/).
 *
 * This is a complex type.
 */
public class ElementContainerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.dc.elements.x11.ElementContainer
{
    
    public ElementContainerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANY$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "any");
    private static final org.apache.xmlbeans.QNameSet ANY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "bibliographicCitation"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "conformsTo"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "extent"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isFormatOf"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "valid"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "source"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "coverage"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "tableOfContents"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isReferencedBy"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isVersionOf"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "dateCopyrighted"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "date"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "creator"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "publisher"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accessRights"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "subject"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "temporal"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasPart"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "medium"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "abstract"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "title"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "audience"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "spatial"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "dateSubmitted"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "relation"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "format"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasFormat"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "references"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "created"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "educationLevel"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "language"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "identifier"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isReplacedBy"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "rights"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "mediator"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasVersion"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isPartOf"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "type"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "dateAccepted"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "alternative"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "available"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "requires"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isRequiredBy"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "modified"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "replaces"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "contributor"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "issued"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "any"),
    });
    
    
    /**
     * Gets a List of "any" elements
     */
    public java.util.List<org.purl.dc.elements.x11.SimpleLiteral> getAnyList()
    {
        final class AnyList extends java.util.AbstractList<org.purl.dc.elements.x11.SimpleLiteral>
        {
            public org.purl.dc.elements.x11.SimpleLiteral get(int i)
                { return ElementContainerImpl.this.getAnyArray(i); }
            
            public org.purl.dc.elements.x11.SimpleLiteral set(int i, org.purl.dc.elements.x11.SimpleLiteral o)
            {
                org.purl.dc.elements.x11.SimpleLiteral old = ElementContainerImpl.this.getAnyArray(i);
                ElementContainerImpl.this.setAnyArray(i, o);
                return old;
            }
            
            public void add(int i, org.purl.dc.elements.x11.SimpleLiteral o)
                { ElementContainerImpl.this.insertNewAny(i).set(o); }
            
            public org.purl.dc.elements.x11.SimpleLiteral remove(int i)
            {
                org.purl.dc.elements.x11.SimpleLiteral old = ElementContainerImpl.this.getAnyArray(i);
                ElementContainerImpl.this.removeAny(i);
                return old;
            }
            
            public int size()
                { return ElementContainerImpl.this.sizeOfAnyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnyList();
        }
    }
    
    /**
     * Gets array of all "any" elements
     */
    public org.purl.dc.elements.x11.SimpleLiteral[] getAnyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANY$1, targetList);
            org.purl.dc.elements.x11.SimpleLiteral[] result = new org.purl.dc.elements.x11.SimpleLiteral[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "any" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral getAnyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ANY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "any" element
     */
    public int sizeOfAnyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANY$1);
        }
    }
    
    /**
     * Sets array of all "any" element
     */
    public void setAnyArray(org.purl.dc.elements.x11.SimpleLiteral[] anyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(anyArray, ANY$0, ANY$1);
        }
    }
    
    /**
     * Sets ith "any" element
     */
    public void setAnyArray(int i, org.purl.dc.elements.x11.SimpleLiteral any)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().find_element_user(ANY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(any);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "any" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral insertNewAny(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().insert_element_user(ANY$1, ANY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "any" element
     */
    public org.purl.dc.elements.x11.SimpleLiteral addNewAny()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.purl.dc.elements.x11.SimpleLiteral target = null;
            target = (org.purl.dc.elements.x11.SimpleLiteral)get_store().add_element_user(ANY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "any" element
     */
    public void removeAny(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANY$1, i);
        }
    }
}
