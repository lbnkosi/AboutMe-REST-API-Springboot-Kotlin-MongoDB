package za.co.lbnkosi.aboutmeapi.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import za.co.lbnkosi.aboutmeapi.enums.Gender
import java.util.*

@Document("user")
data class User(
    @Id var id: ObjectId? = null,
    var uid: String = "",
    var name: String = "",
    var secondName: String = "",
    var surname: String = "",
    var title: String = "",
    var profileImage: String = "",
    var headerImage: String = "",
    var summary: String = "",
    var gender: String = Gender.MALE.toString(),
    var dateOfBirth: Date = Date(),
    var resume: String = "",
    var resumeOutdated: Boolean = false
)