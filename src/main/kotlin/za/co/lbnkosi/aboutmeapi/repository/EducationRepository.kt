package za.co.lbnkosi.aboutmeapi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import za.co.lbnkosi.aboutmeapi.models.Education
import za.co.lbnkosi.aboutmeapi.models.User

interface EducationRepository: MongoRepository<Education, String> {
    fun findUserByEmail(email: String): Education
}