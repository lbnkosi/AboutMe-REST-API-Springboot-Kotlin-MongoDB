package za.co.lbnkosi.aboutmeapi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import za.co.lbnkosi.aboutmeapi.models.Address
import za.co.lbnkosi.aboutmeapi.models.User

interface AddressRepository: MongoRepository<Address, String> {
    fun findUserByEmail(email: String): Address
}