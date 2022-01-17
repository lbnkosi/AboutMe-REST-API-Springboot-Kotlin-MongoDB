package za.co.lbnkosi.aboutmeapi.response

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.models.Competency
import za.co.lbnkosi.aboutmeapi.requests.CompetencyRequest
import za.co.lbnkosi.aboutmeapi.response.AddressResponse.Companion.toRequest

class CompetencyResponse(
    var id: ObjectId?,
    var uid: String,
    var name: String,
    var rating: Int,
    var description: String
) {
    companion object {
        fun ArrayList<Competency>.copyCompetencyToResponse(): ArrayList<CompetencyResponse> {
            val competencyList: ArrayList<CompetencyResponse> = arrayListOf()
            this.forEach {
                competencyList.add(
                    CompetencyResponse(
                        id = it.id,
                        uid = it.uid,
                        name = it.name,
                        rating = it.rating,
                        description = it.description
                    )
                )
            }
            return competencyList
        }
    }
}