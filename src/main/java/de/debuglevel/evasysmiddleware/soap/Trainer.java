/**
 * Trainer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class Trainer  implements java.io.Serializable {
    private java.lang.String trainerUid;

    private java.lang.String trainerFirstName;

    private java.lang.String trainerLastName;

    private java.lang.String trainerGender;

    private java.lang.String trainerEmail;

    private java.lang.String trainerPhone;

    public Trainer() {
    }

    public Trainer(
           java.lang.String trainerUid,
           java.lang.String trainerFirstName,
           java.lang.String trainerLastName,
           java.lang.String trainerGender,
           java.lang.String trainerEmail,
           java.lang.String trainerPhone) {
           this.trainerUid = trainerUid;
           this.trainerFirstName = trainerFirstName;
           this.trainerLastName = trainerLastName;
           this.trainerGender = trainerGender;
           this.trainerEmail = trainerEmail;
           this.trainerPhone = trainerPhone;
    }


    /**
     * Gets the trainerUid value for this Trainer.
     * 
     * @return trainerUid
     */
    public java.lang.String getTrainerUid() {
        return trainerUid;
    }


    /**
     * Sets the trainerUid value for this Trainer.
     * 
     * @param trainerUid
     */
    public void setTrainerUid(java.lang.String trainerUid) {
        this.trainerUid = trainerUid;
    }


    /**
     * Gets the trainerFirstName value for this Trainer.
     * 
     * @return trainerFirstName
     */
    public java.lang.String getTrainerFirstName() {
        return trainerFirstName;
    }


    /**
     * Sets the trainerFirstName value for this Trainer.
     * 
     * @param trainerFirstName
     */
    public void setTrainerFirstName(java.lang.String trainerFirstName) {
        this.trainerFirstName = trainerFirstName;
    }


    /**
     * Gets the trainerLastName value for this Trainer.
     * 
     * @return trainerLastName
     */
    public java.lang.String getTrainerLastName() {
        return trainerLastName;
    }


    /**
     * Sets the trainerLastName value for this Trainer.
     * 
     * @param trainerLastName
     */
    public void setTrainerLastName(java.lang.String trainerLastName) {
        this.trainerLastName = trainerLastName;
    }


    /**
     * Gets the trainerGender value for this Trainer.
     * 
     * @return trainerGender
     */
    public java.lang.String getTrainerGender() {
        return trainerGender;
    }


    /**
     * Sets the trainerGender value for this Trainer.
     * 
     * @param trainerGender
     */
    public void setTrainerGender(java.lang.String trainerGender) {
        this.trainerGender = trainerGender;
    }


    /**
     * Gets the trainerEmail value for this Trainer.
     * 
     * @return trainerEmail
     */
    public java.lang.String getTrainerEmail() {
        return trainerEmail;
    }


    /**
     * Sets the trainerEmail value for this Trainer.
     * 
     * @param trainerEmail
     */
    public void setTrainerEmail(java.lang.String trainerEmail) {
        this.trainerEmail = trainerEmail;
    }


    /**
     * Gets the trainerPhone value for this Trainer.
     * 
     * @return trainerPhone
     */
    public java.lang.String getTrainerPhone() {
        return trainerPhone;
    }


    /**
     * Sets the trainerPhone value for this Trainer.
     * 
     * @param trainerPhone
     */
    public void setTrainerPhone(java.lang.String trainerPhone) {
        this.trainerPhone = trainerPhone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Trainer)) return false;
        Trainer other = (Trainer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trainerUid==null && other.getTrainerUid()==null) || 
             (this.trainerUid!=null &&
              this.trainerUid.equals(other.getTrainerUid()))) &&
            ((this.trainerFirstName==null && other.getTrainerFirstName()==null) || 
             (this.trainerFirstName!=null &&
              this.trainerFirstName.equals(other.getTrainerFirstName()))) &&
            ((this.trainerLastName==null && other.getTrainerLastName()==null) || 
             (this.trainerLastName!=null &&
              this.trainerLastName.equals(other.getTrainerLastName()))) &&
            ((this.trainerGender==null && other.getTrainerGender()==null) || 
             (this.trainerGender!=null &&
              this.trainerGender.equals(other.getTrainerGender()))) &&
            ((this.trainerEmail==null && other.getTrainerEmail()==null) || 
             (this.trainerEmail!=null &&
              this.trainerEmail.equals(other.getTrainerEmail()))) &&
            ((this.trainerPhone==null && other.getTrainerPhone()==null) || 
             (this.trainerPhone!=null &&
              this.trainerPhone.equals(other.getTrainerPhone())));
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
        if (getTrainerUid() != null) {
            _hashCode += getTrainerUid().hashCode();
        }
        if (getTrainerFirstName() != null) {
            _hashCode += getTrainerFirstName().hashCode();
        }
        if (getTrainerLastName() != null) {
            _hashCode += getTrainerLastName().hashCode();
        }
        if (getTrainerGender() != null) {
            _hashCode += getTrainerGender().hashCode();
        }
        if (getTrainerEmail() != null) {
            _hashCode += getTrainerEmail().hashCode();
        }
        if (getTrainerPhone() != null) {
            _hashCode += getTrainerPhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Trainer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "Trainer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainerUid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TrainerUid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainerFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TrainerFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainerLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TrainerLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainerGender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TrainerGender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TrainerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TrainerPhone"));
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
