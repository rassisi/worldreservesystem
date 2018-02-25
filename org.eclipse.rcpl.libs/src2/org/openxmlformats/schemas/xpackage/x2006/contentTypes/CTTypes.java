/*
 * XML Type:  CT_Types
 * Namespace: http://schemas.openxmlformats.org/package/2006/content-types
 * Java type: org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.xpackage.x2006.contentTypes;


/**
 * An XML CT_Types(@http://schemas.openxmlformats.org/package/2006/content-types).
 *
 * This is a complex type.
 */
public interface CTTypes extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTTypes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0B482D0B338CC9641C1543C3510577FE").resolveHandle("cttypes4aabtype");
    
    /**
     * Gets a List of "Default" elements
     */
    java.util.List<org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault> getDefaultList();
    
    /**
     * Gets array of all "Default" elements
     * @deprecated
     */
    org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault[] getDefaultArray();
    
    /**
     * Gets ith "Default" element
     */
    org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault getDefaultArray(int i);
    
    /**
     * Returns number of "Default" element
     */
    int sizeOfDefaultArray();
    
    /**
     * Sets array of all "Default" element
     */
    void setDefaultArray(org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault[] xdefaultArray);
    
    /**
     * Sets ith "Default" element
     */
    void setDefaultArray(int i, org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault xdefault);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Default" element
     */
    org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault insertNewDefault(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Default" element
     */
    org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTDefault addNewDefault();
    
    /**
     * Removes the ith "Default" element
     */
    void removeDefault(int i);
    
    /**
     * Gets a List of "Override" elements
     */
    java.util.List<org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride> getOverrideList();
    
    /**
     * Gets array of all "Override" elements
     * @deprecated
     */
    org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride[] getOverrideArray();
    
    /**
     * Gets ith "Override" element
     */
    org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride getOverrideArray(int i);
    
    /**
     * Returns number of "Override" element
     */
    int sizeOfOverrideArray();
    
    /**
     * Sets array of all "Override" element
     */
    void setOverrideArray(org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride[] overrideArray);
    
    /**
     * Sets ith "Override" element
     */
    void setOverrideArray(int i, org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride override);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Override" element
     */
    org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride insertNewOverride(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Override" element
     */
    org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTOverride addNewOverride();
    
    /**
     * Removes the ith "Override" element
     */
    void removeOverride(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes newInstance() {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.xpackage.x2006.contentTypes.CTTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
