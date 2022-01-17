package za.co.lbnkosi.aboutmeapi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import za.co.lbnkosi.aboutmeapi.models.Portfolio
import za.co.lbnkosi.aboutmeapi.models.User

interface PortfolioRepository: MongoRepository<Portfolio, String> {
    fun findUserByEmail(email: String): Portfolio
}