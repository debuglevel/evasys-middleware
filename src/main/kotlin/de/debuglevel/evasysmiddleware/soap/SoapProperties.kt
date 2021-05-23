package de.debuglevel.evasysmiddleware.soap

import io.micronaut.context.annotation.ConfigurationProperties
import java.net.URL

@ConfigurationProperties("app.evasysmiddleware.soap")
class SoapProperties {
    var endpointUrl: URL = URL("https://localhost/soapserver.php")
    var user: String = "soap"
    var password: String = "soap"
}
