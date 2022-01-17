package za.co.lbnkosi.aboutmeapi.requests

import org.bson.types.ObjectId

data class CompetencyRequest(
    var id: ObjectId? = null,
    var uid: String = "",
    var name: String = "",
    var rating: Int = 0,
    var description: String = ""
)