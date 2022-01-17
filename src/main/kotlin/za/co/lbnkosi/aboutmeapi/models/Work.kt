package za.co.lbnkosi.aboutmeapi.models

import za.co.lbnkosi.aboutmeapi.enums.WorkType
import java.util.*

data class Work(
    var email: String = "",
    var alias: String = "",
    var companyName: String = "",
    var position: String = "",
    var startDate: Date = Date(),
    var endDate: Date = Date(),
    var currentPosition: Boolean = false,
    var logo: String = "",
    var description: String = "",
    var address: Address = Address(),
    var contact: Contact = Contact(),
    var workType: WorkType = WorkType.PERMANENT
)