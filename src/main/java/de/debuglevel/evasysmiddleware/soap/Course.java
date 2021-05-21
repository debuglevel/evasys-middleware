/**
 * Course.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class Course  implements java.io.Serializable {
    private int m_nCourseId;

    private java.lang.String m_sProgramOfStudy;

    private java.lang.String m_sCourseTitle;

    private java.lang.String m_sRoom;

    private int m_nCourseType;

    private java.lang.String m_sPubCourseId;

    private int m_nCountStud;

    private java.lang.String[] m_aCustomFieldValues;

    private int m_nUserId;

    private int m_nFbid;

    private int m_nPeriodId;

    private de.debuglevel.evasysmiddleware.soap.Person[] m_aoParticipants;

    private de.debuglevel.evasysmiddleware.soap.User[] m_aoSecondaryInstructors;

    private de.debuglevel.evasysmiddleware.soap.SurveyHolder m_oSurveyHolder;

    public Course() {
    }

    public Course(
           int m_nCourseId,
           java.lang.String m_sProgramOfStudy,
           java.lang.String m_sCourseTitle,
           java.lang.String m_sRoom,
           int m_nCourseType,
           java.lang.String m_sPubCourseId,
           int m_nCountStud,
           java.lang.String[] m_aCustomFieldValues,
           int m_nUserId,
           int m_nFbid,
           int m_nPeriodId,
           de.debuglevel.evasysmiddleware.soap.Person[] m_aoParticipants,
           de.debuglevel.evasysmiddleware.soap.User[] m_aoSecondaryInstructors,
           de.debuglevel.evasysmiddleware.soap.SurveyHolder m_oSurveyHolder) {
           this.m_nCourseId = m_nCourseId;
           this.m_sProgramOfStudy = m_sProgramOfStudy;
           this.m_sCourseTitle = m_sCourseTitle;
           this.m_sRoom = m_sRoom;
           this.m_nCourseType = m_nCourseType;
           this.m_sPubCourseId = m_sPubCourseId;
           this.m_nCountStud = m_nCountStud;
           this.m_aCustomFieldValues = m_aCustomFieldValues;
           this.m_nUserId = m_nUserId;
           this.m_nFbid = m_nFbid;
           this.m_nPeriodId = m_nPeriodId;
           this.m_aoParticipants = m_aoParticipants;
           this.m_aoSecondaryInstructors = m_aoSecondaryInstructors;
           this.m_oSurveyHolder = m_oSurveyHolder;
    }


    /**
     * Gets the m_nCourseId value for this Course.
     * 
     * @return m_nCourseId
     */
    public int getM_nCourseId() {
        return m_nCourseId;
    }


    /**
     * Sets the m_nCourseId value for this Course.
     * 
     * @param m_nCourseId
     */
    public void setM_nCourseId(int m_nCourseId) {
        this.m_nCourseId = m_nCourseId;
    }


    /**
     * Gets the m_sProgramOfStudy value for this Course.
     * 
     * @return m_sProgramOfStudy
     */
    public java.lang.String getM_sProgramOfStudy() {
        return m_sProgramOfStudy;
    }


    /**
     * Sets the m_sProgramOfStudy value for this Course.
     * 
     * @param m_sProgramOfStudy
     */
    public void setM_sProgramOfStudy(java.lang.String m_sProgramOfStudy) {
        this.m_sProgramOfStudy = m_sProgramOfStudy;
    }


    /**
     * Gets the m_sCourseTitle value for this Course.
     * 
     * @return m_sCourseTitle
     */
    public java.lang.String getM_sCourseTitle() {
        return m_sCourseTitle;
    }


    /**
     * Sets the m_sCourseTitle value for this Course.
     * 
     * @param m_sCourseTitle
     */
    public void setM_sCourseTitle(java.lang.String m_sCourseTitle) {
        this.m_sCourseTitle = m_sCourseTitle;
    }


    /**
     * Gets the m_sRoom value for this Course.
     * 
     * @return m_sRoom
     */
    public java.lang.String getM_sRoom() {
        return m_sRoom;
    }


    /**
     * Sets the m_sRoom value for this Course.
     * 
     * @param m_sRoom
     */
    public void setM_sRoom(java.lang.String m_sRoom) {
        this.m_sRoom = m_sRoom;
    }


    /**
     * Gets the m_nCourseType value for this Course.
     * 
     * @return m_nCourseType
     */
    public int getM_nCourseType() {
        return m_nCourseType;
    }


    /**
     * Sets the m_nCourseType value for this Course.
     * 
     * @param m_nCourseType
     */
    public void setM_nCourseType(int m_nCourseType) {
        this.m_nCourseType = m_nCourseType;
    }


    /**
     * Gets the m_sPubCourseId value for this Course.
     * 
     * @return m_sPubCourseId
     */
    public java.lang.String getM_sPubCourseId() {
        return m_sPubCourseId;
    }


    /**
     * Sets the m_sPubCourseId value for this Course.
     * 
     * @param m_sPubCourseId
     */
    public void setM_sPubCourseId(java.lang.String m_sPubCourseId) {
        this.m_sPubCourseId = m_sPubCourseId;
    }


    /**
     * Gets the m_nCountStud value for this Course.
     * 
     * @return m_nCountStud
     */
    public int getM_nCountStud() {
        return m_nCountStud;
    }


    /**
     * Sets the m_nCountStud value for this Course.
     * 
     * @param m_nCountStud
     */
    public void setM_nCountStud(int m_nCountStud) {
        this.m_nCountStud = m_nCountStud;
    }


    /**
     * Gets the m_aCustomFieldValues value for this Course.
     * 
     * @return m_aCustomFieldValues
     */
    public java.lang.String[] getM_aCustomFieldValues() {
        return m_aCustomFieldValues;
    }


    /**
     * Sets the m_aCustomFieldValues value for this Course.
     * 
     * @param m_aCustomFieldValues
     */
    public void setM_aCustomFieldValues(java.lang.String[] m_aCustomFieldValues) {
        this.m_aCustomFieldValues = m_aCustomFieldValues;
    }


    /**
     * Gets the m_nUserId value for this Course.
     * 
     * @return m_nUserId
     */
    public int getM_nUserId() {
        return m_nUserId;
    }


    /**
     * Sets the m_nUserId value for this Course.
     * 
     * @param m_nUserId
     */
    public void setM_nUserId(int m_nUserId) {
        this.m_nUserId = m_nUserId;
    }


    /**
     * Gets the m_nFbid value for this Course.
     * 
     * @return m_nFbid
     */
    public int getM_nFbid() {
        return m_nFbid;
    }


    /**
     * Sets the m_nFbid value for this Course.
     * 
     * @param m_nFbid
     */
    public void setM_nFbid(int m_nFbid) {
        this.m_nFbid = m_nFbid;
    }


    /**
     * Gets the m_nPeriodId value for this Course.
     * 
     * @return m_nPeriodId
     */
    public int getM_nPeriodId() {
        return m_nPeriodId;
    }


    /**
     * Sets the m_nPeriodId value for this Course.
     * 
     * @param m_nPeriodId
     */
    public void setM_nPeriodId(int m_nPeriodId) {
        this.m_nPeriodId = m_nPeriodId;
    }


    /**
     * Gets the m_aoParticipants value for this Course.
     * 
     * @return m_aoParticipants
     */
    public de.debuglevel.evasysmiddleware.soap.Person[] getM_aoParticipants() {
        return m_aoParticipants;
    }


    /**
     * Sets the m_aoParticipants value for this Course.
     * 
     * @param m_aoParticipants
     */
    public void setM_aoParticipants(de.debuglevel.evasysmiddleware.soap.Person[] m_aoParticipants) {
        this.m_aoParticipants = m_aoParticipants;
    }


    /**
     * Gets the m_aoSecondaryInstructors value for this Course.
     * 
     * @return m_aoSecondaryInstructors
     */
    public de.debuglevel.evasysmiddleware.soap.User[] getM_aoSecondaryInstructors() {
        return m_aoSecondaryInstructors;
    }


    /**
     * Sets the m_aoSecondaryInstructors value for this Course.
     * 
     * @param m_aoSecondaryInstructors
     */
    public void setM_aoSecondaryInstructors(de.debuglevel.evasysmiddleware.soap.User[] m_aoSecondaryInstructors) {
        this.m_aoSecondaryInstructors = m_aoSecondaryInstructors;
    }


    /**
     * Gets the m_oSurveyHolder value for this Course.
     * 
     * @return m_oSurveyHolder
     */
    public de.debuglevel.evasysmiddleware.soap.SurveyHolder getM_oSurveyHolder() {
        return m_oSurveyHolder;
    }


    /**
     * Sets the m_oSurveyHolder value for this Course.
     * 
     * @param m_oSurveyHolder
     */
    public void setM_oSurveyHolder(de.debuglevel.evasysmiddleware.soap.SurveyHolder m_oSurveyHolder) {
        this.m_oSurveyHolder = m_oSurveyHolder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Course)) return false;
        Course other = (Course) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.m_nCourseId == other.getM_nCourseId() &&
            ((this.m_sProgramOfStudy==null && other.getM_sProgramOfStudy()==null) || 
             (this.m_sProgramOfStudy!=null &&
              this.m_sProgramOfStudy.equals(other.getM_sProgramOfStudy()))) &&
            ((this.m_sCourseTitle==null && other.getM_sCourseTitle()==null) || 
             (this.m_sCourseTitle!=null &&
              this.m_sCourseTitle.equals(other.getM_sCourseTitle()))) &&
            ((this.m_sRoom==null && other.getM_sRoom()==null) || 
             (this.m_sRoom!=null &&
              this.m_sRoom.equals(other.getM_sRoom()))) &&
            this.m_nCourseType == other.getM_nCourseType() &&
            ((this.m_sPubCourseId==null && other.getM_sPubCourseId()==null) || 
             (this.m_sPubCourseId!=null &&
              this.m_sPubCourseId.equals(other.getM_sPubCourseId()))) &&
            this.m_nCountStud == other.getM_nCountStud() &&
            ((this.m_aCustomFieldValues==null && other.getM_aCustomFieldValues()==null) || 
             (this.m_aCustomFieldValues!=null &&
              java.util.Arrays.equals(this.m_aCustomFieldValues, other.getM_aCustomFieldValues()))) &&
            this.m_nUserId == other.getM_nUserId() &&
            this.m_nFbid == other.getM_nFbid() &&
            this.m_nPeriodId == other.getM_nPeriodId() &&
            ((this.m_aoParticipants==null && other.getM_aoParticipants()==null) || 
             (this.m_aoParticipants!=null &&
              java.util.Arrays.equals(this.m_aoParticipants, other.getM_aoParticipants()))) &&
            ((this.m_aoSecondaryInstructors==null && other.getM_aoSecondaryInstructors()==null) || 
             (this.m_aoSecondaryInstructors!=null &&
              java.util.Arrays.equals(this.m_aoSecondaryInstructors, other.getM_aoSecondaryInstructors()))) &&
            ((this.m_oSurveyHolder==null && other.getM_oSurveyHolder()==null) || 
             (this.m_oSurveyHolder!=null &&
              this.m_oSurveyHolder.equals(other.getM_oSurveyHolder())));
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
        _hashCode += getM_nCourseId();
        if (getM_sProgramOfStudy() != null) {
            _hashCode += getM_sProgramOfStudy().hashCode();
        }
        if (getM_sCourseTitle() != null) {
            _hashCode += getM_sCourseTitle().hashCode();
        }
        if (getM_sRoom() != null) {
            _hashCode += getM_sRoom().hashCode();
        }
        _hashCode += getM_nCourseType();
        if (getM_sPubCourseId() != null) {
            _hashCode += getM_sPubCourseId().hashCode();
        }
        _hashCode += getM_nCountStud();
        if (getM_aCustomFieldValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getM_aCustomFieldValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getM_aCustomFieldValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getM_nUserId();
        _hashCode += getM_nFbid();
        _hashCode += getM_nPeriodId();
        if (getM_aoParticipants() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getM_aoParticipants());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getM_aoParticipants(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getM_aoSecondaryInstructors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getM_aoSecondaryInstructors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getM_aoSecondaryInstructors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getM_oSurveyHolder() != null) {
            _hashCode += getM_oSurveyHolder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Course.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "Course"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nCourseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nCourseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sProgramOfStudy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sProgramOfStudy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sCourseTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sCourseTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sRoom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sRoom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nCourseType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nCourseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sPubCourseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sPubCourseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nCountStud");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nCountStud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_aCustomFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_aCustomFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nFbid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nFbid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nPeriodId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nPeriodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_aoParticipants");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_aoParticipants"));
        elemField.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "Person"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_aoSecondaryInstructors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_aoSecondaryInstructors"));
        elemField.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "User"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_oSurveyHolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_oSurveyHolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "SurveyHolder"));
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
