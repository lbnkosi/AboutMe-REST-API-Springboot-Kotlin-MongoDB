package za.co.lbnkosi.aboutmeapi.service

import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import za.co.lbnkosi.aboutmeapi.models.Social
import za.co.lbnkosi.aboutmeapi.models.User
import za.co.lbnkosi.aboutmeapi.repository.UserRepository
import za.co.lbnkosi.aboutmeapi.requests.SocialRequest
import za.co.lbnkosi.aboutmeapi.requests.UserRequest

@Service
class UserService(private val userRepository: UserRepository) {

    fun createUser(userRequest: UserRequest): User {
        return userRepository.save(
            User(
                name = userRequest.name,
                secondName = userRequest.secondName,
                surname = userRequest.surname,
                title = userRequest.title,
                profileImage = userRequest.profileImage,
                headerImage = userRequest.headerImage,
                summary = userRequest.summary,
                gender = userRequest.gender,
                dateOfBirth = userRequest.dateOfBirth,
                resume = userRequest.resume,
                resumeOutdated = userRequest.resumeOutdated,
                uid = userRequest.uid
            )
        )
    }

    fun updateUser(userRequest: UserRequest, id: ObjectId): User {
        val user = userRepository.findById(id.toString())
        return userRepository.save(user.get().apply {
            this.id = userRequest.id
            name = userRequest.name
            secondName = userRequest.secondName
            surname = userRequest.surname
            title = userRequest.title
            profileImage = userRequest.profileImage
            headerImage = userRequest.headerImage
            summary = userRequest.summary
            gender = userRequest.gender
            dateOfBirth = userRequest.dateOfBirth
            resume = userRequest.resume
            resumeOutdated = userRequest.resumeOutdated
            uid = userRequest.uid
        })
    }

    fun findAll(uid: String): User? {
        return userRepository.findAll().find { predicate -> predicate.uid == uid }
    }

}