package de.debuglevel.evasysmiddleware.person

data class Person(
    val id: Int,
    val title: String,
    val firstname: String,
    val lastname: String,
    val identifier: String,
    val email: String,
    val gender: Int,
    val addressId: Int,
    val custom1: String,
    val custom2: String,
    val custom3: String,
)
