package de.debuglevel.evasysmiddleware.templatePerson

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Person(
    @Id
    @GeneratedValue
    var id: UUID?,
    var name: String
)