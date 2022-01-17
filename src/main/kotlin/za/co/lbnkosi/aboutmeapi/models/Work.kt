package za.co.lbnkosi.aboutmeapi.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import za.co.lbnkosi.aboutmeapi.enums.WorkType
import java.util.*

@Document("work")
data class Work(
    @Id var id: ObjectId? = null,
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