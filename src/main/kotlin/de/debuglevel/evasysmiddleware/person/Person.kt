package de.debuglevel.evasysmiddleware.person

data class Person(
    val id: Int,
    val title: String,
    val firstname: String,
    val lastname: String,
    val identifier: String,
    val email: String,
    val gender: Int,
    val address: String,
    val customFieldsJSON: String,
)
