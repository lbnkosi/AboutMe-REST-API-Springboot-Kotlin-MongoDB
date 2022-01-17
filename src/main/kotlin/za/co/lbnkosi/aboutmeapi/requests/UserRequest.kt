package za.co.lbnkosi.aboutmeapi.requests

import za.co.lbnkosi.aboutmeapi.enums.Gender
import java.util.*

data class UserRequest(
    var name: String = "",
    var secondName: String = "",
    var surname: String = "",
    var title: String = "",
    var profileImage: String = "",
    var gender: Gender = Gender.MALE,
    var dateOfBirth: Date = Date(),
    var resume: String = ""
)