package za.co.lbnkosi.aboutmeapi.response

import za.co.lbnkosi.aboutmeapi.enums.EducationType
import za.co.lbnkosi.aboutmeapi.models.Education
import za.co.lbnkosi.aboutmeapi.requests.EducationRequest
import java.util.*
import kotlin.collections.ArrayList

class EducationResponse(
    var alias: String,
    var name: String,
    var startDate: Date,
    var endDate: Date,
    var educationType: EducationType,
    var enrolled: Boolean,
    var logo: String
) {
    companion object {
        fun ArrayList<Education>.copyEducationToResponse(): ArrayList<EducationResponse> {
            val educationList: ArrayList<EducationResponse> = arrayListOf()
            this.forEach {
                educationList.add(
                    EducationResponse(
                        alias = it.alias,
                        name = it.name,
                        startDate = it.startDate,
                        endDate = it.endDate,
                        educationType = it.educationType,
                        enrolled = it.enrolled,
                        logo = it.logo
                    )
                )
            }
            return educationList
        }
    }
}