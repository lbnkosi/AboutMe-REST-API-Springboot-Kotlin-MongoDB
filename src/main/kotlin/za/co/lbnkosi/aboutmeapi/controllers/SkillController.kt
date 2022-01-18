package za.co.lbnkosi.aboutmeapi.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import za.co.lbnkosi.aboutmeapi.controllers.KeyController.isKeyValid
import za.co.lbnkosi.aboutmeapi.requests.AddressRequest
import za.co.lbnkosi.aboutmeapi.requests.SkillRequest
import za.co.lbnkosi.aboutmeapi.response.SkillResponse.Companion.copySkillToResponse
import za.co.lbnkosi.aboutmeapi.service.SkillService
import za.co.lbnkosi.aboutmeapi.utils.Constants

@RestController
@RequestMapping("/api/v1/skills")
class SkillController(private val skillService: SkillService) {

    @PostMapping
    fun post(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestBody request: SkillRequest): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            val skill = skillService.createSkills(request)
            ResponseEntity.ok(skill)
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @GetMapping
    fun get(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestParam (name = "uid") uid: String?): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid() && !uid.isNullOrEmpty()) {
            val skill = skillService.findAll(uid)
            ResponseEntity.ok(skill.copySkillToResponse())
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @PutMapping
    fun put(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestBody request: SkillRequest): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            ResponseEntity.ok("")
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }
}