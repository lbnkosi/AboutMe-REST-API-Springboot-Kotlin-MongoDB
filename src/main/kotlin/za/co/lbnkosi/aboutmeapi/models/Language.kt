package za.co.lbnkosi.aboutmeapi.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import za.co.lbnkosi.aboutmeapi.enums.Fluency

@Document("language")
data class Language(
    @Id var id: ObjectId? = null,
    var uid: String = "",
    var name: String = "",
    var writingFluency: String = Fluency.EXCELLENT.toString(),
    var speakingFluency: String = Fluency.EXCELLENT.toString(),
    var readingFluency: String = Fluency.EXCELLENT.toString()
)