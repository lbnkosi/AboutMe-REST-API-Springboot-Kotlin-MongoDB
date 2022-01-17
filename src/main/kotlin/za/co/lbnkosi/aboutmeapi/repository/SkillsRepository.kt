package za.co.lbnkosi.aboutmeapi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import za.co.lbnkosi.aboutmeapi.models.Skill
import za.co.lbnkosi.aboutmeapi.models.User

interface SkillsRepository: MongoRepository<Skill, String>