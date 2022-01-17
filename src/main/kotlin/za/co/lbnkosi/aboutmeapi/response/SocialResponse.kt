package za.co.lbnkosi.aboutmeapi.response

import za.co.lbnkosi.aboutmeapi.models.Social
import za.co.lbnkosi.aboutmeapi.requests.SocialRequest

class SocialResponse(
    var name: String,
    var link: String,
    var description: String
) {
    companion object {
        fun ArrayList<Social>.copySocialToResponse(): ArrayList<SocialResponse> {
            val socialList: ArrayList<SocialResponse> = arrayListOf()
            this.forEach {
                socialList.add(
                    SocialResponse(
                        name = it.name,
                        link = it.link,
                        description = it.description
                    )
                )
            }
            return socialList
        }
    }
}