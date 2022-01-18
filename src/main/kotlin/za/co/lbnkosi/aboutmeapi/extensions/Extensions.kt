package za.co.lbnkosi.aboutmeapi.extensions

import org.bson.types.ObjectId
import org.springframework.http.ResponseEntity
import za.co.lbnkosi.aboutmeapi.extensions.Extensions.mapContactControllerResponse
import za.co.lbnkosi.aboutmeapi.extensions.Extensions.mapUserControllerResponse
import za.co.lbnkosi.aboutmeapi.models.*
import za.co.lbnkosi.aboutmeapi.response.*
import za.co.lbnkosi.aboutmeapi.response.AddressResponse.Companion.toRequest
import za.co.lbnkosi.aboutmeapi.response.ContactResponse.Companion.toRequest

object Extensions {

    fun ResponseEntity<Any>.mapUserControllerResponse(): UserResponse {
        val body = this.body as UserResponse
        return body
        /*return User(
            id = ObjectId(body.id),
            uid = body.uid,
            dateOfBirth = body.dateOfBirth,
            gender = body.gender,
            name = body.name,
            profileImage = body.profileImage,
            resume = body.resume,
            secondName = body.secondName,
            surname = body.surname,
            title = body.title,
        )*/
    }

    fun ResponseEntity<Any>.mapAddressControllerResponse(): ArrayList<AddressResponse> {
        val responseList = this.body as ArrayList<AddressResponse>
        val list: ArrayList<Address> = arrayListOf()
        responseList.forEach { body ->
            list.add(
                Address(
                    id = ObjectId(body.id),
                    uid = body.uid,
                    alias = body.alias,
                    street = body.street,
                    suburb = body.suburb,
                    city = body.city,
                    province = body.province,
                    postalCode = body.postalCode,
                    addressType = body.addressType
                )
            )
        }
        return responseList
    }

    fun ResponseEntity<Any>.mapCompetencyControllerResponse(): ArrayList<CompetencyResponse> {
        val responseList = this.body as ArrayList<CompetencyResponse>
        val list: ArrayList<Competency> = arrayListOf()
        responseList.forEach { body ->
            list.add(
                Competency(
                    id = ObjectId(body.id),
                    uid = body.uid,
                    name = body.name,
                    rating = body.rating,
                    description = body.description
                )
            )
        }
        return responseList
    }

    fun ResponseEntity<Any>.mapContactControllerResponse(): ArrayList<ContactResponse> {
        val responseList = this.body as ArrayList<ContactResponse>
        val list: ArrayList<Contact> = arrayListOf()
        responseList.forEach { body ->
            list.add(
                Contact(
                    id = ObjectId(body.id),
                    uid = body.uid,
                    alias = body.alias,
                    primaryNumber = body.primaryNumber,
                    secondaryNumber = body.secondaryNumber,
                    email = body.email,
                    contactType = body.contactType
                )
            )
        }
        return responseList
    }

    fun ResponseEntity<Any>.mapEducationControllerResponse(): ArrayList<EducationResponse> {
        val responseList = this.body as ArrayList<EducationResponse>
        val list: ArrayList<Education> = arrayListOf()
        responseList.forEach { body ->
            list.add(
                Education(
                    id = ObjectId(body.id),
                    uid = body.uid,
                    alias = body.alias,
                    name = body.name,
                    startDate = body.startDate,
                    endDate = body.endDate,
                    educationType = body.educationType,
                    enrolled = body.enrolled,
                    logo = body.logo
                )
            )
        }
        return responseList
    }

    fun ResponseEntity<Any>.mapLanguageControllerResponse(): ArrayList<LanguageResponse> {
        val responseList = this.body as ArrayList<LanguageResponse>
        val list: ArrayList<Language> = arrayListOf()
        responseList.forEach { body ->
            list.add(
                Language(
                    id = ObjectId(body.id),
                    uid = body.uid,
                    name = body.name,
                    writingFluency = body.writingFluency,
                    speakingFluency = body.speakingFluency,
                    readingFluency = body.readingFluency
                )
            )
        }
        return responseList
    }

    fun ResponseEntity<Any>.mapProjectControllerResponse(): ArrayList<ProjectResponse> {
        val responseList = this.body as ArrayList<ProjectResponse>
        val list: ArrayList<Project> = arrayListOf()
        responseList.forEach { body ->
            list.add(
                Project(
                    id = ObjectId(body.id),
                    uid = body.uid,
                    name = body.name,
                    platform = body.platform,
                    downloadLink = body.downloadLink,
                    githubLink = body.githubLink,
                    description = body.description,
                    image = body.image
                )
            )
        }
        return responseList
    }

    fun ResponseEntity<Any>.mapSkillControllerResponse(): ArrayList<SkillResponse> {
        val responseList = this.body as ArrayList<SkillResponse>
        val list: ArrayList<Skill> = arrayListOf()
        responseList.forEach { body ->
            list.add(
                Skill(
                    id = ObjectId(body.id),
                    uid = body.uid,
                    name = body.name
                )
            )
        }
        return responseList
    }

    fun ResponseEntity<Any>.mapSocialControllerResponse(): ArrayList<SocialResponse> {
        val responseList = this.body as ArrayList<SocialResponse>
        val list: ArrayList<Social> = arrayListOf()
        responseList.forEach { body ->
            list.add(
                Social(
                    id = ObjectId(body.id),
                    uid = body.uid,
                    name = body.name,
                    link = body.link,
                    description = body.description
                )
            )
        }
        return responseList
    }

    fun ResponseEntity<Any>.mapWorkControllerResponse(): ArrayList<WorkResponse> {
        val responseList = this.body as ArrayList<WorkResponse>
        val list: ArrayList<Work> = arrayListOf()
        responseList.forEach { body ->
            list.add(
                Work(
                    id = ObjectId(body.id),
                    uid = body.uid,
                    alias = body.alias,
                    companyName = body.companyName,
                    position = body.position,
                    startDate = body.startDate,
                    endDate = body.endDate,
                    currentPosition = body.currentPosition,
                    logo = body.logo,
                    description = body.description,
                    workType = body.workType
                )
            )
        }
        return responseList
    }

}