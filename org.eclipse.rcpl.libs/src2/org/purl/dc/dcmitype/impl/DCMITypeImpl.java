/*
 * XML Type:  DCMIType
 * Namespace: http://purl.org/dc/dcmitype/
 * Java type: org.purl.dc.dcmitype.DCMIType
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.dcmitype.impl;
/**
 * An XML DCMIType(@http://purl.org/dc/dcmitype/).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.purl.dc.dcmitype.DCMIType$Member
 */
public class DCMITypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.purl.dc.dcmitype.DCMIType, org.purl.dc.dcmitype.DCMIType.Member
{
    
    public DCMITypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected DCMITypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.purl.dc.dcmitype.DCMIType$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.purl.dc.dcmitype.DCMIType.Member
    {
        
        public MemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
