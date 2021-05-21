/**
 * EvasysSoapPort_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public interface EvasysSoapPort_PortType extends java.rmi.Remote {
    java.lang.String requestTicket(java.lang.String login, java.lang.String password) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.OnlineSurveyKey[] getPswdsByParticipant(java.lang.String userMailAddress, java.lang.String courseCode) throws java.rmi.RemoteException;
    void deletePswds(de.debuglevel.evasysmiddleware.soap.holders.ObjectListHolder objectList) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.User getUserById(int nUserId) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.User getUserByLogin(java.lang.String sLogin, boolean bIncludeCourses, boolean bIncludeSurveys, boolean bIncludeParticipants) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.User[] getLecturersBySubunit(int nSubunitId) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Period[] getAllPeriods() throws java.rmi.RemoteException;
    void updateUser(de.debuglevel.evasysmiddleware.soap.holders.UserHolder user) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Course[] getCoursesByUserId(int nUserId) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Course getCourseById(int nCourseId) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Course getCourseByCourseIdAndUserId(java.lang.String sExternalCourseId, int nUserId) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Course insertCourse(de.debuglevel.evasysmiddleware.soap.Course oCourse) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Course updateCourse(de.debuglevel.evasysmiddleware.soap.Course oCourse) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Period getPeriodById(int nPeriodId) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Period getPeriodByDate(java.lang.String sDate) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Form[] getAllForms() throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.SurveyType[] getSurveyTypes() throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Form[] getFormByCourseIdAndPeriodId(int nCourseId, int nPeriodId) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Form getFormById(int nFormId) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Survey getSurveyById(int nSurveyId) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Survey[] getSurveysByCourse(int nCourseId, int nFormId, int nPeriodId) throws java.rmi.RemoteException;
    boolean updateSurvey(de.debuglevel.evasysmiddleware.soap.Survey oSurvey) throws java.rmi.RemoteException;
    boolean closeSurvey(int nSurveyId) throws java.rmi.RemoteException;
    boolean openSurvey(int nSurveyId) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.ObjectList getPswdsBySurvey(int nSurveyId, int nPswdCount) throws java.rmi.RemoteException;
    boolean isPswdUnused(java.lang.String sPSWD) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Survey insertCentralSurvey(int nUserId, int nCourseId, int nFormId, int nPeriodId, java.lang.String sSurveyType, java.lang.String sNotice) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Survey setupCentralSurvey(de.debuglevel.evasysmiddleware.soap.User oUser, de.debuglevel.evasysmiddleware.soap.Course oCourse, de.debuglevel.evasysmiddleware.soap.Unit oSubunit, int nFormId, int nPeriodId, java.lang.String sSurveyType, java.lang.String sNotice) throws java.rmi.RemoteException;
    java.lang.String getPDFReport(int nSurveyId, int nUserId, int nCustomPDFId) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Unit[] getSubunits() throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.Unit getSubunitBySubunitName(java.lang.String sSubunitName) throws java.rmi.RemoteException;
    void insertUser(de.debuglevel.evasysmiddleware.soap.holders.UserHolder user) throws java.rmi.RemoteException;
    void insertSubunit(de.debuglevel.evasysmiddleware.soap.holders.UnitHolder unit) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.UploadStatus[] uploadSessions(de.debuglevel.evasysmiddleware.soap.Session[] sessionList) throws java.rmi.RemoteException;
    de.debuglevel.evasysmiddleware.soap.PDFPluginContainer getPDFPluginsByFormId(int formId) throws java.rmi.RemoteException;
    java.lang.String getPDFForm(int formId, int surveyId) throws java.rmi.RemoteException;
    java.lang.String getPDFCoversheet(int surveyId) throws java.rmi.RemoteException;
    java.lang.String getPDFPswd(int surveyId) throws java.rmi.RemoteException;
    java.lang.String getCSVRawData(int surveyId) throws java.rmi.RemoteException;
    java.lang.String getSPSSRawData(int surveyId) throws java.rmi.RemoteException;
}
