package za.co.lbnkosi.aboutmeapi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import za.co.lbnkosi.aboutmeapi.models.Competency
import za.co.lbnkosi.aboutmeapi.models.User

interface CompetencyRepository: MongoRepository<Competency, String> {
    fun findUserByEmail(email: String): Competency
}