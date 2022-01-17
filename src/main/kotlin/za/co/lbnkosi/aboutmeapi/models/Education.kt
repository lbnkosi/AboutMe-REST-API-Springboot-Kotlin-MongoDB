package za.co.lbnkosi.aboutmeapi.models

import za.co.lbnkosi.aboutmeapi.enums.EducationType
import java.util.*

data class Education(
    var email: String = "",
    var alias: String = "",
    var name: String = "",
    var startDate: Date = Date(),
    var endDate: Date = Date(),
    var educationType: EducationType = EducationType.CERTIFICATE,
    var enrolled: Boolean = false,
    var logo: String = ""
)