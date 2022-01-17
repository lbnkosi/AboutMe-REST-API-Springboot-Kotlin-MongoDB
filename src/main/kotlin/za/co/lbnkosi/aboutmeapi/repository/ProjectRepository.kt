package za.co.lbnkosi.aboutmeapi.repository

import org.springframework.data.mongodb.repository.MongoRepository
import za.co.lbnkosi.aboutmeapi.models.Project
import za.co.lbnkosi.aboutmeapi.models.User
import za.co.lbnkosi.aboutmeapi.models.Work

interface ProjectRepository: MongoRepository<Project, String>