package za.co.lbnkosi.aboutmeapi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import za.co.lbnkosi.aboutmeapi.models.Language
import za.co.lbnkosi.aboutmeapi.models.User

interface LanguageRepository: MongoRepository<Language, String> {
    fun findUserByEmail(email: String): Language
}