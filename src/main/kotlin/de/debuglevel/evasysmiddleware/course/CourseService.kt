package de.debuglevel.evasysmiddleware.course

import de.debuglevel.evasysmiddleware.soap.SoapService
import de.debuglevel.evasysmiddleware.soap.fromSoap
import de.debuglevel.evasysmiddleware.user.UserService
import mu.KotlinLogging
import javax.inject.Singleton

@Singleton
class CourseService(
    private val soapService: SoapService,
    private val userService: UserService,
) {
    private val logger = KotlinLogging.logger {}

    val count: Int
        get() {
            logger.debug { "Getting courses count..." }

            val count = this.getAll().count()

            logger.debug { "Got courses count: $count" }
            return count
        }

//    fun exists(id: UUID): Boolean {
//        logger.debug { "Checking if person $id exists..." }
//
//        val isExisting = personRepository.existsById(id)
//
//        logger.debug { "Checked if person $id exists: $isExisting" }
//        return isExisting
//    }
//
//    fun get(id: UUID): Person {
//        logger.debug { "Getting person with ID '$id'..." }
//
//        val person: Person = personRepository.findById(id).orElseThrow {
//            logger.debug { "Getting person with ID '$id' failed" }
//            EntityNotFoundException(id)
//        }
//
//        logger.debug { "Got person with ID '$id': $person" }
//        return person
//    }
//
//    fun add(person: Person): Person {
//        logger.debug { "Adding person '$person'..." }
//
//        val savedPerson = personRepository.save(person)
//
//        logger.debug { "Added person: $savedPerson" }
//        return savedPerson
//    }
//
//    fun update(id: UUID, person: Person): Person {
//        logger.debug { "Updating person '$person' with ID '$id'..." }
//
//        // an object must be known to Hibernate (i.e. retrieved first) to get updated;
//        // it would be a "detached entity" otherwise.
//        val updatePerson = this.get(id).apply {
//            name = person.name
//        }
//
//        val updatedPerson = personRepository.update(updatePerson)
//
//        logger.debug { "Updated person: $updatedPerson with ID '$id'" }
//        return updatedPerson
//    }

    fun getAll(): Set<Course> {
        logger.debug { "Getting all courses..." }

        val courses = userService.getAll().flatMap { user ->
            soapService.port.getCoursesByUserId(user.id).courses.toSet()
                .map { course -> course.fromSoap() }
        }.toSet()

        logger.debug { "Got ${courses.size} courses" }
        return courses
    }

//    fun delete(id: UUID) {
//        logger.debug { "Deleting person with ID '$id'..." }
//
//        if (personRepository.existsById(id)) {
//            personRepository.deleteById(id)
//        } else {
//            throw EntityNotFoundException(id)
//        }
//
//        logger.debug { "Deleted person with ID '$id'" }
//    }
//
//    fun deleteAll() {
//        logger.debug { "Deleting all persons..." }
//
//        val countBefore = personRepository.count()
//        personRepository.deleteAll() // CAVEAT: does not delete dependent entities; use this instead: personRepository.findAll().forEach { personRepository.delete(it) }
//        val countAfter = personRepository.count()
//        val countDeleted = countBefore - countAfter
//
//        logger.debug { "Deleted $countDeleted of $countBefore persons, $countAfter remaining" }
//    }

    class ItemNotFoundException(criteria: Any) : Exception("Item '$criteria' does not exist.")
}