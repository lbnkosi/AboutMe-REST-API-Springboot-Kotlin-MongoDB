package za.co.lbnkosi.aboutmeapi.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import za.co.lbnkosi.aboutmeapi.enums.EducationType
import java.util.*

@Document("education")
data class Education(
    @Id var id: ObjectId? = null,
    var uid: String = "",
    var alias: String = "",
    var name: String = "",
    var startDate: Date = Date(),
    var endDate: Date = Date(),
    var educationType: String = EducationType.CERTIFICATE.toString(),
    var enrolled: Boolean = false,
    var logo: String = ""
)