package de.debuglevel.evasysmiddleware.course

import de.debuglevel.evasysmiddleware.person.Person
import de.debuglevel.evasysmiddleware.survey.Survey
import de.debuglevel.evasysmiddleware.user.User

data class Course(
    val id: Int,
    val studyProgram: String,
    val title: String,
    val room: String,
    val type: Int,
    val publicCourseId: String,
    val externalId: String,
    val studentCount: Int,
    val customFieldJson: String,
    val userId: Int,
    val fbId: Int,
    val periodId: Int,
    val participants: Set<Person>,
    val secondaryInstructors: Set<User>,
    val surveys: Set<Survey>,
)