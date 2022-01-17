package za.co.lbnkosi.aboutmeapi.requests

import org.bson.types.ObjectId

data class SkillRequest(
    var id: ObjectId? = null,
    var uid: String = "",
    var name: String = ""
)