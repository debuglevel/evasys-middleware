/**
 * PDFPluginContainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class PDFPluginContainer  implements java.io.Serializable {
    private de.debuglevel.evasysmiddleware.soap.PDFPlugin[] m_aPluginArray;

    public PDFPluginContainer() {
    }

    public PDFPluginContainer(
           de.debuglevel.evasysmiddleware.soap.PDFPlugin[] m_aPluginArray) {
           this.m_aPluginArray = m_aPluginArray;
    }


    /**
     * Gets the m_aPluginArray value for this PDFPluginContainer.
     * 
     * @return m_aPluginArray
     */
    public de.debuglevel.evasysmiddleware.soap.PDFPlugin[] getM_aPluginArray() {
        return m_aPluginArray;
    }


    /**
     * Sets the m_aPluginArray value for this PDFPluginContainer.
     * 
     * @param m_aPluginArray
     */
    public void setM_aPluginArray(de.debuglevel.evasysmiddleware.soap.PDFPlugin[] m_aPluginArray) {
        this.m_aPluginArray = m_aPluginArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PDFPluginContainer)) return false;
        PDFPluginContainer other = (PDFPluginContainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.m_aPluginArray==null && other.getM_aPluginArray()==null) || 
             (this.m_aPluginArray!=null &&
              java.util.Arrays.equals(this.m_aPluginArray, other.getM_aPluginArray())));
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
        if (getM_aPluginArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getM_aPluginArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getM_aPluginArray(), i);
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
        new org.apache.axis.description.TypeDesc(PDFPluginContainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "PDFPluginContainer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_aPluginArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_aPluginArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "PDFPlugin"));
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
