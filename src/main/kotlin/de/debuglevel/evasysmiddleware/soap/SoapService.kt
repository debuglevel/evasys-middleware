package de.debuglevel.evasysmiddleware.soap

import mu.KotlinLogging
import javax.inject.Singleton

@Singleton
class SoapService {
    private val logger = KotlinLogging.logger {}

    val port: EvasysSoapPort_PortType = run {
        val locator = SoapserverLocator()
        locator.getevasysSoapPort()
    }
}