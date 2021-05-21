/**
 * PDFPlugin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class PDFPlugin  implements java.io.Serializable {
    private int m_nPluginId;

    private java.lang.String m_sTitle;

    public PDFPlugin() {
    }

    public PDFPlugin(
           int m_nPluginId,
           java.lang.String m_sTitle) {
           this.m_nPluginId = m_nPluginId;
           this.m_sTitle = m_sTitle;
    }


    /**
     * Gets the m_nPluginId value for this PDFPlugin.
     * 
     * @return m_nPluginId
     */
    public int getM_nPluginId() {
        return m_nPluginId;
    }


    /**
     * Sets the m_nPluginId value for this PDFPlugin.
     * 
     * @param m_nPluginId
     */
    public void setM_nPluginId(int m_nPluginId) {
        this.m_nPluginId = m_nPluginId;
    }


    /**
     * Gets the m_sTitle value for this PDFPlugin.
     * 
     * @return m_sTitle
     */
    public java.lang.String getM_sTitle() {
        return m_sTitle;
    }


    /**
     * Sets the m_sTitle value for this PDFPlugin.
     * 
     * @param m_sTitle
     */
    public void setM_sTitle(java.lang.String m_sTitle) {
        this.m_sTitle = m_sTitle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PDFPlugin)) return false;
        PDFPlugin other = (PDFPlugin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.m_nPluginId == other.getM_nPluginId() &&
            ((this.m_sTitle==null && other.getM_sTitle()==null) || 
             (this.m_sTitle!=null &&
              this.m_sTitle.equals(other.getM_sTitle())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getM_nPluginId();
        if (getM_sTitle() != null) {
            _hashCode += getM_sTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PDFPlugin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "PDFPlugin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nPluginId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nPluginId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
