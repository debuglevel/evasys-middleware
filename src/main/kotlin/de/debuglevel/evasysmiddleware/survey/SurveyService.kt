package de.debuglevel.evasysmiddleware.survey

import de.debuglevel.evasysmiddleware.course.CourseService
import de.debuglevel.evasysmiddleware.soap.SoapService
import de.debuglevel.evasysmiddleware.soap.fromSoap
import mu.KotlinLogging
import javax.inject.Singleton

@Singleton
class SurveyService(
    private val soapService: SoapService,
    private val courseService: CourseService,
) {
    private val logger = KotlinLogging.logger {}

    val count: Int
        get() {
            logger.debug { "Getting surveys count..." }

            val count = this.getAll().count()

            logger.debug { "Got surveys count: $count" }
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

    fun getAll(): Set<Survey> {
        logger.debug { "Getting all surveys..." }

        val surveys = courseService.getAll().flatMap { course ->
            // TODO: no idea if passing 0 here works
            soapService.port.getSurveysByCourse(course.id, 0, 0).surveys
                .map { survey -> survey.fromSoap() }
        }.toSet()

        logger.debug { "Got ${surveys.size} surveys" }
        return surveys
    }

    fun getCsv(id: Int): String {
        logger.debug { "Getting CSV for survey id=$id..." }

        val csv = soapService.port.getCSVRawData(id)

        logger.debug { "Got CSV for survey id=$id (${csv.length} bytes)" }
        return csv
    }

    fun open(id: Int): Boolean {
        logger.debug { "Opening survey id=$id..." }

        val success = soapService.port.openSurvey(id)

        logger.debug { "Opened survey id=$id: $success" }
        return success
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