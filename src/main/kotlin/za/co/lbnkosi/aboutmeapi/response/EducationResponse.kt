package za.co.lbnkosi.aboutmeapi.response

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.enums.EducationType
import za.co.lbnkosi.aboutmeapi.models.Education
import za.co.lbnkosi.aboutmeapi.requests.EducationRequest
import za.co.lbnkosi.aboutmeapi.response.AddressResponse.Companion.toRequest
import java.util.*
import kotlin.collections.ArrayList

class EducationResponse(
    var id: ObjectId?,
    var uid: String,
    var alias: String,
    var name: String,
    var startDate: Date,
    var endDate: Date,
    var educationType: String,
    var enrolled: Boolean,
    var logo: String
) {
    companion object {
        fun ArrayList<Education>.copyEducationToResponse(): ArrayList<EducationResponse> {
            val educationList: ArrayList<EducationResponse> = arrayListOf()
            this.forEach {
                educationList.add(
                    EducationResponse(
                        id = it.id,
                        uid = it.uid,
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