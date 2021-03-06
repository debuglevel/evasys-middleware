package de.debuglevel.evasysmiddleware.templatePerson

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import java.util.*

@Repository
interface PersonRepository : CrudRepository<Person, UUID> {
    fun find(name: String): Person
}