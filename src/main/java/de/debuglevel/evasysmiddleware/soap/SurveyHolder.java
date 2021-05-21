/**
 * SurveyHolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class SurveyHolder  implements java.io.Serializable {
    private de.debuglevel.evasysmiddleware.soap.Survey[] m_aSurveys;

    public SurveyHolder() {
    }

    public SurveyHolder(
           de.debuglevel.evasysmiddleware.soap.Survey[] m_aSurveys) {
           this.m_aSurveys = m_aSurveys;
    }


    /**
     * Gets the m_aSurveys value for this SurveyHolder.
     * 
     * @return m_aSurveys
     */
    public de.debuglevel.evasysmiddleware.soap.Survey[] getM_aSurveys() {
        return m_aSurveys;
    }


    /**
     * Sets the m_aSurveys value for this SurveyHolder.
     * 
     * @param m_aSurveys
     */
    public void setM_aSurveys(de.debuglevel.evasysmiddleware.soap.Survey[] m_aSurveys) {
        this.m_aSurveys = m_aSurveys;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SurveyHolder)) return false;
        SurveyHolder other = (SurveyHolder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.m_aSurveys==null && other.getM_aSurveys()==null) || 
             (this.m_aSurveys!=null &&
              java.util.Arrays.equals(this.m_aSurveys, other.getM_aSurveys())));
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
        if (getM_aSurveys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getM_aSurveys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getM_aSurveys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SurveyHolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "SurveyHolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_aSurveys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_aSurveys"));
        elemField.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "Survey"));
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
