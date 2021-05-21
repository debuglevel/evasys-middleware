/**
 * Survey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class Survey  implements java.io.Serializable {
    private int m_nSurveyId;

    private int m_nState;

    private java.lang.String m_sTitle;

    private java.lang.String m_cType;

    private int m_nFrmid;

    private int m_nStuid;

    private int m_nVerid;

    private int m_nOpenState;

    private int m_nFormCount;

    private int m_nPswdCount;

    private java.util.Calendar m_sLastDataCollectionDate;

    private int m_nPageLinkOffset;

    private java.lang.String m_sMaskTan;

    private int m_nMaskState;

    private de.debuglevel.evasysmiddleware.soap.Period m_oPeriod;

    public Survey() {
    }

    public Survey(
           int m_nSurveyId,
           int m_nState,
           java.lang.String m_sTitle,
           java.lang.String m_cType,
           int m_nFrmid,
           int m_nStuid,
           int m_nVerid,
           int m_nOpenState,
           int m_nFormCount,
           int m_nPswdCount,
           java.util.Calendar m_sLastDataCollectionDate,
           int m_nPageLinkOffset,
           java.lang.String m_sMaskTan,
           int m_nMaskState,
           de.debuglevel.evasysmiddleware.soap.Period m_oPeriod) {
           this.m_nSurveyId = m_nSurveyId;
           this.m_nState = m_nState;
           this.m_sTitle = m_sTitle;
           this.m_cType = m_cType;
           this.m_nFrmid = m_nFrmid;
           this.m_nStuid = m_nStuid;
           this.m_nVerid = m_nVerid;
           this.m_nOpenState = m_nOpenState;
           this.m_nFormCount = m_nFormCount;
           this.m_nPswdCount = m_nPswdCount;
           this.m_sLastDataCollectionDate = m_sLastDataCollectionDate;
           this.m_nPageLinkOffset = m_nPageLinkOffset;
           this.m_sMaskTan = m_sMaskTan;
           this.m_nMaskState = m_nMaskState;
           this.m_oPeriod = m_oPeriod;
    }


    /**
     * Gets the m_nSurveyId value for this Survey.
     * 
     * @return m_nSurveyId
     */
    public int getM_nSurveyId() {
        return m_nSurveyId;
    }


    /**
     * Sets the m_nSurveyId value for this Survey.
     * 
     * @param m_nSurveyId
     */
    public void setM_nSurveyId(int m_nSurveyId) {
        this.m_nSurveyId = m_nSurveyId;
    }


    /**
     * Gets the m_nState value for this Survey.
     * 
     * @return m_nState
     */
    public int getM_nState() {
        return m_nState;
    }


    /**
     * Sets the m_nState value for this Survey.
     * 
     * @param m_nState
     */
    public void setM_nState(int m_nState) {
        this.m_nState = m_nState;
    }


    /**
     * Gets the m_sTitle value for this Survey.
     * 
     * @return m_sTitle
     */
    public java.lang.String getM_sTitle() {
        return m_sTitle;
    }


    /**
     * Sets the m_sTitle value for this Survey.
     * 
     * @param m_sTitle
     */
    public void setM_sTitle(java.lang.String m_sTitle) {
        this.m_sTitle = m_sTitle;
    }


    /**
     * Gets the m_cType value for this Survey.
     * 
     * @return m_cType
     */
    public java.lang.String getM_cType() {
        return m_cType;
    }


    /**
     * Sets the m_cType value for this Survey.
     * 
     * @param m_cType
     */
    public void setM_cType(java.lang.String m_cType) {
        this.m_cType = m_cType;
    }


    /**
     * Gets the m_nFrmid value for this Survey.
     * 
     * @return m_nFrmid
     */
    public int getM_nFrmid() {
        return m_nFrmid;
    }


    /**
     * Sets the m_nFrmid value for this Survey.
     * 
     * @param m_nFrmid
     */
    public void setM_nFrmid(int m_nFrmid) {
        this.m_nFrmid = m_nFrmid;
    }


    /**
     * Gets the m_nStuid value for this Survey.
     * 
     * @return m_nStuid
     */
    public int getM_nStuid() {
        return m_nStuid;
    }


    /**
     * Sets the m_nStuid value for this Survey.
     * 
     * @param m_nStuid
     */
    public void setM_nStuid(int m_nStuid) {
        this.m_nStuid = m_nStuid;
    }


    /**
     * Gets the m_nVerid value for this Survey.
     * 
     * @return m_nVerid
     */
    public int getM_nVerid() {
        return m_nVerid;
    }


    /**
     * Sets the m_nVerid value for this Survey.
     * 
     * @param m_nVerid
     */
    public void setM_nVerid(int m_nVerid) {
        this.m_nVerid = m_nVerid;
    }


    /**
     * Gets the m_nOpenState value for this Survey.
     * 
     * @return m_nOpenState
     */
    public int getM_nOpenState() {
        return m_nOpenState;
    }


    /**
     * Sets the m_nOpenState value for this Survey.
     * 
     * @param m_nOpenState
     */
    public void setM_nOpenState(int m_nOpenState) {
        this.m_nOpenState = m_nOpenState;
    }


    /**
     * Gets the m_nFormCount value for this Survey.
     * 
     * @return m_nFormCount
     */
    public int getM_nFormCount() {
        return m_nFormCount;
    }


    /**
     * Sets the m_nFormCount value for this Survey.
     * 
     * @param m_nFormCount
     */
    public void setM_nFormCount(int m_nFormCount) {
        this.m_nFormCount = m_nFormCount;
    }


    /**
     * Gets the m_nPswdCount value for this Survey.
     * 
     * @return m_nPswdCount
     */
    public int getM_nPswdCount() {
        return m_nPswdCount;
    }


    /**
     * Sets the m_nPswdCount value for this Survey.
     * 
     * @param m_nPswdCount
     */
    public void setM_nPswdCount(int m_nPswdCount) {
        this.m_nPswdCount = m_nPswdCount;
    }


    /**
     * Gets the m_sLastDataCollectionDate value for this Survey.
     * 
     * @return m_sLastDataCollectionDate
     */
    public java.util.Calendar getM_sLastDataCollectionDate() {
        return m_sLastDataCollectionDate;
    }


    /**
     * Sets the m_sLastDataCollectionDate value for this Survey.
     * 
     * @param m_sLastDataCollectionDate
     */
    public void setM_sLastDataCollectionDate(java.util.Calendar m_sLastDataCollectionDate) {
        this.m_sLastDataCollectionDate = m_sLastDataCollectionDate;
    }


    /**
     * Gets the m_nPageLinkOffset value for this Survey.
     * 
     * @return m_nPageLinkOffset
     */
    public int getM_nPageLinkOffset() {
        return m_nPageLinkOffset;
    }


    /**
     * Sets the m_nPageLinkOffset value for this Survey.
     * 
     * @param m_nPageLinkOffset
     */
    public void setM_nPageLinkOffset(int m_nPageLinkOffset) {
        this.m_nPageLinkOffset = m_nPageLinkOffset;
    }


    /**
     * Gets the m_sMaskTan value for this Survey.
     * 
     * @return m_sMaskTan
     */
    public java.lang.String getM_sMaskTan() {
        return m_sMaskTan;
    }


    /**
     * Sets the m_sMaskTan value for this Survey.
     * 
     * @param m_sMaskTan
     */
    public void setM_sMaskTan(java.lang.String m_sMaskTan) {
        this.m_sMaskTan = m_sMaskTan;
    }


    /**
     * Gets the m_nMaskState value for this Survey.
     * 
     * @return m_nMaskState
     */
    public int getM_nMaskState() {
        return m_nMaskState;
    }


    /**
     * Sets the m_nMaskState value for this Survey.
     * 
     * @param m_nMaskState
     */
    public void setM_nMaskState(int m_nMaskState) {
        this.m_nMaskState = m_nMaskState;
    }


    /**
     * Gets the m_oPeriod value for this Survey.
     * 
     * @return m_oPeriod
     */
    public de.debuglevel.evasysmiddleware.soap.Period getM_oPeriod() {
        return m_oPeriod;
    }


    /**
     * Sets the m_oPeriod value for this Survey.
     * 
     * @param m_oPeriod
     */
    public void setM_oPeriod(de.debuglevel.evasysmiddleware.soap.Period m_oPeriod) {
        this.m_oPeriod = m_oPeriod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Survey)) return false;
        Survey other = (Survey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.m_nSurveyId == other.getM_nSurveyId() &&
            this.m_nState == other.getM_nState() &&
            ((this.m_sTitle==null && other.getM_sTitle()==null) || 
             (this.m_sTitle!=null &&
              this.m_sTitle.equals(other.getM_sTitle()))) &&
            ((this.m_cType==null && other.getM_cType()==null) || 
             (this.m_cType!=null &&
              this.m_cType.equals(other.getM_cType()))) &&
            this.m_nFrmid == other.getM_nFrmid() &&
            this.m_nStuid == other.getM_nStuid() &&
            this.m_nVerid == other.getM_nVerid() &&
            this.m_nOpenState == other.getM_nOpenState() &&
            this.m_nFormCount == other.getM_nFormCount() &&
            this.m_nPswdCount == other.getM_nPswdCount() &&
            ((this.m_sLastDataCollectionDate==null && other.getM_sLastDataCollectionDate()==null) || 
             (this.m_sLastDataCollectionDate!=null &&
              this.m_sLastDataCollectionDate.equals(other.getM_sLastDataCollectionDate()))) &&
            this.m_nPageLinkOffset == other.getM_nPageLinkOffset() &&
            ((this.m_sMaskTan==null && other.getM_sMaskTan()==null) || 
             (this.m_sMaskTan!=null &&
              this.m_sMaskTan.equals(other.getM_sMaskTan()))) &&
            this.m_nMaskState == other.getM_nMaskState() &&
            ((this.m_oPeriod==null && other.getM_oPeriod()==null) || 
             (this.m_oPeriod!=null &&
              this.m_oPeriod.equals(other.getM_oPeriod())));
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
        _hashCode += getM_nSurveyId();
        _hashCode += getM_nState();
        if (getM_sTitle() != null) {
            _hashCode += getM_sTitle().hashCode();
        }
        if (getM_cType() != null) {
            _hashCode += getM_cType().hashCode();
        }
        _hashCode += getM_nFrmid();
        _hashCode += getM_nStuid();
        _hashCode += getM_nVerid();
        _hashCode += getM_nOpenState();
        _hashCode += getM_nFormCount();
        _hashCode += getM_nPswdCount();
        if (getM_sLastDataCollectionDate() != null) {
            _hashCode += getM_sLastDataCollectionDate().hashCode();
        }
        _hashCode += getM_nPageLinkOffset();
        if (getM_sMaskTan() != null) {
            _hashCode += getM_sMaskTan().hashCode();
        }
        _hashCode += getM_nMaskState();
        if (getM_oPeriod() != null) {
            _hashCode += getM_oPeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Survey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "Survey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nSurveyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nSurveyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_cType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_cType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nFrmid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nFrmid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nStuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nStuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nVerid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nVerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nOpenState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nOpenState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nFormCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nFormCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nPswdCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nPswdCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sLastDataCollectionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sLastDataCollectionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nPageLinkOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nPageLinkOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_sMaskTan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_sMaskTan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_nMaskState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_nMaskState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_oPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_oPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("soapserver.wsdl", "Period"));
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
