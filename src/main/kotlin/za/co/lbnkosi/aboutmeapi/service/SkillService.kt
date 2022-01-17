package za.co.lbnkosi.aboutmeapi.service

import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import za.co.lbnkosi.aboutmeapi.models.Project
import za.co.lbnkosi.aboutmeapi.models.Skill
import za.co.lbnkosi.aboutmeapi.repository.SkillsRepository
import za.co.lbnkosi.aboutmeapi.requests.ProjectRequest
import za.co.lbnkosi.aboutmeapi.requests.SkillRequest

@Service
class SkillService(private val skillsRepository: SkillsRepository) {

    fun createSkills(skillRequest: SkillRequest): Skill {
        return skillsRepository.save(
            Skill(
                name = skillRequest.name,
                uid = skillRequest.uid
            )
        )
    }

    fun updateSkills(skillRequest: SkillRequest, id: ObjectId): Skill {
        val skill = skillsRepository.findById(id.toString())
        return skillsRepository.save(skill.get().apply {
            this.id = skillRequest.id
            name = skillRequest.name
            uid = skillRequest.uid
        })
    }

    fun findAll(uid: String): ArrayList<Skill> {
        return ArrayList(skillsRepository.findAll().filter { predicate -> predicate.uid == uid })
    }

}