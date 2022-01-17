package za.co.lbnkosi.aboutmeapi.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("social")
data class Social(
    @Id var id: ObjectId? = null,
    var uid: String = "",
    var name: String = "",
    var link: String = "",
    var description: String = ""
)