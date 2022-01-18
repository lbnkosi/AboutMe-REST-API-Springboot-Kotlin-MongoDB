package za.co.lbnkosi.aboutmeapi.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import za.co.lbnkosi.aboutmeapi.controllers.KeyController.isKeyValid
import za.co.lbnkosi.aboutmeapi.requests.CompetencyRequest
import za.co.lbnkosi.aboutmeapi.response.CompetencyResponse.Companion.copyCompetencyToResponse
import za.co.lbnkosi.aboutmeapi.service.CompetencyService
import za.co.lbnkosi.aboutmeapi.utils.Constants

@RestController
@RequestMapping("/api/v1/competencies")
class CompetencyController(private val competencyService: CompetencyService) {

    @PostMapping
    fun post(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestBody request: CompetencyRequest): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            val competencies = competencyService.createCompetency(request)
            ResponseEntity.ok(competencies)
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @GetMapping
    fun get(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestParam (name = "uid") uid: String?): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid() && !uid.isNullOrEmpty()) {
            val competencies = competencyService.findAll(uid)
            ResponseEntity.ok(competencies.copyCompetencyToResponse())
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @PutMapping
    fun put(@RequestParam(name = Constants.KEY_STRING) key: String?, @RequestBody request: CompetencyRequest): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            ResponseEntity.ok("")
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

}