package za.co.lbnkosi.aboutmeapi.requests

data class CompetencyRequest(
    var name: String = "",
    var rating: Int = 0,
    var description: String = ""
)