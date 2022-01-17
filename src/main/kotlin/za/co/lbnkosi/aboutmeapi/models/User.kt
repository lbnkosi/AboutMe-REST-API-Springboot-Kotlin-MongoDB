package za.co.lbnkosi.aboutmeapi.models

import za.co.lbnkosi.aboutmeapi.enums.Gender
import java.util.*

data class User(
    var email: String = "",
    var name: String = "",
    var secondName: String = "",
    var surname: String = "",
    var title: String = "",
    var profileImage: String = "",
    var gender: Gender = Gender.MALE,
    var dateOfBirth: Date = Date(),
    var resume: String = ""
)