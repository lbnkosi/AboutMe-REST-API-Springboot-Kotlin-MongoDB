package za.co.lbnkosi.aboutmeapi.requests

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.enums.Fluency

data class LanguageRequest(
    var id: ObjectId? = null,
    var uid: String = "",
    var name: String = "",
    var writingFluency: String = Fluency.EXCELLENT.toString(),
    var speakingFluency: String = Fluency.EXCELLENT.toString(),
    var readingFluency: String = Fluency.EXCELLENT.toString()
)