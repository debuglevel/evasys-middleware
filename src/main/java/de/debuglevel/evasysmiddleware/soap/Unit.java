/**
 * Unit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class Unit  implements java.io.Serializable {
    private int m_nId;

    private java.lang.String m_sName;

    private int m_nPublicUnitNumber;

    private int m_nImageAccess;

    public Unit() {
    }

    public Unit(
           int m_nId,
           java.lang.String m_sName,
           int m_nPublicUnitNumber,
           int m_nImageAccess) {
           this.m_nId = m_nId;
           this.m_sName = m_sName;
           this.m_nPublicUnitNumber = m_nPublicUnitNumber;
           this.m_nImageAccess = m_nImageAccess;
    }


    /**
     * Gets the m_nId value for this Unit.
     * 
     * @return m_nId
     */
    public int getM_nId() {
        return m_nId;
    }


    /**
     * Sets the m_nId value for this Unit.
     * 
     * @param m_nId
     */
    public void setM_nId(int m_nId) {
        this.m_nId = m_nId;
    }


    /**
     * Gets the m_sName value for this Unit.
     * 
     * @return m_sName
     */
    public java.lang.String getM_sName() {
        return m_sName;
    }


    /**
     * Sets the m_sName value for this Unit.
     * 
     * @param m_sName
     */
    public void setM_sName(java.lang.String m_sName) {
        this.m_sName = m_sName;
    }


    /**
     * Gets the m_nPublicUnitNumber value for this Unit.
     * 
     * @return m_nPublicUnitNumber
     */
    public int getM_nPublicUnitNumber() {
        return m_nPublicUnitNumber;
    }


    /**
     * Sets the m_nPublicUnitNumber value for this Unit.
     * 
     * @param m_nPublicUnitNumber
     */
    public void setM_nPublicUnitNumber(int m_nPublicUnitNumber) {
        this.m_nPublicUnitNumber = m_nPublicUnitNumber;
    }


    /**
     * Gets the m_nImageAccess value for this Unit.
     * 
     * @return m_nImageAccess
     */
    public int getM_nImageAccess() {
        return m_nImageAccess;
    }


    /**
     * Sets the m_nImageAccess value for this Unit.
     * 
     * @param m_nImageAccess
     */
    public void setM_nImageAccess(int m_nImageAccess) {
        this.m_nImageAccess = m_nImageAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Unit)) return false;
        Unit other = (Unit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.m_nId == other.getM_nId() &&
            ((this.m_sName==null && other.getM_sName()==null) || 
             (this.m_sName!=null &&
              this.m_sName.equals(other.getM_sName()))) &&
            this.m_nPublicUnitNumber == other.getM_nPublicUnitNumber() &&
            this.m_nImageAccess == other.getM_nImageAccess();
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
        _hashCode += getM_nId();
        if (getM_sName() != null) {
            _hashCode += getM_sName().hashCode();
        }
        _hashCode += getM_nPublicUnitNumber();
        _hashCode += getM_nImageAccess();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Unit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "Unit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nId"));
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
        elemField.setFieldName("m_nPublicUnitNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nPublicUnitNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nImageAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nImageAccess"));
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
