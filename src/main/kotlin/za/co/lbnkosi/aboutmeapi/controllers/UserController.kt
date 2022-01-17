package za.co.lbnkosi.aboutmeapi.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import za.co.lbnkosi.aboutmeapi.controllers.KeyController.isKeyValid
import za.co.lbnkosi.aboutmeapi.requests.AddressRequest
import za.co.lbnkosi.aboutmeapi.requests.UserRequest
import za.co.lbnkosi.aboutmeapi.service.UserService
import za.co.lbnkosi.aboutmeapi.utils.Constants

@RestController
@RequestMapping("/api/v1/user")
class UserController(private val userService: UserService) {

    @PostMapping
    fun post(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestBody request: UserRequest): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            val user = userService.createUser(request)
            ResponseEntity.ok(user)
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @GetMapping
    fun get(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestParam (name = "uid") uid: String?): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid() && !uid.isNullOrEmpty()) {
            val user = userService.findAll(uid)
            ResponseEntity.ok(user)
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @PutMapping
    fun put(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestBody request: UserRequest): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            ResponseEntity.ok("")
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }
}