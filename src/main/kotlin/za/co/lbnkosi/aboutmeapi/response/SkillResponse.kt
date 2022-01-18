package za.co.lbnkosi.aboutmeapi.response

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.models.Skill
import za.co.lbnkosi.aboutmeapi.requests.SkillRequest
import za.co.lbnkosi.aboutmeapi.response.AddressResponse.Companion.toRequest

class SkillResponse(
    var id: String?,
    var uid: String,
    var name: String
) {
    companion object {
        fun ArrayList<Skill>.copySkillToResponse(): ArrayList<SkillResponse> {
            val skillList: ArrayList<SkillResponse> = arrayListOf()
            this.forEach {
                skillList.add(
                    SkillResponse(
                        id = it.id?.toHexString(),
                        uid = it.uid,
                        name = it.name
                    )
                )
            }
            return skillList
        }
    }
}