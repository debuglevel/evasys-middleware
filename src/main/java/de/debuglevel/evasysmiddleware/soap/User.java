/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class User  implements java.io.Serializable {
    private int m_nId;

    private int m_nType;

    private java.lang.String m_sLoginName;

    private java.lang.String m_sTitle;

    private java.lang.String m_sFirstName;

    private java.lang.String m_sSurName;

    private java.lang.String m_sAddress;

    private java.lang.String m_sEmail;

    private int m_nFbid;

    private int m_nAddressId;

    private java.lang.String m_sPassword;

    private java.lang.String m_sPhoneNumber;

    private de.debuglevel.evasysmiddleware.soap.Course[] m_aCourses;

    public User() {
    }

    public User(
           int m_nId,
           int m_nType,
           java.lang.String m_sLoginName,
           java.lang.String m_sTitle,
           java.lang.String m_sFirstName,
           java.lang.String m_sSurName,
           java.lang.String m_sAddress,
           java.lang.String m_sEmail,
           int m_nFbid,
           int m_nAddressId,
           java.lang.String m_sPassword,
           java.lang.String m_sPhoneNumber,
           de.debuglevel.evasysmiddleware.soap.Course[] m_aCourses) {
           this.m_nId = m_nId;
           this.m_nType = m_nType;
           this.m_sLoginName = m_sLoginName;
           this.m_sTitle = m_sTitle;
           this.m_sFirstName = m_sFirstName;
           this.m_sSurName = m_sSurName;
           this.m_sAddress = m_sAddress;
           this.m_sEmail = m_sEmail;
           this.m_nFbid = m_nFbid;
           this.m_nAddressId = m_nAddressId;
           this.m_sPassword = m_sPassword;
           this.m_sPhoneNumber = m_sPhoneNumber;
           this.m_aCourses = m_aCourses;
    }


    /**
     * Gets the m_nId value for this User.
     * 
     * @return m_nId
     */
    public int getM_nId() {
        return m_nId;
    }


    /**
     * Sets the m_nId value for this User.
     * 
     * @param m_nId
     */
    public void setM_nId(int m_nId) {
        this.m_nId = m_nId;
    }


    /**
     * Gets the m_nType value for this User.
     * 
     * @return m_nType
     */
    public int getM_nType() {
        return m_nType;
    }


    /**
     * Sets the m_nType value for this User.
     * 
     * @param m_nType
     */
    public void setM_nType(int m_nType) {
        this.m_nType = m_nType;
    }


    /**
     * Gets the m_sLoginName value for this User.
     * 
     * @return m_sLoginName
     */
    public java.lang.String getM_sLoginName() {
        return m_sLoginName;
    }


    /**
     * Sets the m_sLoginName value for this User.
     * 
     * @param m_sLoginName
     */
    public void setM_sLoginName(java.lang.String m_sLoginName) {
        this.m_sLoginName = m_sLoginName;
    }


    /**
     * Gets the m_sTitle value for this User.
     * 
     * @return m_sTitle
     */
    public java.lang.String getM_sTitle() {
        return m_sTitle;
    }


    /**
     * Sets the m_sTitle value for this User.
     * 
     * @param m_sTitle
     */
    public void setM_sTitle(java.lang.String m_sTitle) {
        this.m_sTitle = m_sTitle;
    }


    /**
     * Gets the m_sFirstName value for this User.
     * 
     * @return m_sFirstName
     */
    public java.lang.String getM_sFirstName() {
        return m_sFirstName;
    }


    /**
     * Sets the m_sFirstName value for this User.
     * 
     * @param m_sFirstName
     */
    public void setM_sFirstName(java.lang.String m_sFirstName) {
        this.m_sFirstName = m_sFirstName;
    }


    /**
     * Gets the m_sSurName value for this User.
     * 
     * @return m_sSurName
     */
    public java.lang.String getM_sSurName() {
        return m_sSurName;
    }


    /**
     * Sets the m_sSurName value for this User.
     * 
     * @param m_sSurName
     */
    public void setM_sSurName(java.lang.String m_sSurName) {
        this.m_sSurName = m_sSurName;
    }


    /**
     * Gets the m_sAddress value for this User.
     * 
     * @return m_sAddress
     */
    public java.lang.String getM_sAddress() {
        return m_sAddress;
    }


    /**
     * Sets the m_sAddress value for this User.
     * 
     * @param m_sAddress
     */
    public void setM_sAddress(java.lang.String m_sAddress) {
        this.m_sAddress = m_sAddress;
    }


    /**
     * Gets the m_sEmail value for this User.
     * 
     * @return m_sEmail
     */
    public java.lang.String getM_sEmail() {
        return m_sEmail;
    }


    /**
     * Sets the m_sEmail value for this User.
     * 
     * @param m_sEmail
     */
    public void setM_sEmail(java.lang.String m_sEmail) {
        this.m_sEmail = m_sEmail;
    }


    /**
     * Gets the m_nFbid value for this User.
     * 
     * @return m_nFbid
     */
    public int getM_nFbid() {
        return m_nFbid;
    }


    /**
     * Sets the m_nFbid value for this User.
     * 
     * @param m_nFbid
     */
    public void setM_nFbid(int m_nFbid) {
        this.m_nFbid = m_nFbid;
    }


    /**
     * Gets the m_nAddressId value for this User.
     * 
     * @return m_nAddressId
     */
    public int getM_nAddressId() {
        return m_nAddressId;
    }


    /**
     * Sets the m_nAddressId value for this User.
     * 
     * @param m_nAddressId
     */
    public void setM_nAddressId(int m_nAddressId) {
        this.m_nAddressId = m_nAddressId;
    }


    /**
     * Gets the m_sPassword value for this User.
     * 
     * @return m_sPassword
     */
    public java.lang.String getM_sPassword() {
        return m_sPassword;
    }


    /**
     * Sets the m_sPassword value for this User.
     * 
     * @param m_sPassword
     */
    public void setM_sPassword(java.lang.String m_sPassword) {
        this.m_sPassword = m_sPassword;
    }


    /**
     * Gets the m_sPhoneNumber value for this User.
     * 
     * @return m_sPhoneNumber
     */
    public java.lang.String getM_sPhoneNumber() {
        return m_sPhoneNumber;
    }


    /**
     * Sets the m_sPhoneNumber value for this User.
     * 
     * @param m_sPhoneNumber
     */
    public void setM_sPhoneNumber(java.lang.String m_sPhoneNumber) {
        this.m_sPhoneNumber = m_sPhoneNumber;
    }


    /**
     * Gets the m_aCourses value for this User.
     * 
     * @return m_aCourses
     */
    public de.debuglevel.evasysmiddleware.soap.Course[] getM_aCourses() {
        return m_aCourses;
    }


    /**
     * Sets the m_aCourses value for this User.
     * 
     * @param m_aCourses
     */
    public void setM_aCourses(de.debuglevel.evasysmiddleware.soap.Course[] m_aCourses) {
        this.m_aCourses = m_aCourses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.m_nId == other.getM_nId() &&
            this.m_nType == other.getM_nType() &&
            ((this.m_sLoginName==null && other.getM_sLoginName()==null) || 
             (this.m_sLoginName!=null &&
              this.m_sLoginName.equals(other.getM_sLoginName()))) &&
            ((this.m_sTitle==null && other.getM_sTitle()==null) || 
             (this.m_sTitle!=null &&
              this.m_sTitle.equals(other.getM_sTitle()))) &&
            ((this.m_sFirstName==null && other.getM_sFirstName()==null) || 
             (this.m_sFirstName!=null &&
              this.m_sFirstName.equals(other.getM_sFirstName()))) &&
            ((this.m_sSurName==null && other.getM_sSurName()==null) || 
             (this.m_sSurName!=null &&
              this.m_sSurName.equals(other.getM_sSurName()))) &&
            ((this.m_sAddress==null && other.getM_sAddress()==null) || 
             (this.m_sAddress!=null &&
              this.m_sAddress.equals(other.getM_sAddress()))) &&
            ((this.m_sEmail==null && other.getM_sEmail()==null) || 
             (this.m_sEmail!=null &&
              this.m_sEmail.equals(other.getM_sEmail()))) &&
            this.m_nFbid == other.getM_nFbid() &&
            this.m_nAddressId == other.getM_nAddressId() &&
            ((this.m_sPassword==null && other.getM_sPassword()==null) || 
             (this.m_sPassword!=null &&
              this.m_sPassword.equals(other.getM_sPassword()))) &&
            ((this.m_sPhoneNumber==null && other.getM_sPhoneNumber()==null) || 
             (this.m_sPhoneNumber!=null &&
              this.m_sPhoneNumber.equals(other.getM_sPhoneNumber()))) &&
            ((this.m_aCourses==null && other.getM_aCourses()==null) || 
             (this.m_aCourses!=null &&
              java.util.Arrays.equals(this.m_aCourses, other.getM_aCourses())));
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
        _hashCode += getM_nType();
        if (getM_sLoginName() != null) {
            _hashCode += getM_sLoginName().hashCode();
        }
        if (getM_sTitle() != null) {
            _hashCode += getM_sTitle().hashCode();
        }
        if (getM_sFirstName() != null) {
            _hashCode += getM_sFirstName().hashCode();
        }
        if (getM_sSurName() != null) {
            _hashCode += getM_sSurName().hashCode();
        }
        if (getM_sAddress() != null) {
            _hashCode += getM_sAddress().hashCode();
        }
        if (getM_sEmail() != null) {
            _hashCode += getM_sEmail().hashCode();
        }
        _hashCode += getM_nFbid();
        _hashCode += getM_nAddressId();
        if (getM_sPassword() != null) {
            _hashCode += getM_sPassword().hashCode();
        }
        if (getM_sPhoneNumber() != null) {
            _hashCode += getM_sPhoneNumber().hashCode();
        }
        if (getM_aCourses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getM_aCourses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getM_aCourses(), i);
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
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sLoginName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sLoginName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sSurName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sSurName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nFbid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nFbid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nAddressId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nAddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_aCourses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_aCourses"));
        elemField.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "Course"));
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
