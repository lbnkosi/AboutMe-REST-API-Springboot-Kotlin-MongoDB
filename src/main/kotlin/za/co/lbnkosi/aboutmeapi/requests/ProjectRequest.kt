package za.co.lbnkosi.aboutmeapi.requests

import org.bson.types.ObjectId

data class ProjectRequest(
    var id: ObjectId? = null,
    var uid: String = "",
    var name: String = "",
    var platform: String = "",
    var downloadLink: String = "",
    var githubLink: String = "",
    var description: String = "",
    var image: String = "",
    var featured: Boolean = false
)