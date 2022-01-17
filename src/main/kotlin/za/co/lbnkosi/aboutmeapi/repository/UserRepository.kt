package za.co.lbnkosi.aboutmeapi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import za.co.lbnkosi.aboutmeapi.models.User

interface UserRepository: MongoRepository<User, String> {
    fun findUserByEmail(email: String): User
}