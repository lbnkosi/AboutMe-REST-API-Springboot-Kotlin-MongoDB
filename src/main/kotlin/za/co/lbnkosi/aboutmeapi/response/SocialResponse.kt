package za.co.lbnkosi.aboutmeapi.response

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.models.Social
import za.co.lbnkosi.aboutmeapi.requests.SocialRequest
import za.co.lbnkosi.aboutmeapi.response.AddressResponse.Companion.toRequest

class SocialResponse(
    var id: ObjectId?,
    var uid: String,
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
                        id = it.id,
                        uid = it.uid,
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