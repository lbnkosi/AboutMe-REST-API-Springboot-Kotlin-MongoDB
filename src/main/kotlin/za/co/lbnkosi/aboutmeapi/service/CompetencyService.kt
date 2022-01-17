package za.co.lbnkosi.aboutmeapi.service

import org.bson.types.ObjectId
import org.springframework.stereotype.Service
import za.co.lbnkosi.aboutmeapi.models.Competency
import za.co.lbnkosi.aboutmeapi.repository.CompetencyRepository
import za.co.lbnkosi.aboutmeapi.requests.CompetencyRequest

@Service
class CompetencyService(private val competencyRepository: CompetencyRepository) {

    fun createCompetency(competencyRequest: CompetencyRequest): Competency {
        return competencyRepository.save(
            Competency(
                name = competencyRequest.name,
                rating = competencyRequest.rating,
                description = competencyRequest.description,
                uid = competencyRequest.uid
            )
        )
    }

    fun updateCompetency(competencyRequest: CompetencyRequest, id: ObjectId): Competency {
        val competency = competencyRepository.findById(id.toString())
        return competencyRepository.save(competency.get().apply {
            this.id = competencyRequest.id
            name = competencyRequest.name
            rating = competencyRequest.rating
            description = competencyRequest.description
            uid = competencyRequest.uid
        })
    }

    fun findAll(uid: String): ArrayList<Competency> {
        return ArrayList(competencyRepository.findAll().filter { predicate -> predicate.uid == uid })
    }

}