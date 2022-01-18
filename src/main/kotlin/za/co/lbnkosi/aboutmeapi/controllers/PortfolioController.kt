package za.co.lbnkosi.aboutmeapi.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import za.co.lbnkosi.aboutmeapi.controllers.KeyController.isKeyValid
import za.co.lbnkosi.aboutmeapi.extensions.Extensions.mapAddressControllerResponse
import za.co.lbnkosi.aboutmeapi.extensions.Extensions.mapCompetencyControllerResponse
import za.co.lbnkosi.aboutmeapi.extensions.Extensions.mapContactControllerResponse
import za.co.lbnkosi.aboutmeapi.extensions.Extensions.mapEducationControllerResponse
import za.co.lbnkosi.aboutmeapi.extensions.Extensions.mapLanguageControllerResponse
import za.co.lbnkosi.aboutmeapi.extensions.Extensions.mapProjectControllerResponse
import za.co.lbnkosi.aboutmeapi.extensions.Extensions.mapSkillControllerResponse
import za.co.lbnkosi.aboutmeapi.extensions.Extensions.mapSocialControllerResponse
import za.co.lbnkosi.aboutmeapi.extensions.Extensions.mapUserControllerResponse
import za.co.lbnkosi.aboutmeapi.extensions.Extensions.mapWorkControllerResponse
import za.co.lbnkosi.aboutmeapi.models.*
import za.co.lbnkosi.aboutmeapi.utils.Constants
import za.co.lbnkosi.aboutmeapi.utils.Constants.KEY_STRING
import kotlin.collections.ArrayList

@RestController
@RequestMapping("/api/v1/portfolio")
class PortfolioController(
    private val workController: WorkController,
    private val userController: UserController,
    private val skillController: SkillController,
    private val socialController: SocialController,
    private val projectController: ProjectController,
    private val contactController: ContactController,
    private val addressController: AddressController,
    private val languageController: LanguageController,
    private val educationController: EducationController,
    private val competencyController: CompetencyController
) {

    @PostMapping
    fun post(@RequestParam(name = KEY_STRING) key: String?): ResponseEntity<Any>? {
        userController.post(key, GenerateUser.generateUser())
        addressController.post(key, GenerateUser.generateAddress())
        competencyController.post(key, GenerateUser.generateCompetencies())
        educationController.post(key, GenerateUser.generateEducation())
        languageController.post(key, GenerateUser.generateLanguage())
        projectController.post(key, GenerateUser.generateProject())
        skillController.post(key, GenerateUser.generateSkill())
        socialController.post(key, GenerateUser.generateSocial())
        workController.post(key, GenerateUser.generateWork())
        contactController.post(key, GenerateUser.generateContact())
        return ResponseEntity.ok(get(key, Constants.FAKE_UID))
    }

    @GetMapping
    fun get(
        @RequestParam(name = KEY_STRING) key: String?,
        @RequestParam(name = "uid") uid: String?
    ): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            val portfolio = Portfolio(
                user = userController.get(key, uid)?.mapUserControllerResponse(),
                contacts = contactController.get(key, uid)?.mapContactControllerResponse(),
                addresses = addressController.get(key, uid)?.mapAddressControllerResponse(),
                employmentHistory = workController.get(key, uid)?.mapWorkControllerResponse(),
                education = educationController.get(key, uid)?.mapEducationControllerResponse(),
                skills = skillController.get(key, uid)?.mapSkillControllerResponse(),
                langauges = languageController.get(key, uid)?.mapLanguageControllerResponse(),
                competencies = competencyController.get(key, uid)?.mapCompetencyControllerResponse(),
                socials = socialController.get(key, uid)?.mapSocialControllerResponse(),
                projects = projectController.get(key, uid)?.mapProjectControllerResponse()
            )
            ResponseEntity.ok(portfolio)
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

    @PutMapping
    fun put(@RequestParam(name = KEY_STRING) key: String?): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            ResponseEntity.ok("")
        } else {
            ResponseEntity.ok(ErrorController.genericError())
        }
    }

}