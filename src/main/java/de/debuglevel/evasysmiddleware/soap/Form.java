/**
 * Form.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class Form  implements java.io.Serializable {
    private int m_nFormId;

    private java.lang.String m_sName;

    private int m_nOwnerId;

    private int m_nFormEngine;

    public Form() {
    }

    public Form(
           int m_nFormId,
           java.lang.String m_sName,
           int m_nOwnerId,
           int m_nFormEngine) {
           this.m_nFormId = m_nFormId;
           this.m_sName = m_sName;
           this.m_nOwnerId = m_nOwnerId;
           this.m_nFormEngine = m_nFormEngine;
    }


    /**
     * Gets the m_nFormId value for this Form.
     * 
     * @return m_nFormId
     */
    public int getM_nFormId() {
        return m_nFormId;
    }


    /**
     * Sets the m_nFormId value for this Form.
     * 
     * @param m_nFormId
     */
    public void setM_nFormId(int m_nFormId) {
        this.m_nFormId = m_nFormId;
    }


    /**
     * Gets the m_sName value for this Form.
     * 
     * @return m_sName
     */
    public java.lang.String getM_sName() {
        return m_sName;
    }


    /**
     * Sets the m_sName value for this Form.
     * 
     * @param m_sName
     */
    public void setM_sName(java.lang.String m_sName) {
        this.m_sName = m_sName;
    }


    /**
     * Gets the m_nOwnerId value for this Form.
     * 
     * @return m_nOwnerId
     */
    public int getM_nOwnerId() {
        return m_nOwnerId;
    }


    /**
     * Sets the m_nOwnerId value for this Form.
     * 
     * @param m_nOwnerId
     */
    public void setM_nOwnerId(int m_nOwnerId) {
        this.m_nOwnerId = m_nOwnerId;
    }


    /**
     * Gets the m_nFormEngine value for this Form.
     * 
     * @return m_nFormEngine
     */
    public int getM_nFormEngine() {
        return m_nFormEngine;
    }


    /**
     * Sets the m_nFormEngine value for this Form.
     * 
     * @param m_nFormEngine
     */
    public void setM_nFormEngine(int m_nFormEngine) {
        this.m_nFormEngine = m_nFormEngine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Form)) return false;
        Form other = (Form) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.m_nFormId == other.getM_nFormId() &&
            ((this.m_sName==null && other.getM_sName()==null) || 
             (this.m_sName!=null &&
              this.m_sName.equals(other.getM_sName()))) &&
            this.m_nOwnerId == other.getM_nOwnerId() &&
            this.m_nFormEngine == other.getM_nFormEngine();
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
        _hashCode += getM_nFormId();
        if (getM_sName() != null) {
            _hashCode += getM_sName().hashCode();
        }
        _hashCode += getM_nOwnerId();
        _hashCode += getM_nFormEngine();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Form.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "Form"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nFormId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nFormId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nOwnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nOwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nFormEngine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nFormEngine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
