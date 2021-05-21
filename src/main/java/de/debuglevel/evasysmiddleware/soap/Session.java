/**
 * Session.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class Session  implements java.io.Serializable {
    private java.lang.String courseUid;

    private java.lang.String courseName;

    private java.lang.String courseCode;

    private java.lang.String courseType;

    private java.lang.String courseProgramOfStudy;

    private java.lang.String courseEnrollment;

    private java.lang.String courseCustomField1;

    private java.lang.String courseCustomField2;

    private java.lang.String courseCustomField3;

    private java.lang.String courseCustomField4;

    private java.lang.String courseCustomField5;

    private de.debuglevel.evasysmiddleware.soap.Trainer[] trainerList;

    private java.lang.String roomName;

    private java.lang.String subunitName;

    public Session() {
    }

    public Session(
           java.lang.String courseUid,
           java.lang.String courseName,
           java.lang.String courseCode,
           java.lang.String courseType,
           java.lang.String courseProgramOfStudy,
           java.lang.String courseEnrollment,
           java.lang.String courseCustomField1,
           java.lang.String courseCustomField2,
           java.lang.String courseCustomField3,
           java.lang.String courseCustomField4,
           java.lang.String courseCustomField5,
           de.debuglevel.evasysmiddleware.soap.Trainer[] trainerList,
           java.lang.String roomName,
           java.lang.String subunitName) {
           this.courseUid = courseUid;
           this.courseName = courseName;
           this.courseCode = courseCode;
           this.courseType = courseType;
           this.courseProgramOfStudy = courseProgramOfStudy;
           this.courseEnrollment = courseEnrollment;
           this.courseCustomField1 = courseCustomField1;
           this.courseCustomField2 = courseCustomField2;
           this.courseCustomField3 = courseCustomField3;
           this.courseCustomField4 = courseCustomField4;
           this.courseCustomField5 = courseCustomField5;
           this.trainerList = trainerList;
           this.roomName = roomName;
           this.subunitName = subunitName;
    }


    /**
     * Gets the courseUid value for this Session.
     * 
     * @return courseUid
     */
    public java.lang.String getCourseUid() {
        return courseUid;
    }


    /**
     * Sets the courseUid value for this Session.
     * 
     * @param courseUid
     */
    public void setCourseUid(java.lang.String courseUid) {
        this.courseUid = courseUid;
    }


    /**
     * Gets the courseName value for this Session.
     * 
     * @return courseName
     */
    public java.lang.String getCourseName() {
        return courseName;
    }


    /**
     * Sets the courseName value for this Session.
     * 
     * @param courseName
     */
    public void setCourseName(java.lang.String courseName) {
        this.courseName = courseName;
    }


    /**
     * Gets the courseCode value for this Session.
     * 
     * @return courseCode
     */
    public java.lang.String getCourseCode() {
        return courseCode;
    }


    /**
     * Sets the courseCode value for this Session.
     * 
     * @param courseCode
     */
    public void setCourseCode(java.lang.String courseCode) {
        this.courseCode = courseCode;
    }


    /**
     * Gets the courseType value for this Session.
     * 
     * @return courseType
     */
    public java.lang.String getCourseType() {
        return courseType;
    }


    /**
     * Sets the courseType value for this Session.
     * 
     * @param courseType
     */
    public void setCourseType(java.lang.String courseType) {
        this.courseType = courseType;
    }


    /**
     * Gets the courseProgramOfStudy value for this Session.
     * 
     * @return courseProgramOfStudy
     */
    public java.lang.String getCourseProgramOfStudy() {
        return courseProgramOfStudy;
    }


    /**
     * Sets the courseProgramOfStudy value for this Session.
     * 
     * @param courseProgramOfStudy
     */
    public void setCourseProgramOfStudy(java.lang.String courseProgramOfStudy) {
        this.courseProgramOfStudy = courseProgramOfStudy;
    }


    /**
     * Gets the courseEnrollment value for this Session.
     * 
     * @return courseEnrollment
     */
    public java.lang.String getCourseEnrollment() {
        return courseEnrollment;
    }


    /**
     * Sets the courseEnrollment value for this Session.
     * 
     * @param courseEnrollment
     */
    public void setCourseEnrollment(java.lang.String courseEnrollment) {
        this.courseEnrollment = courseEnrollment;
    }


    /**
     * Gets the courseCustomField1 value for this Session.
     * 
     * @return courseCustomField1
     */
    public java.lang.String getCourseCustomField1() {
        return courseCustomField1;
    }


    /**
     * Sets the courseCustomField1 value for this Session.
     * 
     * @param courseCustomField1
     */
    public void setCourseCustomField1(java.lang.String courseCustomField1) {
        this.courseCustomField1 = courseCustomField1;
    }


    /**
     * Gets the courseCustomField2 value for this Session.
     * 
     * @return courseCustomField2
     */
    public java.lang.String getCourseCustomField2() {
        return courseCustomField2;
    }


    /**
     * Sets the courseCustomField2 value for this Session.
     * 
     * @param courseCustomField2
     */
    public void setCourseCustomField2(java.lang.String courseCustomField2) {
        this.courseCustomField2 = courseCustomField2;
    }


    /**
     * Gets the courseCustomField3 value for this Session.
     * 
     * @return courseCustomField3
     */
    public java.lang.String getCourseCustomField3() {
        return courseCustomField3;
    }


    /**
     * Sets the courseCustomField3 value for this Session.
     * 
     * @param courseCustomField3
     */
    public void setCourseCustomField3(java.lang.String courseCustomField3) {
        this.courseCustomField3 = courseCustomField3;
    }


    /**
     * Gets the courseCustomField4 value for this Session.
     * 
     * @return courseCustomField4
     */
    public java.lang.String getCourseCustomField4() {
        return courseCustomField4;
    }


    /**
     * Sets the courseCustomField4 value for this Session.
     * 
     * @param courseCustomField4
     */
    public void setCourseCustomField4(java.lang.String courseCustomField4) {
        this.courseCustomField4 = courseCustomField4;
    }


    /**
     * Gets the courseCustomField5 value for this Session.
     * 
     * @return courseCustomField5
     */
    public java.lang.String getCourseCustomField5() {
        return courseCustomField5;
    }


    /**
     * Sets the courseCustomField5 value for this Session.
     * 
     * @param courseCustomField5
     */
    public void setCourseCustomField5(java.lang.String courseCustomField5) {
        this.courseCustomField5 = courseCustomField5;
    }


    /**
     * Gets the trainerList value for this Session.
     * 
     * @return trainerList
     */
    public de.debuglevel.evasysmiddleware.soap.Trainer[] getTrainerList() {
        return trainerList;
    }


    /**
     * Sets the trainerList value for this Session.
     * 
     * @param trainerList
     */
    public void setTrainerList(de.debuglevel.evasysmiddleware.soap.Trainer[] trainerList) {
        this.trainerList = trainerList;
    }


    /**
     * Gets the roomName value for this Session.
     * 
     * @return roomName
     */
    public java.lang.String getRoomName() {
        return roomName;
    }


    /**
     * Sets the roomName value for this Session.
     * 
     * @param roomName
     */
    public void setRoomName(java.lang.String roomName) {
        this.roomName = roomName;
    }


    /**
     * Gets the subunitName value for this Session.
     * 
     * @return subunitName
     */
    public java.lang.String getSubunitName() {
        return subunitName;
    }


    /**
     * Sets the subunitName value for this Session.
     * 
     * @param subunitName
     */
    public void setSubunitName(java.lang.String subunitName) {
        this.subunitName = subunitName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Session)) return false;
        Session other = (Session) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.courseUid==null && other.getCourseUid()==null) || 
             (this.courseUid!=null &&
              this.courseUid.equals(other.getCourseUid()))) &&
            ((this.courseName==null && other.getCourseName()==null) || 
             (this.courseName!=null &&
              this.courseName.equals(other.getCourseName()))) &&
            ((this.courseCode==null && other.getCourseCode()==null) || 
             (this.courseCode!=null &&
              this.courseCode.equals(other.getCourseCode()))) &&
            ((this.courseType==null && other.getCourseType()==null) || 
             (this.courseType!=null &&
              this.courseType.equals(other.getCourseType()))) &&
            ((this.courseProgramOfStudy==null && other.getCourseProgramOfStudy()==null) || 
             (this.courseProgramOfStudy!=null &&
              this.courseProgramOfStudy.equals(other.getCourseProgramOfStudy()))) &&
            ((this.courseEnrollment==null && other.getCourseEnrollment()==null) || 
             (this.courseEnrollment!=null &&
              this.courseEnrollment.equals(other.getCourseEnrollment()))) &&
            ((this.courseCustomField1==null && other.getCourseCustomField1()==null) || 
             (this.courseCustomField1!=null &&
              this.courseCustomField1.equals(other.getCourseCustomField1()))) &&
            ((this.courseCustomField2==null && other.getCourseCustomField2()==null) || 
             (this.courseCustomField2!=null &&
              this.courseCustomField2.equals(other.getCourseCustomField2()))) &&
            ((this.courseCustomField3==null && other.getCourseCustomField3()==null) || 
             (this.courseCustomField3!=null &&
              this.courseCustomField3.equals(other.getCourseCustomField3()))) &&
            ((this.courseCustomField4==null && other.getCourseCustomField4()==null) || 
             (this.courseCustomField4!=null &&
              this.courseCustomField4.equals(other.getCourseCustomField4()))) &&
            ((this.courseCustomField5==null && other.getCourseCustomField5()==null) || 
             (this.courseCustomField5!=null &&
              this.courseCustomField5.equals(other.getCourseCustomField5()))) &&
            ((this.trainerList==null && other.getTrainerList()==null) || 
             (this.trainerList!=null &&
              java.util.Arrays.equals(this.trainerList, other.getTrainerList()))) &&
            ((this.roomName==null && other.getRoomName()==null) || 
             (this.roomName!=null &&
              this.roomName.equals(other.getRoomName()))) &&
            ((this.subunitName==null && other.getSubunitName()==null) || 
             (this.subunitName!=null &&
              this.subunitName.equals(other.getSubunitName())));
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
        if (getCourseUid() != null) {
            _hashCode += getCourseUid().hashCode();
        }
        if (getCourseName() != null) {
            _hashCode += getCourseName().hashCode();
        }
        if (getCourseCode() != null) {
            _hashCode += getCourseCode().hashCode();
        }
        if (getCourseType() != null) {
            _hashCode += getCourseType().hashCode();
        }
        if (getCourseProgramOfStudy() != null) {
            _hashCode += getCourseProgramOfStudy().hashCode();
        }
        if (getCourseEnrollment() != null) {
            _hashCode += getCourseEnrollment().hashCode();
        }
        if (getCourseCustomField1() != null) {
            _hashCode += getCourseCustomField1().hashCode();
        }
        if (getCourseCustomField2() != null) {
            _hashCode += getCourseCustomField2().hashCode();
        }
        if (getCourseCustomField3() != null) {
            _hashCode += getCourseCustomField3().hashCode();
        }
        if (getCourseCustomField4() != null) {
            _hashCode += getCourseCustomField4().hashCode();
        }
        if (getCourseCustomField5() != null) {
            _hashCode += getCourseCustomField5().hashCode();
        }
        if (getTrainerList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrainerList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrainerList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoomName() != null) {
            _hashCode += getRoomName().hashCode();
        }
        if (getSubunitName() != null) {
            _hashCode += getSubunitName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Session.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "Session"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseUid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CourseUid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CourseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CourseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CourseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseProgramOfStudy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CourseProgramOfStudy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseEnrollment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CourseEnrollment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseCustomField1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CourseCustomField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseCustomField2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CourseCustomField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseCustomField3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CourseCustomField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseCustomField4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CourseCustomField4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseCustomField5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CourseCustomField5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trainerList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TrainerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "Trainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RoomName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subunitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubunitName"));
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
