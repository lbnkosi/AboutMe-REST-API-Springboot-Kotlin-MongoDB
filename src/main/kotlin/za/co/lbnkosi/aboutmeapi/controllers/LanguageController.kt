package za.co.lbnkosi.aboutmeapi.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import za.co.lbnkosi.aboutmeapi.controllers.KeyController.isKeyValid
import za.co.lbnkosi.aboutmeapi.requests.AddressRequest
import za.co.lbnkosi.aboutmeapi.requests.LanguageRequest
import za.co.lbnkosi.aboutmeapi.service.LanguageService
import za.co.lbnkosi.aboutmeapi.utils.Constants

@RestController
@RequestMapping("/api/v1/languages")
class LanguageController(private val languageService: LanguageService) {

    @PostMapping
    fun post(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestBody request: LanguageRequest): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            val language = languageService.createLanguage(request)
            ResponseEntity.ok(language)
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @GetMapping
    fun get(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestParam (name = "uid") uid: String?): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid() && !uid.isNullOrEmpty()) {
            val language = languageService.findAll(uid)
            ResponseEntity.ok(language)
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @PutMapping
    fun put(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestBody request: LanguageRequest): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            ResponseEntity.ok("")
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }
}