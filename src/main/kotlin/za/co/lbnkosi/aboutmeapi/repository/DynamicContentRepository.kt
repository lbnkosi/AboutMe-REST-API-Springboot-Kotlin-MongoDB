package za.co.lbnkosi.aboutmeapi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import za.co.lbnkosi.aboutmeapi.models.dynamicContent.DynamicContent

interface DynamicContentRepository : MongoRepository<DynamicContent, String>