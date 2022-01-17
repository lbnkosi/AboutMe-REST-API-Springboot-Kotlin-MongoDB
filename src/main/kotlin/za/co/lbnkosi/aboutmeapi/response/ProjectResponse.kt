package za.co.lbnkosi.aboutmeapi.response

import za.co.lbnkosi.aboutmeapi.models.Project
import za.co.lbnkosi.aboutmeapi.requests.PortfolioRequest
import za.co.lbnkosi.aboutmeapi.requests.ProjectRequest

class ProjectResponse(
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