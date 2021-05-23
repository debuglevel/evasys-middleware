package de.debuglevel.evasysmiddleware.soap

import de.debuglevel.evasysmiddleware.subunit.Subunit

fun Unit.fromSoap(): Subunit {
    return Subunit(
        id = this.m_nId,
        name = this.m_sName,
    )
}

fun Period.fromSoap(): de.debuglevel.evasysmiddleware.period.Period {
    val start = TODO("convert SOAP string to LocalDate")
    val end = TODO("convert SOAP string to LocalDate")
    return de.debuglevel.evasysmiddleware.period.Period(
        id = this.m_nPeriodId,
        title = this.m_sTitel,
        start = start,
        end = end,
    )
}

fun Form.fromSoap(): de.debuglevel.evasysmiddleware.form.Form {
    return de.debuglevel.evasysmiddleware.form.Form(
        id = this.m_nFormId,
        name = this.m_sName,
        ownerId = this.m_nOwnerId,
        formEngine = this.m_nFormEngine,
    )
}

fun Course.fromSoap(): de.debuglevel.evasysmiddleware.course.Course {
    return de.debuglevel.evasysmiddleware.course.Course(
        id = this.m_nCourseId,
        studyProgram = this.m_sProgramOfStudy,
        title = this.m_sCourseTitle,
        room = this.m_sRoom,
        type = this.m_nCourseType,
        studentCount = this.m_nCountStud,
        userId = this.m_nUserId,
        periodId = this.m_nPeriodId,
        participants = this.m_aoParticipants.map { it.fromSoap() }.toSet()
    )
}

fun Survey.fromSoap(): de.debuglevel.evasysmiddleware.survey.Survey {
    return de.debuglevel.evasysmiddleware.survey.Survey(
        id = this.m_nSurveyId,
        state = this.m_nState,
        title = this.m_sTitle,
        type = this.m_cType,
        formId = this.m_nFrmid,
        studentId = this.m_nStuid,
        verId = this.m_nVerid,
        openState = this.m_nOpenState,
        formCount = this.m_nFormCount,
        pswdCount = this.m_nPswdCount,
        lastDataCollectionDate = this.m_sLastDataCollectionDate,
        pageLinkOffset = this.m_nPageLinkOffset,
        maskTan = this.m_sMaskTan,
        maskState = this.m_nMaskState,
        period = this.m_oPeriod.fromSoap()
    )
}

fun SurveyType.fromSoap(): de.debuglevel.evasysmiddleware.surveytype.SurveyType {
    return de.debuglevel.evasysmiddleware.surveytype.SurveyType(
        type = this.m_chSurveyType,
        description = this.m_sDescription,
    )
}

fun User.fromSoap(): de.debuglevel.evasysmiddleware.user.User {
    return de.debuglevel.evasysmiddleware.user.User(
        id = this.m_nId,
        type = this.m_nType,
        loginName = this.m_sLoginName,
        title = this.m_sTitle,
        firstName = this.m_sFirstName,
        lastName = this.m_sSurName,
        address = this.m_sAddress,
        email = this.m_sEmail,
        fbId = this.m_nFbid,
        addressId = this.m_nAddressId,
        password = this.m_sPassword,
        phoneNumber = this.m_sPhoneNumber,
        courses = this.m_aCourses.map { it.fromSoap() }.toSet()
    )
}

fun Person.fromSoap(): de.debuglevel.evasysmiddleware.person.Person {
    return de.debuglevel.evasysmiddleware.person.Person(
        id = this.m_nId,
        title = this.m_sTitle,
        firstname = this.m_sFirstname,
        lastname = this.m_sLastname,
        identifier = this.m_sIdentifier,
        email = this.m_sEmail,
        gender = this.m_nGender,
        addressId = this.m_sAddress,
        custom1 = this.m_sCustom1,
        custom2 = this.m_sCustom2,
        custom3 = this.m_sCustom3,
    )
}