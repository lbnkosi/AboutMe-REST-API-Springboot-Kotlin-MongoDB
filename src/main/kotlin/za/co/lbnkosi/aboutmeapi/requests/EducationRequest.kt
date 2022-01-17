package za.co.lbnkosi.aboutmeapi.requests

import za.co.lbnkosi.aboutmeapi.enums.EducationType
import java.util.*

data class EducationRequest(
    var alias: String = "",
    var name: String = "",
    var startDate: Date = Date(),
    var endDate: Date = Date(),
    var educationType: EducationType = EducationType.CERTIFICATE,
    var enrolled: Boolean = false,
    var logo: String = ""
)