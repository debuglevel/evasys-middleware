/**
 * OnlineCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class OnlineCode  implements java.io.Serializable {
    private java.lang.String m_sOnlineCode;

    private int m_nCodeType;

    private int m_nSurveyId;

    private java.lang.String m_sRecipientMailAddress;

    private java.lang.String m_sDirectOnlineLink;

    public OnlineCode() {
    }

    public OnlineCode(
           java.lang.String m_sOnlineCode,
           int m_nCodeType,
           int m_nSurveyId,
           java.lang.String m_sRecipientMailAddress,
           java.lang.String m_sDirectOnlineLink) {
           this.m_sOnlineCode = m_sOnlineCode;
           this.m_nCodeType = m_nCodeType;
           this.m_nSurveyId = m_nSurveyId;
           this.m_sRecipientMailAddress = m_sRecipientMailAddress;
           this.m_sDirectOnlineLink = m_sDirectOnlineLink;
    }


    /**
     * Gets the m_sOnlineCode value for this OnlineCode.
     * 
     * @return m_sOnlineCode
     */
    public java.lang.String getM_sOnlineCode() {
        return m_sOnlineCode;
    }


    /**
     * Sets the m_sOnlineCode value for this OnlineCode.
     * 
     * @param m_sOnlineCode
     */
    public void setM_sOnlineCode(java.lang.String m_sOnlineCode) {
        this.m_sOnlineCode = m_sOnlineCode;
    }


    /**
     * Gets the m_nCodeType value for this OnlineCode.
     * 
     * @return m_nCodeType
     */
    public int getM_nCodeType() {
        return m_nCodeType;
    }


    /**
     * Sets the m_nCodeType value for this OnlineCode.
     * 
     * @param m_nCodeType
     */
    public void setM_nCodeType(int m_nCodeType) {
        this.m_nCodeType = m_nCodeType;
    }


    /**
     * Gets the m_nSurveyId value for this OnlineCode.
     * 
     * @return m_nSurveyId
     */
    public int getM_nSurveyId() {
        return m_nSurveyId;
    }


    /**
     * Sets the m_nSurveyId value for this OnlineCode.
     * 
     * @param m_nSurveyId
     */
    public void setM_nSurveyId(int m_nSurveyId) {
        this.m_nSurveyId = m_nSurveyId;
    }


    /**
     * Gets the m_sRecipientMailAddress value for this OnlineCode.
     * 
     * @return m_sRecipientMailAddress
     */
    public java.lang.String getM_sRecipientMailAddress() {
        return m_sRecipientMailAddress;
    }


    /**
     * Sets the m_sRecipientMailAddress value for this OnlineCode.
     * 
     * @param m_sRecipientMailAddress
     */
    public void setM_sRecipientMailAddress(java.lang.String m_sRecipientMailAddress) {
        this.m_sRecipientMailAddress = m_sRecipientMailAddress;
    }


    /**
     * Gets the m_sDirectOnlineLink value for this OnlineCode.
     * 
     * @return m_sDirectOnlineLink
     */
    public java.lang.String getM_sDirectOnlineLink() {
        return m_sDirectOnlineLink;
    }


    /**
     * Sets the m_sDirectOnlineLink value for this OnlineCode.
     * 
     * @param m_sDirectOnlineLink
     */
    public void setM_sDirectOnlineLink(java.lang.String m_sDirectOnlineLink) {
        this.m_sDirectOnlineLink = m_sDirectOnlineLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OnlineCode)) return false;
        OnlineCode other = (OnlineCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.m_sOnlineCode==null && other.getM_sOnlineCode()==null) || 
             (this.m_sOnlineCode!=null &&
              this.m_sOnlineCode.equals(other.getM_sOnlineCode()))) &&
            this.m_nCodeType == other.getM_nCodeType() &&
            this.m_nSurveyId == other.getM_nSurveyId() &&
            ((this.m_sRecipientMailAddress==null && other.getM_sRecipientMailAddress()==null) || 
             (this.m_sRecipientMailAddress!=null &&
              this.m_sRecipientMailAddress.equals(other.getM_sRecipientMailAddress()))) &&
            ((this.m_sDirectOnlineLink==null && other.getM_sDirectOnlineLink()==null) || 
             (this.m_sDirectOnlineLink!=null &&
              this.m_sDirectOnlineLink.equals(other.getM_sDirectOnlineLink())));
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
        if (getM_sOnlineCode() != null) {
            _hashCode += getM_sOnlineCode().hashCode();
        }
        _hashCode += getM_nCodeType();
        _hashCode += getM_nSurveyId();
        if (getM_sRecipientMailAddress() != null) {
            _hashCode += getM_sRecipientMailAddress().hashCode();
        }
        if (getM_sDirectOnlineLink() != null) {
            _hashCode += getM_sDirectOnlineLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OnlineCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "OnlineCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sOnlineCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sOnlineCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nCodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nCodeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nSurveyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nSurveyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sRecipientMailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sRecipientMailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sDirectOnlineLink");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sDirectOnlineLink"));
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
