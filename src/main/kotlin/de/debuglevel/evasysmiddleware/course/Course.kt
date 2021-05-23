package de.debuglevel.evasysmiddleware.course

import de.debuglevel.evasysmiddleware.person.Person

data class Course(
    val id: Int,
    val studyProgram: String,
    val title: String,
    val room: String,
    val type: Int,
    //val pubCourseId: String,
    val studentCount: Int,
    //val customFieldValues: List<String>,
    val userId: Int,
    //val fbId: Int,
    val periodId: Int,
    val participants: Set<Person>,
    //val secondaryInstructors: List<User>,
)