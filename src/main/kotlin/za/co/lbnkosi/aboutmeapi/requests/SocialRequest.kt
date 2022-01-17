package za.co.lbnkosi.aboutmeapi.requests

import org.bson.types.ObjectId

data class SocialRequest(
    var id: ObjectId? = null,
    var uid: String = "",
    var name: String = "",
    var link: String = "",
    var description: String = ""
)