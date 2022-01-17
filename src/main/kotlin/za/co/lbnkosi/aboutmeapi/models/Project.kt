package za.co.lbnkosi.aboutmeapi.models

data class Project(
    var email: String = "",
    var name: String = "",
    var platform: String = "",
    var downloadLink: String = "",
    var githubLink: String = "",
    var description: String = "",
    var image: String = ""
)