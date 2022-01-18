package za.co.lbnkosi.aboutmeapi.response

import org.bson.types.ObjectId
import za.co.lbnkosi.aboutmeapi.enums.Fluency
import za.co.lbnkosi.aboutmeapi.models.Language
import za.co.lbnkosi.aboutmeapi.requests.LanguageRequest
import za.co.lbnkosi.aboutmeapi.response.AddressResponse.Companion.toRequest

class LanguageResponse(
    var id: String?,
    var uid: String,
    var name: String,
    var writingFluency: String,
    var speakingFluency: String,
    var readingFluency: String
) {
    companion object {
        fun ArrayList<Language>.copyLanguageToResponse(): ArrayList<LanguageResponse> {
            val languageList: ArrayList<LanguageResponse> = arrayListOf()
            this.forEach {
                languageList.add(
                    LanguageResponse(
                        id = it.id?.toHexString(),
                        uid = it.uid,
                        name = it.name,
                        writingFluency = it.writingFluency,
                        speakingFluency = it.speakingFluency,
                        readingFluency = it.readingFluency
                    )
                )
            }
            return languageList
        }
    }
}