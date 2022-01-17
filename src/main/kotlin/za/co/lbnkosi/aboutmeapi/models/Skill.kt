package za.co.lbnkosi.aboutmeapi.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("skill")
data class Skill(
    @Id var id: ObjectId? = null,
    var uid: String = "",
    var name: String = ""
)