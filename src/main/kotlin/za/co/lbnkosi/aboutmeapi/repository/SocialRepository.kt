package za.co.lbnkosi.aboutmeapi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import za.co.lbnkosi.aboutmeapi.models.Social
import za.co.lbnkosi.aboutmeapi.models.User

interface SocialRepository: MongoRepository<Social, String> {
    fun findUserByEmail(email: String): Social
}