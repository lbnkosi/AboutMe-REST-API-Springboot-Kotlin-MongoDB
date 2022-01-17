package za.co.lbnkosi.aboutmeapi.requests

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.enums.EducationType
import java.util.*

data class EducationRequest(
    var id: ObjectId? = null,
    var uid: String = "",
    var alias: String = "",
    var name: String = "",
    var startDate: Date = Date(),
    var endDate: Date = Date(),
    var educationType: String = EducationType.CERTIFICATE.toString(),
    var enrolled: Boolean = false,
    var logo: String = ""
)