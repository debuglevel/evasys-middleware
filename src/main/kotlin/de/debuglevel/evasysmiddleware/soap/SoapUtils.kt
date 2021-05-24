package de.debuglevel.evasysmiddleware.soap

import de.debuglevel.evasysmiddleware.subunit.Subunit

fun Unit.fromSoap(): Subunit {
    return Subunit(
        id = this.mnId,
        name = this.msName,
        publicUnitNumber = this.mnPublicUnitNumber,
        imageAccess = this.mnImageAccess,
        users = this.maUsers.users.map { it.fromSoap() }.toSet(),
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
        publicCourseId = this.msPubCourseId,
        externalId = this.msExternalId,
        studentCount = this.mnCountStud,
        customFieldJson = this.msCustomFieldsJSON,
        userId = this.mnUserId,
        fbId = this.mnFbid,
        periodId = this.mnPeriodId,
        participants = this.mAoParticipants.persons.map { it.fromSoap() }.toSet(),
        secondaryInstructors = this.mAoSecondaryInstructors.users.map { it.fromSoap() }.toSet(),
        surveys = this.moSurveyHolder.maSurveys.surveys.map { it.fromSoap() }.toSet(),
    )
}

fun Survey.fromSoap(): de.debuglevel.evasysmiddleware.survey.Survey {
    val lastDataCollectionDate = TODO("parse this.msLastDataCollectionDate")
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
        lastDataCollectionDate = lastDataCollectionDate,
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
        externalId = this.msExternalId,
        title = this.msTitle,
        firstName = this.msFirstName,
        lastName = this.msSurName,
        unitName = this.msUnitName,
        address = this.msAddress,
        email = this.msEmail,
        fbId = this.mnFbid,
        addressId = this.mnAddressId,
        password = this.msPassword,
        phoneNumber = this.msPhoneNumber,
        active = this.mbActiveUser,
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
        address = this.msAddress,
        customFieldsJSON = this.msCustomFieldsJSON,
    )
}