package za.co.lbnkosi.aboutmeapi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import za.co.lbnkosi.aboutmeapi.models.Contact
import za.co.lbnkosi.aboutmeapi.models.User

interface ContactRepository: MongoRepository<Contact, String>