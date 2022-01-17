package za.co.lbnkosi.aboutmeapi.service

import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import za.co.lbnkosi.aboutmeapi.models.Education
import za.co.lbnkosi.aboutmeapi.repository.EducationRepository
import za.co.lbnkosi.aboutmeapi.requests.EducationRequest

@Service
class EducationService(private val educationRepository: EducationRepository) {

    fun createEducation(educationRequest: EducationRequest): Education {
        return educationRepository.save(
            Education(
                alias = educationRequest.alias,
                name = educationRequest.name,
                startDate = educationRequest.startDate,
                endDate = educationRequest.endDate,
                educationType = educationRequest.educationType,
                enrolled = educationRequest.enrolled,
                logo = educationRequest.logo,
                uid = educationRequest.uid
            )
        )
    }

    fun updateEducation(educationRequest: EducationRequest, id: ObjectId): Education {
        val education = educationRepository.findById(id.toString())
        return educationRepository.save(education.get().apply {
            this.id = educationRequest.id
            alias = educationRequest.alias
            name = educationRequest.name
            startDate = educationRequest.startDate
            endDate = educationRequest.endDate
            educationType = educationRequest.educationType
            enrolled = educationRequest.enrolled
            logo = educationRequest.logo
            uid = educationRequest.uid
        })
    }

    fun findAll(uid: String): ArrayList<Education> {
        return ArrayList(educationRepository.findAll().filter { predicate -> predicate.uid == uid })
    }

}