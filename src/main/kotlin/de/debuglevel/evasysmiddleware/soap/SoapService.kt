package de.debuglevel.evasysmiddleware.soap

import mu.KotlinLogging
import javax.inject.Singleton
import javax.xml.namespace.QName

@Singleton
class SoapService(
    private val soapProperties: SoapProperties
) {
    private val logger = KotlinLogging.logger {}

    val port: SoapPort = run {
        logger.debug { "Initializing SOAP client..." }

        val newEndpoint = soapProperties.endpointUrl
        val qname = QName("soapserver-v71.wsdl", "soapserver")

        val soapServer = Soapserver(newEndpoint, qname)
        val port = soapServer.soapPort

        logger.debug { "Initialized SOAP client: $port" }
        port
    }
}