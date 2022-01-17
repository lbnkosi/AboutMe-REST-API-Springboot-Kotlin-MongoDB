package za.co.lbnkosi.aboutmeapi.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("competency")
data class Competency(
    @Id var id: ObjectId? = null,
    var uid: String = "",
    var name: String = "",
    var rating: Int = 0,
    var description: String = ""
)