package za.co.lbnkosi.aboutmeapi.response

import za.co.lbnkosi.aboutmeapi.models.Skill
import za.co.lbnkosi.aboutmeapi.requests.SkillRequest

class SkillResponse(
    var name: String
) {
    companion object {
        fun ArrayList<Skill>.copySkillToResponse(): ArrayList<SkillResponse> {
            val skillList: ArrayList<SkillResponse> = arrayListOf()
            this.forEach {
                skillList.add(
                    SkillResponse(
                        name = it.name
                    )
                )
            }
            return skillList
        }
    }
}