package za.co.lbnkosi.aboutmeapi.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import za.co.lbnkosi.aboutmeapi.controllers.KeyController.isKeyValid
import za.co.lbnkosi.aboutmeapi.requests.AddressRequest
import za.co.lbnkosi.aboutmeapi.requests.SocialRequest
import za.co.lbnkosi.aboutmeapi.service.SocialService
import za.co.lbnkosi.aboutmeapi.utils.Constants

@RestController
@RequestMapping("/api/v1/socials")
class SocialController(private val socialService: SocialService) {

    @PostMapping
    fun post(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestBody request: SocialRequest): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            val social = socialService.createSocial(request)
            ResponseEntity.ok(social)
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @GetMapping
    fun get(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestParam (name = "uid") uid: String?): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid() && !uid.isNullOrEmpty()) {
            val social = socialService.findAll(uid)
            ResponseEntity.ok(social)
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @PutMapping
    fun put(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestBody request: SocialRequest): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            ResponseEntity.ok("")
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }
}