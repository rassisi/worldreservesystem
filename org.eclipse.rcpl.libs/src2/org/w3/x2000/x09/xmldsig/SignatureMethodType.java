/*
 * XML Type:  SignatureMethodType
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.w3.x2000.x09.xmldsig.SignatureMethodType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2000.x09.xmldsig;


/**
 * An XML SignatureMethodType(@http://www.w3.org/2000/09/xmldsig#).
 *
 * This is a complex type.
 */
public interface SignatureMethodType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SignatureMethodType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0B482D0B338CC9641C1543C3510577FE").resolveHandle("signaturemethodtypefd5etype");
    
    /**
     * Gets the "HMACOutputLength" element
     */
    java.math.BigInteger getHMACOutputLength();
    
    /**
     * Gets (as xml) the "HMACOutputLength" element
     */
    org.w3.x2000.x09.xmldsig.HMACOutputLengthType xgetHMACOutputLength();
    
    /**
     * True if has "HMACOutputLength" element
     */
    boolean isSetHMACOutputLength();
    
    /**
     * Sets the "HMACOutputLength" element
     */
    void setHMACOutputLength(java.math.BigInteger hmacOutputLength);
    
    /**
     * Sets (as xml) the "HMACOutputLength" element
     */
    void xsetHMACOutputLength(org.w3.x2000.x09.xmldsig.HMACOutputLengthType hmacOutputLength);
    
    /**
     * Unsets the "HMACOutputLength" element
     */
    void unsetHMACOutputLength();
    
    /**
     * Gets the "Algorithm" attribute
     */
    java.lang.String getAlgorithm();
    
    /**
     * Gets (as xml) the "Algorithm" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetAlgorithm();
    
    /**
     * Sets the "Algorithm" attribute
     */
    void setAlgorithm(java.lang.String algorithm);
    
    /**
     * Sets (as xml) the "Algorithm" attribute
     */
    void xsetAlgorithm(org.apache.xmlbeans.XmlAnyURI algorithm);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType newInstance() {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2000.x09.xmldsig.SignatureMethodType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2000.x09.xmldsig.SignatureMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
