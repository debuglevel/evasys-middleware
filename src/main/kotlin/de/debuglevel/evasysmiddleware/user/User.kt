package de.debuglevel.evasysmiddleware.user

import de.debuglevel.evasysmiddleware.course.Course

data class User(
    val id: Int,
    val type: Int,
    val loginName: String,
    val externalId: String,
    val title: String,
    val firstName: String,
    val lastName: String,
    val unitName: String,
    val address: String,
    val email: String,
    val fbId: Int,
    val addressId: Int,
    val password: String,
    val phoneNumber: String,
    val active: Boolean,
    val courses: Set<Course>
)
