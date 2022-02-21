package za.co.lbnkosi.aboutmeapi.response

import za.co.lbnkosi.aboutmeapi.models.Project

class ProjectResponse(
    var id: String?,
    var uid: String,
    var name: String = "",
    var platform: String = "",
    var downloadLink: String = "",
    var githubLink: String = "",
    var description: String = "",
    var image: String = "",
    var featured: Boolean = false
) {
    companion object {
        fun ArrayList<Project>.copyProjectToResponse(): ArrayList<ProjectResponse> {
            val projectList: ArrayList<ProjectResponse> = arrayListOf()
            this.forEach {
                projectList.add(
                    ProjectResponse(
                        id = it.id?.toHexString(),
                        uid = it.uid,
                        name = it.name,
                        platform = it.platform,
                        downloadLink = it.downloadLink,
                        githubLink = it.githubLink,
                        description = it.description,
                        image = it.image,
                        featured = it.featured
                    )
                )
            }
            return projectList
        }
    }
}