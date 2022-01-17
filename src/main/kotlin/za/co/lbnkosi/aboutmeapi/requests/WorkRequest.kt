package za.co.lbnkosi.aboutmeapi.requests

import za.co.lbnkosi.aboutmeapi.enums.WorkType
import java.util.*

data class WorkRequest(
    var alias: String = "",
    var companyName: String = "",
    var position: String = "",
    var startDate: Date = Date(),
    var endDate: Date = Date(),
    var currentPosition: Boolean = false,
    var logo: String = "",
    var description: String = "",
    var address: AddressRequest = AddressRequest(),
    var contact: ContactRequest = ContactRequest(),
    var workType: WorkType = WorkType.PERMANENT
)