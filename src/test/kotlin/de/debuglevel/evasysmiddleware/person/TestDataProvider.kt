package de.debuglevel.evasysmiddleware.person

import de.debuglevel.evasysmiddleware.templatePerson.Person
import java.util.stream.Stream

object TestDataProvider {
    fun personProvider() = Stream.of(
        Person(
            id = null,
            name = "Mozart"
        ),
        Person(
            id = null,
            name = "Hänschen"
        ),
        Person(
            id = null,
            name = "コハウプト マルク"
        ),
        Person(
            id = null,
            name = "Max Mustermann"
        )
    )
}