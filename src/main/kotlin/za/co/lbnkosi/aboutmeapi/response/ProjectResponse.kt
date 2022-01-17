package za.co.lbnkosi.aboutmeapi.response

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.models.Project
import za.co.lbnkosi.aboutmeapi.requests.PortfolioRequest
import za.co.lbnkosi.aboutmeapi.requests.ProjectRequest
import za.co.lbnkosi.aboutmeapi.response.AddressResponse.Companion.toRequest

class ProjectResponse(
    var id: ObjectId?,
    var uid: String,
    var name: String = "",
    var platform: String = "",
    var downloadLink: String = "",
    var githubLink: String = "",
    var description: String = "",
    var image: String = ""
) {
    companion object {
        fun ArrayList<Project>.copyProjectToResponse(): ArrayList<ProjectResponse> {
            val projectList: ArrayList<ProjectResponse> = arrayListOf()
            this.forEach {
                projectList.add(
                    ProjectResponse(
                        id = it.id,
                        uid = it.uid,
                        name = it.name,
                        platform = it.platform,
                        downloadLink = it.downloadLink,
                        githubLink = it.githubLink,
                        description = it.description,
                        image = it.image
                    )
                )
            }
            return projectList
        }
    }
}