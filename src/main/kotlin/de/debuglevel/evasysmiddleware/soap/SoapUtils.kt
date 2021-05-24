package de.debuglevel.evasysmiddleware.soap

import de.debuglevel.evasysmiddleware.subunit.Subunit

fun Unit.fromSoap(): Subunit {
    return Subunit(
        id = this.mnId,
        name = this.msName,
        // TODO: mnPublicUnitNumber
        // TODO: mnImageAccess
        // TODO: maUsers
    )
}

fun Period.fromSoap(): de.debuglevel.evasysmiddleware.period.Period {
    val start = TODO("convert SOAP string to LocalDate")
    val end = TODO("convert SOAP string to LocalDate")
    return de.debuglevel.evasysmiddleware.period.Period(
        id = this.mnPeriodId,
        title = this.msTitel,
        start = start,
        end = end,
    )
}

fun SimpleForm.fromSoap(): de.debuglevel.evasysmiddleware.form.Form {
    return de.debuglevel.evasysmiddleware.form.Form(
        id = this.id,
        name = this.name,
        ownerId = this.ownerID,
        formEngine = this.formEngine,
        // TODO: CustomReportList
        // TODO: UsageRestrictionList
    )
}

fun Course.fromSoap(): de.debuglevel.evasysmiddleware.course.Course {
    return de.debuglevel.evasysmiddleware.course.Course(
        id = this.mnCourseId,
        studyProgram = this.msProgramOfStudy,
        title = this.msCourseTitle,
        room = this.msRoom,
        type = this.mnCourseType,
        // TODO: msPubCourseId
        // TODO: msExternalId
        studentCount = this.mnCountStud,
        // TODO: msCustomFieldsJSON
        userId = this.mnUserId,
        // TODO: mnFbid
        periodId = this.mnPeriodId,
        participants = this.mAoParticipants.persons.map { it.fromSoap() }.toSet(),
        // TODO: mAoSecondaryInstructors
        // TODO: moSurveyHolder
    )
}

fun Survey.fromSoap(): de.debuglevel.evasysmiddleware.survey.Survey {
    return de.debuglevel.evasysmiddleware.survey.Survey(
        id = this.mnSurveyId,
        state = this.mnState,
        title = this.msTitle,
        type = this.mcType,
        formId = this.mnFrmid,
        studentId = this.mnStuid,
        verId = this.mnVerid,
        openState = this.mnOpenState,
        formCount = this.mnFormCount,
        pswdCount = this.mnPswdCount,
        lastDataCollectionDate = this.msLastDataCollectionDate,
        pageLinkOffset = this.mnPageLinkOffset,
        maskTan = this.msMaskTan,
        maskState = this.mnMaskState,
        period = this.moPeriod.fromSoap()
    )
}

fun SurveyType.fromSoap(): de.debuglevel.evasysmiddleware.surveytype.SurveyType {
    return de.debuglevel.evasysmiddleware.surveytype.SurveyType(
        type = this.mChSurveyType,
        description = this.msDescription,
    )
}

fun User.fromSoap(): de.debuglevel.evasysmiddleware.user.User {
    return de.debuglevel.evasysmiddleware.user.User(
        id = this.mnId,
        type = this.mnType,
        loginName = this.msLoginName,
        // TODO: msExternalId
        title = this.msTitle,
        firstName = this.msFirstName,
        lastName = this.msSurName,
        // TODO: msUnitName
        address = this.msAddress,
        email = this.msEmail,
        fbId = this.mnFbid,
        addressId = this.mnAddressId,
        password = this.msPassword,
        phoneNumber = this.msPhoneNumber,
        // TODO: mbActiveUser
        courses = this.maCourses.courses.map { it.fromSoap() }.toSet()
    )
}

fun Person.fromSoap(): de.debuglevel.evasysmiddleware.person.Person {
    return de.debuglevel.evasysmiddleware.person.Person(
        id = this.mnId,
        title = this.msTitle,
        firstname = this.msFirstname,
        lastname = this.msLastname,
        identifier = this.msIdentifier,
        email = this.msEmail,
        gender = this.mnGender,
        addressId = this.msAddress,
        custom1 = this.msCustom1,
        custom2 = this.msCustom2,
        custom3 = this.msCustom3,
        // TODO: msCustomFieldsJSON
    )
}