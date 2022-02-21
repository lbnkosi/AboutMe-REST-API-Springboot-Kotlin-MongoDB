package za.co.lbnkosi.aboutmeapi.service

import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import za.co.lbnkosi.aboutmeapi.models.Language
import za.co.lbnkosi.aboutmeapi.models.Project
import za.co.lbnkosi.aboutmeapi.repository.ProjectRepository
import za.co.lbnkosi.aboutmeapi.requests.LanguageRequest
import za.co.lbnkosi.aboutmeapi.requests.ProjectRequest

@Service
class ProjectService(private val projectRepository: ProjectRepository) {

    fun createProject(projectRequest: ProjectRequest): Project {
        return projectRepository.save(
            Project(
                name = projectRequest.name,
                platform = projectRequest.platform,
                downloadLink = projectRequest.downloadLink,
                githubLink = projectRequest.githubLink,
                description = projectRequest.description,
                image = projectRequest.image,
                uid = projectRequest.uid,
                featured = projectRequest.featured
            )
        )
    }

    fun updateProject(projectRequest: ProjectRequest, id: ObjectId): Project {
        val project = projectRepository.findById(id.toString())
        return projectRepository.save(project.get().apply {
            this.id = projectRequest.id
            name = projectRequest.name
            platform = projectRequest.platform
            downloadLink = projectRequest.downloadLink
            githubLink = projectRequest.githubLink
            description = projectRequest.description
            image = projectRequest.image
            uid = projectRequest.uid
            featured = projectRequest.featured
        })
    }

    fun findAll(uid: String): ArrayList<Project> {
        return ArrayList(projectRepository.findAll().filter { predicate -> predicate.uid == uid })
    }

}