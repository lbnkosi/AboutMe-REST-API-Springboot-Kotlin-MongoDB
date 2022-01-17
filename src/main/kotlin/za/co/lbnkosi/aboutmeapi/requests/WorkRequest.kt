package za.co.lbnkosi.aboutmeapi.requests

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.enums.WorkType
import java.util.*

data class WorkRequest(
    var id: ObjectId? = null,
    var uid: String = "",
    var alias: String = "",
    var companyName: String = "",
    var position: String = "",
    var startDate: Date = Date(),
    var endDate: Date = Date(),
    var currentPosition: Boolean = false,
    var logo: String = "",
    var description: String = "",
    var workType: String = WorkType.PERMANENT.toString()
)