package za.co.lbnkosi.aboutmeapi.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import za.co.lbnkosi.aboutmeapi.controllers.KeyController.isKeyValid
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
    fun get(@RequestParam(name = KEY_STRING) key: String?, @RequestParam(name = "uid") uid: String?): ResponseEntity<Any>? {
        return if (!key.isNullOrEmpty() && key.isKeyValid()) {
            val portfolio = Portfolio(
                user = userController.get(key, uid)?.body as User,
                contacts = contactController.get(key, uid)?.body as? ArrayList<Contact>,
                addresses = addressController.get(key, uid)?.body as? ArrayList<Address>,
                employmentHistory = workController.get(key, uid)?.body as? ArrayList<Work>,
                education = educationController.get(key, uid)?.body as? ArrayList<Education>,
                skills = skillController.get(key, uid)?.body as? ArrayList<Skill>,
                langauges = languageController.get(key, uid)?.body as? ArrayList<Language>,
                competencies = competencyController.get(key, uid)?.body as? ArrayList<Competency>,
                socials = socialController.get(key, uid)?.body as? ArrayList<Social>,
                projects = projectController.get(key, uid)?.body as? ArrayList<Project>
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