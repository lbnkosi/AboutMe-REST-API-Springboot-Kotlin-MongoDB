package za.co.lbnkosi.aboutmeapi.response

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.enums.Gender
import za.co.lbnkosi.aboutmeapi.models.User
import java.util.*

class UserResponse(
    var id: ObjectId? = null,
    var uid: String = "",
    var name: String = "",
    var secondName: String = "",
    var surname: String = " ",
    var title: String = "",
    var profileImage: String = "",
    var gender: String = Gender.MALE.toString(),
    var dateOfBirth: Date = Date(),
    var resume: String = ""
) {
    companion object {
        fun User.copyUserToResponse(): UserResponse {
            val userResponse = UserResponse()
            userResponse.id = this.id
            userResponse.uid = this.uid
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