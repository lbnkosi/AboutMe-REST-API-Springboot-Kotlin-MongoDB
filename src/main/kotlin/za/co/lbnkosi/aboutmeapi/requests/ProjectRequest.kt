package za.co.lbnkosi.aboutmeapi.requests

data class ProjectRequest(
    var name: String = "",
    var platform: String = "",
    var downloadLink: String = "",
    var githubLink: String = "",
    var description: String = "",
    var image: String = ""
)