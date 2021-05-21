/**
 * SurveyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class SurveyType  implements java.io.Serializable {
    private java.lang.String m_chSurveyType;

    private java.lang.String m_sDescription;

    public SurveyType() {
    }

    public SurveyType(
           java.lang.String m_chSurveyType,
           java.lang.String m_sDescription) {
           this.m_chSurveyType = m_chSurveyType;
           this.m_sDescription = m_sDescription;
    }


    /**
     * Gets the m_chSurveyType value for this SurveyType.
     * 
     * @return m_chSurveyType
     */
    public java.lang.String getM_chSurveyType() {
        return m_chSurveyType;
    }


    /**
     * Sets the m_chSurveyType value for this SurveyType.
     * 
     * @param m_chSurveyType
     */
    public void setM_chSurveyType(java.lang.String m_chSurveyType) {
        this.m_chSurveyType = m_chSurveyType;
    }


    /**
     * Gets the m_sDescription value for this SurveyType.
     * 
     * @return m_sDescription
     */
    public java.lang.String getM_sDescription() {
        return m_sDescription;
    }


    /**
     * Sets the m_sDescription value for this SurveyType.
     * 
     * @param m_sDescription
     */
    public void setM_sDescription(java.lang.String m_sDescription) {
        this.m_sDescription = m_sDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SurveyType)) return false;
        SurveyType other = (SurveyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.m_chSurveyType==null && other.getM_chSurveyType()==null) || 
             (this.m_chSurveyType!=null &&
              this.m_chSurveyType.equals(other.getM_chSurveyType()))) &&
            ((this.m_sDescription==null && other.getM_sDescription()==null) || 
             (this.m_sDescription!=null &&
              this.m_sDescription.equals(other.getM_sDescription())));
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
        if (getM_chSurveyType() != null) {
            _hashCode += getM_chSurveyType().hashCode();
        }
        if (getM_sDescription() != null) {
            _hashCode += getM_sDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SurveyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "SurveyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_chSurveyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_chSurveyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sDescription"));
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
