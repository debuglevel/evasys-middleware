/**
 * ObjectList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class ObjectList  implements java.io.Serializable {
    private java.lang.String m_sObjectName;

    private de.debuglevel.evasysmiddleware.soap.OnlineCode[] m_aObjects;

    public ObjectList() {
    }

    public ObjectList(
           java.lang.String m_sObjectName,
           de.debuglevel.evasysmiddleware.soap.OnlineCode[] m_aObjects) {
           this.m_sObjectName = m_sObjectName;
           this.m_aObjects = m_aObjects;
    }


    /**
     * Gets the m_sObjectName value for this ObjectList.
     * 
     * @return m_sObjectName
     */
    public java.lang.String getM_sObjectName() {
        return m_sObjectName;
    }


    /**
     * Sets the m_sObjectName value for this ObjectList.
     * 
     * @param m_sObjectName
     */
    public void setM_sObjectName(java.lang.String m_sObjectName) {
        this.m_sObjectName = m_sObjectName;
    }


    /**
     * Gets the m_aObjects value for this ObjectList.
     * 
     * @return m_aObjects
     */
    public de.debuglevel.evasysmiddleware.soap.OnlineCode[] getM_aObjects() {
        return m_aObjects;
    }


    /**
     * Sets the m_aObjects value for this ObjectList.
     * 
     * @param m_aObjects
     */
    public void setM_aObjects(de.debuglevel.evasysmiddleware.soap.OnlineCode[] m_aObjects) {
        this.m_aObjects = m_aObjects;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectList)) return false;
        ObjectList other = (ObjectList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.m_sObjectName==null && other.getM_sObjectName()==null) || 
             (this.m_sObjectName!=null &&
              this.m_sObjectName.equals(other.getM_sObjectName()))) &&
            ((this.m_aObjects==null && other.getM_aObjects()==null) || 
             (this.m_aObjects!=null &&
              java.util.Arrays.equals(this.m_aObjects, other.getM_aObjects())));
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
        if (getM_sObjectName() != null) {
            _hashCode += getM_sObjectName().hashCode();
        }
        if (getM_aObjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getM_aObjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getM_aObjects(), i);
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
        new org.apache.axis.description.TypeDesc(ObjectList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "ObjectList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sObjectName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sObjectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_aObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_aObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "OnlineCode"));
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
