package za.co.lbnkosi.aboutmeapi.response

import za.co.lbnkosi.aboutmeapi.models.Competency
import za.co.lbnkosi.aboutmeapi.requests.CompetencyRequest

class CompetencyResponse(
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