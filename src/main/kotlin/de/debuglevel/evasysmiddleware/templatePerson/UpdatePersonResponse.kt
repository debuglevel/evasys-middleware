package de.debuglevel.evasysmiddleware.templatePerson

import java.util.*

data class UpdatePersonResponse(
    val id: UUID,
    val name: String,
) {
    constructor(person: Person) : this(
        person.id!!,
        person.name,
    )
}