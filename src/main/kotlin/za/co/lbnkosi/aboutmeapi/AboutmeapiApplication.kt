package za.co.lbnkosi.aboutmeapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import za.co.lbnkosi.aboutmeapi.models.dynamicContent.DynamicContent

@SpringBootApplication
class AboutmeapiApplication

fun main(args: Array<String>) {
	runApplication<AboutmeapiApplication>(*args)
}
