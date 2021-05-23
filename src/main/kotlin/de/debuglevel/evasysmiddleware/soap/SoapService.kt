package de.debuglevel.evasysmiddleware.soap

import mu.KotlinLogging
import javax.inject.Singleton

@Singleton
class SoapService(
    private val soapProperties: SoapProperties
) {
    private val logger = KotlinLogging.logger {}

    val port: EvasysSoapPort_PortType = run {
        logger.debug { "Initializing SOAP client..." }
        val locator = SoapserverLocator()
        val port = locator.getevasysSoapPort(soapProperties.endpointUrl)
        logger.debug { "Initialized SOAP client: $port" }
        port
    }
}