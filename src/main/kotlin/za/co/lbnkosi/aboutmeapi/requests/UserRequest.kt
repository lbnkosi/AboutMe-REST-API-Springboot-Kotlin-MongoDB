package za.co.lbnkosi.aboutmeapi.requests

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.enums.Gender
import java.util.*

data class UserRequest(
    var id: ObjectId? = null,
    var uid: String = "",
    var name: String = "",
    var secondName: String = "",
    var surname: String = "",
    var title: String = "",
    var profileImage: String = "",
    var gender: String = Gender.MALE.toString(),
    var dateOfBirth: Date = Date(),
    var resume: String = ""
)