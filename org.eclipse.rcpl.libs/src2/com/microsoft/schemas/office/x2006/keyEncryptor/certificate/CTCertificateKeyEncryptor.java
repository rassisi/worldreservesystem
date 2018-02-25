/*
 * XML Type:  CT_CertificateKeyEncryptor
 * Namespace: http://schemas.microsoft.com/office/2006/keyEncryptor/certificate
 * Java type: com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.keyEncryptor.certificate;


/**
 * An XML CT_CertificateKeyEncryptor(@http://schemas.microsoft.com/office/2006/keyEncryptor/certificate).
 *
 * This is a complex type.
 */
public interface CTCertificateKeyEncryptor extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTCertificateKeyEncryptor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0B482D0B338CC9641C1543C3510577FE").resolveHandle("ctcertificatekeyencryptor1a80type");
    
    /**
     * Gets the "encryptedKeyValue" attribute
     */
    byte[] getEncryptedKeyValue();
    
    /**
     * Gets (as xml) the "encryptedKeyValue" attribute
     */
    org.apache.xmlbeans.XmlBase64Binary xgetEncryptedKeyValue();
    
    /**
     * Sets the "encryptedKeyValue" attribute
     */
    void setEncryptedKeyValue(byte[] encryptedKeyValue);
    
    /**
     * Sets (as xml) the "encryptedKeyValue" attribute
     */
    void xsetEncryptedKeyValue(org.apache.xmlbeans.XmlBase64Binary encryptedKeyValue);
    
    /**
     * Gets the "X509Certificate" attribute
     */
    byte[] getX509Certificate();
    
    /**
     * Gets (as xml) the "X509Certificate" attribute
     */
    org.apache.xmlbeans.XmlBase64Binary xgetX509Certificate();
    
    /**
     * Sets the "X509Certificate" attribute
     */
    void setX509Certificate(byte[] x509Certificate);
    
    /**
     * Sets (as xml) the "X509Certificate" attribute
     */
    void xsetX509Certificate(org.apache.xmlbeans.XmlBase64Binary x509Certificate);
    
    /**
     * Gets the "certVerifier" attribute
     */
    byte[] getCertVerifier();
    
    /**
     * Gets (as xml) the "certVerifier" attribute
     */
    org.apache.xmlbeans.XmlBase64Binary xgetCertVerifier();
    
    /**
     * Sets the "certVerifier" attribute
     */
    void setCertVerifier(byte[] certVerifier);
    
    /**
     * Sets (as xml) the "certVerifier" attribute
     */
    void xsetCertVerifier(org.apache.xmlbeans.XmlBase64Binary certVerifier);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor newInstance() {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.office.x2006.keyEncryptor.certificate.CTCertificateKeyEncryptor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
