package za.co.lbnkosi.aboutmeapi.response

import za.co.lbnkosi.aboutmeapi.enums.Gender
import za.co.lbnkosi.aboutmeapi.models.User
import java.util.*

class UserResponse(
    var name: String = "",
    var secondName: String = "",
    var surname: String = " ",
    var title: String = "",
    var profileImage: String = "",
    var gender: Gender = Gender.MALE,
    var dateOfBirth: Date = Date(),
    var resume: String = ""
) {
    companion object {
        fun User.copyUserToResponse(): UserResponse {
            val userResponse = UserResponse()
            userResponse.dateOfBirth = this.dateOfBirth
            userResponse.gender = this.gender
            userResponse.name = this.name
            userResponse.profileImage = this.profileImage
            userResponse.resume = this.resume
            userResponse.secondName = this.secondName
            userResponse.surname = this.surname
            userResponse.title = this.title
            return userResponse
        }
    }
}