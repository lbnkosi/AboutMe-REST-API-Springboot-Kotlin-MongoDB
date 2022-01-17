package za.co.lbnkosi.aboutmeapi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import za.co.lbnkosi.aboutmeapi.models.User
import za.co.lbnkosi.aboutmeapi.models.Work

interface WorkRepository: MongoRepository<Work, String> {
    fun findUserByEmail(email: String): Work
}