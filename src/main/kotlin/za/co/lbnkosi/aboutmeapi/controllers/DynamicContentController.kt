package za.co.lbnkosi.aboutmeapi.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import za.co.lbnkosi.aboutmeapi.controllers.KeyController.isKeyValid
import za.co.lbnkosi.aboutmeapi.requests.DynamicContentRequest
import za.co.lbnkosi.aboutmeapi.response.DynamicContentResponse.Companion.copyLinkToResponse
import za.co.lbnkosi.aboutmeapi.response.ProjectResponse.Companion.copyProjectToResponse
import za.co.lbnkosi.aboutmeapi.service.DynamicContentService
import za.co.lbnkosi.aboutmeapi.utils.Constants

@RestController
@RequestMapping("/api/v1/dynamicContent")
class DynamicContentController(private val dynamicContentService: DynamicContentService) {

    @PostMapping
    fun post(
        @RequestParam(name = Constants.KEY_STRING) key: String?,
        @RequestBody request: DynamicContentRequest
    ): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            val dynamicContent = dynamicContentService.createDynamicContent(request)
            ResponseEntity.ok(dynamicContent)
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @GetMapping
    fun get(@RequestParam(name = Constants.KEY_STRING) key: String?): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            val dynamicContent = dynamicContentService.findAll()
            ResponseEntity.ok(dynamicContent.copyLinkToResponse())
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @PutMapping
    fun put(
        @RequestParam(name = Constants.KEY_STRING) key: String?,
        @RequestBody request: DynamicContentRequest
    ): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            ResponseEntity.ok(dynamicContentService.updateDynamicContent(request))
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

}