package za.co.lbnkosi.aboutmeapi.service

import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import za.co.lbnkosi.aboutmeapi.models.Skill
import za.co.lbnkosi.aboutmeapi.models.Social
import za.co.lbnkosi.aboutmeapi.repository.SocialRepository
import za.co.lbnkosi.aboutmeapi.requests.SkillRequest
import za.co.lbnkosi.aboutmeapi.requests.SocialRequest

@Service
class SocialService(private val socialRepository: SocialRepository) {

    fun createSocial(socialRequest: SocialRequest): Social {
        return socialRepository.save(
            Social(
                name = socialRequest.name,
                link = socialRequest.link,
                description = socialRequest.description,
                uid = socialRequest.uid
            )
        )
    }

    fun updateSocial(socialRequest: SocialRequest, id: ObjectId): Social {
        val social = socialRepository.findById(id.toString())
        return socialRepository.save(social.get().apply {
            this.id = socialRequest.id
            name = socialRequest.name
            link = socialRequest.link
            description = socialRequest.description
            uid = socialRequest.uid
        })
    }

    fun findAll(uid: String): ArrayList<Social> {
        return ArrayList(socialRepository.findAll().filter { predicate -> predicate.uid == uid })
    }

}