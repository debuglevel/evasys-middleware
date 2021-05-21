/**
 * Period.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class Period  implements java.io.Serializable {
    private int m_nPeriodId;

    private java.lang.String m_sTitel;

    private java.lang.String m_sStartDate;

    private java.lang.String m_sEndDate;

    public Period() {
    }

    public Period(
           int m_nPeriodId,
           java.lang.String m_sTitel,
           java.lang.String m_sStartDate,
           java.lang.String m_sEndDate) {
           this.m_nPeriodId = m_nPeriodId;
           this.m_sTitel = m_sTitel;
           this.m_sStartDate = m_sStartDate;
           this.m_sEndDate = m_sEndDate;
    }


    /**
     * Gets the m_nPeriodId value for this Period.
     * 
     * @return m_nPeriodId
     */
    public int getM_nPeriodId() {
        return m_nPeriodId;
    }


    /**
     * Sets the m_nPeriodId value for this Period.
     * 
     * @param m_nPeriodId
     */
    public void setM_nPeriodId(int m_nPeriodId) {
        this.m_nPeriodId = m_nPeriodId;
    }


    /**
     * Gets the m_sTitel value for this Period.
     * 
     * @return m_sTitel
     */
    public java.lang.String getM_sTitel() {
        return m_sTitel;
    }


    /**
     * Sets the m_sTitel value for this Period.
     * 
     * @param m_sTitel
     */
    public void setM_sTitel(java.lang.String m_sTitel) {
        this.m_sTitel = m_sTitel;
    }


    /**
     * Gets the m_sStartDate value for this Period.
     * 
     * @return m_sStartDate
     */
    public java.lang.String getM_sStartDate() {
        return m_sStartDate;
    }


    /**
     * Sets the m_sStartDate value for this Period.
     * 
     * @param m_sStartDate
     */
    public void setM_sStartDate(java.lang.String m_sStartDate) {
        this.m_sStartDate = m_sStartDate;
    }


    /**
     * Gets the m_sEndDate value for this Period.
     * 
     * @return m_sEndDate
     */
    public java.lang.String getM_sEndDate() {
        return m_sEndDate;
    }


    /**
     * Sets the m_sEndDate value for this Period.
     * 
     * @param m_sEndDate
     */
    public void setM_sEndDate(java.lang.String m_sEndDate) {
        this.m_sEndDate = m_sEndDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Period)) return false;
        Period other = (Period) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.m_nPeriodId == other.getM_nPeriodId() &&
            ((this.m_sTitel==null && other.getM_sTitel()==null) || 
             (this.m_sTitel!=null &&
              this.m_sTitel.equals(other.getM_sTitel()))) &&
            ((this.m_sStartDate==null && other.getM_sStartDate()==null) || 
             (this.m_sStartDate!=null &&
              this.m_sStartDate.equals(other.getM_sStartDate()))) &&
            ((this.m_sEndDate==null && other.getM_sEndDate()==null) || 
             (this.m_sEndDate!=null &&
              this.m_sEndDate.equals(other.getM_sEndDate())));
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
        _hashCode += getM_nPeriodId();
        if (getM_sTitel() != null) {
            _hashCode += getM_sTitel().hashCode();
        }
        if (getM_sStartDate() != null) {
            _hashCode += getM_sStartDate().hashCode();
        }
        if (getM_sEndDate() != null) {
            _hashCode += getM_sEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Period.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "Period"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nPeriodId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nPeriodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sTitel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sTitel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sEndDate"));
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
